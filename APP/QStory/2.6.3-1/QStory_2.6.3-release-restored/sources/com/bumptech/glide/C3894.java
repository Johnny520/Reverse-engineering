package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.C1104;
import androidx.collection.C1109;
import com.bumptech.glide.load.resource.bitmap.C3862;
import com.bumptech.glide.load.resource.bitmap.C3869;
import com.bumptech.glide.load.resource.bitmap.C3874;
import com.bumptech.glide.load.resource.bitmap.C3878;
import com.bumptech.glide.request.AbstractC3885;
import com.bumptech.glide.request.C3880;
import com.bumptech.glide.request.C3881;
import com.bumptech.glide.request.C3884;
import com.bumptech.glide.request.C3886;
import com.bumptech.glide.request.InterfaceC3882;
import com.bumptech.glide.request.InterfaceC3883;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p160.C8376;
import p238.AbstractC8818;
import p241.C8832;
import p241.InterfaceC8828;
import p248.C8894;
import p352.C9620;
import p358.C9647;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3894 extends AbstractC3885 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f10123 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C3894 f10124;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f10125;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10126;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ArrayList f10127;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C3894 f10128;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3901 f10129;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Class f10130;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Object f10131;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C3892 f10132;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ComponentCallbacks2C3896 f10133;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Context f10134;

    static {
    }

    public C3894(ComponentCallbacks2C3890 componentCallbacks2C3890, ComponentCallbacks2C3896 componentCallbacks2C3896, Class cls, Context context) {
        C3881 c3881;
        this.f10133 = componentCallbacks2C3896;
        this.f10130 = cls;
        this.f10134 = context;
        C1104 c1104 = componentCallbacks2C3896.f10147.f10118.f10161;
        C3892 c3892 = (C3892) c1104.get(cls);
        if (c3892 == null) {
            for (Map.Entry entry : (C1109) c1104.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c3892 = (C3892) entry.getValue();
                }
            }
        }
        this.f10132 = c3892 == null ? C3901.f10160 : c3892;
        this.f10129 = componentCallbacks2C3890.f10118;
        Iterator it = componentCallbacks2C3896.f10142.iterator();
        while (it.hasNext()) {
            m7345((C9647) it.next());
        }
        synchronized (componentCallbacks2C3896) {
            c3881 = componentCallbacks2C3896.f10138;
        }
        mo7179(c3881);
    }

    @Override // com.bumptech.glide.request.AbstractC3885
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3894)) {
            return false;
        }
        C3894 c3894 = (C3894) obj;
        return super.equals(c3894) && Objects.equals(this.f10130, c3894.f10130) && this.f10132.equals(c3894.f10132) && Objects.equals(this.f10131, c3894.f10131) && Objects.equals(this.f10127, c3894.f10127) && Objects.equals(this.f10128, c3894.f10128) && Objects.equals(this.f10124, c3894.f10124) && this.f10123 == c3894.f10123 && this.f10126 == c3894.f10126;
    }

    @Override // com.bumptech.glide.request.AbstractC3885
    public final int hashCode() {
        return AbstractC8818.m14038(this.f10126 ? 1 : 0, AbstractC8818.m14038(this.f10123 ? 1 : 0, AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(AbstractC8818.m14035(super.hashCode(), this.f10130), this.f10132), this.f10131), this.f10127), this.f10128), this.f10124), null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC3883 m7343(Object obj, InterfaceC8828 interfaceC8828, InterfaceC3882 interfaceC3882, C3892 c3892, Priority priority, int i, int i2, AbstractC3885 abstractC3885) {
        InterfaceC3882 interfaceC38822;
        InterfaceC3882 c3884;
        AbstractC3885 abstractC38852;
        InterfaceC3883 c3880;
        Priority priority2;
        if (this.f10124 != null) {
            c3884 = new C3884(obj, interfaceC3882);
            interfaceC38822 = c3884;
        } else {
            interfaceC38822 = null;
            c3884 = interfaceC3882;
        }
        C3894 c3894 = this.f10128;
        if (c3894 == null) {
            Context context = this.f10134;
            C3901 c3901 = this.f10129;
            abstractC38852 = abstractC3885;
            c3880 = new C3880(context, c3901, obj, this.f10131, this.f10130, abstractC38852, i, i2, priority, interfaceC8828, this.f10127, c3884, c3901.f10168, c3892.f10120);
        } else {
            if (this.f10125) {
                C6755.m11870("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            C3892 c38922 = c3894.f10123 ? c3892 : c3894.f10132;
            if (AbstractC3885.m7170(c3894.f10095, 8)) {
                priority2 = this.f10128.f10094;
            } else {
                int i3 = AbstractC3900.f10158[priority.ordinal()];
                if (i3 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i3 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        C8376.m13323(this.f10094, "unknown priority: ");
                        return null;
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            C3894 c38942 = this.f10128;
            int i4 = c38942.f10089;
            int i5 = c38942.f10092;
            if (AbstractC8818.m14036(i, i2)) {
                C3894 c38943 = this.f10128;
                if (!AbstractC8818.m14036(c38943.f10089, c38943.f10092)) {
                    i4 = abstractC3885.f10089;
                    i5 = abstractC3885.f10092;
                }
            }
            int i6 = i5;
            int i7 = i4;
            C3886 c3886 = new C3886(obj, c3884);
            Context context2 = this.f10134;
            C3901 c39012 = this.f10129;
            C3880 c38802 = new C3880(context2, c39012, obj, this.f10131, this.f10130, abstractC3885, i, i2, priority, interfaceC8828, this.f10127, c3886, c39012.f10168, c3892.f10120);
            this.f10125 = true;
            C3894 c38944 = this.f10128;
            InterfaceC3883 interfaceC3883M7343 = c38944.m7343(obj, interfaceC8828, c3886, c38922, priority3, i7, i6, c38944);
            this.f10125 = false;
            c3886.f10099 = c38802;
            c3886.f10098 = interfaceC3883M7343;
            abstractC38852 = abstractC3885;
            c3880 = c3886;
        }
        if (interfaceC38822 == null) {
            return c3880;
        }
        C3894 c38945 = this.f10124;
        int i8 = c38945.f10089;
        int i9 = c38945.f10092;
        if (AbstractC8818.m14036(i, i2)) {
            C3894 c38946 = this.f10124;
            if (!AbstractC8818.m14036(c38946.f10089, c38946.f10092)) {
                i8 = abstractC38852.f10089;
                i9 = abstractC38852.f10092;
            }
        }
        C3894 c38947 = this.f10124;
        C3884 c38842 = interfaceC38822;
        InterfaceC3883 interfaceC3883M73432 = c38947.m7343(obj, interfaceC8828, c38842, c38947.f10132, c38947.f10094, i8, i9, c38947);
        c38842.f10074 = c3880;
        c38842.f10073 = interfaceC3883M73432;
        return c38842;
    }

    @Override // com.bumptech.glide.request.AbstractC3885
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3894 mo7179(AbstractC3885 abstractC3885) {
        AbstractC8818.m14029(abstractC3885);
        return (C3894) super.mo7179(abstractC3885);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3894 m7345(C9647 c9647) {
        if (this.f10085) {
            return clone().m7345(c9647);
        }
        if (c9647 != null) {
            if (this.f10127 == null) {
                this.f10127 = new ArrayList();
            }
            this.f10127.add(c9647);
        }
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3894 m7346(Object obj) {
        if (this.f10085) {
            return clone().m7346(obj);
        }
        this.f10131 = obj;
        this.f10126 = true;
        m7188();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3894 m7347(C9647 c9647) {
        if (this.f10085) {
            return clone().m7347(c9647);
        }
        this.f10127 = null;
        return m7345(c9647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m7348(InterfaceC8828 interfaceC8828, AbstractC3885 abstractC3885) {
        AbstractC8818.m14029(interfaceC8828);
        if (!this.f10126) {
            C6755.m11869("You must call #load() before calling #into()");
            return;
        }
        InterfaceC3883 interfaceC3883M7343 = m7343(new Object(), interfaceC8828, null, this.f10132, abstractC3885.f10094, abstractC3885.f10089, abstractC3885.f10092, abstractC3885);
        InterfaceC3883 interfaceC3883Mo7336 = interfaceC8828.mo7336();
        if (interfaceC3883M7343.mo7155(interfaceC3883Mo7336) && (abstractC3885.f10091 || !interfaceC3883Mo7336.mo7164())) {
            AbstractC8818.m14028(interfaceC3883Mo7336, "Argument must not be null");
            if (interfaceC3883Mo7336.isRunning()) {
                return;
            }
            interfaceC3883Mo7336.mo7159();
            return;
        }
        this.f10133.m7355(interfaceC8828);
        interfaceC8828.mo7332(interfaceC3883M7343);
        ComponentCallbacks2C3896 componentCallbacks2C3896 = this.f10133;
        synchronized (componentCallbacks2C3896) {
            componentCallbacks2C3896.f10143.f22593.add(interfaceC8828);
            C8894 c8894 = componentCallbacks2C3896.f10140;
            ((Set) c8894.f22591).add(interfaceC3883M7343);
            if (c8894.f22590) {
                interfaceC3883M7343.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c8894.f22589).add(interfaceC3883M7343);
            } else {
                interfaceC3883M7343.mo7159();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m7349(ImageView imageView) {
        AbstractC3885 abstractC3885M7192;
        InterfaceC8828 c8832;
        AbstractC8818.m14032();
        AbstractC8818.m14029(imageView);
        if (!AbstractC3885.m7170(this.f10095, 2048) && this.f10081 && imageView.getScaleType() != null) {
            switch (AbstractC3900.f10159[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC3885M7192 = clone().m7192(C3869.f10012, new C3874());
                    break;
                case 2:
                    abstractC3885M7192 = clone().m7187(C3869.f10013, new C3878(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC3885M7192 = clone().m7187(C3869.f10014, new C3862(), false);
                    break;
                case 6:
                    abstractC3885M7192 = clone().m7187(C3869.f10013, new C3878(), false);
                    break;
                default:
                    abstractC3885M7192 = this;
                    break;
            }
        } else {
            abstractC3885M7192 = this;
        }
        this.f10129.f10164.getClass();
        Class cls = this.f10130;
        if (Bitmap.class.equals(cls)) {
            c8832 = new C8832(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                C9620.m15031(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)");
                return;
            }
            c8832 = new C8832(imageView, 1);
        }
        m7348(c8832, abstractC3885M7192);
    }

    @Override // com.bumptech.glide.request.AbstractC3885
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3894 clone() {
        C3894 c3894 = (C3894) super.clone();
        c3894.f10132 = c3894.f10132.clone();
        if (c3894.f10127 != null) {
            c3894.f10127 = new ArrayList(c3894.f10127);
        }
        C3894 c38942 = c3894.f10128;
        if (c38942 != null) {
            c3894.f10128 = c38942.clone();
        }
        C3894 c38943 = c3894.f10124;
        if (c38943 != null) {
            c3894.f10124 = c38943.clone();
        }
        return c3894;
    }
}
