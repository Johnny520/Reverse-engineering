package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.C1098R;
import androidx.fragment.app.AbstractC1104f;
import androidx.fragment.app.C1101c;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p000a.AbstractC0553e7;
import p000a.C0309R1;
import p000a.C0631i9;
import p000a.C0739o3;
import p000a.C0815s3;
import p000a.C0944z;
import p000a.RunnableC0273P0;
import p000a.RunnableC0603h0;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1099a extends AbstractC1104f {

    /* JADX INFO: renamed from: androidx.fragment.app.a$a */
    public static final class a extends AbstractC1104f.a {

        /* JADX INFO: renamed from: c */
        public final b f4518c;

        /* JADX INFO: renamed from: androidx.fragment.app.a$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC1341a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC1104f.c f4519a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewGroup f4520b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ View f4521c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a f4522d;

            public AnimationAnimationListenerC1341a(AbstractC1104f.c cVar, ViewGroup viewGroup, View view, a aVar) {
                this.f4519a = cVar;
                this.f4520b = viewGroup;
                this.f4521c = view;
                this.f4522d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                C0631i9.m1482e(animation, "animation");
                View view = this.f4521c;
                a aVar = this.f4522d;
                ViewGroup viewGroup = this.f4520b;
                viewGroup.post(new RunnableC0603h0(viewGroup, view, aVar, 1));
                if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4519a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                C0631i9.m1482e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                C0631i9.m1482e(animation, "animation");
                if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4519a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            this.f4518c = bVar;
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: a */
        public final void mo2515a(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
            b bVar = this.f4518c;
            AbstractC1104f.c cVar = bVar.f4535a;
            View view = cVar.f4621c.f4543G;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            bVar.f4535a.m2575c(this);
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: b */
        public final void mo2516b(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
            b bVar = this.f4518c;
            boolean zM2523a = bVar.m2523a();
            AbstractC1104f.c cVar = bVar.f4535a;
            if (zM2523a) {
                cVar.m2575c(this);
                return;
            }
            Context context = viewGroup.getContext();
            View view = cVar.f4621c.f4543G;
            C0631i9.m1481d(context, "context");
            C1101c.a aVarM2517b = bVar.m2517b(context);
            if (aVarM2517b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarM2517b.f4597a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (cVar.f4619a != AbstractC1104f.c.b.f4634a) {
                view.startAnimation(animation);
                cVar.m2575c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            C1101c.b bVar2 = new C1101c.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC1341a(cVar, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has started.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$b */
    public static final class b extends f {

        /* JADX INFO: renamed from: b */
        public final boolean f4523b;

        /* JADX INFO: renamed from: c */
        public boolean f4524c;

        /* JADX INFO: renamed from: d */
        public C1101c.a f4525d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC1104f.c cVar, boolean z) {
            super(cVar);
            C0631i9.m1482e(cVar, "operation");
            this.f4523b = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00df A[Catch: RuntimeException -> 0x00e5, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:78:0x00d9, B:80:0x00df), top: B:91:0x00d9 }] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C1101c.a m2517b(Context context) {
            int iM2542a;
            Animation animationLoadAnimation;
            C1101c.a aVar;
            Animator animatorLoadAnimator;
            if (this.f4524c) {
                return this.f4525d;
            }
            AbstractC1104f.c cVar = this.f4535a;
            ComponentCallbacksC1100b componentCallbacksC1100b = cVar.f4621c;
            boolean z = cVar.f4619a == AbstractC1104f.c.b.f4635b;
            ComponentCallbacksC1100b.d dVar = componentCallbacksC1100b.f4546J;
            int i = dVar == null ? 0 : dVar.f4591f;
            if (this.f4523b) {
                if (z) {
                    iM2542a = dVar == null ? 0 : dVar.f4589d;
                } else if (dVar != null) {
                    iM2542a = dVar.f4590e;
                }
            } else if (z) {
                if (dVar != null) {
                    iM2542a = dVar.f4587b;
                }
            } else if (dVar != null) {
                iM2542a = dVar.f4588c;
            }
            componentCallbacksC1100b.m2527D(0, 0, 0, 0);
            ViewGroup viewGroup = componentCallbacksC1100b.f4542F;
            C1101c.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(C1098R.id.visible_removing_fragment_view_tag) != null) {
                componentCallbacksC1100b.f4542F.setTag(C1098R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = componentCallbacksC1100b.f4542F;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                if (iM2542a == 0 && i != 0) {
                    iM2542a = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z ? C1101c.m2542a(context, R.attr.activityOpenEnterAnimation) : C1101c.m2542a(context, R.attr.activityOpenExitAnimation) : z ? C1098R.animator.fragment_fade_enter : C1098R.animator.fragment_fade_exit : z ? C1101c.m2542a(context, R.attr.activityCloseEnterAnimation) : C1101c.m2542a(context, R.attr.activityCloseExitAnimation) : z ? C1098R.animator.fragment_close_enter : C1098R.animator.fragment_close_exit : z ? C1098R.animator.fragment_open_enter : C1098R.animator.fragment_open_exit;
                }
                if (iM2542a != 0) {
                    boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM2542a));
                    if (zEquals) {
                        try {
                            animationLoadAnimation = AnimationUtils.loadAnimation(context, iM2542a);
                        } catch (Resources.NotFoundException e) {
                            throw e;
                        } catch (RuntimeException unused) {
                            try {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM2542a);
                                if (animatorLoadAnimator != null) {
                                }
                            } catch (RuntimeException e2) {
                                if (zEquals) {
                                    throw e2;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM2542a);
                                if (animationLoadAnimation2 != null) {
                                    aVar2 = new C1101c.a(animationLoadAnimation2);
                                }
                            }
                        }
                        if (animationLoadAnimation != null) {
                            aVar = new C1101c.a(animationLoadAnimation);
                            aVar2 = aVar;
                        }
                    } else {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM2542a);
                        if (animatorLoadAnimator != null) {
                            aVar = new C1101c.a(animatorLoadAnimator);
                            aVar2 = aVar;
                        }
                    }
                }
            }
            this.f4525d = aVar2;
            this.f4524c = true;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$c */
    public static final class c extends AbstractC1104f.a {

        /* JADX INFO: renamed from: c */
        public final b f4526c;

        /* JADX INFO: renamed from: d */
        public AnimatorSet f4527d;

        /* JADX INFO: renamed from: androidx.fragment.app.a$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewGroup f4528a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f4529b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f4530c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AbstractC1104f.c f4531d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ c f4532e;

            public a(ViewGroup viewGroup, View view, boolean z, AbstractC1104f.c cVar, c cVar2) {
                this.f4528a = viewGroup;
                this.f4529b = view;
                this.f4530c = z;
                this.f4531d = cVar;
                this.f4532e = cVar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C0631i9.m1482e(animator, "anim");
                ViewGroup viewGroup = this.f4528a;
                View view = this.f4529b;
                viewGroup.endViewTransition(view);
                boolean z = this.f4530c;
                AbstractC1104f.c cVar = this.f4531d;
                if (z) {
                    AbstractC1104f.c.b bVar = cVar.f4619a;
                    C0631i9.m1481d(view, "viewToAnimate");
                    bVar.m2577a(view, viewGroup);
                }
                c cVar2 = this.f4532e;
                cVar2.f4526c.f4535a.m2575c(cVar2);
                if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "Animator from operation " + cVar + " has ended.");
                }
            }
        }

        public c(b bVar) {
            this.f4526c = bVar;
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: a */
        public final void mo2515a(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
            AnimatorSet animatorSet = this.f4527d;
            b bVar = this.f4526c;
            if (animatorSet == null) {
                bVar.f4535a.m2575c(this);
                return;
            }
            AbstractC1104f.c cVar = bVar.f4535a;
            if (cVar.f4625g) {
                e.f4534a.m2521a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (AbstractC0553e7.m1330J(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(cVar);
                sb.append(" has been canceled");
                sb.append(cVar.f4625g ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: b */
        public final void mo2516b(ViewGroup viewGroup) {
            C0631i9.m1482e(viewGroup, "container");
            AbstractC1104f.c cVar = this.f4526c.f4535a;
            AnimatorSet animatorSet = this.f4527d;
            if (animatorSet == null) {
                cVar.m2575c(this);
                return;
            }
            animatorSet.start();
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Animator from operation " + cVar + " has started.");
            }
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: c */
        public final void mo2518c(C0309R1 c0309r1, ViewGroup viewGroup) {
            C0631i9.m1482e(c0309r1, "backEvent");
            C0631i9.m1482e(viewGroup, "container");
            AbstractC1104f.c cVar = this.f4526c.f4535a;
            AnimatorSet animatorSet = this.f4527d;
            if (animatorSet == null) {
                cVar.m2575c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !cVar.f4621c.f4569m) {
                return;
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + cVar);
            }
            long jM2520a = d.f4533a.m2520a(animatorSet);
            long j = (long) (c0309r1.f1111c * jM2520a);
            if (j == 0) {
                j = 1;
            }
            if (j == jM2520a) {
                j = jM2520a - 1;
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + cVar);
            }
            e.f4534a.m2522b(animatorSet, j);
        }

        @Override // androidx.fragment.app.AbstractC1104f.a
        /* JADX INFO: renamed from: d */
        public final void mo2519d(ViewGroup viewGroup) {
            c cVar;
            C0631i9.m1482e(viewGroup, "container");
            b bVar = this.f4526c;
            if (bVar.m2523a()) {
                return;
            }
            Context context = viewGroup.getContext();
            C0631i9.m1481d(context, "context");
            C1101c.a aVarM2517b = bVar.m2517b(context);
            this.f4527d = aVarM2517b != null ? aVarM2517b.f4598b : null;
            AbstractC1104f.c cVar2 = bVar.f4535a;
            ComponentCallbacksC1100b componentCallbacksC1100b = cVar2.f4621c;
            boolean z = cVar2.f4619a == AbstractC1104f.c.b.f4636c;
            View view = componentCallbacksC1100b.f4543G;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f4527d;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z, cVar2, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f4527d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f4533a = new d();

        /* JADX INFO: renamed from: a */
        public final long m2520a(AnimatorSet animatorSet) {
            C0631i9.m1482e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final e f4534a = new e();

        /* JADX INFO: renamed from: a */
        public final void m2521a(AnimatorSet animatorSet) {
            C0631i9.m1482e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        /* JADX INFO: renamed from: b */
        public final void m2522b(AnimatorSet animatorSet, long j) {
            C0631i9.m1482e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final AbstractC1104f.c f4535a;

        public f(AbstractC1104f.c cVar) {
            C0631i9.m1482e(cVar, "operation");
            this.f4535a = cVar;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m2523a() {
            AbstractC1104f.c.b bVar;
            AbstractC1104f.c cVar = this.f4535a;
            View view = cVar.f4621c.f4543G;
            AbstractC1104f.c.b bVar2 = AbstractC1104f.c.b.f4635b;
            if (view != null) {
                float alpha = view.getAlpha();
                bVar = AbstractC1104f.c.b.f4637d;
                if (alpha != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        bVar = bVar2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(C0944z.m2225e("Unknown visibility ", visibility));
                        }
                        bVar = AbstractC1104f.c.b.f4636c;
                    }
                }
            } else {
                bVar = null;
            }
            AbstractC1104f.c.b bVar3 = cVar.f4619a;
            if (bVar != bVar3) {
                return (bVar == bVar2 || bVar3 == bVar2) ? false : true;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.a$g */
    public static final class g extends f {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @Override // androidx.fragment.app.AbstractC1104f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2514b(ArrayList arrayList, boolean z) {
        AbstractC1104f.c.b bVar;
        AbstractC1104f.c.b bVar2;
        AbstractC1104f.c.b bVar3;
        Object next;
        Object obj;
        AbstractC1104f.c.b bVar4;
        AbstractC1104f.c.b bVar5;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = AbstractC1104f.c.b.f4636c;
            bVar2 = AbstractC1104f.c.b.f4635b;
            bVar3 = AbstractC1104f.c.b.f4637d;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC1104f.c cVar = (AbstractC1104f.c) next;
            View view = cVar.f4621c.f4543G;
            C0631i9.m1481d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    bVar5 = bVar2;
                } else if (visibility == 4) {
                    bVar5 = bVar3;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(C0944z.m2225e("Unknown visibility ", visibility));
                    }
                    bVar5 = bVar;
                }
                if (bVar5 == bVar2 && cVar.f4619a != bVar2) {
                    break;
                }
            }
        }
        AbstractC1104f.c cVar2 = (AbstractC1104f.c) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            Object objPrevious = listIterator.previous();
            AbstractC1104f.c cVar3 = (AbstractC1104f.c) objPrevious;
            View view2 = cVar3.f4621c.f4543G;
            C0631i9.m1481d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    bVar4 = bVar2;
                } else if (visibility2 == 4) {
                    bVar4 = bVar3;
                } else {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(C0944z.m2225e("Unknown visibility ", visibility2));
                    }
                    bVar4 = bVar;
                }
                if (bVar4 != bVar2 && cVar3.f4619a == bVar2) {
                    obj = objPrevious;
                    break;
                }
            }
        }
        AbstractC1104f.c cVar4 = (AbstractC1104f.c) obj;
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList<b> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ComponentCallbacksC1100b componentCallbacksC1100b = ((AbstractC1104f.c) arrayList.get(C0739o3.m1756c0(arrayList))).f4621c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC1100b.d dVar = ((AbstractC1104f.c) it2.next()).f4621c.f4546J;
            ComponentCallbacksC1100b.d dVar2 = componentCallbacksC1100b.f4546J;
            dVar.f4587b = dVar2.f4587b;
            dVar.f4588c = dVar2.f4588c;
            dVar.f4589d = dVar2.f4589d;
            dVar.f4590e = dVar2.f4590e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC1104f.c cVar5 = (AbstractC1104f.c) it3.next();
            arrayList2.add(new b(cVar5, z));
            if (!z ? cVar5 == cVar4 : cVar5 == cVar2) {
                z2 = true;
            }
            g gVar = new g(cVar5);
            AbstractC1104f.c.b bVar6 = cVar5.f4619a;
            ComponentCallbacksC1100b componentCallbacksC1100b2 = cVar5.f4621c;
            if (bVar6 == bVar2) {
                if (z) {
                    ComponentCallbacksC1100b.d dVar3 = componentCallbacksC1100b2.f4546J;
                } else {
                    componentCallbacksC1100b2.getClass();
                }
            } else if (z) {
                ComponentCallbacksC1100b.d dVar4 = componentCallbacksC1100b2.f4546J;
            } else {
                componentCallbacksC1100b2.getClass();
            }
            if (cVar5.f4619a == bVar2) {
                if (z) {
                    ComponentCallbacksC1100b.d dVar5 = componentCallbacksC1100b2.f4546J;
                } else {
                    ComponentCallbacksC1100b.d dVar6 = componentCallbacksC1100b2.f4546J;
                }
            }
            if (z2) {
                if (z) {
                    ComponentCallbacksC1100b.d dVar7 = componentCallbacksC1100b2.f4546J;
                } else {
                    componentCallbacksC1100b2.getClass();
                }
            }
            arrayList3.add(gVar);
            cVar5.f4622d.add(new RunnableC0273P0(this, 4, cVar5));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((g) obj2).m2523a()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((g) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((g) it5.next()).getClass();
        }
        ArrayList<b> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            C0815s3.m1886h0(arrayList7, ((b) it6.next()).f4535a.f4629k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z3 = false;
        for (b bVar7 : arrayList2) {
            Context context = this.f4611a.getContext();
            AbstractC1104f.c cVar6 = bVar7.f4535a;
            C0631i9.m1481d(context, "context");
            C1101c.a aVarM2517b = bVar7.m2517b(context);
            if (aVarM2517b != null) {
                if (aVarM2517b.f4598b == null) {
                    arrayList6.add(bVar7);
                } else {
                    ComponentCallbacksC1100b componentCallbacksC1100b3 = cVar6.f4621c;
                    if (cVar6.f4629k.isEmpty()) {
                        if (cVar6.f4619a == bVar) {
                            cVar6.f4627i = false;
                        }
                        cVar6.f4628j.add(new c(bVar7));
                        z3 = true;
                    } else if (AbstractC0553e7.m1330J(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + componentCallbacksC1100b3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar8 : arrayList6) {
            AbstractC1104f.c cVar7 = bVar8.f4535a;
            ComponentCallbacksC1100b componentCallbacksC1100b4 = cVar7.f4621c;
            if (zIsEmpty) {
                if (!z3) {
                    cVar7.f4628j.add(new a(bVar8));
                } else if (AbstractC0553e7.m1330J(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC1100b4 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC0553e7.m1330J(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC1100b4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
