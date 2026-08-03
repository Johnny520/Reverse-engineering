.class public final LYue/ۥۣۢۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۟ۢۨ;)Z
    .locals 8
    .param p0    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v7, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v7}, LYue/ۥۣ۟ۢۨ;-><init>()V

    invoke-virtual {p0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    const-wide/16 v3, 0x40

    invoke-static {v1, v2, v3, v4}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۡ(JJ)J

    move-result-wide v5

    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v2, v7

    invoke-virtual/range {v1 .. v6}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡۡ(LYue/ۥۣ۟ۢۨ;JJ)LYue/ۥۣ۟ۢۨ;

    move p0, v0

    :goto_0
    const/16 v1, 0x10

    if-ge p0, v1, :cond_2

    invoke-virtual {v7}, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v7}, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method
