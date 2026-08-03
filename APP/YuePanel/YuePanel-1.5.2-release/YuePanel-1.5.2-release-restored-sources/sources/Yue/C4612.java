package Yue;

import android.annotation.SuppressLint;
import android.text.Editable;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4612 extends Editable.Factory {

    /* JADX INFO: renamed from: ۥ */
    public static final Object f1000 = new Object();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5225("INSTANCE_LOCK")
    public static volatile Editable.Factory f1001;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public static Class<?> f9893;

    @SuppressLint({"PrivateApi"})
    public C4612() {
        try {
            f9893 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C4612.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f1001 == null) {
            synchronized (f1000) {
                try {
                    if (f1001 == null) {
                        f1001 = new C4612();
                    }
                } finally {
                }
            }
        }
        return f1001;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@InterfaceC6391 CharSequence charSequence) {
        Class<?> cls = f9893;
        return cls != null ? C7508.m23467(cls, charSequence) : super.newEditable(charSequence);
    }
}
