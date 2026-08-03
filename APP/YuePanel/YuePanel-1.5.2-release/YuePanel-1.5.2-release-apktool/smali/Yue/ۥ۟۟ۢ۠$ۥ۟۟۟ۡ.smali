.class public final LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟۟ۢ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e2\u06e0<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۢ۠;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e2\u06e0<",
            "TV;>;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۢ۠;

    iput-object p2, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۢ۠;

    iget-object v0, v0, LYue/ۥ۟۟ۢ۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0}, LYue/ۥ۟۟ۢ۠;->ۥۣ۟۟۟(Lcom/google/common/util/concurrent/ListenableFuture;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥ۟۟ۢ۠;->ۥ۟۟ۡ:LYue/ۥ۟۟ۢ۠$ۥ۟;

    iget-object v2, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۢ۠;

    invoke-virtual {v1, v2, p0, v0}, LYue/ۥ۟۟ۢ۠$ۥ۟;->ۥ۟(LYue/ۥ۟۟ۢ۠;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۢ۠;

    invoke-static {v0}, LYue/ۥ۟۟ۢ۠;->ۥ۟۟۟۠(LYue/ۥ۟۟ۢ۠;)V

    :cond_1
    return-void
.end method
