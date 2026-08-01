package p035;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import p087.C7102;
import p087.C7134;
import p088.C7161;
import p390.AbstractC9113;
import p390.C9107;
import p391.C9114;
import p392.AbstractC9121;
import p392.C9125;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9114 f17466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17467;

    public C6341(int i) {
        this.f17467 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f17466 = new C9114(AbstractC3056.m6668(-3937676766391567783L), 0);
                break;
        }
    }

    public String toString() {
        switch (this.f17467) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (String str : ((HashMap) this.f17466.f25485.getAll()).keySet()) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(m11896(str));
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList m11896(String str) {
        ArrayList<String> arrayList;
        C9114 c9114 = this.f17466;
        c9114.getClass();
        str.getClass();
        if (!c9114.f25485.contains(str)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        str.getClass();
        String string = c9114.f25485.getString(str, "");
        if (string == null || string.length() == 0) {
            arrayList = new ArrayList();
        } else {
            C7161 c7161 = c9114.f25486;
            c7161.getClass();
            arrayList = AbstractC4343.m8799((Collection) c7161.m12399(string, new C7102(C7134.f19094, 0)));
        }
        for (String str2 : arrayList) {
            C7161 c71612 = AbstractC9113.f25483;
            str2.getClass();
            C7161 c71613 = AbstractC9113.f25483;
            c71613.getClass();
            C9107 c9107 = (C9107) c71613.m12399(str2, C9107.Companion.serializer());
            List list = c9107.f25477;
            ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC9121.m14657((String) it.next()));
            }
            Class[] clsArr = (Class[]) arrayList3.toArray(new Class[0]);
            C9125 c9125M14681 = C9125.m14681(c9107.f25479);
            c9125M14681.f25504 = c9107.f25478;
            c9125M14681.f25506 = AbstractC9121.m14657(c9107.f25476);
            c9125M14681.m14683((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Member memberM14686 = c9125M14681.m14686();
            memberM14686.getClass();
            arrayList2.add((Method) memberM14686);
        }
        return arrayList2;
    }
}
