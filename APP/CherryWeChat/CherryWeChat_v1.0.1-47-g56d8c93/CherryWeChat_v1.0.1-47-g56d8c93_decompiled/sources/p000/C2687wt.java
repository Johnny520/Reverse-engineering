package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: wt */
/* JADX INFO: loaded from: classes.dex */
public final class C2687wt extends AbstractC2730xt {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2687wt(AbstractC1160i abstractC1160i, int i) {
        super(abstractC1160i);
        this.f9250d = i;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: b */
    public final int mo5251b(View view) {
        int decoratedRight;
        int i;
        switch (this.f9250d) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedRight = this.f9328a.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedRight = this.f9328a.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: c */
    public final int mo5252c(View view) {
        int decoratedMeasuredWidth;
        int i;
        switch (this.f9250d) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedMeasuredWidth = this.f9328a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedMeasuredWidth = this.f9328a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c2431qv2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: d */
    public final int mo5253d(View view) {
        int decoratedMeasuredHeight;
        int i;
        switch (this.f9250d) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedMeasuredHeight = this.f9328a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c2431qv).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2431qv).bottomMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedMeasuredHeight = this.f9328a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c2431qv2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: e */
    public final int mo5254e(View view) {
        int decoratedLeft;
        int i;
        switch (this.f9250d) {
            case 0:
                C2431qv c2431qv = (C2431qv) view.getLayoutParams();
                decoratedLeft = this.f9328a.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin;
                break;
            default:
                C2431qv c2431qv2 = (C2431qv) view.getLayoutParams();
                decoratedLeft = this.f9328a.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) c2431qv2).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: f */
    public final int mo5255f() {
        switch (this.f9250d) {
            case 0:
                return this.f9328a.getWidth();
            default:
                return this.f9328a.getHeight();
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: g */
    public final int mo5256g() {
        int width;
        int paddingRight;
        switch (this.f9250d) {
            case 0:
                AbstractC1160i abstractC1160i = this.f9328a;
                width = abstractC1160i.getWidth();
                paddingRight = abstractC1160i.getPaddingRight();
                break;
            default:
                AbstractC1160i abstractC1160i2 = this.f9328a;
                width = abstractC1160i2.getHeight();
                paddingRight = abstractC1160i2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: h */
    public final int mo5257h() {
        switch (this.f9250d) {
            case 0:
                return this.f9328a.getPaddingRight();
            default:
                return this.f9328a.getPaddingBottom();
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: i */
    public final int mo5258i() {
        switch (this.f9250d) {
            case 0:
                return this.f9328a.getWidthMode();
            default:
                return this.f9328a.getHeightMode();
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: j */
    public final int mo5259j() {
        switch (this.f9250d) {
            case 0:
                return this.f9328a.getHeightMode();
            default:
                return this.f9328a.getWidthMode();
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: k */
    public final int mo5260k() {
        switch (this.f9250d) {
            case 0:
                return this.f9328a.getPaddingLeft();
            default:
                return this.f9328a.getPaddingTop();
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: l */
    public final int mo5261l() {
        int width;
        int paddingRight;
        switch (this.f9250d) {
            case 0:
                AbstractC1160i abstractC1160i = this.f9328a;
                width = abstractC1160i.getWidth() - abstractC1160i.getPaddingLeft();
                paddingRight = abstractC1160i.getPaddingRight();
                break;
            default:
                AbstractC1160i abstractC1160i2 = this.f9328a;
                width = abstractC1160i2.getHeight() - abstractC1160i2.getPaddingTop();
                paddingRight = abstractC1160i2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: m */
    public final int mo5262m(View view) {
        switch (this.f9250d) {
            case 0:
                AbstractC1160i abstractC1160i = this.f9328a;
                Rect rect = this.f9330c;
                abstractC1160i.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                AbstractC1160i abstractC1160i2 = this.f9328a;
                Rect rect2 = this.f9330c;
                abstractC1160i2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: n */
    public final int mo5263n(View view) {
        switch (this.f9250d) {
            case 0:
                AbstractC1160i abstractC1160i = this.f9328a;
                Rect rect = this.f9330c;
                abstractC1160i.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                AbstractC1160i abstractC1160i2 = this.f9328a;
                Rect rect2 = this.f9330c;
                abstractC1160i2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: o */
    public final void mo5264o(int i) {
        switch (this.f9250d) {
            case 0:
                this.f9328a.offsetChildrenHorizontal(i);
                break;
            default:
                this.f9328a.offsetChildrenVertical(i);
                break;
        }
    }
}
