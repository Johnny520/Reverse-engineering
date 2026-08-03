.class public final LYue/ۥۣۢۡۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥۣۢۡۦ;)Z
    .locals 2
    .param p0    # LYue/ۥۣۢۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥۣۢۡۦ;->ۥ۟۟۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۧ(J)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(LYue/ۥۣۢۡۦ;)Z
    .locals 2
    .param p0    # LYue/ۥۣۢۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥۣۢۡۦ;->ۥ۟۟۟()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥۣ۟۟ۧ(J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۥ۟۟(LYue/ۥۣۢۡۦ;J)LYue/ۥۣۢۡۦ;
    .locals 0
    .param p0    # LYue/ۥۣۢۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۥ(J)J

    move-result-wide p1

    invoke-interface {p0, p1, p2}, LYue/ۥۣۢۡۦ;->ۥ۟۟(J)LYue/ۥۣۢۡۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(LYue/ۥۣۢۡۦ;J)LYue/ۥۣۢۡۦ;
    .locals 2
    .param p0    # LYue/ۥۣۢۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟۠ۢ۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LYue/ۥ۟۠ۢ۟;-><init>(LYue/ۥۣۢۡۦ;JLYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method
