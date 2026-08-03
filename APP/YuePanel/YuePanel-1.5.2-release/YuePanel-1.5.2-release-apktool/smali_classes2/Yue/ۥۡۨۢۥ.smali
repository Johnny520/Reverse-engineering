.class public LYue/ۥۡۨۢۥ;
.super LYue/ۥۡۨۢۤ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۨۢۤ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۠ۤ(LYue/ۥۡۨۢ;Ljava/lang/Class;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "klass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۥ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۡۨۢۥ$ۥ;-><init>(Ljava/lang/Class;)V

    invoke-static {p0, v0}, LYue/ۥۡۨۢۦ;->ۥ۟۟ۤۧ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟۟۠ۥ(LYue/ۥۡۨۢ;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;
    .locals 2
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/util/Collection<",
            "-TR;>;R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "*>;TC;",
            "Ljava/lang/Class<",
            "TR;>;)TC;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "klass"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public static final synthetic ۥ۟۟۠ۦ(LYue/ۥۡۨۢ;)Ljava/lang/Comparable;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use maxOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.maxOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۠۠ۥ(LYue/ۥۡۨۢ;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠ۧ(LYue/ۥۡۨۢ;)Ljava/lang/Double;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use maxOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.maxOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۠۠ۦ(LYue/ۥۡۨۢ;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠ۨ(LYue/ۥۡۨۢ;)Ljava/lang/Float;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use maxOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.maxOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۠۠ۧ(LYue/ۥۡۨۢ;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 5
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use maxByOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.maxByOrNull(selector)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "Ljava/lang/Comparable<",
            "-TR;>;>(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TR;>;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selector"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    move-object p0, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    invoke-interface {v1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_3

    move-object v0, v2

    move-object v1, v3

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :goto_1
    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡ۟(LYue/ۥۡۨۢ;Ljava/util/Comparator;)Ljava/lang/Object;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use maxWithOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.maxWithOrNull(comparator)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۡ۠(LYue/ۥۡۨۢ;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡ۠(LYue/ۥۡۨۢ;)Ljava/lang/Comparable;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use minOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.minOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۢۡ(LYue/ۥۡۨۢ;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡۡ(LYue/ۥۡۨۢ;)Ljava/lang/Double;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use minOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.minOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۢۢ(LYue/ۥۡۨۢ;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡۢ(LYue/ۥۡۨۢ;)Ljava/lang/Float;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use minOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.minOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۢۦ;->ۥۣ۟۠ۢ(LYue/ۥۡۨۢ;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥۣ۟۟ۡ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 5
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use minByOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.minByOrNull(selector)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "Ljava/lang/Comparable<",
            "-TR;>;>(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TR;>;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selector"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    move-object p0, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    invoke-interface {v1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_3

    move-object v0, v2

    move-object v1, v3

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :goto_1
    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡۤ(LYue/ۥۡۨۢ;Ljava/util/Comparator;)Ljava/lang/Object;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use minWithOrNull instead."
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "this.minWithOrNull(comparator)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.5"
        hiddenSince = "1.6"
        warningSince = "1.4"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۢۧ(LYue/ۥۡۨۢ;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۥ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)Ljava/math/BigDecimal;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfBigDecimal"
    .end annotation

    .annotation build LYue/ۥۣۡۥ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+",
            "Ljava/math/BigDecimal;",
            ">;)",
            "Ljava/math/BigDecimal;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selector"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    const-string v1, "valueOf(this.toLong())"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigDecimal;

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    const-string v1, "this.add(other)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟ۡۦ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)Ljava/math/BigInteger;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfBigInteger"
    .end annotation

    .annotation build LYue/ۥۣۡۥ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+",
            "Ljava/math/BigInteger;",
            ">;)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selector"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    const-string v1, "valueOf(this.toLong())"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    const-string v1, "this.add(other)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟ۡۧ(LYue/ۥۡۨۢ;)Ljava/util/SortedSet;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;)",
            "Ljava/util/SortedSet<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-static {p0, v0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۧۤ(LYue/ۥۡۨۢ;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/SortedSet;

    return-object p0
.end method

.method public static final ۥ۟۟ۡۨ(LYue/ۥۡۨۢ;Ljava/util/Comparator;)Ljava/util/SortedSet;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/Comparator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ljava/util/SortedSet<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparator"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    invoke-static {p0, v0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۧۤ(LYue/ۥۡۨۢ;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/SortedSet;

    return-object p0
.end method
