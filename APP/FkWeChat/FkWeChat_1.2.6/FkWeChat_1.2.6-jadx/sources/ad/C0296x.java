package ad;

import bd.AbstractC1109b;
import p215oc.C5706c;
import p299ub.AbstractC8627i0;
import p329wc.InterfaceC9218f;
import p345xc.AbstractC9483a;
import p375zc.AbstractC9939c;

/* JADX INFO: renamed from: ad.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0296x extends AbstractC9483a {

    /* JADX INFO: renamed from: b */
    public final AbstractC0239a f723b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1109b f724c;

    public C0296x(AbstractC0239a abstractC0239a, AbstractC9939c abstractC9939c) {
        abstractC0239a.getClass();
        abstractC9939c.getClass();
        this.f723b = abstractC0239a;
        this.f724c = abstractC9939c.mo33269a();
    }

    @Override // p345xc.AbstractC9483a, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: E */
    public short mo866E() {
        AbstractC0239a abstractC0239a = this.f723b;
        String strM623s = abstractC0239a.m623s();
        try {
            return AbstractC8627i0.m33197k(strM623s);
        } catch (IllegalArgumentException unused) {
            AbstractC0239a.m588z(abstractC0239a, "Failed to parse type 'UShort' for input '" + strM623s + '\'', 0, null, 6, null);
            C5706c.m23089a();
            return (short) 0;
        }
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: a */
    public AbstractC1109b mo672a() {
        return this.f724c;
    }

    @Override // p345xc.AbstractC9483a, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: i */
    public int mo867i() {
        AbstractC0239a abstractC0239a = this.f723b;
        String strM623s = abstractC0239a.m623s();
        try {
            return AbstractC8627i0.m33191e(strM623s);
        } catch (IllegalArgumentException unused) {
            AbstractC0239a.m588z(abstractC0239a, "Failed to parse type 'UInt' for input '" + strM623s + '\'', 0, null, 6, null);
            C5706c.m23089a();
            return 0;
        }
    }

    @Override // p345xc.AbstractC9483a, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: n */
    public long mo868n() {
        AbstractC0239a abstractC0239a = this.f723b;
        String strM623s = abstractC0239a.m623s();
        try {
            return AbstractC8627i0.m33194h(strM623s);
        } catch (IllegalArgumentException unused) {
            AbstractC0239a.m588z(abstractC0239a, "Failed to parse type 'ULong' for input '" + strM623s + '\'', 0, null, 6, null);
            C5706c.m23089a();
            return 0L;
        }
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: v */
    public int mo788v(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // p345xc.AbstractC9483a, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: z */
    public byte mo869z() {
        AbstractC0239a abstractC0239a = this.f723b;
        String strM623s = abstractC0239a.m623s();
        try {
            return AbstractC8627i0.m33188b(strM623s);
        } catch (IllegalArgumentException unused) {
            AbstractC0239a.m588z(abstractC0239a, "Failed to parse type 'UByte' for input '" + strM623s + '\'', 0, null, 6, null);
            C5706c.m23089a();
            return (byte) 0;
        }
    }
}
