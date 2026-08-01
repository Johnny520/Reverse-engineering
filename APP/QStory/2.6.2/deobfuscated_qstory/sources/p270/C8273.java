package p270;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import java.sql.Timestamp;
import java.util.Date;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8273 implements InterfaceC3248 {
    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        if (c8245.f22816 != Timestamp.class) {
            return null;
        }
        c3252.getClass();
        return new C8272(c3252.m7353(new C8245(Date.class)));
    }
}
