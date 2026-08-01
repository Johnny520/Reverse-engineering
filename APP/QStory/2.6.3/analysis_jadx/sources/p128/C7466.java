package p128;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7466 extends Property {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20199;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7466(String str, int i, Class cls) {
        super(cls, str);
        this.f20199 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f20199) {
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
                return Float.valueOf(AbstractC7468.f20207.mo12695((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f20199) {
            case 0:
                C7463 c7463 = (C7463) obj;
                PointF pointF = (PointF) obj2;
                c7463.getClass();
                c7463.f20195 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c7463.f20194 = iRound;
                int i = c7463.f20190 + 1;
                c7463.f20190 = i;
                if (i == c7463.f20196) {
                    AbstractC7468.m12686(c7463.f20191, c7463.f20195, iRound, c7463.f20193, c7463.f20192);
                    c7463.f20190 = 0;
                    c7463.f20196 = 0;
                }
                break;
            case 1:
                C7463 c74632 = (C7463) obj;
                PointF pointF2 = (PointF) obj2;
                c74632.getClass();
                c74632.f20193 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c74632.f20192 = iRound2;
                int i2 = c74632.f20196 + 1;
                c74632.f20196 = i2;
                if (c74632.f20190 == i2) {
                    AbstractC7468.m12686(c74632.f20191, c74632.f20195, c74632.f20194, c74632.f20193, iRound2);
                    c74632.f20190 = 0;
                    c74632.f20196 = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC7468.m12686(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC7468.m12686(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC7468.m12686(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC7468.f20207.mo12694((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
