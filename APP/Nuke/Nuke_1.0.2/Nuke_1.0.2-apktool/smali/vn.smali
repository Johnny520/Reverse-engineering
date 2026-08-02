.class public final Lvn;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lvn;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lvn;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvn;->d:Lvn;

    .line 8
    .line 9
    const v0, 0x790b0099

    .line 10
    .line 11
    .line 12
    sput v0, Lvn;->e:I

    .line 13
    .line 14
    const v0, 0x790b009a

    .line 15
    .line 16
    .line 17
    sput v0, Lvn;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->n:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lvn;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "BypassTeenMode"

    .line 24
    .line 25
    sput-object v0, Lvn;->h:Ljava/lang/String;

    .line 26
    .line 27
    sget-object v0, Lup0;->m:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v2, "com.tencent.mm:appbrand"

    .line 32
    .line 33
    invoke-static {v0, v2, v1}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput-boolean v0, Lvn;->i:Z

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string v0, "hostProcess"

    .line 41
    .line 42
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    throw v0
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvn;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    sget-boolean p0, Lvn;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 6

    .line 1
    const-string p0, "com.tencent.xweb.pinus.sdk.WebView"

    .line 2
    .line 3
    const-string v0, "com.tencent.xweb.WebView"

    .line 4
    .line 5
    const-string v1, "com.tencent.xweb.pinus.PSWebview"

    .line 6
    .line 7
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    const/4 v1, 0x3

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    aget-object v1, p0, v0

    .line 16
    .line 17
    sget-object v2, Lvn;->d:Lvn;

    .line 18
    .line 19
    :try_start_0
    invoke-static {v1}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v3, "loadUrl"

    .line 32
    .line 33
    iput-object v3, v1, Lzf1;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Lzf1;->b()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lzg1;

    .line 47
    .line 48
    iget-object v1, v1, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v3, Lw;

    .line 54
    .line 55
    const/16 v4, 0x1a

    .line 56
    .line 57
    invoke-direct {v3, v4}, Lw;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Lkg3;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct {v4, v2, v3, v5}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :catchall_0
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lvn;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lvn;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lvn;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
