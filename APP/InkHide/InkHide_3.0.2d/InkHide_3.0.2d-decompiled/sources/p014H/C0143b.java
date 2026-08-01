package p014H;

import android.text.Editable;
import androidx.emoji2.text.C0406u;

/* JADX INFO: renamed from: H.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0143b extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f445a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C0143b f446b;

    /* JADX INFO: renamed from: c */
    public static Class f447c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f447c;
        return cls != null ? new C0406u(cls, charSequence) : super.newEditable(charSequence);
    }
}
