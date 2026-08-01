package p109;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import kotlin.jvm.internal.AbstractC4395;
import org.xmlpull.v1.XmlPullParser;
import p161.AbstractC7642;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0113 f19512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19513 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final XmlPullParser f19514;

    public C7319(XmlResourceParser xmlResourceParser) {
        this.f19514 = xmlResourceParser;
        C0113 c0113 = new C0113(22, false);
        c0113.f357 = new float[64];
        this.f19512 = c0113;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7319)) {
            return false;
        }
        C7319 c7319 = (C7319) obj;
        return AbstractC4395.m8907(this.f19514, c7319.f19514) && this.f19513 == c7319.f19513;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19513) + (this.f19514.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f19514);
        sb.append(", config=");
        return AbstractC0053.m156(sb, this.f19513, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12510(int i) {
        this.f19513 = i | this.f19513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m12511(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC7642.m12900(this.f19514, str)) {
            f = typedArray.getFloat(i, f);
        }
        m12510(typedArray.getChangingConfigurations());
        return f;
    }
}
