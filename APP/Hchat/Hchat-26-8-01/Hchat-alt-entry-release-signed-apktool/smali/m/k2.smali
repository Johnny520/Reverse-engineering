.class public final Lm/k2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/u1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lm/k2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm/k2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lm/k2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static b(Lm/k2;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lm/k2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Lr/p;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-virtual {v0}, Lr/z;->h()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p0}, Lm/k2;->c()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-gt p1, p0, :cond_4

    .line 28
    .line 29
    if-gt v2, p1, :cond_4

    .line 30
    .line 31
    iget-object p0, v1, Lr/p;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    move v1, v3

    .line 38
    :goto_0
    if-ge v1, v0, :cond_2

    .line 39
    .line 40
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v4, v2

    .line 45
    check-cast v4, Lr/q;

    .line 46
    .line 47
    iget v4, v4, Lr/q;->a:I

    .line 48
    .line 49
    if-ne v4, p1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v2, 0x0

    .line 56
    :goto_1
    check-cast v2, Lr/q;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget p0, v2, Lr/q;->o:I

    .line 61
    .line 62
    return p0

    .line 63
    :cond_3
    :goto_2
    return v3

    .line 64
    :cond_4
    invoke-static {v1}, Lac/p;->P(Lr/p;)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0}, Lr/z;->h()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sub-int/2addr p1, v1

    .line 73
    mul-int/2addr p1, p0

    .line 74
    invoke-virtual {v0}, Lr/z;->i()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    sub-int/2addr p1, p0

    .line 79
    return p1
.end method


# virtual methods
.method public final a(F)F
    .locals 4

    .line 1
    iget v0, p0, Lm/k2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm/k2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm/u1;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lm/u1;->a(F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object v0, p0, Lm/k2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lm/o2;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    cmpg-float v1, v1, v2

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v0, Lm/o2;->h:Lm/c2;

    .line 30
    .line 31
    invoke-virtual {v1}, Lm/c2;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    :goto_0
    iget-object v1, p0, Lm/k2;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lm/m2;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lm/o2;->h(F)J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-virtual {v0, v2, v3}, Lm/o2;->e(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    const/4 p1, 0x2

    .line 56
    invoke-virtual {v1, p1, v2, v3}, Lm/m2;->a(IJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0, v1, v2}, Lm/o2;->g(J)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lm/o2;->d(F)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :cond_1
    new-instance p1, Lk/e1;

    .line 70
    .line 71
    const-string v0, "The fling animation was cancelled"

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {p1, v0, v1}, Lo/c;-><init>(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm/k2;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr/z;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lr/p;->k:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v0}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lr/q;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v0, v0, Lr/q;->a:I

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method
