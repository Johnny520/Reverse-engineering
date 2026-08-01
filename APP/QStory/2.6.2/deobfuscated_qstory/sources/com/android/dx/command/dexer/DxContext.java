package com.android.dx.command.dexer;

import com.android.dx.dex.cf.CodeStatistics;
import com.android.dx.dex.cf.OptimizerOptions;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DxContext {
    public final CodeStatistics codeStatistics;
    public final PrintStream err;
    final PrintStream noop;
    public final OptimizerOptions optimizerOptions;
    public final PrintStream out;

    public DxContext(OutputStream outputStream, OutputStream outputStream2) {
        this.codeStatistics = new CodeStatistics();
        this.optimizerOptions = new OptimizerOptions();
        this.noop = new PrintStream(new OutputStream() { // from class: com.android.dx.command.dexer.DxContext.1
            @Override // java.io.OutputStream
            public void write(int i) {
            }
        });
        this.out = new PrintStream(outputStream);
        this.err = new PrintStream(outputStream2);
    }

    public DxContext() {
        this(System.out, System.err);
    }
}
