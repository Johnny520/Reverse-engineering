package p043Y;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0443b extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f974a;

    public /* synthetic */ C0443b(Class r1, String r2, int r3) {
        this.f974a = r3;
        super(r1, r2);
    }

    @Override // android.util.Property
    public final Object get(Object r2) {
        switch(this.f974a) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L5;
        };
    L8:
        C0437C r02 = AbstractC0465x.f1048a;
        return Float.valueOf(r02.mo926z((View) r2));
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
        C0446e r25 = (C0446e) r2;
        return null;
    L18:
        C0446e r26 = (C0446e) r2;
        return null;
    L5:
        return Float.valueOf(((SwitchCompat) r2).f1210z);
    L7:
        return ((View) r2).getClipBounds();
    }

    @Override // android.util.Property
    public final void set(Object r5, Object r6) {
        switch(this.f974a) {
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
        ((SwitchCompat) r5).setThumbPosition(((Float) r6).floatValue());
        return;
    L6:
        ((View) r5).setClipBounds((Rect) r6);
        return;
    L8:
        float r62 = ((Float) r6).floatValue();
        C0437C r02 = AbstractC0465x.f1048a;
        r02.mo924k0((View) r5, r62);
        return;
    L10:
        View r52 = (View) r5;
        PointF r63 = (PointF) r6;
        int r03 = Math.round(r63.x);
        int r64 = Math.round(r63.y);
        AbstractC0465x.m1095a(r52, r03, r64, r52.getWidth() + r03, r52.getHeight() + r64);
        return;
    L12:
        View r53 = (View) r5;
        PointF r65 = (PointF) r6;
        AbstractC0465x.m1095a(r53, Math.round(r65.x), Math.round(r65.y), r53.getRight(), r53.getBottom());
        return;
    L14:
        View r54 = (View) r5;
        PointF r66 = (PointF) r6;
        AbstractC0465x.m1095a(r54, r54.getLeft(), r54.getTop(), Math.round(r66.x), Math.round(r66.y));
        return;
    L16:
        C0446e r55 = (C0446e) r5;
        PointF r67 = (PointF) r6;
        r55.getClass();
        r55.f979c = Math.round(r67.x);
        int r68 = Math.round(r67.y);
        r55.f980d = r68;
        int r04 = r55.f983g + 1;
        r55.f983g = r04;
        if (r55.f982f != r04) goto L24;
        int r05 = r55.f977a;
        int r1 = r55.f978b;
        int r2 = r55.f979c;
        AbstractC0465x.m1095a(r55.f981e, r05, r1, r2, r68);
        r55.f982f = 0;
        r55.f983g = 0;
        return;
    L24:
        return;
    L20:
        C0446e r56 = (C0446e) r5;
        PointF r69 = (PointF) r6;
        r56.getClass();
        r56.f977a = Math.round(r69.x);
        int r610 = Math.round(r69.y);
        r56.f978b = r610;
        int r06 = r56.f982f + 1;
        r56.f982f = r06;
        if (r06 != r56.f983g) goto L25;
        int r07 = r56.f977a;
        int r12 = r56.f979c;
        int r22 = r56.f980d;
        AbstractC0465x.m1095a(r56.f981e, r07, r610, r12, r22);
        r56.f982f = 0;
        r56.f983g = 0;
        return;
    }
}
