package p050;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0849;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1123;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.core.widget.AbstractC3127;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3893;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.esotericsoftware.kryo.util.C3908;
import com.kongzue.dialogx.util.C4596;
import com.lxj.xpopup.core.C4616;
import io.ktor.util.C5043;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5182;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5439;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC5477;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5470;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5473;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5474;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.C5760;
import kotlin.reflect.jvm.internal.types.C5761;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p026.C7018;
import p038.DialogInterfaceOnDismissListenerC7128;
import p047.C7156;
import p052.AbstractC7187;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p069.AbstractC7390;
import p082.AbstractC7699;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7831;
import p095.AbstractC7838;
import p103.C7956;
import p104.AbstractC8005;
import p104.C7981;
import p105.InterfaceC8013;
import p106.InterfaceC8016;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p119.C8098;
import p180.C8493;
import p181.C8506;
import p191.AbstractC8568;
import p220.AbstractC8720;
import p220.InterfaceC8721;
import p221.C8723;
import p221.C8729;
import p252.AbstractC8944;
import p252.C8942;
import p252.C8945;
import p252.C8954;
import p257.C8969;
import p279.C9084;
import p330.AbstractC9490;
import p345.AbstractC9594;
import p365.C9677;
import p365.C9678;
import p365.C9681;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7176 implements InterfaceC8016, InterfaceC8018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C7179 f17826 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String f17827 = "";

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static boolean m12453(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(0, i) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static double m12454(C9084 c9084, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = c9084.f23201;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static float m12455(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        C3908.m7460("Motion easing control point value must be between 0 and 1; instead got: ", f);
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C5761 m12456(InterfaceC5925 interfaceC5925, C5519 c5519) {
        c5519.getClass();
        interfaceC5925.getClass();
        return new C5761(interfaceC5925, c5519.f14041.f14038, new C5760(interfaceC5925, c5519), new C5760(c5519, interfaceC5925));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static float m12457(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3127.m4872(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m12458(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m12459(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static int m12460(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m12461(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + AbstractC7390.m12623(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC7390.m12623(Float.intBitsToFloat(i)) + ", " + AbstractC7390.m12623(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static final C5836 m12462(AbstractC7818 abstractC7818) {
        Class clsM10631 = AbstractC5899.m10631(abstractC7818);
        C5836 c5836 = (C5836) (clsM10631 != null ? AbstractC5228.f13320.mo9476(clsM10631) : null);
        if (c5836 != null) {
            return c5836;
        }
        C5043.m9153(abstractC7818.mo9587(), "Type parameter container is not resolved: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8723 m12463(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC8721 interfaceC8721M13875 = AbstractC8720.m13875(f);
        if (interfaceC8721M13875 == null) {
            interfaceC8721M13875 = new C8729(f);
        }
        return new C8723(f2, f, interfaceC8721M13875);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7981 m12464(C7981 c7981, AbstractC8005 abstractC8005) {
        return AbstractC9594.m15026(new C0849(c7981, 22, abstractC8005));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m12465(Context context) {
        AbstractC3888.m7247(context);
        C7179 c7179 = new C7179(new C4596(context, 1));
        f17826 = c7179;
        C4616 c4616 = new C4616();
        c4616.f12159 = true;
        c7179.popupInfo = c4616;
        c7179.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m12466(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        interfaceC5313.getClass();
        interfaceC53132.getClass();
        if (!(interfaceC53132 instanceof C5397) || !(interfaceC5313 instanceof InterfaceC5316)) {
            return false;
        }
        C5397 c5397 = (C5397) interfaceC53132;
        c5397.mo9594().size();
        InterfaceC5316 interfaceC5316 = (InterfaceC5316) interfaceC5313;
        interfaceC5316.mo9594().size();
        List listMo9594 = ((AbstractC7831) c5397.mo9561()).mo9594();
        listMo9594.getClass();
        List listMo95942 = interfaceC5316.mo9561().mo9594();
        listMo95942.getClass();
        for (Pair pair : AbstractC5176.m9380(listMo9594, listMo95942)) {
            InterfaceC5288 interfaceC5288 = (InterfaceC5288) pair.component1();
            InterfaceC5288 interfaceC52882 = (InterfaceC5288) pair.component2();
            interfaceC5288.getClass();
            boolean z = m12476((InterfaceC5316) interfaceC53132, interfaceC5288) instanceof C5473;
            interfaceC52882.getClass();
            if (z != (m12476(interfaceC5316, interfaceC52882) instanceof C5473)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static float[] m12467(float[] fArr, int i) {
        if (i < 0) {
            C6755.m11865();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8954 m12468(C8969 c8969) {
        c8969.getClass();
        C8945 c8945 = c8969.f22803;
        String[] strArr = AbstractC8944.f22758;
        String strM2973 = c8945.m2973("Content-Type");
        if (strM2973 == null) {
            return null;
        }
        C8954 c8954 = C8954.f22769;
        return C8942.m14141(strM2973);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8493[] m12469(String str) {
        int i;
        String strTrim;
        float[] fArrM12467;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    }
                    i4++;
                }
                if (cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i3, i4).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.charAt(i2) == 'z' || strTrim.charAt(i2) == 'Z') {
                            fArrM12467 = new float[i2];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                        char cCharAt2 = strTrim.charAt(i11);
                                        if (cCharAt2 == ' ') {
                                            i7 = 0;
                                            i9 = 1;
                                            if (i9 != 0) {
                                            }
                                        } else {
                                            if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        i6 = i10 == 0 ? i11 : i11 + 1;
                                        i2 = 0;
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArrM12467 = m12467(fArr, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                C1123.m1408(AbstractC0900.m718("error in parsing \"", strTrim, "\""), e);
                                return null;
                            }
                        }
                        arrayList.add(new C8493(strTrim.charAt(i2), fArrM12467));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
            }
            strTrim = str.substring(i3, i4).trim();
            if (!strTrim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C8493(str.charAt(i3), new float[0]));
        }
        return (C8493[]) arrayList.toArray(new C8493[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static ListBuilder m12470() {
        return new ListBuilder(0, 1, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static ArrayList m12471(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5182(objArr, true));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m12472(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            C6755.m11869(AbstractC0900.m722(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            C5043.m9177("toIndex (", size, ") is greater than size (", size2);
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM7277 = AbstractC3888.m7277((Comparable) arrayList.get(i3), comparable);
            if (iM7277 < 0) {
                i = i3 + 1;
            } else {
                if (iM7277 <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m12473(ArrayList arrayList, ArrayList arrayList2, Activity activity) {
        new AlertDialog.Builder(activity, m12458(activity) ? 2 : 3).setTitle("选择需要保存的图片").setItems((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC7168(arrayList, arrayList2, activity, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC7128(1)).show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m12474(Context context, String str, String str2) {
        f17827 = "";
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0328R.layout.emo_pre_save, (ViewGroup) null);
        final ImageView imageView = (ImageView) linearLayout.findViewById(C0328R.id.emo_pre_container);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C7177 c7177 = new C7177();
        c7177.f17828 = str;
        c7177.f17830 = 2;
        c7177.f17829 = str2.toUpperCase(Locale.ROOT);
        if (str.startsWith("http")) {
            AbstractC7172.f17821.submit(new RunnableC0946(c7177, 12, new RunnableC0946(c7177, 13, imageView)));
        } else {
            c7177.f17831 = str;
            ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(c7177.f17831)).m7174()).m7349(imageView);
        }
        ArrayList<String> arrayListM12452 = AbstractC7174.m12452();
        RadioGroup radioGroup = (RadioGroup) linearLayout.findViewById(C0328R.id.emo_pre_list_choser);
        for (String str3 : arrayListM12452) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str3);
            radioButton.setTextSize(16.0f);
            radioButton.setTextColor(context.getResources().getColor(C0328R.color.font_plugin, null));
            radioButton.setOnCheckedChangeListener(new C7171(str3, 0));
            radioGroup.addView(radioButton);
        }
        ((Button) linearLayout.findViewById(C0328R.id.createNew)).setOnClickListener(new ViewOnClickListenerC6392(context, 5, radioGroup));
        new AlertDialog.Builder(context, m12458(context) ? 2 : 3).setTitle("是否保存").setView(linearLayout).setNeutralButton("保存", new DialogInterfaceOnClickListenerC7170(c7177, str2)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰苏哲
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ComponentCallbacks2C3896 componentCallbacks2C3896M7325 = ComponentCallbacks2C3890.m7325(AbstractC7187.f17852);
                componentCallbacks2C3896M7325.getClass();
                componentCallbacks2C3896M7325.m7355(new C3893(imageView));
            }
        }).show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static ArrayList m12475(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5182(objArr, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605.m10064(r0).equals(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605.m10064(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5477 m12476(InterfaceC5316 interfaceC5316, InterfaceC5288 interfaceC5288) {
        InterfaceC5316 interfaceC5316M9776;
        interfaceC5316.getClass();
        boolean zM9466 = AbstractC5227.m9466(((AbstractC7838) interfaceC5316).getName().m9894(), "remove");
        C8098 c8098 = C8098.f19712;
        if (!zM9466 || interfaceC5316.mo9594().size() != 1 || (AbstractC5605.m10065(interfaceC5316).mo9587() instanceof C5432) || AbstractC7359.m12571(interfaceC5316)) {
            if (interfaceC5316.mo9594().size() == 1) {
                InterfaceC5331 interfaceC5331Mo9587 = interfaceC5316.mo9587();
                AbstractC7818 abstractC7818 = interfaceC5331Mo9587 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331Mo9587 : null;
                if (abstractC7818 != null) {
                    List listMo9594 = interfaceC5316.mo9594();
                    listMo9594.getClass();
                    InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC7806) ((InterfaceC5288) AbstractC5176.m9338(listMo9594))).getType().mo10281().mo9770();
                    AbstractC7818 abstractC78182 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
                    if (abstractC78182 != null) {
                        if (AbstractC7359.m12580(abstractC7818) != null) {
                        }
                    }
                }
            }
            AbstractC5714 type = ((AbstractC7806) interfaceC5288).getType();
            type.getClass();
            return (AbstractC5477) AbstractC3738.m6850(type, C5470.f13901, c8098);
        }
        List listMo95942 = interfaceC5316.mo9561().mo9594();
        listMo95942.getClass();
        AbstractC5714 type2 = ((AbstractC7806) ((InterfaceC5288) AbstractC5176.m9338(listMo95942))).getType();
        type2.getClass();
        C5470 c5470 = C5470.f13901;
        AbstractC5477 abstractC5477 = (AbstractC5477) AbstractC3738.m6850(type2, c5470, c8098);
        C5473 c5473 = abstractC5477 instanceof C5473 ? (C5473) abstractC5477 : null;
        if ((c5473 != null ? c5473.f13912 : null) == JvmPrimitiveType.INT && (interfaceC5316M9776 = AbstractC5439.m9776(interfaceC5316)) != null) {
            List listMo95943 = interfaceC5316M9776.mo9561().mo9594();
            listMo95943.getClass();
            AbstractC5714 type3 = ((AbstractC7806) ((InterfaceC5288) AbstractC5176.m9338(listMo95943))).getType();
            type3.getClass();
            AbstractC5477 abstractC54772 = (AbstractC5477) AbstractC3738.m6850(type3, c5470, c8098);
            InterfaceC5331 interfaceC5331Mo95872 = interfaceC5316M9776.mo9587();
            interfaceC5331Mo95872.getClass();
            C5518 c5518M12660 = AbstractC7699.m12660(interfaceC5331Mo95872);
            c5518M12660.getClass();
            if (!c5518M12660.equals(AbstractC7356.f18210.f14041) || !(abstractC54772 instanceof C5474) || !((C5474) abstractC54772).f13913.equals(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME)) {
            }
        }
        AbstractC5714 type4 = ((AbstractC7806) interfaceC5288).getType();
        type4.getClass();
        return (AbstractC5477) AbstractC3738.m6850(AbstractC3738.m6849(type4), C5470.f13901, c8098);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static final Object m12477(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set setM9347;
        if (!z) {
            if (r4 != null && (setM9347 = AbstractC5176.m9347(AbstractC8568.m13612(set, r4))) != null) {
                set = setM9347;
            }
            return AbstractC5176.m9341(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (AbstractC5227.m9466(r1, r2) && AbstractC5227.m9466(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static C8506 m12478(Context context) {
        TypedValue typedValueM12599 = AbstractC7390.m12599(context.getTheme(), C0328R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC9490.f24777;
        TypedArray typedArrayObtainStyledAttributes = typedValueM12599 == null ? context.obtainStyledAttributes(null, iArr, 0, C0328R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM12599.resourceId, iArr);
        C8506 c8506 = new C8506();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c8506.f21189 = Math.sqrt(f);
            c8506.f21187 = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c8506.f21188 = f2;
            c8506.f21187 = false;
            typedArrayObtainStyledAttributes.recycle();
            return c8506;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static void m12479() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static void m12480() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static int m12481(Context context, int i, int i2) {
        TypedValue typedValueM12599 = AbstractC7390.m12599(context.getTheme(), i);
        return (typedValueM12599 == null || typedValueM12599.type != 16) ? i2 : typedValueM12599.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static TimeInterpolator m12482(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            C6755.m11869("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m12488(strValueOf, "cubic-bezier") && !m12488(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m12488(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(m12455(strArrSplit, 0), m12455(strArrSplit, 1), m12455(strArrSplit, 2), m12455(strArrSplit, 3));
            }
            C3775.m6952(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!m12488(strValueOf, "path")) {
            C6755.m11869("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strM721 = AbstractC0900.m721(1, 5, strValueOf);
        Path path = new Path();
        try {
            C8493.m13495(m12469(strM721), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            C1123.m1408("Error in parsing ".concat(strM721), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static final List m12483(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m12487(list.get(0)) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m12484(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1792);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final void m12485(String str, long j, String str2, int i) {
        "troop";
        str.getClass();
        "emojiId";
        str2.getClass();
        C9681 c9681 = new C9681(Long.parseLong(str), j, str2, i);
        C7156 c7156 = C7156.f17780;
        C9677 c9677 = new C9677(c7156.m12400(C9681.Companion.serializer(), c9681));
        C7018 c7018 = new C7018();
        C9678 c9678 = C9677.Companion;
        c7018.m12172(c7156.m12400(c9678.serializer(), c9677));
        AbstractC1298.m1712("OidbSvcTrpcTcp.0x9082_1", c7156.m12400(c9678.serializer(), c9677));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static float m12486(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3127.m4871(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static List m12487(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static boolean m12488(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static List m12489(Object obj) {
        return obj != null ? m12487(obj) : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static List m12490(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return EmptyList.INSTANCE;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public boolean mo11211(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11250();
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public byte mo11212(C7956 c7956, int i) {
        c7956.getClass();
        return mo11259();
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public InterfaceC8016 mo11213(C7956 c7956, int i) {
        c7956.getClass();
        return mo11248(c7956.mo12942(i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public double mo11214(C7956 c7956, int i) {
        c7956.getClass();
        return mo11255();
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public boolean mo11217() {
        return true;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public char mo11219(C7956 c7956, int i) {
        c7956.getClass();
        return mo11249();
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public String mo11221() {
        m12491();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract Object mo12250(InterfaceC5925 interfaceC5925);

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract int mo11224();

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public abstract long mo11227();

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public short mo11228(C7956 c7956, int i) {
        c7956.getClass();
        return mo11257();
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public float mo11229(C7956 c7956, int i) {
        c7956.getClass();
        return mo11256();
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public int mo11230(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11224();
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public int mo11231(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        m12491();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Object mo11233(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        interfaceC8013.getClass();
        return mo11216(interfaceC8013);
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo11234(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        if (interfaceC8013.getDescriptor().mo12969() || mo11217()) {
            return mo11216(interfaceC8013);
        }
        return null;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo11237(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m12491() {
        throw new SerializationException(AbstractC5228.f13320.mo9476(getClass()) + " can't retrieve untyped values");
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public String mo11245(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11221();
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC8016 mo11248(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public char mo11249() {
        m12491();
        throw null;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo11250() {
        m12491();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public abstract void mo12492();

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public double mo11255() {
        m12491();
        throw null;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public float mo11256() {
        m12491();
        throw null;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public abstract short mo11257();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public abstract AbstractC7176 mo12251(InterfaceC5925 interfaceC5925, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public abstract void mo12493();

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public long mo11258(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11227();
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public abstract byte mo11259();
}
