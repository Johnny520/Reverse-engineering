.class public final LYue/ۥۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۡۨۨۨ$ۥ;JJ)LYue/ۥۡۨۨۨ;
    .locals 0
    .param p0    # LYue/ۥۡۨۨۨ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance p0, LYue/ۥۢ۟ۨۨ;

    invoke-static {p1, p2}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۢ۠(J)J

    move-result-wide p1

    invoke-static {p3, p4}, LYue/ۥ۠۠ۢۥ;->ۥ۟۟ۢ۠(J)J

    move-result-wide p3

    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥۢ۟ۨۨ;-><init>(JJ)V

    return-object p0
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۨۨۨ$ۥ;JJILjava/lang/Object;)LYue/ۥۡۨۨۨ;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥۣ۟۟۟()J

    move-result-wide p1

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    sget-object p3, LYue/ۥ۠۠ۢۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۠ۢۥ$ۥ;

    invoke-virtual {p3}, LYue/ۥ۠۠ۢۥ$ۥ;->ۥ۟۟۠۠()J

    move-result-wide p3

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۢ;->ۥ(LYue/ۥۡۨۨۨ$ۥ;JJ)LYue/ۥۡۨۨۨ;

    move-result-object p0

    return-object p0
.end method
