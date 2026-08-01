package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.http.content.AbstractC4123;
import io.ktor.server.routing.AbstractC4139;
import io.ktor.server.routing.AbstractC4144;
import io.ktor.server.routing.C4137;
import io.ktor.server.routing.C4138;
import io.ktor.server.routing.C4140;
import io.ktor.server.routing.C4159;
import io.ktor.server.routing.RoutingPathSegmentKind;
import io.ktor.util.C4205;
import io.ktor.util.C4218;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.io.AbstractC4381;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;
import p236.AbstractC8111;
import p236.AbstractC8122;
import p236.C8099;
import p236.C8125;
import p265.C8260;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3807 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11996;

    public /* synthetic */ C3807(int i) {
        this.f11996 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f11996;
        C5176 c5176 = C5176.f14739;
        int iIntValue = 0;
        switch (i) {
            case 0:
                ((C8260) obj).getClass();
                return Double.valueOf(50.0d);
            case 1:
                throw AbstractC0053.m159(obj);
            case 2:
                throw AbstractC0053.m159(obj);
            case 3:
                throw AbstractC0053.m159(obj);
            case 4:
                throw AbstractC0053.m159(obj);
            case 5:
                throw AbstractC0053.m159(obj);
            case 6:
                throw AbstractC0053.m159(obj);
            case 7:
                throw AbstractC0053.m159(obj);
            case 8:
                throw AbstractC0053.m159(obj);
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
                C8099 c8099 = (C8099) obj;
                c8099.getClass();
                return Integer.valueOf(c8099.f22374.length());
            case 14:
                return c5176;
            case 15:
                ((InterfaceC4057) obj).getClass();
                return 0;
            case 16:
                URL url = (URL) obj;
                url.getClass();
                C8125 c8125 = C8125.f22424;
                String path = url.getPath();
                path.getClass();
                InterfaceC5184 interfaceC5184 = AbstractC4123.f12514;
                int iM10165 = AbstractC5144.m10165(path, '/', 0, 6);
                Integer numValueOf = Integer.valueOf(iM10165);
                if (iM10165 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    int iM101652 = AbstractC5144.m10165(path, '\\', 0, 6);
                    Integer numValueOf2 = iM101652 != -1 ? Integer.valueOf(iM101652) : null;
                    if (numValueOf2 != null) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                int iM10171 = AbstractC5144.m10171(path, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, iIntValue, 4);
                return AbstractC8122.m13586(AbstractC8122.m13588(iM10171 >= 0 ? path.substring(iM10171) : ""));
            case 17:
                ((URL) obj).getClass();
                return EmptyList.INSTANCE;
            case 18:
                ((URL) obj).getClass();
                return Boolean.FALSE;
            case 19:
                File file = (File) obj;
                file.getClass();
                C8125 c81252 = C8125.f22424;
                return AbstractC8122.m13586(AbstractC8122.m13588(AbstractC4381.m8872(file)));
            case 20:
                ((File) obj).getClass();
                return EmptyList.INSTANCE;
            case 21:
                C4159 c4159 = (C4159) obj;
                c4159.getClass();
                return c4159.f12599;
            case 22:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(str.length() > 0);
            case 23:
                String str2 = (String) obj;
                str2.getClass();
                return (AbstractC5144.m10163(str2, '{') && AbstractC5144.m10163(str2, '}')) ? new C4159(str2, RoutingPathSegmentKind.Parameter) : new C4159(AbstractC8111.m13578(0, 0, str2, 7), RoutingPathSegmentKind.Constant);
            case 24:
                List list = (List) obj;
                list.getClass();
                return AbstractC4344.m8810(list, " -> ", "  ", null, new C3807(25), 28);
            case 25:
                C4140 c4140 = (C4140) obj;
                c4140.getClass();
                return "\"" + c4140.f12546.f12582 + '\"';
            case 26:
                C4138 c4138 = (C4138) obj;
                c4138.getClass();
                InterfaceC9141 interfaceC9141 = AbstractC4144.f12561;
                if (interfaceC9141.isTraceEnabled()) {
                    ArrayList arrayList = c4138.f12541;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c4138.toString());
                    sb.append('\n');
                    C4137 c4137 = c4138.f12543;
                    if (c4137 != null) {
                        c4137.m8527(sb, 0);
                    }
                    if (c4138.f12542 != null) {
                        sb.append("Matched routes:");
                        sb.append('\n');
                        if (arrayList.isEmpty()) {
                            sb.append("  No results");
                            sb.append('\n');
                        } else {
                            sb.append(AbstractC4344.m8810(arrayList, "\n", null, null, new C3807(24), 30));
                            sb.append('\n');
                        }
                        sb.append("Routing resolve result:");
                        sb.append('\n');
                        StringBuilder sb2 = new StringBuilder("  ");
                        AbstractC4139 abstractC4139 = c4138.f12542;
                        if (abstractC4139 == null) {
                            AbstractC4395.m8908("finalResult");
                            throw null;
                        }
                        sb2.append(abstractC4139);
                        sb.append(sb2.toString());
                    }
                    interfaceC9141.trace(sb.toString());
                }
                return c5176;
            case 27:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new C4218(((C4205) entry.getKey()).f12694, entry.getValue());
            case 28:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                String str3 = (String) entry2.getKey();
                str3.getClass();
                return new C4218(new C4205(str3), entry2.getValue());
            default:
                C4205 c4205 = (C4205) obj;
                c4205.getClass();
                return c4205.f12694;
        }
    }
}
