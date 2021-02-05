## Описание задачи

Необходимо реализовать консольное CRUD приложение, которое имеет следующие сущности:

Writer
Post  
Label


PostStatus (enum ACTIVE, UNDER_REVIEW, DELETED)


В качестве хранилища данных необходимо использовать текстовые файлы:
posts.txt, labels.txt, writers.txt

Пользователь в консоли должен иметь возможность создания, получения, редактирования и удаления данных.

Слои:    
src.com.VB2020.model - POJO клаcсы   
src.com.VB2020.repository - классы, реализующие доступ к текстовым файлам  
src.com.VB2020.controller - обработка запросов от пользователя   
src.com.VB2020.view - все данные, необходимые для работы с консолью

## Инструкции запуска приложения через командную строку

1) Перейти по ссылке https://github.com/VB2020/CRUD_Application

2) Нажать на "Clone or Download" - скачать.

3) Распаковать скачанный архив.

4) Открыть проект в Intellij Idea.

5) Запустить класс src.com.VB2020.Main

6) Следовать подсказкам в консоли