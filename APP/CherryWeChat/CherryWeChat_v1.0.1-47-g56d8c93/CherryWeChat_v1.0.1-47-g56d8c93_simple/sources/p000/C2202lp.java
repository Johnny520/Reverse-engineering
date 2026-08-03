package p000;

import android.os.Bundle;
import java.io.File;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: lp */
/* JADX INFO: loaded from: classes.dex */
public final class C2202lp extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7654e;

    /* JADX INFO: renamed from: f */
    public int f7655f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f7656g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f7657h;

    public /* synthetic */ C2202lp(String r1, String r2, InterfaceC0190Eb r3, int r4) {
        this.f7654e = r4;
        this.f7656g = r1;
        this.f7657h = r2;
        super(r3);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f7654e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((C2202lp) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C2202lp) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L9:
        return ((C2202lp) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r4, Object r5) {
        switch(this.f7654e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        String r2 = this.f7656g;
        return new C2202lp(r2, this.f7657h, r4, 2);
    L6:
        String r22 = this.f7656g;
        return new C2202lp(r22, this.f7657h, r4, 1);
    L8:
        String r23 = this.f7656g;
        return new C2202lp(r23, this.f7657h, r4, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r12) {
        int r0 = this.f7654e;
        C0829TC r1 = C0829TC.f2620a;
        String r2 = this.f7657h;
        String r3 = this.f7656g;
        EnumC1453gc r4 = EnumC1453gc.f5148a;
        switch(r0) {
            case 0: goto L32;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        int r02 = this.f7655f;
        if (r02 == 0) goto L10;
        if (r02 != 1) goto L9;
        AbstractC0628Oj.m1232T(r12);
    L13:
        String r122 = (String) r12;
        if (r122 == null) goto L48;
        Bundle r03 = new Bundle();
        r03.putString(AbstractC0295Gu.m625r(-174852413585461L), AbstractC0295Gu.m625r(-174946902865973L));
        r03.putString(AbstractC0295Gu.m625r(-175011327375413L), r122);
        AbstractC2248ms.f7951a.getClass();
        C0668Pg.m1332m(r03, r2);
        return r1;
    L48:
        return r1;
    L9:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-175668457371701L));
    L10:
        AbstractC0628Oj.m1232T(r12);
        C0668Pg r123 = AbstractC2248ms.f7951a;
        this.f7655f = 1;
        r12 = C0668Pg.m1326d(r123, r3, this);
        if (r12 != r4) goto L13;
        return r4;
    L18:
        int r04 = this.f7655f;
        if (r04 == 0) goto L24;
        if (r04 != 1) goto L23;
        AbstractC0628Oj.m1232T(r12);
    L27:
        String r124 = (String) r12;
        if (r124 == null) goto L50;
        String r05 = new File(r124).getName();
        Bundle r32 = new Bundle();
        r32.putString(AbstractC0295Gu.m625r(-158930969819189L), AbstractC0295Gu.m625r(-159025459099701L));
        r32.putString(AbstractC0295Gu.m625r(-159085588641845L), r124);
        r32.putString(AbstractC0295Gu.m625r(-175127291492405L), r05);
        AbstractC2248ms.f7951a.getClass();
        C0668Pg.m1332m(r32, r2);
        return r1;
    L50:
        return r1;
    L23:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-175196010969141L));
    L24:
        AbstractC0628Oj.m1232T(r12);
        C0668Pg r125 = AbstractC2248ms.f7951a;
        this.f7655f = 1;
        r12 = C0668Pg.m1326d(r125, r3, this);
        if (r12 != r4) goto L27;
        return r4;
    L32:
        int r06 = this.f7655f;
        if (r06 == 0) goto L38;
        if (r06 != 1) goto L37;
        AbstractC0628Oj.m1232T(r12);
        return r12;
    L37:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-82171314305077L));
    L38:
        AbstractC0628Oj.m1232T(r12);
        C0594Ns r126 = C0594Ns.f1925a;
        String r07 = C1456gf.m2794L();
        String r13 = C1456gf.m2791I();
        String r6 = C1456gf.m2793K();
        String r7 = C1456gf.m2792J();
        String r8 = AbstractC0295Gu.m625r(-82141249534005L);
        this.f7655f = 1;
        r126.getClass();
        JSONObject r127 = new JSONObject();
        r127.put(AbstractC0295Gu.m625r(-400394031200309L), r07);
        r127.put(AbstractC0295Gu.m625r(-400432685905973L), r13);
        r127.put(AbstractC0295Gu.m625r(-400497110415413L), r6);
        r127.put(AbstractC0295Gu.m625r(-401094110869557L), AbstractC0295Gu.m625r(-401124175640629L));
        r127.put(AbstractC0295Gu.m625r(-401158535378997L), r3);
        r127.put(AbstractC0295Gu.m625r(-401184305182773L), r2);
        r127.put(AbstractC0295Gu.m625r(-401222959888437L), r7);
        r127.put(AbstractC0295Gu.m625r(-401248729692213L), r8);
        String r08 = AbstractC0295Gu.m625r(-401278794463285L);
        int r14 = AbstractC1450gG.f5067a;
        if (AbstractC1406fG.m2699Y(C1456gf.f5172p) == false) goto L42;
        long r15 = -400776283289653L;
    L43:
        r127.put(r08, AbstractC0295Gu.m625r(r15));
        String r128 = r127.toString();
        AbstractC0295Gu.m625r(-400845002766389L);
        Object r129 = C0594Ns.m1167f(AbstractC0295Gu.m625r(-400905132308533L), r128, this);
        if (r129 == r4) goto L46;
        return r129;
    L46:
        return r4;
    L42:
        r15 = -400806348060725L;
        goto L43
    }
}
