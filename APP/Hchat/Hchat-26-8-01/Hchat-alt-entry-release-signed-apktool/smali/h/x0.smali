.class public abstract Lh/x0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/v;


# instance fields
.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh/x0;->u:I

    .line 2
    .line 3
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public G(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    iget p1, p0, Lh/x0;->u:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Lv1/m0;->G(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Lv1/m0;->G(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public K0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    iget p1, p0, Lh/x0;->u:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Lv1/m0;->p0(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Lv1/m0;->p0(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public Q(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    iget p1, p0, Lh/x0;->u:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Lv1/m0;->M(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Lv1/m0;->M(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public R0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    iget p1, p0, Lh/x0;->u:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Lv1/m0;->j(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Lv1/m0;->j(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 3

    .line 1
    invoke-virtual {p0, p2, p3, p4}, Lh/x0;->k1(Lv1/m0;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lh/x0;->l1()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-static {p3, p4, v0, v1}, Lu2/b;->e(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    :cond_0
    invoke-interface {p2, v0, v1}, Lv1/m0;->Q(J)Lv1/b1;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget p3, p2, Lv1/b1;->g:I

    .line 20
    .line 21
    iget p4, p2, Lv1/b1;->h:I

    .line 22
    .line 23
    new-instance v0, Lg0/g;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, p2, v1}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 27
    .line 28
    .line 29
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 30
    .line 31
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public abstract k1(Lv1/m0;J)J
.end method

.method public abstract l1()Z
.end method
