package p000;

import android.content.SharedPreferences;
import android.widget.LinearLayout;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fq */
/* JADX INFO: loaded from: classes.dex */
public final class C1423fq extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5022e;

    /* JADX INFO: renamed from: f */
    public int f5023f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2112jq f5024g;

    public /* synthetic */ C1423fq(C2112jq r1, InterfaceC0190Eb r2, int r3) {
        this.f5022e = r3;
        this.f5024g = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f5022e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C1423fq) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C1423fq) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f5022e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C1423fq(this.f5024g, r3, 1);
    L7:
        return new C1423fq(this.f5024g, r3, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r12) {
        int r0 = this.f5022e;
        C0829TC r1 = C0829TC.f2620a;
        EnumC1453gc r3 = EnumC1453gc.f5148a;
        C2112jq r4 = this.f5024g;
        Object r6 = null;
        LinearLayout r62 = null;
        switch(r0) {
            case 0: goto L37;
            default: goto L4;
        };
    L4:
        int r02 = this.f5023f;
        if (r02 == 0) goto L13;
        if (r02 != 1) goto L12;
        AbstractC0628Oj.m1232T(r12);     // Catch: Exception -> L9
    L17:
        r4.f7430a = C2112jq.m4301a(r4, (String) r12);     // Catch: Exception -> L9
        Banner r122 = r4.f7431b;     // Catch: Exception -> L9
        if (r122 != null) goto L20;
        AbstractC0295Gu.m625r(-826313053042741L);     // Catch: Exception -> L9
        r122 = null;
    L20:
        r122.setDatas(r4.f7430a);     // Catch: Exception -> L9
        if (r4.f7430a.isEmpty() == true) goto L26;
        LinearLayout r123 = r4.f7432c;     // Catch: Exception -> L9
        if (r123 != null) goto L25;
        AbstractC0295Gu.m625r(-826343117813813L);     // Catch: Exception -> L9
        r123 = null;
    L25:
        r123.setVisibility(0);     // Catch: Exception -> L9
        return r1;
    L26:
        LinearLayout r124 = r4.f7432c;     // Catch: Exception -> L9
        if (r124 != null) goto L29;
        AbstractC0295Gu.m625r(-826390362454069L);     // Catch: Exception -> L9
        r124 = null;
    L29:
        r124.setVisibility(8);     // Catch: Exception -> L9
        return r1;
    L12:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-809670054770741L));
    L13:
        AbstractC0628Oj.m1232T(r12);
        C0594Ns r125 = C0594Ns.f1925a;     // Catch: Exception -> L9
        this.f5023f = 1;     // Catch: Exception -> L9
        r125.getClass();     // Catch: Exception -> L9
        r12 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400668909107253L), this);     // Catch: Exception -> L9
        if (r12 != r3) goto L17;
        return r3;
    L9:
        e = move-exception;
        e.printStackTrace();
        LinearLayout r126 = r4.f7432c;
        if (r126 != null) goto L34;
        AbstractC0295Gu.m625r(-809622810130485L);
    L35:
        r62.setVisibility(8);
        return r1;
    L34:
        r62 = r126;
        goto L35
    L37:
        int r03 = this.f5023f;
        if (r03 == 0) goto L46;
        if (r03 != 1) goto L45;
        AbstractC0628Oj.m1232T(r12);     // Catch: Exception -> L42
    L50:
        List r127 = C2112jq.m4302e(r4, (String) r12);     // Catch: Exception -> L42
        Iterator r04 = r127.iterator();     // Catch: Exception -> L42
    L52:
        if (r04.hasNext() == false) goto L56;
        Object r32 = r04.next();     // Catch: Exception -> L42
        if (AbstractC0585Nj.m1134a(((C1335dq) r32).f4809a, AbstractC0295Gu.m625r(-811216242997301L)) == false) goto L52;
        r6 = r32;
    L56:
        C1335dq r63 = (C1335dq) r6;     // Catch: Exception -> L42
        ArrayList r05 = new ArrayList();     // Catch: Exception -> L42
        Iterator r128 = r127.iterator();     // Catch: Exception -> L42
    L58:
        if (r128.hasNext() == false) goto L62;
        Object r33 = r128.next();     // Catch: Exception -> L42
        if (AbstractC0585Nj.m1134a(((C1335dq) r33).f4809a, AbstractC0295Gu.m625r(-811306437310517L)) == true) goto L58;
        r05.add(r33);     // Catch: Exception -> L42
        goto L58
    L62:
        ArrayList r129 = new ArrayList();     // Catch: Exception -> L42
        Iterator r06 = r05.iterator();     // Catch: Exception -> L42
    L64:
        if (r06.hasNext() == false) goto L74;
        Object r34 = r06.next();     // Catch: Exception -> L42
        C1335dq r7 = (C1335dq) r34;     // Catch: Exception -> L42
        String r8 = r7.f4815g;     // Catch: Exception -> L42
        if (AbstractC0585Nj.m1134a(r8, AbstractC0295Gu.m625r(-811396631623733L)) == false) goto L69;
        boolean r72 = true;
    L72:
        if (r72 == false) goto L64;
        r129.add(r34);     // Catch: Exception -> L42
        goto L64
    L69:
        if (AbstractC0585Nj.m1134a(r8, AbstractC0295Gu.m625r(-811413811492917L)) == false) goto L71;
        r72 = r7.f4816h.contains(C1456gf.m2791I());     // Catch: Exception -> L42
        goto L72
    L71:
        r72 = false;
        goto L72
    L74:
        ArrayList r07 = new ArrayList();     // Catch: Exception -> L42
        Iterator r1210 = r129.iterator();     // Catch: Exception -> L42
    L76:
        if (r1210.hasNext() == false) goto L86;
        Object r35 = r1210.next();     // Catch: Exception -> L42
        C1335dq r73 = (C1335dq) r35;     // Catch: Exception -> L42
        if (r73.f4814f == false) goto L83;
        SharedPreferences r82 = AbstractC0599Nx.f1939a;     // Catch: Exception -> L42
        if (AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-811435286329397L) + r73.f4809a + AbstractC0295Gu.m625r(-810945660057653L), false) == false) goto L83;
        Object[] r74 = false;
    L84:
        if (r74 == false) goto L76;
        r07.add(r35);     // Catch: Exception -> L42
    L83:
        r74 = true;
        goto L84
    L86:
        if (r63 == null) goto L91;
        SharedPreferences r1211 = AbstractC0599Nx.f1939a;     // Catch: Exception -> L42
        if (AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-810975724828725L), false) == true) goto L91;
        C2112jq.m4303f(r4, r63, new C1389f(7, r07, r4));     // Catch: Exception -> L42
        return r1;
    L91:
        if (r07.isEmpty() == false) goto L93;
        return r1;
    L93:
        if (r07.isEmpty() == true) goto L125;
        r4.m4309l(r07, 0);     // Catch: Exception -> L42
        return r1;
    L125:
        return r1;
    L45:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-811065919141941L));
    L46:
        AbstractC0628Oj.m1232T(r12);
        C0594Ns r1212 = C0594Ns.f1925a;     // Catch: Exception -> L42
        this.f5023f = 1;     // Catch: Exception -> L42
        r1212.getClass();     // Catch: Exception -> L42
        r12 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400248002312245L), this);     // Catch: Exception -> L42
        if (r12 != r3) goto L50;
        return r3;
    L42:
        e = move-exception;
        e.printStackTrace();
        return r1;
    }
}
