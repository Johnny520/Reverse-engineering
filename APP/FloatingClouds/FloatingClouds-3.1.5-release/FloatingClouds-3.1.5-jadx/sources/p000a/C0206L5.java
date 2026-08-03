package p000a;

import android.text.Editable;

/* JADX INFO: renamed from: a.L5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206L5 extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f693a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0206L5 f694b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f695c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f695c;
        return cls != null ? new C0731ne(cls, charSequence) : super.newEditable(charSequence);
    }
}
