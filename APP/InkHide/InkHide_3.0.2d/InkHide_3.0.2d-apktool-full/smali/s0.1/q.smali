.class public final Ls0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/widget/EditText;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/widget/EditText;

.field public final e:Landroid/widget/EditText;

.field public final f:Ljava/util/ArrayList;

.field public final g:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/lu/wxmask/bean/MaskItemBean;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/high16 v2, 0x41c00000    # 24.0f

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    float-to-int v0, v0

    .line 20
    new-instance v2, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 26
    .line 27
    const/4 v4, -0x1

    .line 28
    const/4 v5, -0x2

    .line 29
    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Ls0/q;->a:Landroid/widget/LinearLayout;

    .line 42
    .line 43
    new-instance v0, Landroid/widget/EditText;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    const-string v3, "\u5bc6\u53cbID\uff08\u6293\u53d6\u83b7\u5f97\uff09"

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Ls0/q;->b:Landroid/widget/EditText;

    .line 61
    .line 62
    new-instance v3, Landroid/widget/EditText;

    .line 63
    .line 64
    invoke-direct {v3, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    const-string v6, "\u5907\u6ce8\uff08\u53ef\u7a7a\uff0c\u4ec5\u7528\u4e8e\u663e\u793a\uff09"

    .line 68
    .line 69
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    iput-object v3, p0, Ls0/q;->c:Landroid/widget/EditText;

    .line 80
    .line 81
    new-instance v6, Landroid/widget/EditText;

    .line 82
    .line 83
    invoke-direct {v6, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    const-string v7, "\u7cca\u8138\u63d0\u793a\uff0c\u5982\uff1a\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    .line 87
    .line 88
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/MaskItemBean;->getTipMode()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    const/16 v8, 0x8

    .line 96
    .line 97
    const/16 v9, 0x2766

    .line 98
    .line 99
    if-eqz v7, :cond_1

    .line 100
    .line 101
    if-eq v7, v9, :cond_0

    .line 102
    .line 103
    const-string v7, "\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    sget-object v7, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    .line 110
    .line 111
    invoke-virtual {v7, p2}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;->from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->getMess()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    sget-object v7, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    .line 127
    .line 128
    invoke-virtual {v7, p2}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;->from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v7}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->getMess()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    :goto_0
    iput-object v6, p0, Ls0/q;->d:Landroid/widget/EditText;

    .line 140
    .line 141
    new-instance v7, Landroid/widget/EditText;

    .line 142
    .line 143
    invoke-direct {v7, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    const-string v10, "\u53d8\u8138\u5bf9\u8c61\uff0c\u5fae\u4fe1\u56e2\u961f\uff1aweixin\uff0c\u8ba2\u9605\u53f7\uff1aofficialaccounts\uff0c\u5fae\u4fe1\u8fd0\u52a8\uff1agh_43f2581f6fd6 \u7b49"

    .line 147
    .line 148
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/lu/wxmask/bean/MaskItemBean;->getMapId()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {v7, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    iput-object v7, p0, Ls0/q;->e:Landroid/widget/EditText;

    .line 159
    .line 160
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    new-instance v7, LE0/c;

    .line 165
    .line 166
    const-string v9, "\u9759\u9ed8\u6a21\u5f0f"

    .line 167
    .line 168
    invoke-direct {v7, p2, v9}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    filled-new-array {v7}, [LE0/c;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    new-instance v7, Ljava/util/ArrayList;

    .line 176
    .line 177
    new-instance v9, LF0/g;

    .line 178
    .line 179
    invoke-direct {v9, p2, v1}, LF0/g;-><init>([Ljava/lang/Object;Z)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 183
    .line 184
    .line 185
    iput-object v7, p0, Ls0/q;->f:Ljava/util/ArrayList;

    .line 186
    .line 187
    new-instance p2, Landroid/widget/Spinner;

    .line 188
    .line 189
    invoke-direct {p2, p1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V

    .line 190
    .line 191
    .line 192
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 193
    .line 194
    invoke-direct {p1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 198
    .line 199
    .line 200
    new-instance p1, Lw0/a;

    .line 201
    .line 202
    invoke-direct {p1}, Ln0/b;-><init>()V

    .line 203
    .line 204
    .line 205
    iget-object v1, p1, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 217
    .line 218
    .line 219
    new-instance p1, Li/z0;

    .line 220
    .line 221
    const/4 v1, 0x2

    .line 222
    invoke-direct {p1, v1, p0}, Li/z0;-><init>(ILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 226
    .line 227
    .line 228
    iput-object p2, p0, Ls0/q;->g:Landroid/widget/Spinner;

    .line 229
    .line 230
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 231
    .line 232
    invoke-direct {p1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 233
    .line 234
    .line 235
    const/4 v1, 0x4

    .line 236
    invoke-static {v1}, LB0/a;->b(I)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    iput v1, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 241
    .line 242
    invoke-virtual {v2, v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, p2, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v6, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 252
    .line 253
    .line 254
    return-void
.end method
