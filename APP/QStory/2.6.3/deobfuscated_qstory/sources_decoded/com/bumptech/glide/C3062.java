package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.C0257;
import androidx.collection.C0262;
import com.bumptech.glide.load.resource.bitmap.C3030;
import com.bumptech.glide.load.resource.bitmap.C3037;
import com.bumptech.glide.load.resource.bitmap.C3042;
import com.bumptech.glide.load.resource.bitmap.C3046;
import com.bumptech.glide.request.AbstractC3053;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.C3049;
import com.bumptech.glide.request.C3052;
import com.bumptech.glide.request.C3054;
import com.bumptech.glide.request.InterfaceC3050;
import com.bumptech.glide.request.InterfaceC3051;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p144.C7547;
import p222.AbstractC7989;
import p225.C8003;
import p225.InterfaceC7999;
import p232.C8065;
import p336.C8791;
import p342.C8818;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3062 extends AbstractC3053 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f9778 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C3062 f9779;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f9780;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f9781;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ArrayList f9782;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public C3062 f9783;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3069 f9784;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Class f9785;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Object f9786;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C3060 f9787;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ComponentCallbacks2C3064 f9788;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Context f9789;

    static {
    }

    public C3062(ComponentCallbacks2C3058 componentCallbacks2C3058, ComponentCallbacks2C3064 componentCallbacks2C3064, Class cls, Context context) {
        C3049 c3049;
        this.f9788 = componentCallbacks2C3064;
        this.f9785 = cls;
        this.f9789 = context;
        C0257 c0257 = componentCallbacks2C3064.f9802.f9773.f9816;
        C3060 c3060 = (C3060) c0257.get(cls);
        if (c3060 == null) {
            for (Map.Entry entry : (C0262) c0257.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c3060 = (C3060) entry.getValue();
                }
            }
        }
        this.f9787 = c3060 == null ? C3069.f9815 : c3060;
        this.f9784 = componentCallbacks2C3058.f9773;
        Iterator it = componentCallbacks2C3064.f9797.iterator();
        while (it.hasNext()) {
            m6785((C8818) it.next());
        }
        synchronized (componentCallbacks2C3064) {
            c3049 = componentCallbacks2C3064.f9793;
        }
        mo6619(c3049);
    }

    @Override // com.bumptech.glide.request.AbstractC3053
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3062)) {
            return false;
        }
        C3062 c3062 = (C3062) obj;
        return super.equals(c3062) && Objects.equals(this.f9785, c3062.f9785) && this.f9787.equals(c3062.f9787) && Objects.equals(this.f9786, c3062.f9786) && Objects.equals(this.f9782, c3062.f9782) && Objects.equals(this.f9783, c3062.f9783) && Objects.equals(this.f9779, c3062.f9779) && this.f9778 == c3062.f9778 && this.f9781 == c3062.f9781;
    }

    @Override // com.bumptech.glide.request.AbstractC3053
    public final int hashCode() {
        return AbstractC7989.m13479(this.f9781 ? 1 : 0, AbstractC7989.m13479(this.f9778 ? 1 : 0, AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(AbstractC7989.m13476(super.hashCode(), this.f9785), this.f9787), this.f9786), this.f9782), this.f9783), this.f9779), null)));
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
    public final InterfaceC3051 m6783(Object obj, InterfaceC7999 interfaceC7999, InterfaceC3050 interfaceC3050, C3060 c3060, Priority priority, int i, int i2, AbstractC3053 abstractC3053) {
        InterfaceC3050 interfaceC30502;
        InterfaceC3050 c3052;
        AbstractC3053 abstractC30532;
        InterfaceC3051 c3048;
        Priority priority2;
        if (this.f9779 != null) {
            c3052 = new C3052(obj, interfaceC3050);
            interfaceC30502 = c3052;
        } else {
            interfaceC30502 = null;
            c3052 = interfaceC3050;
        }
        C3062 c3062 = this.f9783;
        if (c3062 == null) {
            Context context = this.f9789;
            C3069 c3069 = this.f9784;
            abstractC30532 = abstractC3053;
            c3048 = new C3048(context, c3069, obj, this.f9786, this.f9785, abstractC30532, i, i2, priority, interfaceC7999, this.f9782, c3052, c3069.f9823, c3060.f9775);
        } else {
            if (this.f9780) {
                C5925.m11311("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            C3060 c30602 = c3062.f9778 ? c3060 : c3062.f9787;
            if (AbstractC3053.m6610(c3062.f9750, 8)) {
                priority2 = this.f9783.f9749;
            } else {
                int i3 = AbstractC3068.f9813[priority.ordinal()];
                if (i3 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i3 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        C7547.m12764(this.f9749, "unknown priority: ");
                        return null;
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            C3062 c30622 = this.f9783;
            int i4 = c30622.f9744;
            int i5 = c30622.f9747;
            if (AbstractC7989.m13477(i, i2)) {
                C3062 c30623 = this.f9783;
                if (!AbstractC7989.m13477(c30623.f9744, c30623.f9747)) {
                    i4 = abstractC3053.f9744;
                    i5 = abstractC3053.f9747;
                }
            }
            int i6 = i5;
            int i7 = i4;
            C3054 c3054 = new C3054(obj, c3052);
            Context context2 = this.f9789;
            C3069 c30692 = this.f9784;
            C3048 c30482 = new C3048(context2, c30692, obj, this.f9786, this.f9785, abstractC3053, i, i2, priority, interfaceC7999, this.f9782, c3054, c30692.f9823, c3060.f9775);
            this.f9780 = true;
            C3062 c30624 = this.f9783;
            InterfaceC3051 interfaceC3051M6783 = c30624.m6783(obj, interfaceC7999, c3054, c30602, priority3, i7, i6, c30624);
            this.f9780 = false;
            c3054.f9754 = c30482;
            c3054.f9753 = interfaceC3051M6783;
            abstractC30532 = abstractC3053;
            c3048 = c3054;
        }
        if (interfaceC30502 == null) {
            return c3048;
        }
        C3062 c30625 = this.f9779;
        int i8 = c30625.f9744;
        int i9 = c30625.f9747;
        if (AbstractC7989.m13477(i, i2)) {
            C3062 c30626 = this.f9779;
            if (!AbstractC7989.m13477(c30626.f9744, c30626.f9747)) {
                i8 = abstractC30532.f9744;
                i9 = abstractC30532.f9747;
            }
        }
        C3062 c30627 = this.f9779;
        C3052 c30522 = interfaceC30502;
        InterfaceC3051 interfaceC3051M67832 = c30627.m6783(obj, interfaceC7999, c30522, c30627.f9787, c30627.f9749, i8, i9, c30627);
        c30522.f9729 = c3048;
        c30522.f9728 = interfaceC3051M67832;
        return c30522;
    }

    @Override // com.bumptech.glide.request.AbstractC3053
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3062 mo6619(AbstractC3053 abstractC3053) {
        AbstractC7989.m13470(abstractC3053);
        return (C3062) super.mo6619(abstractC3053);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3062 m6785(C8818 c8818) {
        if (this.f9740) {
            return clone().m6785(c8818);
        }
        if (c8818 != null) {
            if (this.f9782 == null) {
                this.f9782 = new ArrayList();
            }
            this.f9782.add(c8818);
        }
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C3062 m6786(Object obj) {
        if (this.f9740) {
            return clone().m6786(obj);
        }
        this.f9786 = obj;
        this.f9781 = true;
        m6628();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C3062 m6787(C8818 c8818) {
        if (this.f9740) {
            return clone().m6787(c8818);
        }
        this.f9782 = null;
        return m6785(c8818);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m6788(InterfaceC7999 interfaceC7999, AbstractC3053 abstractC3053) {
        AbstractC7989.m13470(interfaceC7999);
        if (!this.f9781) {
            C5925.m11310("You must call #load() before calling #into()");
            return;
        }
        InterfaceC3051 interfaceC3051M6783 = m6783(new Object(), interfaceC7999, null, this.f9787, abstractC3053.f9749, abstractC3053.f9744, abstractC3053.f9747, abstractC3053);
        InterfaceC3051 interfaceC3051Mo6776 = interfaceC7999.mo6776();
        if (interfaceC3051M6783.mo6595(interfaceC3051Mo6776) && (abstractC3053.f9746 || !interfaceC3051Mo6776.mo6604())) {
            AbstractC7989.m13469(interfaceC3051Mo6776, "Argument must not be null");
            if (interfaceC3051Mo6776.isRunning()) {
                return;
            }
            interfaceC3051Mo6776.mo6599();
            return;
        }
        this.f9788.m6795(interfaceC7999);
        interfaceC7999.mo6772(interfaceC3051M6783);
        ComponentCallbacks2C3064 componentCallbacks2C3064 = this.f9788;
        synchronized (componentCallbacks2C3064) {
            componentCallbacks2C3064.f9798.f22248.add(interfaceC7999);
            C8065 c8065 = componentCallbacks2C3064.f9795;
            ((Set) c8065.f22246).add(interfaceC3051M6783);
            if (c8065.f22245) {
                interfaceC3051M6783.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c8065.f22244).add(interfaceC3051M6783);
            } else {
                interfaceC3051M6783.mo6599();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m6789(ImageView imageView) {
        AbstractC3053 abstractC3053M6632;
        InterfaceC7999 c8003;
        AbstractC7989.m13473();
        AbstractC7989.m13470(imageView);
        if (!AbstractC3053.m6610(this.f9750, 2048) && this.f9736 && imageView.getScaleType() != null) {
            switch (AbstractC3068.f9814[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC3053M6632 = clone().m6632(C3037.f9667, new C3042());
                    break;
                case 2:
                    abstractC3053M6632 = clone().m6627(C3037.f9668, new C3046(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC3053M6632 = clone().m6627(C3037.f9669, new C3030(), false);
                    break;
                case 6:
                    abstractC3053M6632 = clone().m6627(C3037.f9668, new C3046(), false);
                    break;
                default:
                    abstractC3053M6632 = this;
                    break;
            }
        } else {
            abstractC3053M6632 = this;
        }
        this.f9784.f9819.getClass();
        Class cls = this.f9785;
        if (Bitmap.class.equals(cls)) {
            c8003 = new C8003(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                C8791.m14472(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)");
                return;
            }
            c8003 = new C8003(imageView, 1);
        }
        m6788(c8003, abstractC3053M6632);
    }

    @Override // com.bumptech.glide.request.AbstractC3053
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3062 clone() {
        C3062 c3062 = (C3062) super.clone();
        c3062.f9787 = c3062.f9787.clone();
        if (c3062.f9782 != null) {
            c3062.f9782 = new ArrayList(c3062.f9782);
        }
        C3062 c30622 = c3062.f9783;
        if (c30622 != null) {
            c3062.f9783 = c30622.clone();
        }
        C3062 c30623 = c3062.f9779;
        if (c30623 != null) {
            c3062.f9779 = c30623.clone();
        }
        return c3062;
    }
}
