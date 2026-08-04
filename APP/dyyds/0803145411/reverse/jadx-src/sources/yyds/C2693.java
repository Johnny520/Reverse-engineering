package yyds;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲈᛶᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2693 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2693 f13241;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2610 f13242;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f13241 = C1384.f6444;
        } else {
            f13241 = C2389.f11794;
        }
    }

    public C2693(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f13242 = new C0366(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f13242 = new C1384(this, windowInsets);
        } else if (i >= 31) {
            this.f13242 = new C0785(this, windowInsets);
        } else {
            this.f13242 = new C2389(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C2693 m4783(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C2693 c2693 = new C2693(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            C2693 c2693M3615 = AbstractC1852.m3615(view);
            C2610 c2610 = c2693.f13242;
            c2610.mo4552(c2693M3615);
            View rootView = view.getRootView();
            c2610.mo4430(rootView);
            c2610.mo2802(rootView);
            c2610.mo1063();
            c2610.mo4545(view.getWindowSystemUiVisibility());
        }
        return c2693;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2693) {
            return Objects.equals(this.f13242, ((C2693) obj).f13242);
        }
        return false;
    }

    public final int hashCode() {
        C2610 c2610 = this.f13242;
        if (c2610 == null) {
            return 0;
        }
        return c2610.hashCode();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WindowInsets m4784() {
        C2610 c2610 = this.f13242;
        if (c2610 instanceof AbstractC2502) {
            return ((AbstractC2502) c2610).f12318;
        }
        return null;
    }

    public C2693() {
        this.f13242 = new C2610(this);
    }
}
