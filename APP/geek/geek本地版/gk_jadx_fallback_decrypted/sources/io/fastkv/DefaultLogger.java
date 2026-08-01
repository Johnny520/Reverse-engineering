package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
class DefaultLogger implements io.fastkv.interfaces.FastLogger {
    private static final java.lang.String TAG = "FastKV";

    public DefaultLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void e(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.String r0 = "FastKV"
            android.util.Log.e(r0, r2, r3)
            return
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void i(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "FastKV"
            android.util.Log.i(r3, r2)
            return
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void w(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            java.lang.String r0 = "FastKV"
            android.util.Log.w(r0, r2, r3)
            return
    }
}
