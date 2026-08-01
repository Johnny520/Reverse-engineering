package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dc {
    public int a;
    public int b;
    public float c;
    public String d;
    public boolean e;
    public int f;

    public dc(dc r1, Object r2) {
        r1.getClass();
        this.a = r1.a;
        b(r2);
    }

    public static void a(Context r13, XmlResourceParser r14, HashMap r15) {
        TypedArray r142 = r13.obtainStyledAttributes(Xml.asAttributeSet(r14), ry.c);
        int r0 = r142.getIndexCount();
        String r2 = null;
        int r4 = 0;
        int r5 = 0;
        Object r3 = null;
    L3:
        if (r4 >= r0) goto L36;
        int r6 = r142.getIndex(r4);
        if (r6 != 0) goto L12;
        r2 = r142.getString(r6);
        if (r2 == null) goto L35;
        if (r2.length() <= 0) goto L35;
        r2 = Character.toUpperCase(r2.charAt(0)) + r2.substring(1);
    L35:
        r4 = r4 + 1;
        goto L3
    L12:
        if (r6 != 1) goto L14;
        r3 = Boolean.valueOf(r142.getBoolean(r6, false));
        r5 = 6;
        goto L35
    L14:
        int r9 = 3;
        if (r6 != 3) goto L18;
        r3 = Integer.valueOf(r142.getColor(r6, 0));
    L17:
        r5 = r9;
        goto L35
    L18:
        r9 = 4;
        if (r6 != 2) goto L22;
        r3 = Integer.valueOf(r142.getColor(r6, 0));
        goto L17
    L22:
        if (r6 != 7) goto L25;
        r3 = Float.valueOf(TypedValue.applyDimension(1, r142.getDimension(r6, 0.0f), r13.getResources().getDisplayMetrics()));
    L24:
        r5 = 7;
        goto L35
    L25:
        if (r6 != 4) goto L27;
        r3 = Float.valueOf(r142.getDimension(r6, 0.0f));
        goto L24
    L27:
        r9 = 5;
        if (r6 != 5) goto L30;
        r3 = Float.valueOf(r142.getFloat(r6, Float.NaN));
        r5 = 2;
        goto L35
    L30:
        if (r6 != 6) goto L33;
        r3 = Integer.valueOf(r142.getInteger(r6, -1));
        r5 = 1;
        goto L35
    L33:
        if (r6 != 8) goto L35;
        r3 = r142.getString(r6);
        goto L17
    L36:
        if (r2 == null) goto L39;
        if (r3 == null) goto L39;
        dc r132 = new dc();
        r132.a = r5;
        r132.b(r3);
        r15.put(r2, r132);
    L39:
        r142.recycle();
    }

    public final void b(Object r2) {
        switch(z30.t(this.a)) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.c = ((Float) r2).floatValue();
        return;
    L7:
        this.e = ((Boolean) r2).booleanValue();
        return;
    L9:
        this.d = (String) r2;
        return;
    L11:
        this.f = ((Integer) r2).intValue();
        return;
    L13:
        this.c = ((Float) r2).floatValue();
        return;
    L15:
        this.b = ((Integer) r2).intValue();
    }
}
