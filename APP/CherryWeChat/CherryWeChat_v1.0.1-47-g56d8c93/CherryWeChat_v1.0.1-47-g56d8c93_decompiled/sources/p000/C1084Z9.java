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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1084Z9(C2414qe c2414qe, View view, String str, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f3455e = i;
        this.f3456f = c2414qe;
        this.f3458h = view;
        this.f3457g = str;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f3455e) {
            case 0:
                C1084Z9 c1084z9 = (C1084Z9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c1084z9.mo448i(c0829tc);
                return c0829tc;
            case 1:
                C1084Z9 c1084z92 = (C1084Z9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c1084z92.mo448i(c0829tc2);
                return c0829tc2;
            default:
                C1084Z9 c1084z93 = (C1084Z9) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc3 = C0829TC.f2620a;
                c1084z93.mo448i(c0829tc3);
                return c0829tc3;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f3455e) {
            case 0:
                return new C1084Z9((C2414qe) this.f3456f, (View) this.f3458h, this.f3457g, interfaceC0190Eb, 0);
            case 1:
                return new C1084Z9((C2414qe) this.f3456f, (C0625Og) this.f3458h, this.f3457g, interfaceC0190Eb, 1);
            default:
                return new C1084Z9((C1505hk) this.f3456f, this.f3457g, (C0185EC) this.f3458h, interfaceC0190Eb);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f3455e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                ((C2414qe) this.f3456f).m4856a();
                Toast.makeText(((View) this.f3458h).getContext(), AbstractC0295Gu.m625r(-105149389338677L) + this.f3457g, 0).show();
                break;
            case 1:
                AbstractC0628Oj.m1232T(obj);
                ((C2414qe) this.f3456f).m4856a();
                Toast.makeText(((C0625Og) this.f3458h).getContext(), AbstractC0295Gu.m625r(-100626788775989L) + this.f3457g, 0).show();
                break;
            default:
                AbstractC0628Oj.m1232T(obj);
                C1505hk c1505hk = (C1505hk) this.f3456f;
                Toast.makeText(c1505hk.getContext(), AbstractC0295Gu.m625r(-74710956111925L) + this.f3457g, 0).show();
                C1505hk.m2880a(c1505hk, (C0185EC) this.f3458h);
                break;
        }
        return C0829TC.f2620a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084Z9(C1505hk c1505hk, String str, C0185EC c0185ec, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f3455e = 2;
        this.f3456f = c1505hk;
        this.f3457g = str;
        this.f3458h = c0185ec;
    }
}
