package p013;

import androidx.activity.AbstractC0053;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p012.C6164;
import p012.C6165;
import p012.C6166;
import p017.AbstractC6238;
import p019.AbstractC6241;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6182 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f16917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6166 f16918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6165 f16919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16920;

    public C6182(C6164 c6164) {
        c6164.getClass();
        TimeUnit.MINUTES.getClass();
        this.f16920 = 300000000000L;
        this.f16919 = c6164.m11587();
        this.f16918 = new C6166(this, AbstractC0053.m146(new StringBuilder(), AbstractC6238.f17189, " ConnectionPool connection closer"));
        this.f16917 = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11633(C6181 c6181, long j) {
        TimeZone timeZone = AbstractC6238.f17190;
        ArrayList arrayList = c6181.f16910;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c6181.f16904.f16941.f17054 + " was leaked. Did you forget to close a response body?";
                AbstractC6241 abstractC6241 = AbstractC6241.f17194;
                AbstractC6241.f17194.mo11723(((C6186) reference).f16925, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c6181.f16908 = j - this.f16920;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
