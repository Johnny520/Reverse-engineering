.class public final synthetic Lba0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Lcom/example/dyhelper/ui/GestureAreaView;

.field public final synthetic θ:Ljava/lang/String;

.field public final synthetic ι:Landroid/app/Activity;

.field public final synthetic κ:Landroid/widget/LinearLayout;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Landroid/widget/TextView;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/widget/TextView;

.field public final synthetic ρ:Landroid/widget/Switch;

.field public final synthetic σ:Landroid/widget/TextView;

.field public final synthetic τ:Lxx;

.field public final synthetic υ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/example/dyhelper/ui/GestureAreaView;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V
    .locals 1

    .line 1
    move/from16 v0, p16

    .line 2
    .line 3
    iput v0, p0, Lba0;->ε:I

    .line 4
    .line 5
    iput-object p1, p0, Lba0;->ζ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lba0;->η:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 8
    .line 9
    iput-object p3, p0, Lba0;->θ:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lba0;->ι:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p5, p0, Lba0;->κ:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    iput-object p6, p0, Lba0;->λ:Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object p7, p0, Lba0;->μ:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p8, p0, Lba0;->ν:Landroid/widget/TextView;

    .line 20
    .line 21
    iput-object p9, p0, Lba0;->ξ:Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object p10, p0, Lba0;->ο:Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object p11, p0, Lba0;->π:Landroid/widget/TextView;

    .line 26
    .line 27
    iput-object p12, p0, Lba0;->ρ:Landroid/widget/Switch;

    .line 28
    .line 29
    iput-object p13, p0, Lba0;->σ:Landroid/widget/TextView;

    .line 30
    .line 31
    iput-object p14, p0, Lba0;->τ:Lxx;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lba0;->υ:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lba0;->ε:I

    .line 4
    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    iget-object v4, v0, Lba0;->ι:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v5, v0, Lba0;->ζ:Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v6, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 22
    .line 23
    invoke-static {v1}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v6, v0, Lba0;->η:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 28
    .line 29
    iget-object v11, v0, Lba0;->θ:Ljava/lang/String;

    .line 30
    .line 31
    const-string v7, "double_tap"

    .line 32
    .line 33
    invoke-virtual {v6, v11, v7, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v6, v4}, Lia0;->η(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    iget-object v9, v0, Lba0;->κ:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    move v10, v8

    .line 43
    iget-object v8, v0, Lba0;->λ:Landroid/widget/TextView;

    .line 44
    .line 45
    move-object v12, v9

    .line 46
    iget-object v9, v0, Lba0;->μ:Landroid/widget/TextView;

    .line 47
    .line 48
    move v13, v10

    .line 49
    iget-object v10, v0, Lba0;->ν:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v14, v0, Lba0;->ξ:Landroid/widget/TextView;

    .line 52
    .line 53
    iget-object v15, v0, Lba0;->ο:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object v3, v0, Lba0;->π:Landroid/widget/TextView;

    .line 56
    .line 57
    move-object/from16 p1, v1

    .line 58
    .line 59
    iget-object v1, v0, Lba0;->ρ:Landroid/widget/Switch;

    .line 60
    .line 61
    move-object/from16 v16, v1

    .line 62
    .line 63
    iget-object v1, v0, Lba0;->σ:Landroid/widget/TextView;

    .line 64
    .line 65
    move-object/from16 v17, v12

    .line 66
    .line 67
    iget-object v12, v0, Lba0;->τ:Lxx;

    .line 68
    .line 69
    move/from16 v18, v13

    .line 70
    .line 71
    iget-object v13, v0, Lba0;->υ:Landroid/widget/TextView;

    .line 72
    .line 73
    if-nez v18, :cond_0

    .line 74
    .line 75
    invoke-virtual {v6, v11, v7, v5}, Lcom/example/dyhelper/ui/GestureAreaView;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v7, v6

    .line 79
    move-object/from16 v6, v17

    .line 80
    .line 81
    invoke-static/range {v6 .. v11}, Lia0;->θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move-object v11, v1

    .line 85
    move-object v9, v3

    .line 86
    move-object v6, v7

    .line 87
    move-object v7, v14

    .line 88
    move-object v8, v15

    .line 89
    move-object/from16 v10, v16

    .line 90
    .line 91
    invoke-static/range {v6 .. v13}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    move-object v5, v1

    .line 96
    move-object v0, v14

    .line 97
    move-object v1, v15

    .line 98
    invoke-virtual {v6}, Lcom/example/dyhelper/ui/GestureAreaView;->ζ()V

    .line 99
    .line 100
    .line 101
    move-object v7, v6

    .line 102
    move-object/from16 v6, v17

    .line 103
    .line 104
    invoke-static/range {v6 .. v11}, Lia0;->θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move-object v8, v1

    .line 108
    move-object v9, v3

    .line 109
    move-object v11, v5

    .line 110
    move-object v6, v7

    .line 111
    move-object/from16 v10, v16

    .line 112
    .line 113
    move-object v7, v0

    .line 114
    invoke-static/range {v6 .. v13}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 115
    .line 116
    .line 117
    invoke-static/range {p1 .. p1}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "\u5df2\u4fdd\u5b58\u53cc\u51fb\u52a8\u4f5c\uff1a"

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 133
    .line 134
    .line 135
    :goto_0
    return-object v2

    .line 136
    :pswitch_0
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v3, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 144
    .line 145
    invoke-static {v1}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v6, v0, Lba0;->η:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 150
    .line 151
    iget-object v11, v0, Lba0;->θ:Ljava/lang/String;

    .line 152
    .line 153
    const-string v3, "long_press"

    .line 154
    .line 155
    invoke-virtual {v6, v11, v3, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v4}, Lia0;->η(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;)Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    iget-object v8, v0, Lba0;->κ:Landroid/widget/LinearLayout;

    .line 163
    .line 164
    move-object v9, v8

    .line 165
    iget-object v8, v0, Lba0;->λ:Landroid/widget/TextView;

    .line 166
    .line 167
    move-object v10, v9

    .line 168
    iget-object v9, v0, Lba0;->μ:Landroid/widget/TextView;

    .line 169
    .line 170
    move-object v12, v10

    .line 171
    iget-object v10, v0, Lba0;->ν:Landroid/widget/TextView;

    .line 172
    .line 173
    iget-object v13, v0, Lba0;->ξ:Landroid/widget/TextView;

    .line 174
    .line 175
    iget-object v14, v0, Lba0;->ο:Landroid/widget/TextView;

    .line 176
    .line 177
    iget-object v15, v0, Lba0;->π:Landroid/widget/TextView;

    .line 178
    .line 179
    move-object/from16 p1, v1

    .line 180
    .line 181
    iget-object v1, v0, Lba0;->ρ:Landroid/widget/Switch;

    .line 182
    .line 183
    move-object/from16 v16, v1

    .line 184
    .line 185
    iget-object v1, v0, Lba0;->σ:Landroid/widget/TextView;

    .line 186
    .line 187
    move-object/from16 v17, v12

    .line 188
    .line 189
    iget-object v12, v0, Lba0;->τ:Lxx;

    .line 190
    .line 191
    iget-object v0, v0, Lba0;->υ:Landroid/widget/TextView;

    .line 192
    .line 193
    if-nez v7, :cond_1

    .line 194
    .line 195
    invoke-virtual {v6, v11, v3, v5}, Lcom/example/dyhelper/ui/GestureAreaView;->η(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    move-object v7, v6

    .line 199
    move-object/from16 v6, v17

    .line 200
    .line 201
    invoke-static/range {v6 .. v11}, Lia0;->θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    move-object v11, v1

    .line 205
    move-object v6, v7

    .line 206
    move-object v7, v13

    .line 207
    move-object v8, v14

    .line 208
    move-object v9, v15

    .line 209
    move-object/from16 v10, v16

    .line 210
    .line 211
    move-object v13, v0

    .line 212
    invoke-static/range {v6 .. v13}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_1
    move-object v3, v13

    .line 217
    move-object v13, v0

    .line 218
    move-object v0, v3

    .line 219
    move-object v5, v1

    .line 220
    move-object v1, v14

    .line 221
    move-object v3, v15

    .line 222
    invoke-virtual {v6}, Lcom/example/dyhelper/ui/GestureAreaView;->ζ()V

    .line 223
    .line 224
    .line 225
    move-object v7, v6

    .line 226
    move-object/from16 v6, v17

    .line 227
    .line 228
    invoke-static/range {v6 .. v11}, Lia0;->θ(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    move-object v8, v1

    .line 232
    move-object v9, v3

    .line 233
    move-object v11, v5

    .line 234
    move-object v6, v7

    .line 235
    move-object/from16 v10, v16

    .line 236
    .line 237
    move-object v7, v0

    .line 238
    invoke-static/range {v6 .. v13}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 239
    .line 240
    .line 241
    invoke-static/range {p1 .. p1}, Li2;->μ(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    const-string v1, "\u5df2\u4fdd\u5b58\u957f\u6309\u52a8\u4f5c\uff1a"

    .line 246
    .line 247
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    const/4 v1, 0x0

    .line 252
    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 257
    .line 258
    .line 259
    :goto_1
    return-object v2

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
