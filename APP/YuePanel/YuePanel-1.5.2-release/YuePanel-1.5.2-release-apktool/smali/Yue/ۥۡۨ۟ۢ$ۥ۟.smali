.class public LYue/ۥۡۨ۟ۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨ۟ۢ;->ۥ۟۟۟۠(Ljava/util/concurrent/Callable;LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/util/concurrent/Callable;

.field public final synthetic ۥ۟۟۠ۤ:Landroid/os/Handler;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۡۨ۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨ۟ۢ;Ljava/util/concurrent/Callable;Landroid/os/Handler;LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۨ۟ۢ;

    iput-object p2, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/util/concurrent/Callable;

    iput-object p3, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    iput-object p4, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۨ۟ۢ$ۥ۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥۡۨ۟ۢ$ۥ۟;->ۥ۟۟۠ۤ:Landroid/os/Handler;

    new-instance v2, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;

    invoke-direct {v2, p0, v0}, LYue/ۥۡۨ۟ۢ$ۥ۟$ۥ;-><init>(LYue/ۥۡۨ۟ۢ$ۥ۟;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
