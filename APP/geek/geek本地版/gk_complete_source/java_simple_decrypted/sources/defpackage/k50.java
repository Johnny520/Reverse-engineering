package defpackage;

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
    public static final Class[] e = null;
    public static final Class[] f = null;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] r0 = {Context.class};
        e = r0;
        f = r0;
    }

    public k50(Context r1) {
        super(r1);
        this.c = r1;
        Object[] r12 = {r1};
        this.a = r12;
        this.b = r12;
    }

    public static Object a(Object r1) {
        if ((r1 instanceof Activity) == false) goto L6;
        return r1;
    L6:
        if ((r1 instanceof ContextWrapper) == true) goto L8;
        return r1;
    L8:
        return a(((ContextWrapper) r1).getBaseContext());
    }

    public final void b(XmlPullParser r17, AttributeSet r18, Menu r19) {
        j50 r2 = new j50(this, r19);
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
        if (r9 == true) goto L97;
        if (r3 == 1) goto L96;
        if (r3 == r5) goto L41;
        if (r3 == 3) goto L19;
    L18:
        XmlPullParser r8 = r17;
        r9 = r9;
    L94:
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
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
        goto L18
    L28:
        if (r32.equals("item") == false) goto L38;
        if (r2.h == true) goto L18;
        pu r33 = r2.z;
        if (r33 != null) goto L34;
    L36:
        r2.h = true;
        r2.b(r2.a.add(r2.b, r2.i, r2.j, r2.k));
        goto L18
    L34:
        if (r33.a.hasSubMenu() == false) goto L36;
        r2.h = true;
        r2.b(r2.a.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
        goto L18
    L38:
        if (r32.equals("menu") == false) goto L18;
        r8 = r17;
        r9 = true;
        goto L94
    L41:
        if (r10 == true) goto L18;
        String r34 = r17.getName();
        boolean r13 = r34.equals("group");
        Context r15 = this.c;
        if (r13 == false) goto L47;
        TypedArray r35 = r15.obtainStyledAttributes(r18, xy.p);
        r2.b = r35.getResourceId(1, 0);
        r2.c = r35.getInt(3, 0);
        r2.d = r35.getInt(4, 0);
        r2.e = r35.getInt(5, 0);
        r2.f = r35.getBoolean(2, true);
        r2.g = r35.getBoolean(0, true);
        r35.recycle();
        goto L18
    L47:
        if (r34.equals("item") == false) goto L91;
        TypedArray r36 = r15.obtainStyledAttributes(r18, xy.q);
        r2.i = r36.getResourceId(2, 0);
        r2.j = (r36.getInt(5, r2.c) & (-65536)) | (r36.getInt(6, r2.d) & 65535);
        r2.k = r36.getText(7);
        r2.l = r36.getText(8);
        r2.m = r36.getResourceId(0, 0);
        String r82 = r36.getString(9);
        if (r82 != null) goto L51;
        char r83 = 0;
    L52:
        r2.n = r83;
        r2.o = r36.getInt(16, 4096);
        String r84 = r36.getString(10);
        if (r84 != null) goto L55;
        char r85 = 0;
    L56:
        r2.p = r85;
        r2.q = r36.getInt(20, 4096);
        if (r36.hasValue(11) == false) goto L59;
        r2.r = r36.getBoolean(11, false) ? 1 : 0;
    L60:
        r2.s = r36.getBoolean(3, false);
        r2.t = r36.getBoolean(4, r2.f);
        r2.u = r36.getBoolean(1, r2.g);
        r2.v = r36.getInt(21, -1);
        r2.y = r36.getString(12);
        r2.w = r36.getResourceId(13, 0);
        r2.x = r36.getString(15);
        String r52 = r36.getString(14);
        if (r52 == null) goto L63;
        boolean r12 = true;
    L64:
        if (r12 == true) goto L66;
    L70:
        if (r12 == false) goto L72;
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
    L72:
        r2.z = null;
    L73:
        r2.A = r36.getText(17);
        r2.B = r36.getText(22);
        if (r36.hasValue(19) == false) goto L76;
        r2.D = eh.b(r36.getInt(19, -1), r2.D);
    L78:
        if (r36.hasValue(18) == true) goto L80;
        r2.C = null;
    L89:
        r36.recycle();
        r2.h = false;
        r8 = r17;
        goto L94
    L80:
        if (r36.hasValue(18) == false) goto L86;
        int r86 = r36.getResourceId(18, 0);
        if (r86 == 0) goto L86;
        ColorStateList r87 = ip.v(r15, r86);
        if (r87 == null) goto L86;
    L87:
        r2.C = r87;
    L86:
        r87 = r36.getColorStateList(18);
        goto L87
    L76:
        r2.D = null;
        goto L78
    L66:
        if (r2.w != 0) goto L70;
        if (r2.x != null) goto L70;
        r2.z = (pu) r2.a(r52, f, this.b);
        goto L73
    L63:
        r12 = false;
        goto L64
    L59:
        r2.r = r2.e;
        goto L60
    L55:
        r85 = r84.charAt(0);
        goto L56
    L51:
        r83 = r82.charAt(0);
        goto L52
    L91:
        if (r34.equals("menu") == false) goto L93;
        r2.h = true;
        SubMenu r37 = r2.a.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r37.getItem());
        r8 = r17;
        b(r8, r18, r37);
        goto L94
    L93:
        r8 = r17;
        r11 = r34;
        r10 = true;
        goto L94
    L96:
        throw new RuntimeException("Unexpected end of document");
    L97:
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
    public final void inflate(int r4, Menu r5) {
        if ((r5 instanceof ku) == true) goto L6;
        super.inflate(r4, r5);
        return;
    L6:
        XmlResourceParser r1 = null;
        r1 = this.c.getResources().getLayout(r4);     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        b(r1, Xml.asAttributeSet(r1), r5);     // Catch: Throwable -> L10 IOException -> L12 XmlPullParserException -> L14
        r1.close();
        return;
    L10:
        th = move-exception;
        if (r1 == null) goto L22;
        r1.close();
    L22:
        throw th;
    L12:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L10
    L14:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L10
    }
}
