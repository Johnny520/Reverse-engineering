package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛲᲇᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0472 extends AbstractC0793 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final boolean f2368 = true;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public C0472 f2369;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public C1561 f2370;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final Context f2371;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public ArrayList f2372;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final C2572 f2373;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final Class f2374;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final ComponentCallbacks2C2272 f2375;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public C0472 f2376;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public boolean f2377;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f2378;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public Object f2379;

    static {
    }

    public C0472(ComponentCallbacks2C0040 componentCallbacks2C0040, ComponentCallbacks2C2272 componentCallbacks2C2272, Class cls, Context context) {
        C1261 c1261;
        this.f2375 = componentCallbacks2C2272;
        this.f2374 = cls;
        this.f2371 = context;
        C1505 c1505 = componentCallbacks2C2272.f11200.f381.f12663;
        C1561 c1561 = (C1561) c1505.get(cls);
        if (c1561 == null) {
            for (Map.Entry entry : (C0628) c1505.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c1561 = (C1561) entry.getValue();
                }
            }
        }
        this.f2370 = c1561 == null ? C2572.f12661 : c1561;
        this.f2373 = componentCallbacks2C0040.f381;
        Iterator it = componentCallbacks2C2272.f11197.iterator();
        while (it.hasNext()) {
            m1286((InterfaceC0609) it.next());
        }
        synchronized (componentCallbacks2C2272) {
            c1261 = componentCallbacks2C2272.f11198;
        }
        mo1282(c1261);
    }

    @Override // yyds.AbstractC0793
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0472)) {
            return false;
        }
        C0472 c0472 = (C0472) obj;
        return super.equals(c0472) && Objects.equals(this.f2374, c0472.f2374) && this.f2370.equals(c0472.f2370) && Objects.equals(this.f2379, c0472.f2379) && Objects.equals(this.f2372, c0472.f2372) && Objects.equals(this.f2369, c0472.f2369) && Objects.equals(this.f2376, c0472.f2376) && this.f2368 == c0472.f2368 && this.f2377 == c0472.f2377;
    }

    @Override // yyds.AbstractC0793
    public final int hashCode() {
        return AbstractC0181.m752(this.f2377 ? 1 : 0, AbstractC0181.m752(this.f2368 ? 1 : 0, AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(AbstractC0181.m750(super.hashCode(), this.f2374), this.f2370), this.f2379), this.f2372), this.f2369), this.f2376), null)));
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final C0472 m1279(Object obj) {
        if (this.f3638) {
            return clone().m1279(obj);
        }
        this.f2379 = obj;
        this.f2377 = true;
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final void m1280(InterfaceC2156 interfaceC2156, AbstractC0793 abstractC0793) {
        AbstractC0319.m990(interfaceC2156);
        if (!this.f2377) {
            C0188.m798("You must call #load() before calling #into()");
            return;
        }
        InterfaceC1823 interfaceC1823M1284 = m1284(new Object(), interfaceC2156, null, this.f2370, abstractC0793.f3635, abstractC0793.f3642, abstractC0793.f3634, abstractC0793);
        InterfaceC1823 interfaceC1823Mo1201 = interfaceC2156.mo1201();
        if (interfaceC1823M1284.mo449(interfaceC1823Mo1201) && (abstractC0793.f3632 || !interfaceC1823Mo1201.mo450())) {
            AbstractC0319.m992(interfaceC1823Mo1201, "Argument must not be null");
            if (interfaceC1823Mo1201.isRunning()) {
                return;
            }
            interfaceC1823Mo1201.mo454();
            return;
        }
        this.f2375.m4281(interfaceC2156);
        interfaceC2156.mo1198(interfaceC1823M1284);
        ComponentCallbacks2C2272 componentCallbacks2C2272 = this.f2375;
        synchronized (componentCallbacks2C2272) {
            componentCallbacks2C2272.f11193.f13048.add(interfaceC2156);
            C1424 c1424 = componentCallbacks2C2272.f11201;
            ((Set) c1424.f6732).add(interfaceC1823M1284);
            if (c1424.f6735) {
                interfaceC1823M1284.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c1424.f6734).add(interfaceC1823M1284);
            } else {
                interfaceC1823M1284.mo454();
            }
        }
    }

    @Override // yyds.AbstractC0793
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0472 clone() {
        C0472 c0472 = (C0472) super.clone();
        c0472.f2370 = c0472.f2370.clone();
        if (c0472.f2372 != null) {
            c0472.f2372 = new ArrayList(c0472.f2372);
        }
        C0472 c04722 = c0472.f2369;
        if (c04722 != null) {
            c0472.f2369 = c04722.clone();
        }
        C0472 c04723 = c0472.f2376;
        if (c04723 != null) {
            c0472.f2376 = c04723.clone();
        }
        return c0472;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final void m1283(ImageView imageView) {
        AbstractC0793 abstractC0793M1785;
        InterfaceC2156 c1144;
        AbstractC0181.m744();
        AbstractC0319.m990(imageView);
        if (!AbstractC0793.m1782(this.f3644, 2048) && imageView.getScaleType() != null) {
            switch (AbstractC2260.f11146[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC0793M1785 = clone().m1785(C1268.f5845, new C0670());
                    break;
                case 2:
                    abstractC0793M1785 = clone().m1785(C1268.f5843, new C1727());
                    abstractC0793M1785.f3637 = true;
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC0793M1785 = clone().m1785(C1268.f5841, new C0554());
                    abstractC0793M1785.f3637 = true;
                    break;
                case 6:
                    abstractC0793M1785 = clone().m1785(C1268.f5843, new C1727());
                    abstractC0793M1785.f3637 = true;
                    break;
                default:
                    abstractC0793M1785 = this;
                    break;
            }
        } else {
            abstractC0793M1785 = this;
        }
        C0135 c0135 = this.f2373.f12667;
        Class cls = this.f2374;
        if (Bitmap.class.equals(cls)) {
            c1144 = new C1144(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                C1693.m3444(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)");
                return;
            }
            c1144 = new C1144(imageView, 1);
        }
        m1280(c1144, abstractC0793M1785);
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
    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final InterfaceC1823 m1284(Object obj, InterfaceC2156 interfaceC2156, InterfaceC0131 interfaceC0131, C1561 c1561, EnumC0296 enumC0296, int i, int i2, AbstractC0793 abstractC0793) {
        InterfaceC0131 interfaceC01312;
        InterfaceC0131 c0784;
        InterfaceC0131 interfaceC01313;
        AbstractC0793 abstractC07932;
        InterfaceC1823 c0397;
        EnumC0296 enumC02962;
        if (this.f2376 != null) {
            c0784 = new C0784(obj, interfaceC0131);
            interfaceC01312 = c0784;
        } else {
            interfaceC01312 = null;
            c0784 = interfaceC0131;
        }
        C0472 c0472 = this.f2369;
        if (c0472 == null) {
            interfaceC01313 = interfaceC01312;
            Context context = this.f2371;
            C2572 c2572 = this.f2373;
            Object obj2 = this.f2379;
            Class cls = this.f2374;
            ArrayList arrayList = this.f2372;
            C2620 c2620 = c2572.f12668;
            c1561.getClass();
            abstractC07932 = abstractC0793;
            c0397 = new C0397(context, c2572, obj, obj2, cls, abstractC07932, i, i2, enumC0296, interfaceC2156, arrayList, c0784, c2620);
        } else {
            if (this.f2378) {
                C0188.m800("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            C1561 c15612 = c0472.f2368 ? c1561 : c0472.f2370;
            if (AbstractC0793.m1782(c0472.f3644, 8)) {
                enumC02962 = this.f2369.f3635;
            } else {
                int iOrdinal = enumC0296.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC02962 = EnumC0296.f1568;
                } else if (iOrdinal == 2) {
                    enumC02962 = EnumC0296.f1570;
                } else {
                    if (iOrdinal != 3) {
                        C1693.m3436(this.f3635, "unknown priority: ");
                        return null;
                    }
                    enumC02962 = EnumC0296.f1566;
                }
            }
            EnumC0296 enumC02963 = enumC02962;
            C0472 c04722 = this.f2369;
            int i3 = c04722.f3642;
            int i4 = c04722.f3634;
            if (AbstractC0181.m751(i, i2)) {
                C0472 c04723 = this.f2369;
                if (!AbstractC0181.m751(c04723.f3642, c04723.f3634)) {
                    i3 = abstractC0793.f3642;
                    i4 = abstractC0793.f3634;
                }
            }
            int i5 = i4;
            int i6 = i3;
            C0072 c0072 = new C0072(obj, c0784);
            Context context2 = this.f2371;
            C2572 c25722 = this.f2373;
            Object obj3 = this.f2379;
            Class cls2 = this.f2374;
            ArrayList arrayList2 = this.f2372;
            C2620 c26202 = c25722.f12668;
            c1561.getClass();
            C0072 c00722 = c0072;
            interfaceC01313 = interfaceC01312;
            C0397 c03972 = new C0397(context2, c25722, obj, obj3, cls2, abstractC0793, i, i2, enumC0296, interfaceC2156, arrayList2, c00722, c26202);
            this.f2378 = true;
            C0472 c04724 = this.f2369;
            InterfaceC1823 interfaceC1823M1284 = c04724.m1284(obj, interfaceC2156, c00722, c15612, enumC02963, i6, i5, c04724);
            this.f2378 = false;
            c00722.f633 = c03972;
            c00722.f635 = interfaceC1823M1284;
            abstractC07932 = abstractC0793;
            c0397 = c00722;
        }
        if (interfaceC01313 == null) {
            return c0397;
        }
        C0472 c04725 = this.f2376;
        int i7 = c04725.f3642;
        int i8 = c04725.f3634;
        if (AbstractC0181.m751(i, i2)) {
            C0472 c04726 = this.f2376;
            if (!AbstractC0181.m751(c04726.f3642, c04726.f3634)) {
                i7 = abstractC07932.f3642;
                i8 = abstractC07932.f3634;
            }
        }
        C0472 c04727 = this.f2376;
        C0784 c07842 = interfaceC01313;
        InterfaceC1823 interfaceC1823M12842 = c04727.m1284(obj, interfaceC2156, c07842, c04727.f2370, c04727.f3635, i7, i8, c04727);
        c07842.f3623 = c0397;
        c07842.f3625 = interfaceC1823M12842;
        return c07842;
    }

    @Override // yyds.AbstractC0793
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0472 mo1282(AbstractC0793 abstractC0793) {
        AbstractC0319.m990(abstractC0793);
        return (C0472) super.mo1282(abstractC0793);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final C0472 m1286(InterfaceC0609 interfaceC0609) {
        if (this.f3638) {
            return clone().m1286(interfaceC0609);
        }
        if (interfaceC0609 != null) {
            ArrayList arrayList = this.f2372;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2372 = arrayList;
            }
            arrayList.add(interfaceC0609);
        }
        m1784();
        return this;
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final C0472 m1287(InterfaceC0609 interfaceC0609) {
        if (this.f3638) {
            return clone().m1287(interfaceC0609);
        }
        this.f2372 = null;
        return m1286(interfaceC0609);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final C0472 m1289(C0472 c0472) {
        if (this.f3638) {
            return clone().m1289(c0472);
        }
        this.f2376 = c0472;
        m1784();
        return this;
    }
}
