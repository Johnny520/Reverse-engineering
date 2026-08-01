package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import kotlin.C5999;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.impl.name.C5519;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5451 f13873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0923 f13874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5519[] f13875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5519 f13876;

    static {
        C5519 c5519 = new C5519("org.jspecify.nullness");
        C5519 c55192 = new C5519("org.jspecify.annotations");
        f13876 = c55192;
        C5519 c55193 = new C5519("io.reactivex.rxjava3.annotations");
        C5519 c55194 = new C5519("org.checkerframework.checker.nullness.compatqual");
        String str = c55193.f14041.f14038;
        f13875 = new C5519[]{new C5519(AbstractC0900.m696(str, ".Nullable")), new C5519(AbstractC0900.m696(str, ".NonNull"))};
        C5519 c55195 = new C5519("org.jetbrains.annotations");
        C5451 c5451 = C5451.f13868;
        Pair pair = new Pair(c55195, c5451);
        Pair pair2 = new Pair(new C5519("kotlin.annotations.jvm"), c5451);
        Pair pair3 = new Pair(new C5519("androidx.annotation"), c5451);
        Pair pair4 = new Pair(new C5519("android.support.annotation"), c5451);
        Pair pair5 = new Pair(new C5519("android.annotation"), c5451);
        Pair pair6 = new Pair(new C5519("com.android.annotations"), c5451);
        Pair pair7 = new Pair(new C5519("org.eclipse.jdt.annotation"), c5451);
        Pair pair8 = new Pair(new C5519("org.checkerframework.checker.nullness.qual"), c5451);
        Pair pair9 = new Pair(c55194, c5451);
        Pair pair10 = new Pair(new C5519("javax.annotation"), c5451);
        Pair pair11 = new Pair(new C5519("edu.umd.cs.findbugs.annotations"), c5451);
        Pair pair12 = new Pair(new C5519("io.reactivex.annotations"), c5451);
        C5519 c55196 = new C5519("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair13 = new Pair(c55196, new C5451(reportLevel, 4));
        Pair pair14 = new Pair(new C5519("androidx.annotation.RecentlyNonNull"), new C5451(reportLevel, 4));
        Pair pair15 = new Pair(new C5519("lombok"), c5451);
        C5999 c5999 = new C5999(2, 1, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f13874 = new C0923(AbstractC5171.m9333(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(c5519, new C5451(reportLevel, c5999, reportLevel2)), new Pair(c55192, new C5451(reportLevel, new C5999(2, 1, 0), reportLevel2)), new Pair(c55193, new C5451(reportLevel, new C5999(1, 8, 0), reportLevel2)), new Pair(new C5519("jakarta.annotation"), new C5451(reportLevel, new C5999(2, 4, 0), reportLevel2)), new Pair(AbstractC5447.f13841, new C5451(reportLevel, new C5999(2, 5, 0), reportLevel2)), new Pair(AbstractC5447.f13833, new C5451(reportLevel, new C5999(2, 5, 0), reportLevel2)), new Pair(new C5519("io.vertx.codegen.annotations"), new C5451(reportLevel, new C5999(2, 5, 0), reportLevel2))));
        f13873 = new C5451(reportLevel, 4);
    }
}
