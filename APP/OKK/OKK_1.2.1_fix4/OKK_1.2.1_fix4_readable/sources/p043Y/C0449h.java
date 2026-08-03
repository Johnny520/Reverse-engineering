package p043Y;

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
import java.util.HashMap;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: Y.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0449h extends AbstractC0454m {

    /* JADX INFO: renamed from: B */
    public static final String[] f992B = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: A */
    public final int f993A;

    public C0449h(int i2) {
        this();
        this.f993A = i2;
    }

    /* JADX INFO: renamed from: I */
    public static void m1069I(C0462u c0462u) {
        int visibility = c0462u.f1042b.getVisibility();
        HashMap map = c0462u.f1041a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0462u.f1042b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: K */
    public static float m1070K(C0462u c0462u, float f2) {
        Float f3;
        return (c0462u == null || (f3 = (Float) c0462u.f1041a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0441G m1071L(C0462u c0462u, C0462u c0462u2) {
        C0441G c0441g = new C0441G();
        c0441g.f963a = false;
        c0441g.f964b = false;
        if (c0462u != null) {
            HashMap map = c0462u.f1041a;
            if (map.containsKey("android:visibility:visibility")) {
                c0441g.f965c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c0441g.f967e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c0441g.f965c = -1;
                c0441g.f967e = null;
            }
        }
        if (c0462u2 != null) {
            HashMap map2 = c0462u2.f1041a;
            if (map2.containsKey("android:visibility:visibility")) {
                c0441g.f966d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c0441g.f968f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c0441g.f966d = -1;
                c0441g.f968f = null;
            }
        }
        if (c0462u != null && c0462u2 != null) {
            int i2 = c0441g.f965c;
            int i3 = c0441g.f966d;
            if (i2 == i3 && c0441g.f967e == c0441g.f968f) {
                return c0441g;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    c0441g.f964b = false;
                    c0441g.f963a = true;
                } else if (i3 == 0) {
                    c0441g.f964b = true;
                    c0441g.f963a = true;
                }
            } else if (c0441g.f968f == null) {
                c0441g.f964b = false;
                c0441g.f963a = true;
            } else if (c0441g.f967e == null) {
                c0441g.f964b = true;
                c0441g.f963a = true;
            }
        } else if (c0462u == null && c0441g.f966d == 0) {
            c0441g.f964b = true;
            c0441g.f963a = true;
        } else if (c0462u2 == null && c0441g.f965c == 0) {
            c0441g.f964b = false;
            c0441g.f963a = true;
        }
        return c0441g;
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m1072J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        AbstractC0465x.f1048a.mo924k0(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC0465x.f1049b, f3);
        C0448g c0448g = new C0448g(view);
        objectAnimatorOfFloat.addListener(c0448g);
        m1085o().m1079a(c0448g);
        return objectAnimatorOfFloat;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u c0462u) {
        m1069I(c0462u);
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u c0462u) {
        m1069I(c0462u);
        View view = c0462u.f1042b;
        Float fValueOf = (Float) view.getTag(C1031R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC0465x.f1048a.mo926z(view)) : Float.valueOf(0.0f);
        }
        c0462u.f1041a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m1071L(m1084n(r3, false), m1086r(r3, false)).f963a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo1066k(ViewGroup viewGroup, C0462u c0462u, C0462u c0462u2) {
        boolean z2;
        View view;
        int i2;
        View view2;
        View view3;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmapCreateBitmap;
        int i4 = this.f993A;
        C0441G c0441gM1071L = m1071L(c0462u, c0462u2);
        if (!c0441gM1071L.f963a || (c0441gM1071L.f967e == null && c0441gM1071L.f968f == null)) {
            return null;
        }
        boolean z3 = false;
        if (c0441gM1071L.f964b) {
            if ((i4 & 1) == 1 && c0462u2 != null) {
                View view4 = c0462u2.f1042b;
                if (c0462u == null) {
                    View view5 = (View) view4.getParent();
                }
                AbstractC0465x.f1048a.getClass();
                return m1072J(view4, m1070K(c0462u, 0.0f), 1.0f);
            }
            return null;
        }
        int i5 = c0441gM1071L.f966d;
        if ((i4 & 2) == 2 && c0462u != null) {
            View view6 = c0462u2 != null ? c0462u2.f1042b : null;
            View view7 = c0462u.f1042b;
            View view8 = (View) view7.getTag(C1031R.id.save_overlay_view);
            if (view8 != null) {
                i2 = i5;
                z3 = true;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z2 = false;
                    }
                    view = null;
                    if (!z2) {
                        i2 = i5;
                        view2 = view;
                        view8 = view6;
                        view3 = view2;
                        z3 = false;
                    } else if (view7.getParent() == null) {
                        i2 = i5;
                        view3 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            View view9 = (View) view7.getParent();
                            if (m1071L(m1086r(view9, true), m1084n(view9, true)).f963a) {
                                i2 = i5;
                                view2 = view;
                                int id = view9.getId();
                                if (view9.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                boolean z4 = AbstractC0461t.f1040a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                C0437C c0437c = AbstractC0465x.f1048a;
                                c0437c.mo1039z0(view7, matrix);
                                c0437c.mo1037A0(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix.mapRect(rectF);
                                int iRound = Math.round(rectF.left);
                                int iRound2 = Math.round(rectF.top);
                                int iRound3 = Math.round(rectF.right);
                                int iRound4 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                boolean z5 = !view7.isAttachedToWindow();
                                boolean z6 = viewGroup != null && viewGroup.isAttachedToWindow();
                                if (!z5) {
                                    view2 = view;
                                    viewGroup2 = null;
                                    i3 = 0;
                                } else if (z6) {
                                    ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                    int iIndexOfChild = viewGroup3.indexOfChild(view7);
                                    viewGroup.getOverlay().add(view7);
                                    viewGroup2 = viewGroup3;
                                    view2 = view;
                                    i3 = iIndexOfChild;
                                } else {
                                    i2 = i5;
                                    view2 = view;
                                    bitmapCreateBitmap = null;
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                    imageView.layout(iRound, iRound2, iRound3, iRound4);
                                    view8 = imageView;
                                    view3 = view2;
                                    z3 = false;
                                }
                                i2 = i5;
                                int iRound5 = Math.round(rectF.width());
                                int iRound6 = Math.round(rectF.height());
                                if (iRound5 <= 0 || iRound6 <= 0) {
                                    bitmapCreateBitmap = null;
                                } else {
                                    float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                    int iRound7 = Math.round(iRound5 * fMin);
                                    int iRound8 = Math.round(iRound6 * fMin);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(fMin, fMin);
                                    if (AbstractC0461t.f1040a) {
                                        Picture picture = new Picture();
                                        Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                        canvasBeginRecording.concat(matrix);
                                        view7.draw(canvasBeginRecording);
                                        picture.endRecording();
                                        bitmapCreateBitmap = AbstractC0460s.m1091a(picture);
                                    } else {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.concat(matrix);
                                        view7.draw(canvas);
                                    }
                                }
                                if (z5) {
                                    viewGroup.getOverlay().remove(view7);
                                    viewGroup2.addView(view7, i3);
                                }
                                if (bitmapCreateBitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view8 = imageView;
                                view3 = view2;
                                z3 = false;
                            }
                        }
                        view8 = view6;
                        view3 = view2;
                        z3 = false;
                    }
                } else if (i5 == 4 || view7 == view6) {
                    view = view6;
                    z2 = false;
                    view6 = null;
                    if (!z2) {
                    }
                }
                z2 = true;
                view6 = null;
                view = null;
                if (!z2) {
                }
            }
            if (view8 != null) {
                if (!z3) {
                    int[] iArr = (int[]) c0462u.f1041a.get("android:visibility:screenLocation");
                    int i6 = iArr[0];
                    int i7 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i6 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i7 - iArr2[1]) - view8.getTop());
                    viewGroup.getOverlay().add(view8);
                }
                C0437C c0437c2 = AbstractC0465x.f1048a;
                c0437c2.getClass();
                ObjectAnimator objectAnimatorM1072J = m1072J(view8, m1070K(c0462u, 1.0f), 0.0f);
                if (objectAnimatorM1072J == null) {
                    c0437c2.mo924k0(view8, m1070K(c0462u2, 1.0f));
                }
                if (z3) {
                    return objectAnimatorM1072J;
                }
                if (objectAnimatorM1072J == null) {
                    viewGroup.getOverlay().remove(view8);
                    return objectAnimatorM1072J;
                }
                view7.setTag(C1031R.id.save_overlay_view, view8);
                C0440F c0440f = new C0440F(this, viewGroup, view8, view7);
                objectAnimatorM1072J.addListener(c0440f);
                objectAnimatorM1072J.addPauseListener(c0440f);
                m1085o().m1079a(c0440f);
                return objectAnimatorM1072J;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                AbstractC0465x.m1096b(view3, 0);
                C0437C c0437c3 = AbstractC0465x.f1048a;
                c0437c3.getClass();
                ObjectAnimator objectAnimatorM1072J2 = m1072J(view3, m1070K(c0462u, 1.0f), 0.0f);
                if (objectAnimatorM1072J2 == null) {
                    c0437c3.mo924k0(view3, m1070K(c0462u2, 1.0f));
                }
                if (objectAnimatorM1072J2 != null) {
                    C0439E c0439e = new C0439E(view3, i2);
                    objectAnimatorM1072J2.addListener(c0439e);
                    m1085o().m1079a(c0439e);
                } else {
                    AbstractC0465x.m1096b(view3, visibility);
                }
                return objectAnimatorM1072J2;
            }
        }
        return null;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: q */
    public final String[] mo1067q() {
        return f992B;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: s */
    public final boolean mo1073s(C0462u c0462u, C0462u c0462u2) {
        if (c0462u == null && c0462u2 == null) {
            return false;
        }
        if (c0462u != null && c0462u2 != null && c0462u2.f1041a.containsKey("android:visibility:visibility") != c0462u.f1041a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0441G c0441gM1071L = m1071L(c0462u, c0462u2);
        if (c0441gM1071L.f963a) {
            return c0441gM1071L.f965c == 0 || c0441gM1071L.f966d == 0;
        }
        return false;
    }

    public C0449h() {
        this.f993A = 3;
    }
}
