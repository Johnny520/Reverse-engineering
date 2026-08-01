package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import kotlin.C5167;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4622 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4619 f13528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0076 f13529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687[] f13530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f13531;

    static {
        C4687 c4687 = new C4687("org.jspecify.nullness");
        C4687 c46872 = new C4687("org.jspecify.annotations");
        f13531 = c46872;
        C4687 c46873 = new C4687("io.reactivex.rxjava3.annotations");
        C4687 c46874 = new C4687("org.checkerframework.checker.nullness.compatqual");
        String str = c46873.f13696.f13693;
        f13530 = new C4687[]{new C4687(AbstractC0053.m136(str, ".Nullable")), new C4687(AbstractC0053.m136(str, ".NonNull"))};
        C4687 c46875 = new C4687("org.jetbrains.annotations");
        C4619 c4619 = C4619.f13523;
        Pair pair = new Pair(c46875, c4619);
        Pair pair2 = new Pair(new C4687("kotlin.annotations.jvm"), c4619);
        Pair pair3 = new Pair(new C4687("androidx.annotation"), c4619);
        Pair pair4 = new Pair(new C4687("android.support.annotation"), c4619);
        Pair pair5 = new Pair(new C4687("android.annotation"), c4619);
        Pair pair6 = new Pair(new C4687("com.android.annotations"), c4619);
        Pair pair7 = new Pair(new C4687("org.eclipse.jdt.annotation"), c4619);
        Pair pair8 = new Pair(new C4687("org.checkerframework.checker.nullness.qual"), c4619);
        Pair pair9 = new Pair(c46874, c4619);
        Pair pair10 = new Pair(new C4687("javax.annotation"), c4619);
        Pair pair11 = new Pair(new C4687("edu.umd.cs.findbugs.annotations"), c4619);
        Pair pair12 = new Pair(new C4687("io.reactivex.annotations"), c4619);
        C4687 c46876 = new C4687("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair13 = new Pair(c46876, new C4619(reportLevel, 4));
        Pair pair14 = new Pair(new C4687("androidx.annotation.RecentlyNonNull"), new C4619(reportLevel, 4));
        Pair pair15 = new Pair(new C4687("lombok"), c4619);
        C5167 c5167 = new C5167(2, 1, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f13529 = new C0076(AbstractC4339.m8774(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(c4687, new C4619(reportLevel, c5167, reportLevel2)), new Pair(c46872, new C4619(reportLevel, new C5167(2, 1, 0), reportLevel2)), new Pair(c46873, new C4619(reportLevel, new C5167(1, 8, 0), reportLevel2)), new Pair(new C4687("jakarta.annotation"), new C4619(reportLevel, new C5167(2, 4, 0), reportLevel2)), new Pair(AbstractC4615.f13496, new C4619(reportLevel, new C5167(2, 5, 0), reportLevel2)), new Pair(AbstractC4615.f13488, new C4619(reportLevel, new C5167(2, 5, 0), reportLevel2)), new Pair(new C4687("io.vertx.codegen.annotations"), new C4619(reportLevel, new C5167(2, 5, 0), reportLevel2))));
        f13528 = new C4619(reportLevel, 4);
    }
}
