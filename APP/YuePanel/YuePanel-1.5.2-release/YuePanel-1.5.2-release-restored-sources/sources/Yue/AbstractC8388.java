package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8388 extends AbstractC7956 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ */
    public static class C1514 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final View f3448;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f3449;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ViewGroup f25009;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f25010;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f25011;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f25012 = false;

        public C1514(View view, int i, boolean z) {
            this.f3448 = view;
            this.f3449 = i;
            this.f25009 = (ViewGroup) view.getParent();
            this.f25010 = z;
            m4373(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25012 = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m4372();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            m4373(false);
            if (this.f25012) {
                return;
            }
            C8371.m27935(this.f3448, this.f3449);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            m4373(true);
            if (this.f25012) {
                return;
            }
            C8371.m27935(this.f3448, 0);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4372() {
            if (!this.f25012) {
                C8371.m27935(this.f3448, this.f3449);
                ViewGroup viewGroup = this.f25009;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m4373(false);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4373(boolean z) {
            ViewGroup viewGroup;
            if (!this.f25010 || this.f25011 == z || (viewGroup = this.f25009) == null) {
                return;
            }
            this.f25011 = z;
            C8311.m27700(viewGroup, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator, boolean z) {
            if (z) {
                return;
            }
            m4372();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC6391 Animator animator, boolean z) {
            if (z) {
                C8371.m27935(this.f3448, 0);
                ViewGroup viewGroup = this.f25009;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟ */
    @SuppressLint({"UniqueConstants"})
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1515 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟۟, reason: contains not printable characters */
    public class C8389 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final ViewGroup f3450;

        /* JADX INFO: renamed from: ۥ۟ */
        public final View f3451;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final View f25013;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f25014 = true;

        public C8389(ViewGroup viewGroup, View view, View view2) {
            this.f3450 = viewGroup;
            this.f3451 = view;
            this.f25013 = view2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m4374();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f3450.getOverlay().remove(this.f3451);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f3451.getParent() == null) {
                this.f3450.getOverlay().add(this.f3451);
            } else {
                AbstractC8388.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC6391 Animator animator, boolean z) {
            if (z) {
                this.f25013.setTag(C6934.C1117.f20095, this.f3451);
                this.f3450.getOverlay().add(this.f3451);
                this.f25014 = true;
            }
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            if (this.f25014) {
                m4374();
            }
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4374() {
            this.f25013.setTag(C6934.C1117.f20095, null);
            this.f3450.getOverlay().remove(this.f3451);
            this.f25014 = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator, boolean z) {
            if (z) {
                return;
            }
            m4374();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8390 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3452;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3453;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f25016;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f25017;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public ViewGroup f25018;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public ViewGroup f25019;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC8388() {
        this.mMode = 3;
    }

    private void captureValues(C7995 c7995) {
        c7995.f3177.put(PROPNAME_VISIBILITY, Integer.valueOf(c7995.f3178.getVisibility()));
        c7995.f3177.put(PROPNAME_PARENT, c7995.f3178.getParent());
        int[] iArr = new int[2];
        c7995.f3178.getLocationOnScreen(iArr);
        c7995.f3177.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        C8390 c8390M27980 = m27980(c7995, c79952);
        if (!c8390M27980.f3452) {
            return null;
        }
        if (c8390M27980.f25018 == null && c8390M27980.f25019 == null) {
            return null;
        }
        return c8390M27980.f3453 ? onAppear(viewGroup, c7995, c8390M27980.f25016, c79952, c8390M27980.f25017) : onDisappear(viewGroup, c7995, c8390M27980.f25016, c79952, c8390M27980.f25017);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // Yue.AbstractC7956
    public boolean isTransitionRequired(@InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null && c79952 == null) {
            return false;
        }
        if (c7995 != null && c79952 != null && c79952.f3177.containsKey(PROPNAME_VISIBILITY) != c7995.f3177.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        C8390 c8390M27980 = m27980(c7995, c79952);
        if (c8390M27980.f3452) {
            return c8390M27980.f25016 == 0 || c8390M27980.f25017 == 0;
        }
        return false;
    }

    public boolean isVisible(@InterfaceC6490 C7995 c7995) {
        if (c7995 == null) {
            return false;
        }
        return ((Integer) c7995.f3177.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) c7995.f3177.get(PROPNAME_PARENT)) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, int i, @InterfaceC6490 C7995 c79952, int i2) {
        if ((this.mMode & 1) != 1 || c79952 == null) {
            return null;
        }
        if (c7995 == null) {
            View view = (View) c79952.f3178.getParent();
            if (m27980(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f3452) {
                return null;
            }
        }
        return onAppear(viewGroup, c79952.f3178, c7995, c79952);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @InterfaceC6490
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, int i, @InterfaceC6490 C7995 c79952, int i2) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.mMode & 2) != 2 || c7995 == null) {
            return null;
        }
        View view3 = c7995.f3178;
        View viewM4003 = c79952 != null ? c79952.f3178 : null;
        View view4 = (View) view3.getTag(C6934.C1117.f20095);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else if (viewM4003 == null || viewM4003.getParent() == null) {
            if (viewM4003 != null) {
                view = null;
                z = false;
            } else {
                viewM4003 = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m27980(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f3452) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            viewM4003 = C7994.m4003(viewGroup, view3, view5);
                        }
                    }
                    z2 = false;
                    View view6 = view;
                    view4 = viewM4003;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                View view62 = view;
                view4 = viewM4003;
                view2 = view62;
            }
        } else {
            if (i2 == 4 || view3 == viewM4003) {
                view = viewM4003;
                z = false;
                viewM4003 = null;
            }
            if (z) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            C8371.m27935(view2, 0);
            Animator animatorOnDisappear = onDisappear(viewGroup, view2, c7995, c79952);
            if (animatorOnDisappear != null) {
                C1514 c1514 = new C1514(view2, i2, true);
                animatorOnDisappear.addListener(c1514);
                getRootTransition().addListener(c1514);
            } else {
                C8371.m27935(view2, visibility);
            }
            return animatorOnDisappear;
        }
        if (!z2) {
            int[] iArr = (int[]) c7995.f3177.get(PROPNAME_SCREEN_LOCATION);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view4, c7995, c79952);
        if (!z2) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view3.setTag(C6934.C1117.f20095, view4);
                C8389 c8389 = new C8389(viewGroup, view4, view3);
                animatorOnDisappear2.addListener(c8389);
                animatorOnDisappear2.addPauseListener(c8389);
                getRootTransition().addListener(c8389);
            }
        }
        return animatorOnDisappear2;
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final C8390 m27980(C7995 c7995, C7995 c79952) {
        C8390 c8390 = new C8390();
        c8390.f3452 = false;
        c8390.f3453 = false;
        if (c7995 == null || !c7995.f3177.containsKey(PROPNAME_VISIBILITY)) {
            c8390.f25016 = -1;
            c8390.f25018 = null;
        } else {
            c8390.f25016 = ((Integer) c7995.f3177.get(PROPNAME_VISIBILITY)).intValue();
            c8390.f25018 = (ViewGroup) c7995.f3177.get(PROPNAME_PARENT);
        }
        if (c79952 == null || !c79952.f3177.containsKey(PROPNAME_VISIBILITY)) {
            c8390.f25017 = -1;
            c8390.f25019 = null;
        } else {
            c8390.f25017 = ((Integer) c79952.f3177.get(PROPNAME_VISIBILITY)).intValue();
            c8390.f25019 = (ViewGroup) c79952.f3177.get(PROPNAME_PARENT);
        }
        if (c7995 != null && c79952 != null) {
            int i = c8390.f25016;
            int i2 = c8390.f25017;
            if (i == i2 && c8390.f25018 == c8390.f25019) {
                return c8390;
            }
            if (i != i2) {
                if (i == 0) {
                    c8390.f3453 = false;
                    c8390.f3452 = true;
                } else if (i2 == 0) {
                    c8390.f3453 = true;
                    c8390.f3452 = true;
                }
            } else if (c8390.f25019 == null) {
                c8390.f3453 = false;
                c8390.f3452 = true;
            } else if (c8390.f25018 == null) {
                c8390.f3453 = true;
                c8390.f3452 = true;
            }
        } else if (c7995 == null && c8390.f25017 == 0) {
            c8390.f3453 = true;
            c8390.f3452 = true;
        } else if (c79952 == null && c8390.f25016 == 0) {
            c8390.f3453 = false;
            c8390.f3452 = true;
        }
        return c8390;
    }

    public AbstractC8388(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23044);
        int iM25322 = C8021.m25322(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM25322 != 0) {
            setMode(iM25322);
        }
    }

    @InterfaceC6490
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        return null;
    }

    @InterfaceC6490
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        return null;
    }
}
