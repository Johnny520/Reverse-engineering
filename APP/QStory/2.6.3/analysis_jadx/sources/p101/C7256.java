package p101;

import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p079.AbstractC7009;
import p103.C7274;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7256 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f19337 = {new PropertyReference1Impl(C7256.class, "functions", "getFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(C7256.class, "properties", "getProperties()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4847 f19338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 f19339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4801 f19341;

    public C7256(C4845 c4845, C4801 c4801, boolean z) {
        c4845.getClass();
        this.f19341 = c4801;
        this.f19340 = z;
        ClassKind classKind = ClassKind.CLASS;
        this.f19339 = new C4847(c4845, new C7259(this, 0));
        this.f19338 = new C4847(c4845, new C7259(this, 1));
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC6253.m11749(this.f19339, f19337[0]);
        C7274 c7274 = new C7274();
        for (Object obj : list) {
            if (AbstractC4395.m8907(((AbstractC7009) ((InterfaceC4471) obj)).getName(), c4691)) {
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
        List list = (List) AbstractC6253.m11749(this.f19338, f19337[1]);
        C7274 c7274 = new C7274();
        for (Object obj : list) {
            if (AbstractC4395.m8907(((InterfaceC4473) obj).getName(), c4691)) {
                c7274.add(obj);
            }
        }
        return c7274;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        InterfaceC5088[] interfaceC5088Arr = f19337;
        return AbstractC4344.m8793((List) AbstractC6253.m11749(this.f19338, interfaceC5088Arr[1]), (List) AbstractC6253.m11749(this.f19339, interfaceC5088Arr[0]));
    }
}
