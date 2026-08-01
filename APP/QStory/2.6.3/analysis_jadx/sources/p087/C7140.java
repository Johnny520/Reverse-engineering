package p087;

import androidx.core.view.C2268;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.InterfaceC5093;
import p089.InterfaceC7184;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7140 extends AbstractC7114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7104 f19093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5093 f19094;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7140(InterfaceC5093 interfaceC5093, InterfaceC7184 interfaceC7184) {
        super(interfaceC7184);
        interfaceC7184.getClass();
        this.f19094 = interfaceC5093;
        InterfaceC7191 descriptor = interfaceC7184.getDescriptor();
        descriptor.getClass();
        this.f19093 = new C7104(descriptor, 0);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return this.f19093;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12397(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new C2268(objArr);
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12398(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12399() {
        return new ArrayList();
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12400(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC3057.m6756(this.f19094), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return new ArrayList(listAsList);
    }

    @Override // p087.AbstractC7114
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12401(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
