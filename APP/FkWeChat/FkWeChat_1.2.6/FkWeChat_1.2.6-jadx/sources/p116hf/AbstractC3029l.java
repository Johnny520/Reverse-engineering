package p116hf;

import p376zd.C10010p0;

/* JADX INFO: renamed from: hf.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3029l {
    /* JADX INFO: renamed from: a */
    public static Throwable m11185a(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m11186b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            C10010p0.m38820a("non-sensical empty or null argument array");
            return null;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}
