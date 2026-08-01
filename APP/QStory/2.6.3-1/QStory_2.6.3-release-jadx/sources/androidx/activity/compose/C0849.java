package androidx.activity.compose;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.activity.C0869;
import androidx.activity.C0870;
import androidx.activity.C0880;
import androidx.activity.C0882;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.animation.core.C1177;
import androidx.compose.foundation.InterfaceC1864;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.foundation.layout.C1438;
import androidx.compose.foundation.layout.C1466;
import androidx.compose.foundation.layout.C1492;
import androidx.compose.foundation.layout.C1509;
import androidx.compose.foundation.layout.InterfaceC1449;
import androidx.compose.foundation.lazy.C1601;
import androidx.compose.foundation.lazy.layout.C1524;
import androidx.compose.foundation.lazy.layout.C1544;
import androidx.compose.foundation.lazy.layout.C1545;
import androidx.compose.foundation.text.C1781;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.C2421;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.spatial.C2802;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.C2136;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2218;
import androidx.compose.runtime.C2228;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.internal.C2077;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.C3165;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.http.content.C4814;
import io.ktor.server.http.content.C4945;
import io.ktor.server.http.content.C4953;
import io.ktor.util.C5039;
import io.ktor.util.C5043;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.C5980;
import kotlin.text.InterfaceC5982;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.channels.InterfaceC6032;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p022.C6946;
import p022.C6947;
import p025.AbstractC7004;
import p025.C6999;
import p025.C7003;
import p025.RunnableC7006;
import p026.AbstractC7014;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7992;
import p126.C8150;
import p132.C8168;
import p132.InterfaceC8174;
import p160.C8379;
import p189.C8563;
import p189.C8564;
import p221.C8737;
import p252.AbstractC8940;
import p252.C8954;
import p303.AbstractC9234;
import p345.AbstractC9594;
import p345.C9595;
import p348.C9614;
import p366.C9686;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.p015ui.components.C6804;
import top.suzhelan.qstory.p015ui.components.C6811;
import top.yukonga.miuix.kmp.basic.C6855;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0849 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f352;

    public /* synthetic */ C0849(Object obj, int i, Object obj2) {
        this.f352 = i;
        this.f350 = obj;
        this.f351 = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Type inference failed for: r14v75, types: [java.lang.Object, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [io.ktor.http.content.飘花落叶言子楪兰世哲苏] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45, types: [io.ktor.server.http.content.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r8v7, types: [T, androidx.fragment.app.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, androidx.fragment.app.飘花落叶言子楪兰苏哲世, 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏哲兰] */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? c4814;
        View decorView;
        Pair pair;
        View view;
        int i = 2;
        Throwable th = null;
        switch (this.f352) {
            case 0:
                C8563 c8563 = (C8563) this.f350;
                C0859 c0859 = (C0859) this.f351;
                C8379 c8379 = c8563.f21338;
                if (c8379 != null) {
                    C8379.m13342(c8379, (C8564) c0859.f577);
                } else {
                    C0870 c0870 = c8563.f21337;
                    if (c0870 == null) {
                        C6755.m11870("Unreachable");
                        return null;
                    }
                    C0869 c0869 = (C0869) c0859.f576;
                    c0869.getClass();
                    C0882 c0882 = new C0882(c0869, new C0880(c0869, null));
                    c0869.f413.add(c0882);
                    C8379.m13342(c0870.m587().f405, c0882);
                }
                return new C0855(c8563, z ? 1 : 0, c0859);
            case 1:
                ((C1414) ((InterfaceC1421) this.f350)).m1913((C1413) this.f351);
                return C6008.f15084;
            case 2:
                C2449 c2449 = (C2449) this.f350;
                AbstractC2433 abstractC2433 = (AbstractC2433) this.f351;
                C2593 c2593 = (C2593) ((InterfaceC2341) obj);
                c2593.m3871();
                InterfaceC2339.m3258(c2593, c2449, abstractC2433, 0.0f, null, 60);
                return C6008.f15084;
            case 3:
                C2421 c2421 = (C2421) this.f350;
                AbstractC2433 abstractC24332 = (AbstractC2433) this.f351;
                C2593 c25932 = (C2593) ((InterfaceC2341) obj);
                c25932.m3871();
                InterfaceC2339.m3258(c25932, c2421.f5018, abstractC24332, 0.0f, null, 60);
                return C6008.f15084;
            case 4:
                C2478 c2478 = (C2478) this.f350;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f351;
                z = ref$BooleanRef.element || ((InterfaceC1864) obj).mo1782(c2478);
                ref$BooleanRef.element = z;
                return Boolean.valueOf(!z);
            case 5:
                C8150 c8150 = (C8150) this.f350;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.f351;
                boolean z = ref$BooleanRef2.element || ((InterfaceC1864) obj).mo1783(c8150);
                ref$BooleanRef2.element = z;
                return Boolean.valueOf(!z);
            case 6:
                ((C1414) ((InterfaceC1421) this.f350)).m1913((InterfaceC1423) this.f351);
                return C6008.f15084;
            case 7:
                C1492 c1492 = (C1492) this.f350;
                AbstractC2559 abstractC2559 = (AbstractC2559) this.f351;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                long j = ((C8737) c1492.f2168.invoke(abstractC2543)).f22225;
                if (c1492.f2169) {
                    AbstractC2543.m3693(abstractC2543, abstractC2559, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    AbstractC2543.m3690(abstractC2543, abstractC2559, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return C6008.f15084;
            case 8:
                C1509 c1509 = (C1509) this.f350;
                AbstractC2559 abstractC25592 = (AbstractC2559) this.f351;
                AbstractC2543 abstractC25432 = (AbstractC2543) obj;
                boolean z2 = c1509.f2201;
                float f = c1509.f2200;
                if (z2) {
                    AbstractC2543.m3692(abstractC25432, abstractC25592, abstractC25432.mo1903(f), abstractC25432.mo1903(c1509.f2204));
                } else {
                    abstractC25432.m3695(abstractC25592, abstractC25432.mo1903(f), abstractC25432.mo1903(c1509.f2204), 0.0f);
                }
                return C6008.f15084;
            case 9:
                C1466 c1466 = (C1466) this.f350;
                View view2 = (View) this.f351;
                c1466.m1950(view2);
                return new C0855(c1466, 5, view2);
            case 10:
                C1545 c1545 = (C1545) this.f350;
                C1544 c1544 = (C1544) this.f351;
                C6008 c6008 = C6008.f15084;
                C2802 c2802 = c1545.f2325;
                if (c2802 != null) {
                    c2802.m4254();
                }
                c1545.f2325 = null;
                C6270 c6270 = c1544.f2323;
                if (c6270 != null) {
                    c6270.m11147(c6008);
                }
                c1544.f2323 = null;
                return c6008;
            case 11:
                C1524 c1524 = (C1524) this.f350;
                Object obj2 = this.f351;
                c1524.f2254.m1307(obj2);
                return new C0855(c1524, 6, obj2);
            case 12:
                return new C1524((InterfaceC8174) this.f350, (Map) obj, (C8168) this.f351);
            case 13:
                C1781 c1781 = (C1781) this.f350;
                AbstractC2433 abstractC24333 = (AbstractC2433) this.f351;
                C2593 c25933 = (C2593) ((InterfaceC2341) obj);
                c25933.m3871();
                if (((Boolean) ((AbstractC2182) c1781.f3017).getValue()).booleanValue() || ((Boolean) ((AbstractC2182) c1781.f3016).getValue()).booleanValue()) {
                    InterfaceC2339.m3261(c25933, abstractC24333, 0L, 0L, 0.0f, null, 126);
                }
                return C6008.f15084;
            case 14:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f350;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.f351;
                InterfaceC5982 interfaceC5982 = (InterfaceC5982) obj;
                if (ref$IntRef.element == -1) {
                    ref$IntRef.element = ((C5980) interfaceC5982).m10739().f18163;
                }
                ref$IntRef2.element = ((C5980) interfaceC5982).m10739().f18161 + 1;
                return "";
            case 15:
                ((C2228) this.f350).f4401.add(new C2136(obj, (InterfaceC6032) this.f351));
                return C6008.f15084;
            case 16:
                Set set = (Set) this.f350;
                C2228 c2228 = (C2228) this.f351;
                if (set.contains(obj)) {
                    C1083 c1083 = c2228.f4400;
                    C1082 c1082 = c2228.f4398;
                    Object objM1317 = c1083.m1317(obj);
                    if (objM1317 != null) {
                        if (objM1317 instanceof C1082) {
                            C1082 c10822 = (C1082) objM1317;
                            Object[] objArr = c10822.f1345;
                            long[] jArr = c10822.f1346;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j2) < 128) {
                                                c1082.m1301((InterfaceC6032) objArr[(i2 << 3) + i4]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c1082.m1301((InterfaceC6032) objM1317);
                        }
                    }
                }
                return C6008.f15084;
            case 17:
                C2198 c2198 = (C2198) this.f350;
                C1082 c10823 = (C1082) this.f351;
                c2198.m3004(obj);
                if (c10823 != null) {
                    c10823.m1301(obj);
                }
                return C6008.f15084;
            case 18:
                C2218 c2218 = (C2218) this.f350;
                Throwable th2 = (Throwable) this.f351;
                Throwable th3 = (Throwable) obj;
                synchronized (c2218.f4341) {
                    if (th2 != null) {
                        if (th3 != null) {
                            try {
                                Throwable th4 = th3 instanceof CancellationException ? null : th3;
                                if (th4 != null) {
                                    AbstractC6019.m10775(th2, th4);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        th = th2;
                    }
                    c2218.f4339 = th;
                    c2218.f4349.m10872(Recomposer$State.ShutDown);
                }
                return C6008.f15084;
            case 19:
                C6283 c6283 = (C6283) this.f350;
                C6270 c62702 = (C6270) this.f351;
                Throwable th6 = (Throwable) obj;
                if (th6 != null) {
                    c62702.m11088(th6);
                }
                c6283.m11114();
                return C6008.f15084;
            case 20:
                String str = (String) this.f350;
                ?? r14 = (InterfaceC7387) this.f351;
                URL url = (URL) obj;
                url.getClass();
                r14.getClass();
                String protocol = url.getProtocol();
                if (protocol != null) {
                    switch (protocol.hashCode()) {
                        case -341064690:
                            c4814 = protocol.equals("resource") ? new C4814(url, (C8954) r14.invoke(url)) : null;
                            break;
                        case 104987:
                            if (protocol.equals("jar") && !str.endsWith("/")) {
                                String string = url.toString();
                                string.getClass();
                                if (!AbstractC5971.m10698(string, "jar:file:", false)) {
                                    C6755.m11869("Only local jars are supported (jar:file:)");
                                    return null;
                                }
                                int iM10729 = AbstractC5976.m10729(string, "!", 9, false, 4);
                                if (iM10729 == -1) {
                                    C6755.m11873("Jar path requires !/ separator but it is: ".concat(string));
                                    return null;
                                }
                                C4945 c4945 = new C4945(new File(AbstractC8940.m14137(0, 0, string.substring(9, iM10729), 7)), str, (C8954) r14.invoke(url));
                                c4814 = ((Boolean) c4945.f12842.getValue()).booleanValue() ? c4945 : null;
                            } else {
                                c4814 = null;
                            }
                            break;
                        case 105516:
                            if (!protocol.equals("jrt")) {
                                c4814 = null;
                                break;
                            }
                            break;
                        case 3143036:
                            if (protocol.equals("file")) {
                                String path = url.getPath();
                                path.getClass();
                                File file = new File(AbstractC8940.m14137(0, 0, path, 7));
                                c4814 = file.isFile() ? new C4953(file, (C8954) r14.invoke(url)) : null;
                            } else {
                                c4814 = null;
                            }
                            break;
                        default:
                            c4814 = null;
                            break;
                    }
                } else {
                    c4814 = null;
                }
                if (c4814 != null) {
                    return new Pair(url, c4814);
                }
                return null;
            case 21:
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) this.f350;
                C5039 c5039 = (C5039) this.f351;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                interfaceC7387.invoke(th7);
                c5039.invoke(th7);
                return C6008.f15084;
            case 22:
                C7981 c7981 = (C7981) this.f350;
                Object obj3 = (AbstractC8005) this.f351;
                C9595 c9595 = (C9595) obj;
                c9595.m15027(AbstractC9234.m14532("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵呜喵"), AbstractC3275.m5142(2295, c9595, "喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵呜喵"));
                c9595.m15027(AbstractC9594.m15024(c7981), AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"));
                String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
                if (obj3 == null) {
                    obj3 = C7992.INSTANCE;
                }
                c9595.m15027(obj3, strM14532);
                return C6008.f15084;
            case 23:
                InterfaceC7383 interfaceC7383 = (InterfaceC7383) this.f350;
                C9686 c9686 = (C9686) this.f351;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                interfaceC7383.invoke(c9686.f25319, bool);
                return C6008.f15084;
            case 24:
                List list = (List) this.f350;
                InterfaceC7387 interfaceC73872 = (InterfaceC7387) this.f351;
                C1601 c1601 = (C1601) obj;
                AbstractC9234.m14531(2966);
                c1601.getClass();
                c1601.f2569.m2037(list.size(), new C0955(th, new C6811(1, list), new C2077(802480018, true, new C6804(list, interfaceC73872)), i));
                return C6008.f15084;
            case 25:
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) this.f350;
                InterfaceC2230 interfaceC22302 = (InterfaceC2230) this.f351;
                C9614 c9614 = (C9614) obj;
                AbstractC9234.m14531(3089);
                c9614.getClass();
                interfaceC2230.setValue(c9614);
                interfaceC22302.setValue(Boolean.FALSE);
                AbstractC7014.m12151(AbstractC9234.m14531(1291));
                return C6008.f15084;
            case 26:
                Context context = (Context) this.f350;
                String str2 = (String) this.f351;
                ImageView imageView = (ImageView) obj;
                AbstractC9234.m14531(3099);
                imageView.getClass();
                ((C3894) ((C3894) ComponentCallbacks2C3890.m7325(context).m7356(AbstractC9234.m14531(1134) + str2 + AbstractC9234.m14531(1135)).m7185(C0328R.drawable.user)).m7175(C0328R.drawable.user)).m7349(imageView);
                return C6008.f15084;
            case 27:
                C6855 c6855 = (C6855) this.f350;
                InterfaceC1449 interfaceC1449 = (InterfaceC1449) this.f351;
                InterfaceC1449 interfaceC14492 = (InterfaceC1449) obj;
                interfaceC14492.getClass();
                C1438 c1438 = new C1438(interfaceC1449, interfaceC14492);
                c6855.getClass();
                ((AbstractC2182) c6855.f16797).setValue(c1438);
                return C6008.f15084;
            case 28:
                C1177 c1177 = (C1177) this.f350;
                C1177 c11772 = (C1177) this.f351;
                InterfaceC2415 interfaceC2415 = (InterfaceC2415) obj;
                interfaceC2415.getClass();
                C2408 c2408 = (C2408) interfaceC2415;
                c2408.m3415(((Number) c1177.m1593()).floatValue());
                c2408.m3418(((Number) c11772.m1593()).floatValue());
                return C6008.f15084;
            default:
                Dialog dialog = (Dialog) this.f350;
                MainSettingActivity mainSettingActivity = (MainSettingActivity) this.f351;
                C7003 c7003 = (C7003) obj;
                AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵");
                c7003.getClass();
                dialog.dismiss();
                C6999 c6999 = C6999.f17312;
                String str3 = c7003.f17328;
                c6999.getClass();
                C6999.m12124(str3);
                AbstractC9234.m14531(13);
                AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵");
                String strConcat = c7003.f17326;
                int i5 = AbstractC7004.f17329[c7003.f17324.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    Object obj4 = c7003.f17323;
                    DirectoryUiInfo directoryUiInfo = obj4 instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj4 : null;
                    if (directoryUiInfo == null) {
                        if (AbstractC5971.m10698(strConcat, AbstractC9234.m14531(1325), false)) {
                            List listM10703 = AbstractC5976.m10703(AbstractC5976.m10706(strConcat, AbstractC9234.m14531(1325)), new String[]{AbstractC9234.m14532("喵呜喵喵呜喵喵呜~喵呜喵喵呜呜呜呜")}, 2);
                            if (listM10703.size() == 2) {
                                pair = new Pair(listM10703.get(0), listM10703.get(1));
                            }
                            if (pair != null) {
                            }
                        } else {
                            pair = null;
                            if (pair != null) {
                                directoryUiInfo = null;
                            } else {
                                String str4 = (String) pair.getFirst();
                                String str5 = (String) pair.getSecond();
                                for (Object obj5 : ItemUiInfoManager.rootContainer) {
                                    ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj5 instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj5 : null;
                                    if (itemUiInfoGroupWrapper != null && AbstractC5227.m9466(itemUiInfoGroupWrapper.getGroupName(), str4)) {
                                        for (BaseItemUiInfo baseItemUiInfo : itemUiInfoGroupWrapper.getDirectoryUIInfoList()) {
                                            DirectoryUiInfo directoryUiInfo2 = baseItemUiInfo instanceof DirectoryUiInfo ? (DirectoryUiInfo) baseItemUiInfo : null;
                                            if (directoryUiInfo2 != null && AbstractC5227.m9466(directoryUiInfo2.getItemName(), str5)) {
                                                directoryUiInfo = directoryUiInfo2;
                                            }
                                        }
                                    }
                                }
                                directoryUiInfo = null;
                            }
                        }
                    }
                    if (directoryUiInfo != null) {
                        AbstractC3146 supportFragmentManager = mainSettingActivity.getSupportFragmentManager();
                        AbstractC9234.m14531(1306);
                        supportFragmentManager.getClass();
                        String itemName = directoryUiInfo.getItemName();
                        if (!AbstractC5971.m10698(strConcat, AbstractC9234.m14531(1325), false)) {
                            strConcat = AbstractC9234.m14531(1326).concat(strConcat);
                        }
                        itemName.getClass();
                        mainSettingActivity.setTitleCenterText(itemName);
                        Bundle bundle = new Bundle();
                        bundle.putString(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"), strConcat);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? M4935 = supportFragmentManager.m4935(strConcat);
                        ref$ObjectRef.element = M4935;
                        if (M4935 == 0) {
                            ?? c6947 = new C6947(directoryUiInfo);
                            ref$ObjectRef.element = c6947;
                            c6947.m4999(bundle);
                        }
                        if (ref$ObjectRef.element != null) {
                            C3165 c3165 = new C3165(supportFragmentManager);
                            AbstractC9234.m14531(1307);
                            c3165.f7191 = C0328R.anim.slide_in_from_right;
                            c3165.f7190 = C0328R.anim.slide_out_to_left;
                            c3165.f7189 = C0328R.anim.fragment_pop_enter;
                            c3165.f7188 = C0328R.anim.fragment_pop_exit;
                            MainSettingActivity.Companion.getClass();
                            c3165.m4991(C0328R.id.itemList_container, (AbstractComponentCallbacksC3171) ref$ObjectRef.element, strConcat);
                            if (!c3165.f7200) {
                                C6755.m11870("This FragmentTransaction is not allowed to be added to the back stack.");
                                return null;
                            }
                            c3165.f7201 = true;
                            c3165.f7204 = null;
                            c3165.m4988(false);
                            Window window = mainSettingActivity.getWindow();
                            if (window != null && (decorView = window.getDecorView()) != null) {
                                decorView.postDelayed(new RunnableC7006(ref$ObjectRef, c7003, z ? 1 : 0), 400L);
                            }
                        }
                    }
                } else {
                    if (i5 != 3) {
                        C5043.m9170();
                        return null;
                    }
                    mainSettingActivity.getSupportFragmentManager().m4930();
                    AbstractC3146 supportFragmentManager2 = mainSettingActivity.getSupportFragmentManager();
                    AbstractC9234.m14531(1306);
                    supportFragmentManager2.getClass();
                    AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171M4935 = supportFragmentManager2.m4935(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"));
                    C6946 c6946 = abstractComponentCallbacksC3171M4935 instanceof C6946 ? (C6946) abstractComponentCallbacksC3171M4935 : null;
                    if (c6946 != null && (view = c6946.f7226) != null) {
                        view.postDelayed(new RunnableC0946(c6946, 10, c7003), 500L);
                    }
                }
                return C6008.f15084;
        }
    }
}
