.class public final Lyyds/ᛲᛳᛱᛲ;
.super Lyyds/ᛵᲀᲀᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛳᛵᛱ:Ljava/util/List;

.field public ᛳᛴᲇᛶ:Ljava/util/HashMap;

.field public ᛳᛷᛶᛲ:Lyyds/ᛲᛳᛱᛲ;

.field public ᛴᛵᛷᛳ:I

.field public ᛴᛸᛴᛸ:Z

.field public ᛴᛸᲁᛵ:Ljava/lang/String;

.field public ᛵᛲᛵᲁ:Landroid/widget/EditText;

.field public ᛵᲈᲇᛵ:I

.field public ᛶᛵᛸᛲ:Ljava/util/ArrayList;

.field public ᛷᲈᛳᛲ:Ljava/lang/String;

.field public ᛸᲀᛷᛲ:J

.field public ᲀᛳᛷᛷ:[Ljava/lang/CharSequence;

.field public ᲀᛸᲈᲁ:[I

.field public ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

.field public ᲈᛳ:F

.field public ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;


# direct methods
.method public static ᛶᛵᛸᛲ(Landroid/content/Context;)Lyyds/ᛲᛳᛱᛲ;
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᛳᛱᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛵᲀᲀᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, v0, Lyyds/ᛲᛳᛱᛲ;->ᛳᛷᛶᛲ:Lyyds/ᛲᛳᛱᛲ;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛸᛴᛸ:Z

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, v0, Lyyds/ᛲᛳᛱᛲ;->ᛵᲈᲇᛵ:I

    .line 13
    .line 14
    iput v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛵᛷᛳ:I

    .line 15
    .line 16
    new-instance v1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛳᛴᲇᛶ:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v1, "Search"

    .line 24
    .line 25
    iput-object v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛸᲁᛵ:Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, ""

    .line 28
    .line 29
    iput-object v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛷᲈᛳᛲ:Ljava/lang/String;

    .line 30
    .line 31
    const-wide/16 v1, 0x0

    .line 32
    .line 33
    iput-wide v1, v0, Lyyds/ᛲᛳᛱᛲ;->ᛸᲀᛷᛲ:J

    .line 34
    .line 35
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 36
    .line 37
    return-object v0
.end method


# virtual methods
.method public final ᛱᲀᲈᛲ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 12
    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    new-instance v0, Lyyds/ᛶᛷᛲᛴ;

    .line 16
    .line 17
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛳᛷᛶᛲ:Lyyds/ᛲᛳᛱᛲ;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :cond_1
    invoke-static {}, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move-object v3, v4

    .line 35
    :goto_0
    iget-object v4, p0, Lyyds/ᛲᛳᛱᛲ;->ᛲᛳᛵᛱ:Ljava/util/List;

    .line 36
    .line 37
    if-nez v4, :cond_3

    .line 38
    .line 39
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-direct {v0, v1}, Lyyds/ᛶᛷᛲᛴ;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object v4, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {}, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez v4, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v3, v4

    .line 57
    :goto_1
    iput-object v3, v0, Lyyds/ᛶᛷᛲᛴ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 58
    .line 59
    iput-object v2, v0, Lyyds/ᛶᛷᛲᛴ;->ᛶᛷᛲᲁ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 60
    .line 61
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛲᛳᛵᛱ:Ljava/util/List;

    .line 65
    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    new-instance v2, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    :cond_6
    iput-object v2, v0, Lyyds/ᛶᛷᛲᛴ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 74
    .line 75
    :goto_2
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 82
    .line 83
    if-nez v0, :cond_7

    .line 84
    .line 85
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 86
    .line 87
    invoke-virtual {v2, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    invoke-virtual {v2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲈᛳᛵᛴ:Lyyds/ᛶᛷᛲᛴ;

    .line 96
    .line 97
    if-eq v0, v2, :cond_8

    .line 98
    .line 99
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_8
    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 106
    .line 107
    .line 108
    :cond_9
    :goto_3
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 109
    .line 110
    if-nez v0, :cond_a

    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :cond_a
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛸᲁᛵ:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_b

    .line 126
    .line 127
    const v2, 0x66080186

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_b
    const v2, 0x66080187

    .line 132
    .line 133
    .line 134
    :goto_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 144
    .line 145
    .line 146
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_c

    .line 159
    .line 160
    const v3, 0x66060036

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_c
    const v3, 0x66060132

    .line 165
    .line 166
    .line 167
    :goto_5
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_d

    .line 185
    .line 186
    const v3, 0x6606002f

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_d
    const v3, 0x6606012b

    .line 191
    .line 192
    .line 193
    :goto_6
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    invoke-static {v0, v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ()V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛷᲈᛳᛲ:Ljava/lang/String;

    .line 226
    .line 227
    if-nez v1, :cond_e

    .line 228
    .line 229
    const-string v1, ""

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    :goto_7
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-nez v0, :cond_f

    .line 241
    .line 242
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 248
    .line 249
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ()V

    .line 261
    .line 262
    .line 263
    :cond_f
    :goto_8
    invoke-super {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ()V

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method public final ᛲᲀᛲᛲ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᲁᛵᲁᲁ:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    if-ne v0, p0, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 12
    .line 13
    return p0
.end method

.method public final ᛳᛴᲇᛶ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ(Landroid/widget/EditText;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lyyds/ᲁᛷᲇᛸ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method public final ᛵᛲᛵᲁ()V
    .locals 9

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const v1, 0x6608012f

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x6606012b

    .line 18
    .line 19
    .line 20
    const v2, 0x6606002f

    .line 21
    .line 22
    .line 23
    const/high16 v3, 0x41900000    # 18.0f

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    move v6, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v6, v1

    .line 45
    :goto_0
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v0, v4, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v5, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, 0x0

    .line 78
    if-nez v5, :cond_4

    .line 79
    .line 80
    iget-object v5, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const v7, 0x6608012e

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v7}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-eqz v5, :cond_5

    .line 94
    .line 95
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_3

    .line 108
    .line 109
    move v1, v2

    .line 110
    :cond_3
    invoke-virtual {v7, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p0, v3}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-virtual {v5, v4, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v5, v6

    .line 134
    :cond_5
    :goto_1
    iget-object p0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 135
    .line 136
    invoke-virtual {p0, v0, v6, v5, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final ᛶᛴᛱᛲ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛲᛳᛱᛲ;->ᛳᛴᲇᛶ()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final ᛶᛷᛲᲁ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛲᛳᛱᛲ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "("

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛸᛸᛷᛱ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 6
    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lyyds/ᛲᛳᛱᛲ;->ᛴᛸᛴᛸ:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 25
    .line 26
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 27
    .line 28
    check-cast v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const v2, 0x66080189

    .line 38
    .line 39
    .line 40
    const v3, 0x66080188

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_2
    invoke-static {}, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move-object v0, v3

    .line 65
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    new-instance v3, Lyyds/ᛴᛵᛸᛲ;

    .line 72
    .line 73
    invoke-direct {v3, v0, v1}, Lyyds/ᛴᛵᛸᛲ;-><init>(Landroid/content/Context;I)V

    .line 74
    .line 75
    .line 76
    iput-object v3, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    new-instance v3, Lyyds/ᛴᛵᛸᛲ;

    .line 80
    .line 81
    invoke-direct {v3, v0}, Lyyds/ᛴᛵᛸᛲ;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 85
    .line 86
    :goto_1
    const/4 v0, 0x2

    .line 87
    invoke-virtual {v3, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v3, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 104
    .line 105
    const/4 v3, 0x1

    .line 106
    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 107
    .line 108
    .line 109
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 110
    .line 111
    new-instance v4, Lyyds/ᛶᛱᲀᛵ;

    .line 112
    .line 113
    invoke-direct {v4, p0, v3}, Lyyds/ᛶᛱᲀᛵ;-><init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;I)V

    .line 114
    .line 115
    .line 116
    iput-object v4, v2, Lyyds/ᛴᛵᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛸᲁ;

    .line 117
    .line 118
    new-instance v3, Lyyds/ᲀᲀᲀᛴ;

    .line 119
    .line 120
    invoke-direct {v3, v0, p0}, Lyyds/ᲀᲀᲀᛴ;-><init>(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 131
    .line 132
    check-cast v0, Landroid/view/ViewGroup;

    .line 133
    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 137
    .line 138
    if-nez v2, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 142
    .line 143
    .line 144
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 145
    .line 146
    const/4 v2, -0x1

    .line 147
    const/4 v3, -0x2

    .line 148
    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 152
    .line 153
    if-eqz v2, :cond_6

    .line 154
    .line 155
    invoke-virtual {p0}, Lyyds/ᛲᛳᛱᛲ;->ᛳᛴᲇᛶ()V

    .line 156
    .line 157
    .line 158
    :cond_6
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 159
    .line 160
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    const/4 v1, 0x0

    .line 164
    iput-object v1, p0, Lyyds/ᛲᛳᛱᛲ;->ᛵᛲᛵᲁ:Landroid/widget/EditText;

    .line 165
    .line 166
    iget-object v1, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 167
    .line 168
    iget-object v1, v1, Lyyds/ᲁᛷᲇᛸ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 169
    .line 170
    check-cast v1, Landroid/view/ViewGroup;

    .line 171
    .line 172
    iget-object v2, p0, Lyyds/ᛲᛳᛱᛲ;->ᲇᲇᲈᲀ:Lyyds/ᛴᛵᛸᛲ;

    .line 173
    .line 174
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    .line 176
    .line 177
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lyyds/ᛲᛳᛱᛲ;->ᛱᲀᲈᛲ()V

    .line 178
    .line 179
    .line 180
    :cond_8
    return-void
.end method

.method public final ᲁᛵᲁᲁ(Ljava/lang/CharSequence;Lyyds/ᛶᛷᛳᛷ;)Lyyds/ᛵᲀᲀᛱ;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ᲇᲇᲈᲀ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lyyds/ᛴᛶᛳᛸ;

    .line 7
    .line 8
    const/16 v1, 0xd

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
