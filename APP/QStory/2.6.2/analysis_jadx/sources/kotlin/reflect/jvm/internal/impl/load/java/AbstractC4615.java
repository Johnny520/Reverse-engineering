package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p049.AbstractC6526;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4686 f13495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4686 f13496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4686 f13497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4686 f13498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4686 f13499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4686 f13500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Set f13501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Set f13502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Set f13503;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4686 f13504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4686 f13505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4686 f13506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Set f13507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Set f13508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4686 f13509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Set f13510;

    static {
        C4686 c4686 = new C4686("org.jspecify.nullness.Nullable");
        C4686 c46862 = new C4686("org.jspecify.nullness.NullMarked");
        f13500 = c46862;
        C4686 c46863 = new C4686("org.jspecify.nullness.NullnessUnspecified");
        C4686 c46864 = new C4686("org.jspecify.annotations.NonNull");
        C4686 c46865 = new C4686("org.jspecify.annotations.Nullable");
        C4686 c46866 = new C4686("org.jspecify.annotations.NullMarked");
        f13499 = c46866;
        C4686 c46867 = new C4686("org.jspecify.annotations.NullnessUnspecified");
        C4686 c46868 = new C4686("org.jspecify.annotations.NullUnmarked");
        f13498 = c46868;
        f13497 = new C4686("javax.annotation.meta.TypeQualifier");
        f13496 = new C4686("javax.annotation.meta.TypeQualifierNickname");
        f13495 = new C4686("javax.annotation.meta.TypeQualifierDefault");
        C4686 c46869 = new C4686("javax.annotation.Nonnull");
        f13506 = c46869;
        C4686 c468610 = new C4686("javax.annotation.Nullable");
        C4686 c468611 = new C4686("javax.annotation.CheckForNull");
        f13505 = new C4686("javax.annotation.ParametersAreNonnullByDefault");
        f13509 = new C4686("javax.annotation.ParametersAreNullableByDefault");
        f13510 = AbstractC4346.m8852(new C4686[]{c46869, c468611});
        C4686 c468612 = AbstractC4614.f13489;
        c468612.getClass();
        Set setM8852 = AbstractC4346.m8852(new C4686[]{c468612, c46864, new C4686("android.annotation.NonNull"), new C4686("androidx.annotation.NonNull"), new C4686("androidx.annotation.RecentlyNonNull"), new C4686("android.support.annotation.NonNull"), new C4686("com.android.annotations.NonNull"), new C4686("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C4686("org.checkerframework.checker.nullness.qual.NonNull"), new C4686("edu.umd.cs.findbugs.annotations.NonNull"), new C4686("io.reactivex.annotations.NonNull"), new C4686("io.reactivex.rxjava3.annotations.NonNull"), new C4686("org.eclipse.jdt.annotation.NonNull"), new C4686("lombok.NonNull"), new C4686("jakarta.annotation.Nonnull")});
        f13507 = setM8852;
        C4686 c468613 = AbstractC4614.f13493;
        c468613.getClass();
        Set setM88522 = AbstractC4346.m8852(new C4686[]{c468613, c4686, c46865, c468610, c468611, new C4686("android.annotation.Nullable"), new C4686("androidx.annotation.Nullable"), new C4686("androidx.annotation.RecentlyNullable"), new C4686("android.support.annotation.Nullable"), new C4686("com.android.annotations.Nullable"), new C4686("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C4686("org.checkerframework.checker.nullness.qual.Nullable"), new C4686("edu.umd.cs.findbugs.annotations.Nullable"), new C4686("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C4686("edu.umd.cs.findbugs.annotations.CheckForNull"), new C4686("io.reactivex.annotations.Nullable"), new C4686("io.reactivex.rxjava3.annotations.Nullable"), new C4686("org.eclipse.jdt.annotation.Nullable"), new C4686("jakarta.annotation.Nullable"), new C4686("io.vertx.codegen.annotations.Nullable")});
        f13508 = setM88522;
        f13502 = AbstractC4346.m8852(new C4686[]{c46863, c46867});
        AbstractC0455.m1157(AbstractC0455.m1157(AbstractC0455.m1157(AbstractC0455.m1157(AbstractC0455.m1156(AbstractC0455.m1156(new LinkedHashSet(), setM8852), setM88522), c46869), c46862), c46866), c46868);
        f13501 = AbstractC4346.m8852(new C4686[]{AbstractC4614.f13491, AbstractC4614.f13483, AbstractC4614.f13492, AbstractC4614.f13484});
        f13503 = AbstractC4346.m8852(new C4686[]{AbstractC4614.f13494, AbstractC4614.f13487});
        AbstractC4338.m8777(new Pair(AbstractC4614.f13479, AbstractC6526.f17890), new Pair(AbstractC4614.f13478, AbstractC6526.f17892), new Pair(AbstractC4614.f13477, AbstractC6526.f17897), new Pair(AbstractC4614.f13476, AbstractC6526.f17893));
        f13504 = new C4686("kotlin.annotations.jvm.UnderMigration");
    }
}
