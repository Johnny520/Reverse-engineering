.class public final Lwb/in;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/in;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/in;->j:Li0/a1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lwb/in;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/in;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/in;->j:Li0/a1;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lwb/in;-><init>(Li0/a1;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lwb/in;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lwb/in;

    .line 18
    .line 19
    iget-object v1, p0, Lwb/in;->j:Li0/a1;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lwb/in;-><init>(Li0/a1;Lwf/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lwb/in;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lwb/in;

    .line 29
    .line 30
    iget-object v1, p0, Lwb/in;->j:Li0/a1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v1, p2, v2}, Lwb/in;-><init>(Li0/a1;Lwf/c;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, Lwb/in;->i:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/in;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/in;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/in;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/in;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/in;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/in;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/in;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwb/in;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lwb/in;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lwb/in;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwb/in;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lwb/in;->j:Li0/a1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwb/in;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lqg/t;

    .line 11
    .line 12
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 16
    .line 17
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 18
    .line 19
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Lx8/x;->h(Ljava/lang/String;)Luf/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    new-instance v0, Lsf/f;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :goto_0
    new-instance v0, Lsf/g;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    iget-object v0, p0, Lwb/in;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqg/t;

    .line 46
    .line 47
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 51
    .line 52
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 53
    .line 54
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1}, Lx8/x;->g(Ljava/lang/String;)Luf/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception p1

    .line 66
    new-instance v0, Lsf/f;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v0

    .line 72
    :goto_1
    new-instance v0, Lsf/g;

    .line 73
    .line 74
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_1
    iget-object v0, p0, Lwb/in;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lqg/t;

    .line 81
    .line 82
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :try_start_2
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 86
    .line 87
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 88
    .line 89
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {p1}, Lx8/x;->d(Ljava/lang/String;)Luf/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 99
    goto :goto_2

    .line 100
    :catchall_2
    move-exception p1

    .line 101
    new-instance v0, Lsf/f;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    move-object p1, v0

    .line 107
    :goto_2
    new-instance v0, Lsf/g;

    .line 108
    .line 109
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
