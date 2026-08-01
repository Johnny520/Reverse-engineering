.class final Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VideoBookmarkAdapter"
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final data:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;",
            ">;"
        }
    .end annotation
.end field

.field private onChanged:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method

.method private static final getView$lambda$1(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-static {p2, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$jumpToVideo(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final getView$lambda$2(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->onChanged:Lp70;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 18
    .line 19
    const-string p1, "\u5df2\u5220\u9664\u4f5c\u54c1\u4e66\u7b7e"

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic α(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getView$lambda$2(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getView$lambda$1(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    move-result-object p0

    return-object p0
.end method

.method public getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getOnChanged()Lp70;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp70;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    return-object p0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lx01;->α:Lx01;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const v0, 0x7f0c005f

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_1
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 30
    .line 31
    invoke-static {p3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$applyVideoItemTheme(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/view/View;Lxx;)V

    .line 41
    .line 42
    .line 43
    const p3, 0x7f090206

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    check-cast p3, Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-static {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$resolveWorkIcon(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x1c

    .line 60
    .line 61
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/16 v3, 0x2a

    .line 66
    .line 67
    invoke-static {v0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;I)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$dp(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;I)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {p3, v2, v4, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getCoverUrl()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v0, v1, v2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$loadCoverAsync(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 89
    .line 90
    .line 91
    const p3, 0x7f090376

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    check-cast p3, Landroid/widget/TextView;

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->displayTitle()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    const p3, 0x7f09031e

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    check-cast p3, Landroid/widget/TextView;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->displayAuthor()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v3, "@"

    .line 123
    .line 124
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    const p3, 0x7f09032d

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    check-cast p3, Landroid/widget/TextView;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getDiggCount()J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    invoke-static {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$formatCount(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v3, "\u8d5e "

    .line 157
    .line 158
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    const p3, 0x7f090325

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    check-cast p3, Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getCommentCount()J

    .line 181
    .line 182
    .line 183
    move-result-wide v1

    .line 184
    invoke-static {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$formatCount(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v3, "\u8bc4 "

    .line 191
    .line 192
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    const p3, 0x7f090324

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    check-cast p3, Landroid/widget/TextView;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getCollectCount()J

    .line 215
    .line 216
    .line 217
    move-result-wide v1

    .line 218
    invoke-static {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$formatCount(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;J)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    new-instance v1, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v2, "\u85cf "

    .line 225
    .line 226
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    const p3, 0x7f090349

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object p3

    .line 246
    check-cast p3, Landroid/widget/TextView;

    .line 247
    .line 248
    const-string v0, "\u70b9\u51fb\u8df3\u8f6c\uff0c\u957f\u6309\u5220\u9664"

    .line 249
    .line 250
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    const p3, 0x7f090061

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object p3

    .line 260
    check-cast p3, Landroid/widget/Button;

    .line 261
    .line 262
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/μ;

    .line 263
    .line 264
    invoke-direct {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/μ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    .line 269
    .line 270
    const p3, 0x7f09005a

    .line 271
    .line 272
    .line 273
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object p3

    .line 277
    check-cast p3, Landroid/widget/Button;

    .line 278
    .line 279
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/μ;

    .line 280
    .line 281
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/μ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    return-object p2
.end method

.method public final setData(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter$setData$$inlined$sortedByDescending$1;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter$setData$$inlined$sortedByDescending$1;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setOnChanged(Lp70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    return-void
.end method
