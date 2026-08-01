package io.ktor.client.plugins.api;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
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
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import com.bumptech.glide.load.resource.bitmap.C3015;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3022;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3035;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.materialkolor.dynamiccolor.C3802;
import com.materialkolor.scheme.DynamicScheme$Platform;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.text.AbstractC5131;
import lin.xposed.hook.javaplugin.view.C5548;
import okio.ByteString;
import org.slf4j.event.InterfaceC5746;
import org.slf4j.helpers.NOPLogger;
import p000.AbstractC6087;
import p002.C6093;
import p010.AbstractC6157;
import p017.AbstractC6233;
import p031.C6309;
import p032.AbstractC6318;
import p032.InterfaceC6315;
import p033.AbstractC6325;
import p035.C6343;
import p139.C7533;
import p160.AbstractC7635;
import p160.C7636;
import p175.AbstractC7738;
import p257.C8207;
import p263.AbstractC8255;
import p263.C8254;
import p266.C8262;
import p349.C8865;
import p400.InterfaceC9156;
import p400.InterfaceC9157;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3885 implements InterfaceC0322, InterfaceC0847, InterfaceC1972, InterfaceC1620, InterfaceC2212, InterfaceC2440, InterfaceC2978, InterfaceC3035, InterfaceC3022, InterfaceC5746, InterfaceC9157, InterfaceC6315, InterfaceC5794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12089;

    public C3885(C4844 c4844, EmptyList emptyList) {
        this.f12089 = 29;
        emptyList.getClass();
        String str = C4844.f14120;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static double m8274(C8254 c8254) {
        return AbstractC6325.m11867(c8254, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static double m8275(double d, double d2, double d3, boolean z) {
        C8254 c8254M13806 = AbstractC8255.m13806(d, d2, d3);
        double d4 = d3;
        while (true) {
            double d5 = c8254M13806.f22856;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            C8254 c8254M138062 = AbstractC8255.m13806(d, d2, d3);
            if (d5 < c8254M138062.f22856) {
                d4 = d3;
                c8254M13806 = c8254M138062;
            }
        }
        return d4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Typeface m8276(String str, C1988 c1988, int i) {
        if (i == 0 && AbstractC4394.m8917(c1988, C1988.f5875) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1988.f5876, i == 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C2422 m8277(InterfaceC2421 interfaceC2421, C2418 c2418, int i) {
        InterfaceC2427 defaultViewModelProviderFactory = c2418;
        if ((i & 2) != 0) {
            defaultViewModelProviderFactory = interfaceC2421 instanceof InterfaceC2405 ? ((InterfaceC2405) interfaceC2421).getDefaultViewModelProviderFactory() : C7533.f20420;
        }
        AbstractC7635 defaultViewModelCreationExtras = interfaceC2421 instanceof InterfaceC2405 ? ((InterfaceC2405) interfaceC2421).getDefaultViewModelCreationExtras() : C7636.f20730;
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        return new C2422(interfaceC2421.getViewModelStore(), defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final double m8278(C8254 c8254, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8282 = m8282(c8254);
        int i = 28;
        if (dynamicScheme$Platform != DynamicScheme$Platform.PHONE && (dM8282 < 250.0d || dM8282 >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final double m8279(C8254 c8254, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        double dM8274 = m8274(c8254);
        return dynamicScheme$Platform == DynamicScheme$Platform.PHONE ? z ? (dM8274 < 105.0d || dM8274 >= 125.0d) ? 14 : 6 : 18 : 12;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static double m8280(C8262 c8262, double d, double d2) {
        return AbstractC6087.m11415(m8275(c8262.f22879, c8262.f22878, 0.0d, false), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static double m8281(C8262 c8262, double d, double d2) {
        return AbstractC6087.m11415(m8275(c8262.f22879, c8262.f22878 * 1.0d, 100.0d, true), d, d2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static double m8282(C8254 c8254) {
        return AbstractC6325.m11867(c8254, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C3802 m8283(double d) {
        return d == 1.5d ? new C3802(1.5d, 1.5d, 3.0d, 5.5d) : d == 3.0d ? new C3802(3.0d, 3.0d, 4.5d, 7.0d) : d == 4.5d ? new C3802(4.5d, 4.5d, 7.0d, 11.0d) : d == 6.0d ? new C3802(6.0d, 6.0d, 7.0d, 11.0d) : d == 7.0d ? new C3802(7.0d, 7.0d, 11.0d, 21.0d) : d == 9.0d ? new C3802(9.0d, 9.0d, 11.0d, 21.0d) : d == 11.0d ? new C3802(11.0d, 11.0d, 21.0d, 21.0d) : d == 21.0d ? new C3802(21.0d, 21.0d, 21.0d, 21.0d) : new C3802(d, d, 7.0d, 21.0d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final String m8284(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = C6093.f16647;
        int size = byteString.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = (i5 + size) / 2;
            while (i6 > -1 && byteString.getByte(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.getByte(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = byteStringArr[i10].getByte(i11);
                    byte[] bArr = AbstractC6233.f17181;
                    int i13 = b & DefaultClassResolver.NAME;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = byteString.getByte(i7 + i12);
                byte[] bArr2 = AbstractC6233.f17181;
                i4 = i3 - (b2 & DefaultClassResolver.NAME);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].size() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int size2 = byteStringArr[i10].size() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        size2 += byteStringArr[i15].size();
                    }
                    if (size2 >= i14) {
                        if (size2 <= i14) {
                            return byteString.substring(i7, i9 + i7).string(AbstractC5131.f14688);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            size = i6;
        }
        return null;
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        AbstractC3056.m6668(-3937677161528559015L);
        AbstractC3056.m6668(-3937694049339966887L);
        String strM6668 = AbstractC3056.m6668(-3937694057929901479L);
        String str = AbstractC6157.f16779;
        AbstractC6157.m11574(strM6668, th.toString(), th, true);
        C6343.f17469.m14640(Boolean.FALSE, AbstractC3056.m6668(-3937676641837516199L));
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) throws InterruptedException {
        AbstractC3056.m6668(-3937677161528559015L);
        AbstractC3056.m6668(-3937677148643657127L);
        QSResult qSResult = (QSResult) c5754.f15756;
        if (qSResult == null || !qSResult.isSuccess()) {
            C6343.f17469.m14640(Boolean.FALSE, AbstractC3056.m6668(-3937676641837516199L));
            return;
        }
        Object data = qSResult.getData();
        Boolean bool = Boolean.TRUE;
        if (AbstractC4394.m8917(data, bool)) {
            C6343.f17469.m14640(Boolean.FALSE, AbstractC3056.m6668(-3937676641837516199L));
            return;
        }
        C6343.f17469.m14640(bool, AbstractC3056.m6668(-3937676641837516199L));
        C6343 c6343 = C6343.f17470;
        String msg = qSResult.getMsg();
        AbstractC3056.m6668(-3937694169599051175L);
        msg.getClass();
        c6343.getClass();
        while (AbstractC7738.m13031() == null) {
            Thread.sleep(100L);
        }
        C8207 c8207 = new C8207();
        c8207.f22615 = AbstractC3056.m6668(-3937577501107422631L);
        c8207.mo13704();
        c8207.f22627 = msg;
        c8207.mo13704();
        c8207.mo13702(AbstractC3056.m6668(-3937640074485958055L), new C5548(2));
        c8207.m13714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m8285() {
        C8207 c8207 = new C8207();
        c8207.f22615 = AbstractC3056.m6668(-3937677075629213095L);
        c8207.mo13704();
        c8207.f22627 = AbstractC3056.m6668(-3937677140053722535L);
        c8207.mo13704();
        c8207.f22626 = AbstractC3056.m6668(-3937677122873853351L);
        c8207.mo13704();
        c8207.m13714();
        C8865.m14508().m14498(0).mo11106(new C6309(this, c8207, 0));
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Typeface mo3686(C1979 c1979, C1988 c1988, int i) {
        return m8276(c1979.f5863, c1988, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo6397(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Bitmap mo6398(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3022
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo6473(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f12089) {
            case 18:
                mediaMetadataRetriever.setDataSource(new C3015((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo943() {
        return 0;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public AbstractC0343 mo444(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return j < 0 ? abstractC0343 : abstractC03432;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public Typeface mo3687(C1988 c1988, int i) {
        return m8276(null, c1988, i);
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public int mo945() {
        return 0;
    }

    @Override // p400.InterfaceC9157
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC9156 mo8286(String str) {
        return NOPLogger.NOP_LOGGER;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3022
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo6474(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f12089) {
            case 18:
                mediaExtractor.setDataSource(new C3015((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // p032.InterfaceC6315
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean mo8287(Method method) {
        return method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].equals(AbstractC6318.m11838(AbstractC3056.m6668(-3937553702693635495L)));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public Bitmap mo6401(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo6399() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3035
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo295() {
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4159() {
    }

    public /* synthetic */ C3885(int i) {
        this.f12089 = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo6400(int i) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3035
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo282(Bitmap bitmap, InterfaceC2978 interfaceC2978) {
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo4155(int i, Object obj) {
    }

    @Override // androidx.core.view.InterfaceC2212
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // androidx.core.view.InterfaceC2212
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public AbstractC0343 mo451(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return abstractC03433;
    }
}
