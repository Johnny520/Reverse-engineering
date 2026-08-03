.class public final LYue/ۥۣ۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۧ$ۥ۟;,
        LYue/ۥۣ۟ۧ$ۥ;,
        LYue/ۥۣ۟ۧ$ۥ۟۟۟;,
        LYue/ۥۣ۟ۧ$ۥ۟۟;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥۣ۟ۧ$ۥ۟۟;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .param p0    # LYue/ۥۣ۟ۧ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e3\u06e7$\u06e5\u06df\u06df<",
            "TT;>;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۧ$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۟ۧ$ۥ;-><init>()V

    new-instance v1, LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    invoke-direct {v1, v0}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;-><init>(LYue/ۥۣ۟ۧ$ۥ;)V

    iput-object v1, v0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, LYue/ۥۣ۟ۧ$ۥ۟۟;->ۥ(LYue/ۥۣ۟ۧ$ۥ;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    iput-object p0, v0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {v1, p0}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-object v1
.end method
