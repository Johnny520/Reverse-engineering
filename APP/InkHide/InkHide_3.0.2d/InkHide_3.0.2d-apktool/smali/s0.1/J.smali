.class public final Ls0/J;
.super Lt0/c;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/String;

.field public i:Z

.field public j:Landroid/widget/EditText;

.field public k:Landroid/widget/EditText;

.field public final l:Lcom/lu/wxmask/bean/OptionData;

.field public m:Ljava/lang/Integer;

.field public n:Ljava/lang/Integer;

.field public o:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    .line 5
    .line 6
    const-string p1, "mask_manager_wechat_panel_first_enter_announcement_shown"

    .line 7
    .line 8
    iput-object p1, p0, Ls0/J;->h:Ljava/lang/String;

    .line 9
    .line 10
    sget-object p1, Lcom/lu/wxmask/bean/OptionData;->Companion:Lcom/lu/wxmask/bean/OptionData$Companion;

    .line 11
    .line 12
    sget-boolean v0, Lz0/i;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Lcom/lu/wxmask/bean/OptionData$Companion;->toJson(Lcom/lu/wxmask/bean/OptionData;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Lcom/lu/wxmask/bean/OptionData$Companion;->fromJson(Ljava/lang/String;)Lcom/lu/wxmask/bean/OptionData;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 27
    .line 28
    new-instance p1, Ls0/x;

    .line 29
    .line 30
    const/16 v0, 0xe

    .line 31
    .line 32
    invoke-direct {p1, p0, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lt0/c;->setOnShowListener(LM0/l;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final A(Ls0/J;)Landroid/widget/LinearLayout;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, -0x2

    .line 17
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 25
    .line 26
    .line 27
    const/16 v4, 0xa

    .line 28
    .line 29
    invoke-static {v4}, LB0/a;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/16 v6, 0x8

    .line 34
    .line 35
    invoke-static {v6}, LB0/a;->b(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-static {v4}, LB0/a;->b(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v8, 0xe

    .line 44
    .line 45
    invoke-static {v8}, LB0/a;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual {v0, v5, v7, v4, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    const-string v5, "\u81ea\u5b9a\u4e49\u540d\u79f0"

    .line 66
    .line 67
    invoke-static {v2, v3, v4, v5}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 75
    .line 76
    .line 77
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 80
    .line 81
    .line 82
    const v5, 0x41533333    # 13.2f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v1, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    new-instance v4, Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 101
    .line 102
    invoke-direct {v5, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 103
    .line 104
    .line 105
    const/4 v3, 0x4

    .line 106
    invoke-static {v3}, LB0/a;->b(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    iput v3, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    .line 114
    .line 115
    const-string v3, "\u81ea\u5b9a\u4e49\u957f\u6309\u83dc\u5355\u91cc\u201c\u52a0\u5165\u540d\u5355\u201d\u7684\u663e\u793a\u540d\u79f0\uff0c\u7559\u7a7a\u9ed8\u8ba4\u52a0\u5165\u540d\u5355"

    .line 116
    .line 117
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 125
    .line 126
    .line 127
    const/high16 v3, 0x41280000    # 10.5f

    .line 128
    .line 129
    invoke-virtual {v4, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, p0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 136
    .line 137
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getQuickAddMenuTitle()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    const-string v5, "\u52a0\u5165\u540d\u5355"

    .line 146
    .line 147
    if-eqz v4, :cond_0

    .line 148
    .line 149
    move-object v3, v5

    .line 150
    :cond_0
    invoke-virtual {p0, v3}, Ls0/J;->t(Ljava/lang/String;)Landroid/widget/EditText;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 155
    .line 156
    const/16 v7, 0x26

    .line 157
    .line 158
    invoke-static {v7}, LB0/a;->b(I)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-direct {v4, v2, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 163
    .line 164
    .line 165
    invoke-static {v6}, LB0/a;->b(I)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    .line 173
    .line 174
    iput-object v3, p0, Ls0/J;->k:Landroid/widget/EditText;

    .line 175
    .line 176
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    new-instance v3, Landroid/view/View;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 195
    .line 196
    invoke-static {v1}, LB0/a;->b(I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-direct {v4, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 201
    .line 202
    .line 203
    invoke-static {v6}, LB0/a;->b(I)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    invoke-virtual {v3, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    return-object v0
.end method

.method public static final B(Ls0/J;)Landroid/widget/LinearLayout;
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, LE0/c;

    .line 14
    .line 15
    const-string v2, "#add"

    .line 16
    .line 17
    const-string v3, "\u6253\u5f00\u52a0\u5165\u540d\u5355"

    .line 18
    .line 19
    invoke-direct {v1, v2, v3}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, LE0/c;

    .line 23
    .line 24
    const-string v3, "#del"

    .line 25
    .line 26
    const-string v4, "\u79fb\u9664\u5f53\u524d\u5bc6\u53cb"

    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, LE0/c;

    .line 32
    .line 33
    const-string v4, "#hide"

    .line 34
    .line 35
    const-string v5, "\u9690\u85cf\u804a\u5929\u5185\u5bb9"

    .line 36
    .line 37
    invoke-direct {v3, v4, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, LE0/c;

    .line 41
    .line 42
    const-string v5, "#show"

    .line 43
    .line 44
    const-string v6, "\u6062\u590d\u804a\u5929\u5185\u5bb9"

    .line 45
    .line 46
    invoke-direct {v4, v5, v6}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, LE0/c;

    .line 50
    .line 51
    const-string v6, "#copyId"

    .line 52
    .line 53
    const-string v7, "\u590d\u5236\u5f53\u524d\u5fae\u4fe1ID"

    .line 54
    .line 55
    invoke-direct {v5, v6, v7}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {v1, v2, v3, v4, v5}, [LE0/c;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    const/4 v4, -0x2

    .line 70
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 78
    .line 79
    .line 80
    const/16 v5, 0xa

    .line 81
    .line 82
    invoke-static {v5}, LB0/a;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/16 v7, 0x8

    .line 87
    .line 88
    invoke-static {v7}, LB0/a;->b(I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-static {v5}, LB0/a;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/16 v10, 0xe

    .line 97
    .line 98
    invoke-static {v10}, LB0/a;->b(I)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    invoke-virtual {v0, v6, v8, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 103
    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 107
    .line 108
    .line 109
    new-instance v8, Landroid/widget/TextView;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-direct {v8, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 116
    .line 117
    .line 118
    const-string v9, "\u53e3\u4ee4\u793a\u4f8b"

    .line 119
    .line 120
    invoke-static {v3, v4, v8, v9}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-direct/range {p0 .. p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    .line 129
    .line 130
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 131
    .line 132
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 133
    .line 134
    .line 135
    const v9, 0x41533333    # 13.2f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    new-instance v8, Landroid/widget/TextView;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-direct {v8, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 151
    .line 152
    .line 153
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 154
    .line 155
    invoke-direct {v9, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 156
    .line 157
    .line 158
    const/4 v10, 0x4

    .line 159
    invoke-static {v10}, LB0/a;->b(I)I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    iput v11, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 164
    .line 165
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    const-string v9, "\u5728\u804a\u5929\u8f93\u5165\u6846\u8f93\u5165\u4ee5\u4e0b\u53e3\u4ee4\u540e\u81ea\u52a8\u89e6\u53d1"

    .line 169
    .line 170
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    invoke-direct/range {p0 .. p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 178
    .line 179
    .line 180
    const/high16 v9, 0x41280000    # 10.5f

    .line 181
    .line 182
    invoke-virtual {v8, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    new-instance v8, Landroid/widget/LinearLayout;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-direct {v8, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 195
    .line 196
    .line 197
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 198
    .line 199
    invoke-direct {v9, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 200
    .line 201
    .line 202
    invoke-static {v5}, LB0/a;->b(I)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iput v5, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 207
    .line 208
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_0

    .line 223
    .line 224
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    check-cast v5, LE0/c;

    .line 229
    .line 230
    iget-object v9, v5, LE0/c;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v9, Ljava/lang/String;

    .line 233
    .line 234
    iget-object v5, v5, LE0/c;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v5, Ljava/lang/String;

    .line 237
    .line 238
    new-instance v11, Landroid/widget/LinearLayout;

    .line 239
    .line 240
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-direct {v11, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 245
    .line 246
    .line 247
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 248
    .line 249
    invoke-direct {v12, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 250
    .line 251
    .line 252
    const/4 v13, 0x7

    .line 253
    invoke-static {v13}, LB0/a;->b(I)I

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 258
    .line 259
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 260
    .line 261
    .line 262
    const/16 v12, 0x10

    .line 263
    .line 264
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v11, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 268
    .line 269
    .line 270
    new-instance v12, Landroid/widget/TextView;

    .line 271
    .line 272
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    invoke-direct {v12, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 280
    .line 281
    const/16 v14, 0x46

    .line 282
    .line 283
    invoke-static {v14}, LB0/a;->b(I)I

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    const/16 v15, 0x1c

    .line 288
    .line 289
    invoke-static {v15}, LB0/a;->b(I)I

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 294
    .line 295
    .line 296
    invoke-static {v7}, LB0/a;->b(I)I

    .line 297
    .line 298
    .line 299
    move-result v14

    .line 300
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 304
    .line 305
    .line 306
    const/16 v13, 0x11

    .line 307
    .line 308
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    .line 314
    invoke-direct/range {p0 .. p0}, Ls0/J;->getACCENT_TEAL()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 319
    .line 320
    .line 321
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 322
    .line 323
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 324
    .line 325
    .line 326
    const/high16 v9, 0x41300000    # 11.0f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 329
    .line 330
    .line 331
    invoke-direct/range {p0 .. p0}, Ls0/J;->getACCENT_TEAL()I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    invoke-static {v9}, Ls0/J;->S(I)I

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    invoke-static {v10}, LB0/a;->b(I)I

    .line 340
    .line 341
    .line 342
    move-result v13

    .line 343
    const/4 v14, 0x0

    .line 344
    move-object/from16 v15, p0

    .line 345
    .line 346
    invoke-static {v15, v9, v13, v14, v7}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v12, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 354
    .line 355
    .line 356
    new-instance v9, Landroid/widget/TextView;

    .line 357
    .line 358
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    invoke-direct {v9, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 363
    .line 364
    .line 365
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 366
    .line 367
    const/high16 v13, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-direct {v12, v6, v4, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    .line 377
    .line 378
    invoke-direct {v15}, Ls0/J;->getTEXT_SECONDARY()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 383
    .line 384
    .line 385
    const v5, 0x41333333    # 11.2f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v9, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v11, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_0
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 400
    .line 401
    .line 402
    return-object v0
.end method

.method public static final C(Ls0/J;)Landroid/widget/LinearLayout;
    .locals 14

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    new-instance v1, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sget-boolean v2, Lz0/i;->a:Z

    .line 15
    .line 16
    invoke-static {}, Lz0/g;->m()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const-string v2, "\u672a\u8bc6\u522b"

    .line 27
    .line 28
    :cond_0
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    const/4 v4, -0x1

    .line 31
    const/4 v5, -0x2

    .line 32
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 40
    .line 41
    .line 42
    const/16 v6, 0xa

    .line 43
    .line 44
    invoke-static {v6}, LB0/a;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const/16 v8, 0x8

    .line 49
    .line 50
    invoke-static {v8}, LB0/a;->b(I)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    invoke-static {v6}, LB0/a;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    invoke-static {v6}, LB0/a;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    invoke-virtual {v1, v7, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-virtual {v1, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 67
    .line 68
    .line 69
    new-instance v9, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-direct {v9, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 79
    .line 80
    invoke-direct {v10, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    const/16 v10, 0x10

    .line 87
    .line 88
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Ls0/J;->getACCENT_BLUE()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const/16 v11, 0x16

    .line 99
    .line 100
    invoke-static {v11}, LB0/a;->b(I)I

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    const-string v13, "ID"

    .line 105
    .line 106
    invoke-virtual {p0, v13, v10, v12}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 111
    .line 112
    invoke-static {v11}, LB0/a;->b(I)I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    invoke-static {v11}, LB0/a;->b(I)I

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    invoke-direct {v12, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 121
    .line 122
    .line 123
    const/16 v11, 0x30

    .line 124
    .line 125
    iput v11, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 126
    .line 127
    invoke-static {v6}, LB0/a;->b(I)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v12, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    new-instance v6, Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-direct {v6, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 150
    .line 151
    const/high16 v11, 0x3f800000    # 1.0f

    .line 152
    .line 153
    invoke-direct {v10, v7, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 160
    .line 161
    .line 162
    new-instance v7, Landroid/widget/TextView;

    .line 163
    .line 164
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-direct {v7, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 169
    .line 170
    .line 171
    const-string v10, "\u672c\u673a\u5fae\u4fe1\u8bc6\u522bid\uff1a"

    .line 172
    .line 173
    invoke-static {v4, v5, v7, v10}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 181
    .line 182
    .line 183
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 184
    .line 185
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 186
    .line 187
    .line 188
    const v10, 0x41533333    # 13.2f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v3, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    new-instance v7, Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-direct {v7, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 207
    .line 208
    invoke-direct {v10, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 209
    .line 210
    .line 211
    invoke-static {v0}, LB0/a;->b(I)I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    iput v5, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 216
    .line 217
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 228
    .line 229
    .line 230
    const/high16 v5, 0x41280000    # 10.5f

    .line 231
    .line 232
    invoke-virtual {v7, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    new-instance v5, Lm0/h;

    .line 248
    .line 249
    invoke-direct {v5, v0, v2}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Landroid/view/View;

    .line 256
    .line 257
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 262
    .line 263
    .line 264
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 265
    .line 266
    invoke-static {v3}, LB0/a;->b(I)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-direct {v2, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 271
    .line 272
    .line 273
    invoke-static {v8}, LB0/a;->b(I)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 278
    .line 279
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    return-object v1
.end method

.method public static final D(Ls0/J;Ljava/lang/String;Ls0/I;)Landroid/widget/FrameLayout;
    .locals 7

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 11
    .line 12
    const/16 v2, 0x30

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ls0/J;->getHEADER_COLOR()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 42
    .line 43
    const/16 v4, 0x34

    .line 44
    .line 45
    invoke-static {v4}, LB0/a;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-direct {v2, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    const v3, 0x800003

    .line 53
    .line 54
    .line 55
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    invoke-static {v3}, LB0/a;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    const/16 v2, 0x11

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    const/high16 v3, 0x41a80000    # 21.0f

    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    invoke-virtual {v1, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 84
    .line 85
    .line 86
    const-string v3, "\u2039"

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Lm0/h;

    .line 92
    .line 93
    const/4 v5, 0x3

    .line 94
    invoke-direct {v3, v5, p2}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    new-instance p2, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {p2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 113
    .line 114
    const/4 v3, -0x2

    .line 115
    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 116
    .line 117
    .line 118
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 119
    .line 120
    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 124
    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p0, p1}, Ls0/J;->y(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    const/16 v5, 0x12

    .line 139
    .line 140
    invoke-static {v5}, LB0/a;->b(I)I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    invoke-virtual {p0, v1, v2, v6}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 149
    .line 150
    invoke-static {v5}, LB0/a;->b(I)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    invoke-static {v5}, LB0/a;->b(I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-direct {v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 159
    .line 160
    .line 161
    const/16 v5, 0x10

    .line 162
    .line 163
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 164
    .line 165
    const/4 v5, 0x6

    .line 166
    invoke-static {v5}, LB0/a;->b(I)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Landroid/widget/TextView;

    .line 180
    .line 181
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 189
    .line 190
    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 201
    .line 202
    .line 203
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 204
    .line 205
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 206
    .line 207
    .line 208
    const/high16 p0, 0x41940000    # 18.5f

    .line 209
    .line 210
    invoke-virtual {v1, v4, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    return-object v0
.end method

.method public static final synthetic E(Ls0/J;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static H(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\u540d\u5355"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p0, "\u2261"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string v0, "\u5feb\u6377"

    .line 14
    .line 15
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string p0, "\u26a1"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string v0, "\u5bc6\u53cb"

    .line 25
    .line 26
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const-string p0, "\u2659"

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    const-string v0, "\u901a\u8baf\u5f55"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const-string p0, "\u25a3"

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const-string v0, "\u804a\u5929\u8bb0\u5f55"

    .line 47
    .line 48
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    const-string p0, "\u25a1"

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    const-string v0, "\u5b58\u50a8"

    .line 58
    .line 59
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    const-string p0, "\u25ce"

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_5
    const-string v0, "\u8bed\u97f3"

    .line 69
    .line 70
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_10

    .line 75
    .line 76
    const-string v0, "\u89c6\u9891"

    .line 77
    .line 78
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    const-string v0, "\u641c\u7d22"

    .line 86
    .line 87
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    const-string p0, "\u2315"

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_7
    const-string v0, "\u670b\u53cb\u5708"

    .line 97
    .line 98
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    const-string p0, "\u263b"

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_8
    const-string v0, "\u70b9\u8d5e"

    .line 108
    .line 109
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_f

    .line 114
    .line 115
    const-string v0, "\u8bc4\u8bba"

    .line 116
    .line 117
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_9
    const-string v0, "\u89d2\u6807"

    .line 125
    .line 126
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_e

    .line 131
    .line 132
    const-string v0, "\u6d88\u606f"

    .line 133
    .line 134
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_a

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_a
    const-string v0, "\u9707\u52a8"

    .line 142
    .line 143
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_b

    .line 148
    .line 149
    const-string p0, "\u2248"

    .line 150
    .line 151
    return-object p0

    .line 152
    :cond_b
    const-string v0, "\u52a0\u7c97"

    .line 153
    .line 154
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_c

    .line 159
    .line 160
    const-string p0, "B"

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_c
    const-string v0, "\u5bc6\u7801"

    .line 164
    .line 165
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_d

    .line 170
    .line 171
    const-string p0, "\u25a2"

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_d
    const-string p0, "\u2022"

    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_e
    :goto_0
    const-string p0, "\u2662"

    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_f
    :goto_1
    const-string p0, "\u2630"

    .line 181
    .line 182
    return-object p0

    .line 183
    :cond_10
    :goto_2
    const-string p0, "\u260e"

    .line 184
    .line 185
    return-object p0
.end method

.method public static J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    int-to-float p0, p1

    .line 14
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {v0, p3, p0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public static synthetic K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 p2, 0x8

    .line 6
    .line 7
    invoke-static {p2}, LB0/a;->b(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 12
    .line 13
    if-eqz p4, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    :cond_1
    const/4 p4, 0x1

    .line 24
    invoke-static {p4}, LB0/a;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, p3, p4}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static S(I)I
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v2, 0x1e

    .line 14
    .line 15
    invoke-static {v2, v0, v1, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private final getACCENT_BLUE()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0xc38116

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getACCENT_GREEN()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0xc65c95

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getACCENT_ORANGE()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0x2672de

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getACCENT_PINK()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0x25a28b

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getACCENT_PURPLE()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0x869728

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getACCENT_TEAL()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, -0xe95665

    .line 9
    .line 10
    .line 11
    return v0
.end method

.method private final getCARD_COLOR()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->d:I

    .line 6
    .line 7
    return v0
.end method

.method private final getContent()Landroid/view/View;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    new-instance v3, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, -0x2

    .line 18
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    const/16 v4, 0x18

    .line 29
    .line 30
    invoke-static {v4}, LB0/a;->b(I)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/4 v9, 0x0

    .line 35
    invoke-virtual {v3, v9, v9, v9, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {v3, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 43
    .line 44
    .line 45
    sget-boolean v8, Lz0/i;->a:Z

    .line 46
    .line 47
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    new-instance v10, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v8, " \u4eba"

    .line 64
    .line 65
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    new-instance v10, Landroid/widget/LinearLayout;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-direct {v10, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 82
    .line 83
    invoke-direct {v11, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 84
    .line 85
    .line 86
    const/16 v12, 0xc

    .line 87
    .line 88
    invoke-static {v12}, LB0/a;->b(I)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 93
    .line 94
    invoke-static {v12}, LB0/a;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 99
    .line 100
    invoke-static {v2}, LB0/a;->b(I)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 105
    .line 106
    invoke-static {v12}, LB0/a;->b(I)I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 111
    .line 112
    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    .line 114
    .line 115
    const/16 v11, 0x44

    .line 116
    .line 117
    invoke-static {v11}, LB0/a;->b(I)I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    invoke-virtual {v10, v11}, Landroid/view/View;->setMinimumHeight(I)V

    .line 122
    .line 123
    .line 124
    const/16 v11, 0xa

    .line 125
    .line 126
    invoke-static {v11}, LB0/a;->b(I)I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    const/16 v14, 0x9

    .line 131
    .line 132
    invoke-static {v14}, LB0/a;->b(I)I

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    move/from16 v16, v4

    .line 137
    .line 138
    invoke-static {v11}, LB0/a;->b(I)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    move/from16 v17, v11

    .line 143
    .line 144
    invoke-static {v14}, LB0/a;->b(I)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {v10, v13, v15, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 149
    .line 150
    .line 151
    const/16 v4, 0x10

    .line 152
    .line 153
    invoke-virtual {v10, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    const/16 v13, 0xe

    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    invoke-static {v0, v11, v9, v15, v13}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-virtual {v10, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 171
    .line 172
    .line 173
    const/high16 v11, 0x3f000000    # 0.5f

    .line 174
    .line 175
    invoke-static {v11}, LB0/a;->a(F)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    invoke-virtual {v10, v11}, Landroid/view/View;->setElevation(F)V

    .line 180
    .line 181
    .line 182
    const-string v11, "\u540d\u5355\u7ba1\u7406"

    .line 183
    .line 184
    invoke-static {v11}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    move/from16 v18, v12

    .line 189
    .line 190
    invoke-virtual {v0, v11}, Ls0/J;->y(Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    const/16 v19, 0x1e

    .line 195
    .line 196
    move/from16 v20, v14

    .line 197
    .line 198
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    invoke-virtual {v0, v13, v12, v14}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 207
    .line 208
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    invoke-direct {v13, v14, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 217
    .line 218
    .line 219
    iput v4, v13, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 220
    .line 221
    const/16 v2, 0x8

    .line 222
    .line 223
    invoke-static {v2}, LB0/a;->b(I)I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    new-instance v12, Landroid/widget/LinearLayout;

    .line 237
    .line 238
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    invoke-direct {v12, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 243
    .line 244
    .line 245
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 246
    .line 247
    const/high16 v14, 0x3f800000    # 1.0f

    .line 248
    .line 249
    invoke-direct {v13, v9, v6, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 250
    .line 251
    .line 252
    iput v4, v13, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 253
    .line 254
    invoke-static {v2}, LB0/a;->b(I)I

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 268
    .line 269
    .line 270
    new-instance v13, Landroid/widget/TextView;

    .line 271
    .line 272
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    invoke-direct {v13, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v5, v6, v13, v11}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 287
    .line 288
    .line 289
    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 290
    .line 291
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 292
    .line 293
    .line 294
    const v14, 0x4169999a    # 14.6f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v13, v7, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 301
    .line 302
    .line 303
    new-instance v13, Landroid/widget/TextView;

    .line 304
    .line 305
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    invoke-direct {v13, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 310
    .line 311
    .line 312
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 313
    .line 314
    invoke-direct {v14, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 315
    .line 316
    .line 317
    const/16 v21, 0x2

    .line 318
    .line 319
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    iput v5, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 324
    .line 325
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 326
    .line 327
    .line 328
    const-string v5, "\u7ba1\u7406\u9700\u8981\u9690\u85cf\u7684\u5bc6\u53cb\u540d\u5355"

    .line 329
    .line 330
    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 338
    .line 339
    .line 340
    const/high16 v5, 0x41200000    # 10.0f

    .line 341
    .line 342
    invoke-virtual {v13, v7, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 349
    .line 350
    .line 351
    new-instance v5, Landroid/widget/LinearLayout;

    .line 352
    .line 353
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    invoke-direct {v5, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 358
    .line 359
    .line 360
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 361
    .line 362
    const/16 v13, 0x3a

    .line 363
    .line 364
    invoke-static {v13}, LB0/a;->b(I)I

    .line 365
    .line 366
    .line 367
    move-result v14

    .line 368
    invoke-direct {v12, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 369
    .line 370
    .line 371
    iput v4, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 372
    .line 373
    invoke-virtual {v5, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 374
    .line 375
    .line 376
    const v12, 0x800015

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 383
    .line 384
    .line 385
    new-instance v14, Landroid/widget/TextView;

    .line 386
    .line 387
    move/from16 v21, v13

    .line 388
    .line 389
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v13

    .line 393
    invoke-direct {v14, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 394
    .line 395
    .line 396
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 397
    .line 398
    const/16 v22, 0x16

    .line 399
    .line 400
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 401
    .line 402
    .line 403
    move-result v12

    .line 404
    invoke-direct {v13, v6, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 405
    .line 406
    .line 407
    const v12, 0x800005

    .line 408
    .line 409
    .line 410
    iput v12, v13, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 411
    .line 412
    invoke-virtual {v14, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 413
    .line 414
    .line 415
    const/16 v23, 0x30

    .line 416
    .line 417
    invoke-static/range {v23 .. v23}, LB0/a;->b(I)I

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    invoke-virtual {v14, v13}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 422
    .line 423
    .line 424
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 425
    .line 426
    .line 427
    move-result v13

    .line 428
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    invoke-virtual {v14, v13, v9, v4, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 433
    .line 434
    .line 435
    const/16 v4, 0x11

    .line 436
    .line 437
    invoke-virtual {v14, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 441
    .line 442
    .line 443
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    invoke-virtual {v14, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 451
    .line 452
    .line 453
    const v8, 0x41233333    # 10.2f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v14, v7, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    invoke-static {v8}, Ls0/J;->S(I)I

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    const/16 v13, 0xb

    .line 468
    .line 469
    invoke-static {v13}, LB0/a;->b(I)I

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    invoke-static {v0, v8, v13, v15, v2}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    invoke-virtual {v14, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 481
    .line 482
    .line 483
    new-instance v8, Landroid/widget/TextView;

    .line 484
    .line 485
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 486
    .line 487
    .line 488
    move-result-object v13

    .line 489
    invoke-direct {v8, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 490
    .line 491
    .line 492
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 493
    .line 494
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 499
    .line 500
    .line 501
    move-result v15

    .line 502
    invoke-direct {v13, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 503
    .line 504
    .line 505
    iput v12, v13, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 506
    .line 507
    invoke-static {v1}, LB0/a;->b(I)I

    .line 508
    .line 509
    .line 510
    move-result v12

    .line 511
    iput v12, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 512
    .line 513
    invoke-virtual {v8, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 514
    .line 515
    .line 516
    const-string v12, "\u203a"

    .line 517
    .line 518
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 522
    .line 523
    .line 524
    invoke-direct {v0}, Ls0/J;->getTEXT_TERTIARY()I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x41a80000    # 21.0f

    .line 532
    .line 533
    invoke-virtual {v8, v7, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v10, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 540
    .line 541
    .line 542
    new-instance v4, Ls0/v;

    .line 543
    .line 544
    invoke-direct {v4, v0, v1}, Ls0/v;-><init>(Ls0/J;I)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v10, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 551
    .line 552
    .line 553
    const-string v4, "\u4e34\u65f6\u89e3\u9664"

    .line 554
    .line 555
    invoke-virtual {v0, v4}, Ls0/J;->u(Ljava/lang/String;)Landroid/widget/TextView;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Ls0/J;->q()Landroid/widget/LinearLayout;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    new-instance v5, Landroid/widget/LinearLayout;

    .line 567
    .line 568
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 573
    .line 574
    .line 575
    new-instance v8, LN0/l;

    .line 576
    .line 577
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 578
    .line 579
    .line 580
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 581
    .line 582
    const/4 v12, -0x1

    .line 583
    invoke-direct {v10, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 593
    .line 594
    .line 595
    new-instance v10, Landroid/widget/FrameLayout;

    .line 596
    .line 597
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 598
    .line 599
    .line 600
    move-result-object v13

    .line 601
    invoke-direct {v10, v13}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 602
    .line 603
    .line 604
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 605
    .line 606
    invoke-direct {v13, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 610
    .line 611
    .line 612
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 613
    .line 614
    .line 615
    move-result v12

    .line 616
    invoke-virtual {v10, v12}, Landroid/view/View;->setMinimumHeight(I)V

    .line 617
    .line 618
    .line 619
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 620
    .line 621
    .line 622
    move-result v12

    .line 623
    invoke-static {v2}, LB0/a;->b(I)I

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 628
    .line 629
    .line 630
    move-result v14

    .line 631
    invoke-static {v2}, LB0/a;->b(I)I

    .line 632
    .line 633
    .line 634
    move-result v15

    .line 635
    invoke-virtual {v10, v12, v13, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 636
    .line 637
    .line 638
    const-string v12, "\u5bc6\u53cb\u5feb\u6377\u663e\u793a"

    .line 639
    .line 640
    invoke-static {v12}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v13

    .line 644
    invoke-virtual {v0, v12}, Ls0/J;->y(Ljava/lang/String;)I

    .line 645
    .line 646
    .line 647
    move-result v14

    .line 648
    const/16 v15, 0x1c

    .line 649
    .line 650
    move/from16 v16, v1

    .line 651
    .line 652
    invoke-static {v15}, LB0/a;->b(I)I

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    invoke-virtual {v0, v13, v14, v1}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 661
    .line 662
    invoke-static {v15}, LB0/a;->b(I)I

    .line 663
    .line 664
    .line 665
    move-result v14

    .line 666
    move/from16 v20, v2

    .line 667
    .line 668
    invoke-static {v15}, LB0/a;->b(I)I

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    invoke-direct {v13, v14, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 673
    .line 674
    .line 675
    const v2, 0x800013

    .line 676
    .line 677
    .line 678
    iput v2, v13, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 679
    .line 680
    invoke-virtual {v1, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 684
    .line 685
    .line 686
    new-instance v1, Landroid/widget/LinearLayout;

    .line 687
    .line 688
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 693
    .line 694
    .line 695
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 696
    .line 697
    const/4 v13, -0x1

    .line 698
    invoke-direct {v2, v13, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 699
    .line 700
    .line 701
    const/16 v13, 0x10

    .line 702
    .line 703
    iput v13, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 704
    .line 705
    const/16 v13, 0x28

    .line 706
    .line 707
    invoke-static {v13}, LB0/a;->b(I)I

    .line 708
    .line 709
    .line 710
    move-result v14

    .line 711
    invoke-virtual {v2, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 712
    .line 713
    .line 714
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 715
    .line 716
    .line 717
    move-result v14

    .line 718
    invoke-virtual {v2, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 725
    .line 726
    .line 727
    new-instance v2, Landroid/widget/LinearLayout;

    .line 728
    .line 729
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 730
    .line 731
    .line 732
    move-result-object v14

    .line 733
    invoke-direct {v2, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 734
    .line 735
    .line 736
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 737
    .line 738
    move/from16 v21, v13

    .line 739
    .line 740
    const/4 v13, -0x1

    .line 741
    invoke-direct {v14, v13, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v2, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 748
    .line 749
    .line 750
    const/16 v13, 0x10

    .line 751
    .line 752
    invoke-virtual {v2, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 753
    .line 754
    .line 755
    new-instance v13, Landroid/widget/TextView;

    .line 756
    .line 757
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 758
    .line 759
    .line 760
    move-result-object v14

    .line 761
    invoke-direct {v13, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 762
    .line 763
    .line 764
    invoke-static {v6, v6, v13, v12}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 768
    .line 769
    .line 770
    move-result v12

    .line 771
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 775
    .line 776
    .line 777
    const v12, 0x416ccccd    # 14.8f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v13, v7, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0}, Ls0/J;->v()Landroid/widget/ImageView;

    .line 787
    .line 788
    .line 789
    move-result-object v13

    .line 790
    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 794
    .line 795
    .line 796
    new-instance v2, Landroid/widget/TextView;

    .line 797
    .line 798
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 799
    .line 800
    .line 801
    move-result-object v13

    .line 802
    invoke-direct {v2, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 803
    .line 804
    .line 805
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 806
    .line 807
    const/4 v14, -0x1

    .line 808
    invoke-direct {v13, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 809
    .line 810
    .line 811
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 812
    .line 813
    .line 814
    move-result v14

    .line 815
    iput v14, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 816
    .line 817
    invoke-virtual {v2, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0}, Ls0/J;->I()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v13

    .line 824
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 825
    .line 826
    .line 827
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 828
    .line 829
    .line 830
    move-result v13

    .line 831
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 832
    .line 833
    .line 834
    const/high16 v13, 0x41380000    # 11.5f

    .line 835
    .line 836
    invoke-virtual {v2, v7, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 837
    .line 838
    .line 839
    iput-object v2, v8, LN0/l;->a:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 842
    .line 843
    .line 844
    new-instance v2, Lr0/F1;

    .line 845
    .line 846
    const/4 v14, 0x7

    .line 847
    invoke-direct {v2, v0, v8, v14}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 854
    .line 855
    .line 856
    new-instance v1, Landroid/widget/Switch;

    .line 857
    .line 858
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-direct {v1, v2}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 863
    .line 864
    .line 865
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 866
    .line 867
    invoke-direct {v2, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 868
    .line 869
    .line 870
    const v14, 0x800015

    .line 871
    .line 872
    .line 873
    iput v14, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 874
    .line 875
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 876
    .line 877
    .line 878
    iget-object v2, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 879
    .line 880
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/OptionData;->getCloseFriendQuickDisplay()Z

    .line 881
    .line 882
    .line 883
    move-result v14

    .line 884
    invoke-virtual {v1, v14}, Landroid/widget/Switch;->setChecked(Z)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v0, v1}, Ls0/J;->T(Landroid/widget/Switch;)V

    .line 888
    .line 889
    .line 890
    new-instance v14, Ls0/A;

    .line 891
    .line 892
    invoke-direct {v14, v8, v0}, Ls0/A;-><init>(LN0/l;Ls0/J;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v1, v14}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 902
    .line 903
    .line 904
    new-instance v1, Landroid/view/View;

    .line 905
    .line 906
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 907
    .line 908
    .line 909
    move-result-object v8

    .line 910
    invoke-direct {v1, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 911
    .line 912
    .line 913
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 914
    .line 915
    invoke-static {v7}, LB0/a;->b(I)I

    .line 916
    .line 917
    .line 918
    move-result v10

    .line 919
    const/4 v14, -0x1

    .line 920
    invoke-direct {v8, v14, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v1, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 924
    .line 925
    .line 926
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 927
    .line 928
    .line 929
    move-result v8

    .line 930
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 937
    .line 938
    .line 939
    new-instance v1, Landroid/widget/LinearLayout;

    .line 940
    .line 941
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 942
    .line 943
    .line 944
    move-result-object v5

    .line 945
    invoke-direct {v1, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 946
    .line 947
    .line 948
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 949
    .line 950
    const/4 v14, -0x1

    .line 951
    invoke-direct {v5, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 958
    .line 959
    .line 960
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 961
    .line 962
    .line 963
    move-result v5

    .line 964
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 965
    .line 966
    .line 967
    move-result v8

    .line 968
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 969
    .line 970
    .line 971
    move-result v10

    .line 972
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 973
    .line 974
    .line 975
    move-result v14

    .line 976
    invoke-virtual {v1, v5, v8, v10, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 980
    .line 981
    .line 982
    new-instance v5, Landroid/widget/LinearLayout;

    .line 983
    .line 984
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 985
    .line 986
    .line 987
    move-result-object v8

    .line 988
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 989
    .line 990
    .line 991
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 992
    .line 993
    const/4 v14, -0x1

    .line 994
    invoke-direct {v8, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 998
    .line 999
    .line 1000
    const/16 v8, 0x10

    .line 1001
    .line 1002
    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1006
    .line 1007
    .line 1008
    const-string v8, "\u89e3\u9664\u5bc6\u7801"

    .line 1009
    .line 1010
    invoke-static {v8}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v10

    .line 1014
    invoke-virtual {v0, v8}, Ls0/J;->y(Ljava/lang/String;)I

    .line 1015
    .line 1016
    .line 1017
    move-result v14

    .line 1018
    move/from16 v20, v15

    .line 1019
    .line 1020
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 1021
    .line 1022
    .line 1023
    move-result v15

    .line 1024
    invoke-virtual {v0, v10, v14, v15}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v10

    .line 1028
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 1029
    .line 1030
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 1031
    .line 1032
    .line 1033
    move-result v15

    .line 1034
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v13

    .line 1038
    invoke-direct {v14, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1039
    .line 1040
    .line 1041
    move/from16 v13, v23

    .line 1042
    .line 1043
    iput v13, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1044
    .line 1045
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v13

    .line 1049
    invoke-virtual {v14, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1056
    .line 1057
    .line 1058
    new-instance v10, Landroid/widget/LinearLayout;

    .line 1059
    .line 1060
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v13

    .line 1064
    invoke-direct {v10, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 1068
    .line 1069
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1070
    .line 1071
    invoke-direct {v13, v9, v6, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v10, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1078
    .line 1079
    .line 1080
    new-instance v13, Landroid/widget/TextView;

    .line 1081
    .line 1082
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v14

    .line 1086
    invoke-direct {v13, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1087
    .line 1088
    .line 1089
    const/4 v14, -0x1

    .line 1090
    invoke-static {v14, v6, v13, v8}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 1094
    .line 1095
    .line 1096
    move-result v8

    .line 1097
    invoke-virtual {v13, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v13, v7, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1107
    .line 1108
    .line 1109
    new-instance v8, Landroid/widget/TextView;

    .line 1110
    .line 1111
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v11

    .line 1115
    invoke-direct {v8, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1116
    .line 1117
    .line 1118
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1119
    .line 1120
    invoke-direct {v11, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1121
    .line 1122
    .line 1123
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 1124
    .line 1125
    .line 1126
    move-result v6

    .line 1127
    iput v6, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1128
    .line 1129
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1130
    .line 1131
    .line 1132
    const-string v6, "\u4e3a\u7a7a\u65f6\u4e0d\u9a8c\u8bc1\u5bc6\u7801\uff0c\u76f4\u63a5\u4e34\u65f6\u89e3\u9664\u9690\u85cf"

    .line 1133
    .line 1134
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1135
    .line 1136
    .line 1137
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 1138
    .line 1139
    .line 1140
    move-result v6

    .line 1141
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1142
    .line 1143
    .line 1144
    const/high16 v6, 0x41380000    # 11.5f

    .line 1145
    .line 1146
    invoke-virtual {v8, v7, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v10, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/OptionData;->getTripleTapPassword()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v2

    .line 1162
    invoke-virtual {v0, v2}, Ls0/J;->t(Ljava/lang/String;)Landroid/widget/EditText;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1167
    .line 1168
    const/16 v6, 0x26

    .line 1169
    .line 1170
    invoke-static {v6}, LB0/a;->b(I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v6

    .line 1174
    const/4 v14, -0x1

    .line 1175
    invoke-direct {v5, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1176
    .line 1177
    .line 1178
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 1179
    .line 1180
    .line 1181
    move-result v6

    .line 1182
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1183
    .line 1184
    .line 1185
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 1186
    .line 1187
    .line 1188
    move-result v6

    .line 1189
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1190
    .line 1191
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1192
    .line 1193
    .line 1194
    iput-object v2, v0, Ls0/J;->j:Landroid/widget/EditText;

    .line 1195
    .line 1196
    const-string v5, "\u7559\u7a7a\u76f4\u63a5\u89e3\u9664"

    .line 1197
    .line 1198
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setInputType(I)V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1211
    .line 1212
    .line 1213
    const-string v1, "\u529f\u80fd\u5f00\u5173"

    .line 1214
    .line 1215
    invoke-virtual {v0, v1}, Ls0/J;->u(Ljava/lang/String;)Landroid/widget/TextView;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v1

    .line 1219
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v0}, Ls0/J;->q()Landroid/widget/LinearLayout;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    const-string v2, "\u5feb\u6377\u529f\u80fd"

    .line 1227
    .line 1228
    const-string v4, "\u5feb\u6377\u52a0\u5165\u540d\u5355\u3001\u804a\u5929\u9875\u9762\u8f93\u5165\u6846\u53e3\u4ee4\u76d1\u542c"

    .line 1229
    .line 1230
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v2

    .line 1234
    new-instance v4, Ls0/v;

    .line 1235
    .line 1236
    const/4 v5, 0x4

    .line 1237
    invoke-direct {v4, v0, v5}, Ls0/v;-><init>(Ls0/J;I)V

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1244
    .line 1245
    .line 1246
    const-string v2, "\u5bc6\u53cb\u529f\u80fd"

    .line 1247
    .line 1248
    const-string v4, "\u9690\u85cf\u5bc6\u53cb\u3001\u901a\u8baf\u5f55\u3001\u804a\u5929\u8bb0\u5f55\u3001\u5b58\u50a8\u7a7a\u95f4\u548c\u8bed\u97f3/\u89c6\u9891\u901a\u8bdd"

    .line 1249
    .line 1250
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v2

    .line 1254
    new-instance v4, Ls0/v;

    .line 1255
    .line 1256
    const/4 v5, 0x5

    .line 1257
    invoke-direct {v4, v0, v5}, Ls0/v;-><init>(Ls0/J;I)V

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1264
    .line 1265
    .line 1266
    const-string v2, "\u641c\u7d22\u9690\u85cf"

    .line 1267
    .line 1268
    const-string v4, "\u4e3b\u9875\u641c\u7d22\u9690\u85cf\u3001\u5355\u804a\u641c\u7d22\u9690\u85cf"

    .line 1269
    .line 1270
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    new-instance v4, Ls0/v;

    .line 1275
    .line 1276
    const/4 v5, 0x6

    .line 1277
    invoke-direct {v4, v0, v5}, Ls0/v;-><init>(Ls0/J;I)V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1284
    .line 1285
    .line 1286
    const-string v2, "\u670b\u53cb\u5708\u9690\u85cf"

    .line 1287
    .line 1288
    const-string v4, "\u9690\u85cf\u5bc6\u53cb\u670b\u53cb\u5708\u3001\u5206\u7ec4\u56fe\u6807\u3001\u70b9\u8d5e\u548c\u8bc4\u8bba"

    .line 1289
    .line 1290
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v2

    .line 1294
    new-instance v4, Ls0/w;

    .line 1295
    .line 1296
    invoke-direct {v4, v0, v2, v7}, Ls0/w;-><init>(Ls0/J;Landroid/widget/FrameLayout;I)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1303
    .line 1304
    .line 1305
    const-string v2, "\u6d88\u606f\u63d0\u9192"

    .line 1306
    .line 1307
    const-string v4, "\u9690\u85cf\u6d88\u606f\u89d2\u6807\u3001\u5bc6\u53cb\u6d88\u606f\u9707\u52a8\u548c\u9876\u90e8\u52a0\u7c97"

    .line 1308
    .line 1309
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v2

    .line 1313
    new-instance v4, Ls0/v;

    .line 1314
    .line 1315
    invoke-direct {v4, v0, v9}, Ls0/v;-><init>(Ls0/J;I)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1322
    .line 1323
    .line 1324
    const-string v2, "\u5b9e\u9a8c\u5ba4"

    .line 1325
    .line 1326
    const-string v4, "\u9632\u64a4\u56de\u7b49\u5b9e\u9a8c\u6027\u529f\u80fd"

    .line 1327
    .line 1328
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    new-instance v4, Ls0/v;

    .line 1333
    .line 1334
    invoke-direct {v4, v0, v7}, Ls0/v;-><init>(Ls0/J;I)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1344
    .line 1345
    .line 1346
    const-string v1, "\u6570\u636e\u7ba1\u7406"

    .line 1347
    .line 1348
    invoke-virtual {v0, v1}, Ls0/J;->u(Ljava/lang/String;)Landroid/widget/TextView;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v0}, Ls0/J;->q()Landroid/widget/LinearLayout;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    const-string v2, "\u6e05\u7a7a\u914d\u7f6e\u6570\u636e"

    .line 1360
    .line 1361
    const-string v4, "\u6e05\u9664\u5168\u90e8\u914d\u7f6e\u5e76\u9000\u51fa\u5f53\u524d\u8bbe\u7f6e\u9875"

    .line 1362
    .line 1363
    invoke-virtual {v0, v2, v4}, Ls0/J;->s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    new-instance v4, Ls0/w;

    .line 1368
    .line 1369
    invoke-direct {v4, v0, v2, v9}, Ls0/w;-><init>(Ls0/J;Landroid/widget/FrameLayout;I)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1379
    .line 1380
    .line 1381
    return-object v3
.end method

.method private final getDIVIDER_COLOR()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->i:I

    .line 6
    .line 7
    return v0
.end method

.method private final getFIELD_BG_COLOR()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->e:I

    .line 6
    .line 7
    return v0
.end method

.method private final getHEADER_COLOR()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->b:I

    .line 6
    .line 7
    return v0
.end method

.method private final getPAGE_BG_COLOR()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->c:I

    .line 6
    .line 7
    return v0
.end method

.method private final getTEXT_PRIMARY()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->f:I

    .line 6
    .line 7
    return v0
.end method

.method private final getTEXT_SECONDARY()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->g:I

    .line 6
    .line 7
    return v0
.end method

.method private final getTEXT_TERTIARY()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ls0/K;->h:I

    .line 6
    .line 7
    return v0
.end method

.method private final getThemeMode()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "mask_manager_ui_theme"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "theme_mode"

    .line 18
    .line 19
    const-string v2, "light"

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v0

    .line 29
    :goto_0
    return-object v2
.end method

.method private final getThemePalette()Ls0/K;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lb1/h;->J(Landroid/content/Context;)Ls0/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method private final getTitleBar()Landroid/view/View;
    .locals 12

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 11
    .line 12
    const/16 v2, 0x30

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ls0/J;->getHEADER_COLOR()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 42
    .line 43
    const/16 v4, 0x34

    .line 44
    .line 45
    invoke-static {v4}, LB0/a;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-direct {v2, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    const v5, 0x800003

    .line 53
    .line 54
    .line 55
    iput v5, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 56
    .line 57
    const/4 v5, 0x4

    .line 58
    invoke-static {v5}, LB0/a;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    const/16 v2, 0x11

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    const/high16 v7, 0x41a80000    # 21.0f

    .line 82
    .line 83
    invoke-virtual {v1, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 84
    .line 85
    .line 86
    const-string v7, "\u2039"

    .line 87
    .line 88
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    new-instance v7, Ls0/v;

    .line 92
    .line 93
    const/4 v8, 0x2

    .line 94
    invoke-direct {v7, p0, v8}, Ls0/v;-><init>(Ls0/J;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-direct {v1, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 113
    .line 114
    const/4 v8, -0x2

    .line 115
    invoke-direct {v7, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 116
    .line 117
    .line 118
    iput v2, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 119
    .line 120
    invoke-virtual {v1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 124
    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0}, Ls0/J;->getACCENT_TEAL()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    const/16 v9, 0x12

    .line 135
    .line 136
    invoke-static {v9}, LB0/a;->b(I)I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    const-string v11, "\u2713"

    .line 141
    .line 142
    invoke-virtual {p0, v11, v7, v10}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 147
    .line 148
    invoke-static {v9}, LB0/a;->b(I)I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    invoke-static {v9}, LB0/a;->b(I)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-direct {v10, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 157
    .line 158
    .line 159
    const/16 v9, 0x10

    .line 160
    .line 161
    iput v9, v10, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 162
    .line 163
    const/4 v9, 0x6

    .line 164
    invoke-static {v9}, LB0/a;->b(I)I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    new-instance v7, Landroid/widget/TextView;

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-direct {v7, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 184
    .line 185
    .line 186
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 187
    .line 188
    invoke-direct {v9, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 199
    .line 200
    .line 201
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 202
    .line 203
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 204
    .line 205
    .line 206
    const/high16 v8, 0x41940000    # 18.5f

    .line 207
    .line 208
    invoke-virtual {v7, v6, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 209
    .line 210
    .line 211
    const-string v8, "InkHide"

    .line 212
    .line 213
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    new-instance v1, Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-direct {v1, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 232
    .line 233
    invoke-static {v4}, LB0/a;->b(I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    invoke-direct {v7, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 238
    .line 239
    .line 240
    const v3, 0x800005

    .line 241
    .line 242
    .line 243
    iput v3, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 244
    .line 245
    invoke-static {v5}, LB0/a;->b(I)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 256
    .line 257
    .line 258
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 263
    .line 264
    .line 265
    const/high16 v2, 0x41980000    # 19.0f

    .line 266
    .line 267
    invoke-virtual {v1, v6, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 268
    .line 269
    .line 270
    const-string v2, "\u22ee"

    .line 271
    .line 272
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    .line 274
    .line 275
    new-instance v2, Lr0/F1;

    .line 276
    .line 277
    const/4 v3, 0x6

    .line 278
    invoke-direct {v2, p0, v1, v3}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 285
    .line 286
    .line 287
    return-object v0
.end method

.method public static k(Ls0/J;Lt0/c;)V
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object v1, p0, Ls0/J;->n:Ljava/lang/Integer;

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Ls0/J;->n:Ljava/lang/Integer;

    .line 37
    .line 38
    :cond_2
    iget-object v1, p0, Ls0/J;->m:Ljava/lang/Integer;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/Window;->getStatusBarColor()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Ls0/J;->m:Ljava/lang/Integer;

    .line 51
    .line 52
    :cond_3
    invoke-direct {p0}, Ls0/J;->getThemePalette()Ls0/K;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-boolean v1, v1, Ls0/K;->a:Z

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    or-int/lit16 v1, v2, 0x2000

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    and-int/lit16 v1, v2, -0x2001

    .line 76
    .line 77
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0}, Ls0/J;->getHEADER_COLOR()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 85
    .line 86
    .line 87
    :goto_1
    new-instance p1, Landroid/os/Handler;

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroidx/activity/b;

    .line 97
    .line 98
    const/16 v1, 0x9

    .line 99
    .line 100
    invoke-direct {v0, v1, p0}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const-wide/16 v1, 0x15e

    .line 104
    .line 105
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static l(LN0/l;Ls0/J;)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, LN0/l;->a:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    check-cast v1, Landroid/widget/PopupWindow;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 13
    .line 14
    .line 15
    new-instance v1, LE0/g;

    .line 16
    .line 17
    const-string v3, "\u6d45\u8272"

    .line 18
    .line 19
    const-string v4, "\u767d\u5e95\u9ed1\u5b57\uff0c\u4fdd\u6301\u5f53\u524d\u9ed8\u8ba4\u6837\u5f0f"

    .line 20
    .line 21
    const-string v5, "light"

    .line 22
    .line 23
    invoke-direct {v1, v3, v4, v5}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, LE0/g;

    .line 27
    .line 28
    const-string v4, "\u6df1\u8272"

    .line 29
    .line 30
    const-string v5, "\u6df1\u8272\u80cc\u666f\uff0c\u964d\u4f4e\u591c\u95f4\u4f7f\u7528\u4eae\u5ea6"

    .line 31
    .line 32
    const-string v6, "dark"

    .line 33
    .line 34
    invoke-direct {v3, v4, v5, v6}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, LE0/g;

    .line 38
    .line 39
    const-string v5, "\u8ddf\u968f\u7cfb\u7edf"

    .line 40
    .line 41
    const-string v6, "\u6839\u636e\u624b\u673a\u7cfb\u7edf\u6df1\u6d45\u8272\u81ea\u52a8\u5207\u6362"

    .line 42
    .line 43
    const-string v7, "system"

    .line 44
    .line 45
    invoke-direct {v4, v5, v6, v7}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    filled-new-array {v1, v3, v4}, [LE0/g;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {v0}, Ls0/J;->getThemeMode()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v4, LN0/l;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v5, Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 75
    .line 76
    const/4 v7, -0x1

    .line 77
    const/4 v8, -0x2

    .line 78
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 86
    .line 87
    .line 88
    const/16 v9, 0x12

    .line 89
    .line 90
    invoke-static {v9}, LB0/a;->b(I)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    invoke-static {v9}, LB0/a;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    invoke-static {v9}, LB0/a;->b(I)I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    const/16 v12, 0xe

    .line 103
    .line 104
    invoke-static {v12}, LB0/a;->b(I)I

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    invoke-virtual {v5, v10, v11, v9, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    const/16 v10, 0x14

    .line 116
    .line 117
    invoke-static {v10}, LB0/a;->b(I)I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    const/16 v11, 0x8

    .line 122
    .line 123
    invoke-static {v0, v9, v10, v2, v11}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    new-instance v9, Landroid/widget/LinearLayout;

    .line 131
    .line 132
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-direct {v9, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 140
    .line 141
    invoke-direct {v10, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    .line 146
    .line 147
    const/16 v10, 0x10

    .line 148
    .line 149
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 150
    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v0}, Ls0/J;->getACCENT_PURPLE()I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    const/16 v15, 0x22

    .line 161
    .line 162
    move-object/from16 p0, v2

    .line 163
    .line 164
    invoke-static {v15}, LB0/a;->b(I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    move/from16 v16, v11

    .line 169
    .line 170
    const-string v11, "\u25d0"

    .line 171
    .line 172
    invoke-virtual {v0, v11, v14, v2}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 177
    .line 178
    move/from16 v17, v12

    .line 179
    .line 180
    invoke-static {v15}, LB0/a;->b(I)I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    invoke-static {v15}, LB0/a;->b(I)I

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    invoke-direct {v14, v12, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 189
    .line 190
    .line 191
    const/16 v12, 0xa

    .line 192
    .line 193
    invoke-static {v12}, LB0/a;->b(I)I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 204
    .line 205
    .line 206
    new-instance v2, Landroid/widget/LinearLayout;

    .line 207
    .line 208
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    invoke-direct {v2, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 216
    .line 217
    const/high16 v15, 0x3f800000    # 1.0f

    .line 218
    .line 219
    invoke-direct {v14, v13, v8, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 226
    .line 227
    .line 228
    new-instance v14, Landroid/widget/TextView;

    .line 229
    .line 230
    move/from16 v18, v12

    .line 231
    .line 232
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    invoke-direct {v14, v12}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    const-string v12, "\u754c\u9762\u4e3b\u9898"

    .line 240
    .line 241
    invoke-static {v7, v8, v14, v12}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 249
    .line 250
    .line 251
    sget-object v12, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 252
    .line 253
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 254
    .line 255
    .line 256
    const/high16 v12, 0x41880000    # 17.0f

    .line 257
    .line 258
    invoke-virtual {v14, v6, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 262
    .line 263
    .line 264
    new-instance v12, Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object v14

    .line 270
    invoke-direct {v12, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 271
    .line 272
    .line 273
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 274
    .line 275
    invoke-direct {v14, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 276
    .line 277
    .line 278
    const/16 v19, 0x4

    .line 279
    .line 280
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 285
    .line 286
    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 287
    .line 288
    .line 289
    const-string v14, "\u53ea\u5f71\u54cd\u914d\u7f6e\u9875\u9762\u663e\u793a\uff0c\u4e0d\u5f71\u54cd\u5fae\u4fe1\u9690\u85cf\u529f\u80fd"

    .line 290
    .line 291
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 299
    .line 300
    .line 301
    const/high16 v14, 0x41380000    # 11.5f

    .line 302
    .line 303
    invoke-virtual {v12, v6, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 313
    .line 314
    .line 315
    new-instance v2, Landroid/view/View;

    .line 316
    .line 317
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    invoke-direct {v2, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 322
    .line 323
    .line 324
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 325
    .line 326
    invoke-static {v6}, LB0/a;->b(I)I

    .line 327
    .line 328
    .line 329
    move-result v12

    .line 330
    invoke-direct {v9, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 331
    .line 332
    .line 333
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 338
    .line 339
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    iput v12, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 344
    .line 345
    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    .line 347
    .line 348
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    invoke-virtual {v2, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-eqz v2, :cond_4

    .line 367
    .line 368
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    check-cast v2, LE0/g;

    .line 373
    .line 374
    iget-object v12, v2, LE0/g;->a:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v12, Ljava/lang/String;

    .line 377
    .line 378
    iget-object v14, v2, LE0/g;->b:Ljava/lang/String;

    .line 379
    .line 380
    iget-object v2, v2, LE0/g;->c:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v15

    .line 386
    const/16 v19, 0xc

    .line 387
    .line 388
    new-instance v9, Landroid/widget/LinearLayout;

    .line 389
    .line 390
    move/from16 v20, v6

    .line 391
    .line 392
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-direct {v9, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 397
    .line 398
    .line 399
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 400
    .line 401
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 402
    .line 403
    .line 404
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 409
    .line 410
    invoke-virtual {v9, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 417
    .line 418
    .line 419
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    invoke-virtual {v9, v6, v7, v10, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 436
    .line 437
    .line 438
    if-eqz v15, :cond_0

    .line 439
    .line 440
    invoke-direct {v0}, Ls0/J;->getACCENT_PURPLE()I

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    invoke-static {v6}, Ls0/J;->S(I)I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    invoke-direct {v0}, Ls0/J;->getACCENT_PURPLE()I

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    invoke-static {v6, v7, v8, v10}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    goto :goto_1

    .line 469
    :cond_0
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 478
    .line 479
    .line 480
    move-result v8

    .line 481
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    invoke-static {v6, v7, v8, v10}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    :goto_1
    invoke-virtual {v9, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 494
    .line 495
    .line 496
    if-eqz v15, :cond_1

    .line 497
    .line 498
    const-string v6, "\u2713"

    .line 499
    .line 500
    goto :goto_2

    .line 501
    :cond_1
    move-object v6, v11

    .line 502
    :goto_2
    if-eqz v15, :cond_2

    .line 503
    .line 504
    invoke-direct {v0}, Ls0/J;->getACCENT_PURPLE()I

    .line 505
    .line 506
    .line 507
    move-result v7

    .line 508
    goto :goto_3

    .line 509
    :cond_2
    invoke-direct {v0}, Ls0/J;->getTEXT_TERTIARY()I

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    :goto_3
    const/16 v8, 0x1a

    .line 514
    .line 515
    invoke-static {v8}, LB0/a;->b(I)I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    invoke-virtual {v0, v6, v7, v10}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 524
    .line 525
    invoke-static {v8}, LB0/a;->b(I)I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    invoke-static {v8}, LB0/a;->b(I)I

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    invoke-direct {v7, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 534
    .line 535
    .line 536
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 547
    .line 548
    .line 549
    new-instance v6, Landroid/widget/LinearLayout;

    .line 550
    .line 551
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 552
    .line 553
    .line 554
    move-result-object v7

    .line 555
    invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 556
    .line 557
    .line 558
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 559
    .line 560
    const/4 v8, -0x2

    .line 561
    const/high16 v10, 0x3f800000    # 1.0f

    .line 562
    .line 563
    invoke-direct {v7, v13, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 567
    .line 568
    .line 569
    move/from16 v7, v20

    .line 570
    .line 571
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 572
    .line 573
    .line 574
    new-instance v7, Landroid/widget/TextView;

    .line 575
    .line 576
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 577
    .line 578
    .line 579
    move-result-object v10

    .line 580
    invoke-direct {v7, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 581
    .line 582
    .line 583
    const/4 v10, -0x1

    .line 584
    invoke-static {v10, v8, v7, v14}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    if-eqz v15, :cond_3

    .line 588
    .line 589
    invoke-direct {v0}, Ls0/J;->getACCENT_PURPLE()I

    .line 590
    .line 591
    .line 592
    move-result v8

    .line 593
    goto :goto_4

    .line 594
    :cond_3
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 595
    .line 596
    .line 597
    move-result v8

    .line 598
    :goto_4
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 599
    .line 600
    .line 601
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 602
    .line 603
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 604
    .line 605
    .line 606
    const v8, 0x41633333    # 14.2f

    .line 607
    .line 608
    .line 609
    const/4 v10, 0x1

    .line 610
    invoke-virtual {v7, v10, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 614
    .line 615
    .line 616
    new-instance v7, Landroid/widget/TextView;

    .line 617
    .line 618
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 623
    .line 624
    .line 625
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 626
    .line 627
    const/4 v10, -0x1

    .line 628
    const/4 v14, -0x2

    .line 629
    invoke-direct {v8, v10, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 630
    .line 631
    .line 632
    const/4 v10, 0x3

    .line 633
    invoke-static {v10}, LB0/a;->b(I)I

    .line 634
    .line 635
    .line 636
    move-result v10

    .line 637
    iput v10, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 638
    .line 639
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 643
    .line 644
    .line 645
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 650
    .line 651
    .line 652
    const v2, 0x412ccccd    # 10.8f

    .line 653
    .line 654
    .line 655
    const/4 v10, 0x1

    .line 656
    invoke-virtual {v7, v10, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 663
    .line 664
    .line 665
    new-instance v2, Lr0/L;

    .line 666
    .line 667
    invoke-direct {v2, v12, v3, v0, v4}, Lr0/L;-><init>(Ljava/lang/String;Ljava/lang/String;Ls0/J;LN0/l;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 674
    .line 675
    .line 676
    move v8, v14

    .line 677
    const/4 v6, 0x1

    .line 678
    const/4 v7, -0x1

    .line 679
    const/16 v10, 0x10

    .line 680
    .line 681
    goto/16 :goto_0

    .line 682
    .line 683
    :cond_4
    const/16 v19, 0xc

    .line 684
    .line 685
    new-instance v1, Landroid/widget/TextView;

    .line 686
    .line 687
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 692
    .line 693
    .line 694
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 695
    .line 696
    const/16 v3, 0x28

    .line 697
    .line 698
    invoke-static {v3}, LB0/a;->b(I)I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    const/4 v10, -0x1

    .line 703
    invoke-direct {v2, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 704
    .line 705
    .line 706
    const/4 v3, 0x2

    .line 707
    invoke-static {v3}, LB0/a;->b(I)I

    .line 708
    .line 709
    .line 710
    move-result v3

    .line 711
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 712
    .line 713
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 714
    .line 715
    .line 716
    const/16 v2, 0x11

    .line 717
    .line 718
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 719
    .line 720
    .line 721
    const-string v2, "\u53d6\u6d88"

    .line 722
    .line 723
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 724
    .line 725
    .line 726
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 731
    .line 732
    .line 733
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 734
    .line 735
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 736
    .line 737
    .line 738
    const/high16 v2, 0x41580000    # 13.5f

    .line 739
    .line 740
    const/4 v10, 0x1

    .line 741
    invoke-virtual {v1, v10, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 742
    .line 743
    .line 744
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 753
    .line 754
    .line 755
    move-result v6

    .line 756
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-static {v10}, LB0/a;->b(I)I

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    invoke-static {v2, v3, v6, v7}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 769
    .line 770
    .line 771
    new-instance v2, Ls0/u;

    .line 772
    .line 773
    const/4 v3, 0x4

    .line 774
    invoke-direct {v2, v4, v3}, Ls0/u;-><init>(LN0/l;I)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 781
    .line 782
    .line 783
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 784
    .line 785
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    iput-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    .line 801
    .line 802
    const-string v2, "dialog"

    .line 803
    .line 804
    if-eqz v1, :cond_6

    .line 805
    .line 806
    new-instance v3, Ls0/r;

    .line 807
    .line 808
    const/4 v5, 0x5

    .line 809
    invoke-direct {v3, v4, v5}, Ls0/r;-><init>(LN0/l;I)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 813
    .line 814
    .line 815
    iget-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    .line 816
    .line 817
    if-eqz v1, :cond_5

    .line 818
    .line 819
    check-cast v1, Landroid/app/AlertDialog;

    .line 820
    .line 821
    const/4 v10, 0x1

    .line 822
    invoke-virtual {v0, v1, v10}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 823
    .line 824
    .line 825
    return-void

    .line 826
    :cond_5
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    throw p0

    .line 830
    :cond_6
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    throw p0

    .line 834
    :cond_7
    move-object/from16 p0, v2

    .line 835
    .line 836
    const-string v0, "popupWindow"

    .line 837
    .line 838
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    throw p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Ls0/J;LN0/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_2

    .line 6
    .line 7
    invoke-direct {p2, p0}, Ls0/J;->setThemeMode(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "dark"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string p0, "\u6df1\u8272"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p1, "system"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const-string p0, "\u8ddf\u968f\u7cfb\u7edf"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string p0, "\u6d45\u8272"

    .line 33
    .line 34
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p2, "\u5df2\u5207\u6362\u4e3a"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, "\u4e3b\u9898\uff0c\u91cd\u65b0\u6253\u5f00\u914d\u7f6e\u9875\u540e\u751f\u6548"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object p0, p3, LN0/l;->a:Ljava/lang/Object;

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    check-cast p0, Landroid/app/AlertDialog;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    const-string p0, "dialog"

    .line 67
    .line 68
    invoke-static {p0}, LN0/g;->g(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0
.end method

.method public static n(ZLs0/J;Lz0/b;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const-string v5, "app"

    .line 14
    .line 15
    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-object v5, v0, Ls0/J;->h:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-boolean v4, v1, Lz0/b;->a:Z

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const-string v5, "\u8f6f\u4ef6\u516c\u544a"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string v5, "\u670d\u52a1\u63d0\u793a"

    .line 40
    .line 41
    :goto_0
    iget-object v6, v1, Lz0/b;->b:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_7

    .line 50
    .line 51
    const-string v6, "\u670d\u52a1\u6682\u4e0d\u53ef\u7528"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-string v4, "\u6682\u65e0\u516c\u544a"

    .line 55
    .line 56
    iget-object v7, v1, Lz0/b;->l:Ljava/lang/Throwable;

    .line 57
    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    iget-boolean v1, v1, Lz0/b;->k:Z

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    move-object v6, v4

    .line 74
    :cond_3
    const-string v1, "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25\uff0c\u5df2\u4f7f\u7528\u672c\u5730\u7f13\u5b58\u3002\n\n"

    .line 75
    .line 76
    invoke-virtual {v1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    if-eqz v7, :cond_6

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_5
    const-string v4, "\u8f6f\u4ef6\u516c\u544a\u83b7\u53d6\u5931\u8d25\uff1a"

    .line 98
    .line 99
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    goto :goto_1

    .line 104
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    move-object v6, v4

    .line 114
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v1, LN0/l;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance v4, Landroid/widget/LinearLayout;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-direct {v4, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 132
    .line 133
    const/4 v8, -0x1

    .line 134
    const/4 v9, -0x2

    .line 135
    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 142
    .line 143
    .line 144
    const/16 v7, 0x12

    .line 145
    .line 146
    invoke-static {v7}, LB0/a;->b(I)I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-static {v7}, LB0/a;->b(I)I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    invoke-static {v7}, LB0/a;->b(I)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    const/16 v12, 0xe

    .line 159
    .line 160
    invoke-static {v12}, LB0/a;->b(I)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-virtual {v4, v10, v11, v7, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    const/16 v10, 0x14

    .line 172
    .line 173
    invoke-static {v10}, LB0/a;->b(I)I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    const/4 v11, 0x0

    .line 178
    const/16 v13, 0x8

    .line 179
    .line 180
    invoke-static {v0, v7, v10, v11, v13}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 185
    .line 186
    .line 187
    new-instance v7, Landroid/widget/LinearLayout;

    .line 188
    .line 189
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-direct {v7, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 194
    .line 195
    .line 196
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 197
    .line 198
    invoke-direct {v10, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    .line 203
    .line 204
    const/16 v10, 0x10

    .line 205
    .line 206
    invoke-virtual {v7, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v0}, Ls0/J;->getACCENT_BLUE()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    const/16 v14, 0x22

    .line 217
    .line 218
    invoke-static {v14}, LB0/a;->b(I)I

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    move/from16 p0, v12

    .line 223
    .line 224
    const-string v12, "\u544a"

    .line 225
    .line 226
    invoke-virtual {v0, v12, v10, v15}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 231
    .line 232
    invoke-static {v14}, LB0/a;->b(I)I

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    invoke-static {v14}, LB0/a;->b(I)I

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    invoke-direct {v12, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 241
    .line 242
    .line 243
    const/16 v14, 0xa

    .line 244
    .line 245
    invoke-static {v14}, LB0/a;->b(I)I

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    invoke-virtual {v12, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 256
    .line 257
    .line 258
    new-instance v10, Landroid/widget/LinearLayout;

    .line 259
    .line 260
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-direct {v10, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 268
    .line 269
    const/high16 v15, 0x3f800000    # 1.0f

    .line 270
    .line 271
    invoke-direct {v12, v3, v9, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 278
    .line 279
    .line 280
    new-instance v12, Landroid/widget/TextView;

    .line 281
    .line 282
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v15

    .line 286
    invoke-direct {v12, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v8, v9, v12, v5}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 297
    .line 298
    .line 299
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 300
    .line 301
    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 302
    .line 303
    .line 304
    const/high16 v15, 0x41880000    # 17.0f

    .line 305
    .line 306
    invoke-virtual {v12, v2, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    new-instance v12, Landroid/widget/TextView;

    .line 313
    .line 314
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    invoke-direct {v12, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 319
    .line 320
    .line 321
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 322
    .line 323
    invoke-direct {v15, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 324
    .line 325
    .line 326
    const/16 v16, 0x4

    .line 327
    .line 328
    move/from16 p2, v14

    .line 329
    .line 330
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 335
    .line 336
    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    .line 338
    .line 339
    const-string v14, "\u540e\u53f0\u516c\u544a\u5185\u5bb9\uff0c\u53ef\u590d\u5236\u6587\u5b57\uff0c\u94fe\u63a5\u53ef\u76f4\u63a5\u6253\u5f00"

    .line 340
    .line 341
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 349
    .line 350
    .line 351
    const/high16 v14, 0x41380000    # 11.5f

    .line 352
    .line 353
    invoke-virtual {v12, v2, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 363
    .line 364
    .line 365
    new-instance v7, Landroid/view/View;

    .line 366
    .line 367
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    invoke-direct {v7, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 372
    .line 373
    .line 374
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 375
    .line 376
    invoke-static {v2}, LB0/a;->b(I)I

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    invoke-direct {v10, v8, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 381
    .line 382
    .line 383
    invoke-static/range {p0 .. p0}, LB0/a;->b(I)I

    .line 384
    .line 385
    .line 386
    move-result v12

    .line 387
    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 388
    .line 389
    invoke-static/range {p2 .. p2}, LB0/a;->b(I)I

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 394
    .line 395
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 396
    .line 397
    .line 398
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v6}, Ls0/J;->F(Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 413
    .line 414
    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    invoke-static/range {p0 .. p0}, LB0/a;->b(I)I

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    invoke-static {v2}, LB0/a;->b(I)I

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    invoke-static {v7, v9, v10, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 448
    .line 449
    .line 450
    new-instance v6, Landroid/widget/TextView;

    .line 451
    .line 452
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 457
    .line 458
    .line 459
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 460
    .line 461
    const/16 v9, 0x2a

    .line 462
    .line 463
    invoke-static {v9}, LB0/a;->b(I)I

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 468
    .line 469
    .line 470
    const/16 v9, 0xc

    .line 471
    .line 472
    invoke-static {v9}, LB0/a;->b(I)I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    iput v10, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 477
    .line 478
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 479
    .line 480
    .line 481
    const/16 v7, 0x11

    .line 482
    .line 483
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 484
    .line 485
    .line 486
    const-string v7, "\u6211\u77e5\u9053\u4e86"

    .line 487
    .line 488
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 495
    .line 496
    .line 497
    const/high16 v5, 0x41600000    # 14.0f

    .line 498
    .line 499
    invoke-virtual {v6, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 500
    .line 501
    .line 502
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    invoke-static {v9}, LB0/a;->b(I)I

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    invoke-static {v0, v5, v7, v11, v13}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    invoke-virtual {v6, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 515
    .line 516
    .line 517
    new-instance v5, Ls0/u;

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    invoke-direct {v5, v1, v7}, Ls0/u;-><init>(LN0/l;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v6, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 527
    .line 528
    .line 529
    new-instance v5, Landroid/app/AlertDialog$Builder;

    .line 530
    .line 531
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    invoke-direct {v5, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    iput-object v4, v1, LN0/l;->a:Ljava/lang/Object;

    .line 547
    .line 548
    const-string v5, "dialog"

    .line 549
    .line 550
    if-eqz v4, :cond_b

    .line 551
    .line 552
    invoke-virtual {v4, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 553
    .line 554
    .line 555
    iget-object v4, v1, LN0/l;->a:Ljava/lang/Object;

    .line 556
    .line 557
    if-eqz v4, :cond_a

    .line 558
    .line 559
    check-cast v4, Landroid/app/AlertDialog;

    .line 560
    .line 561
    invoke-virtual {v4, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 562
    .line 563
    .line 564
    iget-object v3, v1, LN0/l;->a:Ljava/lang/Object;

    .line 565
    .line 566
    if-eqz v3, :cond_9

    .line 567
    .line 568
    check-cast v3, Landroid/app/AlertDialog;

    .line 569
    .line 570
    new-instance v4, Ls0/r;

    .line 571
    .line 572
    const/4 v6, 0x1

    .line 573
    invoke-direct {v4, v1, v6}, Ls0/r;-><init>(LN0/l;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 577
    .line 578
    .line 579
    iget-object v1, v1, LN0/l;->a:Ljava/lang/Object;

    .line 580
    .line 581
    if-eqz v1, :cond_8

    .line 582
    .line 583
    check-cast v1, Landroid/app/AlertDialog;

    .line 584
    .line 585
    invoke-virtual {v0, v1, v2}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :cond_8
    invoke-static {v5}, LN0/g;->g(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    throw v11

    .line 593
    :cond_9
    invoke-static {v5}, LN0/g;->g(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    throw v11

    .line 597
    :cond_a
    invoke-static {v5}, LN0/g;->g(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    throw v11

    .line 601
    :cond_b
    invoke-static {v5}, LN0/g;->g(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    throw v11
.end method

.method public static o(Ls0/J;Lz0/b;)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lz0/b;->a:Z

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lz0/b;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const-string v0, "\u670d\u52a1\u6682\u4e0d\u53ef\u7528"

    .line 21
    .line 22
    :cond_0
    move-object v4, v0

    .line 23
    invoke-direct/range {p0 .. p0}, Ls0/J;->getACCENT_ORANGE()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const-string v7, "\u786e\u5b9a"

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const-string v2, "\u670d\u52a1\u63d0\u793a"

    .line 31
    .line 32
    const-string v3, "\u540e\u53f0\u670d\u52a1\u72b6\u6001\u63d0\u9192"

    .line 33
    .line 34
    const-string v5, "!"

    .line 35
    .line 36
    const/4 v9, 0x1

    .line 37
    const/4 v10, 0x0

    .line 38
    move-object/from16 v1, p0

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v10}, Ls0/J;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLo0/b;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {v0}, Lz0/b;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_6

    .line 49
    .line 50
    iget-boolean v1, v0, Lz0/b;->g:Z

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    const-string v2, "\u68c0\u6d4b\u5230\u5fc5\u987b\u66f4\u65b0\u7684\u65b0\u7248\u672c"

    .line 55
    .line 56
    :goto_0
    move-object v13, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-string v2, "\u68c0\u6d4b\u5230\u53ef\u7528\u7684\u65b0\u7248\u672c"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "\u68c0\u67e5\u5230\u65b0\u7248\u672c\uff1a"

    .line 64
    .line 65
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, v0, Lz0/b;->f:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    iget v3, v0, Lz0/b;->e:I

    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v3, "\uff0c\u662f\u5426\u66f4\u65b0\uff1f"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v3, v0, Lz0/b;->h:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    const-string v4, "\n\n"

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    const-string v2, "toString(...)"

    .line 111
    .line 112
    invoke-static {v14, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-direct/range {p0 .. p0}, Ls0/J;->getACCENT_TEAL()I

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    :goto_2
    move-object/from16 v18, v2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    const-string v2, "\u7a0d\u540e\u518d\u8bf4"

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :goto_3
    xor-int/lit8 v19, v1, 0x1

    .line 129
    .line 130
    new-instance v1, Lo0/b;

    .line 131
    .line 132
    const/16 v2, 0x8

    .line 133
    .line 134
    move-object/from16 v11, p0

    .line 135
    .line 136
    invoke-direct {v1, v11, v0, v2}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    const-string v12, "\u66f4\u65b0\u63d0\u793a"

    .line 140
    .line 141
    const-string v15, "\u2191"

    .line 142
    .line 143
    const-string v17, "\u7acb\u5373\u66f4\u65b0"

    .line 144
    .line 145
    move-object/from16 v20, v1

    .line 146
    .line 147
    invoke-virtual/range {v11 .. v20}, Ls0/J;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLo0/b;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_6
    iget-object v0, v0, Lz0/b;->l:Ljava/lang/Throwable;

    .line 152
    .line 153
    if-nez v0, :cond_7

    .line 154
    .line 155
    const-string v0, "\u672a\u68c0\u67e5\u5230\u65b0\u7248\u672c"

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    const-string v0, "\u68c0\u67e5\u66f4\u65b0\u5931\u8d25"

    .line 159
    .line 160
    :goto_4
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static p(Ls0/J;Landroid/widget/TextView;)V
    .locals 14

    .line 1
    const/16 v0, 0xbe

    .line 2
    .line 3
    invoke-static {v0}, LB0/a;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, LN0/l;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroid/widget/LinearLayout;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v4, -0x2

    .line 24
    invoke-direct {v3, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    .line 33
    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    invoke-static {v5}, LB0/a;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-static {v5}, LB0/a;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-static {v5}, LB0/a;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-static {v5}, LB0/a;->b(I)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {v2, v6, v7, v8, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Ls0/J;->getCARD_COLOR()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const/16 v6, 0x10

    .line 60
    .line 61
    invoke-static {v6}, LB0/a;->b(I)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v3}, LB0/a;->b(I)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-static {v5, v6, v7, v8}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 82
    .line 83
    .line 84
    const/high16 v5, 0x40c00000    # 6.0f

    .line 85
    .line 86
    invoke-static {v5}, LB0/a;->a(F)F

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v2, v6}, Landroid/view/View;->setElevation(F)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Ls0/J;->getACCENT_BLUE()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    new-instance v12, Ls0/B;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-direct {v12, v6, v1, p0}, Ls0/B;-><init>(ILN0/l;Ls0/J;)V

    .line 101
    .line 102
    .line 103
    const-string v8, "\u8f6f\u4ef6\u516c\u544a"

    .line 104
    .line 105
    const-string v9, "\u67e5\u770b\u540e\u53f0\u516c\u544a\u5185\u5bb9"

    .line 106
    .line 107
    const-string v10, "\u544a"

    .line 108
    .line 109
    move-object v7, p0

    .line 110
    invoke-virtual/range {v7 .. v12}, Ls0/J;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILM0/a;)Landroid/widget/LinearLayout;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    move-object v6, v7

    .line 115
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Landroid/view/View;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-direct {p0, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 128
    .line 129
    invoke-static {v3}, LB0/a;->b(I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    const/4 v12, -0x1

    .line 134
    invoke-direct {v7, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    .line 136
    .line 137
    const/4 v13, 0x6

    .line 138
    invoke-static {v13}, LB0/a;->b(I)I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 143
    .line 144
    invoke-static {v13}, LB0/a;->b(I)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 149
    .line 150
    invoke-virtual {p0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v6}, Ls0/J;->getDIVIDER_COLOR()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-virtual {p0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v6}, Ls0/J;->getACCENT_TEAL()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    new-instance v11, Ls0/B;

    .line 168
    .line 169
    const/4 p0, 0x1

    .line 170
    invoke-direct {v11, p0, v1, v6}, Ls0/B;-><init>(ILN0/l;Ls0/J;)V

    .line 171
    .line 172
    .line 173
    const-string v7, "\u68c0\u67e5\u66f4\u65b0"

    .line 174
    .line 175
    const-string v8, "\u68c0\u6d4b\u662f\u5426\u6709\u65b0\u7248\u672c"

    .line 176
    .line 177
    const-string v9, "\u2191"

    .line 178
    .line 179
    invoke-virtual/range {v6 .. v11}, Ls0/J;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILM0/a;)Landroid/widget/LinearLayout;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    new-instance p0, Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-direct {p0, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 193
    .line 194
    .line 195
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    .line 197
    invoke-static {v3}, LB0/a;->b(I)I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    invoke-direct {v7, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 202
    .line 203
    .line 204
    invoke-static {v13}, LB0/a;->b(I)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 209
    .line 210
    invoke-static {v13}, LB0/a;->b(I)I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 215
    .line 216
    invoke-virtual {p0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v6}, Ls0/J;->getDIVIDER_COLOR()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    invoke-virtual {p0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {v6}, Ls0/J;->getThemeMode()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    const-string v7, "mode"

    .line 234
    .line 235
    invoke-static {p0, v7}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const-string v7, "dark"

    .line 239
    .line 240
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    if-eqz v7, :cond_0

    .line 245
    .line 246
    const-string p0, "\u6df1\u8272"

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_0
    const-string v7, "system"

    .line 250
    .line 251
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_1

    .line 256
    .line 257
    const-string p0, "\u8ddf\u968f\u7cfb\u7edf"

    .line 258
    .line 259
    goto :goto_0

    .line 260
    :cond_1
    const-string p0, "\u6d45\u8272"

    .line 261
    .line 262
    :goto_0
    const-string v7, "\u5f53\u524d\uff1a"

    .line 263
    .line 264
    invoke-virtual {v7, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    invoke-direct {v6}, Ls0/J;->getACCENT_PURPLE()I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    new-instance v11, Ls0/B;

    .line 273
    .line 274
    const/4 p0, 0x2

    .line 275
    invoke-direct {v11, p0, v1, v6}, Ls0/B;-><init>(ILN0/l;Ls0/J;)V

    .line 276
    .line 277
    .line 278
    const-string v7, "\u754c\u9762\u4e3b\u9898"

    .line 279
    .line 280
    const-string v9, "\u25d0"

    .line 281
    .line 282
    invoke-virtual/range {v6 .. v11}, Ls0/J;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILM0/a;)Landroid/widget/LinearLayout;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    new-instance p0, Landroid/widget/PopupWindow;

    .line 290
    .line 291
    invoke-direct {p0, v2, v0, v4, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 295
    .line 296
    .line 297
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 298
    .line 299
    const/4 v3, 0x0

    .line 300
    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v5}, LB0/a;->a(F)F

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    invoke-virtual {p0, v2}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 311
    .line 312
    .line 313
    iput-object p0, v1, LN0/l;->a:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    sub-int/2addr v1, v0

    .line 320
    invoke-static {v13}, LB0/a;->b(I)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    sub-int/2addr v1, v0

    .line 325
    const/4 v0, 0x2

    .line 326
    invoke-static {v0}, LB0/a;->b(I)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    neg-int v0, v0

    .line 331
    invoke-virtual {p0, p1, v1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 332
    .line 333
    .line 334
    return-void
.end method

.method private final setThemeMode(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContext(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "mode"

    .line 11
    .line 12
    invoke-static {p1, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "mask_manager_ui_theme"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "theme_mode"

    .line 27
    .line 28
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static w(Ls0/J;Ljava/lang/String;Ljava/lang/String;ZLM0/a;LC/d;)Landroid/widget/LinearLayout;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual/range {p0 .. p1}, Ls0/J;->y(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v3, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 27
    .line 28
    const/4 v5, -0x1

    .line 29
    const/4 v6, -0x2

    .line 30
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 38
    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    .line 43
    .line 44
    new-instance v8, Landroid/widget/FrameLayout;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-direct {v8, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 54
    .line 55
    invoke-direct {v9, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    const/16 v9, 0x3a

    .line 62
    .line 63
    invoke-static {v9}, LB0/a;->b(I)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    invoke-virtual {v8, v10}, Landroid/view/View;->setMinimumHeight(I)V

    .line 68
    .line 69
    .line 70
    const/16 v10, 0xa

    .line 71
    .line 72
    invoke-static {v10}, LB0/a;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    const/16 v12, 0x8

    .line 77
    .line 78
    invoke-static {v12}, LB0/a;->b(I)I

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    invoke-static {v10}, LB0/a;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    invoke-static {v12}, LB0/a;->b(I)I

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-virtual {v8, v11, v13, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 91
    .line 92
    .line 93
    const/16 v10, 0x1c

    .line 94
    .line 95
    invoke-static {v10}, LB0/a;->b(I)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-virtual {p0, v1, v2, v11}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 104
    .line 105
    invoke-static {v10}, LB0/a;->b(I)I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    invoke-static {v10}, LB0/a;->b(I)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    invoke-direct {v2, v11, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 114
    .line 115
    .line 116
    const v10, 0x800013

    .line 117
    .line 118
    .line 119
    iput v10, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    new-instance v1, Landroid/widget/LinearLayout;

    .line 128
    .line 129
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 137
    .line 138
    invoke-direct {v2, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 139
    .line 140
    .line 141
    const/16 v10, 0x10

    .line 142
    .line 143
    iput v10, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 144
    .line 145
    const/16 v11, 0x28

    .line 146
    .line 147
    invoke-static {v11}, LB0/a;->b(I)I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    invoke-virtual {v2, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 152
    .line 153
    .line 154
    invoke-static {v9}, LB0/a;->b(I)I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-virtual {v2, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 165
    .line 166
    .line 167
    new-instance v2, Landroid/widget/LinearLayout;

    .line 168
    .line 169
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    invoke-direct {v2, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 177
    .line 178
    invoke-direct {v9, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 188
    .line 189
    .line 190
    new-instance v7, Landroid/widget/TextView;

    .line 191
    .line 192
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-direct {v7, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v6, v6, v7, p1}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    .line 208
    .line 209
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 210
    .line 211
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 212
    .line 213
    .line 214
    const v9, 0x416ccccd    # 14.8f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v4, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    if-eqz v0, :cond_0

    .line 224
    .line 225
    invoke-virtual {p0}, Ls0/J;->v()Landroid/widget/ImageView;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    :cond_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 233
    .line 234
    .line 235
    new-instance v2, Landroid/widget/TextView;

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-direct {v2, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 242
    .line 243
    .line 244
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 245
    .line 246
    invoke-direct {v7, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 247
    .line 248
    .line 249
    const/4 v9, 0x3

    .line 250
    invoke-static {v9}, LB0/a;->b(I)I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    iput v9, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 255
    .line 256
    invoke-virtual {v2, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 257
    .line 258
    .line 259
    move-object/from16 v7, p2

    .line 260
    .line 261
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    .line 263
    .line 264
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 269
    .line 270
    .line 271
    const/high16 v7, 0x41380000    # 11.5f

    .line 272
    .line 273
    invoke-virtual {v2, v4, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    new-instance v1, Landroid/widget/Switch;

    .line 283
    .line 284
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-direct {v1, v2}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 289
    .line 290
    .line 291
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 292
    .line 293
    invoke-direct {v2, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 294
    .line 295
    .line 296
    const v6, 0x800015

    .line 297
    .line 298
    .line 299
    iput v6, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 302
    .line 303
    .line 304
    move/from16 v2, p3

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0, v1}, Ls0/J;->T(Landroid/widget/Switch;)V

    .line 310
    .line 311
    .line 312
    new-instance v2, Ls0/s;

    .line 313
    .line 314
    move-object/from16 v6, p5

    .line 315
    .line 316
    invoke-direct {v2, v6}, Ls0/s;-><init>(LC/d;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 323
    .line 324
    .line 325
    if-eqz v0, :cond_1

    .line 326
    .line 327
    new-instance v1, Ls0/t;

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    invoke-direct {v1, v0, v2}, Ls0/t;-><init>(LM0/a;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 334
    .line 335
    .line 336
    :cond_1
    invoke-virtual {v3, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Landroid/view/View;

    .line 340
    .line 341
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 346
    .line 347
    .line 348
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 349
    .line 350
    invoke-static {v4}, LB0/a;->b(I)I

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    invoke-direct {v1, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 358
    .line 359
    .line 360
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 368
    .line 369
    .line 370
    return-object v3
.end method

.method public static final z(Ls0/J;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const-string v4, "\u5feb\u6377\u529f\u80fd"

    .line 22
    .line 23
    const-string v5, "\u641c\u7d22\u9690\u85cf"

    .line 24
    .line 25
    const-string v6, "\u670b\u53cb\u5708\u9690\u85cf"

    .line 26
    .line 27
    const-string v7, "\u5bc6\u53cb\u529f\u80fd"

    .line 28
    .line 29
    const-string v8, "\u6d88\u606f\u63d0\u9192"

    .line 30
    .line 31
    sparse-switch v3, :sswitch_data_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :sswitch_0
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v3, "\u63a7\u5236\u5934\u50cf\u89d2\u6807\u3001\u9876\u90e8\u6d88\u606f\u6570\u91cf\u3001\u9707\u52a8\u548c\u9876\u90e8\u52a0\u7c97\u63d0\u9192\u3002"

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v3, "\u63a7\u5236\u5bc6\u53cb\u5728\u4e3b\u9875\u641c\u7d22\u548c\u5355\u804a\u641c\u7d22\u4e2d\u7684\u641c\u7d22\u7ed3\u679c\u3002"

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :sswitch_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const-string v3, "\u7edf\u4e00\u7ba1\u7406\u5feb\u6377\u52a0\u5165\u540d\u5355\u548c\u804a\u5929\u9875\u53e3\u4ee4\u76d1\u542c\u3002"

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :sswitch_3
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string v3, "\u63a7\u5236\u5bc6\u53cb\u5728\u4f1a\u8bdd\u3001\u901a\u8baf\u5f55\u3001\u804a\u5929\u8bb0\u5f55\u3001\u5b58\u50a8\u7a7a\u95f4\u548c\u901a\u8bdd\u63d0\u9192\u4e2d\u7684\u663e\u793a\u3002"

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :sswitch_4
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_4

    .line 80
    .line 81
    :goto_0
    const-string v3, "\u7ba1\u7406\u5f53\u524d\u5206\u7ec4\u4e0b\u7684\u529f\u80fd\u5f00\u5173\u3002"

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const-string v3, "\u9690\u85cf\u5bc6\u53cb\u670b\u53cb\u5708\u3001\u81ea\u5df1\u6307\u5b9a\u670b\u53cb\u5708\u5185\u5bb9\u3001\u5206\u7ec4\u56fe\u6807\u3001\u70b9\u8d5e\u548c\u8bc4\u8bba\u75d5\u8ff9\u3002"

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    sparse-switch v9, :sswitch_data_1

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :sswitch_5
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const-string v4, "\u89d2\u6807"

    .line 102
    .line 103
    const-string v5, "\u9707\u52a8"

    .line 104
    .line 105
    const-string v9, "\u52a0\u7c97"

    .line 106
    .line 107
    filled-new-array {v4, v5, v9}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    goto :goto_3

    .line 116
    :sswitch_6
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    const-string v4, "\u4e3b\u9875\u641c\u7d22"

    .line 124
    .line 125
    const-string v5, "\u5355\u804a\u641c\u7d22"

    .line 126
    .line 127
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    goto :goto_3

    .line 136
    :sswitch_7
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_7

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    const-string v4, "\u83dc\u5355"

    .line 144
    .line 145
    const-string v5, "\u53e3\u4ee4"

    .line 146
    .line 147
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    goto :goto_3

    .line 156
    :sswitch_8
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-nez v4, :cond_8

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    const-string v4, "\u4f1a\u8bdd"

    .line 164
    .line 165
    const-string v5, "\u901a\u8baf\u5f55"

    .line 166
    .line 167
    const-string v9, "\u804a\u5929\u8bb0\u5f55"

    .line 168
    .line 169
    filled-new-array {v4, v5, v9}, [Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    goto :goto_3

    .line 178
    :sswitch_9
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-nez v4, :cond_9

    .line 183
    .line 184
    :goto_2
    const-string v4, "\u5f00\u5173"

    .line 185
    .line 186
    invoke-static {v4}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    goto :goto_3

    .line 191
    :cond_9
    const-string v4, "\u5185\u5bb9"

    .line 192
    .line 193
    const-string v5, "\u5206\u7ec4"

    .line 194
    .line 195
    const-string v9, "\u4e92\u52a8"

    .line 196
    .line 197
    filled-new-array {v4, v5, v9}, [Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v4}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    :goto_3
    invoke-virtual/range {p0 .. p1}, Ls0/J;->y(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 210
    .line 211
    const/4 v10, -0x1

    .line 212
    const/4 v11, -0x2

    .line 213
    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 214
    .line 215
    .line 216
    const/16 v12, 0xc

    .line 217
    .line 218
    invoke-static {v12}, LB0/a;->b(I)I

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 223
    .line 224
    invoke-static {v12}, LB0/a;->b(I)I

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 229
    .line 230
    const/16 v13, 0xe

    .line 231
    .line 232
    invoke-static {v13}, LB0/a;->b(I)I

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    iput v14, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 237
    .line 238
    invoke-virtual {v2, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    .line 240
    .line 241
    const/4 v9, 0x0

    .line 242
    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 243
    .line 244
    .line 245
    const/16 v14, 0x10

    .line 246
    .line 247
    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 248
    .line 249
    .line 250
    const/16 v14, 0xa

    .line 251
    .line 252
    invoke-static {v14}, LB0/a;->b(I)I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    move/from16 v16, v12

    .line 257
    .line 258
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    move/from16 v17, v14

    .line 263
    .line 264
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    invoke-virtual {v2, v15, v12, v14, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 273
    .line 274
    .line 275
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    const/4 v12, 0x0

    .line 280
    invoke-static {v0, v10, v9, v12, v13}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v2, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    .line 286
    .line 287
    const/high16 v10, 0x3f000000    # 0.5f

    .line 288
    .line 289
    invoke-static {v10}, LB0/a;->a(F)F

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    invoke-virtual {v2, v10}, Landroid/view/View;->setElevation(F)V

    .line 294
    .line 295
    .line 296
    invoke-static {v1}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    const/16 v13, 0x1b

    .line 301
    .line 302
    invoke-static {v13}, LB0/a;->b(I)I

    .line 303
    .line 304
    .line 305
    move-result v14

    .line 306
    invoke-virtual {v0, v10, v5, v14}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 311
    .line 312
    invoke-static {v13}, LB0/a;->b(I)I

    .line 313
    .line 314
    .line 315
    move-result v15

    .line 316
    invoke-static {v13}, LB0/a;->b(I)I

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    invoke-direct {v14, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 321
    .line 322
    .line 323
    const/16 v13, 0x30

    .line 324
    .line 325
    iput v13, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 326
    .line 327
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 328
    .line 329
    .line 330
    move-result v13

    .line 331
    invoke-virtual {v14, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v10, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    new-instance v10, Landroid/widget/LinearLayout;

    .line 341
    .line 342
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    invoke-direct {v10, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 347
    .line 348
    .line 349
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 350
    .line 351
    const/high16 v14, 0x3f800000    # 1.0f

    .line 352
    .line 353
    invoke-direct {v13, v9, v11, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 357
    .line 358
    .line 359
    const/4 v13, 0x1

    .line 360
    invoke-virtual {v10, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 361
    .line 362
    .line 363
    new-instance v14, Landroid/widget/TextView;

    .line 364
    .line 365
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    invoke-direct {v14, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 370
    .line 371
    .line 372
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 373
    .line 374
    const/4 v12, -0x1

    .line 375
    invoke-direct {v15, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v14, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    const v15, -0x2c7f8bd9

    .line 386
    .line 387
    .line 388
    if-eq v12, v15, :cond_d

    .line 389
    .line 390
    const v6, 0x2afcd5c3

    .line 391
    .line 392
    .line 393
    if-eq v12, v6, :cond_c

    .line 394
    .line 395
    const v6, 0x3340ede9

    .line 396
    .line 397
    .line 398
    if-eq v12, v6, :cond_a

    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_a
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    if-nez v6, :cond_b

    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_b
    const-string v1, "\u63d0\u9192\u75d5\u8ff9\u63a7\u5236"

    .line 409
    .line 410
    goto :goto_4

    .line 411
    :cond_c
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    if-eqz v6, :cond_f

    .line 416
    .line 417
    const-string v1, "\u5bc6\u53cb\u6838\u5fc3\u9690\u85cf"

    .line 418
    .line 419
    goto :goto_4

    .line 420
    :cond_d
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-nez v6, :cond_e

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_e
    const-string v1, "\u670b\u53cb\u5708\u5185\u5bb9\u4fdd\u62a4"

    .line 428
    .line 429
    :cond_f
    :goto_4
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 437
    .line 438
    .line 439
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 440
    .line 441
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 442
    .line 443
    .line 444
    const/high16 v1, 0x41780000    # 15.5f

    .line 445
    .line 446
    invoke-virtual {v14, v13, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 450
    .line 451
    .line 452
    new-instance v1, Landroid/widget/TextView;

    .line 453
    .line 454
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    invoke-direct {v1, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 459
    .line 460
    .line 461
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 462
    .line 463
    const/4 v12, -0x1

    .line 464
    invoke-direct {v6, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 465
    .line 466
    .line 467
    const/4 v7, 0x4

    .line 468
    invoke-static {v7}, LB0/a;->b(I)I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 473
    .line 474
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    .line 479
    .line 480
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 485
    .line 486
    .line 487
    const v3, 0x412ccccd    # 10.8f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v13, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 494
    .line 495
    .line 496
    new-instance v1, Landroid/widget/LinearLayout;

    .line 497
    .line 498
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    invoke-direct {v1, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 503
    .line 504
    .line 505
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 506
    .line 507
    const/4 v12, -0x1

    .line 508
    invoke-direct {v3, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 509
    .line 510
    .line 511
    const/16 v6, 0x8

    .line 512
    .line 513
    invoke-static {v6}, LB0/a;->b(I)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    iput v7, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 518
    .line 519
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 523
    .line 524
    .line 525
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_10

    .line 534
    .line 535
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Ljava/lang/String;

    .line 540
    .line 541
    new-instance v7, Landroid/widget/TextView;

    .line 542
    .line 543
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 544
    .line 545
    .line 546
    move-result-object v8

    .line 547
    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 548
    .line 549
    .line 550
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 551
    .line 552
    const/16 v12, 0x16

    .line 553
    .line 554
    invoke-static {v12}, LB0/a;->b(I)I

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    invoke-direct {v8, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 559
    .line 560
    .line 561
    const/4 v12, 0x6

    .line 562
    invoke-static {v12}, LB0/a;->b(I)I

    .line 563
    .line 564
    .line 565
    move-result v12

    .line 566
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 570
    .line 571
    .line 572
    const/16 v8, 0x11

    .line 573
    .line 574
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 575
    .line 576
    .line 577
    invoke-static {v6}, LB0/a;->b(I)I

    .line 578
    .line 579
    .line 580
    move-result v8

    .line 581
    invoke-static {v6}, LB0/a;->b(I)I

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    invoke-virtual {v7, v8, v9, v12, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 592
    .line 593
    .line 594
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 595
    .line 596
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 597
    .line 598
    .line 599
    const/high16 v4, 0x41200000    # 10.0f

    .line 600
    .line 601
    invoke-virtual {v7, v13, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 602
    .line 603
    .line 604
    invoke-static {v5}, Ls0/J;->S(I)I

    .line 605
    .line 606
    .line 607
    move-result v4

    .line 608
    const/16 v8, 0xb

    .line 609
    .line 610
    invoke-static {v8}, LB0/a;->b(I)I

    .line 611
    .line 612
    .line 613
    move-result v8

    .line 614
    const/4 v12, 0x0

    .line 615
    invoke-static {v0, v4, v8, v12, v6}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    invoke-virtual {v7, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 623
    .line 624
    .line 625
    goto :goto_5

    .line 626
    :cond_10
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 630
    .line 631
    .line 632
    return-object v2

    .line 633
    :sswitch_data_0
    .sparse-switch
        -0x2c7f8bd9 -> :sswitch_4
        0x2afcd5c3 -> :sswitch_3
        0x2d19f82a -> :sswitch_2
        0x2f6a5445 -> :sswitch_1
        0x3340ede9 -> :sswitch_0
    .end sparse-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    :sswitch_data_1
    .sparse-switch
        -0x2c7f8bd9 -> :sswitch_9
        0x2afcd5c3 -> :sswitch_8
        0x2d19f82a -> :sswitch_7
        0x2f6a5445 -> :sswitch_6
        0x3340ede9 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final F(Ljava/lang/String;)Landroid/widget/ScrollView;
    .locals 11

    .line 1
    new-instance v0, Landroid/text/SpannableString;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-static {v0, p1}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const-class v3, Landroid/text/style/URLSpan;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1, v3}, Landroid/text/SpannableString;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "getSpans(...)"

    .line 22
    .line 23
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    array-length v3, v1

    .line 27
    move v4, v2

    .line 28
    :goto_0
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    aget-object v5, v1, v4

    .line 31
    .line 32
    check-cast v5, Landroid/text/style/URLSpan;

    .line 33
    .line 34
    invoke-virtual {v0, v5}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {v0, v5}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-virtual {v0, v5}, Landroid/text/SpannableString;->getSpanFlags(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-virtual {v0, v5}, Landroid/text/SpannableString;->removeSpan(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const-string v9, "getURL(...)"

    .line 54
    .line 55
    invoke-static {v5, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v9, "http://"

    .line 59
    .line 60
    invoke-static {v5, p1, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-nez v9, :cond_1

    .line 65
    .line 66
    const-string v9, "https://"

    .line 67
    .line 68
    invoke-static {v5, p1, v9}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :cond_1
    :goto_1
    new-instance v9, Ls0/H;

    .line 80
    .line 81
    invoke-direct {v9, p0, v5}, Ls0/H;-><init>(Ls0/J;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v9, v6, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v1, Landroid/widget/ScrollView;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-direct {v1, v3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    new-instance v3, Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 109
    .line 110
    const/4 v5, -0x1

    .line 111
    const/4 v6, -0x2

    .line 112
    invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    .line 117
    .line 118
    const/16 v4, 0x18

    .line 119
    .line 120
    invoke-static {v4}, LB0/a;->b(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    const/16 v6, 0x8

    .line 125
    .line 126
    invoke-static {v6}, LB0/a;->b(I)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-static {v4}, LB0/a;->b(I)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-virtual {v3, v5, v6, v4, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 135
    .line 136
    .line 137
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    .line 143
    .line 144
    const/high16 v2, 0x41500000    # 13.0f

    .line 145
    .line 146
    invoke-virtual {v3, p1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setLinksClickable(Z)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    return-object v1
.end method

.method public final G()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Ls0/J;->n:Ljava/lang/Integer;

    .line 15
    .line 16
    iget-object v2, p0, Ls0/J;->m:Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v3, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, LA0/r;

    .line 45
    .line 46
    const/16 v5, 0xf

    .line 47
    .line 48
    invoke-direct {v4, v1, v0, v2, v5}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Ls0/J;->n:Ljava/lang/Integer;

    .line 56
    .line 57
    iput-object v0, p0, Ls0/J;->m:Ljava/lang/Integer;

    .line 58
    .line 59
    :cond_3
    :goto_0
    invoke-super {p0}, Lt0/c;->a()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final I()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayClickCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    const/16 v3, 0x8

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, LD/h;->g(III)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayLongPressMs()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0xc8

    .line 19
    .line 20
    const/16 v3, 0xbb8

    .line 21
    .line 22
    invoke-static {v0, v2, v3}, LD/h;->g(III)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, "\u5f00\u542f\u540e\u70b9\u51fb\u9876\u90e8\u5fae\u4fe1\u6216\u957f\u6309\u5feb\u901f\u663e\u793a\u9690\u85cf\u5bc6\u53cb\uff0c\u5f53\u524d "

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " \u6b21\uff0c\u957f\u6309 "

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "ms"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public final L()V
    .locals 22

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v3, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideClickCount()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    invoke-static {v4, v0, v5}, LD/h;->g(III)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 40
    .line 41
    .line 42
    const/16 v4, 0xe

    .line 43
    .line 44
    invoke-static {v4}, LB0/a;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const/4 v8, 0x6

    .line 49
    invoke-static {v8}, LB0/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-static {v4}, LB0/a;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-static {v8}, LB0/a;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    invoke-virtual {v1, v7, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    const/high16 v7, 0x41900000    # 18.0f

    .line 72
    .line 73
    invoke-virtual {v1, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 74
    .line 75
    .line 76
    const/16 v9, 0x11

    .line 77
    .line 78
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    const/16 v11, 0xc

    .line 86
    .line 87
    invoke-static {v11}, LB0/a;->b(I)I

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    invoke-static {v6}, LB0/a;->b(I)I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-static {v10, v12, v13, v14}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-virtual {v1, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    move-object v10, v2

    .line 111
    new-instance v2, Landroid/widget/EditText;

    .line 112
    .line 113
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-direct {v2, v12}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideDurationMs()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    const/16 v10, 0x12c

    .line 131
    .line 132
    const/16 v12, 0x1388

    .line 133
    .line 134
    invoke-static {v0, v10, v12}, LD/h;->g(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 146
    .line 147
    .line 148
    invoke-static {v4}, LB0/a;->b(I)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-static {v8}, LB0/a;->b(I)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    invoke-static {v4}, LB0/a;->b(I)I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    invoke-static {v8}, LB0/a;->b(I)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-virtual {v2, v0, v10, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-static {v11}, LB0/a;->b(I)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-static {v6}, LB0/a;->b(I)I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    invoke-static {v0, v7, v10, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 205
    .line 206
    .line 207
    move v0, v4

    .line 208
    new-instance v4, LN0/l;

    .line 209
    .line 210
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    new-instance v7, Landroid/widget/LinearLayout;

    .line 214
    .line 215
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-direct {v7, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 220
    .line 221
    .line 222
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 223
    .line 224
    const/4 v12, -0x1

    .line 225
    const/4 v13, -0x2

    .line 226
    invoke-direct {v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 233
    .line 234
    .line 235
    const/16 v10, 0x12

    .line 236
    .line 237
    invoke-static {v10}, LB0/a;->b(I)I

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    invoke-static {v10}, LB0/a;->b(I)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-static {v10}, LB0/a;->b(I)I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    move/from16 v16, v0

    .line 250
    .line 251
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    invoke-virtual {v7, v14, v15, v10, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 256
    .line 257
    .line 258
    invoke-direct {v3}, Ls0/J;->getCARD_COLOR()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/16 v10, 0x14

    .line 263
    .line 264
    invoke-static {v10}, LB0/a;->b(I)I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    const/4 v14, 0x0

    .line 269
    invoke-static {v3, v0, v10, v14, v5}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 274
    .line 275
    .line 276
    new-instance v0, Landroid/widget/LinearLayout;

    .line 277
    .line 278
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-direct {v0, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 283
    .line 284
    .line 285
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 286
    .line 287
    invoke-direct {v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 291
    .line 292
    .line 293
    const/16 v10, 0x10

    .line 294
    .line 295
    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 296
    .line 297
    .line 298
    const/4 v10, 0x0

    .line 299
    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v3}, Ls0/J;->getACCENT_PURPLE()I

    .line 303
    .line 304
    .line 305
    move-result v15

    .line 306
    const/16 v17, 0x22

    .line 307
    .line 308
    move/from16 v18, v8

    .line 309
    .line 310
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    move/from16 v19, v11

    .line 315
    .line 316
    const-string v11, "\u25a1"

    .line 317
    .line 318
    invoke-virtual {v3, v11, v15, v8}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 323
    .line 324
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    move/from16 v20, v5

    .line 329
    .line 330
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    invoke-direct {v11, v15, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 335
    .line 336
    .line 337
    const/16 v5, 0xa

    .line 338
    .line 339
    invoke-static {v5}, LB0/a;->b(I)I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 350
    .line 351
    .line 352
    new-instance v5, Landroid/widget/LinearLayout;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 359
    .line 360
    .line 361
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 362
    .line 363
    const/high16 v11, 0x3f800000    # 1.0f

    .line 364
    .line 365
    invoke-direct {v8, v10, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 372
    .line 373
    .line 374
    new-instance v8, Landroid/widget/TextView;

    .line 375
    .line 376
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    invoke-direct {v8, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 381
    .line 382
    .line 383
    const-string v15, "\u804a\u5929\u8bb0\u5f55\u5feb\u901f\u89e3\u9664"

    .line 384
    .line 385
    invoke-static {v12, v13, v8, v15}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 393
    .line 394
    .line 395
    sget-object v15, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 396
    .line 397
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 398
    .line 399
    .line 400
    const/high16 v14, 0x41880000    # 17.0f

    .line 401
    .line 402
    invoke-virtual {v8, v6, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 406
    .line 407
    .line 408
    new-instance v8, Landroid/widget/TextView;

    .line 409
    .line 410
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 411
    .line 412
    .line 413
    move-result-object v14

    .line 414
    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 415
    .line 416
    .line 417
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 418
    .line 419
    invoke-direct {v14, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 420
    .line 421
    .line 422
    const/16 v21, 0x4

    .line 423
    .line 424
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    iput v9, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 429
    .line 430
    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 431
    .line 432
    .line 433
    const-string v9, "\u8bbe\u7f6e\u70b9\u51fb\u804a\u5929\u9875\u9762\u89e3\u9664\u9690\u85cf\u804a\u5929\u8bb0\u5f55\u7684\u6b21\u6570\u548c\u65f6\u95f4\u7a97\u53e3"

    .line 434
    .line 435
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 443
    .line 444
    .line 445
    const/high16 v9, 0x41380000    # 11.5f

    .line 446
    .line 447
    invoke-virtual {v8, v6, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 457
    .line 458
    .line 459
    new-instance v0, Landroid/view/View;

    .line 460
    .line 461
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-direct {v0, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 466
    .line 467
    .line 468
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 469
    .line 470
    invoke-static {v6}, LB0/a;->b(I)I

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    invoke-direct {v5, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 475
    .line 476
    .line 477
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 478
    .line 479
    .line 480
    move-result v8

    .line 481
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 482
    .line 483
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 484
    .line 485
    .line 486
    move-result v8

    .line 487
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 488
    .line 489
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 490
    .line 491
    .line 492
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 500
    .line 501
    .line 502
    new-instance v0, Landroid/widget/TextView;

    .line 503
    .line 504
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 509
    .line 510
    .line 511
    const-string v5, "\u5feb\u901f\u89e3\u9664\u70b9\u51fb\u6b21\u6570\uff082-8 \u6b21\uff09"

    .line 512
    .line 513
    invoke-static {v12, v13, v0, v5}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 521
    .line 522
    .line 523
    const/high16 v5, 0x41400000    # 12.0f

    .line 524
    .line 525
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 529
    .line 530
    .line 531
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 532
    .line 533
    const/16 v8, 0x2e

    .line 534
    .line 535
    invoke-static {v8}, LB0/a;->b(I)I

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    invoke-direct {v0, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 540
    .line 541
    .line 542
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    iput v9, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 547
    .line 548
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 552
    .line 553
    .line 554
    new-instance v0, Landroid/widget/TextView;

    .line 555
    .line 556
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 557
    .line 558
    .line 559
    move-result-object v9

    .line 560
    invoke-direct {v0, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 561
    .line 562
    .line 563
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 564
    .line 565
    invoke-direct {v9, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 566
    .line 567
    .line 568
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 569
    .line 570
    .line 571
    move-result v14

    .line 572
    iput v14, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 573
    .line 574
    invoke-virtual {v0, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 575
    .line 576
    .line 577
    const-string v9, "\u70b9\u51fb\u65f6\u95f4\u7a97\u53e3\uff08300-5000ms\uff09"

    .line 578
    .line 579
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 580
    .line 581
    .line 582
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 583
    .line 584
    .line 585
    move-result v9

    .line 586
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 596
    .line 597
    invoke-static {v8}, LB0/a;->b(I)I

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    invoke-direct {v0, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 602
    .line 603
    .line 604
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 609
    .line 610
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 614
    .line 615
    .line 616
    new-instance v8, Landroid/widget/LinearLayout;

    .line 617
    .line 618
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 623
    .line 624
    .line 625
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 626
    .line 627
    invoke-direct {v0, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 628
    .line 629
    .line 630
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 635
    .line 636
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v8, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 640
    .line 641
    .line 642
    new-instance v0, Landroid/widget/TextView;

    .line 643
    .line 644
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 645
    .line 646
    .line 647
    move-result-object v5

    .line 648
    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 649
    .line 650
    .line 651
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 652
    .line 653
    const/16 v9, 0x2a

    .line 654
    .line 655
    invoke-static {v9}, LB0/a;->b(I)I

    .line 656
    .line 657
    .line 658
    move-result v13

    .line 659
    invoke-direct {v5, v10, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 660
    .line 661
    .line 662
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 663
    .line 664
    .line 665
    move-result v13

    .line 666
    invoke-virtual {v5, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 670
    .line 671
    .line 672
    const/16 v5, 0x11

    .line 673
    .line 674
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 675
    .line 676
    .line 677
    const-string v5, "\u53d6\u6d88"

    .line 678
    .line 679
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 680
    .line 681
    .line 682
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 690
    .line 691
    .line 692
    const/high16 v5, 0x41600000    # 14.0f

    .line 693
    .line 694
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 695
    .line 696
    .line 697
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 698
    .line 699
    .line 700
    move-result v13

    .line 701
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 702
    .line 703
    .line 704
    move-result v14

    .line 705
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 706
    .line 707
    .line 708
    move-result v16

    .line 709
    move/from16 v21, v9

    .line 710
    .line 711
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 712
    .line 713
    .line 714
    move-result-object v9

    .line 715
    invoke-static {v6}, LB0/a;->b(I)I

    .line 716
    .line 717
    .line 718
    move-result v5

    .line 719
    invoke-static {v13, v14, v9, v5}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 724
    .line 725
    .line 726
    new-instance v5, Ls0/u;

    .line 727
    .line 728
    const/4 v9, 0x1

    .line 729
    invoke-direct {v5, v4, v9}, Ls0/u;-><init>(LN0/l;I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 736
    .line 737
    .line 738
    new-instance v9, Landroid/widget/TextView;

    .line 739
    .line 740
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 745
    .line 746
    .line 747
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 748
    .line 749
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    invoke-direct {v0, v10, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 754
    .line 755
    .line 756
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 757
    .line 758
    .line 759
    move-result v5

    .line 760
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v9, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 764
    .line 765
    .line 766
    const/16 v5, 0x11

    .line 767
    .line 768
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 769
    .line 770
    .line 771
    const-string v0, "\u4fdd\u5b58"

    .line 772
    .line 773
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 780
    .line 781
    .line 782
    const/high16 v0, 0x41600000    # 14.0f

    .line 783
    .line 784
    invoke-virtual {v9, v6, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 785
    .line 786
    .line 787
    invoke-direct {v3}, Ls0/J;->getACCENT_TEAL()I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 792
    .line 793
    .line 794
    move-result v5

    .line 795
    move/from16 v10, v20

    .line 796
    .line 797
    const/4 v11, 0x0

    .line 798
    invoke-static {v3, v0, v5, v11, v10}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v9, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 803
    .line 804
    .line 805
    new-instance v0, Ls0/C;

    .line 806
    .line 807
    const/4 v5, 0x0

    .line 808
    invoke-direct/range {v0 .. v5}, Ls0/C;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ls0/J;LN0/l;I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 818
    .line 819
    .line 820
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 821
    .line 822
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    iput-object v0, v4, LN0/l;->a:Ljava/lang/Object;

    .line 838
    .line 839
    const-string v1, "dialog"

    .line 840
    .line 841
    if-eqz v0, :cond_1

    .line 842
    .line 843
    new-instance v2, Ls0/r;

    .line 844
    .line 845
    const/4 v5, 0x2

    .line 846
    invoke-direct {v2, v4, v5}, Ls0/r;-><init>(LN0/l;I)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 850
    .line 851
    .line 852
    iget-object v0, v4, LN0/l;->a:Ljava/lang/Object;

    .line 853
    .line 854
    if-eqz v0, :cond_0

    .line 855
    .line 856
    check-cast v0, Landroid/app/AlertDialog;

    .line 857
    .line 858
    invoke-virtual {v3, v0, v6}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 859
    .line 860
    .line 861
    return-void

    .line 862
    :cond_0
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    const/16 v17, 0x0

    .line 866
    .line 867
    throw v17

    .line 868
    :cond_1
    const/16 v17, 0x0

    .line 869
    .line 870
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    throw v17
.end method

.method public final M(Landroid/app/AlertDialog;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-boolean p2, Lz0/i;->a:Z

    .line 22
    .line 23
    invoke-static {}, Lz0/g;->v()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 38
    .line 39
    const/16 v0, 0x40

    .line 40
    .line 41
    invoke-static {v0}, LB0/a;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    sub-int/2addr p2, v0

    .line 46
    const/16 v0, 0x104

    .line 47
    .line 48
    invoke-static {v0}, LB0/a;->b(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-ge p2, v0, :cond_1

    .line 53
    .line 54
    move p2, v0

    .line 55
    :cond_1
    const/16 v0, 0x20

    .line 56
    .line 57
    invoke-static {v0}, LB0/a;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    sub-int/2addr p2, v0

    .line 62
    const/16 v0, 0xf0

    .line 63
    .line 64
    invoke-static {v0}, LB0/a;->b(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-ge p2, v0, :cond_2

    .line 69
    .line 70
    move p2, v0

    .line 71
    :cond_2
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    const/4 v0, -0x2

    .line 78
    invoke-virtual {p1, p2, v0}, Landroid/view/Window;->setLayout(II)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method

.method public final N()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LE0/g;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "\u8f7b\u5fae"

    .line 11
    .line 12
    const-string v5, "\u5f88\u77ed\u7684\u8f7b\u89e6\u63d0\u9192\uff0c\u9002\u5408\u5b89\u9759\u73af\u5883"

    .line 13
    .line 14
    invoke-direct {v1, v4, v5, v3}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, LE0/g;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v6, "\u9ed8\u8ba4"

    .line 25
    .line 26
    const-string v7, "\u5355\u6b21\u6807\u51c6\u9707\u52a8\uff0c\u4fdd\u6301\u5f53\u524d\u9ed8\u8ba4\u624b\u611f"

    .line 27
    .line 28
    invoke-direct {v3, v6, v7, v5}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, LE0/g;

    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const-string v8, "\u5f3a\u70c8"

    .line 39
    .line 40
    const-string v9, "\u53cc\u6bb5\u8f83\u660e\u663e\u9707\u52a8\uff0c\u66f4\u5bb9\u6613\u611f\u77e5"

    .line 41
    .line 42
    invoke-direct {v5, v8, v9, v7}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v7, LE0/g;

    .line 46
    .line 47
    const/4 v8, 0x3

    .line 48
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    const-string v10, "\u8fde\u7eed"

    .line 53
    .line 54
    const-string v11, "\u4e09\u6bb5\u8fde\u7eed\u9707\u52a8\uff0c\u63d0\u9192\u6700\u660e\u663e"

    .line 55
    .line 56
    invoke-direct {v7, v10, v11, v9}, LE0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    filled-new-array {v1, v3, v5, v7}, [LE0/g;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v3, v0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrateMode()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3, v2, v8}, LD/h;->g(III)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    new-instance v5, LN0/l;

    .line 78
    .line 79
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v7, Landroid/widget/LinearLayout;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-direct {v7, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 92
    .line 93
    const/4 v10, -0x1

    .line 94
    const/4 v11, -0x2

    .line 95
    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 102
    .line 103
    .line 104
    const/16 v9, 0x12

    .line 105
    .line 106
    invoke-static {v9}, LB0/a;->b(I)I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    invoke-static {v9}, LB0/a;->b(I)I

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    invoke-static {v9}, LB0/a;->b(I)I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    const/16 v14, 0xe

    .line 119
    .line 120
    invoke-static {v14}, LB0/a;->b(I)I

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    invoke-virtual {v7, v12, v13, v9, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    const/16 v12, 0x14

    .line 132
    .line 133
    invoke-static {v12}, LB0/a;->b(I)I

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    const/4 v13, 0x0

    .line 138
    const/16 v15, 0x8

    .line 139
    .line 140
    invoke-static {v0, v9, v12, v13, v15}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v7, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    .line 147
    new-instance v9, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-direct {v9, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    .line 158
    invoke-direct {v12, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    const/16 v12, 0x10

    .line 165
    .line 166
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 170
    .line 171
    .line 172
    move/from16 v16, v6

    .line 173
    .line 174
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    const/16 v17, 0x22

    .line 179
    .line 180
    move/from16 v18, v8

    .line 181
    .line 182
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    move-object/from16 v19, v13

    .line 187
    .line 188
    const-string v13, "\u2248"

    .line 189
    .line 190
    invoke-virtual {v0, v13, v6, v8}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 195
    .line 196
    move/from16 v20, v14

    .line 197
    .line 198
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    move/from16 v21, v15

    .line 203
    .line 204
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    invoke-direct {v8, v14, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 209
    .line 210
    .line 211
    const/16 v14, 0xa

    .line 212
    .line 213
    invoke-static {v14}, LB0/a;->b(I)I

    .line 214
    .line 215
    .line 216
    move-result v15

    .line 217
    invoke-virtual {v8, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    new-instance v6, Landroid/widget/LinearLayout;

    .line 227
    .line 228
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    invoke-direct {v6, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 233
    .line 234
    .line 235
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 236
    .line 237
    const/high16 v15, 0x3f800000    # 1.0f

    .line 238
    .line 239
    invoke-direct {v8, v2, v11, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 246
    .line 247
    .line 248
    new-instance v8, Landroid/widget/TextView;

    .line 249
    .line 250
    move/from16 v17, v14

    .line 251
    .line 252
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    const-string v14, "\u5bc6\u53cb\u6d88\u606f\u9707\u52a8"

    .line 260
    .line 261
    invoke-static {v10, v11, v8, v14}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 269
    .line 270
    .line 271
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 272
    .line 273
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x41880000    # 17.0f

    .line 277
    .line 278
    invoke-virtual {v8, v4, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 282
    .line 283
    .line 284
    new-instance v8, Landroid/widget/TextView;

    .line 285
    .line 286
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 291
    .line 292
    .line 293
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 294
    .line 295
    invoke-direct {v14, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x4

    .line 299
    .line 300
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 305
    .line 306
    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 307
    .line 308
    .line 309
    const-string v14, "\u9009\u62e9\u9690\u85cf\u5bc6\u53cb\u6765\u6d88\u606f\u65f6\u7684\u9707\u52a8\u63d0\u9192\u65b9\u5f0f"

    .line 310
    .line 311
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    .line 314
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 319
    .line 320
    .line 321
    const/high16 v14, 0x41380000    # 11.5f

    .line 322
    .line 323
    invoke-virtual {v8, v4, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    new-instance v6, Landroid/view/View;

    .line 336
    .line 337
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    invoke-direct {v6, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 342
    .line 343
    .line 344
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 345
    .line 346
    invoke-static {v4}, LB0/a;->b(I)I

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    invoke-direct {v8, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 351
    .line 352
    .line 353
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 354
    .line 355
    .line 356
    move-result v9

    .line 357
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 358
    .line 359
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 364
    .line 365
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    .line 367
    .line 368
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    invoke-virtual {v6, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    if-eqz v6, :cond_5

    .line 387
    .line 388
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    check-cast v6, LE0/g;

    .line 393
    .line 394
    iget-object v9, v6, LE0/g;->a:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v9, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    iget-object v14, v6, LE0/g;->b:Ljava/lang/String;

    .line 403
    .line 404
    iget-object v6, v6, LE0/g;->c:Ljava/lang/String;

    .line 405
    .line 406
    if-ne v9, v3, :cond_0

    .line 407
    .line 408
    move v15, v4

    .line 409
    :goto_1
    const/16 v22, 0xc

    .line 410
    .line 411
    goto :goto_2

    .line 412
    :cond_0
    move v15, v2

    .line 413
    goto :goto_1

    .line 414
    :goto_2
    new-instance v8, Landroid/widget/LinearLayout;

    .line 415
    .line 416
    move/from16 v23, v4

    .line 417
    .line 418
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-direct {v8, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 423
    .line 424
    .line 425
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 426
    .line 427
    invoke-direct {v4, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 428
    .line 429
    .line 430
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 435
    .line 436
    invoke-virtual {v8, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v8, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v8, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 443
    .line 444
    .line 445
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 446
    .line 447
    .line 448
    move-result v4

    .line 449
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 450
    .line 451
    .line 452
    move-result v10

    .line 453
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    invoke-virtual {v8, v4, v10, v12, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 462
    .line 463
    .line 464
    if-eqz v15, :cond_1

    .line 465
    .line 466
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    invoke-static {v2}, Ls0/J;->S(I)I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v10

    .line 486
    invoke-static/range {v23 .. v23}, LB0/a;->b(I)I

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    invoke-static {v2, v4, v10, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    goto :goto_3

    .line 495
    :cond_1
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v10

    .line 511
    invoke-static/range {v23 .. v23}, LB0/a;->b(I)I

    .line 512
    .line 513
    .line 514
    move-result v12

    .line 515
    invoke-static {v2, v4, v10, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    :goto_3
    invoke-virtual {v8, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 520
    .line 521
    .line 522
    if-eqz v15, :cond_2

    .line 523
    .line 524
    const-string v2, "\u2713"

    .line 525
    .line 526
    goto :goto_4

    .line 527
    :cond_2
    move-object v2, v13

    .line 528
    :goto_4
    if-eqz v15, :cond_3

    .line 529
    .line 530
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    goto :goto_5

    .line 535
    :cond_3
    invoke-direct {v0}, Ls0/J;->getTEXT_TERTIARY()I

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    :goto_5
    const/16 v10, 0x1a

    .line 540
    .line 541
    invoke-static {v10}, LB0/a;->b(I)I

    .line 542
    .line 543
    .line 544
    move-result v12

    .line 545
    invoke-virtual {v0, v2, v4, v12}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 550
    .line 551
    invoke-static {v10}, LB0/a;->b(I)I

    .line 552
    .line 553
    .line 554
    move-result v12

    .line 555
    invoke-static {v10}, LB0/a;->b(I)I

    .line 556
    .line 557
    .line 558
    move-result v10

    .line 559
    invoke-direct {v4, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 560
    .line 561
    .line 562
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 563
    .line 564
    .line 565
    move-result v10

    .line 566
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 573
    .line 574
    .line 575
    new-instance v2, Landroid/widget/LinearLayout;

    .line 576
    .line 577
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 582
    .line 583
    .line 584
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 585
    .line 586
    const/4 v10, 0x0

    .line 587
    const/high16 v12, 0x3f800000    # 1.0f

    .line 588
    .line 589
    invoke-direct {v4, v10, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 593
    .line 594
    .line 595
    move/from16 v4, v23

    .line 596
    .line 597
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 598
    .line 599
    .line 600
    new-instance v4, Landroid/widget/TextView;

    .line 601
    .line 602
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    invoke-direct {v4, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 607
    .line 608
    .line 609
    const/4 v10, -0x1

    .line 610
    invoke-static {v10, v11, v4, v14}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    if-eqz v15, :cond_4

    .line 614
    .line 615
    invoke-direct {v0}, Ls0/J;->getACCENT_TEAL()I

    .line 616
    .line 617
    .line 618
    move-result v10

    .line 619
    goto :goto_6

    .line 620
    :cond_4
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 621
    .line 622
    .line 623
    move-result v10

    .line 624
    :goto_6
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 625
    .line 626
    .line 627
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 628
    .line 629
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 630
    .line 631
    .line 632
    const v10, 0x41633333    # 14.2f

    .line 633
    .line 634
    .line 635
    const/4 v14, 0x1

    .line 636
    invoke-virtual {v4, v14, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 640
    .line 641
    .line 642
    new-instance v4, Landroid/widget/TextView;

    .line 643
    .line 644
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    invoke-direct {v4, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 649
    .line 650
    .line 651
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 652
    .line 653
    const/4 v14, -0x1

    .line 654
    invoke-direct {v10, v14, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 655
    .line 656
    .line 657
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 658
    .line 659
    .line 660
    move-result v14

    .line 661
    iput v14, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 662
    .line 663
    invoke-virtual {v4, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 667
    .line 668
    .line 669
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 674
    .line 675
    .line 676
    const v6, 0x412ccccd    # 10.8f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x1

    .line 680
    invoke-virtual {v4, v14, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 687
    .line 688
    .line 689
    new-instance v2, Ls0/D;

    .line 690
    .line 691
    invoke-direct {v2, v9, v5, v0}, Ls0/D;-><init>(ILN0/l;Ls0/J;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 698
    .line 699
    .line 700
    const/4 v2, 0x0

    .line 701
    const/4 v4, 0x1

    .line 702
    const/4 v10, -0x1

    .line 703
    const/16 v12, 0x10

    .line 704
    .line 705
    goto/16 :goto_0

    .line 706
    .line 707
    :cond_5
    const/16 v22, 0xc

    .line 708
    .line 709
    new-instance v1, Landroid/widget/TextView;

    .line 710
    .line 711
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 716
    .line 717
    .line 718
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 719
    .line 720
    const/16 v3, 0x28

    .line 721
    .line 722
    invoke-static {v3}, LB0/a;->b(I)I

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    const/4 v10, -0x1

    .line 727
    invoke-direct {v2, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 728
    .line 729
    .line 730
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 735
    .line 736
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 737
    .line 738
    .line 739
    const/16 v2, 0x11

    .line 740
    .line 741
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 742
    .line 743
    .line 744
    const-string v2, "\u53d6\u6d88"

    .line 745
    .line 746
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 747
    .line 748
    .line 749
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 754
    .line 755
    .line 756
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 757
    .line 758
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 759
    .line 760
    .line 761
    const/high16 v2, 0x41580000    # 13.5f

    .line 762
    .line 763
    const/4 v14, 0x1

    .line 764
    invoke-virtual {v1, v14, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 765
    .line 766
    .line 767
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    invoke-static/range {v22 .. v22}, LB0/a;->b(I)I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-static {v14}, LB0/a;->b(I)I

    .line 784
    .line 785
    .line 786
    move-result v6

    .line 787
    invoke-static {v2, v3, v4, v6}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 792
    .line 793
    .line 794
    new-instance v2, Ls0/u;

    .line 795
    .line 796
    const/4 v3, 0x2

    .line 797
    invoke-direct {v2, v5, v3}, Ls0/u;-><init>(LN0/l;I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 804
    .line 805
    .line 806
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 807
    .line 808
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    iput-object v1, v5, LN0/l;->a:Ljava/lang/Object;

    .line 824
    .line 825
    const-string v2, "dialog"

    .line 826
    .line 827
    if-eqz v1, :cond_7

    .line 828
    .line 829
    new-instance v3, Ls0/r;

    .line 830
    .line 831
    const/4 v4, 0x3

    .line 832
    invoke-direct {v3, v5, v4}, Ls0/r;-><init>(LN0/l;I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 836
    .line 837
    .line 838
    iget-object v1, v5, LN0/l;->a:Ljava/lang/Object;

    .line 839
    .line 840
    if-eqz v1, :cond_6

    .line 841
    .line 842
    check-cast v1, Landroid/app/AlertDialog;

    .line 843
    .line 844
    const/4 v14, 0x1

    .line 845
    invoke-virtual {v0, v1, v14}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 846
    .line 847
    .line 848
    return-void

    .line 849
    :cond_6
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    throw v19

    .line 853
    :cond_7
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    throw v19
.end method

.method public final O(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ls0/I;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, v0}, Ls0/I;-><init>(Ls0/J;Ljava/lang/String;Ljava/util/List;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lt0/c;->g()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final P(LM0/a;)V
    .locals 22

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v3, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayClickCount()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    invoke-static {v4, v0, v5}, LD/h;->g(III)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 40
    .line 41
    .line 42
    const/16 v4, 0xe

    .line 43
    .line 44
    invoke-static {v4}, LB0/a;->b(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const/4 v8, 0x6

    .line 49
    invoke-static {v8}, LB0/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-static {v4}, LB0/a;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-static {v8}, LB0/a;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    invoke-virtual {v1, v7, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    const/high16 v7, 0x41900000    # 18.0f

    .line 72
    .line 73
    invoke-virtual {v1, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 74
    .line 75
    .line 76
    const/16 v9, 0x11

    .line 77
    .line 78
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    const/16 v11, 0xc

    .line 86
    .line 87
    invoke-static {v11}, LB0/a;->b(I)I

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    invoke-static {v6}, LB0/a;->b(I)I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-static {v10, v12, v13, v14}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-virtual {v1, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    move-object v10, v2

    .line 111
    new-instance v2, Landroid/widget/EditText;

    .line 112
    .line 113
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-direct {v2, v12}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setInputType(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayLongPressMs()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    const/16 v10, 0xc8

    .line 131
    .line 132
    const/16 v12, 0xbb8

    .line 133
    .line 134
    invoke-static {v0, v10, v12}, LD/h;->g(III)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 146
    .line 147
    .line 148
    invoke-static {v4}, LB0/a;->b(I)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-static {v8}, LB0/a;->b(I)I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    invoke-static {v4}, LB0/a;->b(I)I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    invoke-static {v8}, LB0/a;->b(I)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-virtual {v2, v0, v10, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-static {v11}, LB0/a;->b(I)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-static {v6}, LB0/a;->b(I)I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    invoke-static {v0, v7, v10, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 205
    .line 206
    .line 207
    new-instance v0, LN0/l;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 210
    .line 211
    .line 212
    new-instance v7, Landroid/widget/LinearLayout;

    .line 213
    .line 214
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-direct {v7, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 222
    .line 223
    const/4 v12, -0x1

    .line 224
    const/4 v13, -0x2

    .line 225
    invoke-direct {v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 232
    .line 233
    .line 234
    const/16 v10, 0x12

    .line 235
    .line 236
    invoke-static {v10}, LB0/a;->b(I)I

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    invoke-static {v10}, LB0/a;->b(I)I

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    invoke-static {v10}, LB0/a;->b(I)I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    move/from16 v16, v4

    .line 249
    .line 250
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    invoke-virtual {v7, v14, v15, v10, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 255
    .line 256
    .line 257
    invoke-direct {v3}, Ls0/J;->getCARD_COLOR()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    const/16 v10, 0x14

    .line 262
    .line 263
    invoke-static {v10}, LB0/a;->b(I)I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    const/4 v14, 0x0

    .line 268
    invoke-static {v3, v4, v10, v14, v5}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v7, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 273
    .line 274
    .line 275
    new-instance v4, Landroid/widget/LinearLayout;

    .line 276
    .line 277
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-direct {v4, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 282
    .line 283
    .line 284
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 285
    .line 286
    invoke-direct {v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 290
    .line 291
    .line 292
    const/16 v10, 0x10

    .line 293
    .line 294
    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 295
    .line 296
    .line 297
    const/4 v10, 0x0

    .line 298
    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 299
    .line 300
    .line 301
    invoke-direct {v3}, Ls0/J;->getACCENT_ORANGE()I

    .line 302
    .line 303
    .line 304
    move-result v15

    .line 305
    const/16 v17, 0x22

    .line 306
    .line 307
    move/from16 v18, v8

    .line 308
    .line 309
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    move/from16 v19, v11

    .line 314
    .line 315
    const-string v11, "\u26a1"

    .line 316
    .line 317
    invoke-virtual {v3, v11, v15, v8}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 322
    .line 323
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 324
    .line 325
    .line 326
    move-result v15

    .line 327
    move/from16 v20, v5

    .line 328
    .line 329
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    invoke-direct {v11, v15, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 334
    .line 335
    .line 336
    const/16 v5, 0xa

    .line 337
    .line 338
    invoke-static {v5}, LB0/a;->b(I)I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 349
    .line 350
    .line 351
    new-instance v5, Landroid/widget/LinearLayout;

    .line 352
    .line 353
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 358
    .line 359
    .line 360
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 361
    .line 362
    const/high16 v11, 0x3f800000    # 1.0f

    .line 363
    .line 364
    invoke-direct {v8, v10, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 371
    .line 372
    .line 373
    new-instance v8, Landroid/widget/TextView;

    .line 374
    .line 375
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 376
    .line 377
    .line 378
    move-result-object v15

    .line 379
    invoke-direct {v8, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 380
    .line 381
    .line 382
    const-string v15, "\u5feb\u6377\u663e\u793a\u70b9\u51fb\u6b21\u6570"

    .line 383
    .line 384
    invoke-static {v12, v13, v8, v15}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 388
    .line 389
    .line 390
    move-result v15

    .line 391
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 392
    .line 393
    .line 394
    sget-object v15, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 395
    .line 396
    invoke-virtual {v8, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 397
    .line 398
    .line 399
    const/high16 v14, 0x41880000    # 17.0f

    .line 400
    .line 401
    invoke-virtual {v8, v6, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 405
    .line 406
    .line 407
    new-instance v8, Landroid/widget/TextView;

    .line 408
    .line 409
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 410
    .line 411
    .line 412
    move-result-object v14

    .line 413
    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 414
    .line 415
    .line 416
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 417
    .line 418
    invoke-direct {v14, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 419
    .line 420
    .line 421
    const/16 v21, 0x4

    .line 422
    .line 423
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    iput v9, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 428
    .line 429
    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 430
    .line 431
    .line 432
    const-string v9, "\u8bbe\u7f6e\u70b9\u51fb\u9876\u90e8\u5fae\u4fe1\u7684\u89e6\u53d1\u6b21\u6570\u548c\u957f\u6309\u65f6\u95f4"

    .line 433
    .line 434
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 435
    .line 436
    .line 437
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 442
    .line 443
    .line 444
    const/high16 v9, 0x41380000    # 11.5f

    .line 445
    .line 446
    invoke-virtual {v8, v6, v9}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    new-instance v4, Landroid/view/View;

    .line 459
    .line 460
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-direct {v4, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 465
    .line 466
    .line 467
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 468
    .line 469
    invoke-static {v6}, LB0/a;->b(I)I

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    invoke-direct {v5, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 474
    .line 475
    .line 476
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 481
    .line 482
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 487
    .line 488
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 489
    .line 490
    .line 491
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 499
    .line 500
    .line 501
    new-instance v4, Landroid/widget/TextView;

    .line 502
    .line 503
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 508
    .line 509
    .line 510
    const-string v5, "\u5feb\u6377\u663e\u793a\u70b9\u51fb\u6b21\u6570\uff082-8 \u6b21\uff09"

    .line 511
    .line 512
    invoke-static {v12, v13, v4, v5}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 520
    .line 521
    .line 522
    const/high16 v5, 0x41400000    # 12.0f

    .line 523
    .line 524
    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 528
    .line 529
    .line 530
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 531
    .line 532
    const/16 v8, 0x2e

    .line 533
    .line 534
    invoke-static {v8}, LB0/a;->b(I)I

    .line 535
    .line 536
    .line 537
    move-result v9

    .line 538
    invoke-direct {v4, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 539
    .line 540
    .line 541
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 542
    .line 543
    .line 544
    move-result v9

    .line 545
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 546
    .line 547
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 551
    .line 552
    .line 553
    new-instance v4, Landroid/widget/TextView;

    .line 554
    .line 555
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    invoke-direct {v4, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 560
    .line 561
    .line 562
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 563
    .line 564
    invoke-direct {v9, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 565
    .line 566
    .line 567
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 568
    .line 569
    .line 570
    move-result v14

    .line 571
    iput v14, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 572
    .line 573
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 574
    .line 575
    .line 576
    const-string v9, "\u957f\u6309\u89e6\u53d1\u65f6\u95f4\uff08200-3000ms\uff09"

    .line 577
    .line 578
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 579
    .line 580
    .line 581
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 592
    .line 593
    .line 594
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 595
    .line 596
    invoke-static {v8}, LB0/a;->b(I)I

    .line 597
    .line 598
    .line 599
    move-result v5

    .line 600
    invoke-direct {v4, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 601
    .line 602
    .line 603
    invoke-static/range {v20 .. v20}, LB0/a;->b(I)I

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 608
    .line 609
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 613
    .line 614
    .line 615
    new-instance v8, Landroid/widget/LinearLayout;

    .line 616
    .line 617
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 618
    .line 619
    .line 620
    move-result-object v4

    .line 621
    invoke-direct {v8, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 622
    .line 623
    .line 624
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 625
    .line 626
    invoke-direct {v4, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 627
    .line 628
    .line 629
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 634
    .line 635
    invoke-virtual {v8, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v8, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 639
    .line 640
    .line 641
    new-instance v4, Landroid/widget/TextView;

    .line 642
    .line 643
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 648
    .line 649
    .line 650
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 651
    .line 652
    const/16 v9, 0x2a

    .line 653
    .line 654
    invoke-static {v9}, LB0/a;->b(I)I

    .line 655
    .line 656
    .line 657
    move-result v13

    .line 658
    invoke-direct {v5, v10, v13, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 659
    .line 660
    .line 661
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 662
    .line 663
    .line 664
    move-result v13

    .line 665
    invoke-virtual {v5, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 669
    .line 670
    .line 671
    const/16 v5, 0x11

    .line 672
    .line 673
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 674
    .line 675
    .line 676
    const-string v5, "\u53d6\u6d88"

    .line 677
    .line 678
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 679
    .line 680
    .line 681
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 689
    .line 690
    .line 691
    const/high16 v5, 0x41600000    # 14.0f

    .line 692
    .line 693
    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 694
    .line 695
    .line 696
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 697
    .line 698
    .line 699
    move-result v13

    .line 700
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 701
    .line 702
    .line 703
    move-result v14

    .line 704
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 705
    .line 706
    .line 707
    move-result v16

    .line 708
    move/from16 v21, v9

    .line 709
    .line 710
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    invoke-static {v6}, LB0/a;->b(I)I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    invoke-static {v13, v14, v9, v5}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 723
    .line 724
    .line 725
    new-instance v5, Ls0/u;

    .line 726
    .line 727
    const/4 v9, 0x6

    .line 728
    invoke-direct {v5, v0, v9}, Ls0/u;-><init>(LN0/l;I)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 735
    .line 736
    .line 737
    new-instance v9, Landroid/widget/TextView;

    .line 738
    .line 739
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    invoke-direct {v9, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 744
    .line 745
    .line 746
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 747
    .line 748
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    invoke-direct {v4, v10, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 753
    .line 754
    .line 755
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 756
    .line 757
    .line 758
    move-result v5

    .line 759
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v9, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 763
    .line 764
    .line 765
    const/16 v5, 0x11

    .line 766
    .line 767
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 768
    .line 769
    .line 770
    const-string v4, "\u4fdd\u5b58"

    .line 771
    .line 772
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 779
    .line 780
    .line 781
    const/high16 v4, 0x41600000    # 14.0f

    .line 782
    .line 783
    invoke-virtual {v9, v6, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 784
    .line 785
    .line 786
    invoke-direct {v3}, Ls0/J;->getACCENT_TEAL()I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 791
    .line 792
    .line 793
    move-result v5

    .line 794
    move/from16 v10, v20

    .line 795
    .line 796
    const/4 v11, 0x0

    .line 797
    invoke-static {v3, v4, v5, v11, v10}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    invoke-virtual {v9, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 802
    .line 803
    .line 804
    move-object v5, v0

    .line 805
    new-instance v0, Ls0/F;

    .line 806
    .line 807
    move-object/from16 v4, p1

    .line 808
    .line 809
    invoke-direct/range {v0 .. v5}, Ls0/F;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ls0/J;LM0/a;LN0/l;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 819
    .line 820
    .line 821
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 822
    .line 823
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    iput-object v0, v5, LN0/l;->a:Ljava/lang/Object;

    .line 839
    .line 840
    const-string v1, "dialog"

    .line 841
    .line 842
    if-eqz v0, :cond_1

    .line 843
    .line 844
    new-instance v2, Ls0/r;

    .line 845
    .line 846
    const/4 v4, 0x0

    .line 847
    invoke-direct {v2, v5, v4}, Ls0/r;-><init>(LN0/l;I)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 851
    .line 852
    .line 853
    iget-object v0, v5, LN0/l;->a:Ljava/lang/Object;

    .line 854
    .line 855
    if-eqz v0, :cond_0

    .line 856
    .line 857
    check-cast v0, Landroid/app/AlertDialog;

    .line 858
    .line 859
    invoke-virtual {v3, v0, v6}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :cond_0
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    const/16 v17, 0x0

    .line 867
    .line 868
    throw v17

    .line 869
    :cond_1
    const/16 v17, 0x0

    .line 870
    .line 871
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v17
.end method

.method public final Q()V
    .locals 22

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v3, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getSearchCommandText()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const-string v2, "#hide"

    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    invoke-static {v2}, LB0/a;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-static {v5}, LB0/a;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-static {v2}, LB0/a;->b(I)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    invoke-static {v5}, LB0/a;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-virtual {v1, v4, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    .line 67
    .line 68
    const/high16 v4, 0x41900000    # 18.0f

    .line 69
    .line 70
    invoke-virtual {v1, v6, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 71
    .line 72
    .line 73
    const/16 v7, 0x11

    .line 74
    .line 75
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    const/16 v9, 0xc

    .line 83
    .line 84
    invoke-static {v9}, LB0/a;->b(I)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    invoke-static {v6}, LB0/a;->b(I)I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    invoke-static {v8, v10, v11, v12}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    move v8, v2

    .line 108
    new-instance v2, Landroid/widget/EditText;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-direct {v2, v10}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getSearchListCommandText()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_1

    .line 132
    .line 133
    const-string v0, "#list"

    .line 134
    .line 135
    :cond_1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    .line 139
    .line 140
    .line 141
    invoke-static {v8}, LB0/a;->b(I)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {v5}, LB0/a;->b(I)I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-static {v8}, LB0/a;->b(I)I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    invoke-static {v5}, LB0/a;->b(I)I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    invoke-virtual {v2, v0, v10, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 158
    .line 159
    .line 160
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v6, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v9}, LB0/a;->b(I)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    invoke-static {v6}, LB0/a;->b(I)I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    invoke-static {v0, v4, v10, v11}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 198
    .line 199
    .line 200
    new-instance v4, LN0/l;

    .line 201
    .line 202
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    new-instance v10, Landroid/widget/LinearLayout;

    .line 206
    .line 207
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 215
    .line 216
    const/4 v11, -0x1

    .line 217
    const/4 v12, -0x2

    .line 218
    invoke-direct {v0, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v10, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v10, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 225
    .line 226
    .line 227
    const/16 v0, 0x12

    .line 228
    .line 229
    invoke-static {v0}, LB0/a;->b(I)I

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    invoke-static {v0}, LB0/a;->b(I)I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    invoke-static {v0}, LB0/a;->b(I)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v8}, LB0/a;->b(I)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-virtual {v10, v13, v14, v0, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 246
    .line 247
    .line 248
    invoke-direct {v3}, Ls0/J;->getCARD_COLOR()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    const/16 v13, 0x14

    .line 253
    .line 254
    invoke-static {v13}, LB0/a;->b(I)I

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    const/4 v14, 0x0

    .line 259
    const/16 v15, 0x8

    .line 260
    .line 261
    invoke-static {v3, v0, v13, v14, v15}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v10, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Landroid/widget/LinearLayout;

    .line 269
    .line 270
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    invoke-direct {v0, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 275
    .line 276
    .line 277
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 278
    .line 279
    invoke-direct {v13, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 283
    .line 284
    .line 285
    const/16 v13, 0x10

    .line 286
    .line 287
    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 288
    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 292
    .line 293
    .line 294
    move/from16 v16, v5

    .line 295
    .line 296
    invoke-direct {v3}, Ls0/J;->getACCENT_BLUE()I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    const/16 v17, 0x22

    .line 301
    .line 302
    move/from16 v18, v8

    .line 303
    .line 304
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    move/from16 v19, v9

    .line 309
    .line 310
    const-string v9, "#"

    .line 311
    .line 312
    invoke-virtual {v3, v9, v5, v8}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 317
    .line 318
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    invoke-direct {v8, v9, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 327
    .line 328
    .line 329
    const/16 v9, 0xa

    .line 330
    .line 331
    invoke-static {v9}, LB0/a;->b(I)I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 342
    .line 343
    .line 344
    new-instance v5, Landroid/widget/LinearLayout;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 351
    .line 352
    .line 353
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 354
    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    invoke-direct {v8, v13, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 364
    .line 365
    .line 366
    new-instance v8, Landroid/widget/TextView;

    .line 367
    .line 368
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 373
    .line 374
    .line 375
    const-string v14, "\u81ea\u5b9a\u4e49\u641c\u7d22\u547d\u4ee4"

    .line 376
    .line 377
    invoke-static {v11, v12, v8, v14}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-direct {v3}, Ls0/J;->getTEXT_PRIMARY()I

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 385
    .line 386
    .line 387
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 388
    .line 389
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 390
    .line 391
    .line 392
    move/from16 v17, v15

    .line 393
    .line 394
    const/high16 v15, 0x41880000    # 17.0f

    .line 395
    .line 396
    invoke-virtual {v8, v6, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 400
    .line 401
    .line 402
    new-instance v8, Landroid/widget/TextView;

    .line 403
    .line 404
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    invoke-direct {v8, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 409
    .line 410
    .line 411
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 412
    .line 413
    invoke-direct {v15, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 414
    .line 415
    .line 416
    const/16 v21, 0x4

    .line 417
    .line 418
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    iput v7, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 423
    .line 424
    invoke-virtual {v8, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 425
    .line 426
    .line 427
    const-string v7, "\u8bbe\u7f6e\u5728\u5fae\u4fe1\u641c\u7d22\u6846\u89e6\u53d1\u914d\u7f6e\u9875\u9762\u548c\u540d\u5355\u7ba1\u7406\u7684\u547d\u4ee4"

    .line 428
    .line 429
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 437
    .line 438
    .line 439
    const/high16 v7, 0x41380000    # 11.5f

    .line 440
    .line 441
    invoke-virtual {v8, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 451
    .line 452
    .line 453
    new-instance v0, Landroid/view/View;

    .line 454
    .line 455
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-direct {v0, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 460
    .line 461
    .line 462
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 463
    .line 464
    invoke-static {v6}, LB0/a;->b(I)I

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    invoke-direct {v5, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 469
    .line 470
    .line 471
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 476
    .line 477
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 478
    .line 479
    .line 480
    move-result v7

    .line 481
    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 482
    .line 483
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 484
    .line 485
    .line 486
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 494
    .line 495
    .line 496
    new-instance v0, Landroid/widget/TextView;

    .line 497
    .line 498
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 503
    .line 504
    .line 505
    const-string v5, "\u641c\u7d22\u6846\u547d\u4ee4\u5feb\u6377\u6253\u5f00\u914d\u7f6e\u9762\u677f"

    .line 506
    .line 507
    invoke-static {v11, v12, v0, v5}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 511
    .line 512
    .line 513
    move-result v5

    .line 514
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 515
    .line 516
    .line 517
    const/high16 v5, 0x41400000    # 12.0f

    .line 518
    .line 519
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 526
    .line 527
    const/16 v7, 0x2e

    .line 528
    .line 529
    invoke-static {v7}, LB0/a;->b(I)I

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    invoke-direct {v0, v11, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 534
    .line 535
    .line 536
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 541
    .line 542
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 546
    .line 547
    .line 548
    new-instance v0, Landroid/widget/TextView;

    .line 549
    .line 550
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    invoke-direct {v0, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 555
    .line 556
    .line 557
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 558
    .line 559
    invoke-direct {v8, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 560
    .line 561
    .line 562
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 563
    .line 564
    .line 565
    move-result v15

    .line 566
    iput v15, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 567
    .line 568
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 569
    .line 570
    .line 571
    const-string v8, "\u5efa\u8bae\u4ee5 # \u5f00\u5934\uff0c\u4f8b\u5982 #hide"

    .line 572
    .line 573
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 574
    .line 575
    .line 576
    invoke-direct {v3}, Ls0/J;->getTEXT_TERTIARY()I

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 581
    .line 582
    .line 583
    const/high16 v8, 0x41300000    # 11.0f

    .line 584
    .line 585
    invoke-virtual {v0, v6, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 589
    .line 590
    .line 591
    new-instance v0, Landroid/widget/TextView;

    .line 592
    .line 593
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 594
    .line 595
    .line 596
    move-result-object v15

    .line 597
    invoke-direct {v0, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 598
    .line 599
    .line 600
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 601
    .line 602
    invoke-direct {v15, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 603
    .line 604
    .line 605
    move/from16 v21, v7

    .line 606
    .line 607
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 608
    .line 609
    .line 610
    move-result v7

    .line 611
    iput v7, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 612
    .line 613
    invoke-virtual {v0, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 614
    .line 615
    .line 616
    const-string v7, "\u641c\u7d22\u6846\u547d\u4ee4\u5feb\u6377\u6253\u5f00\u7ba1\u7406\u540d\u5355"

    .line 617
    .line 618
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 619
    .line 620
    .line 621
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 632
    .line 633
    .line 634
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 635
    .line 636
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    invoke-direct {v0, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 641
    .line 642
    .line 643
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 644
    .line 645
    .line 646
    move-result v5

    .line 647
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 648
    .line 649
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 653
    .line 654
    .line 655
    new-instance v0, Landroid/widget/TextView;

    .line 656
    .line 657
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 662
    .line 663
    .line 664
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 665
    .line 666
    invoke-direct {v5, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 667
    .line 668
    .line 669
    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 674
    .line 675
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 676
    .line 677
    .line 678
    const-string v5, "\u9ed8\u8ba4\u547d\u4ee4 #list"

    .line 679
    .line 680
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 681
    .line 682
    .line 683
    invoke-direct {v3}, Ls0/J;->getTEXT_TERTIARY()I

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v0, v6, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 694
    .line 695
    .line 696
    new-instance v7, Landroid/widget/LinearLayout;

    .line 697
    .line 698
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 703
    .line 704
    .line 705
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 706
    .line 707
    invoke-direct {v0, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 708
    .line 709
    .line 710
    invoke-static/range {v18 .. v18}, LB0/a;->b(I)I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 715
    .line 716
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v7, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 720
    .line 721
    .line 722
    new-instance v0, Landroid/widget/TextView;

    .line 723
    .line 724
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    invoke-direct {v0, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 729
    .line 730
    .line 731
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 732
    .line 733
    const/16 v8, 0x2a

    .line 734
    .line 735
    invoke-static {v8}, LB0/a;->b(I)I

    .line 736
    .line 737
    .line 738
    move-result v12

    .line 739
    invoke-direct {v5, v13, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 740
    .line 741
    .line 742
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 743
    .line 744
    .line 745
    move-result v12

    .line 746
    invoke-virtual {v5, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 750
    .line 751
    .line 752
    const/16 v5, 0x11

    .line 753
    .line 754
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 755
    .line 756
    .line 757
    const-string v5, "\u53d6\u6d88"

    .line 758
    .line 759
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 760
    .line 761
    .line 762
    invoke-direct {v3}, Ls0/J;->getTEXT_SECONDARY()I

    .line 763
    .line 764
    .line 765
    move-result v5

    .line 766
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 770
    .line 771
    .line 772
    const/high16 v5, 0x41600000    # 14.0f

    .line 773
    .line 774
    invoke-virtual {v0, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 775
    .line 776
    .line 777
    invoke-direct {v3}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 778
    .line 779
    .line 780
    move-result v12

    .line 781
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 782
    .line 783
    .line 784
    move-result v15

    .line 785
    invoke-direct {v3}, Ls0/J;->getDIVIDER_COLOR()I

    .line 786
    .line 787
    .line 788
    move-result v18

    .line 789
    move/from16 v21, v8

    .line 790
    .line 791
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    invoke-static {v6}, LB0/a;->b(I)I

    .line 796
    .line 797
    .line 798
    move-result v5

    .line 799
    invoke-static {v12, v15, v8, v5}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 800
    .line 801
    .line 802
    move-result-object v5

    .line 803
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 804
    .line 805
    .line 806
    new-instance v5, Ls0/u;

    .line 807
    .line 808
    const/4 v8, 0x3

    .line 809
    invoke-direct {v5, v4, v8}, Ls0/u;-><init>(LN0/l;I)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 816
    .line 817
    .line 818
    new-instance v8, Landroid/widget/TextView;

    .line 819
    .line 820
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 825
    .line 826
    .line 827
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 828
    .line 829
    invoke-static/range {v21 .. v21}, LB0/a;->b(I)I

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    invoke-direct {v0, v13, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 834
    .line 835
    .line 836
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v8, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 844
    .line 845
    .line 846
    const/16 v5, 0x11

    .line 847
    .line 848
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 849
    .line 850
    .line 851
    const-string v0, "\u4fdd\u5b58"

    .line 852
    .line 853
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 860
    .line 861
    .line 862
    const/high16 v0, 0x41600000    # 14.0f

    .line 863
    .line 864
    invoke-virtual {v8, v6, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 865
    .line 866
    .line 867
    invoke-direct {v3}, Ls0/J;->getACCENT_TEAL()I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    .line 872
    .line 873
    .line 874
    move-result v5

    .line 875
    move/from16 v11, v17

    .line 876
    .line 877
    const/4 v9, 0x0

    .line 878
    invoke-static {v3, v0, v5, v9, v11}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-virtual {v8, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 883
    .line 884
    .line 885
    new-instance v0, Ls0/C;

    .line 886
    .line 887
    const/4 v5, 0x1

    .line 888
    invoke-direct/range {v0 .. v5}, Ls0/C;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ls0/J;LN0/l;I)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 898
    .line 899
    .line 900
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 901
    .line 902
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0, v10}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    iput-object v0, v4, LN0/l;->a:Ljava/lang/Object;

    .line 918
    .line 919
    const-string v1, "dialog"

    .line 920
    .line 921
    if-eqz v0, :cond_3

    .line 922
    .line 923
    new-instance v2, Ls0/r;

    .line 924
    .line 925
    const/4 v5, 0x4

    .line 926
    invoke-direct {v2, v4, v5}, Ls0/r;-><init>(LN0/l;I)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 930
    .line 931
    .line 932
    iget-object v0, v4, LN0/l;->a:Ljava/lang/Object;

    .line 933
    .line 934
    if-eqz v0, :cond_2

    .line 935
    .line 936
    check-cast v0, Landroid/app/AlertDialog;

    .line 937
    .line 938
    invoke-virtual {v3, v0, v6}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 939
    .line 940
    .line 941
    return-void

    .line 942
    :cond_2
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    const/16 v20, 0x0

    .line 946
    .line 947
    throw v20

    .line 948
    :cond_3
    const/16 v20, 0x0

    .line 949
    .line 950
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    throw v20
.end method

.method public final R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLo0/b;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p5

    move-object/from16 v2, p7

    move/from16 v3, p8

    .line 1
    new-instance v4, LN0/l;

    .line 2
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    const/4 v8, -0x2

    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v6, 0x1

    .line 5
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v9, 0x12

    .line 6
    invoke-static {v9}, LB0/a;->b(I)I

    move-result v10

    invoke-static {v9}, LB0/a;->b(I)I

    move-result v11

    invoke-static {v9}, LB0/a;->b(I)I

    move-result v9

    const/16 v12, 0xe

    invoke-static {v12}, LB0/a;->b(I)I

    move-result v13

    invoke-virtual {v5, v10, v11, v9, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 7
    invoke-direct {v0}, Ls0/J;->getCARD_COLOR()I

    move-result v9

    const/16 v10, 0x14

    invoke-static {v10}, LB0/a;->b(I)I

    move-result v10

    const/4 v11, 0x0

    const/16 v13, 0x8

    invoke-static {v0, v9, v10, v11, v13}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 8
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 9
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v10, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v10, 0x10

    .line 10
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v10, 0x0

    .line 11
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v14, 0x22

    .line 12
    invoke-static {v14}, LB0/a;->b(I)I

    move-result v15

    move/from16 v16, v12

    move-object/from16 v12, p4

    invoke-virtual {v0, v12, v1, v15}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    move-result-object v12

    .line 13
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    move/from16 v17, v14

    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    move-result v14

    invoke-static/range {v17 .. v17}, LB0/a;->b(I)I

    move-result v11

    invoke-direct {v15, v14, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v11, 0xa

    .line 14
    invoke-static {v11}, LB0/a;->b(I)I

    move-result v14

    invoke-virtual {v15, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 15
    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    new-instance v12, Landroid/widget/LinearLayout;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v12, v14}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 18
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v10, v8, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-virtual {v12, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 20
    new-instance v14, Landroid/widget/TextView;

    move/from16 p4, v11

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v14, v11}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v11, p1

    .line 21
    invoke-static {v7, v8, v14, v11}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 22
    invoke-direct {v0}, Ls0/J;->getTEXT_PRIMARY()I

    move-result v11

    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v13, 0x41880000    # 17.0f

    .line 24
    invoke-virtual {v14, v6, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 25
    invoke-virtual {v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    new-instance v13, Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v13, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 27
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v14, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v19, 0x4

    .line 28
    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    move-result v15

    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 29
    invoke-virtual {v13, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v14, p2

    .line 30
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    move-result v14

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v14, 0x41380000    # 11.5f

    .line 32
    invoke-virtual {v13, v6, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 33
    invoke-virtual {v12, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 34
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 36
    new-instance v9, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v9, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 37
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v6}, LB0/a;->b(I)I

    move-result v13

    invoke-direct {v12, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 38
    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    move-result v13

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 39
    invoke-static/range {p4 .. p4}, LB0/a;->b(I)I

    move-result v13

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 40
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v9, p3

    .line 43
    invoke-virtual {v0, v9}, Ls0/J;->F(Ljava/lang/String;)Landroid/widget/ScrollView;

    move-result-object v9

    .line 44
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    move-result v12

    invoke-static/range {v16 .. v16}, LB0/a;->b(I)I

    move-result v13

    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6}, LB0/a;->b(I)I

    move-result v15

    invoke-static {v12, v13, v14, v15}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v12

    invoke-virtual {v9, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    new-instance v9, Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v9, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 48
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v8, 0xc

    .line 49
    invoke-static {v8}, LB0/a;->b(I)I

    move-result v13

    iput v13, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 50
    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/high16 v12, 0x41600000    # 14.0f

    const/16 v13, 0x11

    if-eqz v2, :cond_0

    move/from16 p1, v8

    .line 52
    new-instance v8, Landroid/widget/TextView;

    const/16 p2, 0x6

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-direct {v8, v14}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 53
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/16 p3, 0x2a

    invoke-static/range {p3 .. p3}, LB0/a;->b(I)I

    move-result v15

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v14, v10, v15, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 54
    invoke-static/range {p2 .. p2}, LB0/a;->b(I)I

    move-result v7

    invoke-virtual {v14, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 55
    invoke-virtual {v8, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setGravity(I)V

    .line 57
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    invoke-direct {v0}, Ls0/J;->getTEXT_SECONDARY()I

    move-result v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 60
    invoke-virtual {v8, v6, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 61
    invoke-direct {v0}, Ls0/J;->getFIELD_BG_COLOR()I

    move-result v7

    invoke-static/range {p1 .. p1}, LB0/a;->b(I)I

    move-result v14

    invoke-direct {v0}, Ls0/J;->getDIVIDER_COLOR()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move/from16 v19, v6

    invoke-static/range {v19 .. v19}, LB0/a;->b(I)I

    move-result v6

    invoke-static {v7, v14, v15, v6}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 62
    new-instance v6, Ls0/u;

    const/4 v7, 0x5

    invoke-direct {v6, v4, v7}, Ls0/u;-><init>(LN0/l;I)V

    invoke-virtual {v8, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    move/from16 v19, v6

    move/from16 p1, v8

    const/16 p2, 0x6

    const/16 p3, 0x2a

    .line 64
    :goto_0
    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 65
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static/range {p3 .. p3}, LB0/a;->b(I)I

    move-result v8

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-direct {v7, v10, v8, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    if-eqz v2, :cond_1

    .line 66
    invoke-static/range {p2 .. p2}, LB0/a;->b(I)I

    move-result v2

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 67
    :cond_1
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setGravity(I)V

    move-object/from16 v2, p6

    .line 69
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, -0x1

    .line 70
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    move/from16 v2, v19

    .line 72
    invoke-virtual {v6, v2, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 73
    invoke-static/range {p1 .. p1}, LB0/a;->b(I)I

    move-result v2

    const/4 v7, 0x0

    const/16 v8, 0x8

    invoke-static {v0, v1, v2, v7, v8}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 74
    new-instance v1, Lr0/F1;

    const/16 v2, 0x8

    move-object/from16 v7, p9

    invoke-direct {v1, v7, v4, v2}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 76
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 78
    invoke-virtual {v1, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 79
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 80
    iput-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    .line 81
    const-string v2, "dialog"

    if-eqz v1, :cond_5

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 82
    iget-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    if-eqz v1, :cond_4

    check-cast v1, Landroid/app/AlertDialog;

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 83
    iget-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    if-eqz v1, :cond_3

    check-cast v1, Landroid/app/AlertDialog;

    new-instance v3, Ls0/r;

    const/4 v5, 0x6

    invoke-direct {v3, v4, v5}, Ls0/r;-><init>(LN0/l;I)V

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 84
    iget-object v1, v4, LN0/l;->a:Ljava/lang/Object;

    if-eqz v1, :cond_2

    check-cast v1, Landroid/app/AlertDialog;

    const/4 v2, 0x1

    .line 85
    invoke-virtual {v0, v1, v2}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    return-void

    .line 86
    :cond_2
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    const/16 v18, 0x0

    throw v18

    :cond_3
    const/16 v18, 0x0

    .line 87
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    throw v18

    :cond_4
    const/16 v18, 0x0

    .line 88
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    throw v18

    :cond_5
    const/16 v18, 0x0

    .line 89
    invoke-static {v2}, LN0/g;->g(Ljava/lang/String;)V

    throw v18
.end method

.method public final T(Landroid/widget/Switch;)V
    .locals 4

    .line 1
    const v0, 0x3f47ae14    # 0.78f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 8
    .line 9
    .line 10
    const v0, 0x10100a0

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, -0x10100a0

    .line 18
    .line 19
    .line 20
    filled-new-array {v1}, [I

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    filled-new-array {v0, v1}, [[I

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    invoke-direct {p0}, Ls0/J;->getACCENT_TEAL()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const v3, -0xc0a0a

    .line 35
    .line 36
    .line 37
    filled-new-array {v2, v3}, [I

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-direct {v1, v0, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 48
    .line 49
    const v2, -0x401218

    .line 50
    .line 51
    .line 52
    const v3, -0x2f2926

    .line 53
    .line 54
    .line 55
    filled-new-array {v2, v3}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {v1, v0, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final U(Landroid/widget/LinearLayout;)Landroid/view/View;
    .locals 6

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->v()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 19
    .line 20
    const/16 v2, 0x40

    .line 21
    .line 22
    invoke-static {v2}, LB0/a;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr v1, v2

    .line 27
    const/16 v2, 0x104

    .line 28
    .line 29
    invoke-static {v2}, LB0/a;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v1, v2, :cond_1

    .line 34
    .line 35
    move v1, v2

    .line 36
    :cond_1
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 37
    .line 38
    const/16 v2, 0x78

    .line 39
    .line 40
    invoke-static {v2}, LB0/a;->b(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-int/2addr v0, v2

    .line 45
    const/16 v2, 0x1a4

    .line 46
    .line 47
    invoke-static {v2}, LB0/a;->b(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ge v0, v2, :cond_2

    .line 52
    .line 53
    move v0, v2

    .line 54
    :cond_2
    new-instance v2, Landroid/widget/FrameLayout;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 64
    .line 65
    const/4 v4, -0x1

    .line 66
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 77
    .line 78
    const/16 v4, 0x11

    .line 79
    .line 80
    invoke-direct {v3, v1, v0, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/16 v1, 0x14

    .line 91
    .line 92
    invoke-static {v1}, LB0/a;->b(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const/4 v4, 0x1

    .line 105
    invoke-static {v4}, LB0/a;->b(I)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-static {v0, v1, v3, v5}, Ls0/J;->J(IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-static {v0}, LB0/a;->a(F)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {p1, v0}, Landroid/view/View;->setElevation(F)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v4}, Landroid/view/View;->setClipToOutline(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    return-object v2
.end method

.method public final a()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-boolean v1, Lz0/i;->a:Z

    .line 3
    .line 4
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Ls0/J;->j:Landroid/widget/EditText;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v2, v3

    .line 25
    :goto_0
    const-string v4, ""

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move-object v2, v4

    .line 30
    :cond_1
    iget-object v5, p0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 31
    .line 32
    invoke-virtual {v5, v2}, Lcom/lu/wxmask/bean/OptionData;->setTripleTapPassword(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Ls0/J;->k:Landroid/widget/EditText;

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :cond_2
    if-nez v3, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v4, v3

    .line 53
    :goto_1
    invoke-virtual {v5, v4}, Lcom/lu/wxmask/bean/OptionData;->setQuickAddMenuTitle(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    sget-object v2, LB0/a;->a:Ljava/util/HashMap;

    .line 57
    .line 58
    sget-object v2, Lg0/a;->a:LT/l;

    .line 59
    .line 60
    invoke-virtual {v2, v5}, LT/l;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v4, "toJson(...)"

    .line 65
    .line 66
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v1}, LT/l;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    const-string v2, "\u63d0\u793a"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "\u662f\u5426\u4fdd\u5b58\u4fee\u6539\uff1f"

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Ls0/y;

    .line 118
    .line 119
    invoke-direct {v2, v0, p0}, Ls0/y;-><init>(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const-string v3, "\u53d6\u6d88"

    .line 123
    .line 124
    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v2, Ls0/y;

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    invoke-direct {v2, v3, p0}, Ls0/y;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const-string v3, "\u786e\u5b9a"

    .line 135
    .line 136
    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v2, "create(...)"

    .line 145
    .line 146
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v1, v0}, Ls0/J;->M(Landroid/app/AlertDialog;Z)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_5
    invoke-virtual {p0}, Ls0/J;->G()V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final e(Lt0/c;)Landroid/view/View;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LO/a;->j(Ls0/J;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 11
    .line 12
    invoke-static {}, Lz0/g;->v()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    .line 39
    const/4 v2, -0x1

    .line 40
    const/4 v3, -0x2

    .line 41
    invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-virtual {p1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Ls0/J;->getTitleBar()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Landroid/widget/ScrollView;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-direct {v0, v4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 75
    .line 76
    invoke-direct {v4, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, Ls0/J;->getPAGE_BG_COLOR()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Ls0/J;->getContent()Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ls0/J;->U(Landroid/widget/LinearLayout;)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1
.end method

.method public final getMOptionData()Lcom/lu/wxmask/bean/OptionData;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMQuickAddMenuTitleEdit()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/J;->k:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMTripleTapPasswordEdit()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/J;->j:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Landroid/widget/LinearLayout;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    const/4 v3, -0x2

    .line 14
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-static {v2}, LB0/a;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 24
    .line 25
    invoke-static {v2}, LB0/a;->b(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 30
    .line 31
    const/16 v2, 0xe

    .line 32
    .line 33
    invoke-static {v2}, LB0/a;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ls0/J;->getCARD_COLOR()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {p0, v1, v3, v4, v2}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    const/high16 v1, 0x3f000000    # 0.5f

    .line 60
    .line 61
    invoke-static {v1}, LB0/a;->a(F)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public final r(Ljava/lang/String;II)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    invoke-direct {v1, p3, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x11

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x28

    .line 35
    .line 36
    invoke-static {p1}, LB0/a;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-lt p3, p1, :cond_0

    .line 41
    .line 42
    const/high16 p1, 0x41800000    # 16.0f

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/16 p1, 0x1e

    .line 46
    .line 47
    invoke-static {p1}, LB0/a;->b(I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lt p3, p1, :cond_1

    .line 52
    .line 53
    const/high16 p1, 0x41500000    # 13.0f

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/16 p1, 0x16

    .line 57
    .line 58
    invoke-static {p1}, LB0/a;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-lt p3, p1, :cond_2

    .line 63
    .line 64
    const/high16 p1, 0x41300000    # 11.0f

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/high16 p1, 0x41000000    # 8.0f

    .line 68
    .line 69
    :goto_0
    const/4 p3, 0x1

    .line 70
    invoke-virtual {v0, p3, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Ls0/J;->S(I)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/16 p2, 0x8

    .line 78
    .line 79
    invoke-static {p2}, LB0/a;->b(I)I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-static {p0, p1, p3, v1, p2}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;)Landroid/widget/FrameLayout;
    .locals 9

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    const/4 v3, -0x2

    .line 14
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 15
    .line 16
    .line 17
    const/16 v4, 0x10

    .line 18
    .line 19
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/16 v1, 0x2e

    .line 31
    .line 32
    :goto_0
    invoke-static {v1}, LB0/a;->b(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/16 v1, 0x3c

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 41
    .line 42
    .line 43
    const/16 v1, 0xa

    .line 44
    .line 45
    invoke-static {v1}, LB0/a;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/16 v5, 0x8

    .line 50
    .line 51
    invoke-static {v5}, LB0/a;->b(I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-static {v1}, LB0/a;->b(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {v5}, LB0/a;->b(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v0, v4, v6, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Ls0/J;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p0, p1}, Ls0/J;->y(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/16 v6, 0x1c

    .line 79
    .line 80
    invoke-static {v6}, LB0/a;->b(I)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    invoke-virtual {p0, v4, v5, v7}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 89
    .line 90
    invoke-static {v6}, LB0/a;->b(I)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-static {v6}, LB0/a;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-direct {v5, v7, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 99
    .line 100
    .line 101
    const v6, 0x800013

    .line 102
    .line 103
    .line 104
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    new-instance v4, Landroid/widget/LinearLayout;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 122
    .line 123
    invoke-direct {v5, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 124
    .line 125
    .line 126
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 127
    .line 128
    const/16 v6, 0x28

    .line 129
    .line 130
    invoke-static {v6}, LB0/a;->b(I)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 135
    .line 136
    .line 137
    const/16 v7, 0x26

    .line 138
    .line 139
    invoke-static {v7}, LB0/a;->b(I)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 147
    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 151
    .line 152
    .line 153
    new-instance v7, Landroid/widget/TextView;

    .line 154
    .line 155
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v3, v7, p1}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 170
    .line 171
    .line 172
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 173
    .line 174
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 175
    .line 176
    .line 177
    const p1, 0x416ccccd    # 14.8f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v5, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_1

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_1
    new-instance p1, Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-direct {p1, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 203
    .line 204
    invoke-direct {v7, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 205
    .line 206
    .line 207
    const/4 v8, 0x3

    .line 208
    invoke-static {v8}, LB0/a;->b(I)I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 213
    .line 214
    invoke-virtual {p1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 225
    .line 226
    .line 227
    const/high16 p2, 0x41380000    # 11.5f

    .line 228
    .line 229
    invoke-virtual {p1, v5, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 233
    .line 234
    .line 235
    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 236
    .line 237
    .line 238
    new-instance p1, Landroid/widget/TextView;

    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-direct {p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 245
    .line 246
    .line 247
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 248
    .line 249
    invoke-direct {p2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 250
    .line 251
    .line 252
    const v3, 0x800015

    .line 253
    .line 254
    .line 255
    iput v3, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    .line 259
    .line 260
    const-string p2, "\u203a"

    .line 261
    .line 262
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    const/high16 p2, 0x41c00000    # 24.0f

    .line 266
    .line 267
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 268
    .line 269
    .line 270
    invoke-direct {p0}, Ls0/J;->getTEXT_TERTIARY()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    const-string v3, "<this>"

    .line 275
    .line 276
    invoke-static {p1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    const-string v4, "getContext(...)"

    .line 284
    .line 285
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 297
    .line 298
    and-int/lit8 v3, v3, 0x30

    .line 299
    .line 300
    const/16 v4, 0x20

    .line 301
    .line 302
    if-ne v3, v4, :cond_2

    .line 303
    .line 304
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    rsub-int v4, v4, 0xff

    .line 321
    .line 322
    rsub-int v7, v7, 0xff

    .line 323
    .line 324
    rsub-int p2, p2, 0xff

    .line 325
    .line 326
    invoke-static {v3, v4, v7, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 335
    .line 336
    .line 337
    :goto_3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    new-instance p1, Landroid/view/View;

    .line 341
    .line 342
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 347
    .line 348
    .line 349
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 350
    .line 351
    invoke-static {v5}, LB0/a;->b(I)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    invoke-direct {p2, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 356
    .line 357
    .line 358
    const/16 v3, 0x50

    .line 359
    .line 360
    iput v3, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 361
    .line 362
    invoke-static {v6}, LB0/a;->b(I)I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 370
    .line 371
    .line 372
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 380
    .line 381
    .line 382
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 383
    .line 384
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 385
    .line 386
    .line 387
    int-to-float p2, v1

    .line 388
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 395
    .line 396
    .line 397
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 398
    .line 399
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v3, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 413
    .line 414
    .line 415
    new-instance p2, Landroid/graphics/drawable/RippleDrawable;

    .line 416
    .line 417
    const v1, 0x33aaaaaa

    .line 418
    .line 419
    .line 420
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-direct {p2, v1, p1, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v5}, Landroid/view/View;->setClickable(Z)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 431
    .line 432
    .line 433
    return-object v0
.end method

.method public final setMQuickAddMenuTitleEdit(Landroid/widget/EditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/J;->k:Landroid/widget/EditText;

    .line 2
    .line 3
    return-void
.end method

.method public final setMTripleTapPasswordEdit(Landroid/widget/EditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/J;->j:Landroid/widget/EditText;

    .line 2
    .line 3
    return-void
.end method

.method public final t(Ljava/lang/String;)Landroid/widget/EditText;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/16 v2, 0x26

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    const/high16 v3, 0x3f800000    # 1.0f

    .line 23
    .line 24
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 25
    .line 26
    const/16 v3, 0x10

    .line 27
    .line 28
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, LB0/a;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 45
    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    invoke-static {v2}, LB0/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v1}, LB0/a;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-static {v2}, LB0/a;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-static {v1}, LB0/a;->b(I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v0, v3, v4, v2, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Ls0/J;->getFIELD_BG_COLOR()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x4

    .line 73
    invoke-static {v3}, LB0/a;->b(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-direct {p0}, Ls0/J;->getDIVIDER_COLOR()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const/16 v5, 0x8

    .line 86
    .line 87
    invoke-static {p0, v2, v3, v4, v5}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 106
    .line 107
    .line 108
    const v2, 0x412ccccd    # 10.8f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    return-object v0
.end method

.method public final u(Ljava/lang/String;)Landroid/widget/TextView;
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x10

    .line 23
    .line 24
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, LB0/a;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {v2}, LB0/a;->b(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v0, v1, v3, v4, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    const v2, 0x412ccccd    # 10.8f

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final v()Landroid/widget/ImageView;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/16 v2, 0xf

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v2}, LB0/a;->b(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x6

    .line 26
    invoke-static {v2}, LB0/a;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x10

    .line 34
    .line 35
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Ls0/J;->o:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v1, Ls0/L;->a:[B

    .line 46
    .line 47
    array-length v2, v1

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {v1, v3, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iput-object v1, p0, Ls0/J;->o:Landroid/graphics/Bitmap;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v1, 0x0

    .line 59
    :goto_0
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x3a

    .line 65
    .line 66
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 73
    .line 74
    .line 75
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILM0/a;)Landroid/widget/LinearLayout;
    .locals 8

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/16 v2, 0x34

    .line 13
    .line 14
    invoke-static {v2}, LB0/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    .line 33
    .line 34
    const/16 v2, 0x8

    .line 35
    .line 36
    invoke-static {v2}, LB0/a;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x6

    .line 41
    invoke-static {v5}, LB0/a;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v2}, LB0/a;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-static {v5}, LB0/a;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v0, v4, v6, v7, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 54
    .line 55
    .line 56
    const/16 v4, 0xc

    .line 57
    .line 58
    invoke-static {v4}, LB0/a;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-static {p0, v1, v4, v5, v2}, Ls0/J;->K(Ls0/J;IILjava/lang/Integer;I)Landroid/graphics/drawable/GradientDrawable;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    const/16 v2, 0x1c

    .line 71
    .line 72
    invoke-static {v2}, LB0/a;->b(I)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {p0, p3, p4, v4}, Ls0/J;->r(Ljava/lang/String;II)Landroid/widget/TextView;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    new-instance p4, Landroid/widget/LinearLayout$LayoutParams;

    .line 81
    .line 82
    invoke-static {v2}, LB0/a;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-static {v2}, LB0/a;->b(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-direct {p4, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 91
    .line 92
    .line 93
    const/16 v2, 0xa

    .line 94
    .line 95
    invoke-static {v2}, LB0/a;->b(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {p4, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    new-instance p3, Landroid/widget/LinearLayout;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    invoke-direct {p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    new-instance p4, Landroid/widget/LinearLayout$LayoutParams;

    .line 118
    .line 119
    const/4 v2, -0x2

    .line 120
    const/high16 v4, 0x3f800000    # 1.0f

    .line 121
    .line 122
    invoke-direct {p4, v1, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p3, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    .line 127
    .line 128
    const/4 p4, 0x1

    .line 129
    invoke-virtual {p3, p4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 130
    .line 131
    .line 132
    new-instance v1, Landroid/widget/TextView;

    .line 133
    .line 134
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-direct {v1, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v2, v1, p1}, LL/d;->n(IILandroid/widget/TextView;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p0}, Ls0/J;->getTEXT_PRIMARY()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    .line 150
    .line 151
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 154
    .line 155
    .line 156
    const/high16 p1, 0x41600000    # 14.0f

    .line 157
    .line 158
    invoke-virtual {v1, p4, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    new-instance p1, Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-direct {p1, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 174
    .line 175
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 176
    .line 177
    .line 178
    const/4 v2, 0x2

    .line 179
    invoke-static {v2}, LB0/a;->b(I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 184
    .line 185
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {p0}, Ls0/J;->getTEXT_SECONDARY()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 196
    .line 197
    .line 198
    const/high16 p2, 0x41280000    # 10.5f

    .line 199
    .line 200
    invoke-virtual {p1, p4, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 207
    .line 208
    .line 209
    new-instance p1, Ls0/t;

    .line 210
    .line 211
    const/4 p2, 0x1

    .line 212
    invoke-direct {p1, p5, p2}, Ls0/t;-><init>(LM0/a;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    .line 217
    .line 218
    return-object v0
.end method

.method public final y(Ljava/lang/String;)I
    .locals 2

    .line 1
    const-string v0, "\u5feb\u6377"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Ls0/J;->getACCENT_ORANGE()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    const-string v0, "\u5bc6\u53cb"

    .line 16
    .line 17
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_b

    .line 22
    .line 23
    const-string v0, "\u901a\u8baf\u5f55"

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_1
    const-string v0, "\u641c\u7d22"

    .line 34
    .line 35
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-direct {p0}, Ls0/J;->getACCENT_GREEN()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    const-string v0, "\u670b\u53cb\u5708"

    .line 47
    .line 48
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_a

    .line 53
    .line 54
    const-string v0, "\u70b9\u8d5e"

    .line 55
    .line 56
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_a

    .line 61
    .line 62
    const-string v0, "\u8bc4\u8bba"

    .line 63
    .line 64
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const-string v0, "\u6d88\u606f"

    .line 72
    .line 73
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_9

    .line 78
    .line 79
    const-string v0, "\u9707\u52a8"

    .line 80
    .line 81
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_9

    .line 86
    .line 87
    const-string v0, "\u52a0\u7c97"

    .line 88
    .line 89
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    const-string v0, "\u89d2\u6807"

    .line 96
    .line 97
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    const-string v0, "\u8bed\u97f3"

    .line 105
    .line 106
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_8

    .line 111
    .line 112
    const-string v0, "\u89c6\u9891"

    .line 113
    .line 114
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_5
    const-string v0, "\u5bc6\u7801"

    .line 122
    .line 123
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    invoke-direct {p0}, Ls0/J;->getACCENT_BLUE()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    return p1

    .line 134
    :cond_6
    const-string v0, "\u540d\u5355"

    .line 135
    .line 136
    invoke-static {p1, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_7

    .line 141
    .line 142
    invoke-direct {p0}, Ls0/J;->getACCENT_TEAL()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    return p1

    .line 147
    :cond_7
    invoke-direct {p0}, Ls0/J;->getACCENT_TEAL()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    return p1

    .line 152
    :cond_8
    :goto_0
    invoke-direct {p0}, Ls0/J;->getACCENT_PINK()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    return p1

    .line 157
    :cond_9
    :goto_1
    invoke-direct {p0}, Ls0/J;->getACCENT_TEAL()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    return p1

    .line 162
    :cond_a
    :goto_2
    invoke-direct {p0}, Ls0/J;->getACCENT_PINK()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    return p1

    .line 167
    :cond_b
    :goto_3
    invoke-direct {p0}, Ls0/J;->getACCENT_PURPLE()I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    return p1
.end method
