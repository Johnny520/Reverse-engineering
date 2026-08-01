package bsh;

import java.io.PrintStream;
import java.io.Reader;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2626 {
    void error(Object obj);

    PrintStream getErr();

    Reader getIn();

    PrintStream getOut();

    void print(Object obj);

    void println(Object obj);

    void prompt(String str);
}
