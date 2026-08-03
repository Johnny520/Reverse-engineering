.class public final LYue/ۥۣ۟ۢۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥۣ۟ۢۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟(LYue/ۥۣ۟ۢۡ;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟(Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟(LYue/ۥۣ۟ۢۡ;Ljava/lang/Object;)Z
    .locals 0
    .param p0    # LYue/ۥۣ۟ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;TE;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۨۡ۠$ۥ;->ۥ۟۟(LYue/ۥۡۨۡ۠;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
