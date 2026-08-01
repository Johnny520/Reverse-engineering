package kotlin.reflect.jvm.internal.types;

import androidx.profileinstaller.AbstractC3275;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.AbstractC5904;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p050.AbstractC7176;
import p065.AbstractC7356;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5760 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5519 f14618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5925 f14619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14620 = 1;

    public C5760(InterfaceC5925 interfaceC5925, C5519 c5519) {
        this.f14619 = interfaceC5925;
        this.f14618 = c5519;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        InterfaceC5925 interfaceC5925Mo10480;
        switch (this.f14620) {
            case 0:
                InterfaceC5925 interfaceC5925 = this.f14619;
                C5519 c5519 = this.f14618;
                C5761 c5761 = (C5761) obj;
                c5761.getClass();
                List typeParameters = interfaceC5925.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C5821 c5821 = new C5821(c5761, ((AbstractC5226) it.next()).mo9460(), (AbstractC5227.m9466(c5519, AbstractC7356.f18219) || AbstractC5227.m9466(c5519, AbstractC7356.f18220)) ? KVariance.OUT : KVariance.INVARIANT);
                    c5821.f14741 = AbstractC7176.m12487(AbstractC5904.f14963);
                    arrayList.add(c5821);
                }
                return arrayList;
            default:
                C5519 c55192 = this.f14618;
                InterfaceC5925 interfaceC59252 = this.f14619;
                C5761 c57612 = (C5761) obj;
                c57612.getClass();
                if (AbstractC5227.m9466(c55192, AbstractC7356.f18210)) {
                    InterfaceC5919 interfaceC5919M9470 = AbstractC5228.m9470(Iterable.class, C5917.f14981);
                    C5229 c5229 = AbstractC5228.f13320;
                    interfaceC5925Mo10480 = ((AbstractC5758) c5229.mo9474(interfaceC5919M9470)).mo10480();
                    if (interfaceC5925Mo10480 == null) {
                        throw new KotlinReflectionInternalError(AbstractC3275.m5135(c5229, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC5227.m9466(c55192, AbstractC7356.f18209)) {
                    InterfaceC5919 interfaceC5919M94702 = AbstractC5228.m9470(Collection.class, C5917.f14981);
                    C5229 c52292 = AbstractC5228.f13320;
                    interfaceC5925Mo10480 = ((AbstractC5758) c52292.mo9474(interfaceC5919M94702)).mo10480();
                    if (interfaceC5925Mo10480 == null) {
                        throw new KotlinReflectionInternalError(AbstractC3275.m5135(c52292, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC5227.m9466(c55192, AbstractC7356.f18211)) {
                    InterfaceC5919 interfaceC5919M94703 = AbstractC5228.m9470(Collection.class, C5917.f14981);
                    C5229 c52293 = AbstractC5228.f13320;
                    interfaceC5925Mo10480 = ((AbstractC5758) c52293.mo9474(interfaceC5919M94703)).mo10480();
                    if (interfaceC5925Mo10480 == null) {
                        throw new KotlinReflectionInternalError(AbstractC3275.m5135(c52293, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC5227.m9466(c55192, AbstractC7356.f18212)) {
                    InterfaceC5919 interfaceC5919M94704 = AbstractC5228.m9470(Iterator.class, C5917.f14981);
                    C5229 c52294 = AbstractC5228.f13320;
                    interfaceC5925Mo10480 = ((AbstractC5758) c52294.mo9474(interfaceC5919M94704)).mo10480();
                    if (interfaceC5925Mo10480 == null) {
                        throw new KotlinReflectionInternalError(AbstractC3275.m5135(c52294, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC5925Mo10480 = null;
                }
                List<AbstractC5226> list = c57612.f14623;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
                for (AbstractC5226 abstractC5226 : list) {
                    C5917 c5917 = C5917.f14981;
                    arrayList2.add(AbstractC5922.m10659(AbstractC5238.m9489(abstractC5226, null, 7)));
                }
                ArrayList arrayListM9385 = AbstractC5179.m9385(new InterfaceC5925[]{interfaceC59252, interfaceC5925Mo10480});
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayListM9385, 10));
                Iterator it2 = arrayListM9385.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC5238.m9489((InterfaceC5925) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public C5760(C5519 c5519, InterfaceC5925 interfaceC5925) {
        this.f14618 = c5519;
        this.f14619 = interfaceC5925;
    }
}
