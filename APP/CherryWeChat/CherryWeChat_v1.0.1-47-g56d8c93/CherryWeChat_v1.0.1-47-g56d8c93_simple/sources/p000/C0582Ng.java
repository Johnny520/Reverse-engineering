package p000;

import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ng */
/* JADX INFO: loaded from: classes.dex */
public final class C0582Ng extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1879e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2414qe f1880f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0625Og f1881g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Exception f1882h;

    public /* synthetic */ C0582Ng(C2414qe r1, C0625Og r2, Exception r3, InterfaceC0190Eb r4, int r5) {
        this.f1879e = r5;
        this.f1880f = r1;
        this.f1881g = r2;
        this.f1882h = r3;
        super(r4);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f1879e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0582Ng r23 = (C0582Ng) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C0582Ng r24 = (C0582Ng) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        switch(this.f1879e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2414qe r1 = this.f1880f;
        C0625Og r2 = this.f1881g;
        return new C0582Ng(r1, r2, this.f1882h, r8, 1);
    L6:
        C2414qe r22 = this.f1880f;
        C0625Og r3 = this.f1881g;
        return new C0582Ng(r22, r3, this.f1882h, r8, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r4) {
        switch(this.f1879e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r4);
        this.f1880f.m4856a();
        Toast.makeText(this.f1881g.getContext(), AbstractC0295Gu.m625r(-100880191846453L) + this.f1882h.getMessage(), 0).show();
        return C0829TC.f2620a;
    L6:
        AbstractC0628Oj.m1232T(r4);
        this.f1880f.m4856a();
        Toast.makeText(this.f1881g.getContext(), AbstractC0295Gu.m625r(-100940321388597L) + this.f1882h.getMessage(), 0).show();
        return C0829TC.f2620a;
    }
}
