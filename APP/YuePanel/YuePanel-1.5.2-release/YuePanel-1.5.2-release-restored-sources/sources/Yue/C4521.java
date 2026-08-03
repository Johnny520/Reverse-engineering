package Yue;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4521 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final boolean f9637 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String f9638 = "DrawableContainerCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final boolean f9639 = true;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public AbstractC4523 f9640;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Rect f9641;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Drawable f9642;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Drawable f9643;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f9645;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f9647;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Runnable f9648;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public long f9649;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public long f9650;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C4522 f9651;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f9644 = 255;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f9646 = -1;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ */
    public class RunnableC0426 implements Runnable {
        public RunnableC0426() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4521.this.m1452(true);
            C4521.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0427 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m1453(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m1454(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Resources m13256(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C4522 implements Drawable.Callback {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Drawable.Callback f9653;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@InterfaceC6391 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable, long j) {
            Drawable.Callback callback = this.f9653;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable) {
            Drawable.Callback callback = this.f9653;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public Drawable.Callback m1455() {
            Drawable.Callback callback = this.f9653;
            this.f9653 = null;
            return callback;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C4522 m1456(Drawable.Callback callback) {
            this.f9653 = callback;
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC4523 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ */
        public final C4521 f943;

        /* JADX INFO: renamed from: ۥ۟ */
        public Resources f944;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f9654;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f9655;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f9656;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public SparseArray<Drawable.ConstantState> f9657;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Drawable[] f9658;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f9659;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f9660;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f9661;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Rect f9662;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f9663;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f9664;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f9665;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f9666;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f9667;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f9668;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f9669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int f9670;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f9671;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f9672;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f9673;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f9674;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f9675;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f9676;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f9677;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f9678;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f9679;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public boolean f9680;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public ColorFilter f9681;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean f9682;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public ColorStateList f9683;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public PorterDuff.Mode f9684;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public boolean f9685;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public boolean f9686;

        public AbstractC4523(AbstractC4523 abstractC4523, C4521 c4521, Resources resources) {
            this.f9660 = false;
            this.f9663 = false;
            this.f9675 = true;
            this.f9678 = 0;
            this.f9679 = 0;
            this.f943 = c4521;
            this.f944 = resources != null ? resources : abstractC4523 != null ? abstractC4523.f944 : null;
            int iM13247 = C4521.m13247(resources, abstractC4523 != null ? abstractC4523.f9654 : 0);
            this.f9654 = iM13247;
            if (abstractC4523 == null) {
                this.f9658 = new Drawable[10];
                this.f9659 = 0;
                return;
            }
            this.f9655 = abstractC4523.f9655;
            this.f9656 = abstractC4523.f9656;
            this.f9673 = true;
            this.f9674 = true;
            this.f9660 = abstractC4523.f9660;
            this.f9663 = abstractC4523.f9663;
            this.f9675 = abstractC4523.f9675;
            this.f9676 = abstractC4523.f9676;
            this.f9677 = abstractC4523.f9677;
            this.f9678 = abstractC4523.f9678;
            this.f9679 = abstractC4523.f9679;
            this.f9680 = abstractC4523.f9680;
            this.f9681 = abstractC4523.f9681;
            this.f9682 = abstractC4523.f9682;
            this.f9683 = abstractC4523.f9683;
            this.f9684 = abstractC4523.f9684;
            this.f9685 = abstractC4523.f9685;
            this.f9686 = abstractC4523.f9686;
            if (abstractC4523.f9654 == iM13247) {
                if (abstractC4523.f9661) {
                    this.f9662 = abstractC4523.f9662 != null ? new Rect(abstractC4523.f9662) : null;
                    this.f9661 = true;
                }
                if (abstractC4523.f9664) {
                    this.f9665 = abstractC4523.f9665;
                    this.f9666 = abstractC4523.f9666;
                    this.f9667 = abstractC4523.f9667;
                    this.f9668 = abstractC4523.f9668;
                    this.f9664 = true;
                }
            }
            if (abstractC4523.f9669) {
                this.f9670 = abstractC4523.f9670;
                this.f9669 = true;
            }
            if (abstractC4523.f9671) {
                this.f9672 = abstractC4523.f9672;
                this.f9671 = true;
            }
            Drawable[] drawableArr = abstractC4523.f9658;
            this.f9658 = new Drawable[drawableArr.length];
            this.f9659 = abstractC4523.f9659;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC4523.f9657;
            if (sparseArray != null) {
                this.f9657 = sparseArray.clone();
            } else {
                this.f9657 = new SparseArray<>(this.f9659);
            }
            int i = this.f9659;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f9657.put(i2, constantState);
                    } else {
                        this.f9658[i2] = drawableArr[i2];
                    }
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC7113(21)
        public boolean canApplyTheme() {
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9657.get(i2);
                    if (constantState != null && C0427.m1453(constantState)) {
                        return true;
                    }
                } else if (C4520.m1447(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9655 | this.f9656;
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m1457(Drawable drawable) {
            int i = this.f9659;
            if (i >= this.f9658.length) {
                mo13272(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f943);
            this.f9658[i] = drawable;
            this.f9659++;
            this.f9656 = drawable.getChangingConfigurations() | this.f9656;
            m13273();
            this.f9662 = null;
            this.f9661 = false;
            this.f9664 = false;
            this.f9673 = false;
            return i;
        }

        @InterfaceC7113(21)
        /* JADX INFO: renamed from: ۥ۟ */
        public final void m1458(Resources.Theme theme) {
            if (theme != null) {
                m13260();
                int i = this.f9659;
                Drawable[] drawableArr = this.f9658;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && C4520.m1447(drawable)) {
                        C4520.m1446(drawableArr[i2], theme);
                        this.f9656 |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m13282(C0427.m13256(theme));
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m13257() {
            if (this.f9673) {
                return this.f9674;
            }
            m13260();
            this.f9673 = true;
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f9674 = false;
                    return false;
                }
            }
            this.f9674 = true;
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13258() {
            this.f9676 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m13259() {
            this.f9664 = true;
            m13260();
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            this.f9666 = -1;
            this.f9665 = -1;
            this.f9668 = 0;
            this.f9667 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9665) {
                    this.f9665 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9666) {
                    this.f9666 = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9667) {
                    this.f9667 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9668) {
                    this.f9668 = minimumHeight;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m13260() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9657;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f9658[this.f9657.keyAt(i)] = m13276(this.f9657.valueAt(i).newDrawable(this.f944));
                }
                this.f9657 = null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m13261() {
            return this.f9658.length;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Drawable m13262(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f9658[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9657;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableM13276 = m13276(this.f9657.valueAt(iIndexOfKey).newDrawable(this.f944));
            this.f9658[i] = drawableM13276;
            this.f9657.removeAt(iIndexOfKey);
            if (this.f9657.size() == 0) {
                this.f9657 = null;
            }
            return drawableM13276;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m13263() {
            return this.f9659;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int m13264() {
            if (!this.f9664) {
                m13259();
            }
            return this.f9666;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final int m13265() {
            if (!this.f9664) {
                m13259();
            }
            return this.f9668;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final int m13266() {
            if (!this.f9664) {
                m13259();
            }
            return this.f9667;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final Rect m13267() {
            Rect rect = null;
            if (this.f9660) {
                return null;
            }
            Rect rect2 = this.f9662;
            if (rect2 != null || this.f9661) {
                return rect2;
            }
            m13260();
            Rect rect3 = new Rect();
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f9661 = true;
            this.f9662 = rect;
            return rect;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final int m13268() {
            if (!this.f9664) {
                m13259();
            }
            return this.f9665;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final int m13269() {
            return this.f9678;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final int m13270() {
            return this.f9679;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final int m13271() {
            if (this.f9669) {
                return this.f9670;
            }
            m13260();
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f9670 = opacity;
            this.f9669 = true;
            return opacity;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo13272(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f9658;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f9658 = drawableArr;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m13273() {
            this.f9669 = false;
            this.f9671 = false;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final boolean m13274() {
            return this.f9663;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final boolean m13275() {
            if (this.f9671) {
                return this.f9672;
            }
            m13260();
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                }
                i2++;
            }
            this.f9672 = z;
            this.f9671 = true;
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public void mo6604() {
            int i = this.f9659;
            Drawable[] drawableArr = this.f9658;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f9676 = true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final Drawable m13276(Drawable drawable) {
            C4520.m13234(drawable, this.f9677);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f943);
            return drawableMutate;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final void m13277(boolean z) {
            this.f9663 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final void m13278(int i) {
            this.f9678 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final void m13279(int i) {
            this.f9679 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final boolean m13280(int i, int i2) {
            int i3 = this.f9659;
            Drawable[] drawableArr = this.f9658;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean zM13234 = C4520.m13234(drawable, i);
                    if (i4 == i2) {
                        z = zM13234;
                    }
                }
            }
            this.f9677 = i;
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final void m13281(boolean z) {
            this.f9660 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m13282(Resources resources) {
            if (resources != null) {
                this.f944 = resources;
                int iM13247 = C4521.m13247(resources, this.f9654);
                int i = this.f9654;
                this.f9654 = iM13247;
                if (i != iM13247) {
                    this.f9664 = false;
                    this.f9661 = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m13247(@InterfaceC6490 Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(21)
    public void applyTheme(@InterfaceC6391 Resources.Theme theme) {
        this.f9640.m1458(theme);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(21)
    public boolean canApplyTheme() {
        return this.f9640.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Drawable drawable = this.f9642;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9643;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9644;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9640.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f9640.m13257()) {
            return null;
        }
        this.f9640.f9655 = getChangingConfigurations();
        return this.f9640;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6391
    public Drawable getCurrent() {
        return this.f9642;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@InterfaceC6391 Rect rect) {
        Rect rect2 = this.f9641;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f9640.m13274()) {
            return this.f9640.m13264();
        }
        Drawable drawable = this.f9642;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f9640.m13274()) {
            return this.f9640.m13268();
        }
        Drawable drawable = this.f9642;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f9640.m13274()) {
            return this.f9640.m13265();
        }
        Drawable drawable = this.f9642;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f9640.m13274()) {
            return this.f9640.m13266();
        }
        Drawable drawable = this.f9642;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9642;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9640.m13271();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC7113(21)
    public void getOutline(@InterfaceC6391 Outline outline) {
        Drawable drawable = this.f9642;
        if (drawable != null) {
            C0427.m1454(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@InterfaceC6391 Rect rect) {
        boolean padding;
        Rect rectM13267 = this.f9640.m13267();
        if (rectM13267 != null) {
            rect.set(rectM13267);
            padding = (rectM13267.right | ((rectM13267.left | rectM13267.top) | rectM13267.bottom)) != 0;
        } else {
            Drawable drawable = this.f9642;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m13250()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC6391 Drawable drawable) {
        AbstractC4523 abstractC4523 = this.f9640;
        if (abstractC4523 != null) {
            abstractC4523.m13273();
        }
        if (drawable != this.f9642 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9640.f9680;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f9640.m13275();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f9643;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9643 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9645) {
                this.f9642.setAlpha(this.f9644);
            }
        }
        if (this.f9650 != 0) {
            this.f9650 = 0L;
            z = true;
        }
        if (this.f9649 != 0) {
            this.f9649 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9647 && super.mutate() == this) {
            AbstractC4523 abstractC4523Mo6589 = mo6589();
            abstractC4523Mo6589.mo6604();
            mo6590(abstractC4523Mo6589);
            this.f9647 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9643;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f9640.m13280(i, m13248());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9643;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@InterfaceC6391 int[] iArr) {
        Drawable drawable = this.f9643;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable, long j) {
        if (drawable != this.f9642 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f9645 && this.f9644 == i) {
            return;
        }
        this.f9645 = true;
        this.f9644 = i;
        Drawable drawable = this.f9642;
        if (drawable != null) {
            if (this.f9649 == 0) {
                drawable.setAlpha(i);
            } else {
                m1452(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC4523 abstractC4523 = this.f9640;
        if (abstractC4523.f9680 != z) {
            abstractC4523.f9680 = z;
            Drawable drawable = this.f9642;
            if (drawable != null) {
                C4520.m13231(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC4523 abstractC4523 = this.f9640;
        abstractC4523.f9682 = true;
        if (abstractC4523.f9681 != colorFilter) {
            abstractC4523.f9681 = colorFilter;
            Drawable drawable = this.f9642;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC4523 abstractC4523 = this.f9640;
        if (abstractC4523.f9675 != z) {
            abstractC4523.f9675 = z;
            Drawable drawable = this.f9642;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f9642;
        if (drawable != null) {
            C4520.m13232(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f9641;
        if (rect == null) {
            this.f9641 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f9642;
        if (drawable != null) {
            C4520.m13233(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@InterfaceC3897 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC4523 abstractC4523 = this.f9640;
        abstractC4523.f9685 = true;
        if (abstractC4523.f9683 != colorStateList) {
            abstractC4523.f9683 = colorStateList;
            C4520.m13236(this.f9642, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        AbstractC4523 abstractC4523 = this.f9640;
        abstractC4523.f9686 = true;
        if (abstractC4523.f9684 != mode) {
            abstractC4523.f9684 = mode;
            C4520.m13237(this.f9642, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f9643;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Runnable runnable) {
        if (drawable != this.f9642 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1452(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f9645 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f9642;
        if (drawable2 != null) {
            long j = this.f9649;
            if (j != 0) {
                if (j <= jUptimeMillis) {
                    drawable2.setAlpha(this.f9644);
                    this.f9649 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.f9640.f9678)) * this.f9644) / 255);
                    z2 = true;
                }
            }
            drawable = this.f9643;
            if (drawable == null) {
                long j2 = this.f9650;
                if (j2 != 0) {
                    if (j2 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f9643 = null;
                        this.f9650 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f9640.f9679) * this.f9644) / 255);
                    }
                }
                if (z && z3) {
                    scheduleSelf(this.f9648, jUptimeMillis + 16);
                    return;
                }
                return;
            }
            this.f9650 = 0L;
            z3 = z2;
            if (z) {
                return;
            } else {
                return;
            }
        }
        this.f9649 = 0L;
        z2 = false;
        drawable = this.f9643;
        if (drawable == null) {
        }
        z3 = z2;
        if (z) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo309() {
        this.f9640.m13258();
        this.f9647 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC4523 mo6589() {
        return this.f9640;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m13248() {
        return this.f9646;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m13249(Drawable drawable) {
        if (this.f9651 == null) {
            this.f9651 = new C4522();
        }
        drawable.setCallback(this.f9651.m1456(drawable.getCallback()));
        try {
            if (this.f9640.f9678 <= 0 && this.f9645) {
                drawable.setAlpha(this.f9644);
            }
            AbstractC4523 abstractC4523 = this.f9640;
            if (abstractC4523.f9682) {
                drawable.setColorFilter(abstractC4523.f9681);
            } else {
                if (abstractC4523.f9685) {
                    C4520.m13236(drawable, abstractC4523.f9683);
                }
                AbstractC4523 abstractC45232 = this.f9640;
                if (abstractC45232.f9686) {
                    C4520.m13237(drawable, abstractC45232.f9684);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9640.f9675);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C4520.m13234(drawable, C4520.m13227(this));
            C4520.m13231(drawable, this.f9640.f9680);
            Rect rect = this.f9641;
            if (rect != null) {
                C4520.m13233(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f9651.m1455());
        } catch (Throwable th) {
            drawable.setCallback(this.f9651.m1455());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m13250() {
        return isAutoMirrored() && C4520.m13227(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m13251(int i) {
        if (i == this.f9646) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f9640.f9679 > 0) {
            Drawable drawable = this.f9643;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f9642;
            if (drawable2 != null) {
                this.f9643 = drawable2;
                this.f9650 = ((long) this.f9640.f9679) + jUptimeMillis;
            } else {
                this.f9643 = null;
                this.f9650 = 0L;
            }
        } else {
            Drawable drawable3 = this.f9642;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC4523 abstractC4523 = this.f9640;
            if (i < abstractC4523.f9659) {
                Drawable drawableM13262 = abstractC4523.m13262(i);
                this.f9642 = drawableM13262;
                this.f9646 = i;
                if (drawableM13262 != null) {
                    int i2 = this.f9640.f9678;
                    if (i2 > 0) {
                        this.f9649 = jUptimeMillis + ((long) i2);
                    }
                    m13249(drawableM13262);
                }
            } else {
                this.f9642 = null;
                this.f9646 = -1;
            }
        }
        if (this.f9649 != 0 || this.f9650 != 0) {
            Runnable runnable = this.f9648;
            if (runnable == null) {
                this.f9648 = new RunnableC0426();
            } else {
                unscheduleSelf(runnable);
            }
            m1452(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo6590(AbstractC4523 abstractC4523) {
        this.f9640 = abstractC4523;
        int i = this.f9646;
        if (i >= 0) {
            Drawable drawableM13262 = abstractC4523.m13262(i);
            this.f9642 = drawableM13262;
            if (drawableM13262 != null) {
                m13249(drawableM13262);
            }
        }
        this.f9643 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m13252(int i) {
        m13251(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m13253(int i) {
        this.f9640.f9678 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m13254(int i) {
        this.f9640.f9679 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m13255(Resources resources) {
        this.f9640.m13282(resources);
    }
}
