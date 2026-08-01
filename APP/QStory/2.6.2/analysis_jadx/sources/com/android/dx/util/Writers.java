package com.android.dx.util;

import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Writers {
    private Writers() {
    }

    public static PrintWriter printWriterFor(Writer writer) {
        return writer instanceof PrintWriter ? (PrintWriter) writer : new PrintWriter(writer);
    }
}
