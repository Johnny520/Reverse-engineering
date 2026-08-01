package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.C3013;
import com.bumptech.glide.load.resource.bitmap.AbstractC3025;
import com.bumptech.glide.load.resource.bitmap.C3030;
import com.bumptech.glide.load.resource.bitmap.C3037;
import com.bumptech.glide.load.resource.bitmap.C3039;
import p221.C7977;
import p222.AbstractC7989;
import p222.C7983;
import p234.C8080;
import p234.C8082;
import p235.C8088;
import p286.C8397;
import p286.C8398;
import p286.InterfaceC8393;
import p286.InterfaceC8399;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3053 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f9732;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f9737;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f9738;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f9740;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Resources.Theme f9741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3013 f9748 = C3013.f9580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Priority f9749 = Priority.NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f9746 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9747 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f9744 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC8393 f9745 = C7977.f22050;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f9736 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8397 f9735 = new C8397();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7983 f9734 = new C7983(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Class f9733 = Object.class;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f9739 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m6610(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3053) {
            return m6631((AbstractC3053) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13479(0, AbstractC7989.m13479(0, AbstractC7989.m13479(this.f9736 ? 1 : 0, AbstractC7989.m13479(this.f9737 ? 1 : 0, AbstractC7989.m13479(this.f9744, AbstractC7989.m13479(this.f9747, AbstractC7989.m13479(this.f9746 ? 1 : 0, AbstractC7989.m13476(AbstractC7989.m13479(0, AbstractC7989.m13476(AbstractC7989.m13479(this.f9742, AbstractC7989.m13476(AbstractC7989.m13479(this.f9743, AbstractC7989.m13479(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f9748), this.f9749), this.f9735), this.f9734), this.f9733), this.f9745), this.f9741);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3053 m6611() {
        if (this.f9740) {
            return clone().m6611();
        }
        this.f9738 = true;
        this.f9750 |= 1048576;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3053 m6612(InterfaceC8399 interfaceC8399, boolean z) {
        if (this.f9740) {
            return clone().m6612(interfaceC8399, z);
        }
        C3039 c3039 = new C3039(interfaceC8399, z);
        m6613(Bitmap.class, interfaceC8399, z);
        m6613(Drawable.class, c3039, z);
        m6613(BitmapDrawable.class, c3039, z);
        m6613(C8082.class, new C8080(interfaceC8399), z);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3053 m6613(Class cls, InterfaceC8399 interfaceC8399, boolean z) {
        if (this.f9740) {
            return clone().m6613(cls, interfaceC8399, z);
        }
        AbstractC7989.m13470(interfaceC8399);
        this.f9734.put(cls, interfaceC8399);
        int i = this.f9750;
        this.f9736 = true;
        this.f9750 = 67584 | i;
        this.f9739 = false;
        if (z) {
            this.f9750 = i | 198656;
            this.f9737 = true;
        }
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3053 m6614() {
        return m6627(C3037.f9669, new C3030(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3053 m6615(int i) {
        if (this.f9740) {
            return clone().m6615(i);
        }
        this.f9743 = i;
        this.f9750 = (this.f9750 | 32) & (-17);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3053 m6616(C3013 c3013) {
        if (this.f9740) {
            return clone().m6616(c3013);
        }
        this.f9748 = c3013;
        this.f9750 |= 4;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3053 m6617(Class cls) {
        if (this.f9740) {
            return clone().m6617(cls);
        }
        this.f9733 = cls;
        this.f9750 |= 4096;
        m6628();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC3053 clone() {
        try {
            AbstractC3053 abstractC3053 = (AbstractC3053) super.clone();
            C8397 c8397 = new C8397();
            abstractC3053.f9735 = c8397;
            c8397.f23272.mo869(this.f9735.f23272);
            C7983 c7983 = new C7983(0);
            abstractC3053.f9734 = c7983;
            c7983.putAll(this.f9734);
            abstractC3053.f9732 = false;
            abstractC3053.f9740 = false;
            return abstractC3053;
        } catch (CloneNotSupportedException e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3053 mo6619(AbstractC3053 abstractC3053) {
        if (this.f9740) {
            return clone().mo6619(abstractC3053);
        }
        int i = abstractC3053.f9750;
        if (m6610(abstractC3053.f9750, 1048576)) {
            this.f9738 = abstractC3053.f9738;
        }
        if (m6610(abstractC3053.f9750, 4)) {
            this.f9748 = abstractC3053.f9748;
        }
        if (m6610(abstractC3053.f9750, 8)) {
            this.f9749 = abstractC3053.f9749;
        }
        if (m6610(abstractC3053.f9750, 16)) {
            this.f9743 = 0;
            this.f9750 &= -33;
        }
        if (m6610(abstractC3053.f9750, 32)) {
            this.f9743 = abstractC3053.f9743;
            this.f9750 &= -17;
        }
        if (m6610(abstractC3053.f9750, 64)) {
            this.f9742 = 0;
            this.f9750 &= -129;
        }
        if (m6610(abstractC3053.f9750, 128)) {
            this.f9742 = abstractC3053.f9742;
            this.f9750 &= -65;
        }
        if (m6610(abstractC3053.f9750, 256)) {
            this.f9746 = abstractC3053.f9746;
        }
        if (m6610(abstractC3053.f9750, 512)) {
            this.f9744 = abstractC3053.f9744;
            this.f9747 = abstractC3053.f9747;
        }
        if (m6610(abstractC3053.f9750, 1024)) {
            this.f9745 = abstractC3053.f9745;
        }
        if (m6610(abstractC3053.f9750, 4096)) {
            this.f9733 = abstractC3053.f9733;
        }
        if (m6610(abstractC3053.f9750, 8192)) {
            this.f9750 &= -16385;
        }
        if (m6610(abstractC3053.f9750, 16384)) {
            this.f9750 &= -8193;
        }
        if (m6610(abstractC3053.f9750, 32768)) {
            this.f9741 = abstractC3053.f9741;
        }
        if (m6610(abstractC3053.f9750, 65536)) {
            this.f9736 = abstractC3053.f9736;
        }
        if (m6610(abstractC3053.f9750, 131072)) {
            this.f9737 = abstractC3053.f9737;
        }
        if (m6610(abstractC3053.f9750, 2048)) {
            this.f9734.putAll(abstractC3053.f9734);
            this.f9739 = abstractC3053.f9739;
        }
        if (!this.f9736) {
            this.f9734.clear();
            int i2 = this.f9750;
            this.f9737 = false;
            this.f9750 = i2 & (-133121);
            this.f9739 = true;
        }
        this.f9750 |= abstractC3053.f9750;
        this.f9735.f23272.mo869(abstractC3053.f9735.f23272);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC3053 m6620(InterfaceC8393 interfaceC8393) {
        if (this.f9740) {
            return clone().m6620(interfaceC8393);
        }
        this.f9745 = interfaceC8393;
        this.f9750 |= 1024;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC3053 m6621(C8398 c8398, Object obj) {
        if (this.f9740) {
            return clone().m6621(c8398, obj);
        }
        AbstractC7989.m13470(c8398);
        AbstractC7989.m13470(obj);
        this.f9735.f23272.put(c8398, obj);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC3053 m6622(Resources.Theme theme) {
        if (this.f9740) {
            return clone().m6622(theme);
        }
        this.f9741 = theme;
        int i = this.f9750;
        if (theme != null) {
            this.f9750 = i | 32768;
            return m6621(C8088.f22313, theme);
        }
        this.f9750 = (-32769) & i;
        return m6630(C8088.f22313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC3053 m6623(C3037 c3037, AbstractC3025 abstractC3025) {
        if (this.f9740) {
            return clone().m6623(c3037, abstractC3025);
        }
        m6621(C3037.f9671, c3037);
        return m6612(abstractC3025, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC3053 m6624() {
        if (this.f9740) {
            return clone().m6624();
        }
        this.f9746 = false;
        this.f9750 |= 256;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC3053 m6625(int i) {
        if (this.f9740) {
            return clone().m6625(i);
        }
        this.f9742 = i;
        this.f9750 = (this.f9750 | 128) & (-65);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC3053 m6626(int i, int i2) {
        if (this.f9740) {
            return clone().m6626(i, i2);
        }
        this.f9744 = i;
        this.f9747 = i2;
        this.f9750 |= 512;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3053 m6627(C3037 c3037, AbstractC3025 abstractC3025, boolean z) {
        AbstractC3053 abstractC3053M6623 = z ? m6623(c3037, abstractC3025) : m6632(c3037, abstractC3025);
        abstractC3053M6623.f9739 = true;
        return abstractC3053M6623;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m6628() {
        if (this.f9732) {
            C5925.m11311("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC3053 m6629(Priority priority) {
        if (this.f9740) {
            return clone().m6629(priority);
        }
        AbstractC7989.m13469(priority, "Argument must not be null");
        this.f9749 = priority;
        this.f9750 |= 8;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC3053 m6630(C8398 c8398) {
        if (this.f9740) {
            return clone().m6630(c8398);
        }
        this.f9735.f23272.remove(c8398);
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m6631(AbstractC3053 abstractC3053) {
        abstractC3053.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f9743 == abstractC3053.f9743 && this.f9742 == abstractC3053.f9742 && this.f9746 == abstractC3053.f9746 && this.f9747 == abstractC3053.f9747 && this.f9744 == abstractC3053.f9744 && this.f9737 == abstractC3053.f9737 && this.f9736 == abstractC3053.f9736 && this.f9748.equals(abstractC3053.f9748) && this.f9749 == abstractC3053.f9749 && this.f9735.equals(abstractC3053.f9735) && this.f9734.equals(abstractC3053.f9734) && this.f9733.equals(abstractC3053.f9733) && AbstractC7989.m13472(this.f9745, abstractC3053.f9745) && AbstractC7989.m13472(this.f9741, abstractC3053.f9741);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final AbstractC3053 m6632(C3037 c3037, AbstractC3025 abstractC3025) {
        if (this.f9740) {
            return clone().m6632(c3037, abstractC3025);
        }
        m6621(C3037.f9671, c3037);
        return m6612(abstractC3025, false);
    }
}
