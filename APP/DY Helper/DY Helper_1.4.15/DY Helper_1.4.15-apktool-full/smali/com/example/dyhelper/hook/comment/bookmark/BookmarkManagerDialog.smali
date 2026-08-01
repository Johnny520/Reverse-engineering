.class public final Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;,
        Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;,
        Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

.field public static final TAB_COMMENT:I = 0x0

.field public static final TAB_PROFILE:I = 0x1

.field public static final TAB_VIDEO:I = 0x2

.field private static final TAG:Ljava/lang/String; = "rb371d3ea6408f4c8"

.field private static currentTab:I

.field private static volatile dialog:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->$stable:I

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

.method public static final synthetic access$applyProfileItemTheme(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/view/View;Lxx;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyProfileItemTheme(Landroid/view/View;Lxx;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$applyVideoItemTheme(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/view/View;Lxx;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyVideoItemTheme(Landroid/view/View;Lxx;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$dp(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$formatCount(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;J)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->formatCount(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$jumpToVideo(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->jumpToVideo(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$loadCoverAsync(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->loadCoverAsync(Landroid/app/Activity;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$resolveWorkIcon(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->resolveWorkIcon(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$showNewAwemeDetailDialog(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final addAwemeItemView(Landroid/widget/LinearLayout;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;ZLxx;)V
    .locals 10

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
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 15
    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v5, 0xa

    .line 23
    .line 24
    invoke-direct {v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

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
    new-instance v3, Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getDesc()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_0

    .line 62
    .line 63
    const-string v4, "[\u65e0\u63cf\u8ff0]"

    .line 64
    .line 65
    :cond_0
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    const/high16 v4, 0x41500000    # 13.0f

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 71
    .line 72
    .line 73
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, p4, Lxx;->ζ:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Ljava/util/Date;

    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getCreateTime()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    const-wide/16 v8, 0x3e8

    .line 99
    .line 100
    mul-long/2addr v6, v8

    .line 101
    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 102
    .line 103
    .line 104
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 105
    .line 106
    const-string v6, "yyyy-MM-dd HH:mm"

    .line 107
    .line 108
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-direct {p2, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    const/high16 p2, 0x41300000    # 11.0f

    .line 123
    .line 124
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p4, Lxx;->η:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    .line 135
    .line 136
    const/4 p2, 0x4

    .line 137
    invoke-direct {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dp(I)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-virtual {v4, v2, p2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    if-eqz p3, :cond_1

    .line 155
    .line 156
    new-instance p2, Landroid/view/View;

    .line 157
    .line 158
    invoke-direct {p2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p4, Lxx;->δ:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 168
    .line 169
    .line 170
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 171
    .line 172
    const/4 p3, -0x1

    .line 173
    invoke-direct {p0, p3, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 180
    .line 181
    .line 182
    :cond_1
    return-void
.end method

.method private final applyButtonTheme(Landroid/app/Activity;Landroid/view/View;Lxx;)V
    .locals 2

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
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 12
    .line 13
    .line 14
    const p0, 0x7f090056

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
    const/4 v1, 0x0

    .line 24
    invoke-static {p1, p3, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

    .line 25
    .line 26
    .line 27
    const p0, 0x7f09005d

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Landroid/widget/Button;

    .line 35
    .line 36
    invoke-static {p1, p3, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

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
    invoke-static {p1, p3, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

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
    invoke-static {p1, p3, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme$styleButton(Landroid/app/Activity;Lxx;Landroid/widget/Button;Z)V

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
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object v0, p3

    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v0, p3

    .line 21
    check-cast v0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    iget-object v1, p4, Lxx;->γ:Ljava/lang/String;

    .line 24
    .line 25
    const/16 v2, 0xc

    .line 26
    .line 27
    invoke-static {v2, p1, v1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    check-cast p3, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, p2, v2, p4}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyContainerBackgrounds(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;Lxx;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    return-void
.end method

.method private final applyDialogTheme(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lxx;->β:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyContainerBackgrounds(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;Lxx;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyTextColors(Landroid/view/View;Lxx;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyListViewTheme(Landroid/view/View;Lxx;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyButtonTheme(Landroid/app/Activity;Landroid/view/View;Lxx;)V

    .line 24
    .line 25
    .line 26
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
    iget-object p1, p2, Lxx;->Α:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private final applyProfileItemTheme(Landroid/view/View;Lxx;Z)V
    .locals 9

    .line 1
    iget-object p0, p2, Lxx;->γ:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p2, Lxx;->λ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p2, Lxx;->ρ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p2, Lxx;->θ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p2, Lxx;->Α:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 16
    .line 17
    .line 18
    const p0, 0x7f090350

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/widget/TextView;

    .line 26
    .line 27
    iget-object v4, p2, Lxx;->ζ:Ljava/lang/String;

    .line 28
    .line 29
    const v5, 0x7f090358

    .line 30
    .line 31
    .line 32
    invoke-static {v4, p0, p1, v5}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v5, p2, Lxx;->η:Ljava/lang/String;

    .line 39
    .line 40
    const v6, 0x7f090375

    .line 41
    .line 42
    .line 43
    invoke-static {v5, p0, p1, v6}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Landroid/widget/TextView;

    .line 48
    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    iget-object v6, p2, Lxx;->ι:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {p0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v7, p2, Lxx;->κ:Ljava/lang/String;

    .line 68
    .line 69
    const/16 v8, 0x63

    .line 70
    .line 71
    invoke-static {v8, v6, v7}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {p0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    const p0, 0x7f090355

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Landroid/widget/TextView;

    .line 86
    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-virtual {p0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 94
    .line 95
    .line 96
    :cond_1
    const p0, 0x7f090372

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Landroid/widget/TextView;

    .line 104
    .line 105
    if-eqz p3, :cond_2

    .line 106
    .line 107
    move-object v6, v1

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    move-object v6, v0

    .line 110
    :goto_0
    const v7, 0x7f090349

    .line 111
    .line 112
    .line 113
    invoke-static {v6, p0, p1, v7}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Landroid/widget/TextView;

    .line 118
    .line 119
    const v6, 0x7f09034c

    .line 120
    .line 121
    .line 122
    invoke-static {v2, p0, p1, v6}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Landroid/widget/TextView;

    .line 127
    .line 128
    if-eqz p3, :cond_3

    .line 129
    .line 130
    move-object v5, v4

    .line 131
    :cond_3
    const p3, 0x7f09006c

    .line 132
    .line 133
    .line 134
    invoke-static {v5, p0, p1, p3}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Landroid/widget/Button;

    .line 139
    .line 140
    const/4 p3, -0x1

    .line 141
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const/16 v5, 0xa

    .line 152
    .line 153
    invoke-static {v5, v2, v3, v1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 158
    .line 159
    .line 160
    const p0, 0x7f090062

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Landroid/widget/Button;

    .line 168
    .line 169
    invoke-virtual {p0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {v5, p3, v3, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 184
    .line 185
    .line 186
    const p0, 0x7f090061

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    check-cast p0, Landroid/widget/Button;

    .line 194
    .line 195
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object p2, p2, Lxx;->χ:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v5, p1, v3, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method private final applyTextColors(Landroid/view/View;Lxx;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    instance-of v0, p1, Landroid/widget/Button;

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const v2, 0x7f090322

    .line 17
    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v1, p2, Lxx;->ρ:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const v2, 0x7f090329

    .line 25
    .line 26
    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    iget-object v1, p2, Lxx;->λ:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const v2, 0x7f09034d

    .line 33
    .line 34
    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    iget-object v1, p2, Lxx;->ρ:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const v2, 0x7f090330

    .line 41
    .line 42
    .line 43
    if-eq v1, v2, :cond_5

    .line 44
    .line 45
    const v2, 0x7f090331

    .line 46
    .line 47
    .line 48
    if-ne v1, v2, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const v2, 0x7f090351

    .line 52
    .line 53
    .line 54
    if-ne v1, v2, :cond_4

    .line 55
    .line 56
    iget-object v1, p2, Lxx;->η:Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    iget-object v1, p2, Lxx;->ζ:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    :goto_0
    iget-object v1, p2, Lxx;->θ:Ljava/lang/String;

    .line 63
    .line 64
    :goto_1
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    :cond_6
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    check-cast p1, Landroid/view/ViewGroup;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    :goto_2
    if-ge v1, v0, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyTextColors(Landroid/view/View;Lxx;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_7
    return-void
.end method

.method private final applyVideoItemTheme(Landroid/view/View;Lxx;)V
    .locals 6

    .line 1
    iget-object p0, p2, Lxx;->γ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 8
    .line 9
    .line 10
    const p0, 0x7f090376

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v0, p2, Lxx;->ζ:Ljava/lang/String;

    .line 20
    .line 21
    const v1, 0x7f09031e

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p0, p1, v1}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Landroid/widget/TextView;

    .line 29
    .line 30
    iget-object v1, p2, Lxx;->η:Ljava/lang/String;

    .line 31
    .line 32
    const v2, 0x7f09032d

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p0, p1, v2}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Landroid/widget/TextView;

    .line 40
    .line 41
    iget-object v1, p2, Lxx;->θ:Ljava/lang/String;

    .line 42
    .line 43
    const v2, 0x7f090325

    .line 44
    .line 45
    .line 46
    invoke-static {v1, p0, p1, v2}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/widget/TextView;

    .line 51
    .line 52
    const v2, 0x7f090324

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p0, p1, v2}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Landroid/widget/TextView;

    .line 60
    .line 61
    const v2, 0x7f090349

    .line 62
    .line 63
    .line 64
    invoke-static {v1, p0, p1, v2}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Landroid/widget/TextView;

    .line 69
    .line 70
    const v2, 0x7f090206

    .line 71
    .line 72
    .line 73
    invoke-static {v1, p0, p1, v2}, Llz1;->η(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v3, p2, Lxx;->χ:Ljava/lang/String;

    .line 87
    .line 88
    const/16 v4, 0x8

    .line 89
    .line 90
    invoke-static {v4, v2, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 106
    .line 107
    .line 108
    const p0, 0x7f090061

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Landroid/widget/Button;

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 119
    .line 120
    .line 121
    const/4 v2, -0x1

    .line 122
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v4, p2, Lxx;->Α:Ljava/lang/String;

    .line 133
    .line 134
    iget-object p2, p2, Lxx;->ι:Ljava/lang/String;

    .line 135
    .line 136
    const/16 v5, 0xa

    .line 137
    .line 138
    invoke-static {v5, v2, v4, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 143
    .line 144
    .line 145
    const p0, 0x7f09005a

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Landroid/widget/Button;

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {v5, p1, v4, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 176
    .line 177
    .line 178
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

.method private final formatCount(J)Ljava/lang/String;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "-"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/32 v0, 0x5f5e100

    .line 11
    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-ltz v0, :cond_1

    .line 16
    .line 17
    long-to-double p1, p1

    .line 18
    const-wide v0, 0x4197d78400000000L    # 1.0E8

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-double/2addr p1, v0

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->trimCount(D)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "\u4ebf"

    .line 29
    .line 30
    invoke-static {p0, p1}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const-wide/16 v0, 0x2710

    .line 36
    .line 37
    cmp-long v0, p1, v0

    .line 38
    .line 39
    if-ltz v0, :cond_2

    .line 40
    .line 41
    long-to-double p1, p1

    .line 42
    const-wide v0, 0x40c3880000000000L    # 10000.0

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    div-double/2addr p1, v0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->trimCount(D)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "\u4e07"

    .line 53
    .line 54
    invoke-static {p0, p1}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method private final jumpToVideo(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToVideo(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "\u6b63\u5728\u6253\u5f00\u4f5c\u54c1..."

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "\u8df3\u8f6c\u5931\u8d25\uff0c\u53ef\u80fd\u4f5c\u54c1\u5df2\u5931\u6548"

    .line 13
    .line 14
    :goto_0
    const/4 p2, 0x0

    .line 15
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final loadCoverAsync(Landroid/app/Activity;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    const-string p0, "http"

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p2, p0, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Ljava/lang/Thread;

    .line 21
    .line 22
    new-instance v0, Lra;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p2, p1, p3, v1}, Lra;-><init>(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method private static final loadCoverAsync$lambda$51(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;)V
    .locals 10

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p0, v1, v1, v0}, Lwx;->ζ(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lvx;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :try_start_1
    iget-object v0, v2, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    :try_start_2
    invoke-virtual {v2}, Lvx;->α()V

    .line 15
    .line 16
    .line 17
    move-object v8, v0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_1
    move-exception v0

    .line 22
    invoke-virtual {v2}, Lvx;->α()V

    .line 23
    .line 24
    .line 25
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    :goto_0
    const-string v2, "rb371d3ea6408f4c8"

    .line 27
    .line 28
    const-string v3, "video cover load failed"

    .line 29
    .line 30
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v8, v1

    .line 34
    :goto_1
    if-eqz v8, :cond_0

    .line 35
    .line 36
    new-instance v4, Lqa;

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    move-object v6, p0

    .line 40
    move-object v7, p1

    .line 41
    move-object v5, p2

    .line 42
    invoke-direct/range {v4 .. v9}, Lqa;-><init>(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method private static final loadCoverAsync$lambda$51$lambda$50(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p1, p2, p3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private final resolveWorkIcon(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getTypeLabel()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "\u56fe\u6587"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const p0, 0x108003f

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getTypeLabel()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "\u6587\u5b57"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    const p0, 0x108003e

    .line 31
    .line 32
    .line 33
    return p0

    .line 34
    :cond_1
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getTypeLabel()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "LivePhoto"

    .line 39
    .line 40
    invoke-static {p0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    const p0, 0x1080053

    .line 47
    .line 48
    .line 49
    return p0

    .line 50
    :cond_2
    const p0, 0x1080024

    .line 51
    .line 52
    .line 53
    return p0
.end method

.method public static synthetic show$default(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;IILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show(Landroid/app/Activity;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final show$lambda$28(Landroid/app/Activity;)V
    .locals 28

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-object v15, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :goto_0
    move v3, v1

    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    :goto_1
    sget-object v0, Lx01;->α:Lx01;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v3, 0x7f0c001e

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v0, v3, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const v3, 0x7f0902d4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/widget/TextView;

    .line 40
    .line 41
    const v5, 0x7f0902d5

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Landroid/widget/TextView;

    .line 49
    .line 50
    const v6, 0x7f0902d6

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroid/widget/TextView;

    .line 58
    .line 59
    const v7, 0x7f09020c

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Landroid/widget/ListView;

    .line 67
    .line 68
    const v8, 0x7f090330

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Landroid/widget/TextView;

    .line 76
    .line 77
    const v9, 0x7f090329

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    check-cast v9, Landroid/widget/TextView;

    .line 85
    .line 86
    const v10, 0x7f09034d

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    check-cast v10, Landroid/widget/TextView;

    .line 94
    .line 95
    const v11, 0x7f09032a

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    check-cast v11, Landroid/widget/TextView;

    .line 103
    .line 104
    const v12, 0x7f09034e

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    check-cast v12, Landroid/widget/TextView;

    .line 112
    .line 113
    const v13, 0x7f090323

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    check-cast v13, Landroid/widget/TextView;

    .line 121
    .line 122
    const v14, 0x7f090322

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    check-cast v14, Landroid/widget/TextView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    const v1, 0x7f090066

    .line 132
    .line 133
    .line 134
    :try_start_1
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    move-object/from16 v17, v1

    .line 139
    .line 140
    check-cast v17, Landroid/widget/Button;

    .line 141
    .line 142
    const v1, 0x7f090056

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Landroid/widget/Button;

    .line 150
    .line 151
    invoke-direct {v15, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyDialogTheme(Landroid/app/Activity;Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 157
    .line 158
    .line 159
    move-result-object v19

    .line 160
    move-object/from16 v20, v0

    .line 161
    .line 162
    if-nez v19, :cond_1

    .line 163
    .line 164
    move-object v0, v2

    .line 165
    goto :goto_2

    .line 166
    :cond_1
    move-object/from16 v0, v19

    .line 167
    .line 168
    :goto_2
    invoke-virtual {v4, v0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->init(Landroid/content/Context;)V

    .line 169
    .line 170
    .line 171
    move-object v4, v3

    .line 172
    move-object v3, v7

    .line 173
    move-object v7, v8

    .line 174
    move-object v8, v9

    .line 175
    move-object v9, v11

    .line 176
    move-object v11, v12

    .line 177
    new-instance v12, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 178
    .line 179
    invoke-direct {v12, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;-><init>(Landroid/app/Activity;)V

    .line 180
    .line 181
    .line 182
    move-object v0, v13

    .line 183
    new-instance v13, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 184
    .line 185
    invoke-direct {v13, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;-><init>(Landroid/app/Activity;)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v19, v14

    .line 189
    .line 190
    new-instance v14, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 191
    .line 192
    invoke-direct {v14, v2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;-><init>(Landroid/app/Activity;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v21, v0

    .line 196
    .line 197
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/α;

    .line 198
    .line 199
    move-object/from16 v22, v1

    .line 200
    .line 201
    const/4 v1, 0x3

    .line 202
    move-object/from16 v25, v19

    .line 203
    .line 204
    move-object/from16 v23, v20

    .line 205
    .line 206
    move-object/from16 v24, v21

    .line 207
    .line 208
    move-object/from16 v26, v22

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/α;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    .line 214
    .line 215
    :try_start_2
    invoke-virtual {v12, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->setOnChanged(Lp70;)V

    .line 216
    .line 217
    .line 218
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/α;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 219
    .line 220
    const/4 v1, 0x4

    .line 221
    move-object/from16 v2, p0

    .line 222
    .line 223
    :try_start_3
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/α;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    .line 225
    .line 226
    :try_start_4
    invoke-virtual {v13, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->setOnChanged(Lp70;)V

    .line 227
    .line 228
    .line 229
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/α;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 230
    .line 231
    const/4 v1, 0x0

    .line 232
    move-object/from16 v2, p0

    .line 233
    .line 234
    :try_start_5
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/α;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 235
    .line 236
    .line 237
    :try_start_6
    invoke-virtual {v14, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->setOnChanged(Lp70;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 238
    .line 239
    .line 240
    move-object v1, v6

    .line 241
    move-object v6, v3

    .line 242
    move-object v3, v4

    .line 243
    move-object v4, v5

    .line 244
    move-object v5, v1

    .line 245
    move-object v1, v8

    .line 246
    move-object v8, v7

    .line 247
    move-object v7, v12

    .line 248
    move-object v12, v11

    .line 249
    move-object v11, v10

    .line 250
    move-object v10, v9

    .line 251
    move-object v9, v1

    .line 252
    move-object/from16 v1, p0

    .line 253
    .line 254
    move-object v2, v15

    .line 255
    :try_start_7
    invoke-static/range {v1 .. v14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 256
    .line 257
    .line 258
    move-object v15, v4

    .line 259
    move-object v4, v3

    .line 260
    move-object v3, v6

    .line 261
    move-object v6, v5

    .line 262
    move-object v5, v15

    .line 263
    move-object v15, v12

    .line 264
    move-object v12, v7

    .line 265
    move-object v7, v8

    .line 266
    move-object v8, v9

    .line 267
    move-object v9, v10

    .line 268
    move-object v10, v11

    .line 269
    move-object v11, v15

    .line 270
    move-object v15, v2

    .line 271
    :try_start_8
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/β;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 272
    .line 273
    const/4 v1, 0x0

    .line 274
    move-object/from16 v2, p0

    .line 275
    .line 276
    :try_start_9
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/β;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 277
    .line 278
    .line 279
    :try_start_a
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    .line 281
    .line 282
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/β;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 283
    .line 284
    const/4 v1, 0x1

    .line 285
    move-object/from16 v2, p0

    .line 286
    .line 287
    :try_start_b
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/β;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 288
    .line 289
    .line 290
    :try_start_c
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/β;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 294
    .line 295
    const/4 v1, 0x2

    .line 296
    move-object/from16 v2, p0

    .line 297
    .line 298
    :try_start_d
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/β;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 299
    .line 300
    .line 301
    :try_start_e
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    .line 303
    .line 304
    new-instance v0, Lpa;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 305
    .line 306
    const/4 v1, 0x0

    .line 307
    :try_start_f
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v2, v24

    .line 311
    .line 312
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    .line 314
    .line 315
    new-instance v0, Lpa;

    .line 316
    .line 317
    const/4 v2, 0x1

    .line 318
    invoke-direct {v0, v2}, Lpa;-><init>(I)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v2, v26

    .line 322
    .line 323
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    .line 325
    .line 326
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/β;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 327
    .line 328
    move-object v2, v6

    .line 329
    move-object v6, v3

    .line 330
    move-object v3, v4

    .line 331
    move-object v4, v5

    .line 332
    move-object v5, v2

    .line 333
    move-object v2, v8

    .line 334
    move-object v8, v7

    .line 335
    move-object v7, v12

    .line 336
    move-object v12, v11

    .line 337
    move-object v11, v10

    .line 338
    move-object v10, v9

    .line 339
    move-object v9, v2

    .line 340
    move/from16 v16, v1

    .line 341
    .line 342
    move-object v2, v15

    .line 343
    move-object/from16 v1, p0

    .line 344
    .line 345
    :try_start_10
    invoke-direct/range {v0 .. v14}, Lcom/example/dyhelper/hook/comment/bookmark/β;-><init>(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 346
    .line 347
    .line 348
    move-object v15, v4

    .line 349
    move-object v4, v3

    .line 350
    move-object v3, v6

    .line 351
    move-object v6, v5

    .line 352
    move-object v5, v15

    .line 353
    move-object v15, v12

    .line 354
    move-object v12, v7

    .line 355
    move-object v7, v8

    .line 356
    move-object v8, v9

    .line 357
    move-object v9, v10

    .line 358
    move-object v10, v11

    .line 359
    move-object v11, v15

    .line 360
    move-object v15, v2

    .line 361
    move-object/from16 v1, v25

    .line 362
    .line 363
    :try_start_11
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 364
    .line 365
    .line 366
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/γ;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 367
    .line 368
    move-object v1, v10

    .line 369
    move-object v10, v8

    .line 370
    move-object v8, v12

    .line 371
    move-object v12, v1

    .line 372
    move-object/from16 v2, p0

    .line 373
    .line 374
    move-object v1, v15

    .line 375
    move-object v15, v14

    .line 376
    move-object v14, v13

    .line 377
    move-object v13, v11

    .line 378
    move-object v11, v9

    .line 379
    move-object v9, v7

    .line 380
    move-object v7, v3

    .line 381
    move-object/from16 v3, v17

    .line 382
    .line 383
    :try_start_12
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/γ;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 384
    .line 385
    .line 386
    move-object/from16 v27, v15

    .line 387
    .line 388
    move-object v15, v1

    .line 389
    move-object v1, v3

    .line 390
    move-object v3, v7

    .line 391
    move-object v7, v9

    .line 392
    move-object v9, v11

    .line 393
    move-object v11, v13

    .line 394
    move-object v13, v14

    .line 395
    move-object/from16 v14, v27

    .line 396
    .line 397
    move-object/from16 v27, v12

    .line 398
    .line 399
    move-object v12, v8

    .line 400
    move-object v8, v10

    .line 401
    move-object/from16 v10, v27

    .line 402
    .line 403
    :try_start_13
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/η;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 407
    .line 408
    move-object v1, v6

    .line 409
    move-object v6, v3

    .line 410
    move-object v3, v4

    .line 411
    move-object v4, v5

    .line 412
    move-object v5, v1

    .line 413
    move-object v1, v8

    .line 414
    move-object v8, v7

    .line 415
    move-object v7, v12

    .line 416
    move-object v12, v11

    .line 417
    move-object v11, v10

    .line 418
    move-object v10, v9

    .line 419
    move-object v9, v1

    .line 420
    move-object/from16 v1, p0

    .line 421
    .line 422
    move-object v2, v15

    .line 423
    :try_start_14
    invoke-direct/range {v0 .. v14}, Lcom/example/dyhelper/hook/comment/bookmark/η;-><init>(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 424
    .line 425
    .line 426
    move-object v15, v4

    .line 427
    move-object v4, v3

    .line 428
    move-object v3, v6

    .line 429
    move-object v6, v5

    .line 430
    move-object v5, v15

    .line 431
    move-object v15, v12

    .line 432
    move-object v12, v7

    .line 433
    move-object v7, v8

    .line 434
    move-object v8, v9

    .line 435
    move-object v9, v10

    .line 436
    move-object v10, v11

    .line 437
    move-object v11, v15

    .line 438
    move-object v15, v2

    .line 439
    :try_start_15
    invoke-virtual {v3, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 440
    .line 441
    .line 442
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/θ;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 443
    .line 444
    move-object v1, v6

    .line 445
    move-object v6, v3

    .line 446
    move-object v3, v4

    .line 447
    move-object v4, v5

    .line 448
    move-object v5, v1

    .line 449
    move-object v1, v8

    .line 450
    move-object v8, v7

    .line 451
    move-object v7, v12

    .line 452
    move-object v12, v11

    .line 453
    move-object v11, v10

    .line 454
    move-object v10, v9

    .line 455
    move-object v9, v1

    .line 456
    move-object/from16 v1, p0

    .line 457
    .line 458
    move-object v2, v15

    .line 459
    :try_start_16
    invoke-direct/range {v0 .. v14}, Lcom/example/dyhelper/hook/comment/bookmark/θ;-><init>(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 460
    .line 461
    .line 462
    move-object v2, v1

    .line 463
    move-object v3, v6

    .line 464
    :try_start_17
    invoke-virtual {v3, v0}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 465
    .line 466
    .line 467
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 468
    .line 469
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v1, v23

    .line 473
    .line 474
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 483
    .line 484
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 485
    .line 486
    if-eqz v0, :cond_2

    .line 487
    .line 488
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 489
    .line 490
    .line 491
    goto :goto_4

    .line 492
    :catchall_1
    move-exception v0

    .line 493
    :goto_3
    const/4 v3, 0x0

    .line 494
    goto :goto_6

    .line 495
    :cond_2
    :goto_4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 496
    .line 497
    if-eqz v0, :cond_3

    .line 498
    .line 499
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    if-eqz v0, :cond_3

    .line 504
    .line 505
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 506
    .line 507
    const/4 v3, 0x0

    .line 508
    :try_start_18
    invoke-direct {v1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 512
    .line 513
    .line 514
    sget-object v4, Ls62;->α:Ls62;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :catchall_2
    move-exception v0

    .line 518
    goto :goto_6

    .line 519
    :cond_3
    const/4 v3, 0x0

    .line 520
    move-object/from16 v4, v18

    .line 521
    .line 522
    goto :goto_7

    .line 523
    :catchall_3
    move-exception v0

    .line 524
    move-object v2, v1

    .line 525
    goto :goto_3

    .line 526
    :catchall_4
    move-exception v0

    .line 527
    const/4 v3, 0x0

    .line 528
    move-object/from16 v2, p0

    .line 529
    .line 530
    goto :goto_6

    .line 531
    :catchall_5
    move-exception v0

    .line 532
    move-object/from16 v2, p0

    .line 533
    .line 534
    :goto_5
    move/from16 v3, v16

    .line 535
    .line 536
    goto :goto_6

    .line 537
    :catchall_6
    move-exception v0

    .line 538
    move-object v2, v1

    .line 539
    goto :goto_5

    .line 540
    :catchall_7
    move-exception v0

    .line 541
    move-object/from16 v2, p0

    .line 542
    .line 543
    goto/16 :goto_0

    .line 544
    .line 545
    :goto_6
    new-instance v4, Leo1;

    .line 546
    .line 547
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 548
    .line 549
    .line 550
    :goto_7
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    if-eqz v0, :cond_4

    .line 555
    .line 556
    const-string v1, "rb371d3ea6408f4c8"

    .line 557
    .line 558
    const-string v4, "show failed"

    .line 559
    .line 560
    invoke-static {v1, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    new-instance v1, Ljava/lang/StringBuilder;

    .line 568
    .line 569
    const-string v4, "\u6253\u5f00\u4e66\u7b7e\u7ba1\u7406\u5668\u5931\u8d25: "

    .line 570
    .line 571
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 586
    .line 587
    .line 588
    :cond_4
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$10(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$12(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 17

    .line 1
    sget v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const-string v0, "\u6e05\u7a7a\u4f5c\u54c1\u4e66\u7b7e"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, "\u6e05\u7a7a\u4e3b\u9875\u4e66\u7b7e"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const-string v0, "\u6e05\u7a7a\u8bc4\u8bba\u4e66\u7b7e"

    .line 15
    .line 16
    :goto_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    invoke-direct {v1, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "\u786e\u5b9a\u8981\u6e05\u7a7a\u5f53\u524d\u5217\u8868\u5168\u90e8\u8bb0\u5f55\u5417\uff1f"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "\u53d6\u6d88"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ε;

    .line 41
    .line 42
    move-object/from16 v4, p1

    .line 43
    .line 44
    move-object/from16 v5, p2

    .line 45
    .line 46
    move-object/from16 v6, p3

    .line 47
    .line 48
    move-object/from16 v7, p4

    .line 49
    .line 50
    move-object/from16 v8, p5

    .line 51
    .line 52
    move-object/from16 v9, p6

    .line 53
    .line 54
    move-object/from16 v10, p7

    .line 55
    .line 56
    move-object/from16 v11, p8

    .line 57
    .line 58
    move-object/from16 v12, p9

    .line 59
    .line 60
    move-object/from16 v13, p10

    .line 61
    .line 62
    move-object/from16 v14, p11

    .line 63
    .line 64
    move-object/from16 v15, p12

    .line 65
    .line 66
    move-object/from16 v16, p13

    .line 67
    .line 68
    invoke-direct/range {v2 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/ε;-><init>(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "\u6e05\u7a7a"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$12$lambda$11(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    sget v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->clear()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->clear()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->clear()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "\u5df2\u6e05\u7a7a"

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$17(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 19

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Lx9;->π()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->γ()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v15

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v3

    .line 22
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    new-instance v4, Leo1;

    .line 29
    .line 30
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v4

    .line 34
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    const-string v0, "\u4e3b\u52a8\u67e5\u8be2\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 52
    .line 53
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "\u67e5\u8be2\u4e2d..."

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    sget v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 70
    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 74
    .line 75
    move-object v3, v0

    .line 76
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ζ;

    .line 77
    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    move-object/from16 v4, p3

    .line 81
    .line 82
    move-object/from16 v5, p4

    .line 83
    .line 84
    move-object/from16 v6, p5

    .line 85
    .line 86
    move-object/from16 v7, p6

    .line 87
    .line 88
    move-object/from16 v8, p7

    .line 89
    .line 90
    move-object/from16 v9, p8

    .line 91
    .line 92
    move-object/from16 v10, p9

    .line 93
    .line 94
    move-object/from16 v11, p10

    .line 95
    .line 96
    move-object/from16 v12, p11

    .line 97
    .line 98
    move-object/from16 v13, p12

    .line 99
    .line 100
    move-object/from16 v14, p13

    .line 101
    .line 102
    move-object/from16 v15, p14

    .line 103
    .line 104
    move-object/from16 v17, v3

    .line 105
    .line 106
    move-object/from16 v3, p0

    .line 107
    .line 108
    invoke-direct/range {v0 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/ζ;-><init>(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V

    .line 109
    .line 110
    .line 111
    move-object/from16 v3, v17

    .line 112
    .line 113
    invoke-virtual {v3, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->queryAll(Landroid/app/Activity;La80;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_3
    if-ne v0, v15, :cond_4

    .line 119
    .line 120
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

    .line 121
    .line 122
    move-object v1, v0

    .line 123
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ζ;

    .line 124
    .line 125
    const/16 v16, 0x1

    .line 126
    .line 127
    move-object/from16 v3, p0

    .line 128
    .line 129
    move-object/from16 v4, p3

    .line 130
    .line 131
    move-object/from16 v5, p4

    .line 132
    .line 133
    move-object/from16 v6, p5

    .line 134
    .line 135
    move-object/from16 v7, p6

    .line 136
    .line 137
    move-object/from16 v8, p7

    .line 138
    .line 139
    move-object/from16 v9, p8

    .line 140
    .line 141
    move-object/from16 v10, p9

    .line 142
    .line 143
    move-object/from16 v11, p10

    .line 144
    .line 145
    move-object/from16 v12, p11

    .line 146
    .line 147
    move-object/from16 v13, p12

    .line 148
    .line 149
    move-object/from16 v14, p13

    .line 150
    .line 151
    move-object/from16 v15, p14

    .line 152
    .line 153
    move-object/from16 v18, v1

    .line 154
    .line 155
    move-object/from16 v1, p2

    .line 156
    .line 157
    invoke-direct/range {v0 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/ζ;-><init>(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V

    .line 158
    .line 159
    .line 160
    move-object/from16 v1, v18

    .line 161
    .line 162
    invoke-virtual {v1, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->queryAll(Landroid/app/Activity;La80;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move-object/from16 v3, p3

    .line 167
    .line 168
    move-object/from16 v4, p4

    .line 169
    .line 170
    move-object/from16 v5, p5

    .line 171
    .line 172
    move-object/from16 v6, p6

    .line 173
    .line 174
    move-object/from16 v7, p7

    .line 175
    .line 176
    move-object/from16 v8, p8

    .line 177
    .line 178
    move-object/from16 v9, p9

    .line 179
    .line 180
    move-object/from16 v10, p10

    .line 181
    .line 182
    move-object/from16 v11, p11

    .line 183
    .line 184
    move-object/from16 v12, p12

    .line 185
    .line 186
    move-object/from16 v13, p13

    .line 187
    .line 188
    move-object/from16 v14, p14

    .line 189
    .line 190
    move-object v1, v2

    .line 191
    move-object/from16 v2, p0

    .line 192
    .line 193
    invoke-static/range {v1 .. v14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 194
    .line 195
    .line 196
    move-object v2, v1

    .line 197
    move-object/from16 v1, p2

    .line 198
    .line 199
    invoke-virtual {v1, v15}, Landroid/view/View;->setEnabled(Z)V

    .line 200
    .line 201
    .line 202
    const-string v0, "\u4e3b\u52a8\u67e5\u8be2"

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    const-string v0, "\u4f5c\u54c1\u4e66\u7b7e\u65e0\u9700\u4e3b\u52a8\u67e5\u8be2"

    .line 208
    .line 209
    const/4 v1, 0x0

    .line 210
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 215
    .line 216
    .line 217
    :goto_3
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$17$lambda$15(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p1 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    const-string p1, "\u4e3b\u52a8\u67e5\u8be2"

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ls62;->α:Ls62;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$17$lambda$16(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p1 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    const-string p1, "\u4e3b\u52a8\u67e5\u8be2"

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ls62;->α:Ls62;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$20(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 19

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v0, p16

    .line 4
    .line 5
    sget v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    move-object/from16 v12, p0

    .line 11
    .line 12
    invoke-virtual {v12, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "\u6682\u65e0\u65b0\u7684\u56de\u590d\u5185\u5bb9"

    .line 38
    .line 39
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    :goto_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;

    .line 48
    .line 49
    move-object v3, v0

    .line 50
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/α;

    .line 51
    .line 52
    move-object v4, v1

    .line 53
    const/4 v1, 0x1

    .line 54
    move-object/from16 v13, p2

    .line 55
    .line 56
    move-object/from16 v15, p3

    .line 57
    .line 58
    move-object/from16 v14, p4

    .line 59
    .line 60
    move-object/from16 v5, p6

    .line 61
    .line 62
    move-object/from16 v6, p7

    .line 63
    .line 64
    move-object/from16 v7, p9

    .line 65
    .line 66
    move-object/from16 v8, p10

    .line 67
    .line 68
    move-object/from16 v9, p11

    .line 69
    .line 70
    move-object/from16 v10, p12

    .line 71
    .line 72
    move-object/from16 v11, p13

    .line 73
    .line 74
    move-object/from16 v16, v3

    .line 75
    .line 76
    move-object/from16 v17, v4

    .line 77
    .line 78
    move-object/from16 v4, p5

    .line 79
    .line 80
    move-object/from16 v3, p8

    .line 81
    .line 82
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/α;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v3, v16

    .line 86
    .line 87
    move-object/from16 v4, v17

    .line 88
    .line 89
    invoke-virtual {v4, v2, v3, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkListDialog;->showNewReplyDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lp70;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    const/4 v4, 0x1

    .line 94
    if-ne v1, v4, :cond_6

    .line 95
    .line 96
    move-object/from16 v13, p2

    .line 97
    .line 98
    invoke-virtual {v13, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getHasNewAweme()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    move-object v1, v0

    .line 112
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/α;

    .line 113
    .line 114
    move-object v3, v1

    .line 115
    const/4 v1, 0x2

    .line 116
    move-object/from16 v12, p0

    .line 117
    .line 118
    move-object/from16 v15, p3

    .line 119
    .line 120
    move-object/from16 v14, p4

    .line 121
    .line 122
    move-object/from16 v4, p5

    .line 123
    .line 124
    move-object/from16 v5, p6

    .line 125
    .line 126
    move-object/from16 v6, p7

    .line 127
    .line 128
    move-object/from16 v7, p9

    .line 129
    .line 130
    move-object/from16 v8, p10

    .line 131
    .line 132
    move-object/from16 v9, p11

    .line 133
    .line 134
    move-object/from16 v10, p12

    .line 135
    .line 136
    move-object/from16 v11, p13

    .line 137
    .line 138
    move-object/from16 v18, v3

    .line 139
    .line 140
    move-object/from16 v3, p8

    .line 141
    .line 142
    invoke-direct/range {v0 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/α;-><init>(ILandroid/app/Activity;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v1, v18

    .line 146
    .line 147
    invoke-direct {v15, v2, v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_5
    const-string v0, "\u6682\u65e0\u65b0\u7684\u4f5c\u54c1"

    .line 152
    .line 153
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_6
    move-object/from16 v15, p3

    .line 162
    .line 163
    move-object/from16 v14, p4

    .line 164
    .line 165
    invoke-virtual {v14, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-nez v0, :cond_7

    .line 170
    .line 171
    :goto_1
    return-void

    .line 172
    :cond_7
    invoke-direct {v15, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->jumpToVideo(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$20$lambda$18(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$20$lambda$19(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$25(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 24

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v0, p16

    .line 4
    .line 5
    sget v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 6
    .line 7
    const-string v3, "\u5220\u9664"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "\u53d6\u6d88"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    move-object/from16 v8, p0

    .line 16
    .line 17
    invoke-virtual {v8, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    move/from16 v19, v6

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    const-string v7, "\u5220\u9664\u4e66\u7b7e"

    .line 33
    .line 34
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    :cond_1
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, v5, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v4, v0

    .line 61
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;

    .line 62
    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    move-object/from16 v14, p2

    .line 66
    .line 67
    move-object/from16 v15, p3

    .line 68
    .line 69
    move-object/from16 v5, p6

    .line 70
    .line 71
    move-object/from16 v6, p7

    .line 72
    .line 73
    move-object/from16 v7, p8

    .line 74
    .line 75
    move-object/from16 v9, p9

    .line 76
    .line 77
    move-object/from16 v10, p10

    .line 78
    .line 79
    move-object/from16 v11, p11

    .line 80
    .line 81
    move-object/from16 v12, p12

    .line 82
    .line 83
    move-object/from16 v13, p13

    .line 84
    .line 85
    move-object/from16 v18, v3

    .line 86
    .line 87
    move-object/from16 v17, v4

    .line 88
    .line 89
    move-object/from16 v3, p4

    .line 90
    .line 91
    move-object/from16 v4, p5

    .line 92
    .line 93
    invoke-direct/range {v0 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/δ;-><init>(Ljava/io/Serializable;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V

    .line 94
    .line 95
    .line 96
    move-object/from16 v4, v17

    .line 97
    .line 98
    move-object/from16 v2, v18

    .line 99
    .line 100
    invoke-virtual {v4, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 105
    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    return v3

    .line 109
    :cond_2
    move-object/from16 v18, v3

    .line 110
    .line 111
    move v3, v6

    .line 112
    if-ne v1, v3, :cond_4

    .line 113
    .line 114
    move-object/from16 v14, p2

    .line 115
    .line 116
    invoke-virtual {v14, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-nez v1, :cond_3

    .line 121
    .line 122
    move/from16 v19, v3

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 126
    .line 127
    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    const-string v6, "\u53d6\u6d88\u4e3b\u9875\u4e66\u7b7e"

    .line 131
    .line 132
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0, v5, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move-object v4, v0

    .line 149
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;

    .line 150
    .line 151
    const/16 v16, 0x1

    .line 152
    .line 153
    move-object/from16 v8, p0

    .line 154
    .line 155
    move-object/from16 v15, p3

    .line 156
    .line 157
    move-object/from16 v5, p6

    .line 158
    .line 159
    move-object/from16 v6, p7

    .line 160
    .line 161
    move-object/from16 v7, p8

    .line 162
    .line 163
    move-object/from16 v9, p9

    .line 164
    .line 165
    move-object/from16 v10, p10

    .line 166
    .line 167
    move-object/from16 v11, p11

    .line 168
    .line 169
    move-object/from16 v12, p12

    .line 170
    .line 171
    move-object/from16 v13, p13

    .line 172
    .line 173
    move/from16 v19, v3

    .line 174
    .line 175
    move-object/from16 v20, v4

    .line 176
    .line 177
    move-object/from16 v21, v18

    .line 178
    .line 179
    move-object/from16 v3, p4

    .line 180
    .line 181
    move-object/from16 v4, p5

    .line 182
    .line 183
    invoke-direct/range {v0 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/δ;-><init>(Ljava/io/Serializable;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v4, v20

    .line 187
    .line 188
    move-object/from16 v1, v21

    .line 189
    .line 190
    invoke-virtual {v4, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 195
    .line 196
    .line 197
    return v19

    .line 198
    :cond_4
    move-object/from16 v15, p3

    .line 199
    .line 200
    move/from16 v19, v3

    .line 201
    .line 202
    move-object/from16 v1, v18

    .line 203
    .line 204
    invoke-virtual {v15, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->getItem(I)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-nez v0, :cond_5

    .line 209
    .line 210
    :goto_0
    return v19

    .line 211
    :cond_5
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 212
    .line 213
    invoke-direct {v3, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    const-string v6, "\u5220\u9664\u4f5c\u54c1\u4e66\u7b7e"

    .line 217
    .line 218
    invoke-virtual {v3, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->displayTitle()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v3, v6}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v3, v5, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    move-object/from16 v18, v1

    .line 235
    .line 236
    move-object v1, v0

    .line 237
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;

    .line 238
    .line 239
    const/16 v16, 0x2

    .line 240
    .line 241
    move-object/from16 v8, p0

    .line 242
    .line 243
    move-object/from16 v14, p2

    .line 244
    .line 245
    move-object/from16 v4, p5

    .line 246
    .line 247
    move-object/from16 v5, p6

    .line 248
    .line 249
    move-object/from16 v6, p7

    .line 250
    .line 251
    move-object/from16 v7, p8

    .line 252
    .line 253
    move-object/from16 v9, p9

    .line 254
    .line 255
    move-object/from16 v10, p10

    .line 256
    .line 257
    move-object/from16 v11, p11

    .line 258
    .line 259
    move-object/from16 v12, p12

    .line 260
    .line 261
    move-object/from16 v13, p13

    .line 262
    .line 263
    move-object/from16 v22, v3

    .line 264
    .line 265
    move-object/from16 v23, v18

    .line 266
    .line 267
    move-object/from16 v3, p4

    .line 268
    .line 269
    invoke-direct/range {v0 .. v16}, Lcom/example/dyhelper/hook/comment/bookmark/δ;-><init>(Ljava/io/Serializable;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V

    .line 270
    .line 271
    .line 272
    move-object v1, v0

    .line 273
    move-object/from16 v0, v22

    .line 274
    .line 275
    move-object/from16 v2, v23

    .line 276
    .line 277
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 282
    .line 283
    .line 284
    return v19
.end method

.method private static final show$lambda$28$lambda$26$lambda$25$lambda$22(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$25$lambda$23(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$25$lambda$24(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$3(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$4(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$5(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final show$lambda$28$lambda$26$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    sget p14, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 2
    .line 3
    if-eqz p14, :cond_0

    .line 4
    .line 5
    const/4 p14, 0x0

    .line 6
    sput p14, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    move-object p1, p0

    .line 10
    move-object p0, v0

    .line 11
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 16

    .line 1
    sget v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    sput v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 7
    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    move-object/from16 v4, p2

    .line 13
    .line 14
    move-object/from16 v5, p3

    .line 15
    .line 16
    move-object/from16 v6, p4

    .line 17
    .line 18
    move-object/from16 v7, p5

    .line 19
    .line 20
    move-object/from16 v8, p6

    .line 21
    .line 22
    move-object/from16 v9, p7

    .line 23
    .line 24
    move-object/from16 v10, p8

    .line 25
    .line 26
    move-object/from16 v11, p9

    .line 27
    .line 28
    move-object/from16 v12, p10

    .line 29
    .line 30
    move-object/from16 v13, p11

    .line 31
    .line 32
    move-object/from16 v14, p12

    .line 33
    .line 34
    move-object/from16 v15, p13

    .line 35
    .line 36
    invoke-static/range {v2 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$8(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 16

    .line 1
    sget v0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    sput v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 7
    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    move-object/from16 v4, p2

    .line 13
    .line 14
    move-object/from16 v5, p3

    .line 15
    .line 16
    move-object/from16 v6, p4

    .line 17
    .line 18
    move-object/from16 v7, p5

    .line 19
    .line 20
    move-object/from16 v8, p6

    .line 21
    .line 22
    move-object/from16 v9, p7

    .line 23
    .line 24
    move-object/from16 v10, p8

    .line 25
    .line 26
    move-object/from16 v11, p9

    .line 27
    .line 28
    move-object/from16 v12, p10

    .line 29
    .line 30
    move-object/from16 v13, p11

    .line 31
    .line 32
    move-object/from16 v14, p12

    .line 33
    .line 34
    move-object/from16 v15, p13

    .line 35
    .line 36
    invoke-static/range {v2 .. v15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private static final show$lambda$28$lambda$26$lambda$9(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->dialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final show$lambda$28$lambda$26$refresh(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)V
    .locals 14

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    move-object/from16 v3, p8

    .line 6
    .line 7
    move-object/from16 v4, p9

    .line 8
    .line 9
    move-object/from16 v5, p10

    .line 10
    .line 11
    move-object/from16 v6, p11

    .line 12
    .line 13
    move-object/from16 v7, p12

    .line 14
    .line 15
    move-object/from16 v8, p13

    .line 16
    .line 17
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget v10, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    const/4 v12, 0x0

    .line 28
    if-nez v10, :cond_0

    .line 29
    .line 30
    move v13, v11

    .line 31
    :goto_0
    move-object/from16 v10, p2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v13, v12

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-direct {p1, p0, v10, v13, v9}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->updateTabStyle(Landroid/app/Activity;Landroid/widget/TextView;ZLxx;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget v10, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 43
    .line 44
    if-ne v10, v11, :cond_1

    .line 45
    .line 46
    move v13, v11

    .line 47
    :goto_2
    move-object/from16 v10, p3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    move v13, v12

    .line 51
    goto :goto_2

    .line 52
    :goto_3
    invoke-direct {p1, p0, v10, v13, v9}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->updateTabStyle(Landroid/app/Activity;Landroid/widget/TextView;ZLxx;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget v10, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 59
    .line 60
    const/4 v13, 0x2

    .line 61
    if-ne v10, v13, :cond_2

    .line 62
    .line 63
    move v13, v11

    .line 64
    :goto_4
    move-object/from16 v10, p4

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_2
    move v13, v12

    .line 68
    goto :goto_4

    .line 69
    :goto_5
    invoke-direct {p1, p0, v10, v13, v9}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->updateTabStyle(Landroid/app/Activity;Landroid/widget/TextView;ZLxx;)V

    .line 70
    .line 71
    .line 72
    sget p0, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    const/16 v9, 0x8

    .line 76
    .line 77
    if-eqz p0, :cond_e

    .line 78
    .line 79
    if-eq p0, v11, :cond_8

    .line 80
    .line 81
    invoke-virtual {v1, v8}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkStore;->all()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v8, p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;->setData(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    move v9, v12

    .line 100
    :cond_3
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    const-string v1, "\u6682\u65e0\u4f5c\u54c1\u4e66\u7b7e\n\u5728\u89c6\u9891\u6d41\u64cd\u4f5c\u83dc\u5355\u70b9\u51fb\u201c\u4f5c\u54c1\u4e66\u7b7e\u201d\u5373\u53ef\u4fdd\u5b58"

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    const-string v1, "\u4f5c\u54c1\u4e66\u7b7e"

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :cond_5
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 146
    .line 147
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->getCoverUrl()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_5

    .line 156
    .line 157
    add-int/lit8 v12, v12, 0x1

    .line 158
    .line 159
    if-ltz v12, :cond_6

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    invoke-static {}, Lyh;->ф()V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_7
    :goto_7
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    const-string p0, "\u6709\u5c01\u9762"

    .line 174
    .line 175
    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_8
    invoke-virtual {v1, v7}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 183
    .line 184
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->all()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {v7, p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;->setData(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    move v9, v12

    .line 198
    :cond_9
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    const-string v1, "\u6682\u65e0\u4e3b\u9875\u4e66\u7b7e\u8bb0\u5f55\n\u5728\u4e3b\u9875\u53f3\u4e0a\u89d2\u6216\u4fa7\u8fb9\u680f\u70b9\u51fb\u201c\u4e3b\u9875\u4e66\u7b7e\u201d\u5373\u53ef\u5173\u6ce8\u65b0\u4f5c\u54c1"

    .line 202
    .line 203
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "\u5173\u6ce8\u4e3b\u9875"

    .line 218
    .line 219
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_a
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    :cond_b
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_d

    .line 238
    .line 239
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 244
    .line 245
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getHasNewAweme()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_b

    .line 250
    .line 251
    add-int/lit8 v12, v12, 0x1

    .line 252
    .line 253
    if-ltz v12, :cond_c

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_c
    invoke-static {}, Lyh;->ф()V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_d
    :goto_9
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    const-string p0, "\u6709\u65b0\u4f5c\u54c1"

    .line 268
    .line 269
    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_e
    invoke-virtual/range {p5 .. p6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 274
    .line 275
    .line 276
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 277
    .line 278
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->all()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    move-object/from16 v1, p6

    .line 283
    .line 284
    invoke-virtual {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;->setData(Ljava/util/List;)V

    .line 285
    .line 286
    .line 287
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_f

    .line 292
    .line 293
    move v9, v12

    .line 294
    :cond_f
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    const-string v1, "\u6682\u65e0\u8bc4\u8bba\u4e66\u7b7e\u8bb0\u5f55\n\u5728\u8bc4\u8bba\u83dc\u5355\u70b9\u51fb\u201c\u4e66\u7b7e\u201d\u5373\u53ef\u5173\u6ce8\u56de\u590d"

    .line 298
    .line 299
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    .line 312
    .line 313
    const-string v1, "\u603b\u4e66\u7b7e"

    .line 314
    .line 315
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    .line 317
    .line 318
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_10

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    :cond_11
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_14

    .line 334
    .line 335
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 340
    .line 341
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    if-nez v2, :cond_12

    .line 346
    .line 347
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-nez v1, :cond_11

    .line 356
    .line 357
    :cond_12
    add-int/lit8 v12, v12, 0x1

    .line 358
    .line 359
    if-ltz v12, :cond_13

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_13
    invoke-static {}, Lyh;->ф()V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_14
    :goto_b
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    const-string p0, "\u6709\u65b0\u56de\u590d"

    .line 374
    .line 375
    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    .line 377
    .line 378
    return-void
.end method

.method private final showNewAwemeDetailDialog(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p0, Le9;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final showNewAwemeDetailDialog$lambda$37(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V
    .locals 12

    .line 1
    sget-object v0, Lx01;->α:Lx01;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0c0022

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->applyDialogTheme(Landroid/app/Activity;Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x7f09032c

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v6, "\u65b0\u589e\u4f5c\u54c1\uff08"

    .line 44
    .line 45
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, "\uff09"

    .line 52
    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    const v1, 0x7f090351

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->displayName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    new-instance v5, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v6, "\u4e3b\u9875\uff1a"

    .line 79
    .line 80
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    const v1, 0x7f0900f6

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Landroid/widget/LinearLayout;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    const/4 v5, 0x1

    .line 114
    const v6, 0x7f090331

    .line 115
    .line 116
    .line 117
    if-eqz v4, :cond_0

    .line 118
    .line 119
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Landroid/widget/TextView;

    .line 124
    .line 125
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    const-string v2, "\u6682\u672a\u83b7\u53d6\u5230\u5177\u4f53\u4f5c\u54c1\u5185\u5bb9\u3002"

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_0
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, Landroid/widget/TextView;

    .line 139
    .line 140
    const/16 v6, 0x8

    .line 141
    .line 142
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    new-instance v7, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$showNewAwemeDetailDialog$lambda$37$$inlined$sortedByDescending$1;

    .line 154
    .line 155
    invoke-direct {v7}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$showNewAwemeDetailDialog$lambda$37$$inlined$sortedByDescending$1;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v7}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    move v7, v3

    .line 167
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_3

    .line 172
    .line 173
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    add-int/lit8 v9, v7, 0x1

    .line 178
    .line 179
    if-ltz v7, :cond_2

    .line 180
    .line 181
    check-cast v8, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 182
    .line 183
    sget-object v10, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNewAwemeItems()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-static {v11}, Lyh;->Λ(Ljava/util/List;)I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eq v7, v11, :cond_1

    .line 194
    .line 195
    move v7, v5

    .line 196
    goto :goto_1

    .line 197
    :cond_1
    move v7, v3

    .line 198
    :goto_1
    invoke-direct {v10, v1, v8, v7, v4}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->addAwemeItemView(Landroid/widget/LinearLayout;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;ZLxx;)V

    .line 199
    .line 200
    .line 201
    move v7, v9

    .line 202
    goto :goto_0

    .line 203
    :cond_2
    invoke-static {}, Lyh;->х()V

    .line 204
    .line 205
    .line 206
    throw v2

    .line 207
    :cond_3
    :goto_2
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 208
    .line 209
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const v2, 0x7f09032b

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Landroid/widget/TextView;

    .line 228
    .line 229
    new-instance v4, Lsa;

    .line 230
    .line 231
    invoke-direct {v4, v1, v3}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    .line 236
    .line 237
    const v2, 0x7f09005b

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Landroid/widget/Button;

    .line 245
    .line 246
    new-instance v4, Lsa;

    .line 247
    .line 248
    invoke-direct {v4, v1, v5}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    const v2, 0x7f09005d

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, Landroid/widget/Button;

    .line 262
    .line 263
    new-instance v4, Lc9;

    .line 264
    .line 265
    invoke-direct {v4, p1, p2, v1, v5}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    .line 270
    .line 271
    const p2, 0x7f09005c

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    check-cast p2, Landroid/widget/Button;

    .line 279
    .line 280
    const-string v0, "\u8fdb\u4e3b\u9875"

    .line 281
    .line 282
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    new-instance v0, Lc9;

    .line 286
    .line 287
    const/4 v2, 0x2

    .line 288
    invoke-direct {v0, p0, p1, v1, v2}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    if-eqz p0, :cond_4

    .line 302
    .line 303
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 304
    .line 305
    invoke-direct {p1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, p1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 309
    .line 310
    .line 311
    :cond_4
    return-void
.end method

.method private static final showNewAwemeDetailDialog$lambda$37$lambda$32(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final showNewAwemeDetailDialog$lambda$37$lambda$33(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final showNewAwemeDetailDialog$lambda$37$lambda$34(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->markRead(Ljava/lang/String;)V

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
    return-void
.end method

.method private static final showNewAwemeDetailDialog$lambda$37$lambda$36$lambda$35(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p3, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 2
    .line 3
    invoke-virtual {p3, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->jumpToProfile(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "\u8df3\u8f6c\u5931\u8d25"

    .line 14
    .line 15
    const/4 p2, 0x0

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
.end method

.method private final trimCount(D)Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "%.1f"

    .line 17
    .line 18
    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, ".0"

    .line 23
    .line 24
    invoke-static {p0, p1}, Lq02;->о(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method private final updateTabStyle(Landroid/app/Activity;Landroid/widget/TextView;ZLxx;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p4, Lxx;->λ:Ljava/lang/String;

    .line 8
    .line 9
    const/16 p3, 0x8

    .line 10
    .line 11
    invoke-static {p3, p1, p0}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p0, p4, Lxx;->η:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 38
    .line 39
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic Α(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, v0

    .line 4
    invoke-static/range {p0 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$6(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic Β(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$3(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Γ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$5(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog$lambda$37$lambda$36$lambda$35(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic α(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, v0

    .line 4
    invoke-static/range {p0 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$7(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic β(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p18}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$25(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic γ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p16}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$25$lambda$22(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog$lambda$37$lambda$32(Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ε(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$4(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ζ(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->loadCoverAsync$lambda$51$lambda$50(Landroid/widget/ImageView;Ljava/lang/String;Landroid/app/Activity;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic η(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$10(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic θ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$12$lambda$11(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ι(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog$lambda$37$lambda$34(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic κ(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v3, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    move-object/from16 v7, p7

    .line 16
    .line 17
    move-object/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v9, p9

    .line 20
    .line 21
    move-object/from16 v10, p10

    .line 22
    .line 23
    move-object/from16 v11, p11

    .line 24
    .line 25
    move-object/from16 v12, p12

    .line 26
    .line 27
    move-object/from16 v13, p13

    .line 28
    .line 29
    move-object/from16 v14, p14

    .line 30
    .line 31
    move-object/from16 v15, p15

    .line 32
    .line 33
    move/from16 v16, p16

    .line 34
    .line 35
    move-wide/from16 v17, p17

    .line 36
    .line 37
    invoke-static/range {v0 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$20(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic λ(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p16}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$25$lambda$24(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic μ(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$17$lambda$15(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ν(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, v0

    .line 4
    invoke-static/range {p0 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$8(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic ξ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog$lambda$37(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ο(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p14}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$12(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic π(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p16}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$25$lambda$23(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ρ(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$17$lambda$16(Landroid/widget/Button;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic σ(Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->showNewAwemeDetailDialog$lambda$37$lambda$33(Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic τ(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$9(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic υ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$20$lambda$18(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic φ(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic χ(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->loadCoverAsync$lambda$51(Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ψ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$20$lambda$19(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ω(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->show$lambda$28$lambda$26$lambda$17(Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final show(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput p2, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->currentTab:I

    .line 5
    .line 6
    new-instance p0, Ln9;

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    invoke-direct {p0, p1, p2}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
