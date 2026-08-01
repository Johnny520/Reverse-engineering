package p073;

import androidx.compose.foundation.C1030;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.C4870;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f18500 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Pair f18499 = new Pair("V", null);

    public C6932(C4870 c4870, String str, String str2) {
        this.f18501 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12200(JvmPrimitiveType jvmPrimitiveType) {
        jvmPrimitiveType.getClass();
        this.f18499 = new Pair(jvmPrimitiveType.getDesc(), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12201(String str, C6924... c6924Arr) {
        str.getClass();
        C4341 c4341 = new C4341(new C1030(c6924Arr, 19), 1);
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(c4341, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        Iterator it = c4341.iterator();
        while (true) {
            C4337 c4337 = (C4337) it;
            if (!c4337.f12915.hasNext()) {
                this.f18499 = new Pair(str, new C6934(linkedHashMap));
                return;
            } else {
                C4340 c4340 = (C4340) c4337.next();
                linkedHashMap.put(Integer.valueOf(c4340.f12920), (C6924) c4340.f12919);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12202(String str, C6924... c6924Arr) {
        C6934 c6934;
        str.getClass();
        if (c6924Arr.length == 0) {
            c6934 = null;
        } else {
            C4341 c4341 = new C4341(new C1030(c6924Arr, 19), 1);
            int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(c4341, 10));
            if (iM8779 < 16) {
                iM8779 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
            Iterator it = c4341.iterator();
            while (true) {
                C4337 c4337 = (C4337) it;
                if (!c4337.f12915.hasNext()) {
                    break;
                }
                C4340 c4340 = (C4340) c4337.next();
                linkedHashMap.put(Integer.valueOf(c4340.f12920), (C6924) c4340.f12919);
            }
            c6934 = new C6934(linkedHashMap);
        }
        this.f18500.add(new Pair(str, c6934));
    }
}
