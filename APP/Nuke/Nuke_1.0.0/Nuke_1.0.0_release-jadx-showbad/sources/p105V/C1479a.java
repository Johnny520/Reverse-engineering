package p105V;

import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p186k.AbstractC2413J;
import p186k.C2404A;
import p186k.C2408E;

/* JADX INFO: renamed from: V.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1479a {

    /* JADX INFO: renamed from: a */
    public final C2408E f5171a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m2750a(C2408E c2408e) {
        Object objM4272g = c2408e.m4272g(null);
        if (objM4272g == null) {
            return null;
        }
        if (!(objM4272g instanceof C2404A)) {
            c2408e.m4276k(null);
            return objM4272g;
        }
        C2404A c2404a = (C2404A) objM4272g;
        if (c2404a.m4250h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i5 = c2404a.f7767b - 1;
        Object objM4248f = c2404a.m4248f(i5);
        c2404a.m4253k(i5);
        AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c2404a.m4250h()) {
            c2408e.m4276k(null);
        }
        if (c2404a.f7767b == 1) {
            c2408e.m4278m(null, c2404a.m4247e());
        }
        return objM4248f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2404A m2751b(C2408E c2408e) {
        if (c2408e.m4274i()) {
            C2404A c2404a = AbstractC2413J.f7814b;
            AbstractC1665j.m2983c(c2404a, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return c2404a;
        }
        C2404A c2404a2 = new C2404A();
        Object[] objArr = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i5 << 3) + i7];
                            if (obj instanceof C2404A) {
                                c2404a2.m4245c((C2404A) obj);
                            } else {
                                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                c2404a2.m4243a(obj);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return c2404a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1479a) {
            return AbstractC1665j.m2981a(this.f5171a, ((C1479a) obj).f5171a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5171a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiValueMap(map=" + this.f5171a + ')';
    }
}
