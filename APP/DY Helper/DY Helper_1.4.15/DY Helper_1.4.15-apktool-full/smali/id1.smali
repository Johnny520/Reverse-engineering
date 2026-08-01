.class public final Lid1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/Integer;

.field public final ε:Ljava/lang/Integer;

.field public final ζ:Ljava/lang/Integer;

.field public final η:Ljava/lang/Integer;

.field public final θ:Ljava/lang/Integer;

.field public final ι:Ljava/lang/Integer;

.field public final κ:Ljava/lang/Integer;

.field public final λ:Ljava/lang/Integer;

.field public final μ:Ljava/lang/String;

.field public final ν:Ljava/lang/Integer;

.field public final ξ:Ljava/lang/Integer;

.field public final ο:Ljava/lang/Integer;

.field public final π:Ljava/lang/Long;

.field public final ρ:Ljava/lang/Long;

.field public final σ:Ljava/lang/Integer;

.field public final τ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;I)V
    .locals 23

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move-object/from16 v17, v2

    goto :goto_a

    :cond_a
    move-object/from16 v17, p14

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    move-object/from16 v18, v2

    goto :goto_b

    :cond_b
    move-object/from16 v18, p15

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v19, v2

    goto :goto_c

    :cond_c
    move-object/from16 v19, p16

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v20, v2

    goto :goto_d

    :cond_d
    move-object/from16 v20, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v2

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    :goto_f
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v22, v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x1

    goto :goto_f

    .line 1
    :goto_10
    invoke-direct/range {v3 .. v22}, Lid1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lid1;->α:I

    .line 4
    iput-object p2, p0, Lid1;->β:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lid1;->γ:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lid1;->δ:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lid1;->ε:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lid1;->ζ:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lid1;->η:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lid1;->θ:Ljava/lang/Integer;

    .line 11
    iput-object p9, p0, Lid1;->ι:Ljava/lang/Integer;

    .line 12
    iput-object p10, p0, Lid1;->κ:Ljava/lang/Integer;

    .line 13
    iput-object p11, p0, Lid1;->λ:Ljava/lang/Integer;

    .line 14
    iput-object p12, p0, Lid1;->μ:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lid1;->ν:Ljava/lang/Integer;

    .line 16
    iput-object p14, p0, Lid1;->ξ:Ljava/lang/Integer;

    .line 17
    iput-object p15, p0, Lid1;->ο:Ljava/lang/Integer;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lid1;->π:Ljava/lang/Long;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lid1;->ρ:Ljava/lang/Long;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lid1;->σ:Ljava/lang/Integer;

    move/from16 p1, p19

    .line 21
    iput-boolean p1, p0, Lid1;->τ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lid1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lid1;

    .line 12
    .line 13
    iget v1, p0, Lid1;->α:I

    .line 14
    .line 15
    iget v3, p1, Lid1;->α:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lid1;->β:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lid1;->β:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lid1;->γ:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lid1;->γ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lid1;->δ:Ljava/lang/Integer;

    .line 43
    .line 44
    iget-object v3, p1, Lid1;->δ:Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, Lid1;->ε:Ljava/lang/Integer;

    .line 54
    .line 55
    iget-object v3, p1, Lid1;->ε:Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lid1;->ζ:Ljava/lang/Integer;

    .line 65
    .line 66
    iget-object v3, p1, Lid1;->ζ:Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lid1;->η:Ljava/lang/Integer;

    .line 76
    .line 77
    iget-object v3, p1, Lid1;->η:Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lid1;->θ:Ljava/lang/Integer;

    .line 87
    .line 88
    iget-object v3, p1, Lid1;->θ:Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lid1;->ι:Ljava/lang/Integer;

    .line 98
    .line 99
    iget-object v3, p1, Lid1;->ι:Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lid1;->κ:Ljava/lang/Integer;

    .line 109
    .line 110
    iget-object v3, p1, Lid1;->κ:Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object v1, p0, Lid1;->λ:Ljava/lang/Integer;

    .line 120
    .line 121
    iget-object v3, p1, Lid1;->λ:Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    iget-object v1, p0, Lid1;->μ:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p1, Lid1;->μ:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_d

    .line 139
    .line 140
    return v2

    .line 141
    :cond_d
    iget-object v1, p0, Lid1;->ν:Ljava/lang/Integer;

    .line 142
    .line 143
    iget-object v3, p1, Lid1;->ν:Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_e

    .line 150
    .line 151
    return v2

    .line 152
    :cond_e
    iget-object v1, p0, Lid1;->ξ:Ljava/lang/Integer;

    .line 153
    .line 154
    iget-object v3, p1, Lid1;->ξ:Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-nez v1, :cond_f

    .line 161
    .line 162
    return v2

    .line 163
    :cond_f
    iget-object v1, p0, Lid1;->ο:Ljava/lang/Integer;

    .line 164
    .line 165
    iget-object v3, p1, Lid1;->ο:Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-nez v1, :cond_10

    .line 172
    .line 173
    return v2

    .line 174
    :cond_10
    iget-object v1, p0, Lid1;->π:Ljava/lang/Long;

    .line 175
    .line 176
    iget-object v3, p1, Lid1;->π:Ljava/lang/Long;

    .line 177
    .line 178
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_11

    .line 183
    .line 184
    return v2

    .line 185
    :cond_11
    iget-object v1, p0, Lid1;->ρ:Ljava/lang/Long;

    .line 186
    .line 187
    iget-object v3, p1, Lid1;->ρ:Ljava/lang/Long;

    .line 188
    .line 189
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_12

    .line 194
    .line 195
    return v2

    .line 196
    :cond_12
    iget-object v1, p0, Lid1;->σ:Ljava/lang/Integer;

    .line 197
    .line 198
    iget-object v3, p1, Lid1;->σ:Ljava/lang/Integer;

    .line 199
    .line 200
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_13

    .line 205
    .line 206
    return v2

    .line 207
    :cond_13
    iget-boolean p0, p0, Lid1;->τ:Z

    .line 208
    .line 209
    iget-boolean p1, p1, Lid1;->τ:Z

    .line 210
    .line 211
    if-eq p0, p1, :cond_14

    .line 212
    .line 213
    return v2

    .line 214
    :cond_14
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lid1;->α:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Lid1;->β:Ljava/lang/String;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move v2, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v2, p0, Lid1;->γ:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    move v2, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :goto_1
    add-int/2addr v0, v2

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v2, p0, Lid1;->δ:Ljava/lang/Integer;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    move v2, v1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_2
    add-int/2addr v0, v2

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v2, p0, Lid1;->ε:Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v2, :cond_3

    .line 52
    .line 53
    move v2, v1

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_3
    add-int/2addr v0, v2

    .line 60
    mul-int/lit8 v0, v0, 0x1f

    .line 61
    .line 62
    iget-object v2, p0, Lid1;->ζ:Ljava/lang/Integer;

    .line 63
    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    move v2, v1

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :goto_4
    add-int/2addr v0, v2

    .line 73
    mul-int/lit8 v0, v0, 0x1f

    .line 74
    .line 75
    iget-object v2, p0, Lid1;->η:Ljava/lang/Integer;

    .line 76
    .line 77
    if-nez v2, :cond_5

    .line 78
    .line 79
    move v2, v1

    .line 80
    goto :goto_5

    .line 81
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :goto_5
    add-int/2addr v0, v2

    .line 86
    mul-int/lit8 v0, v0, 0x1f

    .line 87
    .line 88
    iget-object v2, p0, Lid1;->θ:Ljava/lang/Integer;

    .line 89
    .line 90
    if-nez v2, :cond_6

    .line 91
    .line 92
    move v2, v1

    .line 93
    goto :goto_6

    .line 94
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :goto_6
    add-int/2addr v0, v2

    .line 99
    mul-int/lit8 v0, v0, 0x1f

    .line 100
    .line 101
    iget-object v2, p0, Lid1;->ι:Ljava/lang/Integer;

    .line 102
    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    move v2, v1

    .line 106
    goto :goto_7

    .line 107
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    :goto_7
    add-int/2addr v0, v2

    .line 112
    mul-int/lit8 v0, v0, 0x1f

    .line 113
    .line 114
    iget-object v2, p0, Lid1;->κ:Ljava/lang/Integer;

    .line 115
    .line 116
    if-nez v2, :cond_8

    .line 117
    .line 118
    move v2, v1

    .line 119
    goto :goto_8

    .line 120
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    :goto_8
    add-int/2addr v0, v2

    .line 125
    mul-int/lit8 v0, v0, 0x1f

    .line 126
    .line 127
    iget-object v2, p0, Lid1;->λ:Ljava/lang/Integer;

    .line 128
    .line 129
    if-nez v2, :cond_9

    .line 130
    .line 131
    move v2, v1

    .line 132
    goto :goto_9

    .line 133
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :goto_9
    add-int/2addr v0, v2

    .line 138
    mul-int/lit8 v0, v0, 0x1f

    .line 139
    .line 140
    iget-object v2, p0, Lid1;->μ:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    move v2, v1

    .line 145
    goto :goto_a

    .line 146
    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    :goto_a
    add-int/2addr v0, v2

    .line 151
    mul-int/lit8 v0, v0, 0x1f

    .line 152
    .line 153
    iget-object v2, p0, Lid1;->ν:Ljava/lang/Integer;

    .line 154
    .line 155
    if-nez v2, :cond_b

    .line 156
    .line 157
    move v2, v1

    .line 158
    goto :goto_b

    .line 159
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    :goto_b
    add-int/2addr v0, v2

    .line 164
    mul-int/lit8 v0, v0, 0x1f

    .line 165
    .line 166
    iget-object v2, p0, Lid1;->ξ:Ljava/lang/Integer;

    .line 167
    .line 168
    if-nez v2, :cond_c

    .line 169
    .line 170
    move v2, v1

    .line 171
    goto :goto_c

    .line 172
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    :goto_c
    add-int/2addr v0, v2

    .line 177
    mul-int/lit8 v0, v0, 0x1f

    .line 178
    .line 179
    iget-object v2, p0, Lid1;->ο:Ljava/lang/Integer;

    .line 180
    .line 181
    if-nez v2, :cond_d

    .line 182
    .line 183
    move v2, v1

    .line 184
    goto :goto_d

    .line 185
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    :goto_d
    add-int/2addr v0, v2

    .line 190
    mul-int/lit8 v0, v0, 0x1f

    .line 191
    .line 192
    iget-object v2, p0, Lid1;->π:Ljava/lang/Long;

    .line 193
    .line 194
    if-nez v2, :cond_e

    .line 195
    .line 196
    move v2, v1

    .line 197
    goto :goto_e

    .line 198
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    :goto_e
    add-int/2addr v0, v2

    .line 203
    mul-int/lit8 v0, v0, 0x1f

    .line 204
    .line 205
    iget-object v2, p0, Lid1;->ρ:Ljava/lang/Long;

    .line 206
    .line 207
    if-nez v2, :cond_f

    .line 208
    .line 209
    move v2, v1

    .line 210
    goto :goto_f

    .line 211
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    :goto_f
    add-int/2addr v0, v2

    .line 216
    mul-int/lit8 v0, v0, 0x1f

    .line 217
    .line 218
    iget-object v2, p0, Lid1;->σ:Ljava/lang/Integer;

    .line 219
    .line 220
    if-nez v2, :cond_10

    .line 221
    .line 222
    goto :goto_10

    .line 223
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    :goto_10
    add-int/2addr v0, v1

    .line 228
    mul-int/lit8 v0, v0, 0x1f

    .line 229
    .line 230
    iget-boolean p0, p0, Lid1;->τ:Z

    .line 231
    .line 232
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    add-int/2addr p0, v0

    .line 237
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", name="

    .line 2
    .line 3
    const-string v1, ", iconUrl="

    .line 4
    .line 5
    iget v2, p0, Lid1;->α:I

    .line 6
    .line 7
    const-string v3, "Seed(seedId="

    .line 8
    .line 9
    iget-object v4, p0, Lid1;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lid1;->γ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", growthTimeSeconds="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lid1;->δ:Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", price="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lid1;->ε:Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", income="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lid1;->ζ:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", experience="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lid1;->η:Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", unlockLevel="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lid1;->θ:Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", productItemId="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lid1;->ι:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", productItemCount="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lid1;->κ:Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", limitCount="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lid1;->λ:Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", itemTag="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lid1;->μ:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", weight="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lid1;->ν:Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", wateringTime="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lid1;->ξ:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", wateringCooldownSeconds="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lid1;->ο:Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", activeFromEpoch="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, Lid1;->π:Ljava/lang/Long;

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", activeUntilEpoch="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Lid1;->ρ:Ljava/lang/Long;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, ", limitDimension="

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, Lid1;->σ:Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v1, ", inShop="

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, ")"

    .line 176
    .line 177
    iget-boolean p0, p0, Lid1;->τ:Z

    .line 178
    .line 179
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget p0, p0, Lid1;->α:I

    .line 2
    .line 3
    return p0
