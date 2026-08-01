package p036;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import p087.C7103;
import p087.C7135;
import p088.C7162;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9092;
import p391.C9095;
import p393.AbstractC9109;
import p393.C9103;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9095 f17513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17514;

    public C6359(int i) {
        this.f17514 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f17513 = new C9095(AbstractC8405.m13973("喵喵呜呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜"), 0);
                break;
        }
    }

    public String toString() {
        switch (this.f17514) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (String str : ((HashMap) this.f17513.f25489.getAll()).keySet()) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(m11944(str));
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList m11944(String str) {
        ArrayList<String> arrayList;
        C9095 c9095 = this.f17513;
        c9095.getClass();
        str.getClass();
        if (!c9095.f25489.contains(str)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        str.getClass();
        String string = c9095.f25489.getString(str, "");
        if (string == null || string.length() == 0) {
            arrayList = new ArrayList();
        } else {
            C7162 c7162 = c9095.f25490;
            c7162.getClass();
            arrayList = AbstractC4344.m8786((Collection) c7162.m12426(string, new C7103(C7135.f19089, 0)));
        }
        for (String str2 : arrayList) {
            C7162 c71622 = AbstractC9109.f25536;
            str2.getClass();
            C7162 c71623 = AbstractC9109.f25536;
            c71623.getClass();
            C9103 c9103 = (C9103) c71623.m12426(str2, C9103.Companion.serializer());
            List list = c9103.f25530;
            ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC9090.m14669((String) it.next()));
            }
            Class[] clsArr = (Class[]) arrayList3.toArray(new Class[0]);
            C9092 c9092M14673 = C9092.m14673(c9103.f25532);
            c9092M14673.f25481 = c9103.f25531;
            c9092M14673.f25483 = AbstractC9090.m14669(c9103.f25529);
            c9092M14673.m14675((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Member memberM14605 = c9092M14673.m14605();
            memberM14605.getClass();
            arrayList2.add((Method) memberM14605);
        }
        return arrayList2;
    }
}
