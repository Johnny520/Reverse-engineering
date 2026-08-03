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
    public static final Class[] f2713e = null;

    /* JADX INFO: renamed from: f */
    public static final Class[] f2714f = null;

    /* JADX INFO: renamed from: a */
    public final Object[] f2715a;

    /* JADX INFO: renamed from: b */
    public final Object[] f2716b;

    /* JADX INFO: renamed from: c */
    public final Context f2717c;

    /* JADX INFO: renamed from: d */
    public Object f2718d;

    static {
        Class[] r02 = {Context.class};
        f2713e = r02;
        f2714f = r02;
    }

    public C0766d(Context r1) {
        super(r1);
        this.f2717c = r1;
        Object[] r12 = {r1};
        this.f2715a = r12;
        this.f2716b = r12;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1959a(Object r1) {
        if ((r1 instanceof Activity) == false) goto L6;
        return r1;
    L6:
        if ((r1 instanceof ContextWrapper) == true) goto L8;
        return r1;
    L8:
        return m1959a(((ContextWrapper) r1).getBaseContext());
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
    public final void m1960b(XmlResourceParser r17, AttributeSet r18, Menu r19) {
        C0765c r2 = new C0765c(this, r19);
        int r3 = r17.getEventType();
    L3:
        ?? r4 = 1;
        int r6 = 2;
        if (r3 == 2) goto L5;
        r3 = r17.next();
        if (r3 != 1) goto L3;
    L12:
        boolean r9 = false;
        boolean r10 = false;
        String r11 = null;
    L13:
        if (r9 == true) goto L86;
        if (r3 == r4) goto L85;
        if (r3 == r6) goto L36;
        if (r3 == 3) goto L19;
    L18:
        ?? r62 = r4;
        r9 = r9;
    L83:
        r3 = r17.next();
        r4 = r62;
        r6 = 2;
        r9 = r9;
        r10 = r10;
        goto L13
    L19:
        String r32 = r17.getName();
        if (r10 == false) goto L25;
        if (r32.equals(r11) == false) goto L25;
        r62 = r4;
        r10 = false;
        r11 = null;
    L25:
        if (r32.equals("group") == false) goto L28;
        r2.f2688b = 0;
        r2.f2689c = 0;
        r2.f2690d = 0;
        r2.f2691e = 0;
        r2.f2692f = r4;
        r2.f2693g = r4;
        goto L18
    L28:
        if (r32.equals("item") == false) goto L33;
        if (r2.f2694h == true) goto L18;
        r2.f2694h = r4;
        r2.m1958b(r2.f2687a.add(r2.f2688b, r2.f2695i, r2.f2696j, r2.f2697k));
        goto L18
    L33:
        if (r32.equals("menu") == false) goto L18;
        ?? r63 = r4;
        r9 = r63 == true ? 1 : 0;
        r62 = r63;
        goto L83
    L36:
        if (r10 == true) goto L18;
        String r33 = r17.getName();
        boolean r13 = r33.equals("group");
        C0766d r64 = r2.f2686D;
        if (r13 == false) goto L42;
        ?? r34 = r64.f2717c.obtainStyledAttributes(r18, AbstractC0550a.f1628m);
        r2.f2688b = r34.getResourceId(r4, 0);
        r2.f2689c = r34.getInt(3, 0);
        r2.f2690d = r34.getInt(4, 0);
        r2.f2691e = r34.getInt(5, 0);
        r2.f2692f = r34.getBoolean(2, r4);
        r2.f2693g = r34.getBoolean(0, r4);
        r34.recycle();
        goto L18
    L42:
        if (r33.equals("item") == false) goto L80;
        Context r35 = r64.f2717c;
        TypedArray r12 = r35.obtainStyledAttributes(r18, AbstractC0550a.f1629n);
        r2.f2695i = r12.getResourceId(2, 0);
        r2.f2696j = (r12.getInt(5, r2.f2689c) & (-65536)) | (r12.getInt(6, r2.f2690d) & 65535);
        r2.f2697k = r12.getText(7);
        r2.f2698l = r12.getText(8);
        r2.f2699m = r12.getResourceId(0, 0);
        String r42 = r12.getString(9);
        if (r42 != null) goto L46;
        char r43 = 0;
    L47:
        r2.f2700n = r43;
        r2.f2701o = r12.getInt(16, 4096);
        String r44 = r12.getString(10);
        if (r44 != null) goto L50;
        char r45 = 0;
    L51:
        r2.f2702p = r45;
        r2.f2703q = r12.getInt(20, 4096);
        if (r12.hasValue(11) == false) goto L54;
        r2.f2704r = r12.getBoolean(11, false) ? 1 : 0;
    L55:
        r2.f2705s = r12.getBoolean(3, false);
        r2.f2706t = r12.getBoolean(4, r2.f2692f);
        r2.f2707u = r12.getBoolean(1, r2.f2693g);
        r2.f2708v = r12.getInt(21, -1);
        r2.f2711y = r12.getString(12);
        r2.f2709w = r12.getResourceId(13, 0);
        r2.f2710x = r12.getString(15);
        String r46 = r12.getString(14);
        if (r46 != null) goto L58;
    L62:
        r2.f2712z = r12.getText(17);
        r2.f2683A = r12.getText(22);
        if (r12.hasValue(19) == false) goto L65;
        r2.f2685C = AbstractC0886W.m2221c(r12.getInt(19, -1), r2.f2685C);
    L67:
        if (r12.hasValue(18) == true) goto L69;
        r2.f2684B = null;
    L78:
        r12.recycle();
        r2.f2694h = false;
        r62 = 1;
        goto L83
    L69:
        if (r12.hasValue(18) == false) goto L75;
        int r65 = r12.getResourceId(18, 0);
        if (r65 == 0) goto L75;
        ColorStateList r36 = AbstractC0805P.m2049p(r35, r65);
        if (r36 == null) goto L75;
    L76:
        r2.f2684B = r36;
    L75:
        r36 = r12.getColorStateList(18);
        goto L76
    L65:
        r2.f2685C = null;
        goto L67
    L58:
        if (r2.f2709w != 0) goto L62;
        if (r2.f2710x != null) goto L62;
        AbstractC0324d.m726i(r2.m1957a(r46, f2714f, r64.f2716b));
        goto L62
    L54:
        r2.f2704r = r2.f2691e;
        goto L55
    L50:
        r45 = r44.charAt(0);
        goto L51
    L46:
        r43 = r42.charAt(0);
        goto L47
    L80:
        if (r33.equals("menu") == false) goto L82;
        r62 = 1;
        r2.f2694h = true;
        SubMenu r37 = r2.f2687a.addSubMenu(r2.f2688b, r2.f2695i, r2.f2696j, r2.f2697k);
        r2.m1958b(r37.getItem());
        m1960b(r17, r18, r37);
        goto L83
    L82:
        r62 = 1;
        r11 = r33;
        r10 = true;
        goto L83
    L85:
        throw new RuntimeException("Unexpected end of document");
    L86:
        return;
    L5:
        String r38 = r17.getName();
        if (r38.equals("menu") == false) goto L9;
        r3 = r17.next();
        goto L12
    L9:
        throw new RuntimeException("Expecting menu, got ".concat(r38));
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r7, Menu r8) {
        if ((r8 instanceof MenuC0779j) == true) goto L6;
        super.inflate(r7, r8);
        return;
    L6:
        XmlResourceParser r1 = null;
        boolean r2 = false;
        r1 = this.f2717c.getResources().getLayout(r7);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        AttributeSet r72 = Xml.asAttributeSet(r1);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if ((r8 instanceof MenuC0779j) == false) goto L18;
        MenuC0779j r3 = (MenuC0779j) r8;     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if ((!r3.f2797m) == false) goto L18;
        r3.m2013s();     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        r2 = true;
    L18:
        m1960b(r1, r72, r8);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if (r2 == false) goto L21;
        ((MenuC0779j) r8).m2012r();
    L21:
        r1.close();
        return;
    L12:
        th = move-exception;
        if (r2 == false) goto L29;
        ((MenuC0779j) r8).m2012r();
    L29:
        if (r1 == null) goto L31;
        r1.close();
    L31:
        throw th;
    L14:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L12
    L16:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L12
    }
}
