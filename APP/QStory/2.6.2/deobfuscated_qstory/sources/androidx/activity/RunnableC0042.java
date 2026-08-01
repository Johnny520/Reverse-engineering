package androidx.activity;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1271;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import p052.InterfaceC6557;
import p193.C7820;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0042 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f84;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f85;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f86;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f87;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f88;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f89;

    public /* synthetic */ RunnableC0042(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f89 = i;
        this.f87 = obj;
        this.f88 = obj2;
        this.f85 = obj3;
        this.f84 = obj4;
        this.f86 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1271 c1271Mo2205;
        int i = this.f89;
        Object obj = this.f86;
        Object obj2 = this.f84;
        Object obj3 = this.f85;
        Object obj4 = this.f88;
        Object obj5 = this.f87;
        switch (i) {
            case 0:
                C0044 c0044 = (C0044) obj5;
                C0013 c0013 = (C0013) obj4;
                C0013 c00132 = (C0013) obj3;
                View view = (View) obj;
                Window window = ((ComponentActivity) obj2).getWindow();
                window.getClass();
                InterfaceC6557 interfaceC6557 = c0013.f29;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) interfaceC6557.invoke(resources)).booleanValue();
                InterfaceC6557 interfaceC65572 = c00132.f29;
                Resources resources2 = view.getResources();
                resources2.getClass();
                c0044.mo31(c0013, c00132, window, view, zBooleanValue, ((Boolean) interfaceC65572.invoke(resources2)).booleanValue());
                return;
            default:
                C2031 c2031 = (C2031) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                String str = (String) obj3;
                InterfaceC7895 interfaceC7895 = (InterfaceC7895) obj2;
                InterfaceC1996 interfaceC1996 = (InterfaceC1996) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
                    C1271 c1271 = abstractC1286M2270 instanceof C1271 ? (C1271) abstractC1286M2270 : null;
                    if (c1271 == null || (c1271Mo2205 = c1271.mo2205(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC1286 abstractC1286M2277 = c1271Mo2205.m2277();
                        try {
                            C2031 c2031M3762 = AbstractC2048.m3762(c2031, layoutDirection);
                            EmptyList emptyList = EmptyList.INSTANCE;
                            C7820 c7820 = new C7820(str, c2031M3762, emptyList, emptyList, interfaceC1996, interfaceC7895);
                            c7820.mo2143();
                            c7820.mo2144();
                            AbstractC1286.m2274(abstractC1286M2277);
                            c1271Mo2205.mo2210().mo2234();
                            c1271Mo2205.mo2195();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC1286.m2274(abstractC1286M2277);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
