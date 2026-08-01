.class public abstract Ld;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static declared-synchronized a(ILc;)I
    .locals 4

    .line 1
    const-class v0, Ld;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, -0x1

    .line 5
    if-lez p0, :cond_1

    .line 6
    .line 7
    :try_start_0
    sget-object v2, Ld;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v2, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-boolean p0, Ld;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_0
    :try_start_1
    const-class p0, Landroid/app/Activity;

    .line 24
    .line 25
    const-string p1, "onActivityResult"

    .line 26
    .line 27
    new-instance v2, Lb;

    .line 28
    .line 29
    const/16 v3, 0x29

    .line 30
    .line 31
    invoke-direct {v2, v3}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    sput-boolean p0, Ld;->b:Z

    .line 39
    .line 40
    const-string p1, "shared Activity.onActivityResult router installed"

    .line 41
    .line 42
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return p0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    :try_start_2
    const-string p1, "activity-result"

    .line 49
    .line 50
    const-string v2, "install"

    .line 51
    .line 52
    invoke-static {p1, v2, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return v1

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    throw p0

    .line 60
    :cond_1
    monitor-exit v0

    .line 61
    return v1
.end method
