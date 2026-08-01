package p271;

import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC3238;
import java.lang.reflect.Field;
import p259.C8245;
import p269.AbstractC8268;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8311 extends AbstractC8314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3238 f22926;

    public C8311(InterfaceC3238 interfaceC3238, C8312 c8312) {
        super(c8312);
        this.f22926 = interfaceC3238;
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13842(Object obj, C8245 c8245, C8313 c8313) throws IllegalAccessException {
        Field field = c8313.f22934;
        Object objMo7323 = c8313.f22937.mo7323(c8245);
        if (objMo7323 == null && c8313.f22936) {
            return;
        }
        if (c8313.f22932) {
            C8295.m13839(obj, field);
        } else if (c8313.f22938) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(AbstractC8268.m13833(field, false)));
        }
        field.set(obj, objMo7323);
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo13844() {
        return this.f22926.mo4482();
    }

    @Override // p271.AbstractC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo13843(Object obj) {
        return obj;
    }
}
