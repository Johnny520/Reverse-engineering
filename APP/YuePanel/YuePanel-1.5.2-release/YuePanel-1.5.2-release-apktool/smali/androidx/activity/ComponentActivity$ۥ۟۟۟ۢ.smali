.class public Landroidx/activity/ComponentActivity$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/ComponentActivity$ۥ۟۟۟۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/ComponentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity$ۥ۟۟۟ۢ;->ۥ()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Landroidx/activity/ComponentActivity$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Landroidx/activity/ComponentActivity$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۥ()Landroid/os/Handler;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :cond_0
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v1
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۤۦ(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method
