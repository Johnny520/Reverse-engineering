.class public final Lz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lgr;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final ε:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final ζ:Lw0;

.field public η:Ln5;

.field public final θ:Ljava/util/ArrayList;

.field public final ι:J

.field public κ:Lv1;

.field public λ:Z

.field public final μ:Lwc;

.field public ν:Ln11;

.field public ξ:J

.field public final ο:Ln11;

.field public π:Lcs1;

.field public ρ:Z

.field public final σ:Lν;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lw0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, Lz1;->ζ:Lw0;

    .line 7
    .line 8
    new-instance p2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lz1;->θ:Ljava/util/ArrayList;

    .line 14
    .line 15
    const-wide/16 v0, 0x64

    .line 16
    .line 17
    iput-wide v0, p0, Lz1;->ι:J

    .line 18
    .line 19
    sget-object p2, Lv1;->ε:Lv1;

    .line 20
    .line 21
    iput-object p2, p0, Lz1;->κ:Lv1;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Lz1;->λ:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-static {p2, v0, v1}, Lln0;->β(ILuc;I)Lwc;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lz1;->μ:Lwc;

    .line 33
    .line 34
    new-instance p2, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    sget-object p2, Ltm0;->α:Ln11;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lz1;->ν:Ln11;

    .line 49
    .line 50
    new-instance v0, Ln11;

    .line 51
    .line 52
    invoke-direct {v0}, Ln11;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lz1;->ο:Ln11;

    .line 56
    .line 57
    new-instance v0, Lcs1;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Les1;->α()Lbs1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1, p2}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lz1;->π:Lcs1;

    .line 71
    .line 72
    new-instance p1, Lν;

    .line 73
    .line 74
    const/4 p2, 0x2

    .line 75
    invoke-direct {p1, p2, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lz1;->σ:Lν;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lz1;->σ:Lν;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lz1;->η:Ln5;

    .line 17
    .line 18
    return-void
.end method

.method public final α(Lpp;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lx1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lx1;

    .line 7
    .line 8
    iget v1, v0, Lx1;->λ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx1;->λ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lx1;-><init>(Lz1;Lpp;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lx1;->ι:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lx1;->λ:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lcq;->ε:Lcq;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, Lx1;->θ:Lvc;

    .line 40
    .line 41
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    iget-object v1, v0, Lx1;->θ:Lvc;

    .line 53
    .line 54
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lz1;->μ:Lwc;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v1, Lvc;

    .line 67
    .line 68
    invoke-direct {v1, p1}, Lvc;-><init>(Lwc;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    iput-object v1, v0, Lx1;->θ:Lvc;

    .line 72
    .line 73
    iput v3, v0, Lx1;->λ:I

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lvc;->β(Lpp;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_8

    .line 89
    .line 90
    invoke-virtual {v1}, Lvc;->γ()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lz1;->ζ()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-virtual {p0}, Lz1;->ι()V

    .line 100
    .line 101
    .line 102
    :cond_6
    iget-object p1, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-boolean v5, p0, Lz1;->ρ:Z

    .line 109
    .line 110
    if-nez v5, :cond_7

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iput-boolean v3, p0, Lz1;->ρ:Z

    .line 115
    .line 116
    iget-object v5, p0, Lz1;->σ:Lν;

    .line 117
    .line 118
    invoke-virtual {p1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    :cond_7
    iput-object v1, v0, Lx1;->θ:Lvc;

    .line 122
    .line 123
    iput v2, v0, Lx1;->λ:I

    .line 124
    .line 125
    iget-wide v5, p0, Lz1;->ι:J

    .line 126
    .line 127
    invoke-static {v5, v6, v0}, Ljx0;->τ(JLpp;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v4, :cond_4

    .line 132
    .line 133
    :goto_3
    return-object v4

    .line 134
    :cond_8
    sget-object p0, Ls62;->α:Ls62;

    .line 135
    .line 136
    return-object p0
.end method

.method public final β(Lsm0;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lsm0;->β:[I

    .line 6
    .line 7
    iget-object v3, v1, Lsm0;->α:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    if-ltz v4, :cond_1a

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    aget-wide v7, v3, v6

    .line 16
    .line 17
    not-long v9, v7

    .line 18
    const/4 v11, 0x7

    .line 19
    shl-long/2addr v9, v11

    .line 20
    and-long/2addr v9, v7

    .line 21
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v9, v12

    .line 27
    cmp-long v9, v9, v12

    .line 28
    .line 29
    if-eqz v9, :cond_19

    .line 30
    .line 31
    sub-int v9, v6, v4

    .line 32
    .line 33
    not-int v9, v9

    .line 34
    ushr-int/lit8 v9, v9, 0x1f

    .line 35
    .line 36
    const/16 v10, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v9, v9, 0x8

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    :goto_1
    if-ge v14, v9, :cond_18

    .line 42
    .line 43
    const-wide/16 v15, 0xff

    .line 44
    .line 45
    and-long v17, v7, v15

    .line 46
    .line 47
    const-wide/16 v19, 0x80

    .line 48
    .line 49
    cmp-long v17, v17, v19

    .line 50
    .line 51
    if-gez v17, :cond_17

    .line 52
    .line 53
    shl-int/lit8 v17, v6, 0x3

    .line 54
    .line 55
    add-int v17, v17, v14

    .line 56
    .line 57
    aget v5, v2, v17

    .line 58
    .line 59
    move/from16 v17, v11

    .line 60
    .line 61
    iget-object v11, v0, Lz1;->ο:Ln11;

    .line 62
    .line 63
    invoke-virtual {v11, v5}, Lsm0;->β(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Lcs1;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Lsm0;->β(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lds1;

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    if-eqz v5, :cond_0

    .line 78
    .line 79
    iget-object v5, v5, Lds1;->α:Lbs1;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move-object/from16 v5, v21

    .line 83
    .line 84
    :goto_2
    if-eqz v5, :cond_16

    .line 85
    .line 86
    move-wide/from16 v22, v12

    .line 87
    .line 88
    iget v12, v5, Lbs1;->ζ:I

    .line 89
    .line 90
    iget-object v5, v5, Lbs1;->δ:Lxr1;

    .line 91
    .line 92
    iget-object v5, v5, Lxr1;->ε:Lb21;

    .line 93
    .line 94
    const-string v13, "Invalid content capture ID"

    .line 95
    .line 96
    if-nez v11, :cond_a

    .line 97
    .line 98
    iget-object v11, v5, Lb21;->β:[Ljava/lang/Object;

    .line 99
    .line 100
    move-wide/from16 v24, v15

    .line 101
    .line 102
    iget-object v15, v5, Lb21;->α:[J

    .line 103
    .line 104
    move/from16 v16, v10

    .line 105
    .line 106
    array-length v10, v15

    .line 107
    add-int/lit8 v10, v10, -0x2

    .line 108
    .line 109
    move-object/from16 v26, v2

    .line 110
    .line 111
    move-object/from16 v27, v3

    .line 112
    .line 113
    if-ltz v10, :cond_9

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    :goto_3
    aget-wide v2, v15, v1

    .line 117
    .line 118
    move-wide/from16 v28, v7

    .line 119
    .line 120
    not-long v7, v2

    .line 121
    shl-long v7, v7, v17

    .line 122
    .line 123
    and-long/2addr v7, v2

    .line 124
    and-long v7, v7, v22

    .line 125
    .line 126
    cmp-long v7, v7, v22

    .line 127
    .line 128
    if-eqz v7, :cond_8

    .line 129
    .line 130
    sub-int v7, v1, v10

    .line 131
    .line 132
    not-int v7, v7

    .line 133
    ushr-int/lit8 v7, v7, 0x1f

    .line 134
    .line 135
    rsub-int/lit8 v7, v7, 0x8

    .line 136
    .line 137
    const/4 v8, 0x0

    .line 138
    :goto_4
    if-ge v8, v7, :cond_7

    .line 139
    .line 140
    and-long v30, v2, v24

    .line 141
    .line 142
    cmp-long v30, v30, v19

    .line 143
    .line 144
    if-gez v30, :cond_5

    .line 145
    .line 146
    shl-int/lit8 v30, v1, 0x3

    .line 147
    .line 148
    add-int v30, v30, v8

    .line 149
    .line 150
    aget-object v30, v11, v30

    .line 151
    .line 152
    move-wide/from16 v31, v2

    .line 153
    .line 154
    move-object/from16 v2, v30

    .line 155
    .line 156
    check-cast v2, Lis1;

    .line 157
    .line 158
    sget-object v3, Lfs1;->Β:Lis1;

    .line 159
    .line 160
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    invoke-virtual {v5, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-nez v2, :cond_1

    .line 171
    .line 172
    move-object/from16 v2, v21

    .line 173
    .line 174
    :cond_1
    check-cast v2, Ljava/util/List;

    .line 175
    .line 176
    if-eqz v2, :cond_2

    .line 177
    .line 178
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lg4;

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_2
    move-object/from16 v2, v21

    .line 186
    .line 187
    :goto_5
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-object v3, v0, Lz1;->η:Ln5;

    .line 192
    .line 193
    if-nez v3, :cond_3

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_3
    move-object/from16 v33, v13

    .line 197
    .line 198
    move/from16 v30, v14

    .line 199
    .line 200
    int-to-long v13, v12

    .line 201
    invoke-virtual {v3, v13, v14}, Ln5;->Λ(J)Landroid/view/autofill/AutofillId;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    if-eqz v13, :cond_4

    .line 206
    .line 207
    iget-object v3, v3, Ln5;->ζ:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v3, Landroid/view/contentcapture/ContentCaptureSession;

    .line 210
    .line 211
    invoke-virtual {v3, v13, v2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewTextChanged(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_4
    invoke-static/range {v33 .. v33}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    throw v0

    .line 220
    :cond_5
    move-wide/from16 v31, v2

    .line 221
    .line 222
    :cond_6
    :goto_6
    move-object/from16 v33, v13

    .line 223
    .line 224
    move/from16 v30, v14

    .line 225
    .line 226
    :goto_7
    shr-long v2, v31, v16

    .line 227
    .line 228
    add-int/lit8 v8, v8, 0x1

    .line 229
    .line 230
    move/from16 v14, v30

    .line 231
    .line 232
    move-object/from16 v13, v33

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    move-object/from16 v33, v13

    .line 236
    .line 237
    move/from16 v30, v14

    .line 238
    .line 239
    move/from16 v2, v16

    .line 240
    .line 241
    if-ne v7, v2, :cond_15

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_8
    move-object/from16 v33, v13

    .line 245
    .line 246
    move/from16 v30, v14

    .line 247
    .line 248
    :goto_8
    if-eq v1, v10, :cond_15

    .line 249
    .line 250
    add-int/lit8 v1, v1, 0x1

    .line 251
    .line 252
    move-wide/from16 v7, v28

    .line 253
    .line 254
    move/from16 v14, v30

    .line 255
    .line 256
    move-object/from16 v13, v33

    .line 257
    .line 258
    const/16 v16, 0x8

    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :cond_9
    move-wide/from16 v28, v7

    .line 263
    .line 264
    move/from16 v30, v14

    .line 265
    .line 266
    goto/16 :goto_11

    .line 267
    .line 268
    :cond_a
    move-object/from16 v26, v2

    .line 269
    .line 270
    move-object/from16 v27, v3

    .line 271
    .line 272
    move-wide/from16 v28, v7

    .line 273
    .line 274
    move-object/from16 v33, v13

    .line 275
    .line 276
    move/from16 v30, v14

    .line 277
    .line 278
    move-wide/from16 v24, v15

    .line 279
    .line 280
    iget-object v1, v5, Lb21;->β:[Ljava/lang/Object;

    .line 281
    .line 282
    iget-object v2, v5, Lb21;->α:[J

    .line 283
    .line 284
    array-length v3, v2

    .line 285
    add-int/lit8 v3, v3, -0x2

    .line 286
    .line 287
    if-ltz v3, :cond_15

    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    :goto_9
    aget-wide v13, v2, v7

    .line 291
    .line 292
    move-object v8, v1

    .line 293
    move-object v10, v2

    .line 294
    not-long v1, v13

    .line 295
    shl-long v1, v1, v17

    .line 296
    .line 297
    and-long/2addr v1, v13

    .line 298
    and-long v1, v1, v22

    .line 299
    .line 300
    cmp-long v1, v1, v22

    .line 301
    .line 302
    if-eqz v1, :cond_14

    .line 303
    .line 304
    sub-int v1, v7, v3

    .line 305
    .line 306
    not-int v1, v1

    .line 307
    ushr-int/lit8 v1, v1, 0x1f

    .line 308
    .line 309
    const/16 v16, 0x8

    .line 310
    .line 311
    rsub-int/lit8 v1, v1, 0x8

    .line 312
    .line 313
    const/4 v2, 0x0

    .line 314
    :goto_a
    if-ge v2, v1, :cond_13

    .line 315
    .line 316
    and-long v31, v13, v24

    .line 317
    .line 318
    cmp-long v15, v31, v19

    .line 319
    .line 320
    if-gez v15, :cond_11

    .line 321
    .line 322
    shl-int/lit8 v15, v7, 0x3

    .line 323
    .line 324
    add-int/2addr v15, v2

    .line 325
    aget-object v15, v8, v15

    .line 326
    .line 327
    check-cast v15, Lis1;

    .line 328
    .line 329
    move/from16 v31, v2

    .line 330
    .line 331
    sget-object v2, Lfs1;->Β:Lis1;

    .line 332
    .line 333
    invoke-static {v15, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v15

    .line 337
    if-eqz v15, :cond_12

    .line 338
    .line 339
    iget-object v15, v11, Lcs1;->α:Lxr1;

    .line 340
    .line 341
    iget-object v15, v15, Lxr1;->ε:Lb21;

    .line 342
    .line 343
    invoke-virtual {v15, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v15

    .line 347
    if-nez v15, :cond_b

    .line 348
    .line 349
    move-object/from16 v15, v21

    .line 350
    .line 351
    :cond_b
    check-cast v15, Ljava/util/List;

    .line 352
    .line 353
    if-eqz v15, :cond_c

    .line 354
    .line 355
    invoke-static {v15}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    check-cast v15, Lg4;

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_c
    move-object/from16 v15, v21

    .line 363
    .line 364
    :goto_b
    invoke-virtual {v5, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    if-nez v2, :cond_d

    .line 369
    .line 370
    move-object/from16 v2, v21

    .line 371
    .line 372
    :cond_d
    check-cast v2, Ljava/util/List;

    .line 373
    .line 374
    if-eqz v2, :cond_e

    .line 375
    .line 376
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    check-cast v2, Lg4;

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_e
    move-object/from16 v2, v21

    .line 384
    .line 385
    :goto_c
    invoke-static {v15, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v15

    .line 389
    if-nez v15, :cond_12

    .line 390
    .line 391
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    iget-object v15, v0, Lz1;->η:Ln5;

    .line 396
    .line 397
    if-nez v15, :cond_f

    .line 398
    .line 399
    goto :goto_e

    .line 400
    :cond_f
    move-object/from16 v34, v10

    .line 401
    .line 402
    move-object/from16 v32, v11

    .line 403
    .line 404
    int-to-long v10, v12

    .line 405
    invoke-virtual {v15, v10, v11}, Ln5;->Λ(J)Landroid/view/autofill/AutofillId;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    if-eqz v10, :cond_10

    .line 410
    .line 411
    iget-object v11, v15, Ln5;->ζ:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v11, Landroid/view/contentcapture/ContentCaptureSession;

    .line 414
    .line 415
    invoke-virtual {v11, v10, v2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewTextChanged(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    .line 416
    .line 417
    .line 418
    goto :goto_d

    .line 419
    :cond_10
    invoke-static/range {v33 .. v33}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    throw v0

    .line 424
    :goto_d
    const/16 v2, 0x8

    .line 425
    .line 426
    goto :goto_f

    .line 427
    :cond_11
    move/from16 v31, v2

    .line 428
    .line 429
    :cond_12
    :goto_e
    move-object/from16 v34, v10

    .line 430
    .line 431
    move-object/from16 v32, v11

    .line 432
    .line 433
    goto :goto_d

    .line 434
    :goto_f
    shr-long/2addr v13, v2

    .line 435
    add-int/lit8 v10, v31, 0x1

    .line 436
    .line 437
    move v2, v10

    .line 438
    move-object/from16 v11, v32

    .line 439
    .line 440
    move-object/from16 v10, v34

    .line 441
    .line 442
    goto/16 :goto_a

    .line 443
    .line 444
    :cond_13
    move-object/from16 v34, v10

    .line 445
    .line 446
    move-object/from16 v32, v11

    .line 447
    .line 448
    const/16 v2, 0x8

    .line 449
    .line 450
    if-ne v1, v2, :cond_15

    .line 451
    .line 452
    goto :goto_10

    .line 453
    :cond_14
    move-object/from16 v34, v10

    .line 454
    .line 455
    move-object/from16 v32, v11

    .line 456
    .line 457
    :goto_10
    if-eq v7, v3, :cond_15

    .line 458
    .line 459
    add-int/lit8 v7, v7, 0x1

    .line 460
    .line 461
    move-object v1, v8

    .line 462
    move-object/from16 v11, v32

    .line 463
    .line 464
    move-object/from16 v2, v34

    .line 465
    .line 466
    goto/16 :goto_9

    .line 467
    .line 468
    :cond_15
    :goto_11
    const/16 v2, 0x8

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :cond_16
    const-string v0, "no value for specified key"

    .line 472
    .line 473
    invoke-static {v0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    throw v0

    .line 478
    :cond_17
    move-object/from16 v26, v2

    .line 479
    .line 480
    move-object/from16 v27, v3

    .line 481
    .line 482
    move-wide/from16 v28, v7

    .line 483
    .line 484
    move/from16 v17, v11

    .line 485
    .line 486
    move-wide/from16 v22, v12

    .line 487
    .line 488
    move/from16 v30, v14

    .line 489
    .line 490
    move v2, v10

    .line 491
    :goto_12
    shr-long v7, v28, v2

    .line 492
    .line 493
    add-int/lit8 v14, v30, 0x1

    .line 494
    .line 495
    move-object/from16 v1, p1

    .line 496
    .line 497
    move v10, v2

    .line 498
    move/from16 v11, v17

    .line 499
    .line 500
    move-wide/from16 v12, v22

    .line 501
    .line 502
    move-object/from16 v2, v26

    .line 503
    .line 504
    move-object/from16 v3, v27

    .line 505
    .line 506
    goto/16 :goto_1

    .line 507
    .line 508
    :cond_18
    move-object/from16 v26, v2

    .line 509
    .line 510
    move-object/from16 v27, v3

    .line 511
    .line 512
    move v2, v10

    .line 513
    if-ne v9, v2, :cond_1a

    .line 514
    .line 515
    goto :goto_13

    .line 516
    :cond_19
    move-object/from16 v26, v2

    .line 517
    .line 518
    move-object/from16 v27, v3

    .line 519
    .line 520
    :goto_13
    if-eq v6, v4, :cond_1a

    .line 521
    .line 522
    add-int/lit8 v6, v6, 0x1

    .line 523
    .line 524
    move-object/from16 v1, p1

    .line 525
    .line 526
    move-object/from16 v2, v26

    .line 527
    .line 528
    move-object/from16 v3, v27

    .line 529
    .line 530
    goto/16 :goto_0

    .line 531
    .line 532
    :cond_1a
    return-void
.end method

.method public final γ(Lbs1;Le80;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    invoke-static {v0, p1}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lbs1;

    .line 23
    .line 24
    invoke-virtual {p0}, Lz1;->ε()Lsm0;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget v4, v4, Lbs1;->ζ:I

    .line 29
    .line 30
    invoke-virtual {v5, v4}, Lsm0;->α(I)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {p2, v4, v3}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final δ(Lhr0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Les1;->α()Lbs1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lz1;->ν(Lbs1;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lz1;->ι()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lz1;->η:Ln5;

    .line 19
    .line 20
    return-void
.end method

.method public final ε()Lsm0;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lz1;->λ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lz1;->λ:Z

    .line 7
    .line 8
    iget-object v0, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La1;->θ:La1;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lh62;->Χ(Les1;La80;)Ln11;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lz1;->ν:Ln11;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, Lz1;->ξ:J

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lz1;->ν:Ln11;

    .line 29
    .line 30
    return-object p0
.end method

.method public final ζ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lz1;->η:Ln5;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final η(Lhr0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz1;->ζ:Lw0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ln5;

    .line 8
    .line 9
    iput-object p1, p0, Lz1;->η:Ln5;

    .line 10
    .line 11
    iget-object p1, p0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Les1;->α()Lbs1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0, p1}, Lz1;->μ(ILbs1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lz1;->ι()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final ι()V
    .locals 8

    .line 1
    iget-object v0, p0, Lz1;->η:Ln5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 9
    .line 10
    iget-object p0, p0, Lz1;->θ:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_5

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    const/4 v5, 0x1

    .line 25
    if-ge v4, v2, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Lbp;

    .line 32
    .line 33
    iget-object v7, v6, Lbp;->γ:Lcp;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_2

    .line 40
    .line 41
    if-ne v7, v5, :cond_1

    .line 42
    .line 43
    iget v5, v6, Lbp;->α:I

    .line 44
    .line 45
    int-to-long v5, v5

    .line 46
    invoke-virtual {v0, v5, v6}, Ln5;->Λ(J)Landroid/view/autofill/AutofillId;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewDisappeared(Landroid/view/autofill/AutofillId;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object v5, v6, Lbp;->δ:Ly21;

    .line 61
    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    iget-object v5, v5, Ly21;->ε:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Landroid/view/ViewStructure;

    .line 67
    .line 68
    invoke-virtual {v1, v5}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewAppeared(Landroid/view/ViewStructure;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-array v2, v5, [J

    .line 83
    .line 84
    const-wide/high16 v4, -0x8000000000000000L

    .line 85
    .line 86
    aput-wide v4, v2, v3

    .line 87
    .line 88
    invoke-virtual {v1, v0, v2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewsDisappeared(Landroid/view/autofill/AutofillId;[J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_2
    return-void
.end method

.method public final λ(Lbs1;Lcs1;)V
    .locals 5

    .line 1
    new-instance v0, Ly1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, v1, p0}, Ly1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lz1;->γ(Lbs1;Le80;)V

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x4

    .line 11
    invoke-static {p2, p1}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-ge v0, p2, :cond_2

    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lbs1;

    .line 27
    .line 28
    invoke-virtual {p0}, Lz1;->ε()Lsm0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget v3, v1, Lbs1;->ζ:I

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lsm0;->α(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget-object v2, p0, Lz1;->ο:Ln11;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lsm0;->α(I)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lsm0;->β(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    check-cast v2, Lcs1;

    .line 55
    .line 56
    invoke-virtual {p0, v1, v2}, Lz1;->λ(Lbs1;Lcs1;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const-string p0, "node not present in pruned tree before this change"

    .line 61
    .line 62
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0

    .line 67
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-void
.end method

.method public final μ(ILbs1;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Lz1;->ζ()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, v1, Lbs1;->δ:Lxr1;

    .line 13
    .line 14
    iget-object v2, v2, Lxr1;->ε:Lb21;

    .line 15
    .line 16
    sget-object v3, Lfs1;->Δ:Lis1;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    move-object v3, v4

    .line 26
    :cond_1
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    iget-object v5, v0, Lz1;->κ:Lv1;

    .line 29
    .line 30
    sget-object v6, Lv1;->ε:Lv1;

    .line 31
    .line 32
    if-ne v5, v6, :cond_3

    .line 33
    .line 34
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {v3, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    sget-object v3, Lwr1;->μ:Lis1;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    move-object v2, v4

    .line 51
    :cond_2
    check-cast v2, Lм;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    iget-object v2, v2, Lм;->β:Lm80;

    .line 56
    .line 57
    check-cast v2, La80;

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-interface {v2, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v5, v0, Lz1;->κ:Lv1;

    .line 71
    .line 72
    sget-object v6, Lv1;->ζ:Lv1;

    .line 73
    .line 74
    if-ne v5, v6, :cond_5

    .line 75
    .line 76
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v3, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    sget-object v3, Lwr1;->μ:Lis1;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    :cond_4
    check-cast v2, Lм;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v2, v2, Lм;->β:Lm80;

    .line 98
    .line 99
    check-cast v2, La80;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v2, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Boolean;

    .line 110
    .line 111
    :cond_5
    :goto_0
    iget v6, v1, Lbs1;->ζ:I

    .line 112
    .line 113
    iget-object v2, v0, Lz1;->η:Ln5;

    .line 114
    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    :goto_1
    move-object v10, v4

    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_6
    iget-object v3, v0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1}, Lbs1;->μ()Lbs1;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    iget v7, v1, Lbs1;->ζ:I

    .line 131
    .line 132
    if-eqz v5, :cond_7

    .line 133
    .line 134
    iget v3, v5, Lbs1;->ζ:I

    .line 135
    .line 136
    int-to-long v8, v3

    .line 137
    invoke-virtual {v2, v8, v9}, Ln5;->Λ(J)Landroid/view/autofill/AutofillId;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v3, :cond_7

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_7
    int-to-long v8, v7

    .line 145
    iget-object v2, v2, Ln5;->ζ:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Landroid/view/contentcapture/ContentCaptureSession;

    .line 148
    .line 149
    invoke-virtual {v2, v3, v8, v9}, Landroid/view/contentcapture/ContentCaptureSession;->newVirtualViewStructure(Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    new-instance v2, Ly21;

    .line 154
    .line 155
    invoke-direct {v2, v10}, Ly21;-><init>(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v1, Lbs1;->δ:Lxr1;

    .line 159
    .line 160
    sget-object v5, Lfs1;->Κ:Lis1;

    .line 161
    .line 162
    iget-object v8, v3, Lxr1;->ε:Lb21;

    .line 163
    .line 164
    invoke-virtual {v8, v5}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_8

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_8
    invoke-virtual {v10}, Landroid/view/ViewStructure;->getExtras()Landroid/os/Bundle;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    if-eqz v5, :cond_9

    .line 176
    .line 177
    const-string v9, "android.view.contentcapture.EventTimestamp"

    .line 178
    .line 179
    iget-wide v11, v0, Lz1;->ξ:J

    .line 180
    .line 181
    invoke-virtual {v5, v9, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 182
    .line 183
    .line 184
    const-string v9, "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"

    .line 185
    .line 186
    move/from16 v11, p1

    .line 187
    .line 188
    invoke-virtual {v5, v9, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    :cond_9
    sget-object v5, Lfs1;->ω:Lis1;

    .line 192
    .line 193
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    if-nez v5, :cond_a

    .line 198
    .line 199
    move-object v5, v4

    .line 200
    :cond_a
    check-cast v5, Ljava/lang/String;

    .line 201
    .line 202
    if-eqz v5, :cond_b

    .line 203
    .line 204
    invoke-virtual {v10, v7, v4, v4, v5}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_b
    sget-object v5, Lfs1;->ν:Lis1;

    .line 208
    .line 209
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    if-nez v5, :cond_c

    .line 214
    .line 215
    move-object v5, v4

    .line 216
    :cond_c
    check-cast v5, Ljava/lang/Boolean;

    .line 217
    .line 218
    if-eqz v5, :cond_d

    .line 219
    .line 220
    const-string v5, "android.widget.ViewGroup"

    .line 221
    .line 222
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_d
    sget-object v5, Lfs1;->Β:Lis1;

    .line 226
    .line 227
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-nez v5, :cond_e

    .line 232
    .line 233
    move-object v5, v4

    .line 234
    :cond_e
    check-cast v5, Ljava/util/List;

    .line 235
    .line 236
    const/16 v7, 0x3e

    .line 237
    .line 238
    const-string v9, "\n"

    .line 239
    .line 240
    if-eqz v5, :cond_f

    .line 241
    .line 242
    const-string v11, "android.widget.TextView"

    .line 243
    .line 244
    invoke-virtual {v10, v11}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v5, v9, v4, v7}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    :cond_f
    sget-object v5, Lfs1;->Ζ:Lis1;

    .line 255
    .line 256
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    if-nez v5, :cond_10

    .line 261
    .line 262
    move-object v5, v4

    .line 263
    :cond_10
    check-cast v5, Lg4;

    .line 264
    .line 265
    if-eqz v5, :cond_11

    .line 266
    .line 267
    const-string v11, "android.widget.EditText"

    .line 268
    .line 269
    invoke-virtual {v10, v11}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 273
    .line 274
    .line 275
    :cond_11
    sget-object v5, Lfs1;->α:Lis1;

    .line 276
    .line 277
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    if-nez v5, :cond_12

    .line 282
    .line 283
    move-object v5, v4

    .line 284
    :cond_12
    check-cast v5, Ljava/util/List;

    .line 285
    .line 286
    if-eqz v5, :cond_13

    .line 287
    .line 288
    invoke-static {v5, v9, v4, v7}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    .line 295
    :cond_13
    sget-object v5, Lfs1;->ψ:Lis1;

    .line 296
    .line 297
    invoke-virtual {v8, v5}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    if-nez v5, :cond_14

    .line 302
    .line 303
    move-object v5, v4

    .line 304
    :cond_14
    check-cast v5, Lso1;

    .line 305
    .line 306
    if-eqz v5, :cond_15

    .line 307
    .line 308
    iget v5, v5, Lso1;->α:I

    .line 309
    .line 310
    invoke-static {v5}, Lv71;->σ(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    if-eqz v5, :cond_15

    .line 315
    .line 316
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    :cond_15
    invoke-static {v3}, Lv71;->θ(Lxr1;)Lm32;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    if-eqz v3, :cond_16

    .line 324
    .line 325
    iget-object v3, v3, Lm32;->α:Ll32;

    .line 326
    .line 327
    iget-object v5, v3, Ll32;->β:Lw32;

    .line 328
    .line 329
    iget-object v3, v3, Ll32;->η:Lyr;

    .line 330
    .line 331
    iget-object v5, v5, Lw32;->α:Lux1;

    .line 332
    .line 333
    iget-wide v7, v5, Lux1;->β:J

    .line 334
    .line 335
    invoke-static {v7, v8}, Ly32;->γ(J)F

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    invoke-interface {v3}, Lyr;->β()F

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    mul-float/2addr v7, v5

    .line 344
    invoke-interface {v3}, Lyr;->θ()F

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    mul-float/2addr v3, v7

    .line 349
    const/4 v5, 0x0

    .line 350
    invoke-virtual {v10, v3, v5, v5, v5}, Landroid/view/ViewStructure;->setTextStyle(FIII)V

    .line 351
    .line 352
    .line 353
    :cond_16
    invoke-virtual {v1}, Lbs1;->δ()Lq31;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-eqz v3, :cond_18

    .line 358
    .line 359
    invoke-virtual {v3}, Lq31;->Х()Lq01;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    iget-boolean v5, v5, Lq01;->σ:Z

    .line 364
    .line 365
    if-eqz v5, :cond_17

    .line 366
    .line 367
    move-object v4, v3

    .line 368
    :cond_17
    if-eqz v4, :cond_18

    .line 369
    .line 370
    invoke-virtual {v1, v4}, Lbs1;->α(Lq31;)Lml1;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    goto :goto_2

    .line 375
    :cond_18
    sget-object v3, Lml1;->ε:Lml1;

    .line 376
    .line 377
    :goto_2
    iget v4, v3, Lml1;->α:F

    .line 378
    .line 379
    float-to-int v11, v4

    .line 380
    iget v5, v3, Lml1;->β:F

    .line 381
    .line 382
    float-to-int v12, v5

    .line 383
    iget v7, v3, Lml1;->γ:F

    .line 384
    .line 385
    sub-float/2addr v7, v4

    .line 386
    float-to-int v15, v7

    .line 387
    iget v3, v3, Lml1;->δ:F

    .line 388
    .line 389
    sub-float/2addr v3, v5

    .line 390
    float-to-int v3, v3

    .line 391
    const/4 v13, 0x0

    .line 392
    const/4 v14, 0x0

    .line 393
    move/from16 v16, v3

    .line 394
    .line 395
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 396
    .line 397
    .line 398
    move-object v10, v2

    .line 399
    :goto_3
    if-nez v10, :cond_19

    .line 400
    .line 401
    goto :goto_4

    .line 402
    :cond_19
    new-instance v5, Lbp;

    .line 403
    .line 404
    iget-wide v7, v0, Lz1;->ξ:J

    .line 405
    .line 406
    sget-object v9, Lcp;->ε:Lcp;

    .line 407
    .line 408
    invoke-direct/range {v5 .. v10}, Lbp;-><init>(IJLcp;Ly21;)V

    .line 409
    .line 410
    .line 411
    iget-object v2, v0, Lz1;->θ:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    :goto_4
    new-instance v2, Lξ;

    .line 417
    .line 418
    const/4 v3, 0x1

    .line 419
    invoke-direct {v2, v3, v0}, Lξ;-><init>(ILjava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v1, v2}, Lz1;->γ(Lbs1;Le80;)V

    .line 423
    .line 424
    .line 425
    return-void
.end method

.method public final ν(Lbs1;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lz1;->ζ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v2, p1, Lbs1;->ζ:I

    .line 9
    .line 10
    new-instance v1, Lbp;

    .line 11
    .line 12
    iget-wide v3, p0, Lz1;->ξ:J

    .line 13
    .line 14
    sget-object v5, Lcp;->ζ:Lcp;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Lbp;-><init>(IJLcp;Ly21;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lz1;->θ:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-static {v0, p1}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lbs1;

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lz1;->ν(Lbs1;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-void
.end method

.method public final ξ()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lz1;->ο:Ln11;

    .line 4
    .line 5
    invoke-virtual {v1}, Ln11;->γ()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lz1;->ε()Lsm0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, v2, Lsm0;->β:[I

    .line 13
    .line 14
    iget-object v4, v2, Lsm0;->γ:[Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v2, v2, Lsm0;->α:[J

    .line 17
    .line 18
    array-length v5, v2

    .line 19
    add-int/lit8 v5, v5, -0x2

    .line 20
    .line 21
    if-ltz v5, :cond_3

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    aget-wide v8, v2, v7

    .line 25
    .line 26
    not-long v10, v8

    .line 27
    const/4 v12, 0x7

    .line 28
    shl-long/2addr v10, v12

    .line 29
    and-long/2addr v10, v8

    .line 30
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v10, v12

    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-eqz v10, :cond_2

    .line 39
    .line 40
    sub-int v10, v7, v5

    .line 41
    .line 42
    not-int v10, v10

    .line 43
    ushr-int/lit8 v10, v10, 0x1f

    .line 44
    .line 45
    const/16 v11, 0x8

    .line 46
    .line 47
    rsub-int/lit8 v10, v10, 0x8

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    :goto_1
    if-ge v12, v10, :cond_1

    .line 51
    .line 52
    const-wide/16 v13, 0xff

    .line 53
    .line 54
    and-long/2addr v13, v8

    .line 55
    const-wide/16 v15, 0x80

    .line 56
    .line 57
    cmp-long v13, v13, v15

    .line 58
    .line 59
    if-gez v13, :cond_0

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v14, v3, v13

    .line 65
    .line 66
    aget-object v13, v4, v13

    .line 67
    .line 68
    check-cast v13, Lds1;

    .line 69
    .line 70
    new-instance v15, Lcs1;

    .line 71
    .line 72
    iget-object v13, v13, Lds1;->α:Lbs1;

    .line 73
    .line 74
    invoke-virtual {v0}, Lz1;->ε()Lsm0;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v15, v13, v6}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v14, v15}, Ln11;->η(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    shr-long/2addr v8, v11

    .line 85
    add-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    if-ne v10, v11, :cond_3

    .line 89
    .line 90
    :cond_2
    if-eq v7, v5, :cond_3

    .line 91
    .line 92
    add-int/lit8 v7, v7, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance v1, Lcs1;

    .line 96
    .line 97
    iget-object v2, v0, Lz1;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Les1;->α()Lbs1;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0}, Lz1;->ε()Lsm0;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-direct {v1, v2, v3}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v0, Lz1;->π:Lcs1;

    .line 115
    .line 116
    return-void
.end method
