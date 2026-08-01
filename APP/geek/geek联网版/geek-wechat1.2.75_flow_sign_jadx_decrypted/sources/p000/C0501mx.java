package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: mx */
/* JADX INFO: loaded from: classes.dex */
public final class C0501mx extends AbstractC0105ci {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0501mx(AbstractC0799uz abstractC0799uz, int i) {
        super(abstractC0799uz);
        this.f3195d = i;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: b */
    public final int mo636b(View view) {
        int right;
        int i;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                right = view.getRight() + ((C0836vz) view.getLayoutParams()).f5018b.right;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                right = view.getBottom() + ((C0836vz) view.getLayoutParams()).f5018b.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: c */
    public final int mo637c(View view) {
        int measuredWidth;
        int i;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                Rect rect = ((C0836vz) view.getLayoutParams()).f5018b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                Rect rect2 = ((C0836vz) view.getLayoutParams()).f5018b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0836vz2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: d */
    public final int mo638d(View view) {
        int measuredHeight;
        int i;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                Rect rect = ((C0836vz) view.getLayoutParams()).f5018b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0836vz).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).bottomMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                Rect rect2 = ((C0836vz) view.getLayoutParams()).f5018b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0836vz2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: e */
    public final int mo639e(View view) {
        int left;
        int i;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                C0836vz c0836vz = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                left = view.getLeft() - ((C0836vz) view.getLayoutParams()).f5018b.left;
                i = ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin;
                break;
            default:
                C0836vz c0836vz2 = (C0836vz) view.getLayoutParams();
                ((AbstractC0799uz) this.f897b).getClass();
                left = view.getTop() - ((C0836vz) view.getLayoutParams()).f5018b.top;
                i = ((ViewGroup.MarginLayoutParams) c0836vz2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: f */
    public final int mo640f() {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0799uz) this.f897b).f4868n;
            default:
                return ((AbstractC0799uz) this.f897b).f4869o;
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: g */
    public final int mo641g() {
        int i;
        int iM2510D;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0799uz abstractC0799uz = (AbstractC0799uz) this.f897b;
                i = abstractC0799uz.f4868n;
                iM2510D = abstractC0799uz.m2510D();
                break;
            default:
                AbstractC0799uz abstractC0799uz2 = (AbstractC0799uz) this.f897b;
                i = abstractC0799uz2.f4869o;
                iM2510D = abstractC0799uz2.m2508B();
                break;
        }
        return i - iM2510D;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: h */
    public final int mo642h() {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0799uz) this.f897b).m2510D();
            default:
                return ((AbstractC0799uz) this.f897b).m2508B();
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: i */
    public final int mo643i() {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0799uz) this.f897b).f4866l;
            default:
                return ((AbstractC0799uz) this.f897b).f4867m;
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: j */
    public final int mo644j() {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0799uz) this.f897b).f4867m;
            default:
                return ((AbstractC0799uz) this.f897b).f4866l;
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: k */
    public final int mo645k() {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                return ((AbstractC0799uz) this.f897b).m2509C();
            default:
                return ((AbstractC0799uz) this.f897b).m2511E();
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: l */
    public final int mo646l() {
        int iM2509C;
        int iM2510D;
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0799uz abstractC0799uz = (AbstractC0799uz) this.f897b;
                iM2509C = abstractC0799uz.f4868n - abstractC0799uz.m2509C();
                iM2510D = abstractC0799uz.m2510D();
                break;
            default:
                AbstractC0799uz abstractC0799uz2 = (AbstractC0799uz) this.f897b;
                iM2509C = abstractC0799uz2.f4869o - abstractC0799uz2.m2511E();
                iM2510D = abstractC0799uz2.m2508B();
                break;
        }
        return iM2509C - iM2510D;
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: m */
    public final int mo647m(View view) {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0799uz abstractC0799uz = (AbstractC0799uz) this.f897b;
                Rect rect = (Rect) this.f898c;
                abstractC0799uz.m2512I(view, rect);
                return rect.right;
            default:
                AbstractC0799uz abstractC0799uz2 = (AbstractC0799uz) this.f897b;
                Rect rect2 = (Rect) this.f898c;
                abstractC0799uz2.m2512I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: n */
    public final int mo648n(View view) {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0799uz abstractC0799uz = (AbstractC0799uz) this.f897b;
                Rect rect = (Rect) this.f898c;
                abstractC0799uz.m2512I(view, rect);
                return rect.left;
            default:
                AbstractC0799uz abstractC0799uz2 = (AbstractC0799uz) this.f897b;
                Rect rect2 = (Rect) this.f898c;
                abstractC0799uz2.m2512I(view, rect2);
                return rect2.top;
        }
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: o */
    public final void mo649o(int i) {
        switch (this.f3195d) {
            case Base64.DEFAULT /* 0 */:
                ((AbstractC0799uz) this.f897b).mo418M(i);
                break;
            default:
                ((AbstractC0799uz) this.f897b).mo420N(i);
                break;
        }
    }
}
