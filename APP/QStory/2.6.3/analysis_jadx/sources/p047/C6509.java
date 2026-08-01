package p047;

import java.lang.reflect.Field;
import kotlin.C5176;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6509 extends AbstractC6504 implements InterfaceC6490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f17814;

    public C6509(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.f17814 = obj;
    }

    @Override // p047.AbstractC6504, p047.InterfaceC6489
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo11998(objArr);
        ((Field) this.f17799).set(this.f17814, AbstractC4347.m8825(objArr));
        return C5176.f14739;
    }
}
