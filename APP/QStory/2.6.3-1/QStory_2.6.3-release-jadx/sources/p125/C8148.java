package p125;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0960;
import kotlin.jvm.internal.AbstractC5227;
import org.xmlpull.v1.XmlPullParser;
import p177.AbstractC8471;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8148 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0960 f19857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19858 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final XmlPullParser f19859;

    public C8148(XmlResourceParser xmlResourceParser) {
        this.f19859 = xmlResourceParser;
        C0960 c0960 = new C0960(22, false);
        c0960.f702 = new float[64];
        this.f19857 = c0960;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8148)) {
            return false;
        }
        C8148 c8148 = (C8148) obj;
        return AbstractC5227.m9466(this.f19859, c8148.f19859) && this.f19858 == c8148.f19858;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19858) + (this.f19859.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f19859);
        sb.append(", config=");
        return AbstractC0900.m716(sb, this.f19858, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13069(int i) {
        this.f19858 = i | this.f19858;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m13070(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC8471.m13459(this.f19859, str)) {
            f = typedArray.getFloat(i, f);
        }
        m13069(typedArray.getChangingConfigurations());
        return f;
    }
}
