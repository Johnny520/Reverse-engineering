package yyds;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛷᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1623 extends MenuInflater {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Class[] f8259;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Class[] f8260;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object[] f8261;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object[] f8262;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f8263;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f8264;

    static {
        Class[] clsArr = {Context.class};
        f8259 = clsArr;
        f8260 = clsArr;
    }

    public C1623(Context context) {
        super(context);
        this.f8263 = context;
        Object[] objArr = {context};
        this.f8261 = objArr;
        this.f8262 = objArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Object m3318(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3318(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0836)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f8263.getResources().getLayout(i);
                    m3319(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3319(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C2638 c2638 = new C2638(this, menu);
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
            Menu menu2 = c2638.f12992;
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
                            c2638.f12996 = 0;
                            c2638.f13010 = 0;
                            c2638.f13013 = 0;
                            c2638.f12990 = 0;
                            c2638.f13012 = true;
                            c2638.f13000 = true;
                        } else if (name2.equals("item")) {
                            if (!c2638.f12986) {
                                ActionProviderVisibilityListenerC2022 actionProviderVisibilityListenerC2022 = c2638.f12997;
                                if (actionProviderVisibilityListenerC2022 == null || !actionProviderVisibilityListenerC2022.f10095.hasSubMenu()) {
                                    c2638.f12986 = true;
                                    c2638.m4744(menu2.add(c2638.f12996, c2638.f12989, c2638.f13006, c2638.f13003));
                                } else {
                                    c2638.f12986 = true;
                                    c2638.m4744(menu2.addSubMenu(c2638.f12996, c2638.f12989, c2638.f13006, c2638.f13003).getItem());
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
                    Context context = this.f8263;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8110);
                        c2638.f12996 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c2638.f13010 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c2638.f13013 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c2638.f12990 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c2638.f13012 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c2638.f13000 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8101);
                            c2638.f12989 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c2638.f13006 = (typedArrayObtainStyledAttributes2.getInt(5, c2638.f13010) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c2638.f13013) & 65535);
                            c2638.f13003 = typedArrayObtainStyledAttributes2.getText(7);
                            c2638.f13004 = typedArrayObtainStyledAttributes2.getText(8);
                            c2638.f12987 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c2638.f12985 = string == null ? (char) 0 : string.charAt(0);
                            c2638.f12994 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c2638.f13011 = string2 == null ? (char) 0 : string2.charAt(0);
                            c2638.f12999 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c2638.f12995 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c2638.f12995 = c2638.f12990;
                            }
                            c2638.f13009 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c2638.f12993 = typedArrayObtainStyledAttributes2.getBoolean(4, c2638.f13012);
                            c2638.f13002 = typedArrayObtainStyledAttributes2.getBoolean(1, c2638.f13000);
                            c2638.f13001 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c2638.f13014 = typedArrayObtainStyledAttributes2.getString(12);
                            c2638.f12998 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c2638.f12991 = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c2638.f12998 == 0 && c2638.f12991 == null) {
                                c2638.f12997 = (ActionProviderVisibilityListenerC2022) c2638.m4743(string3, f8260, this.f8262);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c2638.f12997 = null;
                            }
                            c2638.f12988 = typedArrayObtainStyledAttributes2.getText(17);
                            c2638.f13005 = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c2638.f13007 = AbstractC2137.m4076(typedArrayObtainStyledAttributes2.getInt(19, -1), c2638.f13007);
                            } else {
                                c2638.f13007 = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = C2810.m4942(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c2638.f12984 = colorStateList;
                            } else {
                                c2638.f12984 = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c2638.f12986 = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c2638.f12986 = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(c2638.f12996, c2638.f12989, c2638.f13006, c2638.f13003);
                            c2638.m4744(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m3319(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
}
