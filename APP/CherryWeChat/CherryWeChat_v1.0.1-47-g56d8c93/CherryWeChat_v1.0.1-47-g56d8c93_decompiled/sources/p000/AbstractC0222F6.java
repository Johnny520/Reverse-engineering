package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: F6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0222F6 implements InterfaceC0459Km, Serializable {

    /* JADX INFO: renamed from: a */
    public transient InterfaceC0459Km f651a;

    /* JADX INFO: renamed from: b */
    public final Object f652b;

    /* JADX INFO: renamed from: c */
    public final Class f653c;

    /* JADX INFO: renamed from: d */
    public final String f654d;

    /* JADX INFO: renamed from: e */
    public final String f655e;

    /* JADX INFO: renamed from: f */
    public final boolean f656f;

    public AbstractC0222F6(Object obj, Class cls, String str, String str2, boolean z) {
        this.f652b = obj;
        this.f653c = cls;
        this.f654d = str;
        this.f655e = str2;
        this.f656f = z;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC0459Km mo436c();

    /* JADX INFO: renamed from: e */
    public final InterfaceC2747y9 m437e() {
        boolean z = this.f656f;
        Class cls = this.f653c;
        if (!z) {
            return AbstractC0425Jv.m881a(cls);
        }
        AbstractC0425Jv.f1405a.getClass();
        return new C2816zt(cls);
    }
}
