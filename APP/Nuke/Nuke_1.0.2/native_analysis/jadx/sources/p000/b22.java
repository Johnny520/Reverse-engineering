package p000;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b22 extends w51 implements on0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewStructure f538i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b22(ViewStructure viewStructure) {
        super(4);
        this.f538i = viewStructure;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f538i.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return a83.f116a;
    }
}
