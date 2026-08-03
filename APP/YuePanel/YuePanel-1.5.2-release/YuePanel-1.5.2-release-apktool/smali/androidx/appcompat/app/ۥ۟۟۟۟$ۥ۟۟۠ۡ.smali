.class public abstract Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation build LYue/ۥۢۥ۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "\u06e5\u06df\u06df\u06e0\u06e1"
.end annotation


# instance fields
.field public ۥ:Landroid/content/BroadcastReceiver;

.field public final synthetic ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v1, v1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۢۤ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    :cond_0
    return-void
.end method

.method public abstract ۥ۟()Landroid/content/IntentFilter;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟()I
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract ۥ۟۟۟۟()V
.end method

.method public ۥ۟۟۟۠()V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ()V

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ۟()Landroid/content/IntentFilter;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_1

    new-instance v1, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ$ۥ;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;)V

    iput-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    :cond_1
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ۟:Landroidx/appcompat/app/ۥ۟۟۟۟;

    iget-object v1, v1, Landroidx/appcompat/app/ۥ۟۟۟۟;->ۥ۟۟ۢۤ:Landroid/content/Context;

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠ۡ;->ۥ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_2
    :goto_0
    return-void
.end method
