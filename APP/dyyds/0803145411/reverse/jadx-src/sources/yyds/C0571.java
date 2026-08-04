package yyds;

import android.view.View;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛳᛴᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0571 implements InterfaceC0251, InterfaceC2208, InterfaceC0413 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f2754;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2755;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f2756;

    public /* synthetic */ C0571(Object obj, int i, Object obj2) {
        this.f2755 = i;
        this.f2756 = obj;
        this.f2754 = obj2;
    }

    @Override // yyds.InterfaceC0251
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo901(AbstractC0041 abstractC0041) {
        int i = this.f2755;
        Object obj = this.f2754;
        Object obj2 = this.f2756;
        switch (i) {
            case 0:
                C0947 c0947 = (C0947) obj2;
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) obj;
                boolean z = ((C0763) abstractC0041).f3521 == 2;
                if (z) {
                    int i2 = c0947.f4410;
                    ArrayList arrayListM3377 = AbstractC1658.m3377();
                    arrayListM3377.remove(Integer.valueOf(i2));
                    arrayListM3377.add(0, Integer.valueOf(i2));
                    if (arrayListM3377.size() > 8) {
                        arrayListM3377.subList(8, arrayListM3377.size()).clear();
                    }
                    AbstractC0027.m3912().putString(AbstractC2328.m4341(-145646208844654L), AbstractC1595.m3285(arrayListM3377, AbstractC2328.m4341(-145732108190574L), null, null, null, 62));
                }
                interfaceC1549.mo371(z ? Integer.valueOf(c0947.f4410) : null);
                break;
            case 1:
                C2713 c2713 = (C2713) obj;
                if (((AtomicBoolean) obj2).compareAndSet(true, false)) {
                    C0561 c0561 = C0561.f2672;
                    AbstractC2328.m4341(-544468282016622L);
                    C0561.f2669.remove(c2713);
                }
                break;
            default:
                C1524 c1524 = (C1524) obj;
                if (((AtomicBoolean) obj2).compareAndSet(true, false)) {
                    C1082 c1082 = C1082.f4981;
                    AbstractC2328.m4341(-561940208976750L);
                    C1082.f4985.remove(c1524);
                }
                break;
        }
    }

    @Override // yyds.InterfaceC0413
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo1173(int i, Object obj) {
        TextView textView = (TextView) this.f2756;
        String[] strArr = (String[]) this.f2754;
        C1509 c1509 = C1509.f7142;
        c1509.getClass();
        C1509.f7113.m1581(C1509.f7179[189], Integer.valueOf(i));
        c1509.getClass();
        int iM3060 = C1509.m3060();
        textView.setText((iM3060 < 0 || iM3060 >= strArr.length) ? strArr[0] : strArr[iM3060]);
        AbstractC1960.m3789(AbstractC2328.m4341(-139577420055406L));
    }

    @Override // yyds.InterfaceC2208
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2693 mo1441(View view, C2693 c2693) {
        C2173 c2173 = (C2173) this.f2756;
        C2542 c2542 = (C2542) this.f2754;
        if (c2173.f10650) {
            return c2693;
        }
        c2173.m4141(c2693, new C2542(c2542));
        return c2693;
    }
}
