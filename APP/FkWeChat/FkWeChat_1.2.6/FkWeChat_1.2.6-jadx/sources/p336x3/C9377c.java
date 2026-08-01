package p336x3;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;
import p252r3.C6475f;
import p320w3.AbstractC9169b;

/* JADX INFO: renamed from: x3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9377c {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f31960a;

    /* JADX INFO: renamed from: x3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static List m36503a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* JADX INFO: renamed from: b */
        public static int m36504b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: c */
        public static int m36505c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: d */
        public static int m36506d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: e */
        public static int m36507e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: x3.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Insets m36508a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C9377c(DisplayCutout displayCutout) {
        this.f31960a = displayCutout;
    }

    /* JADX INFO: renamed from: g */
    public static C9377c m36496g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C9377c(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public List m36497a() {
        return Build.VERSION.SDK_INT >= 28 ? a.m36503a(this.f31960a) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: b */
    public int m36498b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m36504b(this.f31960a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m36499c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m36505c(this.f31960a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m36500d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m36506d(this.f31960a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m36501e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m36507e(this.f31960a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9377c.class != obj.getClass()) {
            return false;
        }
        return AbstractC9169b.m35610a(this.f31960a, ((C9377c) obj).f31960a);
    }

    /* JADX INFO: renamed from: f */
    public C6475f m36502f() {
        return Build.VERSION.SDK_INT >= 30 ? C6475f.m25654d(b.m36508a(this.f31960a)) : C6475f.f20346e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f31960a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f31960a + "}";
    }
}
