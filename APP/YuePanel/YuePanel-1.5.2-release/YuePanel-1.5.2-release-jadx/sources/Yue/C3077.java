package Yue;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3077 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f63 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f4573 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f4574 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f4575 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f4576 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f4577 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f4578 = 6;

    /* JADX INFO: renamed from: ۥ */
    public final Object f64;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ */
    @InterfaceC7113(21)
    public static class C0041 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m159(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static AccessibilityWindowInfo m160(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m6245(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m6246(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m6247(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static AccessibilityWindowInfo m6248(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static AccessibilityNodeInfo m6249(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static int m6250(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static boolean m6251(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static boolean m6252(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static boolean m6253(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static AccessibilityWindowInfo m6254() {
            return AccessibilityWindowInfo.obtain();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static AccessibilityWindowInfo m6255(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C0042 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static AccessibilityNodeInfo m161(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m162(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C3078 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m163(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C3079 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static AccessibilityWindowInfo m164() {
            return new AccessibilityWindowInfo();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C3080 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m165(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m166(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C3055 m6256(Object obj, int i) {
            return C3055.m5951(((AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C3081 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static LocaleList m167(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static long m168(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3077() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f64 = C3079.m164();
        } else {
            this.f64 = null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static C3077 m6222() {
        return m6225(C0041.m6254());
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static C3077 m6223(@InterfaceC6490 C3077 c3077) {
        if (c3077 == null) {
            return null;
        }
        return m6225(C0041.m6255((AccessibilityWindowInfo) c3077.f64));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String m6224(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static C3077 m6225(Object obj) {
        if (obj != null) {
            return new C3077(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3077)) {
            return false;
        }
        C3077 c3077 = (C3077) obj;
        Object obj2 = this.f64;
        return obj2 == null ? c3077.f64 == null : obj2.equals(c3077.f64);
    }

    public int hashCode() {
        Object obj = this.f64;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        m158(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(m6229());
        sb.append(", type=");
        sb.append(m6224(m6238()));
        sb.append(", layer=");
        sb.append(m6230());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m6241());
        sb.append(", active=");
        sb.append(m6240());
        sb.append(", hasParent=");
        sb.append(m6232() != null);
        sb.append(", hasChildren=");
        sb.append(m6227() > 0);
        sb.append(", transitionTime=");
        sb.append(m6237());
        sb.append(", locales=");
        sb.append(m6231());
        sb.append(']');
        return sb.toString();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public C3055 m157() {
        return C3055.m5951(C0042.m161((AccessibilityWindowInfo) this.f64));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m158(@InterfaceC6391 Rect rect) {
        C0041.m159((AccessibilityWindowInfo) this.f64, rect);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C3077 m6226(int i) {
        return m6225(C0041.m160((AccessibilityWindowInfo) this.f64, i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m6227() {
        return C0041.m6245((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m6228() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C3080.m165((AccessibilityWindowInfo) this.f64);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m6229() {
        return C0041.m6246((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m6230() {
        return C0041.m6247((AccessibilityWindowInfo) this.f64);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C5782 m6231() {
        return Build.VERSION.SDK_INT >= 34 ? C5782.m17907(C3081.m167((AccessibilityWindowInfo) this.f64)) : C5782.m17905();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C3077 m6232() {
        return m6225(C0041.m6248((AccessibilityWindowInfo) this.f64));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m6233(@InterfaceC6391 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            C3080.m166((AccessibilityWindowInfo) this.f64, region);
            return;
        }
        Rect rect = new Rect();
        C0041.m159((AccessibilityWindowInfo) this.f64, rect);
        region.set(rect);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C3055 m6234() {
        return C3055.m5951(C0041.m6249((AccessibilityWindowInfo) this.f64));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C3055 m6235(int i) {
        return Build.VERSION.SDK_INT >= 33 ? C3080.m6256(this.f64, i) : m6234();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public CharSequence m6236() {
        return C0042.m162((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long m6237() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C3081.m168((AccessibilityWindowInfo) this.f64);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m6238() {
        return C0041.m6250((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m6239() {
        return C0041.m6251((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m6240() {
        return C0041.m6252((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m6241() {
        return C0041.m6253((AccessibilityWindowInfo) this.f64);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m6242() {
        return C3078.m163((AccessibilityWindowInfo) this.f64);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m6243() {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public AccessibilityWindowInfo m6244() {
        return (AccessibilityWindowInfo) this.f64;
    }

    public C3077(Object obj) {
        this.f64 = obj;
    }
}
