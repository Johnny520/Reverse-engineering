package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
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
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7683 extends MenuInflater {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f23123 = "SupportMenuInflater";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f23124 = "menu";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f23125 = "group";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f23126 = "item";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f23127 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Class<?>[] f23128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Class<?>[] f23129;

    /* JADX INFO: renamed from: ۥ */
    public final Object[] f3015;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Object[] f3016;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Context f23130;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Object f23131;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ$ۥ */
    public static class MenuItemOnMenuItemClickListenerC1324 implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final Class<?>[] f23132 = {MenuItem.class};

        /* JADX INFO: renamed from: ۥ */
        public Object f3017;

        /* JADX INFO: renamed from: ۥ۟ */
        public Method f3018;

        public MenuItemOnMenuItemClickListenerC1324(Object obj, String str) {
            this.f3017 = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3018 = cls.getMethod(str, f23132);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3018.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3018.invoke(this.f3017, menuItem)).booleanValue();
                }
                this.f3018.invoke(this.f3017, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥۢ$ۥ۟ */
    public class C1325 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static final int f23133 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static final int f23134 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public static final int f23135 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public static final int f23136 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public static final int f23137 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public static final boolean f23138 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final boolean f23139 = true;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final boolean f23140 = true;

        /* JADX INFO: renamed from: ۥ */
        public Menu f3019;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3020;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f23141;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f23142;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f23143;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f23144;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f23145;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f23146;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f23147;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f23148;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public CharSequence f23149;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public CharSequence f23150;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f23151;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public char f23152;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f23153;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public char f23154;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f23155;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f23156;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean f23157;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f23158;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f23159;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f23160;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f23161;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public String f23162;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public String f23163;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public String f23164;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public AbstractC3087 f23165;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public CharSequence f23166;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public CharSequence f23167;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public ColorStateList f23168 = null;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public PorterDuff.Mode f23169 = null;

        public C1325(Menu menu) {
            this.f3019 = menu;
            m24458();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m3782() {
            this.f23146 = true;
            m24459(this.f3019.add(this.f3020, this.f23147, this.f23148, this.f23149));
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public SubMenu m3783() {
            this.f23146 = true;
            SubMenu subMenuAddSubMenu = this.f3019.addSubMenu(this.f3020, this.f23147, this.f23148, this.f23149);
            m24459(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final char m24453(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m24454() {
            return this.f23146;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final <T> T m24455(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C7683.this.f23130.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(C7683.f23123, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m24456(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C7683.this.f23130.obtainStyledAttributes(attributeSet, C6898.C6909.f19628);
            this.f3020 = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19630, 0);
            this.f23141 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19632, 0);
            this.f23142 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19633, 0);
            this.f23143 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19634, 0);
            this.f23144 = typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19631, true);
            this.f23145 = typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19629, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m24457(AttributeSet attributeSet) {
            C7837 c7837M24868 = C7837.m24868(C7683.this.f23130, attributeSet, C6898.C6909.f19635);
            this.f23147 = c7837M24868.m24888(C6898.C6909.f19638, 0);
            this.f23148 = (c7837M24868.m24882(C6898.C6909.f19641, this.f23141) & (-65536)) | (c7837M24868.m24882(C6898.C6909.f19642, this.f23142) & 65535);
            this.f23149 = c7837M24868.m24891(C6898.C6909.f19643);
            this.f23150 = c7837M24868.m24891(C6898.C6909.f19644);
            this.f23151 = c7837M24868.m24888(C6898.C6909.f19636, 0);
            this.f23152 = m24453(c7837M24868.m24890(C6898.C6909.f19645));
            this.f23153 = c7837M24868.m24882(C6898.C6909.f19652, 4096);
            this.f23154 = m24453(c7837M24868.m24890(C6898.C6909.f19646));
            this.f23155 = c7837M24868.m24882(C6898.C6909.f19656, 4096);
            if (c7837M24868.m24896(C6898.C6909.f19647)) {
                this.f23156 = c7837M24868.m3933(C6898.C6909.f19647, false) ? 1 : 0;
            } else {
                this.f23156 = this.f23143;
            }
            this.f23157 = c7837M24868.m3933(C6898.C6909.f19639, false);
            this.f23158 = c7837M24868.m3933(C6898.C6909.f19640, this.f23144);
            this.f23159 = c7837M24868.m3933(C6898.C6909.f19637, this.f23145);
            this.f23160 = c7837M24868.m24882(C6898.C6909.f19657, -1);
            this.f23164 = c7837M24868.m24890(C6898.C6909.f19648);
            this.f23161 = c7837M24868.m24888(C6898.C6909.f19649, 0);
            this.f23162 = c7837M24868.m24890(C6898.C6909.f19651);
            String strM24890 = c7837M24868.m24890(C6898.C6909.f19650);
            this.f23163 = strM24890;
            boolean z = strM24890 != null;
            if (z && this.f23161 == 0 && this.f23162 == null) {
                this.f23165 = (AbstractC3087) m24455(strM24890, C7683.f23129, C7683.this.f3016);
            } else {
                if (z) {
                    Log.w(C7683.f23123, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f23165 = null;
            }
            this.f23166 = c7837M24868.m24891(C6898.C6909.f19653);
            this.f23167 = c7837M24868.m24891(C6898.C6909.f19658);
            if (c7837M24868.m24896(C6898.C6909.f19655)) {
                this.f23169 = C4533.m13289(c7837M24868.m24882(C6898.C6909.f19655, -1), this.f23169);
            } else {
                this.f23169 = null;
            }
            if (c7837M24868.m24896(C6898.C6909.f19654)) {
                this.f23168 = c7837M24868.m24871(C6898.C6909.f19654);
            } else {
                this.f23168 = null;
            }
            c7837M24868.m24899();
            this.f23146 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m24458() {
            this.f3020 = 0;
            this.f23141 = 0;
            this.f23142 = 0;
            this.f23143 = 0;
            this.f23144 = true;
            this.f23145 = true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m24459(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f23157).setVisible(this.f23158).setEnabled(this.f23159).setCheckable(this.f23156 >= 1).setTitleCondensed(this.f23150).setIcon(this.f23151);
            int i = this.f23160;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f23164 != null) {
                if (C7683.this.f23130.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1324(C7683.this.m3781(), this.f23164));
            }
            if (this.f23156 >= 2) {
                if (menuItem instanceof C8697) {
                    ((C8697) menuItem).m29044(true);
                } else if (menuItem instanceof MenuItemC6158) {
                    ((MenuItemC6158) menuItem).m19001(true);
                }
            }
            String str = this.f23162;
            if (str != null) {
                menuItem.setActionView((View) m24455(str, C7683.f23128, C7683.this.f3015));
                z = true;
            }
            int i2 = this.f23161;
            if (i2 > 0) {
                if (z) {
                    Log.w(C7683.f23123, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC3087 abstractC3087 = this.f23165;
            if (abstractC3087 != null) {
                C6155.m18976(menuItem, abstractC3087);
            }
            C6155.m18980(menuItem, this.f23166);
            C6155.m18987(menuItem, this.f23167);
            C6155.m18979(menuItem, this.f23152, this.f23153);
            C6155.m18983(menuItem, this.f23154, this.f23155);
            PorterDuff.Mode mode = this.f23169;
            if (mode != null) {
                C6155.m18982(menuItem, mode);
            }
            ColorStateList colorStateList = this.f23168;
            if (colorStateList != null) {
                C6155.m18981(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f23128 = clsArr;
        f23129 = clsArr;
    }

    public C7683(Context context) {
        super(context);
        this.f23130 = context;
        Object[] objArr = {context};
        this.f3015 = objArr;
        this.f3016 = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(@InterfaceC5683 int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC7682)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f23130.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C8694) {
                    C8694 c8694 = (C8694) menu;
                    if (c8694.isDispatchingItemsChanged()) {
                        c8694.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                m24452(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C8694) menu).startDispatchingItemsChanged();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C8694) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m3780(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3780(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Object m3781() {
        if (this.f23131 == null) {
            this.f23131 = m3780(this.f23130);
        }
        return this.f23131;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24452(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C1325 c1325 = new C1325(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f23124)) {
                    throw new RuntimeException("Expecting menu, got " + name);
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
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c1325.m24458();
                    } else if (name2.equals("item")) {
                        if (!c1325.m24454()) {
                            AbstractC3087 abstractC3087 = c1325.f23165;
                            if (abstractC3087 == null || !abstractC3087.mo179()) {
                                c1325.m3782();
                            } else {
                                c1325.m3783();
                            }
                        }
                    } else if (name2.equals(f23124)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c1325.m24456(attributeSet);
                } else if (name3.equals("item")) {
                    c1325.m24457(attributeSet);
                } else if (name3.equals(f23124)) {
                    m24452(xmlPullParser, attributeSet, c1325.m3783());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
