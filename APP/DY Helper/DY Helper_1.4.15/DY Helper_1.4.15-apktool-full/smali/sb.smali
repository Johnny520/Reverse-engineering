.class public final Lsb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Α:Ljava/util/Map;

.field public static final Β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final Γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final α:Lsb;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static volatile ε:Z

.field public static volatile ζ:Z

.field public static final η:Ljava/util/Set;

.field public static final θ:Ljava/util/Set;

.field public static volatile ι:Z

.field public static volatile κ:Z

.field public static volatile λ:Ljava/lang/ClassLoader;

.field public static volatile μ:Lcom/example/dyhelper/MainHook;

.field public static volatile ν:Z

.field public static volatile ξ:Z

.field public static volatile ο:Z

.field public static volatile π:Z

.field public static volatile ρ:Z

.field public static volatile σ:Z

.field public static volatile τ:I

.field public static volatile υ:I

.field public static volatile φ:I

.field public static final χ:Landroid/os/Handler;

.field public static ψ:Ljava/lang/ref/WeakReference;

.field public static final ω:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lsb;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsb;->α:Lsb;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lsb;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lsb;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 19
    .line 20
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lsb;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D68E259722F51C3EC086C9236A937084C06950"

    .line 27
    .line 28
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "com.p771ss.android.ugc.aweme.feed.p1043ui.bottom.BottomSpace"

    .line 33
    .line 34
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lsb;->η:Ljava/util/Set;

    .line 43
    .line 44
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A8F6A1C3389074335160687955403BE9F1FF8D9DFF8B0C721F258E0C89091A072226B"

    .line 45
    .line 46
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11191155A1E04541A2C6D7589F3BA263618D5C9E9631DAED24084C05EC0FA5AEEE60D19DF7E8BEB7B8F8F59915"

    .line 51
    .line 52
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lsb;->θ:Ljava/util/Set;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    sput-boolean v0, Lsb;->π:Z

    .line 68
    .line 69
    const/16 v0, 0x64

    .line 70
    .line 71
    sput v0, Lsb;->φ:I

    .line 72
    .line 73
    new-instance v0, Landroid/os/Handler;

    .line 74
    .line 75
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lsb;->χ:Landroid/os/Handler;

    .line 83
    .line 84
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    .line 91
    new-instance v0, Ljava/util/WeakHashMap;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lsb;->Α:Ljava/util/Map;

    .line 101
    .line 102
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Lsb;->Β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 107
    .line 108
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sput-object v0, Lsb;->Γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 113
    .line 114
    const/4 v0, 0x3

    .line 115
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/4 v1, 0x6

    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const/4 v2, 0x7

    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const/16 v3, 0x8

    .line 130
    .line 131
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_0

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    sget-object v2, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 164
    .line 165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_0
    return-void
.end method

