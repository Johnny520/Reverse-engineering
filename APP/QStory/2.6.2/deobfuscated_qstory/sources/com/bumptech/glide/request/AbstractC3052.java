package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.C3012;
import com.bumptech.glide.load.resource.bitmap.AbstractC3024;
import com.bumptech.glide.load.resource.bitmap.C3029;
import com.bumptech.glide.load.resource.bitmap.C3036;
import com.bumptech.glide.load.resource.bitmap.C3038;
import p221.C7976;
import p222.AbstractC7988;
import p222.C7982;
import p234.C8079;
import p234.C8081;
import p235.C8087;
import p286.C8396;
import p286.C8397;
import p286.InterfaceC8392;
import p286.InterfaceC8398;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3052 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f9730;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f9735;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f9736;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f9738;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Resources.Theme f9739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3012 f9746 = C3012.f9578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Priority f9747 = Priority.NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f9744 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9745 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f9742 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC8392 f9743 = C7976.f22053;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f9734 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8396 f9733 = new C8396();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7982 f9732 = new C7982(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Class f9731 = Object.class;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f9737 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m6550(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3052) {
            return m6571((AbstractC3052) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13451(0, AbstractC7988.m13451(0, AbstractC7988.m13451(this.f9734 ? 1 : 0, AbstractC7988.m13451(this.f9735 ? 1 : 0, AbstractC7988.m13451(this.f9742, AbstractC7988.m13451(this.f9745, AbstractC7988.m13451(this.f9744 ? 1 : 0, AbstractC7988.m13448(AbstractC7988.m13451(0, AbstractC7988.m13448(AbstractC7988.m13451(this.f9740, AbstractC7988.m13448(AbstractC7988.m13451(this.f9741, AbstractC7988.m13451(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f9746), this.f9747), this.f9733), this.f9732), this.f9731), this.f9743), this.f9739);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3052 m6551() {
        if (this.f9738) {
            return clone().m6551();
        }
        this.f9736 = true;
        this.f9748 |= 1048576;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3052 m6552(InterfaceC8398 interfaceC8398, boolean z) {
        if (this.f9738) {
            return clone().m6552(interfaceC8398, z);
        }
        C3038 c3038 = new C3038(interfaceC8398, z);
        m6553(Bitmap.class, interfaceC8398, z);
        m6553(Drawable.class, c3038, z);
        m6553(BitmapDrawable.class, c3038, z);
        m6553(C8081.class, new C8079(interfaceC8398), z);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3052 m6553(Class cls, InterfaceC8398 interfaceC8398, boolean z) {
        if (this.f9738) {
            return clone().m6553(cls, interfaceC8398, z);
        }
        AbstractC7988.m13442(interfaceC8398);
        this.f9732.put(cls, interfaceC8398);
        int i = this.f9748;
        this.f9734 = true;
        this.f9748 = 67584 | i;
        this.f9737 = false;
        if (z) {
            this.f9748 = i | 198656;
            this.f9735 = true;
        }
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3052 m6554() {
        return m6567(C3036.f9667, new C3029(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3052 m6555(int i) {
        if (this.f9738) {
            return clone().m6555(i);
        }
        this.f9741 = i;
        this.f9748 = (this.f9748 | 32) & (-17);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3052 m6556(C3012 c3012) {
        if (this.f9738) {
            return clone().m6556(c3012);
        }
        this.f9746 = c3012;
        this.f9748 |= 4;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3052 m6557(Class cls) {
        if (this.f9738) {
            return clone().m6557(cls);
        }
        this.f9731 = cls;
        this.f9748 |= 4096;
        m6568();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC3052 clone() {
        try {
            AbstractC3052 abstractC3052 = (AbstractC3052) super.clone();
            C8396 c8396 = new C8396();
            abstractC3052.f9733 = c8396;
            c8396.f23273.mo868(this.f9733.f23273);
            C7982 c7982 = new C7982(0);
            abstractC3052.f9732 = c7982;
            c7982.putAll(this.f9732);
            abstractC3052.f9730 = false;
            abstractC3052.f9738 = false;
            return abstractC3052;
        } catch (CloneNotSupportedException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3052 mo6559(AbstractC3052 abstractC3052) {
        if (this.f9738) {
            return clone().mo6559(abstractC3052);
        }
        int i = abstractC3052.f9748;
        if (m6550(abstractC3052.f9748, 1048576)) {
            this.f9736 = abstractC3052.f9736;
        }
        if (m6550(abstractC3052.f9748, 4)) {
            this.f9746 = abstractC3052.f9746;
        }
        if (m6550(abstractC3052.f9748, 8)) {
            this.f9747 = abstractC3052.f9747;
        }
        if (m6550(abstractC3052.f9748, 16)) {
            this.f9741 = 0;
            this.f9748 &= -33;
        }
        if (m6550(abstractC3052.f9748, 32)) {
            this.f9741 = abstractC3052.f9741;
            this.f9748 &= -17;
        }
        if (m6550(abstractC3052.f9748, 64)) {
            this.f9740 = 0;
            this.f9748 &= -129;
        }
        if (m6550(abstractC3052.f9748, 128)) {
            this.f9740 = abstractC3052.f9740;
            this.f9748 &= -65;
        }
        if (m6550(abstractC3052.f9748, 256)) {
            this.f9744 = abstractC3052.f9744;
        }
        if (m6550(abstractC3052.f9748, 512)) {
            this.f9742 = abstractC3052.f9742;
            this.f9745 = abstractC3052.f9745;
        }
        if (m6550(abstractC3052.f9748, 1024)) {
            this.f9743 = abstractC3052.f9743;
        }
        if (m6550(abstractC3052.f9748, 4096)) {
            this.f9731 = abstractC3052.f9731;
        }
        if (m6550(abstractC3052.f9748, 8192)) {
            this.f9748 &= -16385;
        }
        if (m6550(abstractC3052.f9748, 16384)) {
            this.f9748 &= -8193;
        }
        if (m6550(abstractC3052.f9748, 32768)) {
            this.f9739 = abstractC3052.f9739;
        }
        if (m6550(abstractC3052.f9748, 65536)) {
            this.f9734 = abstractC3052.f9734;
        }
        if (m6550(abstractC3052.f9748, 131072)) {
            this.f9735 = abstractC3052.f9735;
        }
        if (m6550(abstractC3052.f9748, 2048)) {
            this.f9732.putAll(abstractC3052.f9732);
            this.f9737 = abstractC3052.f9737;
        }
        if (!this.f9734) {
            this.f9732.clear();
            int i2 = this.f9748;
            this.f9735 = false;
            this.f9748 = i2 & (-133121);
            this.f9737 = true;
        }
        this.f9748 |= abstractC3052.f9748;
        this.f9733.f23273.mo868(abstractC3052.f9733.f23273);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC3052 m6560(InterfaceC8392 interfaceC8392) {
        if (this.f9738) {
            return clone().m6560(interfaceC8392);
        }
        this.f9743 = interfaceC8392;
        this.f9748 |= 1024;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC3052 m6561(C8397 c8397, Object obj) {
        if (this.f9738) {
            return clone().m6561(c8397, obj);
        }
        AbstractC7988.m13442(c8397);
        AbstractC7988.m13442(obj);
        this.f9733.f23273.put(c8397, obj);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC3052 m6562(Resources.Theme theme) {
        if (this.f9738) {
            return clone().m6562(theme);
        }
        this.f9739 = theme;
        int i = this.f9748;
        if (theme != null) {
            this.f9748 = i | 32768;
            return m6561(C8087.f22315, theme);
        }
        this.f9748 = (-32769) & i;
        return m6570(C8087.f22315);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC3052 m6563(C3036 c3036, AbstractC3024 abstractC3024) {
        if (this.f9738) {
            return clone().m6563(c3036, abstractC3024);
        }
        m6561(C3036.f9669, c3036);
        return m6552(abstractC3024, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC3052 m6564() {
        if (this.f9738) {
            return clone().m6564();
        }
        this.f9744 = false;
        this.f9748 |= 256;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC3052 m6565(int i) {
        if (this.f9738) {
            return clone().m6565(i);
        }
        this.f9740 = i;
        this.f9748 = (this.f9748 | 128) & (-65);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC3052 m6566(int i, int i2) {
        if (this.f9738) {
            return clone().m6566(i, i2);
        }
        this.f9742 = i;
        this.f9745 = i2;
        this.f9748 |= 512;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3052 m6567(C3036 c3036, AbstractC3024 abstractC3024, boolean z) {
        AbstractC3052 abstractC3052M6563 = z ? m6563(c3036, abstractC3024) : m6572(c3036, abstractC3024);
        abstractC3052M6563.f9737 = true;
        return abstractC3052M6563;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m6568() {
        if (this.f9730) {
            C5919.m11250("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC3052 m6569(Priority priority) {
        if (this.f9738) {
            return clone().m6569(priority);
        }
        AbstractC7988.m13441(priority, "Argument must not be null");
        this.f9747 = priority;
        this.f9748 |= 8;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC3052 m6570(C8397 c8397) {
        if (this.f9738) {
            return clone().m6570(c8397);
        }
        this.f9733.f23273.remove(c8397);
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m6571(AbstractC3052 abstractC3052) {
        abstractC3052.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f9741 == abstractC3052.f9741 && this.f9740 == abstractC3052.f9740 && this.f9744 == abstractC3052.f9744 && this.f9745 == abstractC3052.f9745 && this.f9742 == abstractC3052.f9742 && this.f9735 == abstractC3052.f9735 && this.f9734 == abstractC3052.f9734 && this.f9746.equals(abstractC3052.f9746) && this.f9747 == abstractC3052.f9747 && this.f9733.equals(abstractC3052.f9733) && this.f9732.equals(abstractC3052.f9732) && this.f9731.equals(abstractC3052.f9731) && AbstractC7988.m13444(this.f9743, abstractC3052.f9743) && AbstractC7988.m13444(this.f9739, abstractC3052.f9739);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final AbstractC3052 m6572(C3036 c3036, AbstractC3024 abstractC3024) {
        if (this.f9738) {
            return clone().m6572(c3036, abstractC3024);
        }
        m6561(C3036.f9669, c3036);
        return m6552(abstractC3024, false);
    }
}
