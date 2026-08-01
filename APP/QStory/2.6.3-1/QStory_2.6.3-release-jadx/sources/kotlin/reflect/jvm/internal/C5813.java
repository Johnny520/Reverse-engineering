package kotlin.reflect.jvm.internal;

import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3888;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5350;
import lin.xposed.hook.javaplugin.C6385;
import p068.InterfaceC7372;
import p069.AbstractC7390;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5813 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5814 f14720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14721;

    public /* synthetic */ C5813(AbstractC5814 abstractC5814, int i) {
        this.f14721 = i;
        this.f14720 = abstractC5814;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14721;
        AbstractC5814 abstractC5814 = this.f14720;
        switch (i) {
            case 0:
                AbstractC5814 abstractC58142 = this.f14720;
                C5368 c5368 = abstractC58142.f14723;
                return AbstractC7390.m12614(abstractC58142, c5368.f13567, c5368.f13558, EmptyList.INSTANCE, (C5902) abstractC58142.f14726.getValue(), true);
            case 1:
                AbstractC5814 abstractC58143 = this.f14720;
                if (!AbstractC5894.m10601(abstractC58143)) {
                    return abstractC58143.mo10520();
                }
                C5368 c53682 = abstractC58143.f14723;
                return AbstractC7390.m12614(abstractC58143, c53682.f13567, c53682.f13558, EmptyList.INSTANCE, (C5902) abstractC58143.f14726.getValue(), false);
            case 2:
                C5366 c5366 = abstractC5814.f14723.f13572;
                if (c5366 == null) {
                    AbstractC5227.m9467("returnType");
                    throw null;
                }
                ClassLoader classLoader = abstractC5814.f14729.mo9438().getClassLoader();
                classLoader.getClass();
                return AbstractC4765.m8849(c5366, classLoader, (C5902) abstractC5814.f14726.getValue(), AbstractC9019.m14257(abstractC5814) ? null : new C5813(abstractC5814, 5));
            case 3:
                AbstractC5835 abstractC5835 = abstractC5814.f14729;
                C5836 c5836 = abstractC5835 instanceof C5836 ? (C5836) abstractC5835 : null;
                C5902 c5902M10556 = c5836 != null ? ((C5877) c5836.f14770.getValue()).m10556() : null;
                C5902 c5902 = C5902.f14955;
                ArrayList arrayList = abstractC5814.f14723.f13559;
                ClassLoader classLoader2 = abstractC5835.mo9438().getClassLoader();
                classLoader2.getClass();
                return AbstractC3400.m5654(arrayList, c5902M10556, abstractC5814, classLoader2);
            case 4:
                if (AbstractC9019.m14257(abstractC5814)) {
                    return null;
                }
                C5368 c53683 = abstractC5814.f14723;
                c53683.getClass();
                C5350 c5350 = AbstractC3888.m7266(c53683).f19288;
                if (c5350 == null) {
                    return null;
                }
                AbstractC5835 abstractC58352 = abstractC5814.f14729;
                if (abstractC58352 instanceof C5824) {
                    try {
                        return ((C5824) abstractC58352).f14749.getDeclaredField(c5350.f13511);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                C6385.m11431(abstractC5814, "javaField is only supported for top-level properties for now: ");
                return null;
            default:
                return abstractC5814.mo10500().getReturnType();
        }
    }
}
