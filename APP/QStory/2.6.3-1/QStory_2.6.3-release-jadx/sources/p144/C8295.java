package p144;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8295 extends Property {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8295(String str, int i, Class cls) {
        super(cls, str);
        this.f20544 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f20544) {
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
                return Float.valueOf(AbstractC8297.f20552.mo13254((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f20544) {
            case 0:
                C8292 c8292 = (C8292) obj;
                PointF pointF = (PointF) obj2;
                c8292.getClass();
                c8292.f20540 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c8292.f20539 = iRound;
                int i = c8292.f20535 + 1;
                c8292.f20535 = i;
                if (i == c8292.f20541) {
                    AbstractC8297.m13245(c8292.f20536, c8292.f20540, iRound, c8292.f20538, c8292.f20537);
                    c8292.f20535 = 0;
                    c8292.f20541 = 0;
                }
                break;
            case 1:
                C8292 c82922 = (C8292) obj;
                PointF pointF2 = (PointF) obj2;
                c82922.getClass();
                c82922.f20538 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c82922.f20537 = iRound2;
                int i2 = c82922.f20541 + 1;
                c82922.f20541 = i2;
                if (c82922.f20535 == i2) {
                    AbstractC8297.m13245(c82922.f20536, c82922.f20540, c82922.f20539, c82922.f20538, iRound2);
                    c82922.f20535 = 0;
                    c82922.f20541 = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC8297.m13245(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC8297.m13245(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC8297.m13245(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC8297.f20552.mo13253((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
