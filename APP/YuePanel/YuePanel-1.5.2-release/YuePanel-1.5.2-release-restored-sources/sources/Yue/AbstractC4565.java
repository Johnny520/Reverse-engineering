package Yue;

import Yue.AbstractC4565;
import Yue.C3238;
import Yue.InterfaceC7144;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4565<T extends AbstractC4565<T>> implements C3238.InterfaceC0091 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final AbstractC4582 f9825 = new C4570(AbstractC5616.f13597);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final AbstractC4582 f9826 = new C4571(AbstractC5616.f13598);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final AbstractC4582 f9827 = new C4572(AbstractC5616.f13599);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final AbstractC4582 f9828 = new C4573(AbstractC5616.f13592);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final AbstractC4582 f9829 = new C4574(AbstractC5616.f13593);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final AbstractC4582 f9830 = new C4575(AbstractC5616.f13586);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final AbstractC4582 f9831 = new C4576(AbstractC5616.f13587);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final AbstractC4582 f9832 = new C4577(AbstractC5616.f13588);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final AbstractC4582 f9833 = new C4578("x");

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final AbstractC4582 f9834 = new C0442("y");

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final AbstractC4582 f9835 = new C0443("z");

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final AbstractC4582 f9836 = new C4566(AbstractC5616.f13584);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final AbstractC4582 f9837 = new C4567("scrollX");

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final AbstractC4582 f9838 = new C4568("scrollY");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final float f9839 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final float f9840 = 0.1f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final float f9841 = 0.00390625f;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final float f9842 = 0.002f;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final float f9843 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final float f9844 = 0.75f;

    /* JADX INFO: renamed from: ۥ */
    public float f975;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f976;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f9845;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Object f9846;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC4884 f9847;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f9848;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f9849;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f9850;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public long f9851;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f9852;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final ArrayList<InterfaceC4580> f9853;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final ArrayList<InterfaceC4581> f9854;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ */
    public static class C0442 extends AbstractC4582 {
        public C0442(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getY();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟ */
    public static class C0443 extends AbstractC4582 {
        public C0443(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return C8273.m27388(view);
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            C8273.m27494(view, f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C4566 extends AbstractC4582 {
        public C4566(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getAlpha();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4567 extends AbstractC4582 {
        public C4567(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollX();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C4568 extends AbstractC4582 {
        public C4568(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollY();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C4569 extends AbstractC4884 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C4887 f977;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4569(String str, C4887 c4887) {
            super(str);
            this.f977 = c4887;
        }

        @Override // Yue.AbstractC4884
        public float getValue(Object obj) {
            return this.f977.m1797();
        }

        @Override // Yue.AbstractC4884
        public void setValue(Object obj, float f) {
            this.f977.m1798(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C4570 extends AbstractC4582 {
        public C4570(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C4571 extends AbstractC4582 {
        public C4571(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C4572 extends AbstractC4582 {
        public C4572(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return C8273.m27383(view);
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            C8273.m27490(view, f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C4573 extends AbstractC4582 {
        public C4573(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleX();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C4574 extends AbstractC4582 {
        public C4574(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleY();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C4575 extends AbstractC4582 {
        public C4575(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotation();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C4576 extends AbstractC4582 {
        public C4576(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationX();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C4577 extends AbstractC4582 {
        public C4577(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationY();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۠, reason: contains not printable characters */
    public static class C4578 extends AbstractC4582 {
        public C4578(String str) {
            super(str, null);
        }

        /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;)F */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getX();
        }

        /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;F)V */
        @Override // Yue.AbstractC4884
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C4579 {

        /* JADX INFO: renamed from: ۥ */
        public float f979;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f980;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۠, reason: contains not printable characters */
    public interface InterfaceC4580 {
        /* JADX INFO: renamed from: ۥ */
        void mo1542(AbstractC4565 abstractC4565, boolean z, float f, float f2);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public interface InterfaceC4581 {
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        void mo13631(AbstractC4565 abstractC4565, float f, float f2);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static abstract class AbstractC4582 extends AbstractC4884<View> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:1) call: Yue.ۥۣ۠۠ۤ.ۥ۟۟۠ۢ.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC4582(String str, C4570 c4570) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC4582(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4565(C4887 c4887) {
        this.f975 = 0.0f;
        this.f976 = Float.MAX_VALUE;
        this.f9845 = false;
        this.f9848 = false;
        this.f9849 = Float.MAX_VALUE;
        this.f9850 = -Float.MAX_VALUE;
        this.f9851 = 0L;
        this.f9853 = new ArrayList<>();
        this.f9854 = new ArrayList<>();
        this.f9846 = null;
        this.f9847 = new C4569("FloatValueHolder", c4887);
        this.f9852 = 1.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> void m13608(ArrayList<T> arrayList, T t) {
        int iIndexOf = arrayList.indexOf(t);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static <T> void m13609(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // Yue.C3238.InterfaceC0091
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public boolean mo320(long j) {
        long j2 = this.f9851;
        if (j2 == 0) {
            this.f9851 = j;
            m13624(this.f976);
            return false;
        }
        this.f9851 = j;
        boolean zMo13630 = mo13630(j - j2);
        float fMin = Math.min(this.f976, this.f9849);
        this.f976 = fMin;
        float fMax = Math.max(fMin, this.f9850);
        this.f976 = fMax;
        m13624(fMax);
        if (zMo13630) {
            m13612(false);
        }
        return zMo13630;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public T m1513(InterfaceC4580 interfaceC4580) {
        if (!this.f9853.contains(interfaceC4580)) {
            this.f9853.add(interfaceC4580);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public T m13610(InterfaceC4581 interfaceC4581) {
        if (m13618()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f9854.contains(interfaceC4581)) {
            this.f9854.add(interfaceC4581);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m13611() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f9848) {
            m13612(true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m13612(boolean z) {
        this.f9848 = false;
        C3238.m6621().m6625(this);
        this.f9851 = 0L;
        this.f9845 = false;
        for (int i = 0; i < this.f9853.size(); i++) {
            if (this.f9853.get(i) != null) {
                this.f9853.get(i).mo1542(this, z, this.f976, this.f975);
            }
        }
        m13609(this.f9853);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract float mo13613(float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m13614() {
        return this.f9852;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float m13615() {
        return this.f9847.getValue(this.f9846);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m13616() {
        return this.f9852 * 0.75f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract boolean mo13617(float f, float f2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m13618() {
        return this.f9848;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m13619(InterfaceC4580 interfaceC4580) {
        m13608(this.f9853, interfaceC4580);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m13620(InterfaceC4581 interfaceC4581) {
        m13608(this.f9854, interfaceC4581);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public T mo13621(float f) {
        this.f9849 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public T mo13622(float f) {
        this.f9850 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public T m13623(@InterfaceC4885(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f9852 = f;
        mo13627(f * 0.75f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m13624(float f) {
        this.f9847.setValue(this.f9846, f);
        for (int i = 0; i < this.f9854.size(); i++) {
            if (this.f9854.get(i) != null) {
                this.f9854.get(i).mo13631(this, this.f976, this.f975);
            }
        }
        m13609(this.f9854);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public T m13625(float f) {
        this.f976 = f;
        this.f9845 = true;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public T mo13626(float f) {
        this.f975 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract void mo13627(float f);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void mo13628() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9848) {
            return;
        }
        m13629();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m13629() {
        if (this.f9848) {
            return;
        }
        this.f9848 = true;
        if (!this.f9845) {
            this.f976 = m13615();
        }
        float f = this.f976;
        if (f > this.f9849 || f < this.f9850) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C3238.m6621().m317(this, 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract boolean mo13630(long j);

    public <K> AbstractC4565(K k, AbstractC4884<K> abstractC4884) {
        this.f975 = 0.0f;
        this.f976 = Float.MAX_VALUE;
        this.f9845 = false;
        this.f9848 = false;
        this.f9849 = Float.MAX_VALUE;
        this.f9850 = -Float.MAX_VALUE;
        this.f9851 = 0L;
        this.f9853 = new ArrayList<>();
        this.f9854 = new ArrayList<>();
        this.f9846 = k;
        this.f9847 = abstractC4884;
        if (abstractC4884 != f9830 && abstractC4884 != f9831 && abstractC4884 != f9832) {
            if (abstractC4884 == f9836) {
                this.f9852 = 0.00390625f;
                return;
            } else if (abstractC4884 != f9828 && abstractC4884 != f9829) {
                this.f9852 = 1.0f;
                return;
            } else {
                this.f9852 = 0.00390625f;
                return;
            }
        }
        this.f9852 = 0.1f;
    }
}
