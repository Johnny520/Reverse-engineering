package yyds;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᛸᛸᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1852 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2693 m3615(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2693 c2693M4783 = C2693.m4783(null, rootWindowInsets);
        C2610 c2610 = c2693M4783.f13242;
        c2610.mo4552(c2693M4783);
        View rootView = view.getRootView();
        c2610.mo4430(rootView);
        c2610.mo2802(rootView);
        c2610.mo1063();
        return c2693M4783;
    }
}
