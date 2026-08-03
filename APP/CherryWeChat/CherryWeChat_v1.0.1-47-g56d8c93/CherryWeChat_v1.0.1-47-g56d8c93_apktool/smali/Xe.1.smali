.class public abstract LXe;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LYe;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYe;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, LYe;->c:Ljava/lang/Boolean;

    sput-object v0, LXe;->a:LYe;

    return-void
.end method
