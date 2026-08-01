package p365z1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p237q3.AbstractC6242h;
import p237q3.C6238d;
import p350y1.C9522j;

/* JADX INFO: renamed from: z1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9830a {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f33185a;

    /* JADX INFO: renamed from: b */
    public int f33186b;

    /* JADX INFO: renamed from: c */
    public final C9522j f33187c;

    public C9830a(XmlPullParser xmlPullParser, int i10) {
        this.f33185a = xmlPullParser;
        this.f33186b = i10;
        this.f33187c = new C9522j();
    }

    /* JADX INFO: renamed from: a */
    public final int m38175a() {
        return this.f33186b;
    }

    /* JADX INFO: renamed from: b */
    public final float m38176b(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        m38187m(typedArray.getChangingConfigurations());
        return dimension;
    }

    /* JADX INFO: renamed from: c */
    public final float m38177c(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        m38187m(typedArray.getChangingConfigurations());
        return f11;
    }

    /* JADX INFO: renamed from: d */
    public final int m38178d(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        m38187m(typedArray.getChangingConfigurations());
        return i12;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38179e(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean zM24618a = AbstractC6242h.m24618a(typedArray, this.f33185a, str, i10, z10);
        m38187m(typedArray.getChangingConfigurations());
        return zM24618a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9830a)) {
            return false;
        }
        C9830a c9830a = (C9830a) obj;
        return AbstractC1061t.m3842c(this.f33185a, c9830a.f33185a) && this.f33186b == c9830a.f33186b;
    }

    /* JADX INFO: renamed from: f */
    public final ColorStateList m38180f(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList colorStateListM24620c = AbstractC6242h.m24620c(typedArray, this.f33185a, theme, str, i10);
        m38187m(typedArray.getChangingConfigurations());
        return colorStateListM24620c;
    }

    /* JADX INFO: renamed from: g */
    public final C6238d m38181g(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        C6238d c6238dM24622e = AbstractC6242h.m24622e(typedArray, this.f33185a, theme, str, i10, i11);
        m38187m(typedArray.getChangingConfigurations());
        return c6238dM24622e;
    }

    /* JADX INFO: renamed from: h */
    public final float m38182h(TypedArray typedArray, String str, int i10, float f10) {
        float fM24623f = AbstractC6242h.m24623f(typedArray, this.f33185a, str, i10, f10);
        m38187m(typedArray.getChangingConfigurations());
        return fM24623f;
    }

    public int hashCode() {
        return (this.f33185a.hashCode() * 31) + Integer.hashCode(this.f33186b);
    }

    /* JADX INFO: renamed from: i */
    public final int m38183i(TypedArray typedArray, String str, int i10, int i11) {
        int iM24624g = AbstractC6242h.m24624g(typedArray, this.f33185a, str, i10, i11);
        m38187m(typedArray.getChangingConfigurations());
        return iM24624g;
    }

    /* JADX INFO: renamed from: j */
    public final String m38184j(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        m38187m(typedArray.getChangingConfigurations());
        return string;
    }

    /* JADX INFO: renamed from: k */
    public final XmlPullParser m38185k() {
        return this.f33185a;
    }

    /* JADX INFO: renamed from: l */
    public final TypedArray m38186l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayM24626i = AbstractC6242h.m24626i(resources, theme, attributeSet, iArr);
        m38187m(typedArrayM24626i.getChangingConfigurations());
        return typedArrayM24626i;
    }

    /* JADX INFO: renamed from: m */
    public final void m38187m(int i10) {
        this.f33186b = i10 | this.f33186b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f33185a + ", config=" + this.f33186b + ')';
    }

    public /* synthetic */ C9830a(XmlPullParser xmlPullParser, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
