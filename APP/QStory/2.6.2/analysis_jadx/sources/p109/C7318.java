package p109;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import kotlin.jvm.internal.AbstractC4394;
import org.xmlpull.v1.XmlPullParser;
import p161.AbstractC7641;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0113 f19517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19518 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final XmlPullParser f19519;

    public C7318(XmlResourceParser xmlResourceParser) {
        this.f19519 = xmlResourceParser;
        C0113 c0113 = new C0113(22, false);
        c0113.f357 = new float[64];
        this.f19517 = c0113;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7318)) {
            return false;
        }
        C7318 c7318 = (C7318) obj;
        return AbstractC4394.m8917(this.f19519, c7318.f19519) && this.f19518 == c7318.f19518;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19518) + (this.f19519.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f19519);
        sb.append(", config=");
        return AbstractC0053.m154(sb, this.f19518, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12483(int i) {
        this.f19518 = i | this.f19518;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m12484(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC7641.m12871(this.f19519, str)) {
            f = typedArray.getFloat(i, f);
        }
        m12483(typedArray.getChangingConfigurations());
        return f;
    }
}
