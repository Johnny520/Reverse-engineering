package androidx.activity;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2106;
import kotlin.collections.EmptyList;
import p068.InterfaceC7387;
import p209.C8650;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0889 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f429;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f430;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f434;

    public /* synthetic */ RunnableC0889(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f434 = i;
        this.f432 = obj;
        this.f433 = obj2;
        this.f430 = obj3;
        this.f429 = obj4;
        this.f431 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2106 c2106Mo2775;
        int i = this.f434;
        Object obj = this.f431;
        Object obj2 = this.f429;
        Object obj3 = this.f430;
        Object obj4 = this.f433;
        Object obj5 = this.f432;
        switch (i) {
            case 0:
                C0891 c0891 = (C0891) obj5;
                C0860 c0860 = (C0860) obj4;
                C0860 c08602 = (C0860) obj3;
                View view = (View) obj;
                Window window = ((ComponentActivity) obj2).getWindow();
                window.getClass();
                InterfaceC7387 interfaceC7387 = c0860.f374;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) interfaceC7387.invoke(resources)).booleanValue();
                InterfaceC7387 interfaceC73872 = c08602.f374;
                Resources resources2 = view.getResources();
                resources2.getClass();
                c0891.mo591(c0860, c08602, window, view, zBooleanValue, ((Boolean) interfaceC73872.invoke(resources2)).booleanValue());
                return;
            default:
                C2865 c2865 = (C2865) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                String str = (String) obj3;
                InterfaceC8725 interfaceC8725 = (InterfaceC8725) obj2;
                InterfaceC2830 interfaceC2830 = (InterfaceC2830) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
                    C2106 c2106 = abstractC2121M2840 instanceof C2106 ? (C2106) abstractC2121M2840 : null;
                    if (c2106 == null || (c2106Mo2775 = c2106.mo2775(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC2121 abstractC2121M2847 = c2106Mo2775.m2847();
                        try {
                            C2865 c2865M4332 = AbstractC2882.m4332(c2865, layoutDirection);
                            EmptyList emptyList = EmptyList.INSTANCE;
                            C8650 c8650 = new C8650(str, c2865M4332, emptyList, emptyList, interfaceC2830, interfaceC8725);
                            c8650.mo2713();
                            c8650.mo2714();
                            AbstractC2121.m2844(abstractC2121M2847);
                            c2106Mo2775.mo2780().mo2804();
                            c2106Mo2775.mo2765();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC2121.m2844(abstractC2121M2847);
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
