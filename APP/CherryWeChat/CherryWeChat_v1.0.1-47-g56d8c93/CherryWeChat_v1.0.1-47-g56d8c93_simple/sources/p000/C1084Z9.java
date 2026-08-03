package p000;

import android.view.View;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1084Z9 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3455e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f3456f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f3457g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3458h;

    public /* synthetic */ C1084Z9(C2414qe r1, View r2, String r3, InterfaceC0190Eb r4, int r5) {
        this.f3455e = r5;
        this.f3456f = r1;
        this.f3458h = r2;
        this.f3457g = r3;
        super(r4);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f3455e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C1084Z9 r23 = (C1084Z9) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C1084Z9 r24 = (C1084Z9) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    L8:
        C1084Z9 r25 = (C1084Z9) mo447h(r32, r22);
        C0829TC r35 = C0829TC.f2620a;
        r25.mo448i(r35);
        return r35;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r11, Object r12) {
        switch(this.f3455e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        C1505hk r0 = (C1505hk) this.f3456f;
        C0185EC r1 = (C0185EC) this.f3458h;
        return new C1084Z9(r0, this.f3457g, r1, r11);
    L7:
        return new C1084Z9((C2414qe) this.f3456f, (C0625Og) this.f3458h, this.f3457g, r11, 1);
    L9:
        return new C1084Z9((C2414qe) this.f3456f, (View) this.f3458h, this.f3457g, r11, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r5) {
        switch(this.f3455e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r5);
        C1505hk r52 = (C1505hk) this.f3456f;
        Toast.makeText(r52.getContext(), AbstractC0295Gu.m625r(-74710956111925L) + this.f3457g, 0).show();
        C1505hk.m2880a(r52, (C0185EC) this.f3458h);
        return C0829TC.f2620a;
    L6:
        AbstractC0628Oj.m1232T(r5);
        ((C2414qe) this.f3456f).m4856a();
        Toast.makeText(((C0625Og) this.f3458h).getContext(), AbstractC0295Gu.m625r(-100626788775989L) + this.f3457g, 0).show();
        return C0829TC.f2620a;
    L8:
        AbstractC0628Oj.m1232T(r5);
        ((C2414qe) this.f3456f).m4856a();
        Toast.makeText(((View) this.f3458h).getContext(), AbstractC0295Gu.m625r(-105149389338677L) + this.f3457g, 0).show();
        return C0829TC.f2620a;
    }

    public C1084Z9(C1505hk r2, String r3, C0185EC r4, InterfaceC0190Eb r5) {
        this.f3455e = 2;
        this.f3456f = r2;
        this.f3457g = r3;
        this.f3458h = r4;
        super(r5);
    }
}
