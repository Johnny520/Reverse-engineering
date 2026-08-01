package p248u3;

import p056K2.C0884j;
import p127Z2.AbstractC1784a;
import p149d3.AbstractC1983k;

/* JADX INFO: renamed from: u3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3337a {

    /* JADX INFO: renamed from: a */
    public static final int f10382a;

    static {
        Object objM3229o;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM3229o = property != null ? AbstractC1983k.m3657T(property) : null;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        Integer num = (Integer) (objM3229o instanceof C0884j ? null : objM3229o);
        f10382a = num != null ? num.intValue() : 2097152;
    }
}
