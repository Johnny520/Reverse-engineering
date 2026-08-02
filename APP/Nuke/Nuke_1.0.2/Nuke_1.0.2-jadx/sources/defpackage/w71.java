package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w71(e9 e9Var, int i) {
        this.a = i;
        this.b = e9Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        e9 e9Var = this.b;
        switch (i) {
        }
        return Integer.valueOf(e9Var.g(((y81) obj2).g)).compareTo(Integer.valueOf(e9Var.g(((y81) obj).g)));
    }
}
