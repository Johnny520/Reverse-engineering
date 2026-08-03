.class public final LYue/ۥ۟۠۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥ۟۠۟;)V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۡۡ$ۥ;->ۥ(LYue/ۥۡۦۡۡ;)V

    return-void
.end method

.method public static ۥ۟(LYue/ۥ۟۠۟;)LYue/ۥۡۧۨۧ;
    .locals 0
    .param p0    # LYue/ۥ۟۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e0\u06df<",
            "TE;>;)",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟۟۟(LYue/ۥۡۦۡۡ;)LYue/ۥۡۧۨۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(LYue/ۥ۟۠۟;)Ljava/lang/Object;
    .locals 0
    .param p0    # LYue/ۥ۟۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "tryReceive().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e0\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥۡۦۡۡ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(LYue/ۥ۟۠۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # LYue/ۥ۟۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "receiveCatching().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۣ۠ۨۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e0\u06df<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۦۡۡ$ۥ;->ۥۣ۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
