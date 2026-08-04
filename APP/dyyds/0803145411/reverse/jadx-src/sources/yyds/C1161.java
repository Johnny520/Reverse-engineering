package yyds;

import android.widget.TextView;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛵᛸᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1161 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5349;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ TextView f5350;

    public /* synthetic */ C1161(TextView textView, int i) {
        this.f5349 = i;
        this.f5350 = textView;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        int i = this.f5349;
        C2746 c2746 = C2746.f13459;
        TextView textView = this.f5350;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                C1509.f7142.getClass();
                C1509.f7193.m1581(C1509.f7179[78], Float.valueOf(iIntValue));
                textView.setText(String.valueOf(iIntValue));
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                C1509.f7142.getClass();
                C1509.f7298.m1581(C1509.f7179[76], Float.valueOf(iIntValue2));
                textView.setText(String.valueOf(iIntValue2));
                break;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                C1509.f7142.getClass();
                C1509.f7255.m1581(C1509.f7179[75], Float.valueOf(iIntValue3));
                textView.setText(String.valueOf(iIntValue3));
                break;
            default:
                AbstractC2328.m4341(-1085131650138990L);
                C1509 c1509 = C1509.f7142;
                Set setM3273 = AbstractC1595.m3273((Set) obj);
                c1509.getClass();
                AbstractC2328.m4341(-26671319778158L);
                C1509.f7199.m1581(C1509.f7179[79], setM3273);
                C1807.m3582(textView);
                AbstractC1960.m3789(AbstractC2328.m4341(-1085166009877358L));
                break;
        }
        return c2746;
    }
}
