.class public Lcom/tendcloud/tenddata/bz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bz$a;
    }
.end annotation


# static fields
.field private static volatile b:Lcom/tendcloud/tenddata/bz;


# instance fields
.field private final a:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/ServiceConnection;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/bz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bz;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/bz;->b:Lcom/tendcloud/tenddata/bz;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v0, Lcom/tendcloud/tenddata/bz$1;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/bz$1;-><init>(Lcom/tendcloud/tenddata/bz;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/bz;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    iget-object p0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    const/4 p0, 0x0

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bx;->j()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x1

    :catchall_0
    return p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.asus.msa.action.ACCESS_DID"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.asus.msa.SupplementaryDID"

    const-string v3, "com.asus.msa.SupplementaryDID.SupplementaryDIDService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/bz;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    new-instance v1, Lcom/tendcloud/tenddata/bz$a;

    invoke-direct {v1, v0}, Lcom/tendcloud/tenddata/bz$a;-><init>(Landroid/os/IBinder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/bz$a;->getOAID()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/df;->setOAID(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/bz;->c:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_0
    return-void
.end method

.method public static bindASUSServiceGetOAID(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/bz;->b:Lcom/tendcloud/tenddata/bz;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/bz;->b(Landroid/content/Context;)V

    return-void
.end method
