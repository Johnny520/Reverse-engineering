package p103;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p105.InterfaceC8013;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7932 extends AbstractC7943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7905 f19374;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f19375;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7932(InterfaceC8013 interfaceC8013, int i) {
        super(interfaceC8013);
        this.f19375 = i;
        interfaceC8013.getClass();
        switch (i) {
            case 1:
                super(interfaceC8013);
                InterfaceC8020 descriptor = interfaceC8013.getDescriptor();
                descriptor.getClass();
                this.f19374 = new C7933(descriptor, 2);
                break;
            case 2:
                super(interfaceC8013);
                InterfaceC8020 descriptor2 = interfaceC8013.getDescriptor();
                descriptor2.getClass();
                this.f19374 = new C7933(descriptor2, 3);
                break;
            default:
                InterfaceC8020 descriptor3 = interfaceC8013.getDescriptor();
                descriptor3.getClass();
                this.f19374 = new C7933(descriptor3, 1);
                break;
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        switch (this.f19375) {
        }
        return (C7933) this.f19374;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12956(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12957(Object obj) {
        switch (this.f19375) {
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

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12958() {
        switch (this.f19375) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12959(Object obj) {
        switch (this.f19375) {
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

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        Object obj2;
        switch (this.f19375) {
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

    @Override // p103.AbstractC7943
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo12960(Object obj, int i, Object obj2) {
        switch (this.f19375) {
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
