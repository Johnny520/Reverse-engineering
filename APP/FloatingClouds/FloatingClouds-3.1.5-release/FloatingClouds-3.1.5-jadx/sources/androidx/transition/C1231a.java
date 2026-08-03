package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import p000a.C0017Ag;
import p000a.C0108Ff;
import p000a.C0307Qg;
import p000a.C0337Sb;

/* JADX INFO: renamed from: androidx.transition.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1231a extends AbstractC1235e {

    /* JADX INFO: renamed from: C */
    public static final String[] f5217C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: D */
    public static final a f5218D = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: E */
    public static final b f5219E = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: F */
    public static final c f5220F = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: G */
    public static final d f5221G = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: H */
    public static final e f5222H = new e(PointF.class, "position");

    /* JADX INFO: renamed from: androidx.transition.a$a */
    public class a extends Property<g, PointF> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(g gVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(g gVar, PointF pointF) {
            g gVar2 = gVar;
            PointF pointF2 = pointF;
            gVar2.getClass();
            gVar2.f5225a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            gVar2.f5226b = iRound;
            int i = gVar2.f5230f + 1;
            gVar2.f5230f = i;
            if (i == gVar2.f5231g) {
                C0307Qg.m854a(gVar2.f5229e, gVar2.f5225a, iRound, gVar2.f5227c, gVar2.f5228d);
                gVar2.f5230f = 0;
                gVar2.f5231g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$b */
    public class b extends Property<g, PointF> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(g gVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(g gVar, PointF pointF) {
            g gVar2 = gVar;
            PointF pointF2 = pointF;
            gVar2.getClass();
            gVar2.f5227c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            gVar2.f5228d = iRound;
            int i = gVar2.f5231g + 1;
            gVar2.f5231g = i;
            if (gVar2.f5230f == i) {
                C0307Qg.m854a(gVar2.f5229e, gVar2.f5225a, gVar2.f5226b, gVar2.f5227c, iRound);
                gVar2.f5230f = 0;
                gVar2.f5231g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$c */
    public class c extends Property<View, PointF> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0307Qg.m854a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$d */
    public class d extends Property<View, PointF> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C0307Qg.m854a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$e */
    public class e extends Property<View, PointF> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            C0307Qg.m854a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$f */
    public static class f extends C1236f {

        /* JADX INFO: renamed from: a */
        public boolean f5223a = false;

        /* JADX INFO: renamed from: b */
        public final ViewGroup f5224b;

        public f(ViewGroup viewGroup) {
            this.f5224b = viewGroup;
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: c */
        public final void mo3020c() {
            C0017Ag.m50a(this.f5224b, false);
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: e */
        public final void mo3021e(AbstractC1235e abstractC1235e) {
            C0017Ag.m50a(this.f5224b, false);
            this.f5223a = true;
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
            if (!this.f5223a) {
                C0017Ag.m50a(this.f5224b, false);
            }
            abstractC1235e.mo3058y(this);
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: g */
        public final void mo3023g() {
            C0017Ag.m50a(this.f5224b, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.a$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public int f5225a;

        /* JADX INFO: renamed from: b */
        public int f5226b;

        /* JADX INFO: renamed from: c */
        public int f5227c;

        /* JADX INFO: renamed from: d */
        public int f5228d;

        /* JADX INFO: renamed from: e */
        public final View f5229e;

        /* JADX INFO: renamed from: f */
        public int f5230f;

        /* JADX INFO: renamed from: g */
        public int f5231g;

        public g(View view) {
            this.f5229e = view;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m3015K(C0108Ff c0108Ff) {
        View view = c0108Ff.f367b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c0108Ff.f366a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c0108Ff.f367b.getParent());
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: d */
    public final void mo3016d(C0108Ff c0108Ff) {
        m3015K(c0108Ff);
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: g */
    public final void mo3017g(C0108Ff c0108Ff) {
        m3015K(c0108Ff);
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: k */
    public final Animator mo3018k(FrameLayout frameLayout, C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        int i;
        C1231a c1231a;
        Animator animatorM928a;
        if (c0108Ff != null && c0108Ff2 != null) {
            HashMap map = c0108Ff.f366a;
            HashMap map2 = c0108Ff2.f366a;
            ViewGroup viewGroup = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup2 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup != null && viewGroup2 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                    i = 0;
                } else {
                    i = (i2 == i3 && i4 == i5) ? 0 : 1;
                    if (i6 != i7 || i8 != i9) {
                        i++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i++;
                }
                if (i > 0) {
                    View view = c0108Ff2.f367b;
                    C0307Qg.m854a(view, i2, i4, i6, i8);
                    if (i != 2) {
                        c1231a = this;
                        animatorM928a = (i2 == i3 && i4 == i5) ? C0337Sb.m928a(view, f5220F, c1231a.f5259v.m3060g(i6, i8, i7, i9)) : C0337Sb.m928a(view, f5221G, c1231a.f5259v.m3060g(i2, i4, i3, i5));
                    } else if (i10 == i12 && i11 == i13) {
                        c1231a = this;
                        animatorM928a = C0337Sb.m928a(view, f5222H, c1231a.f5259v.m3060g(i2, i4, i3, i5));
                    } else {
                        c1231a = this;
                        g gVar = new g(view);
                        ObjectAnimator objectAnimatorM928a = C0337Sb.m928a(gVar, f5218D, c1231a.f5259v.m3060g(i2, i4, i3, i5));
                        ObjectAnimator objectAnimatorM928a2 = C0337Sb.m928a(gVar, f5219E, c1231a.f5259v.m3060g(i6, i8, i7, i9));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM928a, objectAnimatorM928a2);
                        animatorSet.addListener(new C1232b(gVar));
                        animatorM928a = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                        C0017Ag.m50a(viewGroup3, true);
                        c1231a.m3050o().m3040a(new f(viewGroup3));
                    }
                    return animatorM928a;
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: q */
    public final String[] mo3019q() {
        return f5217C;
    }
}
