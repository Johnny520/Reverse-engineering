.class public final synthetic Lmv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lbo0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lmv0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmv0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lmv0;->j:I

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lqv0;ILjava/lang/Object;I)V
    .locals 0

    .line 12
    iput p4, p0, Lmv0;->h:I

    iput-object p1, p0, Lmv0;->i:Ljava/lang/Object;

    iput p2, p0, Lmv0;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqv0;ILjava/util/List;Z)V
    .locals 0

    .line 13
    const/4 p3, 0x2

    iput p3, p0, Lmv0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv0;->i:Ljava/lang/Object;

    iput p2, p0, Lmv0;->j:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lmv0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmv0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lbo0;

    .line 9
    .line 10
    iget p0, p0, Lmv0;->j:I

    .line 11
    .line 12
    iget-object v0, v0, Lbo0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ly03;

    .line 15
    .line 16
    iget-object v0, v0, Ly03;->b:Llj1;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Llj1;->d(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lmv0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lqv0;

    .line 30
    .line 31
    iget p0, p0, Lmv0;->j:I

    .line 32
    .line 33
    iget-object v1, v0, Lqv0;->r:Lgd3;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object v1, v0, Lqv0;->D:Lyv0;

    .line 39
    .line 40
    sget-object v2, Lcg0;->o:Lcg0;

    .line 41
    .line 42
    invoke-virtual {v1, p0, v2}, Lyv0;->k(ILcg0;)V

    .line 43
    .line 44
    .line 45
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :try_start_1
    iget-object v1, v0, Lqv0;->F:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    :try_start_2
    monitor-exit v0

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    monitor-exit v0

    .line 59
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    :catch_0
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_1
    iget-object v0, p0, Lmv0;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lqv0;

    .line 66
    .line 67
    iget p0, p0, Lmv0;->j:I

    .line 68
    .line 69
    iget-object v1, v0, Lqv0;->r:Lgd3;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    monitor-enter v0

    .line 75
    :try_start_3
    iget-object v1, v0, Lqv0;->F:Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    .line 83
    .line 84
    monitor-exit v0

    .line 85
    sget-object p0, La83;->a:La83;

    .line 86
    .line 87
    return-object p0

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    monitor-exit v0

    .line 90
    throw p0

    .line 91
    :pswitch_2
    iget-object v0, p0, Lmv0;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lqv0;

    .line 94
    .line 95
    iget p0, p0, Lmv0;->j:I

    .line 96
    .line 97
    iget-object v1, v0, Lqv0;->r:Lgd3;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    :try_start_4
    iget-object v1, v0, Lqv0;->D:Lyv0;

    .line 103
    .line 104
    sget-object v2, Lcg0;->o:Lcg0;

    .line 105
    .line 106
    invoke-virtual {v1, p0, v2}, Lyv0;->k(ILcg0;)V

    .line 107
    .line 108
    .line 109
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 110
    :try_start_5
    iget-object v1, v0, Lqv0;->F:Ljava/util/LinkedHashSet;

    .line 111
    .line 112
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 117
    .line 118
    .line 119
    :try_start_6
    monitor-exit v0

    .line 120
    goto :goto_1

    .line 121
    :catchall_2
    move-exception p0

    .line 122
    monitor-exit v0

    .line 123
    throw p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 124
    :catch_1
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
