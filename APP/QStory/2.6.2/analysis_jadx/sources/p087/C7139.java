package p087;

import androidx.core.view.C2268;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;
import p089.InterfaceC7183;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7139 extends AbstractC7113 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7103 f19098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5092 f19099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7139(InterfaceC5092 interfaceC5092, InterfaceC7183 interfaceC7183) {
        super(interfaceC7183);
        interfaceC7183.getClass();
        this.f19099 = interfaceC5092;
        InterfaceC7190 descriptor = interfaceC7183.getDescriptor();
        descriptor.getClass();
        this.f19098 = new C7103(descriptor, 0);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return this.f19098;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12370(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new C2268(objArr);
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12371(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12372() {
        return new ArrayList();
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12373(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC6560.m12029(this.f19099), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return new ArrayList(listAsList);
    }

    @Override // p087.AbstractC7113
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12374(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
