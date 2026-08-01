package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0900;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.http.content.AbstractC4955;
import io.ktor.server.routing.AbstractC4971;
import io.ktor.server.routing.AbstractC4976;
import io.ktor.server.routing.C4969;
import io.ktor.server.routing.C4970;
import io.ktor.server.routing.C4972;
import io.ktor.server.routing.C4991;
import io.ktor.server.routing.RoutingPathSegmentKind;
import io.ktor.util.C5037;
import io.ktor.util.C5050;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.p008io.AbstractC5213;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;
import p252.AbstractC8940;
import p252.AbstractC8951;
import p252.C8928;
import p252.C8954;
import p281.C9089;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4639 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12341;

    public /* synthetic */ C4639(int i) {
        this.f12341 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12341;
        C6008 c6008 = C6008.f15084;
        int iIntValue = 0;
        switch (i) {
            case 0:
                ((C9089) obj).getClass();
                return Double.valueOf(50.0d);
            case 1:
                throw AbstractC0900.m719(obj);
            case 2:
                throw AbstractC0900.m719(obj);
            case 3:
                throw AbstractC0900.m719(obj);
            case 4:
                throw AbstractC0900.m719(obj);
            case 5:
                throw AbstractC0900.m719(obj);
            case 6:
                throw AbstractC0900.m719(obj);
            case 7:
                throw AbstractC0900.m719(obj);
            case 8:
                throw AbstractC0900.m719(obj);
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
                C8928 c8928 = (C8928) obj;
                c8928.getClass();
                return Integer.valueOf(c8928.f22719.length());
            case 14:
                return c6008;
            case 15:
                ((InterfaceC4889) obj).getClass();
                return 0;
            case 16:
                URL url = (URL) obj;
                url.getClass();
                C8954 c8954 = C8954.f22769;
                String path = url.getPath();
                path.getClass();
                InterfaceC6016 interfaceC6016 = AbstractC4955.f12859;
                int iM10724 = AbstractC5976.m10724(path, '/', 0, 6);
                Integer numValueOf = Integer.valueOf(iM10724);
                if (iM10724 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    int iM107242 = AbstractC5976.m10724(path, '\\', 0, 6);
                    Integer numValueOf2 = iM107242 != -1 ? Integer.valueOf(iM107242) : null;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                int iM10730 = AbstractC5976.m10730(path, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, iIntValue, 4);
                return AbstractC8951.m14145(AbstractC8951.m14147(iM10730 >= 0 ? path.substring(iM10730) : ""));
            case 17:
                ((URL) obj).getClass();
                return EmptyList.INSTANCE;
            case 18:
                ((URL) obj).getClass();
                return Boolean.FALSE;
            case 19:
                File file = (File) obj;
                file.getClass();
                C8954 c89542 = C8954.f22769;
                return AbstractC8951.m14145(AbstractC8951.m14147(AbstractC5213.m9431(file)));
            case 20:
                ((File) obj).getClass();
                return EmptyList.INSTANCE;
            case 21:
                C4991 c4991 = (C4991) obj;
                c4991.getClass();
                return c4991.f12944;
            case 22:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(str.length() > 0);
            case 23:
                String str2 = (String) obj;
                str2.getClass();
                return (AbstractC5976.m10722(str2, '{') && AbstractC5976.m10722(str2, '}')) ? new C4991(str2, RoutingPathSegmentKind.Parameter) : new C4991(AbstractC8940.m14137(0, 0, str2, 7), RoutingPathSegmentKind.Constant);
            case 24:
                List list = (List) obj;
                list.getClass();
                return AbstractC5176.m9369(list, " -> ", "  ", null, new C4639(25), 28);
            case 25:
                C4972 c4972 = (C4972) obj;
                c4972.getClass();
                return "\"" + c4972.f12891.f12927 + '\"';
            case 26:
                C4970 c4970 = (C4970) obj;
                c4970.getClass();
                InterfaceC9970 interfaceC9970 = AbstractC4976.f12906;
                if (interfaceC9970.isTraceEnabled()) {
                    ArrayList arrayList = c4970.f12886;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c4970.toString());
                    sb.append('\n');
                    C4969 c4969 = c4970.f12888;
                    if (c4969 != null) {
                        c4969.m9086(sb, 0);
                    }
                    if (c4970.f12887 != null) {
                        sb.append("Matched routes:");
                        sb.append('\n');
                        if (arrayList.isEmpty()) {
                            sb.append("  No results");
                            sb.append('\n');
                        } else {
                            sb.append(AbstractC5176.m9369(arrayList, "\n", null, null, new C4639(24), 30));
                            sb.append('\n');
                        }
                        sb.append("Routing resolve result:");
                        sb.append('\n');
                        StringBuilder sb2 = new StringBuilder("  ");
                        AbstractC4971 abstractC4971 = c4970.f12887;
                        if (abstractC4971 == null) {
                            AbstractC5227.m9467("finalResult");
                            throw null;
                        }
                        sb2.append(abstractC4971);
                        sb.append(sb2.toString());
                    }
                    interfaceC9970.trace(sb.toString());
                }
                return c6008;
            case 27:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new C5050(((C5037) entry.getKey()).f13039, entry.getValue());
            case 28:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str3 = (String) entry2.getKey();
                str3.getClass();
                return new C5050(new C5037(str3), entry2.getValue());
            default:
                C5037 c5037 = (C5037) obj;
                c5037.getClass();
                return c5037.f13039;
        }
    }
}
