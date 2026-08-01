.class public final Lap;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lap;

.field private static b:J = 0x0L

.field private static c:F = 0.0f

.field private static d:F = 0.0f

.field private static final e:J = 0x1f4L

.field private static final f:F = 80.0f

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lap;

    .line 2
    .line 3
    invoke-direct {v0}, Lap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lap;->a:Lap;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lap;->g:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lap;->d(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "dispatchTouchEvent"

    .line 6
    .line 7
    const-class p2, Landroid/view/MotionEvent;

    .line 8
    .line 9
    filled-new-array {p2}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    new-instance p1, Lua;

    .line 32
    .line 33
    const/16 p2, 0x8

    .line 34
    .line 35
    invoke-direct {p1, p2}, Lua;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    :catch_0
    :cond_0
    return-void
.end method

.method private static final d(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    sget-object v1, Lm00;->S:Lm00$a;

    .line 14
    .line 15
    invoke-virtual {v1}, Lm00$a;->Y()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1}, Lm00$a;->k()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast v0, Landroid/view/MotionEvent;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/4 v2, 0x1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    sget v8, Lap;->c:F

    .line 72
    .line 73
    sub-float/2addr v6, v8

    .line 74
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const/high16 v8, 0x42a00000    # 80.0f

    .line 79
    .line 80
    cmpg-float v6, v6, v8

    .line 81
    .line 82
    if-gez v6, :cond_1

    .line 83
    .line 84
    sget v6, Lap;->d:F

    .line 85
    .line 86
    sub-float/2addr v7, v6

    .line 87
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    cmpg-float v6, v6, v8

    .line 92
    .line 93
    if-gez v6, :cond_1

    .line 94
    .line 95
    move v3, v2

    .line 96
    :cond_1
    sget-wide v6, Lap;->b:J

    .line 97
    .line 98
    const-wide/16 v8, 0x0

    .line 99
    .line 100
    cmp-long v10, v6, v8

    .line 101
    .line 102
    if-lez v10, :cond_2

    .line 103
    .line 104
    sub-long/2addr v4, v6

    .line 105
    const-wide/16 v6, 0x1f4

    .line 106
    .line 107
    cmp-long v4, v4, v6

    .line 108
    .line 109
    if-gez v4, :cond_2

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_2
    sput-wide v8, Lap;->b:J

    .line 117
    .line 118
    :cond_3
    if-ne v1, v2, :cond_4

    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    sput-wide v1, Lap;->b:J

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    sput v1, Lap;->c:F

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    sput v0, Lap;->d:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    :catch_0
    :cond_4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "com.xingin.matrix.notedetail.NoteDetailActivity"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lap;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "com.xingin.matrix.detail.activity.DetailFeedActivity"

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Lap;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
