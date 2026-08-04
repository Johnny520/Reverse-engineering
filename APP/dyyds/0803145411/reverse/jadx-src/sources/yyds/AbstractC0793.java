package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛴᛲᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0793 implements Cloneable {

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f3638;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3639;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f3641;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public boolean f3643;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f3644;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f3645;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f3646;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2340 f3647 = C2340.f11503;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public EnumC0296 f3635 = EnumC0296.f1566;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f3632 = true;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f3634 = -1;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f3642 = -1;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public InterfaceC1410 f3640 = C0877.f3997;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C0822 f3633 = new C0822();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C0410 f3631 = new C0410(0);

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public Class f3636 = Object.class;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f3637 = true;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean m1782(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0793) {
            return m1792((AbstractC0793) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m752(0, AbstractC0181.m752(0, AbstractC0181.m752(1, AbstractC0181.m752(this.f3641 ? 1 : 0, AbstractC0181.m752(this.f3642, AbstractC0181.m752(this.f3634, AbstractC0181.m752(this.f3632 ? 1 : 0, AbstractC0181.m750(AbstractC0181.m752(0, AbstractC0181.m750(AbstractC0181.m752(this.f3639, AbstractC0181.m750(AbstractC0181.m752(this.f3646, AbstractC0181.m752(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f3647), this.f3635), this.f3633), this.f3631), this.f3636), this.f3640), null);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final AbstractC0793 m1783(C2120 c2120, Object obj) {
        if (this.f3638) {
            return clone().m1783(c2120, obj);
        }
        AbstractC0319.m990(c2120);
        this.f3633.f3758.put(c2120, obj);
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m1784() {
        if (this.f3645) {
            C0188.m800("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AbstractC0793 m1785(C1268 c1268, AbstractC2134 abstractC2134) {
        if (this.f3638) {
            return clone().m1785(c1268, abstractC2134);
        }
        m1783(C1268.f5842, c1268);
        return m1796(abstractC2134, false);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC0793 m1786(C2340 c2340) {
        if (this.f3638) {
            return clone().m1786(c2340);
        }
        this.f3647 = c2340;
        this.f3644 |= 4;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public AbstractC0793 mo1282(AbstractC0793 abstractC0793) {
        if (this.f3638) {
            return clone().mo1282(abstractC0793);
        }
        int i = abstractC0793.f3644;
        if (m1782(abstractC0793.f3644, 1048576)) {
            this.f3643 = abstractC0793.f3643;
        }
        if (m1782(abstractC0793.f3644, 4)) {
            this.f3647 = abstractC0793.f3647;
        }
        if (m1782(abstractC0793.f3644, 8)) {
            this.f3635 = abstractC0793.f3635;
        }
        if (m1782(abstractC0793.f3644, 16)) {
            this.f3646 = 0;
            this.f3644 &= -33;
        }
        if (m1782(abstractC0793.f3644, 32)) {
            this.f3646 = abstractC0793.f3646;
            this.f3644 &= -17;
        }
        if (m1782(abstractC0793.f3644, 64)) {
            this.f3639 = 0;
            this.f3644 &= -129;
        }
        if (m1782(abstractC0793.f3644, 128)) {
            this.f3639 = abstractC0793.f3639;
            this.f3644 &= -65;
        }
        if (m1782(abstractC0793.f3644, 256)) {
            this.f3632 = abstractC0793.f3632;
        }
        if (m1782(abstractC0793.f3644, 512)) {
            this.f3642 = abstractC0793.f3642;
            this.f3634 = abstractC0793.f3634;
        }
        if (m1782(abstractC0793.f3644, 1024)) {
            this.f3640 = abstractC0793.f3640;
        }
        if (m1782(abstractC0793.f3644, 4096)) {
            this.f3636 = abstractC0793.f3636;
        }
        if (m1782(abstractC0793.f3644, 8192)) {
            this.f3644 &= -16385;
        }
        if (m1782(abstractC0793.f3644, 16384)) {
            this.f3644 &= -8193;
        }
        if (m1782(abstractC0793.f3644, 131072)) {
            this.f3641 = abstractC0793.f3641;
        }
        if (m1782(abstractC0793.f3644, 2048)) {
            this.f3631.putAll(abstractC0793.f3631);
            this.f3637 = abstractC0793.f3637;
        }
        this.f3644 |= abstractC0793.f3644;
        this.f3633.f3758.mo1165(abstractC0793.f3633.f3758);
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final AbstractC0793 m1787() {
        if (this.f3638) {
            return clone().m1787();
        }
        this.f3643 = true;
        this.f3644 |= 1048576;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final AbstractC0793 m1788(C1818 c1818) {
        if (this.f3638) {
            return clone().m1788(c1818);
        }
        this.f3640 = c1818;
        this.f3644 |= 1024;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final AbstractC0793 m1789(C1268 c1268, AbstractC2134 abstractC2134) {
        if (this.f3638) {
            return clone().m1789(c1268, abstractC2134);
        }
        m1783(C1268.f5842, c1268);
        return m1796(abstractC2134, true);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractC0793 m1790() {
        return m1789(C1268.f5843, new C1736());
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final AbstractC0793 m1791(Class cls, InterfaceC0556 interfaceC0556, boolean z) {
        if (this.f3638) {
            return clone().m1791(cls, interfaceC0556, z);
        }
        AbstractC0319.m990(interfaceC0556);
        this.f3631.put(cls, interfaceC0556);
        int i = this.f3644;
        this.f3644 = 67584 | i;
        this.f3637 = false;
        if (z) {
            this.f3644 = i | 198656;
            this.f3641 = true;
        }
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean m1792(AbstractC0793 abstractC0793) {
        abstractC0793.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f3646 == abstractC0793.f3646 && this.f3639 == abstractC0793.f3639 && this.f3632 == abstractC0793.f3632 && this.f3634 == abstractC0793.f3634 && this.f3642 == abstractC0793.f3642 && this.f3641 == abstractC0793.f3641 && this.f3647.equals(abstractC0793.f3647) && this.f3635 == abstractC0793.f3635 && this.f3633.equals(abstractC0793.f3633) && this.f3631.equals(abstractC0793.f3631) && this.f3636.equals(abstractC0793.f3636) && this.f3640.equals(abstractC0793.f3640);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AbstractC0793 m1793() {
        if (this.f3638) {
            return clone().m1793();
        }
        this.f3639 = R.drawable.xuhuohuaba;
        this.f3644 = (this.f3644 | 128) & (-65);
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final AbstractC0793 m1794() {
        if (this.f3638) {
            return clone().m1794();
        }
        this.f3635 = EnumC0296.f1569;
        this.f3644 |= 8;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final AbstractC0793 m1795(int i, int i2) {
        if (this.f3638) {
            return clone().m1795(i, i2);
        }
        this.f3642 = i;
        this.f3634 = i2;
        this.f3644 |= 512;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final AbstractC0793 m1796(InterfaceC0556 interfaceC0556, boolean z) {
        if (this.f3638) {
            return clone().m1796(interfaceC0556, z);
        }
        C0452 c0452 = new C0452(interfaceC0556, z);
        m1791(Bitmap.class, interfaceC0556, z);
        m1791(Drawable.class, c0452, z);
        m1791(BitmapDrawable.class, c0452, z);
        m1791(C2380.class, new C0726(interfaceC0556), z);
        m1784();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: merged with bridge method [inline-methods] */
    public AbstractC0793 clone() {
        try {
            AbstractC0793 abstractC0793 = (AbstractC0793) super.clone();
            C0822 c0822 = new C0822();
            abstractC0793.f3633 = c0822;
            c0822.f3758.mo1165(this.f3633.f3758);
            C0410 c0410 = new C0410(0);
            abstractC0793.f3631 = c0410;
            c0410.putAll(this.f3631);
            abstractC0793.f3645 = false;
            abstractC0793.f3638 = false;
            return abstractC0793;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final AbstractC0793 m1797() {
        if (this.f3638) {
            return clone().m1797();
        }
        this.f3632 = false;
        this.f3644 |= 256;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final AbstractC0793 m1798() {
        if (this.f3638) {
            return clone().m1798();
        }
        this.f3646 = R.drawable.xuhuohuaba;
        this.f3644 = (this.f3644 | 32) & (-17);
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC0793 m1799(Class cls) {
        if (this.f3638) {
            return clone().m1799(cls);
        }
        this.f3636 = cls;
        this.f3644 |= 4096;
        m1784();
        return this;
    }
}
