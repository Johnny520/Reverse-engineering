package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 implements p000.v3 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.StringBuilder f131 = null;

    public static final class a {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m58(java.lang.Throwable r4) {
                r0 = 1
                byte[] r0 = new byte[r0]
                r1 = 0
                r2 = -118(0xffffffffffffff8a, float:NaN)
                r0[r1] = r2
                r2 = 6
                byte[] r3 = new byte[r2]
                r3 = {x0056: FILL_ARRAY_DATA , data: [-17, 110, 48, 52, -16, 28} // fill-array
                p000.oa.m332(r0, r3)
                r0 = 7
                byte[] r0 = new byte[r0]
                r0 = {x005e: FILL_ARRAY_DATA , data: [-56, 79, -59, -65, -95, -65, -54} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x0066: FILL_ARRAY_DATA , data: [-12, 60, -96, -53, -116, -128} // fill-array
                p000.oa.m332(r0, r2)
                java.lang.StringBuilder r0 = p000.b0.f131
                r0.setLength(r1)
                java.lang.String r2 = r4.toString()
                r0.append(r2)
                r0 = r1
            L2c:
                r2 = 3
                if (r0 >= r2) goto L42
                java.lang.StringBuilder r2 = p000.b0.f131
                r3 = 10
                r2.append(r3)
                java.lang.StackTraceElement[] r3 = r4.getStackTrace()
                r3 = r3[r0]
                r2.append(r3)
                int r0 = r0 + 1
                goto L2c
            L42:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.StackTraceElement[] r4 = r4.getStackTrace()
                p000.h4.m186(r4)
                int r0 = r4.length
            L4e:
                if (r1 >= r0) goto L55
                r2 = r4[r1]
                int r1 = r1 + 1
                goto L4e
            L55:
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            p000.b0.f131 = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            return
    }

    public b0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract java.lang.String mo57();
}
