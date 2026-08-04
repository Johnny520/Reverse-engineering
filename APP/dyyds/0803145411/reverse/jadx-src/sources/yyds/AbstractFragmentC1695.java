package yyds;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛷᲈᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFragmentC1695 extends Fragment implements InterfaceC0192 {
    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo1032().mo1028(i);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC0342 abstractC0342Mo1032 = mo1032();
        AbstractC1143.f5238.removeCallbacksAndMessages(abstractC0342Mo1032.f1789);
        C0119 c0119 = abstractC0342Mo1032.f1792;
        if (c0119 != null) {
            ((C0805) c0119.f812).getClass();
            abstractC0342Mo1032.f1792 = null;
        }
        if (abstractC0342Mo1032.f1793) {
            return;
        }
        Activity activity = abstractC0342Mo1032.f1788.getActivity();
        if (AbstractC0879.m1968(activity)) {
            return;
        }
        AbstractC0492.m1346(activity);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        mo1032().mo1029(i);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        AbstractC0342 abstractC0342Mo1032 = mo1032();
        AbstractFragmentC1695 abstractFragmentC1695 = abstractC0342Mo1032.f1788;
        if (!abstractC0342Mo1032.f1790) {
            abstractFragmentC1695.m3446();
            return;
        }
        if (abstractC0342Mo1032.f1791) {
            return;
        }
        abstractC0342Mo1032.f1791 = true;
        Activity activity = abstractFragmentC1695.getActivity();
        if (AbstractC0879.m1968(activity)) {
            return;
        }
        Bundle arguments = abstractFragmentC1695.getArguments();
        int i = arguments == null ? 0 : arguments.getInt("request_code");
        if (i <= 0) {
            return;
        }
        Bundle arguments2 = abstractFragmentC1695.getArguments();
        ArrayList parcelableArrayList = arguments2 == null ? null : Build.VERSION.SDK_INT >= 33 ? arguments2.getParcelableArrayList("request_permissions", AbstractC0333.class) : arguments2.getParcelableArrayList("request_permissions");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return;
        }
        abstractC0342Mo1032.mo1030(activity, parcelableArrayList, i);
        C0119 c0119 = abstractC0342Mo1032.f1792;
        if (c0119 == null) {
            return;
        }
        ((C0805) c0119.f812).getClass();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3446() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract AbstractC0342 mo1032();
}
