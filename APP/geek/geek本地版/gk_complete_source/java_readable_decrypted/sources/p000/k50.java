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
public final class k50 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f2697e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f2698f;

    /* JADX INFO: renamed from: a */
    public final Object[] f2699a;

    /* JADX INFO: renamed from: b */
    public final Object[] f2700b;

    /* JADX INFO: renamed from: c */
    public final Context f2701c;

    /* JADX INFO: renamed from: d */
    public Object f2702d;

    static {
        Class[] clsArr = {Context.class};
        f2697e = clsArr;
        f2698f = clsArr;
    }

    public k50(Context context) {
        super(context);
        this.f2701c = context;
        Object[] objArr = {context};
        this.f2699a = objArr;
        this.f2700b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1623a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1623a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m1624b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        j50 j50Var = new j50(this, menu);
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
                            j50Var.f2560b = 0;
                            j50Var.f2561c = 0;
                            j50Var.f2562d = 0;
                            j50Var.f2563e = 0;
                            j50Var.f2564f = true;
                            j50Var.f2565g = true;
                        } else if (name2.equals("item")) {
                            if (!j50Var.f2566h) {
                                ActionProviderVisibilityListenerC0610pu actionProviderVisibilityListenerC0610pu = j50Var.f2584z;
                                if (actionProviderVisibilityListenerC0610pu == null || !actionProviderVisibilityListenerC0610pu.f3950a.hasSubMenu()) {
                                    j50Var.f2566h = true;
                                    j50Var.m1549b(j50Var.f2559a.add(j50Var.f2560b, j50Var.f2567i, j50Var.f2568j, j50Var.f2569k));
                                } else {
                                    j50Var.f2566h = true;
                                    j50Var.m1549b(j50Var.f2559a.addSubMenu(j50Var.f2560b, j50Var.f2567i, j50Var.f2568j, j50Var.f2569k).getItem());
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
                    Context context = this.f2701c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5232p);
                        j50Var.f2560b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        j50Var.f2561c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        j50Var.f2562d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        j50Var.f2563e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        j50Var.f2564f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        j50Var.f2565g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5233q);
                            j50Var.f2567i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            j50Var.f2568j = (typedArrayObtainStyledAttributes2.getInt(5, j50Var.f2561c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, j50Var.f2562d) & 65535);
                            j50Var.f2569k = typedArrayObtainStyledAttributes2.getText(7);
                            j50Var.f2570l = typedArrayObtainStyledAttributes2.getText(8);
                            j50Var.f2571m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            j50Var.f2572n = string == null ? (char) 0 : string.charAt(0);
                            j50Var.f2573o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            j50Var.f2574p = string2 == null ? (char) 0 : string2.charAt(0);
                            j50Var.f2575q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                j50Var.f2576r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                j50Var.f2576r = j50Var.f2563e;
                            }
                            j50Var.f2577s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            j50Var.f2578t = typedArrayObtainStyledAttributes2.getBoolean(4, j50Var.f2564f);
                            j50Var.f2579u = typedArrayObtainStyledAttributes2.getBoolean(1, j50Var.f2565g);
                            j50Var.f2580v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            j50Var.f2583y = typedArrayObtainStyledAttributes2.getString(12);
                            j50Var.f2581w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            j50Var.f2582x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && j50Var.f2581w == 0 && j50Var.f2582x == null) {
                                j50Var.f2584z = (ActionProviderVisibilityListenerC0610pu) j50Var.m1548a(string3, f2698f, this.f2700b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                j50Var.f2584z = null;
                            }
                            j50Var.f2554A = typedArrayObtainStyledAttributes2.getText(17);
                            j50Var.f2555B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                j50Var.f2557D = AbstractC0187eh.m1028b(typedArrayObtainStyledAttributes2.getInt(19, -1), j50Var.f2557D);
                            } else {
                                j50Var.f2557D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0346ip.m1510v(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                j50Var.f2556C = colorStateList;
                            } else {
                                j50Var.f2556C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            j50Var.f2566h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            j50Var.f2566h = true;
                            SubMenu subMenuAddSubMenu = j50Var.f2559a.addSubMenu(j50Var.f2560b, j50Var.f2567i, j50Var.f2568j, j50Var.f2569k);
                            j50Var.m1549b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m1624b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
        if (!(menu instanceof MenuC0424ku)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2701c.getResources().getLayout(i);
                    m1624b(layout, Xml.asAttributeSet(layout), menu);
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
