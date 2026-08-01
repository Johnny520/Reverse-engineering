.class final Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;
.super Landroid/widget/BaseAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ProfileBookmarkAdapter"
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final data:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method

.method private static final getView$lambda$10$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->markRead(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->onChanged:Lp70;

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

.method private static final getView$lambda$11(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {p2, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToProfile(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const-string p1, "\u6b63\u5728\u6253\u5f00\u4e3b\u9875..."

    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "\u8df3\u8f6c\u5931\u8d25"

    .line 25
    .line 26
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static final getView$lambda$8$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/κ;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/κ;-><init>(Landroid/widget/BaseAdapter;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$showNewAwemeDetailDialog(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final getView$lambda$8$lambda$7$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->onChanged:Lp70;

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

.method public static synthetic α(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getView$lambda$11(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getView$lambda$8$lambda$7$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getView$lambda$8$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getView$lambda$10$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->data:Ljava/util/ArrayList;

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

.method public getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->onChanged:Lp70;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const v1, 0x7f0c0059

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
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

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
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->activity:Landroid/app/Activity;

    .line 30
    .line 31
    invoke-static {p3}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getHasNewAweme()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v2, p2, p3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->access$applyProfileItemTheme(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/view/View;Lxx;Z)V

    .line 45
    .line 46
    .line 47
    const v2, 0x7f090350

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    const v2, 0x7f090375

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
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getGroup()Ljava/lang/String;

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
    if-eqz v4, :cond_2

    .line 81
    .line 82
    const-string v3, "\u9ed8\u8ba4"

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    const v2, 0x7f090355

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
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getRemark()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/16 v4, 0x8

    .line 105
    .line 106
    if-nez v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getRemark()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    new-instance v5, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v6, "\u5907\u6ce8\uff1a"

    .line 118
    .line 119
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    :goto_0
    const v2, 0x7f090358

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Landroid/widget/TextView;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSignature()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_4

    .line 154
    .line 155
    const-string v3, "\u6682\u65e0\u7b7e\u540d"

    .line 156
    .line 157
    :cond_4
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    const v2, 0x7f090372

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Landroid/widget/TextView;

    .line 168
    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeCount()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    const-string v5, "\u65b0\u4f5c\u54c1 +"

    .line 176
    .line 177
    invoke-static {v5, v3}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    goto :goto_1

    .line 182
    :cond_5
    const-string v3, "\u5df2\u5173\u6ce8"

    .line 183
    .line 184
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    iget-object p3, p3, Lxx;->ρ:Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    iget-object p3, p3, Lxx;->λ:Ljava/lang/String;

    .line 193
    .line 194
    :goto_2
    const v3, 0x7f090349

    .line 195
    .line 196
    .line 197
    invoke-static {p3, v2, p2, v3}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    check-cast p3, Landroid/widget/TextView;

    .line 202
    .line 203
    if-eqz v1, :cond_7

    .line 204
    .line 205
    const-string v2, "\u70b9\u51fb\u67e5\u770b\u4f5c\u54c1"

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_7
    const-string v2, "\u957f\u6309\u53d6\u6d88\u5173\u6ce8"

    .line 209
    .line 210
    :goto_3
    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    .line 212
    .line 213
    const p3, 0x7f09034c

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    check-cast p3, Landroid/widget/TextView;

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-nez v3, :cond_8

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    goto :goto_5

    .line 238
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-nez v5, :cond_9

    .line 247
    .line 248
    :goto_4
    move-object v2, v3

    .line 249
    goto :goto_5

    .line 250
    :cond_9
    move-object v5, v3

    .line 251
    check-cast v5, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 252
    .line 253
    invoke-virtual {v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 254
    .line 255
    .line 256
    move-result-wide v5

    .line 257
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    move-object v8, v7

    .line 262
    check-cast v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 263
    .line 264
    invoke-virtual {v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 265
    .line 266
    .line 267
    move-result-wide v8

    .line 268
    cmp-long v10, v5, v8

    .line 269
    .line 270
    if-gez v10, :cond_b

    .line 271
    .line 272
    move-object v3, v7

    .line 273
    move-wide v5, v8

    .line 274
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    if-nez v7, :cond_a

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :goto_5
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 282
    .line 283
    if-eqz v2, :cond_d

    .line 284
    .line 285
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getDesc()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_c

    .line 297
    .line 298
    const-string v2, "[\u65e0\u63cf\u8ff0]"

    .line 299
    .line 300
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v5, "\u65b0\u4f5c\u54c1\uff1a"

    .line 303
    .line 304
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_d
    invoke-virtual {p3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    :goto_6
    const p3, 0x7f09006c

    .line 322
    .line 323
    .line 324
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 325
    .line 326
    .line 327
    move-result-object p3

    .line 328
    check-cast p3, Landroid/widget/Button;

    .line 329
    .line 330
    if-eqz v1, :cond_e

    .line 331
    .line 332
    move v2, v0

    .line 333
    goto :goto_7

    .line 334
    :cond_e
    move v2, v4

    .line 335
    :goto_7
    invoke-virtual {p3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/λ;

    .line 339
    .line 340
    invoke-direct {v2, p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/λ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 344
    .line 345
    .line 346
    const p3, 0x7f090062

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 350
    .line 351
    .line 352
    move-result-object p3

    .line 353
    check-cast p3, Landroid/widget/Button;

    .line 354
    .line 355
    if-eqz v1, :cond_f

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_f
    move v0, v4

    .line 359
    :goto_8
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 360
    .line 361
    .line 362
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/λ;

    .line 363
    .line 364
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/λ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 368
    .line 369
    .line 370
    const p3, 0x7f090061

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object p3

    .line 377
    check-cast p3, Landroid/widget/Button;

    .line 378
    .line 379
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/λ;

    .line 380
    .line 381
    const/4 v1, 0x2

    .line 382
    invoke-direct {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/λ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    .line 387
    .line 388
    return-object p2
.end method

.method public final setData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->data:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$compareByDescending$1;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$compareByDescending$1;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$thenByDescending$1;

    .line 17
    .line 18
    invoke-direct {v2, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->onChanged:Lp70;

    .line 2
    .line 3
    return-void
.end method
