.class public Ld7/b;
.super Lo7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lk7/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld7/b;->m:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lo7/b;-><init>(Lk7/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 1

    .line 1
    iget v0, p0, Ld7/b;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :goto_0
    :pswitch_0
    invoke-virtual {p1}, Lq7/b;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ld7/k;

    .line 14
    .line 15
    invoke-direct {v0}, Ld7/k;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public W(Lk7/a;)V
    .locals 1

    .line 1
    iget v0, p0, Ld7/b;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    check-cast p1, Lm7/q;

    .line 8
    .line 9
    invoke-virtual {p1}, Lm7/q;->N()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    check-cast p1, Lm7/b;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ld7/b;->j0(Lm7/b;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j0(Lm7/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lm7/b;->Z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
