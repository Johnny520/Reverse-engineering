package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.http.content.AbstractC4122;
import io.ktor.server.routing.AbstractC4138;
import io.ktor.server.routing.AbstractC4143;
import io.ktor.server.routing.C4136;
import io.ktor.server.routing.C4137;
import io.ktor.server.routing.C4139;
import io.ktor.server.routing.C4158;
import io.ktor.server.routing.RoutingPathSegmentKind;
import io.ktor.util.C4204;
import io.ktor.util.C4217;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.io.AbstractC4380;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6557;
import p236.AbstractC8110;
import p236.AbstractC8121;
import p236.C8098;
import p236.C8124;
import p265.C8259;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3806 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11991;

    public /* synthetic */ C3806(int i) {
        this.f11991 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f11991;
        C5175 c5175 = C5175.f14739;
        int iIntValue = 0;
        switch (i) {
            case 0:
                ((C8259) obj).getClass();
                return Double.valueOf(50.0d);
            case 1:
                throw AbstractC0053.m158(obj);
            case 2:
                throw AbstractC0053.m158(obj);
            case 3:
                throw AbstractC0053.m158(obj);
            case 4:
                throw AbstractC0053.m158(obj);
            case 5:
                throw AbstractC0053.m158(obj);
            case 6:
                throw AbstractC0053.m158(obj);
            case 7:
                throw AbstractC0053.m158(obj);
            case 8:
                throw AbstractC0053.m158(obj);
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return charSequence.toString();
            case 10:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Integer.valueOf(((String) pair.getFirst()).length());
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() * 8);
            case 12:
                CharSequence charSequence2 = (CharSequence) obj;
                charSequence2.getClass();
                return Integer.valueOf(charSequence2.length());
            case 13:
                C8098 c8098 = (C8098) obj;
                c8098.getClass();
                return Integer.valueOf(c8098.f22376.length());
            case 14:
                return c5175;
            case 15:
                ((InterfaceC4056) obj).getClass();
                return 0;
            case 16:
                URL url = (URL) obj;
                url.getClass();
                C8124 c8124 = C8124.f22426;
                String path = url.getPath();
                path.getClass();
                InterfaceC5183 interfaceC5183 = AbstractC4122.f12510;
                int iM10165 = AbstractC5143.m10165(path, '/', 0, 6);
                Integer numValueOf = Integer.valueOf(iM10165);
                if (iM10165 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    int iM101652 = AbstractC5143.m10165(path, '\\', 0, 6);
                    Integer numValueOf2 = iM101652 != -1 ? Integer.valueOf(iM101652) : null;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                int iM10151 = AbstractC5143.m10151(path, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, iIntValue, 4);
                return AbstractC8121.m13557(AbstractC8121.m13559(iM10151 >= 0 ? path.substring(iM10151) : ""));
            case 17:
                ((URL) obj).getClass();
                return EmptyList.INSTANCE;
            case 18:
                ((URL) obj).getClass();
                return Boolean.FALSE;
            case 19:
                File file = (File) obj;
                file.getClass();
                C8124 c81242 = C8124.f22426;
                return AbstractC8121.m13557(AbstractC8121.m13559(AbstractC4380.m8881(file)));
            case 20:
                ((File) obj).getClass();
                return EmptyList.INSTANCE;
            case 21:
                C4158 c4158 = (C4158) obj;
                c4158.getClass();
                return c4158.f12595;
            case 22:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(str.length() > 0);
            case 23:
                String str2 = (String) obj;
                str2.getClass();
                return (AbstractC5143.m10172(str2, '{') && AbstractC5143.m10172(str2, '}')) ? new C4158(str2, RoutingPathSegmentKind.Parameter) : new C4158(AbstractC8110.m13549(0, 0, str2, 7), RoutingPathSegmentKind.Constant);
            case 24:
                List list = (List) obj;
                list.getClass();
                return AbstractC4343.m8813(list, " -> ", "  ", null, new C3806(25), 28);
            case 25:
                C4139 c4139 = (C4139) obj;
                c4139.getClass();
                return "\"" + c4139.f12542.f12578 + '\"';
            case 26:
                C4137 c4137 = (C4137) obj;
                c4137.getClass();
                InterfaceC9156 interfaceC9156 = AbstractC4143.f12557;
                if (interfaceC9156.isTraceEnabled()) {
                    ArrayList arrayList = c4137.f12537;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c4137.toString());
                    sb.append('\n');
                    C4136 c4136 = c4137.f12539;
                    if (c4136 != null) {
                        c4136.m8537(sb, 0);
                    }
                    if (c4137.f12538 != null) {
                        sb.append("Matched routes:");
                        sb.append('\n');
                        if (arrayList.isEmpty()) {
                            sb.append("  No results");
                            sb.append('\n');
                        } else {
                            sb.append(AbstractC4343.m8813(arrayList, "\n", null, null, new C3806(24), 30));
                            sb.append('\n');
                        }
                        sb.append("Routing resolve result:");
                        sb.append('\n');
                        StringBuilder sb2 = new StringBuilder("  ");
                        AbstractC4138 abstractC4138 = c4137.f12538;
                        if (abstractC4138 == null) {
                            AbstractC4394.m8918("finalResult");
                            throw null;
                        }
                        sb2.append(abstractC4138);
                        sb.append(sb2.toString());
                    }
                    interfaceC9156.trace(sb.toString());
                }
                return c5175;
            case 27:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new C4217(((C4204) entry.getKey()).f12690, entry.getValue());
            case 28:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str3 = (String) entry2.getKey();
                str3.getClass();
                return new C4217(new C4204(str3), entry2.getValue());
            default:
                C4204 c4204 = (C4204) obj;
                c4204.getClass();
                return c4204.f12690;
        }
    }
}
