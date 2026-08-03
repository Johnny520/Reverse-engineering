package ug;

import ci.C0589j;
import gg.AbstractC1416l;
import java.util.ArrayList;
import p027c0.C0368m;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p099h.C1492w;
import p119i2.C1954y;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import sg.EnumC3969a;
import tf.AbstractC4166m;
import tg.InterfaceC4186d;
import tg.InterfaceC4187e;
import vg.AbstractC4552a;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ug.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4342g implements InterfaceC4186d {

    /* JADX INFO: renamed from: g */
    public final InterfaceC5561g f14511g;

    /* JADX INFO: renamed from: h */
    public final int f14512h;

    /* JADX INFO: renamed from: i */
    public final EnumC3969a f14513i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4186d f14514j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6044i f14515k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: fg.q */
    /* JADX WARN: Multi-variable type inference failed */
    public C4342g(InterfaceC1236q interfaceC1236q, InterfaceC4186d interfaceC4186d, InterfaceC5561g interfaceC5561g, int i9, EnumC3969a enumC3969a) {
        this.f14511g = interfaceC5561g;
        this.f14512h = i9;
        this.f14513i = enumC3969a;
        this.f14514j = interfaceC4186d;
        this.f14515k = (AbstractC6044i) interfaceC1236q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m8794a(InterfaceC4187e interfaceC4187e, AbstractC6038c abstractC6038c) {
        Object objM7551e = AbstractC3603v.m7551e(new C4340e(this, interfaceC4187e, null), abstractC6038c);
        return objM7551e == EnumC5799a.f23547g ? objM7551e : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) {
        int i9 = this.f14512h;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i9 == -3) {
            InterfaceC5561g context = interfaceC5557c.getContext();
            Boolean bool = Boolean.FALSE;
            C1954y c1954y = new C1954y(13);
            InterfaceC5561g interfaceC5561g = this.f14511g;
            InterfaceC5561g interfaceC5561gMo2059e = !((Boolean) interfaceC5561g.mo2061k(c1954y, bool)).booleanValue() ? context.mo2059e(interfaceC5561g) : AbstractC3603v.m7554h(context, interfaceC5561g, false);
            if (AbstractC1416l.m3825a(interfaceC5561gMo2059e, context)) {
                Object objM8794a = m8794a(interfaceC4187e, (AbstractC6038c) interfaceC5557c);
                if (objM8794a == enumC5799a) {
                    return objM8794a;
                }
            } else {
                C5558d c5558d = C5558d.f22660g;
                if (AbstractC1416l.m3825a(interfaceC5561gMo2059e.mo2062s(c5558d), context.mo2062s(c5558d))) {
                    InterfaceC5561g context2 = interfaceC5557c.getContext();
                    if (!(interfaceC4187e instanceof C4349n) && !(interfaceC4187e instanceof C4345j)) {
                        interfaceC4187e = new C1492w(interfaceC4187e, context2);
                    }
                    Object objM8793a = AbstractC4338c.m8793a(interfaceC5561gMo2059e, interfaceC4187e, AbstractC4552a.m8992k(interfaceC5561gMo2059e), new C0589j(this, (InterfaceC5557c) null, 16), interfaceC5557c);
                    if (objM8793a == enumC5799a) {
                        return objM8793a;
                    }
                } else {
                    Object objM7551e = AbstractC3603v.m7551e(new C0368m(interfaceC4187e, this, null, 17), interfaceC5557c);
                    if (objM7551e != EnumC5799a.f23547g) {
                        objM7551e = C3967n.f12976a;
                    }
                    if (objM7551e == enumC5799a) {
                        return objM7551e;
                    }
                }
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m8795c() {
        ArrayList arrayList = new ArrayList(4);
        C5562h c5562h = C5562h.f22661g;
        InterfaceC5561g interfaceC5561g = this.f14511g;
        if (interfaceC5561g != c5562h) {
            arrayList.add("context=" + interfaceC5561g);
        }
        int i9 = this.f14512h;
        if (i9 != -3) {
            arrayList.add("capacity=" + i9);
        }
        EnumC3969a enumC3969a = EnumC3969a.f12979g;
        EnumC3969a enumC3969a2 = this.f14513i;
        if (enumC3969a2 != enumC3969a) {
            arrayList.add("onBufferOverflow=" + enumC3969a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return AbstractC0921a.m2254q(sb2, AbstractC4166m.m8392A1(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14514j + " -> " + m8795c();
    }
}
