.class public abstract Lqd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqd0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lqd0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lqd0;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lqd0;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lbe0;->α:Lbe0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lbe0;->δ()V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lqd0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Lo7;

    .line 26
    .line 27
    const/16 v4, 0x19

    .line 28
    .line 29
    invoke-direct {v1, v4}, Lo7;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lbe0;->ε()V

    .line 33
    .line 34
    .line 35
    sget-object v4, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {v0}, Lbe0;->γ()Lzd0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-boolean v0, v0, Lzd0;->β:Z

    .line 47
    .line 48
    if-ne v0, v3, :cond_2

    .line 49
    .line 50
    sget-object v0, Lqd0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    return v3

    .line 59
    :cond_1
    new-instance v0, Lr20;

    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 64
    .line 65
    .line 66
    const-string v1, "relation"

    .line 67
    .line 68
    invoke-static {v1, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lr20;

    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 76
    .line 77
    .line 78
    const-string v1, "message"

    .line 79
    .line 80
    invoke-static {v1, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lr20;

    .line 84
    .line 85
    const/16 v1, 0xc

    .line 86
    .line 87
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 88
    .line 89
    .line 90
    const-string v1, "message_status"

    .line 91
    .line 92
    invoke-static {v1, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lr20;

    .line 96
    .line 97
    const/16 v1, 0xd

    .line 98
    .line 99
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 100
    .line 101
    .line 102
    const-string v1, "share"

    .line 103
    .line 104
    invoke-static {v1, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lr20;

    .line 108
    .line 109
    const/16 v1, 0xe

    .line 110
    .line 111
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 112
    .line 113
    .line 114
    const-string v1, "discovery"

    .line 115
    .line 116
    invoke-static {v1, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, Lr20;

    .line 120
    .line 121
    const/16 v1, 0xf

    .line 122
    .line 123
    invoke-direct {v0, p0, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 124
    .line 125
    .line 126
    const-string p0, "message_page_reveal"

    .line 127
    .line 128
    invoke-static {p0, v0}, Lqd0;->β(Ljava/lang/String;Lp70;)V

    .line 129
    .line 130
    .line 131
    return v3

    .line 132
    :cond_2
    const-string p0, "r3988e153d6d986ff"

    .line 133
    .line 134
    const-string v0, "feature configuration disabled, skip hook installation"

    .line 135
    .line 136
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return v2
.end method

.method public static β(Ljava/lang/String;Lp70;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    new-instance v0, Leo1;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :goto_0
    instance-of v0, p1, Leo1;

    .line 14
    .line 15
    const-string v1, "r3988e153d6d986ff"

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Ls62;

    .line 21
    .line 22
    const-string v0, " hook installed"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, " hook unavailable: "

    .line 50
    .line 51
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v1, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method
