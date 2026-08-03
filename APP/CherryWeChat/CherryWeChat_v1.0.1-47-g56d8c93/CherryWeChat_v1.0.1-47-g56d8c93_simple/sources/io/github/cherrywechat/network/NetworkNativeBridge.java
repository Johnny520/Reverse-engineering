package io.github.cherrywechat.network;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NetworkNativeBridge {
    public static final native String decryptData(String r0);

    public static final native Map<String, String> getHeaders(String r0, String r1);
}