.end method

.method public final β(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lid1;->π:Ljava/lang/Long;

    .line 2
    .line 3
    invoke-static {v0}, Lrk0;->κ(Ljava/lang/Long;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lid1;->ρ:Ljava/lang/Long;

    .line 8
    .line 9
    invoke-static {p0}, Lrk0;->κ(Ljava/lang/Long;)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    cmp-long v0, p1, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    cmp-long p0, p1, v0

    .line 30
    .line 31
    if-gtz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final γ(Lid1;)Lid1;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lid1;

    .line 6
    .line 7
    iget-object v3, v1, Lid1;->β:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lid1;->β:Ljava/lang/String;

    .line 12
    .line 13
    :cond_0
    iget-object v4, v1, Lid1;->γ:Ljava/lang/String;

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    iget-object v4, v0, Lid1;->γ:Ljava/lang/String;

    .line 18
    .line 19
    :cond_1
    iget-object v5, v1, Lid1;->δ:Ljava/lang/Integer;

    .line 20
    .line 21
    if-nez v5, :cond_2

    .line 22
    .line 23
    iget-object v5, v0, Lid1;->δ:Ljava/lang/Integer;

    .line 24
    .line 25
    :cond_2
    iget-object v6, v1, Lid1;->ε:Ljava/lang/Integer;

    .line 26
    .line 27
    if-nez v6, :cond_3

    .line 28
    .line 29
    iget-object v6, v0, Lid1;->ε:Ljava/lang/Integer;

    .line 30
    .line 31
    :cond_3
    iget-object v7, v1, Lid1;->ζ:Ljava/lang/Integer;

    .line 32
    .line 33
    if-nez v7, :cond_4

    .line 34
    .line 35
    iget-object v7, v0, Lid1;->ζ:Ljava/lang/Integer;

    .line 36
    .line 37
    :cond_4
    iget-object v8, v1, Lid1;->η:Ljava/lang/Integer;

    .line 38
    .line 39
    if-nez v8, :cond_5

    .line 40
    .line 41
    iget-object v8, v0, Lid1;->η:Ljava/lang/Integer;

    .line 42
    .line 43
    :cond_5
    iget-object v9, v1, Lid1;->θ:Ljava/lang/Integer;

    .line 44
    .line 45
    if-nez v9, :cond_6

    .line 46
    .line 47
    iget-object v9, v0, Lid1;->θ:Ljava/lang/Integer;

    .line 48
    .line 49
    :cond_6
    iget-object v10, v1, Lid1;->ι:Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v10, :cond_7

    .line 52
    .line 53
    iget-object v10, v0, Lid1;->ι:Ljava/lang/Integer;

    .line 54
    .line 55
    :cond_7
    iget-object v11, v1, Lid1;->κ:Ljava/lang/Integer;

    .line 56
    .line 57
    if-nez v11, :cond_8

    .line 58
    .line 59
    iget-object v11, v0, Lid1;->κ:Ljava/lang/Integer;

    .line 60
    .line 61
    :cond_8
    iget-object v12, v1, Lid1;->λ:Ljava/lang/Integer;

    .line 62
    .line 63
    if-nez v12, :cond_9

    .line 64
    .line 65
    iget-object v12, v0, Lid1;->λ:Ljava/lang/Integer;

    .line 66
    .line 67
    :cond_9
    iget-object v13, v1, Lid1;->μ:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v13, :cond_a

    .line 70
    .line 71
    iget-object v13, v0, Lid1;->μ:Ljava/lang/String;

    .line 72
    .line 73
    :cond_a
    iget-object v14, v1, Lid1;->ν:Ljava/lang/Integer;

    .line 74
    .line 75
    if-nez v14, :cond_b

    .line 76
    .line 77
    iget-object v14, v0, Lid1;->ν:Ljava/lang/Integer;

    .line 78
    .line 79
    :cond_b
    iget-object v15, v1, Lid1;->ξ:Ljava/lang/Integer;

    .line 80
    .line 81
    if-nez v15, :cond_c

    .line 82
    .line 83
    iget-object v15, v0, Lid1;->ξ:Ljava/lang/Integer;

    .line 84
    .line 85
    :cond_c
    move-object/from16 v16, v2

    .line 86
    .line 87
    iget-object v2, v1, Lid1;->ο:Ljava/lang/Integer;

    .line 88
    .line 89
    if-nez v2, :cond_d

    .line 90
    .line 91
    iget-object v2, v0, Lid1;->ο:Ljava/lang/Integer;

    .line 92
    .line 93
    :cond_d
    move-object/from16 v17, v2

    .line 94
    .line 95
    iget-object v2, v1, Lid1;->π:Ljava/lang/Long;

    .line 96
    .line 97
    if-nez v2, :cond_e

    .line 98
    .line 99
    iget-object v2, v0, Lid1;->π:Ljava/lang/Long;

    .line 100
    .line 101
    :cond_e
    move-object/from16 v18, v2

    .line 102
    .line 103
    iget-object v2, v1, Lid1;->ρ:Ljava/lang/Long;

    .line 104
    .line 105
    if-nez v2, :cond_f

    .line 106
    .line 107
    iget-object v2, v0, Lid1;->ρ:Ljava/lang/Long;

    .line 108
    .line 109
    :cond_f
    move-object/from16 v19, v2

    .line 110
    .line 111
    iget-object v2, v1, Lid1;->σ:Ljava/lang/Integer;

    .line 112
    .line 113
    if-nez v2, :cond_10

    .line 114
    .line 115
    iget-object v2, v0, Lid1;->σ:Ljava/lang/Integer;

    .line 116
    .line 117
    :cond_10
    move-object/from16 v20, v2

    .line 118
    .line 119
    iget-boolean v2, v0, Lid1;->τ:Z

    .line 120
    .line 121
    if-nez v2, :cond_12

    .line 122
    .line 123
    iget-boolean v1, v1, Lid1;->τ:Z

    .line 124
    .line 125
    if-eqz v1, :cond_11

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_11
    const/4 v1, 0x0

    .line 129
    goto :goto_1

    .line 130
    :cond_12
    :goto_0
    const/4 v1, 0x1

    .line 131
    :goto_1
    iget v0, v0, Lid1;->α:I

    .line 132
    .line 133
    move-object v2, v3

    .line 134
    move-object v3, v4

    .line 135
    move-object v4, v5

    .line 136
    move-object v5, v6

    .line 137
    move-object v6, v7

    .line 138
    move-object v7, v8

    .line 139
    move-object v8, v9

    .line 140
    move-object v9, v10

    .line 141
    move-object v10, v11

    .line 142
    move-object v11, v12

    .line 143
    move-object v12, v13

    .line 144
    move-object v13, v14

    .line 145
    move-object v14, v15

    .line 146
    move-object/from16 v15, v17

    .line 147
    .line 148
    move-object/from16 v17, v19

    .line 149
    .line 150
    move/from16 v19, v1

    .line 151
    .line 152
    move v1, v0

    .line 153
    move-object/from16 v0, v16

    .line 154
    .line 155
    move-object/from16 v16, v18

    .line 156
    .line 157
    move-object/from16 v18, v20

    .line 158
    .line 159
    invoke-direct/range {v0 .. v19}, Lid1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V

    .line 160
    .line 161
    .line 162
    return-object v0
.end method
