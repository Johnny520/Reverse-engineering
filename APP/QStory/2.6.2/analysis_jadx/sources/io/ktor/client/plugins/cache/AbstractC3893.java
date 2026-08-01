package io.ktor.client.plugins.cache;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5137;
import p236.C8119;
import p236.C8122;

/* JADX INFO: renamed from: io.ktor.client.plugins.cache.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8122 f12092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8122 f12093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8122 f12094;

    static {
        Object next;
        Object next2;
        String str;
        Double dM10122;
        String str2;
        Double dM101222;
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        Iterator<E> it = emptyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4394.m8917(((C8119) next).f22419, "q")) {
                    break;
                }
            }
        }
        C8119 c8119 = (C8119) next;
        if (c8119 != null && (str2 = c8119.f22418) != null && (dM101222 = AbstractC5137.m10122(str2)) != null) {
            double dDoubleValue = dM101222.doubleValue();
            if (0.0d > dDoubleValue || dDoubleValue > 1.0d) {
            }
        }
        f12094 = new C8122("no-cache");
        EmptyList emptyList2 = EmptyList.INSTANCE;
        emptyList2.getClass();
        Iterator<E> it2 = emptyList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (AbstractC4394.m8917(((C8119) next2).f22419, "q")) {
                    break;
                }
            }
        }
        C8119 c81192 = (C8119) next2;
        if (c81192 != null && (str = c81192.f22418) != null && (dM10122 = AbstractC5137.m10122(str)) != null) {
            double dDoubleValue2 = dM10122.doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 <= 1.0d) {
            }
        }
        f12093 = new C8122("only-if-cached");
        f12092 = new C8122("must-revalidate");
    }
}
