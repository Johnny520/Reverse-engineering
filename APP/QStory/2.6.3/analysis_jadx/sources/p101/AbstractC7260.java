package p101;

import androidx.compose.runtime.C1322;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p079.AbstractC7000;
import p079.AbstractC7009;
import p103.C7274;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7260 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f19348 = {new PropertyReference1Impl(AbstractC7260.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4847 f19349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7000 f19350;

    public AbstractC7260(C4845 c4845, AbstractC7000 abstractC7000) {
        c4845.getClass();
        this.f19350 = abstractC7000;
        this.f19349 = new C4847(c4845, new C1322(this, 20));
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC6253.m11749(this.f19349, f19348[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C7274 c7274 = new C7274();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC4471) && AbstractC4395.m8907(((AbstractC7009) ((InterfaceC4471) obj)).getName(), c4691)) {
                c7274.add(obj);
            }
        }
        return c7274;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC6253.m11749(this.f19349, f19348[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C7274 c7274 = new C7274();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC4473) && AbstractC4395.m8907(((InterfaceC4473) obj).getName(), c4691)) {
                c7274.add(obj);
            }
        }
        return c7274;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        if (!c7248.m12474(C7248.f19314.f19326)) {
            return EmptyList.INSTANCE;
        }
        return (List) AbstractC6253.m11749(this.f19349, f19348[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract List mo8949();
}
