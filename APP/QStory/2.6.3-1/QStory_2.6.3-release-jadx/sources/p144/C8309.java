package p144;

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
import androidx.core.os.AbstractC3012;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8309 extends AbstractC8312 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final String[] f20581 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f20582;

    public C8309() {
        this.f20582 = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8290 m13257(C8298 c8298, C8298 c82982) {
        C8290 c8290 = new C8290();
        c8290.f20528 = false;
        c8290.f20527 = false;
        if (c8298 != null) {
            HashMap map = c8298.f20555;
            if (map.containsKey("android:visibility:visibility")) {
                c8290.f20526 = ((Integer) map.get("android:visibility:visibility")).intValue();
                c8290.f20524 = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c8290.f20526 = -1;
                c8290.f20524 = null;
            }
        }
        if (c82982 != null) {
            HashMap map2 = c82982.f20555;
            if (map2.containsKey("android:visibility:visibility")) {
                c8290.f20525 = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c8290.f20523 = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c8290.f20525 = -1;
                c8290.f20523 = null;
            }
        }
        if (c8298 != null && c82982 != null) {
            int i = c8290.f20526;
            int i2 = c8290.f20525;
            if (i != i2 || c8290.f20524 != c8290.f20523) {
                if (i != i2) {
                    if (i == 0) {
                        c8290.f20527 = false;
                        c8290.f20528 = true;
                        return c8290;
                    }
                    if (i2 == 0) {
                        c8290.f20527 = true;
                        c8290.f20528 = true;
                        return c8290;
                    }
                } else {
                    if (c8290.f20523 == null) {
                        c8290.f20527 = false;
                        c8290.f20528 = true;
                        return c8290;
                    }
                    if (c8290.f20524 == null) {
                        c8290.f20527 = true;
                        c8290.f20528 = true;
                        return c8290;
                    }
                }
            }
        } else {
            if (c8298 == null && c8290.f20525 == 0) {
                c8290.f20527 = true;
                c8290.f20528 = true;
                return c8290;
            }
            if (c82982 == null && c8290.f20526 == 0) {
                c8290.f20527 = false;
                c8290.f20528 = true;
            }
        }
        return c8290;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m13258(C8298 c8298) {
        View view = c8298.f20554;
        int visibility = view.getVisibility();
        HashMap map = c8298.f20555;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float m13259(C8298 c8298, float f) {
        Float f2;
        return (c8298 == null || (f2 = (Float) c8298.f20555.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ObjectAnimator m13260(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC8297.f20552.mo13253(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC8297.f20551, f2);
        C8310 c8310 = new C8310(view);
        objectAnimatorOfFloat.addListener(c8310);
        m13272().m13269(c8310);
        return objectAnimatorOfFloat;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13220(C8298 c8298) {
        m13258(c8298);
        View view = c8298.f20554;
        Float fValueOf = (Float) view.getTag(C0328R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC8297.f20552.mo13254(view)) : Float.valueOf(0.0f);
        }
        c8298.f20555.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo13221(C8298 c8298) {
        m13258(c8298);
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final String[] mo13222() {
        return f20581;
    }

    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo13261(C8298 c8298, C8298 c82982) {
        if (c8298 == null && c82982 == null) {
            return false;
        }
        if (c8298 != null && c82982 != null && c82982.f20555.containsKey("android:visibility:visibility") != c8298.f20555.containsKey("android:visibility:visibility")) {
            return false;
        }
        C8290 c8290M13257 = m13257(c8298, c82982);
        if (c8290M13257.f20528) {
            return c8290M13257.f20526 == 0 || c8290M13257.f20525 == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m13257(m13274(r3, false), m13270(r3, false)).f20528 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p144.AbstractC8312
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo13223(ViewGroup viewGroup, C8298 c8298, C8298 c82982) {
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
        Bitmap bitmapCreateBitmap;
        C8290 c8290M13257 = m13257(c8298, c82982);
        if (c8290M13257.f20528 && (c8290M13257.f20524 != null || c8290M13257.f20523 != null)) {
            boolean z3 = c8290M13257.f20527;
            int i4 = this.f20582;
            int i5 = 1;
            if (!z3) {
                int i6 = c8290M13257.f20525;
                if ((i4 & 2) == 2 && c8298 != null) {
                    View view4 = c8298.f20554;
                    View view5 = c82982 != null ? c82982.f20554 : null;
                    View view6 = (View) view4.getTag(C0328R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i6;
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
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i5 = i2;
                                view3 = view2;
                            } else if (view4.getParent() == null) {
                                i = i6;
                                c = 1;
                                i5 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view6 = view4;
                            } else {
                                if (view4.getParent() instanceof View) {
                                    View view7 = (View) view4.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (m13257(m13270(view7, true), m13274(view7, true)).f20528) {
                                        i = i6;
                                        c = 1;
                                        view2 = view;
                                        int id = view7.getId();
                                        if (view7.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z4 = AbstractC8306.f20575;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                        C8301 c8301 = AbstractC8297.f20552;
                                        c8301.mo13250(view4, matrix);
                                        c8301.mo13252(viewGroup, matrix);
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
                                        boolean z5 = viewGroup != null && viewGroup.isAttachedToWindow();
                                        if (zIsAttachedToWindow) {
                                            z2 = zIsAttachedToWindow;
                                            viewGroup2 = null;
                                            i3 = 0;
                                        } else if (z5) {
                                            viewGroup2 = (ViewGroup) view4.getParent();
                                            int iIndexOfChild = viewGroup2.indexOfChild(view4);
                                            AbstractC3103.m4798(viewGroup, view4);
                                            z2 = zIsAttachedToWindow;
                                            i3 = iIndexOfChild;
                                        } else {
                                            i = i6;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                                            view6 = imageView;
                                            i5 = i2;
                                            view3 = view2;
                                        }
                                        view2 = view;
                                        int iRound5 = Math.round(rectF.width());
                                        i = i6;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound5 <= 0 || iRound6 <= 0) {
                                            bitmapCreateBitmap = null;
                                        } else {
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                            int iRound7 = Math.round(iRound5 * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (AbstractC8306.f20575) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view4.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = AbstractC3012.m4539(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view4.draw(canvas);
                                            }
                                        }
                                        if (!z2) {
                                            viewGroup.getOverlay().remove(view4);
                                            viewGroup2.addView(view4, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                        imageView.layout(iRound, iRound2, iRound3, iRound4);
                                        view6 = imageView;
                                        i5 = i2;
                                        view3 = view2;
                                    }
                                }
                                view6 = view5;
                                i5 = i2;
                                view3 = view2;
                            }
                        } else if (i6 == 4 || view4 == view5) {
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
                        AbstractC8297.m13244(view3, i2);
                        C8301 c83012 = AbstractC8297.f20552;
                        c83012.getClass();
                        ObjectAnimator objectAnimatorM13260 = m13260(view3, m13259(c8298, 1.0f), 0.0f);
                        if (objectAnimatorM13260 == null) {
                            c83012.mo13253(view3, m13259(c82982, 1.0f));
                        }
                        if (objectAnimatorM13260 == null) {
                            AbstractC8297.m13244(view3, visibility);
                            return objectAnimatorM13260;
                        }
                        C8299 c8299 = new C8299(view3, i);
                        objectAnimatorM13260.addListener(c8299);
                        m13272().m13269(c8299);
                        return objectAnimatorM13260;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) c8298.f20555.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        AbstractC3103.m4798(viewGroup, view6);
                    }
                    C8301 c83013 = AbstractC8297.f20552;
                    c83013.getClass();
                    ObjectAnimator objectAnimatorM132602 = m13260(view6, m13259(c8298, 1.0f), 0.0f);
                    if (objectAnimatorM132602 == null) {
                        c83013.mo13253(view6, m13259(c82982, 1.0f));
                    }
                    if (i5 == 0) {
                        if (objectAnimatorM132602 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return objectAnimatorM132602;
                        }
                        view4.setTag(C0328R.id.save_overlay_view, view6);
                        C8300 c8300 = new C8300(this, viewGroup, view6, view4);
                        objectAnimatorM132602.addListener(c8300);
                        objectAnimatorM132602.addPauseListener(c8300);
                        m13272().m13269(c8300);
                    }
                    return objectAnimatorM132602;
                }
            } else if ((i4 & 1) == 1 && c82982 != null) {
                View view8 = c82982.f20554;
                if (c8298 == null) {
                    View view9 = (View) view8.getParent();
                }
                AbstractC8297.f20552.getClass();
                return m13260(view8, m13259(c8298, 0.0f), 1.0f);
            }
        }
        return null;
    }

    public C8309(int i) {
        this();
        this.f20582 = i;
    }
}
