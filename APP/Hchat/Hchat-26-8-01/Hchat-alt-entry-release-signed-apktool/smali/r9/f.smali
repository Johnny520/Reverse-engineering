.class public final synthetic Lr9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    iput v0, p0, Lr9/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/f;->c:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lr9/f;->b:Lgg/q;

    iput-object p3, p0, Lr9/f;->d:Landroid/widget/TextView;

    iput p4, p0, Lr9/f;->e:I

    iput-object p5, p0, Lr9/f;->f:Landroid/widget/EditText;

    iput-object p6, p0, Lr9/f;->g:Lgg/u;

    iput-object p7, p0, Lr9/f;->h:Landroid/widget/EditText;

    iput-object p8, p0, Lr9/f;->i:Lgg/s;

    iput-object p9, p0, Lr9/f;->j:Landroid/widget/TextView;

    iput-object p10, p0, Lr9/f;->k:Landroid/widget/ScrollView;

    iput-object p11, p0, Lr9/f;->l:Lr9/d0;

    iput-object p12, p0, Lr9/f;->m:Landroid/widget/TextView;

    iput-object p13, p0, Lr9/f;->n:Landroid/widget/LinearLayout;

    iput-object p14, p0, Lr9/f;->o:Lgg/u;

    move-object/from16 p1, p15

    iput-object p1, p0, Lr9/f;->p:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;I)V
    .locals 1

    .line 1
    move/from16 v0, p16

    .line 2
    .line 3
    iput v0, p0, Lr9/f;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Lr9/f;->b:Lgg/q;

    .line 6
    .line 7
    iput-object p2, p0, Lr9/f;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    iput-object p3, p0, Lr9/f;->d:Landroid/widget/TextView;

    .line 10
    .line 11
    iput p4, p0, Lr9/f;->e:I

    .line 12
    .line 13
    iput-object p5, p0, Lr9/f;->f:Landroid/widget/EditText;

    .line 14
    .line 15
    iput-object p6, p0, Lr9/f;->g:Lgg/u;

    .line 16
    .line 17
    iput-object p7, p0, Lr9/f;->h:Landroid/widget/EditText;

    .line 18
    .line 19
    iput-object p8, p0, Lr9/f;->i:Lgg/s;

    .line 20
    .line 21
    iput-object p9, p0, Lr9/f;->j:Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object p10, p0, Lr9/f;->k:Landroid/widget/ScrollView;

    .line 24
    .line 25
    iput-object p11, p0, Lr9/f;->l:Lr9/d0;

    .line 26
    .line 27
    iput-object p12, p0, Lr9/f;->m:Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object p13, p0, Lr9/f;->n:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iput-object p14, p0, Lr9/f;->o:Lgg/u;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lr9/f;->p:Landroid/content/Context;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr9/f;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v3, v0, Lr9/f;->c:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :goto_0
    move/from16 v17, v1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    iget-object v2, v0, Lr9/f;->b:Lgg/q;

    .line 23
    .line 24
    iget-object v4, v0, Lr9/f;->d:Landroid/widget/TextView;

    .line 25
    .line 26
    iget v5, v0, Lr9/f;->e:I

    .line 27
    .line 28
    iget-object v6, v0, Lr9/f;->f:Landroid/widget/EditText;

    .line 29
    .line 30
    iget-object v7, v0, Lr9/f;->g:Lgg/u;

    .line 31
    .line 32
    iget-object v8, v0, Lr9/f;->h:Landroid/widget/EditText;

    .line 33
    .line 34
    iget-object v9, v0, Lr9/f;->i:Lgg/s;

    .line 35
    .line 36
    iget-object v10, v0, Lr9/f;->j:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v11, v0, Lr9/f;->k:Landroid/widget/ScrollView;

    .line 39
    .line 40
    iget-object v12, v0, Lr9/f;->l:Lr9/d0;

    .line 41
    .line 42
    iget-object v13, v0, Lr9/f;->m:Landroid/widget/TextView;

    .line 43
    .line 44
    iget-object v14, v0, Lr9/f;->n:Landroid/widget/LinearLayout;

    .line 45
    .line 46
    iget-object v15, v0, Lr9/f;->o:Lgg/u;

    .line 47
    .line 48
    iget-object v1, v0, Lr9/f;->p:Landroid/content/Context;

    .line 49
    .line 50
    move-object/from16 v16, v1

    .line 51
    .line 52
    invoke-static/range {v2 .. v17}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    iget-object v1, v0, Lr9/f;->b:Lgg/q;

    .line 57
    .line 58
    iget-boolean v2, v1, Lgg/q;->g:Z

    .line 59
    .line 60
    iget v3, v0, Lr9/f;->e:I

    .line 61
    .line 62
    iget-object v4, v0, Lr9/f;->f:Landroid/widget/EditText;

    .line 63
    .line 64
    iget-object v5, v0, Lr9/f;->j:Landroid/widget/TextView;

    .line 65
    .line 66
    iget-object v6, v0, Lr9/f;->k:Landroid/widget/ScrollView;

    .line 67
    .line 68
    iget-object v7, v0, Lr9/f;->l:Lr9/d0;

    .line 69
    .line 70
    iget-object v8, v0, Lr9/f;->m:Landroid/widget/TextView;

    .line 71
    .line 72
    iget-object v9, v0, Lr9/f;->n:Landroid/widget/LinearLayout;

    .line 73
    .line 74
    iget-object v10, v0, Lr9/f;->o:Lgg/u;

    .line 75
    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    iget-object v2, v0, Lr9/f;->c:Landroid/widget/LinearLayout;

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_1

    .line 85
    .line 86
    const/4 v11, 0x1

    .line 87
    :goto_2
    move/from16 v33, v11

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_1
    const/4 v11, 0x0

    .line 91
    goto :goto_2

    .line 92
    :goto_3
    iget-object v11, v0, Lr9/f;->d:Landroid/widget/TextView;

    .line 93
    .line 94
    iget-object v12, v0, Lr9/f;->g:Lgg/u;

    .line 95
    .line 96
    iget-object v13, v0, Lr9/f;->h:Landroid/widget/EditText;

    .line 97
    .line 98
    iget-object v14, v0, Lr9/f;->i:Lgg/s;

    .line 99
    .line 100
    iget-object v15, v0, Lr9/f;->p:Landroid/content/Context;

    .line 101
    .line 102
    move-object/from16 v18, v1

    .line 103
    .line 104
    move-object/from16 v19, v2

    .line 105
    .line 106
    move/from16 v21, v3

    .line 107
    .line 108
    move-object/from16 v22, v4

    .line 109
    .line 110
    move-object/from16 v26, v5

    .line 111
    .line 112
    move-object/from16 v27, v6

    .line 113
    .line 114
    move-object/from16 v28, v7

    .line 115
    .line 116
    move-object/from16 v29, v8

    .line 117
    .line 118
    move-object/from16 v30, v9

    .line 119
    .line 120
    move-object/from16 v31, v10

    .line 121
    .line 122
    move-object/from16 v20, v11

    .line 123
    .line 124
    move-object/from16 v23, v12

    .line 125
    .line 126
    move-object/from16 v24, v13

    .line 127
    .line 128
    move-object/from16 v25, v14

    .line 129
    .line 130
    move-object/from16 v32, v15

    .line 131
    .line 132
    invoke-static/range {v18 .. v33}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_2
    move-object/from16 v18, v1

    .line 137
    .line 138
    move/from16 v24, v3

    .line 139
    .line 140
    move-object/from16 v23, v4

    .line 141
    .line 142
    move-object/from16 v25, v5

    .line 143
    .line 144
    move-object/from16 v19, v6

    .line 145
    .line 146
    move-object/from16 v20, v7

    .line 147
    .line 148
    move-object/from16 v21, v8

    .line 149
    .line 150
    move-object/from16 v22, v9

    .line 151
    .line 152
    move-object/from16 v26, v10

    .line 153
    .line 154
    invoke-static/range {v18 .. v26}, Lr9/d0;->H0(Lgg/q;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/EditText;ILandroid/widget/TextView;Lgg/u;)V

    .line 155
    .line 156
    .line 157
    :goto_4
    return-void

    .line 158
    :pswitch_1
    iget-object v1, v0, Lr9/f;->p:Landroid/content/Context;

    .line 159
    .line 160
    const/16 v31, 0x0

    .line 161
    .line 162
    iget-object v2, v0, Lr9/f;->b:Lgg/q;

    .line 163
    .line 164
    iget-object v3, v0, Lr9/f;->c:Landroid/widget/LinearLayout;

    .line 165
    .line 166
    iget-object v4, v0, Lr9/f;->d:Landroid/widget/TextView;

    .line 167
    .line 168
    iget v5, v0, Lr9/f;->e:I

    .line 169
    .line 170
    iget-object v6, v0, Lr9/f;->f:Landroid/widget/EditText;

    .line 171
    .line 172
    iget-object v7, v0, Lr9/f;->g:Lgg/u;

    .line 173
    .line 174
    iget-object v8, v0, Lr9/f;->h:Landroid/widget/EditText;

    .line 175
    .line 176
    iget-object v9, v0, Lr9/f;->i:Lgg/s;

    .line 177
    .line 178
    iget-object v10, v0, Lr9/f;->j:Landroid/widget/TextView;

    .line 179
    .line 180
    iget-object v11, v0, Lr9/f;->k:Landroid/widget/ScrollView;

    .line 181
    .line 182
    iget-object v12, v0, Lr9/f;->l:Lr9/d0;

    .line 183
    .line 184
    iget-object v13, v0, Lr9/f;->m:Landroid/widget/TextView;

    .line 185
    .line 186
    iget-object v14, v0, Lr9/f;->n:Landroid/widget/LinearLayout;

    .line 187
    .line 188
    iget-object v15, v0, Lr9/f;->o:Lgg/u;

    .line 189
    .line 190
    move-object/from16 v30, v1

    .line 191
    .line 192
    move-object/from16 v16, v2

    .line 193
    .line 194
    move-object/from16 v17, v3

    .line 195
    .line 196
    move-object/from16 v18, v4

    .line 197
    .line 198
    move/from16 v19, v5

    .line 199
    .line 200
    move-object/from16 v20, v6

    .line 201
    .line 202
    move-object/from16 v21, v7

    .line 203
    .line 204
    move-object/from16 v22, v8

    .line 205
    .line 206
    move-object/from16 v23, v9

    .line 207
    .line 208
    move-object/from16 v24, v10

    .line 209
    .line 210
    move-object/from16 v25, v11

    .line 211
    .line 212
    move-object/from16 v26, v12

    .line 213
    .line 214
    move-object/from16 v27, v13

    .line 215
    .line 216
    move-object/from16 v28, v14

    .line 217
    .line 218
    move-object/from16 v29, v15

    .line 219
    .line 220
    invoke-static/range {v16 .. v31}, Lr9/d0;->K0(Lgg/q;Landroid/widget/LinearLayout;Landroid/widget/TextView;ILandroid/widget/EditText;Lgg/u;Landroid/widget/EditText;Lgg/s;Landroid/widget/TextView;Landroid/widget/ScrollView;Lr9/d0;Landroid/widget/TextView;Landroid/widget/LinearLayout;Lgg/u;Landroid/content/Context;Z)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
