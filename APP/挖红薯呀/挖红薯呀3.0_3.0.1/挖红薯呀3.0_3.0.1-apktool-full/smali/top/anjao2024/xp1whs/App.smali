.class public final Ltop/anjao2024/xp1whs/App;
.super Landroid/app/Application;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lnf1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/anjao2024/xp1whs/App$a;,
        Ltop/anjao2024/xp1whs/App$b;
    }
.end annotation


# static fields
.field public static final d:Ltop/anjao2024/xp1whs/App$a;

.field public static final e:I

.field private static volatile f:Llf1;

.field private static final g:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ltop/anjao2024/xp1whs/App$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltop/anjao2024/xp1whs/App$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltop/anjao2024/xp1whs/App$a;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltop/anjao2024/xp1whs/App;->d:Ltop/anjao2024/xp1whs/App$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Ltop/anjao2024/xp1whs/App;->e:I

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ltop/anjao2024/xp1whs/App;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c()Llf1;
    .locals 1

    .line 1
    sget-object v0, Ltop/anjao2024/xp1whs/App;->f:Llf1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    .line 1
    sget-object v0, Ltop/anjao2024/xp1whs/App;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    return-object v0
.end method

.method private final e(Llf1;)V
    .locals 2

    .line 1
    sget-object p0, Ltop/anjao2024/xp1whs/App;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ltop/anjao2024/xp1whs/App$b;

    .line 21
    .line 22
    sget-object v1, Ltop/anjao2024/xp1whs/App;->d:Ltop/anjao2024/xp1whs/App$a;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0, p1}, Ltop/anjao2024/xp1whs/App$a;->a(Ltop/anjao2024/xp1whs/App$a;Ltop/anjao2024/xp1whs/App$b;Llf1;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Llf1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p1, Ltop/anjao2024/xp1whs/App;->f:Llf1;

    .line 5
    .line 6
    sget-object p1, Ltop/anjao2024/xp1whs/App;->f:Llf1;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ltop/anjao2024/xp1whs/App;->e(Llf1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Llf1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    sput-object p1, Ltop/anjao2024/xp1whs/App;->f:Llf1;

    .line 6
    .line 7
    sget-object p1, Ltop/anjao2024/xp1whs/App;->f:Llf1;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Ltop/anjao2024/xp1whs/App;->e(Llf1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onCreate()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Llp;->a:Llp;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Llp;->c(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lof1;->a:Ljava/util/HashSet;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sput-object p0, Lof1;->b:Ltop/anjao2024/xp1whs/App;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Llf1;

    .line 35
    .line 36
    iget-object v2, v1, Llf1;->a:Llz;

    .line 37
    .line 38
    check-cast v2, Ljz;

    .line 39
    .line 40
    iget-object v2, v2, Ljz;->a:Landroid/os/IBinder;

    .line 41
    .line 42
    new-instance v3, Lmf1;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v3, v1, v4}, Lmf1;-><init>(Llf1;I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v3, v4}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Lof1;->b:Ltop/anjao2024/xp1whs/App;

    .line 52
    .line 53
    invoke-interface {v2, v1}, Lnf1;->a(Llf1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    :try_start_2
    const-string v2, "XposedServiceHelper"

    .line 59
    .line 60
    const-string v3, "registerListener"

    .line 61
    .line 62
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    sget-object p0, Lof1;->a:Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/util/HashSet;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_1
    monitor-exit v0

    .line 77
    return-void

    .line 78
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    throw p0
.end method
