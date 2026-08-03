package Yue;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7048 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: ۥ */
    public Rect f2651;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7048() {
    }

    /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) ((rect2.left - r0) * f));
        int i2 = rect.top + ((int) ((rect2.top - r1) * f));
        int i3 = rect.right + ((int) ((rect2.right - r2) * f));
        int i4 = rect.bottom + ((int) ((rect2.bottom - r6) * f));
        Rect rect3 = this.f2651;
        if (rect3 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.f2651;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7048(Rect rect) {
        this.f2651 = rect;
    }
}
