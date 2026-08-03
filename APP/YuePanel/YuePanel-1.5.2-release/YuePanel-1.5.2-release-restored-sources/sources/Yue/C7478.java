package Yue;

import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7478 extends AbstractC8388 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f22646 = "android:slide:screenPosition";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC7483 f22653;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f22654;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final TimeInterpolator f22644 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final TimeInterpolator f22645 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final InterfaceC7483 f22647 = new C1273();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC7483 f22648 = new C1274();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final InterfaceC7483 f22649 = new C7479();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final InterfaceC7483 f22650 = new C7480();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final InterfaceC7483 f22651 = new C7481();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final InterfaceC7483 f22652 = new C7482();

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ */
    public class C1273 extends AbstractC7484 {
        public C1273() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo3678(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟ */
    public class C1274 extends AbstractC7484 {
        public C1274() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo3678(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public class C7479 extends AbstractC7485 {
        public C7479() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ */
        public float mo3679(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C7480 extends AbstractC7484 {
        public C7480() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo3678(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7481 extends AbstractC7484 {
        public C7481() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo3678(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7482 extends AbstractC7485 {
        public C7482() {
            super(null);
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ */
        public float mo3679(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public interface InterfaceC7483 {
        /* JADX INFO: renamed from: ۥ */
        float mo3679(ViewGroup viewGroup, View view);

        /* JADX INFO: renamed from: ۥ۟ */
        float mo3678(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractC7484 implements InterfaceC7483 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC7484() {
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ */
        public float mo3679(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: Yue.ۥۢ۟ۢ.ۥ۟۟۟ۢ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC7484(C1273 c1273) {
            this();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7485 implements InterfaceC7483 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC7485() {
        }

        @Override // Yue.C7478.InterfaceC7483
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo3678(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: Yue.ۥۢ۟ۢ.ۥۣ۟۟۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC7485(C1273 c1273) {
            this();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7486 {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7478() {
        this.f22653 = f22652;
        this.f22654 = 80;
        m23441(80);
    }

    private void captureValues(C7995 c7995) {
        int[] iArr = new int[2];
        c7995.f3178.getLocationOnScreen(iArr);
        c7995.f3177.put(f22646, iArr);
    }

    @Override // Yue.AbstractC8388, Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        super.captureEndValues(c7995);
        captureValues(c7995);
    }

    @Override // Yue.AbstractC8388, Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        super.captureStartValues(c7995);
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c79952 == null) {
            return null;
        }
        int[] iArr = (int[]) c79952.f3177.get(f22646);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C7997.m4007(view, c79952, iArr[0], iArr[1], this.f22653.mo3678(viewGroup, view), this.f22653.mo3679(viewGroup, view), translationX, translationY, f22644, this);
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null) {
            return null;
        }
        int[] iArr = (int[]) c7995.f3177.get(f22646);
        return C7997.m4007(view, c7995, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f22653.mo3678(viewGroup, view), this.f22653.mo3679(viewGroup, view), f22645, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int m23440() {
        return this.f22654;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m23441(int i) {
        if (i == 3) {
            this.f22653 = f22647;
        } else if (i == 5) {
            this.f22653 = f22650;
        } else if (i == 48) {
            this.f22653 = f22649;
        } else if (i == 80) {
            this.f22653 = f22652;
        } else if (i == 8388611) {
            this.f22653 = f22648;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f22653 = f22651;
        }
        this.f22654 = i;
        C7463 c7463 = new C7463();
        c7463.m23419(i);
        setPropagation(c7463);
    }

    public C7478(int i) {
        this.f22653 = f22652;
        this.f22654 = 80;
        m23441(i);
    }

    public C7478(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22653 = f22652;
        this.f22654 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23047);
        int iM25322 = C8021.m25322(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        m23441(iM25322);
    }
}
