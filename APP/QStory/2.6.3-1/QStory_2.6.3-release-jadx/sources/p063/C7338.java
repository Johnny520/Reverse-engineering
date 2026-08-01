package p063;

import java.lang.reflect.Field;
import kotlin.C6008;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7338 extends AbstractC7333 implements InterfaceC7319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f18159;

    public C7338(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.f18159 = obj;
    }

    @Override // p063.AbstractC7333, p063.InterfaceC7318
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo12557(objArr);
        ((Field) this.f18144).set(this.f18159, AbstractC5179.m9384(objArr));
        return C6008.f15084;
    }
}
