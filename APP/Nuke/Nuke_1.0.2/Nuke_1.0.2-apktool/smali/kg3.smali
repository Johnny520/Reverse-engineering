.class public final Lkg3;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:Lvj;

.field public final synthetic b:Lin0;

.field public final synthetic c:Lin0;


# direct methods
.method public constructor <init>(Lvj;Lin0;Lin0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkg3;->a:Lvj;

    .line 2
    .line 3
    iput-object p2, p0, Lkg3;->b:Lin0;

    .line 4
    .line 5
    iput-object p3, p0, Lkg3;->c:Lin0;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkg3;->a:Lvj;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lst0;->b(Lvj;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    iget-object p0, p0, Lkg3;->c:Lin0;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    new-instance v1, Ljg3;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ljg3;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :goto_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object p1, Lpp1;->a:Lpp1;

    .line 34
    .line 35
    const-string p1, "after_callback"

    .line 36
    .line 37
    const-string v1, "After hook callback failed"

    .line 38
    .line 39
    invoke-static {v0, p1, p0, v1}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    throw p0
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkg3;->a:Lvj;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lst0;->b(Lvj;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    iget-object p0, p0, Lkg3;->b:Lin0;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    new-instance v1, Ljg3;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ljg3;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :goto_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object p1, Lpp1;->a:Lpp1;

    .line 34
    .line 35
    const-string p1, "before_callback"

    .line 36
    .line 37
    const-string v1, "Before hook callback failed"

    .line 38
    .line 39
    invoke-static {v0, p1, p0, v1}, Lpp1;->h(Lvj;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    throw p0
.end method
