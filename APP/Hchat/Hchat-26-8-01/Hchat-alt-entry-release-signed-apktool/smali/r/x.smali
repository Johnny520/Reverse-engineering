.class public final Lr/x;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lr/z;

.field public j:I


# direct methods
.method public constructor <init>(Lr/z;ILwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr/x;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lr/x;->i:Lr/z;

    .line 5
    .line 6
    iput p2, p0, Lr/x;->j:I

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lr/z;Lwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr/x;->h:I

    .line 13
    iput-object p1, p0, Lr/x;->i:Lr/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget p1, p0, Lr/x;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lr/x;

    .line 7
    .line 8
    iget-object v0, p0, Lr/x;->i:Lr/z;

    .line 9
    .line 10
    iget v1, p0, Lr/x;->j:I

    .line 11
    .line 12
    invoke-direct {p1, v0, v1, p2}, Lr/x;-><init>(Lr/z;ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lr/x;

    .line 17
    .line 18
    iget-object v0, p0, Lr/x;->i:Lr/z;

    .line 19
    .line 20
    invoke-direct {p1, v0, p2}, Lr/x;-><init>(Lr/z;Lwf/c;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lr/x;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lm/u1;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lr/x;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr/x;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lr/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 23
    .line 24
    check-cast p2, Lwf/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lr/x;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lr/x;

    .line 31
    .line 32
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lr/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr/x;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lr/x;->j:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iget-object v1, p0, Lr/x;->i:Lr/z;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Lr/z;->n(IZ)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    iget v0, p0, Lr/x;->j:I

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Lr/w;

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {p1, v0, v3, v2}, Lr/w;-><init>(ILwf/c;I)V

    .line 47
    .line 48
    .line 49
    iput v1, p0, Lr/x;->j:I

    .line 50
    .line 51
    sget-object v0, Lk/d1;->g:Lk/d1;

    .line 52
    .line 53
    iget-object v1, p0, Lr/x;->i:Lr/z;

    .line 54
    .line 55
    invoke-virtual {v1, v0, p1, p0}, Lr/z;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 60
    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    move-object p1, v0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    :goto_1
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
