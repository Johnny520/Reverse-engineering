package yyds;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛶᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1341 extends AbstractC0342 {
    @Override // yyds.AbstractC0342
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1029(int i) {
        Bundle arguments = this.f1788.getArguments();
        if (i != (arguments == null ? 0 : arguments.getInt("request_code"))) {
            return;
        }
        ArrayList arrayList = AbstractC1885.f9520;
        synchronized (AbstractC1885.class) {
            AbstractC1885.f9520.remove(Integer.valueOf(i));
        }
        m1027();
    }

    @Override // yyds.AbstractC0342
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1030(Activity activity, ArrayList arrayList, int i) {
        String[] strArr;
        if (arrayList.isEmpty()) {
            strArr = new String[0];
        } else {
            strArr = new String[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                strArr[i2] = ((AbstractC0333) arrayList.get(i2)).mo1021();
            }
        }
        AbstractFragmentC1695 abstractFragmentC1695 = this.f1788;
        try {
            abstractFragmentC1695.requestPermissions(strArr, i);
        } catch (Exception e) {
            e.printStackTrace();
            Activity activity2 = abstractFragmentC1695.getActivity();
            if (!(activity2 instanceof FragmentActivity) && !AbstractC0879.m1968(activity2)) {
                try {
                    activity2.requestPermissions(strArr, i);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        AbstractC0374.m1075(arrayList);
    }
}
