package p365z1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p237q3.AbstractC6242h;
import p237q3.C6238d;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7083h1;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.AbstractC7138s1;
import p265s1.AbstractC7154v2;
import p265s1.AbstractC7168z0;
import p265s1.C7100k3;
import p265s1.C7128q1;
import p350y1.AbstractC9527o;
import p350y1.C9516d;
import p350y1.C9522j;
import p376zd.C9987e;

/* JADX INFO: renamed from: z1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9832c {

    /* JADX INFO: renamed from: a */
    public static final int f33226a = 0;

    /* JADX INFO: renamed from: a */
    public static final C9516d.a m38223a(C9830a c9830a, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jM28147h;
        int iM28333z;
        ColorStateList colorStateListM38180f;
        C9831b c9831b = C9831b.f33200a;
        TypedArray typedArrayM38186l = c9830a.m38186l(resources, theme, attributeSet, c9831b.m38193F());
        boolean zM38179e = c9830a.m38179e(typedArrayM38186l, "autoMirrored", c9831b.m38197a(), false);
        float fM38182h = c9830a.m38182h(typedArrayM38186l, "viewportWidth", c9831b.m38195H(), 0.0f);
        float fM38182h2 = c9830a.m38182h(typedArrayM38186l, "viewportHeight", c9831b.m38194G(), 0.0f);
        if (fM38182h <= 0.0f) {
            throw new XmlPullParserException(typedArrayM38186l.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fM38182h2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM38186l.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fM38176b = c9830a.m38176b(typedArrayM38186l, c9831b.m38196I(), 0.0f);
        float fM38176b2 = c9830a.m38176b(typedArrayM38186l, c9831b.m38210n(), 0.0f);
        if (typedArrayM38186l.hasValue(c9831b.m38191D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayM38186l.getValue(c9831b.m38191D(), typedValue);
            jM28147h = (typedValue.type == 2 || (colorStateListM38180f = c9830a.m38180f(typedArrayM38186l, theme, "tint", c9831b.m38191D())) == null) ? C7128q1.f23644b.m28147h() : AbstractC7138s1.m28198b(colorStateListM38180f.getDefaultColor());
        } else {
            jM28147h = C7128q1.f23644b.m28147h();
        }
        long j10 = jM28147h;
        int iM38178d = c9830a.m38178d(typedArrayM38186l, c9831b.m38192E(), -1);
        if (iM38178d == -1) {
            iM28333z = AbstractC7168z0.f23700a.m28333z();
        } else if (iM38178d == 3) {
            iM28333z = AbstractC7168z0.f23700a.m28306B();
        } else if (iM38178d == 5) {
            iM28333z = AbstractC7168z0.f23700a.m28333z();
        } else if (iM38178d != 9) {
            switch (iM38178d) {
                case Opcodes.DCONST_0 /* 14 */:
                    iM28333z = AbstractC7168z0.f23700a.m28324q();
                    break;
                case 15:
                    iM28333z = AbstractC7168z0.f23700a.m28329v();
                    break;
                case 16:
                    iM28333z = AbstractC7168z0.f23700a.m28327t();
                    break;
                default:
                    iM28333z = AbstractC7168z0.f23700a.m28333z();
                    break;
            }
        } else {
            iM28333z = AbstractC7168z0.f23700a.m28332y();
        }
        int i10 = iM28333z;
        float fM12003k = C3179i.m12003k(fM38176b / resources.getDisplayMetrics().density);
        float fM12003k2 = C3179i.m12003k(fM38176b2 / resources.getDisplayMetrics().density);
        typedArrayM38186l.recycle();
        return new C9516d.a(null, fM12003k, fM12003k2, fM38182h, fM38182h2, j10, i10, zM38179e, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final int m38224b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : AbstractC7105l3.f23607a.m27998c() : AbstractC7105l3.f23607a.m27997b() : AbstractC7105l3.f23607a.m27996a();
    }

    /* JADX INFO: renamed from: c */
    public static final int m38225c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : AbstractC7110m3.f23617a.m28009a() : AbstractC7110m3.f23617a.m28011c() : AbstractC7110m3.f23617a.m28010b();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m38226d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC7078g1 m38227e(C6238d c6238d) {
        if (!c6238d.m24606i()) {
            return null;
        }
        Shader shaderM24604f = c6238d.m24604f();
        return shaderM24604f != null ? AbstractC7083h1.m27895a(shaderM24604f) : new C7100k3(AbstractC7138s1.m28198b(c6238d.m24603e()), null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m38228f(C9830a c9830a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C9516d.a aVar) {
        C9831b c9831b = C9831b.f33200a;
        TypedArray typedArrayM38186l = c9830a.m38186l(resources, theme, attributeSet, c9831b.m38198b());
        String strM38184j = c9830a.m38184j(typedArrayM38186l, c9831b.m38199c());
        if (strM38184j == null) {
            strM38184j = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str = strM38184j;
        String strM38184j2 = c9830a.m38184j(typedArrayM38186l, c9831b.m38200d());
        List listM37282d = strM38184j2 == null ? AbstractC9527o.m37282d() : C9522j.m37244b(c9830a.f33187c, strM38184j2, null, 2, null);
        typedArrayM38186l.recycle();
        C9516d.a.m37119b(aVar, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listM37282d, 254, null);
    }

    /* JADX INFO: renamed from: g */
    public static final int m38229g(C9830a c9830a, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C9516d.a aVar, int i10) throws XmlPullParserException {
        int eventType = c9830a.m38185k().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !AbstractC1061t.m3842c("group", c9830a.m38185k().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar.m37125g();
            }
            return 0;
        }
        String name = c9830a.m38185k().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            m38228f(c9830a, resources, theme, attributeSet, aVar);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            m38231i(c9830a, resources, theme, attributeSet, aVar);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        m38230h(c9830a, resources, theme, attributeSet, aVar);
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public static final void m38230h(C9830a c9830a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C9516d.a aVar) {
        C9831b c9831b = C9831b.f33200a;
        TypedArray typedArrayM38186l = c9830a.m38186l(resources, theme, attributeSet, c9831b.m38201e());
        float fM38182h = c9830a.m38182h(typedArrayM38186l, "rotation", c9831b.m38205i(), 0.0f);
        float fM38177c = c9830a.m38177c(typedArrayM38186l, c9831b.m38203g(), 0.0f);
        float fM38177c2 = c9830a.m38177c(typedArrayM38186l, c9831b.m38204h(), 0.0f);
        float fM38182h2 = c9830a.m38182h(typedArrayM38186l, "scaleX", c9831b.m38206j(), 1.0f);
        float fM38182h3 = c9830a.m38182h(typedArrayM38186l, "scaleY", c9831b.m38207k(), 1.0f);
        float fM38182h4 = c9830a.m38182h(typedArrayM38186l, "translateX", c9831b.m38208l(), 0.0f);
        float fM38182h5 = c9830a.m38182h(typedArrayM38186l, "translateY", c9831b.m38209m(), 0.0f);
        String strM38184j = c9830a.m38184j(typedArrayM38186l, c9831b.m38202f());
        if (strM38184j == null) {
            strM38184j = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        typedArrayM38186l.recycle();
        aVar.m37121a(strM38184j, fM38182h, fM38177c, fM38177c2, fM38182h2, fM38182h3, fM38182h4, fM38182h5, AbstractC9527o.m37282d());
    }

    /* JADX INFO: renamed from: i */
    public static final void m38231i(C9830a c9830a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C9516d.a aVar) {
        C9831b c9831b = C9831b.f33200a;
        TypedArray typedArrayM38186l = c9830a.m38186l(resources, theme, attributeSet, c9831b.m38211o());
        if (!AbstractC6242h.m24625h(c9830a.m38185k(), "pathData")) {
            C9987e.m38645a("No path data available");
            return;
        }
        String strM38184j = c9830a.m38184j(typedArrayM38186l, c9831b.m38214r());
        if (strM38184j == null) {
            strM38184j = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str = strM38184j;
        String strM38184j2 = c9830a.m38184j(typedArrayM38186l, c9831b.m38215s());
        List listM37282d = strM38184j2 == null ? AbstractC9527o.m37282d() : C9522j.m37244b(c9830a.f33187c, strM38184j2, null, 2, null);
        C6238d c6238dM38181g = c9830a.m38181g(typedArrayM38186l, theme, "fillColor", c9831b.m38213q(), 0);
        float fM38182h = c9830a.m38182h(typedArrayM38186l, "fillAlpha", c9831b.m38212p(), 1.0f);
        int iM38224b = m38224b(c9830a.m38183i(typedArrayM38186l, "strokeLineCap", c9831b.m38218v(), -1), AbstractC7105l3.f23607a.m27996a());
        int iM38225c = m38225c(c9830a.m38183i(typedArrayM38186l, "strokeLineJoin", c9831b.m38219w(), -1), AbstractC7110m3.f23617a.m28010b());
        float fM38182h2 = c9830a.m38182h(typedArrayM38186l, "strokeMiterLimit", c9831b.m38220x(), 4.0f);
        C6238d c6238dM38181g2 = c9830a.m38181g(typedArrayM38186l, theme, "strokeColor", c9831b.m38217u(), 0);
        float fM38182h3 = c9830a.m38182h(typedArrayM38186l, "strokeAlpha", c9831b.m38216t(), 1.0f);
        float fM38182h4 = c9830a.m38182h(typedArrayM38186l, "strokeWidth", c9831b.m38221y(), 1.0f);
        float fM38182h5 = c9830a.m38182h(typedArrayM38186l, "trimPathEnd", c9831b.m38222z(), 1.0f);
        float fM38182h6 = c9830a.m38182h(typedArrayM38186l, "trimPathOffset", c9831b.m38189B(), 0.0f);
        float fM38182h7 = c9830a.m38182h(typedArrayM38186l, "trimPathStart", c9831b.m38190C(), 0.0f);
        int iM38183i = c9830a.m38183i(typedArrayM38186l, "fillType", c9831b.m38188A(), f33226a);
        typedArrayM38186l.recycle();
        aVar.m37122c(listM37282d, iM38183i == 0 ? AbstractC7154v2.f23684a.m28243b() : AbstractC7154v2.f23684a.m28242a(), str, m38227e(c6238dM38181g), fM38182h, m38227e(c6238dM38181g2), fM38182h3, fM38182h4, iM38224b, iM38225c, fM38182h2, fM38182h7, fM38182h5, fM38182h6);
    }

    /* JADX INFO: renamed from: j */
    public static final XmlPullParser m38232j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
