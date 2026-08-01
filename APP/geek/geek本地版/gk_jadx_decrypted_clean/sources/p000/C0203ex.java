package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ex */
/* JADX INFO: loaded from: classes.dex */
public final class C0203ex extends AbstractC0019ai {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0203ex(AbstractC0540nz abstractC0540nz, int i) {
        super(abstractC0540nz);
        this.f1864d = i;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: b */
    public final int mo98b(View view) {
        int right;
        int i;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                right = view.getRight() + ((C0577oz) view.getLayoutParams()).f3622b.right;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                right = view.getBottom() + ((C0577oz) view.getLayoutParams()).f3622b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: c */
    public final int mo99c(View view) {
        int measuredWidth;
        int i;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                Rect rect = ((C0577oz) view.getLayoutParams()).f3622b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                Rect rect2 = ((C0577oz) view.getLayoutParams()).f3622b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0577oz2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: d */
    public final int mo100d(View view) {
        int measuredHeight;
        int i;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                Rect rect = ((C0577oz) view.getLayoutParams()).f3622b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0577oz).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).bottomMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                Rect rect2 = ((C0577oz) view.getLayoutParams()).f3622b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0577oz2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: e */
    public final int mo101e(View view) {
        int left;
        int i;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                C0577oz c0577oz = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                left = view.getLeft() - ((C0577oz) view.getLayoutParams()).f3622b.left;
                i = ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin;
                break;
            default:
                C0577oz c0577oz2 = (C0577oz) view.getLayoutParams();
                ((AbstractC0540nz) this.f144b).getClass();
                left = view.getTop() - ((C0577oz) view.getLayoutParams()).f3622b.top;
                i = ((ViewGroup.MarginLayoutParams) c0577oz2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: f */
    public final int mo102f() {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0540nz) this.f144b).f3468n;
            default:
                return ((AbstractC0540nz) this.f144b).f3469o;
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: g */
    public final int mo103g() {
        int i;
        int iM1962D;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0540nz abstractC0540nz = (AbstractC0540nz) this.f144b;
                i = abstractC0540nz.f3468n;
                iM1962D = abstractC0540nz.m1962D();
                break;
            default:
                AbstractC0540nz abstractC0540nz2 = (AbstractC0540nz) this.f144b;
                i = abstractC0540nz2.f3469o;
                iM1962D = abstractC0540nz2.m1960B();
                break;
        }
        return i - iM1962D;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: h */
    public final int mo104h() {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0540nz) this.f144b).m1962D();
            default:
                return ((AbstractC0540nz) this.f144b).m1960B();
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: i */
    public final int mo105i() {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0540nz) this.f144b).f3466l;
            default:
                return ((AbstractC0540nz) this.f144b).f3467m;
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: j */
    public final int mo106j() {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0540nz) this.f144b).f3467m;
            default:
                return ((AbstractC0540nz) this.f144b).f3466l;
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: k */
    public final int mo107k() {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0540nz) this.f144b).m1961C();
            default:
                return ((AbstractC0540nz) this.f144b).m1963E();
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: l */
    public final int mo108l() {
        int iM1961C;
        int iM1962D;
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0540nz abstractC0540nz = (AbstractC0540nz) this.f144b;
                iM1961C = abstractC0540nz.f3468n - abstractC0540nz.m1961C();
                iM1962D = abstractC0540nz.m1962D();
                break;
            default:
                AbstractC0540nz abstractC0540nz2 = (AbstractC0540nz) this.f144b;
                iM1961C = abstractC0540nz2.f3469o - abstractC0540nz2.m1963E();
                iM1962D = abstractC0540nz2.m1960B();
                break;
        }
        return iM1961C - iM1962D;
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: m */
    public final int mo109m(View view) {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0540nz abstractC0540nz = (AbstractC0540nz) this.f144b;
                Rect rect = (Rect) this.f145c;
                abstractC0540nz.m1964I(view, rect);
                return rect.right;
            default:
                AbstractC0540nz abstractC0540nz2 = (AbstractC0540nz) this.f144b;
                Rect rect2 = (Rect) this.f145c;
                abstractC0540nz2.m1964I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: n */
    public final int mo110n(View view) {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0540nz abstractC0540nz = (AbstractC0540nz) this.f144b;
                Rect rect = (Rect) this.f145c;
                abstractC0540nz.m1964I(view, rect);
                return rect.left;
            default:
                AbstractC0540nz abstractC0540nz2 = (AbstractC0540nz) this.f144b;
                Rect rect2 = (Rect) this.f145c;
                abstractC0540nz2.m1964I(view, rect2);
                return rect2.top;
        }
    }

    @Override // p000.AbstractC0019ai
    /* JADX INFO: renamed from: o */
    public final void mo111o(int i) {
        switch (this.f1864d) {
            case Base64.DEFAULT /* 0 */:
                ((AbstractC0540nz) this.f144b).mo433M(i);
                break;
            default:
                ((AbstractC0540nz) this.f144b).mo435N(i);
                break;
        }
    }
}
