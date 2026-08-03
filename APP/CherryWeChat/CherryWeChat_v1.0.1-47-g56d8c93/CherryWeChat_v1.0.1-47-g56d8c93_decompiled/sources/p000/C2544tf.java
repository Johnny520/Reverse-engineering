package p000;

import android.text.Editable;

/* JADX INFO: renamed from: tf */
/* JADX INFO: loaded from: classes.dex */
public final class C2544tf extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f8858a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C2544tf f8859b;

    /* JADX INFO: renamed from: c */
    public static Class f8860c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f8860c;
        return cls != null ? new C0428Jy(cls, charSequence) : super.newEditable(charSequence);
    }
}
