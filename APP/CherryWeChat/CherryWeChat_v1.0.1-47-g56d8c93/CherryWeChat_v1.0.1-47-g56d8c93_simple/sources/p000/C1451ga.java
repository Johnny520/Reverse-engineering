package p000;

import android.app.Activity;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ga */
/* JADX INFO: loaded from: classes.dex */
public final class C1451ga extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5075e;

    /* JADX INFO: renamed from: f */
    public int f5076f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f5077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f5078h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1495ha f5079i;

    public C1451ga(int r2, Activity r3, String r4, C1495ha r5, InterfaceC0190Eb r6) {
        this.f5075e = 0;
        this.f5076f = r2;
        this.f5078h = r3;
        this.f5077g = r4;
        this.f5079i = r5;
        super(r6);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f5075e) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C1451ga r23 = (C1451ga) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L5:
        return ((C1451ga) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r10, Object r11) {
        switch(this.f5075e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Activity r0 = this.f5078h;
        C1495ha r1 = this.f5079i;
        return new C1451ga(this.f5077g, r0, r1, r10);
    L6:
        int r4 = this.f5076f;
        String r6 = this.f5077g;
        C1495ha r7 = this.f5079i;
        return new C1451ga(r4, this.f5078h, r6, r7, r10);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r17) {
        int r0 = this.f5075e;
        C0829TC r2 = C0829TC.f2620a;
        Activity r3 = this.f5078h;
        String r4 = this.f5077g;
        switch(r0) {
            case 0: goto L49;
            default: goto L4;
        };
    L4:
        int r02 = this.f5076f;
        int r6 = 2;
        InterfaceC0190Eb r8 = null;
        EnumC1453gc r9 = EnumC1453gc.f5148a;
        if (r02 == 0) goto L17;
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L12;
        if (r02 != 3) goto L11;
        AbstractC0628Oj.m1232T(r17);
        return r2;
    L11:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-88575110543413L));
    L12:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L13
        return r2;
    L15:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L13
        Object r03 = r17;
    L21:
        String r04 = (String) r03;     // Catch: Exception -> L13
        C0029Am r42 = AbstractC2809zm.f9524a;     // Catch: Exception -> L24
        r42.getClass();     // Catch: Exception -> L24
        Object r05 = r42.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), r04);     // Catch: Exception -> L24
    L27:
        ApiResponse r06 = (ApiResponse) r05;     // Catch: Exception -> L13
        if (r06 == null) goto L31;
        int r43 = r06.getCode();     // Catch: Exception -> L13
    L30:
        int r11 = r43;
        if (r06 == null) goto L41;
        String r44 = r06.getMessage();     // Catch: Exception -> L13
        if (r44 == null) goto L41;
        if (r44.length() != 0) goto L38;
        r44 = r06.getMsg();     // Catch: Exception -> L13
    L38:
        if (r44 == null) goto L41;
    L40:
        String r13 = r44;
        C1498hd r07 = AbstractC1499he.f5282a;     // Catch: Exception -> L13
        C2283nk r08 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L13
        C1451ga r10 = new C1451ga(r11, this.f5078h, r13, this.f5079i, null);     // Catch: Exception -> L13
        this.f5076f = 2;     // Catch: Exception -> L13
        if (AbstractC0585Nj.m1133N(r08, r10, this) == r9) goto L48;
        return r2;
    L48:
        return r9;
    L41:
        r44 = AbstractC0295Gu.m625r(-88553635706933L);     // Catch: Exception -> L13
        goto L40
    L31:
        r43 = -1;
        goto L30
    L24:
        e = move-exception;
        AbstractC0295Gu.m625r(-88970247534645L);     // Catch: Exception -> L13
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-88536455837749L);     // Catch: Exception -> L13
        e.getMessage();     // Catch: Exception -> L13
        r05 = null;
        goto L27
    L17:
        AbstractC0628Oj.m1232T(r17);
        C0594Ns r09 = C0594Ns.f1925a;     // Catch: Exception -> L13
        String r102 = C1456gf.m2791I();     // Catch: Exception -> L13
        this.f5076f = 1;     // Catch: Exception -> L13
        r09.getClass();     // Catch: Exception -> L13
        r03 = C0594Ns.m1164c(r4, r102);     // Catch: Exception -> L13
        if (r03 != r9) goto L21;
    L13:
        e = move-exception;
        e.printStackTrace();
        C1498hd r45 = AbstractC1499he.f5282a;
        C2283nk r46 = AbstractC1106Zp.f3500a;
        C0993X4 r5 = new C0993X4(r3, e, r8, r6);
        this.f5076f = 3;
        if (AbstractC0585Nj.m1133N(r46, r5, this) == r9) goto L48;
        return r2;
    L49:
        AbstractC0628Oj.m1232T(r17);
        if (this.f5076f != 0) goto L52;
        Toast.makeText(r3, AbstractC0295Gu.m625r(-88386131982389L), 1).show();
        C1036Y4 r010 = C1036Y4.f3308a;
        C2479s r47 = new C2479s(1, this.f5079i);
        C1407fa r62 = new C1407fa(r3, 0);
        r010.getClass();
        C1036Y4.m1982a(r3, r47, r62, true);
    L53:
        return r2;
    L52:
        Toast.makeText(r3, AbstractC0295Gu.m625r(-88420491720757L).concat(r4), 1).show();
        goto L53
    }

    public C1451ga(String r2, Activity r3, C1495ha r4, InterfaceC0190Eb r5) {
        this.f5075e = 1;
        this.f5077g = r2;
        this.f5078h = r3;
        this.f5079i = r4;
        super(r5);
    }
}
