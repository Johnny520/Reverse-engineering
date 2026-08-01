package io.fastkv;

import android.util.Log;
import io.fastkv.interfaces.FastLogger;

/* JADX INFO: loaded from: classes.dex */
class DefaultLogger implements FastLogger {
    private static final String TAG = "FastKV";

    @Override // io.fastkv.interfaces.FastLogger
    /* JADX INFO: renamed from: e */
    public void mo1453e(String str, Exception exc) {
        Log.e(TAG, str, exc);
    }

    @Override // io.fastkv.interfaces.FastLogger
    /* JADX INFO: renamed from: i */
    public void mo1454i(String str, String str2) {
        Log.i(TAG, str + " " + str2);
    }

    @Override // io.fastkv.interfaces.FastLogger
    /* JADX INFO: renamed from: w */
    public void mo1455w(String str, Exception exc) {
        Log.w(TAG, str, exc);
    }
}
