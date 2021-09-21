#language: pt
#encoding:UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario


@cadastro
Cenario: Cadastrar usuario
Quando acionar aba admin
E acionar o botao add
E informar campo employee name "Fiona Grace"
E informar campo username "Binho"
E informar campo password "12345678"
E informar campo confirmar password "12345678"
E acionar o botao salvar
Entao o sistema cadastra o usuario "Binho"      



