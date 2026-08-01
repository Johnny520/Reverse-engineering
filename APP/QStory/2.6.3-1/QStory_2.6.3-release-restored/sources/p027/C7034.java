package p027;

import androidx.activity.AbstractC0900;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p029.AbstractC7059;
import p031.C7063;
import p031.C7064;
import p033.AbstractC7067;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f17434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7037 f17435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7064 f17436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f17437;

    public C7034(C7063 c7063) {
        c7063.getClass();
        TimeUnit.MINUTES.getClass();
        this.f17437 = 300000000000L;
        this.f17436 = c7063.m12268();
        this.f17435 = new C7037(this, AbstractC0900.m711(new StringBuilder(), AbstractC7059.f17511, " ConnectionPool connection closer"));
        this.f17434 = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12201(C7036 c7036, long j) {
        TimeZone timeZone = AbstractC7059.f17512;
        ArrayList arrayList = c7036.f17463;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c7036.f17457.f17047.f17160 + " was leaked. Did you forget to close a response body?";
                AbstractC7067 abstractC7067 = AbstractC7067.f17543;
                AbstractC7067.f17543.mo12284(((C7041) reference).f17476, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c7036.f17461 = j - this.f17437;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
