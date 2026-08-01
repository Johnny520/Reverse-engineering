package p305;

import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0107;
import androidx.compose.ui.text.font.C1979;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.InterfaceC1972;
import androidx.compose.ui.text.font.InterfaceC1982;
import androidx.profileinstaller.InterfaceC2440;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.C2989;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3022;
import de.robv.android.xposed.XC_MethodHook;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.javaplugin.C5553;
import okhttp3.Protocol;
import p000.C6078;
import p000.InterfaceC6083;
import p000.InterfaceC6089;
import p005.C6101;
import p005.C6104;
import p005.C6105;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.InterfaceC6315;
import p218.InterfaceC7972;
import p316.C8675;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8631 implements InterfaceC4360, InterfaceC1982, InterfaceC1972, InterfaceC2440, InterfaceC7972, InterfaceC3022, InterfaceC6089, InterfaceC6315, InterfaceC6294, InterfaceC4722 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C8631 f24228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24229;

    public C8631() {
        this.f24229 = 22;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m14289(C6104 c6104) {
        C0107 c0107 = C6104.f16663;
        if (C6104.f16666 == null) {
            C6104.f16666 = new C6104();
            C6105 c6105 = new C6105("Okio Watchdog");
            c6105.setDaemon(true);
            c6105.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c6104.f16654;
        boolean z = c6104.f16656;
        if (j != 0 && z) {
            c6104.f16670 = Math.min(j, c6104.mo11459() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c6104.f16670 = jNanoTime + j;
        } else {
            if (!z) {
                C5553.m10813();
                return;
            }
            c6104.f16670 = c6104.mo11459();
        }
        C0107 c01072 = C6104.f16663;
        int i = c01072.f314 + 1;
        c01072.f314 = i;
        C6104[] c6104Arr = (C6104[]) c01072.f315;
        if (i == c6104Arr.length) {
            C6104[] c6104Arr2 = new C6104[i * 2];
            AbstractC4346.m8837(0, 0, c6104Arr, 14, c6104Arr2);
            c01072.f315 = c6104Arr2;
        }
        c01072.m346(i, c6104);
        if (c6104.f16668 == 1) {
            C6104.f16664.signal();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Typeface m14290(String str, C1988 c1988, int i) {
        if (i == 0 && AbstractC4394.m8917(c1988, C1988.f5875) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM14362 = C8675.m14362(c1988, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM14362) : Typeface.create(str, iM14362);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m14291(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).getProtocol());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static byte[] m14292(List list) {
        list.getClass();
        C6101 c6101 = new C6101();
        for (String str : m14291(list)) {
            c6101.m11474(str.length());
            c6101.m11498(str);
        }
        return c6101.m11489(c6101.f16657);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C6104 m14293() throws InterruptedException {
        C0107 c0107 = C6104.f16663;
        C6104 c6104 = ((C6104[]) c0107.f315)[1];
        if (c6104 == null) {
            long jNanoTime = System.nanoTime();
            C6104.f16664.await(C6104.f16665, TimeUnit.MILLISECONDS);
            if (((C6104[]) c0107.f315)[1] != null || System.nanoTime() - jNanoTime < C6104.f16662) {
                return null;
            }
            return C6104.f16666;
        }
        long jNanoTime2 = c6104.f16670 - System.nanoTime();
        if (jNanoTime2 > 0) {
            C6104.f16664.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c0107.m343(c6104);
        c6104.f16669 = 2;
        return c6104;
    }

    @Override // p218.InterfaceC7972
    public Object create() {
        return new C2989();
    }

    public String toString() {
        switch (this.f24229) {
            case 3:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Typeface mo3686(C1979 c1979, C1988 c1988, int i) {
        String strConcat = c1979.f5863;
        int i2 = c1988.f5876 / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceM14290 = m14290(strConcat, c1988, i);
            if (!AbstractC4394.m8917(typefaceM14290, Typeface.create(Typeface.DEFAULT, C8675.m14362(c1988, i))) && !AbstractC4394.m8917(typefaceM14290, m14290(null, c1988, i))) {
                typeface = typefaceM14290;
            }
        }
        return typeface == null ? m14290(c1979.f5863, c1988, i) : typeface;
    }

    @Override // p000.InterfaceC6089
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC6083 mo11378(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                C5919.m11243(AbstractC9032.m14590(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new C6078(superclass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4721 mo9277(int i) {
        return ProtoBuf$MemberKind.valueOf(i);
    }

    @Override // p000.InterfaceC6089
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo11379(SSLSocket sSLSocket) {
        return AbstractC5138.m10125(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
        View childAt;
        LinearLayout linearLayout = (LinearLayout) AbstractC6317.m11830(LinearLayout.class, methodHookParam.thisObject);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= linearLayout.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = linearLayout.getChildAt(i);
            if ((childAt instanceof TextView) && ((TextView) childAt).getText().toString().equals("\u7fa4\u804a\u4fe1\u606f")) {
                i2 = i;
            }
            if (childAt instanceof LinearLayout) {
                View childAt2 = ((LinearLayout) childAt).getChildAt(0);
                if (childAt2 instanceof RelativeLayout) {
                    View childAt3 = ((RelativeLayout) childAt2).getChildAt(0);
                    if ((childAt3 instanceof TextView) && ((TextView) childAt3).getText().toString().equals("\u7fa4\u5e94\u7528")) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        if (childAt == null || i2 == 0) {
            return;
        }
        linearLayout.removeView(childAt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC2904.m6267(linearLayout.getContext(), 16.0f) + layoutParams.topMargin;
        linearLayout.addView(childAt, i2, layoutParams);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3022
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo6473(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public Typeface mo3687(C1988 c1988, int i) {
        return m14290(null, c1988, i);
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo4155(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3022
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo6474(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4159() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p032.InterfaceC6315
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo8287(Method method) {
        int i = this.f24229;
        Class<?> cls = Void.TYPE;
        switch (i) {
            case 26:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC6318.m11838("kotlin.jvm.functions.Function0"))) {
                }
                break;
            default:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC6318.m11838("kotlin.jvm.functions.Function0"))) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ C8631(int i) {
        this.f24229 = i;
    }

    public C8631(int[] iArr, int[] iArr2) {
        this.f24229 = 2;
    }
}
