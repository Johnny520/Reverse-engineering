package p375zc;

import ad.AbstractC0250d1;
import ad.AbstractC0259g1;
import ad.AbstractC0265i1;
import ad.AbstractC0275m0;
import ad.C0247c1;
import ad.C0277n0;
import ad.C0288t;
import ad.C0301z0;
import ad.EnumC0268j1;
import bd.AbstractC1109b;
import bd.AbstractC1110c;
import p024b9.AbstractC1043k;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8646a0;
import p300uc.InterfaceC8662p;

/* JADX INFO: renamed from: zc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9939c implements InterfaceC8646a0 {

    /* JADX INFO: renamed from: d */
    public static final a f33487d = new a(null);

    /* JADX INFO: renamed from: a */
    public final C9951i f33488a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1109b f33489b;

    /* JADX INFO: renamed from: c */
    public final C0288t f33490c;

    public AbstractC9939c(C9951i c9951i, AbstractC1109b abstractC1109b) {
        this.f33488a = c9951i;
        this.f33489b = abstractC1109b;
        this.f33490c = new C0288t();
    }

    @Override // p300uc.InterfaceC8659m
    /* JADX INFO: renamed from: a */
    public AbstractC1109b mo33269a() {
        return this.f33489b;
    }

    @Override // p300uc.InterfaceC8646a0
    /* JADX INFO: renamed from: b */
    public final Object mo33256b(InterfaceC8645a interfaceC8645a, String str) {
        interfaceC8645a.getClass();
        str.getClass();
        C0247c1 c0247c1M708a = AbstractC0250d1.m708a(this, str);
        Object objMo660D = new C0301z0(this, EnumC0268j1.f652s, c0247c1M708a, interfaceC8645a.mo15953a(), null).mo660D(interfaceC8645a);
        c0247c1M708a.m628x();
        return objMo660D;
    }

    @Override // p300uc.InterfaceC8646a0
    /* JADX INFO: renamed from: c */
    public final String mo33257c(InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC8662p.getClass();
        C0277n0 c0277n0 = new C0277n0();
        try {
            AbstractC0275m0.m811b(this, c0277n0, interfaceC8662p, obj);
            return c0277n0.toString();
        } finally {
            c0277n0.m835g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m38512d(InterfaceC8645a interfaceC8645a, AbstractC9957l abstractC9957l) {
        interfaceC8645a.getClass();
        abstractC9957l.getClass();
        return AbstractC0259g1.m758a(this, abstractC9957l, interfaceC8645a);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC9957l m38513e(InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC8662p.getClass();
        return AbstractC0265i1.m785d(this, obj, interfaceC8662p);
    }

    /* JADX INFO: renamed from: f */
    public final C9951i m38514f() {
        return this.f33488a;
    }

    /* JADX INFO: renamed from: g */
    public final C0288t m38515g() {
        return this.f33490c;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC9957l m38516h(String str) {
        str.getClass();
        return (AbstractC9957l) mo33256b(C9969u.f33546a, str);
    }

    public /* synthetic */ AbstractC9939c(C9951i c9951i, AbstractC1109b abstractC1109b, AbstractC1043k abstractC1043k) {
        this(c9951i, abstractC1109b);
    }

    /* JADX INFO: renamed from: zc.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9939c {
        public a() {
            super(new C9951i(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), AbstractC1110c.m4013a(), null);
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }
    }
}
