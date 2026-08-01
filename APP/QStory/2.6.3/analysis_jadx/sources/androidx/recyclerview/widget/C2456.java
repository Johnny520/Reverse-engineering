package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2456 extends AbstractC2457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f7307;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2456(AbstractC2519 abstractC2519, int i) {
        super(abstractC2519);
        this.f7307 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo4835() {
        switch (this.f7307) {
            case 0:
                return ((AbstractC2519) this.f7309).f7581;
            default:
                return ((AbstractC2519) this.f7309).f7580;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo4836(View view) {
        int iM4988;
        int i;
        int i2 = this.f7307;
        Object obj = this.f7309;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4988 = AbstractC2519.m4988(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4988 = AbstractC2519.m4981(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                break;
        }
        return iM4988 - i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo4837(View view) {
        int iM4987;
        int i;
        int i2 = this.f7307;
        Object obj = this.f7309;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4987 = AbstractC2519.m4987(view) + ((ViewGroup.MarginLayoutParams) c2518).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2518).bottomMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4987 = AbstractC2519.m4984(view) + ((ViewGroup.MarginLayoutParams) c25182).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c25182).rightMargin;
                break;
        }
        return iM4987 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo4838(View view) {
        int iM4984;
        int i;
        int i2 = this.f7307;
        Object obj = this.f7309;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4984 = AbstractC2519.m4984(view) + ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4984 = AbstractC2519.m4987(view) + ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4984 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo4839(View view) {
        int iM4985;
        int i;
        int i2 = this.f7307;
        Object obj = this.f7309;
        switch (i2) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4985 = AbstractC2519.m4985(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                ((AbstractC2519) obj).getClass();
                iM4985 = AbstractC2519.m4986(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4985 + i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo4840(View view) {
        int i = this.f7307;
        Object obj = this.f7308;
        Object obj2 = this.f7309;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2519) obj2).m4993(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2519) obj2).m4993(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo4841(View view) {
        int i = this.f7307;
        Object obj = this.f7308;
        Object obj2 = this.f7309;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((AbstractC2519) obj2).m4993(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((AbstractC2519) obj2).m4993(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo4842(int i) {
        switch (this.f7307) {
            case 0:
                ((AbstractC2519) this.f7309).mo4786(i);
                break;
            default:
                ((AbstractC2519) this.f7309).mo4785(i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int mo4843() {
        switch (this.f7307) {
            case 0:
                return ((AbstractC2519) this.f7309).getPaddingRight();
            default:
                return ((AbstractC2519) this.f7309).getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo4844() {
        int i;
        int paddingRight;
        int i2 = this.f7307;
        Object obj = this.f7309;
        switch (i2) {
            case 0:
                AbstractC2519 abstractC2519 = (AbstractC2519) obj;
                i = abstractC2519.f7581;
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                AbstractC2519 abstractC25192 = (AbstractC2519) obj;
                i = abstractC25192.f7580;
                paddingRight = abstractC25192.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo4845() {
        switch (this.f7307) {
            case 0:
                return ((AbstractC2519) this.f7309).getPaddingLeft();
            default:
                return ((AbstractC2519) this.f7309).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo4846() {
        int paddingLeft;
        int paddingRight;
        int i = this.f7307;
        Object obj = this.f7309;
        switch (i) {
            case 0:
                AbstractC2519 abstractC2519 = (AbstractC2519) obj;
                paddingLeft = abstractC2519.f7581 - abstractC2519.getPaddingLeft();
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                AbstractC2519 abstractC25192 = (AbstractC2519) obj;
                paddingLeft = abstractC25192.f7580 - abstractC25192.getPaddingTop();
                paddingRight = abstractC25192.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int mo4847() {
        switch (this.f7307) {
            case 0:
                return ((AbstractC2519) this.f7309).f7583;
            default:
                return ((AbstractC2519) this.f7309).f7582;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2457
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo4848() {
        switch (this.f7307) {
            case 0:
                return ((AbstractC2519) this.f7309).f7582;
            default:
                return ((AbstractC2519) this.f7309).f7583;
        }
    }
}
