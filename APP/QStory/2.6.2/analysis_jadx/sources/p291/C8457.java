package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import java.lang.reflect.Type;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import p278.AbstractC8363;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8457 extends AbstractC8363 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8457 f23397 = new C8457(null, null);

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        C2894 c2894 = abstractC2896.f9176;
        OffsetTime offsetTime = (OffsetTime) obj;
        DateTimeFormatter dateTimeFormatterM13852 = m13852();
        if (dateTimeFormatterM13852 == null) {
            dateTimeFormatterM13852 = null;
        }
        if (dateTimeFormatterM13852 == null) {
            abstractC2896.mo5923(offsetTime);
        } else {
            abstractC2896.mo5972(dateTimeFormatterM13852.format(offsetTime));
        }
    }
}
