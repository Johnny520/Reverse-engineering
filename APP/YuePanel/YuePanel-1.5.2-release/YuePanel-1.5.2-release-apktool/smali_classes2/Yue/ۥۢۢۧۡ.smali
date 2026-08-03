.class public final LYue/ۥۢۢۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(ILYue/ۥۣ۠ۡ۟;)[J
    .locals 4
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
            ">;)[J"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v0, p0, [J

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۧ۟;

    invoke-virtual {v2}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟([J)[J

    move-result-object p0

    return-object p0
.end method

.method public static final varargs ۥ۟([J)[J
    .locals 1
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
