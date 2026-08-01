package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0142d8 implements InterfaceC0901xp, Serializable {

    /* JADX INFO: renamed from: a */
    public transient InterfaceC0901xp f1399a;

    /* JADX INFO: renamed from: b */
    public final Object f1400b;

    /* JADX INFO: renamed from: c */
    public final Class f1401c;

    /* JADX INFO: renamed from: d */
    public final String f1402d;

    /* JADX INFO: renamed from: e */
    public final String f1403e;

    /* JADX INFO: renamed from: f */
    public final boolean f1404f;

    public AbstractC0142d8(Object obj, Class cls, String str, String str2, boolean z) {
        this.f1400b = obj;
        this.f1401c = cls;
        this.f1402d = str;
        this.f1403e = str2;
        this.f1404f = z;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0441la m927c() {
        boolean z = this.f1404f;
        Class cls = this.f1401c;
        if (z) {
            j00.f2515a.getClass();
            return new C0240fx(cls);
        }
        j00.f2515a.getClass();
        return new C0478ma(cls);
    }
}
