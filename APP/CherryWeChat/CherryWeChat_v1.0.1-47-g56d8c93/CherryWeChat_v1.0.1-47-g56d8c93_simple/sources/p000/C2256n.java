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

    public C2256n(C2379pm r1, C2341oz r2) {
        this.f7969c = r2;
        this.f7967a = r1.f8372b;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m4582a(C2256n r9, C0535Mc r10, AbstractC2571u5 r11) {
        C2341oz r0 = (C2341oz) r9.f7969c;
        if ((r11 instanceof C0416Jm) == false) goto L7;
        C0416Jm r1 = (C0416Jm) r11;
        int r2 = r1.f1396j;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.f1396j = r2 - Integer.MIN_VALUE;
    L8:
        Object r112 = r1.f1394h;
        int r22 = r1.f1396j;
        if (r22 == 0) goto L20;
        if (r22 != 1) goto L19;
        String r92 = r1.f1393g;
        LinkedHashMap r102 = r1.f1392f;
        C2256n r02 = r1.f1391e;
        C0535Mc r23 = r1.f1390d;
        AbstractC0628Oj.m1232T(r112);
        r102.put(r92, (AbstractC2156b) r112);
        byte r93 = ((C2341oz) r02.f7969c).m4755e();
        if (r93 == 4) goto L17;
        if (r93 == 7) goto L32;
        C2341oz.m4750m((C2341oz) r02.f7969c, "Expected end of the object or comma", 0, 6);
        throw null;
    L32:
        C2341oz r113 = (C2341oz) r02.f7969c;
        if (r93 != 6) goto L35;
        r113.m4756f((byte) 7);
    L37:
        return new C2157c(r102);
    L35:
        if (r93 != 4) goto L37;
        AbstractC1293cr.m2533F(r113);
        throw null;
    L17:
        byte r114 = r93;
        r9 = r02;
        LinkedHashMap r03 = r102;
        r10 = r23;
    L23:
        C2341oz r24 = (C2341oz) r9.f7969c;
        if (r24.m4752b() == true) goto L26;
        r102 = r03;
        r02 = r9;
        r93 = r114;
        goto L32
    L26:
        if (r9.f7967a == false) goto L28;
        String r115 = r24.m4760j();
    L29:
        r24.m4756f((byte) 5);
        r1.f1390d = r10;
        r1.f1391e = r9;
        r1.f1392f = r03;
        r1.f1393g = r115;
        r1.f1396j = 1;
        r10.f1743b = r1;
        return EnumC1453gc.f5148a;
    L28:
        r115 = r24.m4759i();
        goto L29
    L19:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L20:
        AbstractC0628Oj.m1232T(r112);
        r114 = r0.m4756f((byte) 6);
        if (r0.m4765p() == 4) goto L40;
        r03 = new LinkedHashMap();
        goto L23
    L40:
        C2341oz.m4750m(r0, "Unexpected leading comma", 0, 6);
        throw null;
    L7:
        r1 = new C0416Jm(r9, r11);
        goto L8
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
        ActionBarContextView.m2075a((ActionBarContextView) this.f7969c);
        this.f7967a = false;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2156b m4583b() {
        C2341oz r0 = (C2341oz) this.f7969c;
        byte r1 = r0.m4765p();
        if (r1 != 1) goto L7;
        return m4585f(true);
    L7:
        if (r1 != 0) goto L11;
        return m4585f(false);
    L11:
        if (r1 != 6) goto L52;
        int r12 = this.f7968b + 1;
        this.f7968b = r12;
        if (r12 != 200) goto L26;
        C0373Im r02 = new C0373Im(this, null);
        C0535Mc r13 = new C0535Mc();
        r13.f1742a = r02;
        r13.f1743b = r13;
        EnumC1453gc r2 = EnumC1453gc.f5148a;
        r13.f1744c = r2;
    L15:
        Object r03 = r13.f1744c;
        InterfaceC0190Eb r3 = r13.f1743b;
        if (r3 == null) goto L17;
        if (r2.equals(r03) == false) goto L25;
        C0373Im r04 = r13.f1742a;     // Catch: Throwable -> L23
        AbstractC0828TB.m1636c(3, r04);     // Catch: Throwable -> L23
        C0373Im r4 = new C0373Im(r04.f1302e, r3);     // Catch: Throwable -> L23
        r4.f1301d = r13;     // Catch: Throwable -> L23
        Object r05 = r4.mo448i(C0829TC.f2620a);     // Catch: Throwable -> L23
        if (r05 == r2) goto L15;
        r3.mo264f(r05);
    L23:
        th = move-exception;
        r3.mo264f(new C0297Gw(th));
        goto L15
    L25:
        r13.f1744c = r2;
        r3.mo264f(r03);
        goto L15
    L17:
        AbstractC0628Oj.m1232T(r03);
        AbstractC2156b r06 = (AbstractC2156b) r03;
    L45:
        this.f7968b--;
        return r06;
    L26:
        byte r14 = r0.m4756f((byte) 6);
        if (r0.m4765p() == 4) goto L49;
        LinkedHashMap r22 = new LinkedHashMap();
    L30:
        if (r0.m4752b() == false) goto L41;
        if (this.f7967a == false) goto L34;
        String r15 = r0.m4760j();
    L35:
        r0.m4756f((byte) 5);
        r22.put(r15, m4583b());
        r14 = r0.m4755e();
        if (r14 == 4) goto L30;
        if (r14 == 7) goto L41;
        C2341oz.m4750m(r0, "Expected end of the object or comma", 0, 6);
        throw null;
    L34:
        r15 = r0.m4759i();
    L41:
        if (r14 != 6) goto L43;
        r0.m4756f((byte) 7);
    L44:
        r06 = new C2157c(r22);
        goto L45
    L43:
        if (r14 != 4) goto L44;
        AbstractC1293cr.m2533F(r0);
        throw null;
    L49:
        C2341oz.m4750m(r0, "Unexpected leading comma", 0, 6);
        throw null;
    L52:
        if (r1 == 8) goto L54;
        C2341oz.m4750m(r0, "Cannot read Json element because of unexpected ".concat(AbstractC0148Dc.m288v(r1)), 0, 6);
        throw null;
    L54:
        return m4584e();
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public void mo796c() {
        if (this.f7967a == false) goto L5;
        return;
    L5:
        ActionBarContextView r0 = (ActionBarContextView) this.f7969c;
        r0.f3730f = null;
        ActionBarContextView.m2076b(r0, this.f7968b);
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
        this.f7967a = true;
    }

    /* JADX INFO: renamed from: e */
    public C2155a m4584e() {
        C2341oz r0 = (C2341oz) this.f7969c;
        byte r1 = r0.m4755e();
        if (r0.m4765p() == 4) goto L25;
        ArrayList r2 = new ArrayList();
    L6:
        if (r0.m4752b() == false) goto L18;
        r2.add(m4583b());
        r1 = r0.m4755e();
        if (r1 == 4) goto L6;
        if (r1 != 9) goto L11;
        boolean r6 = true;
    L12:
        int r7 = r0.f8216a;
        if (r6 == true) goto L6;
        C2341oz.m4750m(r0, "Expected end of the array or comma", r7, 4);
        throw null;
    L11:
        r6 = false;
        goto L12
    L18:
        if (r1 != 8) goto L20;
        r0.m4756f((byte) 9);
    L22:
        return new C2155a(r2);
    L20:
        if (r1 != 4) goto L22;
        AbstractC1293cr.m2532E(r0, "array");
        throw null;
    L25:
        C2341oz.m4750m(r0, "Unexpected leading comma", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2158d m4585f(boolean r3) {
        C2341oz r0 = (C2341oz) this.f7969c;
        if (this.f7967a == true) goto L7;
        if (r3 == false) goto L7;
        String r02 = r0.m4759i();
    L8:
        if (r3 == true) goto L14;
        if (AbstractC0585Nj.m1134a(r02, "null") == false) goto L14;
        return JsonNull.INSTANCE;
    L14:
        return new C0072Bm(r02, r3);
    L7:
        r02 = r0.m4760j();
        goto L8
    }

    public C2256n(ActionBarContextView r1) {
        this.f7969c = r1;
        this.f7967a = false;
    }
}
