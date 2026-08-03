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

    public AbstractC0222F6(Object r1, Class r2, String r3, String r4, boolean r5) {
        this.f652b = r1;
        this.f653c = r2;
        this.f654d = r3;
        this.f655e = r4;
        this.f656f = r5;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC0459Km mo436c();

    /* JADX INFO: renamed from: e */
    public final InterfaceC2747y9 m437e() {
        boolean r0 = this.f656f;
        Class r1 = this.f653c;
        if (r0 == false) goto L7;
        AbstractC0425Jv.f1405a.getClass();
        return new C2816zt(r1);
    L7:
        return AbstractC0425Jv.m881a(r1);
    }
}
