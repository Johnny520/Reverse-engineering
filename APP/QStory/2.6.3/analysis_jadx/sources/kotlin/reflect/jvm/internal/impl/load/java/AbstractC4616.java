package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p049.AbstractC6527;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4616 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 f13499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4687 f13500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4687 f13501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4687 f13502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687 f13503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f13504;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Set f13505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Set f13506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Set f13507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4687 f13508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4687 f13509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4687 f13510;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Set f13511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Set f13512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4687 f13513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Set f13514;

    static {
        C4687 c4687 = new C4687("org.jspecify.nullness.Nullable");
        C4687 c46872 = new C4687("org.jspecify.nullness.NullMarked");
        f13504 = c46872;
        C4687 c46873 = new C4687("org.jspecify.nullness.NullnessUnspecified");
        C4687 c46874 = new C4687("org.jspecify.annotations.NonNull");
        C4687 c46875 = new C4687("org.jspecify.annotations.Nullable");
        C4687 c46876 = new C4687("org.jspecify.annotations.NullMarked");
        f13503 = c46876;
        C4687 c46877 = new C4687("org.jspecify.annotations.NullnessUnspecified");
        C4687 c46878 = new C4687("org.jspecify.annotations.NullUnmarked");
        f13502 = c46878;
        f13501 = new C4687("javax.annotation.meta.TypeQualifier");
        f13500 = new C4687("javax.annotation.meta.TypeQualifierNickname");
        f13499 = new C4687("javax.annotation.meta.TypeQualifierDefault");
        C4687 c46879 = new C4687("javax.annotation.Nonnull");
        f13510 = c46879;
        C4687 c468710 = new C4687("javax.annotation.Nullable");
        C4687 c468711 = new C4687("javax.annotation.CheckForNull");
        f13509 = new C4687("javax.annotation.ParametersAreNonnullByDefault");
        f13513 = new C4687("javax.annotation.ParametersAreNullableByDefault");
        f13514 = AbstractC4347.m8845(new C4687[]{c46879, c468711});
        C4687 c468712 = AbstractC4615.f13493;
        c468712.getClass();
        Set setM8845 = AbstractC4347.m8845(new C4687[]{c468712, c46874, new C4687("android.annotation.NonNull"), new C4687("androidx.annotation.NonNull"), new C4687("androidx.annotation.RecentlyNonNull"), new C4687("android.support.annotation.NonNull"), new C4687("com.android.annotations.NonNull"), new C4687("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C4687("org.checkerframework.checker.nullness.qual.NonNull"), new C4687("edu.umd.cs.findbugs.annotations.NonNull"), new C4687("io.reactivex.annotations.NonNull"), new C4687("io.reactivex.rxjava3.annotations.NonNull"), new C4687("org.eclipse.jdt.annotation.NonNull"), new C4687("lombok.NonNull"), new C4687("jakarta.annotation.Nonnull")});
        f13511 = setM8845;
        C4687 c468713 = AbstractC4615.f13497;
        c468713.getClass();
        Set setM88452 = AbstractC4347.m8845(new C4687[]{c468713, c4687, c46875, c468710, c468711, new C4687("android.annotation.Nullable"), new C4687("androidx.annotation.Nullable"), new C4687("androidx.annotation.RecentlyNullable"), new C4687("android.support.annotation.Nullable"), new C4687("com.android.annotations.Nullable"), new C4687("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C4687("org.checkerframework.checker.nullness.qual.Nullable"), new C4687("edu.umd.cs.findbugs.annotations.Nullable"), new C4687("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C4687("edu.umd.cs.findbugs.annotations.CheckForNull"), new C4687("io.reactivex.annotations.Nullable"), new C4687("io.reactivex.rxjava3.annotations.Nullable"), new C4687("org.eclipse.jdt.annotation.Nullable"), new C4687("jakarta.annotation.Nullable"), new C4687("io.vertx.codegen.annotations.Nullable")});
        f13512 = setM88452;
        f13506 = AbstractC4347.m8845(new C4687[]{c46873, c46877});
        AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13054(AbstractC7739.m13054(new LinkedHashSet(), setM8845), setM88452), c46879), c46872), c46876), c46878);
        f13505 = AbstractC4347.m8845(new C4687[]{AbstractC4615.f13495, AbstractC4615.f13487, AbstractC4615.f13496, AbstractC4615.f13488});
        f13507 = AbstractC4347.m8845(new C4687[]{AbstractC4615.f13498, AbstractC4615.f13491});
        AbstractC4339.m8774(new Pair(AbstractC4615.f13483, AbstractC6527.f17886), new Pair(AbstractC4615.f13482, AbstractC6527.f17888), new Pair(AbstractC4615.f13481, AbstractC6527.f17893), new Pair(AbstractC4615.f13480, AbstractC6527.f17889));
        f13508 = new C4687("kotlin.annotations.jvm.UnderMigration");
    }
}
