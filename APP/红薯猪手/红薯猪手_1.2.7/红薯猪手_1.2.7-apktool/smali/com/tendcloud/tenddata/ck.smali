.class public final Lcom/tendcloud/tenddata/ck;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ck$a;
    }
.end annotation


# static fields
.field private static volatile c:Lcom/tendcloud/tenddata/ck;


# instance fields
.field public a:Landroid/content/ServiceConnection;

.field private final b:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/tendcloud/tenddata/ck;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ck;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/ck;->c:Lcom/tendcloud/tenddata/ck;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/ck;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v0, Lcom/tendcloud/tenddata/ck$1;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/ck$1;-><init>(Lcom/tendcloud/tenddata/ck;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/ck;->a:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/ck;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    iget-object p0, p0, Lcom/tendcloud/tenddata/ck;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/bx;->g()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "com.samsung.android.deviceidservice"

    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.samsung.android.deviceidservice"

    const-string v2, "com.samsung.android.deviceidservice.DeviceIdService"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/tendcloud/tenddata/ck;->a:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ck;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    new-instance v1, Lcom/tendcloud/tenddata/ck$a;

    invoke-direct {v1, v0}, Lcom/tendcloud/tenddata/ck$a;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ck$a;->getOAID()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/df;->setOAID(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ck;->a:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_0
    return-void
.end method

.method public static bindSECServiceGetOAID(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/ck;->c:Lcom/tendcloud/tenddata/ck;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;)V

    return-void
.end method
