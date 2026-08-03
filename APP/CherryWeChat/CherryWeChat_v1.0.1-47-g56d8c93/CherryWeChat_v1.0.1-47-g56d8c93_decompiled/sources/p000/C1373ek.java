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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1373ek(C1505hk c1505hk, Exception exc, C0185EC c0185ec, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f4905e = i;
        this.f4906f = c1505hk;
        this.f4907g = exc;
        this.f4908h = c0185ec;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f4905e) {
            case 0:
                C1373ek c1373ek = (C1373ek) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c1373ek.mo448i(c0829tc);
                return c0829tc;
            default:
                C1373ek c1373ek2 = (C1373ek) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c1373ek2.mo448i(c0829tc2);
                return c0829tc2;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f4905e) {
            case 0:
                return new C1373ek(this.f4906f, this.f4907g, this.f4908h, interfaceC0190Eb, 0);
            default:
                return new C1373ek(this.f4906f, this.f4907g, this.f4908h, interfaceC0190Eb, 1);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f4905e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                C1505hk c1505hk = this.f4906f;
                Toast.makeText(c1505hk.getContext(), AbstractC0295Gu.m625r(-73924977096757L) + this.f4907g.getMessage(), 0).show();
                C1505hk.m2880a(c1505hk, this.f4908h);
                break;
            default:
                AbstractC0628Oj.m1232T(obj);
                C1505hk c1505hk2 = this.f4906f;
                Toast.makeText(c1505hk2.getContext(), AbstractC0295Gu.m625r(-74414603368501L) + this.f4907g.getMessage(), 0).show();
                C1505hk.m2880a(c1505hk2, this.f4908h);
                break;
        }
        return C0829TC.f2620a;
    }
}
