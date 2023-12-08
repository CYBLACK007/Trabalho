import java.util.*;

public class perg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pontuacao pontuacao = new Pontuacao();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Unifan\n Professor: Brenno Pimenta\n Aluno: Keven Afonso \n");
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta("O que significa a sigla CPU?",
                Arrays.asList("Computer Processing Unit",
                        "Center Processing United",
                        "Central Processing Unit",
                        "Component Processing Unit"),
                "Central Processing Unit"));


        perguntas.add(new Pergunta(
                "O que é um sistema operacional e por que é essencial para um computador?",
                Arrays.asList(
                        "É um programa de edição de texto",
                        "É um sistema de segurança para computadores",
                        "É um conjunto de hardware para operar um computador",
                        "É responsável por gerenciar recursos e permitir a execução de programas"
                ),
                "É responsável por gerenciar recursos e permitir a execução de programas"
        ));

        perguntas.add(new Pergunta(
                "Quais são os diferentes tipos de linguagens de programação?",
                Arrays.asList(
                        "Existem apenas duas: Java e C++",
                        "Há apenas linguagens de baixo nível",
                        "Existem muitas, incluindo C, Python, Java e JavaScript",
                        "Todas as linguagens são iguais"
                ),
                "Existem muitas, incluindo C, Python, Java e JavaScript"
        ));

        perguntas.add(new Pergunta(
                "Como funciona um firewall e qual é a sua importância na segurança cibernética?",
                Arrays.asList(
                        "Firewall é um dispositivo físico usado para resfriar sistemas",
                        "Firewall é um software que protege contra vírus",
                        "Firewall é um dispositivo que bloqueia ou permite o tráfego de rede",
                        "Firewall é um sistema de backup de dados"
                ),
                "Firewall é um dispositivo que bloqueia ou permite o tráfego de rede"
        ));

        perguntas.add(new Pergunta(
                "O que é um algoritmo e qual é sua função na computação?",
                Arrays.asList(
                        "É um tipo de vírus de computador",
                        "É um dispositivo de entrada",
                        "É uma sequência de instruções lógicas usadas para resolver um problema",
                        "É um tipo de memória temporária"
                ),
                "É uma sequência de instruções lógicas usadas para resolver um problema"
        ));

        perguntas.add(new Pergunta(
                "Qual é a diferença entre memória ROM e memória RAM?",
                Arrays.asList(
                        "Ambas são voláteis, mas a RAM é mais rápida",
                        "A RAM é volátil, enquanto a ROM é não volátil",
                        "A ROM é volátil, enquanto a RAM é não volátil",
                        "Ambas são não voláteis, mas a RAM é mais rápida"
                ),
                "A RAM é volátil, enquanto a ROM é não volátil"
        ));

        perguntas.add(new Pergunta(
                "O que é um endereço IP e como ele é usado na internet?",
                Arrays.asList(
                        "É um endereço de e-mail usado para comunicação online",
                        "É um endereço físico atribuído a cada dispositivo conectado à internet",
                        "É um número de telefone usado para conexões de internet",
                        "É um código de barras usado para identificação online"
                ),
                "É um endereço físico atribuído a cada dispositivo conectado à internet"
        ));

        perguntas.add(new Pergunta(
                "Como funcionam os cookies em um navegador da web?",
                Arrays.asList(
                        "São pequenos arquivos que melhoram a velocidade da internet",
                        "São aplicativos de segurança para proteger a privacidade do usuário",
                        "São pedaços de dados armazenados pelo navegador para rastrear atividades do usuário",
                        "São usados para bloquear pop-ups irritantes"
                ),
                "São pedaços de dados armazenados pelo navegador para rastrear atividades do usuário"
        ));

        perguntas.add(new Pergunta(
                "O que é a nuvem (cloud computing) e quais são suas vantagens?",
                Arrays.asList(
                        "É um programa de edição de imagens online",
                        "É um sistema de armazenamento local",
                        "É um modelo de computação baseado na internet que oferece conveniência e escalabilidade",
                        "É um sistema operacional baseado na internet"
                ),
                "É um modelo de computação baseado na internet que oferece conveniência e escalabilidade"
        ));

        perguntas.add(new Pergunta(
                "Qual é a diferença entre um servidor web e um servidor de banco de dados?",
                Arrays.asList(
                        "Servidor web é usado para jogos online, servidor de banco de dados para armazenar músicas",
                        "Servidor web lida com solicitações de página da web, servidor de banco de dados gerencia dados",
                        "Ambos são a mesma coisa",
                        "Servidor web é usado apenas para streaming de vídeo, servidor de banco de dados para streaming de áudio"
                ),
                "Servidor web lida com solicitações de página da web, servidor de banco de dados gerencia dados"
        ));

        perguntas.add(new Pergunta(
                "O que é a codificação de dados e por que é importante na transmissão de informações?",
                Arrays.asList(
                        "É o processo de salvar dados em um arquivo",
                        "É o processo de traduzir dados em linguagem humana",
                        "É o processo de converter dados em um formato específico para transmissão e armazenamento eficientes",
                        "É o processo de criptografar dados para torná-los inacessíveis"
                ),
                "É o processo de converter dados em um formato específico para transmissão e armazenamento eficientes"
        ));

        perguntas.add(new Pergunta(
                "Como é feita a criptografia de dados e por que é relevante para a segurança da informação?",
                Arrays.asList(
                        "É a compressão de dados para economizar espaço de armazenamento",
                        "É a conversão de dados em um formato legível para transmissão e é crucial para evitar erros",
                        "É a criptografia de dados para esconder informações confidenciais",
                        "É a tradução de dados para idiomas diferentes para ocultar informações"
                ),
                "É a criptografia de dados para esconder informações confidenciais"
        ));

        perguntas.add(new Pergunta(
                "Quais são os diferentes tipos de dispositivos de entrada e saída de um computador?",
                Arrays.asList(
                        "Apenas teclado e mouse",
                        "Dispositivos de entrada: teclado e monitor; Dispositivos de saída: impressora e mouse",
                        "Dispositivos de entrada: teclado e mouse; Dispositivos de saída: monitor e impressora",
                        "Apenas monitor e impressora"
                ),
                "Dispositivos de entrada: teclado e mouse; Dispositivos de saída: monitor e impressora"
        ));

        perguntas.add(new Pergunta(
                "O que são os protocolos de internet (por exemplo, TCP/IP) e como são usados?",
                Arrays.asList(
                        "São programas de comunicação de dados e são usados apenas para correio eletrônico",
                        "São idiomas usados para programação e são usados para criar sites",
                        "São regras e formatos para comunicação de dados e são usados para trocar informações na internet",
                        "São apenas ferramentas de segurança para proteger informações online"
                ),
                "São regras e formatos para comunicação de dados e são usados para trocar informações na internet"
        ));

        perguntas.add(new Pergunta(
                "Como funcionam os sistemas de inteligência artificial e aprendizado de máquina?",
                Arrays.asList(
                        "São usados apenas em jogos de computador",
                        "São sistemas que imitam a inteligência humana e aprendem com dados",
                        "São programas que ajudam a melhorar a velocidade do computador",
                        "São usados apenas em robôs"
                ),
                "São sistemas que imitam a inteligência humana e aprendem com dados"
        ));


        perguntas.add(new Pergunta(
                "Qual é a importância das atualizações de software para a segurança de um sistema computacional?",
                Arrays.asList(
                        "Atualizações são irrelevantes para a segurança de um sistema",
                        "As atualizações podem melhorar a aparência do sistema, mas não a segurança",
                        "Atualizações corrigem vulnerabilidades e fornecem proteção contra ameaças de segurança",
                        "As atualizações são apenas para adicionar novos recursos, não para segurança"
                ),
                "Atualizações corrigem vulnerabilidades e fornecem proteção contra ameaças de segurança"
        ));


        perguntas.add(new Pergunta(
                "O que é a RAM e qual é sua função no sistema de um computador?",
                Arrays.asList(
                        "Armazenar dados permanentemente",
                        "Controlar operações de entrada e saída",
                        "Fornecer energia para o computador",
                        "Armazenar dados temporários para acesso rápido"
                ),
                "Armazenar dados temporários para acesso rápido"
        ));

        perguntas.add(new Pergunta(
                "Qual é a diferença entre software e hardware?",
                Arrays.asList(
                        "Software é físico, hardware é lógico",
                        "Software são instruções para o computador, hardware são os dispositivos físicos",
                        "Hardware são programas, software são os componentes físicos",
                        "Software é manipulado por humanos, hardware é operado por máquinas"
                ),
                "Software são instruções para o computador, hardware são os dispositivos físicos"
        ));

        perguntas.add(new Pergunta(
                "Como é medida a capacidade de armazenamento de um disco rígido?",
                Arrays.asList(
                        "Em bytes",
                        "Em velocidade de rotação",
                        "Em volts",
                        "Em temperatura máxima suportada"
                ),
                "Em bytes"
        ));

        perguntas.add(new Pergunta(
                "Qual é a importância das atualizações de software para a segurança de um sistema computacional?",
                Arrays.asList(
                        "Atualizações são irrelevantes para a segurança de um sistema",
                        "As atualizações podem melhorar a aparência do sistema, mas não a segurança",
                        "Atualizações corrigem vulnerabilidades e fornecem proteção contra ameaças de segurança",
                        "As atualizações são apenas para adicionar novos recursos, não para segurança"
                ),
                "Atualizações corrigem vulnerabilidades e fornecem proteção contra ameaças de segurança"
        ));

        for (Pergunta pergunta : perguntas) {
            boolean respostaCerta = false;

            do {
                System.out.println(pergunta.getTexto());
                List<String> alternativas = pergunta.getAlternativas();

                Collections.shuffle(alternativas);

                char letra = 'A';
                for (String alternativa : alternativas) {
                    System.out.println("[" + letra + "] " + alternativa);
                    letra++;
                }

                System.out.print("Digite sua resposta: ");
                String resposta = scanner.nextLine().toUpperCase();

                if (resposta.length() == 1 && resposta.charAt(0) >= 'A' && resposta.charAt(0) < 'A' + alternativas.size()) {
                    int respostaint = resposta.charAt(0) - 'A';

                    String valordaresposta = alternativas.get(respostaint);
                    if (valordaresposta.equals(pergunta.getAlternativaCerta())) {
                        System.out.println("Correto!");
                        respostaCerta = true;
                        pontuacao.adicionarPontos(10);
                    } else {
                        System.out.println("Resposta Errada!");
                    }
                }
          } while (!respostaCerta) ;
            System.out.println("Pontuação final: " + pontuacao.getPontos());
        }
    }
}
