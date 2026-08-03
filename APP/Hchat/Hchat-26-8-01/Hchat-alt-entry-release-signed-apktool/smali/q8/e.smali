.class public final Lq8/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Lq8/h;


# direct methods
.method public constructor <init>(Lq8/h;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq8/e;->d:Lq8/h;

    .line 2
    .line 3
    iput-object p2, p0, Lq8/e;->a:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Lq8/e;->b:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Lq8/e;->c:Ljava/lang/Class;

    .line 8
    .line 9
    const/16 p1, 0x2710

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lq8/e;->d:Lq8/h;

    .line 6
    .line 7
    iget-object v2, p0, Lq8/e;->a:Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v1, v0, v3, v2}, Lq8/h;->g(Lq8/h;Ljava/lang/Object;ILjava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lq8/e;->d:Lq8/h;

    .line 15
    .line 16
    iget-object v3, p0, Lq8/e;->b:Ljava/lang/Class;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-static {v2, v0, v4, v3}, Lq8/h;->g(Lq8/h;Ljava/lang/Object;ILjava/lang/Class;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v2, p0, Lq8/e;->c:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v2, p0, Lq8/e;->d:Lq8/h;

    .line 29
    .line 30
    iput-object v1, v2, Lq8/h;->h:Ljava/lang/Class;

    .line 31
    .line 32
    iget-object v2, p0, Lq8/e;->d:Lq8/h;

    .line 33
    .line 34
    iput-object v0, v2, Lq8/h;->i:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lq8/e;->d:Lq8/h;

    .line 40
    .line 41
    iget-object v2, p0, Lq8/e;->c:Ljava/lang/Class;

    .line 42
    .line 43
    iget-object v0, v0, Lq8/h;->c:Le8/c;

    .line 44
    .line 45
    iget-object v0, v0, Le8/c;->m:Ljava/lang/Class;

    .line 46
    .line 47
    const-class v3, Ljava/lang/Class;

    .line 48
    .line 49
    filled-new-array {v3, v3}, [Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v1, "[Hchat:SettingsInjector] [Modern] SettingLocation \u6784\u9020\u5931\u8d25: "

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0, p1}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
