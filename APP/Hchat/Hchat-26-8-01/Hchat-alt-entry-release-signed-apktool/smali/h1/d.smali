.class public interface abstract Lh1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lu2/c;


# direct methods
.method public static D(Lx1/h0;Lf1/s;JJJLh1/c;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p9, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lx1/h0;->g:Lh1/b;

    .line 13
    .line 14
    invoke-interface {p2}, Lh1/d;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide p2

    .line 18
    invoke-static {p2, p3, v2, v3}, Lh1/d;->n0(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    move-wide v4, p2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-wide v4, p4

    .line 25
    :goto_0
    and-int/lit8 p2, p9, 0x20

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    sget-object p2, Lh1/f;->b:Lh1/f;

    .line 30
    .line 31
    move-object v9, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object/from16 v9, p8

    .line 34
    .line 35
    :goto_1
    const/high16 v8, 0x3f800000    # 1.0f

    .line 36
    .line 37
    move-object v0, p0

    .line 38
    move-object v1, p1

    .line 39
    move-wide/from16 v6, p6

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v9}, Lx1/h0;->m(Lf1/s;JJJFLh1/c;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic O(Lh1/d;JFJI)V
    .locals 6

    .line 1
    and-int/lit8 v0, p6, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lh1/d;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Le1/e;->b(J)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/high16 v0, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr p3, v0

    .line 16
    :cond_0
    move v1, p3

    .line 17
    and-int/lit8 p3, p6, 0x4

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Lh1/d;->I0()J

    .line 22
    .line 23
    .line 24
    move-result-wide p4

    .line 25
    :cond_1
    move-object v0, p0

    .line 26
    move-wide v2, p1

    .line 27
    move-wide v4, p4

    .line 28
    invoke-interface/range {v0 .. v5}, Lh1/d;->t0(FJJ)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic U(Lh1/d;Lf1/g;JFLf1/n;II)V
    .locals 7

    .line 1
    and-int/lit8 v0, p7, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p7, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const/high16 p4, 0x3f800000    # 1.0f

    .line 13
    .line 14
    :cond_1
    move v4, p4

    .line 15
    and-int/lit8 p2, p7, 0x10

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    const/4 p5, 0x0

    .line 20
    :cond_2
    move-object v5, p5

    .line 21
    and-int/lit8 p2, p7, 0x20

    .line 22
    .line 23
    if-eqz p2, :cond_3

    .line 24
    .line 25
    const/4 p6, 0x3

    .line 26
    :cond_3
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move v6, p6

    .line 29
    invoke-interface/range {v0 .. v6}, Lh1/d;->W0(Lf1/g;JFLf1/n;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static U0(Lh1/d;Lf1/g;JJFLf1/n;II)V
    .locals 13

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-wide v8, p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide/from16 v8, p4

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v1, v0, 0x20

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    move v10, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move/from16 v10, p6

    .line 20
    .line 21
    :goto_1
    and-int/lit16 v0, v0, 0x200

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    move v12, v0

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move/from16 v12, p8

    .line 29
    .line 30
    :goto_2
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    move-object v2, p0

    .line 33
    move-object v3, p1

    .line 34
    move-wide v6, p2

    .line 35
    move-object/from16 v11, p7

    .line 36
    .line 37
    invoke-interface/range {v2 .. v12}, Lh1/d;->v0(Lf1/g;JJJFLf1/n;I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic V0(Lh1/d;Lf1/s;JJFLh1/c;II)V
    .locals 9

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p9, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Lh1/d;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    invoke-static {p2, p3, v2, v3}, Lh1/d;->n0(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    move-wide v4, p2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-wide v4, p4

    .line 23
    :goto_0
    and-int/lit8 p2, p9, 0x8

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    move v6, p2

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v6, p6

    .line 32
    :goto_1
    and-int/lit8 p2, p9, 0x10

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    sget-object p2, Lh1/f;->b:Lh1/f;

    .line 37
    .line 38
    move-object v7, p2

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move-object/from16 v7, p7

    .line 41
    .line 42
    :goto_2
    and-int/lit8 p2, p9, 0x40

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    const/4 p2, 0x3

    .line 47
    move v8, p2

    .line 48
    :goto_3
    move-object v0, p0

    .line 49
    move-object v1, p1

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move/from16 v8, p8

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :goto_4
    invoke-interface/range {v0 .. v8}, Lh1/d;->d0(Lf1/s;JJFLh1/c;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static synthetic Z(Lh1/d;JJFII)V
    .locals 11

    .line 1
    and-int/lit8 v0, p7, 0x4

    .line 2
    .line 3
    const-wide/16 v4, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lh1/d;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    invoke-static {p3, p4, v4, v5}, Lh1/d;->n0(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    :cond_0
    move-wide v6, p3

    .line 16
    and-int/lit8 p3, p7, 0x8

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/high16 p3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    move v8, p3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move/from16 v8, p5

    .line 25
    .line 26
    :goto_0
    and-int/lit8 p3, p7, 0x40

    .line 27
    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    const/4 p3, 0x3

    .line 31
    move v10, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move/from16 v10, p6

    .line 34
    .line 35
    :goto_1
    sget-object v9, Lh1/f;->b:Lh1/f;

    .line 36
    .line 37
    move-object v1, p0

    .line 38
    move-wide v2, p1

    .line 39
    invoke-interface/range {v1 .. v10}, Lh1/d;->P0(JJJFLh1/c;I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static n0(JJ)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-float/2addr v1, v2

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v2

    .line 24
    long-to-int p0, p0

    .line 25
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    and-long p1, p2, v2

    .line 30
    .line 31
    long-to-int p1, p1

    .line 32
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    sub-float/2addr p0, p1

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long v4, p0

    .line 47
    shl-long p0, p1, v0

    .line 48
    .line 49
    and-long p2, v4, v2

    .line 50
    .line 51
    or-long/2addr p0, p2

    .line 52
    return-wide p0
.end method

.method public static synthetic s0(Lh1/d;Lf1/j;Lf1/s;FLh1/g;I)V
    .locals 6

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    move v3, p3

    .line 8
    and-int/lit8 p3, p5, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    sget-object p4, Lh1/f;->b:Lh1/f;

    .line 13
    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    and-int/lit8 p3, p5, 0x20

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    const/4 p3, 0x3

    .line 20
    :goto_0
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move v5, p3

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 p3, 0x0

    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-interface/range {v0 .. v5}, Lh1/d;->V(Lf1/j;Lf1/s;FLh1/c;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public abstract F0(Lf1/j;JFLh1/c;)V
.end method

.method public I0()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lh1/d;->z0()Lb5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Lf8/i;->B(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public abstract P0(JJJFLh1/c;I)V
.end method

.method public abstract V(Lf1/j;Lf1/s;FLh1/c;I)V
.end method

.method public abstract W0(Lf1/g;JFLf1/n;I)V
.end method

.method public a()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lh1/d;->z0()Lb5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public abstract a0(JJJF)V
.end method

.method public abstract d0(Lf1/s;JJFLh1/c;I)V
.end method

.method public abstract getLayoutDirection()Lu2/m;
.end method

.method public abstract t0(FJJ)V
.end method

.method public abstract v0(Lf1/g;JJJFLf1/n;I)V
.end method

.method public abstract x(JJLh1/c;)V
.end method

.method public y(JLfg/l;Li1/b;)V
    .locals 6

    .line 1
    invoke-interface {p0}, Lh1/d;->getLayoutDirection()Lu2/m;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v5, Lf1/p;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-direct {v5, p0, v0, p3}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-wide v3, p1

    .line 13
    move-object v0, p4

    .line 14
    invoke-virtual/range {v0 .. v5}, Li1/b;->e(Lu2/c;Lu2/m;JLfg/l;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public abstract z0()Lb5/c;
.end method
