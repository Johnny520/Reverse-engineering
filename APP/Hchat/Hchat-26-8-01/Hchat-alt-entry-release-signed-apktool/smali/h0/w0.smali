.class public final Lh0/w0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/w0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lh0/w0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh0/w0;

    .line 7
    .line 8
    iget-object v1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Li/c;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, v1, p1, v2}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lh0/w0;

    .line 18
    .line 19
    iget-object v1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lh0/d1;

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-direct {v0, v1, p1, v2}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lh0/w0;

    .line 29
    .line 30
    iget-object v1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lh0/d1;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v0, v1, p1, v2}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_2
    new-instance v0, Lh0/w0;

    .line 40
    .line 41
    iget-object v1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lh0/d1;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v0, v1, p1, v2}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    new-instance v0, Lh0/w0;

    .line 51
    .line 52
    iget-object v1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lh0/d1;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-direct {v0, v1, p1, v2}, Lh0/w0;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/w0;->h:I

    .line 2
    .line 3
    check-cast p1, Lwf/c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lh0/w0;->create(Lwf/c;)Lwf/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lh0/w0;

    .line 13
    .line 14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lh0/w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    invoke-virtual {p0, p1}, Lh0/w0;->create(Lwf/c;)Lwf/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lh0/w0;

    .line 25
    .line 26
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lh0/w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    invoke-virtual {p0, p1}, Lh0/w0;->create(Lwf/c;)Lwf/c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lh0/w0;

    .line 37
    .line 38
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lh0/w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_2
    invoke-virtual {p0, p1}, Lh0/w0;->create(Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lh0/w0;

    .line 49
    .line 50
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lh0/w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_3
    invoke-virtual {p0, p1}, Lh0/w0;->create(Lwf/c;)Lwf/c;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lh0/w0;

    .line 61
    .line 62
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lh0/w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh0/w0;->h:I

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
    iget-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Li/c;

    .line 12
    .line 13
    invoke-static {p1}, Li/c;->b(Li/c;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lh0/d1;

    .line 25
    .line 26
    invoke-virtual {p1}, Lh0/d1;->p()V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lh0/d1;

    .line 38
    .line 39
    iget-boolean v0, p1, Lh0/d1;->A:Z

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lh0/d1;->d(Z)Lqg/e1;

    .line 42
    .line 43
    .line 44
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lh0/d1;

    .line 53
    .line 54
    invoke-virtual {p1}, Lh0/d1;->f()V

    .line 55
    .line 56
    .line 57
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lh0/w0;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lh0/d1;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p1, Lh0/d1;->A:Z

    .line 69
    .line 70
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
