package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2456 extends AbstractC2457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7306;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2456(AbstractC2519 abstractC2519, int i) {
        super(abstractC2519);
        this.f7306 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo4825() {
        switch (this.f7306) {
            case 0:
                return ((AbstractC2519) this.f7308).f7580;
            default:
                return ((AbstractC2519) this.f7308).f7579;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo4826(View view) {
        int iM4978;
        int i;
        int i2 = this.f7306;
        Object obj = this.f7308;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4978 = AbstractC2519.m4978(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4978 = AbstractC2519.m4971(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                break;
        }
        return iM4978 - i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo4827(View view) {
        int iM4977;
        int i;
        int i2 = this.f7306;
        Object obj = this.f7308;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4977 = AbstractC2519.m4977(view) + ((ViewGroup.MarginLayoutParams) c2518).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2518).bottomMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4977 = AbstractC2519.m4974(view) + ((ViewGroup.MarginLayoutParams) c25182).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c25182).rightMargin;
                break;
        }
        return iM4977 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo4828(View view) {
        int iM4974;
        int i;
        int i2 = this.f7306;
        Object obj = this.f7308;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4974 = AbstractC2519.m4974(view) + ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4974 = AbstractC2519.m4977(view) + ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4974 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo4829(View view) {
        int iM4975;
        int i;
        int i2 = this.f7306;
        Object obj = this.f7308;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4975 = AbstractC2519.m4975(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4975 = AbstractC2519.m4976(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4975 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo4830(View view) {
        int i = this.f7306;
        Object obj = this.f7307;
        Object obj2 = this.f7308;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2519) obj2).m4983(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2519) obj2).m4983(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo4831(View view) {
        int i = this.f7306;
        Object obj = this.f7307;
        Object obj2 = this.f7308;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2519) obj2).m4983(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2519) obj2).m4983(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo4832(int i) {
        switch (this.f7306) {
            case 0:
                ((AbstractC2519) this.f7308).mo4776(i);
                break;
            default:
                ((AbstractC2519) this.f7308).mo4775(i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo4833() {
        switch (this.f7306) {
            case 0:
                return ((AbstractC2519) this.f7308).getPaddingRight();
            default:
                return ((AbstractC2519) this.f7308).getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo4834() {
        int i;
        int paddingRight;
        int i2 = this.f7306;
        Object obj = this.f7308;
        switch (i2) {
            case 0:
                AbstractC2519 abstractC2519 = (AbstractC2519) obj;
                i = abstractC2519.f7580;
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                AbstractC2519 abstractC25192 = (AbstractC2519) obj;
                i = abstractC25192.f7579;
                paddingRight = abstractC25192.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo4835() {
        switch (this.f7306) {
            case 0:
                return ((AbstractC2519) this.f7308).getPaddingLeft();
            default:
                return ((AbstractC2519) this.f7308).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo4836() {
        int paddingLeft;
        int paddingRight;
        int i = this.f7306;
        Object obj = this.f7308;
        switch (i) {
            case 0:
                AbstractC2519 abstractC2519 = (AbstractC2519) obj;
                paddingLeft = abstractC2519.f7580 - abstractC2519.getPaddingLeft();
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                AbstractC2519 abstractC25192 = (AbstractC2519) obj;
                paddingLeft = abstractC25192.f7579 - abstractC25192.getPaddingTop();
                paddingRight = abstractC25192.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int mo4837() {
        switch (this.f7306) {
            case 0:
                return ((AbstractC2519) this.f7308).f7582;
            default:
                return ((AbstractC2519) this.f7308).f7581;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo4838() {
        switch (this.f7306) {
            case 0:
                return ((AbstractC2519) this.f7308).f7581;
            default:
                return ((AbstractC2519) this.f7308).f7582;
        }
    }
}
