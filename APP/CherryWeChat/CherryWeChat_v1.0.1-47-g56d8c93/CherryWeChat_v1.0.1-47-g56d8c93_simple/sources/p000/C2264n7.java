package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2264n7 extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7982a;

    public /* synthetic */ C2264n7(int r1, Class r2, String r3) {
        this.f7982a = r1;
        super(r2, r3);
    }

    @Override // android.util.Property
    public final Object get(Object r2) {
        switch(this.f7982a) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        C0831TE r0 = AbstractC0574NE.f1868a;
        return Float.valueOf(r0.mo1251A((View) r2));
    L10:
        View r22 = (View) r2;
        return null;
    L12:
        View r23 = (View) r2;
        return null;
    L14:
        View r24 = (View) r2;
        return null;
    L16:
        C2401q7 r25 = (C2401q7) r2;
        return null;
    L18:
        C2401q7 r26 = (C2401q7) r2;
        return null;
    L5:
        return ((View) r2).getClipBounds();
    L9:
        return Float.valueOf(((AbstractC1073Yz) r2).f3438z);
    }

    @Override // android.util.Property
    public final void set(Object r5, Object r6) {
        switch(this.f7982a) {
            case 0: goto L20;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((View) r5).setClipBounds((Rect) r6);
        return;
    L6:
        float r62 = ((Float) r6).floatValue();
        C0831TE r0 = AbstractC0574NE.f1868a;
        r0.mo1252Q((View) r5, r62);
        return;
    L8:
        ((AbstractC1073Yz) r5).setThumbPosition(((Float) r6).floatValue());
        return;
    L10:
        View r52 = (View) r5;
        PointF r63 = (PointF) r6;
        int r02 = Math.round(r63.x);
        int r64 = Math.round(r63.y);
        AbstractC0574NE.m1116a(r52, r02, r64, r52.getWidth() + r02, r52.getHeight() + r64);
        return;
    L12:
        View r53 = (View) r5;
        PointF r65 = (PointF) r6;
        AbstractC0574NE.m1116a(r53, Math.round(r65.x), Math.round(r65.y), r53.getRight(), r53.getBottom());
        return;
    L14:
        View r54 = (View) r5;
        PointF r66 = (PointF) r6;
        AbstractC0574NE.m1116a(r54, r54.getLeft(), r54.getTop(), Math.round(r66.x), Math.round(r66.y));
        return;
    L16:
        C2401q7 r55 = (C2401q7) r5;
        PointF r67 = (PointF) r6;
        r55.getClass();
        r55.f8415c = Math.round(r67.x);
        int r68 = Math.round(r67.y);
        r55.f8416d = r68;
        int r03 = r55.f8419g + 1;
        r55.f8419g = r03;
        if (r55.f8418f != r03) goto L24;
        AbstractC0574NE.m1116a(r55.f8417e, r55.f8413a, r55.f8414b, r55.f8415c, r68);
        r55.f8418f = 0;
        r55.f8419g = 0;
        return;
    L24:
        return;
    L20:
        C2401q7 r56 = (C2401q7) r5;
        PointF r69 = (PointF) r6;
        r56.getClass();
        r56.f8413a = Math.round(r69.x);
        int r610 = Math.round(r69.y);
        r56.f8414b = r610;
        int r04 = r56.f8418f + 1;
        r56.f8418f = r04;
        if (r04 != r56.f8419g) goto L25;
        AbstractC0574NE.m1116a(r56.f8417e, r56.f8413a, r610, r56.f8415c, r56.f8416d);
        r56.f8418f = 0;
        r56.f8419g = 0;
        return;
    }
}
