package p178;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.collection.C0244;
import androidx.compose.foundation.text.contextmenu.internal.C0807;
import androidx.compose.ui.text.C2035;
import java.util.List;
import kotlin.C5176;
import p052.InterfaceC6558;
import p089.C7180;
import p121.C7385;
import p121.C7387;
import p121.C7390;
import p121.InterfaceC7392;
import p179.C7753;

/* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7180 f21040 = new C7180(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0807 f21039 = new C0807(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13109(C7753 c7753, Context context, final boolean z, final String str, final long j) {
        if (C2035.m3752(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f21040.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        C0244 c0244 = c7753.f21042;
        C0244 c02442 = c7753.f21042;
        C7385 c7385 = C7385.f20024;
        c0244.m775(c7385);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c02442.m775(new C7387(new C7390(i), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC6558() { // from class: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏兰哲
                @Override // p052.InterfaceC6558
                public final Object invoke(Object obj) {
                    AbstractC7752.f21039.invoke(context2, resolveInfo, Boolean.valueOf(z), str, new C2035(j));
                    ((InterfaceC7392) obj).close();
                    return C5176.f14739;
                }
            }));
            i++;
            context2 = context;
        }
        c02442.m775(c7385);
    }
}
