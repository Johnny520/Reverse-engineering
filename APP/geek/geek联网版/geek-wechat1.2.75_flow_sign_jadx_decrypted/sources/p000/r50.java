package p000;

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

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f4067e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f4068f;

    /* JADX INFO: renamed from: a */
    public final Object[] f4069a;

    /* JADX INFO: renamed from: b */
    public final Object[] f4070b;

    /* JADX INFO: renamed from: c */
    public final Context f4071c;

    /* JADX INFO: renamed from: d */
    public Object f4072d;

    static {
        Class[] clsArr = {Context.class};
        f4067e = clsArr;
        f4068f = clsArr;
    }

    public r50(Context context) {
        super(context);
        this.f4071c = context;
        Object[] objArr = {context};
        this.f4069a = objArr;
        this.f4070b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2253a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2253a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m2254b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        q50 q50Var = new q50(this, menu);
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
                            q50Var.f3814b = 0;
                            q50Var.f3815c = 0;
                            q50Var.f3816d = 0;
                            q50Var.f3817e = 0;
                            q50Var.f3818f = true;
                            q50Var.f3819g = true;
                        } else if (name2.equals("item")) {
                            if (!q50Var.f3820h) {
                                ActionProviderVisibilityListenerC0906xu actionProviderVisibilityListenerC0906xu = q50Var.f3838z;
                                if (actionProviderVisibilityListenerC0906xu == null || !actionProviderVisibilityListenerC0906xu.f5309a.hasSubMenu()) {
                                    q50Var.f3820h = true;
                                    q50Var.m2115b(q50Var.f3813a.add(q50Var.f3814b, q50Var.f3821i, q50Var.f3822j, q50Var.f3823k));
                                } else {
                                    q50Var.f3820h = true;
                                    q50Var.m2115b(q50Var.f3813a.addSubMenu(q50Var.f3814b, q50Var.f3821i, q50Var.f3822j, q50Var.f3823k).getItem());
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
                    Context context = this.f4071c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1692p);
                        q50Var.f3814b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        q50Var.f3815c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        q50Var.f3816d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        q50Var.f3817e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        q50Var.f3818f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        q50Var.f3819g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1693q);
                            q50Var.f3821i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            q50Var.f3822j = (typedArrayObtainStyledAttributes2.getInt(5, q50Var.f3815c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, q50Var.f3816d) & 65535);
                            q50Var.f3823k = typedArrayObtainStyledAttributes2.getText(7);
                            q50Var.f3824l = typedArrayObtainStyledAttributes2.getText(8);
                            q50Var.f3825m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            q50Var.f3826n = string == null ? (char) 0 : string.charAt(0);
                            q50Var.f3827o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            q50Var.f3828p = string2 == null ? (char) 0 : string2.charAt(0);
                            q50Var.f3829q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                q50Var.f3830r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                q50Var.f3830r = q50Var.f3817e;
                            }
                            q50Var.f3831s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            q50Var.f3832t = typedArrayObtainStyledAttributes2.getBoolean(4, q50Var.f3818f);
                            q50Var.f3833u = typedArrayObtainStyledAttributes2.getBoolean(1, q50Var.f3819g);
                            q50Var.f3834v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            q50Var.f3837y = typedArrayObtainStyledAttributes2.getString(12);
                            q50Var.f3835w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            q50Var.f3836x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && q50Var.f3835w == 0 && q50Var.f3836x == null) {
                                q50Var.f3838z = (ActionProviderVisibilityListenerC0906xu) q50Var.m2114a(string3, f4068f, this.f4070b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                q50Var.f3838z = null;
                            }
                            q50Var.f3808A = typedArrayObtainStyledAttributes2.getText(17);
                            q50Var.f3809B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                q50Var.f3811D = AbstractC0261gh.m1276b(typedArrayObtainStyledAttributes2.getInt(19, -1), q50Var.f3811D);
                            } else {
                                q50Var.f3811D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0493mp.m1864n(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                q50Var.f3810C = colorStateList;
                            } else {
                                q50Var.f3810C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            q50Var.f3820h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            q50Var.f3820h = true;
                            SubMenu subMenuAddSubMenu = q50Var.f3813a.addSubMenu(q50Var.f3814b, q50Var.f3821i, q50Var.f3822j, q50Var.f3823k);
                            q50Var.m2115b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m2254b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
        if (!(menu instanceof MenuC0646qu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f4071c.getResources().getLayout(i);
                    m2254b(layout, Xml.asAttributeSet(layout), menu);
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
}
