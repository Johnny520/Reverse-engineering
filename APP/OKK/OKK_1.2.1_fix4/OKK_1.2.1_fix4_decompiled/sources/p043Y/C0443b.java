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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0443b(Class cls, String str, int i2) {
        super(cls, str);
        this.f974a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f974a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC0465x.f1048a.mo926z((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1210z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f974a) {
            case 0:
                C0446e c0446e = (C0446e) obj;
                PointF pointF = (PointF) obj2;
                c0446e.getClass();
                c0446e.f977a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0446e.f978b = iRound;
                int i2 = c0446e.f982f + 1;
                c0446e.f982f = i2;
                if (i2 == c0446e.f983g) {
                    AbstractC0465x.m1095a(c0446e.f981e, c0446e.f977a, iRound, c0446e.f979c, c0446e.f980d);
                    c0446e.f982f = 0;
                    c0446e.f983g = 0;
                }
                break;
            case 1:
                C0446e c0446e2 = (C0446e) obj;
                PointF pointF2 = (PointF) obj2;
                c0446e2.getClass();
                c0446e2.f979c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0446e2.f980d = iRound2;
                int i3 = c0446e2.f983g + 1;
                c0446e2.f983g = i3;
                if (c0446e2.f982f == i3) {
                    AbstractC0465x.m1095a(c0446e2.f981e, c0446e2.f977a, c0446e2.f978b, c0446e2.f979c, iRound2);
                    c0446e2.f982f = 0;
                    c0446e2.f983g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0465x.m1095a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0465x.m1095a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC0465x.m1095a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC0465x.f1048a.mo924k0((View) obj, fFloatValue);
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
