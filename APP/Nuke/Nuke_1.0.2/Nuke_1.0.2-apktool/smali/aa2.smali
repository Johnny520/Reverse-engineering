.class public final Laa2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final synthetic b:Lcj;


# direct methods
.method public constructor <init>(Lcj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laa2;->b:Lcj;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, p0, Laa2;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    if-eqz p3, :cond_1

    .line 15
    .line 16
    :goto_0
    move-object v3, p3

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object p3, p0, Laa2;->a:[Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :goto_1
    sget-object p3, Lyz1;->b:Li51;

    .line 22
    .line 23
    invoke-virtual {p3, p2}, Li51;->s(Ljava/lang/reflect/Method;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p3, p1, p2, v3}, Li51;->r(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    iget-object p0, p0, Laa2;->b:Lcj;

    .line 35
    .line 36
    :goto_2
    iget-object p3, p0, Lcj;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    instance-of v0, p3, Lww0;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p3, Lww0;

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_3
    if-nez p3, :cond_5

    .line 52
    .line 53
    new-instance v1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    monitor-enter v1

    .line 59
    :try_start_0
    iget-object p3, p0, Lcj;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-virtual {p3, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    if-nez p3, :cond_4

    .line 68
    .line 69
    :try_start_1
    invoke-static {p0, p2}, Lww0;->b(Lcj;Ljava/lang/reflect/Method;)Lww0;

    .line 70
    .line 71
    .line 72
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    iget-object p0, p0, Lcj;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {p0, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    monitor-exit v1

    .line 81
    goto :goto_5

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move-object p0, v0

    .line 84
    goto :goto_3

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    iget-object p0, p0, Lcj;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    .line 91
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_4
    monitor-exit v1

    .line 96
    goto :goto_4

    .line 97
    :goto_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    throw p0

    .line 99
    :cond_5
    :goto_4
    monitor-enter p3

    .line 100
    :try_start_3
    iget-object v0, p0, Lcj;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    monitor-exit p3

    .line 111
    goto :goto_2

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    move-object p0, v0

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    move-object p0, v0

    .line 116
    check-cast p0, Lww0;

    .line 117
    .line 118
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 119
    move-object p3, p0

    .line 120
    :goto_5
    new-instance v0, Lct1;

    .line 121
    .line 122
    iget-object v1, p3, Lww0;->a:Lv82;

    .line 123
    .line 124
    iget-object v4, p3, Lww0;->b:Let1;

    .line 125
    .line 126
    iget-object v5, p3, Lww0;->c:Lx00;

    .line 127
    .line 128
    move-object v2, p1

    .line 129
    invoke-direct/range {v0 .. v5}, Lct1;-><init>(Lv82;Ljava/lang/Object;[Ljava/lang/Object;Let1;Lx00;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, v0, v3}, Lww0;->a(Lct1;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :goto_6
    :try_start_4
    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 138
    throw p0
.end method
