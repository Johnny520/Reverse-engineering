package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd2 extends RuntimeException {

    /* JADX INFO: renamed from: h */
    public final String f10061h;

    /* JADX INFO: renamed from: i */
    public final String f10062i;

    /* JADX INFO: renamed from: j */
    public final boolean f10063j;

    /* JADX INFO: renamed from: k */
    public final Map f10064k;

    /* JADX WARN: Illegal instructions before constructor call */
    public sd2(String str, String str2, boolean z, Map map, Throwable th, int i) {
        z = (i & 4) != 0 ? false : z;
        map = (i & 8) != 0 ? ce0.f1492h : map;
        th = (i & 16) != 0 ? null : th;
        str.getClass();
        str2.getClass();
        super(str2, th);
        this.f10061h = str;
        this.f10062i = str2;
        this.f10063j = z;
        this.f10064k = map;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10062i;
    }
}
