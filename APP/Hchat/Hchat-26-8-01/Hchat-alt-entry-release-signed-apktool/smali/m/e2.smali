.class public final Lm/e2;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:J

.field public synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm/e2;->h:I

    .line 13
    iput-wide p1, p0, Lm/e2;->i:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Li0/a1;JLwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lm/e2;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lm/e2;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lm/e2;->i:J

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lm/e2;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lm/e2;

    .line 7
    .line 8
    iget-object v0, p0, Lm/e2;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Li0/a1;

    .line 11
    .line 12
    iget-wide v1, p0, Lm/e2;->i:J

    .line 13
    .line 14
    invoke-direct {p1, v0, v1, v2, p2}, Lm/e2;-><init>(Li0/a1;JLwf/c;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v0, Lm/e2;

    .line 19
    .line 20
    iget-wide v1, p0, Lm/e2;->i:J

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, p2}, Lm/e2;-><init>(JLwf/c;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lm/e2;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm/e2;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lm/e2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm/e2;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lm/e2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    check-cast p1, Lm/m2;

    .line 23
    .line 24
    check-cast p2, Lwf/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lm/e2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lm/e2;

    .line 31
    .line 32
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lm/e2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lm/e2;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/e2;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/a1;

    .line 9
    .line 10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ln/m;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance p1, Ln/m;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lm/e2;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lm/m2;

    .line 42
    .line 43
    iget-object p1, p1, Lm/m2;->a:Lm/o2;

    .line 44
    .line 45
    iget-object v0, p1, Lm/o2;->k:Lm/u1;

    .line 46
    .line 47
    iget-wide v1, p0, Lm/e2;->i:J

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-virtual {p1, v0, v1, v2, v3}, Lm/o2;->c(Lm/u1;JI)J

    .line 51
    .line 52
    .line 53
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 54
    .line 55
    return-object p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
