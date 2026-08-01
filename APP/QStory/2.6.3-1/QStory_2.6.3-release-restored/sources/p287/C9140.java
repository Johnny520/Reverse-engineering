package p287;

import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC4070;
import java.lang.reflect.Field;
import p275.C9074;
import p285.AbstractC9097;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9140 extends AbstractC9143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4070 f23271;

    public C9140(InterfaceC4070 interfaceC4070, C9141 c9141) {
        super(c9141);
        this.f23271 = interfaceC4070;
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo14401(Object obj, C9074 c9074, C9142 c9142) throws IllegalAccessException {
        Field field = c9142.f23279;
        Object objMo7882 = c9142.f23282.mo7882(c9074);
        if (objMo7882 == null && c9142.f23281) {
            return;
        }
        if (c9142.f23277) {
            C9124.m14398(obj, field);
        } else if (c9142.f23283) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(AbstractC9097.m14392(field, false)));
        }
        field.set(obj, objMo7882);
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo14403() {
        return this.f23271.mo5042();
    }

    @Override // p287.AbstractC9143
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo14402(Object obj) {
        return obj;
    }
}
