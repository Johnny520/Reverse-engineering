package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.C3845;
import com.bumptech.glide.load.resource.bitmap.AbstractC3857;
import com.bumptech.glide.load.resource.bitmap.C3862;
import com.bumptech.glide.load.resource.bitmap.C3869;
import com.bumptech.glide.load.resource.bitmap.C3871;
import p237.C8806;
import p238.AbstractC8818;
import p238.C8812;
import p250.C8909;
import p250.C8911;
import p251.C8917;
import p302.C9226;
import p302.C9227;
import p302.InterfaceC9222;
import p302.InterfaceC9228;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3885 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10077;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f10082;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f10083;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f10085;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Resources.Theme f10086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3845 f10093 = C3845.f9925;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Priority f10094 = Priority.NORMAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f10091 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f10092 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10089 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC9222 f10090 = C8806.f22395;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f10081 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C9226 f10080 = new C9226();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C8812 f10079 = new C8812(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Class f10078 = Object.class;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f10084 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m7170(int i, int i2) {
        return (i & i2) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3885) {
            return m7191((AbstractC3885) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14038(0, AbstractC8818.m14038(0, AbstractC8818.m14038(this.f10081 ? 1 : 0, AbstractC8818.m14038(this.f10082 ? 1 : 0, AbstractC8818.m14038(this.f10089, AbstractC8818.m14038(this.f10092, AbstractC8818.m14038(this.f10091 ? 1 : 0, AbstractC8818.m14035(AbstractC8818.m14038(0, AbstractC8818.m14035(AbstractC8818.m14038(this.f10087, AbstractC8818.m14035(AbstractC8818.m14038(this.f10088, AbstractC8818.m14038(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f10093), this.f10094), this.f10080), this.f10079), this.f10078), this.f10090), this.f10086);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3885 m7171() {
        if (this.f10085) {
            return clone().m7171();
        }
        this.f10083 = true;
        this.f10095 |= 1048576;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3885 m7172(InterfaceC9228 interfaceC9228, boolean z) {
        if (this.f10085) {
            return clone().m7172(interfaceC9228, z);
        }
        C3871 c3871 = new C3871(interfaceC9228, z);
        m7173(Bitmap.class, interfaceC9228, z);
        m7173(Drawable.class, c3871, z);
        m7173(BitmapDrawable.class, c3871, z);
        m7173(C8911.class, new C8909(interfaceC9228), z);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3885 m7173(Class cls, InterfaceC9228 interfaceC9228, boolean z) {
        if (this.f10085) {
            return clone().m7173(cls, interfaceC9228, z);
        }
        AbstractC8818.m14029(interfaceC9228);
        this.f10079.put(cls, interfaceC9228);
        int i = this.f10095;
        this.f10081 = true;
        this.f10095 = 67584 | i;
        this.f10084 = false;
        if (z) {
            this.f10095 = i | 198656;
            this.f10082 = true;
        }
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC3885 m7174() {
        return m7187(C3869.f10014, new C3862(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3885 m7175(int i) {
        if (this.f10085) {
            return clone().m7175(i);
        }
        this.f10088 = i;
        this.f10095 = (this.f10095 | 32) & (-17);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3885 m7176(C3845 c3845) {
        if (this.f10085) {
            return clone().m7176(c3845);
        }
        this.f10093 = c3845;
        this.f10095 |= 4;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3885 m7177(Class cls) {
        if (this.f10085) {
            return clone().m7177(cls);
        }
        this.f10078 = cls;
        this.f10095 |= 4096;
        m7188();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC3885 clone() {
        try {
            AbstractC3885 abstractC3885 = (AbstractC3885) super.clone();
            C9226 c9226 = new C9226();
            abstractC3885.f10080 = c9226;
            c9226.f23617.mo1429(this.f10080.f23617);
            C8812 c8812 = new C8812(0);
            abstractC3885.f10079 = c8812;
            c8812.putAll(this.f10079);
            abstractC3885.f10077 = false;
            abstractC3885.f10085 = false;
            return abstractC3885;
        } catch (CloneNotSupportedException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3885 mo7179(AbstractC3885 abstractC3885) {
        if (this.f10085) {
            return clone().mo7179(abstractC3885);
        }
        int i = abstractC3885.f10095;
        if (m7170(abstractC3885.f10095, 1048576)) {
            this.f10083 = abstractC3885.f10083;
        }
        if (m7170(abstractC3885.f10095, 4)) {
            this.f10093 = abstractC3885.f10093;
        }
        if (m7170(abstractC3885.f10095, 8)) {
            this.f10094 = abstractC3885.f10094;
        }
        if (m7170(abstractC3885.f10095, 16)) {
            this.f10088 = 0;
            this.f10095 &= -33;
        }
        if (m7170(abstractC3885.f10095, 32)) {
            this.f10088 = abstractC3885.f10088;
            this.f10095 &= -17;
        }
        if (m7170(abstractC3885.f10095, 64)) {
            this.f10087 = 0;
            this.f10095 &= -129;
        }
        if (m7170(abstractC3885.f10095, 128)) {
            this.f10087 = abstractC3885.f10087;
            this.f10095 &= -65;
        }
        if (m7170(abstractC3885.f10095, 256)) {
            this.f10091 = abstractC3885.f10091;
        }
        if (m7170(abstractC3885.f10095, 512)) {
            this.f10089 = abstractC3885.f10089;
            this.f10092 = abstractC3885.f10092;
        }
        if (m7170(abstractC3885.f10095, 1024)) {
            this.f10090 = abstractC3885.f10090;
        }
        if (m7170(abstractC3885.f10095, 4096)) {
            this.f10078 = abstractC3885.f10078;
        }
        if (m7170(abstractC3885.f10095, 8192)) {
            this.f10095 &= -16385;
        }
        if (m7170(abstractC3885.f10095, 16384)) {
            this.f10095 &= -8193;
        }
        if (m7170(abstractC3885.f10095, 32768)) {
            this.f10086 = abstractC3885.f10086;
        }
        if (m7170(abstractC3885.f10095, 65536)) {
            this.f10081 = abstractC3885.f10081;
        }
        if (m7170(abstractC3885.f10095, 131072)) {
            this.f10082 = abstractC3885.f10082;
        }
        if (m7170(abstractC3885.f10095, 2048)) {
            this.f10079.putAll(abstractC3885.f10079);
            this.f10084 = abstractC3885.f10084;
        }
        if (!this.f10081) {
            this.f10079.clear();
            int i2 = this.f10095;
            this.f10082 = false;
            this.f10095 = i2 & (-133121);
            this.f10084 = true;
        }
        this.f10095 |= abstractC3885.f10095;
        this.f10080.f23617.mo1429(abstractC3885.f10080.f23617);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC3885 m7180(InterfaceC9222 interfaceC9222) {
        if (this.f10085) {
            return clone().m7180(interfaceC9222);
        }
        this.f10090 = interfaceC9222;
        this.f10095 |= 1024;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC3885 m7181(C9227 c9227, Object obj) {
        if (this.f10085) {
            return clone().m7181(c9227, obj);
        }
        AbstractC8818.m14029(c9227);
        AbstractC8818.m14029(obj);
        this.f10080.f23617.put(c9227, obj);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC3885 m7182(Resources.Theme theme) {
        if (this.f10085) {
            return clone().m7182(theme);
        }
        this.f10086 = theme;
        int i = this.f10095;
        if (theme != null) {
            this.f10095 = i | 32768;
            return m7181(C8917.f22658, theme);
        }
        this.f10095 = (-32769) & i;
        return m7190(C8917.f22658);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC3885 m7183(C3869 c3869, AbstractC3857 abstractC3857) {
        if (this.f10085) {
            return clone().m7183(c3869, abstractC3857);
        }
        m7181(C3869.f10016, c3869);
        return m7172(abstractC3857, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC3885 m7184() {
        if (this.f10085) {
            return clone().m7184();
        }
        this.f10091 = false;
        this.f10095 |= 256;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC3885 m7185(int i) {
        if (this.f10085) {
            return clone().m7185(i);
        }
        this.f10087 = i;
        this.f10095 = (this.f10095 | 128) & (-65);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC3885 m7186(int i, int i2) {
        if (this.f10085) {
            return clone().m7186(i, i2);
        }
        this.f10089 = i;
        this.f10092 = i2;
        this.f10095 |= 512;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC3885 m7187(C3869 c3869, AbstractC3857 abstractC3857, boolean z) {
        AbstractC3885 abstractC3885M7183 = z ? m7183(c3869, abstractC3857) : m7192(c3869, abstractC3857);
        abstractC3885M7183.f10084 = true;
        return abstractC3885M7183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7188() {
        if (this.f10077) {
            C6755.m11870("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC3885 m7189(Priority priority) {
        if (this.f10085) {
            return clone().m7189(priority);
        }
        AbstractC8818.m14028(priority, "Argument must not be null");
        this.f10094 = priority;
        this.f10095 |= 8;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC3885 m7190(C9227 c9227) {
        if (this.f10085) {
            return clone().m7190(c9227);
        }
        this.f10080.f23617.remove(c9227);
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m7191(AbstractC3885 abstractC3885) {
        abstractC3885.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f10088 == abstractC3885.f10088 && this.f10087 == abstractC3885.f10087 && this.f10091 == abstractC3885.f10091 && this.f10092 == abstractC3885.f10092 && this.f10089 == abstractC3885.f10089 && this.f10082 == abstractC3885.f10082 && this.f10081 == abstractC3885.f10081 && this.f10093.equals(abstractC3885.f10093) && this.f10094 == abstractC3885.f10094 && this.f10080.equals(abstractC3885.f10080) && this.f10079.equals(abstractC3885.f10079) && this.f10078.equals(abstractC3885.f10078) && AbstractC8818.m14031(this.f10090, abstractC3885.f10090) && AbstractC8818.m14031(this.f10086, abstractC3885.f10086);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final AbstractC3885 m7192(C3869 c3869, AbstractC3857 abstractC3857) {
        if (this.f10085) {
            return clone().m7192(c3869, abstractC3857);
        }
        m7181(C3869.f10016, c3869);
        return m7172(abstractC3857, false);
    }
}
