package androidx.compose.p001ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.collection.C1083;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.InterfaceC2959;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6097;
import kotlinx.coroutines.flow.C6116;
import kotlinx.coroutines.flow.InterfaceC6096;
import kotlinx.coroutines.internal.AbstractC6197;
import kotlinx.coroutines.internal.C6183;
import p034.AbstractC7082;
import p068.InterfaceC7383;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703 implements InterfaceC2959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6249 f5715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6183 f5716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2232 f5717 = AbstractC2202.m3038(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f5718;

    public C2703(Context context) {
        this.f5718 = context;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // androidx.compose.p001ui.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final float mo1846() {
        InterfaceC6096 interfaceC6096;
        if (this.f5715 == null) {
            Context context = this.f5718;
            C1083 c1083 = AbstractC2673.f5685;
            synchronized (c1083) {
                try {
                    Object objM1317 = c1083.m1317(context);
                    if (objM1317 == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C6022 c6022M10841 = AbstractC6037.m10841(-1, 6, null);
                        C6116 c6116 = new C6116(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C2677(c6022M10841, AbstractC7082.m12298(Looper.getMainLooper())), c6022M10841, context, null));
                        C6254 c6254M11046 = AbstractC6231.m11046();
                        C8036 c8036 = AbstractC6227.f15375;
                        objM1317 = AbstractC6154.m10896(c6116, new C6183(AbstractC1298.m1714(AbstractC6197.f15305, c6254M11046)), new C6097(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c1083.m1315(context, objM1317);
                    }
                    interfaceC6096 = (InterfaceC6096) objM1317;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AbstractC2184) this.f5717).m2995(((Number) interfaceC6096.getValue()).floatValue());
            C6183 c6183 = this.f5716;
            if (c6183 == null) {
                C6755.m11870("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f5715 = AbstractC6231.m11036(c6183, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(interfaceC6096, this, null), 3);
        }
        return ((AbstractC2184) this.f5717).m2994();
    }
}
