package androidx.appcompat.app;

import Yue.AbstractC3086;
import Yue.C6898;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.AbstractC8885;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1583 {

    /* JADX INFO: renamed from: ۥ */
    @Deprecated
    public static final int f3616 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    @Deprecated
    public static final int f3617 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Deprecated
    public static final int f25723 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f25724 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f25725 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f25726 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f25727 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f25728 = 16;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8638 {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8640 {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8641 {
        /* JADX INFO: renamed from: ۥ */
        void m4596(boolean z);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Deprecated
    public interface InterfaceC8642 {
        /* JADX INFO: renamed from: ۥ */
        boolean m4597(int i, long j);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Deprecated
    public static abstract class AbstractC8643 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f3619 = -1;

        /* JADX INFO: renamed from: ۥ */
        public abstract CharSequence mo4598();

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract View mo4599();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract Drawable mo28764();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract int mo28765();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public abstract Object mo28766();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public abstract CharSequence mo28767();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public abstract void mo28768();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28769(@InterfaceC7613 int i);

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public abstract AbstractC8643 mo28770(CharSequence charSequence);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28771(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28772(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28773(@InterfaceC4525 int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28774(Drawable drawable);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public abstract AbstractC8643 mo28775(InterfaceC8644 interfaceC8644);

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public abstract AbstractC8643 mo28776(Object obj);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public abstract AbstractC8643 mo28777(int i);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public abstract AbstractC8643 mo28778(CharSequence charSequence);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Deprecated
    public interface InterfaceC8644 {
        /* JADX INFO: renamed from: ۥ */
        void m4600(AbstractC8643 abstractC8643, AbstractC8885 abstractC8885);

        /* JADX INFO: renamed from: ۥ۟ */
        void m4601(AbstractC8643 abstractC8643, AbstractC8885 abstractC8885);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m28779(AbstractC8643 abstractC8643, AbstractC8885 abstractC8885);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo28688(InterfaceC8641 interfaceC8641);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28689(AbstractC8643 abstractC8643);

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract void mo28690(AbstractC8643 abstractC8643, int i);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract void mo28691(AbstractC8643 abstractC8643, int i, boolean z);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract void mo28692(AbstractC8643 abstractC8643, boolean z);

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo28693() {
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean mo28694() {
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo28695(boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public abstract View mo28696();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract int mo28697();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public float mo28698() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract int mo28699();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int mo28700() {
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract int mo28701();

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public abstract int mo28702();

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract int mo28703();

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public abstract AbstractC8643 mo28704();

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public abstract CharSequence mo28705();

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract AbstractC8643 mo28706(int i);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public abstract int mo28707();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Context mo28708() {
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public abstract CharSequence mo28709();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public abstract void mo28710();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean mo28711() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean mo28712() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public abstract boolean mo28713();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean mo28714() {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract AbstractC8643 mo28715();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void mo28716(Configuration configuration) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo28717() {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean mo28718(int i, KeyEvent keyEvent) {
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean mo28719(KeyEvent keyEvent) {
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean mo28720() {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public abstract void mo28721();

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public abstract void mo28722(InterfaceC8641 interfaceC8641);

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28723(AbstractC8643 abstractC8643);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public abstract void mo28724(int i);

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean mo28725() {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public abstract void mo28726(AbstractC8643 abstractC8643);

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public abstract void mo28727(@InterfaceC6490 Drawable drawable);

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public abstract void mo28728(int i);

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public abstract void mo28729(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract void mo28730(View view, C8639 c8639);

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo28731(boolean z) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public abstract void mo28732(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28733(int i);

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public abstract void mo28734(int i, int i2);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public abstract void mo28735(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public abstract void mo28736(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo28737(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public abstract void mo28738(boolean z);

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void mo28739(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void mo28740(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void mo28741(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void mo28742(@InterfaceC7613 int i) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void mo28743(@InterfaceC6490 CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void mo28744(@InterfaceC4525 int i) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void mo28745(@InterfaceC6490 Drawable drawable) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void mo28746(boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public abstract void mo28747(@InterfaceC4525 int i);

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public abstract void mo28748(Drawable drawable);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public abstract void mo28749(SpinnerAdapter spinnerAdapter, InterfaceC8642 interfaceC8642);

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public abstract void mo28750(@InterfaceC4525 int i);

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public abstract void mo28751(Drawable drawable);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public abstract void mo28752(int i);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public abstract void mo28753(int i);

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void mo28754(boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void mo28755(Drawable drawable) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void mo28756(Drawable drawable) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public abstract void mo28757(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public abstract void mo28758(CharSequence charSequence);

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public abstract void mo28759(@InterfaceC7613 int i);

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public abstract void mo28760(CharSequence charSequence);

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void mo28761(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo28762();

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public AbstractC3086 mo28763(AbstractC3086.InterfaceC0044 interfaceC0044) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ$ۥ۟, reason: contains not printable characters */
    public static class C8639 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ */
        public int f3618;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8639(@InterfaceC6391 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3618 = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19395);
            this.f3618 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19396, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C8639(int i, int i2) {
            super(i, i2);
            this.f3618 = 8388627;
        }

        public C8639(int i, int i2, int i3) {
            super(i, i2);
            this.f3618 = i3;
        }

        public C8639(int i) {
            this(-2, -1, i);
        }

        public C8639(C8639 c8639) {
            super((ViewGroup.MarginLayoutParams) c8639);
            this.f3618 = 0;
            this.f3618 = c8639.f3618;
        }

        public C8639(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3618 = 0;
        }
    }
}
