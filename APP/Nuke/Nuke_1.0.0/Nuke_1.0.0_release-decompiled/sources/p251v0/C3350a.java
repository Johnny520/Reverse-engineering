package p251v0;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p199m1.AbstractC2596a;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3350a {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f10410a;

    /* JADX INFO: renamed from: b */
    public int f10411b = 0;

    /* JADX INFO: renamed from: c */
    public final C1753n f10412c;

    public C3350a(XmlResourceParser xmlResourceParser) {
        this.f10410a = xmlResourceParser;
        C1753n c1753n = new C1753n(26, false);
        c1753n.f6028e = new float[64];
        this.f10412c = c1753n;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p013C0.C0236c m5600a(android.content.res.TypedArray r5, android.content.res.Resources.Theme r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            org.xmlpull.v1.XmlPullParser r0 = r4.f10410a
            boolean r7 = p199m1.AbstractC2596a.m4541a(r0, r7)
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L3f
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r5.getValue(r8, r7)
            int r2 = r7.type
            r3 = 28
            if (r2 < r3) goto L25
            r3 = 31
            if (r2 > r3) goto L25
            int r6 = r7.data
            C0.c r7 = new C0.c
            r8 = 4
            r7.<init>(r6, r8, r0)
            goto L45
        L25:
            android.content.res.Resources r7 = r5.getResources()
            int r8 = r5.getResourceId(r8, r1)
            C0.c r6 = p013C0.C0236c.m413d(r7, r8, r6)     // Catch: java.lang.Exception -> L33
            r7 = r6
            goto L3c
        L33:
            r6 = move-exception
            java.lang.String r7 = "ComplexColorCompat"
            java.lang.String r8 = "Failed to inflate ComplexColor."
            android.util.Log.e(r7, r8, r6)
            r7 = r0
        L3c:
            if (r7 == 0) goto L3f
            goto L45
        L3f:
            C0.c r7 = new C0.c
            r6 = 4
            r7.<init>(r1, r6, r0)
        L45:
            int r5 = r5.getChangingConfigurations()
            r4.m5602c(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p251v0.C3350a.m5600a(android.content.res.TypedArray, android.content.res.Resources$Theme, java.lang.String, int):C0.c");
    }

    /* JADX INFO: renamed from: b */
    public final float m5601b(TypedArray typedArray, String str, int i5, float f2) {
        if (AbstractC2596a.m4541a(this.f10410a, str)) {
            f2 = typedArray.getFloat(i5, f2);
        }
        m5602c(typedArray.getChangingConfigurations());
        return f2;
    }

    /* JADX INFO: renamed from: c */
    public final void m5602c(int i5) {
        this.f10411b = i5 | this.f10411b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3350a)) {
            return false;
        }
        C3350a c3350a = (C3350a) obj;
        return AbstractC1665j.m2981a(this.f10410a, c3350a.f10410a) && this.f10411b == c3350a.f10411b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10411b) + (this.f10410a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f10410a);
        sb.append(", config=");
        return AbstractC3202a.m5466a(sb, this.f10411b, ')');
    }
}
