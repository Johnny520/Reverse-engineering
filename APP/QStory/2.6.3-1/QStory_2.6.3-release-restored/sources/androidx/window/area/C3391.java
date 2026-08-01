package androidx.window.area;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.C3420;
import androidx.window.layout.InterfaceC3430;
import androidx.window.layout.adapter.extensions.C3413;
import androidx.window.layout.adapter.extensions.C3414;
import androidx.window.layout.adapter.extensions.C3415;
import androidx.window.layout.adapter.extensions.C3416;
import androidx.window.layout.adapter.extensions.C3417;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3897;
import io.ktor.client.plugins.api.C4718;
import io.ktor.server.response.C4965;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5039;
import io.ktor.util.debug.AbstractC5019;
import java.nio.file.FileSystems;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C6008;
import kotlin.text.CharDirectionality;
import p052.AbstractC7187;
import p068.InterfaceC7372;
import p072.C7564;
import p072.C7587;
import p072.C7664;
import p091.C7787;
import p093.C7800;
import p103.C7932;
import p103.C7964;
import p163.AbstractC8392;
import p163.AbstractC8395;
import top.yukonga.miuix.kmp.utils.AbstractC6902;
import top.yukonga.miuix.kmp.utils.C6903;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3391 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8045;

    @Override // p068.InterfaceC7372
    public final Object invoke() throws InterruptedException {
        WindowLayoutComponent windowLayoutComponentM5672;
        int i = this.f8045;
        int i2 = 3;
        C6008 c6008 = C6008.f15084;
        WindowAreaComponent windowAreaComponentM5619 = null;
        switch (i) {
            case 0:
                try {
                    ClassLoader classLoader = AbstractC3400.class.getClassLoader();
                    if (classLoader != null) {
                        windowAreaComponentM5619 = new C3394(classLoader).m5619();
                    }
                    break;
                } catch (Throwable unused) {
                    if (AbstractC8395.f20823 == VerificationMode.LOG) {
                        Log.d(AbstractC3399.f8064, "Failed to load WindowExtensions");
                    }
                }
                return (Build.VERSION.SDK_INT <= 29 || windowAreaComponentM5619 == null || AbstractC8392.m13351() < 3) ? new C3396() : new C3402(windowAreaComponentM5619);
            case 1:
                try {
                    ClassLoader classLoader2 = InterfaceC3430.class.getClassLoader();
                    C3420 c3420 = classLoader2 != null ? new C3420(classLoader2, new C7800(classLoader2)) : null;
                    if (c3420 == null || (windowLayoutComponentM5672 = c3420.m5672()) == null) {
                        return null;
                    }
                    C7800 c7800 = new C7800(classLoader2);
                    int iM13351 = AbstractC8392.m13351();
                    return iM13351 >= 9 ? new C3413(windowLayoutComponentM5672, c7800) : iM13351 >= 6 ? new C3414(windowLayoutComponentM5672, c7800) : iM13351 >= 2 ? new C3415(windowLayoutComponentM5672, c7800) : iM13351 == 1 ? new C3416(windowLayoutComponentM5672, c7800) : new C3417();
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
                return AbstractC5049.m9186(true);
            case 4:
                return new C4965();
            case 5:
                try {
                    return FileSystems.getDefault().newWatchService();
                } catch (NoClassDefFoundError unused4) {
                    return null;
                }
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return Boolean.valueOf(AbstractC5019.m9112());
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
                return AbstractC3897.m7383(new C5039(i2));
            case 16:
                return CharDirectionality.directionalityMap_delegate$lambda$0();
            case 17:
                return Boolean.FALSE;
            case 18:
                new C7787(25).m12821();
                return c6008;
            case 19:
                new C4718(26).m8832();
                return c6008;
            case 20:
                return new SnapshotStateList();
            case 21:
                return new SnapshotStateList();
            case 22:
                C2169 c2169 = AbstractC6902.f16952;
                return null;
            case 23:
                return new C6903();
            case 24:
                Thread.sleep(3000L);
                AbstractC3887.m7199(AbstractC7187.f17852);
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 25:
                return new C7932(C7564.f18508, 0);
            case 26:
                return new C7664();
            case 27:
                return new C7932(C7564.f18508, 0);
            case 28:
                return new C7932(C7964.f19434, 0);
            default:
                return new C7932(C7587.f18535, 0);
        }
    }

    public /* synthetic */ C3391(int i) {
        this.f8045 = i;
    }
}
