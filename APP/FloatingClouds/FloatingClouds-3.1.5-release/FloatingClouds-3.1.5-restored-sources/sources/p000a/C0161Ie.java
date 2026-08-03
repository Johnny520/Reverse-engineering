package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: a.Ie */
/* JADX INFO: loaded from: classes.dex */
public final class C0161Ie extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f542e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f543f;

    /* JADX INFO: renamed from: a */
    public final Object[] f544a;

    /* JADX INFO: renamed from: b */
    public final Object[] f545b;

    /* JADX INFO: renamed from: c */
    public final Context f546c;

    /* JADX INFO: renamed from: d */
    public Object f547d;

    /* JADX INFO: renamed from: a.Ie$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f548c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public Object f549a;

        /* JADX INFO: renamed from: b */
        public Method f550b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f550b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f549a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: a.Ie$b */
    public class b {

        /* JADX INFO: renamed from: A */
        public CharSequence f551A;

        /* JADX INFO: renamed from: B */
        public CharSequence f552B;

        /* JADX INFO: renamed from: a */
        public final Menu f556a;

        /* JADX INFO: renamed from: h */
        public boolean f563h;

        /* JADX INFO: renamed from: i */
        public int f564i;

        /* JADX INFO: renamed from: j */
        public int f565j;

        /* JADX INFO: renamed from: k */
        public CharSequence f566k;

        /* JADX INFO: renamed from: l */
        public CharSequence f567l;

        /* JADX INFO: renamed from: m */
        public int f568m;

        /* JADX INFO: renamed from: n */
        public char f569n;

        /* JADX INFO: renamed from: o */
        public int f570o;

        /* JADX INFO: renamed from: p */
        public char f571p;

        /* JADX INFO: renamed from: q */
        public int f572q;

        /* JADX INFO: renamed from: r */
        public int f573r;

        /* JADX INFO: renamed from: s */
        public boolean f574s;

        /* JADX INFO: renamed from: t */
        public boolean f575t;

        /* JADX INFO: renamed from: u */
        public boolean f576u;

        /* JADX INFO: renamed from: v */
        public int f577v;

        /* JADX INFO: renamed from: w */
        public int f578w;

        /* JADX INFO: renamed from: x */
        public String f579x;

        /* JADX INFO: renamed from: y */
        public String f580y;

        /* JADX INFO: renamed from: z */
        public AbstractC0290Q f581z;

        /* JADX INFO: renamed from: C */
        public ColorStateList f553C = null;

        /* JADX INFO: renamed from: D */
        public PorterDuff.Mode f554D = null;

        /* JADX INFO: renamed from: b */
        public int f557b = 0;

        /* JADX INFO: renamed from: c */
        public int f558c = 0;

        /* JADX INFO: renamed from: d */
        public int f559d = 0;

        /* JADX INFO: renamed from: e */
        public int f560e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f561f = true;

        /* JADX INFO: renamed from: g */
        public boolean f562g = true;

        public b(Menu menu) {
            this.f556a = menu;
        }

        /* JADX INFO: renamed from: a */
        public final <T> T m443a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0161Ie.this.f546c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m444b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f574s).setVisible(this.f575t).setEnabled(this.f576u).setCheckable(this.f573r >= 1).setTitleCondensed(this.f567l).setIcon(this.f568m);
            int i = this.f577v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f580y;
            C0161Ie c0161Ie = C0161Ie.this;
            if (str != null) {
                if (c0161Ie.f546c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (c0161Ie.f547d == null) {
                    c0161Ie.f547d = C0161Ie.m441a(c0161Ie.f546c);
                }
                Object obj = c0161Ie.f547d;
                String str2 = this.f580y;
                a aVar = new a();
                aVar.f549a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f550b = cls.getMethod(str2, a.f548c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.f573r >= 2) {
                if (menuItem instanceof C1000h) {
                    C1000h c1000h = (C1000h) menuItem;
                    c1000h.f3837x = (c1000h.f3837x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC0538db) {
                    MenuItemC0538db menuItemC0538db = (MenuItemC0538db) menuItem;
                    try {
                        Method method = menuItemC0538db.f1935e;
                        InterfaceMenuItemC0179Je interfaceMenuItemC0179Je = menuItemC0538db.f1934d;
                        if (method == null) {
                            menuItemC0538db.f1935e = interfaceMenuItemC0179Je.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0538db.f1935e.invoke(interfaceMenuItemC0179Je, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str3 = this.f579x;
            if (str3 != null) {
                menuItem.setActionView((View) m443a(str3, C0161Ie.f542e, c0161Ie.f544a));
                z = true;
            }
            int i2 = this.f578w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC0290Q abstractC0290Q = this.f581z;
            if (abstractC0290Q != null) {
                if (menuItem instanceof InterfaceMenuItemC0179Je) {
                    ((InterfaceMenuItemC0179Je) menuItem).mo487b(abstractC0290Q);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f551A;
            boolean z2 = menuItem instanceof InterfaceMenuItemC0179Je;
            if (z2) {
                ((InterfaceMenuItemC0179Je) menuItem).setContentDescription(charSequence);
            } else {
                C0500bb.m1241h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f552B;
            if (z2) {
                ((InterfaceMenuItemC0179Je) menuItem).setTooltipText(charSequence2);
            } else {
                C0500bb.m1246m(menuItem, charSequence2);
            }
            char c = this.f569n;
            int i3 = this.f570o;
            if (z2) {
                ((InterfaceMenuItemC0179Je) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                C0500bb.m1240g(menuItem, c, i3);
            }
            char c2 = this.f571p;
            int i4 = this.f572q;
            if (z2) {
                ((InterfaceMenuItemC0179Je) menuItem).setNumericShortcut(c2, i4);
            } else {
                C0500bb.m1244k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.f554D;
            if (mode != null) {
                if (z2) {
                    ((InterfaceMenuItemC0179Je) menuItem).setIconTintMode(mode);
                } else {
                    C0500bb.m1243j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f553C;
            if (colorStateList != null) {
                if (z2) {
                    ((InterfaceMenuItemC0179Je) menuItem).setIconTintList(colorStateList);
                } else {
                    C0500bb.m1242i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f542e = clsArr;
        f543f = clsArr;
    }

    public C0161Ie(Context context) {
        super(context);
        this.f546c = context;
        Object[] objArr = {context};
        this.f544a = objArr;
        this.f545b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m441a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m441a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x0282 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m442b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        boolean z;
        int i;
        XmlResourceParser xmlResourceParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            z = true;
            i = 2;
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
            if (eventType == z) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.f557b = 0;
                            bVar.f558c = 0;
                            bVar.f559d = 0;
                            bVar.f560e = 0;
                            bVar.f561f = z;
                            bVar.f562g = z;
                        } else if (name2.equals("item")) {
                            if (!bVar.f563h) {
                                AbstractC0290Q abstractC0290Q = bVar.f581z;
                                if (abstractC0290Q == null || !abstractC0290Q.mo786a()) {
                                    bVar.f563h = z;
                                    bVar.m444b(bVar.f556a.add(bVar.f557b, bVar.f564i, bVar.f565j, bVar.f566k));
                                } else {
                                    bVar.f563h = z;
                                    bVar.m444b(bVar.f556a.addSubMenu(bVar.f557b, bVar.f564i, bVar.f565j, bVar.f566k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = z;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                    }
                }
            } else if (!z3) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                C0161Ie c0161Ie = C0161Ie.this;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = c0161Ie.f546c.obtainStyledAttributes(attributeSet, C0983R.styleable.MenuGroup);
                    bVar.f557b = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.MenuGroup_android_id, 0);
                    bVar.f558c = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.MenuGroup_android_menuCategory, 0);
                    bVar.f559d = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.MenuGroup_android_orderInCategory, 0);
                    bVar.f560e = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.MenuGroup_android_checkableBehavior, 0);
                    bVar.f561f = typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.MenuGroup_android_visible, z);
                    bVar.f562g = typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.MenuGroup_android_enabled, z);
                    typedArrayObtainStyledAttributes.recycle();
                    xmlResourceParser2 = xmlResourceParser;
                } else if (name3.equals("item")) {
                    Context context = c0161Ie.f546c;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0983R.styleable.MenuItem);
                    bVar.f564i = typedArrayObtainStyledAttributes2.getResourceId(C0983R.styleable.MenuItem_android_id, 0);
                    bVar.f565j = (typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_android_orderInCategory, bVar.f559d) & 65535) | (typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_android_menuCategory, bVar.f558c) & (-65536));
                    bVar.f566k = typedArrayObtainStyledAttributes2.getText(C0983R.styleable.MenuItem_android_title);
                    bVar.f567l = typedArrayObtainStyledAttributes2.getText(C0983R.styleable.MenuItem_android_titleCondensed);
                    bVar.f568m = typedArrayObtainStyledAttributes2.getResourceId(C0983R.styleable.MenuItem_android_icon, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.MenuItem_android_alphabeticShortcut);
                    bVar.f569n = string == null ? (char) 0 : string.charAt(0);
                    bVar.f570o = typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_alphabeticModifiers, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.MenuItem_android_numericShortcut);
                    bVar.f571p = string2 == null ? (char) 0 : string2.charAt(0);
                    bVar.f572q = typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_numericModifiers, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.MenuItem_android_checkable)) {
                        bVar.f573r = typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
                    } else {
                        bVar.f573r = bVar.f560e;
                    }
                    bVar.f574s = typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.MenuItem_android_checked, false);
                    bVar.f575t = typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.MenuItem_android_visible, bVar.f561f);
                    bVar.f576u = typedArrayObtainStyledAttributes2.getBoolean(C0983R.styleable.MenuItem_android_enabled, bVar.f562g);
                    bVar.f577v = typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_showAsAction, -1);
                    bVar.f580y = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.MenuItem_android_onClick);
                    bVar.f578w = typedArrayObtainStyledAttributes2.getResourceId(C0983R.styleable.MenuItem_actionLayout, 0);
                    bVar.f579x = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.MenuItem_actionViewClass);
                    String string3 = typedArrayObtainStyledAttributes2.getString(C0983R.styleable.MenuItem_actionProviderClass);
                    boolean z4 = string3 != null ? z : false;
                    if (z4 && bVar.f578w == 0 && bVar.f579x == null) {
                        bVar.f581z = (AbstractC0290Q) bVar.m443a(string3, f543f, c0161Ie.f545b);
                    } else {
                        if (z4) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f581z = null;
                    }
                    bVar.f551A = typedArrayObtainStyledAttributes2.getText(C0983R.styleable.MenuItem_contentDescription);
                    bVar.f552B = typedArrayObtainStyledAttributes2.getText(C0983R.styleable.MenuItem_tooltipText);
                    if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.MenuItem_iconTintMode)) {
                        bVar.f554D = C0912x5.m2200c(typedArrayObtainStyledAttributes2.getInt(C0983R.styleable.MenuItem_iconTintMode, -1), bVar.f554D);
                    } else {
                        bVar.f554D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.MenuItem_iconTint)) {
                        int i2 = C0983R.styleable.MenuItem_iconTint;
                        if (!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = C0437Y3.m1091a(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(i2);
                        }
                        bVar.f553C = colorStateList;
                    } else {
                        bVar.f553C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    bVar.f563h = false;
                    xmlResourceParser2 = xmlResourceParser;
                    z = true;
                } else if (name3.equals("menu")) {
                    z = true;
                    bVar.f563h = true;
                    SubMenu subMenuAddSubMenu = bVar.f556a.addSubMenu(bVar.f557b, bVar.f564i, bVar.f565j, bVar.f566k);
                    bVar.m444b(subMenuAddSubMenu.getItem());
                    xmlResourceParser2 = xmlResourceParser;
                    m442b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlResourceParser2 = xmlResourceParser;
                    z = true;
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlResourceParser2.next();
            i = 2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0143He)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f546c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C0998f) {
                    C0998f c0998f = (C0998f) menu;
                    if (!c0998f.f3799p) {
                        c0998f.m2338w();
                        z = true;
                    }
                }
                m442b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C0998f) menu).m2337v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C0998f) menu).m2337v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
