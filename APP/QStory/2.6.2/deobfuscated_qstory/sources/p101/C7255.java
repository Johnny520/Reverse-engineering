package p101;

import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6557;
import p079.AbstractC7008;
import p103.C7273;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7255 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f19342 = {new PropertyReference1Impl(C7255.class, "functions", "getFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(C7255.class, "properties", "getProperties()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4846 f19343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4846 f19344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4800 f19346;

    public C7255(C4844 c4844, C4800 c4800, boolean z) {
        c4844.getClass();
        this.f19346 = c4800;
        this.f19345 = z;
        ClassKind classKind = ClassKind.CLASS;
        this.f19344 = new C4846(c4844, new C7258(this, 0));
        this.f19343 = new C4846(c4844, new C7258(this, 1));
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC9124.m14672(this.f19344, f19342[0]);
        C7273 c7273 = new C7273();
        for (Object obj : list) {
            if (AbstractC4394.m8917(((AbstractC7008) ((InterfaceC4470) obj)).getName(), c4690)) {
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
        List list = (List) AbstractC9124.m14672(this.f19343, f19342[1]);
        C7273 c7273 = new C7273();
        for (Object obj : list) {
            if (AbstractC4394.m8917(((InterfaceC4472) obj).getName(), c4690)) {
                c7273.add(obj);
            }
        }
        return c7273;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        InterfaceC5087[] interfaceC5087Arr = f19342;
        return AbstractC4343.m8825((List) AbstractC9124.m14672(this.f19343, interfaceC5087Arr[1]), (List) AbstractC9124.m14672(this.f19344, interfaceC5087Arr[0]));
    }
}