.method public static Α()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ln7;

    .line 15
    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ly30;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lx30;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Lx30;-><init>(Ly30;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 56
    .line 57
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, Lib;

    .line 62
    .line 63
    const/4 v4, 0x3

    .line 64
    invoke-direct {v2, v4}, Lib;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "rd5c3cab94b04d746"

    .line 78
    .line 79
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static Β()V
    .locals 6

    .line 1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Landroid/view/View;

    .line 6
    .line 7
    :try_start_0
    const-string v3, "setVisibility"

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {v2, v3, v4}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4, v3}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    sget-object v4, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 29
    .line 30
    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Lib;

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    invoke-direct {v4, v5}, Lib;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-string v4, "rbdd0c507019e3abd"

    .line 54
    .line 55
    invoke-static {v4, v3}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    :try_start_1
    const-string v3, "setAlpha"

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v2, v3, v4}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4, v3}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    sget-object v4, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 80
    .line 81
    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, Lib;

    .line 86
    .line 87
    const/4 v5, 0x2

    .line 88
    invoke-direct {v4, v5}, Lib;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_1
    move-exception v3

    .line 100
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "r6f2f1e1302c1428f"

    .line 105
    .line 106
    invoke-static {v4, v3}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    const-string v3, "setBackground"

    .line 110
    .line 111
    const-class v4, Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    invoke-static {v4, v3}, Lsb;->ρ(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v3, "setBackgroundDrawable"

    .line 117
    .line 118
    invoke-static {v4, v3}, Lsb;->ρ(Ljava/lang/Class;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v3, "setBackgroundResource"

    .line 122
    .line 123
    invoke-static {v1, v3}, Lsb;->ρ(Ljava/lang/Class;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v3, "setBackgroundColor"

    .line 127
    .line 128
    invoke-static {v1, v3}, Lsb;->ρ(Ljava/lang/Class;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sget-boolean v1, Lsb;->ζ:Z

    .line 132
    .line 133
    if-eqz v1, :cond_0

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_0
    const/4 v1, 0x1

    .line 137
    sput-boolean v1, Lsb;->ζ:Z

    .line 138
    .line 139
    :try_start_2
    const-string v1, "setTranslationY"

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v2, v1, v0}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 161
    .line 162
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v1, Lib;

    .line 167
    .line 168
    const/16 v2, 0x12

    .line 169
    .line 170
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catchall_2
    move-exception v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "r72ae24c6907695a3"

    .line 187
    .line 188
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_2
    return-void
.end method

.method public static Γ(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ln7;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    const-string v0, "bottom_bar_dexkit_resolver"

    .line 14
    .line 15
    sget-boolean v1, Lfb;->β:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x1

    .line 21
    sput-boolean v1, Lfb;->β:Z

    .line 22
    .line 23
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    new-instance v1, Ln7;

    .line 26
    .line 27
    const/4 v2, 0x5

    .line 28
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ln7;

    .line 35
    .line 36
    const/4 v2, 0x6

    .line 37
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {p0}, Lfb;->γ(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v0, "r52f47ee6547d810e"

    .line 53
    .line 54
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static Δ(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lck1;->α:Lck1;

    .line 2
    .line 3
    new-instance v1, Ln7;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lck1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const-string v1, "publish_button_resolver"

    .line 16
    .line 17
    sget-object v2, Lck1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v2, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v2, Lli1;

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    invoke-direct {v2, v3}, Lli1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lli1;

    .line 41
    .line 42
    const/16 v3, 0x9

    .line 43
    .line 44
    invoke-direct {v2, v3}, Lli1;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v0, p0}, Lck1;->γ(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "r7486cd87b875b0cd"

    .line 60
    .line 61
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static Ε(Landroid/view/View;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v10, "MessageAvatar"

    .line 18
    .line 19
    const-string v11, "NotifyAvatar"

    .line 20
    .line 21
    const-string v2, "Avatar"

    .line 22
    .line 23
    const-string v3, "HeadImg"

    .line 24
    .line 25
    const-string v4, "HeadImage"

    .line 26
    .line 27
    const-string v5, "RoundImage"

    .line 28
    .line 29
    const-string v6, "CircleImage"

    .line 30
    .line 31
    const-string v7, "ProfileImage"

    .line 32
    .line 33
    const-string v8, "UserImage"

    .line 34
    .line 35
    const-string v9, "MsgAvatar"

    .line 36
    .line 37
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    invoke-static {v1, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    const-string v1, "\u5934\u50cf"

    .line 88
    .line 89
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    const-string v1, "avatar"

    .line 96
    .line 97
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    check-cast p0, Landroid/widget/ImageView;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-lez v0, :cond_4

    .line 119
    .line 120
    if-lez v1, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 131
    .line 132
    int-to-float v0, v0

    .line 133
    div-float/2addr v0, p0

    .line 134
    int-to-float v1, v1

    .line 135
    div-float/2addr v1, p0

    .line 136
    const/high16 p0, 0x40a00000    # 5.0f

    .line 137
    .line 138
    cmpg-float v2, p0, v0

    .line 139
    .line 140
    if-gtz v2, :cond_4

    .line 141
    .line 142
    const/high16 v2, 0x41a00000    # 20.0f

    .line 143
    .line 144
    cmpg-float v0, v0, v2

    .line 145
    .line 146
    if-gtz v0, :cond_4

    .line 147
    .line 148
    cmpg-float p0, p0, v1

    .line 149
    .line 150
    if-gtz p0, :cond_4

    .line 151
    .line 152
    cmpg-float p0, v1, v2

    .line 153
    .line 154
    if-gtz p0, :cond_4

    .line 155
    .line 156
    :cond_3
    :goto_0
    return v4

    .line 157
    :cond_4
    const/4 p0, 0x0

    .line 158
    return p0
.end method

.method public static Ζ(Landroid/view/View;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "Badge"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_3

    .line 25
    .line 26
    const-string v4, "Dot"

    .line 27
    .line 28
    invoke-static {v0, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_3

    .line 33
    .line 34
    const-string v5, "RedPoint"

    .line 35
    .line 36
    invoke-static {v0, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    const-string v5, "Unread"

    .line 43
    .line 44
    invoke-static {v0, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-static {v1, v4, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/4 p0, 0x0

    .line 75
    :goto_0
    if-eqz p0, :cond_2

    .line 76
    .line 77
    const-string v0, "\u672a\u8bfb"

    .line 78
    .line 79
    invoke-static {p0, v0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    const-string v0, "\u7ea2\u70b9"

    .line 86
    .line 87
    invoke-static {p0, v0, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const/4 p0, 0x0

    .line 95
    return p0

    .line 96
    :cond_3
    :goto_1
    return v3
.end method

.method public static Η()Z
    .locals 1

    .line 1
    sget-boolean v0, Lsb;->ξ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lsb;->σ:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static Θ(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lsb;->η:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v1, "BottomSpace"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    const-string p0, ".feed."

    .line 36
    .line 37
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const-string p0, ".bottom."

    .line 44
    .line 45
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    :goto_0
    return v2

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public static Ι(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lsb;->θ:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "MainBottomTabContainer"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, "MainBottomTabViewNew"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public static Κ(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    invoke-static {p0}, Lsb;->Ν(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v2, p0, Landroid/view/View;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast p0, Landroid/view/View;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return v0
.end method

.method public static Μ(Landroid/view/View;)Z
    .locals 3

    .line 1
    sget-object v0, Lck1;->α:Lck1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Lck1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x1

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v0, Lck1;->ε:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const-string v0, ".tools.external.hometab.bottom.PublishButton"

    .line 39
    .line 40
    invoke-static {p0, v0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    const-string v0, "hometab.bottom"

    .line 47
    .line 48
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-string v0, ".PublishButton"

    .line 55
    .line 56
    invoke-static {p0, v0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    return v1

    .line 64
    :cond_4
    :goto_1
    return v2
.end method

.method public static Ν(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB38ACFA1A4C4DE4BF4639733A5CC5A954D77DF2D1F2F66A8C556D44DCD72183EB"

    .line 20
    .line 21
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    const-string v1, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C6D8DCD83B75146CBF9196B2C921758D9CBA4D1CA59A5F99A4AA8365B129A65D23E9E653551AF9B481B4"

    .line 32
    .line 33
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static Ξ(Landroid/view/View;I)V
    .locals 4

    .line 1
    const v0, 0x7f0dba10

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/util/Set;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    move-object v0, p1

    .line 27
    check-cast v0, Ljava/lang/Iterable;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/4 v3, 0x1

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    move v2, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/4 v2, 0x0

    .line 58
    :goto_1
    if-ne v2, v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    instance-of v1, v0, Ljava/util/Collection;

    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    move-object v1, v0

    .line 69
    check-cast v1, Ljava/util/Collection;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, p0, :cond_5

    .line 99
    .line 100
    :goto_2
    return-void

    .line 101
    :cond_6
    :goto_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 102
    .line 103
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public static Ο(Landroid/view/View;Z)V
    .locals 10

    .line 1
    :try_start_0
    instance-of v0, p0, Landroid/view/ViewStub;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-boolean v0, Lsb;->ο:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lsb;->ο(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA5CE999999CB4FFD39B60A13EE96CCFBB8D744843102723"

    .line 29
    .line 30
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {p0}, Lsb;->Ζ(Landroid/view/View;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-static {p0}, Lsb;->Ε(Landroid/view/View;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    instance-of v2, p0, Landroid/widget/TextView;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    move-object v2, p0

    .line 51
    check-cast v2, Landroid/widget/TextView;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v2, 0x0

    .line 55
    :goto_0
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x1

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-nez v6, :cond_3

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    move v7, v9

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v7, v8

    .line 66
    :goto_1
    invoke-static {}, Lsb;->Η()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sget-boolean v3, Lsb;->π:Z

    .line 71
    .line 72
    sget-boolean v4, Lsb;->ρ:Z

    .line 73
    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    if-nez v7, :cond_5

    .line 83
    .line 84
    :cond_4
    if-eqz v6, :cond_6

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    :cond_5
    move v3, v9

    .line 91
    goto :goto_2

    .line 92
    :cond_6
    move v3, v8

    .line 93
    :goto_2
    sget-boolean v0, Lsb;->ο:Z

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    const v0, 0x7f0dba13    # 1.883873E38f

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    move v5, v9

    .line 113
    goto :goto_3

    .line 114
    :cond_7
    move v5, v8

    .line 115
    :goto_3
    if-nez v3, :cond_9

    .line 116
    .line 117
    if-eqz v5, :cond_8

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    move v2, v8

    .line 121
    goto :goto_5

    .line 122
    :cond_9
    :goto_4
    move v2, v9

    .line 123
    :goto_5
    new-instance v1, Lmb;

    .line 124
    .line 125
    move-object v4, p0

    .line 126
    invoke-direct/range {v1 .. v7}, Lmb;-><init>(ZZLandroid/view/View;ZZZ)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Lsb;->Ω(Lp70;)V

    .line 130
    .line 131
    .line 132
    instance-of p0, v4, Landroid/view/ViewGroup;

    .line 133
    .line 134
    if-eqz p0, :cond_c

    .line 135
    .line 136
    move-object p0, v4

    .line 137
    check-cast p0, Landroid/view/ViewGroup;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    move v0, v8

    .line 144
    :goto_6
    if-ge v0, p0, :cond_c

    .line 145
    .line 146
    move-object v1, v4

    .line 147
    check-cast v1, Landroid/view/ViewGroup;

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    if-nez p1, :cond_b

    .line 157
    .line 158
    if-eqz v6, :cond_a

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_a
    move v2, v8

    .line 162
    goto :goto_8

    .line 163
    :cond_b
    :goto_7
    move v2, v9

    .line 164
    :goto_8
    invoke-static {v1, v2}, Lsb;->Ο(Landroid/view/View;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    add-int/lit8 v0, v0, 0x1

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_c
    return-void

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    move-object p0, v0

    .line 173
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const-string p1, "raecbf499d19b61c2"

    .line 178
    .line 179
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public static Ρ()Lio/github/libxposed/api/XposedModule;
    .locals 1

    .line 1
    sget-object v0, Lsb;->μ:Lcom/example/dyhelper/MainHook;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "BottomBarManager \u672a\u5b8c\u6210 libxposed \u6a21\u5757\u521d\u59cb\u5316"

    .line 7
    .line 8
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public static Σ(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lhb;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lsb;->Ω(Lp70;)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lsb;->Σ(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public static Τ(Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7f0dba1a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Lgb;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Lgb;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const v0, 0x7f0dba13    # 1.883873E38f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const v0, 0x7f0dba11

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    if-nez v1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, v1, Lgb;->α:I

    .line 49
    .line 50
    if-eq v0, v2, :cond_3

    .line 51
    .line 52
    iget v0, v1, Lgb;->α:I

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v2, v1, Lgb;->β:F

    .line 62
    .line 63
    cmpg-float v0, v0, v2

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    :goto_1
    return-void

    .line 68
    :cond_4
    iget v0, v1, Lgb;->β:F

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static Υ(Landroid/view/View;)V
    .locals 12

    .line 1
    const v0, 0x7f0dba14

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Ljava/lang/Integer;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    const v2, 0x7f0dba15

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    instance-of v5, v4, Ljava/lang/Float;

    .line 25
    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    check-cast v4, Ljava/lang/Float;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v4, v3

    .line 32
    :goto_1
    const v5, 0x7f0dba16

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    instance-of v7, v6, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    check-cast v6, Ljava/lang/Boolean;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move-object v6, v3

    .line 47
    :goto_2
    const v7, 0x7f0dba17

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    instance-of v9, v8, Ljava/lang/Boolean;

    .line 55
    .line 56
    if-eqz v9, :cond_3

    .line 57
    .line 58
    check-cast v8, Ljava/lang/Boolean;

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move-object v8, v3

    .line 62
    :goto_3
    const v9, 0x7f0dba18

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    instance-of v11, v10, Ljava/lang/Integer;

    .line 70
    .line 71
    if-eqz v11, :cond_4

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Integer;

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move-object v10, v3

    .line 77
    :goto_4
    const v11, 0x7f0dba11

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v11, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const v11, 0x7f0dba13    # 1.883873E38f

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v11, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v5, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v7, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v9, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    :cond_5
    if-eqz v4, :cond_6

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 120
    .line 121
    .line 122
    :cond_6
    if-eqz v6, :cond_7

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 129
    .line 130
    .line 131
    :cond_7
    if-eqz v8, :cond_8

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 138
    .line 139
    .line 140
    :cond_8
    if-eqz v10, :cond_9

    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 147
    .line 148
    .line 149
    :cond_9
    return-void
.end method

.method public static Φ(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lsb;->Υ(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lsb;->Φ(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public static Χ(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lhb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lsb;->Ω(Lp70;)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lsb;->Χ(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public static Ψ(Lp70;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "r1001a8d275f4a473"

    .line 25
    .line 26
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v0, Lr0;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {v0, v1, p0}, Lr0;-><init>(ILp70;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lsb;->χ:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static Ω(Lp70;)V
    .locals 1

    .line 1
    sget v0, Lsb;->τ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    sput v0, Lsb;->τ:I

    .line 6
    .line 7
    :try_start_0
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget p0, Lsb;->τ:I

    .line 11
    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    sput p0, Lsb;->τ:I

    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    sget v0, Lsb;->τ:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    sput v0, Lsb;->τ:I

    .line 23
    .line 24
    throw p0
.end method

.method public static α(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lsb;->а(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lsb;->β()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljb;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x1f4

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljb;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, p0, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v1, 0x5dc

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljb;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v1, 0xbb8

    .line 36
    .line 37
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static β()V
    .locals 2

    .line 1
    sget-boolean v0, Lsb;->ν:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lo7;

    .line 7
    .line 8
    const/16 v1, 0xb

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lo7;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lsb;->Ψ(Lp70;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static γ(Landroid/view/View;)V
    .locals 3

    .line 1
    :try_start_0
    sget v0, Lsb;->υ:I

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v2, v1}, Lj81;->μ(III)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget v0, Lsb;->υ:I

    .line 35
    .line 36
    invoke-static {v0, v2, v1}, Lj81;->μ(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    mul-int/lit16 v0, v0, 0xff

    .line 41
    .line 42
    div-int/2addr v0, v1

    .line 43
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v0, "rd03e1a2732877121"

    .line 53
    .line 54
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static δ(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljb;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    invoke-direct {v0, p0, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lsb;->χ:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Lhb;

    .line 28
    .line 29
    const/16 v1, 0x9

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lsb;->Ω(Lp70;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static ε(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lsb;->ν:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lsb;->χ:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v1, Llb;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p0, p1, v2}, Llb;-><init>(Landroid/view/View;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const/4 v0, 0x3

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eq p1, v0, :cond_8

    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    if-eq p1, v0, :cond_6

    .line 42
    .line 43
    const/4 v0, 0x7

    .line 44
    if-eq p1, v0, :cond_4

    .line 45
    .line 46
    const/16 v0, 0x8

    .line 47
    .line 48
    if-eq p1, v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :try_start_0
    sget-boolean p1, Lsb;->ο:Z

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Lsb;->ο(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    new-instance p1, Lhb;

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    invoke-direct {p1, p0, v0}, Lhb;-><init>(Landroid/view/View;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lsb;->Ω(Lp70;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    invoke-static {}, Lsb;->Η()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    invoke-static {p0}, Lsb;->ξ(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    invoke-static {p0}, Lsb;->Σ(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_6
    invoke-static {}, Lsb;->Η()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_7

    .line 88
    .line 89
    sget p1, Lsb;->τ:I

    .line 90
    .line 91
    add-int/lit8 p1, p1, 0x1

    .line 92
    .line 93
    sput p1, Lsb;->τ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v0, "rf5ead877f661218f"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 123
    .line 124
    .line 125
    :goto_0
    :try_start_3
    sget p0, Lsb;->τ:I

    .line 126
    .line 127
    add-int/lit8 p0, p0, -0x1

    .line 128
    .line 129
    sput p0, Lsb;->τ:I

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catchall_1
    move-exception p0

    .line 133
    sget p1, Lsb;->τ:I

    .line 134
    .line 135
    add-int/lit8 p1, p1, -0x1

    .line 136
    .line 137
    sput p1, Lsb;->τ:I

    .line 138
    .line 139
    throw p0

    .line 140
    :cond_7
    :goto_1
    return-void

    .line 141
    :catchall_2
    move-exception p0

    .line 142
    goto :goto_3

    .line 143
    :cond_8
    invoke-static {}, Lsb;->Η()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_9

    .line 148
    .line 149
    new-instance p1, Lhb;

    .line 150
    .line 151
    const/4 v0, 0x4

    .line 152
    invoke-direct {p1, p0, v0}, Lhb;-><init>(Landroid/view/View;I)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lsb;->Ω(Lp70;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p0}, Lsb;->δ(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    sget-boolean p1, Lsb;->σ:Z

    .line 163
    .line 164
    if-eqz p1, :cond_a

    .line 165
    .line 166
    invoke-static {p0}, Lsb;->Σ(Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    :cond_a
    :goto_2
    invoke-static {p0, v1}, Lsb;->Ο(Landroid/view/View;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    const-string p1, "rbf34ffd9743a5d1e"

    .line 178
    .line 179
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public static ζ(Landroid/view/View;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lsb;->Κ(Landroid/view/View;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    const v0, 0x7f0dba10

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v2, v0, Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :goto_0
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {p0, v1}, Lsb;->ι(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    invoke-static {p0}, Lsb;->Θ(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x7

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-static {p0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-static {p0}, Lsb;->Ι(Landroid/view/View;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    const/4 v0, 0x3

    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :cond_5
    :goto_1
    if-eqz v1, :cond_6

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p0, v0}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {p0, v0}, Lsb;->ι(Landroid/view/View;I)V

    .line 87
    .line 88
    .line 89
    :cond_6
    return-object v1
.end method

.method public static η(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-object v0, Lsb;->Β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La80;

    .line 21
    .line 22
    :try_start_0
    invoke-interface {v1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    new-instance v2, Leo1;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v2

    .line 35
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "r99290448b2ff2bb7"

    .line 46
    .line 47
    invoke-static {v2, v1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public static ι(Landroid/view/View;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p0}, Lsb;->Θ(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lsb;->υ(Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-static {p0}, Lsb;->Ι(Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lsb;->χ(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "r96ece766f56e5aa0"

    .line 42
    .line 43
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static κ(Lsb;Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    :goto_0
    const/4 v0, 0x0

    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-gt p0, v1, :cond_3

    .line 8
    .line 9
    invoke-static {p1}, Lsb;->Ν(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {p1}, Lsb;->Ι(Landroid/view/View;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v1, p1, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/View;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object p1, v0

    .line 35
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static varargs λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    array-length v0, p2

    .line 2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static varargs μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    if-eqz v0, :cond_0

    .line 3
    .line 4
    :try_start_0
    array-length v1, p2

    .line 5
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, [Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v1, Ln7;

    .line 32
    .line 33
    const/16 v2, 0x9

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const/16 v2, 0x1f

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {p2, v3, v3, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-string v1, "#"

    .line 46
    .line 47
    const-string v2, "("

    .line 48
    .line 49
    invoke-static {p0, v1, p1, v2, p2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, ")"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v0, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method public static ν(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    if-gt v0, v2, :cond_3

    .line 8
    .line 9
    invoke-static {p0}, Lsb;->Ν(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {p0}, Lsb;->Μ(Landroid/view/View;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of v2, p0, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/View;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object p0, v1

    .line 35
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    :goto_2
    return-object v1
.end method

.method public static ξ(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Lhb;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lsb;->Ω(Lp70;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static ο(Landroid/view/View;)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {p0, v0}, Lsb;->Ξ(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lhb;

    .line 7
    .line 8
    const/4 v1, 0x7

    .line 9
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lsb;->Ω(Lp70;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static π(Landroid/view/View;)V
    .locals 3

    .line 1
    const v0, 0x7f0dba14

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const v0, 0x7f0dba15

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const v0, 0x7f0dba16

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    const v0, 0x7f0dba17

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    const v0, 0x7f0dba18

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 102
    .line 103
    const v1, 0x7f0dba11

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const v1, 0x7f0dba13    # 1.883873E38f

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    :catchall_0
    :cond_5
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    :catchall_1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    const/16 v1, 0x8

    .line 132
    .line 133
    if-eq v0, v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/4 v1, 0x0

    .line 143
    cmpg-float v0, v0, v1

    .line 144
    .line 145
    if-nez v0, :cond_7

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_7
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 149
    .line 150
    .line 151
    :goto_0
    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 156
    .line 157
    .line 158
    const/4 v1, 0x4

    .line 159
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 160
    .line 161
    .line 162
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 163
    .line 164
    if-eqz v1, :cond_8

    .line 165
    .line 166
    check-cast p0, Landroid/view/ViewGroup;

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    :goto_1
    if-ge v0, v1, :cond_8

    .line 173
    .line 174
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {v2}, Lsb;->π(Landroid/view/View;)V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v0, v0, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_8
    return-void
.end method

.method public static ρ(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Landroid/view/View;

    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {v0, p1, p0}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lib;

    .line 26
    .line 27
    const/16 v0, 0xa

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lib;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :catchall_0
    return-void
.end method

.method public static σ(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    sget-object v0, Lsb;->η:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :try_start_0
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lsb;->υ(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "rf22f06e4e1ac4196"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
.end method

.method public static τ()V
    .locals 3

    .line 1
    sget-boolean v0, Lsb;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lsb;->ε:Z

    .line 8
    .line 9
    :try_start_0
    const-class v0, Landroid/view/View;

    .line 10
    .line 11
    const-string v1, "onMeasure"

    .line 12
    .line 13
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    filled-new-array {v2, v2}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v1, v2}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lib;

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "re36b18ee79efa61d"

    .line 60
    .line 61
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static υ(Ljava/lang/Class;)V
    .locals 7

    .line 1
    sget-object v0, Lsb;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    move v3, v0

    .line 25
    :goto_0
    if-ge v3, v2, :cond_1

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5, v4}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    sget-object v5, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 42
    .line 43
    invoke-interface {v4, v5}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Lib;

    .line 48
    .line 49
    const/4 v6, 0x5

    .line 50
    invoke-direct {v5, v6}, Lib;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v4, v5}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    :cond_1
    :try_start_1
    const-string v1, "setVisibility"

    .line 60
    .line 61
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {p0, v1, v2}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 83
    .line 84
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Lib;

    .line 89
    .line 90
    const/4 v3, 0x6

    .line 91
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    .line 101
    :catchall_1
    :try_start_2
    const-string v1, "onAttachedToWindow"

    .line 102
    .line 103
    new-array v0, v0, [Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {p0, v1, v0}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 118
    .line 119
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, Lib;

    .line 124
    .line 125
    const/4 v2, 0x7

    .line 126
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 134
    .line 135
    .line 136
    :catchall_2
    :try_start_3
    const-string v0, "setLayoutParams"

    .line 137
    .line 138
    const-class v1, Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {p0, v0, v1}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 157
    .line 158
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v1, Lib;

    .line 163
    .line 164
    const/16 v2, 0x8

    .line 165
    .line 166
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 174
    .line 175
    .line 176
    :catchall_3
    :try_start_4
    const-string v0, "onTouchEvent"

    .line 177
    .line 178
    const-class v1, Landroid/view/MotionEvent;

    .line 179
    .line 180
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {p0, v0, v1}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 197
    .line 198
    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    new-instance v0, Lib;

    .line 203
    .line 204
    const/16 v1, 0x9

    .line 205
    .line 206
    invoke-direct {v0, v1}, Lib;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 214
    .line 215
    .line 216
    :catchall_4
    :goto_1
    return-void
.end method

.method public static φ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .line 1
    :try_start_0
    filled-new-array {p2}, [Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p0, p1, p2}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Lib;

    .line 24
    .line 25
    const/16 p2, 0x13

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lib;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    return-void
.end method

.method public static χ(Ljava/lang/Class;)V
    .locals 8

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    sget-object v1, Lsb;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    array-length v3, v2

    .line 25
    move v4, v1

    .line 26
    :goto_0
    if-ge v4, v3, :cond_1

    .line 27
    .line 28
    aget-object v5, v2, v4

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6, v5}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    sget-object v6, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 43
    .line 44
    invoke-interface {v5, v6}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    new-instance v6, Lib;

    .line 49
    .line 50
    const/16 v7, 0xc

    .line 51
    .line 52
    invoke-direct {v6, v7}, Lib;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v5, v6}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    :cond_1
    :try_start_1
    const-string v2, "onAttachedToWindow"

    .line 62
    .line 63
    new-array v3, v1, [Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static {p0, v2, v3}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3, v2}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v3, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 78
    .line 79
    invoke-interface {v2, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Lib;

    .line 84
    .line 85
    const/16 v4, 0xd

    .line 86
    .line 87
    invoke-direct {v3, v4}, Lib;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v2, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    .line 97
    :catchall_1
    :try_start_2
    const-string v2, "onFinishInflate"

    .line 98
    .line 99
    new-array v1, v1, [Ljava/lang/Class;

    .line 100
    .line 101
    invoke-static {p0, v2, v1}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 114
    .line 115
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    new-instance v2, Lib;

    .line 120
    .line 121
    const/16 v3, 0xe

    .line 122
    .line 123
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 131
    .line 132
    .line 133
    :catchall_2
    :try_start_3
    const-string v1, "onLayout"

    .line 134
    .line 135
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    filled-new-array {v2, v0, v0, v0, v0}, [Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {p0, v1, v2}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 160
    .line 161
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v2, Lib;

    .line 166
    .line 167
    const/16 v3, 0xf

    .line 168
    .line 169
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 177
    .line 178
    .line 179
    :catchall_3
    :try_start_4
    const-string v1, "setVisibility"

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {p0, v1, v2}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 201
    .line 202
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-instance v2, Lib;

    .line 207
    .line 208
    const/16 v3, 0x10

    .line 209
    .line 210
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 218
    .line 219
    .line 220
    :catchall_4
    :try_start_5
    const-string v1, "setAlpha"

    .line 221
    .line 222
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {p0, v1, v2}, Lsb;->λ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v2, v1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    sget-object v2, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 244
    .line 245
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    new-instance v2, Lib;

    .line 250
    .line 251
    const/16 v3, 0x11

    .line 252
    .line 253
    invoke-direct {v2, v3}, Lib;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v1, v2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 261
    .line 262
    .line 263
    :catchall_5
    const-string v1, "setBackground"

    .line 264
    .line 265
    const-class v2, Landroid/graphics/drawable/Drawable;

    .line 266
    .line 267
    invoke-static {p0, v1, v2}, Lsb;->φ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 268
    .line 269
    .line 270
    const-string v1, "setBackgroundDrawable"

    .line 271
    .line 272
    invoke-static {p0, v1, v2}, Lsb;->φ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    const-string v1, "setBackgroundResource"

    .line 279
    .line 280
    invoke-static {p0, v1, v0}, Lsb;->φ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 281
    .line 282
    .line 283
    const-string v1, "setBackgroundColor"

    .line 284
    .line 285
    invoke-static {p0, v1, v0}, Lsb;->φ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public static ψ(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    sget-object v0, Lsb;->θ:Ljava/util/Set;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :try_start_0
    invoke-static {v1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lsb;->χ(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "r60cc048afba7d432"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "rc92cad276d7af048"

    .line 59
    .line 60
    invoke-static {v3, v1, v2}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    return-void
.end method

.method public static ω()V
    .locals 3

    .line 1
    :try_start_0
    const-class v0, Landroid/view/View;

    .line 2
    .line 3
    const-string v1, "onAttachedToWindow"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Lsb;->μ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Lsb;->Ρ()Lio/github/libxposed/api/XposedModule;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lib;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, v2}, Lib;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "re482ed040d02d47b"

    .line 46
    .line 47
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static а(Landroid/view/View;)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p0}, Lsb;->ζ(Landroid/view/View;)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p0, v0}, Lsb;->ε(Landroid/view/View;I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-ge v1, v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lsb;->а(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    return-void
.end method

.method public static б(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-boolean v0, Lsb;->ν:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lhb;

    .line 7
    .line 8
    const/16 v1, 0xc

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lsb;->Ψ(Lp70;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static в(Z)V
    .locals 4

    .line 1
    sget-boolean v0, Lsb;->σ:Z

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sput-boolean p0, Lsb;->σ:Z

    .line 7
    .line 8
    sget-boolean v0, Lsb;->ξ:Z

    .line 9
    .line 10
    sget-boolean v1, Lsb;->ο:Z

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "r2c0bf4201cb2b711"

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lkb;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lkb;-><init>(Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lsb;->Ψ(Lp70;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final Λ(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-static {}, Lsb;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_1
    invoke-static {p1}, Lsb;->Ι(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_2
    invoke-static {p0, p1}, Lsb;->κ(Lsb;Landroid/view/View;)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_3
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 34
    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_4
    check-cast p1, Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 48
    .line 49
    const/4 v2, -0x1

    .line 50
    if-eq v1, v2, :cond_b

    .line 51
    .line 52
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 53
    .line 54
    if-ne v0, v2, :cond_5

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-lez v0, :cond_6

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-lez v1, :cond_7

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    goto :goto_1

    .line 83
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-lez v1, :cond_8

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    goto :goto_2

    .line 98
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-lez v2, :cond_9

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    goto :goto_3

    .line 113
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    :goto_3
    if-lez v0, :cond_a

    .line 118
    .line 119
    if-lez v1, :cond_a

    .line 120
    .line 121
    int-to-float v2, v1

    .line 122
    int-to-float v3, v0

    .line 123
    const/high16 v4, 0x3f400000    # 0.75f

    .line 124
    .line 125
    mul-float/2addr v3, v4

    .line 126
    cmpl-float v2, v2, v3

    .line 127
    .line 128
    if-ltz v2, :cond_a

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_a
    if-lez v0, :cond_c

    .line 132
    .line 133
    if-lez p0, :cond_c

    .line 134
    .line 135
    if-lez v1, :cond_c

    .line 136
    .line 137
    if-lez p1, :cond_c

    .line 138
    .line 139
    int-to-float v1, v1

    .line 140
    int-to-float v0, v0

    .line 141
    const/high16 v2, 0x3f000000    # 0.5f

    .line 142
    .line 143
    mul-float/2addr v0, v2

    .line 144
    cmpl-float v0, v1, v0

    .line 145
    .line 146
    if-ltz v0, :cond_c

    .line 147
    .line 148
    int-to-float p1, p1

    .line 149
    int-to-float p0, p0

    .line 150
    const v0, 0x3f333333    # 0.7f

    .line 151
    .line 152
    .line 153
    mul-float/2addr p0, v0

    .line 154
    cmpl-float p0, p1, p0

    .line 155
    .line 156
    if-ltz p0, :cond_c

    .line 157
    .line 158
    :cond_b
    :goto_4
    const/4 p0, 0x1

    .line 159
    return p0

    .line 160
    :cond_c
    :goto_5
    const/4 p0, 0x0

    .line 161
    return p0
.end method

.method public final Π(Landroid/app/Activity;)V
    .locals 9

    .line 1
    const-string v0, "r7b481571f8abb81"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lui1;->π(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_1
    sget-boolean p1, Lsb;->ν:Z

    .line 23
    .line 24
    const-string v1, "bottom_bar_hidden"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const-string v3, "liquid_glass_bottom_bar_enabled"

    .line 32
    .line 33
    invoke-static {v3, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    move v5, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move v5, v2

    .line 45
    :goto_0
    sput-boolean v5, Lsb;->ξ:Z

    .line 46
    .line 47
    const-string v5, "hide_tab_publish"

    .line 48
    .line 49
    invoke-static {v5, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    sput-boolean v5, Lsb;->ο:Z

    .line 54
    .line 55
    sget-boolean v5, Lsb;->ξ:Z

    .line 56
    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    sget-boolean v5, Lsb;->ο:Z

    .line 60
    .line 61
    if-eqz v5, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move v5, v2

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    :goto_1
    move v5, v4

    .line 67
    :goto_2
    sput-boolean v5, Lsb;->ν:Z

    .line 68
    .line 69
    const-string v5, "bottom_bar_show_text"

    .line 70
    .line 71
    invoke-static {v5, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    sput-boolean v4, Lsb;->π:Z

    .line 76
    .line 77
    const-string v4, "bottom_bar_hide_badge"

    .line 78
    .line 79
    invoke-static {v4, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    sput-boolean v4, Lsb;->ρ:Z

    .line 84
    .line 85
    const-string v4, "bottom_bar_alpha"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 86
    .line 87
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-interface {v5, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 92
    .line 93
    .line 94
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    goto :goto_3

    .line 96
    :catchall_0
    move v4, v2

    .line 97
    :goto_3
    const/16 v5, 0x64

    .line 98
    .line 99
    :try_start_2
    invoke-static {v4, v2, v5}, Lj81;->μ(III)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    sput v4, Lsb;->υ:I

    .line 104
    .line 105
    const-string v4, "bottom_bar_text_alpha"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    .line 107
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-interface {v6, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    goto :goto_4

    .line 116
    :catchall_1
    move v4, v5

    .line 117
    :goto_4
    :try_start_4
    invoke-static {v4, v2, v5}, Lj81;->μ(III)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    sput v4, Lsb;->φ:I

    .line 122
    .line 123
    sget-boolean v4, Lsb;->ξ:Z

    .line 124
    .line 125
    sget-boolean v5, Lsb;->ρ:Z

    .line 126
    .line 127
    sget-boolean v6, Lsb;->ο:Z

    .line 128
    .line 129
    sget-boolean v7, Lsb;->ν:Z

    .line 130
    .line 131
    new-instance v8, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    sget-boolean v0, Lsb;->ξ:Z

    .line 162
    .line 163
    if-nez v0, :cond_5

    .line 164
    .line 165
    sput-boolean v2, Lsb;->σ:Z

    .line 166
    .line 167
    :cond_5
    if-nez p1, :cond_6

    .line 168
    .line 169
    sget-boolean v0, Lsb;->ν:Z

    .line 170
    .line 171
    if-eqz v0, :cond_6

    .line 172
    .line 173
    invoke-virtual {p0}, Lsb;->θ()V

    .line 174
    .line 175
    .line 176
    sget-object p0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 177
    .line 178
    if-eqz p0, :cond_6

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Landroid/app/Activity;

    .line 185
    .line 186
    if-eqz p0, :cond_6

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-eqz p0, :cond_6

    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-eqz p0, :cond_6

    .line 199
    .line 200
    new-instance v0, Lhb;

    .line 201
    .line 202
    const/4 v1, 0x2

    .line 203
    invoke-direct {v0, p0, v1}, Lhb;-><init>(Landroid/view/View;I)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, Lsb;->Ψ(Lp70;)V

    .line 207
    .line 208
    .line 209
    :cond_6
    if-eqz p1, :cond_7

    .line 210
    .line 211
    sget-boolean p0, Lsb;->ν:Z

    .line 212
    .line 213
    if-nez p0, :cond_7

    .line 214
    .line 215
    new-instance p0, Lo7;

    .line 216
    .line 217
    const/16 p1, 0xf

    .line 218
    .line 219
    invoke-direct {p0, p1}, Lo7;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {p0}, Lsb;->Ψ(Lp70;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 223
    .line 224
    .line 225
    :cond_7
    :goto_5
    return-void

    .line 226
    :catchall_2
    move-exception p0

    .line 227
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    const-string p1, "rb24d99da6e49547e"

    .line 232
    .line 233
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method public final θ()V
    .locals 2

    .line 1
    sget-boolean v0, Lsb;->κ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lsb;->λ:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    monitor-enter p0

    .line 12
    :try_start_0
    sget-boolean v1, Lsb;->κ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :cond_2
    :try_start_1
    invoke-static {v0}, Lsb;->Γ(Ljava/lang/ClassLoader;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lsb;->Δ(Ljava/lang/ClassLoader;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lsb;->σ(Ljava/lang/ClassLoader;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lsb;->τ()V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lsb;->ψ(Ljava/lang/ClassLoader;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lsb;->ω()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lsb;->Α()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lsb;->Β()V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    sput-boolean v0, Lsb;->κ:Z

    .line 44
    .line 45
    const-string v0, "r6701b51a570b19b7"

    .line 46
    .line 47
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    monitor-exit p0

    .line 54
    throw v0
.end method
