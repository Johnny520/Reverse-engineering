package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063bp implements p41, Serializable {

    /* JADX INFO: renamed from: h */
    public transient p41 f962h;

    /* JADX INFO: renamed from: i */
    public final Object f963i;

    /* JADX INFO: renamed from: j */
    public final Class f964j;

    /* JADX INFO: renamed from: k */
    public final String f965k;

    /* JADX INFO: renamed from: l */
    public final String f966l;

    /* JADX INFO: renamed from: m */
    public final boolean f967m;

    public AbstractC0063bp(Object obj, Class cls, String str, String str2, boolean z) {
        this.f963i = obj;
        this.f964j = cls;
        this.f965k = str;
        this.f966l = str2;
        this.f967m = z;
    }

    /* JADX INFO: renamed from: d */
    public abstract p41 mo581d();

    /* JADX INFO: renamed from: f */
    public final InterfaceC0667rs m582f() {
        boolean z = this.f967m;
        Class cls = this.f964j;
        if (!z) {
            return d72.m967a(cls);
        }
        d72.f1901a.getClass();
        return new fw1(cls);
    }
}
