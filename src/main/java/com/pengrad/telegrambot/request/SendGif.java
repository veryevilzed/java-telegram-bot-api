package com.pengrad.telegrambot.request;

import java.io.File;

/**
 * Created by zed on 01.09.16.
 */
public class SendGif extends AbstractMultipartRequest<com.pengrad.telegrambot.request.SendGif> {

    public SendGif(Object chatId, String photo) {
        super(chatId, photo);
    }

    public SendGif(Object chatId, File photo) {
        super(chatId, photo);
    }

    public SendGif(Object chatId, byte[] photo) {
        super(chatId, photo);
    }

    public com.pengrad.telegrambot.request.SendGif caption(String caption) {
        return add("caption", caption);
    }

    @Override
    protected String getFileParamName() {
        return "photo";
    }

    @Override
    public String getDefaultFileName() {
        return ContentTypes.GIF_FILE_NAME;
    }

    @Override
    public String getContentType() {
        return ContentTypes.GIF_MIME_TYPE;
    }

}
