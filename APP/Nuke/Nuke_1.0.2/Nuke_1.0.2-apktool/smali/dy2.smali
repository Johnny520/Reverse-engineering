.class public final Ldy2;
.super Lij0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final e:Lxt;


# direct methods
.method public constructor <init>(Loa0;Lkt2;Ls72;Lxt;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    iput-object p4, p0, Ldy2;->e:Lxt;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "target == null"

    .line 10
    .line 11
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldy2;->e:Lxt;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "????"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, La40;->f()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final i(Loa0;)La40;
    .locals 3

    .line 1
    new-instance v0, Ldy2;

    .line 2
    .line 3
    iget-object v1, p0, La40;->d:Ls72;

    .line 4
    .line 5
    iget-object v2, p0, Ldy2;->e:Lxt;

    .line 6
    .line 7
    iget-object p0, p0, La40;->c:Lkt2;

    .line 8
    .line 9
    invoke-direct {v0, p1, p0, v1, v2}, Ldy2;-><init>(Loa0;Lkt2;Ls72;Lxt;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final k(Ls72;)La40;
    .locals 3

    .line 1
    new-instance v0, Ldy2;

    .line 2
    .line 3
    iget-object v1, p0, La40;->c:Lkt2;

    .line 4
    .line 5
    iget-object v2, p0, Ldy2;->e:Lxt;

    .line 6
    .line 7
    iget-object p0, p0, La40;->b:Loa0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, p1, v2}, Ldy2;-><init>(Loa0;Lkt2;Ls72;Lxt;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldy2;->e:Lxt;

    .line 2
    .line 3
    invoke-virtual {v0}, La40;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, La40;->e()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sub-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget v0, p0, La40;->a:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldy2;->e:Lxt;

    .line 6
    .line 7
    iget p0, p0, La40;->a:I

    .line 8
    .line 9
    if-ltz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final o(Lxt;)Ldy2;
    .locals 3

    .line 1
    iget-object v0, p0, La40;->b:Loa0;

    .line 2
    .line 3
    iget v1, v0, Loa0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p0, "bogus opcode: "

    .line 9
    .line 10
    invoke-static {p0, v0}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object v0, Lpa0;->Z:Loa0;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    sget-object v0, Lpa0;->a0:Loa0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_2
    sget-object v0, Lpa0;->X:Loa0;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_3
    sget-object v0, Lpa0;->Y:Loa0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_4
    sget-object v0, Lpa0;->V:Loa0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_5
    sget-object v0, Lpa0;->W:Loa0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_6
    sget-object v0, Lpa0;->T:Loa0;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_7
    sget-object v0, Lpa0;->U:Loa0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_8
    sget-object v0, Lpa0;->R:Loa0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_9
    sget-object v0, Lpa0;->S:Loa0;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_a
    sget-object v0, Lpa0;->P:Loa0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_b
    sget-object v0, Lpa0;->Q:Loa0;

    .line 49
    .line 50
    :goto_0
    new-instance v1, Ldy2;

    .line 51
    .line 52
    iget-object v2, p0, La40;->c:Lkt2;

    .line 53
    .line 54
    iget-object p0, p0, La40;->d:Ls72;

    .line 55
    .line 56
    invoke-direct {v1, v0, v2, p0, p1}, Ldy2;-><init>(Loa0;Lkt2;Ls72;Lxt;)V

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
