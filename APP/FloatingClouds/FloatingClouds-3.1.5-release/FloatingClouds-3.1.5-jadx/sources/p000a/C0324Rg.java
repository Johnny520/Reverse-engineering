package p000a;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.Rg */
/* JADX INFO: loaded from: classes.dex */
public final class C0324Rg {

    /* JADX INFO: renamed from: a.Rg$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f1157a;

        /* JADX INFO: renamed from: b */
        public int f1158b;

        /* JADX INFO: renamed from: c */
        public int f1159c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m895a(View view) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m896b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
