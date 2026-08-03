.class public abstract Li2/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:Lt2/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    invoke-static {v0}, Lx6/d;->D(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Li2/g0;->a:J

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Lx6/d;->D(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Li2/g0;->b:J

    .line 15
    .line 16
    sget-wide v0, Lf1/w;->f:J

    .line 17
    .line 18
    sput-wide v0, Li2/g0;->c:J

    .line 19
    .line 20
    sget-wide v0, Lf1/w;->b:J

    .line 21
    .line 22
    const-wide/16 v2, 0x10

    .line 23
    .line 24
    cmp-long v2, v0, v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Lt2/c;

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Lt2/c;-><init>(J)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v2, Lt2/n;->a:Lt2/n;

    .line 35
    .line 36
    :goto_0
    sput-object v2, Li2/g0;->d:Lt2/o;

    .line 37
    .line 38
    return-void
.end method

.method public static final a(Li2/f0;JLf1/s;FJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;Lh1/c;)Li2/f0;
    .locals 24

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-wide/from16 v12, p12

    move-object/from16 v4, p19

    .line 1
    sget-object v16, Lu2/o;->b:[Lu2/p;

    const-wide v16, 0xff00000000L

    and-long v18, v5, v16

    const-wide/16 v20, 0x0

    cmp-long v18, v18, v20

    const-wide/16 v22, 0x10

    if-nez v18, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v14, v0, Li2/f0;->b:J

    .line 3
    invoke-static {v5, v6, v14, v15}, Lu2/o;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_1

    :goto_0
    if-nez v3, :cond_5

    cmp-long v14, v1, v22

    if-eqz v14, :cond_5

    .line 4
    iget-object v14, v0, Li2/f0;->a:Lt2/o;

    .line 5
    invoke-interface {v14}, Lt2/o;->b()J

    move-result-wide v14

    invoke-static {v1, v2, v14, v15}, Lf1/w;->c(JJ)Z

    move-result v14

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v15, p14

    :cond_2
    move-wide/from16 v4, p17

    :cond_3
    move-object/from16 v6, p20

    :cond_4
    move-object/from16 v7, p21

    goto/16 :goto_7

    :cond_5
    :goto_1
    if-eqz v8, :cond_6

    .line 6
    iget-object v14, v0, Li2/f0;->d:Lm2/i;

    .line 7
    invoke-virtual {v8, v14}, Lm2/i;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    :cond_6
    if-eqz v7, :cond_7

    .line 8
    iget-object v14, v0, Li2/f0;->c:Lm2/k;

    .line 9
    invoke-virtual {v7, v14}, Lm2/k;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    :cond_7
    if-eqz v10, :cond_8

    .line 10
    iget-object v14, v0, Li2/f0;->f:Lm2/p;

    if-ne v10, v14, :cond_1

    :cond_8
    and-long v14, v12, v16

    cmp-long v14, v14, v20

    if-nez v14, :cond_9

    goto :goto_2

    .line 11
    :cond_9
    iget-wide v14, v0, Li2/f0;->h:J

    .line 12
    invoke-static {v12, v13, v14, v15}, Lu2/o;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_1

    :goto_2
    if-eqz v4, :cond_a

    .line 13
    iget-object v14, v0, Li2/f0;->m:Lt2/l;

    .line 14
    invoke-virtual {v4, v14}, Lt2/l;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 15
    :cond_a
    iget-object v14, v0, Li2/f0;->a:Lt2/o;

    .line 16
    invoke-interface {v14}, Lt2/o;->c()Lf1/s;

    move-result-object v14

    invoke-static {v3, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    if-eqz v3, :cond_b

    .line 17
    iget-object v14, v0, Li2/f0;->a:Lt2/o;

    .line 18
    invoke-interface {v14}, Lt2/o;->a()F

    move-result v14

    cmpg-float v14, p4, v14

    if-nez v14, :cond_1

    :cond_b
    if-eqz v9, :cond_c

    .line 19
    iget-object v14, v0, Li2/f0;->e:Lm2/j;

    .line 20
    invoke-virtual {v9, v14}, Lm2/j;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    :cond_c
    if-eqz v11, :cond_d

    .line 21
    iget-object v14, v0, Li2/f0;->g:Ljava/lang/String;

    .line 22
    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    :cond_d
    if-eqz p14, :cond_e

    .line 23
    iget-object v14, v0, Li2/f0;->i:Lt2/a;

    move-object/from16 v15, p14

    .line 24
    invoke-virtual {v15, v14}, Lt2/a;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_3

    :cond_e
    move-object/from16 v15, p14

    :goto_3
    if-eqz p15, :cond_f

    .line 25
    iget-object v14, v0, Li2/f0;->j:Lt2/p;

    move-object/from16 v4, p15

    .line 26
    invoke-virtual {v4, v14}, Lt2/p;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_4

    :cond_f
    move-object/from16 v4, p15

    :goto_4
    if-eqz p16, :cond_10

    .line 27
    iget-object v14, v0, Li2/f0;->k:Lp2/b;

    move-object/from16 v4, p16

    .line 28
    invoke-virtual {v4, v14}, Lp2/b;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    :goto_5
    move-wide/from16 v4, p17

    goto :goto_6

    :cond_10
    move-object/from16 v4, p16

    goto :goto_5

    :goto_6
    cmp-long v6, v4, v22

    if-eqz v6, :cond_11

    .line 29
    iget-wide v6, v0, Li2/f0;->l:J

    .line 30
    invoke-static {v4, v5, v6, v7}, Lf1/w;->c(JJ)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_11
    move-object/from16 v6, p20

    if-eqz v6, :cond_12

    .line 31
    iget-object v7, v0, Li2/f0;->n:Lf1/q0;

    .line 32
    invoke-virtual {v6, v7}, Lf1/q0;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_12
    move-object/from16 v7, p21

    if-eqz v7, :cond_13

    .line 33
    iget-object v14, v0, Li2/f0;->o:Lh1/c;

    .line 34
    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    goto :goto_7

    :cond_13
    return-object v0

    .line 35
    :goto_7
    sget-object v14, Lt2/n;->a:Lt2/n;

    if-eqz v3, :cond_17

    .line 36
    instance-of v1, v3, Lf1/t0;

    if-eqz v1, :cond_15

    move-object v1, v3

    check-cast v1, Lf1/t0;

    .line 37
    iget-wide v1, v1, Lf1/t0;->a:J

    move/from16 v3, p4

    .line 38
    invoke-static {v1, v2, v3}, Lig/a;->N(JF)J

    move-result-wide v1

    cmp-long v3, v1, v22

    if-eqz v3, :cond_14

    .line 39
    new-instance v3, Lt2/c;

    invoke-direct {v3, v1, v2}, Lt2/c;-><init>(J)V

    goto :goto_8

    :cond_14
    move-object v3, v14

    goto :goto_8

    :cond_15
    move/from16 v1, p4

    .line 40
    instance-of v2, v3, Lf1/p0;

    if-eqz v2, :cond_16

    new-instance v2, Lt2/b;

    check-cast v3, Lf1/p0;

    invoke-direct {v2, v3, v1}, Lt2/b;-><init>(Lf1/p0;F)V

    move-object v3, v2

    goto :goto_8

    .line 41
    :cond_16
    invoke-static {}, Lokio/a;->k()V

    const/4 v0, 0x0

    return-object v0

    :cond_17
    cmp-long v3, v1, v22

    if-eqz v3, :cond_14

    .line 42
    new-instance v3, Lt2/c;

    invoke-direct {v3, v1, v2}, Lt2/c;-><init>(J)V

    .line 43
    :goto_8
    iget-object v1, v0, Li2/f0;->a:Lt2/o;

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    instance-of v2, v3, Lt2/b;

    move/from16 v19, v2

    if-eqz v2, :cond_19

    instance-of v2, v1, Lt2/b;

    if-eqz v2, :cond_19

    .line 46
    new-instance v2, Lt2/b;

    check-cast v3, Lt2/b;

    .line 47
    iget-object v14, v3, Lt2/b;->a:Lf1/p0;

    .line 48
    iget v3, v3, Lt2/b;->b:F

    .line 49
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v19

    if-eqz v19, :cond_18

    .line 50
    check-cast v1, Lt2/b;

    .line 51
    iget v3, v1, Lt2/b;->b:F

    .line 52
    :cond_18
    invoke-direct {v2, v14, v3}, Lt2/b;-><init>(Lf1/p0;F)V

    move-object v3, v2

    goto :goto_9

    :cond_19
    if-eqz v19, :cond_1a

    .line 53
    instance-of v2, v1, Lt2/b;

    if-nez v2, :cond_1a

    goto :goto_9

    :cond_1a
    if-nez v19, :cond_1c

    .line 54
    instance-of v2, v1, Lt2/b;

    if-eqz v2, :cond_1c

    :cond_1b
    move-object v3, v1

    goto :goto_9

    .line 55
    :cond_1c
    invoke-virtual {v3, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :goto_9
    if-nez v10, :cond_1d

    .line 56
    iget-object v1, v0, Li2/f0;->f:Lm2/p;

    move-object v10, v1

    :cond_1d
    if-nez v18, :cond_1e

    .line 57
    iget-wide v1, v0, Li2/f0;->b:J

    goto :goto_a

    :cond_1e
    move-wide/from16 v1, p5

    :goto_a
    if-nez p7, :cond_1f

    .line 58
    iget-object v14, v0, Li2/f0;->c:Lm2/k;

    goto :goto_b

    :cond_1f
    move-object/from16 v14, p7

    :goto_b
    if-nez v8, :cond_20

    .line 59
    iget-object v8, v0, Li2/f0;->d:Lm2/i;

    :cond_20
    if-nez v9, :cond_21

    .line 60
    iget-object v9, v0, Li2/f0;->e:Lm2/j;

    :cond_21
    if-nez v11, :cond_22

    .line 61
    iget-object v11, v0, Li2/f0;->g:Ljava/lang/String;

    :cond_22
    and-long v16, v12, v16

    cmp-long v16, v16, v20

    if-nez v16, :cond_23

    .line 62
    iget-wide v12, v0, Li2/f0;->h:J

    :cond_23
    if-nez v15, :cond_24

    .line 63
    iget-object v15, v0, Li2/f0;->i:Lt2/a;

    :cond_24
    move-wide/from16 p2, v1

    if-nez p15, :cond_25

    .line 64
    iget-object v1, v0, Li2/f0;->j:Lt2/p;

    goto :goto_c

    :cond_25
    move-object/from16 v1, p15

    :goto_c
    if-nez p16, :cond_26

    .line 65
    iget-object v2, v0, Li2/f0;->k:Lp2/b;

    goto :goto_d

    :cond_26
    move-object/from16 v2, p16

    :goto_d
    cmp-long v16, v4, v22

    if-eqz v16, :cond_27

    goto :goto_e

    .line 66
    :cond_27
    iget-wide v4, v0, Li2/f0;->l:J

    :goto_e
    move-object/from16 p12, v1

    if-nez p19, :cond_28

    .line 67
    iget-object v1, v0, Li2/f0;->m:Lt2/l;

    goto :goto_f

    :cond_28
    move-object/from16 v1, p19

    :goto_f
    if-nez v6, :cond_29

    .line 68
    iget-object v6, v0, Li2/f0;->n:Lf1/q0;

    :cond_29
    if-nez v7, :cond_2a

    .line 69
    iget-object v0, v0, Li2/f0;->o:Lh1/c;

    goto :goto_10

    :cond_2a
    move-object v0, v7

    .line 70
    :goto_10
    new-instance v7, Li2/f0;

    move-object/from16 p18, v0

    move-object/from16 p16, v1

    move-object/from16 p13, v2

    move-object/from16 p1, v3

    move-wide/from16 p14, v4

    move-object/from16 p17, v6

    move-object/from16 p0, v7

    move-object/from16 p5, v8

    move-object/from16 p6, v9

    move-object/from16 p7, v10

    move-object/from16 p8, v11

    move-wide/from16 p9, v12

    move-object/from16 p4, v14

    move-object/from16 p11, v15

    invoke-direct/range {p0 .. p18}, Li2/f0;-><init>(Lt2/o;JLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;Lh1/c;)V

    move-object/from16 v0, p0

    return-object v0
.end method
