package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import kotlin.C5166;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.reflect.jvm.internal.impl.name.C4686;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4618 f13524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0076 f13525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4686[] f13526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4686 f13527;

    static {
        C4686 c4686 = new C4686("org.jspecify.nullness");
        C4686 c46862 = new C4686("org.jspecify.annotations");
        f13527 = c46862;
        C4686 c46863 = new C4686("io.reactivex.rxjava3.annotations");
        C4686 c46864 = new C4686("org.checkerframework.checker.nullness.compatqual");
        String str = c46863.f13692.f13689;
        f13526 = new C4686[]{new C4686(AbstractC0053.m136(str, ".Nullable")), new C4686(AbstractC0053.m136(str, ".NonNull"))};
        C4686 c46865 = new C4686("org.jetbrains.annotations");
        C4618 c4618 = C4618.f13519;
        Pair pair = new Pair(c46865, c4618);
        Pair pair2 = new Pair(new C4686("kotlin.annotations.jvm"), c4618);
        Pair pair3 = new Pair(new C4686("androidx.annotation"), c4618);
        Pair pair4 = new Pair(new C4686("android.support.annotation"), c4618);
        Pair pair5 = new Pair(new C4686("android.annotation"), c4618);
        Pair pair6 = new Pair(new C4686("com.android.annotations"), c4618);
        Pair pair7 = new Pair(new C4686("org.eclipse.jdt.annotation"), c4618);
        Pair pair8 = new Pair(new C4686("org.checkerframework.checker.nullness.qual"), c4618);
        Pair pair9 = new Pair(c46864, c4618);
        Pair pair10 = new Pair(new C4686("javax.annotation"), c4618);
        Pair pair11 = new Pair(new C4686("edu.umd.cs.findbugs.annotations"), c4618);
        Pair pair12 = new Pair(new C4686("io.reactivex.annotations"), c4618);
        C4686 c46866 = new C4686("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair13 = new Pair(c46866, new C4618(reportLevel, 4));
        Pair pair14 = new Pair(new C4686("androidx.annotation.RecentlyNonNull"), new C4618(reportLevel, 4));
        Pair pair15 = new Pair(new C4686("lombok"), c4618);
        C5166 c5166 = new C5166(2, 1, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f13525 = new C0076(AbstractC4338.m8777(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(c4686, new C4618(reportLevel, c5166, reportLevel2)), new Pair(c46862, new C4618(reportLevel, new C5166(2, 1, 0), reportLevel2)), new Pair(c46863, new C4618(reportLevel, new C5166(1, 8, 0), reportLevel2)), new Pair(new C4686("jakarta.annotation"), new C4618(reportLevel, new C5166(2, 4, 0), reportLevel2)), new Pair(AbstractC4614.f13492, new C4618(reportLevel, new C5166(2, 5, 0), reportLevel2)), new Pair(AbstractC4614.f13484, new C4618(reportLevel, new C5166(2, 5, 0), reportLevel2)), new Pair(new C4686("io.vertx.codegen.annotations"), new C4618(reportLevel, new C5166(2, 5, 0), reportLevel2))));
        f13524 = new C4618(reportLevel, 4);
    }
}
