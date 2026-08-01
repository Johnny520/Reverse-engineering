.class public final synthetic Lyc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    iput p1, p0, Lyc0;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lyc0;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyc0;->d:I

    .line 4
    .line 5
    iget-object v0, v0, Lyc0;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Lwq0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Lae0;

    .line 27
    .line 28
    iget-object v6, v5, Lae0;->b:Ljava/util/List;

    .line 29
    .line 30
    iget-boolean v7, v5, Lae0;->g:Z

    .line 31
    .line 32
    iget v8, v5, Lae0;->k:I

    .line 33
    .line 34
    const/high16 v9, -0x80000000

    .line 35
    .line 36
    if-eq v8, v9, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-string v8, "position() should be called first"

    .line 40
    .line 41
    invoke-static {v8}, Lz10;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    move v9, v3

    .line 49
    :goto_2
    if-ge v9, v8, :cond_2

    .line 50
    .line 51
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    check-cast v10, Lxq0;

    .line 56
    .line 57
    iget-object v11, v5, Lae0;->i:[I

    .line 58
    .line 59
    mul-int/lit8 v12, v9, 0x2

    .line 60
    .line 61
    aget v13, v11, v12

    .line 62
    .line 63
    add-int/lit8 v12, v12, 0x1

    .line 64
    .line 65
    aget v11, v11, v12

    .line 66
    .line 67
    int-to-long v12, v13

    .line 68
    const/16 v14, 0x20

    .line 69
    .line 70
    shl-long/2addr v12, v14

    .line 71
    int-to-long v14, v11

    .line 72
    const-wide v16, 0xffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long v14, v14, v16

    .line 78
    .line 79
    or-long v11, v12, v14

    .line 80
    .line 81
    iget-wide v13, v5, Lae0;->c:J

    .line 82
    .line 83
    invoke-static {v11, v12, v13, v14}, Lw20;->c(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v11

    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    sget v13, Lyq0;->b:I

    .line 90
    .line 91
    sget-object v13, Lp3;->D:Lp3;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v10}, Lwq0;->a(Lwq0;Lxq0;)V

    .line 97
    .line 98
    .line 99
    iget-wide v14, v10, Lxq0;->h:J

    .line 100
    .line 101
    invoke-static {v11, v12, v14, v15}, Lw20;->c(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    const/4 v14, 0x0

    .line 106
    invoke-virtual {v10, v11, v12, v14, v13}, Lxq0;->X(JFLsw;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_1
    invoke-static {v1, v10, v11, v12}, Lwq0;->n(Lwq0;Lxq0;J)V

    .line 111
    .line 112
    .line 113
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    sget-object v0, Lna1;->a:Lna1;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_0
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, Lx80;

    .line 125
    .line 126
    invoke-static {v0, v1}, Lzc0;->v(Ljava/util/ArrayList;Lx80;)Lna1;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
