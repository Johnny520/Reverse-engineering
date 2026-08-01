package androidx.window.area;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.C2587;
import androidx.window.layout.InterfaceC2597;
import androidx.window.layout.adapter.extensions.C2580;
import androidx.window.layout.adapter.extensions.C2581;
import androidx.window.layout.adapter.extensions.C2582;
import androidx.window.layout.adapter.extensions.C2583;
import androidx.window.layout.adapter.extensions.C2584;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3065;
import io.ktor.client.plugins.api.C3886;
import io.ktor.server.response.C4133;
import io.ktor.util.AbstractC4217;
import io.ktor.util.C4207;
import io.ktor.util.debug.AbstractC4187;
import java.nio.file.FileSystems;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5176;
import kotlin.text.CharDirectionality;
import p036.AbstractC6358;
import p052.InterfaceC6543;
import p056.C6735;
import p056.C6758;
import p056.C6835;
import p075.C6958;
import p077.C6971;
import p087.C7103;
import p087.C7135;
import p147.AbstractC7563;
import p147.AbstractC7566;
import p287.AbstractC8405;
import top.yukonga.miuix.kmp.utils.AbstractC6073;
import top.yukonga.miuix.kmp.utils.C6074;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2558 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7700;

    @Override // p052.InterfaceC6543
    public final Object invoke() throws InterruptedException {
        WindowLayoutComponent windowLayoutComponentM5112;
        int i = this.f7700;
        int i2 = 3;
        C5176 c5176 = C5176.f14739;
        WindowAreaComponent windowAreaComponentM5059 = null;
        switch (i) {
            case 0:
                try {
                    ClassLoader classLoader = AbstractC2567.class.getClassLoader();
                    if (classLoader != null) {
                        windowAreaComponentM5059 = new C2561(classLoader).m5059();
                    }
                    break;
                } catch (Throwable unused) {
                    if (AbstractC7566.f20478 == VerificationMode.LOG) {
                        Log.d(AbstractC2566.f7719, "Failed to load WindowExtensions");
                    }
                }
                return (Build.VERSION.SDK_INT <= 29 || windowAreaComponentM5059 == null || AbstractC7563.m12792() < 3) ? new C2563() : new C2569(windowAreaComponentM5059);
            case 1:
                try {
                    ClassLoader classLoader2 = InterfaceC2597.class.getClassLoader();
                    C2587 c2587 = classLoader2 != null ? new C2587(classLoader2, new C6971(classLoader2)) : null;
                    if (c2587 == null || (windowLayoutComponentM5112 = c2587.m5112()) == null) {
                        return null;
                    }
                    C6971 c6971 = new C6971(classLoader2);
                    int iM12792 = AbstractC7563.m12792();
                    return iM12792 >= 9 ? new C2580(windowLayoutComponentM5112, c6971) : iM12792 >= 6 ? new C2581(windowLayoutComponentM5112, c6971) : iM12792 >= 2 ? new C2582(windowLayoutComponentM5112, c6971) : iM12792 == 1 ? new C2583(windowLayoutComponentM5112, c6971) : new C2584();
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
                return AbstractC4217.m8627(true);
            case 4:
                return new C4133();
            case 5:
                try {
                    return FileSystems.getDefault().newWatchService();
                } catch (NoClassDefFoundError unused4) {
                    return null;
                }
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return Boolean.valueOf(AbstractC4187.m8553());
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
                return AbstractC3065.m6823(new C4207(i2));
            case 16:
                return CharDirectionality.directionalityMap_delegate$lambda$0();
            case 17:
                return Boolean.FALSE;
            case 18:
                new C6958(25).m12262();
                return c5176;
            case 19:
                new C3886(26).m8273();
                return c5176;
            case 20:
                return new SnapshotStateList();
            case 21:
                return new SnapshotStateList();
            case 22:
                C1334 c1334 = AbstractC6073.f16607;
                return null;
            case 23:
                return new C6074();
            case 24:
                Thread.sleep(3000L);
                AbstractC3055.m6639(AbstractC6358.f17507);
                System.exit(0);
                throw new RuntimeException(AbstractC8405.m13972(1275));
            case 25:
                return new C7103(C6735.f18163, 0);
            case 26:
                return new C6835();
            case 27:
                return new C7103(C6735.f18163, 0);
            case 28:
                return new C7103(C7135.f19089, 0);
            default:
                return new C7103(C6758.f18190, 0);
        }
    }

    public /* synthetic */ C2558(int i) {
        this.f7700 = i;
    }
}
