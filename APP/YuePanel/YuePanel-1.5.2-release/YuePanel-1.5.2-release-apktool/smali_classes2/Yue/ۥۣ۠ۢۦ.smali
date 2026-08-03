.class public final LYue/ۥۣ۠ۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(I)I
    .locals 1
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    if-ltz p0, :cond_0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "Index overflow has happened"

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V
    .locals 1
    .param p0    # LYue/ۥ۟۟۠ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e1;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۡ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    throw p0
.end method
