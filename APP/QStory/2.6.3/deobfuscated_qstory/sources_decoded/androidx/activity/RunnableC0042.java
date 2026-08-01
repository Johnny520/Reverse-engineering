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
import p052.InterfaceC6558;
import p193.C7821;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C1271 c1271Mo2215;
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
                InterfaceC6558 interfaceC6558 = c0013.f29;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) interfaceC6558.invoke(resources)).booleanValue();
                InterfaceC6558 interfaceC65582 = c00132.f29;
                Resources resources2 = view.getResources();
                resources2.getClass();
                c0044.mo31(c0013, c00132, window, view, zBooleanValue, ((Boolean) interfaceC65582.invoke(resources2)).booleanValue());
                return;
            default:
                C2031 c2031 = (C2031) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                String str = (String) obj3;
                InterfaceC7896 interfaceC7896 = (InterfaceC7896) obj2;
                InterfaceC1996 interfaceC1996 = (InterfaceC1996) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
                    C1271 c1271 = abstractC1286M2280 instanceof C1271 ? (C1271) abstractC1286M2280 : null;
                    if (c1271 == null || (c1271Mo2215 = c1271.mo2215(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC1286 abstractC1286M2287 = c1271Mo2215.m2287();
                        try {
                            C2031 c2031M3772 = AbstractC2048.m3772(c2031, layoutDirection);
                            EmptyList emptyList = EmptyList.INSTANCE;
                            C7821 c7821 = new C7821(str, c2031M3772, emptyList, emptyList, interfaceC1996, interfaceC7896);
                            c7821.mo2153();
                            c7821.mo2154();
                            AbstractC1286.m2284(abstractC1286M2287);
                            c1271Mo2215.mo2220().mo2244();
                            c1271Mo2215.mo2205();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC1286.m2284(abstractC1286M2287);
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
