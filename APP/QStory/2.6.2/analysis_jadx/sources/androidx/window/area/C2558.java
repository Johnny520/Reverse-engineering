package androidx.window.area;

import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.C2586;
import androidx.window.layout.InterfaceC2596;
import androidx.window.layout.adapter.extensions.C2579;
import androidx.window.layout.adapter.extensions.C2580;
import androidx.window.layout.adapter.extensions.C2581;
import androidx.window.layout.adapter.extensions.C2582;
import androidx.window.layout.adapter.extensions.C2583;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.api.C3885;
import io.ktor.server.response.C4132;
import io.ktor.util.AbstractC4216;
import io.ktor.util.C4206;
import io.ktor.util.debug.AbstractC4186;
import java.nio.file.FileSystems;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5175;
import kotlin.text.CharDirectionality;
import p035.AbstractC6340;
import p052.InterfaceC6542;
import p056.C6734;
import p056.C6757;
import p056.C6834;
import p075.C6957;
import p077.C6970;
import p087.C7102;
import p087.C7134;
import p147.AbstractC7562;
import p147.AbstractC7565;
import p175.AbstractC7738;
import p316.C8675;
import top.yukonga.miuix.kmp.utils.AbstractC6067;
import top.yukonga.miuix.kmp.utils.C6068;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2558 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7699;

    @Override // p052.InterfaceC6542
    public final Object invoke() throws InterruptedException {
        WindowLayoutComponent windowLayoutComponentM5067;
        int i = this.f7699;
        int i2 = 3;
        C5175 c5175 = C5175.f14739;
        int i3 = 26;
        WindowAreaComponent windowAreaComponentM5049 = null;
        switch (i) {
            case 0:
                try {
                    ClassLoader classLoader = C8675.class.getClassLoader();
                    if (classLoader != null) {
                        windowAreaComponentM5049 = new C2561(classLoader).m5049();
                    }
                    break;
                } catch (Throwable unused) {
                    if (AbstractC7565.f20483 == VerificationMode.LOG) {
                        Log.d(AbstractC2566.f7719, "Failed to load WindowExtensions");
                    }
                }
                return (Build.VERSION.SDK_INT <= 29 || windowAreaComponentM5049 == null || AbstractC7562.m12763() < 3) ? new C2563() : new C2567(windowAreaComponentM5049);
            case 1:
                try {
                    ClassLoader classLoader2 = InterfaceC2596.class.getClassLoader();
                    C2586 c2586 = classLoader2 != null ? new C2586(classLoader2, new C6970(classLoader2)) : null;
                    if (c2586 == null || (windowLayoutComponentM5067 = c2586.m5067()) == null) {
                        return null;
                    }
                    C6970 c6970 = new C6970(classLoader2);
                    int iM12763 = AbstractC7562.m12763();
                    return iM12763 >= 9 ? new C2579(windowLayoutComponentM5067, c6970) : iM12763 >= 6 ? new C2580(windowLayoutComponentM5067, c6970) : iM12763 >= 2 ? new C2581(windowLayoutComponentM5067, c6970) : iM12763 == 1 ? new C2582(windowLayoutComponentM5067, c6970) : new C2583();
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
                try {
                    return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
                } catch (Throwable unused3) {
                    return null;
                }
            case 3:
                return AbstractC4216.m8637(true);
            case 4:
                return new C4132();
            case 5:
                try {
                    return FileSystems.getDefault().newWatchService();
                } catch (NoClassDefFoundError unused4) {
                    return null;
                }
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return Boolean.valueOf(AbstractC4186.m8563());
            case 8:
                throw null;
            case 9:
                return "Server capability assertion failed: sampling not supported";
            case 10:
                return "Server connection closing";
            case 11:
                return "Client capability assertion failed: sampling not supported";
            case 12:
                return "Handling list resources request";
            case 13:
                return "Handling list prompts request";
            case 14:
                return "Error sending method not found response";
            case 15:
                return AbstractC0455.m1152(new C4206(i2));
            case 16:
                return CharDirectionality.directionalityMap_delegate$lambda$0();
            case 17:
                return Boolean.FALSE;
            case 18:
                new C6957(i3).m12237();
                return c5175;
            case 19:
                new C3885(i3).m8285();
                return c5175;
            case 20:
                return new SnapshotStateList();
            case 21:
                return new SnapshotStateList();
            case 22:
                C1334 c1334 = AbstractC6067.f16598;
                return null;
            case 23:
                return new C6068();
            case 24:
                Thread.sleep(3000L);
                AbstractC7738.m13038(AbstractC6340.f17460);
                System.exit(0);
                throw new RuntimeException(AbstractC3056.m6668(-3937692378597688743L));
            case 25:
                return new C7102(C6734.f18168, 0);
            case 26:
                return new C6834();
            case 27:
                return new C7102(C6734.f18168, 0);
            case 28:
                return new C7102(C7134.f19094, 0);
            default:
                return new C7102(C6757.f18195, 0);
        }
    }

    public /* synthetic */ C2558(int i) {
        this.f7699 = i;
    }
}
