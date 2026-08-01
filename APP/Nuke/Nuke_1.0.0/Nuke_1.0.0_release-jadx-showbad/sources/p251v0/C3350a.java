package p251v0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import p013C0.C0236c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3350a(XmlResourceParser xmlResourceParser) {
        this.f10410a = xmlResourceParser;
        C1753n c1753n = new C1753n(26, false);
        c1753n.f6028e = new float[64];
        this.f10412c = c1753n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0236c m5600a(TypedArray typedArray, Resources.Theme theme, String str, int i5) {
        C0236c c0236c;
        if (AbstractC2596a.m4541a(this.f10410a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i5, typedValue);
            int i6 = typedValue.type;
            if (i6 < 28 || i6 > 31) {
                try {
                    c0236c = C0236c.m413d(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme);
                } catch (Exception e5) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
                    c0236c = null;
                }
                if (c0236c == null) {
                    c0236c = new C0236c(0, 4, null);
                }
            } else {
                c0236c = new C0236c(typedValue.data, 4, null);
            }
        }
        m5602c(typedArray.getChangingConfigurations());
        return c0236c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m5601b(TypedArray typedArray, String str, int i5, float f2) {
        if (AbstractC2596a.m4541a(this.f10410a, str)) {
            f2 = typedArray.getFloat(i5, f2);
        }
        m5602c(typedArray.getChangingConfigurations());
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5602c(int i5) {
        this.f10411b = i5 | this.f10411b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f10411b) + (this.f10410a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f10410a);
        sb.append(", config=");
        return AbstractC3202a.m5466a(sb, this.f10411b, ')');
    }
}
