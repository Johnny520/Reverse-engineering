package p321;

import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.text.font.C2813;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.InterfaceC2806;
import androidx.compose.p001ui.text.font.InterfaceC2816;
import androidx.profileinstaller.InterfaceC3273;
import com.bumptech.glide.load.engine.C3822;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3855;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import de.robv.android.xposed.XC_MethodHook;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.text.AbstractC5964;
import okhttp3.Protocol;
import okio.ByteString;
import p017.C6913;
import p020.C6921;
import p029.AbstractC7054;
import p034.AbstractC7082;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.InterfaceC7163;
import p234.InterfaceC8802;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9452 implements InterfaceC5193, InterfaceC2816, InterfaceC2806, InterfaceC3273, InterfaceC8802, InterfaceC3855, InterfaceC7163, InterfaceC7141, InterfaceC5555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C9452 f24564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24565;

    public C9452() {
        this.f24565 = 22;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Typeface m14867(String str, C2822 c2822, int i) {
        if (i == 0 && AbstractC5227.m9466(c2822, C2822.f6221) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM1729 = AbstractC1298.m1729(c2822, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM1729) : Typeface.create(str, iM1729);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static byte[] m14868(List list) {
        list.getClass();
        C6921 c6921 = new C6921();
        for (String str : m14869(list)) {
            c6921.m12029(str.length());
            c6921.m12050(str);
        }
        return c6921.m12043(c6921.f16992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ArrayList m14869(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).getProtocol());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14870(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = C6913.f16982;
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
                    byte[] bArr = AbstractC7054.f17503;
                    int i13 = b & DefaultClassResolver.NAME;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = byteString.getByte(i7 + i12);
                byte[] bArr2 = AbstractC7054.f17503;
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
                            return byteString.substring(i7, i9 + i7).string(AbstractC5964.f15033);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            size = i6;
        }
        return null;
    }

    @Override // p234.InterfaceC8802
    public Object create() {
        return new C3822();
    }

    public String toString() {
        switch (this.f24565) {
            case 3:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC5554 mo9826(int i) {
        return ProtoBuf$MemberKind.valueOf(i);
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
        View childAt;
        LinearLayout linearLayout = (LinearLayout) AbstractC7165.m12417(LinearLayout.class, methodHookParam.thisObject);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= linearLayout.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = linearLayout.getChildAt(i);
            if ((childAt instanceof TextView) && ((TextView) childAt).getText().toString().equals(AbstractC9234.m14531(297))) {
                i2 = i;
            }
            if (childAt instanceof LinearLayout) {
                View childAt2 = ((LinearLayout) childAt).getChildAt(0);
                if (childAt2 instanceof RelativeLayout) {
                    View childAt3 = ((RelativeLayout) childAt2).getChildAt(0);
                    if ((childAt3 instanceof TextView) && ((TextView) childAt3).getText().toString().equals(AbstractC9234.m14531(298))) {
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
        layoutParams.topMargin = AbstractC7082.m12313(linearLayout.getContext(), 16.0f) + layoutParams.topMargin;
        linearLayout.addView(childAt, i2, layoutParams);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3855
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo7093(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p049.InterfaceC7163
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo8834(Method method) {
        int i = this.f24565;
        Class<?> cls = Void.TYPE;
        switch (i) {
            case 26:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC7166.m12425(AbstractC9234.m14531(80)))) {
                }
                break;
            default:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC7166.m12425(AbstractC9234.m14531(80)))) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.compose.p001ui.text.font.InterfaceC2806
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public Typeface mo4256(C2822 c2822, int i) {
        return m14867(null, c2822, i);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3855
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo7094(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // androidx.compose.p001ui.text.font.InterfaceC2806
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Typeface mo4257(C2813 c2813, C2822 c2822, int i) {
        String strConcat = c2813.f6209;
        int i2 = c2822.f6222 / 100;
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
            Typeface typefaceM14867 = m14867(strConcat, c2822, i);
            if (!AbstractC5227.m9466(typefaceM14867, Typeface.create(Typeface.DEFAULT, AbstractC1298.m1729(c2822, i))) && !AbstractC5227.m9466(typefaceM14867, m14867(null, c2822, i))) {
                typeface = typefaceM14867;
            }
        }
        return typeface == null ? m14867(c2813.f6209, c2822, i) : typeface;
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4728() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.InterfaceC3273
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo4729(int i, Object obj) {
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

    public /* synthetic */ C9452(int i) {
        this.f24565 = i;
    }

    public C9452(int[] iArr, int[] iArr2) {
        this.f24565 = 2;
    }
}
