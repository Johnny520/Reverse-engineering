package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C0749;
import java.util.Comparator;
import p175.AbstractC7738;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0678 f1995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1996;

    public /* synthetic */ C0708(C0678 c0678, int i) {
        this.f1996 = i;
        this.f1995 = c0678;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f1996;
        C0678 c0678 = this.f1995;
        switch (i) {
        }
        return AbstractC7738.m13040(Integer.valueOf(c0678.m1465(((C0749) obj2).f2167)), Integer.valueOf(c0678.m1465(((C0749) obj).f2167)));
    }
}
