package io.ktor.client.plugins.api;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0107;
import androidx.compose.animation.core.AbstractC0343;
import androidx.compose.animation.core.InterfaceC0322;
import androidx.compose.foundation.text.input.internal.selection.InterfaceC0847;
import androidx.compose.ui.input.nestedscroll.InterfaceC1620;
import androidx.compose.ui.text.font.C1979;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.InterfaceC1972;
import androidx.core.view.InterfaceC2212;
import androidx.lifecycle.C2418;
import androidx.lifecycle.C2422;
import androidx.lifecycle.InterfaceC2405;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.InterfaceC2427;
import androidx.profileinstaller.InterfaceC2440;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.bumptech.glide.load.resource.bitmap.C3016;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3023;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3036;
import com.materialkolor.dynamiccolor.C3803;
import com.materialkolor.scheme.DynamicScheme$Platform;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.javaplugin.C5554;
import lin.xposed.hook.javaplugin.view.C5549;
import org.slf4j.event.InterfaceC5747;
import org.slf4j.helpers.NOPLogger;
import p004.C6095;
import p004.C6096;
import p010.AbstractC6188;
import p018.C6244;
import p018.InterfaceC6249;
import p018.InterfaceC6255;
import p032.C6328;
import p033.AbstractC6337;
import p033.InterfaceC6334;
import p034.AbstractC6347;
import p036.C6365;
import p139.C7534;
import p160.AbstractC7636;
import p160.C7637;
import p257.C8208;
import p263.AbstractC8256;
import p263.C8255;
import p266.C8263;
import p287.AbstractC8405;
import p345.C8834;
import p398.InterfaceC9141;
import p398.InterfaceC9142;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3886 implements InterfaceC0322, InterfaceC0847, InterfaceC1972, InterfaceC1620, InterfaceC2212, InterfaceC2440, InterfaceC2979, InterfaceC3036, InterfaceC3023, InterfaceC5747, InterfaceC9142, InterfaceC6255, InterfaceC6334, InterfaceC5795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12094;

    public C3886(C4845 c4845, EmptyList emptyList) {
        this.f12094 = 29;
        emptyList.getClass();
        String str = C4845.f14124;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static double m8261(C8263 c8263, double d, double d2) {
        return AbstractC2567.m5072(m8271(c8263.f22878, c8263.f22877, 0.0d, false), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static double m8262(C8263 c8263, double d, double d2) {
        return AbstractC2567.m5072(m8271(c8263.f22878, c8263.f22877 * 1.0d, 100.0d, true), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static C2422 m8263(InterfaceC2421 interfaceC2421, C2418 c2418, int i) {
        InterfaceC2427 defaultViewModelProviderFactory = c2418;
        if ((i & 2) != 0) {
            defaultViewModelProviderFactory = interfaceC2421 instanceof InterfaceC2405 ? ((InterfaceC2405) interfaceC2421).getDefaultViewModelProviderFactory() : C7534.f20415;
        }
        AbstractC7636 defaultViewModelCreationExtras = interfaceC2421 instanceof InterfaceC2405 ? ((InterfaceC2405) interfaceC2421).getDefaultViewModelCreationExtras() : C7637.f20725;
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        return new C2422(interfaceC2421.getViewModelStore(), defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static C6095 m8264() throws InterruptedException {
        C0107 c0107 = C6095.f16653;
        C6095 c6095 = ((C6095[]) c0107.f315)[1];
        if (c6095 == null) {
            long jNanoTime = System.nanoTime();
            C6095.f16654.await(C6095.f16655, TimeUnit.MILLISECONDS);
            if (((C6095[]) c0107.f315)[1] != null || System.nanoTime() - jNanoTime < C6095.f16652) {
                return null;
            }
            return C6095.f16656;
        }
        long jNanoTime2 = c6095.f16660 - System.nanoTime();
        if (jNanoTime2 > 0) {
            C6095.f16654.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c0107.m344(c6095);
        c6095.f16659 = 2;
        return c6095;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final void m8265(C6095 c6095) {
        C0107 c0107 = C6095.f16653;
        if (C6095.f16656 == null) {
            C6095.f16656 = new C6095();
            C6096 c6096 = new C6096("Okio Watchdog");
            c6096.setDaemon(true);
            c6096.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c6095.f16644;
        boolean z = c6095.f16646;
        if (j != 0 && z) {
            c6095.f16660 = Math.min(j, c6095.mo11452() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c6095.f16660 = jNanoTime + j;
        } else {
            if (!z) {
                C5554.m10870();
                return;
            }
            c6095.f16660 = c6095.mo11452();
        }
        C0107 c01072 = C6095.f16653;
        int i = c01072.f314 + 1;
        c01072.f314 = i;
        C6095[] c6095Arr = (C6095[]) c01072.f315;
        if (i == c6095Arr.length) {
            C6095[] c6095Arr2 = new C6095[i * 2];
            AbstractC4347.m8840(0, 0, c6095Arr, 14, c6095Arr2);
            c01072.f315 = c6095Arr2;
        }
        c01072.m347(i, c6095);
        if (c6095.f16658 == 1) {
            C6095.f16654.signal();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final double m8266(C8255 c8255, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8269 = m8269(c8255);
        int i = 28;
        if (dynamicScheme$Platform != DynamicScheme$Platform.PHONE && (dM8269 < 250.0d || dM8269 >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double m8267(C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8270 = m8270(c8255);
        return dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? (dM8270 < 105.0d || dM8270 >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C3803 m8268(double d) {
        return d == 1.5d ? new C3803(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new C3803(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new C3803(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new C3803(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new C3803(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new C3803(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new C3803(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new C3803(21.0d, 21.0d, 21.0d, 21.0d) : new C3803(d, d, 7.0d, 21.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static double m8269(C8255 c8255) {
        return AbstractC6347.m11895(c8255, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static double m8270(C8255 c8255) {
        return AbstractC6347.m11895(c8255, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static double m8271(double d, double d2, double d3, boolean z) {
        C8255 c8255M13823 = AbstractC8256.m13823(d, d2, d3);
        double d4 = d3;
        while (true) {
            double d5 = c8255M13823.f22855;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            C8255 c8255M138232 = AbstractC8256.m13823(d, d2, d3);
            if (d5 < c8255M138232.f22855) {
                d4 = d3;
                c8255M13823 = c8255M138232;
            }
        }
        return d4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Typeface m8272(String str, C1988 c1988, int i) {
        if (i == 0 && AbstractC4395.m8907(c1988, C1988.f5876) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1988.f5877, i == 1);
    }

    @Override // retrofit2.InterfaceC5795
    public void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵"); /* decoded-inline: call */
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜"); /* decoded-inline: t */
        String strM13972 = AbstractC8405.m13972(1251); /* decoded: m13972(1251)=ServiceValidCheck */
        String str = AbstractC6188.f17016;
        AbstractC6188.m11605(strM13972, th.toString(), th, true);
        C6365.f17519.m14677(Boolean.FALSE, AbstractC8405.m13972(1249)); /* decoded: m13972(1249)=disabled */
    }

    @Override // retrofit2.InterfaceC5795
    public void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) throws InterruptedException {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵"); /* decoded-inline: call */
        AbstractC8405.m13972(1239); /* decoded: m13972(1239)=response */
        QSResult qSResult = (QSResult) c5755.f15756;
        if (qSResult == null || !qSResult.isSuccess()) {
            C6365.f17519.m14677(Boolean.FALSE, AbstractC8405.m13972(1249)); /* decoded: m13972(1249)=disabled */
            return;
        }
        Object data = qSResult.getData();
        Boolean bool = Boolean.TRUE;
        if (AbstractC4395.m8907(data, bool)) {
            C6365.f17519.m14677(Boolean.FALSE, AbstractC8405.m13972(1249)); /* decoded: m13972(1249)=disabled */
            return;
        }
        C6365.f17519.m14677(bool, AbstractC8405.m13972(1249)); /* decoded: m13972(1249)=disabled */
        C6365 c6365 = C6365.f17520;
        String msg = qSResult.getMsg();
        AbstractC8405.m13972(1250); /* decoded: m13972(1250)=getMsg(...) */
        msg.getClass();
        c6365.getClass();
        while (AbstractC3055.m6653() == null) {
            Thread.sleep(100L);
        }
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"); /* decoded-inline: QStory */
        c8208.mo13721();
        c8208.f22626 = msg;
        c8208.mo13721();
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C5549(2)); /* decoded-inline: 确定 */
        c8208.m13731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m8273() {
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(1240); /* decoded: m13972(1240)=历史更新日志 */
        c8208.mo13721();
        c8208.f22626 = AbstractC8405.m13972(1241); /* decoded: m13972(1241)=加载中 */
        c8208.mo13721();
        c8208.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵"); /* decoded-inline: 确认 */
        c8208.mo13721();
        c8208.m13731();
        C8834.m14489().m14513(0).mo11163(new C6328(this, c8208, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo6455(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Bitmap mo6456(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p018.InterfaceC6255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo8274(SSLSocket sSLSocket) {
        return AbstractC5139.m10139(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public AbstractC0343 mo443(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return j < 0 ? abstractC0343 : abstractC03432;
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo944() {
        return 0;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3023
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo6533(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f12094) {
            case 18:
                mediaMetadataRetriever.setDataSource(new C3016((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p033.InterfaceC6334
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean mo8275(Method method) {
        return method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].equals(AbstractC6337.m11866(AbstractC8405.m13972(80))); /* decoded: m13972(80)=kotlin.jvm.functions.Function0 */
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public Typeface mo3696(C1988 c1988, int i) {
        return m8272(null, c1988, i);
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public int mo945() {
        return 0;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public Bitmap mo6459(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3023
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo6534(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f12094) {
            case 18:
                mediaExtractor.setDataSource(new C3016((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Typeface mo3697(C1979 c1979, C1988 c1988, int i) {
        return m8272(c1979.f5864, c1988, i);
    }

    @Override // p398.InterfaceC9142
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC9141 mo8276(String str) {
        return NOPLogger.NOP_LOGGER;
    }

    @Override // p018.InterfaceC6255
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6249 mo8277(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                C5925.m11304(AbstractC0053.m154(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new C6244(superclass);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo6458() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3036
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo296() {
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4168() {
    }

    public /* synthetic */ C3886(int i) {
        this.f12094 = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo6457(int i) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3036
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo282(Bitmap bitmap, InterfaceC2979 interfaceC2979) {
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo4169(int i, Object obj) {
    }

    @Override // androidx.core.view.InterfaceC2212
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // androidx.core.view.InterfaceC2212
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public AbstractC0343 mo446(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return abstractC03433;
    }
}
