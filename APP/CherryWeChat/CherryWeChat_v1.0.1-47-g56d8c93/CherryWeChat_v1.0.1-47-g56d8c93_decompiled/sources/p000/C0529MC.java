package p000;

import android.app.Activity;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: MC */
/* JADX INFO: loaded from: classes.dex */
public final class C0529MC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0701QC f1725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0529MC(C0701QC c0701qc, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f1724e = i;
        this.f1725f = c0701qc;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f1724e) {
            case 0:
                C0529MC c0529mc = (C0529MC) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c0529mc.mo448i(c0829tc);
                return c0829tc;
            case 1:
                C0529MC c0529mc2 = (C0529MC) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c0529mc2.mo448i(c0829tc2);
                return c0829tc2;
            default:
                C0529MC c0529mc3 = (C0529MC) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc3 = C0829TC.f2620a;
                c0529mc3.mo448i(c0829tc3);
                return c0829tc3;
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f1724e) {
            case 0:
                return new C0529MC(this.f1725f, interfaceC0190Eb, 0);
            case 1:
                return new C0529MC(this.f1725f, interfaceC0190Eb, 1);
            default:
                return new C0529MC(this.f1725f, interfaceC0190Eb, 2);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        String strM625r;
        Editable text;
        switch (this.f1724e) {
            case 0:
                AbstractC0628Oj.m1232T(obj);
                C0701QC c0701qc = this.f1725f;
                EditText editText = c0701qc.f2258e;
                if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-486095808624693L);
                }
                c0701qc.m1431e(strM625r);
                C0701QC.m1430a(c0701qc);
                break;
            case 1:
                AbstractC0628Oj.m1232T(obj);
                C0701QC c0701qc2 = this.f1725f;
                C1258ca c1258ca = c0701qc2.f2260g;
                if (c1258ca != null) {
                    c1258ca.notifyDataSetChanged();
                }
                C0701QC.m1430a(c0701qc2);
                break;
            default:
                C0701QC c0701qc3 = this.f1725f;
                AbstractC0628Oj.m1232T(obj);
                try {
                    C1036Y4 c1036y4 = C1036Y4.f3308a;
                    Activity activityM1432f = c0701qc3.m1432f();
                    C0572NC c0572nc = new C0572NC(c0701qc3, 0);
                    C0572NC c0572nc2 = new C0572NC(c0701qc3, 1);
                    c1036y4.getClass();
                    C1036Y4.m1982a(activityM1432f, c0572nc, c0572nc2, true);
                } catch (Exception e) {
                    C0987Wz c0987Wz = c0701qc3.f2255b;
                    if (c0987Wz != null) {
                        c0987Wz.setRefreshing(false);
                    }
                    Toast.makeText(c0701qc3.m1432f(), AbstractC0213Ey.m405c(-485322714511413L, new StringBuilder(), e), 0).show();
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
