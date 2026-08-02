package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: xi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0887xi {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13039b = AtomicIntegerFieldUpdater.newUpdater(C0887xi.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final n60[] f13040a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0887xi(n60[] n60VarArr) {
        this.f13040a = n60VarArr;
        this.notCompletedCount$volatile = n60VarArr.length;
    }
}
