.class public final Lv1/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/p0;
.implements Lv1/o;


# instance fields
.field public final synthetic g:Lv1/o;

.field public final h:Lu2/m;


# direct methods
.method public constructor <init>(Lv1/o;Lu2/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv1/s;->g:Lv1/o;

    .line 5
    .line 6
    iput-object p2, p0, Lv1/s;->h:Lu2/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;
    .locals 1

    .line 1
    const/4 p5, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, p5

    .line 5
    :cond_0
    if-gez p2, :cond_1

    .line 6
    .line 7
    move p2, p5

    .line 8
    :cond_1
    const/high16 p5, -0x1000000

    .line 9
    .line 10
    and-int v0, p1, p5

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    and-int/2addr p5, p2

    .line 15
    if-nez p5, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    new-instance p5, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Size("

    .line 21
    .line 22
    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, " x "

    .line 29
    .line 30
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 37
    .line 38
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p5

    .line 45
    invoke-static {p5}, Lu1/a;->b(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    new-instance p5, Lv1/r;

    .line 49
    .line 50
    invoke-direct {p5, p1, p2, p3, p4}, Lv1/r;-><init>(IILjava/util/Map;Lfg/l;)V

    .line 51
    .line 52
    .line 53
    return-object p5
.end method

.method public final G0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->h:Lu2/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
    iget-object v0, p0, Lv1/s;->g:Lv1/o;

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
