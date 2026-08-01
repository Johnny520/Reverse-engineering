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
import bsh.C2632;
import java.io.IOException;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p162.AbstractC7652;
import p188.AbstractC7772;
import p190.ActionProviderVisibilityListenerC7791;
import p190.MenuC7801;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7816 extends MenuInflater {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Class[] f21329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Class[] f21330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f21331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f21332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f21333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f21334;

    static {
        Class[] clsArr = {Context.class};
        f21330 = clsArr;
        f21329 = clsArr;
    }

    public C7816(Context context) {
        super(context);
        this.f21332 = context;
        Object[] objArr = {context};
        this.f21334 = objArr;
        this.f21333 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m13150(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m13150(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC7801)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f21332.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC7801) {
                    MenuC7801 menuC7801 = (MenuC7801) menu;
                    if (!menuC7801.f21263) {
                        menuC7801.m13131();
                        z = true;
                    }
                }
                m13151(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC7801) menu).m13133();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC7801) menu).m13133();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13151(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C7812 c7812 = new C7812(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    C2632.m5294("Expecting menu, got ".concat(name));
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
                C2632.m5294("Unexpected end of document");
                return;
            }
            Menu menu2 = c7812.f21307;
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
                            c7812.f21306 = 0;
                            c7812.f21305 = 0;
                            c7812.f21304 = 0;
                            c7812.f21303 = 0;
                            c7812.f21302 = true;
                            c7812.f21321 = true;
                        } else if (name2.equals("item")) {
                            if (!c7812.f21320) {
                                ActionProviderVisibilityListenerC7791 actionProviderVisibilityListenerC7791 = c7812.f21299;
                                if (actionProviderVisibilityListenerC7791 == null || !actionProviderVisibilityListenerC7791.f21201.hasSubMenu()) {
                                    c7812.f21320 = true;
                                    c7812.m13145(menu2.add(c7812.f21306, c7812.f21324, c7812.f21325, c7812.f21322));
                                } else {
                                    c7812.f21320 = true;
                                    c7812.m13145(menu2.addSubMenu(c7812.f21306, c7812.f21324, c7812.f21325, c7812.f21322).getItem());
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
                    Context context = this.f21332;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21104);
                        c7812.f21306 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c7812.f21305 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c7812.f21304 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c7812.f21303 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c7812.f21302 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c7812.f21321 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21101);
                            c7812.f21324 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c7812.f21325 = (typedArrayObtainStyledAttributes2.getInt(5, c7812.f21305) & Opcodes.V_PREVIEW) | (typedArrayObtainStyledAttributes2.getInt(6, c7812.f21304) & com.android.dx.io.Opcodes.MAX_VALUE);
                            c7812.f21322 = typedArrayObtainStyledAttributes2.getText(7);
                            c7812.f21323 = typedArrayObtainStyledAttributes2.getText(8);
                            c7812.f21315 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c7812.f21314 = string == null ? (char) 0 : string.charAt(0);
                            c7812.f21318 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c7812.f21319 = string2 == null ? (char) 0 : string2.charAt(0);
                            c7812.f21316 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c7812.f21317 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c7812.f21317 = c7812.f21303;
                            }
                            c7812.f21309 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c7812.f21308 = typedArrayObtainStyledAttributes2.getBoolean(4, c7812.f21302);
                            c7812.f21312 = typedArrayObtainStyledAttributes2.getBoolean(1, c7812.f21321);
                            c7812.f21313 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c7812.f21300 = typedArrayObtainStyledAttributes2.getString(12);
                            c7812.f21310 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c7812.f21311 = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c7812.f21310 == 0 && c7812.f21311 == null) {
                                c7812.f21299 = (ActionProviderVisibilityListenerC7791) c7812.m13146(string3, f21329, this.f21333);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c7812.f21299 = null;
                            }
                            c7812.f21298 = typedArrayObtainStyledAttributes2.getText(17);
                            c7812.f21297 = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c7812.f21295 = AbstractC0216.m721(typedArrayObtainStyledAttributes2.getInt(19, -1), c7812.f21295);
                            } else {
                                c7812.f21295 = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC7652.m12890(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c7812.f21296 = colorStateList;
                            } else {
                                c7812.f21296 = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c7812.f21320 = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c7812.f21320 = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(c7812.f21306, c7812.f21324, c7812.f21325, c7812.f21322);
                            c7812.m13145(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m13151(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
