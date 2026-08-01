package p270;

import com.google.gson.AbstractC3251;
import java.sql.Timestamp;
import java.util.Date;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8273 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8274 f22896 = new C8274();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3251 f22897;

    public C8273(AbstractC3251 abstractC3251) {
        this.f22897 = abstractC3251;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) {
        this.f22897.mo7322(c8244, (Timestamp) obj);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) {
        Date date = (Date) this.f22897.mo7323(c8245);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
