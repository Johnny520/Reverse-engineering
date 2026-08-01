package io.ktor.client.plugins;

import androidx.activity.compose.C0858;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.client.content.InterfaceC4701;
import io.ktor.util.C5041;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import p075.C7686;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12482;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(InterfaceC4701.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(InterfaceC4701.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12482 = new C5041("UploadProgressListenerAttributeKey", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        AbstractC5228.f13320.mo9476(InterfaceC4701.class);
        try {
            AbstractC5228.m9471(InterfaceC4701.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5976.m10731("DownloadProgressListenerAttributeKey")) {
            C6755.m11869("Name can't be blank");
        } else {
            AbstractC8568.m13644("BodyProgress", new C0858(0), new C4639(1));
        }
    }
}
