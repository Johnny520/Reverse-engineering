package p190k3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import p061L2.C0979s;
import p117X2.AbstractC1665j;
import p143c3.AbstractC1907i;
import p143c3.C1899a;
import p166g3.C2185b;

/* JADX INFO: renamed from: k3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2456d {

    /* JADX INFO: renamed from: a */
    public static final List f7927a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            Iterator it = Arrays.asList(new C2185b()).iterator();
            AbstractC1665j.m2985e(it, "<this>");
            f7927a = AbstractC1907i.m3392v(new C1899a(new C0979s(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
