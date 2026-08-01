package p208;

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
import androidx.appcompat.widget.AbstractC1063;
import bsh.C3466;
import java.io.IOException;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p178.AbstractC8482;
import p204.AbstractC8602;
import p206.ActionProviderVisibilityListenerC8621;
import p206.MenuC8631;

/* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8646 extends MenuInflater {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Class[] f21671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Class[] f21672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f21673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f21674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f21675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] f21676;

    static {
        Class[] clsArr = {Context.class};
        f21672 = clsArr;
        f21671 = clsArr;
    }

    public C8646(Context context) {
        super(context);
        this.f21674 = context;
        Object[] objArr = {context};
        this.f21676 = objArr;
        this.f21675 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m13737(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m13737(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC8631)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f21674.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC8631) {
                    MenuC8631 menuC8631 = (MenuC8631) menu;
                    if (!menuC8631.f21605) {
                        menuC8631.m13718();
                        z = true;
                    }
                }
                m13738(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC8631) menu).m13720();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC8631) menu).m13720();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13738(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C8642 c8642 = new C8642(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    C3466.m5899("Expecting menu, got ".concat(name));
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
                C3466.m5899("Unexpected end of document");
                return;
            }
            Menu menu2 = c8642.f21649;
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
                            c8642.f21648 = 0;
                            c8642.f21647 = 0;
                            c8642.f21646 = 0;
                            c8642.f21645 = 0;
                            c8642.f21644 = true;
                            c8642.f21663 = true;
                        } else if (name2.equals("item")) {
                            if (!c8642.f21662) {
                                ActionProviderVisibilityListenerC8621 actionProviderVisibilityListenerC8621 = c8642.f21641;
                                if (actionProviderVisibilityListenerC8621 == null || !actionProviderVisibilityListenerC8621.f21543.hasSubMenu()) {
                                    c8642.f21662 = true;
                                    c8642.m13732(menu2.add(c8642.f21648, c8642.f21666, c8642.f21667, c8642.f21664));
                                } else {
                                    c8642.f21662 = true;
                                    c8642.m13732(menu2.addSubMenu(c8642.f21648, c8642.f21666, c8642.f21667, c8642.f21664).getItem());
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
                    Context context = this.f21674;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21446);
                        c8642.f21648 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c8642.f21647 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c8642.f21646 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c8642.f21645 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c8642.f21644 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c8642.f21663 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21443);
                            c8642.f21666 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c8642.f21667 = (typedArrayObtainStyledAttributes2.getInt(5, c8642.f21647) & Opcodes.V_PREVIEW) | (typedArrayObtainStyledAttributes2.getInt(6, c8642.f21646) & com.android.p002dx.p005io.Opcodes.MAX_VALUE);
                            c8642.f21664 = typedArrayObtainStyledAttributes2.getText(7);
                            c8642.f21665 = typedArrayObtainStyledAttributes2.getText(8);
                            c8642.f21657 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c8642.f21656 = string == null ? (char) 0 : string.charAt(0);
                            c8642.f21660 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c8642.f21661 = string2 == null ? (char) 0 : string2.charAt(0);
                            c8642.f21658 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c8642.f21659 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c8642.f21659 = c8642.f21645;
                            }
                            c8642.f21651 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c8642.f21650 = typedArrayObtainStyledAttributes2.getBoolean(4, c8642.f21644);
                            c8642.f21654 = typedArrayObtainStyledAttributes2.getBoolean(1, c8642.f21663);
                            c8642.f21655 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c8642.f21642 = typedArrayObtainStyledAttributes2.getString(12);
                            c8642.f21652 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c8642.f21653 = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c8642.f21652 == 0 && c8642.f21653 == null) {
                                c8642.f21641 = (ActionProviderVisibilityListenerC8621) c8642.m13733(string3, f21671, this.f21675);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c8642.f21641 = null;
                            }
                            c8642.f21640 = typedArrayObtainStyledAttributes2.getText(17);
                            c8642.f21639 = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c8642.f21637 = AbstractC1063.m1282(typedArrayObtainStyledAttributes2.getInt(19, -1), c8642.f21637);
                            } else {
                                c8642.f21637 = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC8482.m13478(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c8642.f21638 = colorStateList;
                            } else {
                                c8642.f21638 = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c8642.f21662 = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c8642.f21662 = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(c8642.f21648, c8642.f21666, c8642.f21667, c8642.f21664);
                            c8642.m13732(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m13738(xmlPullParser2, attributeSet, subMenuAddSubMenu);
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
