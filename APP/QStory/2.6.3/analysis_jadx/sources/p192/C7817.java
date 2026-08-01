package p192;

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
import androidx.appcompat.widget.AbstractC0216;
import bsh.C2633;
import java.io.IOException;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p162.AbstractC7653;
import p188.AbstractC7773;
import p190.ActionProviderVisibilityListenerC7792;
import p190.MenuC7802;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7817 extends MenuInflater {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Class[] f21326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Class[] f21327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f21328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f21329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f21330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f21331;

    static {
        Class[] clsArr = {Context.class};
        f21327 = clsArr;
        f21326 = clsArr;
    }

    public C7817(Context context) {
        super(context);
        this.f21329 = context;
        Object[] objArr = {context};
        this.f21331 = objArr;
        this.f21330 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m13178(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m13178(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC7802)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f21329.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC7802) {
                    MenuC7802 menuC7802 = (MenuC7802) menu;
                    if (!menuC7802.f21260) {
                        menuC7802.m13159();
                        z = true;
                    }
                }
                m13179(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC7802) menu).m13161();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC7802) menu).m13161();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13179(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C7813 c7813 = new C7813(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    C2633.m5339("Expecting menu, got ".concat(name));
                    return;
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
                C2633.m5339("Unexpected end of document");
                return;
            }
            Menu menu2 = c7813.f21304;
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
                            c7813.f21303 = 0;
                            c7813.f21302 = 0;
                            c7813.f21301 = 0;
                            c7813.f21300 = 0;
                            c7813.f21299 = true;
                            c7813.f21318 = true;
                        } else if (name2.equals("item")) {
                            if (!c7813.f21317) {
                                ActionProviderVisibilityListenerC7792 actionProviderVisibilityListenerC7792 = c7813.f21296;
                                if (actionProviderVisibilityListenerC7792 == null || !actionProviderVisibilityListenerC7792.f21198.hasSubMenu()) {
                                    c7813.f21317 = true;
                                    c7813.m13173(menu2.add(c7813.f21303, c7813.f21321, c7813.f21322, c7813.f21319));
                                } else {
                                    c7813.f21317 = true;
                                    c7813.m13173(menu2.addSubMenu(c7813.f21303, c7813.f21321, c7813.f21322, c7813.f21319).getItem());
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
                    Context context = this.f21329;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21101);
                        c7813.f21303 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c7813.f21302 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c7813.f21301 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c7813.f21300 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c7813.f21299 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c7813.f21318 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21098);
                            c7813.f21321 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c7813.f21322 = (typedArrayObtainStyledAttributes2.getInt(5, c7813.f21302) & Opcodes.V_PREVIEW) | (typedArrayObtainStyledAttributes2.getInt(6, c7813.f21301) & com.android.dx.io.Opcodes.MAX_VALUE);
                            c7813.f21319 = typedArrayObtainStyledAttributes2.getText(7);
                            c7813.f21320 = typedArrayObtainStyledAttributes2.getText(8);
                            c7813.f21312 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c7813.f21311 = string == null ? (char) 0 : string.charAt(0);
                            c7813.f21315 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c7813.f21316 = string2 == null ? (char) 0 : string2.charAt(0);
                            c7813.f21313 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c7813.f21314 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c7813.f21314 = c7813.f21300;
                            }
                            c7813.f21306 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c7813.f21305 = typedArrayObtainStyledAttributes2.getBoolean(4, c7813.f21299);
                            c7813.f21309 = typedArrayObtainStyledAttributes2.getBoolean(1, c7813.f21318);
                            c7813.f21310 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c7813.f21297 = typedArrayObtainStyledAttributes2.getString(12);
                            c7813.f21307 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c7813.f21308 = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c7813.f21307 == 0 && c7813.f21308 == null) {
                                c7813.f21296 = (ActionProviderVisibilityListenerC7792) c7813.m13174(string3, f21326, this.f21330);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c7813.f21296 = null;
                            }
                            c7813.f21295 = typedArrayObtainStyledAttributes2.getText(17);
                            c7813.f21294 = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c7813.f21292 = AbstractC0216.m722(typedArrayObtainStyledAttributes2.getInt(19, -1), c7813.f21292);
                            } else {
                                c7813.f21292 = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC7653.m12919(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c7813.f21293 = colorStateList;
                            } else {
                                c7813.f21293 = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c7813.f21317 = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c7813.f21317 = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(c7813.f21303, c7813.f21321, c7813.f21322, c7813.f21319);
                            c7813.m13173(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m13179(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
