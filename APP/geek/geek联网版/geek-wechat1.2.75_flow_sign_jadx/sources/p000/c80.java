package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class c80 {

    /* JADX INFO: renamed from: a */
    public static final boolean f832a;

    /* JADX INFO: renamed from: b */
    public static final boolean f833b;

    /* JADX INFO: renamed from: c */
    public static final boolean f834c;

    static {
        int i = Build.VERSION.SDK_INT;
        f832a = true;
        f833b = true;
        f834c = i >= 28;
    }
}
