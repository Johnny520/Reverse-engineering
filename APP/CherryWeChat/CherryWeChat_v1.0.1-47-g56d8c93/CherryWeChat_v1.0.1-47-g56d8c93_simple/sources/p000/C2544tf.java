package p000;

import android.text.Editable;

/* JADX INFO: renamed from: tf */
/* JADX INFO: loaded from: classes.dex */
public final class C2544tf extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f8858a = null;

    /* JADX INFO: renamed from: b */
    public static volatile C2544tf f8859b;

    /* JADX INFO: renamed from: c */
    public static Class f8860c;

    static {
        f8858a = new Object();
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence r3) {
        Class r0 = f8860c;
        if (r0 == null) goto L7;
        return new C0428Jy(r0, r3);
    L7:
        return super.newEditable(r3);
    }
}
