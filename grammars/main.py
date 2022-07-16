import sys
import os

def compileGrammar(grammar_file, grammar_name, method, test_file):
    grammar_command = f'java org.antlr.v4.Tool -Dlanguage=Java {grammar_file}'
    compile_command = f'javac *.java'
    test_command = f'java org.antlr.v4.gui.TestRig {grammar_name} {method} -gui < {test_file}'

    os.system(grammar_command)
    os.system(compile_command)
    os.system(test_command)

def main(argv):
    grammar_file = argv[1]
    grammar_name = argv[2]
    method = argv[3]
    test_file = argv[4]
    compileGrammar(grammar_file, grammar_name, method, test_file)

if __name__ == '__main__':
    main(sys.argv)