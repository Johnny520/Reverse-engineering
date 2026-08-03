package p053e;

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
import org.xmlpull.v1.XmlPullParserException;
import p034S.AbstractC0324d;
import p048b.AbstractC0550a;
import p055f.MenuC0779j;
import p056f0.AbstractC0805P;
import p057g.AbstractC0886W;

/* JADX INFO: renamed from: e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0766d extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f2713e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f2714f;

    /* JADX INFO: renamed from: a */
    public final Object[] f2715a;

    /* JADX INFO: renamed from: b */
    public final Object[] f2716b;

    /* JADX INFO: renamed from: c */
    public final Context f2717c;

    /* JADX INFO: renamed from: d */
    public Object f2718d;

    static {
        Class[] clsArr = {Context.class};
        f2713e = clsArr;
        f2714f = clsArr;
    }

    public C0766d(Context context) {
        super(context);
        this.f2717c = context;
        Object[] objArr = {context};
        this.f2715a = objArr;
        this.f2716b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1959a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1959a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [e.d] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: b */
    public final void m1960b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i2;
        ?? r6;
        ColorStateList colorStateList;
        int resourceId;
        C0765c c0765c = new C0765c(this, menu);
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
                    r6 = r4;
                    z2 = z2;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        r6 = r4;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0765c.f2688b = 0;
                            c0765c.f2689c = 0;
                            c0765c.f2690d = 0;
                            c0765c.f2691e = 0;
                            c0765c.f2692f = r4;
                            c0765c.f2693g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0765c.f2694h) {
                                c0765c.f2694h = r4;
                                c0765c.m1958b(c0765c.f2687a.add(c0765c.f2688b, c0765c.f2695i, c0765c.f2696j, c0765c.f2697k));
                            }
                        } else if (name2.equals("menu")) {
                            ?? r62 = r4;
                            z2 = r62 == true ? 1 : 0;
                            r6 = r62;
                        }
                        r6 = r4;
                        z2 = z2;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = r6;
                i2 = 2;
                z2 = z2;
                z3 = z3;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C0766d c0766d = c0765c.f2686D;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = c0766d.f2717c.obtainStyledAttributes(attributeSet, AbstractC0550a.f1628m);
                        c0765c.f2688b = ObtainStyledAttributes.getResourceId(r4, 0);
                        c0765c.f2689c = ObtainStyledAttributes.getInt(3, 0);
                        c0765c.f2690d = ObtainStyledAttributes.getInt(4, 0);
                        c0765c.f2691e = ObtainStyledAttributes.getInt(5, 0);
                        c0765c.f2692f = ObtainStyledAttributes.getBoolean(2, r4);
                        c0765c.f2693g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0766d.f2717c;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0550a.f1629n);
                            c0765c.f2695i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                            c0765c.f2696j = (typedArrayObtainStyledAttributes.getInt(5, c0765c.f2689c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, c0765c.f2690d) & 65535);
                            c0765c.f2697k = typedArrayObtainStyledAttributes.getText(7);
                            c0765c.f2698l = typedArrayObtainStyledAttributes.getText(8);
                            c0765c.f2699m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes.getString(9);
                            c0765c.f2700n = string == null ? (char) 0 : string.charAt(0);
                            c0765c.f2701o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes.getString(10);
                            c0765c.f2702p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0765c.f2703q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                                c0765c.f2704r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0765c.f2704r = c0765c.f2691e;
                            }
                            c0765c.f2705s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                            c0765c.f2706t = typedArrayObtainStyledAttributes.getBoolean(4, c0765c.f2692f);
                            c0765c.f2707u = typedArrayObtainStyledAttributes.getBoolean(1, c0765c.f2693g);
                            c0765c.f2708v = typedArrayObtainStyledAttributes.getInt(21, -1);
                            c0765c.f2711y = typedArrayObtainStyledAttributes.getString(12);
                            c0765c.f2709w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                            c0765c.f2710x = typedArrayObtainStyledAttributes.getString(15);
                            String string3 = typedArrayObtainStyledAttributes.getString(14);
                            if (string3 != null && c0765c.f2709w == 0 && c0765c.f2710x == null) {
                                AbstractC0324d.m726i(c0765c.m1957a(string3, f2714f, c0766d.f2716b));
                            }
                            c0765c.f2712z = typedArrayObtainStyledAttributes.getText(17);
                            c0765c.f2683A = typedArrayObtainStyledAttributes.getText(22);
                            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                                c0765c.f2685C = AbstractC0886W.m2221c(typedArrayObtainStyledAttributes.getInt(19, -1), c0765c.f2685C);
                            } else {
                                c0765c.f2685C = null;
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0805P.m2049p(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                                }
                                c0765c.f2684B = colorStateList;
                            } else {
                                c0765c.f2684B = null;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            c0765c.f2694h = false;
                            r6 = 1;
                        } else if (name3.equals("menu")) {
                            r6 = 1;
                            c0765c.f2694h = true;
                            SubMenu subMenuAddSubMenu = c0765c.f2687a.addSubMenu(c0765c.f2688b, c0765c.f2695i, c0765c.f2696j, c0765c.f2697k);
                            c0765c.m1958b(subMenuAddSubMenu.getItem());
                            m1960b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            r6 = 1;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = r6;
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    }
                }
                r6 = r4;
                z2 = z2;
            }
            eventType = xmlResourceParser.next();
            r4 = r6;
            i2 = 2;
            z2 = z2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0779j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f2717c.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC0779j) {
                    MenuC0779j menuC0779j = (MenuC0779j) menu;
                    if (!menuC0779j.f2797m) {
                        menuC0779j.m2013s();
                        z2 = true;
                    }
                }
                m1960b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((MenuC0779j) menu).m2012r();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0779j) menu).m2012r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
