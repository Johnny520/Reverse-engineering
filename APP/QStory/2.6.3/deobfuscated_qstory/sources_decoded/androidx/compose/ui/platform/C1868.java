package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.collection.C0236;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.ui.InterfaceC2126;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5422;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5265;
import kotlinx.coroutines.flow.C5284;
import kotlinx.coroutines.flow.InterfaceC5264;
import kotlinx.coroutines.internal.AbstractC5365;
import kotlinx.coroutines.internal.C5351;
import p018.AbstractC6253;
import p052.InterfaceC6554;
import p095.C7207;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1868 implements InterfaceC2126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5417 f5370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5351 f5371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1397 f5372 = AbstractC1367.m2478(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f5373;

    public C1868(Context context) {
        this.f5373 = context;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    @Override // androidx.compose.ui.InterfaceC2126
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final float mo1286() {
        InterfaceC5264 interfaceC5264;
        if (this.f5370 == null) {
            Context context = this.f5373;
            C0236 c0236 = AbstractC1838.f5340;
            synchronized (c0236) {
                try {
                    Object objM757 = c0236.m757(context);
                    if (objM757 == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C5190 c5190M10282 = AbstractC5205.m10282(-1, 6, null);
                        C5284 c5284 = new C5284(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C1842(c5190M10282, AbstractC6253.m11739(Looper.getMainLooper())), c5190M10282, context, null));
                        C5422 c5422M10487 = AbstractC5399.m10487();
                        C7207 c7207 = AbstractC5395.f15030;
                        objM757 = AbstractC5322.m10337(c5284, new C5351(AbstractC0455.m1154(AbstractC5365.f14960, c5422M10487)), new C5265(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c0236.m755(context, objM757);
                    }
                    interfaceC5264 = (InterfaceC5264) objM757;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AbstractC1349) this.f5372).m2435(((Number) interfaceC5264.getValue()).floatValue());
            C5351 c5351 = this.f5371;
            if (c5351 == null) {
                C5925.m11311("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f5370 = AbstractC5399.m10477(c5351, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(interfaceC5264, this, null), 3);
        }
        return ((AbstractC1349) this.f5372).m2434();
    }
}
