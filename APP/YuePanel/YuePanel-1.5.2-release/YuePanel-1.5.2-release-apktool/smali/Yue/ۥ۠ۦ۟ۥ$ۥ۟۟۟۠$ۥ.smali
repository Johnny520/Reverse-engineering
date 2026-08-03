.class public final LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/app/job/JobWorkItem;

.field public final synthetic ۥ۟:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;Landroid/app/job/JobWorkItem;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ۟:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ:Landroid/app/job/JobWorkItem;

    return-void
.end method


# virtual methods
.method public complete()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ۟:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;

    iget-object v0, v0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;->ۥ۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ۟:LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;

    iget-object v1, v1, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠;->ۥ۟۟:Landroid/app/job/JobParameters;

    if-eqz v1, :cond_0

    iget-object v2, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ:Landroid/app/job/JobWorkItem;

    invoke-virtual {v1, v2}, Landroid/app/job/JobParameters;->completeWork(Landroid/app/job/JobWorkItem;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ;->ۥ:Landroid/app/job/JobWorkItem;

    invoke-virtual {v0}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
