package Yue;

import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8391 extends AbstractC7988 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3454 = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3455 = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String[] f25020 = {f3454, f3455};

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m27981(@InterfaceC6490 C7995 c7995, int i) {
        int[] iArr;
        if (c7995 == null || (iArr = (int[]) c7995.f3177.get(f3455)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // Yue.AbstractC7988
    /* JADX INFO: renamed from: ۥ */
    public void mo3999(@InterfaceC6391 C7995 c7995) {
        View view = c7995.f3178;
        Integer numValueOf = (Integer) c7995.f3177.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        c7995.f3177.put(f3454, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        c7995.f3177.put(f3455, iArr);
    }

    @Override // Yue.AbstractC7988
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public String[] mo4000() {
        return f25020;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m27982(@InterfaceC6490 C7995 c7995) {
        Integer num;
        if (c7995 == null || (num = (Integer) c7995.f3177.get(f3454)) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m27983(@InterfaceC6490 C7995 c7995) {
        return m27981(c7995, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m27984(@InterfaceC6490 C7995 c7995) {
        return m27981(c7995, 1);
    }
}
