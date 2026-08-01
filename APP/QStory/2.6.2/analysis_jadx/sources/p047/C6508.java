package p047;

import java.lang.reflect.Field;
import kotlin.C5175;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6508 extends AbstractC6503 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f17818;

    public C6508(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.f17818 = obj;
    }

    @Override // p047.AbstractC6503, p047.InterfaceC6488
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo11955(objArr);
        ((Field) this.f17803).set(this.f17818, AbstractC4346.m8849(objArr));
        return C5175.f14739;
    }
}
