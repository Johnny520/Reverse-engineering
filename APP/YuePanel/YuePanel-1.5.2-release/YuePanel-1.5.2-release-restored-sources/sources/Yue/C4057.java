package Yue;

import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C4057 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f8121 = "ComplexColorCompat";

    /* JADX INFO: renamed from: ۥ */
    public final Shader f640;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ColorStateList f641;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f8122;

    public C4057(Shader shader, ColorStateList colorStateList, @InterfaceC3897 int i) {
        this.f640 = shader;
        this.f641 = colorStateList;
        this.f8122 = i;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C4057 m1011(@InterfaceC6391 Resources resources, @InterfaceC3906 int i, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
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
        name.hashCode();
        if (name.equals("gradient")) {
            return m11489(C5192.m15896(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m11488(C3912.m936(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C4057 m1012(@InterfaceC3897 int i) {
        return new C4057(null, null, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4057 m11488(@InterfaceC6391 ColorStateList colorStateList) {
        return new C4057(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C4057 m11489(@InterfaceC6391 Shader shader) {
        return new C4057(shader, null, 0);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4057 m11490(@InterfaceC6391 Resources resources, @InterfaceC3906 int i, @InterfaceC6490 Resources.Theme theme) {
        try {
            return m1011(resources, i, theme);
        } catch (Exception e) {
            Log.e(f8121, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m11491() {
        return this.f8122;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Shader m11492() {
        return this.f640;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m11493() {
        return this.f640 != null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m11494() {
        ColorStateList colorStateList;
        return this.f640 == null && (colorStateList = this.f641) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m11495(int[] iArr) {
        if (m11494()) {
            ColorStateList colorStateList = this.f641;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f8122) {
                this.f8122 = colorForState;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m11496(@InterfaceC3897 int i) {
        this.f8122 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m11497() {
        return m11493() || this.f8122 != 0;
    }
}
