.class Lcom/tendcloud/tenddata/cc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/cc$b;,
        Lcom/tendcloud/tenddata/cc$a;
    }
.end annotation


# instance fields
.field public a:Lcom/tendcloud/tenddata/cb$a;

.field public b:Ljava/util/concurrent/CountDownLatch;

.field public c:Lcom/tendcloud/tenddata/cc$b;

.field public d:Lcom/tendcloud/tenddata/cc$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/cc;->b:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Lcom/tendcloud/tenddata/cc$b;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/cc$b;-><init>(Lcom/tendcloud/tenddata/cc;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/cc;->c:Lcom/tendcloud/tenddata/cc$b;

    new-instance v0, Lcom/tendcloud/tenddata/cc$a;

    invoke-direct {v0, p0}, Lcom/tendcloud/tenddata/cc$a;-><init>(Lcom/tendcloud/tenddata/cc;)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/cc;->d:Lcom/tendcloud/tenddata/cc$a;

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    const-string p1, "SSSS-AdvertisingIdPlatform"

    .line 2
    .line 3
    const-string v0, "onServiceConnected "

    .line 4
    .line 5
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/tendcloud/tenddata/cb$a;

    .line 13
    .line 14
    invoke-direct {p1}, Lcom/tendcloud/tenddata/cb$a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/tendcloud/tenddata/cc;->a:Lcom/tendcloud/tenddata/cb$a;

    .line 18
    .line 19
    const-string p1, "SSSS"

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    const-string p2, "service connected but service is null"

    .line 24
    .line 25
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string v0, "service connected and do get"

    .line 34
    .line 35
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "com.hihonor.cloudservice.oaid.IOAIDService"

    .line 43
    .line 44
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-string v0, "local interface is null"

    .line 51
    .line 52
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v1, 0x2

    .line 61
    new-array v1, v1, [Ljava/lang/String;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    aput-object p1, v1, v2

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    const-string v2, "local interface class:"

    .line 68
    .line 69
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    aput-object v0, v1, p1

    .line 89
    .line 90
    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    new-instance p1, Lcom/tendcloud/tenddata/ch$a$a;

    .line 94
    .line 95
    invoke-direct {p1, p2}, Lcom/tendcloud/tenddata/ch$a$a;-><init>(Landroid/os/IBinder;)V

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, Lcom/tendcloud/tenddata/cc;->d:Lcom/tendcloud/tenddata/cc$a;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lcom/tendcloud/tenddata/ch$a$a;->a(Lcom/tendcloud/tenddata/by;)V

    .line 101
    .line 102
    .line 103
    iget-object p2, p0, Lcom/tendcloud/tenddata/cc;->c:Lcom/tendcloud/tenddata/cc$b;

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Lcom/tendcloud/tenddata/ch$a$a;->b(Lcom/tendcloud/tenddata/by;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "AdvertisingIdPlatform"

    const-string v0, "onServiceDisconnected "

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tendcloud/tenddata/cc;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object p1, p0, Lcom/tendcloud/tenddata/cc;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final unbind(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "AdvertisingIdPlatform"

    .line 2
    .line 3
    const-string v1, "disconnect"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    const/4 v1, 0x2

    .line 18
    new-array v1, v1, [Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    const-string v2, "OAIDClientImpl#disconnect#Disconnect error::"

    .line 25
    .line 26
    invoke-static {v2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    aput-object p1, v1, v0

    .line 42
    .line 43
    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void
.end method
