package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8987 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30315 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f30316 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f30317 = 1;

    /* JADX INFO: renamed from: ۥ */
    public final RecyclerView.AbstractC8919 f3981;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3982;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Rect f30318;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ */
    public static class C1780 extends AbstractC8987 {
        public C1780(RecyclerView.AbstractC8919 abstractC8919) {
            super(abstractC8919, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo30700(View view) {
            return this.f3981.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C8922) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo30701(View view) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            return this.f3981.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c8922).leftMargin + ((ViewGroup.MarginLayoutParams) c8922).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo30702(View view) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            return this.f3981.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c8922).topMargin + ((ViewGroup.MarginLayoutParams) c8922).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo30703(View view) {
            return this.f3981.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C8922) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public int mo30704() {
            return this.f3981.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo30705() {
            return this.f3981.getWidth() - this.f3981.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public int mo30706() {
            return this.f3981.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public int mo30708() {
            return this.f3981.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public int mo30709() {
            return this.f3981.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo30710() {
            return this.f3981.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public int mo30711() {
            return (this.f3981.getWidth() - this.f3981.getPaddingLeft()) - this.f3981.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public int mo30713(View view) {
            this.f3981.getTransformedBoundingBox(view, true, this.f30318);
            return this.f30318.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public int mo30714(View view) {
            this.f3981.getTransformedBoundingBox(view, true, this.f30318);
            return this.f30318.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo30715(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo30716(int i) {
            this.f3981.offsetChildrenHorizontal(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ۟ */
    public static class C1781 extends AbstractC8987 {
        public C1781(RecyclerView.AbstractC8919 abstractC8919) {
            super(abstractC8919, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo30700(View view) {
            return this.f3981.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C8922) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo30701(View view) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            return this.f3981.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c8922).topMargin + ((ViewGroup.MarginLayoutParams) c8922).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo30702(View view) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            return this.f3981.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c8922).leftMargin + ((ViewGroup.MarginLayoutParams) c8922).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo30703(View view) {
            return this.f3981.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C8922) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public int mo30704() {
            return this.f3981.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo30705() {
            return this.f3981.getHeight() - this.f3981.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public int mo30706() {
            return this.f3981.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public int mo30708() {
            return this.f3981.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public int mo30709() {
            return this.f3981.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo30710() {
            return this.f3981.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public int mo30711() {
            return (this.f3981.getHeight() - this.f3981.getPaddingTop()) - this.f3981.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public int mo30713(View view) {
            this.f3981.getTransformedBoundingBox(view, true, this.f30318);
            return this.f30318.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public int mo30714(View view) {
            this.f3981.getTransformedBoundingBox(view, true, this.f30318);
            return this.f30318.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo30715(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        @Override // androidx.recyclerview.widget.AbstractC8987
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo30716(int i) {
            this.f3981.offsetChildrenVertical(i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠) A[MD:(androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠):void (m)] (LINE:1) call: androidx.recyclerview.widget.ۥ۟۟۠۠.<init>(androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC8987(RecyclerView.AbstractC8919 abstractC8919, C1780 c1780) {
        this(abstractC8919);
    }

    /* JADX INFO: renamed from: ۥ */
    public static AbstractC8987 m5003(RecyclerView.AbstractC8919 abstractC8919) {
        return new C1780(abstractC8919);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static AbstractC8987 m5004(RecyclerView.AbstractC8919 abstractC8919, int i) {
        if (i == 0) {
            return m5003(abstractC8919);
        }
        if (i == 1) {
            return m30699(abstractC8919);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static AbstractC8987 m30699(RecyclerView.AbstractC8919 abstractC8919) {
        return new C1781(abstractC8919);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract int mo30700(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract int mo30701(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract int mo30702(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract int mo30703(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract int mo30704();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract int mo30705();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract int mo30706();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public RecyclerView.AbstractC8919 m30707() {
        return this.f3981;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract int mo30708();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract int mo30709();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract int mo30710();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public abstract int mo30711();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m30712() {
        if (Integer.MIN_VALUE == this.f3982) {
            return 0;
        }
        return mo30711() - this.f3982;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract int mo30713(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract int mo30714(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract void mo30715(View view, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract void mo30716(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m30717() {
        this.f3982 = mo30711();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8987(RecyclerView.AbstractC8919 abstractC8919) {
        this.f3982 = Integer.MIN_VALUE;
        this.f30318 = new Rect();
        this.f3981 = abstractC8919;
    }
}
