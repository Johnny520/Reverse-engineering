package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface Key {
    public static final String STRING_CHARSET_NAME = "UTF-8";
    public static final Charset CHARSET = Charset.forName(STRING_CHARSET_NAME);

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest);
}
