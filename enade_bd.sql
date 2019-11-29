
CREATE TABLE `questao_aberta` (
  `idquestao_aberta` int(11) NOT NULL AUTO_INCREMENT,
  `enunciado` longtext COLLATE utf8_unicode_ci,
  `resposta` longtext COLLATE utf8_unicode_ci,
  `gabarito` longtext COLLATE utf8_unicode_ci,
  `nota_avaliador` longtext COLLATE utf8_unicode_ci,
  PRIMARY KEY (`idquestao_aberta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
CREATE TABLE `questao_fechada` (
  `idprova_fechada` int(11) NOT NULL AUTO_INCREMENT,
  `gabarito` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `enunciado` longtext COLLATE utf8_unicode_ci,
  `op_B` longtext COLLATE utf8_unicode_ci,
  `op_C` longtext COLLATE utf8_unicode_ci,
  `op_D` longtext COLLATE utf8_unicode_ci,
  `op_A` longtext COLLATE utf8_unicode_ci,
  `op_E` longtext COLLATE utf8_unicode_ci,
  `tipo_conhecimento` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `resposta_aluno` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idprova_fechada`,`gabarito`),
  UNIQUE KEY `idprova_fechada_UNIQUE` (`idprova_fechada`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cpf` int(11) DEFAULT NULL,
  `permissao` int(11) NOT NULL DEFAULT '1',
  `password` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;