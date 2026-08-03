.class public interface abstract LYue/ۥۡۤۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UnknownNullness"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static isEqual(Ljava/lang/Object;)LYue/ۥۡۤۧۧ;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "MissingNullability"
            }
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingNullability"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, LYue/ۥۣۡۤۧ;

    invoke-direct {p0}, LYue/ۥۣۡۤۧ;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۤۧۤ;

    invoke-direct {v0, p0}, LYue/ۥۡۤۧۤ;-><init>(Ljava/lang/Object;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static synthetic ۥ(LYue/ۥۡۤۧۧ;LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, LYue/ۥۡۤۧۧ;->ۥ۟۟۟ۡ(LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Ljava/util/Objects;->isNull(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۡۤۧۧ;->ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۠(LYue/ۥۡۤۧۧ;)LYue/ۥۡۤۧۧ;
    .locals 0
    .param p0    # LYue/ۥۡۤۧۧ;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "MissingNullability"
            }
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingNullability"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "-TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, LYue/ۥۡۤۧۧ;->negate()LYue/ۥۡۤۧۧ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟۟(LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, LYue/ۥۡۤۧۧ;->ۥ۟۟۟(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۥ(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, LYue/ۥۡۤۧۧ;->ۥ۟(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۧ(LYue/ۥۡۤۧۧ;LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, LYue/ۥۡۤۧۧ;->ۥ۟۟۟ۦ(LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public negate()LYue/ۥۡۤۧۧ;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingNullability"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۤۧۦ;

    invoke-direct {v0, p0}, LYue/ۥۡۤۧۦ;-><init>(LYue/ۥۡۤۧۧ;)V

    return-object v0
.end method

.method public abstract test(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method

.method public ۥ۟۟(LYue/ۥۡۤۧۧ;)LYue/ۥۡۤۧۧ;
    .locals 1
    .param p1    # LYue/ۥۡۤۧۧ;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "MissingNullability"
            }
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingNullability"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "-TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LYue/ۥۡۤۧۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۤۧۢ;-><init>(LYue/ۥۡۤۧۧ;LYue/ۥۡۤۧۧ;)V

    return-object v0
.end method

.method public synthetic ۥ۟۟۟(Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, LYue/ۥۡۤۧۧ;->test(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public synthetic ۥ۟۟۟ۡ(LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z
    .locals 1

    invoke-interface {p0, p2}, LYue/ۥۡۤۧۧ;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, LYue/ۥۡۤۧۧ;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۡۤۧۧ;)LYue/ۥۡۤۧۧ;
    .locals 1
    .param p1    # LYue/ۥۡۤۧۧ;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "MissingNullability"
            }
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingNullability"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "-TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e7\u06e7<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LYue/ۥۡۤۧۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۤۧۥ;-><init>(LYue/ۥۡۤۧۧ;LYue/ۥۡۤۧۧ;)V

    return-object v0
.end method

.method public synthetic ۥ۟۟۟ۦ(LYue/ۥۡۤۧۧ;Ljava/lang/Object;)Z
    .locals 1

    invoke-interface {p0, p2}, LYue/ۥۡۤۧۧ;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, LYue/ۥۡۤۧۧ;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
