.class public final Lr7/i;
.super Lr7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lr7/i;->q:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final P()I
    .locals 2

    .line 1
    iget v0, p0, Lr7/i;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr7/b;->k:[B

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, v1}, Lk7/a;->x([BI)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0xffff

    .line 22
    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    mul-int/lit8 v0, v0, 0x4

    .line 29
    .line 30
    :goto_0
    return v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final S(I)V
    .locals 2

    .line 1
    iget v0, p0, Lr7/i;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr7/b;->k:[B

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/4 v0, -0x1

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    const p1, 0xffff

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    div-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    invoke-static {p1}, Lr7/k;->R(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, p0, Lr7/b;->k:[B

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, v1, p1}, Lk7/a;->E([BII)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Lr7/i;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr7/k;

    .line 7
    .line 8
    if-ne p1, p0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lr7/k;->N()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Lr7/k;->N()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {v0, p1}, Ly7/a;->b(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    return p1

    .line 25
    :pswitch_0
    check-cast p1, Lr7/k;

    .line 26
    .line 27
    if-ne p1, p0, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, Lr7/k;->N()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Lr7/k;->N()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {v0, p1}, Ly7/a;->b(II)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    :goto_1
    return p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
