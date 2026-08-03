.class public final LYue/ۥ۟ۦۡۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۡۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥ۟ۦۡۦ;LYue/ۥ۟ۦۡۦ;)I
    .locals 2
    .param p0    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LYue/ۥ۟ۦۡۦ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۦۡۦ;)J

    move-result-wide p0

    sget-object v0, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۟ۥ(JJ)I

    move-result p0

    return p0
.end method

.method public static ۥ۟(LYue/ۥ۟ۦۡۦ;)Z
    .locals 0
    .param p0    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۣۢۡۦ$ۥ;->ۥ(LYue/ۥۣۢۡۦ;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(LYue/ۥ۟ۦۡۦ;)Z
    .locals 0
    .param p0    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۣۢۡۦ$ۥ;->ۥ۟(LYue/ۥۣۢۡۦ;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟(LYue/ۥ۟ۦۡۦ;J)LYue/ۥ۟ۦۡۦ;
    .locals 0
    .param p0    # LYue/ۥ۟ۦۡۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۥۥ(J)J

    move-result-wide p1

    invoke-interface {p0, p1, p2}, LYue/ۥ۟ۦۡۦ;->ۥ۟۟(J)LYue/ۥ۟ۦۡۦ;

    move-result-object p0

    return-object p0
.end method
