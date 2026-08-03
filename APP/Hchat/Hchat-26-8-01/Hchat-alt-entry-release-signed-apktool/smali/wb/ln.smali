.class public final Lwb/ln;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/ln;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ln;->j:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ln;->k:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lwb/ln;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/ln;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/ln;->k:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lwb/ln;->j:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/ln;-><init>(Ljava/lang/String;Ljava/lang/String;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lwb/ln;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lwb/ln;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/ln;->k:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, Lwb/ln;->j:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/ln;-><init>(Ljava/lang/String;Ljava/lang/String;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lwb/ln;->i:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/ln;->h:I

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
    invoke-virtual {p0, p1, p2}, Lwb/ln;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/ln;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/ln;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/ln;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/ln;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/ln;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/ln;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ln;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqg/t;

    .line 9
    .line 10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lwb/ln;->j:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, Lwb/ln;->k:Ljava/lang/String;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1, v0}, Lx8/x;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    new-instance v0, Lsf/f;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    :goto_0
    new-instance v0, Lsf/g;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    iget-object v0, p0, Lwb/ln;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lqg/t;

    .line 39
    .line 40
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lwb/ln;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, p0, Lwb/ln;->k:Ljava/lang/String;

    .line 46
    .line 47
    :try_start_1
    invoke-static {p1, v0}, Lx8/x;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    new-instance v0, Lsf/f;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object p1, v0

    .line 59
    :goto_1
    new-instance v0, Lsf/g;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
