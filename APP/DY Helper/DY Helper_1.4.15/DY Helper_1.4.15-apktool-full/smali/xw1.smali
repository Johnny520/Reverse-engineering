.class public final Lxw1;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public η:[J

.field public θ:I

.field public ι:I

.field public κ:I

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Lyw1;


# direct methods
.method public constructor <init>(Lyw1;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxw1;->μ:Lyw1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ldo1;-><init>(Lop;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lts1;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lxw1;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxw1;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxw1;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 1

    .line 1
    new-instance v0, Lxw1;

    .line 2
    .line 3
    iget-object p0, p0, Lxw1;->μ:Lyw1;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lxw1;-><init>(Lyw1;Lop;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxw1;->μ:Lyw1;

    .line 4
    .line 5
    iget-wide v2, v1, Lyw1;->ε:J

    .line 6
    .line 7
    iget-wide v4, v1, Lyw1;->η:J

    .line 8
    .line 9
    iget-wide v6, v1, Lyw1;->ζ:J

    .line 10
    .line 11
    iget v8, v0, Lxw1;->κ:I

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v12, 0x3

    .line 15
    const/4 v13, 0x2

    .line 16
    const/16 v14, 0x40

    .line 17
    .line 18
    const-wide/16 v16, 0x0

    .line 19
    .line 20
    const-wide/16 v18, 0x1

    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    sget-object v11, Lcq;->ε:Lcq;

    .line 24
    .line 25
    if-eqz v8, :cond_3

    .line 26
    .line 27
    if-eq v8, v10, :cond_2

    .line 28
    .line 29
    if-eq v8, v13, :cond_1

    .line 30
    .line 31
    if-ne v8, v12, :cond_0

    .line 32
    .line 33
    iget v1, v0, Lxw1;->θ:I

    .line 34
    .line 35
    iget-object v6, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v6, Lts1;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move v7, v12

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :cond_1
    iget v1, v0, Lxw1;->θ:I

    .line 53
    .line 54
    iget-object v8, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, Lts1;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget v1, v0, Lxw1;->ι:I

    .line 63
    .line 64
    iget v8, v0, Lxw1;->θ:I

    .line 65
    .line 66
    iget-object v15, v0, Lxw1;->η:[J

    .line 67
    .line 68
    iget-object v12, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v12, Lts1;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    add-int/2addr v8, v10

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v8, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v12, v8

    .line 83
    check-cast v12, Lts1;

    .line 84
    .line 85
    iget-object v15, v1, Lyw1;->θ:[J

    .line 86
    .line 87
    if-eqz v15, :cond_4

    .line 88
    .line 89
    array-length v1, v15

    .line 90
    const/4 v8, 0x0

    .line 91
    :goto_0
    if-ge v8, v1, :cond_4

    .line 92
    .line 93
    aget-wide v2, v15, v8

    .line 94
    .line 95
    new-instance v4, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 98
    .line 99
    .line 100
    iput-object v12, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v15, v0, Lxw1;->η:[J

    .line 103
    .line 104
    iput v8, v0, Lxw1;->θ:I

    .line 105
    .line 106
    iput v1, v0, Lxw1;->ι:I

    .line 107
    .line 108
    iput v10, v0, Lxw1;->κ:I

    .line 109
    .line 110
    invoke-virtual {v12, v0, v4}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object v11

    .line 114
    :cond_4
    cmp-long v1, v6, v16

    .line 115
    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    move-object v8, v12

    .line 119
    const/4 v1, 0x0

    .line 120
    :goto_1
    if-ge v1, v14, :cond_6

    .line 121
    .line 122
    shl-long v20, v18, v1

    .line 123
    .line 124
    and-long v20, v6, v20

    .line 125
    .line 126
    cmp-long v12, v20, v16

    .line 127
    .line 128
    if-eqz v12, :cond_5

    .line 129
    .line 130
    int-to-long v2, v1

    .line 131
    add-long/2addr v4, v2

    .line 132
    new-instance v2, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-direct {v2, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 135
    .line 136
    .line 137
    iput-object v8, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v9, v0, Lxw1;->η:[J

    .line 140
    .line 141
    iput v1, v0, Lxw1;->θ:I

    .line 142
    .line 143
    iput v13, v0, Lxw1;->κ:I

    .line 144
    .line 145
    invoke-virtual {v8, v0, v2}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-object v11

    .line 149
    :cond_5
    :goto_2
    add-int/2addr v1, v10

    .line 150
    goto :goto_1

    .line 151
    :cond_6
    move-object v12, v8

    .line 152
    :cond_7
    cmp-long v1, v2, v16

    .line 153
    .line 154
    if-eqz v1, :cond_9

    .line 155
    .line 156
    move-object v6, v12

    .line 157
    const/4 v15, 0x0

    .line 158
    :goto_3
    if-ge v15, v14, :cond_9

    .line 159
    .line 160
    shl-long v7, v18, v15

    .line 161
    .line 162
    and-long/2addr v7, v2

    .line 163
    cmp-long v1, v7, v16

    .line 164
    .line 165
    if-eqz v1, :cond_8

    .line 166
    .line 167
    int-to-long v1, v15

    .line 168
    add-long/2addr v4, v1

    .line 169
    int-to-long v1, v14

    .line 170
    add-long/2addr v4, v1

    .line 171
    new-instance v1, Ljava/lang/Long;

    .line 172
    .line 173
    invoke-direct {v1, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 174
    .line 175
    .line 176
    iput-object v6, v0, Lxw1;->λ:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v9, v0, Lxw1;->η:[J

    .line 179
    .line 180
    iput v15, v0, Lxw1;->θ:I

    .line 181
    .line 182
    const/4 v7, 0x3

    .line 183
    iput v7, v0, Lxw1;->κ:I

    .line 184
    .line 185
    invoke-virtual {v6, v0, v1}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-object v11

    .line 189
    :cond_8
    const/4 v7, 0x3

    .line 190
    move v1, v15

    .line 191
    :goto_4
    add-int/lit8 v15, v1, 0x1

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_9
    sget-object v0, Ls62;->α:Ls62;

    .line 195
    .line 196
    return-object v0
.end method
