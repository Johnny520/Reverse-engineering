package p178;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.collection.C0244;
import androidx.compose.foundation.text.contextmenu.internal.C0807;
import androidx.compose.ui.text.C2035;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6557;
import p089.C7179;
import p121.C7384;
import p121.C7386;
import p121.C7389;
import p121.InterfaceC7391;
import p179.C7752;

/* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7751 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7179 f21043 = new C7179(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0807 f21042 = new C0807(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13081(C7752 c7752, Context context, final boolean z, final String str, final long j) {
        if (C2035.m3742(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f21043.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        C0244 c0244 = c7752.f21045;
        C0244 c02442 = c7752.f21045;
        C7384 c7384 = C7384.f20029;
        c0244.m774(c7384);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c02442.m774(new C7386(new C7389(i), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC6557() { // from class: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏兰哲
                @Override // p052.InterfaceC6557
                public final Object invoke(Object obj) {
                    AbstractC7751.f21042.invoke(context2, resolveInfo, Boolean.valueOf(z), str, new C2035(j));
                    ((InterfaceC7391) obj).close();
                    return C5175.f14739;
                }
            }));
            i++;
            context2 = context;
        }
        c02442.m774(c7384);
    }
}
