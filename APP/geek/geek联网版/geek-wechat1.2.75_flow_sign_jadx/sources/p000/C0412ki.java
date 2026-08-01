package p000;

import android.text.Editable;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
public final class C0412ki extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f2841a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0412ki f2842b;

    /* JADX INFO: renamed from: c */
    public static Class f2843c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2843c;
        return cls != null ? new k40(cls, charSequence) : super.newEditable(charSequence);
    }
}
