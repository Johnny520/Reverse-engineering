package p064j0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import p000A.RunnableC0000a;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: j0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0968a extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public int f3437a;

    /* JADX INFO: renamed from: b */
    public int f3438b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f3439c;

    public C0968a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3439c = swipeDismissBehavior;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: K */
    public final void mo123K(View view, int i2) {
        this.f3438b = i2;
        this.f3437a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3439c;
            swipeDismissBehavior.f2275c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2275c = false;
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: L */
    public final void mo124L(int i2) {
        this.f3439c.getClass();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: M */
    public final void mo125M(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3439c;
        float f2 = width * swipeDismissBehavior.f2278f;
        float width2 = view.getWidth() * swipeDismissBehavior.f2279g;
        float fAbs = Math.abs(i2 - this.f3437a);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo126N(View view, float f2, float f3) {
        int i2;
        this.f3438b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f3439c;
        if (f2 != 0.0f) {
            Field field = AbstractC0080Q.f219a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.f2276d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z3 ? f2 < 0.0f : f2 > 0.0f) : !z3 ? f2 > 0.0f : f2 < 0.0f)) {
                i2 = this.f3437a;
                z2 = false;
            } else if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i4 = this.f3437a;
                i2 = left < i4 ? this.f3437a - width : i4 + width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f3437a) >= Math.round(view.getWidth() * swipeDismissBehavior.f2277e)) {
            }
        }
        if (swipeDismissBehavior.f2273a.m682n(i2, view.getTop())) {
            RunnableC0000a runnableC0000a = new RunnableC0000a(swipeDismissBehavior, view, z2);
            Field field2 = AbstractC0080Q.f219a;
            view.postOnAnimation(runnableC0000a);
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: d0 */
    public final boolean mo131d0(View view, int i2) {
        int i3 = this.f3438b;
        return (i3 == -1 || i3 == i2) && this.f3439c.mo1831r(view);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: k */
    public final int mo133k(View view, int i2) {
        int width;
        int width2;
        int width3;
        Field field = AbstractC0080Q.f219a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i3 = this.f3439c.f2276d;
        if (i3 == 0) {
            if (z2) {
                width = this.f3437a - view.getWidth();
                width2 = this.f3437a;
            } else {
                width = this.f3437a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f3437a - view.getWidth();
            width2 = view.getWidth() + this.f3437a;
        } else if (z2) {
            width = this.f3437a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3437a - view.getWidth();
            width2 = this.f3437a;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: l */
    public final int mo134l(View view, int i2) {
        return view.getTop();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: z */
    public final int mo136z(View view) {
        return view.getWidth();
    }
}
