.class public final LYue/ۥۢۢۢۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "TuplesKt"
.end annotation


# direct methods
.method public static final ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(TA;TB;)",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "TA;TB;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۦ۠;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۡۦ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۣۡۦ۠;)Ljava/util/List;
    .locals 1
    .param p0    # LYue/ۥۣۡۦ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "+TT;+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۥۣۡ;->ۥ۟۟ۢ۟([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥۢۢۢ۟;)Ljava/util/List;
    .locals 2
    .param p0    # LYue/ۥۢۢۢ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e2\u06e2\u06e2\u06df<",
            "+TT;+TT;+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۢ۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۢۢۢ۟;->ۥ۟۟۟ۡ()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥۢۢۢ۟;->ۥ۟۟۟ۢ()Ljava/lang/Object;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۥۣۡ;->ۥ۟۟ۢ۟([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
