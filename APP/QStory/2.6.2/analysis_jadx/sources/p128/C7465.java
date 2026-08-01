package p128;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7465 extends Property {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20204;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7465(String str, int i, Class cls) {
        super(cls, str);
        this.f20204 = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f20204) {
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
                return Float.valueOf(AbstractC7467.f20212.mo9908((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f20204) {
            case 0:
                C7462 c7462 = (C7462) obj;
                PointF pointF = (PointF) obj2;
                c7462.getClass();
                c7462.f20200 = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c7462.f20199 = iRound;
                int i = c7462.f20195 + 1;
                c7462.f20195 = i;
                if (i == c7462.f20201) {
                    AbstractC7467.m12659(c7462.f20196, c7462.f20200, iRound, c7462.f20198, c7462.f20197);
                    c7462.f20195 = 0;
                    c7462.f20201 = 0;
                }
                break;
            case 1:
                C7462 c74622 = (C7462) obj;
                PointF pointF2 = (PointF) obj2;
                c74622.getClass();
                c74622.f20198 = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c74622.f20197 = iRound2;
                int i2 = c74622.f20201 + 1;
                c74622.f20201 = i2;
                if (c74622.f20195 == i2) {
                    AbstractC7467.m12659(c74622.f20196, c74622.f20200, c74622.f20199, c74622.f20198, iRound2);
                    c74622.f20195 = 0;
                    c74622.f20201 = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC7467.m12659(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC7467.m12659(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC7467.m12659(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC7467.f20212.mo9904((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
