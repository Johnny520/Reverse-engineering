package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.collection.C0236;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.ui.InterfaceC2126;
import com.bumptech.glide.AbstractC3055;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5421;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5264;
import kotlinx.coroutines.flow.C5283;
import kotlinx.coroutines.flow.InterfaceC5263;
import kotlinx.coroutines.internal.AbstractC5364;
import kotlinx.coroutines.internal.C5350;
import p033.AbstractC6325;
import p052.InterfaceC6553;
import p095.C7206;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1868 implements InterfaceC2126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5416 f5369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5350 f5370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1397 f5371 = AbstractC1367.m2469(1.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f5372;

    public C1868(Context context) {
        this.f5372 = context;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }

    @Override // androidx.compose.ui.InterfaceC2126
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final float mo1276() {
        InterfaceC5263 interfaceC5263;
        if (this.f5369 == null) {
            Context context = this.f5372;
            C0236 c0236 = AbstractC1838.f5339;
            synchronized (c0236) {
                try {
                    Object objM756 = c0236.m756(context);
                    if (objM756 == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C5189 c5189M10278 = AbstractC5204.m10278(-1, 6, null);
                        C5283 c5283 = new C5283(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C1842(c5189M10278, AbstractC6325.m11873(Looper.getMainLooper())), c5189M10278, context, null));
                        C5421 c5421M10483 = AbstractC5398.m10483();
                        C7206 c7206 = AbstractC5394.f15030;
                        objM756 = AbstractC5321.m10333(c5283, new C5350(AbstractC3055.m6636(AbstractC5364.f14960, c5421M10483)), new C5264(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c0236.m754(context, objM756);
                    }
                    interfaceC5263 = (InterfaceC5263) objM756;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AbstractC1349) this.f5371).m2425(((Number) interfaceC5263.getValue()).floatValue());
            C5350 c5350 = this.f5370;
            if (c5350 == null) {
                C5919.m11250("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f5369 = AbstractC5398.m10473(c5350, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(interfaceC5263, this, null), 3);
        }
        return ((AbstractC1349) this.f5371).m2424();
    }
}
