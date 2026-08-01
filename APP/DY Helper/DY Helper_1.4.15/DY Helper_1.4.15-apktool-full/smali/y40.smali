.class public final Ly40;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv40;


# instance fields
.field public final α:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final β:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final γ:Lc50;

.field public final δ:Ls40;

.field public final ε:Lw40;

.field public ζ:Ls11;

.field public final η:Lv11;

.field public θ:Lc50;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly40;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, Ly40;->β:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    new-instance p1, Lc50;

    .line 9
    .line 10
    invoke-direct {p1}, Lq01;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ly40;->γ:Lc50;

    .line 14
    .line 15
    new-instance p1, Ls40;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, Ls40;-><init>(Ly40;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ly40;->δ:Ls40;

    .line 21
    .line 22
    new-instance p1, Lw40;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lw40;-><init>(Ly40;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ly40;->ε:Lw40;

    .line 28
    .line 29
    new-instance p1, Lv11;

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-direct {p1, p2}, Lv11;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly40;->η:Lv11;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final α(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly40;->ζ()Lc50;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ly40;->ζ()Lc50;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1}, Ly40;->θ(Lc50;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_c

    .line 19
    .line 20
    sget-object p0, Lb50;->ε:Lb50;

    .line 21
    .line 22
    sget-object v2, Lb50;->η:Lb50;

    .line 23
    .line 24
    invoke-virtual {p1, p0, v2}, Lc50;->Г(Lb50;Lb50;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, Lq01;->ε:Lq01;

    .line 28
    .line 29
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    const-string p0, "visitAncestors called on an unattached node"

    .line 34
    .line 35
    invoke-static {p0}, Lam0;->β(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p0, p1, Lq01;->ε:Lq01;

    .line 39
    .line 40
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 41
    .line 42
    invoke-static {p1}, Lh62;->ц(Lur;)Lyp0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    if-eqz p1, :cond_c

    .line 47
    .line 48
    iget-object v3, p1, Lyp0;->Κ:Lk31;

    .line 49
    .line 50
    iget-object v3, v3, Lk31;->ζ:Lq01;

    .line 51
    .line 52
    iget v3, v3, Lq01;->θ:I

    .line 53
    .line 54
    and-int/lit16 v3, v3, 0x400

    .line 55
    .line 56
    if-eqz v3, :cond_a

    .line 57
    .line 58
    :goto_1
    if-eqz p0, :cond_a

    .line 59
    .line 60
    iget v3, p0, Lq01;->η:I

    .line 61
    .line 62
    and-int/lit16 v3, v3, 0x400

    .line 63
    .line 64
    if-eqz v3, :cond_9

    .line 65
    .line 66
    move-object v3, p0

    .line 67
    move-object v4, v1

    .line 68
    :goto_2
    if-eqz v3, :cond_9

    .line 69
    .line 70
    instance-of v5, v3, Lc50;

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    check-cast v3, Lc50;

    .line 75
    .line 76
    sget-object v5, Lb50;->ζ:Lb50;

    .line 77
    .line 78
    invoke-virtual {v3, v5, v2}, Lc50;->Г(Lb50;Lb50;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_2
    iget v5, v3, Lq01;->η:I

    .line 83
    .line 84
    and-int/lit16 v5, v5, 0x400

    .line 85
    .line 86
    if-eqz v5, :cond_8

    .line 87
    .line 88
    instance-of v5, v3, Lya;

    .line 89
    .line 90
    if-eqz v5, :cond_8

    .line 91
    .line 92
    move-object v5, v3

    .line 93
    check-cast v5, Lya;

    .line 94
    .line 95
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    :goto_3
    if-eqz v5, :cond_7

    .line 99
    .line 100
    iget v7, v5, Lq01;->η:I

    .line 101
    .line 102
    and-int/lit16 v7, v7, 0x400

    .line 103
    .line 104
    if-eqz v7, :cond_6

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    if-ne v6, v0, :cond_3

    .line 109
    .line 110
    move-object v3, v5

    .line 111
    goto :goto_4

    .line 112
    :cond_3
    if-nez v4, :cond_4

    .line 113
    .line 114
    new-instance v4, Lk21;

    .line 115
    .line 116
    const/16 v7, 0x10

    .line 117
    .line 118
    new-array v7, v7, [Lq01;

    .line 119
    .line 120
    invoke-direct {v4, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    if-eqz v3, :cond_5

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v3, v1

    .line 129
    :cond_5
    invoke-virtual {v4, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    :goto_4
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    if-ne v6, v0, :cond_8

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    :goto_5
    invoke-static {v4}, Lh62;->γ(Lk21;)Lq01;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    goto :goto_2

    .line 143
    :cond_9
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_a
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_b

    .line 151
    .line 152
    iget-object p0, p1, Lyp0;->Κ:Lk31;

    .line 153
    .line 154
    if-eqz p0, :cond_b

    .line 155
    .line 156
    iget-object p0, p0, Lk31;->ε:Lq22;

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_b
    move-object p0, v1

    .line 160
    goto :goto_0

    .line 161
    :cond_c
    :goto_6
    return v0
.end method

.method public final β(IZZ)Z
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    if-nez p2, :cond_3

    .line 3
    .line 4
    iget-object v0, p0, Ly40;->γ:Lc50;

    .line 5
    .line 6
    invoke-static {v0}, Lkn0;->Κ(Lc50;)Luq;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    if-eq v0, p1, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    if-ne v0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0, p2}, Ly40;->α(Z)Z

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {p0, p2}, Ly40;->α(Z)Z

    .line 37
    .line 38
    .line 39
    :goto_1
    if-eqz p1, :cond_4

    .line 40
    .line 41
    if-eqz p3, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Ly40;->γ()V

    .line 44
    .line 45
    .line 46
    :cond_4
    return p1
.end method

.method public final γ()V
    .locals 1

    .line 1
    iget-object p0, p0, Ly40;->α:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void

    .line 35
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final δ(Landroid/view/KeyEvent;Lp70;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Ly40;->γ:Lc50;

    .line 2
    .line 3
    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Ly40;->δ:Ls40;

    .line 9
    .line 10
    iget-boolean v1, v1, Ls40;->ε:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p0, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 16
    .line 17
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ly40;->ι(Landroid/view/KeyEvent;)Z

    .line 27
    .line 28
    .line 29
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 33
    .line 34
    .line 35
    return v2

    .line 36
    :cond_1
    :try_start_2
    invoke-static {v0}, Lln0;->ω(Lc50;)Lc50;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    const-string v1, "visitAncestors called on an unattached node"

    .line 41
    .line 42
    const/16 v3, 0x10

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eqz p0, :cond_7

    .line 47
    .line 48
    :try_start_3
    iget-object v6, p0, Lq01;->ε:Lq01;

    .line 49
    .line 50
    iget-boolean v6, v6, Lq01;->σ:Z

    .line 51
    .line 52
    if-nez v6, :cond_2

    .line 53
    .line 54
    const-string v6, "visitLocalDescendants called on an unattached node"

    .line 55
    .line 56
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v6, p0, Lq01;->ε:Lq01;

    .line 60
    .line 61
    iget v7, v6, Lq01;->θ:I

    .line 62
    .line 63
    and-int/lit16 v7, v7, 0x2400

    .line 64
    .line 65
    if-eqz v7, :cond_5

    .line 66
    .line 67
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 68
    .line 69
    move-object v7, v4

    .line 70
    :goto_0
    if-eqz v6, :cond_6

    .line 71
    .line 72
    iget v8, v6, Lq01;->η:I

    .line 73
    .line 74
    and-int/lit16 v9, v8, 0x2400

    .line 75
    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    and-int/lit16 v8, v8, 0x400

    .line 79
    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object v7, v6

    .line 84
    :cond_4
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    move-object v7, v4

    .line 88
    :cond_6
    :goto_1
    if-nez v7, :cond_22

    .line 89
    .line 90
    :cond_7
    if-eqz p0, :cond_14

    .line 91
    .line 92
    iget-object v6, p0, Lq01;->ε:Lq01;

    .line 93
    .line 94
    iget-boolean v6, v6, Lq01;->σ:Z

    .line 95
    .line 96
    if-nez v6, :cond_8

    .line 97
    .line 98
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_8
    iget-object v6, p0, Lq01;->ε:Lq01;

    .line 102
    .line 103
    invoke-static {p0}, Lh62;->ц(Lur;)Lyp0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    if-eqz p0, :cond_13

    .line 108
    .line 109
    iget-object v7, p0, Lyp0;->Κ:Lk31;

    .line 110
    .line 111
    iget-object v7, v7, Lk31;->ζ:Lq01;

    .line 112
    .line 113
    iget v7, v7, Lq01;->θ:I

    .line 114
    .line 115
    and-int/lit16 v7, v7, 0x2000

    .line 116
    .line 117
    if-eqz v7, :cond_11

    .line 118
    .line 119
    :goto_3
    if-eqz v6, :cond_11

    .line 120
    .line 121
    iget v7, v6, Lq01;->η:I

    .line 122
    .line 123
    and-int/lit16 v7, v7, 0x2000

    .line 124
    .line 125
    if-eqz v7, :cond_10

    .line 126
    .line 127
    move-object v8, v4

    .line 128
    move-object v7, v6

    .line 129
    :goto_4
    if-eqz v7, :cond_10

    .line 130
    .line 131
    instance-of v9, v7, Lu0;

    .line 132
    .line 133
    if-eqz v9, :cond_9

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_9
    iget v9, v7, Lq01;->η:I

    .line 137
    .line 138
    and-int/lit16 v9, v9, 0x2000

    .line 139
    .line 140
    if-eqz v9, :cond_f

    .line 141
    .line 142
    instance-of v9, v7, Lya;

    .line 143
    .line 144
    if-eqz v9, :cond_f

    .line 145
    .line 146
    move-object v9, v7

    .line 147
    check-cast v9, Lya;

    .line 148
    .line 149
    iget-object v9, v9, Lya;->υ:Lq01;

    .line 150
    .line 151
    move v10, v2

    .line 152
    :goto_5
    if-eqz v9, :cond_e

    .line 153
    .line 154
    iget v11, v9, Lq01;->η:I

    .line 155
    .line 156
    and-int/lit16 v11, v11, 0x2000

    .line 157
    .line 158
    if-eqz v11, :cond_d

    .line 159
    .line 160
    add-int/lit8 v10, v10, 0x1

    .line 161
    .line 162
    if-ne v10, v5, :cond_a

    .line 163
    .line 164
    move-object v7, v9

    .line 165
    goto :goto_6

    .line 166
    :cond_a
    if-nez v8, :cond_b

    .line 167
    .line 168
    new-instance v8, Lk21;

    .line 169
    .line 170
    new-array v11, v3, [Lq01;

    .line 171
    .line 172
    invoke-direct {v8, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_b
    if-eqz v7, :cond_c

    .line 176
    .line 177
    invoke-virtual {v8, v7}, Lk21;->β(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    move-object v7, v4

    .line 181
    :cond_c
    invoke-virtual {v8, v9}, Lk21;->β(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_d
    :goto_6
    iget-object v9, v9, Lq01;->κ:Lq01;

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_e
    if-ne v10, v5, :cond_f

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_f
    invoke-static {v8}, Lh62;->γ(Lk21;)Lq01;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    goto :goto_4

    .line 195
    :cond_10
    iget-object v6, v6, Lq01;->ι:Lq01;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_11
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-eqz p0, :cond_12

    .line 203
    .line 204
    iget-object v6, p0, Lyp0;->Κ:Lk31;

    .line 205
    .line 206
    if-eqz v6, :cond_12

    .line 207
    .line 208
    iget-object v6, v6, Lk31;->ε:Lq22;

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_12
    move-object v6, v4

    .line 212
    goto :goto_2

    .line 213
    :cond_13
    move-object v7, v4

    .line 214
    :goto_7
    check-cast v7, Lu0;

    .line 215
    .line 216
    if-eqz v7, :cond_14

    .line 217
    .line 218
    iget-object v7, v7, Lq01;->ε:Lq01;

    .line 219
    .line 220
    goto/16 :goto_e

    .line 221
    .line 222
    :cond_14
    iget-object p0, v0, Lq01;->ε:Lq01;

    .line 223
    .line 224
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 225
    .line 226
    if-nez p0, :cond_15

    .line 227
    .line 228
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_15
    iget-object p0, v0, Lq01;->ε:Lq01;

    .line 232
    .line 233
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 234
    .line 235
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :goto_8
    if-eqz v0, :cond_20

    .line 240
    .line 241
    iget-object v6, v0, Lyp0;->Κ:Lk31;

    .line 242
    .line 243
    iget-object v6, v6, Lk31;->ζ:Lq01;

    .line 244
    .line 245
    iget v6, v6, Lq01;->θ:I

    .line 246
    .line 247
    and-int/lit16 v6, v6, 0x2000

    .line 248
    .line 249
    if-eqz v6, :cond_1e

    .line 250
    .line 251
    :goto_9
    if-eqz p0, :cond_1e

    .line 252
    .line 253
    iget v6, p0, Lq01;->η:I

    .line 254
    .line 255
    and-int/lit16 v6, v6, 0x2000

    .line 256
    .line 257
    if-eqz v6, :cond_1d

    .line 258
    .line 259
    move-object v6, p0

    .line 260
    move-object v7, v4

    .line 261
    :goto_a
    if-eqz v6, :cond_1d

    .line 262
    .line 263
    instance-of v8, v6, Lu0;

    .line 264
    .line 265
    if-eqz v8, :cond_16

    .line 266
    .line 267
    goto :goto_d

    .line 268
    :cond_16
    iget v8, v6, Lq01;->η:I

    .line 269
    .line 270
    and-int/lit16 v8, v8, 0x2000

    .line 271
    .line 272
    if-eqz v8, :cond_1c

    .line 273
    .line 274
    instance-of v8, v6, Lya;

    .line 275
    .line 276
    if-eqz v8, :cond_1c

    .line 277
    .line 278
    move-object v8, v6

    .line 279
    check-cast v8, Lya;

    .line 280
    .line 281
    iget-object v8, v8, Lya;->υ:Lq01;

    .line 282
    .line 283
    move v9, v2

    .line 284
    :goto_b
    if-eqz v8, :cond_1b

    .line 285
    .line 286
    iget v10, v8, Lq01;->η:I

    .line 287
    .line 288
    and-int/lit16 v10, v10, 0x2000

    .line 289
    .line 290
    if-eqz v10, :cond_1a

    .line 291
    .line 292
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    if-ne v9, v5, :cond_17

    .line 295
    .line 296
    move-object v6, v8

    .line 297
    goto :goto_c

    .line 298
    :cond_17
    if-nez v7, :cond_18

    .line 299
    .line 300
    new-instance v7, Lk21;

    .line 301
    .line 302
    new-array v10, v3, [Lq01;

    .line 303
    .line 304
    invoke-direct {v7, v10}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_18
    if-eqz v6, :cond_19

    .line 308
    .line 309
    invoke-virtual {v7, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    move-object v6, v4

    .line 313
    :cond_19
    invoke-virtual {v7, v8}, Lk21;->β(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_1a
    :goto_c
    iget-object v8, v8, Lq01;->κ:Lq01;

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_1b
    if-ne v9, v5, :cond_1c

    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_1c
    invoke-static {v7}, Lh62;->γ(Lk21;)Lq01;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    goto :goto_a

    .line 327
    :cond_1d
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_1e
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-eqz v0, :cond_1f

    .line 335
    .line 336
    iget-object p0, v0, Lyp0;->Κ:Lk31;

    .line 337
    .line 338
    if-eqz p0, :cond_1f

    .line 339
    .line 340
    iget-object p0, p0, Lk31;->ε:Lq22;

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_1f
    move-object p0, v4

    .line 344
    goto :goto_8

    .line 345
    :cond_20
    move-object v6, v4

    .line 346
    :goto_d
    check-cast v6, Lu0;

    .line 347
    .line 348
    if-eqz v6, :cond_21

    .line 349
    .line 350
    iget-object v7, v6, Lq01;->ε:Lq01;

    .line 351
    .line 352
    goto :goto_e

    .line 353
    :cond_21
    move-object v7, v4

    .line 354
    :cond_22
    :goto_e
    if-eqz v7, :cond_44

    .line 355
    .line 356
    iget-object p0, v7, Lq01;->ε:Lq01;

    .line 357
    .line 358
    iget-boolean p0, p0, Lq01;->σ:Z

    .line 359
    .line 360
    if-nez p0, :cond_23

    .line 361
    .line 362
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_23
    iget-object p0, v7, Lq01;->ε:Lq01;

    .line 366
    .line 367
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 368
    .line 369
    invoke-static {v7}, Lh62;->ц(Lur;)Lyp0;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object v1, v4

    .line 374
    :goto_f
    if-eqz v0, :cond_2f

    .line 375
    .line 376
    iget-object v6, v0, Lyp0;->Κ:Lk31;

    .line 377
    .line 378
    iget-object v6, v6, Lk31;->ζ:Lq01;

    .line 379
    .line 380
    iget v6, v6, Lq01;->θ:I

    .line 381
    .line 382
    and-int/lit16 v6, v6, 0x2000

    .line 383
    .line 384
    if-eqz v6, :cond_2d

    .line 385
    .line 386
    :goto_10
    if-eqz p0, :cond_2d

    .line 387
    .line 388
    iget v6, p0, Lq01;->η:I

    .line 389
    .line 390
    and-int/lit16 v6, v6, 0x2000

    .line 391
    .line 392
    if-eqz v6, :cond_2c

    .line 393
    .line 394
    move-object v6, p0

    .line 395
    move-object v8, v4

    .line 396
    :goto_11
    if-eqz v6, :cond_2c

    .line 397
    .line 398
    instance-of v9, v6, Lu0;

    .line 399
    .line 400
    if-eqz v9, :cond_25

    .line 401
    .line 402
    if-nez v1, :cond_24

    .line 403
    .line 404
    new-instance v1, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 407
    .line 408
    .line 409
    :cond_24
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move v9, v2

    .line 413
    goto :goto_12

    .line 414
    :cond_25
    move v9, v5

    .line 415
    :goto_12
    if-eqz v9, :cond_2b

    .line 416
    .line 417
    iget v9, v6, Lq01;->η:I

    .line 418
    .line 419
    and-int/lit16 v9, v9, 0x2000

    .line 420
    .line 421
    if-eqz v9, :cond_2b

    .line 422
    .line 423
    instance-of v9, v6, Lya;

    .line 424
    .line 425
    if-eqz v9, :cond_2b

    .line 426
    .line 427
    move-object v9, v6

    .line 428
    check-cast v9, Lya;

    .line 429
    .line 430
    iget-object v9, v9, Lya;->υ:Lq01;

    .line 431
    .line 432
    move v10, v2

    .line 433
    :goto_13
    if-eqz v9, :cond_2a

    .line 434
    .line 435
    iget v11, v9, Lq01;->η:I

    .line 436
    .line 437
    and-int/lit16 v11, v11, 0x2000

    .line 438
    .line 439
    if-eqz v11, :cond_29

    .line 440
    .line 441
    add-int/lit8 v10, v10, 0x1

    .line 442
    .line 443
    if-ne v10, v5, :cond_26

    .line 444
    .line 445
    move-object v6, v9

    .line 446
    goto :goto_14

    .line 447
    :cond_26
    if-nez v8, :cond_27

    .line 448
    .line 449
    new-instance v8, Lk21;

    .line 450
    .line 451
    new-array v11, v3, [Lq01;

    .line 452
    .line 453
    invoke-direct {v8, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_27
    if-eqz v6, :cond_28

    .line 457
    .line 458
    invoke-virtual {v8, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    move-object v6, v4

    .line 462
    :cond_28
    invoke-virtual {v8, v9}, Lk21;->β(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :cond_29
    :goto_14
    iget-object v9, v9, Lq01;->κ:Lq01;

    .line 466
    .line 467
    goto :goto_13

    .line 468
    :cond_2a
    if-ne v10, v5, :cond_2b

    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_2b
    invoke-static {v8}, Lh62;->γ(Lk21;)Lq01;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    goto :goto_11

    .line 476
    :cond_2c
    iget-object p0, p0, Lq01;->ι:Lq01;

    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_2d
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-eqz v0, :cond_2e

    .line 484
    .line 485
    iget-object p0, v0, Lyp0;->Κ:Lk31;

    .line 486
    .line 487
    if-eqz p0, :cond_2e

    .line 488
    .line 489
    iget-object p0, p0, Lk31;->ε:Lq22;

    .line 490
    .line 491
    goto :goto_f

    .line 492
    :cond_2e
    move-object p0, v4

    .line 493
    goto :goto_f

    .line 494
    :cond_2f
    if-eqz v1, :cond_31

    .line 495
    .line 496
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 497
    .line 498
    .line 499
    move-result p0

    .line 500
    add-int/lit8 p0, p0, -0x1

    .line 501
    .line 502
    if-ltz p0, :cond_31

    .line 503
    .line 504
    :goto_15
    add-int/lit8 v0, p0, -0x1

    .line 505
    .line 506
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    check-cast p0, Lu0;

    .line 511
    .line 512
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    if-gez v0, :cond_30

    .line 516
    .line 517
    goto :goto_16

    .line 518
    :cond_30
    move p0, v0

    .line 519
    goto :goto_15

    .line 520
    :cond_31
    :goto_16
    iget-object p0, v7, Lq01;->ε:Lq01;

    .line 521
    .line 522
    move-object v0, v4

    .line 523
    :goto_17
    if-eqz p0, :cond_39

    .line 524
    .line 525
    instance-of v6, p0, Lu0;

    .line 526
    .line 527
    if-eqz v6, :cond_32

    .line 528
    .line 529
    check-cast p0, Lu0;

    .line 530
    .line 531
    goto :goto_1a

    .line 532
    :cond_32
    iget v6, p0, Lq01;->η:I

    .line 533
    .line 534
    and-int/lit16 v6, v6, 0x2000

    .line 535
    .line 536
    if-eqz v6, :cond_38

    .line 537
    .line 538
    instance-of v6, p0, Lya;

    .line 539
    .line 540
    if-eqz v6, :cond_38

    .line 541
    .line 542
    move-object v6, p0

    .line 543
    check-cast v6, Lya;

    .line 544
    .line 545
    iget-object v6, v6, Lya;->υ:Lq01;

    .line 546
    .line 547
    move v8, v2

    .line 548
    :goto_18
    if-eqz v6, :cond_37

    .line 549
    .line 550
    iget v9, v6, Lq01;->η:I

    .line 551
    .line 552
    and-int/lit16 v9, v9, 0x2000

    .line 553
    .line 554
    if-eqz v9, :cond_36

    .line 555
    .line 556
    add-int/lit8 v8, v8, 0x1

    .line 557
    .line 558
    if-ne v8, v5, :cond_33

    .line 559
    .line 560
    move-object p0, v6

    .line 561
    goto :goto_19

    .line 562
    :cond_33
    if-nez v0, :cond_34

    .line 563
    .line 564
    new-instance v0, Lk21;

    .line 565
    .line 566
    new-array v9, v3, [Lq01;

    .line 567
    .line 568
    invoke-direct {v0, v9}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_34
    if-eqz p0, :cond_35

    .line 572
    .line 573
    invoke-virtual {v0, p0}, Lk21;->β(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    move-object p0, v4

    .line 577
    :cond_35
    invoke-virtual {v0, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    :cond_36
    :goto_19
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 581
    .line 582
    goto :goto_18

    .line 583
    :cond_37
    if-ne v8, v5, :cond_38

    .line 584
    .line 585
    goto :goto_17

    .line 586
    :cond_38
    :goto_1a
    invoke-static {v0}, Lh62;->γ(Lk21;)Lq01;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    goto :goto_17

    .line 591
    :cond_39
    invoke-interface {p2}, Lp70;->invoke()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    check-cast p0, Ljava/lang/Boolean;

    .line 596
    .line 597
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 598
    .line 599
    .line 600
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 601
    if-eqz p0, :cond_3a

    .line 602
    .line 603
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 604
    .line 605
    .line 606
    return v5

    .line 607
    :cond_3a
    :try_start_4
    iget-object p0, v7, Lq01;->ε:Lq01;

    .line 608
    .line 609
    move-object p2, v4

    .line 610
    :goto_1b
    if-eqz p0, :cond_42

    .line 611
    .line 612
    instance-of v0, p0, Lu0;

    .line 613
    .line 614
    if-eqz v0, :cond_3b

    .line 615
    .line 616
    check-cast p0, Lu0;

    .line 617
    .line 618
    invoke-virtual {p0, p1}, Lu0;->В(Landroid/view/KeyEvent;)Z

    .line 619
    .line 620
    .line 621
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 622
    if-eqz p0, :cond_41

    .line 623
    .line 624
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 625
    .line 626
    .line 627
    return v5

    .line 628
    :cond_3b
    :try_start_5
    iget v0, p0, Lq01;->η:I

    .line 629
    .line 630
    and-int/lit16 v0, v0, 0x2000

    .line 631
    .line 632
    if-eqz v0, :cond_41

    .line 633
    .line 634
    instance-of v0, p0, Lya;

    .line 635
    .line 636
    if-eqz v0, :cond_41

    .line 637
    .line 638
    move-object v0, p0

    .line 639
    check-cast v0, Lya;

    .line 640
    .line 641
    iget-object v0, v0, Lya;->υ:Lq01;

    .line 642
    .line 643
    move v6, v2

    .line 644
    :goto_1c
    if-eqz v0, :cond_40

    .line 645
    .line 646
    iget v7, v0, Lq01;->η:I

    .line 647
    .line 648
    and-int/lit16 v7, v7, 0x2000

    .line 649
    .line 650
    if-eqz v7, :cond_3f

    .line 651
    .line 652
    add-int/lit8 v6, v6, 0x1

    .line 653
    .line 654
    if-ne v6, v5, :cond_3c

    .line 655
    .line 656
    move-object p0, v0

    .line 657
    goto :goto_1d

    .line 658
    :cond_3c
    if-nez p2, :cond_3d

    .line 659
    .line 660
    new-instance p2, Lk21;

    .line 661
    .line 662
    new-array v7, v3, [Lq01;

    .line 663
    .line 664
    invoke-direct {p2, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    :cond_3d
    if-eqz p0, :cond_3e

    .line 668
    .line 669
    invoke-virtual {p2, p0}, Lk21;->β(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    move-object p0, v4

    .line 673
    :cond_3e
    invoke-virtual {p2, v0}, Lk21;->β(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    :cond_3f
    :goto_1d
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 677
    .line 678
    goto :goto_1c

    .line 679
    :cond_40
    if-ne v6, v5, :cond_41

    .line 680
    .line 681
    goto :goto_1b

    .line 682
    :cond_41
    invoke-static {p2}, Lh62;->γ(Lk21;)Lq01;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    goto :goto_1b

    .line 687
    :cond_42
    if-eqz v1, :cond_44

    .line 688
    .line 689
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 690
    .line 691
    .line 692
    move-result p0

    .line 693
    move p2, v2

    .line 694
    :goto_1e
    if-ge p2, p0, :cond_44

    .line 695
    .line 696
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    check-cast v0, Lu0;

    .line 701
    .line 702
    invoke-virtual {v0, p1}, Lu0;->В(Landroid/view/KeyEvent;)Z

    .line 703
    .line 704
    .line 705
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 706
    if-eqz v0, :cond_43

    .line 707
    .line 708
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 709
    .line 710
    .line 711
    return v5

    .line 712
    :cond_43
    add-int/lit8 p2, p2, 0x1

    .line 713
    .line 714
    goto :goto_1e

    .line 715
    :cond_44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 716
    .line 717
    .line 718
    return v2

    .line 719
    :catchall_0
    move-exception p0

    .line 720
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 721
    .line 722
    .line 723
    throw p0
.end method

.method public final ε(ILml1;La80;)Ljava/lang/Boolean;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Ly40;->γ:Lc50;

    .line 10
    .line 11
    invoke-static {v4}, Lln0;->ω(Lc50;)Lc50;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x6

    .line 18
    const/4 v10, 0x5

    .line 19
    const/4 v11, 0x2

    .line 20
    iget-object v13, v0, Ly40;->β:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 21
    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    if-eqz v5, :cond_24

    .line 28
    .line 29
    invoke-virtual {v13}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutDirection()Lnp0;

    .line 30
    .line 31
    .line 32
    move-result-object v18

    .line 33
    invoke-virtual {v5}, Lc50;->Д()Lz40;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    iget-object v6, v14, Lz40;->θ:La50;

    .line 38
    .line 39
    iget-object v12, v14, Lz40;->ι:La50;

    .line 40
    .line 41
    if-ne v1, v15, :cond_0

    .line 42
    .line 43
    iget-object v6, v14, Lz40;->β:La50;

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_0
    if-ne v1, v11, :cond_1

    .line 48
    .line 49
    iget-object v6, v14, Lz40;->γ:La50;

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    if-ne v1, v10, :cond_2

    .line 54
    .line 55
    iget-object v6, v14, Lz40;->δ:La50;

    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_2
    if-ne v1, v9, :cond_3

    .line 60
    .line 61
    iget-object v6, v14, Lz40;->ε:La50;

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    if-ne v1, v8, :cond_7

    .line 66
    .line 67
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_5

    .line 72
    .line 73
    if-ne v9, v15, :cond_4

    .line 74
    .line 75
    move-object v6, v12

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {}, Lγ;->κ()V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :cond_5
    :goto_0
    sget-object v9, La50;->β:La50;

    .line 83
    .line 84
    if-ne v6, v9, :cond_6

    .line 85
    .line 86
    move-object/from16 v6, v17

    .line 87
    .line 88
    :cond_6
    if-nez v6, :cond_f

    .line 89
    .line 90
    iget-object v6, v14, Lz40;->ζ:La50;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    if-ne v1, v7, :cond_b

    .line 94
    .line 95
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_9

    .line 100
    .line 101
    if-ne v9, v15, :cond_8

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    invoke-static {}, Lγ;->κ()V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    return-object v0

    .line 109
    :cond_9
    move-object v6, v12

    .line 110
    :goto_1
    sget-object v9, La50;->β:La50;

    .line 111
    .line 112
    if-ne v6, v9, :cond_a

    .line 113
    .line 114
    move-object/from16 v6, v17

    .line 115
    .line 116
    :cond_a
    if-nez v6, :cond_f

    .line 117
    .line 118
    iget-object v6, v14, Lz40;->η:La50;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_b
    const/4 v6, 0x7

    .line 122
    if-ne v1, v6, :cond_c

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_c
    const/16 v9, 0x8

    .line 126
    .line 127
    if-ne v1, v9, :cond_23

    .line 128
    .line 129
    :goto_2
    invoke-static {v5}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lv40;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    check-cast v9, Ly40;

    .line 138
    .line 139
    invoke-virtual {v9}, Ly40;->ζ()Lc50;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    if-ne v1, v6, :cond_d

    .line 144
    .line 145
    iget-object v6, v14, Lz40;->κ:La1;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_d
    iget-object v6, v14, Lz40;->λ:La1;

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-virtual {v9}, Ly40;->ζ()Lc50;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    if-eq v12, v6, :cond_e

    .line 161
    .line 162
    sget-object v6, La50;->δ:La50;

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_e
    sget-object v6, La50;->β:La50;

    .line 166
    .line 167
    :cond_f
    :goto_4
    sget-object v9, La50;->γ:La50;

    .line 168
    .line 169
    invoke-static {v6, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-eqz v12, :cond_10

    .line 174
    .line 175
    goto/16 :goto_11

    .line 176
    .line 177
    :cond_10
    sget-object v12, La50;->δ:La50;

    .line 178
    .line 179
    invoke-static {v6, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-eqz v12, :cond_11

    .line 184
    .line 185
    invoke-static {v4}, Lln0;->ω(Lc50;)Lc50;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_30

    .line 190
    .line 191
    invoke-interface {v3, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Ljava/lang/Boolean;

    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_11
    sget-object v12, La50;->β:La50;

    .line 199
    .line 200
    invoke-static {v6, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-nez v14, :cond_25

    .line 205
    .line 206
    const-string v0, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 207
    .line 208
    if-eq v6, v12, :cond_22

    .line 209
    .line 210
    if-eq v6, v9, :cond_21

    .line 211
    .line 212
    iget-object v0, v6, La50;->α:Lk21;

    .line 213
    .line 214
    iget v1, v0, Lk21;->η:I

    .line 215
    .line 216
    if-nez v1, :cond_12

    .line 217
    .line 218
    const-string v0, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 219
    .line 220
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 221
    .line 222
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_c

    .line 226
    .line 227
    :cond_12
    iget-object v0, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 228
    .line 229
    move/from16 v2, v16

    .line 230
    .line 231
    move v4, v2

    .line 232
    :goto_5
    if-ge v2, v1, :cond_20

    .line 233
    .line 234
    aget-object v5, v0, v2

    .line 235
    .line 236
    check-cast v5, Lp8;

    .line 237
    .line 238
    iget-object v6, v5, Lq01;->ε:Lq01;

    .line 239
    .line 240
    iget-boolean v6, v6, Lq01;->σ:Z

    .line 241
    .line 242
    if-nez v6, :cond_13

    .line 243
    .line 244
    const-string v6, "visitChildren called on an unattached node"

    .line 245
    .line 246
    invoke-static {v6}, Lam0;->β(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :cond_13
    new-instance v6, Lk21;

    .line 250
    .line 251
    const/16 v7, 0x10

    .line 252
    .line 253
    new-array v8, v7, [Lq01;

    .line 254
    .line 255
    invoke-direct {v6, v8}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object v5, v5, Lq01;->ε:Lq01;

    .line 259
    .line 260
    iget-object v7, v5, Lq01;->κ:Lq01;

    .line 261
    .line 262
    if-nez v7, :cond_14

    .line 263
    .line 264
    invoke-static {v6, v5}, Lh62;->β(Lk21;Lq01;)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_14
    invoke-virtual {v6, v7}, Lk21;->β(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_15
    :goto_6
    iget v5, v6, Lk21;->η:I

    .line 272
    .line 273
    if-eqz v5, :cond_1f

    .line 274
    .line 275
    add-int/lit8 v5, v5, -0x1

    .line 276
    .line 277
    invoke-virtual {v6, v5}, Lk21;->λ(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    check-cast v5, Lq01;

    .line 282
    .line 283
    iget v7, v5, Lq01;->θ:I

    .line 284
    .line 285
    and-int/lit16 v7, v7, 0x400

    .line 286
    .line 287
    if-nez v7, :cond_16

    .line 288
    .line 289
    invoke-static {v6, v5}, Lh62;->β(Lk21;Lq01;)V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_16
    :goto_7
    if-eqz v5, :cond_15

    .line 294
    .line 295
    iget v7, v5, Lq01;->η:I

    .line 296
    .line 297
    and-int/lit16 v7, v7, 0x400

    .line 298
    .line 299
    if-eqz v7, :cond_1e

    .line 300
    .line 301
    move-object/from16 v7, v17

    .line 302
    .line 303
    :goto_8
    if-eqz v5, :cond_15

    .line 304
    .line 305
    instance-of v8, v5, Lc50;

    .line 306
    .line 307
    if-eqz v8, :cond_17

    .line 308
    .line 309
    check-cast v5, Lc50;

    .line 310
    .line 311
    invoke-interface {v3, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    check-cast v5, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_1d

    .line 322
    .line 323
    move v4, v15

    .line 324
    goto :goto_b

    .line 325
    :cond_17
    iget v8, v5, Lq01;->η:I

    .line 326
    .line 327
    and-int/lit16 v8, v8, 0x400

    .line 328
    .line 329
    if-eqz v8, :cond_1d

    .line 330
    .line 331
    instance-of v8, v5, Lya;

    .line 332
    .line 333
    if-eqz v8, :cond_1d

    .line 334
    .line 335
    move-object v8, v5

    .line 336
    check-cast v8, Lya;

    .line 337
    .line 338
    iget-object v8, v8, Lya;->υ:Lq01;

    .line 339
    .line 340
    move/from16 v9, v16

    .line 341
    .line 342
    :goto_9
    if-eqz v8, :cond_1c

    .line 343
    .line 344
    iget v10, v8, Lq01;->η:I

    .line 345
    .line 346
    and-int/lit16 v10, v10, 0x400

    .line 347
    .line 348
    if-eqz v10, :cond_1b

    .line 349
    .line 350
    add-int/lit8 v9, v9, 0x1

    .line 351
    .line 352
    if-ne v9, v15, :cond_18

    .line 353
    .line 354
    move-object v5, v8

    .line 355
    goto :goto_a

    .line 356
    :cond_18
    if-nez v7, :cond_19

    .line 357
    .line 358
    new-instance v7, Lk21;

    .line 359
    .line 360
    const/16 v10, 0x10

    .line 361
    .line 362
    new-array v11, v10, [Lq01;

    .line 363
    .line 364
    invoke-direct {v7, v11}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :cond_19
    if-eqz v5, :cond_1a

    .line 368
    .line 369
    invoke-virtual {v7, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    move-object/from16 v5, v17

    .line 373
    .line 374
    :cond_1a
    invoke-virtual {v7, v8}, Lk21;->β(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    :cond_1b
    :goto_a
    iget-object v8, v8, Lq01;->κ:Lq01;

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_1c
    if-ne v9, v15, :cond_1d

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_1d
    invoke-static {v7}, Lh62;->γ(Lk21;)Lq01;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    goto :goto_8

    .line 388
    :cond_1e
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_1f
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 392
    .line 393
    goto/16 :goto_5

    .line 394
    .line 395
    :cond_20
    move/from16 v16, v4

    .line 396
    .line 397
    :goto_c
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    return-object v0

    .line 402
    :cond_21
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const/4 v0, 0x0

    .line 406
    return-object v0

    .line 407
    :cond_22
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    const/4 v0, 0x0

    .line 411
    return-object v0

    .line 412
    :cond_23
    const-string v0, "invalid FocusDirection"

    .line 413
    .line 414
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    const/4 v0, 0x0

    .line 418
    return-object v0

    .line 419
    :cond_24
    move-object/from16 v5, v17

    .line 420
    .line 421
    :cond_25
    invoke-virtual {v13}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutDirection()Lnp0;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    new-instance v9, Llv;

    .line 426
    .line 427
    invoke-direct {v9, v5, v0, v3}, Llv;-><init>(Lc50;Ly40;La80;)V

    .line 428
    .line 429
    .line 430
    if-ne v1, v15, :cond_26

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_26
    if-ne v1, v11, :cond_29

    .line 434
    .line 435
    :goto_d
    if-ne v1, v15, :cond_27

    .line 436
    .line 437
    invoke-static {v4, v9}, Lh62;->Τ(Lc50;Llv;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    goto :goto_e

    .line 442
    :cond_27
    if-ne v1, v11, :cond_28

    .line 443
    .line 444
    invoke-static {v4, v9}, Lh62;->ι(Lc50;Llv;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    :goto_e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    return-object v0

    .line 453
    :cond_28
    const-string v0, "This function should only be used for 1-D focus search"

    .line 454
    .line 455
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    const/4 v0, 0x0

    .line 459
    return-object v0

    .line 460
    :cond_29
    if-ne v1, v8, :cond_2a

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_2a
    if-ne v1, v7, :cond_2b

    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_2b
    if-ne v1, v10, :cond_2c

    .line 467
    .line 468
    goto :goto_f

    .line 469
    :cond_2c
    const/4 v0, 0x6

    .line 470
    if-ne v1, v0, :cond_2d

    .line 471
    .line 472
    :goto_f
    invoke-static {v1, v9, v4, v2}, Lj81;->Ρ(ILlv;Lc50;Lml1;)Ljava/lang/Boolean;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    return-object v0

    .line 477
    :cond_2d
    const/4 v0, 0x7

    .line 478
    if-ne v1, v0, :cond_31

    .line 479
    .line 480
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_2f

    .line 485
    .line 486
    if-ne v0, v15, :cond_2e

    .line 487
    .line 488
    move v7, v8

    .line 489
    goto :goto_10

    .line 490
    :cond_2e
    invoke-static {}, Lγ;->κ()V

    .line 491
    .line 492
    .line 493
    const/4 v0, 0x0

    .line 494
    return-object v0

    .line 495
    :cond_2f
    :goto_10
    invoke-static {v4}, Lln0;->ω(Lc50;)Lc50;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    if-eqz v0, :cond_30

    .line 500
    .line 501
    invoke-static {v7, v9, v0, v2}, Lj81;->Ρ(ILlv;Lc50;Lml1;)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    return-object v0

    .line 506
    :cond_30
    :goto_11
    return-object v17

    .line 507
    :cond_31
    const/16 v0, 0x8

    .line 508
    .line 509
    if-ne v1, v0, :cond_41

    .line 510
    .line 511
    invoke-static {v4}, Lln0;->ω(Lc50;)Lc50;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    if-eqz v0, :cond_3e

    .line 516
    .line 517
    iget-object v1, v0, Lq01;->ε:Lq01;

    .line 518
    .line 519
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 520
    .line 521
    if-nez v1, :cond_32

    .line 522
    .line 523
    const-string v1, "visitAncestors called on an unattached node"

    .line 524
    .line 525
    invoke-static {v1}, Lam0;->β(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    :cond_32
    iget-object v1, v0, Lq01;->ε:Lq01;

    .line 529
    .line 530
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 531
    .line 532
    invoke-static {v0}, Lh62;->ц(Lur;)Lyp0;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    :goto_12
    if-eqz v0, :cond_3e

    .line 537
    .line 538
    iget-object v2, v0, Lyp0;->Κ:Lk31;

    .line 539
    .line 540
    iget-object v2, v2, Lk31;->ζ:Lq01;

    .line 541
    .line 542
    iget v2, v2, Lq01;->θ:I

    .line 543
    .line 544
    and-int/lit16 v2, v2, 0x400

    .line 545
    .line 546
    if-eqz v2, :cond_3c

    .line 547
    .line 548
    :goto_13
    if-eqz v1, :cond_3c

    .line 549
    .line 550
    iget v2, v1, Lq01;->η:I

    .line 551
    .line 552
    and-int/lit16 v2, v2, 0x400

    .line 553
    .line 554
    if-eqz v2, :cond_3b

    .line 555
    .line 556
    move-object v2, v1

    .line 557
    move-object/from16 v3, v17

    .line 558
    .line 559
    :goto_14
    if-eqz v2, :cond_3b

    .line 560
    .line 561
    instance-of v5, v2, Lc50;

    .line 562
    .line 563
    if-eqz v5, :cond_34

    .line 564
    .line 565
    check-cast v2, Lc50;

    .line 566
    .line 567
    invoke-virtual {v2}, Lc50;->Д()Lz40;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    iget-boolean v5, v5, Lz40;->α:Z

    .line 572
    .line 573
    if-eqz v5, :cond_33

    .line 574
    .line 575
    move-object v15, v2

    .line 576
    goto/16 :goto_19

    .line 577
    .line 578
    :cond_33
    const/16 v7, 0x10

    .line 579
    .line 580
    goto :goto_18

    .line 581
    :cond_34
    iget v5, v2, Lq01;->η:I

    .line 582
    .line 583
    and-int/lit16 v5, v5, 0x400

    .line 584
    .line 585
    if-eqz v5, :cond_33

    .line 586
    .line 587
    instance-of v5, v2, Lya;

    .line 588
    .line 589
    if-eqz v5, :cond_33

    .line 590
    .line 591
    move-object v5, v2

    .line 592
    check-cast v5, Lya;

    .line 593
    .line 594
    iget-object v5, v5, Lya;->υ:Lq01;

    .line 595
    .line 596
    move/from16 v6, v16

    .line 597
    .line 598
    :goto_15
    if-eqz v5, :cond_39

    .line 599
    .line 600
    iget v7, v5, Lq01;->η:I

    .line 601
    .line 602
    and-int/lit16 v7, v7, 0x400

    .line 603
    .line 604
    if-eqz v7, :cond_35

    .line 605
    .line 606
    add-int/lit8 v6, v6, 0x1

    .line 607
    .line 608
    if-ne v6, v15, :cond_36

    .line 609
    .line 610
    move-object v2, v5

    .line 611
    :cond_35
    const/16 v7, 0x10

    .line 612
    .line 613
    goto :goto_17

    .line 614
    :cond_36
    if-nez v3, :cond_37

    .line 615
    .line 616
    new-instance v3, Lk21;

    .line 617
    .line 618
    const/16 v7, 0x10

    .line 619
    .line 620
    new-array v8, v7, [Lq01;

    .line 621
    .line 622
    invoke-direct {v3, v8}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    goto :goto_16

    .line 626
    :cond_37
    const/16 v7, 0x10

    .line 627
    .line 628
    :goto_16
    if-eqz v2, :cond_38

    .line 629
    .line 630
    invoke-virtual {v3, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    move-object/from16 v2, v17

    .line 634
    .line 635
    :cond_38
    invoke-virtual {v3, v5}, Lk21;->β(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    :goto_17
    iget-object v5, v5, Lq01;->κ:Lq01;

    .line 639
    .line 640
    goto :goto_15

    .line 641
    :cond_39
    const/16 v7, 0x10

    .line 642
    .line 643
    if-ne v6, v15, :cond_3a

    .line 644
    .line 645
    goto :goto_14

    .line 646
    :cond_3a
    :goto_18
    invoke-static {v3}, Lh62;->γ(Lk21;)Lq01;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    goto :goto_14

    .line 651
    :cond_3b
    const/16 v7, 0x10

    .line 652
    .line 653
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :cond_3c
    const/16 v7, 0x10

    .line 657
    .line 658
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    if-eqz v0, :cond_3d

    .line 663
    .line 664
    iget-object v1, v0, Lyp0;->Κ:Lk31;

    .line 665
    .line 666
    if-eqz v1, :cond_3d

    .line 667
    .line 668
    iget-object v1, v1, Lk31;->ε:Lq22;

    .line 669
    .line 670
    goto/16 :goto_12

    .line 671
    .line 672
    :cond_3d
    move-object/from16 v1, v17

    .line 673
    .line 674
    goto/16 :goto_12

    .line 675
    .line 676
    :cond_3e
    move-object/from16 v15, v17

    .line 677
    .line 678
    :goto_19
    if-eqz v15, :cond_40

    .line 679
    .line 680
    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-eqz v0, :cond_3f

    .line 685
    .line 686
    goto :goto_1a

    .line 687
    :cond_3f
    invoke-virtual {v9, v15}, Llv;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    check-cast v0, Ljava/lang/Boolean;

    .line 692
    .line 693
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 694
    .line 695
    .line 696
    move-result v16

    .line 697
    :cond_40
    :goto_1a
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    return-object v0

    .line 702
    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 703
    .line 704
    invoke-static {v1}, Lq40;->α(I)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    new-instance v2, Ljava/lang/StringBuilder;

    .line 709
    .line 710
    const-string v3, "Focus search invoked with invalid FocusDirection "

    .line 711
    .line 712
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    throw v0
.end method

.method public final ζ()Lc50;
    .locals 2

    .line 1
    iget-object p0, p0, Ly40;->θ:Lc50;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lq01;->σ:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final η(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Ly40;->β(IZZ)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance v1, Lc1;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, p1, v2}, Lc1;-><init>(II)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, v2, v1}, Ly40;->ε(ILml1;La80;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :cond_1
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Ly40;->γ()V

    .line 29
    .line 30
    .line 31
    :cond_2
    return v0
.end method

.method public final θ(Lc50;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly40;->θ:Lc50;

    .line 2
    .line 3
    iput-object p1, p0, Ly40;->θ:Lc50;

    .line 4
    .line 5
    iget-object p0, p0, Ly40;->η:Lv11;

    .line 6
    .line 7
    iget-object v1, p0, Lv11;->α:[Ljava/lang/Object;

    .line 8
    .line 9
    iget p0, p0, Lv11;->β:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, p0, :cond_0

    .line 13
    .line 14
    aget-object v3, v1, v2

    .line 15
    .line 16
    check-cast v3, Lt40;

    .line 17
    .line 18
    invoke-interface {v3, v0, p1}, Lt40;->α(Lc50;Lc50;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final ι(Landroid/view/KeyEvent;)Z
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lh62;->α(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    if-eq v3, v6, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v4

    .line 26
    :goto_0
    const v12, -0x3361d2af    # -8.293031E7f

    .line 27
    .line 28
    .line 29
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide/16 v17, 0x0

    .line 35
    .line 36
    const-wide v19, 0x101010101010101L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide/16 v21, 0xfe

    .line 42
    .line 43
    const/16 p1, 0x0

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/16 v23, 0x6

    .line 48
    .line 49
    const/4 v7, 0x3

    .line 50
    if-ne v3, v4, :cond_12

    .line 51
    .line 52
    iget-object v3, v0, Ly40;->ζ:Ls11;

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    new-instance v3, Ls11;

    .line 57
    .line 58
    invoke-direct {v3, v7}, Ls11;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v0, Ly40;->ζ:Ls11;

    .line 62
    .line 63
    :cond_2
    move-object v4, v3

    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    mul-int/2addr v0, v12

    .line 69
    shl-int/lit8 v3, v0, 0x10

    .line 70
    .line 71
    xor-int/2addr v0, v3

    .line 72
    ushr-int/lit8 v3, v0, 0x7

    .line 73
    .line 74
    and-int/lit8 v0, v0, 0x7f

    .line 75
    .line 76
    move/from16 v24, v7

    .line 77
    .line 78
    iget v7, v4, Ls11;->γ:I

    .line 79
    .line 80
    and-int v25, v3, v7

    .line 81
    .line 82
    move/from16 v26, p1

    .line 83
    .line 84
    const-wide/16 v27, 0x1

    .line 85
    .line 86
    :goto_1
    iget-object v8, v4, Ls11;->α:[J

    .line 87
    .line 88
    shr-int/lit8 v9, v25, 0x3

    .line 89
    .line 90
    and-int/lit8 v29, v25, 0x7

    .line 91
    .line 92
    const/16 v30, 0x3f

    .line 93
    .line 94
    shl-int/lit8 v10, v29, 0x3

    .line 95
    .line 96
    aget-wide v31, v8, v9

    .line 97
    .line 98
    ushr-long v31, v31, v10

    .line 99
    .line 100
    add-int/2addr v9, v6

    .line 101
    aget-wide v8, v8, v9

    .line 102
    .line 103
    rsub-int/lit8 v29, v10, 0x40

    .line 104
    .line 105
    shl-long v8, v8, v29

    .line 106
    .line 107
    move/from16 v33, v12

    .line 108
    .line 109
    const/16 v29, 0x7

    .line 110
    .line 111
    int-to-long v11, v10

    .line 112
    neg-long v10, v11

    .line 113
    shr-long v10, v10, v30

    .line 114
    .line 115
    and-long/2addr v8, v10

    .line 116
    or-long v8, v31, v8

    .line 117
    .line 118
    int-to-long v10, v0

    .line 119
    mul-long v31, v10, v19

    .line 120
    .line 121
    const-wide/16 v34, 0xff

    .line 122
    .line 123
    xor-long v13, v8, v31

    .line 124
    .line 125
    sub-long v31, v13, v19

    .line 126
    .line 127
    not-long v12, v13

    .line 128
    and-long v12, v31, v12

    .line 129
    .line 130
    and-long/2addr v12, v15

    .line 131
    :goto_2
    cmp-long v14, v12, v17

    .line 132
    .line 133
    if-eqz v14, :cond_4

    .line 134
    .line 135
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    shr-int/lit8 v14, v14, 0x3

    .line 140
    .line 141
    add-int v14, v25, v14

    .line 142
    .line 143
    and-int/2addr v14, v7

    .line 144
    move-wide/from16 v31, v15

    .line 145
    .line 146
    iget-object v15, v4, Ls11;->β:[J

    .line 147
    .line 148
    aget-wide v15, v15, v14

    .line 149
    .line 150
    cmp-long v15, v15, v1

    .line 151
    .line 152
    if-nez v15, :cond_3

    .line 153
    .line 154
    move/from16 p0, v6

    .line 155
    .line 156
    goto/16 :goto_d

    .line 157
    .line 158
    :cond_3
    sub-long v14, v12, v27

    .line 159
    .line 160
    and-long/2addr v12, v14

    .line 161
    move-wide/from16 v15, v31

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    move-wide/from16 v31, v15

    .line 165
    .line 166
    not-long v12, v8

    .line 167
    shl-long v12, v12, v23

    .line 168
    .line 169
    and-long/2addr v8, v12

    .line 170
    and-long v8, v8, v31

    .line 171
    .line 172
    cmp-long v8, v8, v17

    .line 173
    .line 174
    if-eqz v8, :cond_11

    .line 175
    .line 176
    invoke-virtual {v4, v3}, Ls11;->β(I)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iget v7, v4, Ls11;->ε:I

    .line 181
    .line 182
    if-nez v7, :cond_5

    .line 183
    .line 184
    iget-object v7, v4, Ls11;->α:[J

    .line 185
    .line 186
    shr-int/lit8 v12, v0, 0x3

    .line 187
    .line 188
    aget-wide v12, v7, v12

    .line 189
    .line 190
    and-int/lit8 v7, v0, 0x7

    .line 191
    .line 192
    shl-int/lit8 v7, v7, 0x3

    .line 193
    .line 194
    shr-long/2addr v12, v7

    .line 195
    and-long v12, v12, v34

    .line 196
    .line 197
    cmp-long v7, v12, v21

    .line 198
    .line 199
    if-nez v7, :cond_6

    .line 200
    .line 201
    :cond_5
    move/from16 p0, v6

    .line 202
    .line 203
    const-wide/16 v19, 0x80

    .line 204
    .line 205
    goto/16 :goto_b

    .line 206
    .line 207
    :cond_6
    iget v0, v4, Ls11;->γ:I

    .line 208
    .line 209
    if-le v0, v5, :cond_e

    .line 210
    .line 211
    iget v7, v4, Ls11;->δ:I

    .line 212
    .line 213
    int-to-long v12, v7

    .line 214
    const-wide/16 v14, 0x20

    .line 215
    .line 216
    mul-long/2addr v12, v14

    .line 217
    int-to-long v14, v0

    .line 218
    const-wide/16 v19, 0x19

    .line 219
    .line 220
    mul-long v14, v14, v19

    .line 221
    .line 222
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-gtz v0, :cond_e

    .line 227
    .line 228
    iget-object v0, v4, Ls11;->α:[J

    .line 229
    .line 230
    iget v7, v4, Ls11;->γ:I

    .line 231
    .line 232
    iget-object v12, v4, Ls11;->β:[J

    .line 233
    .line 234
    add-int/lit8 v13, v7, 0x7

    .line 235
    .line 236
    shr-int/lit8 v13, v13, 0x3

    .line 237
    .line 238
    move/from16 v14, p1

    .line 239
    .line 240
    :goto_3
    if-ge v14, v13, :cond_7

    .line 241
    .line 242
    aget-wide v15, v0, v14

    .line 243
    .line 244
    const-wide/16 v19, 0x80

    .line 245
    .line 246
    and-long v8, v15, v31

    .line 247
    .line 248
    move/from16 v16, v5

    .line 249
    .line 250
    move v15, v6

    .line 251
    not-long v5, v8

    .line 252
    ushr-long v8, v8, v29

    .line 253
    .line 254
    add-long/2addr v5, v8

    .line 255
    const-wide v8, -0x101010101010102L

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    and-long/2addr v5, v8

    .line 261
    aput-wide v5, v0, v14

    .line 262
    .line 263
    add-int/lit8 v14, v14, 0x1

    .line 264
    .line 265
    move v6, v15

    .line 266
    move/from16 v5, v16

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_7
    move/from16 v16, v5

    .line 270
    .line 271
    move v15, v6

    .line 272
    const-wide/16 v19, 0x80

    .line 273
    .line 274
    invoke-static {v0}, Lg7;->г([J)I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    add-int/lit8 v6, v5, -0x1

    .line 279
    .line 280
    aget-wide v8, v0, v6

    .line 281
    .line 282
    const-wide v13, 0xffffffffffffffL

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    and-long/2addr v8, v13

    .line 288
    const-wide/high16 v25, -0x100000000000000L

    .line 289
    .line 290
    or-long v8, v8, v25

    .line 291
    .line 292
    aput-wide v8, v0, v6

    .line 293
    .line 294
    aget-wide v8, v0, p1

    .line 295
    .line 296
    aput-wide v8, v0, v5

    .line 297
    .line 298
    move/from16 v5, p1

    .line 299
    .line 300
    :goto_4
    if-eq v5, v7, :cond_c

    .line 301
    .line 302
    shr-int/lit8 v6, v5, 0x3

    .line 303
    .line 304
    aget-wide v8, v0, v6

    .line 305
    .line 306
    and-int/lit8 v23, v5, 0x7

    .line 307
    .line 308
    shl-int/lit8 v23, v23, 0x3

    .line 309
    .line 310
    shr-long v8, v8, v23

    .line 311
    .line 312
    and-long v8, v8, v34

    .line 313
    .line 314
    cmp-long v25, v8, v19

    .line 315
    .line 316
    if-nez v25, :cond_8

    .line 317
    .line 318
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_8
    cmp-long v8, v8, v21

    .line 322
    .line 323
    if-eqz v8, :cond_9

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_9
    aget-wide v8, v12, v5

    .line 327
    .line 328
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    mul-int v8, v8, v33

    .line 333
    .line 334
    shl-int/lit8 v9, v8, 0x10

    .line 335
    .line 336
    xor-int/2addr v8, v9

    .line 337
    ushr-int/lit8 v9, v8, 0x7

    .line 338
    .line 339
    invoke-virtual {v4, v9}, Ls11;->β(I)I

    .line 340
    .line 341
    .line 342
    move-result v25

    .line 343
    and-int/2addr v9, v7

    .line 344
    sub-int v26, v25, v9

    .line 345
    .line 346
    and-int v26, v26, v7

    .line 347
    .line 348
    move-wide/from16 v27, v13

    .line 349
    .line 350
    div-int/lit8 v13, v26, 0x8

    .line 351
    .line 352
    sub-int v9, v5, v9

    .line 353
    .line 354
    and-int/2addr v9, v7

    .line 355
    div-int/lit8 v9, v9, 0x8

    .line 356
    .line 357
    const-wide/high16 v30, -0x8000000000000000L

    .line 358
    .line 359
    if-ne v13, v9, :cond_a

    .line 360
    .line 361
    and-int/lit8 v8, v8, 0x7f

    .line 362
    .line 363
    int-to-long v8, v8

    .line 364
    aget-wide v13, v0, v6

    .line 365
    .line 366
    move/from16 v26, v5

    .line 367
    .line 368
    move/from16 p0, v6

    .line 369
    .line 370
    shl-long v5, v34, v23

    .line 371
    .line 372
    not-long v5, v5

    .line 373
    and-long/2addr v5, v13

    .line 374
    shl-long v8, v8, v23

    .line 375
    .line 376
    or-long/2addr v5, v8

    .line 377
    aput-wide v5, v0, p0

    .line 378
    .line 379
    array-length v5, v0

    .line 380
    sub-int/2addr v5, v15

    .line 381
    aget-wide v8, v0, p1

    .line 382
    .line 383
    and-long v8, v8, v27

    .line 384
    .line 385
    or-long v8, v8, v30

    .line 386
    .line 387
    aput-wide v8, v0, v5

    .line 388
    .line 389
    add-int/lit8 v5, v26, 0x1

    .line 390
    .line 391
    :goto_6
    move-wide/from16 v13, v27

    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_a
    move/from16 v26, v5

    .line 395
    .line 396
    move/from16 p0, v6

    .line 397
    .line 398
    shr-int/lit8 v5, v25, 0x3

    .line 399
    .line 400
    aget-wide v13, v0, v5

    .line 401
    .line 402
    and-int/lit8 v6, v25, 0x7

    .line 403
    .line 404
    shl-int/lit8 v6, v6, 0x3

    .line 405
    .line 406
    shr-long v36, v13, v6

    .line 407
    .line 408
    and-long v36, v36, v34

    .line 409
    .line 410
    cmp-long v9, v36, v19

    .line 411
    .line 412
    if-nez v9, :cond_b

    .line 413
    .line 414
    and-int/lit8 v8, v8, 0x7f

    .line 415
    .line 416
    int-to-long v8, v8

    .line 417
    move/from16 v32, v5

    .line 418
    .line 419
    move/from16 v36, v6

    .line 420
    .line 421
    shl-long v5, v34, v36

    .line 422
    .line 423
    not-long v5, v5

    .line 424
    and-long/2addr v5, v13

    .line 425
    shl-long v8, v8, v36

    .line 426
    .line 427
    or-long/2addr v5, v8

    .line 428
    aput-wide v5, v0, v32

    .line 429
    .line 430
    aget-wide v5, v0, p0

    .line 431
    .line 432
    shl-long v8, v34, v23

    .line 433
    .line 434
    not-long v8, v8

    .line 435
    and-long/2addr v5, v8

    .line 436
    shl-long v8, v19, v23

    .line 437
    .line 438
    or-long/2addr v5, v8

    .line 439
    aput-wide v5, v0, p0

    .line 440
    .line 441
    aget-wide v5, v12, v26

    .line 442
    .line 443
    aput-wide v5, v12, v25

    .line 444
    .line 445
    aput-wide v17, v12, v26

    .line 446
    .line 447
    move/from16 v5, v26

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_b
    move/from16 v32, v5

    .line 451
    .line 452
    move/from16 v36, v6

    .line 453
    .line 454
    and-int/lit8 v5, v8, 0x7f

    .line 455
    .line 456
    int-to-long v5, v5

    .line 457
    shl-long v8, v34, v36

    .line 458
    .line 459
    not-long v8, v8

    .line 460
    and-long/2addr v8, v13

    .line 461
    shl-long v5, v5, v36

    .line 462
    .line 463
    or-long/2addr v5, v8

    .line 464
    aput-wide v5, v0, v32

    .line 465
    .line 466
    aget-wide v5, v12, v25

    .line 467
    .line 468
    aget-wide v8, v12, v26

    .line 469
    .line 470
    aput-wide v8, v12, v25

    .line 471
    .line 472
    aput-wide v5, v12, v26

    .line 473
    .line 474
    add-int/lit8 v5, v26, -0x1

    .line 475
    .line 476
    :goto_7
    array-length v6, v0

    .line 477
    sub-int/2addr v6, v15

    .line 478
    aget-wide v8, v0, p1

    .line 479
    .line 480
    and-long v8, v8, v27

    .line 481
    .line 482
    or-long v8, v8, v30

    .line 483
    .line 484
    aput-wide v8, v0, v6

    .line 485
    .line 486
    add-int/2addr v5, v15

    .line 487
    goto :goto_6

    .line 488
    :cond_c
    iget v0, v4, Ls11;->γ:I

    .line 489
    .line 490
    invoke-static {v0}, Ltq1;->α(I)I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    iget v5, v4, Ls11;->δ:I

    .line 495
    .line 496
    sub-int/2addr v0, v5

    .line 497
    iput v0, v4, Ls11;->ε:I

    .line 498
    .line 499
    :cond_d
    move/from16 p0, v15

    .line 500
    .line 501
    goto/16 :goto_a

    .line 502
    .line 503
    :cond_e
    move v15, v6

    .line 504
    const-wide/16 v19, 0x80

    .line 505
    .line 506
    iget v0, v4, Ls11;->γ:I

    .line 507
    .line 508
    invoke-static {v0}, Ltq1;->β(I)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    iget-object v5, v4, Ls11;->α:[J

    .line 513
    .line 514
    iget-object v6, v4, Ls11;->β:[J

    .line 515
    .line 516
    iget v7, v4, Ls11;->γ:I

    .line 517
    .line 518
    invoke-virtual {v4, v0}, Ls11;->γ(I)V

    .line 519
    .line 520
    .line 521
    iget-object v0, v4, Ls11;->α:[J

    .line 522
    .line 523
    iget-object v8, v4, Ls11;->β:[J

    .line 524
    .line 525
    iget v9, v4, Ls11;->γ:I

    .line 526
    .line 527
    move/from16 v12, p1

    .line 528
    .line 529
    :goto_8
    if-ge v12, v7, :cond_d

    .line 530
    .line 531
    shr-int/lit8 v13, v12, 0x3

    .line 532
    .line 533
    aget-wide v13, v5, v13

    .line 534
    .line 535
    and-int/lit8 v16, v12, 0x7

    .line 536
    .line 537
    shl-int/lit8 v16, v16, 0x3

    .line 538
    .line 539
    shr-long v13, v13, v16

    .line 540
    .line 541
    and-long v13, v13, v34

    .line 542
    .line 543
    cmp-long v13, v13, v19

    .line 544
    .line 545
    if-gez v13, :cond_f

    .line 546
    .line 547
    aget-wide v13, v6, v12

    .line 548
    .line 549
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 550
    .line 551
    .line 552
    move-result v16

    .line 553
    mul-int v16, v16, v33

    .line 554
    .line 555
    shl-int/lit8 v17, v16, 0x10

    .line 556
    .line 557
    xor-int v16, v16, v17

    .line 558
    .line 559
    move/from16 p0, v15

    .line 560
    .line 561
    ushr-int/lit8 v15, v16, 0x7

    .line 562
    .line 563
    invoke-virtual {v4, v15}, Ls11;->β(I)I

    .line 564
    .line 565
    .line 566
    move-result v15

    .line 567
    move-object/from16 v17, v0

    .line 568
    .line 569
    and-int/lit8 v0, v16, 0x7f

    .line 570
    .line 571
    move-object/from16 v16, v5

    .line 572
    .line 573
    move-object/from16 v18, v6

    .line 574
    .line 575
    int-to-long v5, v0

    .line 576
    shr-int/lit8 v0, v15, 0x3

    .line 577
    .line 578
    and-int/lit8 v21, v15, 0x7

    .line 579
    .line 580
    shl-int/lit8 v21, v21, 0x3

    .line 581
    .line 582
    aget-wide v22, v17, v0

    .line 583
    .line 584
    move-wide/from16 v25, v5

    .line 585
    .line 586
    shl-long v5, v34, v21

    .line 587
    .line 588
    not-long v5, v5

    .line 589
    and-long v5, v22, v5

    .line 590
    .line 591
    shl-long v21, v25, v21

    .line 592
    .line 593
    or-long v5, v5, v21

    .line 594
    .line 595
    aput-wide v5, v17, v0

    .line 596
    .line 597
    add-int/lit8 v0, v15, -0x7

    .line 598
    .line 599
    and-int/2addr v0, v9

    .line 600
    and-int/lit8 v21, v9, 0x7

    .line 601
    .line 602
    add-int v0, v0, v21

    .line 603
    .line 604
    shr-int/lit8 v0, v0, 0x3

    .line 605
    .line 606
    aput-wide v5, v17, v0

    .line 607
    .line 608
    aput-wide v13, v8, v15

    .line 609
    .line 610
    goto :goto_9

    .line 611
    :cond_f
    move-object/from16 v17, v0

    .line 612
    .line 613
    move-object/from16 v16, v5

    .line 614
    .line 615
    move-object/from16 v18, v6

    .line 616
    .line 617
    move/from16 p0, v15

    .line 618
    .line 619
    :goto_9
    add-int/lit8 v12, v12, 0x1

    .line 620
    .line 621
    move/from16 v15, p0

    .line 622
    .line 623
    move-object/from16 v5, v16

    .line 624
    .line 625
    move-object/from16 v0, v17

    .line 626
    .line 627
    move-object/from16 v6, v18

    .line 628
    .line 629
    goto :goto_8

    .line 630
    :goto_a
    invoke-virtual {v4, v3}, Ls11;->β(I)I

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    :goto_b
    move v14, v0

    .line 635
    iget v0, v4, Ls11;->δ:I

    .line 636
    .line 637
    add-int/lit8 v0, v0, 0x1

    .line 638
    .line 639
    iput v0, v4, Ls11;->δ:I

    .line 640
    .line 641
    iget v0, v4, Ls11;->ε:I

    .line 642
    .line 643
    iget-object v3, v4, Ls11;->α:[J

    .line 644
    .line 645
    shr-int/lit8 v5, v14, 0x3

    .line 646
    .line 647
    aget-wide v6, v3, v5

    .line 648
    .line 649
    and-int/lit8 v8, v14, 0x7

    .line 650
    .line 651
    shl-int/lit8 v8, v8, 0x3

    .line 652
    .line 653
    shr-long v12, v6, v8

    .line 654
    .line 655
    and-long v12, v12, v34

    .line 656
    .line 657
    cmp-long v9, v12, v19

    .line 658
    .line 659
    if-nez v9, :cond_10

    .line 660
    .line 661
    move/from16 v9, p0

    .line 662
    .line 663
    goto :goto_c

    .line 664
    :cond_10
    move/from16 v9, p1

    .line 665
    .line 666
    :goto_c
    sub-int/2addr v0, v9

    .line 667
    iput v0, v4, Ls11;->ε:I

    .line 668
    .line 669
    iget v0, v4, Ls11;->γ:I

    .line 670
    .line 671
    shl-long v12, v34, v8

    .line 672
    .line 673
    not-long v12, v12

    .line 674
    and-long/2addr v6, v12

    .line 675
    shl-long v8, v10, v8

    .line 676
    .line 677
    or-long/2addr v6, v8

    .line 678
    aput-wide v6, v3, v5

    .line 679
    .line 680
    add-int/lit8 v5, v14, -0x7

    .line 681
    .line 682
    and-int/2addr v5, v0

    .line 683
    and-int/lit8 v0, v0, 0x7

    .line 684
    .line 685
    add-int/2addr v5, v0

    .line 686
    shr-int/lit8 v0, v5, 0x3

    .line 687
    .line 688
    aput-wide v6, v3, v0

    .line 689
    .line 690
    :goto_d
    iget-object v0, v4, Ls11;->β:[J

    .line 691
    .line 692
    aput-wide v1, v0, v14

    .line 693
    .line 694
    return p0

    .line 695
    :cond_11
    move/from16 v16, v5

    .line 696
    .line 697
    move/from16 p0, v6

    .line 698
    .line 699
    add-int/lit8 v26, v26, 0x8

    .line 700
    .line 701
    add-int v25, v25, v26

    .line 702
    .line 703
    and-int v25, v25, v7

    .line 704
    .line 705
    move-wide/from16 v15, v31

    .line 706
    .line 707
    move/from16 v12, v33

    .line 708
    .line 709
    goto/16 :goto_1

    .line 710
    .line 711
    :cond_12
    move/from16 v24, v7

    .line 712
    .line 713
    move/from16 v33, v12

    .line 714
    .line 715
    move-wide/from16 v31, v15

    .line 716
    .line 717
    const-wide/16 v27, 0x1

    .line 718
    .line 719
    const/16 v29, 0x7

    .line 720
    .line 721
    const/16 v30, 0x3f

    .line 722
    .line 723
    const-wide/16 v34, 0xff

    .line 724
    .line 725
    move/from16 v16, v5

    .line 726
    .line 727
    move v15, v6

    .line 728
    if-ne v3, v15, :cond_18

    .line 729
    .line 730
    iget-object v3, v0, Ly40;->ζ:Ls11;

    .line 731
    .line 732
    if-eqz v3, :cond_17

    .line 733
    .line 734
    invoke-virtual {v3, v1, v2}, Ls11;->α(J)Z

    .line 735
    .line 736
    .line 737
    move-result v3

    .line 738
    if-ne v3, v15, :cond_17

    .line 739
    .line 740
    iget-object v0, v0, Ly40;->ζ:Ls11;

    .line 741
    .line 742
    if-eqz v0, :cond_15

    .line 743
    .line 744
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    mul-int v3, v3, v33

    .line 749
    .line 750
    shl-int/lit8 v4, v3, 0x10

    .line 751
    .line 752
    xor-int/2addr v3, v4

    .line 753
    and-int/lit8 v4, v3, 0x7f

    .line 754
    .line 755
    iget v5, v0, Ls11;->γ:I

    .line 756
    .line 757
    ushr-int/lit8 v3, v3, 0x7

    .line 758
    .line 759
    and-int/2addr v3, v5

    .line 760
    move/from16 v6, p1

    .line 761
    .line 762
    :goto_e
    iget-object v7, v0, Ls11;->α:[J

    .line 763
    .line 764
    shr-int/lit8 v8, v3, 0x3

    .line 765
    .line 766
    and-int/lit8 v9, v3, 0x7

    .line 767
    .line 768
    shl-int/lit8 v9, v9, 0x3

    .line 769
    .line 770
    aget-wide v10, v7, v8

    .line 771
    .line 772
    ushr-long/2addr v10, v9

    .line 773
    const/4 v15, 0x1

    .line 774
    add-int/2addr v8, v15

    .line 775
    aget-wide v7, v7, v8

    .line 776
    .line 777
    rsub-int/lit8 v12, v9, 0x40

    .line 778
    .line 779
    shl-long/2addr v7, v12

    .line 780
    int-to-long v12, v9

    .line 781
    neg-long v12, v12

    .line 782
    shr-long v12, v12, v30

    .line 783
    .line 784
    and-long/2addr v7, v12

    .line 785
    or-long/2addr v7, v10

    .line 786
    int-to-long v9, v4

    .line 787
    mul-long v9, v9, v19

    .line 788
    .line 789
    xor-long/2addr v9, v7

    .line 790
    sub-long v11, v9, v19

    .line 791
    .line 792
    not-long v9, v9

    .line 793
    and-long/2addr v9, v11

    .line 794
    and-long v9, v9, v31

    .line 795
    .line 796
    :goto_f
    cmp-long v11, v9, v17

    .line 797
    .line 798
    if-eqz v11, :cond_14

    .line 799
    .line 800
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 801
    .line 802
    .line 803
    move-result v11

    .line 804
    shr-int/lit8 v11, v11, 0x3

    .line 805
    .line 806
    add-int/2addr v11, v3

    .line 807
    and-int/2addr v11, v5

    .line 808
    iget-object v12, v0, Ls11;->β:[J

    .line 809
    .line 810
    aget-wide v12, v12, v11

    .line 811
    .line 812
    cmp-long v12, v12, v1

    .line 813
    .line 814
    if-nez v12, :cond_13

    .line 815
    .line 816
    goto :goto_10

    .line 817
    :cond_13
    sub-long v11, v9, v27

    .line 818
    .line 819
    and-long/2addr v9, v11

    .line 820
    goto :goto_f

    .line 821
    :cond_14
    not-long v9, v7

    .line 822
    shl-long v9, v9, v23

    .line 823
    .line 824
    and-long/2addr v7, v9

    .line 825
    and-long v7, v7, v31

    .line 826
    .line 827
    cmp-long v7, v7, v17

    .line 828
    .line 829
    if-eqz v7, :cond_16

    .line 830
    .line 831
    const/4 v11, -0x1

    .line 832
    :goto_10
    if-ltz v11, :cond_15

    .line 833
    .line 834
    iget v1, v0, Ls11;->δ:I

    .line 835
    .line 836
    const/4 v15, 0x1

    .line 837
    sub-int/2addr v1, v15

    .line 838
    iput v1, v0, Ls11;->δ:I

    .line 839
    .line 840
    iget-object v1, v0, Ls11;->α:[J

    .line 841
    .line 842
    iget v0, v0, Ls11;->γ:I

    .line 843
    .line 844
    shr-int/lit8 v2, v11, 0x3

    .line 845
    .line 846
    and-int/lit8 v3, v11, 0x7

    .line 847
    .line 848
    shl-int/lit8 v3, v3, 0x3

    .line 849
    .line 850
    aget-wide v4, v1, v2

    .line 851
    .line 852
    shl-long v6, v34, v3

    .line 853
    .line 854
    not-long v6, v6

    .line 855
    and-long/2addr v4, v6

    .line 856
    shl-long v6, v21, v3

    .line 857
    .line 858
    or-long v3, v4, v6

    .line 859
    .line 860
    aput-wide v3, v1, v2

    .line 861
    .line 862
    add-int/lit8 v11, v11, -0x7

    .line 863
    .line 864
    and-int v2, v11, v0

    .line 865
    .line 866
    and-int/lit8 v0, v0, 0x7

    .line 867
    .line 868
    add-int/2addr v2, v0

    .line 869
    shr-int/lit8 v0, v2, 0x3

    .line 870
    .line 871
    aput-wide v3, v1, v0

    .line 872
    .line 873
    const/4 v15, 0x1

    .line 874
    return v15

    .line 875
    :cond_15
    const/4 v15, 0x1

    .line 876
    goto :goto_11

    .line 877
    :cond_16
    const/4 v15, 0x1

    .line 878
    add-int/lit8 v6, v6, 0x8

    .line 879
    .line 880
    add-int/2addr v3, v6

    .line 881
    and-int/2addr v3, v5

    .line 882
    goto :goto_e

    .line 883
    :cond_17
    return p1

    .line 884
    :cond_18
    :goto_11
    return v15
.end method
