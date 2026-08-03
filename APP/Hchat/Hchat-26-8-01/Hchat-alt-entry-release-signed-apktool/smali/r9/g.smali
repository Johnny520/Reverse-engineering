.class public final synthetic Lr9/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgg/q;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:I

.field public final synthetic f:Landroid/widget/EditText;

.field public final synthetic g:Lgg/u;

.field public final synthetic h:Landroid/widget/EditText;

.field public final synthetic i:Lgg/s;

.field public final synthetic j:Landroid/widget/TextView;

.field public final synthetic k:Landroid/widget/ScrollView;

.field public final synthetic l:Lr9/d0;

.field public final synthetic m:Landroid/widget/TextView;

.field public final synthetic n:Landroid/widget/LinearLayout;

.field public final synthetic o:Lgg/u;

.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Lgg/q;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;)V
    .locals 1

    .line 41
    const/4 v0, 0x2

    iput v0, p0, Lr9/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/g;->c:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lr9/g;->b:Lgg/q;

    iput-object p3, p0, Lr9/g;->d:Landroid/widget/TextView;

    iput p4, p0, Lr9/g;->e:I

    iput-object p5, p0, Lr9/g;->f:Landroid/widget/EditText;

    iput-object p6, p0, Lr9/g;->g:Lgg/u;

    iput-object p7, p0, Lr9/g;->h:Landroid/widget/EditText;

    iput-object p8, p0, Lr9/g;->i:Lgg/s;

    iput-object p9, p0, Lr9/g;->j:Landroid/widget/TextView;

    iput-object p10, p0, Lr9/g;->k:Landroid/widget/ScrollView;

    iput-object p11, p0, Lr9/g;->l:Lr9/d0;

    iput-object p12, p0, Lr9/g;->m:Landroid/widget/TextView;

    iput-object p13, p0, Lr9/g;->n:Landroid/widget/LinearLayout;

    iput-object p14, p0, Lr9/g;->o:Lgg/u;

    move-object/from16 p1, p15

    iput-object p1, p0, Lr9/g;->p:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V
    .locals 1

    .line 1
    move/from16 v0, p16

    .line 2
    .line 3
    iput v0, p0, Lr9/g;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Lr9/g;->b:Lgg/q;

    .line 6
    .line 7
    iput-object p2, p0, Lr9/g;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    iput-object p3, p0, Lr9/g;->d:Landroid/widget/TextView;

    .line 10
    .line 11
    iput p4, p0, Lr9/g;->e:I

    .line 12
    .line 13
    iput-object p5, p0, Lr9/g;->f:Landroid/widget/EditText;

    .line 14
    .line 15
    iput-object p6, p0, Lr9/g;->g:Lgg/u;

    .line 16
    .line 17
    iput-object p7, p0, Lr9/g;->h:Landroid/widget/EditText;

    .line 18
    .line 19
    iput-object p8, p0, Lr9/g;->i:Lgg/s;

    .line 20
    .line 21
    iput-object p9, p0, Lr9/g;->j:Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object p10, p0, Lr9/g;->k:Landroid/widget/ScrollView;

    .line 24
    .line 25
    iput-object p11, p0, Lr9/g;->l:Lr9/d0;

    .line 26
    .line 27
    iput-object p12, p0, Lr9/g;->m:Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object p13, p0, Lr9/g;->n:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iput-object p14, p0, Lr9/g;->o:Lgg/u;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lr9/g;->p:Landroid/content/Context;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr9/g;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v3, v0, Lr9/g;->c:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v18, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move/from16 v17, v18

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    move/from16 v17, v1

    .line 23
    .line 24
    :goto_0
    iget-object v2, v0, Lr9/g;->b:Lgg/q;

    .line 25
    .line 26
    iget-object v4, v0, Lr9/g;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    iget v5, v0, Lr9/g;->e:I

    .line 29
    .line 30
    iget-object v6, v0, Lr9/g;->f:Landroid/widget/EditText;

    .line 31
    .line 32
    iget-object v7, v0, Lr9/g;->g:Lgg/u;

    .line 33
    .line 34
    iget-object v8, v0, Lr9/g;->h:Landroid/widget/EditText;

    .line 35
    .line 36
    iget-object v9, v0, Lr9/g;->i:Lgg/s;

    .line 37
    .line 38
    iget-object v10, v0, Lr9/g;->j:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v11, v0, Lr9/g;->k:Landroid/widget/ScrollView;

    .line 41
    .line 42
    iget-object v12, v0, Lr9/g;->l:Lr9/d0;

    .line 43
    .line 44
    iget-object v13, v0, Lr9/g;->m:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object v14, v0, Lr9/g;->n:Landroid/widget/LinearLayout;

    .line 47
    .line 48
    iget-object v15, v0, Lr9/g;->o:Lgg/u;

    .line 49
    .line 50
    iget-object v1, v0, Lr9/g;->p:Landroid/content/Context;

    .line 51
    .line 52
    move-object/from16 v16, v1

    .line 53
    .line 54
    invoke-static/range {v2 .. v17}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 55
    .line 56
    .line 57
    return v18

    .line 58
    :pswitch_0
    iget-object v1, v0, Lr9/g;->b:Lgg/q;

    .line 59
    .line 60
    iget-boolean v2, v1, Lgg/q;->g:Z

    .line 61
    .line 62
    iget v3, v0, Lr9/g;->e:I

    .line 63
    .line 64
    iget-object v4, v0, Lr9/g;->f:Landroid/widget/EditText;

    .line 65
    .line 66
    iget-object v5, v0, Lr9/g;->j:Landroid/widget/TextView;

    .line 67
    .line 68
    iget-object v6, v0, Lr9/g;->k:Landroid/widget/ScrollView;

    .line 69
    .line 70
    iget-object v7, v0, Lr9/g;->l:Lr9/d0;

    .line 71
    .line 72
    iget-object v8, v0, Lr9/g;->m:Landroid/widget/TextView;

    .line 73
    .line 74
    iget-object v9, v0, Lr9/g;->n:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    iget-object v10, v0, Lr9/g;->o:Lgg/u;

    .line 77
    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    iget-object v2, v0, Lr9/g;->c:Landroid/widget/LinearLayout;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-eqz v12, :cond_1

    .line 87
    .line 88
    const/16 v34, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    const/4 v12, 0x0

    .line 92
    move/from16 v34, v12

    .line 93
    .line 94
    :goto_1
    iget-object v12, v0, Lr9/g;->d:Landroid/widget/TextView;

    .line 95
    .line 96
    iget-object v13, v0, Lr9/g;->g:Lgg/u;

    .line 97
    .line 98
    iget-object v14, v0, Lr9/g;->h:Landroid/widget/EditText;

    .line 99
    .line 100
    iget-object v15, v0, Lr9/g;->i:Lgg/s;

    .line 101
    .line 102
    const/16 p1, 0x1

    .line 103
    .line 104
    iget-object v11, v0, Lr9/g;->p:Landroid/content/Context;

    .line 105
    .line 106
    move-object/from16 v19, v1

    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    move/from16 v22, v3

    .line 111
    .line 112
    move-object/from16 v23, v4

    .line 113
    .line 114
    move-object/from16 v27, v5

    .line 115
    .line 116
    move-object/from16 v28, v6

    .line 117
    .line 118
    move-object/from16 v29, v7

    .line 119
    .line 120
    move-object/from16 v30, v8

    .line 121
    .line 122
    move-object/from16 v31, v9

    .line 123
    .line 124
    move-object/from16 v32, v10

    .line 125
    .line 126
    move-object/from16 v33, v11

    .line 127
    .line 128
    move-object/from16 v21, v12

    .line 129
    .line 130
    move-object/from16 v24, v13

    .line 131
    .line 132
    move-object/from16 v25, v14

    .line 133
    .line 134
    move-object/from16 v26, v15

    .line 135
    .line 136
    invoke-static/range {v19 .. v34}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_2
    move-object/from16 v19, v1

    .line 141
    .line 142
    move/from16 v25, v3

    .line 143
    .line 144
    move-object/from16 v24, v4

    .line 145
    .line 146
    move-object/from16 v26, v5

    .line 147
    .line 148
    move-object/from16 v20, v6

    .line 149
    .line 150
    move-object/from16 v21, v7

    .line 151
    .line 152
    move-object/from16 v22, v8

    .line 153
    .line 154
    move-object/from16 v23, v9

    .line 155
    .line 156
    move-object/from16 v27, v10

    .line 157
    .line 158
    const/16 p1, 0x1

    .line 159
    .line 160
    invoke-static/range {v19 .. v27}, Lr9/d0;->H0(Lgg/q;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;ILandroid/widget/TextView;Lgg/u;)V

    .line 161
    .line 162
    .line 163
    :goto_2
    return p1

    .line 164
    :pswitch_1
    iget-object v1, v0, Lr9/g;->p:Landroid/content/Context;

    .line 165
    .line 166
    const/16 v31, 0x0

    .line 167
    .line 168
    iget-object v2, v0, Lr9/g;->b:Lgg/q;

    .line 169
    .line 170
    iget-object v3, v0, Lr9/g;->c:Landroid/widget/LinearLayout;

    .line 171
    .line 172
    iget-object v4, v0, Lr9/g;->d:Landroid/widget/TextView;

    .line 173
    .line 174
    iget v5, v0, Lr9/g;->e:I

    .line 175
    .line 176
    iget-object v6, v0, Lr9/g;->f:Landroid/widget/EditText;

    .line 177
    .line 178
    iget-object v7, v0, Lr9/g;->g:Lgg/u;

    .line 179
    .line 180
    iget-object v8, v0, Lr9/g;->h:Landroid/widget/EditText;

    .line 181
    .line 182
    iget-object v9, v0, Lr9/g;->i:Lgg/s;

    .line 183
    .line 184
    iget-object v10, v0, Lr9/g;->j:Landroid/widget/TextView;

    .line 185
    .line 186
    iget-object v11, v0, Lr9/g;->k:Landroid/widget/ScrollView;

    .line 187
    .line 188
    iget-object v12, v0, Lr9/g;->l:Lr9/d0;

    .line 189
    .line 190
    iget-object v13, v0, Lr9/g;->m:Landroid/widget/TextView;

    .line 191
    .line 192
    iget-object v14, v0, Lr9/g;->n:Landroid/widget/LinearLayout;

    .line 193
    .line 194
    iget-object v15, v0, Lr9/g;->o:Lgg/u;

    .line 195
    .line 196
    move-object/from16 v30, v1

    .line 197
    .line 198
    move-object/from16 v16, v2

    .line 199
    .line 200
    move-object/from16 v17, v3

    .line 201
    .line 202
    move-object/from16 v18, v4

    .line 203
    .line 204
    move/from16 v19, v5

    .line 205
    .line 206
    move-object/from16 v20, v6

    .line 207
    .line 208
    move-object/from16 v21, v7

    .line 209
    .line 210
    move-object/from16 v22, v8

    .line 211
    .line 212
    move-object/from16 v23, v9

    .line 213
    .line 214
    move-object/from16 v24, v10

    .line 215
    .line 216
    move-object/from16 v25, v11

    .line 217
    .line 218
    move-object/from16 v26, v12

    .line 219
    .line 220
    move-object/from16 v27, v13

    .line 221
    .line 222
    move-object/from16 v28, v14

    .line 223
    .line 224
    move-object/from16 v29, v15

    .line 225
    .line 226
    invoke-static/range {v16 .. v31}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 227
    .line 228
    .line 229
    const/4 v1, 0x1

    .line 230
    return v1

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
