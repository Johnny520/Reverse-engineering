package p305;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.dx.io.Opcodes;
import p312.C8659;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8641 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PorterDuff.Mode f24278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public ColorStateList f24279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ColorStateList f24280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ColorStateList f24281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8659 f24282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8635 f24283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f24284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f24285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f24286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint.Style f24287;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24288;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Rect f24289;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f24290;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24291;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f24292;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f24293;

    public C8641(C8641 c8641) {
        this.f24281 = null;
        this.f24280 = null;
        this.f24279 = null;
        this.f24278 = PorterDuff.Mode.SRC_IN;
        this.f24289 = null;
        this.f24288 = 1.0f;
        this.f24292 = 1.0f;
        this.f24290 = Opcodes.CONST_METHOD_TYPE;
        this.f24291 = 0.0f;
        this.f24285 = 0.0f;
        this.f24284 = 0;
        this.f24286 = 0;
        this.f24287 = Paint.Style.FILL_AND_STROKE;
        this.f24283 = c8641.f24283;
        this.f24282 = c8641.f24282;
        this.f24293 = c8641.f24293;
        this.f24281 = c8641.f24281;
        this.f24280 = c8641.f24280;
        this.f24278 = c8641.f24278;
        this.f24279 = c8641.f24279;
        this.f24290 = c8641.f24290;
        this.f24288 = c8641.f24288;
        this.f24286 = c8641.f24286;
        this.f24292 = c8641.f24292;
        this.f24291 = c8641.f24291;
        this.f24285 = c8641.f24285;
        this.f24284 = c8641.f24284;
        this.f24287 = c8641.f24287;
        if (c8641.f24289 != null) {
            this.f24289 = new Rect(c8641.f24289);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C8643 c8643 = new C8643(this);
        c8643.f24322 = true;
        c8643.f24323 = true;
        return c8643;
    }

    public C8641(InterfaceC8635 interfaceC8635) {
        this.f24281 = null;
        this.f24280 = null;
        this.f24279 = null;
        this.f24278 = PorterDuff.Mode.SRC_IN;
        this.f24289 = null;
        this.f24288 = 1.0f;
        this.f24292 = 1.0f;
        this.f24290 = Opcodes.CONST_METHOD_TYPE;
        this.f24291 = 0.0f;
        this.f24285 = 0.0f;
        this.f24284 = 0;
        this.f24286 = 0;
        this.f24287 = Paint.Style.FILL_AND_STROKE;
        this.f24283 = interfaceC8635;
        this.f24282 = null;
    }
}
