package p010k;

import p011l.C0193a;
import p011l.C0194b;
import p011l.C0195c;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0174d extends AbstractC0186p {

    /* JADX INFO: renamed from: c */
    private final C0193a f685c;

    /* JADX INFO: renamed from: d */
    private C0193a f686d;

    AbstractC0174d(C0191u c0191u, C0188r c0188r) {
        super(c0191u, c0188r);
        String strM445h = m441h().m442g().m445h();
        C0191u c0191uM440g = m440g();
        boolean z = true;
        if (c0191uM440g.equals(C0191u.f701e)) {
            String strM445h2 = m441h().m443h().m445h();
            strM445h2.getClass();
            if (!strM445h2.equals("invoke") && !strM445h2.equals("invokeExact")) {
                z = false;
            }
        } else if (c0191uM440g.equals(C0191u.f702f)) {
            String strM445h3 = m441h().m443h().m445h();
            strM445h3.getClass();
            switch (strM445h3) {
                case "getAndBitwiseOrRelease":
                case "getAndBitwiseAndRelease":
                case "compareAndSet":
                case "compareAndExchangeRelease":
                case "weakCompareAndSet":
                case "getAndAddRelease":
                case "getAndBitwiseAnd":
                case "getAndBitwiseXor":
                case "getAndBitwiseXorRelease":
                case "weakCompareAndSetPlain":
                case "weakCompareAndSetAcquire":
                case "setRelease":
                case "getAcquire":
                case "getAndSetRelease":
                case "get":
                case "set":
                case "getAndBitwiseOrAcquire":
                case "setVolatile":
                case "getVolatile":
                case "getAndAdd":
                case "getAndSet":
                case "getAndBitwiseAndAcquire":
                case "setOpaque":
                case "getOpaque":
                case "compareAndExchangeAcquire":
                case "getAndAddAcquire":
                case "getAndBitwiseXorAcquire":
                case "getAndBitwiseOr":
                case "compareAndExchange":
                case "getAndSetAcquire":
                case "weakCompareAndSetRelease":
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            z = false;
        }
        this.f685c = z ? C0193a.m453b(strM445h) : C0193a.m454f(strM445h);
        this.f686d = null;
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return this.f685c.m458e();
    }

    @Override // p010k.AbstractC0186p, p010k.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        int iMo426e = super.mo426e(abstractC0171a);
        return iMo426e != 0 ? iMo426e : this.f685c.compareTo(((AbstractC0174d) abstractC0171a).f685c);
    }

    /* JADX INFO: renamed from: i */
    public final int m430i(boolean z) {
        C0193a c0193a = this.f685c;
        if (!z) {
            if (this.f686d == null) {
                this.f686d = c0193a.m459g(m440g().m451g());
            }
            c0193a = this.f686d;
        }
        C0194b c0194bM457d = c0193a.m457d();
        int iM504B = c0194bM457d.m504B();
        int iM469f = 0;
        for (int i2 = 0; i2 < iM504B; i2++) {
            iM469f += c0194bM457d.m515r(i2).m469f();
        }
        return iM469f;
    }

    /* JADX INFO: renamed from: j */
    public final C0193a m431j() {
        return this.f685c;
    }
}
