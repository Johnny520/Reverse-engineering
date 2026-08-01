.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

.field private static final TAG:Ljava/lang/String; = "r81a2a562ce921cc2"

.field private static volatile dialog:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->$stable:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final addReplyItemView(Landroid/widget/LinearLayout;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;ZLxx;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 15
    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->dp(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v5, 0xa

    .line 23
    .line 24
    invoke-direct {v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->dp(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->dp(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->dp(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v0, v4, v6, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p4, Lxx;->γ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 49
    .line 50
    const/4 v4, -0x2

    .line 51
    const/4 v5, -0x1

    .line 52
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getAuthorName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    const-string v4, "\u672a\u77e5\u7528\u6237"

    .line 74
    .line 75
    :cond_0
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41500000    # 13.0f

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 81
    .line 82
    .line 83
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 84
    .line 85
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p4, Lxx;->ζ:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 98
    .line 99
    .line 100
    new-instance v4, Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getContent()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_1

    .line 114
    .line 115
    const-string p2, "[\u65e0\u5185\u5bb9]"

    .line 116
    .line 117
    :cond_1
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    const/high16 p2, 0x41400000    # 12.0f

    .line 121
    .line 122
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p4, Lxx;->η:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 132
    .line 133
    .line 134
    const/4 p2, 0x4

    .line 135
    invoke-direct {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->dp(I)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    const/4 v2, 0x0

    .line 140
    invoke-virtual {v4, v2, p2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    if-eqz p3, :cond_2

    .line 153
    .line 154
    new-instance p2, Landroid/view/View;

    .line 155
    .line 156
    invoke-direct {p2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p4, Lxx;->δ:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 166
    .line 167
    .line 168
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 169
    .line 170
    invoke-direct {p0, v5, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    :cond_2
    return-void
.end method

.method private final applyButtonTheme(Landroid/app/Activity;Landroid/view/View;Lxx;)V
    .locals 1

    .line 1
    const p0, 0x7f090066

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/widget/Button;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 12
    .line 13
    .line 14
    const p0, 0x7f09005d

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Landroid/widget/Button;

    .line 22
    .line 23
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 24
    .line 25
    .line 26
    const p0, 0x7f090056

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroid/widget/Button;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 37
    .line 38
    .line 39
    const p0, 0x7f09005c

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Landroid/widget/Button;

    .line 47
    .line 48
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 49
    .line 50
    .line 51
    const p0, 0x7f09005b

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Landroid/widget/Button;

    .line 59
    .line 60
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private static final applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    const/4 p3, -0x1

    .line 13
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    iget-object p3, p1, Lxx;->Α:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p1, Lxx;->ι:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, p0, p3, p1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object p3, p1, Lxx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p1, Lxx;->Α:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p1, p1, Lxx;->χ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, p0, p3, p1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final applyContainerBackgrounds(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;Lxx;)V
    .locals 3

    .line 1
    if-eq p3, p2, :cond_1

    .line 2
    .line 3
    instance-of v0, p3, Landroid/widget/ListView;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p3

    .line 10
    check-cast v0, Landroid/widget/ListView;

    .line 11
    .line 12
    iget-object v2, p4, Lxx;->γ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, p1, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v0, p3

    .line 27
    check-cast v0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v2, p4, Lxx;->γ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, p1, v2}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    check-cast p3, Landroid/view/ViewGroup;

    .line 49
    .line 50
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    :goto_1
    if-ge v1, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1, p2, v2, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyContainerBackgrounds(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;Lxx;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    return-void
.end method

.method private final applyListViewTheme(Landroid/view/View;Lxx;)V
    .locals 2

    .line 1
    const p0, 0x7f09020c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/widget/ListView;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, p2, Lxx;->γ:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0xc

    .line 23
    .line 24
    invoke-static {v1, p1, v0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 32
    .line 33
    iget-object v0, p2, Lxx;->δ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p2, Lxx;->Α:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p1}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private final applyTextColors(Landroid/view/View;Lxx;)V
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    instance-of v0, p1, Landroid/widget/Button;

    .line 7
    .line 8
    if-nez v0, :cond_b

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

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
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-nez v2, :cond_1

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const v4, 0x7f090322

    .line 34
    .line 35
    .line 36
    if-ne v3, v4, :cond_2

    .line 37
    .line 38
    iget-object v2, p2, Lxx;->ρ:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const v4, 0x7f090329

    .line 42
    .line 43
    .line 44
    if-ne v3, v4, :cond_3

    .line 45
    .line 46
    iget-object v2, p2, Lxx;->λ:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    const v4, 0x7f09034d

    .line 50
    .line 51
    .line 52
    if-ne v3, v4, :cond_4

    .line 53
    .line 54
    iget-object v2, p2, Lxx;->ρ:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const v4, 0x7f090330

    .line 58
    .line 59
    .line 60
    if-eq v3, v4, :cond_a

    .line 61
    .line 62
    const v4, 0x7f090331

    .line 63
    .line 64
    .line 65
    if-ne v3, v4, :cond_5

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    const v4, 0x7f090351

    .line 69
    .line 70
    .line 71
    if-ne v3, v4, :cond_6

    .line 72
    .line 73
    iget-object v2, p2, Lxx;->η:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    const-string v3, "\u672a\u8bfb"

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_7

    .line 83
    .line 84
    iget-object v2, p2, Lxx;->ρ:Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_7
    const-string v3, "\u5173\u95ed"

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_8

    .line 94
    .line 95
    iget-object v2, p2, Lxx;->η:Ljava/lang/String;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_8
    const-string v3, "DyHelper"

    .line 99
    .line 100
    invoke-static {v2, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    iget-object v2, p2, Lxx;->Β:Ljava/lang/String;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_9
    iget-object v2, p2, Lxx;->ζ:Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_a
    :goto_1
    iget-object v2, p2, Lxx;->θ:Ljava/lang/String;

    .line 113
    .line 114
    :goto_2
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    :cond_b
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 122
    .line 123
    if-eqz v0, :cond_c

    .line 124
    .line 125
    check-cast p1, Landroid/view/ViewGroup;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    :goto_3
    if-ge v1, v0, :cond_c

    .line 132
    .line 133
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-direct {p0, v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyTextColors(Landroid/view/View;Lxx;)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_c
    return-void
.end method

.method private final dp(I)I
    .locals 0

    .line 1
    int-to-float p0, p1

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p0, p1

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method private static final showNewReplyDetailDialog$lambda$11(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-object v0, Lx01;->α:Lx01;

    .line 4
    .line 5
    invoke-virtual {v0, v2}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0c0022

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-virtual {v0, v1, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyDialogTheme(Landroid/app/Activity;Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    const v1, 0x7f09032c

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/widget/TextView;

    .line 34
    .line 35
    const v4, 0x7f09032b

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Landroid/widget/TextView;

    .line 43
    .line 44
    const v5, 0x7f090351

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Landroid/widget/TextView;

    .line 52
    .line 53
    const v7, 0x7f090331

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Landroid/widget/TextView;

    .line 61
    .line 62
    const v8, 0x7f0900f6

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    const v9, 0x7f09005d

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Landroid/widget/Button;

    .line 79
    .line 80
    const v10, 0x7f09005c

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    check-cast v10, Landroid/widget/Button;

    .line 88
    .line 89
    const v11, 0x7f09005b

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    check-cast v11, Landroid/widget/Button;

    .line 97
    .line 98
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    new-instance v13, Ljava/util/HashSet;

    .line 103
    .line 104
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v14, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-eqz v15, :cond_1

    .line 121
    .line 122
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    move-object/from16 v16, v15

    .line 127
    .line 128
    check-cast v16, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 129
    .line 130
    move-object/from16 v17, v3

    .line 131
    .line 132
    invoke-virtual/range {v16 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v13, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_0

    .line 141
    .line 142
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :cond_0
    move-object/from16 v3, v17

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_1
    move-object/from16 v17, v3

    .line 149
    .line 150
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog$showNewReplyDetailDialog$lambda$11$$inlined$sortedByDescending$1;

    .line 151
    .line 152
    invoke-direct {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog$showNewReplyDetailDialog$lambda$11$$inlined$sortedByDescending$1;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {v14, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    if-nez v12, :cond_2

    .line 164
    .line 165
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    const-string v13, "\u65b0\u589e\u56de\u590d\uff08"

    .line 170
    .line 171
    const-string v14, "\uff09"

    .line 172
    .line 173
    invoke-static {v13, v12, v14}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    goto :goto_1

    .line 178
    :cond_2
    const-string v12, "\u65b0\u589e\u56de\u590d"

    .line 179
    .line 180
    :goto_1
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAuthorName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-eqz v13, :cond_3

    .line 197
    .line 198
    const-string v12, "\u672a\u77e5\u7528\u6237"

    .line 199
    .line 200
    :cond_3
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v12, "\uff1a"

    .line 204
    .line 205
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-eqz v13, :cond_4

    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    :cond_4
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_6

    .line 240
    .line 241
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v3, "\u68c0\u6d4b\u5230\u65b0\u56de\u590d"

    .line 247
    .line 248
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-lez v3, :cond_5

    .line 256
    .line 257
    const-string v3, " +"

    .line 258
    .line 259
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {p1 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    :cond_5
    const-string v3, "\uff0c\u4f46\u6682\u672a\u83b7\u53d6\u5230\u5177\u4f53\u56de\u590d\u5185\u5bb9\u3002\n\n\u53ef\u4ee5\u5c1d\u8bd5\u4e3b\u52a8\u67e5\u8be2\uff0c\u6216\u8df3\u8f6c\u5230\u89c6\u9891\u8bc4\u8bba\u533a\u67e5\u770b\u3002"

    .line 270
    .line 271
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_6
    const/16 v1, 0x8

    .line 283
    .line 284
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 285
    .line 286
    .line 287
    invoke-static {v2}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    move v7, v6

    .line 296
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    if-eqz v12, :cond_9

    .line 301
    .line 302
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    add-int/lit8 v13, v7, 0x1

    .line 307
    .line 308
    if-ltz v7, :cond_8

    .line 309
    .line 310
    check-cast v12, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 311
    .line 312
    sget-object v14, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 313
    .line 314
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    const/16 v16, 0x1

    .line 319
    .line 320
    add-int/lit8 v15, v15, -0x1

    .line 321
    .line 322
    if-eq v7, v15, :cond_7

    .line 323
    .line 324
    move/from16 v7, v16

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_7
    move v7, v6

    .line 328
    :goto_3
    invoke-direct {v14, v8, v12, v7, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->addReplyItemView(Landroid/widget/LinearLayout;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;ZLxx;)V

    .line 329
    .line 330
    .line 331
    move v7, v13

    .line 332
    goto :goto_2

    .line 333
    :cond_8
    invoke-static {}, Lyh;->х()V

    .line 334
    .line 335
    .line 336
    throw v17

    .line 337
    :cond_9
    :goto_4
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 338
    .line 339
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    new-instance v0, Lsa;

    .line 351
    .line 352
    const/4 v1, 0x3

    .line 353
    invoke-direct {v0, v5, v1}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Lsa;

    .line 360
    .line 361
    const/4 v1, 0x4

    .line 362
    invoke-direct {v0, v5, v1}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v11, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 366
    .line 367
    .line 368
    new-instance v0, Lvj;

    .line 369
    .line 370
    const/4 v1, 0x0

    .line 371
    move-object/from16 v3, p1

    .line 372
    .line 373
    move-object/from16 v4, p2

    .line 374
    .line 375
    invoke-direct/range {v0 .. v5}, Lvj;-><init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 379
    .line 380
    .line 381
    new-instance v0, Ll9;

    .line 382
    .line 383
    const/4 v1, 0x2

    .line 384
    invoke-direct {v0, v2, v1, v3}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-eqz v0, :cond_a

    .line 398
    .line 399
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 400
    .line 401
    invoke-direct {v1, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 405
    .line 406
    .line 407
    :cond_a
    return-void
.end method

.method private static final showNewReplyDetailDialog$lambda$11$lambda$10(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p0, v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jump(Landroid/app/Activity;Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string p1, "\u6b63\u5728\u6253\u5f00\u89c6\u9891..."

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p1, "\u8df3\u8f6c\u5931\u8d25\uff0c\u53ef\u80fd\u89c6\u9891\u5df2\u5931\u6548"

    .line 20
    .line 21
    :goto_0
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

.method private static final showNewReplyDetailDialog$lambda$11$lambda$7(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final showNewReplyDetailDialog$lambda$11$lambda$8(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final showNewReplyDetailDialog$lambda$11$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p4, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->markRead(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 14
    .line 15
    .line 16
    const-string p0, "\u5df2\u6807\u8bb0\u4e3a\u5df2\u8bfb"

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p3, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic α(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog$lambda$11$lambda$9(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/app/Activity;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog$lambda$11$lambda$7(Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic γ(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog$lambda$11$lambda$8(Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog$lambda$11(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ε(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog$lambda$11$lambda$10(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final applyBookmarkItemTheme(Landroid/view/View;Lxx;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p2, Lxx;->θ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p2, Lxx;->λ:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p2, Lxx;->ρ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p2, Lxx;->η:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p2, Lxx;->Α:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p2, Lxx;->ζ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p2, Lxx;->γ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p1, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 26
    .line 27
    .line 28
    const v5, 0x7f09031e

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    const v5, 0x7f090328

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Landroid/widget/TextView;

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    const v5, 0x7f090372

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Landroid/widget/TextView;

    .line 72
    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    move-object v6, v1

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object v6, v0

    .line 80
    :goto_0
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    .line 86
    .line 87
    :cond_3
    const v5, 0x7f090375

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    iget-object v6, p2, Lxx;->ι:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v7, p2, Lxx;->κ:Ljava/lang/String;

    .line 115
    .line 116
    const/16 v8, 0x63

    .line 117
    .line 118
    invoke-static {v8, v6, v7}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    const v5, 0x7f090355

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Landroid/widget/TextView;

    .line 133
    .line 134
    if-eqz v5, :cond_5

    .line 135
    .line 136
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 141
    .line 142
    .line 143
    :cond_5
    const v5, 0x7f090349

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 159
    .line 160
    .line 161
    :cond_6
    const p0, 0x7f09034f

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Landroid/widget/TextView;

    .line 169
    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    if-eqz p3, :cond_7

    .line 173
    .line 174
    move-object v2, v4

    .line 175
    :cond_7
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    .line 181
    .line 182
    :cond_8
    const p0, 0x7f09006d

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    check-cast p0, Landroid/widget/Button;

    .line 190
    .line 191
    const/4 p3, -0x1

    .line 192
    const/16 v2, 0xa

    .line 193
    .line 194
    const/4 v5, 0x0

    .line 195
    if-eqz p0, :cond_9

    .line 196
    .line 197
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v6, v3, v1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 215
    .line 216
    .line 217
    :cond_9
    const p0, 0x7f090062

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Landroid/widget/Button;

    .line 225
    .line 226
    if-eqz p0, :cond_a

    .line 227
    .line 228
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v2, p3, v3, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 242
    .line 243
    .line 244
    move-result-object p3

    .line 245
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 246
    .line 247
    .line 248
    :cond_a
    const p0, 0x7f090061

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    check-cast p0, Landroid/widget/Button;

    .line 256
    .line 257
    if-eqz p0, :cond_b

    .line 258
    .line 259
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 260
    .line 261
    .line 262
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iget-object p2, p2, Lxx;->χ:Ljava/lang/String;

    .line 277
    .line 278
    invoke-static {v2, p1, v3, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 283
    .line 284
    .line 285
    :cond_b
    return-void
.end method

.method public final applyDialogTheme(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Lxx;->β:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, p2, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyContainerBackgrounds(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;Lxx;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyTextColors(Landroid/view/View;Lxx;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyListViewTheme(Landroid/view/View;Lxx;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->applyButtonTheme(Landroid/app/Activity;Landroid/view/View;Lxx;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final show(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final showNewReplyDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Le9;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, v0}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
