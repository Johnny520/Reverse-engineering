package p011;

import androidx.activity.AbstractC0053;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p013.AbstractC6230;
import p015.C6234;
import p015.C6235;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f17089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6208 f17090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6235 f17091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f17092;

    public C6205(C6234 c6234) {
        c6234.getClass();
        TimeUnit.MINUTES.getClass();
        this.f17092 = 300000000000L;
        this.f17091 = c6234.m11709();
        this.f17090 = new C6208(this, AbstractC0053.m151(new StringBuilder(), AbstractC6230.f17166, " ConnectionPool connection closer"));
        this.f17089 = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11642(C6207 c6207, long j) {
        TimeZone timeZone = AbstractC6230.f17167;
        ArrayList arrayList = c6207.f17118;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c6207.f17112.f16702.f16815 + " was leaked. Did you forget to close a response body?";
                AbstractC6238 abstractC6238 = AbstractC6238.f17198;
                AbstractC6238.f17198.mo11725(((C6212) reference).f17131, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c6207.f17116 = j - this.f17092;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
