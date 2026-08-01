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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.text.font.C1979;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.InterfaceC1972;
import androidx.compose.ui.text.font.InterfaceC1982;
import androidx.profileinstaller.InterfaceC2440;
import com.bumptech.glide.load.engine.C2990;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3023;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import de.robv.android.xposed.XC_MethodHook;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4361;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.text.AbstractC5132;
import okhttp3.Protocol;
import okio.ByteString;
import p001.C6084;
import p004.C6092;
import p013.AbstractC6225;
import p018.AbstractC6253;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.InterfaceC6334;
import p218.InterfaceC7973;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8623 implements InterfaceC4361, InterfaceC1982, InterfaceC1972, InterfaceC2440, InterfaceC7973, InterfaceC3023, InterfaceC6334, InterfaceC6312, InterfaceC4723 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C8623 f24219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24220;

    public C8623() {
        this.f24220 = 22;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Typeface m14308(String str, C1988 c1988, int i) {
        if (i == 0 && AbstractC4395.m8907(c1988, C1988.f5876) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM1169 = AbstractC0455.m1169(c1988, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM1169) : Typeface.create(str, iM1169);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static byte[] m14309(List list) {
        list.getClass();
        C6092 c6092 = new C6092();
        for (String str : m14310(list)) {
            c6092.m11470(str.length());
            c6092.m11491(str);
        }
        return c6092.m11484(c6092.f16647);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ArrayList m14310(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).getProtocol());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14311(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = C6084.f16637;
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
                    byte[] bArr = AbstractC6225.f17158;
                    int i13 = b & DefaultClassResolver.NAME;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = byteString.getByte(i7 + i12);
                byte[] bArr2 = AbstractC6225.f17158;
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
                            return byteString.substring(i7, i9 + i7).string(AbstractC5132.f14688);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            size = i6;
        }
        return null;
    }

    @Override // p218.InterfaceC7973
    public Object create() {
        return new C2990();
    }

    public String toString() {
        switch (this.f24220) {
            case 3:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4722 mo9267(int i) {
        return ProtoBuf$MemberKind.valueOf(i);
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
        View childAt;
        LinearLayout linearLayout = (LinearLayout) AbstractC6336.m11858(LinearLayout.class, methodHookParam.thisObject);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= linearLayout.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = linearLayout.getChildAt(i);
            if ((childAt instanceof TextView) && ((TextView) childAt).getText().toString().equals(AbstractC8405.m13972(297))) {
                i2 = i;
            }
            if (childAt instanceof LinearLayout) {
                View childAt2 = ((LinearLayout) childAt).getChildAt(0);
                if (childAt2 instanceof RelativeLayout) {
                    View childAt3 = ((RelativeLayout) childAt2).getChildAt(0);
                    if ((childAt3 instanceof TextView) && ((TextView) childAt3).getText().toString().equals(AbstractC8405.m13972(298))) {
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
        layoutParams.topMargin = AbstractC6253.m11754(linearLayout.getContext(), 16.0f) + layoutParams.topMargin;
        linearLayout.addView(childAt, i2, layoutParams);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3023
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo6533(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p033.InterfaceC6334
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo8275(Method method) {
        int i = this.f24220;
        Class<?> cls = Void.TYPE;
        switch (i) {
            case 26:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC6337.m11866(AbstractC8405.m13972(80)))) {
                }
                break;
            default:
                if (method.getReturnType() != cls || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].equals(AbstractC6337.m11866(AbstractC8405.m13972(80)))) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public Typeface mo3696(C1988 c1988, int i) {
        return m14308(null, c1988, i);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3023
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo6534(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // androidx.compose.ui.text.font.InterfaceC1972
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Typeface mo3697(C1979 c1979, C1988 c1988, int i) {
        String strConcat = c1979.f5864;
        int i2 = c1988.f5877 / 100;
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
            Typeface typefaceM14308 = m14308(strConcat, c1988, i);
            if (!AbstractC4395.m8907(typefaceM14308, Typeface.create(Typeface.DEFAULT, AbstractC0455.m1169(c1988, i))) && !AbstractC4395.m8907(typefaceM14308, m14308(null, c1988, i))) {
                typeface = typefaceM14308;
            }
        }
        return typeface == null ? m14308(c1979.f5864, c1988, i) : typeface;
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo4168() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.InterfaceC2440
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo4169(int i, Object obj) {
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

    public /* synthetic */ C8623(int i) {
        this.f24220 = i;
    }

    public C8623(int[] iArr, int[] iArr2) {
        this.f24220 = 2;
    }
}
