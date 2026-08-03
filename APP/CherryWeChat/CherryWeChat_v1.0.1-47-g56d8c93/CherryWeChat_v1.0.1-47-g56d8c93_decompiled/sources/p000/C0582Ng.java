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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0582Ng(C2414qe c2414qe, C0625Og c0625Og, Exception exc, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f1879e = i;
        this.f1880f = c2414qe;
        this.f1881g = c0625Og;
        this.f1882h = exc;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f1879e) {
            case 0:
                C0582Ng c0582Ng = (C0582Ng) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c0582Ng.mo448i(c0829tc);
                return c0829tc;
            default:
                C0582Ng c0582Ng2 = (C0582Ng) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c0582Ng2.mo448i(c0829tc2);
                return c0829tc2;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f1879e) {
            case 0:
                return new C0582Ng(this.f1880f, this.f1881g, this.f1882h, interfaceC0190Eb, 0);
            default:
                return new C0582Ng(this.f1880f, this.f1881g, this.f1882h, interfaceC0190Eb, 1);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f1879e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                this.f1880f.m4856a();
                Toast.makeText(this.f1881g.getContext(), AbstractC0295Gu.m625r(-100940321388597L) + this.f1882h.getMessage(), 0).show();
                break;
            default:
                AbstractC0628Oj.m1232T(obj);
                this.f1880f.m4856a();
                Toast.makeText(this.f1881g.getContext(), AbstractC0295Gu.m625r(-100880191846453L) + this.f1882h.getMessage(), 0).show();
                break;
        }
        return C0829TC.f2620a;
    }
}
