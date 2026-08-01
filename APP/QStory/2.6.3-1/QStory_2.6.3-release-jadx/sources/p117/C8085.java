package p117;

import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p095.AbstractC7838;
import p119.C8103;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8085 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f19682 = {new PropertyReference1Impl(C8085.class, "functions", "getFunctions()Ljava/util/List;", 0), new PropertyReference1Impl(C8085.class, "properties", "getProperties()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5679 f19683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5679 f19684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5633 f19686;

    public C8085(C5677 c5677, C5633 c5633, boolean z) {
        c5677.getClass();
        this.f19686 = c5633;
        this.f19685 = z;
        ClassKind classKind = ClassKind.CLASS;
        this.f19684 = new C5679(c5677, new C8088(this, 0));
        this.f19683 = new C5679(c5677, new C8088(this, 1));
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC7082.m12308(this.f19684, f19682[0]);
        C8103 c8103 = new C8103();
        for (Object obj : list) {
            if (AbstractC5227.m9466(((AbstractC7838) ((InterfaceC5303) obj)).getName(), c5523)) {
                c8103.add(obj);
            }
        }
        return c8103;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC7082.m12308(this.f19683, f19682[1]);
        C8103 c8103 = new C8103();
        for (Object obj : list) {
            if (AbstractC5227.m9466(((InterfaceC5305) obj).getName(), c5523)) {
                c8103.add(obj);
            }
        }
        return c8103;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        InterfaceC5920[] interfaceC5920Arr = f19682;
        return AbstractC5176.m9352((List) AbstractC7082.m12308(this.f19683, interfaceC5920Arr[1]), (List) AbstractC7082.m12308(this.f19684, interfaceC5920Arr[0]));
    }
}
