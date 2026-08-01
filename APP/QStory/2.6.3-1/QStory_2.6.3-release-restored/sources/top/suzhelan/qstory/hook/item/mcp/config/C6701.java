package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1886;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.bumptech.glide.AbstractC3889;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.http.content.C4815;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.engine.AbstractC4925;
import io.ktor.server.engine.C4934;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.server.routing.C4988;
import io.ktor.server.routing.C4989;
import io.ktor.server.routing.C4995;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.internal.C6183;
import kotlinx.coroutines.sync.C6212;
import kotlinx.p010io.InterfaceC6313;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import p075.C7686;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7991;
import p104.C8000;
import p111.C8036;
import p111.ExecutorC8037;
import p252.AbstractC8938;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8942;
import p252.C8954;
import p252.InterfaceC8941;
import p345.AbstractC9587;
import p345.AbstractC9594;
import p345.C9593;
import p345.C9595;
import p345.C9600;
import p345.C9601;
import p345.C9603;
import p345.C9604;
import p345.C9605;
import p345.InterfaceC9598;
import p407.C9924;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6701 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6703 f16375;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6212 f16376;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C6183 f16377;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f16378;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6701 f16379;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9924 f16380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f16381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4934 f16382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f16383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f16385;

    static {
        "McpServerConfig";
        "tool_order";
        "tool_enabled_";
        "/mcp";
        f16375 = new C6703();
        C6254 c6254M11046 = AbstractC6231.m11046();
        C8036 c8036 = AbstractC6227.f15375;
        f16377 = AbstractC6231.m11048(AbstractC1298.m1714(ExecutorC8037.f19570, c6254M11046));
        f16376 = new C6212();
        f16380 = new C9924("McpServerConfig", 0);
        ArrayList arrayListM9352 = AbstractC5176.m9352(AbstractC9587.f25028, AbstractC7176.m12490(C9600.f25056, C9604.f25068, C9601.f25061, C9605.f25073, C9593.f25045));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM9352) {
            if (hashSet.add(((InterfaceC9598) obj).getId())) {
                arrayList.add(obj);
            }
        }
        f16378 = arrayList;
    }

    public C6701(InterfaceC7387 interfaceC7387, int i) {
        String strM14531 = "QStoryMCP";
        "serverName";
        "onLog";
        this.f16385 = i;
        this.f16384 = strM14531;
        this.f16383 = interfaceC7387;
        this.f16381 = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11826(C6701 c6701) {
        Object objM723;
        CopyOnWriteArrayList<InterfaceC6039> copyOnWriteArrayList = c6701.f16381;
        InterfaceC7387 interfaceC7387 = c6701.f16383;
        try {
            interfaceC7387.invoke("MCP 服务 正在停止");
            C4934 c4934 = c6701.f16382;
            if (c4934 != null) {
                c4934.m9067(1000L, 2000L);
            }
            for (InterfaceC6039 interfaceC6039 : copyOnWriteArrayList) {
                interfaceC6039.getClass();
                interfaceC6039.mo8994(null);
            }
            copyOnWriteArrayList.clear();
            interfaceC7387.invoke("MCP 服务 停止成功");
            objM723 = Result.m9304constructorimpl(C6008.f15084);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(objM723);
        if (thM9307exceptionOrNullimpl != null) {
            interfaceC7387.invoke("MCP 服务 停止失败: " + thM9307exceptionOrNullimpl);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11827(C6701 c6701) {
        Object objM723;
        int i = c6701.f16385;
        InterfaceC7387 interfaceC7387 = c6701.f16383;
        try {
            c6701.f16382 = AbstractC4925.m9051(i, new C6705(c6701, 2));
            interfaceC7387.invoke("MCP 服务 正在启动");
            C4934 c4934 = c6701.f16382;
            if (c4934 != null) {
                c4934.m9062();
            }
            interfaceC7387.invoke("MCP 服务 启动成功: " + i);
            objM723 = Result.m9304constructorimpl(C6008.f15084);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(objM723);
        if (thM9307exceptionOrNullimpl != null) {
            interfaceC7387.invoke("MCP 服务 启动失败: " + thM9307exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[Catch: BadContentTypeFormatException -> 0x0118, TryCatch #1 {BadContentTypeFormatException -> 0x0118, blocks: (B:25:0x00f0, B:27:0x0105, B:30:0x010f, B:32:0x0115, B:29:0x010d), top: B:145:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11828(C6701 c6701, C4995 c4995, String str, ContinuationImpl continuationImpl) throws Throwable {
        McpServerManager$handleMessage$1 mcpServerManager$handleMessage$1;
        Charset charsetM12300;
        InterfaceC5919 interfaceC5919M9471;
        int i;
        Object objM9024;
        InterfaceC4889 interfaceC4889;
        InterfaceC5919 interfaceC5919M94712;
        InterfaceC4889 interfaceC48892;
        Charset charset;
        String strM12636;
        String str2;
        Object objM15026;
        Object objMo15010;
        Object obj;
        InterfaceC4889 interfaceC48893;
        String str3;
        String str4;
        C7981 c7981M12988;
        String strM15021;
        Object next;
        C7981 c7981;
        String strM15023;
        InterfaceC5919 interfaceC5919;
        String str5;
        InterfaceC4889 interfaceC48894;
        InterfaceC5919 interfaceC5919M94713;
        Object objMo9021;
        InterfaceC4889 interfaceC48895;
        C4995 c49952 = c4995;
        String str6 = str;
        InterfaceC7387 interfaceC7387 = c6701.f16383;
        if (continuationImpl instanceof McpServerManager$handleMessage$1) {
            mcpServerManager$handleMessage$1 = (McpServerManager$handleMessage$1) continuationImpl;
            int i2 = mcpServerManager$handleMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mcpServerManager$handleMessage$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mcpServerManager$handleMessage$1 = new McpServerManager$handleMessage$1(c6701, continuationImpl);
            }
        }
        Object obj2 = mcpServerManager$handleMessage$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mcpServerManager$handleMessage$1.label;
        int i4 = 1;
        int i5 = 2;
        Object obj4 = C6008.f15084;
        if (i3 == 0) {
            AbstractC6017.m10769(obj2);
            interfaceC7387.invoke("MCP 请求路径: " + str6);
            try {
                InterfaceC4961 interfaceC4961Mo9018 = c49952.mo9018();
                interfaceC4961Mo9018.getClass();
                String[] strArr = AbstractC8944.f22758;
                String strMo8915 = ((C4989) interfaceC4961Mo9018).mo944().mo8915("Content-Type");
                if (strMo8915 != null) {
                    C8954 c8954 = C8954.f22769;
                    C8954 c8954M14141 = C8942.m14141(strMo8915);
                    if (c8954M14141 == null) {
                        c8954M14141 = C8954.f22769;
                    }
                    charsetM12300 = AbstractC7082.m12300(c8954M14141);
                    if (charsetM12300 == null) {
                        charsetM12300 = AbstractC5964.f15033;
                    }
                    InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(InterfaceC5084.class);
                    try {
                        interfaceC5919M9471 = AbstractC5228.m9471(InterfaceC5084.class);
                    } catch (Throwable unused) {
                        interfaceC5919M9471 = null;
                    }
                    C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                    mcpServerManager$handleMessage$1.L$0 = c49952;
                    mcpServerManager$handleMessage$1.L$1 = str6;
                    mcpServerManager$handleMessage$1.L$2 = null;
                    mcpServerManager$handleMessage$1.L$3 = null;
                    mcpServerManager$handleMessage$1.L$4 = charsetM12300;
                    mcpServerManager$handleMessage$1.L$5 = null;
                    i = 0;
                    mcpServerManager$handleMessage$1.I$0 = 0;
                    mcpServerManager$handleMessage$1.I$1 = 0;
                    mcpServerManager$handleMessage$1.I$2 = 0;
                    mcpServerManager$handleMessage$1.label = 1;
                    C4988 c4988 = c49952.f12962;
                    c4988.getClass();
                    objM9024 = AbstractC4892.m9024(c4988, c7686, mcpServerManager$handleMessage$1);
                    interfaceC4889 = c49952;
                    if (objM9024 == obj3) {
                        return obj3;
                    }
                }
                return obj4;
            } catch (BadContentTypeFormatException e) {
                String strM14531 = "Illegal Content-Type format: ";
                InterfaceC8941 interfaceC8941 = ((C4989) c49952.mo9018()).f12937;
                String[] strArr2 = AbstractC8944.f22758;
                throw new BadRequestException(strM14531 + interfaceC8941.mo8915("Content-Type"), e);
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC6017.m10769(obj2);
                        return obj4;
                    }
                    str5 = (String) mcpServerManager$handleMessage$1.L$4;
                    InterfaceC4889 interfaceC48896 = (InterfaceC4889) mcpServerManager$handleMessage$1.L$0;
                    AbstractC6017.m10769(obj2);
                    interfaceC5919 = null;
                    interfaceC48895 = interfaceC48896;
                    strM15023 = str5;
                    interfaceC48894 = interfaceC48895;
                    C8954 c89542 = AbstractC8938.f22742;
                    C8926 c8926 = C8926.f22696;
                    mcpServerManager$handleMessage$1.L$0 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$1 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$2 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$3 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$4 = interfaceC5919;
                    mcpServerManager$handleMessage$1.label = 5;
                    C4815 c4815 = new C4815(strM15023, AbstractC3889.m7315(interfaceC48894, c89542), c8926);
                    InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C4815.class);
                    try {
                        interfaceC5919M94713 = AbstractC5228.m9471(C4815.class);
                    } catch (Throwable unused2) {
                        interfaceC5919M94713 = interfaceC5919;
                    }
                    objMo9021 = interfaceC48894.mo9021(c4815, new C7686(interfaceC5925Mo94762, interfaceC5919M94713), mcpServerManager$handleMessage$1);
                    if (objMo9021 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objMo9021 = obj4;
                    }
                    if (objMo9021 == obj3) {
                        return obj3;
                    }
                    return obj4;
                }
                String str7 = (String) mcpServerManager$handleMessage$1.L$2;
                String str8 = (String) mcpServerManager$handleMessage$1.L$1;
                InterfaceC4889 interfaceC48897 = (InterfaceC4889) mcpServerManager$handleMessage$1.L$0;
                AbstractC6017.m10769(obj2);
                str4 = str7;
                interfaceC48893 = interfaceC48897;
                obj = obj2;
                str3 = str8;
                c7981 = (C7981) obj;
                strM15023 = c7981 == null ? AbstractC9594.m15023(c7981) : "{}";
                if (c7981 != null) {
                    interfaceC5919 = null;
                    interfaceC48894 = interfaceC48893;
                    C8954 c895422 = AbstractC8938.f22742;
                    C8926 c89262 = C8926.f22696;
                    mcpServerManager$handleMessage$1.L$0 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$1 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$2 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$3 = interfaceC5919;
                    mcpServerManager$handleMessage$1.L$4 = interfaceC5919;
                    mcpServerManager$handleMessage$1.label = 5;
                    C4815 c48152 = new C4815(strM15023, AbstractC3889.m7315(interfaceC48894, c895422), c89262);
                    InterfaceC5925 interfaceC5925Mo947622 = AbstractC5228.f13320.mo9476(C4815.class);
                    interfaceC5919M94713 = AbstractC5228.m9471(C4815.class);
                    objMo9021 = interfaceC48894.mo9021(c48152, new C7686(interfaceC5925Mo947622, interfaceC5919M94713), mcpServerManager$handleMessage$1);
                    if (objMo9021 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    if (objMo9021 == obj3) {
                    }
                    return obj4;
                }
                interfaceC7387.invoke("MCP 请求: " + str4 + " 响应: " + str3);
                mcpServerManager$handleMessage$1.L$0 = interfaceC48893;
                interfaceC5919 = null;
                mcpServerManager$handleMessage$1.L$1 = null;
                mcpServerManager$handleMessage$1.L$2 = null;
                mcpServerManager$handleMessage$1.L$3 = null;
                mcpServerManager$handleMessage$1.L$4 = strM15023;
                mcpServerManager$handleMessage$1.label = 4;
                if (c6701.m11829(strM15023, mcpServerManager$handleMessage$1) == obj3) {
                    return obj3;
                }
                str5 = strM15023;
                interfaceC48895 = interfaceC48893;
                strM15023 = str5;
                interfaceC48894 = interfaceC48895;
                C8954 c8954222 = AbstractC8938.f22742;
                C8926 c892622 = C8926.f22696;
                mcpServerManager$handleMessage$1.L$0 = interfaceC5919;
                mcpServerManager$handleMessage$1.L$1 = interfaceC5919;
                mcpServerManager$handleMessage$1.L$2 = interfaceC5919;
                mcpServerManager$handleMessage$1.L$3 = interfaceC5919;
                mcpServerManager$handleMessage$1.L$4 = interfaceC5919;
                mcpServerManager$handleMessage$1.label = 5;
                C4815 c481522 = new C4815(strM15023, AbstractC3889.m7315(interfaceC48894, c8954222), c892622);
                InterfaceC5925 interfaceC5925Mo9476222 = AbstractC5228.f13320.mo9476(C4815.class);
                interfaceC5919M94713 = AbstractC5228.m9471(C4815.class);
                objMo9021 = interfaceC48894.mo9021(c481522, new C7686(interfaceC5925Mo9476222, interfaceC5919M94713), mcpServerManager$handleMessage$1);
                if (objMo9021 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (objMo9021 == obj3) {
                }
                return obj4;
            }
            charset = (Charset) mcpServerManager$handleMessage$1.L$3;
            str6 = (String) mcpServerManager$handleMessage$1.L$1;
            InterfaceC4889 interfaceC48898 = (InterfaceC4889) mcpServerManager$handleMessage$1.L$0;
            AbstractC6017.m10769(obj2);
            interfaceC48892 = interfaceC48898;
            strM12636 = AbstractC7684.m12636((InterfaceC6313) obj2, charset, 2);
            mcpServerManager$handleMessage$1.L$0 = interfaceC48892;
            mcpServerManager$handleMessage$1.L$1 = str6;
            mcpServerManager$handleMessage$1.L$2 = strM12636;
            mcpServerManager$handleMessage$1.L$3 = null;
            mcpServerManager$handleMessage$1.label = 3;
            try {
                C7991 c7991 = AbstractC9594.f25047;
                "text";
                C7991 c79912 = AbstractC9594.f25047;
                c79912.getClass();
                c7981M12988 = AbstractC7997.m12988((AbstractC8005) c79912.m12985(strM12636, C8000.f19484));
                strM15021 = AbstractC9594.m15021("method", c7981M12988);
            } catch (Exception unused3) {
                str2 = strM12636;
                String strM145312 = "Parse error";
                "msg";
                objM15026 = AbstractC9594.m15026(new C1886(-32700, 3, null, strM145312));
            }
            if (strM15021 != null) {
                str2 = strM12636;
                objMo15010 = null;
                if (objMo15010 == obj3) {
                    return obj3;
                }
                obj = objMo15010;
                interfaceC48893 = interfaceC48892;
                str3 = str6;
                str4 = str2;
                c7981 = (C7981) obj;
                if (c7981 == null) {
                }
                if (c7981 != null) {
                }
            } else {
                AbstractC8005 abstractC8005 = (AbstractC8005) c7981M12988.get("id");
                C7981 c7981M15013 = AbstractC9594.m15013("params", c7981M12988);
                if (c7981M15013 == null) {
                    c7981M15013 = AbstractC9594.m15018();
                }
                if (abstractC8005 == null) {
                    if (strM15021.equals("notifications/initialized")) {
                        interfaceC7387.invoke("MCP 收到初始化通知");
                    }
                    str2 = strM12636;
                    objMo15010 = null;
                    if (objMo15010 == obj3) {
                    }
                } else {
                    int iHashCode = strM15021.hashCode();
                    C6703 c6703 = f16375;
                    switch (iHashCode) {
                        case 3441010:
                            str2 = strM12636;
                            if (strM15021.equals("ping")) {
                                objM15026 = AbstractC7176.m12464(AbstractC9594.m15018(), abstractC8005);
                            } else {
                                String strConcat = "Method not found: ".concat(strM15021);
                                "msg";
                                objM15026 = AbstractC9594.m15026(new C1886(-32601, 3, abstractC8005, strConcat));
                            }
                            objMo15010 = objM15026;
                            break;
                        case 498659858:
                            if (!strM15021.equals("tools/call")) {
                                str2 = strM12636;
                                String strConcat2 = "Method not found: ".concat(strM15021);
                                "msg";
                                objM15026 = AbstractC9594.m15026(new C1886(-32601, 3, abstractC8005, strConcat2));
                                objMo15010 = objM15026;
                            } else {
                                if (C6703.m11836(c6703)) {
                                    String strM150212 = AbstractC9594.m15021("name", c7981M15013);
                                    if (strM150212 == null) {
                                        strM150212 = "";
                                    }
                                    Iterator it = C6703.m11835().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            str2 = strM12636;
                                            if (!AbstractC5227.m9466(((InterfaceC9598) next).getId(), strM150212)) {
                                                strM12636 = str2;
                                            }
                                        } else {
                                            str2 = strM12636;
                                            next = null;
                                        }
                                    }
                                    InterfaceC9598 interfaceC9598 = (InterfaceC9598) next;
                                    if (interfaceC9598 == null) {
                                        "block";
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        "$this$jsonObject";
                                        String strM14532 = "content";
                                        "block";
                                        ArrayList arrayList = new ArrayList();
                                        "$this$jsonArray";
                                        "block";
                                        C9595 c9595 = new C9595();
                                        "$this$jsonObject";
                                        c9595.m15027("text", "type");
                                        c9595.m15027("Tool not found: ".concat(strM150212), "text");
                                        arrayList.add(AbstractC9594.m15024(new C7981(c9595.f25048)));
                                        C7986 c7986 = new C7986(arrayList);
                                        "key";
                                        linkedHashMap.put(strM14532, AbstractC9594.m15024(c7986));
                                        String strM145322 = "isError";
                                        Boolean bool = Boolean.TRUE;
                                        "key";
                                        linkedHashMap.put(strM145322, AbstractC9594.m15024(bool));
                                        objMo15010 = AbstractC7176.m12464(new C7981(linkedHashMap), abstractC8005);
                                    } else if (C6703.m11834(strM150212)) {
                                        objMo15010 = interfaceC9598.mo15010(c7981M15013, abstractC8005);
                                    } else {
                                        "block";
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        "$this$jsonObject";
                                        String strM145323 = "content";
                                        "block";
                                        ArrayList arrayList2 = new ArrayList();
                                        "$this$jsonArray";
                                        "block";
                                        C9595 c95952 = new C9595();
                                        "$this$jsonObject";
                                        c95952.m15027("text", "type");
                                        c95952.m15027("Tool disabled: ".concat(strM150212), "text");
                                        arrayList2.add(AbstractC9594.m15024(new C7981(c95952.f25048)));
                                        C7986 c79862 = new C7986(arrayList2);
                                        "key";
                                        linkedHashMap2.put(strM145323, AbstractC9594.m15024(c79862));
                                        String strM145324 = "isError";
                                        Boolean bool2 = Boolean.TRUE;
                                        "key";
                                        linkedHashMap2.put(strM145324, AbstractC9594.m15024(bool2));
                                        objMo15010 = AbstractC7176.m12464(new C7981(linkedHashMap2), abstractC8005);
                                    }
                                } else {
                                    "block";
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    "$this$jsonObject";
                                    String strM145325 = "content";
                                    "block";
                                    ArrayList arrayList3 = new ArrayList();
                                    "$this$jsonArray";
                                    "block";
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    "$this$jsonObject";
                                    String strM145326 = "type";
                                    String strM145327 = "text";
                                    "key";
                                    linkedHashMap4.put(strM145326, AbstractC9594.m15024(strM145327));
                                    String strM145328 = "text";
                                    String strM145313 = "MCP feature disabled";
                                    "key";
                                    linkedHashMap4.put(strM145328, AbstractC9594.m15024(strM145313));
                                    arrayList3.add(AbstractC9594.m15024(new C7981(linkedHashMap4)));
                                    C7986 c79863 = new C7986(arrayList3);
                                    "key";
                                    linkedHashMap3.put(strM145325, AbstractC9594.m15024(c79863));
                                    String strM145329 = "isError";
                                    Boolean bool3 = Boolean.TRUE;
                                    "key";
                                    linkedHashMap3.put(strM145329, AbstractC9594.m15024(bool3));
                                    objMo15010 = AbstractC7176.m12464(new C7981(linkedHashMap3), abstractC8005);
                                    str2 = strM12636;
                                }
                                if (objMo15010 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objMo15010 = (C7981) objMo15010;
                                }
                            }
                            break;
                        case 498935890:
                            if (!strM15021.equals("tools/list")) {
                                str2 = strM12636;
                                String strConcat22 = "Method not found: ".concat(strM15021);
                                "msg";
                                objM15026 = AbstractC9594.m15026(new C1886(-32601, 3, abstractC8005, strConcat22));
                                objMo15010 = objM15026;
                            } else {
                                if (C6703.m11836(c6703)) {
                                    "block";
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                    "$this$jsonObject";
                                    String strM1453210 = "tools";
                                    C7986 c7986M15025 = AbstractC9594.m15025(new C6704(i5));
                                    "key";
                                    linkedHashMap5.put(strM1453210, AbstractC9594.m15024(c7986M15025));
                                    objMo15010 = AbstractC7176.m12464(new C7981(linkedHashMap5), abstractC8005);
                                } else {
                                    "block";
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    "$this$jsonObject";
                                    String strM1453211 = "tools";
                                    "block";
                                    C9603 c9603 = new C9603();
                                    "$this$jsonArray";
                                    C7986 c79864 = new C7986(c9603.f25063);
                                    "key";
                                    linkedHashMap6.put(strM1453211, AbstractC9594.m15024(c79864));
                                    objMo15010 = AbstractC7176.m12464(new C7981(linkedHashMap6), abstractC8005);
                                }
                                str2 = strM12636;
                            }
                            break;
                        case 871091088:
                            if (!strM15021.equals("initialize")) {
                                str2 = strM12636;
                                String strConcat222 = "Method not found: ".concat(strM15021);
                                "msg";
                                objM15026 = AbstractC9594.m15026(new C1886(-32601, 3, abstractC8005, strConcat222));
                                objMo15010 = objM15026;
                            } else {
                                objMo15010 = AbstractC7176.m12464(AbstractC9594.m15026(new C6705(c6701, i4)), abstractC8005);
                                str2 = strM12636;
                            }
                            break;
                        default:
                            str2 = strM12636;
                            String strConcat2222 = "Method not found: ".concat(strM15021);
                            "msg";
                            objM15026 = AbstractC9594.m15026(new C1886(-32601, 3, abstractC8005, strConcat2222));
                            objMo15010 = objM15026;
                            break;
                    }
                    if (objMo15010 == obj3) {
                    }
                }
            }
            return obj4;
        }
        int i6 = mcpServerManager$handleMessage$1.I$0;
        Charset charset2 = (Charset) mcpServerManager$handleMessage$1.L$4;
        String str9 = (String) mcpServerManager$handleMessage$1.L$1;
        InterfaceC4889 interfaceC48899 = (InterfaceC4889) mcpServerManager$handleMessage$1.L$0;
        AbstractC6017.m10769(obj2);
        i = i6;
        interfaceC4889 = interfaceC48899;
        objM9024 = obj2;
        charsetM12300 = charset2;
        str6 = str9;
        if (objM9024 == null) {
            AbstractC5228.f13320.mo9476(InterfaceC5084.class);
            try {
                interfaceC5919M94712 = AbstractC5228.m9471(InterfaceC5084.class);
            } catch (Throwable unused4) {
                interfaceC5919M94712 = null;
            }
            interfaceC5919M94712.getClass();
            throw new CannotTransformContentToTypeException(interfaceC5919M94712);
        }
        mcpServerManager$handleMessage$1.L$0 = interfaceC4889;
        mcpServerManager$handleMessage$1.L$1 = str6;
        mcpServerManager$handleMessage$1.L$2 = null;
        mcpServerManager$handleMessage$1.L$3 = charsetM12300;
        mcpServerManager$handleMessage$1.L$4 = null;
        mcpServerManager$handleMessage$1.L$5 = null;
        mcpServerManager$handleMessage$1.I$0 = i;
        mcpServerManager$handleMessage$1.label = 2;
        Object objM9232 = AbstractC5076.m9232((InterfaceC5084) objM9024, mcpServerManager$handleMessage$1);
        if (objM9232 == obj3) {
            return obj3;
        }
        interfaceC48892 = interfaceC4889;
        charset = charsetM12300;
        obj2 = objM9232;
        strM12636 = AbstractC7684.m12636((InterfaceC6313) obj2, charset, 2);
        mcpServerManager$handleMessage$1.L$0 = interfaceC48892;
        mcpServerManager$handleMessage$1.L$1 = str6;
        mcpServerManager$handleMessage$1.L$2 = strM12636;
        mcpServerManager$handleMessage$1.L$3 = null;
        mcpServerManager$handleMessage$1.label = 3;
        C7991 c79913 = AbstractC9594.f25047;
        "text";
        C7991 c799122 = AbstractC9594.f25047;
        c799122.getClass();
        c7981M12988 = AbstractC7997.m12988((AbstractC8005) c799122.m12985(strM12636, C8000.f19484));
        strM15021 = AbstractC9594.m15021("method", c7981M12988);
        if (strM15021 != null) {
        }
        return obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11829(String str, ContinuationImpl continuationImpl) {
        McpServerManager$broadcastMessage$1 mcpServerManager$broadcastMessage$1;
        Iterator it;
        List list;
        if (continuationImpl instanceof McpServerManager$broadcastMessage$1) {
            mcpServerManager$broadcastMessage$1 = (McpServerManager$broadcastMessage$1) continuationImpl;
            int i = mcpServerManager$broadcastMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcpServerManager$broadcastMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                mcpServerManager$broadcastMessage$1 = new McpServerManager$broadcastMessage$1(this, continuationImpl);
            }
        }
        Object obj = mcpServerManager$broadcastMessage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mcpServerManager$broadcastMessage$1.label;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16381;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            ArrayList arrayList = new ArrayList();
            it = copyOnWriteArrayList.iterator();
            "iterator(...)";
            it.getClass();
            list = arrayList;
            while (it.hasNext()) {
            }
            copyOnWriteArrayList.removeAll(AbstractC5176.m9347(list));
            this.f16383.invoke("返回响应到 " + copyOnWriteArrayList.size() + " 个 MCP 客户端");
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6039 interfaceC6039 = (InterfaceC6039) mcpServerManager$broadcastMessage$1.L$3;
        it = (Iterator) mcpServerManager$broadcastMessage$1.L$2;
        list = (List) mcpServerManager$broadcastMessage$1.L$1;
        String str2 = (String) mcpServerManager$broadcastMessage$1.L$0;
        try {
            AbstractC6017.m10769(obj);
        } catch (ClosedSendChannelException unused) {
            list.add(interfaceC6039);
        }
        str = str2;
        while (it.hasNext()) {
            InterfaceC6039 interfaceC60392 = (InterfaceC6039) it.next();
            try {
            } catch (ClosedSendChannelException unused2) {
                str2 = str;
                list.add(interfaceC60392);
            }
            mcpServerManager$broadcastMessage$1.L$0 = str;
            mcpServerManager$broadcastMessage$1.L$1 = list;
            mcpServerManager$broadcastMessage$1.L$2 = it;
            mcpServerManager$broadcastMessage$1.L$3 = interfaceC60392;
            mcpServerManager$broadcastMessage$1.label = 1;
            if (interfaceC60392.mo8992(str, mcpServerManager$broadcastMessage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        copyOnWriteArrayList.removeAll(AbstractC5176.m9347(list));
        this.f16383.invoke("返回响应到 " + copyOnWriteArrayList.size() + " 个 MCP 客户端");
        return C6008.f15084;
    }
}
