.class public final LYue/ۥۡۦۣۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"
.end annotation


# direct methods
.method public static final synthetic ۥ(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LYue/ۥۡ۟۟;
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟۠(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LYue/ۥۡ۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LYue/ۥۡ۟۟;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟ۢ(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LYue/ۥۡ۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟(Ljava/util/regex/MatchResult;)LYue/ۥ۠ۥۣۨ;
    .locals 0

    invoke-static {p0}, LYue/ۥۡۦۣۤ;->ۥۣ۟۟۟(Ljava/util/regex/MatchResult;)LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(Ljava/util/regex/MatchResult;I)LYue/ۥ۠ۥۣۨ;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟ۤ(Ljava/util/regex/MatchResult;I)LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(Ljava/lang/Iterable;)I
    .locals 0

    invoke-static {p0}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟ۥ(Ljava/lang/Iterable;)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LYue/ۥۡ۟۟;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۡ۟۟۟;

    invoke-direct {p1, p0, p2}, LYue/ۥۡ۟۟۟;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۡ(I)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Enum<",
            "TT;>;:",
            "LYue/\u06e5\u06e0\u06e2\u06e1\u06e8;",
            ">(I)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Enum;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "fromInt$lambda$1"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۦ()V

    new-instance v1, LYue/ۥۡۦۣۤ$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۡۦۣۤ$ۥ;-><init>(I)V

    invoke-static {v0, v1}, LYue/ۥ۟ۥۡۨ;->ۥ۟۟ۧ(Ljava/lang/Iterable;LYue/ۥۣ۠ۡ۟;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    const-string v0, "unmodifiableSet(EnumSet.\u2026mask == it.value }\n    })"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LYue/ۥۡ۟۟;
    .locals 1

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡ۟۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۡ۟۟۟;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final ۥۣ۟۟۟(Ljava/util/regex/MatchResult;)LYue/ۥ۠ۥۣۨ;
    .locals 1

    invoke-interface {p0}, Ljava/util/regex/MatchResult;->start()I

    move-result v0

    invoke-interface {p0}, Ljava/util/regex/MatchResult;->end()I

    move-result p0

    invoke-static {v0, p0}, LYue/ۥۡۦ۟;->ۥۣ۟۠ۢ(II)LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(Ljava/util/regex/MatchResult;I)LYue/ۥ۠ۥۣۨ;
    .locals 1

    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->start(I)I

    move-result v0

    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->end(I)I

    move-result p0

    invoke-static {v0, p0}, LYue/ۥۡۦ۟;->ۥۣ۟۠ۢ(II)LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۥ(Ljava/lang/Iterable;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "LYue/\u06e5\u06e0\u06e2\u06e1\u06e8;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۢۡۨ;

    invoke-interface {v1}, LYue/ۥ۠ۢۡۨ;->getValue()I

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method
