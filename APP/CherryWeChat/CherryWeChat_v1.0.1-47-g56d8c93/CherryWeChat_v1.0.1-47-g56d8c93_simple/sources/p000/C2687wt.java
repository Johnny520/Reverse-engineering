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

    public /* synthetic */ C2687wt(AbstractC1160i r1, int r2) {
        this.f9250d = r2;
        super(r1);
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: b */
    public final int mo5251b(View r3) {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f9328a.getDecoratedBottom(r3);
        int r02 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r32 + r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f9328a.getDecoratedRight(r3);
        r02 = ((ViewGroup.MarginLayoutParams) r03).rightMargin;
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: c */
    public final int mo5252c(View r3) {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f9328a.getDecoratedMeasuredHeight(r3) + ((ViewGroup.MarginLayoutParams) r0).topMargin;
        int r02 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r32 + r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f9328a.getDecoratedMeasuredWidth(r3) + ((ViewGroup.MarginLayoutParams) r03).leftMargin;
        r02 = ((ViewGroup.MarginLayoutParams) r03).rightMargin;
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: d */
    public final int mo5253d(View r3) {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f9328a.getDecoratedMeasuredWidth(r3) + ((ViewGroup.MarginLayoutParams) r0).leftMargin;
        int r02 = ((ViewGroup.MarginLayoutParams) r0).rightMargin;
    L6:
        return r32 + r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f9328a.getDecoratedMeasuredHeight(r3) + ((ViewGroup.MarginLayoutParams) r03).topMargin;
        r02 = ((ViewGroup.MarginLayoutParams) r03).bottomMargin;
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: e */
    public final int mo5254e(View r3) {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        C2431qv r0 = (C2431qv) r3.getLayoutParams();
        int r32 = this.f9328a.getDecoratedTop(r3);
        int r02 = ((ViewGroup.MarginLayoutParams) r0).topMargin;
    L6:
        return r32 - r02;
    L7:
        C2431qv r03 = (C2431qv) r3.getLayoutParams();
        r32 = this.f9328a.getDecoratedLeft(r3);
        r02 = ((ViewGroup.MarginLayoutParams) r03).leftMargin;
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: f */
    public final int mo5255f() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f9328a.getHeight();
    L7:
        return this.f9328a.getWidth();
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: g */
    public final int mo5256g() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC1160i r0 = this.f9328a;
        int r1 = r0.getHeight();
        int r02 = r0.getPaddingBottom();
    L6:
        return r1 - r02;
    L7:
        AbstractC1160i r03 = this.f9328a;
        r1 = r03.getWidth();
        r02 = r03.getPaddingRight();
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: h */
    public final int mo5257h() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f9328a.getPaddingBottom();
    L7:
        return this.f9328a.getPaddingRight();
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: i */
    public final int mo5258i() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f9328a.getHeightMode();
    L7:
        return this.f9328a.getWidthMode();
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: j */
    public final int mo5259j() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f9328a.getWidthMode();
    L7:
        return this.f9328a.getHeightMode();
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: k */
    public final int mo5260k() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f9328a.getPaddingTop();
    L7:
        return this.f9328a.getPaddingLeft();
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: l */
    public final int mo5261l() {
        switch(this.f9250d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC1160i r0 = this.f9328a;
        int r1 = r0.getHeight() - r0.getPaddingTop();
        int r02 = r0.getPaddingBottom();
    L6:
        return r1 - r02;
    L7:
        AbstractC1160i r03 = this.f9328a;
        r1 = r03.getWidth() - r03.getPaddingLeft();
        r02 = r03.getPaddingRight();
        goto L6
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: m */
    public final int mo5262m(View r4) {
        switch(this.f9250d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC1160i r0 = this.f9328a;
        Rect r2 = this.f9330c;
        r0.getTransformedBoundingBox(r4, true, r2);
        return r2.bottom;
    L6:
        AbstractC1160i r02 = this.f9328a;
        Rect r22 = this.f9330c;
        r02.getTransformedBoundingBox(r4, true, r22);
        return r22.right;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: n */
    public final int mo5263n(View r4) {
        switch(this.f9250d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC1160i r0 = this.f9328a;
        Rect r2 = this.f9330c;
        r0.getTransformedBoundingBox(r4, true, r2);
        return r2.top;
    L6:
        AbstractC1160i r02 = this.f9328a;
        Rect r22 = this.f9330c;
        r02.getTransformedBoundingBox(r4, true, r22);
        return r22.left;
    }

    @Override // p000.AbstractC2730xt
    /* JADX INFO: renamed from: o */
    public final void mo5264o(int r2) {
        switch(this.f9250d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f9328a.offsetChildrenVertical(r2);
        return;
    L6:
        this.f9328a.offsetChildrenHorizontal(r2);
    }
}
