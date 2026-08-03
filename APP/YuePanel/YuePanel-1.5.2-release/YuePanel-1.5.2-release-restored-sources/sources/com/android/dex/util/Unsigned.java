package com.android.dex.util;

import Yue.C8080;
import Yue.C8578;

/* JADX INFO: loaded from: classes.dex */
public final class Unsigned {
    private Unsigned() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int compare(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & C8578.f25466) < (((long) i2) & C8578.f25466) ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int compare(short s, short s2) {
        if (s == s2) {
            return 0;
        }
        return (s & C8080.f23970) < (s2 & C8080.f23970) ? -1 : 1;
    }
}
