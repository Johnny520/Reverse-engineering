.class public LYue/ۥ۠ۧ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۧ۟ۡ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;
    .locals 3
    .param p0    # LYue/ۥۣ۠۠ۨ;
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
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠ۦۧ;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, LYue/ۥۢ۠ۦۧ;-><init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;ILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static ۥ۟(LYue/ۥ۠ۧ۟ۤ;LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;
    .locals 2
    .param p0    # LYue/ۥ۠ۧ۟ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
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
            "LYue/\u06e5\u06e0\u06e7\u06df\u06e4;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۧ۟ۡ$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, LYue/ۥۣۢ۠ۧ;

    invoke-direct {p0, p1}, LYue/ۥۣۢ۠ۧ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥۣۣۡۢ;

    invoke-direct {p0}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p0

    :cond_1
    new-instance p0, LYue/ۥۡۧۢۦ;

    invoke-direct {p0, p1}, LYue/ۥۡۧۢۦ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    goto :goto_0

    :cond_2
    new-instance p0, LYue/ۥۢ۠ۦۧ;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v0}, LYue/ۥۢ۠ۦۧ;-><init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;ILYue/ۥ۟ۨۥۢ;)V

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
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
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)",
            "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢ۠ۦۧ;

    invoke-direct {v0, p1, p0}, LYue/ۥۢ۠ۦۧ;-><init>(LYue/ۥۣ۠۠ۨ;Ljava/lang/Object;)V

    return-object v0
.end method
