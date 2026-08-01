package p194;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.collection.C1091;
import androidx.compose.foundation.text.contextmenu.internal.C1647;
import androidx.compose.p001ui.text.C2869;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7387;
import p105.C8009;
import p137.C8214;
import p137.C8216;
import p137.C8219;
import p137.InterfaceC8221;
import p195.C8582;

/* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8009 f21385 = new C8009(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1647 f21384 = new C1647(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13668(C8582 c8582, Context context, final boolean z, final String str, final long j) {
        if (C2869.m4312(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f21385.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        C1091 c1091 = c8582.f21387;
        C1091 c10912 = c8582.f21387;
        C8214 c8214 = C8214.f20369;
        c1091.m1335(c8214);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c10912.m1335(new C8216(new C8219(i), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC7387() { // from class: 飘花落叶言子楪兰哲世苏.飘花落叶言子楪世苏兰哲
                @Override // p068.InterfaceC7387
                public final Object invoke(Object obj) {
                    AbstractC8581.f21384.invoke(context2, resolveInfo, Boolean.valueOf(z), str, new C2869(j));
                    ((InterfaceC8221) obj).close();
                    return C6008.f15084;
                }
            }));
            i++;
            context2 = context;
        }
        c10912.m1335(c8214);
    }
}
