.class public final Lqf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic a:LRn;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer;LRn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lqf;->a:LRn;

    return-void
.end method


# virtual methods
.method public final onResume(LYn;)V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, LYa;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lsf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsf;-><init>(I)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object p1, p0, Lqf;->a:LRn;

    invoke-virtual {p1, p0}, LRn;->b(LXn;)V

    return-void
.end method
