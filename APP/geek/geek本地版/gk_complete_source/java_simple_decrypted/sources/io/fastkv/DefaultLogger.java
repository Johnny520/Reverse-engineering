package io.fastkv;

import android.util.Log;
import io.fastkv.interfaces.FastLogger;

/* JADX INFO: loaded from: classes.dex */
class DefaultLogger implements FastLogger {
    private static final String TAG = "FastKV";

    public DefaultLogger() {
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void e(String r2, Exception r3) {
        Log.e(TAG, r2, r3);
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void i(String r2, String r3) {
        Log.i(TAG, r2 + " " + r3);
    }

    @Override // io.fastkv.interfaces.FastLogger
    public void w(String r2, Exception r3) {
        Log.w(TAG, r2, r3);
    }
}
