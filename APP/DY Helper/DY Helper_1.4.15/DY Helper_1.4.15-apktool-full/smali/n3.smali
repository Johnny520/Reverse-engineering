.class public final Ln3;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public ι:Lx3;

.field public κ:Lqm1;

.field public λ:I

.field public final synthetic μ:Lo3;

.field public final synthetic ν:Ljava/lang/Object;

.field public final synthetic ξ:Ls22;

.field public final synthetic ο:J


# direct methods
.method public constructor <init>(Lo3;Ljava/lang/Object;Ls22;JLop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln3;->μ:Lo3;

    .line 2
    .line 3
    iput-object p2, p0, Ln3;->ν:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ln3;->ξ:Ls22;

    .line 6
    .line 7
    iput-wide p4, p0, Ln3;->ο:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p6}, Ly12;-><init>(ILop;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Lop;

    .line 3
    .line 4
    new-instance v0, Ln3;

    .line 5
    .line 6
    iget-object v3, p0, Ln3;->ξ:Ls22;

    .line 7
    .line 8
    iget-wide v4, p0, Ln3;->ο:J

    .line 9
    .line 10
    iget-object v1, p0, Ln3;->μ:Lo3;

    .line 11
    .line 12
    iget-object v2, p0, Ln3;->ν:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Ln3;-><init>(Lo3;Ljava/lang/Object;Ls22;JLop;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Ls62;->α:Ls62;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ln3;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v1, v5, Ln3;->ξ:Ls22;

    .line 4
    .line 5
    iget v0, v5, Ln3;->λ:I

    .line 6
    .line 7
    const-wide/high16 v6, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v8, v5, Ln3;->μ:Lo3;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, v5, Ln3;->κ:Lqm1;

    .line 17
    .line 18
    iget-object v1, v5, Ln3;->ι:Lx3;

    .line 19
    .line 20
    :try_start_0
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object v0, v8, Lo3;->γ:Lx3;

    .line 38
    .line 39
    iget-object v3, v8, Lo3;->α:Lg62;

    .line 40
    .line 41
    iget-object v3, v3, Lg62;->α:La80;

    .line 42
    .line 43
    iget-object v4, v5, Ln3;->ν:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-interface {v3, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lc4;

    .line 50
    .line 51
    iput-object v3, v0, Lx3;->η:Lc4;

    .line 52
    .line 53
    iget-object v0, v1, Ls22;->γ:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v3, v8, Lo3;->ε:Lx91;

    .line 56
    .line 57
    invoke-virtual {v3, v0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v8, Lo3;->δ:Lx91;

    .line 61
    .line 62
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v8, Lo3;->γ:Lx3;

    .line 68
    .line 69
    iget-object v3, v0, Lx3;->ζ:Lx91;

    .line 70
    .line 71
    invoke-virtual {v3}, Lx91;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    iget-object v3, v0, Lx3;->η:Lc4;

    .line 76
    .line 77
    invoke-static {v3}, Lyh;->υ(Lc4;)Lc4;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    iget-wide v13, v0, Lx3;->θ:J

    .line 82
    .line 83
    iget-boolean v3, v0, Lx3;->κ:Z

    .line 84
    .line 85
    new-instance v9, Lx3;

    .line 86
    .line 87
    iget-object v10, v0, Lx3;->ε:Lg62;

    .line 88
    .line 89
    const-wide/high16 v15, -0x8000000000000000L

    .line 90
    .line 91
    move/from16 v17, v3

    .line 92
    .line 93
    invoke-direct/range {v9 .. v17}, Lx3;-><init>(Lg62;Ljava/lang/Object;Lc4;JJZ)V

    .line 94
    .line 95
    .line 96
    move-object v0, v9

    .line 97
    new-instance v9, Lqm1;

    .line 98
    .line 99
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-wide v3, v5, Ln3;->ο:J

    .line 103
    .line 104
    move-wide v10, v3

    .line 105
    new-instance v4, Lm3;

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    invoke-direct {v4, v8, v0, v9, v3}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    iput-object v0, v5, Ln3;->ι:Lx3;

    .line 112
    .line 113
    iput-object v9, v5, Ln3;->κ:Lqm1;

    .line 114
    .line 115
    iput v2, v5, Ln3;->λ:I

    .line 116
    .line 117
    move-wide v2, v10

    .line 118
    invoke-static/range {v0 .. v5}, Lj81;->α(Lx3;Ls22;JLm3;Lpp;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    sget-object v2, Lcq;->ε:Lcq;

    .line 123
    .line 124
    if-ne v1, v2, :cond_2

    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_2
    move-object v1, v0

    .line 128
    move-object v0, v9

    .line 129
    :goto_0
    :try_start_2
    iget-boolean v0, v0, Lqm1;->ε:Z

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    sget-object v0, Lu3;->ε:Lu3;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    sget-object v0, Lu3;->ζ:Lu3;

    .line 137
    .line 138
    :goto_1
    iget-object v2, v8, Lo3;->γ:Lx3;

    .line 139
    .line 140
    iget-object v3, v2, Lx3;->η:Lc4;

    .line 141
    .line 142
    invoke-virtual {v3}, Lc4;->δ()V

    .line 143
    .line 144
    .line 145
    iput-wide v6, v2, Lx3;->θ:J

    .line 146
    .line 147
    iget-object v2, v8, Lo3;->δ:Lx91;

    .line 148
    .line 149
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Ln5;

    .line 155
    .line 156
    const/4 v3, 0x2

    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-direct {v2, v3, v1, v0, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 159
    .line 160
    .line 161
    return-object v2

    .line 162
    :goto_2
    iget-object v1, v8, Lo3;->γ:Lx3;

    .line 163
    .line 164
    iget-object v2, v1, Lx3;->η:Lc4;

    .line 165
    .line 166
    invoke-virtual {v2}, Lc4;->δ()V

    .line 167
    .line 168
    .line 169
    iput-wide v6, v1, Lx3;->θ:J

    .line 170
    .line 171
    iget-object v1, v8, Lo3;->δ:Lx91;

    .line 172
    .line 173
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    throw v0
.end method
