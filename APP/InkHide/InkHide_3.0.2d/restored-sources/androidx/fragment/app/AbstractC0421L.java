package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: androidx.fragment.app.L */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0421L {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m813a(View view, int i2) {
        int iM816d = m816d(i2);
        if (iM816d == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0448z.m856E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM816d == 1) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iM816d == 2) {
            if (C0448z.m856E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM816d != 3) {
            return;
        }
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m814b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC0174d.m351g(i2, "Unknown visibility "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m815c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m814b(view.getVisibility());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m816d(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? ("null") : ("REMOVING")) : ("ADDING")) : ("NONE") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m817e(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r1v0 int) != (1 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (2 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (3 int)) ? (wrap:java.lang.String:?: TERNARY null = ((r1v0 int) != (4 int)) ? ("null") : ("INVISIBLE")) : ("GONE")) : ("VISIBLE")) : ("REMOVED") */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m818f(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
