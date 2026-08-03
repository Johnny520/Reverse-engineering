package p000;

import android.content.SharedPreferences;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2479s implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8713b;

    public /* synthetic */ C2479s(int r1, Object r2) {
        this.f8712a = r1;
        this.f8713b = r2;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r7) {
        int r0 = this.f8712a;
        C0829TC r2 = C0829TC.f2620a;
        Object r3 = this.f8713b;
        switch(r0) {
            case 0: goto L27;
            case 1: goto L24;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L16;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-576900007196725L);
        ((C1494hG) r7).f5263a.m4864C(r3);
        return r2;
    L6:
        boolean r72 = ((Boolean) r7).booleanValue();
        SharedPreferences r02 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(((C1128aA) r3).getKey(), r72);
        return r2;
    L8:
        C0212Ex r32 = (C0212Ex) r3;
        int r73 = ((Integer) r7).intValue();
        return r32.f622e[r73] + ": " + r32.f623f[r73].mo203b();
    L10:
        LinearLayout r33 = (LinearLayout) r3;
        boolean r74 = ((Boolean) r7).booleanValue();
        SharedPreferences r03 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-743029340213L), r74);
        if (r74 == false) goto L13;
        int r75 = 0;
    L14:
        r33.setVisibility(r75);
        return r2;
    L13:
        r75 = 8;
        goto L14
    L16:
        C0809St r34 = (C0809St) r3;
        int r76 = ((Integer) r7).intValue();
        return r34.f2557e[r76] + ": " + r34.mo210j(r76).mo203b();
    L18:
        int r77 = ((Integer) r7).intValue();
        C1498hd r04 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l((C1505hk) r3, r77, null, 4), 3);
        return r2;
    L20:
        Boolean r78 = (Boolean) r7;
        r78.booleanValue();
        InterfaceC1416fj r05 = ((C2629ve) r3).f9136o;
        if (r05 == null) goto L23;
        r05.mo90g(r78);
    L23:
        return r2;
    L24:
        C0183EA.f539a.getClass();
        C0183EA.m382j((String) r7);
        ((C1495ha) r3).m2861g();
        return r2;
    L27:
        if (r7 != ((AbstractC0000A) r3)) goto L30;
        return "(this Collection)";
    L30:
        return String.valueOf(r7);
    }
}
