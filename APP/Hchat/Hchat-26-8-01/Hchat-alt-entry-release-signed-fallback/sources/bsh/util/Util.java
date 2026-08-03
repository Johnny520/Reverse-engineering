package bsh.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Util {
    public Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T[] concatArrays(T[]... r7) {
            int r0 = r7.length
            if (r0 == 0) goto L38
            int r0 = r7.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lb
            r7 = r7[r2]
            return r7
        Lb:
            int r0 = r7.length
            r1 = r2
            r3 = r1
        Le:
            if (r1 >= r0) goto L17
            r4 = r7[r1]
            int r4 = r4.length
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto Le
        L17:
            r0 = r7[r2]
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r7.length
            r3 = r2
            r4 = r3
        L2a:
            if (r3 >= r1) goto L37
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L2a
        L37:
            return r0
        L38:
            java.lang.String r7 = "There is no arrays to concat!"
            bsh.j.c(r7)
            r7 = 0
            return r7
    }
}
