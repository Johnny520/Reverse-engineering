package p000;

import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ek */
/* JADX INFO: loaded from: classes.dex */
public final class C1373ek extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f4905e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1505hk f4906f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Exception f4907g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0185EC f4908h;

    public /* synthetic */ C1373ek(C1505hk r1, Exception r2, C0185EC r3, InterfaceC0190Eb r4, int r5) {
        this.f4905e = r5;
        this.f4906f = r1;
        this.f4907g = r2;
        this.f4908h = r3;
        super(r4);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f4905e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C1373ek r23 = (C1373ek) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C1373ek r24 = (C1373ek) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        switch(this.f4905e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C1505hk r1 = this.f4906f;
        Exception r2 = this.f4907g;
        return new C1373ek(r1, r2, this.f4908h, r8, 1);
    L6:
        C1505hk r22 = this.f4906f;
        Exception r3 = this.f4907g;
        return new C1373ek(r22, r3, this.f4908h, r8, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r5) {
        switch(this.f4905e) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0628Oj.m1232T(r5);
        C1505hk r52 = this.f4906f;
        Toast.makeText(r52.getContext(), AbstractC0295Gu.m625r(-74414603368501L) + this.f4907g.getMessage(), 0).show();
        C1505hk.m2880a(r52, this.f4908h);
        return C0829TC.f2620a;
    L6:
        AbstractC0628Oj.m1232T(r5);
        C1505hk r53 = this.f4906f;
        Toast.makeText(r53.getContext(), AbstractC0295Gu.m625r(-73924977096757L) + this.f4907g.getMessage(), 0).show();
        C1505hk.m2880a(r53, this.f4908h);
        return C0829TC.f2620a;
    }
}
