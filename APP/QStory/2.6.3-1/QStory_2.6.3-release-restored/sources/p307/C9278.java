package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import java.lang.reflect.Type;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import p294.AbstractC9193;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9278 extends AbstractC9193 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9278 f23733 = new C9278(null, null);

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        C3728 c3728 = abstractC3730.f9523;
        OffsetTime offsetTime = (OffsetTime) obj;
        DateTimeFormatter dateTimeFormatterM14428 = m14428();
        if (dateTimeFormatterM14428 == null) {
            dateTimeFormatterM14428 = null;
        }
        if (dateTimeFormatterM14428 == null) {
            abstractC3730.mo6528(offsetTime);
        } else {
            abstractC3730.mo6577(dateTimeFormatterM14428.format(offsetTime));
        }
    }
}
