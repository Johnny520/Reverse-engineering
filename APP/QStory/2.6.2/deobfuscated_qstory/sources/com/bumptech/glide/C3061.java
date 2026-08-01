package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.C0257;
import androidx.collection.C0262;
import com.bumptech.glide.load.resource.bitmap.C3029;
import com.bumptech.glide.load.resource.bitmap.C3036;
import com.bumptech.glide.load.resource.bitmap.C3041;
import com.bumptech.glide.load.resource.bitmap.C3045;
import com.bumptech.glide.request.AbstractC3052;
import com.bumptech.glide.request.C3047;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.C3051;
import com.bumptech.glide.request.C3053;
import com.bumptech.glide.request.InterfaceC3049;
import com.bumptech.glide.request.InterfaceC3050;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p144.C7546;
import p222.AbstractC7988;
import p225.C8002;
import p225.InterfaceC7998;
import p232.C8064;
import p330.C8796;
import p343.C8832;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3061 extends AbstractC3052 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f9769 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C3061 f9770;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f9771;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f9772;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ArrayList f9773;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C3061 f9774;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3068 f9775;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Class f9776;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Object f9777;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C3059 f9778;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ComponentCallbacks2C3063 f9779;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Context f9780;

    static {
    }

    public C3061(ComponentCallbacks2C3057 componentCallbacks2C3057, ComponentCallbacks2C3063 componentCallbacks2C3063, Class cls, Context context) {
        C3048 c3048;
        this.f9779 = componentCallbacks2C3063;
        this.f9776 = cls;
        this.f9780 = context;
        C0257 c0257 = componentCallbacks2C3063.f9793.f9764.f9811;
        C3059 c3059 = (C3059) c0257.get(cls);
        if (c3059 == null) {
            for (Map.Entry entry : (C0262) c0257.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c3059 = (C3059) entry.getValue();
                }
            }
        }
        this.f9778 = c3059 == null ? C3068.f9810 : c3059;
        this.f9775 = componentCallbacks2C3057.f9764;
        Iterator it = componentCallbacks2C3063.f9788.iterator();
        while (it.hasNext()) {
            m6740((C8832) it.next());
        }
        synchronized (componentCallbacks2C3063) {
            c3048 = componentCallbacks2C3063.f9784;
        }
        mo6559(c3048);
    }

    @Override // com.bumptech.glide.request.AbstractC3052
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3061)) {
            return false;
        }
        C3061 c3061 = (C3061) obj;
        return super.equals(c3061) && Objects.equals(this.f9776, c3061.f9776) && this.f9778.equals(c3061.f9778) && Objects.equals(this.f9777, c3061.f9777) && Objects.equals(this.f9773, c3061.f9773) && Objects.equals(this.f9774, c3061.f9774) && Objects.equals(this.f9770, c3061.f9770) && this.f9769 == c3061.f9769 && this.f9772 == c3061.f9772;
    }

    @Override // com.bumptech.glide.request.AbstractC3052
    public final int hashCode() {
        return AbstractC7988.m13451(this.f9772 ? 1 : 0, AbstractC7988.m13451(this.f9769 ? 1 : 0, AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(AbstractC7988.m13448(super.hashCode(), this.f9776), this.f9778), this.f9777), this.f9773), this.f9774), this.f9770), null)));
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
    public final InterfaceC3050 m6738(Object obj, InterfaceC7998 interfaceC7998, InterfaceC3049 interfaceC3049, C3059 c3059, Priority priority, int i, int i2, AbstractC3052 abstractC3052) {
        InterfaceC3049 interfaceC30492;
        InterfaceC3049 c3051;
        AbstractC3052 abstractC30522;
        InterfaceC3050 c3047;
        Priority priority2;
        if (this.f9770 != null) {
            c3051 = new C3051(obj, interfaceC3049);
            interfaceC30492 = c3051;
        } else {
            interfaceC30492 = null;
            c3051 = interfaceC3049;
        }
        C3061 c3061 = this.f9774;
        if (c3061 == null) {
            Context context = this.f9780;
            C3068 c3068 = this.f9775;
            abstractC30522 = abstractC3052;
            c3047 = new C3047(context, c3068, obj, this.f9777, this.f9776, abstractC30522, i, i2, priority, interfaceC7998, this.f9773, c3051, c3068.f9818, c3059.f9766);
        } else {
            if (this.f9771) {
                C5919.m11250("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            C3059 c30592 = c3061.f9769 ? c3059 : c3061.f9778;
            if (AbstractC3052.m6550(c3061.f9748, 8)) {
                priority2 = this.f9774.f9747;
            } else {
                int i3 = AbstractC3067.f9808[priority.ordinal()];
                if (i3 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i3 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        C7546.m12735(this.f9747, "unknown priority: ");
                        return null;
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            C3061 c30612 = this.f9774;
            int i4 = c30612.f9742;
            int i5 = c30612.f9745;
            if (AbstractC7988.m13449(i, i2)) {
                C3061 c30613 = this.f9774;
                if (!AbstractC7988.m13449(c30613.f9742, c30613.f9745)) {
                    i4 = abstractC3052.f9742;
                    i5 = abstractC3052.f9745;
                }
            }
            int i6 = i5;
            int i7 = i4;
            C3053 c3053 = new C3053(obj, c3051);
            Context context2 = this.f9780;
            C3068 c30682 = this.f9775;
            C3047 c30472 = new C3047(context2, c30682, obj, this.f9777, this.f9776, abstractC3052, i, i2, priority, interfaceC7998, this.f9773, c3053, c30682.f9818, c3059.f9766);
            this.f9771 = true;
            C3061 c30614 = this.f9774;
            InterfaceC3050 interfaceC3050M6738 = c30614.m6738(obj, interfaceC7998, c3053, c30592, priority3, i7, i6, c30614);
            this.f9771 = false;
            c3053.f9752 = c30472;
            c3053.f9751 = interfaceC3050M6738;
            abstractC30522 = abstractC3052;
            c3047 = c3053;
        }
        if (interfaceC30492 == null) {
            return c3047;
        }
        C3061 c30615 = this.f9770;
        int i8 = c30615.f9742;
        int i9 = c30615.f9745;
        if (AbstractC7988.m13449(i, i2)) {
            C3061 c30616 = this.f9770;
            if (!AbstractC7988.m13449(c30616.f9742, c30616.f9745)) {
                i8 = abstractC30522.f9742;
                i9 = abstractC30522.f9745;
            }
        }
        C3061 c30617 = this.f9770;
        C3051 c30512 = interfaceC30492;
        InterfaceC3050 interfaceC3050M67382 = c30617.m6738(obj, interfaceC7998, c30512, c30617.f9778, c30617.f9747, i8, i9, c30617);
        c30512.f9727 = c3047;
        c30512.f9726 = interfaceC3050M67382;
        return c30512;
    }

    @Override // com.bumptech.glide.request.AbstractC3052
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3061 mo6559(AbstractC3052 abstractC3052) {
        AbstractC7988.m13442(abstractC3052);
        return (C3061) super.mo6559(abstractC3052);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3061 m6740(C8832 c8832) {
        if (this.f9738) {
            return clone().m6740(c8832);
        }
        if (c8832 != null) {
            if (this.f9773 == null) {
                this.f9773 = new ArrayList();
            }
            this.f9773.add(c8832);
        }
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3061 m6741(Object obj) {
        if (this.f9738) {
            return clone().m6741(obj);
        }
        this.f9777 = obj;
        this.f9772 = true;
        m6568();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3061 m6742(C8832 c8832) {
        if (this.f9738) {
            return clone().m6742(c8832);
        }
        this.f9773 = null;
        return m6740(c8832);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m6743(InterfaceC7998 interfaceC7998, AbstractC3052 abstractC3052) {
        AbstractC7988.m13442(interfaceC7998);
        if (!this.f9772) {
            C5919.m11249("You must call #load() before calling #into()");
            return;
        }
        InterfaceC3050 interfaceC3050M6738 = m6738(new Object(), interfaceC7998, null, this.f9778, abstractC3052.f9747, abstractC3052.f9742, abstractC3052.f9745, abstractC3052);
        InterfaceC3050 interfaceC3050Mo6731 = interfaceC7998.mo6731();
        if (interfaceC3050M6738.mo6535(interfaceC3050Mo6731) && (abstractC3052.f9744 || !interfaceC3050Mo6731.mo6544())) {
            AbstractC7988.m13441(interfaceC3050Mo6731, "Argument must not be null");
            if (interfaceC3050Mo6731.isRunning()) {
                return;
            }
            interfaceC3050Mo6731.mo6539();
            return;
        }
        this.f9779.m6750(interfaceC7998);
        interfaceC7998.mo6727(interfaceC3050M6738);
        ComponentCallbacks2C3063 componentCallbacks2C3063 = this.f9779;
        synchronized (componentCallbacks2C3063) {
            componentCallbacks2C3063.f9789.f22250.add(interfaceC7998);
            C8064 c8064 = componentCallbacks2C3063.f9786;
            ((Set) c8064.f22248).add(interfaceC3050M6738);
            if (c8064.f22247) {
                interfaceC3050M6738.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c8064.f22246).add(interfaceC3050M6738);
            } else {
                interfaceC3050M6738.mo6539();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m6744(ImageView imageView) {
        AbstractC3052 abstractC3052M6572;
        InterfaceC7998 c8002;
        AbstractC7988.m13445();
        AbstractC7988.m13442(imageView);
        if (!AbstractC3052.m6550(this.f9748, 2048) && this.f9734 && imageView.getScaleType() != null) {
            switch (AbstractC3067.f9809[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC3052M6572 = clone().m6572(C3036.f9665, new C3041());
                    break;
                case 2:
                    abstractC3052M6572 = clone().m6567(C3036.f9666, new C3045(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC3052M6572 = clone().m6567(C3036.f9667, new C3029(), false);
                    break;
                case 6:
                    abstractC3052M6572 = clone().m6567(C3036.f9666, new C3045(), false);
                    break;
                default:
                    abstractC3052M6572 = this;
                    break;
            }
        } else {
            abstractC3052M6572 = this;
        }
        this.f9775.f9814.getClass();
        Class cls = this.f9776;
        if (Bitmap.class.equals(cls)) {
            c8002 = new C8002(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                C8796.m14448(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)");
                return;
            }
            c8002 = new C8002(imageView, 1);
        }
        m6743(c8002, abstractC3052M6572);
    }

    @Override // com.bumptech.glide.request.AbstractC3052
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3061 clone() {
        C3061 c3061 = (C3061) super.clone();
        c3061.f9778 = c3061.f9778.clone();
        if (c3061.f9773 != null) {
            c3061.f9773 = new ArrayList(c3061.f9773);
        }
        C3061 c30612 = c3061.f9774;
        if (c30612 != null) {
            c3061.f9774 = c30612.clone();
        }
        C3061 c30613 = c3061.f9770;
        if (c30613 != null) {
            c3061.f9770 = c30613.clone();
        }
        return c3061;
    }
}
