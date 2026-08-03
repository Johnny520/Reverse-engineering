package p025N;

import android.text.Editable;
import androidx.emoji2.text.C0496u;

/* JADX INFO: renamed from: N.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0250a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f526a = null;

    /* JADX INFO: renamed from: b */
    public static volatile C0250a f527b;

    /* JADX INFO: renamed from: c */
    public static Class f528c;

    static {
        f526a = new Object();
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence r3) {
        Class r02 = f528c;
        if (r02 == null) goto L7;
        return new C0496u(r02, r3);
    L7:
        return super.newEditable(r3);
    }
}
