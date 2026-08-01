package p200nb;

import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p186m9.AbstractC5128i;
import p200nb.InterfaceC5541f;
import p229p9.InterfaceC6056z;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: nb.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5557v implements InterfaceC5541f {

    /* JADX INFO: renamed from: a */
    public final String f17409a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f17410b;

    /* JADX INFO: renamed from: c */
    public final String f17411c;

    /* JADX INFO: renamed from: nb.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5557v {

        /* JADX INFO: renamed from: d */
        public static final a f17412d = new a();

        public a() {
            super("Boolean", C5556u.f17408q, null);
        }

        /* JADX INFO: renamed from: d */
        public static final AbstractC2706r0 m22593d(AbstractC5128i abstractC5128i) {
            abstractC5128i.getClass();
            AbstractC2650c1 abstractC2650c1M20926o = abstractC5128i.m20926o();
            abstractC2650c1M20926o.getClass();
            return abstractC2650c1M20926o;
        }
    }

    /* JADX INFO: renamed from: nb.v$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5557v {

        /* JADX INFO: renamed from: d */
        public static final b f17413d = new b();

        public b() {
            super("Int", C5558w.f17415q, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final AbstractC2706r0 m22595d(AbstractC5128i abstractC5128i) {
            abstractC5128i.getClass();
            AbstractC2650c1 abstractC2650c1M20896E = abstractC5128i.m20896E();
            abstractC2650c1M20896E.getClass();
            return abstractC2650c1M20896E;
        }
    }

    /* JADX INFO: renamed from: nb.v$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC5557v {

        /* JADX INFO: renamed from: d */
        public static final c f17414d = new c();

        public c() {
            super("Unit", C5559x.f17416q, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final AbstractC2706r0 m22597d(AbstractC5128i abstractC5128i) {
            abstractC5128i.getClass();
            AbstractC2650c1 abstractC2650c1M20916a0 = abstractC5128i.m20916a0();
            abstractC2650c1M20916a0.getClass();
            return abstractC2650c1M20916a0;
        }
    }

    public AbstractC5557v(String str, InterfaceC0184l interfaceC0184l) {
        this.f17409a = str;
        this.f17410b = interfaceC0184l;
        this.f17411c = "must return " + str;
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: a */
    public String mo22561a(InterfaceC6056z interfaceC6056z) {
        return InterfaceC5541f.a.m22571a(this, interfaceC6056z);
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: b */
    public String mo22562b() {
        return this.f17411c;
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: c */
    public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        return AbstractC1061t.m3842c(interfaceC6056z.mo12675f(), this.f17410b.mo27m(AbstractC9211e.m35858m(interfaceC6056z)));
    }

    public /* synthetic */ AbstractC5557v(String str, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(str, interfaceC0184l);
    }
}
