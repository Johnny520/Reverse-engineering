.class public final Ls/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/p0;


# instance fields
.field public final g:Ls/b0;

.field public final h:Lv1/k1;

.field public final i:Lr/k;

.field public final j:Lf/w;


# direct methods
.method public constructor <init>(Ls/b0;Lv1/k1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/f0;->g:Ls/b0;

    .line 5
    .line 6
    iput-object p2, p0, Ls/f0;->h:Lv1/k1;

    .line 7
    .line 8
    iget-object p1, p1, Ls/b0;->b:Lb0/j;

    .line 9
    .line 10
    invoke-virtual {p1}, Lb0/j;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr/k;

    .line 15
    .line 16
    iput-object p1, p0, Ls/f0;->i:Lr/k;

    .line 17
    .line 18
    invoke-static {}, Lf/l;->a()Lf/w;

    .line 19
    .line 20
    .line 21
    new-instance p1, Lf/w;

    .line 22
    .line 23
    invoke-direct {p1}, Lf/w;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ls/f0;->j:Lf/w;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;
    .locals 6

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-interface/range {v0 .. v5}, Lv1/p0;->D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final G0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->G0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final J(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->J(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final K(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->K(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final L0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->L0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final O0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->O0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final S(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->S(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0}, Lu2/c;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->e0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final getLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->i0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->l0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0}, Lu2/c;->q0()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final u0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0}, Lv1/o;->u0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final x0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->x0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final z(IILjava/util/Map;Lfg/l;)Lv1/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Ls/f0;->h:Lv1/k1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
