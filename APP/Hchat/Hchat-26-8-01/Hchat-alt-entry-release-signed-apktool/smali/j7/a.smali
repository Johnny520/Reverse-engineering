.class public final Lj7/a;
.super Lk7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq7/a;


# instance fields
.field public final synthetic m:I

.field public final n:Lr7/f;


# direct methods
.method public constructor <init>(Lr7/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj7/a;->m:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lk7/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lj7/a;->n:Lr7/f;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-direct {p0}, Lk7/b;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lj7/a;->n:Lr7/f;

    .line 16
    .line 17
    iput-object p0, p1, Lk7/a;->j:Lk7/a;

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


# virtual methods
.method public B(Lq7/b;)V
    .locals 1

    .line 1
    iget v0, p0, Lj7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lk7/b;->B(Lq7/b;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lj7/a;->n:Lr7/f;

    .line 11
    .line 12
    iget v0, v0, Lr7/f;->n:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lk7/b;->c0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lo7/b;->Y(Lq7/b;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final X()V
    .locals 2

    .line 1
    iget v0, p0, Lj7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lj7/a;->n:Lr7/f;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 19
    .line 20
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Lj7/a;->n:Lr7/f;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(Lk7/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj7/a;->n:Lr7/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget p1, v0, Lr7/f;->n:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lk7/b;->c0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final n()Lk7/a;
    .locals 3

    .line 1
    iget v0, p0, Lj7/a;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv7/f0;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Lr7/c;-><init>(II)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, Lv7/g;

    .line 16
    .line 17
    invoke-direct {v0}, Lv7/g;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
