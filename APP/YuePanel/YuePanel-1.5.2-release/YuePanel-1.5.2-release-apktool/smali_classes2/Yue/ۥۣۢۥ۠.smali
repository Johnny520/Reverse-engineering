.class public final LYue/ۥۣۢۥ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "Object must not be null"

    invoke-direct {p0, v0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs ۥ۟۟(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;)V
    .locals 1

    new-instance v0, LYue/ۥۣۢۥۡ;

    invoke-direct {v0, p0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs ۥ۟۟۟۟(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    new-instance v0, LYue/ۥۣۢۥۡ;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۥ۟۟۟۠(Z)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "Must be false"

    invoke-direct {p0, v0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۡ(ZLjava/lang/String;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۢ(Z)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "Must be true"

    invoke-direct {p0, v0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥۣ۟۟۟(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۤ([Ljava/lang/Object;)V
    .locals 1

    const-string v0, "Array must not contain any null objects"

    invoke-static {p0, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۥ([Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static ۥ۟۟۟ۥ([Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "String must not be empty"

    invoke-direct {p0, v0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "The \'%s\' parameter must not be empty."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۠(Ljava/lang/Object;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "Object must not be null"

    invoke-direct {p0, v0}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, LYue/ۥۣۢۥۡ;

    const-string v0, "The parameter \'%s\' must not be null."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LYue/ۥۣۢۥۡ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۠ۡ(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
