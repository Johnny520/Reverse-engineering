.class public final LYue/ۥۡۦۦ۟;
.super LYue/ۥ۟۟ۢ۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e2\u06e0<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۢ۠;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۠ۤ()LYue/ۥۡۦۦ۟;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06df<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۦۦ۟;

    invoke-direct {v0}, LYue/ۥۡۦۦ۟;-><init>()V

    return-object v0
.end method


# virtual methods
.method public ۥ۟۟۠۟(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠۠(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠۠(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۡ(Lcom/google/common/util/concurrent/ListenableFuture;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TV;>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۠ۡ(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    move-result p1

    return p1
.end method
