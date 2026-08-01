package p052;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import p103.C7932;
import p103.C7964;
import p104.C7991;
import p303.AbstractC9234;
import p405.AbstractC9919;
import p405.C9921;
import p407.C9924;
import p409.AbstractC9938;
import p409.C9932;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9924 f17858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17859;

    public C7188(int i) {
        this.f17859 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f17858 = new C9924(AbstractC9234.m14532("喵喵呜呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜"), 0);
                break;
        }
    }

    public String toString() {
        switch (this.f17859) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (String str : ((HashMap) this.f17858.f25834.getAll()).keySet()) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(m12503(str));
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList m12503(String str) {
        ArrayList<String> arrayList;
        C9924 c9924 = this.f17858;
        c9924.getClass();
        str.getClass();
        if (!c9924.f25834.contains(str)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        str.getClass();
        String string = c9924.f25834.getString(str, "");
        if (string == null || string.length() == 0) {
            arrayList = new ArrayList();
        } else {
            C7991 c7991 = c9924.f25835;
            c7991.getClass();
            arrayList = AbstractC5176.m9345((Collection) c7991.m12985(string, new C7932(C7964.f19434, 0)));
        }
        for (String str2 : arrayList) {
            C7991 c79912 = AbstractC9938.f25881;
            str2.getClass();
            C7991 c79913 = AbstractC9938.f25881;
            c79913.getClass();
            C9932 c9932 = (C9932) c79913.m12985(str2, C9932.Companion.serializer());
            List list = c9932.f25875;
            ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC9919.m15228((String) it.next()));
            }
            Class[] clsArr = (Class[]) arrayList3.toArray(new Class[0]);
            C9921 c9921M15232 = C9921.m15232(c9932.f25877);
            c9921M15232.f25826 = c9932.f25876;
            c9921M15232.f25828 = AbstractC9919.m15228(c9932.f25874);
            c9921M15232.m15234((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Member memberM15164 = c9921M15232.m15164();
            memberM15164.getClass();
            arrayList2.add((Method) memberM15164);
        }
        return arrayList2;
    }
}
