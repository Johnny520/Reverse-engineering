package p270;

import com.google.gson.AbstractC3250;
import java.sql.Timestamp;
import java.util.Date;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8272 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8273 f22897 = new C8273();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3250 f22898;

    public C8272(AbstractC3250 abstractC3250) {
        this.f22898 = abstractC3250;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) {
        this.f22898.mo7335(c8243, (Timestamp) obj);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) {
        Date date = (Date) this.f22898.mo7336(c8244);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
