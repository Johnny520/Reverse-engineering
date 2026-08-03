.class public LYue/ۥۡۦۥ۟$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/util/concurrent/Callable;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۠ۧ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Landroid/os/Handler;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 0
    .param p1    # Landroid/os/Handler;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Callable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/concurrent/Callable;

    iput-object p3, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۠ۧ;

    iput-object p1, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥ۟۟۠ۥ:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۠ۧ;

    iget-object v2, p0, LYue/ۥۡۦۥ۟$ۥ۟۟;->ۥ۟۟۠ۥ:Landroid/os/Handler;

    new-instance v3, LYue/ۥۡۦۥ۟$ۥ۟۟$ۥ;

    invoke-direct {v3, p0, v1, v0}, LYue/ۥۡۦۥ۟$ۥ۟۟$ۥ;-><init>(LYue/ۥۡۦۥ۟$ۥ۟۟;LYue/ۥ۟ۧ۠ۧ;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
