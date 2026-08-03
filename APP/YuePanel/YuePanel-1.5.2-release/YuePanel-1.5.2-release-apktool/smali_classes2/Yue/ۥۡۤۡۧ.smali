.class public final LYue/ۥۡۤۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۡۥۨۤ;)Ljava/util/Random;
    .locals 1
    .param p0    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LYue/ۥ۟۟ۢ۟;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥ۟۟ۢ۟;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۟۟ۢ۟;->ۥ۟۟۠ۡ()Ljava/util/Random;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LYue/ۥ۠ۦۧۦ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۦۧۦ;-><init>(LYue/ۥۡۥۨۤ;)V

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟(Ljava/util/Random;)LYue/ۥۡۥۨۤ;
    .locals 1
    .param p0    # Ljava/util/Random;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LYue/ۥ۠ۦۧۦ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LYue/ۥ۠ۦۧۦ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۠ۦۧۦ;->ۥ()LYue/ۥۡۥۨۤ;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LYue/ۥۡۤۡۦ;

    invoke-direct {v0, p0}, LYue/ۥۡۤۡۦ;-><init>(Ljava/util/Random;)V

    :cond_2
    return-object v0
.end method

.method public static final ۥ۟۟()LYue/ۥۡۥۨۤ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    sget-object v0, LYue/ۥۡۤۡۥ;->ۥ:LYue/ۥۡۤۡۤ;

    invoke-virtual {v0}, LYue/ۥۡۤۡۤ;->ۥ۟()LYue/ۥۡۥۨۤ;

    move-result-object v0

    return-object v0
.end method

.method public static final ۥ۟۟۟(II)D
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x1b

    shl-long/2addr v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    long-to-double p0, v0

    const-wide/high16 v0, 0x4340000000000000L    # 9.007199254740992E15

    div-double/2addr p0, v0

    return-wide p0
.end method
