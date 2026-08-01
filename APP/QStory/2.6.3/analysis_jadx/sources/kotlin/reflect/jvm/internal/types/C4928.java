package kotlin.reflect.jvm.internal.types;

import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4406;
import kotlin.reflect.jvm.internal.AbstractC5072;
import kotlin.reflect.jvm.internal.C4989;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p034.AbstractC6347;
import p049.AbstractC6527;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4928 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4687 f14273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5093 f14274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14275 = 1;

    public C4928(InterfaceC5093 interfaceC5093, C4687 c4687) {
        this.f14274 = interfaceC5093;
        this.f14273 = c4687;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        InterfaceC5093 interfaceC5093Mo9921;
        switch (this.f14275) {
            case 0:
                InterfaceC5093 interfaceC5093 = this.f14274;
                C4687 c4687 = this.f14273;
                C4929 c4929 = (C4929) obj;
                c4929.getClass();
                List typeParameters = interfaceC5093.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C4989 c4989 = new C4989(c4929, ((AbstractC4394) it.next()).mo8901(), (AbstractC4395.m8907(c4687, AbstractC6527.f17874) || AbstractC4395.m8907(c4687, AbstractC6527.f17875)) ? KVariance.OUT : KVariance.INVARIANT);
                    c4989.f14396 = AbstractC6347.m11928(AbstractC5072.f14618);
                    arrayList.add(c4989);
                }
                return arrayList;
            default:
                C4687 c46872 = this.f14273;
                InterfaceC5093 interfaceC50932 = this.f14274;
                C4929 c49292 = (C4929) obj;
                c49292.getClass();
                if (AbstractC4395.m8907(c46872, AbstractC6527.f17865)) {
                    InterfaceC5087 interfaceC5087M8911 = AbstractC4396.m8911(Iterable.class, C5085.f14636);
                    C4397 c4397 = AbstractC4396.f12975;
                    interfaceC5093Mo9921 = ((AbstractC4926) c4397.mo8915(interfaceC5087M8911)).mo9921();
                    if (interfaceC5093Mo9921 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4575(c4397, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4395.m8907(c46872, AbstractC6527.f17864)) {
                    InterfaceC5087 interfaceC5087M89112 = AbstractC4396.m8911(Collection.class, C5085.f14636);
                    C4397 c43972 = AbstractC4396.f12975;
                    interfaceC5093Mo9921 = ((AbstractC4926) c43972.mo8915(interfaceC5087M89112)).mo9921();
                    if (interfaceC5093Mo9921 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4575(c43972, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4395.m8907(c46872, AbstractC6527.f17866)) {
                    InterfaceC5087 interfaceC5087M89113 = AbstractC4396.m8911(Collection.class, C5085.f14636);
                    C4397 c43973 = AbstractC4396.f12975;
                    interfaceC5093Mo9921 = ((AbstractC4926) c43973.mo8915(interfaceC5087M89113)).mo9921();
                    if (interfaceC5093Mo9921 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4575(c43973, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4395.m8907(c46872, AbstractC6527.f17867)) {
                    InterfaceC5087 interfaceC5087M89114 = AbstractC4396.m8911(Iterator.class, C5085.f14636);
                    C4397 c43974 = AbstractC4396.f12975;
                    interfaceC5093Mo9921 = ((AbstractC4926) c43974.mo8915(interfaceC5087M89114)).mo9921();
                    if (interfaceC5093Mo9921 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4575(c43974, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC5093Mo9921 = null;
                }
                List<AbstractC4394> list = c49292.f14278;
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
                for (AbstractC4394 abstractC4394 : list) {
                    C5085 c5085 = C5085.f14636;
                    arrayList2.add(AbstractC5090.m10100(AbstractC4406.m8930(abstractC4394, null, 7)));
                }
                ArrayList arrayListM8826 = AbstractC4347.m8826(new InterfaceC5093[]{interfaceC50932, interfaceC5093Mo9921});
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayListM8826, 10));
                Iterator it2 = arrayListM8826.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC4406.m8930((InterfaceC5093) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public C4928(C4687 c4687, InterfaceC5093 interfaceC5093) {
        this.f14273 = c4687;
        this.f14274 = interfaceC5093;
    }
}
