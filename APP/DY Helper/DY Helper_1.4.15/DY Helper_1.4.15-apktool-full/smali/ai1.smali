.class public final Lai1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:J

.field public final β:J

.field public final γ:J

.field public final δ:Z

.field public final ε:F

.field public final ζ:J

.field public final η:J

.field public final θ:Z

.field public final ι:I

.field public final κ:J

.field public final λ:F

.field public final μ:J

.field public final ν:Ljava/util/ArrayList;

.field public final ξ:J

.field public ο:Z

.field public π:Z

.field public ρ:Lai1;


# direct methods
.method public constructor <init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V
    .locals 21

    const/4 v14, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move/from16 v13, p13

    move/from16 v15, p14

    move-wide/from16 v16, p16

    move/from16 v18, p18

    move-wide/from16 v19, p19

    .line 44
    invoke-direct/range {v0 .. v20}, Lai1;-><init>(JJJZFJJZZIJFJ)V

    move-object/from16 v1, p15

    .line 45
    iput-object v1, v0, Lai1;->ν:Ljava/util/ArrayList;

    move-wide/from16 v1, p21

    .line 46
    iput-wide v1, v0, Lai1;->ξ:J

    return-void
.end method

.method public constructor <init>(JJJZFJJZZIJFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lai1;->α:J

    .line 5
    .line 6
    iput-wide p3, p0, Lai1;->β:J

    .line 7
    .line 8
    iput-wide p5, p0, Lai1;->γ:J

    .line 9
    .line 10
    iput-boolean p7, p0, Lai1;->δ:Z

    .line 11
    .line 12
    iput p8, p0, Lai1;->ε:F

    .line 13
    .line 14
    iput-wide p9, p0, Lai1;->ζ:J

    .line 15
    .line 16
    iput-wide p11, p0, Lai1;->η:J

    .line 17
    .line 18
    iput-boolean p13, p0, Lai1;->θ:Z

    .line 19
    .line 20
    move p1, p15

    .line 21
    iput p1, p0, Lai1;->ι:I

    .line 22
    .line 23
    move-wide/from16 p1, p16

    .line 24
    .line 25
    iput-wide p1, p0, Lai1;->κ:J

    .line 26
    .line 27
    move/from16 p1, p18

    .line 28
    .line 29
    iput p1, p0, Lai1;->λ:F

    .line 30
    .line 31
    move-wide/from16 p1, p19

    .line 32
    .line 33
    iput-wide p1, p0, Lai1;->μ:J

    .line 34
    .line 35
    const-wide/16 p1, 0x0

    .line 36
    .line 37
    iput-wide p1, p0, Lai1;->ξ:J

    .line 38
    .line 39
    iput-boolean p14, p0, Lai1;->ο:Z

    .line 40
    .line 41
    iput-boolean p14, p0, Lai1;->π:Z

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PointerInputChange(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lai1;->α:J

    .line 9
    .line 10
    invoke-static {v1, v2}, Lu81;->σ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", uptimeMillis="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, Lai1;->β:J

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", position="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, Lai1;->γ:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Lo41;->δ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", pressed="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Lai1;->δ:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", pressure="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v1, p0, Lai1;->ε:F

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", previousUptimeMillis="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-wide v1, p0, Lai1;->ζ:J

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", previousPosition="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-wide v1, p0, Lai1;->η:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Lo41;->δ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", previousPressed="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-boolean v1, p0, Lai1;->θ:Z

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", isConsumed="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lai1;->β()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", type="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    iget v2, p0, Lai1;->ι:I

    .line 114
    .line 115
    if-eq v2, v1, :cond_3

    .line 116
    .line 117
    const/4 v1, 0x2

    .line 118
    if-eq v2, v1, :cond_2

    .line 119
    .line 120
    const/4 v1, 0x3

    .line 121
    if-eq v2, v1, :cond_1

    .line 122
    .line 123
    const/4 v1, 0x4

    .line 124
    if-eq v2, v1, :cond_0

    .line 125
    .line 126
    const-string v1, "Unknown"

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const-string v1, "Eraser"

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    const-string v1, "Stylus"

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    const-string v1, "Mouse"

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    const-string v1, "Touch"

    .line 139
    .line 140
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", historical="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lai1;->ν:Ljava/util/ArrayList;

    .line 149
    .line 150
    if-nez v1, :cond_4

    .line 151
    .line 152
    sget-object v1, Ljz;->ε:Ljz;

    .line 153
    .line 154
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ", scrollDelta="

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-wide v1, p0, Lai1;->κ:J

    .line 163
    .line 164
    invoke-static {v1, v2}, Lo41;->δ(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", scaleFactor="

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget v1, p0, Lai1;->λ:F

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v1, ", panOffset="

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-wide v1, p0, Lai1;->μ:J

    .line 187
    .line 188
    invoke-static {v1, v2}, Lo41;->δ(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const/16 p0, 0x29

    .line 196
    .line 197
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0
.end method

.method public final α()V
    .locals 1

    .line 1
    iget-object v0, p0, Lai1;->ρ:Lai1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lai1;->ο:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lai1;->π:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lai1;->α()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final β()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lai1;->ρ:Lai1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lai1;->β()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-boolean v0, p0, Lai1;->ο:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean p0, p0, Lai1;->π:Z

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method
