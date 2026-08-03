.class public Lo7/c;
.super Lo7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic m:I

.field public final n:Lr7/g;


# direct methods
.method public constructor <init>(Lk7/f;Lr7/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo7/c;->m:I

    .line 12
    invoke-direct {p0, p1}, Lo7/b;-><init>(Lk7/f;)V

    .line 13
    iput-object p2, p0, Lo7/c;->n:Lr7/g;

    return-void
.end method

.method public constructor <init>(Lr7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lo7/c;->m:I

    .line 3
    .line 4
    sget-object v0, Lr7/k;->o:Lokio/a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Lo7/b;-><init>(Lk7/f;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lo7/c;->n:Lr7/g;

    .line 10
    .line 11
    return-void
.end method

.method private final j0()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 3

    .line 1
    iget v0, p0, Lo7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo7/c;->n:Lr7/g;

    .line 7
    .line 8
    invoke-interface {v0}, Lr7/g;->get()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Lo7/c;->c0(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lr7/k;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lk7/a;->G(Lq7/b;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Lo7/c;->n:Lr7/g;

    .line 32
    .line 33
    invoke-interface {v0}, Lr7/g;->get()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v0}, Lo7/b;->c0(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lo7/b;->Y(Lq7/b;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public R()Z
    .locals 1

    .line 1
    iget v0, p0, Lo7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo7/b;->R()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public X()V
    .locals 2

    .line 1
    iget v0, p0, Lo7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo7/b;->X()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lo7/c;->n:Lr7/g;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lr7/g;->k(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public Z()V
    .locals 1

    .line 1
    iget v0, p0, Lo7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo7/b;->Z()V

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return-void

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c0(I)V
    .locals 1

    .line 1
    iget v0, p0, Lo7/c;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lo7/b;->c0(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Lo7/b;->d0(IZ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lo7/c;->n:Lr7/g;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lr7/g;->k(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
