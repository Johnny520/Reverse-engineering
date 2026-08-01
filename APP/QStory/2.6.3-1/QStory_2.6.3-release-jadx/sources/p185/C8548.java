package p185;

import android.graphics.Rect;
import java.util.Comparator;
import p091.C7787;
import p171.C8436;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8548 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7787 f21299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f21301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f21302 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Rect f21300 = new Rect();

    public C8548(boolean z, C7787 c7787) {
        this.f21301 = z;
        this.f21299 = c7787;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f21299.getClass();
        Rect rect = this.f21302;
        ((C8436) obj).m13390(rect);
        Rect rect2 = this.f21300;
        ((C8436) obj2).m13390(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f21301;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
