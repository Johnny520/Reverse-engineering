.class public Ln4;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg22;
.implements Lkh1;
.implements Lq50;
.implements Lnu;
.implements Lsh0;
.implements Lx00;
.implements Lk40;
.implements Lz92;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Ln4;->h:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lm4;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lm4;-><init>(Ln4;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    new-instance p1, Lle1;

    .line 18
    .line 19
    invoke-direct {p1}, Lle1;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget-boolean p0, p1, Lle1;->i:Z

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-boolean p0, p1, Lle1;->j:Z

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const-string p0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 37
    .line 38
    invoke-static {p0}, Lk22;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Lle1;->a()V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    iput-boolean p0, p1, Lle1;->j:Z

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lhh1;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p1, v0}, Lhh1;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 58
    .line 59
    return-void

    .line 60
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    const/16 v0, 0x10

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 75
    .line 76
    return-void

    .line 77
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lgt2;

    .line 81
    .line 82
    sget-object v0, Lse;->b:Lsl0;

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 88
    .line 89
    return-void

    .line 90
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance p1, Lz8;

    .line 94
    .line 95
    const/16 v0, 0xe

    .line 96
    .line 97
    invoke-direct {p1, v0}, Lz8;-><init>(I)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    .line 101
    .line 102
    return-void

    .line 103
    :sswitch_6
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object p1, Liy2;->l:Liy2;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v0, Lud0;

    .line 114
    .line 115
    invoke-direct {v0, p1}, Lud0;-><init>(Liy2;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Ln4;->i:Ljava/lang/Object;

    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_6
        0x8 -> :sswitch_5
        0xb -> :sswitch_4
        0xc -> :sswitch_3
        0xf -> :sswitch_2
        0x15 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 156
    iput p1, p0, Ln4;->h:I

    iput-object p2, p0, Ln4;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x17

    iput v0, p0, Ln4;->h:I

    .line 134
    new-instance v0, Lr80;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lr80;-><init>(Landroid/content/Context;I)V

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object v0, p0, Ln4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbf2;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Ln4;->h:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lir0;Lq43;)V
    .locals 0

    const/16 p1, 0x14

    iput p1, p0, Ln4;->h:I

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p2, p0, Ln4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ltd1;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Ln4;->h:I

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v0, Lr62;

    invoke-direct {v0, p1, p2}, Lr62;-><init>(Ljava/io/InputStream;Ltd1;)V

    iput-object v0, p0, Ln4;->i:Ljava/lang/Object;

    const/high16 p0, 0x500000

    .line 129
    invoke-virtual {v0, p0}, Lr62;->mark(I)V

    return-void
.end method

