package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p065.AbstractC7356;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5448 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5519 f13844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5519 f13845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5519 f13846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5519 f13847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5519 f13848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5519 f13849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Set f13850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Set f13851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Set f13852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5519 f13853;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5519 f13854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5519 f13855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Set f13856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Set f13857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5519 f13858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Set f13859;

    static {
        C5519 c5519 = new C5519("org.jspecify.nullness.Nullable");
        C5519 c55192 = new C5519("org.jspecify.nullness.NullMarked");
        f13849 = c55192;
        C5519 c55193 = new C5519("org.jspecify.nullness.NullnessUnspecified");
        C5519 c55194 = new C5519("org.jspecify.annotations.NonNull");
        C5519 c55195 = new C5519("org.jspecify.annotations.Nullable");
        C5519 c55196 = new C5519("org.jspecify.annotations.NullMarked");
        f13848 = c55196;
        C5519 c55197 = new C5519("org.jspecify.annotations.NullnessUnspecified");
        C5519 c55198 = new C5519("org.jspecify.annotations.NullUnmarked");
        f13847 = c55198;
        f13846 = new C5519("javax.annotation.meta.TypeQualifier");
        f13845 = new C5519("javax.annotation.meta.TypeQualifierNickname");
        f13844 = new C5519("javax.annotation.meta.TypeQualifierDefault");
        C5519 c55199 = new C5519("javax.annotation.Nonnull");
        f13855 = c55199;
        C5519 c551910 = new C5519("javax.annotation.Nullable");
        C5519 c551911 = new C5519("javax.annotation.CheckForNull");
        f13854 = new C5519("javax.annotation.ParametersAreNonnullByDefault");
        f13858 = new C5519("javax.annotation.ParametersAreNullableByDefault");
        f13859 = AbstractC5179.m9404(new C5519[]{c55199, c551911});
        C5519 c551912 = AbstractC5447.f13838;
        c551912.getClass();
        Set setM9404 = AbstractC5179.m9404(new C5519[]{c551912, c55194, new C5519("android.annotation.NonNull"), new C5519("androidx.annotation.NonNull"), new C5519("androidx.annotation.RecentlyNonNull"), new C5519("android.support.annotation.NonNull"), new C5519("com.android.annotations.NonNull"), new C5519("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C5519("org.checkerframework.checker.nullness.qual.NonNull"), new C5519("edu.umd.cs.findbugs.annotations.NonNull"), new C5519("io.reactivex.annotations.NonNull"), new C5519("io.reactivex.rxjava3.annotations.NonNull"), new C5519("org.eclipse.jdt.annotation.NonNull"), new C5519("lombok.NonNull"), new C5519("jakarta.annotation.Nonnull")});
        f13856 = setM9404;
        C5519 c551913 = AbstractC5447.f13842;
        c551913.getClass();
        Set setM94042 = AbstractC5179.m9404(new C5519[]{c551913, c5519, c55195, c551910, c551911, new C5519("android.annotation.Nullable"), new C5519("androidx.annotation.Nullable"), new C5519("androidx.annotation.RecentlyNullable"), new C5519("android.support.annotation.Nullable"), new C5519("com.android.annotations.Nullable"), new C5519("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C5519("org.checkerframework.checker.nullness.qual.Nullable"), new C5519("edu.umd.cs.findbugs.annotations.Nullable"), new C5519("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C5519("edu.umd.cs.findbugs.annotations.CheckForNull"), new C5519("io.reactivex.annotations.Nullable"), new C5519("io.reactivex.rxjava3.annotations.Nullable"), new C5519("org.eclipse.jdt.annotation.Nullable"), new C5519("jakarta.annotation.Nullable"), new C5519("io.vertx.codegen.annotations.Nullable")});
        f13857 = setM94042;
        f13851 = AbstractC5179.m9404(new C5519[]{c55193, c55197});
        AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13613(AbstractC8568.m13613(new LinkedHashSet(), setM9404), setM94042), c55199), c55192), c55196), c55198);
        f13850 = AbstractC5179.m9404(new C5519[]{AbstractC5447.f13840, AbstractC5447.f13832, AbstractC5447.f13841, AbstractC5447.f13833});
        f13852 = AbstractC5179.m9404(new C5519[]{AbstractC5447.f13843, AbstractC5447.f13836});
        AbstractC5171.m9333(new Pair(AbstractC5447.f13828, AbstractC7356.f18231), new Pair(AbstractC5447.f13827, AbstractC7356.f18233), new Pair(AbstractC5447.f13826, AbstractC7356.f18238), new Pair(AbstractC5447.f13825, AbstractC7356.f18234));
        f13853 = new C5519("kotlin.annotations.jvm.UnderMigration");
    }
}
