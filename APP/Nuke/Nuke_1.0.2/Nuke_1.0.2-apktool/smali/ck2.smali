.class public final synthetic Lck2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lin0;

.field public final synthetic j:Lkf2;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lin0;Lkf2;ZILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lck2;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lck2;->i:Lin0;

    .line 7
    .line 8
    iput-object p3, p0, Lck2;->j:Lkf2;

    .line 9
    .line 10
    iput-boolean p4, p0, Lck2;->k:Z

    .line 11
    .line 12
    iput p5, p0, Lck2;->l:I

    .line 13
    .line 14
    iput-object p6, p0, Lck2;->m:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lbv;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lpx;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    move-object v4, v2

    .line 27
    check-cast v4, Lgo0;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x2

    .line 38
    :goto_0
    or-int/2addr v3, v1

    .line 39
    :cond_1
    and-int/lit8 v1, v3, 0x13

    .line 40
    .line 41
    const/16 v4, 0x12

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eq v1, v4, :cond_2

    .line 46
    .line 47
    move v1, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v1, v5

    .line 50
    :goto_1
    and-int/2addr v3, v6

    .line 51
    check-cast v2, Lgo0;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v1}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_a

    .line 58
    .line 59
    sget-object v9, Lte;->e:Lyi0;

    .line 60
    .line 61
    iget-object v1, v0, Lck2;->j:Lkf2;

    .line 62
    .line 63
    iget-object v1, v1, Lkf2;->s:Lvf2;

    .line 64
    .line 65
    iget-object v3, v1, Lvf2;->b:Ljava/lang/String;

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    const-string v3, ""

    .line 70
    .line 71
    :cond_3
    move-object v10, v3

    .line 72
    iget-boolean v3, v0, Lck2;->k:Z

    .line 73
    .line 74
    xor-int/lit8 v13, v3, 0x1

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    iget-object v4, v1, Lvf2;->d:Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    :goto_2
    move v14, v4

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    const/4 v4, 0x3

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    move v14, v6

    .line 91
    :goto_3
    if-eqz v3, :cond_6

    .line 92
    .line 93
    iget-object v3, v1, Lvf2;->e:Ljava/lang/Integer;

    .line 94
    .line 95
    if-eqz v3, :cond_7

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    :cond_6
    :goto_4
    move v15, v6

    .line 102
    goto :goto_5

    .line 103
    :cond_7
    const/16 v6, 0x8

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :goto_5
    iget-object v1, v1, Lvf2;->a:Lwf2;

    .line 107
    .line 108
    sget-object v3, Lwf2;->m:Lwf2;

    .line 109
    .line 110
    if-ne v1, v3, :cond_8

    .line 111
    .line 112
    new-instance v1, Ltx1;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    :goto_6
    move-object/from16 v18, v1

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_8
    sget-object v1, Lgd3;->P:Lum2;

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :goto_7
    new-instance v1, Lm51;

    .line 124
    .line 125
    const/16 v3, 0x7b

    .line 126
    .line 127
    iget v4, v0, Lck2;->l:I

    .line 128
    .line 129
    invoke-direct {v1, v4, v3}, Lm51;-><init>(II)V

    .line 130
    .line 131
    .line 132
    const/16 v23, 0x0

    .line 133
    .line 134
    const/16 v24, 0x2630

    .line 135
    .line 136
    iget-object v7, v0, Lck2;->h:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v8, v0, Lck2;->i:Lin0;

    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    const/16 v22, 0x180

    .line 149
    .line 150
    move-object/from16 v19, v1

    .line 151
    .line 152
    move-object/from16 v21, v2

    .line 153
    .line 154
    invoke-static/range {v7 .. v24}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, Lck2;->m:Ljava/lang/String;

    .line 158
    .line 159
    if-nez v0, :cond_9

    .line 160
    .line 161
    const v0, 0x71591a0

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v0}, Lgo0;->W(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v5}, Lgo0;->p(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_9
    const v1, 0x71591a1

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v1}, Lgo0;->W(I)V

    .line 175
    .line 176
    .line 177
    new-instance v1, Lbu0;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1, v2, v5, v5}, Lqp0;->e(Ljava/lang/String;Luh1;Lpx;II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v5}, Lgo0;->p(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_a
    invoke-virtual {v2}, Lgo0;->R()V

    .line 190
    .line 191
    .line 192
    :goto_8
    sget-object v0, La83;->a:La83;

    .line 193
    .line 194
    return-object v0
.end method
