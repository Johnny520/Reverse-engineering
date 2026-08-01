package bsh;

import java.io.PrintStream;
import java.io.Reader;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2625 {
    void error(Object obj);

    PrintStream getErr();

    Reader getIn();

    PrintStream getOut();

    void print(Object obj);

    void println(Object obj);

    void prompt(String str);
}
