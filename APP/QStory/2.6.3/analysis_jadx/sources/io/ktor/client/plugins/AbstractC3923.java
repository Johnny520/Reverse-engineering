package io.ktor.client.plugins;

import androidx.activity.compose.C0011;
import com.materialkolor.dynamiccolor.C3807;
import io.ktor.client.content.InterfaceC3869;
import io.ktor.util.C4209;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.text.AbstractC5144;
import p059.C6857;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4209 f12137;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(InterfaceC3869.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(InterfaceC3869.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12137 = new C4209("UploadProgressListenerAttributeKey", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        AbstractC4396.f12975.mo8917(InterfaceC3869.class);
        try {
            AbstractC4396.m8912(InterfaceC3869.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5144.m10172("DownloadProgressListenerAttributeKey")) {
            C5925.m11310("Name can't be blank");
        } else {
            AbstractC7739.m13085("BodyProgress", new C0011(0), new C3807(1));
        }
    }
}
