package p361yc;

import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p185m8.AbstractC5109u0;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9217e;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9488f;
import p376zd.C10028y0;
import p376zd.C9987e;

/* JADX INFO: renamed from: yc.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9733n1 extends AbstractC9666a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8647b f33002a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8647b f33003b;

    public AbstractC9733n1(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2) {
        super(null);
        this.f33002a = interfaceC8647b;
        this.f33003b = interfaceC8647b2;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC9218f mo15953a();

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: b */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
        interfaceC9488f.getClass();
        int iMo37789k = mo37789k(obj);
        InterfaceC9218f interfaceC9218fMo15953a = mo15953a();
        InterfaceC9486d interfaceC9486dMo36965C = interfaceC9488f.mo36965C(interfaceC9218fMo15953a, iMo37789k);
        Iterator itMo37788j = mo37788j(obj);
        int i10 = 0;
        while (itMo37788j.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo37788j.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            interfaceC9486dMo36965C.mo36969g(mo15953a(), i10, m37981s(), key);
            i10 += 2;
            interfaceC9486dMo36965C.mo36969g(mo15953a(), i11, m37982t(), value);
        }
        interfaceC9486dMo36965C.mo638d(interfaceC9218fMo15953a);
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC8647b m37981s() {
        return this.f33002a;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC8647b m37982t() {
        return this.f33003b;
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void mo37791m(InterfaceC9485c interfaceC9485c, Map map, int i10, int i11) {
        interfaceC9485c.getClass();
        map.getClass();
        if (i11 < 0) {
            C9987e.m38645a("Size must be known in advance when using READ_ALL");
            return;
        }
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, i11 * 2), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q <= 0 || iM8560o > iM8561p) && (iM8562q >= 0 || iM8561p > iM8560o)) {
            return;
        }
        while (true) {
            mo37792n(interfaceC9485c, i10 + iM8560o, map, false);
            if (iM8560o == iM8561p) {
                return;
            } else {
                iM8560o += iM8562q;
            }
        }
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void mo37792n(InterfaceC9485c interfaceC9485c, int i10, Map map, boolean z10) {
        int iMo788v;
        interfaceC9485c.getClass();
        map.getClass();
        Object objM36978A = InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), i10, this.f33002a, null, 8, null);
        if (z10) {
            iMo788v = interfaceC9485c.mo788v(mo15953a());
            if (iMo788v != i10 + 1) {
                C10028y0.m38849a("Value must follow key in a map, index for key: ", i10, ", returned index for value: ", iMo788v);
                return;
            }
        } else {
            iMo788v = i10 + 1;
        }
        int i11 = iMo788v;
        map.put(objM36978A, (!map.containsKey(objM36978A) || (this.f33003b.mo15953a().mo35896j() instanceof AbstractC9217e)) ? InterfaceC9485c.m36978A(interfaceC9485c, mo15953a(), i11, this.f33003b, null, 8, null) : interfaceC9485c.mo895x(mo15953a(), i11, this.f33003b, AbstractC5109u0.m20769j(map, objM36978A)));
    }

    public /* synthetic */ AbstractC9733n1(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2, AbstractC1043k abstractC1043k) {
        this(interfaceC8647b, interfaceC8647b2);
    }
}
