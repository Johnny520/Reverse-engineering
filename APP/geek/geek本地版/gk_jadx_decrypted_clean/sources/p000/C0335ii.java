package p000;

import android.text.Editable;

/* JADX INFO: renamed from: ii */
/* JADX INFO: loaded from: classes.dex */
public final class C0335ii extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f2433a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0335ii f2434b;

    /* JADX INFO: renamed from: c */
    public static Class f2435c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2435c;
        return cls != null ? new d40(cls, charSequence) : super.newEditable(charSequence);
    }
}
