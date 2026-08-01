package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C0749;
import com.bumptech.glide.AbstractC3056;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0678 f1996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1997;

    public /* synthetic */ C0708(C0678 c0678, int i) {
        this.f1997 = i;
        this.f1996 = c0678;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f1997;
        C0678 c0678 = this.f1996;
        switch (i) {
        }
        return AbstractC3056.m6717(Integer.valueOf(c0678.m1475(((C0749) obj2).f2168)), Integer.valueOf(c0678.m1475(((C0749) obj).f2168)));
    }
}
