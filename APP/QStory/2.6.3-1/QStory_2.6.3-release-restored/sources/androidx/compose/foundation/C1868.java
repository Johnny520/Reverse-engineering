package androidx.compose.foundation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.collection.C1082;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.selection.C1617;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC1665;
import androidx.compose.foundation.text.contextmenu.modifier.C1663;
import androidx.compose.material.ripple.C1941;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.C2110;
import androidx.compose.runtime.snapshots.C2113;
import androidx.core.view.C3101;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.C4751;
import io.ktor.http.cio.C4793;
import io.ktor.http.cio.C4806;
import io.ktor.http.content.AbstractC4826;
import io.ktor.network.sockets.AbstractC4856;
import io.ktor.server.cio.C4911;
import io.ktor.server.engine.AbstractC4921;
import io.ktor.server.engine.C4934;
import io.ktor.server.engine.C4941;
import io.ktor.server.request.C4958;
import io.ktor.server.routing.C4988;
import io.ktor.util.C5044;
import io.modelcontextprotocol.kotlin.sdk.server.C5128;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.InterfaceC5230;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import kotlin.sequences.C5953;
import kotlin.text.Regex;
import okhttp3.internal.http2.ErrorCode;
import p023.C6979;
import p026.AbstractC7017;
import p035.C7106;
import p049.AbstractC7166;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p072.C7543;
import p103.AbstractC7973;
import p104.AbstractC8005;
import p105.C8009;
import p105.C8011;
import p107.C8019;
import p107.C8022;
import p107.C8023;
import p107.InterfaceC8020;
import p128.C8157;
import p137.C8217;
import p252.AbstractC8944;
import p252.AbstractC8956;
import p252.C8934;
import p252.C8942;
import p252.C8945;
import p252.InterfaceC8924;
import p252.InterfaceC8941;
import p267.AbstractC9004;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6766;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1868 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3369;

    public /* synthetic */ C1868(Bundle bundle, C6766 c6766) {
        this.f3369 = 23;
        this.f3368 = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038f  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 7;
        int i2 = 6;
        boolean z5 = true;
        boolean z6 = true;
        int i3 = 2;
        boolean z7 = false;
        switch (this.f3369) {
            case 0:
                InterfaceC7372 interfaceC7372 = ((C1865) this.f3368).f3366;
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
                return Boolean.TRUE;
            case 1:
                C1880 c1880 = (C1880) this.f3368;
                InterfaceC1923 interfaceC1923 = (InterfaceC1923) AbstractC2620.m3916(c1880, AbstractC1919.f3556);
                c1880.f3411 = interfaceC1923;
                c1880.f3412 = interfaceC1923 != null ? interfaceC1923.mo2512() : null;
                return C6008.f15084;
            case 2:
                return (C8157) this.f3368;
            case 3:
                ((C1617) this.f3368).f2592.invoke(Boolean.valueOf(!r0.f2593));
                return C6008.f15084;
            case 4:
                C1663 c1663 = (C1663) this.f3368;
                return c1663.f6624 ? AbstractC1665.m2205(c1663) : C8217.f20378;
            case 5:
                AbstractC2620.m3911((C1941) this.f3368);
                return C6008.f15084;
            case 6:
                C2110 c2110 = (C2110) this.f3368;
                while (true) {
                    Object obj2 = c2110.f4060;
                    synchronized (obj2) {
                        try {
                            if (c2110.f4056) {
                                obj = obj2;
                                z = z5;
                                z2 = z7;
                            } else {
                                c2110.f4056 = z5;
                                try {
                                    C2059 c2059 = c2110.f4053;
                                    Object[] objArr = c2059.f3866;
                                    int i4 = c2059.f3865;
                                    for (?? r8 = z7; r8 < i4; r8++) {
                                        try {
                                            C2113 c2113 = (C2113) objArr[r8];
                                            C1082 c1082 = c2113.f4080;
                                            InterfaceC7387 interfaceC7387 = c2113.f4077;
                                            Object[] objArr2 = c1082.f1345;
                                            long[] jArr = c1082.f1346;
                                            int length = jArr.length - i3;
                                            if (length >= 0) {
                                                int i5 = i;
                                                obj = obj2;
                                                ?? r14 = z7;
                                                while (true) {
                                                    try {
                                                        long j = jArr[r14];
                                                        z4 = z5;
                                                        if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i6 = 8 - ((~(r14 - length)) >>> 31);
                                                            for (?? r15 = z7; r15 < i6; r15++) {
                                                                if ((j & 255) < 128) {
                                                                    interfaceC7387.invoke(objArr2[(r14 << 3) + r15]);
                                                                }
                                                                j >>= 8;
                                                            }
                                                            if (i6 == 8) {
                                                                if (r14 != length) {
                                                                    z5 = z4;
                                                                    z7 = false;
                                                                    i5 = 7;
                                                                    r14++;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z3 = false;
                                                        c2110.f4056 = z3;
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                obj = obj2;
                                                z4 = z5;
                                            }
                                            c1082.m1300();
                                            z5 = z4;
                                            i = 7;
                                            i3 = 2;
                                            z7 = false;
                                            obj2 = obj;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj2;
                                        }
                                    }
                                    obj = obj2;
                                    z = z5;
                                    z2 = z7;
                                    try {
                                        c2110.f4056 = z2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj2;
                                    z3 = z7;
                                }
                            }
                            if (!c2110.m2807()) {
                                return C6008.f15084;
                            }
                            z7 = z2;
                            z5 = z;
                            i = 7;
                            i3 = 2;
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                }
                break;
            case 7:
                C4806 c4806 = ((C4793) this.f3368).f12537;
                LinkedHashSet linkedHashSet = new LinkedHashSet(c4806.f12566);
                int i7 = c4806.f12566;
                for (int i8 = 0; i8 < i7; i8++) {
                    linkedHashSet.add(c4806.m8938(i8).toString());
                }
                return linkedHashSet;
            case 8:
                ((AbstractC4856) this.f3368).m8987();
                return C6008.f15084;
            case 9:
                return new C4941(((C4911) ((AbstractC4921) this.f3368)).f12733);
            case 10:
                return (InterfaceC9970) this.f3368;
            case 11:
                C4934 c4934 = (C4934) this.f3368;
                long j2 = c4934.f12799.f12744;
                c4934.m9067(j2, j2);
                return C6008.f15084;
            case 12:
                C4751 c4751 = (C4751) this.f3368;
                String str = (String) c4751.f12474;
                AbstractC4826 abstractC4826 = (AbstractC4826) c4751.f12475;
                if (str == null) {
                    return abstractC4826.mo8841();
                }
                C8942 c8942 = InterfaceC8941.f22754;
                C8945 c8945 = new C8945(2);
                InterfaceC8941 interfaceC8941Mo8841 = abstractC4826.mo8841();
                C1594 c1594 = new C1594(14);
                interfaceC8941Mo8841.getClass();
                interfaceC8941Mo8841.mo8914(new C1898(c8945, i2, c1594));
                String[] strArr = AbstractC8944.f22758;
                c8945.mo2983("Content-Encoding", str);
                return c8945.m14144();
            case 13:
                List<String> listMo8913 = ((C4958) this.f3368).f12865.mo944().mo8913("Cookie");
                if (listMo8913 == null) {
                    return AbstractC5171.m9335();
                }
                HashMap map = new HashMap(listMo8913.size());
                for (String str2 : listMo8913) {
                    Regex regex = AbstractC8956.f22774;
                    str2.getClass();
                    C5953 c5953M10670 = AbstractC5954.m10670(new C5947(AbstractC5954.m10670(Regex.findAll$default(AbstractC8956.f22774, str2, 0, 2, null), new C8009(5)), true, new C8009(i2)), new C8009(i));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = c5953M10670.f15002.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) c5953M10670.f15001.invoke(it.next());
                        linkedHashMap.put(pair.component1(), pair.component2());
                    }
                    map.putAll(AbstractC5171.m9326(linkedHashMap));
                }
                return map;
            case 14:
                C4988 c4988 = (C4988) this.f3368;
                C8942 c89422 = InterfaceC8924.f22683;
                C8934 c8934 = new C8934(2);
                c8934.m2985(c4988.f12935.getParameters());
                InterfaceC8924 interfaceC8924 = c4988.f12930;
                interfaceC8924.getClass();
                interfaceC8924.mo8914(new C5044(c8934, z6 ? 1 : 0));
                return c8934.build();
            case 15:
                return new RandomAccessFile((File) this.f3368, "r");
            case 16:
                ((RandomAccessFile) ((InterfaceC6016) this.f3368).getValue()).close();
                return C6008.f15084;
            case 17:
                return "Handling initialize request from client " + ((C7543) this.f3368).f18484;
            case 18:
                return "Initializing MCP server with capabilities: " + ((C5128) this.f3368).f13203;
            case 19:
                Object[] objArr3 = (Object[]) this.f3368;
                objArr3.getClass();
                return new C3101(objArr3);
            case 20:
                return ((Iterable) this.f3368).iterator();
            case 21:
                Object obj3 = ((AbstractC5226) this.f3368).f13319;
                InterfaceC5230 interfaceC5230 = obj3 instanceof InterfaceC5230 ? (InterfaceC5230) obj3 : null;
                if (interfaceC5230 != null) {
                    return interfaceC5230.findJavaDeclaration();
                }
                return null;
            case 22:
                return this.f3368;
            case 23:
                Bundle bundle = (Bundle) this.f3368;
                try {
                    try {
                        Object obj4 = C6766.f16473;
                        if (obj4 != null) {
                            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.qroute.QRoute");
                            Class clsM124252 = AbstractC7166.m12425("com.tencent.qqnt.msg.api.IMsgService");
                            Class clsM124253 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.MsgElement");
                            Class clsM124254 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact");
                            Object objCallStaticMethod = XposedHelpers.callStaticMethod(clsM12425, "api", new Object[]{clsM124252});
                            String string = bundle.getString("Uid");
                            if (string != null) {
                                int i9 = bundle.getInt("uintype", -1);
                                objCallStaticMethod.getClass();
                                clsM124253.getClass();
                                clsM124254.getClass();
                                C6766.m11877(string, i9, obj4, objCallStaticMethod, clsM124253, clsM124254);
                            }
                            ArrayList<Parcelable> parcelableArrayList = bundle.getParcelableArrayList("forward_multi_target");
                            if (parcelableArrayList != null) {
                                for (Parcelable parcelable : parcelableArrayList) {
                                    Object objectField = XposedHelpers.getObjectField(parcelable, "uin");
                                    "null cannot be cast to non-null type kotlin.String";
                                    objectField.getClass();
                                    int intField = XposedHelpers.getIntField(parcelable, "uinType");
                                    objCallStaticMethod.getClass();
                                    clsM124253.getClass();
                                    clsM124254.getClass();
                                    C6766.m11877((String) objectField, intField, obj4, objCallStaticMethod, clsM124253, clsM124254);
                                }
                            }
                        }
                        break;
                    } catch (Exception e) {
                        XposedBridge.log("PttForward: 发送线程异常: " + e.getMessage());
                        break;
                    }
                    C6766.f16473 = null;
                    return C6008.f15084;
                } finally {
                    C6766.f16473 = null;
                }
            case 24:
                try {
                    ((C5317) this.f3368).m9608();
                    break;
                } catch (Exception e2) {
                    AbstractC7017.m12163(e2, "check");
                }
                return C6008.f15084;
            case 25:
                List<Certificate> listM12106 = ((C6979) this.f3368).m12106();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12106, 10));
                for (Certificate certificate : listM12106) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 26:
                C7106 c7106 = (C7106) this.f3368;
                c7106.getClass();
                try {
                    c7106.f17645.m12361(2, 0, false);
                    break;
                } catch (IOException e3) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    c7106.m12366(errorCode, errorCode, e3);
                }
                return C6008.f15084;
            case 27:
                return "No method in " + ((AbstractC8005) this.f3368);
            case 28:
                C8011 c8011 = (C8011) this.f3368;
                C8019 c8019M14207 = AbstractC9004.m14207("kotlinx.serialization.Polymorphic", C8022.f19538, new InterfaceC8020[0], new C6886(c8011, 4));
                InterfaceC5925 interfaceC5925 = c8011.f19514;
                interfaceC5925.getClass();
                return new C8023(c8019M14207, interfaceC5925);
            default:
                C8019 c8019 = (C8019) this.f3368;
                return Integer.valueOf(AbstractC7973.m12971(c8019, c8019.f19525));
        }
    }

    public /* synthetic */ C1868(Object obj, int i) {
        this.f3369 = i;
        this.f3368 = obj;
    }
}
