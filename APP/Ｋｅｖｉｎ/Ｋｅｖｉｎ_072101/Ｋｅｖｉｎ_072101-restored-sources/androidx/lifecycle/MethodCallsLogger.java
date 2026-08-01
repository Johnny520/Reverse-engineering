package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class MethodCallsLogger {
    private java.util.Map<java.lang.String, java.lang.Integer> mCalledMethods;

    public MethodCallsLogger() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCalledMethods = r0
            return
    }

    public boolean approveCall(java.lang.String r8, int r9) {
            r7 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r7.mCalledMethods
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L10
            int r2 = r0.intValue()
            goto L11
        L10:
            r2 = r1
        L11:
            r3 = r2 & r9
            r4 = 1
            if (r3 == 0) goto L18
            r3 = r4
            goto L19
        L18:
            r3 = r1
        L19:
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r7.mCalledMethods
            r6 = r2 | r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r8, r6)
            if (r3 != 0) goto L27
            r1 = r4
        L27:
            return r1
    }
}
