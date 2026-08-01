package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3289 extends AbstractC3290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3289(AbstractC3352 abstractC3352, int i) {
        super(abstractC3352);
        this.f7652 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo5395() {
        switch (this.f7652) {
            case 0:
                return ((AbstractC3352) this.f7654).f7926;
            default:
                return ((AbstractC3352) this.f7654).f7925;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo5396(View view) {
        int iM5548;
        int i;
        int i2 = this.f7652;
        Object obj = this.f7654;
        switch (i2) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5548 = AbstractC3352.m5548(view);
                i = ((ViewGroup.MarginLayoutParams) c3351).leftMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5548 = AbstractC3352.m5541(view);
                i = ((ViewGroup.MarginLayoutParams) c33512).topMargin;
                break;
        }
        return iM5548 - i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo5397(View view) {
        int iM5547;
        int i;
        int i2 = this.f7652;
        Object obj = this.f7654;
        switch (i2) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5547 = AbstractC3352.m5547(view) + ((ViewGroup.MarginLayoutParams) c3351).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c3351).bottomMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5547 = AbstractC3352.m5544(view) + ((ViewGroup.MarginLayoutParams) c33512).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c33512).rightMargin;
                break;
        }
        return iM5547 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo5398(View view) {
        int iM5544;
        int i;
        int i2 = this.f7652;
        Object obj = this.f7654;
        switch (i2) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5544 = AbstractC3352.m5544(view) + ((ViewGroup.MarginLayoutParams) c3351).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c3351).rightMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5544 = AbstractC3352.m5547(view) + ((ViewGroup.MarginLayoutParams) c33512).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c33512).bottomMargin;
                break;
        }
        return iM5544 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo5399(View view) {
        int iM5545;
        int i;
        int i2 = this.f7652;
        Object obj = this.f7654;
        switch (i2) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5545 = AbstractC3352.m5545(view);
                i = ((ViewGroup.MarginLayoutParams) c3351).rightMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                ((AbstractC3352) obj).getClass();
                iM5545 = AbstractC3352.m5546(view);
                i = ((ViewGroup.MarginLayoutParams) c33512).bottomMargin;
                break;
        }
        return iM5545 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo5400(View view) {
        int i = this.f7652;
        Object obj = this.f7653;
        Object obj2 = this.f7654;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC3352) obj2).m5553(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC3352) obj2).m5553(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo5401(View view) {
        int i = this.f7652;
        Object obj = this.f7653;
        Object obj2 = this.f7654;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC3352) obj2).m5553(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC3352) obj2).m5553(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo5402(int i) {
        switch (this.f7652) {
            case 0:
                ((AbstractC3352) this.f7654).mo5346(i);
                break;
            default:
                ((AbstractC3352) this.f7654).mo5345(i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo5403() {
        switch (this.f7652) {
            case 0:
                return ((AbstractC3352) this.f7654).getPaddingRight();
            default:
                return ((AbstractC3352) this.f7654).getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo5404() {
        int i;
        int paddingRight;
        int i2 = this.f7652;
        Object obj = this.f7654;
        switch (i2) {
            case 0:
                AbstractC3352 abstractC3352 = (AbstractC3352) obj;
                i = abstractC3352.f7926;
                paddingRight = abstractC3352.getPaddingRight();
                break;
            default:
                AbstractC3352 abstractC33522 = (AbstractC3352) obj;
                i = abstractC33522.f7925;
                paddingRight = abstractC33522.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo5405() {
        switch (this.f7652) {
            case 0:
                return ((AbstractC3352) this.f7654).getPaddingLeft();
            default:
                return ((AbstractC3352) this.f7654).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo5406() {
        int paddingLeft;
        int paddingRight;
        int i = this.f7652;
        Object obj = this.f7654;
        switch (i) {
            case 0:
                AbstractC3352 abstractC3352 = (AbstractC3352) obj;
                paddingLeft = abstractC3352.f7926 - abstractC3352.getPaddingLeft();
                paddingRight = abstractC3352.getPaddingRight();
                break;
            default:
                AbstractC3352 abstractC33522 = (AbstractC3352) obj;
                paddingLeft = abstractC33522.f7925 - abstractC33522.getPaddingTop();
                paddingRight = abstractC33522.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int mo5407() {
        switch (this.f7652) {
            case 0:
                return ((AbstractC3352) this.f7654).f7928;
            default:
                return ((AbstractC3352) this.f7654).f7927;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3290
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo5408() {
        switch (this.f7652) {
            case 0:
                return ((AbstractC3352) this.f7654).f7927;
            default:
                return ((AbstractC3352) this.f7654).f7928;
        }
    }
}
