package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C1590;
import com.bumptech.glide.AbstractC3888;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1549 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1519 f2341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2342;

    public /* synthetic */ C1549(C1519 c1519, int i) {
        this.f2342 = i;
        this.f2341 = c1519;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f2342;
        C1519 c1519 = this.f2341;
        switch (i) {
        }
        return AbstractC3888.m7277(Integer.valueOf(c1519.m2035(((C1590) obj2).f2513)), Integer.valueOf(c1519.m2035(((C1590) obj).f2513)));
    }
}
