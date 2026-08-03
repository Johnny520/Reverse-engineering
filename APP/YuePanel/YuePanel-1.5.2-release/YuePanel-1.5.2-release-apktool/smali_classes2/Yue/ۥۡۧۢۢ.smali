.class public final LYue/ۥۡۧۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۡۧۢ۠;LYue/ۥ۟ۧۦۥ;)V
    .locals 3
    .param p0    # LYue/ۥۡۧۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "checkContext"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e0<",
            "*>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LYue/ۥۡۧۢۢ$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۡۧۢۢ$ۥ;-><init>(LYue/ۥۡۧۢ۠;)V

    invoke-interface {p1, v0, v1}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۥ:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LYue/ۥۡۧۢ۠;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ",\n\t\tbut emission happened in "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    :goto_0
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    instance-of v0, p0, LYue/ۥۡۧۥ;

    if-nez v0, :cond_2

    return-object p0

    :cond_2
    check-cast p0, LYue/ۥۡۧۥ;

    invoke-virtual {p0}, LYue/ۥۡۧۥ;->ۥ۟۠۠ۡ()LYue/ۥ۠ۦ۟ۡ;

    move-result-object p0

    goto :goto_0
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۢۢ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۧۢۢ$ۥ۟;-><init>(LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method
