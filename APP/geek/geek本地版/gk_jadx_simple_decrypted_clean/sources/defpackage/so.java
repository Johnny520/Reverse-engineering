package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class so {
    public static int a(Object r0) {
        return ((Icon) r0).getResId();
    }

    public static String b(Object r0) {
        return ((Icon) r0).getResPackage();
    }

    public static int c(Object r0) {
        return ((Icon) r0).getType();
    }

    public static Uri d(Object r0) {
        return ((Icon) r0).getUri();
    }
}
