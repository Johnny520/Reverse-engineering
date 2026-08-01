package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends Property {
    public final /* synthetic */ int a;

    public /* synthetic */ x8(Class r1, String r2, int r3) {
        this.a = r3;
        super(r1, r2);
    }

    @Override // android.util.Property
    public final Object get(Object r3) {
        switch(this.a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        WeakHashMap r0 = ja0.a;
        return u90.a((View) r3);
    L6:
        db0 r02 = bb0.a;
        return Float.valueOf(r02.x((View) r3));
    L8:
        View r32 = (View) r3;
        return null;
    L10:
        View r33 = (View) r3;
        return null;
    L12:
        View r34 = (View) r3;
        return null;
    L14:
        a9 r35 = (a9) r3;
        return null;
    L16:
        a9 r36 = (a9) r3;
        return null;
    }

    @Override // android.util.Property
    public final void set(Object r6, Object r7) {
        switch(this.a) {
            case 0: goto L18;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        WeakHashMap r0 = ja0.a;
        u90.c((View) r6, (Rect) r7);
        return;
    L6:
        float r72 = ((Float) r7).floatValue();
        db0 r02 = bb0.a;
        r02.N((View) r6, r72);
        return;
    L8:
        View r62 = (View) r6;
        PointF r73 = (PointF) r7;
        int r03 = Math.round(r73.x);
        int r74 = Math.round(r73.y);
        bb0.a(r62, r03, r74, r62.getWidth() + r03, r62.getHeight() + r74);
        return;
    L10:
        View r63 = (View) r6;
        PointF r75 = (PointF) r7;
        bb0.a(r63, Math.round(r75.x), Math.round(r75.y), r63.getRight(), r63.getBottom());
        return;
    L12:
        View r64 = (View) r6;
        PointF r76 = (PointF) r7;
        bb0.a(r64, r64.getLeft(), r64.getTop(), Math.round(r76.x), Math.round(r76.y));
        return;
    L14:
        a9 r65 = (a9) r6;
        PointF r77 = (PointF) r7;
        r65.getClass();
        r65.c = Math.round(r77.x);
        int r78 = Math.round(r77.y);
        r65.d = r78;
        int r04 = r65.g + 1;
        r65.g = r04;
        if (r65.f != r04) goto L22;
        bb0.a(r65.e, r65.a, r65.b, r65.c, r78);
        r65.f = 0;
        r65.g = 0;
        return;
    L22:
        return;
    L18:
        a9 r66 = (a9) r6;
        PointF r79 = (PointF) r7;
        r66.getClass();
        r66.a = Math.round(r79.x);
        int r710 = Math.round(r79.y);
        r66.b = r710;
        int r05 = r66.f + 1;
        r66.f = r05;
        if (r05 != r66.g) goto L23;
        bb0.a(r66.e, r66.a, r710, r66.c, r66.d);
        r66.f = 0;
        r66.g = 0;
        return;
    }
}
