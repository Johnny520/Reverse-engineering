.class public final Lx0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lx0;->h:I

    iput-object p2, p0, Lx0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lx0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lqv0;Ltv0;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lx0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lx0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lx0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lx0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Lx0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lx0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Lqv0;

    .line 13
    .line 14
    check-cast v2, Ltv0;

    .line 15
    .line 16
    sget-object v0, Lcg0;->l:Lcg0;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    :try_start_0
    invoke-virtual {v2, v4, p0}, Ltv0;->b(ZLx0;)Z

    .line 21
    .line 22
    .line 23
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    :cond_0
    const/4 v4, 0x0

    .line 27
    :try_start_1
    invoke-virtual {v2, v4, p0}, Ltv0;->b(ZLx0;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    sget-object p0, Lcg0;->j:Lcg0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    :try_start_2
    sget-object v0, Lcg0;->o:Lcg0;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    invoke-virtual {v3, p0, v0, v5}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v2}, Lug3;->b(Ljava/io/Closeable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_5

    .line 46
    :catch_0
    move-exception v4

    .line 47
    move-object v5, v4

    .line 48
    goto :goto_3

    .line 49
    :catchall_1
    move-exception v1

    .line 50
    :goto_1
    move-object p0, v0

    .line 51
    goto :goto_5

    .line 52
    :catch_1
    move-exception p0

    .line 53
    move-object v5, p0

    .line 54
    move-object p0, v0

    .line 55
    goto :goto_3

    .line 56
    :cond_1
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    .line 57
    .line 58
    const-string v4, "Required SETTINGS preface not received"

    .line 59
    .line 60
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 64
    :goto_2
    move-object v1, p0

    .line 65
    goto :goto_1

    .line 66
    :catchall_2
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :goto_3
    :try_start_4
    sget-object p0, Lcg0;->k:Lcg0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    .line 70
    invoke-virtual {v3, p0, p0, v5}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_4
    return-object v1

    .line 75
    :goto_5
    invoke-virtual {v3, p0, v0, v5}, Lqv0;->b(Lcg0;Lcg0;Ljava/io/IOException;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Lug3;->b(Ljava/io/Closeable;)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :pswitch_0
    check-cast v3, Lxk1;

    .line 83
    .line 84
    check-cast v2, Lxt0;

    .line 85
    .line 86
    invoke-interface {v3, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :pswitch_1
    check-cast v3, Lxk1;

    .line 91
    .line 92
    check-cast v2, Lzq;

    .line 93
    .line 94
    sget-object p0, Lyr;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 95
    .line 96
    invoke-interface {v3, v2}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :pswitch_2
    check-cast v2, Lin0;

    .line 101
    .line 102
    check-cast v3, Lnuke/module/wechat/ai/AIModelInfo;

    .line 103
    .line 104
    invoke-virtual {v3}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-interface {v2, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
