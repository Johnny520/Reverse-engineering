package com.ljx.wechatmod.auth;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class StringFog {
    public static final StringFog INSTANCE = new StringFog();

    private StringFog() {
    }

    public final String decrypt(String base64Str, int key) {
        if (base64Str == null) {
            throw new NullPointerException("base64Str");
        }
        try {
            byte[] data = Base64.decode(base64Str, 0);
            for (int i = 0; i < data.length; i++) {
                data[i] = (byte) (data[i] ^ key);
            }
            return new String(data, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }
}
