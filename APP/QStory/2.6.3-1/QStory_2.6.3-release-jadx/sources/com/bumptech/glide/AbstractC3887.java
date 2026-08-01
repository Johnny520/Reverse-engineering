package com.bumptech.glide;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;
import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1137;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.graphics.C2434;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import com.android.dex.DexException;
import com.google.flatbuffers.AbstractC4050;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.routing.AbstractC4992;
import io.ktor.server.routing.C4974;
import io.ktor.util.C5043;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.p008io.path.AbstractC5198;
import kotlin.p008io.path.AbstractC5200;
import kotlin.p008io.path.IllegalFileNameException;
import kotlin.p008io.path.OnErrorResult;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC5477;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5470;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.AnnotationVisibilityType;
import org.luckypray.dexkit.result.AbstractC6549;
import org.luckypray.dexkit.result.C6552;
import org.luckypray.dexkit.result.C6553;
import org.luckypray.dexkit.result.C6555;
import p025.AbstractC7012;
import p047.C7156;
import p049.AbstractC7165;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7380;
import p069.AbstractC7390;
import p081.C7697;
import p082.AbstractC7699;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p095.C7820;
import p095.C7835;
import p102.C7892;
import p102.InterfaceC7893;
import p117.InterfaceC8083;
import p119.C8098;
import p160.C8376;
import p160.C8380;
import p221.C8727;
import p267.AbstractC9002;
import p267.AbstractC9014;
import p267.C9008;
import p267.SharedPreferencesC9005;
import p300.InterfaceC9214;
import p300.InterfaceC9215;
import p303.AbstractC9234;
import p379.C9759;
import p379.C9760;
import p380.C9761;
import p380.C9762;
import p380.C9763;
import p380.C9764;
import p380.C9765;
import p380.C9766;
import p380.C9767;
import p380.C9768;
import p380.C9769;
import p380.C9770;
import p380.C9771;
import p380.C9772;
import p380.C9773;
import p380.C9774;
import p380.C9775;
import p380.C9776;
import p400.C9841;
import p400.C9842;
import p400.C9844;
import p400.C9846;
import p400.C9847;
import p400.C9850;
import p400.C9855;
import p400.C9857;
import p400.C9860;
import p400.C9863;
import p400.C9864;
import p400.C9872;
import p400.C9879;
import p400.C9880;
import p400.C9886;
import p400.C9888;
import p400.C9894;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6686 f10103;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m7193(InterfaceC9214 interfaceC9214, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            interfaceC9214.writeByte((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m7194(InterfaceC9214 interfaceC9214, int i) {
        while (true) {
            int i2 = i;
            i >>>= 7;
            if (i == 0) {
                interfaceC9214.writeByte((byte) (i2 & 127));
                return;
            }
            interfaceC9214.writeByte((byte) ((i2 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final InterfaceC7893 m7195(Collection collection, C7892 c7892) {
        Iterator it = collection.iterator();
        InterfaceC7893 interfaceC7893 = null;
        while (it.hasNext()) {
            InterfaceC7893 interfaceC78932 = (InterfaceC7893) it.next();
            if (AbstractC5227.m9466(interfaceC78932.getType(), c7892)) {
                if (interfaceC7893 != null) {
                    C8376.m13333(c7892, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                interfaceC7893 = interfaceC78932;
            }
        }
        if (interfaceC7893 != null) {
            return interfaceC7893;
        }
        C8376.m13333(c7892, "No extensions handle the extension type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final void m7196(C1083 c1083, Object obj) {
        boolean zM1433;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = c1083.f1225[i4];
                        Object obj3 = c1083.f1224[i4];
                        if (obj3 instanceof C1082) {
                            C1082 c1082 = (C1082) obj3;
                            c1082.m1306(obj);
                            zM1433 = c1082.m1433();
                        } else {
                            zM1433 = obj3 == obj;
                        }
                        if (zM1433) {
                            c1083.m1319(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static int m7197(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final long m7198(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C2434.m3510(C2434.m3508(j) * f, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7199(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(AbstractC9234.m14531(13))).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7200(byte[] bArr, XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        C7156 c7156 = C7156.f17780;
        c7156.getClass();
        C9879 c9879 = C9880.Companion;
        C9888 c9888 = ((C9880) c7156.m12401(c9879.serializer(), bArr)).f25680;
        C9894 c9894 = c9888.f25696;
        if (c9894 == null) {
            return;
        }
        C9886 c9886 = c9888.f25697;
        int i = c9886.f25690;
        int i2 = c9886.f25688;
        byte[] bArr2 = c9894.f25705;
        if (i == 528) {
            if (i2 == 138) {
                C9850 c9850 = C9846.Companion;
                C9847 c9847 = ((C9846) c7156.m12401(c9850.serializer(), bArr2)).f25643;
                int i3 = c9847.f25644;
                String str = c9847.f25648;
                String str2 = c9847.f25647;
                long j = c9847.f25646;
                long j2 = c9847.f25645;
                AbstractC9234.m14531(1362);
                str.getClass();
                AbstractC9234.m14531(1422);
                str2.getClass();
                C9847 c98472 = new C9847(str, str2, j, j2, 1);
                AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
                C9888 c9888M15172 = C9888.m15172(c9888, C9894.m15173(c9888.f25696, c7156.m12400(c9850.serializer(), new C9846(c98472))));
                AbstractC9234.m14531(1374);
                methodHookParam.args[1] = c7156.m12400(c9879.serializer(), new C9880(c9888M15172));
                C6686 c6686 = f10103;
                if (c6686 != null) {
                    c6686.m11816(new C9860(str, i3));
                    return;
                }
                return;
            }
            return;
        }
        if (i == 732 && i2 == 17) {
            byte[] bArrM9391 = AbstractC5179.m9391(0, bArr2, 7);
            byte[] bArrM93912 = AbstractC5179.m9391(7, bArr2, bArr2.length);
            C9855 c9855 = C9844.Companion;
            C9844 c9844 = (C9844) c7156.m12401(c9855.serializer(), bArrM93912);
            C9841 c9841 = c9844.f25641;
            long j3 = c9844.f25642;
            String str3 = c9841.f25635;
            C9842 c9842 = c9841.f25634;
            String strValueOf = String.valueOf(j3);
            int i4 = c9842.f25638;
            if (AbstractC5227.m9466(str3, QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()))) {
                return;
            }
            long j4 = c9842.f25637;
            String str4 = c9842.f25636;
            AbstractC9234.m14531(1431);
            str4.getClass();
            C9842 c98422 = new C9842(1, j4, str4);
            String str5 = c9841.f25635;
            AbstractC9234.m14531(1362);
            str5.getClass();
            AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜喵");
            C9841 c98412 = new C9841(str5, c98422);
            AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
            C9888 c9888M151722 = C9888.m15172(c9888, C9894.m15173(c9888.f25696, AbstractC5179.m9413(bArrM9391, c7156.m12400(c9855.serializer(), new C9844(j3, c98412, 1)))));
            AbstractC9234.m14531(1374);
            methodHookParam.args[1] = c7156.m12400(c9879.serializer(), new C9880(c9888M151722));
            C6686 c66862 = f10103;
            if (c66862 != null) {
                c66862.m11815(new C9857(i4, strValueOf, str3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7201(byte[] bArr, XC_MethodHook.MethodHookParam methodHookParam) {
        List list;
        int i;
        int iIntValue;
        Object objM723;
        C9894 c9894;
        Object objM7232;
        Object objM7233;
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        C7156 c7156 = C7156.f17780;
        c7156.getClass();
        C9864 c9864 = (C9864) c7156.m12401(C9864.Companion.serializer(), bArr);
        C9872 c9872 = c9864.f25663;
        if (c9872 == null || (list = c9872.f25675) == null || list.isEmpty()) {
            return;
        }
        ArrayList<C9860> arrayList = new ArrayList();
        ArrayList<C9857> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            byte[] byteArray = (byte[]) it.next();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 < byteArray.length) {
                    C9863 c9863M7203 = m7203(byteArray, i3);
                    if (c9863M7203 == null) {
                        break;
                    }
                    int i5 = c9863M7203.f25660;
                    int i6 = c9863M7203.f25661;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i8 == 0) {
                        i = i2;
                        C9863 c9863M72032 = m7203(byteArray, i5);
                        if (c9863M72032 != null) {
                            iIntValue = c9863M72032.f25660;
                            if (i7 == 8) {
                            }
                            i3 = iIntValue;
                            i2 = i;
                        }
                    } else if (i8 == i2) {
                        i = i2;
                        int i9 = i5 + 8;
                        Integer numValueOf = Integer.valueOf(i9);
                        if (i9 > byteArray.length) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                            if (i7 == 8) {
                            }
                            i3 = iIntValue;
                            i2 = i;
                        }
                    } else if (i8 != 2) {
                        i = i2;
                        if (i8 != 5) {
                            break;
                        }
                        int i10 = i5 + 4;
                        Integer numValueOf2 = Integer.valueOf(i10);
                        if (i10 > byteArray.length) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            iIntValue = numValueOf2.intValue();
                            if (i7 == 8 || i8 != 2) {
                                byteArrayOutputStream.write(byteArray, i3, iIntValue - i3);
                            } else {
                                C9863 c9863M72033 = m7203(byteArray, i5);
                                if (c9863M72033 == null) {
                                    break;
                                }
                                int i11 = c9863M72033.f25660;
                                byte[] bArrM9391 = AbstractC5179.m9391(i11, byteArray, c9863M72033.f25661 + i11);
                                try {
                                    C7156 c71562 = C7156.f17780;
                                    c71562.getClass();
                                    objM723 = Result.m9304constructorimpl((C9888) c71562.m12401(C9888.Companion.serializer(), bArrM9391));
                                } catch (Throwable th) {
                                    objM723 = AbstractC0900.m723(th);
                                }
                                if (Result.m9310isFailureimpl(objM723)) {
                                    objM723 = null;
                                }
                                C9888 c9888 = (C9888) objM723;
                                if (c9888 == null || (c9894 = c9888.f25696) == null) {
                                    byteArrayOutputStream.write(byteArray, i3, iIntValue - i3);
                                } else {
                                    byte[] bArr2 = c9894.f25705;
                                    C9886 c9886 = c9888.f25697;
                                    int i12 = c9886.f25690;
                                    int i13 = c9886.f25689;
                                    if (i12 == 528 && i13 == 138) {
                                        try {
                                            C7156 c71563 = C7156.f17780;
                                            c71563.getClass();
                                            objM7233 = Result.m9304constructorimpl((C9846) c71563.m12401(C9846.Companion.serializer(), bArr2));
                                        } catch (Throwable th2) {
                                            objM7233 = AbstractC0900.m723(th2);
                                        }
                                        C9846 c9846 = (C9846) (Result.m9310isFailureimpl(objM7233) ? null : objM7233);
                                        if (c9846 != null) {
                                            arrayList.add(new C9860(c9888.f25698.f25694, c9846.f25643.f25644));
                                            i4 = i;
                                        }
                                        byteArrayOutputStream.write(byteArray, i3, iIntValue - i3);
                                    } else {
                                        if (i12 == 732 && i13 == 17 && bArr2.length > 7) {
                                            try {
                                                C7156 c71564 = C7156.f17780;
                                                byte[] bArrM93912 = AbstractC5179.m9391(7, bArr2, bArr2.length);
                                                c71564.getClass();
                                                objM7232 = Result.m9304constructorimpl((C9844) c71564.m12401(C9844.Companion.serializer(), bArrM93912));
                                            } catch (Throwable th3) {
                                                objM7232 = AbstractC0900.m723(th3);
                                            }
                                            C9844 c9844 = (C9844) (Result.m9310isFailureimpl(objM7232) ? null : objM7232);
                                            if (c9844 != null) {
                                                String strValueOf = String.valueOf(c9844.f25642);
                                                C9841 c9841 = c9844.f25641;
                                                arrayList2.add(new C9857(c9841.f25634.f25638, strValueOf, c9841.f25635));
                                                i4 = i;
                                            }
                                        }
                                        byteArrayOutputStream.write(byteArray, i3, iIntValue - i3);
                                    }
                                }
                            }
                            i3 = iIntValue;
                            i2 = i;
                        }
                    } else {
                        i = i2;
                        C9863 c9863M72034 = m7203(byteArray, i5);
                        if (c9863M72034 == null) {
                            break;
                        }
                        int i14 = c9863M72034.f25660 + c9863M72034.f25661;
                        Integer numValueOf3 = Integer.valueOf(i14);
                        if (i14 > byteArray.length) {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            iIntValue = numValueOf3.intValue();
                            if (i7 == 8) {
                                byteArrayOutputStream.write(byteArray, i3, iIntValue - i3);
                            }
                            i3 = iIntValue;
                            i2 = i;
                        }
                    }
                } else if (i4 != 0) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    AbstractC9234.m14531(1412);
                    byteArray.getClass();
                }
            }
            arrayList3.add(byteArray);
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            return;
        }
        C9864 c98642 = new C9864(c9864.f25666, c9864.f25665, c9864.f25664, new C9872(c9872.f25676, arrayList3, c9872.f25674, c9872.f25673), c9864.f25662);
        Object[] objArr = methodHookParam.args;
        C7156 c71565 = C7156.f17780;
        c71565.getClass();
        objArr[1] = c71565.m12400(C9864.Companion.serializer(), c98642);
        for (C9857 c9857 : arrayList2) {
            C6686 c6686 = f10103;
            if (c6686 != null) {
                c6686.m11815(c9857);
            }
        }
        for (C9860 c9860 : arrayList) {
            C6686 c66862 = f10103;
            if (c66862 != null) {
                c66862.m11816(c9860);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final boolean m7202(C1083 c1083, Object obj, Object obj2) {
        Object objM1317 = c1083.m1317(obj);
        if (objM1317 == null) {
            return false;
        }
        if (!(objM1317 instanceof C1082)) {
            if (!objM1317.equals(obj2)) {
                return false;
            }
            c1083.m1318(obj);
            return true;
        }
        C1082 c1082 = (C1082) objM1317;
        boolean zM1306 = c1082.m1306(obj2);
        if (zM1306 && c1082.m1433()) {
            c1083.m1318(obj);
        }
        return zM1306;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static C9863 m7203(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i < bArr.length && i3 < 32; i3 += 7) {
            byte b = bArr[i];
            i2 |= (b & 127) << i3;
            i++;
            if ((b & 128) == 0) {
                return new C9863(i2, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static int m7204(InterfaceC9215 interfaceC9215) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            byte b = interfaceC9215.readByte();
            i2 |= (b & 127) << (i3 * 7);
            i3++;
            i = b & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return i2;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static int m7205(InterfaceC9215 interfaceC9215) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        do {
            byte b = interfaceC9215.readByte();
            i2 |= (b & 127) << (i4 * 7);
            i3 <<= 7;
            i4++;
            i = b & 128;
            if (i != 128) {
                break;
            }
        } while (i4 < 5);
        if (i != 128) {
            return ((i3 >> 1) & i2) != 0 ? i2 | i3 : i2;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m7206(Path path) throws IllegalFileNameException {
        path.getClass();
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        if (string == null) {
            string = "";
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !string.equals("./")) {
                                return;
                            }
                        } else if (!string.equals("..")) {
                            return;
                        }
                    } else if (!string.equals("..\\")) {
                        return;
                    }
                } else if (!string.equals("../")) {
                    return;
                }
            } else if (!string.equals(".\\")) {
                return;
            }
        } else if (!string.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7207(StringBuilder sb, String str) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m7208(C1083 c1083, Object obj, Object obj2) {
        int iM1309 = c1083.m1309(obj);
        boolean z = iM1309 < 0;
        Object obj3 = z ? null : c1083.f1224[iM1309];
        if (obj3 != null) {
            if (obj3 instanceof C1082) {
                ((C1082) obj3).m1301(obj2);
            } else if (obj3 != obj2) {
                C1082 c1082 = new C1082();
                c1082.m1301(obj3);
                c1082.m1301(obj2);
                obj2 = c1082;
            }
            obj2 = obj3;
        }
        if (!z) {
            c1083.f1224[iM1309] = obj2;
            return;
        }
        int i = ~iM1309;
        c1083.f1225[i] = obj;
        c1083.f1224[i] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8380 m7209(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C8380(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ArrayList m7210(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m7210(childAt));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7211(SharedPreferencesC9005 sharedPreferencesC9005, int i) {
        int i2;
        MappedByteBuffer mappedByteBufferM7237;
        ArrayList arrayList = sharedPreferencesC9005.f22878;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            C9008 c9008 = (C9008) arrayList.get(0);
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 1; i4 < size; i4++) {
                C9008 c90082 = (C9008) arrayList.get(i4);
                if (c90082.f22889 == c9008.f22888) {
                    c9008.f22888 = c90082.f22888;
                } else {
                    i3++;
                    if (i3 != i4) {
                        arrayList.set(i3, c90082);
                    }
                    c9008 = c90082;
                }
            }
            int i5 = i3 + 1;
            if (size > i5) {
                arrayList.subList(i5, size).clear();
            }
        }
        C9008 c90083 = (C9008) arrayList.get(0);
        int i6 = c90083.f22889;
        int i7 = sharedPreferencesC9005.f22862;
        int i8 = i7 - sharedPreferencesC9005.f22877;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z = i9 < i11 + i10;
        if (!z) {
            sharedPreferencesC9005.f22861 ^= sharedPreferencesC9005.f22883.m1126(i6, i11);
        }
        int size2 = arrayList.size();
        int i12 = size2 - 1;
        int i13 = sharedPreferencesC9005.f22862 - ((C9008) arrayList.get(i12)).f22888;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c90083.f22889;
        int i16 = c90083.f22888;
        int i17 = 1;
        while (i17 < size2) {
            ArrayList arrayList2 = arrayList;
            C9008 c90084 = (C9008) arrayList.get(i17);
            int i18 = i17;
            int i19 = c90084.f22889 - i16;
            int i20 = size2;
            byte[] bArr = (byte[]) sharedPreferencesC9005.f22883.f939;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c90084.f22888;
            i17 = i18 + 1;
            arrayList = arrayList2;
            size2 = i20;
        }
        ArrayList arrayList3 = arrayList;
        if (i13 > 0) {
            byte[] bArr2 = (byte[]) sharedPreferencesC9005.f22883.f939;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        sharedPreferencesC9005.f22877 = 0;
        arrayList3.clear();
        if (z) {
            sharedPreferencesC9005.f22861 = sharedPreferencesC9005.f22883.m1126(12, i9);
        } else {
            sharedPreferencesC9005.f22861 ^= sharedPreferencesC9005.f22883.m1126(i6, i10);
        }
        sharedPreferencesC9005.f22862 = i8;
        if (sharedPreferencesC9005.f22863 != null) {
            i9 |= 1073741824;
        }
        if (sharedPreferencesC9005.f22870 == 0) {
            sharedPreferencesC9005.f22871.putInt(0, -1);
            sharedPreferencesC9005.f22871.putLong(4, sharedPreferencesC9005.f22861);
            sharedPreferencesC9005.f22871.position(i6);
            sharedPreferencesC9005.f22871.put((byte[]) sharedPreferencesC9005.f22883.f939, i6, i10);
            sharedPreferencesC9005.f22871.putInt(0, i9);
            sharedPreferencesC9005.f22872.putInt(0, i9);
            sharedPreferencesC9005.f22872.putLong(4, sharedPreferencesC9005.f22861);
            sharedPreferencesC9005.f22872.position(i6);
            sharedPreferencesC9005.f22872.put((byte[]) sharedPreferencesC9005.f22883.f939, i6, i10);
        } else {
            sharedPreferencesC9005.f22883.m1134(0, i9);
            sharedPreferencesC9005.f22883.m1135(4, sharedPreferencesC9005.f22861);
        }
        int i22 = sharedPreferencesC9005.f22862 + i;
        if (((byte[]) sharedPreferencesC9005.f22883.f939).length - i22 > 32768) {
            int i23 = SharedPreferencesC9005.f22857;
            int iM7265 = AbstractC3888.m7265(i23, i22 + i23);
            byte[] bArr3 = (byte[]) sharedPreferencesC9005.f22883.f939;
            if (iM7265 >= bArr3.length) {
                i2 = 0;
            } else {
                byte[] bArr4 = new byte[iM7265];
                i2 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, sharedPreferencesC9005.f22862);
                sharedPreferencesC9005.f22883.f939 = bArr4;
                if (sharedPreferencesC9005.f22870 == 0) {
                    FileChannel fileChannel = sharedPreferencesC9005.f22868;
                    long j = iM7265;
                    MappedByteBuffer mappedByteBufferM72372 = null;
                    try {
                        fileChannel.truncate(j);
                        mappedByteBufferM7237 = AbstractC3888.m7237(fileChannel, iM7265);
                    } catch (IOException unused) {
                        mappedByteBufferM7237 = null;
                    }
                    FileChannel fileChannel2 = sharedPreferencesC9005.f22867;
                    try {
                        fileChannel2.truncate(j);
                        mappedByteBufferM72372 = AbstractC3888.m7237(fileChannel2, iM7265);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM7237 == null || mappedByteBufferM72372 == null) {
                        Log.e("FastKV", sharedPreferencesC9005.f22865, new Exception("map failed"));
                        AbstractC3888.m7286(sharedPreferencesC9005);
                    } else {
                        sharedPreferencesC9005.f22871 = mappedByteBufferM7237;
                        sharedPreferencesC9005.f22872 = mappedByteBufferM72372;
                    }
                }
                AbstractC3898.m7415(sharedPreferencesC9005, "truncate finish");
            }
        }
        for (AbstractC9002 abstractC9002 : sharedPreferencesC9005.f22880.values()) {
            int i24 = abstractC9002.f22853;
            if (i24 > i6) {
                int i25 = i14 - 1;
                int i26 = i2;
                while (true) {
                    if (i26 > i25) {
                        break;
                    }
                    int i27 = (i26 + i25) >>> 1;
                    int i28 = iArr[i27];
                    if (i28 >= i24) {
                        if (i28 <= i24) {
                            i25 = i27;
                            break;
                        }
                        i25 = i27 - 1;
                    } else {
                        i26 = i27 + 1;
                    }
                }
                int i29 = iArr2[i25];
                abstractC9002.f22853 -= i29;
                if (abstractC9002.mo14181() >= 6) {
                    ((AbstractC9014) abstractC9002).f22900 -= i29;
                }
            }
        }
        AbstractC3898.m7415(sharedPreferencesC9005, "gc finish");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList m7212(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C5262(annotation));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static Activity m7213() {
        try {
        } catch (Exception unused) {
        }
        for (Object obj : ((Map) AbstractC7165.m12423(AbstractC7165.m12419(Class.forName(AbstractC9234.m14531(10)), AbstractC9234.m14531(11)).get(null), AbstractC9234.m14531(12))).values()) {
            if (!((Boolean) AbstractC7165.m12418(Boolean.TYPE, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵喵喵"), obj)).booleanValue()) {
                Activity activity = (Activity) AbstractC7165.m12419(obj.getClass(), AbstractC9234.m14531(13)).get(obj);
                AbstractC3888.m7247(activity);
                return activity;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static byte[] m7214(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 4);
        try {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        try {
                            dataOutputStream.writeInt(bArr.length + 4);
                            dataOutputStream.write(bArr);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            dataOutputStream.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (Exception unused) {
                            dataOutputStream.close();
                            byteArrayOutputStream.close();
                            return null;
                        }
                    } finally {
                    }
                } catch (Exception unused2) {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    dataOutputStream.close();
                    byteArrayOutputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashSet m7215(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo9725 = ((InterfaceC8083) it.next()).mo9725();
            if (setMo9725 == null) {
                return null;
            }
            AbstractC5176.m9363(setMo9725, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C6553 m7216(DexKitBridge dexKitBridge, C9764 c9764) {
        Object objValueOf;
        dexKitBridge.getClass();
        int iM7848 = c9764.m7848(4);
        if (iM7848 != 0) {
            c9764.f11199.getInt(iM7848 + c9764.f11200);
        }
        int i = 6;
        int iM78482 = c9764.m7848(6);
        if (iM78482 != 0) {
            c9764.f11199.getInt(iM78482 + c9764.f11200);
        }
        int iM78483 = c9764.m7848(8);
        String strM7846 = iM78483 != 0 ? c9764.m7846(iM78483 + c9764.f11200) : null;
        strM7846.getClass();
        C9759 c9759 = AnnotationVisibilityType.Companion;
        int iM78484 = c9764.m7848(10);
        byte b = iM78484 != 0 ? c9764.f11199.get(iM78484 + c9764.f11200) : (byte) 0;
        c9759.getClass();
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            C6755.m11869(AbstractC7012.m12147(b, "Unknown AnnotationVisibilityType: "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM78485 = c9764.m7848(12);
        int iM7844 = iM78485 != 0 ? c9764.m7844(iM78485) : 0;
        int i2 = 0;
        while (i2 < iM7844) {
            C9766 c9766 = new C9766();
            int iM78486 = c9764.m7848(12);
            if (iM78486 != 0) {
                int iM7849 = c9764.m7849((i2 * 4) + c9764.m7845(iM78486));
                ByteBuffer byteBuffer = c9764.f11199;
                byteBuffer.getClass();
                c9766.m7847(byteBuffer, iM7849);
            } else {
                c9766 = null;
            }
            c9766.getClass();
            C9766 c97662 = new C9766();
            int iM78487 = c9766.m7848(i);
            if (iM78487 != 0) {
                int iM78492 = c9766.m7849(iM78487 + c9766.f11200);
                ByteBuffer byteBuffer2 = c9766.f11199;
                byteBuffer2.getClass();
                c97662.m7847(byteBuffer2, iM78492);
            } else {
                c97662 = null;
            }
            c97662.getClass();
            int iM78488 = c9766.m7848(4);
            String strM78462 = iM78488 != 0 ? c9766.m7846(iM78488 + c9766.f11200) : null;
            strM78462.getClass();
            C9760 c9760 = AnnotationEncodeValueType.Companion;
            int iM78489 = c97662.m7848(i);
            byte b2 = iM78489 != 0 ? c97662.f11199.get(iM78489 + c97662.f11200) : (byte) 0;
            c9760.getClass();
            AnnotationEncodeValueType annotationEncodeValueTypeM15109 = C9760.m15109(b2);
            switch (AbstractC6549.f16026[annotationEncodeValueTypeM15109.ordinal()]) {
                case 1:
                    AbstractC4050 abstractC4050M15113 = c97662.m15113(new C9761());
                    abstractC4050M15113.getClass();
                    C9761 c9761 = (C9761) abstractC4050M15113;
                    int iM784810 = c9761.m7848(4);
                    objValueOf = Byte.valueOf(iM784810 != 0 ? c9761.f11199.get(iM784810 + c9761.f11200) : (byte) 0);
                    break;
                case 2:
                    AbstractC4050 abstractC4050M151132 = c97662.m15113(new C9768());
                    abstractC4050M151132.getClass();
                    C9768 c9768 = (C9768) abstractC4050M151132;
                    int iM784811 = c9768.m7848(4);
                    objValueOf = Short.valueOf(iM784811 != 0 ? c9768.f11199.getShort(iM784811 + c9768.f11200) : (short) 0);
                    break;
                case 3:
                    AbstractC4050 abstractC4050M151133 = c97662.m15113(new C9772());
                    abstractC4050M151133.getClass();
                    C9772 c9772 = (C9772) abstractC4050M151133;
                    int iM784812 = c9772.m7848(4);
                    objValueOf = Short.valueOf(iM784812 != 0 ? c9772.f11199.getShort(iM784812 + c9772.f11200) : (short) 0);
                    break;
                case 4:
                    AbstractC4050 abstractC4050M151134 = c97662.m15113(new C9776());
                    abstractC4050M151134.getClass();
                    C9776 c9776 = (C9776) abstractC4050M151134;
                    int iM784813 = c9776.m7848(4);
                    objValueOf = Integer.valueOf(iM784813 != 0 ? c9776.f11199.getInt(iM784813 + c9776.f11200) : 0);
                    break;
                case 5:
                    AbstractC4050 abstractC4050M151135 = c97662.m15113(new C9773());
                    abstractC4050M151135.getClass();
                    C9773 c9773 = (C9773) abstractC4050M151135;
                    int iM784814 = c9773.m7848(4);
                    objValueOf = Long.valueOf(iM784814 != 0 ? c9773.f11199.getLong(iM784814 + c9773.f11200) : 0L);
                    break;
                case 6:
                    AbstractC4050 abstractC4050M151136 = c97662.m15113(new C9775());
                    abstractC4050M151136.getClass();
                    C9775 c9775 = (C9775) abstractC4050M151136;
                    int iM784815 = c9775.m7848(4);
                    objValueOf = Float.valueOf(iM784815 != 0 ? c9775.f11199.getFloat(iM784815 + c9775.f11200) : 0.0f);
                    break;
                case 7:
                    AbstractC4050 abstractC4050M151137 = c97662.m15113(new C9771());
                    abstractC4050M151137.getClass();
                    C9771 c9771 = (C9771) abstractC4050M151137;
                    int iM784816 = c9771.m7848(4);
                    objValueOf = Double.valueOf(iM784816 != 0 ? c9771.f11199.getDouble(iM784816 + c9771.f11200) : 0.0d);
                    break;
                case 8:
                    AbstractC4050 abstractC4050M151138 = c97662.m15113(new C9767());
                    abstractC4050M151138.getClass();
                    C9767 c9767 = (C9767) abstractC4050M151138;
                    int iM784817 = c9767.m7848(4);
                    objValueOf = iM784817 != 0 ? c9767.m7846(iM784817 + c9767.f11200) : null;
                    objValueOf.getClass();
                    break;
                case 9:
                    AbstractC4050 abstractC4050M151139 = c97662.m15113(new C9763());
                    abstractC4050M151139.getClass();
                    objValueOf = AbstractC3897.m7392(dexKitBridge, (C9763) abstractC4050M151139);
                    break;
                case 10:
                    AbstractC4050 abstractC4050M1511310 = c97662.m15113(new C9770());
                    abstractC4050M1511310.getClass();
                    objValueOf = AbstractC5894.m10607(dexKitBridge, (C9770) abstractC4050M1511310);
                    break;
                case 11:
                    AbstractC4050 abstractC4050M1511311 = c97662.m15113(new C9769());
                    abstractC4050M1511311.getClass();
                    objValueOf = AbstractC4765.m8880(dexKitBridge, (C9769) abstractC4050M1511311);
                    break;
                case 12:
                    AbstractC4050 abstractC4050M1511312 = c97662.m15113(new C9765());
                    abstractC4050M1511312.getClass();
                    objValueOf = AbstractC3898.m7421(dexKitBridge, (C9765) abstractC4050M1511312);
                    break;
                case 13:
                    AbstractC4050 abstractC4050M1511313 = c97662.m15113(new C9764());
                    abstractC4050M1511313.getClass();
                    objValueOf = m7216(dexKitBridge, (C9764) abstractC4050M1511313);
                    break;
                case 14:
                    AbstractC4050 abstractC4050M1511314 = c97662.m15113(new C9774());
                    abstractC4050M1511314.getClass();
                    objValueOf = (C9774) abstractC4050M1511314;
                    break;
                case 15:
                    AbstractC4050 abstractC4050M1511315 = c97662.m15113(new C9762());
                    abstractC4050M1511315.getClass();
                    C9762 c9762 = (C9762) abstractC4050M1511315;
                    int iM784818 = c9762.m7848(4);
                    objValueOf = Boolean.valueOf((iM784818 == 0 || c9762.f11199.get(iM784818 + c9762.f11200) == 0) ? false : true);
                    break;
                default:
                    C5043.m9170();
                    return null;
            }
            arrayList.add(new C6552(dexKitBridge, strM78462, new C6555(objValueOf, annotationEncodeValueTypeM15109)));
            i2++;
            i = 6;
        }
        return new C6553(dexKitBridge, strM7846, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final long m7217(long j, boolean z, int i, float f) {
        int iM13896 = ((z || i == 2 || i == 4 || i == 5) && C8727.m13892(j)) ? C8727.m13896(j) : Integer.MAX_VALUE;
        if (C8727.m13900(j) != iM13896) {
            iM13896 = AbstractC3400.m5650(AbstractC1821.m2472(f), C8727.m13900(j), iM13896);
        }
        return AbstractC7390.m12608(0, iM13896, 0, C8727.m13897(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5262 m7218(Annotation[] annotationArr, C5519 c5519) {
        Annotation annotation;
        annotationArr.getClass();
        c5519.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (AbstractC5227.m9466(AbstractC5263.m9536(AbstractC3889.m7316(AbstractC3889.m7319(annotation))).m9886(), c5519)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C5262(annotation);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m7219(InterfaceC5313 interfaceC5313) {
        interfaceC5313.getClass();
        if (!AbstractC7699.m12667(interfaceC5313)) {
            InterfaceC5331 interfaceC5331Mo9587 = interfaceC5313.mo9587();
            AbstractC7818 abstractC7818 = interfaceC5331Mo9587 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331Mo9587 : null;
            if (abstractC7818 != null && !abstractC7818.getName().f14049) {
                InterfaceC5313 interfaceC5313Mo9561 = interfaceC5313.mo9561();
                InterfaceC5303 interfaceC5303 = interfaceC5313Mo9561 instanceof InterfaceC5303 ? (InterfaceC5303) interfaceC5313Mo9561 : null;
                if (interfaceC5303 != null) {
                    String strM7220 = m7220(interfaceC5303, 3);
                    String str = C5242.f13332;
                    C5520 c5520M9504 = C5242.m9504(AbstractC5605.m10064(abstractC7818).f14041);
                    return AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c5520M9504 != null ? C7697.m12647(c5520M9504) : AbstractC3738.m6867(abstractC7818, C5484.f13938), strM7220);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m7220(InterfaceC5316 interfaceC5316, int i) {
        String strM9894;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        interfaceC5316.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC5316 instanceof InterfaceC5327) {
                strM9894 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
            } else {
                strM9894 = ((AbstractC7838) interfaceC5316).getName().m9894();
                strM9894.getClass();
            }
            sb.append(strM9894);
        }
        sb.append("(");
        C7835 c7835Mo9591 = interfaceC5316.mo9591();
        C8098 c8098 = C8098.f19712;
        if (c7835Mo9591 != null) {
            AbstractC5714 type = c7835Mo9591.getType();
            type.getClass();
            sb.append((AbstractC5477) AbstractC3738.m6850(type, C5470.f13901, c8098));
        }
        Iterator it = interfaceC5316.mo9594().iterator();
        while (it.hasNext()) {
            AbstractC5714 type2 = ((AbstractC7806) ((InterfaceC5288) it.next())).getType();
            type2.getClass();
            sb.append((AbstractC5477) AbstractC3738.m6850(type2, C5470.f13901, c8098));
        }
        sb.append(")");
        if (z) {
            if (interfaceC5316 instanceof InterfaceC5327) {
                sb.append("V");
            } else {
                AbstractC5714 returnType = interfaceC5316.getReturnType();
                returnType.getClass();
                C5523 c5523 = AbstractC7359.f18265;
                if (AbstractC7359.m12567(returnType, AbstractC7356.f18227)) {
                    AbstractC5714 returnType2 = interfaceC5316.getReturnType();
                    returnType2.getClass();
                    if (AbstractC5749.m10403(returnType2) || (interfaceC5316 instanceof C7820)) {
                    }
                }
                AbstractC5714 returnType3 = interfaceC5316.getReturnType();
                returnType3.getClass();
                sb.append((AbstractC5477) AbstractC3738.m6850(returnType3, C5470.f13901, c8098));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final FileVisitResult m7221(InterfaceC7380 interfaceC7380, Path path, Path path2, Path path3, Path path4, Exception exc) {
        int i = AbstractC5198.f13285[((OnErrorResult) interfaceC7380.invoke(path4, m7224(path, path2, path3, path4), exc)).ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final byte[] m7222(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C1083 m7223() {
        long[] jArr = AbstractC1137.f1352;
        return new C1083();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Path m7224(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        path.getClass();
        try {
            Path pathResolve = path2.resolve(AbstractC5200.m9426(path4, path).toString());
            if (pathResolve.normalize().startsWith(path3)) {
                return pathResolve;
            }
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path4 + "\nbase path: " + path, e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public abstract boolean mo7225(View view, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract void mo7228(View view, float f, float f2);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo7229(View view, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int mo7230(View view, int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int mo7231(View view, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int mo7232(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int mo7233() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract AbstractC4992 mo7234(C4974 c4974, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo7226(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo7227(View view, int i) {
    }
}
