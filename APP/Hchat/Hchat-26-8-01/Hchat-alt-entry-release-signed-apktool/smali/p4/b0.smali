.class public final Lp4/b0;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Lp4/f;


# direct methods
.method public constructor <init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    iput-object p4, p0, Lp4/b0;->f:Lp4/f;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p1, "target == null"

    .line 10
    .line 11
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/b0;->f:Lp4/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "????"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lp4/h;->f()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final i(Lp4/j;)Lp4/h;
    .locals 4

    .line 1
    new-instance v0, Lp4/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/h;->d:Lu4/p;

    .line 4
    .line 5
    iget-object v2, p0, Lp4/b0;->f:Lp4/f;

    .line 6
    .line 7
    iget-object v3, p0, Lp4/h;->c:Lu4/t;

    .line 8
    .line 9
    invoke-direct {v0, p1, v3, v1, v2}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 4

    .line 1
    new-instance v0, Lp4/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/h;->c:Lu4/t;

    .line 4
    .line 5
    iget-object v2, p0, Lp4/b0;->f:Lp4/f;

    .line 6
    .line 7
    iget-object v3, p0, Lp4/h;->b:Lp4/j;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, p1, v2}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final m()I
    .locals 2

    .line 1
    iget-object v0, p0, Lp4/b0;->f:Lp4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp4/h;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lp4/h;->e()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget v0, p0, Lp4/h;->a:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp4/b0;->f:Lp4/f;

    .line 6
    .line 7
    iget v0, v0, Lp4/h;->a:I

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final o(Lp4/f;)Lp4/b0;
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/h;->b:Lp4/j;

    .line 2
    .line 3
    iget v1, v0, Lp4/j;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p1, "bogus opcode: "

    .line 9
    .line 10
    invoke-static {v0, p1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    sget-object v0, Lp4/k;->a0:Lp4/j;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    sget-object v0, Lp4/k;->b0:Lp4/j;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_2
    sget-object v0, Lp4/k;->Y:Lp4/j;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_3
    sget-object v0, Lp4/k;->Z:Lp4/j;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_4
    sget-object v0, Lp4/k;->W:Lp4/j;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_5
    sget-object v0, Lp4/k;->X:Lp4/j;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_6
    sget-object v0, Lp4/k;->U:Lp4/j;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_7
    sget-object v0, Lp4/k;->V:Lp4/j;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_8
    sget-object v0, Lp4/k;->S:Lp4/j;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_9
    sget-object v0, Lp4/k;->T:Lp4/j;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_a
    sget-object v0, Lp4/k;->Q:Lp4/j;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_b
    sget-object v0, Lp4/k;->R:Lp4/j;

    .line 49
    .line 50
    :goto_0
    new-instance v1, Lp4/b0;

    .line 51
    .line 52
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 53
    .line 54
    iget-object v3, p0, Lp4/h;->d:Lu4/p;

    .line 55
    .line 56
    invoke-direct {v1, v0, v2, v3, p1}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
