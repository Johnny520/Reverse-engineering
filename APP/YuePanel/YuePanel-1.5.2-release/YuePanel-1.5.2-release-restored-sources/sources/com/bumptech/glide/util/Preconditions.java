package com.bumptech.glide.util;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void checkArgument(boolean z) {
        checkArgument(z, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static String checkNotEmpty(@InterfaceC6490 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T> T checkNotNull(@InterfaceC6490 T t) {
        return (T) checkNotNull(t, "Argument must not be null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void checkArgument(boolean z, @InterfaceC6391 String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T> T checkNotNull(@InterfaceC6490 T t, @InterfaceC6391 String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @InterfaceC6391
    public static <T extends Collection<Y>, Y> T checkNotEmpty(@InterfaceC6391 T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }
}
