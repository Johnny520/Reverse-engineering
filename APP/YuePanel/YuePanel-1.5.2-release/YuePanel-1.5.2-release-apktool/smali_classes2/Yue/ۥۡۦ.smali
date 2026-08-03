.class public LYue/ۥۡۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(ZLjava/lang/Number;)V
    .locals 2
    .param p1    # Ljava/lang/Number;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "step"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step must be positive, was: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۥ۟ۡ;Ljava/lang/Object;)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "TT;>;:",
            "Ljava/lang/Iterable<",
            "+TT;>;>(TR;TT;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Comparable;

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣۣۡۥ;Ljava/lang/Object;)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "TT;>;:",
            "Ljava/lang/Iterable<",
            "+TT;>;>(TR;TT;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Comparable;

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟(DD)LYue/ۥ۟ۥ۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e0<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۥ۟;

    invoke-direct {v0, p0, p1, p2, p3}, LYue/ۥ۟ۥ۟;-><init>(DD)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(FF)LYue/ۥ۟ۥ۟۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e0<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۥ۟۟;-><init>(FF)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Comparable;Ljava/lang/Comparable;)LYue/ۥ۟ۥ۟ۡ;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۦۡۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۦۡۥ;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(DD)LYue/ۥۣۣۡۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۣۣۡ;

    invoke-direct {v0, p0, p1, p2, p3}, LYue/ۥۣۣۣۡ;-><init>(DD)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(FF)LYue/ۥۣۣۡۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۣۡۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۣۡۤ;-><init>(FF)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(Ljava/lang/Comparable;Ljava/lang/Comparable;)LYue/ۥۣۣۡۥ;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۦۡۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۦۡۤ;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object v0
.end method
