# PruebaGIT

# ALIAS (que se encuentran en .git/config)
[alias]
	alias = config --get-regexp ^alias\\.
	co = checkout
	st = status
	ci = commit
	br = branch
[user]
	name = Lucía Caballero Ruiz
	email = luciacaballeror@gmail.com

# HOOK => pre-commit
He hecho uso del hook pre-commit el cual pide confirmación al usuario antes de realizar cualquier commit en una rama.
Para ello he creado un txt simple y hecho commit de el.

# GIT BISECT
Para la utilización de bisect he hecho dos commit iniciales y en el tercero he introducido un error y luego he añadidos otros dos posteriores.
He utilizado git bisect poniendo como bad el HEAD y como good el primer commit realizado, y he ido marcando los commit con good o bad hasta encontrar el 
primer commit donde se ha introducido el error y luego git reset para volver al estado original y arreglar el error y hacer un commit final.
