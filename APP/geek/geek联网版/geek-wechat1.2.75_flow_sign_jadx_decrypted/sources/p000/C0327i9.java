package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0327i9 extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0327i9(Class cls, String str, int i) {
        super(cls, str);
        this.f2357a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2357a) {
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
                return Float.valueOf(gb0.f1949a.mo1337u((View) obj));
            default:
                WeakHashMap weakHashMap = oa0.f3426a;
                return z90.m2822a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2357a) {
            case Base64.DEFAULT /* 0 */:
                C0440l9 c0440l9 = (C0440l9) obj;
                PointF pointF = (PointF) obj2;
                c0440l9.getClass();
                c0440l9.f2970a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0440l9.f2971b = iRound;
                int i = c0440l9.f2975f + 1;
                c0440l9.f2975f = i;
                if (i == c0440l9.f2976g) {
                    gb0.m1221a(c0440l9.f2974e, c0440l9.f2970a, iRound, c0440l9.f2972c, c0440l9.f2973d);
                    c0440l9.f2975f = 0;
                    c0440l9.f2976g = 0;
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0440l9 c0440l92 = (C0440l9) obj;
                PointF pointF2 = (PointF) obj2;
                c0440l92.getClass();
                c0440l92.f2972c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0440l92.f2973d = iRound2;
                int i2 = c0440l92.f2976g + 1;
                c0440l92.f2976g = i2;
                if (c0440l92.f2975f == i2) {
                    gb0.m1221a(c0440l92.f2974e, c0440l92.f2970a, c0440l92.f2971b, c0440l92.f2972c, iRound2);
                    c0440l92.f2975f = 0;
                    c0440l92.f2976g = 0;
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                gb0.m1221a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                gb0.m1221a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                gb0.m1221a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                gb0.f1949a.mo1324I((View) obj, fFloatValue);
                break;
            default:
                WeakHashMap weakHashMap = oa0.f3426a;
                z90.m2824c((View) obj, (Rect) obj2);
                break;
        }
    }
}
