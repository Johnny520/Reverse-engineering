package p185m8;

import java.lang.reflect.Array;
import p299ub.C8613b0;

/* JADX INFO: renamed from: m8.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5098p {
    /* JADX INFO: renamed from: a */
    public static final Object[] m20638a(Object[] objArr, int i10) {
        objArr.getClass();
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
        objNewInstance.getClass();
        return (Object[]) objNewInstance;
    }

    /* JADX INFO: renamed from: b */
    public static final void m20639b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        C8613b0.m33082a("toIndex (", i10, ") is greater than size (", i11);
    }
}
