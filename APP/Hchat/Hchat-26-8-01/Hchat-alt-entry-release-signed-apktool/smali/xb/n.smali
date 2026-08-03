.class public final Lxb/n;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lxb/o;


# direct methods
.method public synthetic constructor <init>(Lxb/o;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxb/n;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb/n;->j:Lxb/o;

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
    iget v0, p0, Lxb/n;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxb/n;

    .line 7
    .line 8
    iget-object v1, p0, Lxb/n;->j:Lxb/o;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lxb/n;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lxb/n;

    .line 18
    .line 19
    iget-object v1, p0, Lxb/n;->j:Lxb/o;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lxb/n;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lxb/n;

    .line 29
    .line 30
    iget-object v1, p0, Lxb/n;->j:Lxb/o;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v1, p2, v2}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, Lxb/n;->i:Ljava/lang/Object;

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
    iget v0, p0, Lxb/n;->h:I

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
    invoke-virtual {p0, p1, p2}, Lxb/n;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lxb/n;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lxb/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lxb/n;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lxb/n;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lxb/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lxb/n;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lxb/n;

    .line 39
    .line 40
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lxb/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lxb/n;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxb/n;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqg/t;

    .line 9
    .line 10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lxb/m;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    iget-object v2, p0, Lxb/n;->j:Lxb/o;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {p1, v2, v3, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lxb/m;

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    invoke-direct {p1, v2, v3, v4}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 33
    .line 34
    .line 35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_0
    iget-object v0, p0, Lxb/n;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lqg/t;

    .line 41
    .line 42
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lxb/m;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    iget-object v2, p0, Lxb/n;->j:Lxb/o;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {p1, v2, v3, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 56
    .line 57
    .line 58
    new-instance p1, Lxb/m;

    .line 59
    .line 60
    const/4 v4, 0x3

    .line 61
    invoke-direct {p1, v2, v3, v4}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 65
    .line 66
    .line 67
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_1
    iget-object v0, p0, Lxb/n;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lqg/t;

    .line 73
    .line 74
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lxb/m;

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    iget-object v2, p0, Lxb/n;->j:Lxb/o;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {p1, v2, v3, v1}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 84
    .line 85
    .line 86
    const/4 v1, 0x3

    .line 87
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 88
    .line 89
    .line 90
    new-instance p1, Lxb/m;

    .line 91
    .line 92
    const/4 v4, 0x1

    .line 93
    invoke-direct {p1, v2, v3, v4}, Lxb/m;-><init>(Lxb/o;Lwf/c;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v3, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 97
    .line 98
    .line 99
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
