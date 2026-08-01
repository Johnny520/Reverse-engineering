package io.ktor.client.plugins.cache;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5970;
import p252.C8949;
import p252.C8952;

/* JADX INFO: renamed from: io.ktor.client.plugins.cache.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8952 f12442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8952 f12443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8952 f12444;

    static {
        Object next;
        Object next2;
        String str;
        Double dM10685;
        String str2;
        Double dM106852;
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        Iterator<E> it = emptyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC5227.m9466(((C8949) next).f22762, "q")) {
                    break;
                }
            }
        }
        C8949 c8949 = (C8949) next;
        if (c8949 != null && (str2 = c8949.f22761) != null && (dM106852 = AbstractC5970.m10685(str2)) != null) {
            double dDoubleValue = dM106852.doubleValue();
            if (0.0d > dDoubleValue || dDoubleValue > 1.0d) {
            }
        }
        f12444 = new C8952("no-cache");
        EmptyList emptyList2 = EmptyList.INSTANCE;
        emptyList2.getClass();
        Iterator<E> it2 = emptyList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (AbstractC5227.m9466(((C8949) next2).f22762, "q")) {
                    break;
                }
            }
        }
        C8949 c89492 = (C8949) next2;
        if (c89492 != null && (str = c89492.f22761) != null && (dM10685 = AbstractC5970.m10685(str)) != null) {
            double dDoubleValue2 = dM10685.doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 <= 1.0d) {
            }
        }
        f12443 = new C8952("only-if-cached");
        f12442 = new C8952("must-revalidate");
    }
}
