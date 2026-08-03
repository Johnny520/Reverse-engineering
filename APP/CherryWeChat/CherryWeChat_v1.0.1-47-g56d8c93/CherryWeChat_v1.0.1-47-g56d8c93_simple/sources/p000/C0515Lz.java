package p000;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Lz */
/* JADX INFO: loaded from: classes.dex */
public final class C0515Lz extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f1677e = null;

    /* JADX INFO: renamed from: f */
    public static final Class[] f1678f = null;

    /* JADX INFO: renamed from: a */
    public final Object[] f1679a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1680b;

    /* JADX INFO: renamed from: c */
    public final Context f1681c;

    /* JADX INFO: renamed from: d */
    public Object f1682d;

    static {
        Class[] r0 = {Context.class};
        f1677e = r0;
        f1678f = r0;
    }

    public C0515Lz(Context r1) {
        super(r1);
        this.f1681c = r1;
        Object[] r12 = {r1};
        this.f1679a = r12;
        this.f1680b = r12;
    }

    /* JADX INFO: renamed from: a */
    public static Object m998a(Object r1) {
        if ((r1 instanceof Activity) == false) goto L6;
        return r1;
    L6:
        if ((r1 instanceof ContextWrapper) == true) goto L8;
        return r1;
    L8:
        return m998a(((ContextWrapper) r1).getBaseContext());
    }

    /* JADX INFO: renamed from: b */
    public final void m999b(XmlPullParser r17, AttributeSet r18, Menu r19) {
        C0472Kz r2 = new C0472Kz(this, r19);
        int r3 = r17.getEventType();
    L3:
        int r5 = 2;
        if (r3 == 2) goto L5;
        r3 = r17.next();
        if (r3 != 1) goto L3;
    L12:
        boolean r9 = false;
        boolean r10 = false;
        String r11 = null;
    L13:
        if (r9 == true) goto L92;
        if (r3 == 1) goto L91;
        if (r3 == r5) goto L41;
        if (r3 == 3) goto L19;
    L18:
        XmlPullParser r8 = r17;
        r9 = r9;
    L89:
        r3 = r8.next();
        r5 = 2;
        r9 = r9;
        r10 = r10;
        goto L13
    L19:
        String r32 = r17.getName();
        if (r10 == false) goto L25;
        if (r32.equals(r11) == false) goto L25;
        r8 = r17;
        r10 = false;
        r11 = null;
    L25:
        if (r32.equals("group") == false) goto L28;
        r2.f1538b = 0;
        r2.f1539c = 0;
        r2.f1540d = 0;
        r2.f1541e = 0;
        r2.f1542f = true;
        r2.f1543g = true;
        goto L18
    L28:
        if (r32.equals("item") == false) goto L38;
        if (r2.f1544h == true) goto L18;
        ActionProviderVisibilityListenerC2470rr r33 = r2.f1562z;
        if (r33 != null) goto L34;
    L36:
        r2.f1544h = true;
        r2.m922b(r2.f1537a.add(r2.f1538b, r2.f1545i, r2.f1546j, r2.f1547k));
        goto L18
    L34:
        if (r33.f8695b.hasSubMenu() == false) goto L36;
        r2.f1544h = true;
        r2.m922b(r2.f1537a.addSubMenu(r2.f1538b, r2.f1545i, r2.f1546j, r2.f1547k).getItem());
        goto L18
    L38:
        if (r32.equals("menu") == false) goto L18;
        r8 = r17;
        r9 = true;
        goto L89
    L41:
        if (r10 == true) goto L18;
        String r34 = r17.getName();
        boolean r13 = r34.equals("group");
        Context r15 = this.f1681c;
        if (r13 == false) goto L47;
        TypedArray r35 = r15.obtainStyledAttributes(r18, AbstractC0982Wu.f3081p);
        r2.f1538b = r35.getResourceId(1, 0);
        r2.f1539c = r35.getInt(3, 0);
        r2.f1540d = r35.getInt(4, 0);
        r2.f1541e = r35.getInt(5, 0);
        r2.f1542f = r35.getBoolean(2, true);
        r2.f1543g = r35.getBoolean(0, true);
        r35.recycle();
        goto L18
    L47:
        if (r34.equals("item") == false) goto L86;
        TypedArray r36 = r15.obtainStyledAttributes(r18, AbstractC0982Wu.f3082q);
        r2.f1545i = r36.getResourceId(2, 0);
        r2.f1546j = (r36.getInt(5, r2.f1539c) & (-65536)) | (r36.getInt(6, r2.f1540d) & 65535);
        r2.f1547k = r36.getText(7);
        r2.f1548l = r36.getText(8);
        r2.f1549m = r36.getResourceId(0, 0);
        String r82 = r36.getString(9);
        if (r82 != null) goto L51;
        char r83 = 0;
    L52:
        r2.f1550n = r83;
        r2.f1551o = r36.getInt(16, 4096);
        String r84 = r36.getString(10);
        if (r84 != null) goto L55;
        char r85 = 0;
    L56:
        r2.f1552p = r85;
        r2.f1553q = r36.getInt(20, 4096);
        if (r36.hasValue(11) == false) goto L59;
        r2.f1554r = r36.getBoolean(11, false) ? 1 : 0;
    L60:
        r2.f1555s = r36.getBoolean(3, false);
        r2.f1556t = r36.getBoolean(4, r2.f1542f);
        r2.f1557u = r36.getBoolean(1, r2.f1543g);
        r2.f1558v = r36.getInt(21, -1);
        r2.f1561y = r36.getString(12);
        r2.f1559w = r36.getResourceId(13, 0);
        r2.f1560x = r36.getString(15);
        String r52 = r36.getString(14);
        if (r52 != null) goto L63;
    L67:
        r2.f1562z = null;
    L68:
        r2.f1532A = r36.getText(17);
        r2.f1533B = r36.getText(22);
        if (r36.hasValue(19) == false) goto L71;
        r2.f1535D = AbstractC0107Ce.m161c(r36.getInt(19, -1), r2.f1535D);
    L73:
        if (r36.hasValue(18) == true) goto L75;
        r2.f1534C = null;
    L84:
        r36.recycle();
        r2.f1544h = false;
        r8 = r17;
        goto L89
    L75:
        if (r36.hasValue(18) == false) goto L81;
        int r86 = r36.getResourceId(18, 0);
        if (r86 == 0) goto L81;
        ColorStateList r87 = AbstractC0295Gu.m622o(r15, r86);
        if (r87 == null) goto L81;
    L82:
        r2.f1534C = r87;
    L81:
        r87 = r36.getColorStateList(18);
        goto L82
    L71:
        r2.f1535D = null;
        goto L73
    L63:
        if (r2.f1559w != 0) goto L67;
        if (r2.f1560x != null) goto L67;
        r2.f1562z = (ActionProviderVisibilityListenerC2470rr) r2.m921a(r52, f1678f, this.f1680b);
        goto L68
    L59:
        r2.f1554r = r2.f1541e;
        goto L60
    L55:
        r85 = r84.charAt(0);
        goto L56
    L51:
        r83 = r82.charAt(0);
        goto L52
    L86:
        if (r34.equals("menu") == false) goto L88;
        r2.f1544h = true;
        SubMenu r37 = r2.f1537a.addSubMenu(r2.f1538b, r2.f1545i, r2.f1546j, r2.f1547k);
        r2.m922b(r37.getItem());
        r8 = r17;
        m999b(r8, r18, r37);
        goto L89
    L88:
        r8 = r17;
        r11 = r34;
        r10 = true;
        goto L89
    L91:
        throw new RuntimeException("Unexpected end of document");
    L92:
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
    public final void inflate(int r6, Menu r7) {
        if ((r7 instanceof MenuC2204lr) == true) goto L6;
        super.inflate(r6, r7);
        return;
    L6:
        XmlResourceParser r1 = null;
        boolean r2 = false;
        r1 = this.f1681c.getResources().getLayout(r6);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        AttributeSet r62 = Xml.asAttributeSet(r1);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if ((r7 instanceof MenuC2204lr) == false) goto L18;
        MenuC2204lr r3 = (MenuC2204lr) r7;     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if (r3.f7675p == true) goto L18;
        r3.m4442w();     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        r2 = true;
    L18:
        m999b(r1, r62, r7);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if (r2 == false) goto L21;
        ((MenuC2204lr) r7).m4441v();
    L21:
        r1.close();
        return;
    L12:
        th = move-exception;
        if (r2 == false) goto L29;
        ((MenuC2204lr) r7).m4441v();
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
