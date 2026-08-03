package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Lz */
/* JADX INFO: loaded from: classes.dex */
public final class C0515Lz extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f1677e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f1678f;

    /* JADX INFO: renamed from: a */
    public final Object[] f1679a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1680b;

    /* JADX INFO: renamed from: c */
    public final Context f1681c;

    /* JADX INFO: renamed from: d */
    public Object f1682d;

    static {
        Class[] clsArr = {Context.class};
        f1677e = clsArr;
        f1678f = clsArr;
    }

    public C0515Lz(Context context) {
        super(context);
        this.f1681c = context;
        Object[] objArr = {context};
        this.f1679a = objArr;
        this.f1680b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m998a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m998a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m999b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C0472Kz c0472Kz = new C0472Kz(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0472Kz.f1538b = 0;
                            c0472Kz.f1539c = 0;
                            c0472Kz.f1540d = 0;
                            c0472Kz.f1541e = 0;
                            c0472Kz.f1542f = true;
                            c0472Kz.f1543g = true;
                        } else if (name2.equals("item")) {
                            if (!c0472Kz.f1544h) {
                                ActionProviderVisibilityListenerC2470rr actionProviderVisibilityListenerC2470rr = c0472Kz.f1562z;
                                if (actionProviderVisibilityListenerC2470rr == null || !actionProviderVisibilityListenerC2470rr.f8695b.hasSubMenu()) {
                                    c0472Kz.f1544h = true;
                                    c0472Kz.m922b(c0472Kz.f1537a.add(c0472Kz.f1538b, c0472Kz.f1545i, c0472Kz.f1546j, c0472Kz.f1547k));
                                } else {
                                    c0472Kz.f1544h = true;
                                    c0472Kz.m922b(c0472Kz.f1537a.addSubMenu(c0472Kz.f1538b, c0472Kz.f1545i, c0472Kz.f1546j, c0472Kz.f1547k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f1681c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3081p);
                        c0472Kz.f1538b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c0472Kz.f1539c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c0472Kz.f1540d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c0472Kz.f1541e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c0472Kz.f1542f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c0472Kz.f1543g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3082q);
                            c0472Kz.f1545i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c0472Kz.f1546j = (typedArrayObtainStyledAttributes2.getInt(5, c0472Kz.f1539c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c0472Kz.f1540d) & 65535);
                            c0472Kz.f1547k = typedArrayObtainStyledAttributes2.getText(7);
                            c0472Kz.f1548l = typedArrayObtainStyledAttributes2.getText(8);
                            c0472Kz.f1549m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c0472Kz.f1550n = string == null ? (char) 0 : string.charAt(0);
                            c0472Kz.f1551o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c0472Kz.f1552p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0472Kz.f1553q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c0472Kz.f1554r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0472Kz.f1554r = c0472Kz.f1541e;
                            }
                            c0472Kz.f1555s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c0472Kz.f1556t = typedArrayObtainStyledAttributes2.getBoolean(4, c0472Kz.f1542f);
                            c0472Kz.f1557u = typedArrayObtainStyledAttributes2.getBoolean(1, c0472Kz.f1543g);
                            c0472Kz.f1558v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c0472Kz.f1561y = typedArrayObtainStyledAttributes2.getString(12);
                            c0472Kz.f1559w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c0472Kz.f1560x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && c0472Kz.f1559w == 0 && c0472Kz.f1560x == null) {
                                c0472Kz.f1562z = (ActionProviderVisibilityListenerC2470rr) c0472Kz.m921a(string3, f1678f, this.f1680b);
                            } else {
                                c0472Kz.f1562z = null;
                            }
                            c0472Kz.f1532A = typedArrayObtainStyledAttributes2.getText(17);
                            c0472Kz.f1533B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c0472Kz.f1535D = AbstractC0107Ce.m161c(typedArrayObtainStyledAttributes2.getInt(19, -1), c0472Kz.f1535D);
                            } else {
                                c0472Kz.f1535D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0295Gu.m622o(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c0472Kz.f1534C = colorStateList;
                            } else {
                                c0472Kz.f1534C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c0472Kz.f1544h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c0472Kz.f1544h = true;
                            SubMenu subMenuAddSubMenu = c0472Kz.f1537a.addSubMenu(c0472Kz.f1538b, c0472Kz.f1545i, c0472Kz.f1546j, c0472Kz.f1547k);
                            c0472Kz.m922b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m999b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC2204lr)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f1681c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC2204lr) {
                    MenuC2204lr menuC2204lr = (MenuC2204lr) menu;
                    if (!menuC2204lr.f7675p) {
                        menuC2204lr.m4442w();
                        z = true;
                    }
                }
                m999b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC2204lr) menu).m4441v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC2204lr) menu).m4441v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
