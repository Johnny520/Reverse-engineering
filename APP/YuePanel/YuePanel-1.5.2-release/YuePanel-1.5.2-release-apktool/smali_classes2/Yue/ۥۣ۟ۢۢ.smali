.class public final LYue/ۥۣ۟ۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(I)LYue/ۥۣ۟ۢۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, -0x2

    if-eq p0, v0, :cond_3

    const/4 v0, -0x1

    if-eq p0, v0, :cond_2

    if-eqz p0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۦۨ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۦۨ;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported UNLIMITED capacity for BroadcastChannel"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported 0 capacity for BroadcastChannel"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, LYue/ۥ۟ۦۧۡ;

    invoke-direct {v0}, LYue/ۥ۟ۦۧۡ;-><init>()V

    goto :goto_0

    :cond_3
    new-instance v0, LYue/ۥ۟ۡۦۨ;

    sget-object p0, LYue/ۥ۟ۤ۠ۨ;->ۥ۟:LYue/ۥ۟ۤ۠ۨ$ۥ۟;

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠ۨ$ۥ۟;->ۥ()I

    move-result p0

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۦۨ;-><init>(I)V

    :goto_0
    return-object v0
.end method
