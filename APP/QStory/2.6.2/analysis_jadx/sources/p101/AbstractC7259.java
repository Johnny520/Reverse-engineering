package p101;

import androidx.compose.runtime.C1322;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6557;
import p079.AbstractC6999;
import p079.AbstractC7008;
import p103.C7273;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7259 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f19353 = {new PropertyReference1Impl(AbstractC7259.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4846 f19354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6999 f19355;

    public AbstractC7259(C4844 c4844, AbstractC6999 abstractC6999) {
        c4844.getClass();
        this.f19355 = abstractC6999;
        this.f19354 = new C4846(c4844, new C1322(this, 20));
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC9124.m14672(this.f19354, f19353[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C7273 c7273 = new C7273();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC4470) && AbstractC4394.m8917(((AbstractC7008) ((InterfaceC4470) obj)).getName(), c4690)) {
                c7273.add(obj);
            }
        }
        return c7273;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC9124.m14672(this.f19354, f19353[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C7273 c7273 = new C7273();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC4472) && AbstractC4394.m8917(((InterfaceC4472) obj).getName(), c4690)) {
                c7273.add(obj);
            }
        }
        return c7273;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        if (!c7247.m12447(C7247.f19319.f19331)) {
            return EmptyList.INSTANCE;
        }
        return (List) AbstractC9124.m14672(this.f19354, f19353[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract List mo8959();
}
