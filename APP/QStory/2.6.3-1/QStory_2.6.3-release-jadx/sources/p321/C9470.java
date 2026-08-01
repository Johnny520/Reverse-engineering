package p321;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.p002dx.p005io.Opcodes;
import p328.C9488;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9470 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f24623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ColorStateList f24624;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ColorStateList f24625;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ColorStateList f24626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9488 f24627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC9464 f24628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f24629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f24630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f24631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint.Style f24632;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24633;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Rect f24634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f24635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f24637;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f24638;

    public C9470(C9470 c9470) {
        this.f24626 = null;
        this.f24625 = null;
        this.f24624 = null;
        this.f24623 = PorterDuff.Mode.SRC_IN;
        this.f24634 = null;
        this.f24633 = 1.0f;
        this.f24637 = 1.0f;
        this.f24635 = Opcodes.CONST_METHOD_TYPE;
        this.f24636 = 0.0f;
        this.f24630 = 0.0f;
        this.f24629 = 0;
        this.f24631 = 0;
        this.f24632 = Paint.Style.FILL_AND_STROKE;
        this.f24628 = c9470.f24628;
        this.f24627 = c9470.f24627;
        this.f24638 = c9470.f24638;
        this.f24626 = c9470.f24626;
        this.f24625 = c9470.f24625;
        this.f24623 = c9470.f24623;
        this.f24624 = c9470.f24624;
        this.f24635 = c9470.f24635;
        this.f24633 = c9470.f24633;
        this.f24631 = c9470.f24631;
        this.f24637 = c9470.f24637;
        this.f24636 = c9470.f24636;
        this.f24630 = c9470.f24630;
        this.f24629 = c9470.f24629;
        this.f24632 = c9470.f24632;
        if (c9470.f24634 != null) {
            this.f24634 = new Rect(c9470.f24634);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C9472 c9472 = new C9472(this);
        c9472.f24667 = true;
        c9472.f24668 = true;
        return c9472;
    }

    public C9470(InterfaceC9464 interfaceC9464) {
        this.f24626 = null;
        this.f24625 = null;
        this.f24624 = null;
        this.f24623 = PorterDuff.Mode.SRC_IN;
        this.f24634 = null;
        this.f24633 = 1.0f;
        this.f24637 = 1.0f;
        this.f24635 = Opcodes.CONST_METHOD_TYPE;
        this.f24636 = 0.0f;
        this.f24630 = 0.0f;
        this.f24629 = 0;
        this.f24631 = 0;
        this.f24632 = Paint.Style.FILL_AND_STROKE;
        this.f24628 = interfaceC9464;
        this.f24627 = null;
    }
}
