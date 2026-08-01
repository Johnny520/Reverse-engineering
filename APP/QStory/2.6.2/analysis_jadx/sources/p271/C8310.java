package p271;

import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC3237;
import java.lang.reflect.Field;
import p259.C8244;
import p269.AbstractC8267;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8310 extends AbstractC8313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3237 f22927;

    public C8310(InterfaceC3237 interfaceC3237, C8311 c8311) {
        super(c8311);
        this.f22927 = interfaceC3237;
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo13825(Object obj, C8244 c8244, C8312 c8312) throws IllegalAccessException {
        Field field = c8312.f22935;
        Object objMo7336 = c8312.f22938.mo7336(c8244);
        if (objMo7336 == null && c8312.f22937) {
            return;
        }
        if (c8312.f22933) {
            C8294.m13822(obj, field);
        } else if (c8312.f22939) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(AbstractC8267.m13816(field, false)));
        }
        field.set(obj, objMo7336);
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo13827() {
        return this.f22927.mo4472();
    }

    @Override // p271.AbstractC8313
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo13826(Object obj) {
        return obj;
    }
}
