.class public final Li10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le10;


# static fields
.field public static final α:Li10;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile δ:Ljava/lang/ClassLoader;

.field public static final ε:Lq00;

.field public static final ζ:Lq00;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li10;->α:Li10;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Li10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Lq00;

    .line 24
    .line 25
    const/16 v1, 0x12

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lq00;-><init>(I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Li10;->ε:Lq00;

    .line 31
    .line 32
    new-instance v0, Lq00;

    .line 33
    .line 34
    const/16 v1, 0x13

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lq00;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Li10;->ζ:Lq00;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final α()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final β(Ljava/lang/Object;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final γ()V
    .locals 8

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x4

    .line 7
    const-string v3, "r884b4b855564017b"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    :try_start_0
    const-string v0, "feed_double_tap_like_block_enabled"

    .line 14
    .line 15
    invoke-static {v0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    new-instance v6, Leo1;

    .line 26
    .line 27
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v6

    .line 31
    :goto_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    instance-of v7, v0, Leo1;

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    move-object v0, v6

    .line 38
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    sget-object v0, Li10;->δ:Ljava/lang/ClassLoader;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    sget-object v6, Li10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v6, v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :try_start_1
    sget-object v1, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    invoke-static {v0, p0}, Lg10;->β(Ljava/lang/ClassLoader;Le10;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    new-instance v0, Leo1;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, v0

    .line 75
    :goto_1
    instance-of v0, p0, Leo1;

    .line 76
    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    move-object v0, p0

    .line 80
    check-cast v0, Ls62;

    .line 81
    .line 82
    const-string v0, "\u53cc\u51fb\u70b9\u8d5e\u5c4f\u853d\u7b56\u7565\u5df2\u542f\u7528"

    .line 83
    .line 84
    invoke-static {v3, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_5

    .line 92
    .line 93
    sget-object v0, Li10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v0, "\u542f\u7528\u53cc\u51fb\u70b9\u8d5e\u5c4f\u853d\u7b56\u7565\u5931\u8d25: "

    .line 103
    .line 104
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {v3, p0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    sget-object v0, Li10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 121
    .line 122
    invoke-static {p0}, Lg10;->ζ(Le10;)V

    .line 123
    .line 124
    .line 125
    const-string p0, "\u53cc\u51fb\u70b9\u8d5e\u5c4f\u853d\u7b56\u7565\u5df2\u79fb\u9664"

    .line 126
    .line 127
    invoke-static {v3, p0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_2
    return-void
.end method
