package io.ktor.client.plugins.api;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0954;
import androidx.compose.animation.core.AbstractC1189;
import androidx.compose.animation.core.InterfaceC1168;
import androidx.compose.foundation.text.input.internal.selection.InterfaceC1685;
import androidx.compose.p001ui.input.nestedscroll.InterfaceC2455;
import androidx.compose.p001ui.text.font.C2813;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.InterfaceC2806;
import androidx.core.view.InterfaceC3045;
import androidx.lifecycle.C3251;
import androidx.lifecycle.C3255;
import androidx.lifecycle.InterfaceC3238;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.InterfaceC3260;
import androidx.profileinstaller.InterfaceC3273;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.load.resource.bitmap.C3848;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3855;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3868;
import com.materialkolor.dynamiccolor.C4635;
import com.materialkolor.scheme.DynamicScheme$Platform;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.javaplugin.C6385;
import lin.xposed.hook.javaplugin.view.C6380;
import org.slf4j.event.InterfaceC6577;
import org.slf4j.helpers.NOPLogger;
import p020.C6924;
import p020.C6925;
import p026.AbstractC7017;
import p034.C7073;
import p034.InterfaceC7078;
import p034.InterfaceC7084;
import p048.C7157;
import p049.AbstractC7166;
import p049.InterfaceC7163;
import p050.AbstractC7176;
import p052.C7194;
import p155.C8363;
import p176.AbstractC8465;
import p176.C8466;
import p273.C9037;
import p279.AbstractC9085;
import p279.C9084;
import p282.C9092;
import p303.AbstractC9234;
import p361.C9663;
import p414.InterfaceC9970;
import p414.InterfaceC9971;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4718 implements InterfaceC1168, InterfaceC1685, InterfaceC2806, InterfaceC2455, InterfaceC3045, InterfaceC3273, InterfaceC3811, InterfaceC3868, InterfaceC3855, InterfaceC6577, InterfaceC9971, InterfaceC7084, InterfaceC7163, InterfaceC6625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12439;

    public C4718(C5677 c5677, EmptyList emptyList) {
        this.f12439 = 29;
        emptyList.getClass();
        String str = C5677.f14469;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static double m8820(C9092 c9092, double d, double d2) {
        return AbstractC3400.m5632(m8830(c9092.f23223, c9092.f23222, 0.0d, false), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static double m8821(C9092 c9092, double d, double d2) {
        return AbstractC3400.m5632(m8830(c9092.f23223, c9092.f23222 * 1.0d, 100.0d, true), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static C3255 m8822(InterfaceC3254 interfaceC3254, C3251 c3251, int i) {
        InterfaceC3260 defaultViewModelProviderFactory = c3251;
        if ((i & 2) != 0) {
            defaultViewModelProviderFactory = interfaceC3254 instanceof InterfaceC3238 ? ((InterfaceC3238) interfaceC3254).getDefaultViewModelProviderFactory() : C8363.f20760;
        }
        AbstractC8465 defaultViewModelCreationExtras = interfaceC3254 instanceof InterfaceC3238 ? ((InterfaceC3238) interfaceC3254).getDefaultViewModelCreationExtras() : C8466.f21070;
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        return new C3255(interfaceC3254.getViewModelStore(), defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static C6924 m8823() throws InterruptedException {
        C0954 c0954 = C6924.f16998;
        C6924 c6924 = ((C6924[]) c0954.f660)[1];
        if (c6924 == null) {
            long jNanoTime = System.nanoTime();
            C6924.f16999.await(C6924.f17000, TimeUnit.MILLISECONDS);
            if (((C6924[]) c0954.f660)[1] != null || System.nanoTime() - jNanoTime < C6924.f16997) {
                return null;
            }
            return C6924.f17001;
        }
        long jNanoTime2 = c6924.f17005 - System.nanoTime();
        if (jNanoTime2 > 0) {
            C6924.f16999.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c0954.m904(c6924);
        c6924.f17004 = 2;
        return c6924;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final void m8824(C6924 c6924) {
        C0954 c0954 = C6924.f16998;
        if (C6924.f17001 == null) {
            C6924.f17001 = new C6924();
            C6925 c6925 = new C6925("Okio Watchdog");
            c6925.setDaemon(true);
            c6925.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c6924.f16989;
        boolean z = c6924.f16991;
        if (j != 0 && z) {
            c6924.f17005 = Math.min(j, c6924.mo12011() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c6924.f17005 = jNanoTime + j;
        } else {
            if (!z) {
                C6385.m11429();
                return;
            }
            c6924.f17005 = c6924.mo12011();
        }
        C0954 c09542 = C6924.f16998;
        int i = c09542.f659 + 1;
        c09542.f659 = i;
        C6924[] c6924Arr = (C6924[]) c09542.f660;
        if (i == c6924Arr.length) {
            C6924[] c6924Arr2 = new C6924[i * 2];
            AbstractC5179.m9399(0, 0, c6924Arr, 14, c6924Arr2);
            c09542.f660 = c6924Arr2;
        }
        c09542.m907(i, c6924);
        if (c6924.f17003 == 1) {
            C6924.f16999.signal();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final double m8825(C9084 c9084, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8828 = m8828(c9084);
        int i = 28;
        if (dynamicScheme$Platform != DynamicScheme$Platform.PHONE && (dM8828 < 250.0d || dM8828 >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double m8826(C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8829 = m8829(c9084);
        return dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? (dM8829 < 105.0d || dM8829 >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4635 m8827(double d) {
        return d == 1.5d ? new C4635(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new C4635(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new C4635(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new C4635(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new C4635(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new C4635(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new C4635(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new C4635(21.0d, 21.0d, 21.0d, 21.0d) : new C4635(d, d, 7.0d, 21.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static double m8828(C9084 c9084) {
        return AbstractC7176.m12454(c9084, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static double m8829(C9084 c9084) {
        return AbstractC7176.m12454(c9084, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static double m8830(double d, double d2, double d3, boolean z) {
        C9084 c9084M14382 = AbstractC9085.m14382(d, d2, d3);
        double d4 = d3;
        while (true) {
            double d5 = c9084M14382.f23200;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            C9084 c9084M143822 = AbstractC9085.m14382(d, d2, d3);
            if (d5 < c9084M143822.f23200) {
                d4 = d3;
                c9084M14382 = c9084M143822;
            }
        }
        return d4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Typeface m8831(String str, C2822 c2822, int i) {
        if (i == 0 && AbstractC5227.m9466(c2822, C2822.f6221) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c2822.f6222, i == 1);
    }

    @Override // retrofit2.InterfaceC6625
    public void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜");
        String strM14531 = AbstractC9234.m14531(1251);
        String str = AbstractC7017.f17361;
        AbstractC7017.m12164(strM14531, th.toString(), th, true);
        C7194.f17864.m15236(Boolean.FALSE, AbstractC9234.m14531(1249));
    }

    @Override // retrofit2.InterfaceC6625
    public void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) throws InterruptedException {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14531(1239);
        QSResult qSResult = (QSResult) c6585.f16101;
        if (qSResult == null || !qSResult.isSuccess()) {
            C7194.f17864.m15236(Boolean.FALSE, AbstractC9234.m14531(1249));
            return;
        }
        Object data = qSResult.getData();
        Boolean bool = Boolean.TRUE;
        if (AbstractC5227.m9466(data, bool)) {
            C7194.f17864.m15236(Boolean.FALSE, AbstractC9234.m14531(1249));
            return;
        }
        C7194.f17864.m15236(bool, AbstractC9234.m14531(1249));
        C7194 c7194 = C7194.f17865;
        String msg = qSResult.getMsg();
        AbstractC9234.m14531(1250);
        msg.getClass();
        c7194.getClass();
        while (AbstractC3887.m7213() == null) {
            Thread.sleep(100L);
        }
        C9037 c9037 = new C9037();
        c9037.f22959 = AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
        c9037.mo14280();
        c9037.f22971 = msg;
        c9037.mo14280();
        c9037.mo14278(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C6380(2));
        c9037.m14290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m8832() {
        C9037 c9037 = new C9037();
        c9037.f22959 = AbstractC9234.m14531(1240);
        c9037.mo14280();
        c9037.f22971 = AbstractC9234.m14531(1241);
        c9037.mo14280();
        c9037.f22970 = AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵");
        c9037.mo14280();
        c9037.m14290();
        C9663.m15048().m15072(0).mo11722(new C7157(this, c9037, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo7015(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Bitmap mo7016(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p034.InterfaceC7084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo8833(SSLSocket sSLSocket) {
        return AbstractC5971.m10698(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return j < 0 ? abstractC1189 : abstractC11892;
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo1504() {
        return 0;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3855
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo7093(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f12439) {
            case 18:
                mediaMetadataRetriever.setDataSource(new C3848((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p049.InterfaceC7163
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean mo8834(Method method) {
        return method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].equals(AbstractC7166.m12425(AbstractC9234.m14531(80)));
    }

    @Override // androidx.compose.p001ui.text.font.InterfaceC2806
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public Typeface mo4256(C2822 c2822, int i) {
        return m8831(null, c2822, i);
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public int mo1505() {
        return 0;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public Bitmap mo7019(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3855
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo7094(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f12439) {
            case 18:
                mediaExtractor.setDataSource(new C3848((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // androidx.compose.p001ui.text.font.InterfaceC2806
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Typeface mo4257(C2813 c2813, C2822 c2822, int i) {
        return m8831(c2813.f6209, c2822, i);
    }

    @Override // p414.InterfaceC9971
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC9970 mo8835(String str) {
        return NOPLogger.NOP_LOGGER;
    }

    @Override // p034.InterfaceC7084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7078 mo8836(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                C6755.m11863(AbstractC0900.m714(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new C7073(superclass);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo7018() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3868
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo856() {
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4728() {
    }

    public /* synthetic */ C4718(int i) {
        this.f12439 = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo7017(int i) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3868
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo842(Bitmap bitmap, InterfaceC3811 interfaceC3811) {
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo4729(int i, Object obj) {
    }

    @Override // androidx.core.view.InterfaceC3045
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // androidx.core.view.InterfaceC3045
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return abstractC11893;
    }
}
