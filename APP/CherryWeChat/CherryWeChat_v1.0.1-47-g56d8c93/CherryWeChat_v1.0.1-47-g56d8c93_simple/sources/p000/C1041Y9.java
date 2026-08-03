package p000;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1041Y9 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3320e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2414qe f3321f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f3322g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Exception f3323h;

    public /* synthetic */ C1041Y9(C2414qe r1, View r2, Exception r3, InterfaceC0190Eb r4, int r5) {
        this.f3320e = r5;
        this.f3321f = r1;
        this.f3322g = r2;
        this.f3323h = r3;
        super(r4);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f3320e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C1041Y9 r23 = (C1041Y9) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C1041Y9 r24 = (C1041Y9) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        switch(this.f3320e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C2414qe r1 = this.f3321f;
        View r2 = this.f3322g;
        return new C1041Y9(r1, r2, this.f3323h, r8, 1);
    L6:
        C2414qe r22 = this.f3321f;
        View r3 = this.f3322g;
        return new C1041Y9(r22, r3, this.f3323h, r8, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r4) {
        switch(this.f3320e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r4);
        this.f3321f.m4856a();
        Toast.makeText(this.f3322g.getContext(), AbstractC0295Gu.m625r(-103439992354869L) + this.f3323h.getMessage(), 0).show();
        return C0829TC.f2620a;
    L6:
        AbstractC0628Oj.m1232T(r4);
        this.f3321f.m4856a();
        Context r42 = this.f3322g.getContext();
        String r0 = AbstractC0295Gu.m625r(-105441447114805L);
        String r1 = this.f3323h.getMessage();
        if (r1 != null) goto L9;
        r1 = AbstractC0295Gu.m625r(-105471511885877L);
    L9:
        Toast.makeText(r42, r0.concat(r1), 0).show();
        return C0829TC.f2620a;
    }
}
