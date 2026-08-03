package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import io.github.cherrywechat.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cz */
/* JADX INFO: loaded from: classes.dex */
public final class C1301cz {

    /* JADX INFO: renamed from: a */
    public final int f4736a;

    /* JADX INFO: renamed from: b */
    public final C0728Qx f4737b;

    /* JADX INFO: renamed from: c */
    public final int[][] f4738c;

    /* JADX INFO: renamed from: d */
    public final C0728Qx[] f4739d;

    /* JADX INFO: renamed from: e */
    public final C1196az f4740e;

    /* JADX INFO: renamed from: f */
    public final C1196az f4741f;

    /* JADX INFO: renamed from: g */
    public final C1196az f4742g;

    /* JADX INFO: renamed from: h */
    public final C1196az f4743h;

    public C1301cz(C1239bz c1239bz) {
        this.f4736a = c1239bz.f4210a;
        this.f4737b = c1239bz.f4211b;
        this.f4738c = c1239bz.f4212c;
        this.f4739d = c1239bz.f4213d;
        this.f4740e = c1239bz.f4214e;
        this.f4741f = c1239bz.f4215f;
        this.f4742g = c1239bz.f4216g;
        this.f4743h = c1239bz.f4217h;
    }

    /* JADX INFO: renamed from: a */
    public static void m2564a(C1239bz c1239bz, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC0939Vu.f2949r;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                C0728Qx c0728QxM1383a = C0728Qx.m1511a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new C2436r(0)).m1383a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                c1239bz.m2361a(StateSet.trimStateSet(iArr2, i), c0728QxM1383a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1301cz m2565b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        C1239bz c1239bz = new C1239bz();
        c1239bz.m2362b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            c1239bz.m2362b();
        }
        try {
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
            if (xml.getName().equals("selector")) {
                m2564a(c1239bz, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (c1239bz.f4210a == 0) {
                return null;
            }
            return new C1301cz(c1239bz);
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0728Qx m2566c() {
        C0728Qx c0728Qx = this.f4737b;
        C1196az c1196az = this.f4743h;
        C1196az c1196az2 = this.f4742g;
        C1196az c1196az3 = this.f4741f;
        C1196az c1196az4 = this.f4740e;
        if (c1196az4 == null && c1196az3 == null && c1196az2 == null && c1196az == null) {
            return c0728Qx;
        }
        C0685Px c0685PxM1516f = c0728Qx.m1516f();
        if (c1196az4 != null) {
            c0685PxM1516f.f2196e = c1196az4.f4105b;
        }
        if (c1196az3 != null) {
            c0685PxM1516f.f2197f = c1196az3.f4105b;
        }
        if (c1196az2 != null) {
            c0685PxM1516f.f2199h = c1196az2.f4105b;
        }
        if (c1196az != null) {
            c0685PxM1516f.f2198g = c1196az.f4105b;
        }
        return c0685PxM1516f.m1383a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2567d() {
        C1196az c1196az;
        C1196az c1196az2;
        C1196az c1196az3;
        C1196az c1196az4;
        return this.f4736a > 1 || ((c1196az = this.f4740e) != null && c1196az.f4104a > 1) || (((c1196az2 = this.f4741f) != null && c1196az2.f4104a > 1) || (((c1196az3 = this.f4742g) != null && c1196az3.f4104a > 1) || ((c1196az4 = this.f4743h) != null && c1196az4.f4104a > 1)));
    }
}
