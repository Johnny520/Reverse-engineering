package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0917yb {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f13386a;

    /* JADX INFO: renamed from: b */
    public int f13387b = 0;

    /* JADX INFO: renamed from: c */
    public final C0337j5 f13388c;

    public C0917yb(XmlResourceParser xmlResourceParser) {
        this.f13386a = xmlResourceParser;
        C0337j5 c0337j5 = new C0337j5();
        c0337j5.f4894b = new float[64];
        this.f13388c = c0337j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0133dk m6238a(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        C0133dk c0133dk;
        if (fd3.m1598a(this.f13386a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    c0133dk = C0133dk.m1032h(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    c0133dk = null;
                }
                if (c0133dk == null) {
                    c0133dk = new C0133dk(0, 3, null);
                }
            } else {
                c0133dk = new C0133dk(typedValue.data, 3, null);
            }
        }
        m6240c(typedArray.getChangingConfigurations());
        return c0133dk;
    }

    /* JADX INFO: renamed from: b */
    public final float m6239b(TypedArray typedArray, String str, int i, float f) {
        if (fd3.m1598a(this.f13386a, str)) {
            f = typedArray.getFloat(i, f);
        }
        m6240c(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX INFO: renamed from: c */
    public final void m6240c(int i) {
        this.f13387b = i | this.f13387b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0917yb)) {
            return false;
        }
        C0917yb c0917yb = (C0917yb) obj;
        return t11.m5086l(this.f13386a, c0917yb.f13386a) && this.f13387b == c0917yb.f13387b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13387b) + (this.f13386a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f13386a);
        sb.append(", config=");
        return vi0.m5694m(sb, this.f13387b, ')');
    }
}
