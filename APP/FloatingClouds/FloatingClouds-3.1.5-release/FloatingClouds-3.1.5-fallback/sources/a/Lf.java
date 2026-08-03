package a;

/* JADX INFO: loaded from: classes.dex */
public final class Lf {
    public static a.C0491z3 a(android.content.res.TypedArray r3, org.xmlpull.v1.XmlPullParser r4, android.content.res.Resources.Theme r5, java.lang.String r6, int r7) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r4 = r4.getAttributeValue(r0, r6)
            r6 = 0
            r0 = 0
            if (r4 == 0) goto L3d
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r3.getValue(r7, r4)
            int r1 = r4.type
            r2 = 28
            if (r1 < r2) goto L24
            r2 = 31
            if (r1 > r2) goto L24
            int r3 = r4.data
            a.z3 r4 = new a.z3
            r4.<init>(r6, r6, r3)
            return r4
        L24:
            android.content.res.Resources r4 = r3.getResources()
            int r3 = r3.getResourceId(r7, r0)
            a.z3 r3 = a.C0491z3.a(r4, r3, r5)     // Catch: java.lang.Exception -> L31
            goto L3a
        L31:
            r3 = move-exception
            java.lang.String r4 = "ComplexColorCompat"
            java.lang.String r5 = "Failed to inflate ComplexColor."
            android.util.Log.e(r4, r5, r3)
            r3 = r6
        L3a:
            if (r3 == 0) goto L3d
            return r3
        L3d:
            a.z3 r3 = new a.z3
            r3.<init>(r6, r6, r0)
            return r3
    }

    public static boolean b(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static android.content.res.TypedArray c(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }
}
