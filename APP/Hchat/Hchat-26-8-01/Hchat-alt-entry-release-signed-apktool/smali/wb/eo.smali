.class public final Lwb/eo;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ld1/v;


# direct methods
.method public synthetic constructor <init>(Ld1/v;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/eo;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/eo;->i:Ld1/v;

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
    .locals 2

    .line 1
    iget p1, p0, Lwb/eo;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lwb/eo;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/eo;->i:Ld1/v;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lwb/eo;-><init>(Ld1/v;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lwb/eo;

    .line 16
    .line 17
    iget-object v0, p0, Lwb/eo;->i:Ld1/v;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lwb/eo;-><init>(Ld1/v;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, Lwb/eo;

    .line 25
    .line 26
    iget-object v0, p0, Lwb/eo;->i:Ld1/v;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p1, v0, p2, v1}, Lwb/eo;-><init>(Ld1/v;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/eo;->h:I

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
    invoke-virtual {p0, p1, p2}, Lwb/eo;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/eo;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/eo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/eo;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lwb/eo;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lwb/eo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwb/eo;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lwb/eo;

    .line 39
    .line 40
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lwb/eo;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 1

    .line 1
    iget v0, p0, Lwb/eo;->h:I

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
    iget-object p1, p0, Lwb/eo;->i:Ld1/v;

    .line 10
    .line 11
    invoke-static {p1}, Ld1/v;->a(Ld1/v;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lwb/eo;->i:Ld1/v;

    .line 21
    .line 22
    invoke-static {p1}, Ld1/v;->a(Ld1/v;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lwb/eo;->i:Ld1/v;

    .line 32
    .line 33
    invoke-static {p1}, Ld1/v;->a(Ld1/v;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
