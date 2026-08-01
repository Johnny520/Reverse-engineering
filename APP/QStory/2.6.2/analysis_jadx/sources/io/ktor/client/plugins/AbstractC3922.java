package io.ktor.client.plugins;

import androidx.activity.compose.C0011;
import com.materialkolor.dynamiccolor.C3806;
import io.ktor.client.content.InterfaceC3868;
import io.ktor.util.C4208;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.text.AbstractC5143;
import p059.C6856;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12132;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(InterfaceC3868.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(InterfaceC3868.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12132 = new C4208("UploadProgressListenerAttributeKey", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        AbstractC4395.f12971.mo8927(InterfaceC3868.class);
        try {
            AbstractC4395.m8922(InterfaceC3868.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5143.m10164("DownloadProgressListenerAttributeKey")) {
            C5919.m11249("Name can't be blank");
        } else {
            AbstractC9124.m14674("BodyProgress", new C0011(0), new C3806(1));
        }
    }
}
