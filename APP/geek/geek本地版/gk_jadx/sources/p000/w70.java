package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class w70 {

    /* JADX INFO: renamed from: a */
    public static final boolean f4933a;

    /* JADX INFO: renamed from: b */
    public static final boolean f4934b;

    /* JADX INFO: renamed from: c */
    public static final boolean f4935c;

    static {
        int i = Build.VERSION.SDK_INT;
        f4933a = true;
        f4934b = true;
        f4935c = i >= 28;
    }
}
