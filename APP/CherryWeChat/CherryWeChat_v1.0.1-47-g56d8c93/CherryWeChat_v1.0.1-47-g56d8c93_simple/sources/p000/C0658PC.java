package p000;

import android.app.Activity;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: PC */
/* JADX INFO: loaded from: classes.dex */
public final class C0658PC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2102e;

    /* JADX INFO: renamed from: f */
    public int f2103f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f2104g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0701QC f2105h;

    public C0658PC(int r2, C0701QC r3, String r4, InterfaceC0190Eb r5) {
        this.f2102e = 0;
        this.f2103f = r2;
        this.f2105h = r3;
        this.f2104g = r4;
        super(r5);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f2102e) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0658PC r23 = (C0658PC) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L5:
        return ((C0658PC) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r4, Object r5) {
        switch(this.f2102e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0658PC(this.f2104g, this.f2105h, r4);
    L7:
        return new C0658PC(this.f2103f, this.f2105h, this.f2104g, r4);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r10) {
        int r0 = this.f2102e;
        C0829TC r1 = C0829TC.f2620a;
        String r2 = this.f2104g;
        int r4 = 2;
        int r5 = 3;
        C0701QC r6 = this.f2105h;
        switch(r0) {
            case 0: goto L46;
            default: goto L4;
        };
    L4:
        int r02 = this.f2103f;
        InterfaceC0190Eb r7 = null;
        EnumC1453gc r8 = EnumC1453gc.f5148a;
        if (r02 == 0) goto L17;
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L12;
        if (r02 != 3) goto L11;
        AbstractC0628Oj.m1232T(r10);
        return r1;
    L11:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-483939735042101L));
    L12:
        AbstractC0628Oj.m1232T(r10);     // Catch: Exception -> L13
        return r1;
    L15:
        AbstractC0628Oj.m1232T(r10);     // Catch: Exception -> L13
    L21:
        String r102 = (String) r10;     // Catch: Exception -> L13
        C0029Am r03 = AbstractC2809zm.f9524a;     // Catch: Exception -> L24
        r03.getClass();     // Catch: Exception -> L24
        Object r103 = r03.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), r102);     // Catch: Exception -> L24
    L27:
        ApiResponse r104 = (ApiResponse) r103;     // Catch: Exception -> L13
        if (r104 == null) goto L30;
        int r04 = r104.getCode();     // Catch: Exception -> L13
    L31:
        if (r104 == null) goto L38;
        String r22 = r104.getMessage();     // Catch: Exception -> L13
        if (r22 == null) goto L38;
        if (r22.length() != 0) goto L37;
        r22 = r104.getMsg();     // Catch: Exception -> L13
    L37:
        if (r22 == null) goto L38;
    L39:
        C1498hd r105 = AbstractC1499he.f5282a;     // Catch: Exception -> L13
        C2283nk r106 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L13
        C0658PC r3 = new C0658PC(r04, r6, r22, null);     // Catch: Exception -> L13
        this.f2103f = 2;     // Catch: Exception -> L13
        if (AbstractC0585Nj.m1133N(r106, r3, this) == r8) goto L45;
        return r1;
    L45:
        return r8;
    L38:
        r22 = AbstractC0295Gu.m625r(-483918260205621L);     // Catch: Exception -> L13
        goto L39
    L30:
        r04 = -1;
        goto L31
    L24:
        e = move-exception;
        AbstractC0295Gu.m625r(-484334872033333L);     // Catch: Exception -> L13
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-483901080336437L);     // Catch: Exception -> L13
        e.getMessage();     // Catch: Exception -> L13
        r103 = null;
        goto L27
    L17:
        AbstractC0628Oj.m1232T(r10);
        C0594Ns r107 = C0594Ns.f1925a;     // Catch: Exception -> L13
        String r05 = C1456gf.m2791I();     // Catch: Exception -> L13
        this.f2103f = 1;     // Catch: Exception -> L13
        r107.getClass();     // Catch: Exception -> L13
        r10 = C0594Ns.m1164c(r2, r05);     // Catch: Exception -> L13
        if (r10 != r8) goto L21;
    L13:
        e = move-exception;
        C1498hd r06 = AbstractC1499he.f5282a;
        C2283nk r07 = AbstractC1106Zp.f3500a;
        C0993X4 r23 = new C0993X4(r6, e, r7, 6);
        this.f2103f = 3;
        if (AbstractC0585Nj.m1133N(r07, r23, this) == r8) goto L45;
        return r1;
    L46:
        AbstractC0628Oj.m1232T(r10);
        if (this.f2103f != 0) goto L49;
        Toast.makeText(r6.m1432f(), AbstractC0295Gu.m625r(-485949779736629L), 1).show();
        C1036Y4 r108 = C1036Y4.f3308a;
        Activity r08 = r6.m1432f();
        C0572NC r24 = new C0572NC(r6, r4);
        C0572NC r42 = new C0572NC(r6, r5);
        r108.getClass();
        C1036Y4.m1982a(r08, r24, r42, true);
    L50:
        return r1;
    L49:
        Toast.makeText(r6.m1432f(), AbstractC0295Gu.m625r(-485984139474997L).concat(r2), 1).show();
        goto L50
    }

    public C0658PC(String r2, C0701QC r3, InterfaceC0190Eb r4) {
        this.f2102e = 1;
        this.f2104g = r2;
        this.f2105h = r3;
        super(r4);
    }
}