.method public constructor <init>(Ll40;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Ln4;->h:I

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v0, Ljava/util/HashMap;

    .line 132
    iget-object p1, p1, Ll40;->a:Ljava/util/HashMap;

    .line 133
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ln4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([I[F[[F)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x2

    iput v2, v0, Ln4;->h:I

    .line 139
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 140
    array-length v3, v1

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    new-array v5, v3, [[Lsf;

    const/4 v6, 0x0

    move v8, v4

    move v9, v8

    move v7, v6

    :goto_0
    if-ge v7, v3, :cond_5

    .line 141
    aget v10, p1, v7

    const/4 v11, 0x3

    if-eqz v10, :cond_0

    if-eq v10, v4, :cond_3

    if-eq v10, v2, :cond_2

    if-eq v10, v11, :cond_1

    const/4 v11, 0x4

    if-eq v10, v11, :cond_0

    const/4 v11, 0x5

    if-eq v10, v11, :cond_0

    move v10, v9

    goto :goto_3

    :cond_0
    move v10, v11

    goto :goto_3

    :cond_1
    if-ne v8, v4, :cond_3

    goto :goto_2

    :goto_1
    move v10, v8

    goto :goto_3

    :cond_2
    :goto_2
    move v8, v2

    goto :goto_1

    :cond_3
    move v8, v4

    goto :goto_1

    .line 142
    :goto_3
    aget-object v9, p3, v7

    add-int/lit8 v17, v7, 0x1

    .line 143
    aget-object v18, p3, v17

    .line 144
    aget v11, v1, v7

    .line 145
    aget v12, v1, v17

    .line 146
    array-length v13, v9

    div-int/2addr v13, v2

    array-length v14, v9

    rem-int/2addr v14, v2

    add-int/2addr v13, v14

    .line 147
    new-array v14, v13, [Lsf;

    move v15, v6

    :goto_4
    if-ge v15, v13, :cond_4

    mul-int/lit8 v16, v15, 0x2

    move-object/from16 v19, v9

    .line 148
    new-instance v9, Lsf;

    move/from16 v20, v13

    .line 149
    aget v13, v19, v16

    add-int/lit8 v21, v16, 0x1

    move-object/from16 v22, v14

    .line 150
    aget v14, v19, v21

    .line 151
    aget v16, v18, v16

    .line 152
    aget v21, v18, v21

    move/from16 v23, v21

    move/from16 v21, v15

    move/from16 v15, v16

    move/from16 v16, v23

    .line 153
    invoke-direct/range {v9 .. v16}, Lsf;-><init>(IFFFFFF)V

    aput-object v9, v22, v21

    add-int/lit8 v15, v21, 0x1

    move-object/from16 v9, v19

    move/from16 v13, v20

    move-object/from16 v14, v22

    goto :goto_4

    :cond_4
    move-object/from16 v22, v14

    .line 154
    aput-object v22, v5, v7

    move v9, v10

    move/from16 v7, v17

    goto :goto_0

    .line 155
    :cond_5
    iput-object v5, v0, Ln4;->i:Ljava/lang/Object;

    return-void
.end method

.method public static B(Ln4;I)Li81;
    .locals 8

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld91;

    .line 4
    .line 5
    invoke-static {}, Ltl;->B()Lvr2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lvr2;->e()Lin0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Ltl;->K(Lvr2;)Lvr2;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :try_start_0
    iget-object v3, p0, Ld91;->f:Lnx1;

    .line 22
    .line 23
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lx81;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-static {v0, v2, v1}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ld91;->p:Lj81;

    .line 33
    .line 34
    iget-wide v1, v3, Lx81;->j:J

    .line 35
    .line 36
    iget-boolean p0, p0, Ld91;->d:Z

    .line 37
    .line 38
    new-instance v4, Lnx0;

    .line 39
    .line 40
    invoke-direct {v4, p1, v3}, Lnx0;-><init>(ILx81;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, Lj81;->c:Lf90;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    iget-object v0, v0, Lj81;->b:Lb5;

    .line 48
    .line 49
    new-instance v5, Lp22;

    .line 50
    .line 51
    iget-object v6, v3, Lf90;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Lq22;

    .line 54
    .line 55
    instance-of v7, v6, Lsa;

    .line 56
    .line 57
    invoke-direct {v5, v3, p1, v0, v4}, Lp22;-><init>(Lf90;ILb5;Lnx0;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lfz;

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, Lfz;-><init>(J)V

    .line 63
    .line 64
    .line 65
    iput-object v0, v5, Lp22;->k:Lfz;

    .line 66
    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    if-eqz p0, :cond_1

    .line 71
    .line 72
    check-cast v6, Lsa;

    .line 73
    .line 74
    iget-object p0, v6, Lsa;->i:Ljava/util/PriorityQueue;

    .line 75
    .line 76
    new-instance v1, Lj32;

    .line 77
    .line 78
    invoke-direct {v1, v0, v5}, Lj32;-><init>(ILp22;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-boolean p0, v6, Lsa;->j:Z

    .line 85
    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    iput-boolean v0, v6, Lsa;->j:Z

    .line 89
    .line 90
    iget-object p0, v6, Lsa;->h:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {p0, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    check-cast v6, Lsa;

    .line 97
    .line 98
    iget-object p0, v6, Lsa;->i:Ljava/util/PriorityQueue;

    .line 99
    .line 100
    new-instance v1, Lj32;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-direct {v1, v2, v5}, Lj32;-><init>(ILp22;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-boolean p0, v6, Lsa;->j:Z

    .line 110
    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iput-boolean v0, v6, Lsa;->j:Z

    .line 114
    .line 115
    iget-object p0, v6, Lsa;->h:Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {p0, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-interface {v6, v5}, Lq22;->a(Lp22;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    :goto_1
    const-string p0, "compose:lazy:schedule_prefetch:index"

    .line 125
    .line 126
    int-to-long v0, p1

    .line 127
    invoke-static {p0, v0, v1}, Ltp0;->R(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    return-object v5

    .line 131
    :cond_4
    sget-object p0, Lsn;->F:Lsn;

    .line 132
    .line 133
    return-object p0

    .line 134
    :catchall_0
    move-exception p0

    .line 135
    invoke-static {v0, v2, v1}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 136
    .line 137
    .line 138
    throw p0
.end method


# virtual methods
.method public A(FFJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb5;->q()Lqp;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p3, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v2

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p0, v1, p4}, Lqp;->g(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lqp;->b(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, Lqp;->g(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public C(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb5;->q()Lqp;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, Lqp;->g(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(Ld11;JLd61;J)J
    .locals 7

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxm0;

    .line 4
    .line 5
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lz01;

    .line 10
    .line 11
    iget-wide v0, p0, Lz01;->a:J

    .line 12
    .line 13
    iget p0, p1, Ld11;->a:I

    .line 14
    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    shr-long v3, v0, v2

    .line 18
    .line 19
    long-to-int v3, v3

    .line 20
    add-int/2addr p0, v3

    .line 21
    shr-long v3, p5, v2

    .line 22
    .line 23
    long-to-int v3, v3

    .line 24
    shr-long v4, p2, v2

    .line 25
    .line 26
    long-to-int v4, v4

    .line 27
    sget-object v5, Ld61;->h:Ld61;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-ne p4, v5, :cond_0

    .line 31
    .line 32
    move p4, v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p4, 0x0

    .line 35
    :goto_0
    invoke-static {p0, v3, v4, p4}, Lup0;->d(IIIZ)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p1, Ld11;->b:I

    .line 40
    .line 41
    const-wide v3, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v3

    .line 47
    long-to-int p4, v0

    .line 48
    add-int/2addr p1, p4

    .line 49
    and-long p4, p5, v3

    .line 50
    .line 51
    long-to-int p4, p4

    .line 52
    and-long/2addr p2, v3

    .line 53
    long-to-int p2, p2

    .line 54
    invoke-static {p1, p4, p2, v6}, Lup0;->d(IIIZ)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-long p2, p0

    .line 59
    shl-long/2addr p2, v2

    .line 60
    int-to-long p0, p1

    .line 61
    and-long/2addr p0, v3

    .line 62
    or-long/2addr p0, p2

    .line 63
    return-wide p0
.end method

.method public b()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lr62;

    .line 4
    .line 5
    invoke-virtual {p0}, Lr62;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c()S
    .locals 1

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    int-to-short p0, p0

    .line 13
    return p0

    .line 14
    :cond_0
    new-instance p0, Lp50;

    .line 15
    .line 16
    invoke-direct {p0}, Lp50;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public d()J
    .locals 5

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx60;

    .line 4
    .line 5
    iget-object v0, p0, Lx60;->A:Lnu;

    .line 6
    .line 7
    invoke-interface {v0}, Lnu;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x10

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    sget-object v0, Lsa2;->a:Lmy;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lpa2;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-wide v0, v0, Lpa2;->a:J

    .line 29
    .line 30
    cmp-long v2, v0, v2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    return-wide v0

    .line 35
    :cond_1
    sget-object v0, Lc00;->a:Lmy;

    .line 36
    .line 37
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lju;

    .line 42
    .line 43
    iget-wide v0, p0, Lju;->a:J

    .line 44
    .line 45
    return-wide v0
.end method

.method public e()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln4;->c()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0}, Ln4;->c()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    or-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public f()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lr62;

    .line 4
    .line 5
    invoke-virtual {p0}, Lr62;->reset()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public g(I[B)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, -0x1

    .line 4
    if-ge v0, p1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Ln4;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/io/InputStream;

    .line 9
    .line 10
    sub-int v3, p1, v0

    .line 11
    .line 12
    invoke-virtual {v1, p2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    new-instance p0, Lp50;

    .line 26
    .line 27
    invoke-direct {p0}, Lp50;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_2
    :goto_1
    return v0
.end method

.method public h(Lr61;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lr61;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lgt2;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public i(ILl4;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lu92;

    .line 2
    .line 3
    iget-object v0, p1, Lu92;->h:Ls92;

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    new-instance v0, Ls92;

    .line 8
    .line 9
    invoke-virtual {p1}, Lu92;->g()Lon;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lu92;->e()Lvf1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-static {v2}, Lvf1;->a(Lvf1;)Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :cond_0
    sget-object v2, Lwq;->a:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    :cond_1
    invoke-direct {v0, v1, v2}, Ls92;-><init>(Lon;Ljava/nio/charset/Charset;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p1, Lu92;->h:Ls92;

    .line 31
    .line 32
    :cond_2
    new-instance v1, Ll41;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Ll41;-><init>(Ljava/io/Reader;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    invoke-virtual {v1, v0}, Ll41;->L(I)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lq43;

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v1}, Ll41;->I()I

    .line 50
    .line 51
    .line 52
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, Lu92;->close()V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    :try_start_1
    new-instance p0, Lt31;

    .line 62
    .line 63
    const-string v0, "JSON document was not fully consumed."

    .line 64
    .line 65
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    invoke-virtual {p1}, Lu92;->close()V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method public k()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ln4;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lff0;

    .line 7
    .line 8
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lze0;

    .line 11
    .line 12
    iget-object v2, p0, Lze0;->a:Laq0;

    .line 13
    .line 14
    iget-object v3, p0, Lze0;->b:Laq0;

    .line 15
    .line 16
    iget-object v4, p0, Lze0;->c:Laq0;

    .line 17
    .line 18
    iget-object v5, p0, Lze0;->d:Laq0;

    .line 19
    .line 20
    iget-object v6, p0, Lze0;->e:Lbf0;

    .line 21
    .line 22
    iget-object v7, p0, Lze0;->f:Lbf0;

    .line 23
    .line 24
    iget-object v8, p0, Lze0;->g:Lb5;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lff0;-><init>(Laq0;Laq0;Laq0;Laq0;Lbf0;Lbf0;Lb5;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    new-instance v0, Lw40;

    .line 31
    .line 32
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Le9;

    .line 35
    .line 36
    iget-object v1, p0, Le9;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Laf0;

    .line 39
    .line 40
    iget-object p0, p0, Le9;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lb5;

    .line 43
    .line 44
    invoke-direct {v0, v1, p0}, Lw40;-><init>(Laf0;Lb5;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public l(I)Ll4;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public m()V
    .locals 0

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyx;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(Ljava/lang/String;ZZ)[B
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_2

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    move v2, v0

    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3}, Lxe1;->Q(C)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v1, p1

    .line 38
    :goto_1
    const/4 v2, 0x0

    .line 39
    if-nez p3, :cond_4

    .line 40
    .line 41
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-ge v0, p3, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-static {p3}, Lxe1;->Q(C)Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-nez p3, :cond_3

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/4 v7, 0x0

    .line 61
    const/16 v8, 0x1c

    .line 62
    .line 63
    const-string v3, "INVALID_ARGUMENT"

    .line 64
    .line 65
    const-string v4, "Base64 input contains whitespace."

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-long v3, p1

    .line 78
    const-wide/16 v5, 0x3

    .line 79
    .line 80
    add-long/2addr v3, v5

    .line 81
    const-wide/16 v7, 0x4

    .line 82
    .line 83
    div-long/2addr v3, v7

    .line 84
    mul-long/2addr v3, v5

    .line 85
    invoke-virtual {p0, v3, v4}, Ln4;->y(J)V

    .line 86
    .line 87
    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    :try_start_0
    invoke-static {}, Ljava/util/Base64;->getUrlDecoder()Ljava/util/Base64$Decoder;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    goto :goto_3

    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    move-object v7, p0

    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :goto_3
    invoke-virtual {p0, v1}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :goto_4
    const/4 v6, 0x0

    .line 112
    const/16 v8, 0xc

    .line 113
    .line 114
    const-string v3, "INVALID_ARGUMENT"

    .line 115
    .line 116
    const-string v4, "Input is not valid Base64."

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 120
    .line 121
    .line 122
    return-object v2
.end method

.method public o(Ljava/lang/String;)[B
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    rem-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-long v3, v1

    .line 17
    const-wide/16 v5, 0x2

    .line 18
    .line 19
    div-long/2addr v3, v5

    .line 20
    move-object/from16 v1, p0

    .line 21
    .line 22
    invoke-virtual {v1, v3, v4}, Ln4;->y(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    div-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    new-array v3, v1, [B

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    if-ge v4, v1, :cond_3

    .line 35
    .line 36
    mul-int/lit8 v5, v4, 0x2

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0x10

    .line 43
    .line 44
    invoke-static {v7}, Lxe1;->j(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v6, v7}, Ljava/lang/Character;->digit(II)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    if-ltz v6, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    move-object v8, v2

    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-static {v7}, Lxe1;->j(I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v7}, Ljava/lang/Character;->digit(II)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-ltz v5, :cond_1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_1
    move-object v6, v2

    .line 80
    :goto_2
    if-eqz v8, :cond_2

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    shl-int/lit8 v5, v5, 0x4

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    or-int/2addr v5, v6

    .line 95
    int-to-byte v5, v5

    .line 96
    aput-byte v5, v3, v4

    .line 97
    .line 98
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const/4 v9, 0x0

    .line 102
    const/16 v10, 0x1c

    .line 103
    .line 104
    const-string v5, "INVALID_ARGUMENT"

    .line 105
    .line 106
    const-string v6, "Input is not valid hexadecimal."

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 111
    .line 112
    .line 113
    return-object v2

    .line 114
    :cond_3
    return-object v3

    .line 115
    :cond_4
    const/4 v15, 0x0

    .line 116
    const/16 v16, 0x1c

    .line 117
    .line 118
    const-string v11, "INVALID_ARGUMENT"

    .line 119
    .line 120
    const-string v12, "Hex input must have an even length."

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    invoke-static/range {v11 .. v16}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 125
    .line 126
    .line 127
    return-object v2
.end method

.method public p([BZ)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    int-to-long v0, v0

    .line 3
    invoke-virtual {p0, v0, v1}, Ln4;->y(J)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    sget-object p2, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object p2, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    .line 29
    .line 30
    :goto_1
    invoke-virtual {p0, p2}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    move-object v4, p0

    .line 53
    const/4 v3, 0x0

    .line 54
    const/16 v5, 0xc

    .line 55
    .line 56
    const-string v0, "INVALID_ARGUMENT"

    .line 57
    .line 58
    const-string v1, "Input is not valid UTF-8."

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public q(Lkj1;)Ljh1;
    .locals 1

    .line 1
    iget p1, p0, Ln4;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lrw0;

    .line 7
    .line 8
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lhh1;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lrw0;-><init>(Lhh1;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lao;

    .line 17
    .line 18
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lz8;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p1, v0, p0}, Lao;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public r()Lhi0;
    .locals 1

    .line 1
    new-instance v0, Lhi0;

    .line 2
    .line 3
    invoke-direct {v0}, Lzf1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyf1;

    .line 9
    .line 10
    iput-object p0, v0, Lzf1;->a:Lyf1;

    .line 11
    .line 12
    return-object v0
.end method

.method public s(I)Ll4;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public skip(J)J
    .locals 7

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/InputStream;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    move-wide v2, p1

    .line 13
    :goto_0
    cmp-long v4, v2, v0

    .line 14
    .line 15
    if-lez v4, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    cmp-long v6, v4, v0

    .line 22
    .line 23
    if-lez v6, :cond_1

    .line 24
    .line 25
    :goto_1
    sub-long/2addr v2, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, -0x1

    .line 32
    if-ne v4, v5, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const-wide/16 v4, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_2
    sub-long/2addr p1, v2

    .line 39
    return-wide p1
.end method

.method public t(Ldz;)I
    .locals 3

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lz70;

    .line 4
    .line 5
    instance-of v0, p1, Lq30;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "not found"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lz70;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lb42;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljm2;->f()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/TreeMap;

    .line 22
    .line 23
    check-cast p1, Lq30;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Liy0;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v2}, Ls;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v1

    .line 38
    :cond_1
    instance-of v0, p1, Lr30;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object p0, p0, Lz70;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lb42;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljm2;->f()V

    .line 47
    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, Lr30;

    .line 51
    .line 52
    iget-object v0, v0, Lr30;->h:Lo43;

    .line 53
    .line 54
    iget-object p0, p0, Lb42;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ljava/util/TreeMap;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Liy0;

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const-string p0, "not found: "

    .line 68
    .line 69
    invoke-static {p0, p1}, Ls;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return v1

    .line 73
    :cond_3
    instance-of v0, p1, Ln30;

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    iget-object p0, p0, Lz70;->l:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Lxg1;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljm2;->f()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lxg1;->f:Ljava/util/TreeMap;

    .line 85
    .line 86
    check-cast p1, Ln30;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Liy0;

    .line 93
    .line 94
    if-eqz p0, :cond_4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-static {v2}, Ls;->j(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return v1

    .line 101
    :cond_5
    instance-of v0, p1, Lc30;

    .line 102
    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    iget-object p0, p0, Lz70;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lni0;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljm2;->f()V

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Lni0;->f:Ljava/util/TreeMap;

    .line 113
    .line 114
    check-cast p1, Lc30;

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Liy0;

    .line 121
    .line 122
    if-eqz p0, :cond_6

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    invoke-static {v2}, Ls;->j(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return v1

    .line 129
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const/4 p0, 0x0

    .line 133
    :goto_0
    if-nez p0, :cond_8

    .line 134
    .line 135
    const/4 p0, -0x1

    .line 136
    return p0

    .line 137
    :cond_8
    invoke-virtual {p0}, Liy0;->e()I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln4;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lgt2;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public u(FFFF)V
    .locals 8

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb5;->q()Lqp;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lb5;->u()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v1, p3

    .line 23
    invoke-virtual {p0}, Lb5;->u()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide v6, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v4, v6

    .line 33
    long-to-int p3, v4

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v1, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v1, v3

    .line 51
    and-long/2addr p3, v6

    .line 52
    or-long/2addr p3, v1

    .line 53
    shr-long v1, p3, v3

    .line 54
    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-ltz v1, :cond_0

    .line 64
    .line 65
    and-long v3, p3, v6

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v2

    .line 73
    .line 74
    if-ltz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v1}, Ljz0;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {p0, p3, p4}, Lb5;->E(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, p2}, Lqp;->g(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public v()Lsg1;
    .locals 1

    .line 1
    new-instance v0, Lsg1;

    .line 2
    .line 3
    invoke-direct {v0}, Lsg1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyf1;

    .line 9
    .line 10
    iput-object p0, v0, Lzf1;->a:Lyf1;

    .line 11
    .line 12
    return-object v0
.end method

.method public w(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public x(Lr61;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lr61;->H()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lgt2;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public y(J)V
    .locals 6

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lbf2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/32 v0, 0x1000000

    .line 9
    .line 10
    .line 11
    cmp-long p0, p1, v0

    .line 12
    .line 13
    if-gtz p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    const/16 v5, 0x1c

    .line 18
    .line 19
    const-string v0, "QUOTA_EXCEEDED"

    .line 20
    .line 21
    const-string v1, "Encoding input or output exceeds 16777216 bytes."

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public z(FJ)V
    .locals 4

    .line 1
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lb5;->q()Lqp;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p2, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v2

    .line 24
    long-to-int p2, p2

    .line 25
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-interface {p0, v1, p3}, Lqp;->g(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1}, Lqp;->c(F)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, Lqp;->g(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
