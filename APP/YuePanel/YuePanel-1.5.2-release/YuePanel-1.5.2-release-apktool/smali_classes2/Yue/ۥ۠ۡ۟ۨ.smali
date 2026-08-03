.class public final LYue/ۥ۠ۡ۟ۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۡ۟ۧ;
    .locals 1
    .param p0    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum<",
            "TE;>;>(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "[TE;>;)",
            "LYue/\u06e5\u06e0\u06e1\u06df\u06e7<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "entriesProvider"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۡ۠;

    invoke-interface {p0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Enum;

    invoke-direct {v0, p0}, LYue/ۥ۠ۡ۠;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method

.method public static final ۥ۟([Ljava/lang/Enum;)LYue/ۥ۠ۡ۟ۧ;
    .locals 1
    .param p0    # [Ljava/lang/Enum;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum<",
            "TE;>;>([TE;)",
            "LYue/\u06e5\u06e0\u06e1\u06df\u06e7<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۡ۠;

    invoke-direct {v0, p0}, LYue/ۥ۠ۡ۠;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method
