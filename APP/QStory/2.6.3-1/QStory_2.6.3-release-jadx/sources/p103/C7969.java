package p103;

import androidx.core.view.C3101;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.InterfaceC5925;
import p105.InterfaceC8013;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7969 extends AbstractC7943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7933 f19438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5925 f19439;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7969(InterfaceC5925 interfaceC5925, InterfaceC8013 interfaceC8013) {
        super(interfaceC8013);
        interfaceC8013.getClass();
        this.f19439 = interfaceC5925;
        InterfaceC8020 descriptor = interfaceC8013.getDescriptor();
        descriptor.getClass();
        this.f19438 = new C7933(descriptor, 0);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f19438;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12956(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new C3101(objArr);
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12957(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12958() {
        return new ArrayList();
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12959(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC3889.m7316(this.f19439), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return new ArrayList(listAsList);
    }

    @Override // p103.AbstractC7943
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12960(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
