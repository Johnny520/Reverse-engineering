package p117;

import androidx.compose.runtime.C2157;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p082.AbstractC7705;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8094 implements InterfaceC8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f19705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f19706 = 0;

    public C8094(C5677 c5677, InterfaceC7372 interfaceC7372) {
        c5677.getClass();
        this.f19705 = new C5679(c5677, new C2157(interfaceC7372, 21));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        switch (this.f19706) {
            case 1:
                c5523.getClass();
                noLookupLocation.getClass();
                return AbstractC7705.m12686(m13041(c5523, noLookupLocation), C8091.f19701);
            default:
                return m13041(c5523, noLookupLocation);
        }
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        return m13039().mo9725();
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        switch (this.f19706) {
            case 1:
                c5523.getClass();
                noLookupLocation.getClass();
                return AbstractC7705.m12686(m13038(c5523, noLookupLocation), C8091.f19699);
            default:
                return m13038(c5523, noLookupLocation);
        }
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m13039().mo9714(c5523, noLookupLocation);
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        return m13039().mo9727();
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        switch (this.f19706) {
            case 1:
                c8077.getClass();
                Collection collectionM13040 = m13040(c8077, interfaceC7387);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionM13040) {
                    if (((InterfaceC5331) obj) instanceof InterfaceC5313) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                list.getClass();
                return AbstractC5176.m9352(list2, AbstractC7705.m12686(list, C8091.f19698));
            default:
                return m13040(c8077, interfaceC7387);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC8083 m13037() {
        if (!(m13039() instanceof C8094)) {
            return m13039();
        }
        InterfaceC8083 interfaceC8083M13039 = m13039();
        interfaceC8083M13039.getClass();
        return ((C8094) interfaceC8083M13039).m13037();
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        return m13039().mo9731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection m13038(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m13039().mo9726(c5523, noLookupLocation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC8083 m13039() {
        switch (this.f19706) {
            case 0:
                return (InterfaceC8083) ((C5679) this.f19705).invoke();
            default:
                return (InterfaceC8083) this.f19705;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Collection m13040(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return m13039().mo9728(c8077, interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection m13041(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m13039().mo9724(c5523, noLookupLocation);
    }

    public C8094(InterfaceC8083 interfaceC8083) {
        this.f19705 = interfaceC8083;
    }
}
