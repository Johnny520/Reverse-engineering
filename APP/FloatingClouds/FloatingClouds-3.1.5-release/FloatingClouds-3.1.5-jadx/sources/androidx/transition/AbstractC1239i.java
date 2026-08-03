package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.transition.AbstractC1235e;
import java.util.HashMap;
import p000a.C0017Ag;
import p000a.C0090Ef;
import p000a.C0108Ff;
import p000a.C0307Qg;
import p000a.C0396Vg;

/* JADX INFO: renamed from: androidx.transition.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1239i extends AbstractC1235e {

    /* JADX INFO: renamed from: D */
    public static final String[] f5289D = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: C */
    public int f5290C = 3;

    /* JADX INFO: renamed from: androidx.transition.i$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC1235e.f {

        /* JADX INFO: renamed from: a */
        public final View f5291a;

        /* JADX INFO: renamed from: b */
        public final int f5292b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f5293c;

        /* JADX INFO: renamed from: e */
        public boolean f5295e;

        /* JADX INFO: renamed from: f */
        public boolean f5296f = false;

        /* JADX INFO: renamed from: d */
        public final boolean f5294d = true;

        public a(View view, int i) {
            this.f5291a = view;
            this.f5292b = i;
            this.f5293c = (ViewGroup) view.getParent();
            m3069h(true);
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: c */
        public final void mo3020c() {
            m3069h(false);
            if (this.f5296f) {
                return;
            }
            C0307Qg.m855b(this.f5291a, this.f5292b);
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: d */
        public final void mo3027d(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: e */
        public final void mo3021e(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
            abstractC1235e.mo3058y(this);
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: g */
        public final void mo3023g() {
            m3069h(true);
            if (this.f5296f) {
                return;
            }
            C0307Qg.m855b(this.f5291a, 0);
        }

        /* JADX INFO: renamed from: h */
        public final void m3069h(boolean z) {
            ViewGroup viewGroup;
            if (!this.f5294d || this.f5295e == z || (viewGroup = this.f5293c) == null) {
                return;
            }
            this.f5295e = z;
            C0017Ag.m50a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5296f = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f5296f) {
                C0307Qg.m855b(this.f5291a, this.f5292b);
                ViewGroup viewGroup = this.f5293c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m3069h(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                C0307Qg.m855b(this.f5291a, 0);
                ViewGroup viewGroup = this.f5293c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.f5296f) {
                C0307Qg.m855b(this.f5291a, this.f5292b);
                ViewGroup viewGroup = this.f5293c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m3069h(false);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.i$b */
    public class b extends AnimatorListenerAdapter implements AbstractC1235e.f {

        /* JADX INFO: renamed from: a */
        public final FrameLayout f5297a;

        /* JADX INFO: renamed from: b */
        public final View f5298b;

        /* JADX INFO: renamed from: c */
        public final View f5299c;

        /* JADX INFO: renamed from: d */
        public boolean f5300d = true;

        public b(FrameLayout frameLayout, View view, View view2) {
            this.f5297a = frameLayout;
            this.f5298b = view;
            this.f5299c = view2;
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: c */
        public final void mo3020c() {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: d */
        public final void mo3027d(AbstractC1235e abstractC1235e) {
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: e */
        public final void mo3021e(AbstractC1235e abstractC1235e) {
            if (this.f5300d) {
                m3070h();
            }
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
            abstractC1235e.mo3058y(this);
        }

        @Override // androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: g */
        public final void mo3023g() {
        }

        /* JADX INFO: renamed from: h */
        public final void m3070h() {
            this.f5299c.setTag(C1230R.id.save_overlay_view, null);
            this.f5297a.getOverlay().remove(this.f5298b);
            this.f5300d = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            m3070h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f5297a.getOverlay().remove(this.f5298b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f5298b;
            if (view.getParent() == null) {
                this.f5297a.getOverlay().add(view);
            } else {
                AbstractC1239i.this.mo3041c();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                int i = C1230R.id.save_overlay_view;
                View view = this.f5299c;
                View view2 = this.f5298b;
                view.setTag(i, view2);
                this.f5297a.getOverlay().add(view2);
                this.f5300d = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            m3070h();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.i$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f5302a;

        /* JADX INFO: renamed from: b */
        public boolean f5303b;

        /* JADX INFO: renamed from: c */
        public int f5304c;

        /* JADX INFO: renamed from: d */
        public int f5305d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f5306e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f5307f;
    }

    /* JADX INFO: renamed from: K */
    public static void m3067K(C0108Ff c0108Ff) {
        int visibility = c0108Ff.f367b.getVisibility();
        HashMap map = c0108Ff.f366a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0108Ff.f367b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c m3068L(C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        c cVar = new c();
        cVar.f5302a = false;
        cVar.f5303b = false;
        if (c0108Ff != null) {
            HashMap map = c0108Ff.f366a;
            if (map.containsKey("android:visibility:visibility")) {
                cVar.f5304c = ((Integer) map.get("android:visibility:visibility")).intValue();
                cVar.f5306e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                cVar.f5304c = -1;
                cVar.f5306e = null;
            }
        }
        if (c0108Ff2 != null) {
            HashMap map2 = c0108Ff2.f366a;
            if (map2.containsKey("android:visibility:visibility")) {
                cVar.f5305d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                cVar.f5307f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                cVar.f5305d = -1;
                cVar.f5307f = null;
            }
        }
        if (c0108Ff != null && c0108Ff2 != null) {
            int i = cVar.f5304c;
            int i2 = cVar.f5305d;
            if (i != i2 || cVar.f5306e != cVar.f5307f) {
                if (i != i2) {
                    if (i == 0) {
                        cVar.f5303b = false;
                        cVar.f5302a = true;
                        return cVar;
                    }
                    if (i2 == 0) {
                        cVar.f5303b = true;
                        cVar.f5302a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f5307f == null) {
                        cVar.f5303b = false;
                        cVar.f5302a = true;
                        return cVar;
                    }
                    if (cVar.f5306e == null) {
                        cVar.f5303b = true;
                        cVar.f5302a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (c0108Ff == null && cVar.f5305d == 0) {
                cVar.f5303b = true;
                cVar.f5302a = true;
                return cVar;
            }
            if (c0108Ff2 == null && cVar.f5304c == 0) {
                cVar.f5303b = false;
                cVar.f5302a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: d */
    public final void mo3016d(C0108Ff c0108Ff) {
        m3067K(c0108Ff);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m3068L(m3049n(r3, false), m3051r(r3, false)).f5302a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo3018k(FrameLayout frameLayout, C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        boolean z;
        View view;
        int i;
        int i2;
        char c2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup;
        int i3;
        Bitmap bitmapM218a;
        c cVarM3068L = m3068L(c0108Ff, c0108Ff2);
        if (cVarM3068L.f5302a && (cVarM3068L.f5306e != null || cVarM3068L.f5307f != null)) {
            int i4 = 0;
            if (!cVarM3068L.f5303b) {
                int i5 = cVarM3068L.f5305d;
                if ((this.f5290C & 2) == 2 && c0108Ff != null) {
                    View view4 = c0108Ff2 != null ? c0108Ff2.f367b : null;
                    int i6 = C1230R.id.save_overlay_view;
                    View view5 = c0108Ff.f367b;
                    View view6 = (View) view5.getTag(i6);
                    if (view6 != null) {
                        i = i5;
                        i2 = 0;
                        i4 = 1;
                        c2 = 1;
                        view3 = null;
                    } else {
                        if (view4 == null || view4.getParent() == null) {
                            if (view4 != null) {
                                z = false;
                            }
                            view = null;
                            if (!z) {
                                i = i5;
                                i2 = 0;
                                c2 = 1;
                                view2 = view;
                                animator = null;
                                view6 = view4;
                                i4 = i2;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i5;
                                i2 = 0;
                                c2 = 1;
                                view3 = view;
                                view6 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    View view7 = (View) view5.getParent();
                                    animator = null;
                                    if (m3068L(m3051r(view7, true), m3049n(view7, true)).f5302a) {
                                        i = i5;
                                        i2 = 0;
                                        c2 = 1;
                                        view2 = view;
                                        int id = view7.getId();
                                        if (view7.getParent() == null && id != -1) {
                                            frameLayout.findViewById(id);
                                        }
                                    } else {
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                        C0396Vg c0396Vg = C0307Qg.f1106a;
                                        c0396Vg.mo973d(view5, matrix);
                                        c0396Vg.mo974e(frameLayout, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound = Math.round(rectF.left);
                                        int iRound2 = Math.round(rectF.top);
                                        c2 = 1;
                                        int iRound3 = Math.round(rectF.right);
                                        i2 = 0;
                                        int iRound4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean zIsAttachedToWindow = view5.isAttachedToWindow();
                                        boolean z3 = frameLayout != null && frameLayout.isAttachedToWindow();
                                        if (zIsAttachedToWindow) {
                                            z2 = zIsAttachedToWindow;
                                            viewGroup = null;
                                            i3 = 0;
                                        } else if (z3) {
                                            ViewGroup viewGroup2 = (ViewGroup) view5.getParent();
                                            int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                            frameLayout.getOverlay().add(view5);
                                            z2 = zIsAttachedToWindow;
                                            i3 = iIndexOfChild;
                                            viewGroup = viewGroup2;
                                        } else {
                                            i = i5;
                                            view2 = view;
                                            bitmapM218a = null;
                                            if (bitmapM218a != null) {
                                                imageView.setImageBitmap(bitmapM218a);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                                            view6 = imageView;
                                            i4 = i2;
                                            view3 = view2;
                                        }
                                        view2 = view;
                                        int iRound5 = Math.round(rectF.width());
                                        i = i5;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound5 <= 0 || iRound6 <= 0) {
                                            bitmapM218a = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                            int iRound7 = Math.round(iRound5 * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view5.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapM218a = C0090Ef.m218a(picture);
                                        }
                                        if (!z2) {
                                            frameLayout.getOverlay().remove(view5);
                                            viewGroup.addView(view5, i3);
                                        }
                                        if (bitmapM218a != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        i4 = i2;
                                        view3 = view2;
                                    }
                                }
                                view6 = view4;
                                i4 = i2;
                                view3 = view2;
                            }
                            if (view6 != null) {
                                if (view3 == null) {
                                    return animator;
                                }
                                int visibility = view3.getVisibility();
                                C0307Qg.m855b(view3, i2);
                                C0396Vg c0396Vg2 = C0307Qg.f1106a;
                                c0396Vg2.getClass();
                                ObjectAnimator objectAnimatorM3025M = ((C1233c) this).m3025M(view3, C1233c.m3024N(c0108Ff, 1.0f), 0.0f);
                                if (objectAnimatorM3025M == null) {
                                    c0396Vg2.mo935b(view3, C1233c.m3024N(c0108Ff2, 1.0f));
                                }
                                if (objectAnimatorM3025M == null) {
                                    C0307Qg.m855b(view3, visibility);
                                    return objectAnimatorM3025M;
                                }
                                a aVar = new a(view3, i);
                                objectAnimatorM3025M.addListener(aVar);
                                m3050o().m3040a(aVar);
                                return objectAnimatorM3025M;
                            }
                            if (i4 == 0) {
                                int[] iArr = (int[]) c0108Ff.f366a.get("android:visibility:screenLocation");
                                int i7 = iArr[i2];
                                int i8 = iArr[c2];
                                int[] iArr2 = new int[2];
                                frameLayout.getLocationOnScreen(iArr2);
                                view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                                view6.offsetTopAndBottom((i8 - iArr2[c2]) - view6.getTop());
                                frameLayout.getOverlay().add(view6);
                            }
                            C0396Vg c0396Vg3 = C0307Qg.f1106a;
                            c0396Vg3.getClass();
                            ObjectAnimator objectAnimatorM3025M2 = ((C1233c) this).m3025M(view6, C1233c.m3024N(c0108Ff, 1.0f), 0.0f);
                            if (objectAnimatorM3025M2 == null) {
                                c0396Vg3.mo935b(view6, C1233c.m3024N(c0108Ff2, 1.0f));
                            }
                            if (i4 != 0) {
                                return objectAnimatorM3025M2;
                            }
                            if (objectAnimatorM3025M2 == null) {
                                frameLayout.getOverlay().remove(view6);
                                return objectAnimatorM3025M2;
                            }
                            view5.setTag(C1230R.id.save_overlay_view, view6);
                            b bVar = new b(frameLayout, view6, view5);
                            objectAnimatorM3025M2.addListener(bVar);
                            objectAnimatorM3025M2.addPauseListener(bVar);
                            m3050o().m3040a(bVar);
                            return objectAnimatorM3025M2;
                        }
                        if (i5 == 4 || view5 == view4) {
                            view = view4;
                            z = false;
                            view4 = null;
                            if (!z) {
                            }
                            if (view6 != null) {
                            }
                        }
                        z = true;
                        view4 = null;
                        view = null;
                        if (!z) {
                        }
                        if (view6 != null) {
                        }
                    }
                    animator = null;
                    if (view6 != null) {
                    }
                }
            } else if ((this.f5290C & 1) == 1 && c0108Ff2 != null) {
                View view8 = c0108Ff2.f367b;
                if (c0108Ff == null) {
                    View view9 = (View) view8.getParent();
                }
                C0307Qg.f1106a.getClass();
                return ((C1233c) this).m3025M(view8, C1233c.m3024N(c0108Ff, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: q */
    public final String[] mo3019q() {
        return f5289D;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: t */
    public final boolean mo3053t(C0108Ff c0108Ff, C0108Ff c0108Ff2) {
        if (c0108Ff == null && c0108Ff2 == null) {
            return false;
        }
        if (c0108Ff != null && c0108Ff2 != null && c0108Ff2.f366a.containsKey("android:visibility:visibility") != c0108Ff.f366a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM3068L = m3068L(c0108Ff, c0108Ff2);
        if (cVarM3068L.f5302a) {
            return cVarM3068L.f5304c == 0 || cVarM3068L.f5305d == 0;
        }
        return false;
    }
}
