# Парсер сайта с составлением Excel таблицы, включающей в себя наименование товара, URL, ссылку на фото.

## Принцип работы

1. **Создаем файл из которого производится сбор ссылок**. Созаем файл url.txt. Указываем ссылки на товар, который нужно обработать.
2. **Точка входа**. Метод ApachePOIExcelWrite для выгрузки информации в xlsx.
3. **Обработка информации, получаемой со страницы:** В папке page лежат файлы для обработки.
4. **Обработка порядка полей:** Класс ApachePOIExcelWrite отвечает за порядок добавления полей в xslx файл.

Предназначен для упрощения работы с текстовой информацией, расположенной в открытом доступе, улучшения качества контента и информативности.

