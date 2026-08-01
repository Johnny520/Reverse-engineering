package p087;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p089.InterfaceC7184;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7103 extends AbstractC7114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7076 f19029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f19030;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7103(InterfaceC7184 interfaceC7184, int i) {
        super(interfaceC7184);
        this.f19030 = i;
        interfaceC7184.getClass();
        switch (i) {
            case 1:
                super(interfaceC7184);
                InterfaceC7191 descriptor = interfaceC7184.getDescriptor();
                descriptor.getClass();
                this.f19029 = new C7104(descriptor, 2);
                break;
            case 2:
                super(interfaceC7184);
                InterfaceC7191 descriptor2 = interfaceC7184.getDescriptor();
                descriptor2.getClass();
                this.f19029 = new C7104(descriptor2, 3);
                break;
            default:
                InterfaceC7191 descriptor3 = interfaceC7184.getDescriptor();
                descriptor3.getClass();
                this.f19029 = new C7104(descriptor3, 1);
                break;
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        switch (this.f19030) {
        }
        return (C7104) this.f19029;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12397(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12398(Object obj) {
        switch (this.f19030) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12399() {
        switch (this.f19030) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12400(Object obj) {
        switch (this.f19030) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        Object obj2;
        switch (this.f19030) {
            case 0:
                List list = (List) obj;
                list.getClass();
                obj2 = list instanceof ArrayList ? (ArrayList) list : null;
                return obj2 == null ? new ArrayList(list) : obj2;
            case 1:
                Set set = (Set) obj;
                set.getClass();
                obj2 = set instanceof HashSet ? (HashSet) set : null;
                return obj2 == null ? new HashSet(set) : obj2;
            default:
                Set set2 = (Set) obj;
                set2.getClass();
                obj2 = set2 instanceof LinkedHashSet ? (LinkedHashSet) set2 : null;
                return obj2 == null ? new LinkedHashSet(set2) : obj2;
        }
    }

    @Override // p087.AbstractC7114
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo12401(Object obj, int i, Object obj2) {
        switch (this.f19030) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
