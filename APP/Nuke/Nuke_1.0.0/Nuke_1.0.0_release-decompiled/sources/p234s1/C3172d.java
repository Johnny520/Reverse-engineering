package p234s1;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: s1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3172d {

    /* JADX INFO: renamed from: c */
    public static final C3172d f9921c;

    /* JADX INFO: renamed from: d */
    public static final C3172d f9922d;

    /* JADX INFO: renamed from: e */
    public static final C3172d f9923e;

    /* JADX INFO: renamed from: f */
    public static final C3172d f9924f;

    /* JADX INFO: renamed from: g */
    public static final C3172d f9925g;

    /* JADX INFO: renamed from: h */
    public static final C3172d f9926h;

    /* JADX INFO: renamed from: i */
    public static final C3172d f9927i;

    /* JADX INFO: renamed from: j */
    public static final C3172d f9928j;

    /* JADX INFO: renamed from: a */
    public final Object f9929a;

    /* JADX INFO: renamed from: b */
    public final int f9930b;

    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    static {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p234s1.C3172d.<clinit>():void");
    }

    public C3172d(String str, int i5) {
        this(null, i5, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3172d)) {
            return false;
        }
        Object obj2 = ((C3172d) obj).f9929a;
        Object obj3 = this.f9929a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f9929a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM5447c = C3175g.m5447c(this.f9930b);
        if (strM5447c.equals("ACTION_UNKNOWN")) {
            Object obj = this.f9929a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM5447c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM5447c);
        return sb.toString();
    }

    public C3172d(Object obj, int i5, CharSequence charSequence, Class cls) {
        this.f9930b = i5;
        if (obj == null) {
            this.f9929a = new AccessibilityNodeInfo.AccessibilityAction(i5, charSequence);
        } else {
            this.f9929a = obj;
        }
    }
}
