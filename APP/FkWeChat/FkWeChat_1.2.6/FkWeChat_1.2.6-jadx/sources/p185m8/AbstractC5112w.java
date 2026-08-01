package p185m8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p024b9.AbstractC1061t;
import p198n8.C5509b;

/* JADX INFO: renamed from: m8.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5112w {
    /* JADX INFO: renamed from: a */
    public static List m20785a(List list) {
        list.getClass();
        return ((C5509b) list).m22399x();
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m20786b(Object[] objArr, boolean z10) {
        objArr.getClass();
        if (z10 && AbstractC1061t.m3842c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: c */
    public static List m20787c() {
        return new C5509b(0, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public static List m20788d(int i10) {
        return new C5509b(i10);
    }

    /* JADX INFO: renamed from: e */
    public static List m20789e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: f */
    public static List m20790f(Iterable iterable) {
        iterable.getClass();
        List listM20558Z0 = AbstractC5081g0.m20558Z0(iterable);
        Collections.shuffle(listM20558Z0);
        return listM20558Z0;
    }

    /* JADX INFO: renamed from: g */
    public static Object[] m20791g(int i10, Object[] objArr) {
        objArr.getClass();
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
