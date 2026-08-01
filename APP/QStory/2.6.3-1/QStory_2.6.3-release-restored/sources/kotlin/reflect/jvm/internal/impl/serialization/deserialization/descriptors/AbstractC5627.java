package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5168;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5667;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p082.C7712;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p117.AbstractC8087;
import p117.C8077;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5627 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14318 = {new PropertyReference1Impl(AbstractC5627.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC5627.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5675 f14319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5679 f14320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5623 f14321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5656 f14322;

    public AbstractC5627(C5656 c5656, List list, List list2, List list3, InterfaceC7372 interfaceC7372) {
        c5656.getClass();
        this.f14322 = c5656;
        C5665 c5665 = c5656.f14407;
        c5665.f14435.getClass();
        this.f14321 = new C5623(this, list, list2, list3);
        C5677 c5677 = c5665.f14437;
        C5614 c5614 = new C5614(interfaceC7372, 2);
        c5677.getClass();
        this.f14320 = new C5679(c5677, c5614);
        C5614 c56142 = new C5614(this, 3);
        c5677.getClass();
        this.f14319 = new C5675(c5677, c56142);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        C5623 c5623 = this.f14321;
        c5623.getClass();
        return !((Set) AbstractC7082.m12308(c5623.f14303, C5623.f14295[0])).contains(c5523) ? EmptyList.INSTANCE : (Collection) c5623.f14298.invoke(c5523);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        InterfaceC5920 interfaceC5920 = f14318[1];
        C5675 c5675 = this.f14319;
        c5675.getClass();
        interfaceC5920.getClass();
        return (Set) c5675.invoke();
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        C5623 c5623 = this.f14321;
        c5623.getClass();
        return !((Set) AbstractC7082.m12308(c5623.f14302, C5623.f14295[1])).contains(c5523) ? EmptyList.INSTANCE : (Collection) c5623.f14297.invoke(c5523);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        if (mo10085(c5523)) {
            C5665 c5665 = this.f14322.f14407;
            C5520 c5520Mo10091 = mo10091(c5523);
            C5667 c5667 = c5665.f14438;
            Set set = C5667.f14454;
            return c5667.m10126(c5520Mo10091, null);
        }
        C5623 c5623 = this.f14321;
        if (!c5623.f14299.keySet().contains(c5523)) {
            return null;
        }
        c5623.getClass();
        return (AbstractC7825) c5623.f14296.invoke(c5523);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        return (Set) AbstractC7082.m12308(this.f14321.f14303, C5623.f14295[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract Set mo10083();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Set m10084() {
        return (Set) AbstractC7082.m12308(this.f14320, f14318[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean mo10085(C5523 c5523) {
        c5523.getClass();
        return m10084().contains(c5523);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo10086(C5626 c5626) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract Set mo10087();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract Set mo10088();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo10089(ArrayList arrayList, InterfaceC7387 interfaceC7387);

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        return (Set) AbstractC7082.m12308(this.f14321.f14302, C5623.f14295[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo10090(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract C5520 mo10091(C5523 c5523);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List m10092(C8077 c8077, InterfaceC7387 interfaceC7387, NoLookupLocation noLookupLocation) {
        c8077.getClass();
        noLookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (c8077.m13033(C8077.f19654)) {
            mo10089(arrayList, interfaceC7387);
        }
        C5623 c5623 = this.f14321;
        c5623.getClass();
        C5679 c5679 = c5623.f14303;
        C5679 c56792 = c5623.f14302;
        boolean zM13033 = c8077.m13033(C8077.f19670);
        C7712 c7712 = C7712.f18675;
        if (zM13033) {
            Set<C5523> set = (Set) AbstractC7082.m12308(c56792, C5623.f14295[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C5523 c5523 : set) {
                if (((Boolean) interfaceC7387.invoke(c5523)).booleanValue()) {
                    c5523.getClass();
                    arrayList2.addAll(!((Set) AbstractC7082.m12308(c56792, C5623.f14295[1])).contains(c5523) ? EmptyList.INSTANCE : (Collection) c5623.f14297.invoke(c5523));
                }
            }
            AbstractC5168.m9325(arrayList2, c7712);
            arrayList.addAll(arrayList2);
        }
        if (c8077.m13033(C8077.f19669)) {
            Set<C5523> set2 = (Set) AbstractC7082.m12308(c5679, C5623.f14295[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C5523 c55232 : set2) {
                if (((Boolean) interfaceC7387.invoke(c55232)).booleanValue()) {
                    c55232.getClass();
                    arrayList3.addAll(!((Set) AbstractC7082.m12308(c5679, C5623.f14295[0])).contains(c55232) ? EmptyList.INSTANCE : (Collection) c5623.f14298.invoke(c55232));
                }
            }
            AbstractC5168.m9325(arrayList3, c7712);
            arrayList.addAll(arrayList3);
        }
        if (c8077.m13033(C8077.f19668)) {
            for (C5523 c55233 : m10084()) {
                if (((Boolean) interfaceC7387.invoke(c55233)).booleanValue()) {
                    C5665 c5665 = this.f14322.f14407;
                    C5520 c5520Mo10091 = mo10091(c55233);
                    C5667 c5667 = c5665.f14438;
                    Set set3 = C5667.f14454;
                    AbstractC7818 abstractC7818M10126 = c5667.m10126(c5520Mo10091, null);
                    if (abstractC7818M10126 != null) {
                        arrayList.add(abstractC7818M10126);
                    }
                }
            }
        }
        if (c8077.m13033(C8077.f19666)) {
            for (C5523 c55234 : c5623.f14299.keySet()) {
                if (((Boolean) interfaceC7387.invoke(c55234)).booleanValue()) {
                    c5623.getClass();
                    c55234.getClass();
                    AbstractC7825 abstractC7825 = (AbstractC7825) c5623.f14296.invoke(c55234);
                    if (abstractC7825 != null) {
                        arrayList.add(abstractC7825);
                    }
                }
            }
        }
        return AbstractC8104.m13049(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo10093(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
    }
}
