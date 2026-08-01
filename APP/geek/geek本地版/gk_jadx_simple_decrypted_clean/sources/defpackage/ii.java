package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class ii extends Editable.Factory {
    public static final Object a = null;
    public static volatile ii b;
    public static Class c;

    static {
        a = new Object();
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence r3) {
        Class r0 = c;
        if (r0 == null) goto L7;
        return new d40(r0, r3);
    L7:
        return super.newEditable(r3);
    }
}
