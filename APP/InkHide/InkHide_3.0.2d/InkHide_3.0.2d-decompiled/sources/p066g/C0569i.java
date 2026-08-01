package p066g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p068h.ActionProviderVisibilityListenerC0597p;
import p068h.MenuC0594m;
import p069i.AbstractC0705p0;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0569i extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f1924e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f1925f;

    /* JADX INFO: renamed from: a */
    public final Object[] f1926a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1927b;

    /* JADX INFO: renamed from: c */
    public final Context f1928c;

    /* JADX INFO: renamed from: d */
    public Object f1929d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class[] clsArr = {Context.class};
        f1924e = clsArr;
        f1925f = clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0569i(Context context) {
        super(context);
        this.f1928c = context;
        Object[] objArr = {context};
        this.f1926a = objArr;
        this.f1927b = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1135a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1135a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x0272 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [g.i] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: b */
    public final void m1136b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i2;
        XmlResourceParser xmlResourceParser2;
        ?? r8;
        ColorStateList colorStateList;
        int resourceId;
        C0568h c0568h = new C0568h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    r8 = r4;
                    z2 = z2;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r4;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0568h.f1899b = 0;
                            c0568h.f1900c = 0;
                            c0568h.f1901d = 0;
                            c0568h.f1902e = 0;
                            c0568h.f1903f = r4;
                            c0568h.f1904g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0568h.f1905h) {
                                ActionProviderVisibilityListenerC0597p actionProviderVisibilityListenerC0597p = c0568h.f1923z;
                                if (actionProviderVisibilityListenerC0597p == null || !actionProviderVisibilityListenerC0597p.f2086a.hasSubMenu()) {
                                    c0568h.f1905h = r4;
                                    c0568h.m1134b(c0568h.f1898a.add(c0568h.f1899b, c0568h.f1906i, c0568h.f1907j, c0568h.f1908k));
                                } else {
                                    c0568h.f1905h = r4;
                                    c0568h.m1134b(c0568h.f1898a.addSubMenu(c0568h.f1899b, c0568h.f1906i, c0568h.f1907j, c0568h.f1908k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            ?? r82 = r4;
                            z2 = r82 == true ? 1 : 0;
                            r8 = r82;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r4;
                        z2 = z2;
                    }
                }
                eventType = xmlResourceParser2.next();
                r4 = r8;
                i2 = 2;
                z2 = z2;
                z3 = z3;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0569i c0569i = c0568h.f1897E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = c0569i.f1928c.obtainStyledAttributes(attributeSet, AbstractC0515a.f1652p);
                        c0568h.f1899b = ObtainStyledAttributes.getResourceId(r4, 0);
                        c0568h.f1900c = ObtainStyledAttributes.getInt(3, 0);
                        c0568h.f1901d = ObtainStyledAttributes.getInt(4, 0);
                        c0568h.f1902e = ObtainStyledAttributes.getInt(5, 0);
                        c0568h.f1903f = ObtainStyledAttributes.getBoolean(2, r4);
                        c0568h.f1904g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0569i.f1928c;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1653q);
                            c0568h.f1906i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                            c0568h.f1907j = (typedArrayObtainStyledAttributes.getInt(5, c0568h.f1900c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, c0568h.f1901d) & 65535);
                            c0568h.f1908k = typedArrayObtainStyledAttributes.getText(7);
                            c0568h.f1909l = typedArrayObtainStyledAttributes.getText(8);
                            c0568h.f1910m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes.getString(9);
                            c0568h.f1911n = string == null ? (char) 0 : string.charAt(0);
                            c0568h.f1912o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes.getString(10);
                            c0568h.f1913p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0568h.f1914q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                                c0568h.f1915r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0568h.f1915r = c0568h.f1902e;
                            }
                            c0568h.f1916s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                            c0568h.f1917t = typedArrayObtainStyledAttributes.getBoolean(4, c0568h.f1903f);
                            c0568h.f1918u = typedArrayObtainStyledAttributes.getBoolean(1, c0568h.f1904g);
                            c0568h.f1919v = typedArrayObtainStyledAttributes.getInt(21, -1);
                            c0568h.f1922y = typedArrayObtainStyledAttributes.getString(12);
                            c0568h.f1920w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                            c0568h.f1921x = typedArrayObtainStyledAttributes.getString(15);
                            String string3 = typedArrayObtainStyledAttributes.getString(14);
                            boolean z4 = string3 != null;
                            if (z4 && c0568h.f1920w == 0 && c0568h.f1921x == null) {
                                c0568h.f1923z = (ActionProviderVisibilityListenerC0597p) c0568h.m1133a(string3, f1925f, c0569i.f1927b);
                            } else {
                                if (z4) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0568h.f1923z = null;
                            }
                            c0568h.f1893A = typedArrayObtainStyledAttributes.getText(17);
                            c0568h.f1894B = typedArrayObtainStyledAttributes.getText(22);
                            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                                c0568h.f1896D = AbstractC0705p0.m1337b(typedArrayObtainStyledAttributes.getInt(19, -1), c0568h.f1896D);
                            } else {
                                c0568h.f1896D = null;
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0503h.m990w(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                                }
                                c0568h.f1895C = colorStateList;
                            } else {
                                c0568h.f1895C = null;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            c0568h.f1905h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                        } else if (name3.equals("menu")) {
                            r8 = 1;
                            c0568h.f1905h = true;
                            SubMenu subMenuAddSubMenu = c0568h.f1898a.addSubMenu(c0568h.f1899b, c0568h.f1906i, c0568h.f1907j, c0568h.f1908k);
                            c0568h.m1134b(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            m1136b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = r8;
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                r8 = r4;
                z2 = z2;
            }
            eventType = xmlResourceParser2.next();
            r4 = r8;
            i2 = 2;
            z2 = z2;
            z3 = z3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0594m)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f1928c.getResources().getLayout(i2);
                    m1136b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
