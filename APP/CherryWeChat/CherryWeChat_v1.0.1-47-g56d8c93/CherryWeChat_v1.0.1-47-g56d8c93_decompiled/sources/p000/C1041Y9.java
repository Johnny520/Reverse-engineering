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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1041Y9(C2414qe c2414qe, View view, Exception exc, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f3320e = i;
        this.f3321f = c2414qe;
        this.f3322g = view;
        this.f3323h = exc;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f3320e) {
            case 0:
                C1041Y9 c1041y9 = (C1041Y9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c1041y9.mo448i(c0829tc);
                return c0829tc;
            default:
                C1041Y9 c1041y92 = (C1041Y9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c1041y92.mo448i(c0829tc2);
                return c0829tc2;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f3320e) {
            case 0:
                return new C1041Y9(this.f3321f, this.f3322g, this.f3323h, interfaceC0190Eb, 0);
            default:
                return new C1041Y9(this.f3321f, this.f3322g, this.f3323h, interfaceC0190Eb, 1);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f3320e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                this.f3321f.m4856a();
                Context context = this.f3322g.getContext();
                String strM625r = AbstractC0295Gu.m625r(-105441447114805L);
                String message = this.f3323h.getMessage();
                if (message == null) {
                    message = AbstractC0295Gu.m625r(-105471511885877L);
                }
                Toast.makeText(context, strM625r.concat(message), 0).show();
                break;
            default:
                AbstractC0628Oj.m1232T(obj);
                this.f3321f.m4856a();
                Toast.makeText(this.f3322g.getContext(), AbstractC0295Gu.m625r(-103439992354869L) + this.f3323h.getMessage(), 0).show();
                break;
        }
        return C0829TC.f2620a;
    }
}
