package kotlin.reflect.jvm.internal.types;

import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC4405;
import kotlin.reflect.jvm.internal.AbstractC5071;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p049.AbstractC6526;
import p052.InterfaceC6557;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4927 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4686 f14271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5092 f14272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14273 = 1;

    public C4927(InterfaceC5092 interfaceC5092, C4686 c4686) {
        this.f14272 = interfaceC5092;
        this.f14271 = c4686;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        InterfaceC5092 interfaceC5092Mo9924;
        switch (this.f14273) {
            case 0:
                InterfaceC5092 interfaceC5092 = this.f14272;
                C4686 c4686 = this.f14271;
                C4928 c4928 = (C4928) obj;
                c4928.getClass();
                List typeParameters = interfaceC5092.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C4988 c4988 = new C4988(c4928, ((AbstractC4393) it.next()).mo8911(), (AbstractC4394.m8917(c4686, AbstractC6526.f17878) || AbstractC4394.m8917(c4686, AbstractC6526.f17879)) ? KVariance.OUT : KVariance.INVARIANT);
                    c4988.f14394 = AbstractC8189.m13660(AbstractC5071.f14618);
                    arrayList.add(c4988);
                }
                return arrayList;
            default:
                C4686 c46862 = this.f14271;
                InterfaceC5092 interfaceC50922 = this.f14272;
                C4928 c49282 = (C4928) obj;
                c49282.getClass();
                if (AbstractC4394.m8917(c46862, AbstractC6526.f17869)) {
                    InterfaceC5086 interfaceC5086M8921 = AbstractC4395.m8921(Iterable.class, C5084.f14636);
                    C4396 c4396 = AbstractC4395.f12971;
                    interfaceC5092Mo9924 = ((AbstractC4925) c4396.mo8925(interfaceC5086M8921)).mo9924();
                    if (interfaceC5092Mo9924 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4555(c4396, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4394.m8917(c46862, AbstractC6526.f17868)) {
                    InterfaceC5086 interfaceC5086M89212 = AbstractC4395.m8921(Collection.class, C5084.f14636);
                    C4396 c43962 = AbstractC4395.f12971;
                    interfaceC5092Mo9924 = ((AbstractC4925) c43962.mo8925(interfaceC5086M89212)).mo9924();
                    if (interfaceC5092Mo9924 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4555(c43962, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4394.m8917(c46862, AbstractC6526.f17870)) {
                    InterfaceC5086 interfaceC5086M89213 = AbstractC4395.m8921(Collection.class, C5084.f14636);
                    C4396 c43963 = AbstractC4395.f12971;
                    interfaceC5092Mo9924 = ((AbstractC4925) c43963.mo8925(interfaceC5086M89213)).mo9924();
                    if (interfaceC5092Mo9924 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4555(c43963, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC4394.m8917(c46862, AbstractC6526.f17871)) {
                    InterfaceC5086 interfaceC5086M89214 = AbstractC4395.m8921(Iterator.class, C5084.f14636);
                    C4396 c43964 = AbstractC4395.f12971;
                    interfaceC5092Mo9924 = ((AbstractC4925) c43964.mo8925(interfaceC5086M89214)).mo9924();
                    if (interfaceC5092Mo9924 == null) {
                        throw new KotlinReflectionInternalError(AbstractC2442.m4555(c43964, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC5092Mo9924 = null;
                }
                List<AbstractC4393> list = c49282.f14276;
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
                for (AbstractC4393 abstractC4393 : list) {
                    C5084 c5084 = C5084.f14636;
                    arrayList2.add(AbstractC5089.m10096(AbstractC4405.m8940(abstractC4393, null, 7)));
                }
                ArrayList arrayListM8864 = AbstractC4346.m8864(new InterfaceC5092[]{interfaceC50922, interfaceC5092Mo9924});
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayListM8864, 10));
                Iterator it2 = arrayListM8864.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC4405.m8940((InterfaceC5092) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public C4927(C4686 c4686, InterfaceC5092 interfaceC5092) {
        this.f14271 = c4686;
        this.f14272 = interfaceC5092;
    }
}
