.class public final synthetic Lqp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lun0;

.field public final synthetic m:Lun0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;ZLxm0;Lin0;I)V
    .locals 0

    .line 19
    const/4 p6, 0x2

    iput p6, p0, Lqp1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqp1;->k:Ljava/lang/String;

    iput-object p2, p0, Lqp1;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lqp1;->j:Z

    iput-object p4, p0, Lqp1;->l:Lun0;

    iput-object p5, p0, Lqp1;->m:Lun0;

    return-void
.end method

.method public synthetic constructor <init>(Luh1;ZLjava/lang/String;Lnn0;Lkw;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lqp1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqp1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lqp1;->j:Z

    .line 10
    .line 11
    iput-object p3, p0, Lqp1;->k:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lqp1;->l:Lun0;

    .line 14
    .line 15
    iput-object p5, p0, Lqp1;->m:Lun0;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Luh1;ZLjava/lang/String;Lnn0;Lkw;I)V
    .locals 0

    .line 18
    const/4 p6, 0x0

    iput p6, p0, Lqp1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqp1;->i:Ljava/lang/Object;

    iput-boolean p2, p0, Lqp1;->j:Z

    iput-object p3, p0, Lqp1;->k:Ljava/lang/String;

    iput-object p4, p0, Lqp1;->l:Lun0;

    iput-object p5, p0, Lqp1;->m:Lun0;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqp1;->h:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, La83;->a:La83;

    .line 7
    .line 8
    iget-object v4, v0, Lqp1;->m:Lun0;

    .line 9
    .line 10
    iget-object v5, v0, Lqp1;->l:Lun0;

    .line 11
    .line 12
    iget-object v6, v0, Lqp1;->i:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v8, v6

    .line 18
    check-cast v8, Ljava/util/Set;

    .line 19
    .line 20
    move-object v10, v5

    .line 21
    check-cast v10, Lxm0;

    .line 22
    .line 23
    move-object v11, v4

    .line 24
    check-cast v11, Lin0;

    .line 25
    .line 26
    move-object/from16 v12, p1

    .line 27
    .line 28
    check-cast v12, Lpx;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0xd81

    .line 38
    .line 39
    invoke-static {v1}, Lpp0;->N(I)I

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    iget-object v7, v0, Lqp1;->k:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v9, v0, Lqp1;->j:Z

    .line 46
    .line 47
    invoke-static/range {v7 .. v13}, Lse;->u(Ljava/lang/String;Ljava/util/Set;ZLxm0;Lin0;Lpx;I)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :pswitch_0
    move-object v14, v6

    .line 52
    check-cast v14, Luh1;

    .line 53
    .line 54
    move-object/from16 v17, v5

    .line 55
    .line 56
    check-cast v17, Lnn0;

    .line 57
    .line 58
    move-object/from16 v18, v4

    .line 59
    .line 60
    check-cast v18, Lkw;

    .line 61
    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    check-cast v1, Lpx;

    .line 65
    .line 66
    move-object/from16 v4, p2

    .line 67
    .line 68
    check-cast v4, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    and-int/lit8 v5, v4, 0x3

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    if-eq v5, v6, :cond_0

    .line 78
    .line 79
    move v5, v2

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const/4 v5, 0x0

    .line 82
    :goto_0
    and-int/2addr v2, v4

    .line 83
    check-cast v1, Lgo0;

    .line 84
    .line 85
    invoke-virtual {v1, v2, v5}, Lgo0;->O(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_1

    .line 90
    .line 91
    const/16 v20, 0x0

    .line 92
    .line 93
    iget-boolean v15, v0, Lqp1;->j:Z

    .line 94
    .line 95
    iget-object v0, v0, Lqp1;->k:Ljava/lang/String;

    .line 96
    .line 97
    move-object/from16 v16, v0

    .line 98
    .line 99
    move-object/from16 v19, v1

    .line 100
    .line 101
    invoke-static/range {v14 .. v20}, Lqp0;->f(Luh1;ZLjava/lang/String;Lnn0;Lkw;Lpx;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move-object/from16 v19, v1

    .line 106
    .line 107
    invoke-virtual/range {v19 .. v19}, Lgo0;->R()V

    .line 108
    .line 109
    .line 110
    :goto_1
    return-object v3

    .line 111
    :pswitch_1
    check-cast v6, Luh1;

    .line 112
    .line 113
    move-object v7, v5

    .line 114
    check-cast v7, Lnn0;

    .line 115
    .line 116
    move-object v8, v4

    .line 117
    check-cast v8, Lkw;

    .line 118
    .line 119
    move-object/from16 v9, p1

    .line 120
    .line 121
    check-cast v9, Lpx;

    .line 122
    .line 123
    move-object/from16 v1, p2

    .line 124
    .line 125
    check-cast v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Lpp0;->N(I)I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    iget-boolean v5, v0, Lqp1;->j:Z

    .line 135
    .line 136
    iget-object v0, v0, Lqp1;->k:Ljava/lang/String;

    .line 137
    .line 138
    move-object v4, v6

    .line 139
    move-object v6, v0

    .line 140
    invoke-static/range {v4 .. v10}, Lqp0;->f(Luh1;ZLjava/lang/String;Lnn0;Lkw;Lpx;I)V

    .line 141
    .line 142
    .line 143
    return-object v3

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
