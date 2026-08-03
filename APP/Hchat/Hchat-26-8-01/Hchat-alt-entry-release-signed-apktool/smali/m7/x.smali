.class public Lm7/x;
.super Lm7/q;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lk7/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm7/x;->l:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lm7/q;-><init>(Lk7/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private O()V
    .locals 0

    .line 1
    return-void
.end method

.method private P()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public L()Lm7/q;
    .locals 1

    .line 1
    iget v0, p0, Lm7/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lm7/q;->L()Lm7/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-super {p0}, Lm7/q;->L()Lm7/q;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lm7/i;

    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public M()V
    .locals 1

    .line 1
    iget v0, p0, Lm7/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 8
    .line 9
    check-cast v0, Lm7/w;

    .line 10
    .line 11
    invoke-virtual {v0}, Lm7/b;->Y()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public N()V
    .locals 1

    .line 1
    iget v0, p0, Lm7/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 8
    .line 9
    check-cast v0, Lm7/w;

    .line 10
    .line 11
    invoke-virtual {v0}, Lm7/b;->Z()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lm7/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lm7/q;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lm7/w;

    .line 15
    .line 16
    iget-object v2, v1, Ll7/a;->m:Lp7/a;

    .line 17
    .line 18
    check-cast v2, Lp7/m;

    .line 19
    .line 20
    iget-object v2, v2, Lp7/m;->s:Lr7/f;

    .line 21
    .line 22
    iget v2, v2, Lr7/f;->n:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lm7/b;->V(I)Lr7/o;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v1, Lr7/r;->m:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v2

    .line 35
    :goto_0
    invoke-static {v1}, Ly7/a;->f(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Lm7/w;

    .line 43
    .line 44
    invoke-virtual {v1}, Lm7/w;->c0()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Ly7/a;->f(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v3, "<!--"

    .line 57
    .line 58
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast v0, Lm7/w;

    .line 62
    .line 63
    iget-object v3, v0, Ll7/a;->m:Lp7/a;

    .line 64
    .line 65
    check-cast v3, Lp7/m;

    .line 66
    .line 67
    iget-object v3, v3, Lp7/m;->s:Lr7/f;

    .line 68
    .line 69
    iget v3, v3, Lr7/f;->n:I

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Lm7/b;->V(I)Lr7/o;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    iget-object v2, v0, Lr7/r;->m:Ljava/lang/String;

    .line 78
    .line 79
    :cond_1
    const-string v0, "-->"

    .line 80
    .line 81
    invoke-static {v1, v2, v0}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    check-cast v0, Lm7/w;

    .line 87
    .line 88
    invoke-virtual {v0}, Lm7/w;->c0()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    const-string v0, "null"

    .line 95
    .line 96
    :cond_3
    :goto_1
    return-object v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public y()Z
    .locals 1

    .line 1
    iget v0, p0, Lm7/x;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lm7/q;->y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 12
    .line 13
    check-cast v0, Lm7/w;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm7/w;->y()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
