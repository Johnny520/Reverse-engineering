package p000;

import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: OC */
/* JADX INFO: loaded from: classes.dex */
public final class C0615OC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1974e;

    /* JADX INFO: renamed from: f */
    public C0701QC f1975f;

    /* JADX INFO: renamed from: g */
    public int f1976g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0701QC f1977h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0615OC(C0701QC c0701qc, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f1974e = i;
        this.f1977h = c0701qc;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f1974e) {
        }
        return ((C0615OC) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f1974e) {
            case 0:
                return new C0615OC(this.f1977h, interfaceC0190Eb, 0);
            default:
                return new C0615OC(this.f1977h, interfaceC0190Eb, 1);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        C0701QC c0701qc;
        String strM625r;
        Editable text;
        C0701QC c0701qc2;
        String strM625r2;
        Editable text2;
        int i = this.f1974e;
        C0829TC c0829tc = C0829TC.f2620a;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        C0701QC c0701qc3 = this.f1977h;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f1976g;
                if (i3 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0357IC c0357ic = C0357IC.f1218a;
                    this.f1975f = c0701qc3;
                    this.f1976g = 1;
                    c0357ic.getClass();
                    obj = C0357IC.m792d(true, this);
                    if (obj == enumC1453gc) {
                        return enumC1453gc;
                    }
                    c0701qc = c0701qc3;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-487066471233589L));
                    }
                    c0701qc = this.f1975f;
                    AbstractC0628Oj.m1232T(obj);
                }
                c0701qc.f2266m = (List) obj;
                EditText editText = c0701qc3.f2258e;
                if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-487062176266293L);
                }
                c0701qc3.m1431e(strM625r);
                C0701QC.m1430a(c0701qc3);
                C0987Wz c0987Wz = c0701qc3.f2255b;
                if (c0987Wz == null) {
                    return c0829tc;
                }
                c0987Wz.setRefreshing(false);
                return c0829tc;
            default:
                int i4 = this.f1976g;
                try {
                    if (i4 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0357IC c0357ic2 = C0357IC.f1218a;
                        this.f1975f = c0701qc3;
                        this.f1976g = 1;
                        c0357ic2.getClass();
                        C1498hd c1498hd = AbstractC1499he.f5282a;
                        obj = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0228FC(i2, null), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                        c0701qc2 = c0701qc3;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-485077901375541L));
                        }
                        c0701qc2 = this.f1975f;
                        AbstractC0628Oj.m1232T(obj);
                    }
                    c0701qc2.f2266m = (List) obj;
                    EditText editText2 = c0701qc3.f2258e;
                    if (editText2 == null || (text2 = editText2.getText()) == null || (strM625r2 = text2.toString()) == null) {
                        strM625r2 = AbstractC0295Gu.m625r(-485026361767989L);
                    }
                    c0701qc3.m1431e(strM625r2);
                    C0701QC.m1430a(c0701qc3);
                    C0987Wz c0987Wz2 = c0701qc3.f2255b;
                    if (c0987Wz2 == null) {
                        return c0829tc;
                    }
                    c0987Wz2.setRefreshing(false);
                    return c0829tc;
                } catch (Exception e) {
                    Toast.makeText(c0701qc3.m1432f(), AbstractC0213Ey.m405c(-485030656735285L, new StringBuilder(), e), 0).show();
                    C0987Wz c0987Wz3 = c0701qc3.f2255b;
                    if (c0987Wz3 == null) {
                        return c0829tc;
                    }
                    c0987Wz3.setRefreshing(false);
                    return c0829tc;
                }
        }
    }
}
