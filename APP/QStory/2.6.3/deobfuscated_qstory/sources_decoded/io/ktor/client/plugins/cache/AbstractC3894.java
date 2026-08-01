package io.ktor.client.plugins.cache;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5138;
import p236.C8120;
import p236.C8123;

/* JADX INFO: renamed from: io.ktor.client.plugins.cache.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8123 f12097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8123 f12098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8123 f12099;

    static {
        Object next;
        Object next2;
        String str;
        Double dM10126;
        String str2;
        Double dM101262;
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        Iterator<E> it = emptyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4395.m8907(((C8120) next).f22417, "q")) {
                    break;
                }
            }
        }
        C8120 c8120 = (C8120) next;
        if (c8120 != null && (str2 = c8120.f22416) != null && (dM101262 = AbstractC5138.m10126(str2)) != null) {
            double dDoubleValue = dM101262.doubleValue();
            if (0.0d > dDoubleValue || dDoubleValue > 1.0d) {
            }
        }
        f12099 = new C8123("no-cache");
        EmptyList emptyList2 = EmptyList.INSTANCE;
        emptyList2.getClass();
        Iterator<E> it2 = emptyList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (AbstractC4395.m8907(((C8120) next2).f22417, "q")) {
                    break;
                }
            }
        }
        C8120 c81202 = (C8120) next2;
        if (c81202 != null && (str = c81202.f22416) != null && (dM10126 = AbstractC5138.m10126(str)) != null) {
            double dDoubleValue2 = dM10126.doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 <= 1.0d) {
            }
        }
        f12098 = new C8123("only-if-cached");
        f12097 = new C8123("must-revalidate");
    }
}
