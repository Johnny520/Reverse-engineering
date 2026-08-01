.class final Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CommentBookmarkAdapter"
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final data:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method

.method private static final getView$lambda$10$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->markRead(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->onChanged:Lp70;

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
    return-void
.end method

.method private static final getView$lambda$11(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jump(Landroid/app/Activity;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final getView$lambda$8$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/κ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/κ;-><init>(Landroid/widget/BaseAdapter;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final getView$lambda$8$lambda$7$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic α(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getView$lambda$8$lambda$7$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getView$lambda$10$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic γ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getView$lambda$8$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getView$lambda$11(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->data:Ljava/util/ArrayList;

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

.method public getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    return-object p0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    sget-object p2, Lx01;->α:Lx01;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const v1, 0x7f0c004b

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

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
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-nez p3, :cond_3

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-nez p3, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move p3, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :goto_0
    const/4 p3, 0x1

    .line 49
    :goto_1
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 50
    .line 51
    invoke-static {v1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p2, v1, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyBookmarkItemTheme(Landroid/view/View;Lxx;Z)V

    .line 61
    .line 62
    .line 63
    const v2, 0x7f09031e

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAuthorName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    const-string v3, "\u672a\u77e5\u7528\u6237"

    .line 83
    .line 84
    :cond_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    const v2, 0x7f090328

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    :cond_5
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    const v2, 0x7f090375

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Landroid/widget/TextView;

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getUserTag()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    const-string v3, "\u9ed8\u8ba4"

    .line 133
    .line 134
    :cond_6
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    const v2, 0x7f090355

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Landroid/widget/TextView;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getRemark()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    const/16 v4, 0x8

    .line 155
    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getRemark()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v6, "\u5907\u6ce8\uff1a"

    .line 168
    .line 169
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_7
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    :goto_2
    const v2, 0x7f090372

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Landroid/widget/TextView;

    .line 194
    .line 195
    if-eqz p3, :cond_8

    .line 196
    .line 197
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-lez v3, :cond_8

    .line 202
    .line 203
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    const-string v5, "\u65b0\u56de\u590d +"

    .line 208
    .line 209
    invoke-static {v5, v3}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    goto :goto_3

    .line 214
    :cond_8
    if-eqz p3, :cond_9

    .line 215
    .line 216
    const-string v3, "\u6709\u65b0\u56de\u590d"

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_9
    const-string v3, "\u5df2\u5173\u6ce8"

    .line 220
    .line 221
    :goto_3
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    if-eqz p3, :cond_a

    .line 225
    .line 226
    iget-object v1, v1, Lxx;->ρ:Ljava/lang/String;

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    iget-object v1, v1, Lxx;->λ:Ljava/lang/String;

    .line 230
    .line 231
    :goto_4
    const v3, 0x7f090349

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2, p2, v3}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz p3, :cond_b

    .line 241
    .line 242
    const-string v2, "\u70b9\u51fb\u67e5\u770b\u65b0\u56de\u590d"

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_b
    const-string v2, "\u957f\u6309\u5220\u9664"

    .line 246
    .line 247
    :goto_5
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    const v1, 0x7f09034f

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Landroid/widget/TextView;

    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-nez v3, :cond_c

    .line 272
    .line 273
    const/4 v2, 0x0

    .line 274
    goto :goto_7

    .line 275
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-nez v5, :cond_d

    .line 284
    .line 285
    :goto_6
    move-object v2, v3

    .line 286
    goto :goto_7

    .line 287
    :cond_d
    move-object v5, v3

    .line 288
    check-cast v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 289
    .line 290
    invoke-virtual {v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getCreateTime()J

    .line 291
    .line 292
    .line 293
    move-result-wide v5

    .line 294
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    move-object v8, v7

    .line 299
    check-cast v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 300
    .line 301
    invoke-virtual {v8}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getCreateTime()J

    .line 302
    .line 303
    .line 304
    move-result-wide v8

    .line 305
    cmp-long v10, v5, v8

    .line 306
    .line 307
    if-gez v10, :cond_f

    .line 308
    .line 309
    move-object v3, v7

    .line 310
    move-wide v5, v8

    .line 311
    :cond_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    if-nez v7, :cond_e

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :goto_7
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 319
    .line 320
    if-eqz v2, :cond_10

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getAuthorName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getContent()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    new-instance v5, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    const-string v6, "\u65b0\u56de\u590d\uff1a"

    .line 336
    .line 337
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v3, "\uff1a"

    .line 344
    .line 345
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_10
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_11

    .line 364
    .line 365
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-lez v2, :cond_11

    .line 370
    .line 371
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    new-instance v3, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v5, "\u68c0\u6d4b\u5230 "

    .line 381
    .line 382
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v2, " \u6761\u65b0\u56de\u590d"

    .line 389
    .line 390
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_11
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 402
    .line 403
    .line 404
    :goto_8
    const v1, 0x7f09006d

    .line 405
    .line 406
    .line 407
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Landroid/widget/Button;

    .line 412
    .line 413
    if-eqz p3, :cond_12

    .line 414
    .line 415
    move v2, v0

    .line 416
    goto :goto_9

    .line 417
    :cond_12
    move v2, v4

    .line 418
    :goto_9
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 419
    .line 420
    .line 421
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ι;

    .line 422
    .line 423
    invoke-direct {v2, p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ι;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 427
    .line 428
    .line 429
    const v1, 0x7f090062

    .line 430
    .line 431
    .line 432
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Landroid/widget/Button;

    .line 437
    .line 438
    if-eqz p3, :cond_13

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_13
    move v0, v4

    .line 442
    :goto_a
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 443
    .line 444
    .line 445
    new-instance p3, Lcom/example/dyhelper/hook/comment/bookmark/ι;

    .line 446
    .line 447
    invoke-direct {p3, p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ι;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    .line 452
    .line 453
    const p3, 0x7f090061

    .line 454
    .line 455
    .line 456
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object p3

    .line 460
    check-cast p3, Landroid/widget/Button;

    .line 461
    .line 462
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ι;

    .line 463
    .line 464
    const/4 v1, 0x2

    .line 465
    invoke-direct {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ι;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 469
    .line 470
    .line 471
    return-object p2
.end method

.method public final setData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$compareByDescending$1;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$compareByDescending$1;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$thenByDescending$1;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v2}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 29
    .line 30
    .line 31
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    return-void
.end method
