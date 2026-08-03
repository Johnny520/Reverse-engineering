package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.github.cherrywechat.R;
import java.util.HashMap;

/* JADX INFO: renamed from: bh */
/* JADX INFO: loaded from: classes.dex */
public final class C1222bh extends AbstractC0356IB {

    /* JADX INFO: renamed from: B */
    public static final String[] f4177B = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: A */
    public final int f4178A;

    public C1222bh(int i) {
        this();
        this.f4178A = i;
    }

    /* JADX INFO: renamed from: I */
    public static void m2349I(C0657PB c0657pb) {
        View view = c0657pb.f2100b;
        int visibility = view.getVisibility();
        HashMap map = c0657pb.f2099a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: K */
    public static float m2350K(C0657PB c0657pb, float f) {
        Float f2;
        return (c0657pb == null || (f2 = (Float) c0657pb.f2099a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1089ZE m2351L(C0657PB c0657pb, C0657PB c0657pb2) {
        C1089ZE c1089ze = new C1089ZE();
        c1089ze.f3465a = false;
        c1089ze.f3466b = false;
        if (c0657pb != null) {
            HashMap map = c0657pb.f2099a;
            if (map.containsKey("android:visibility:visibility")) {
                c1089ze.f3467c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c1089ze.f3469e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c1089ze.f3467c = -1;
                c1089ze.f3469e = null;
            }
        }
        if (c0657pb2 != null) {
            HashMap map2 = c0657pb2.f2099a;
            if (map2.containsKey("android:visibility:visibility")) {
                c1089ze.f3468d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c1089ze.f3470f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c1089ze.f3468d = -1;
                c1089ze.f3470f = null;
            }
        }
        if (c0657pb != null && c0657pb2 != null) {
            int i = c1089ze.f3467c;
            int i2 = c1089ze.f3468d;
            if (i != i2 || c1089ze.f3469e != c1089ze.f3470f) {
                if (i != i2) {
                    if (i == 0) {
                        c1089ze.f3466b = false;
                        c1089ze.f3465a = true;
                        return c1089ze;
                    }
                    if (i2 == 0) {
                        c1089ze.f3466b = true;
                        c1089ze.f3465a = true;
                        return c1089ze;
                    }
                } else {
                    if (c1089ze.f3470f == null) {
                        c1089ze.f3466b = false;
                        c1089ze.f3465a = true;
                        return c1089ze;
                    }
                    if (c1089ze.f3469e == null) {
                        c1089ze.f3466b = true;
                        c1089ze.f3465a = true;
                        return c1089ze;
                    }
                }
            }
        } else {
            if (c0657pb == null && c1089ze.f3468d == 0) {
                c1089ze.f3466b = true;
                c1089ze.f3465a = true;
                return c1089ze;
            }
            if (c0657pb2 == null && c1089ze.f3467c == 0) {
                c1089ze.f3466b = false;
                c1089ze.f3465a = true;
            }
        }
        return c1089ze;
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m2352J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC0574NE.f1868a.mo1252Q(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC0574NE.f1869b, f2);
        C1142ah c1142ah = new C1142ah(view);
        objectAnimatorOfFloat.addListener(c1142ah);
        m779o().m766a(c1142ah);
        return objectAnimatorOfFloat;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB c0657pb) {
        m2349I(c0657pb);
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB c0657pb) {
        m2349I(c0657pb);
        View view = c0657pb.f2100b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC0574NE.f1868a.mo1251A(view)) : Float.valueOf(0.0f);
        }
        c0657pb.f2099a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m2351L(m778n(r3, false), m781r(r3, false)).f3465a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0202  */
    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo775k(ViewGroup viewGroup, C0657PB c0657pb, C0657PB c0657pb2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmapM1192a;
        C1089ZE c1089zeM2351L = m2351L(c0657pb, c0657pb2);
        if (c1089zeM2351L.f3465a && (c1089zeM2351L.f3469e != null || c1089zeM2351L.f3470f != null)) {
            int i4 = 1;
            if (!c1089zeM2351L.f3466b) {
                int i5 = c1089zeM2351L.f3468d;
                if ((this.f4178A & 2) == 2 && c0657pb != null) {
                    View view4 = c0657pb.f2100b;
                    View view5 = c0657pb2 != null ? c0657pb2.f2100b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                            }
                            view = null;
                            if (!z) {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i4 = i2;
                                view3 = view2;
                            } else if (view4.getParent() == null) {
                                i = i5;
                                c = 1;
                                i4 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view6 = view4;
                            } else {
                                if (view4.getParent() instanceof View) {
                                    View view7 = (View) view4.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (m2351L(m781r(view7, true), m778n(view7, true)).f3465a) {
                                        i = i5;
                                        c = 1;
                                        view2 = view;
                                        int id = view7.getId();
                                        if (view7.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                        C0831TE c0831te = AbstractC0574NE.f1868a;
                                        c0831te.mo1657a0(view4, matrix);
                                        c0831te.mo1658b0(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound = Math.round(rectF.left);
                                        int iRound2 = Math.round(rectF.top);
                                        c = 1;
                                        int iRound3 = Math.round(rectF.right);
                                        int iRound4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view4.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean zIsAttachedToWindow = view4.isAttachedToWindow();
                                        boolean z3 = viewGroup != null && viewGroup.isAttachedToWindow();
                                        if (zIsAttachedToWindow) {
                                            z2 = zIsAttachedToWindow;
                                            viewGroup2 = null;
                                            i3 = 0;
                                        } else if (z3) {
                                            ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                                            int iIndexOfChild = viewGroup3.indexOfChild(view4);
                                            viewGroup.getOverlay().add(view4);
                                            z2 = zIsAttachedToWindow;
                                            i3 = iIndexOfChild;
                                            viewGroup2 = viewGroup3;
                                        } else {
                                            i = i5;
                                            view2 = view;
                                            bitmapM1192a = null;
                                            if (bitmapM1192a != null) {
                                                imageView.setImageBitmap(bitmapM1192a);
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
                                            bitmapM1192a = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                            int iRound7 = Math.round(iRound5 * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view4.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapM1192a = AbstractC0614OB.m1192a(picture);
                                        }
                                        if (!z2) {
                                            viewGroup.getOverlay().remove(view4);
                                            viewGroup2.addView(view4, i3);
                                        }
                                        if (bitmapM1192a != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        i4 = i2;
                                        view3 = view2;
                                    }
                                }
                                view6 = view5;
                                i4 = i2;
                                view3 = view2;
                            }
                        } else if (i5 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (!z) {
                            }
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (!z) {
                        }
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        AbstractC0574NE.m1117b(view3, i2);
                        C0831TE c0831te2 = AbstractC0574NE.f1868a;
                        c0831te2.getClass();
                        ObjectAnimator objectAnimatorM2352J = m2352J(view3, m2350K(c0657pb, 1.0f), 0.0f);
                        if (objectAnimatorM2352J == null) {
                            c0831te2.mo1252Q(view3, m2350K(c0657pb2, 1.0f));
                        }
                        if (objectAnimatorM2352J == null) {
                            AbstractC0574NE.m1117b(view3, visibility);
                            return objectAnimatorM2352J;
                        }
                        C1003XE c1003xe = new C1003XE(view3, i);
                        objectAnimatorM2352J.addListener(c1003xe);
                        m779o().m766a(c1003xe);
                        return objectAnimatorM2352J;
                    }
                    if (i4 == 0) {
                        int[] iArr = (int[]) c0657pb.f2099a.get("android:visibility:screenLocation");
                        int i6 = iArr[i2];
                        int i7 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i6 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i7 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    C0831TE c0831te3 = AbstractC0574NE.f1868a;
                    c0831te3.getClass();
                    ObjectAnimator objectAnimatorM2352J2 = m2352J(view6, m2350K(c0657pb, 1.0f), 0.0f);
                    if (objectAnimatorM2352J2 == null) {
                        c0831te3.mo1252Q(view6, m2350K(c0657pb2, 1.0f));
                    }
                    if (i4 == 0) {
                        if (objectAnimatorM2352J2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return objectAnimatorM2352J2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        C1046YE c1046ye = new C1046YE(this, viewGroup, view6, view4);
                        objectAnimatorM2352J2.addListener(c1046ye);
                        objectAnimatorM2352J2.addPauseListener(c1046ye);
                        m779o().m766a(c1046ye);
                    }
                    return objectAnimatorM2352J2;
                }
            } else if ((this.f4178A & 1) == 1 && c0657pb2 != null) {
                View view8 = c0657pb2.f2100b;
                if (c0657pb == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC0574NE.f1868a.getClass();
                return m2352J(view8, m2350K(c0657pb, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: q */
    public final String[] mo780q() {
        return f4177B;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: s */
    public final boolean mo782s(C0657PB c0657pb, C0657PB c0657pb2) {
        if (c0657pb == null && c0657pb2 == null) {
            return false;
        }
        if (c0657pb != null && c0657pb2 != null && c0657pb2.f2099a.containsKey("android:visibility:visibility") != c0657pb.f2099a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1089ZE c1089zeM2351L = m2351L(c0657pb, c0657pb2);
        if (c1089zeM2351L.f3465a) {
            return c1089zeM2351L.f3467c == 0 || c1089zeM2351L.f3468d == 0;
        }
        return false;
    }

    public C1222bh() {
        this.f4178A = 3;
    }
}
