package p092S0;

import java.util.Comparator;
import p049I2.AbstractC0797o;

/* JADX INFO: renamed from: S0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1268f implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4561a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C1.b.<init>(S0.g, S0.M, java.util.List, e1.c, W0.e):void, S0.g.<init>(java.util.List, java.lang.String):void] */
    public /* synthetic */ C1268f(int i5) {
        this.f4561a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4561a) {
        }
        return AbstractC0797o.m1386k(Integer.valueOf(((C1267e) obj).f4558b), Integer.valueOf(((C1267e) obj2).f4558b));
    }
}
