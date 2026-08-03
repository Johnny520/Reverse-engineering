package p025N;

import android.text.Editable;
import androidx.emoji2.text.C0496u;

/* JADX INFO: renamed from: N.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0250a extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f526a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0250a f527b;

    /* JADX INFO: renamed from: c */
    public static Class f528c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f528c;
        return cls != null ? new C0496u(cls, charSequence) : super.newEditable(charSequence);
    }
}
