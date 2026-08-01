package p089;

import androidx.compose.foundation.C1868;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.C5703;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18840 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Pair f18839 = new Pair("V", null);

    public C7762(C5703 c5703, String str, String str2) {
        this.f18841 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12787(JvmPrimitiveType jvmPrimitiveType) {
        jvmPrimitiveType.getClass();
        this.f18839 = new Pair(jvmPrimitiveType.getDesc(), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12788(String str, C7754... c7754Arr) {
        str.getClass();
        C5174 c5174 = new C5174(new C1868(c7754Arr, 19), 1);
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(c5174, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        Iterator it = c5174.iterator();
        while (true) {
            C5170 c5170 = (C5170) it;
            if (!c5170.f13264.hasNext()) {
                this.f18839 = new Pair(str, new C7764(linkedHashMap));
                return;
            } else {
                C5173 c5173 = (C5173) c5170.next();
                linkedHashMap.put(Integer.valueOf(c5173.f13269), (C7754) c5173.f13268);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12789(String str, C7754... c7754Arr) {
        C7764 c7764;
        str.getClass();
        if (c7754Arr.length == 0) {
            c7764 = null;
        } else {
            C5174 c5174 = new C5174(new C1868(c7754Arr, 19), 1);
            int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(c5174, 10));
            if (iM9331 < 16) {
                iM9331 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
            Iterator it = c5174.iterator();
            while (true) {
                C5170 c5170 = (C5170) it;
                if (!c5170.f13264.hasNext()) {
                    break;
                }
                C5173 c5173 = (C5173) c5170.next();
                linkedHashMap.put(Integer.valueOf(c5173.f13269), (C7754) c5173.f13268);
            }
            c7764 = new C7764(linkedHashMap);
        }
        this.f18840.add(new Pair(str, c7764));
    }
}
