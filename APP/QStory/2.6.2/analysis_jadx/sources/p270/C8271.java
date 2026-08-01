package p270;

import java.sql.Timestamp;
import java.util.Date;
import p271.AbstractC8321;

/* JADX INFO: renamed from: 飘花落叶言楪哲子兰苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8271 extends AbstractC8321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f22896;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8271(Class cls, int i) {
        super(cls);
        this.f22896 = i;
    }

    @Override // p271.AbstractC8321
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Date mo13820(Date date) {
        switch (this.f22896) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
