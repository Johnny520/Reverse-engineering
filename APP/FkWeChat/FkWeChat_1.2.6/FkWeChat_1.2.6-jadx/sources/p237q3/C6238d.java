package p237q3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: q3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6238d {

    /* JADX INFO: renamed from: a */
    public final Shader f19368a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f19369b;

    /* JADX INFO: renamed from: c */
    public int f19370c;

    public C6238d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f19368a = shader;
        this.f19369b = colorStateList;
        this.f19370c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C6238d m24598a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return m24601d(AbstractC6240f.m24612b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m24600c(AbstractC6237c.m24591b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    public static C6238d m24599b(int i10) {
        return new C6238d(null, null, i10);
    }

    /* JADX INFO: renamed from: c */
    public static C6238d m24600c(ColorStateList colorStateList) {
        return new C6238d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    public static C6238d m24601d(Shader shader) {
        return new C6238d(shader, null, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C6238d m24602g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m24598a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m24603e() {
        return this.f19370c;
    }

    /* JADX INFO: renamed from: f */
    public Shader m24604f() {
        return this.f19368a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m24605h() {
        return this.f19368a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m24606i() {
        return m24605h() || this.f19370c != 0;
    }
}
