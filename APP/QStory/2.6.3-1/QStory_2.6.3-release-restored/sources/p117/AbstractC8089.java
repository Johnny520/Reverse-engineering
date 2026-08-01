package p117;

import androidx.compose.runtime.C2157;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p095.AbstractC7829;
import p095.AbstractC7838;
import p119.C8103;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8089 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f19693 = {new PropertyReference1Impl(AbstractC8089.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5679 f19694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7829 f19695;

    public AbstractC8089(C5677 c5677, AbstractC7829 abstractC7829) {
        c5677.getClass();
        this.f19695 = abstractC7829;
        this.f19694 = new C5679(c5677, new C2157(this, 20));
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        List list = (List) AbstractC7082.m12308(this.f19694, f19693[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C8103 c8103 = new C8103();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC5303) && AbstractC5227.m9466(((AbstractC7838) ((InterfaceC5303) obj)).getName(), c5523)) {
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
        List list = (List) AbstractC7082.m12308(this.f19694, f19693[0]);
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        C8103 c8103 = new C8103();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC5305) && AbstractC5227.m9466(((InterfaceC5305) obj).getName(), c5523)) {
                c8103.add(obj);
            }
        }
        return c8103;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        if (!c8077.m13033(C8077.f19659.f19671)) {
            return EmptyList.INSTANCE;
        }
        return (List) AbstractC7082.m12308(this.f19694, f19693[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract List mo9508();
}
