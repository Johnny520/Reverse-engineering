package p073;

import androidx.compose.foundation.C1030;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.C4871;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18495 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Pair f18494 = new Pair("V", null);

    public C6933(C4871 c4871, String str, String str2) {
        this.f18496 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12228(JvmPrimitiveType jvmPrimitiveType) {
        jvmPrimitiveType.getClass();
        this.f18494 = new Pair(jvmPrimitiveType.getDesc(), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12229(String str, C6925... c6925Arr) {
        str.getClass();
        C4342 c4342 = new C4342(new C1030(c6925Arr, 19), 1);
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(c4342, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        Iterator it = c4342.iterator();
        while (true) {
            C4338 c4338 = (C4338) it;
            if (!c4338.f12919.hasNext()) {
                this.f18494 = new Pair(str, new C6935(linkedHashMap));
                return;
            } else {
                C4341 c4341 = (C4341) c4338.next();
                linkedHashMap.put(Integer.valueOf(c4341.f12924), (C6925) c4341.f12923);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12230(String str, C6925... c6925Arr) {
        C6935 c6935;
        str.getClass();
        if (c6925Arr.length == 0) {
            c6935 = null;
        } else {
            C4342 c4342 = new C4342(new C1030(c6925Arr, 19), 1);
            int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(c4342, 10));
            if (iM8772 < 16) {
                iM8772 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
            Iterator it = c4342.iterator();
            while (true) {
                C4338 c4338 = (C4338) it;
                if (!c4338.f12919.hasNext()) {
                    break;
                }
                C4341 c4341 = (C4341) c4338.next();
                linkedHashMap.put(Integer.valueOf(c4341.f12924), (C6925) c4341.f12923);
            }
            c6935 = new C6935(linkedHashMap);
        }
        this.f18495.add(new Pair(str, c6935));
    }
}
