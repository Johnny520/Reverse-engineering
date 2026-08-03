package p000;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.AbstractC2158d;
import kotlinx.serialization.json.C2155a;
import kotlinx.serialization.json.C2157c;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes.dex */
public final class C2256n implements InterfaceC0359IE {

    /* JADX INFO: renamed from: a */
    public boolean f7967a;

    /* JADX INFO: renamed from: b */
    public int f7968b;

    /* JADX INFO: renamed from: c */
    public final Object f7969c;

    public C2256n(C2379pm c2379pm, C2341oz c2341oz) {
        this.f7969c = c2341oz;
        this.f7967a = c2379pm.f8372b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4582a(C2256n c2256n, C0535Mc c0535Mc, AbstractC2571u5 abstractC2571u5) throws Throwable {
        C0416Jm c0416Jm;
        byte bM4756f;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C2256n c2256n2;
        byte bM4755e;
        C2341oz c2341oz = (C2341oz) c2256n.f7969c;
        if (abstractC2571u5 instanceof C0416Jm) {
            c0416Jm = (C0416Jm) abstractC2571u5;
            int i = c0416Jm.f1396j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0416Jm.f1396j = i - Integer.MIN_VALUE;
            } else {
                c0416Jm = new C0416Jm(c2256n, abstractC2571u5);
            }
        }
        Object obj = c0416Jm.f1394h;
        int i2 = c0416Jm.f1396j;
        if (i2 == 0) {
            AbstractC0628Oj.m1232T(obj);
            bM4756f = c2341oz.m4756f((byte) 6);
            if (c2341oz.m4765p() == 4) {
                C2341oz.m4750m(c2341oz, "Unexpected leading comma", 0, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = c0416Jm.f1393g;
            linkedHashMap2 = c0416Jm.f1392f;
            c2256n2 = c0416Jm.f1391e;
            C0535Mc c0535Mc2 = c0416Jm.f1390d;
            AbstractC0628Oj.m1232T(obj);
            linkedHashMap2.put(str, (AbstractC2156b) obj);
            bM4755e = ((C2341oz) c2256n2.f7969c).m4755e();
            if (bM4755e != 4) {
                if (bM4755e != 7) {
                    C2341oz.m4750m((C2341oz) c2256n2.f7969c, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
                C2341oz c2341oz2 = (C2341oz) c2256n2.f7969c;
                if (bM4755e != 6) {
                    c2341oz2.m4756f((byte) 7);
                } else if (bM4755e == 4) {
                    AbstractC1293cr.m2533F(c2341oz2);
                    throw null;
                }
                return new C2157c(linkedHashMap2);
            }
            bM4756f = bM4755e;
            c2256n = c2256n2;
            linkedHashMap = linkedHashMap2;
            c0535Mc = c0535Mc2;
        }
        C2341oz c2341oz3 = (C2341oz) c2256n.f7969c;
        if (!c2341oz3.m4752b()) {
            linkedHashMap2 = linkedHashMap;
            c2256n2 = c2256n;
            bM4755e = bM4756f;
            C2341oz c2341oz22 = (C2341oz) c2256n2.f7969c;
            if (bM4755e != 6) {
            }
            return new C2157c(linkedHashMap2);
        }
        String strM4760j = c2256n.f7967a ? c2341oz3.m4760j() : c2341oz3.m4759i();
        c2341oz3.m4756f((byte) 5);
        c0416Jm.f1390d = c0535Mc;
        c0416Jm.f1391e = c2256n;
        c0416Jm.f1392f = linkedHashMap;
        c0416Jm.f1393g = strM4760j;
        c0416Jm.f1396j = 1;
        c0535Mc.f1743b = c0416Jm;
        return EnumC1453gc.f5148a;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
        super/*android.view.View*/.setVisibility(0);
        this.f7967a = false;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2156b m4583b() throws Throwable {
        AbstractC2156b c2157c;
        Object obj;
        C2341oz c2341oz = (C2341oz) this.f7969c;
        byte bM4765p = c2341oz.m4765p();
        if (bM4765p == 1) {
            return m4585f(true);
        }
        if (bM4765p == 0) {
            return m4585f(false);
        }
        if (bM4765p != 6) {
            if (bM4765p == 8) {
                return m4584e();
            }
            C2341oz.m4750m(c2341oz, "Cannot read Json element because of unexpected ".concat(AbstractC0148Dc.m288v(bM4765p)), 0, 6);
            throw null;
        }
        int i = this.f7968b + 1;
        this.f7968b = i;
        if (i == 200) {
            C0373Im c0373Im = new C0373Im(this, null);
            C0535Mc c0535Mc = new C0535Mc();
            c0535Mc.f1742a = c0373Im;
            c0535Mc.f1743b = c0535Mc;
            EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
            c0535Mc.f1744c = enumC1453gc;
            while (true) {
                obj = c0535Mc.f1744c;
                InterfaceC0190Eb interfaceC0190Eb = c0535Mc.f1743b;
                if (interfaceC0190Eb == null) {
                    break;
                }
                if (enumC1453gc.equals(obj)) {
                    try {
                        C0373Im c0373Im2 = c0535Mc.f1742a;
                        AbstractC0828TB.m1636c(3, c0373Im2);
                        C0373Im c0373Im3 = new C0373Im(c0373Im2.f1302e, interfaceC0190Eb);
                        c0373Im3.f1301d = c0535Mc;
                        Object objMo448i = c0373Im3.mo448i(C0829TC.f2620a);
                        if (objMo448i != enumC1453gc) {
                            interfaceC0190Eb.mo264f(objMo448i);
                        }
                    } catch (Throwable th) {
                        interfaceC0190Eb.mo264f(new C0297Gw(th));
                    }
                } else {
                    c0535Mc.f1744c = enumC1453gc;
                    interfaceC0190Eb.mo264f(obj);
                }
            }
            AbstractC0628Oj.m1232T(obj);
            c2157c = (AbstractC2156b) obj;
        } else {
            byte bM4756f = c2341oz.m4756f((byte) 6);
            if (c2341oz.m4765p() == 4) {
                C2341oz.m4750m(c2341oz, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c2341oz.m4752b()) {
                    break;
                }
                String strM4760j = this.f7967a ? c2341oz.m4760j() : c2341oz.m4759i();
                c2341oz.m4756f((byte) 5);
                linkedHashMap.put(strM4760j, m4583b());
                bM4756f = c2341oz.m4755e();
                if (bM4756f != 4) {
                    if (bM4756f != 7) {
                        C2341oz.m4750m(c2341oz, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (bM4756f == 6) {
                c2341oz.m4756f((byte) 7);
            } else if (bM4756f == 4) {
                AbstractC1293cr.m2533F(c2341oz);
                throw null;
            }
            c2157c = new C2157c(linkedHashMap);
        }
        this.f7968b--;
        return c2157c;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public void mo796c() {
        if (this.f7967a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f7969c;
        actionBarContextView.f3730f = null;
        super/*android.view.View*/.setVisibility(this.f7968b);
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
        this.f7967a = true;
    }

    /* JADX INFO: renamed from: e */
    public C2155a m4584e() {
        C2341oz c2341oz = (C2341oz) this.f7969c;
        byte bM4755e = c2341oz.m4755e();
        if (c2341oz.m4765p() == 4) {
            C2341oz.m4750m(c2341oz, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c2341oz.m4752b()) {
            arrayList.add(m4583b());
            bM4755e = c2341oz.m4755e();
            if (bM4755e != 4) {
                boolean z = bM4755e == 9;
                int i = c2341oz.f8216a;
                if (!z) {
                    C2341oz.m4750m(c2341oz, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bM4755e == 8) {
            c2341oz.m4756f((byte) 9);
        } else if (bM4755e == 4) {
            AbstractC1293cr.m2532E(c2341oz, "array");
            throw null;
        }
        return new C2155a(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2158d m4585f(boolean z) {
        C2341oz c2341oz = (C2341oz) this.f7969c;
        String strM4760j = (this.f7967a || !z) ? c2341oz.m4760j() : c2341oz.m4759i();
        return (z || !AbstractC0585Nj.m1134a(strM4760j, "null")) ? new C0072Bm(strM4760j, z) : JsonNull.INSTANCE;
    }

    public C2256n(ActionBarContextView actionBarContextView) {
        this.f7969c = actionBarContextView;
        this.f7967a = false;
    }
}
