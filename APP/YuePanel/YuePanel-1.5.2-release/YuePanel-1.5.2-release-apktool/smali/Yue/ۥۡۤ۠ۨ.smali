.class public final LYue/ۥۡۤ۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)LYue/ۥۡۤ۠ۧ;
    .locals 1
    .param p0    # LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "mediaType"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۤ۠ۧ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۤ۠ۧ$ۥ;-><init>()V

    invoke-virtual {v0, p0}, LYue/ۥۡۤ۠ۧ$ۥ;->ۥ۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)LYue/ۥۡۤ۠ۧ$ۥ;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۤ۠ۧ$ۥ;->ۥ()LYue/ۥۡۤ۠ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;ILjava/lang/Object;)LYue/ۥۡۤ۠ۧ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟;

    :cond_0
    invoke-static {p0}, LYue/ۥۡۤ۠ۨ;->ۥ(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)LYue/ۥۡۤ۠ۧ;

    move-result-object p0

    return-object p0
.end method
