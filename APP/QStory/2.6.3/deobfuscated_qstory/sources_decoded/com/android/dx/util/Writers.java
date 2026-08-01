package com.android.dx.util;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Writers {
    private Writers() {
    }

    public static PrintWriter printWriterFor(Writer writer) {
        return writer instanceof PrintWriter ? (PrintWriter) writer : new PrintWriter(writer);
    }
}
