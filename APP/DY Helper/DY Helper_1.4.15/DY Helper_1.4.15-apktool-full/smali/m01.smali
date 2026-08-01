.class public abstract Lm01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Lj01;

.field public static final PRIORITY_DEFAULT:I = 0x32

.field public static final PRIORITY_HIGHEST:I = 0x7fffffff

.field public static final PRIORITY_LOWEST:I = -0x80000000


# instance fields
.field private final priority:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj01;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm01;->Companion:Lj01;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lm01;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, Lm01;->priority:I

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatch$app(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk01;

    .line 5
    .line 6
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    new-array v5, v4, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v3, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v0, v1, v2, v3}, Lk01;-><init>(Ljava/lang/reflect/Executable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    :try_start_0
    invoke-virtual {p0, v0}, Lm01;->beforeHookedMethod(Lk01;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v2

    .line 40
    sget-object v3, Lyq0;->α:Lyq0;

    .line 41
    .line 42
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v6, "before"

    .line 50
    .line 51
    invoke-virtual {v3, v6, v5, v2}, Lyq0;->ζ(Ljava/lang/String;Ljava/lang/reflect/Executable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v4, v0, Lk01;->η:Z

    .line 55
    .line 56
    iput-object v1, v0, Lk01;->ε:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v1, v0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 59
    .line 60
    :goto_0
    iget-boolean v2, v0, Lk01;->η:Z

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    :try_start_1
    iget-object v2, v0, Lk01;->γ:[Ljava/lang/Object;

    .line 65
    .line 66
    invoke-interface {p1, v2}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iput-object v2, v0, Lk01;->ε:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v1, v0, Lk01;->ζ:Ljava/lang/Throwable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception v2

    .line 76
    iput-object v2, v0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 77
    .line 78
    iput-object v1, v0, Lk01;->ε:Ljava/lang/Object;

    .line 79
    .line 80
    :cond_0
    :goto_1
    iget-object v1, v0, Lk01;->ε:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v2, v0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 83
    .line 84
    :try_start_2
    invoke-virtual {p0, v0}, Lm01;->afterHookedMethod(Lk01;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :catchall_2
    move-exception p0

    .line 89
    sget-object v3, Lyq0;->α:Lyq0;

    .line 90
    .line 91
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string v4, "after"

    .line 99
    .line 100
    invoke-virtual {v3, v4, p1, p0}, Lyq0;->ζ(Ljava/lang/String;Ljava/lang/reflect/Executable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, v0, Lk01;->ε:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v2, v0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 106
    .line 107
    :goto_2
    iget-object p0, v0, Lk01;->ζ:Ljava/lang/Throwable;

    .line 108
    .line 109
    if-nez p0, :cond_1

    .line 110
    .line 111
    iget-object p0, v0, Lk01;->ε:Ljava/lang/Object;

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_1
    throw p0
.end method

.method public final getPriority$app()I
    .locals 0

    .line 1
    iget p0, p0, Lm01;->priority:I

    .line 2
    .line 3
    return p0
.end method
