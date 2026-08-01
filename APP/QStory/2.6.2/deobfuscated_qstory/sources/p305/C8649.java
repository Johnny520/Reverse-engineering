package p305;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.dx.io.Opcodes;
import p312.C8667;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8649 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f24287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ColorStateList f24288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ColorStateList f24289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ColorStateList f24290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8667 f24291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8643 f24292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f24293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f24294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f24295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint.Style f24296;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24297;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Rect f24298;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f24299;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24300;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f24301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f24302;

    public C8649(C8649 c8649) {
        this.f24290 = null;
        this.f24289 = null;
        this.f24288 = null;
        this.f24287 = PorterDuff.Mode.SRC_IN;
        this.f24298 = null;
        this.f24297 = 1.0f;
        this.f24301 = 1.0f;
        this.f24299 = Opcodes.CONST_METHOD_TYPE;
        this.f24300 = 0.0f;
        this.f24294 = 0.0f;
        this.f24293 = 0;
        this.f24295 = 0;
        this.f24296 = Paint.Style.FILL_AND_STROKE;
        this.f24292 = c8649.f24292;
        this.f24291 = c8649.f24291;
        this.f24302 = c8649.f24302;
        this.f24290 = c8649.f24290;
        this.f24289 = c8649.f24289;
        this.f24287 = c8649.f24287;
        this.f24288 = c8649.f24288;
        this.f24299 = c8649.f24299;
        this.f24297 = c8649.f24297;
        this.f24295 = c8649.f24295;
        this.f24301 = c8649.f24301;
        this.f24300 = c8649.f24300;
        this.f24294 = c8649.f24294;
        this.f24293 = c8649.f24293;
        this.f24296 = c8649.f24296;
        if (c8649.f24298 != null) {
            this.f24298 = new Rect(c8649.f24298);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C8651 c8651 = new C8651(this);
        c8651.f24331 = true;
        c8651.f24332 = true;
        return c8651;
    }

    public C8649(InterfaceC8643 interfaceC8643) {
        this.f24290 = null;
        this.f24289 = null;
        this.f24288 = null;
        this.f24287 = PorterDuff.Mode.SRC_IN;
        this.f24298 = null;
        this.f24297 = 1.0f;
        this.f24301 = 1.0f;
        this.f24299 = Opcodes.CONST_METHOD_TYPE;
        this.f24300 = 0.0f;
        this.f24294 = 0.0f;
        this.f24293 = 0;
        this.f24295 = 0;
        this.f24296 = Paint.Style.FILL_AND_STROKE;
        this.f24292 = interfaceC8643;
        this.f24291 = null;
    }
}
