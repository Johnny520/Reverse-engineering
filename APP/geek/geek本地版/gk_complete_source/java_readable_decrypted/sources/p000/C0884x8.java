package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0884x8 extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0884x8(Class cls, String str, int i) {
        super(cls, str);
        this.f5124a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f5124a) {
            case Base64.DEFAULT /* 0 */:
                return null;
            case Base64.NO_PADDING /* 1 */:
                return null;
            case Base64.NO_WRAP /* 2 */:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(bb0.f804a.mo1008x((View) obj));
            default:
                WeakHashMap weakHashMap = ja0.f2600a;
                return u90.m2429a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f5124a) {
            case Base64.DEFAULT /* 0 */:
                C0010a9 c0010a9 = (C0010a9) obj;
                PointF pointF = (PointF) obj2;
                c0010a9.getClass();
                c0010a9.f90a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0010a9.f91b = iRound;
                int i = c0010a9.f95f + 1;
                c0010a9.f95f = i;
                if (i == c0010a9.f96g) {
                    bb0.m551a(c0010a9.f94e, c0010a9.f90a, iRound, c0010a9.f92c, c0010a9.f93d);
                    c0010a9.f95f = 0;
                    c0010a9.f96g = 0;
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0010a9 c0010a92 = (C0010a9) obj;
                PointF pointF2 = (PointF) obj2;
                c0010a92.getClass();
                c0010a92.f92c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0010a92.f93d = iRound2;
                int i2 = c0010a92.f96g + 1;
                c0010a92.f96g = i2;
                if (c0010a92.f95f == i2) {
                    bb0.m551a(c0010a92.f94e, c0010a92.f90a, c0010a92.f91b, c0010a92.f92c, iRound2);
                    c0010a92.f95f = 0;
                    c0010a92.f96g = 0;
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                bb0.m551a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                bb0.m551a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                bb0.m551a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                bb0.f804a.mo1007N((View) obj, fFloatValue);
                break;
            default:
                WeakHashMap weakHashMap = ja0.f2600a;
                u90.m2431c((View) obj, (Rect) obj2);
                break;
        }
    }
}
