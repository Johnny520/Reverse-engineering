package com.bumptech.glide;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;
import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0290;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.ui.graphics.C1599;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.AbstractC2905;
import com.android.dex.DexException;
import com.google.flatbuffers.AbstractC3218;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.server.routing.AbstractC4160;
import io.ktor.server.routing.C4142;
import io.ktor.util.C4211;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.io.path.AbstractC4366;
import kotlin.io.path.AbstractC4368;
import kotlin.io.path.IllegalFileNameException;
import kotlin.io.path.OnErrorResult;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4652;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.query.enums.AnnotationVisibilityType;
import org.luckypray.dexkit.result.AbstractC5719;
import org.luckypray.dexkit.result.C5722;
import org.luckypray.dexkit.result.C5723;
import org.luckypray.dexkit.result.C5725;
import p009.AbstractC6183;
import p031.C6327;
import p033.AbstractC6336;
import p052.InterfaceC6551;
import p053.AbstractC6561;
import p065.C6868;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p086.C7063;
import p086.InterfaceC7064;
import p101.InterfaceC7254;
import p144.C7547;
import p144.C7551;
import p205.C7898;
import p284.InterfaceC8385;
import p284.InterfaceC8386;
import p287.AbstractC8405;
import p363.C8930;
import p363.C8931;
import p364.C8932;
import p364.C8933;
import p364.C8934;
import p364.C8935;
import p364.C8936;
import p364.C8937;
import p364.C8938;
import p364.C8939;
import p364.C8940;
import p364.C8941;
import p364.C8942;
import p364.C8943;
import p364.C8944;
import p364.C8945;
import p364.C8946;
import p364.C8947;
import p384.C9012;
import p384.C9013;
import p384.C9015;
import p384.C9017;
import p384.C9018;
import p384.C9021;
import p384.C9026;
import p384.C9028;
import p384.C9031;
import p384.C9034;
import p384.C9050;
import p384.C9051;
import p384.C9057;
import p384.C9059;
import p384.C9065;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5856 f9758;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m6633(InterfaceC8385 interfaceC8385, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            interfaceC8385.writeByte((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m6634(InterfaceC8385 interfaceC8385, int i) {
        while (true) {
            int i2 = i;
            i >>>= 7;
            if (i == 0) {
                interfaceC8385.writeByte((byte) (i2 & 127));
                return;
            }
            interfaceC8385.writeByte((byte) ((i2 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final InterfaceC7064 m6635(Collection collection, C7063 c7063) {
        Iterator it = collection.iterator();
        InterfaceC7064 interfaceC7064 = null;
        while (it.hasNext()) {
            InterfaceC7064 interfaceC70642 = (InterfaceC7064) it.next();
            if (AbstractC4395.m8907(interfaceC70642.getType(), c7063)) {
                if (interfaceC7064 != null) {
                    C7547.m12774(c7063, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                interfaceC7064 = interfaceC70642;
            }
        }
        if (interfaceC7064 != null) {
            return interfaceC7064;
        }
        C7547.m12774(c7063, "No extensions handle the extension type: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final void m6636(C0236 c0236, Object obj) {
        boolean zM873;
        long[] jArr = c0236.f881;
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
                        Object obj2 = c0236.f880[i4];
                        Object obj3 = c0236.f879[i4];
                        if (obj3 instanceof C0235) {
                            C0235 c0235 = (C0235) obj3;
                            c0235.m746(obj);
                            zM873 = c0235.m873();
                        } else {
                            zM873 = obj3 == obj;
                        }
                        if (zM873) {
                            c0236.m759(i4);
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
    public static int m6637(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final long m6638(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C1599.m2950(C1599.m2948(j) * f, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m6639(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(AbstractC8405.m13972(13))).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m6640(byte[] bArr, XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        C6327 c6327 = C6327.f17435;
        c6327.getClass();
        C9050 c9050 = C9051.Companion;
        C9059 c9059 = ((C9051) c6327.m11842(c9050.serializer(), bArr)).f25335;
        C9065 c9065 = c9059.f25351;
        if (c9065 == null) {
            return;
        }
        C9057 c9057 = c9059.f25352;
        int i = c9057.f25345;
        int i2 = c9057.f25343;
        byte[] bArr2 = c9065.f25360;
        if (i == 528) {
            if (i2 == 138) {
                C9021 c9021 = C9017.Companion;
                C9018 c9018 = ((C9017) c6327.m11842(c9021.serializer(), bArr2)).f25298;
                int i3 = c9018.f25299;
                String str = c9018.f25303;
                String str2 = c9018.f25302;
                long j = c9018.f25301;
                long j2 = c9018.f25300;
                AbstractC8405.m13972(1362);
                str.getClass();
                AbstractC8405.m13972(1422);
                str2.getClass();
                C9018 c90182 = new C9018(str, str2, j, j2, 1);
                AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
                C9059 c9059M14613 = C9059.m14613(c9059, C9065.m14614(c9059.f25351, c6327.m11841(c9021.serializer(), new C9017(c90182))));
                AbstractC8405.m13972(1374);
                methodHookParam.args[1] = c6327.m11841(c9050.serializer(), new C9051(c9059M14613));
                C5856 c5856 = f9758;
                if (c5856 != null) {
                    c5856.m11257(new C9031(str, i3));
                    return;
                }
                return;
            }
            return;
        }
        if (i == 732 && i2 == 17) {
            byte[] bArrM8832 = AbstractC4347.m8832(0, bArr2, 7);
            byte[] bArrM88322 = AbstractC4347.m8832(7, bArr2, bArr2.length);
            C9026 c9026 = C9015.Companion;
            C9015 c9015 = (C9015) c6327.m11842(c9026.serializer(), bArrM88322);
            C9012 c9012 = c9015.f25296;
            long j3 = c9015.f25297;
            String str3 = c9012.f25290;
            C9013 c9013 = c9012.f25289;
            String strValueOf = String.valueOf(j3);
            int i4 = c9013.f25293;
            if (AbstractC4395.m8907(str3, QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()))) {
                return;
            }
            long j4 = c9013.f25292;
            String str4 = c9013.f25291;
            AbstractC8405.m13972(1431);
            str4.getClass();
            C9013 c90132 = new C9013(1, j4, str4);
            String str5 = c9012.f25290;
            AbstractC8405.m13972(1362);
            str5.getClass();
            AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜喵");
            C9012 c90122 = new C9012(str5, c90132);
            AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
            C9059 c9059M146132 = C9059.m14613(c9059, C9065.m14614(c9059.f25351, AbstractC4347.m8854(bArrM8832, c6327.m11841(c9026.serializer(), new C9015(j3, c90122, 1)))));
            AbstractC8405.m13972(1374);
            methodHookParam.args[1] = c6327.m11841(c9050.serializer(), new C9051(c9059M146132));
            C5856 c58562 = f9758;
            if (c58562 != null) {
                c58562.m11256(new C9028(i4, strValueOf, str3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6641(byte[] r18, de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3055.m6641(byte[], de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final boolean m6642(C0236 c0236, Object obj, Object obj2) {
        Object objM757 = c0236.m757(obj);
        if (objM757 == null) {
            return false;
        }
        if (!(objM757 instanceof C0235)) {
            if (!objM757.equals(obj2)) {
                return false;
            }
            c0236.m758(obj);
            return true;
        }
        C0235 c0235 = (C0235) objM757;
        boolean zM746 = c0235.m746(obj2);
        if (zM746 && c0235.m873()) {
            c0236.m758(obj);
        }
        return zM746;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static C9034 m6643(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i < bArr.length && i3 < 32; i3 += 7) {
            byte b = bArr[i];
            i2 |= (b & 127) << i3;
            i++;
            if ((b & 128) == 0) {
                return new C9034(i2, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static int m6644(InterfaceC8386 interfaceC8386) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            byte b = interfaceC8386.readByte();
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
    public static int m6645(InterfaceC8386 interfaceC8386) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        do {
            byte b = interfaceC8386.readByte();
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
    public static final void m6646(Path path) throws IllegalFileNameException {
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
    public static void m6647(StringBuilder sb, String str) {
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
    public static final void m6648(C0236 c0236, Object obj, Object obj2) {
        int iM749 = c0236.m749(obj);
        boolean z = iM749 < 0;
        Object obj3 = z ? null : c0236.f879[iM749];
        if (obj3 != null) {
            if (obj3 instanceof C0235) {
                ((C0235) obj3).m741(obj2);
            } else if (obj3 != obj2) {
                C0235 c0235 = new C0235();
                c0235.m741(obj3);
                c0235.m741(obj2);
                obj2 = c0235;
            }
            obj2 = obj3;
        }
        if (!z) {
            c0236.f879[iM749] = obj2;
            return;
        }
        int i = ~iM749;
        c0236.f880[i] = obj;
        c0236.f879[i] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7551 m6649(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C7551(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ArrayList m6650(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m6650(childAt));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6651(p251.SharedPreferencesC8176 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3055.m6651(飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世苏兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList m6652(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C4430(annotation));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static Activity m6653() {
        try {
        } catch (Exception unused) {
        }
        for (Object obj : ((Map) AbstractC6336.m11864(AbstractC6336.m11860(Class.forName(AbstractC8405.m13972(10)), AbstractC8405.m13972(11)).get(null), AbstractC8405.m13972(12))).values()) {
            if (!((Boolean) AbstractC6336.m11859(Boolean.TYPE, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵喵喵"), obj)).booleanValue()) {
                Activity activity = (Activity) AbstractC6336.m11860(obj.getClass(), AbstractC8405.m13972(13)).get(obj);
                AbstractC3056.m6687(activity);
                return activity;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static byte[] m6654(byte[] bArr) {
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
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final HashSet m6655(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo9166 = ((InterfaceC7254) it.next()).mo9166();
            if (setMo9166 == null) {
                return null;
            }
            AbstractC4344.m8804(setMo9166, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static C5723 m6656(DexKitBridge dexKitBridge, C8935 c8935) {
        Object objValueOf;
        dexKitBridge.getClass();
        int iM7289 = c8935.m7289(4);
        if (iM7289 != 0) {
            c8935.f10854.getInt(iM7289 + c8935.f10855);
        }
        int i = 6;
        int iM72892 = c8935.m7289(6);
        if (iM72892 != 0) {
            c8935.f10854.getInt(iM72892 + c8935.f10855);
        }
        int iM72893 = c8935.m7289(8);
        String strM7287 = iM72893 != 0 ? c8935.m7287(iM72893 + c8935.f10855) : null;
        strM7287.getClass();
        C8930 c8930 = AnnotationVisibilityType.Companion;
        int iM72894 = c8935.m7289(10);
        byte b = iM72894 != 0 ? c8935.f10854.get(iM72894 + c8935.f10855) : (byte) 0;
        c8930.getClass();
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            C5925.m11310(AbstractC6183.m11588(b, "Unknown AnnotationVisibilityType: "));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM72895 = c8935.m7289(12);
        int iM7285 = iM72895 != 0 ? c8935.m7285(iM72895) : 0;
        int i2 = 0;
        while (i2 < iM7285) {
            C8937 c8937 = new C8937();
            int iM72896 = c8935.m7289(12);
            if (iM72896 != 0) {
                int iM7290 = c8935.m7290((i2 * 4) + c8935.m7286(iM72896));
                ByteBuffer byteBuffer = c8935.f10854;
                byteBuffer.getClass();
                c8937.m7288(byteBuffer, iM7290);
            } else {
                c8937 = null;
            }
            c8937.getClass();
            C8937 c89372 = new C8937();
            int iM72897 = c8937.m7289(i);
            if (iM72897 != 0) {
                int iM72902 = c8937.m7290(iM72897 + c8937.f10855);
                ByteBuffer byteBuffer2 = c8937.f10854;
                byteBuffer2.getClass();
                c89372.m7288(byteBuffer2, iM72902);
            } else {
                c89372 = null;
            }
            c89372.getClass();
            int iM72898 = c8937.m7289(4);
            String strM72872 = iM72898 != 0 ? c8937.m7287(iM72898 + c8937.f10855) : null;
            strM72872.getClass();
            C8931 c8931 = AnnotationEncodeValueType.Companion;
            int iM72899 = c89372.m7289(i);
            byte b2 = iM72899 != 0 ? c89372.f10854.get(iM72899 + c89372.f10855) : (byte) 0;
            c8931.getClass();
            AnnotationEncodeValueType annotationEncodeValueTypeM14550 = C8931.m14550(b2);
            switch (AbstractC5719.f15681[annotationEncodeValueTypeM14550.ordinal()]) {
                case 1:
                    AbstractC3218 abstractC3218M14554 = c89372.m14554(new C8932());
                    abstractC3218M14554.getClass();
                    C8932 c8932 = (C8932) abstractC3218M14554;
                    int iM728910 = c8932.m7289(4);
                    objValueOf = Byte.valueOf(iM728910 != 0 ? c8932.f10854.get(iM728910 + c8932.f10855) : (byte) 0);
                    break;
                case 2:
                    AbstractC3218 abstractC3218M145542 = c89372.m14554(new C8939());
                    abstractC3218M145542.getClass();
                    C8939 c8939 = (C8939) abstractC3218M145542;
                    int iM728911 = c8939.m7289(4);
                    objValueOf = Short.valueOf(iM728911 != 0 ? c8939.f10854.getShort(iM728911 + c8939.f10855) : (short) 0);
                    break;
                case 3:
                    AbstractC3218 abstractC3218M145543 = c89372.m14554(new C8943());
                    abstractC3218M145543.getClass();
                    C8943 c8943 = (C8943) abstractC3218M145543;
                    int iM728912 = c8943.m7289(4);
                    objValueOf = Short.valueOf(iM728912 != 0 ? c8943.f10854.getShort(iM728912 + c8943.f10855) : (short) 0);
                    break;
                case 4:
                    AbstractC3218 abstractC3218M145544 = c89372.m14554(new C8947());
                    abstractC3218M145544.getClass();
                    C8947 c8947 = (C8947) abstractC3218M145544;
                    int iM728913 = c8947.m7289(4);
                    objValueOf = Integer.valueOf(iM728913 != 0 ? c8947.f10854.getInt(iM728913 + c8947.f10855) : 0);
                    break;
                case 5:
                    AbstractC3218 abstractC3218M145545 = c89372.m14554(new C8944());
                    abstractC3218M145545.getClass();
                    C8944 c8944 = (C8944) abstractC3218M145545;
                    int iM728914 = c8944.m7289(4);
                    objValueOf = Long.valueOf(iM728914 != 0 ? c8944.f10854.getLong(iM728914 + c8944.f10855) : 0L);
                    break;
                case 6:
                    AbstractC3218 abstractC3218M145546 = c89372.m14554(new C8946());
                    abstractC3218M145546.getClass();
                    C8946 c8946 = (C8946) abstractC3218M145546;
                    int iM728915 = c8946.m7289(4);
                    objValueOf = Float.valueOf(iM728915 != 0 ? c8946.f10854.getFloat(iM728915 + c8946.f10855) : 0.0f);
                    break;
                case 7:
                    AbstractC3218 abstractC3218M145547 = c89372.m14554(new C8942());
                    abstractC3218M145547.getClass();
                    C8942 c8942 = (C8942) abstractC3218M145547;
                    int iM728916 = c8942.m7289(4);
                    objValueOf = Double.valueOf(iM728916 != 0 ? c8942.f10854.getDouble(iM728916 + c8942.f10855) : 0.0d);
                    break;
                case 8:
                    AbstractC3218 abstractC3218M145548 = c89372.m14554(new C8938());
                    abstractC3218M145548.getClass();
                    C8938 c8938 = (C8938) abstractC3218M145548;
                    int iM728917 = c8938.m7289(4);
                    objValueOf = iM728917 != 0 ? c8938.m7287(iM728917 + c8938.f10855) : null;
                    objValueOf.getClass();
                    break;
                case 9:
                    AbstractC3218 abstractC3218M145549 = c89372.m14554(new C8934());
                    abstractC3218M145549.getClass();
                    objValueOf = AbstractC3065.m6832(dexKitBridge, (C8934) abstractC3218M145549);
                    break;
                case 10:
                    AbstractC3218 abstractC3218M1455410 = c89372.m14554(new C8941());
                    abstractC3218M1455410.getClass();
                    objValueOf = AbstractC5062.m10048(dexKitBridge, (C8941) abstractC3218M1455410);
                    break;
                case 11:
                    AbstractC3218 abstractC3218M1455411 = c89372.m14554(new C8940());
                    abstractC3218M1455411.getClass();
                    objValueOf = AbstractC3933.m8321(dexKitBridge, (C8940) abstractC3218M1455411);
                    break;
                case 12:
                    AbstractC3218 abstractC3218M1455412 = c89372.m14554(new C8936());
                    abstractC3218M1455412.getClass();
                    objValueOf = AbstractC3066.m6861(dexKitBridge, (C8936) abstractC3218M1455412);
                    break;
                case 13:
                    AbstractC3218 abstractC3218M1455413 = c89372.m14554(new C8935());
                    abstractC3218M1455413.getClass();
                    objValueOf = m6656(dexKitBridge, (C8935) abstractC3218M1455413);
                    break;
                case 14:
                    AbstractC3218 abstractC3218M1455414 = c89372.m14554(new C8945());
                    abstractC3218M1455414.getClass();
                    objValueOf = (C8945) abstractC3218M1455414;
                    break;
                case 15:
                    AbstractC3218 abstractC3218M1455415 = c89372.m14554(new C8933());
                    abstractC3218M1455415.getClass();
                    C8933 c8933 = (C8933) abstractC3218M1455415;
                    int iM728918 = c8933.m7289(4);
                    objValueOf = Boolean.valueOf((iM728918 == 0 || c8933.f10854.get(iM728918 + c8933.f10855) == 0) ? false : true);
                    break;
                default:
                    C4211.m8611();
                    return null;
            }
            arrayList.add(new C5722(dexKitBridge, strM72872, new C5725(objValueOf, annotationEncodeValueTypeM14550)));
            i2++;
            i = 6;
        }
        return new C5723(dexKitBridge, strM7287, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final long m6657(long j, boolean z, int i, float f) {
        int iM13337 = ((z || i == 2 || i == 4 || i == 5) && C7898.m13333(j)) ? C7898.m13337(j) : Integer.MAX_VALUE;
        if (C7898.m13341(j) != iM13337) {
            iM13337 = AbstractC2567.m5090(AbstractC0983.m1912(f), C7898.m13341(j), iM13337);
        }
        return AbstractC6561.m12049(0, iM13337, 0, C7898.m13338(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4430 m6658(Annotation[] annotationArr, C4687 c4687) {
        Annotation annotation;
        annotationArr.getClass();
        c4687.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (AbstractC4395.m8907(AbstractC4431.m8977(AbstractC3057.m6756(AbstractC3057.m6759(annotation))).m9327(), c4687)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C4430(annotation);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m6659(InterfaceC4481 interfaceC4481) {
        interfaceC4481.getClass();
        if (!AbstractC6870.m12108(interfaceC4481)) {
            InterfaceC4499 interfaceC4499Mo9028 = interfaceC4481.mo9028();
            AbstractC6989 abstractC6989 = interfaceC4499Mo9028 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4499Mo9028 : null;
            if (abstractC6989 != null && !abstractC6989.getName().f13704) {
                InterfaceC4481 interfaceC4481Mo9002 = interfaceC4481.mo9002();
                InterfaceC4471 interfaceC4471 = interfaceC4481Mo9002 instanceof InterfaceC4471 ? (InterfaceC4471) interfaceC4481Mo9002 : null;
                if (interfaceC4471 != null) {
                    String strM6660 = m6660(interfaceC4471, 3);
                    String str = C4410.f12987;
                    C4688 c4688M8945 = C4410.m8945(AbstractC4773.m9505(abstractC6989).f13696);
                    return AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c4688M8945 != null ? C6868.m12088(c4688M8945) : AbstractC2905.m6307(abstractC6989, C4652.f13593), strM6660);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6660(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484 r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            r1 = r2
        Le:
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r1 == 0) goto L30
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
            if (r1 == 0) goto L1f
            java.lang.String r1 = "<init>"
            goto L2d
        L1f:
            r1 = r5
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲世苏兰 r1 = (p079.AbstractC7009) r1
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = r1.getName()
            java.lang.String r1 = r1.m9335()
            r1.getClass()
        L2d:
            r6.append(r1)
        L30:
            java.lang.String r1 = "("
            r6.append(r1)
            飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏世哲 r1 = r5.mo9032()
            飘花落叶言世苏楪兰子哲.飘花落叶言子楪世哲兰苏 r2 = p103.C7269.f19367
            if (r1 == 0) goto L4f
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r1 = r1.getType()
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4638.f13556
            java.lang.Object r1 = com.alibaba.fastjson2.AbstractC2905.m6290(r1, r3, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4645) r1
            r6.append(r1)
        L4f:
            java.util.List r1 = r5.mo9035()
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世兰楪苏哲 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456) r3
            飘花落叶言世楪子苏兰哲.飘花落叶言子世兰楪苏哲 r3 = (p079.AbstractC6977) r3
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r3 = r3.getType()
            r3.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4638.f13556
            java.lang.Object r3 = com.alibaba.fastjson2.AbstractC2905.m6290(r3, r4, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4645) r3
            r6.append(r3)
            goto L57
        L78:
            java.lang.String r1 = ")"
            r6.append(r1)
            if (r0 == 0) goto Lbe
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
            if (r0 == 0) goto L84
            goto La6
        L84:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r5.getReturnType()
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰 r1 = p049.AbstractC6530.f17920
            kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲兰苏 r1 = p049.AbstractC6527.f17882
            boolean r0 = p049.AbstractC6530.m12008(r0, r1)
            if (r0 == 0) goto Lac
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r0 = r5.getReturnType()
            r0.getClass()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.AbstractC4917.m9844(r0)
            if (r0 != 0) goto Lac
            boolean r0 = r5 instanceof p079.C6991
            if (r0 != 0) goto Lac
        La6:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lbe
        Lac:
            kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲 r5 = r5.getReturnType()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.C4638.f13556
            java.lang.Object r5 = com.alibaba.fastjson2.AbstractC2905.m6290(r5, r0, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪哲苏世兰 r5 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC4645) r5
            r6.append(r5)
        Lbe:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3055.m6660(kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰世苏哲, int):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final FileVisitResult m6661(InterfaceC6551 interfaceC6551, Path path, Path path2, Path path3, Path path4, Exception exc) {
        int i = AbstractC4366.f12940[((OnErrorResult) interfaceC6551.invoke(path4, m6664(path, path2, path3, path4), exc)).ordinal()];
        if (i == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final byte[] m6662(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
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
    public static C0236 m6663() {
        long[] jArr = AbstractC0290.f1007;
        return new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Path m6664(Path path, Path path2, Path path3, Path path4) throws IllegalFileNameException {
        path.getClass();
        try {
            Path pathResolve = path2.resolve(AbstractC4368.m8867(path4, path).toString());
            if (pathResolve.normalize().startsWith(path3)) {
                return pathResolve;
            }
            throw new IllegalFileNameException(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path4 + "\nbase path: " + path, e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public abstract boolean mo6665(View view, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract void mo6668(View view, float f, float f2);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo6669(View view, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int mo6670(View view, int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int mo6671(View view, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int mo6672(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int mo6673() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract AbstractC4160 mo6674(C4142 c4142, int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo6666(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo6667(View view, int i) {
    }
}
