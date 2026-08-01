.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field private static final ACTIVITY_CLASS:Ljava/lang/String;

.field private static final BUTTON_TAG:Ljava/lang/String; = "dyhelper_profile_bookmark_btn"

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

.field private static final MAX_RETRY:I = 0xa

.field private static final RETRY_DELAY_MS:J = 0xb4L

.field private static final TAG:Ljava/lang/String; = "ProfileBookmarkHook"

.field private static volatile currentProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

.field private static end:Z

.field private static final installed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final mainHandler:Landroid/os/Handler;

.field private static final managedButtons:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/widget/TextView;",
            "Ls62;",
            ">;"
        }
    .end annotation
.end field

.field private static final storeChangedListener:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 7
    .line 8
    const-string v0, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->ACTIVITY_CLASS:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    new-instance v0, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->mainHandler:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance v0, Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->managedButtons:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    new-instance v0, Lkt0;

    .line 43
    .line 44
    const/16 v1, 0x16

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->storeChangedListener:Lp70;

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->$stable:I

    .line 54
    .line 55
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

.method private final createBookmarkButton(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 5

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dyhelper_profile_bookmark_btn"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x41400000    # 12.0f

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setSelected(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setElevation(F)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 51
    .line 52
    const/16 v1, 0x1c

    .line 53
    .line 54
    invoke-direct {v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 59
    .line 60
    .line 61
    const/16 v1, 0x48

    .line 62
    .line 63
    invoke-direct {v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    invoke-direct {v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x4

    .line 77
    invoke-direct {v0, p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-direct {v0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-direct {v0, p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->dp(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p0, v2, v4, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 90
    .line 91
    .line 92
    const-string v0, "\u6dfb\u52a0\u4e66\u7b7e"

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v0, v0, Lxx;->Α:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v1, v1, Lxx;->ι:Ljava/lang/String;

    .line 108
    .line 109
    const/16 v2, 0xc

    .line 110
    .line 111
    invoke-static {v2, p1, v0, v1}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method private final dp(Landroid/content/Context;I)I
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final findButton(Landroid/view/ViewGroup;)Landroid/widget/TextView;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method private static final getOrCreateInfoButton$lambda$22$lambda$21(Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->onButtonClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final hookProfileActivity(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->ACTIVITY_CLASS:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v1, "ProfileBookmarkHook"

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const-string p0, "target activity not found: "

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v1, p0, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_0
    const-string v0, "onCreate"

    .line 26
    .line 27
    const-class v2, Landroid/os/Bundle;

    .line 28
    .line 29
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$1$1;

    .line 30
    .line 31
    invoke-direct {v3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {p1, v0, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    new-instance v2, Leo1;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v2

    .line 50
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    const-string v2, "hook onCreate failed"

    .line 57
    .line 58
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :try_start_1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 62
    .line 63
    const-string v0, "onResume"

    .line 64
    .line 65
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$3$1;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$3$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;)V

    .line 68
    .line 69
    .line 70
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {p1, v0, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    new-instance v2, Leo1;

    .line 81
    .line 82
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    move-object v0, v2

    .line 86
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    const-string v2, "hook onResume failed"

    .line 93
    .line 94
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    :try_start_2
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 98
    .line 99
    const-string v0, "onWindowFocusChanged"

    .line 100
    .line 101
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$5$1;

    .line 104
    .line 105
    invoke-direct {v3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$5$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p1, v0, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 113
    .line 114
    .line 115
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 116
    goto :goto_2

    .line 117
    :catchall_2
    move-exception p0

    .line 118
    new-instance v0, Leo1;

    .line 119
    .line 120
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object p0, v0

    .line 124
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    const-string v0, "hook onWindowFocusChanged failed"

    .line 131
    .line 132
    invoke-static {v1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    :try_start_3
    sget-object p0, Lqe0;->α:Ljava/lang/Object;

    .line 136
    .line 137
    const-string p0, "onDestroy"

    .line 138
    .line 139
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$7$1;

    .line 140
    .line 141
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook$hookProfileActivity$7$1;-><init>()V

    .line 142
    .line 143
    .line 144
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {p1, p0, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 149
    .line 150
    .line 151
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 152
    goto :goto_3

    .line 153
    :catchall_3
    move-exception p0

    .line 154
    new-instance p1, Leo1;

    .line 155
    .line 156
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    move-object p0, p1

    .line 160
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_4

    .line 165
    .line 166
    const-string p1, "hook onDestroy failed"

    .line 167
    .line 168
    invoke-static {v1, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    :cond_4
    return-void
.end method

.method private final install(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-string v0, "profile_bookmark_hook_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x4

    .line 9
    const-string v3, "ProfileBookmarkHook"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "profile bookmark hook disabled by config"

    .line 15
    .line 16
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-virtual {v0, v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 31
    .line 32
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->storeChangedListener:Lp70;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->addListener(Lp70;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    new-instance v1, Leo1;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const-string v1, "add store listener failed"

    .line 54
    .line 55
    invoke-static {v3, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->hookProfileActivity(Ljava/lang/ClassLoader;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "installed"

    .line 62
    .line 63
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private final onButtonClick(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/app/Activity;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Landroid/view/ViewGroup;

    .line 24
    .line 25
    :cond_1
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->currentProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    :cond_2
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-direct {p0, v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->resolveCurrentProfileRecord(Landroid/app/Activity;Landroid/view/ViewGroup;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getLastProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_1
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->setCurrentProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_8

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 78
    .line 79
    invoke-virtual {v4, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->isBookmarked(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_6

    .line 84
    .line 85
    invoke-virtual {v4, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->remove(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "\u5df2\u53d6\u6d88\u4e66\u7b7e"

    .line 93
    .line 94
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->refreshAllButtons()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_6
    if-nez v0, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "\u5f53\u524d\u9875\u9762\u4e0d\u53ef\u7528"

    .line 112
    .line 113
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_7
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 122
    .line 123
    new-instance p1, Lg71;

    .line 124
    .line 125
    const/16 v2, 0x9

    .line 126
    .line 127
    invoke-direct {p1, v0, v2}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, v0, v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;-><init>(Landroid/content/Context;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;La80;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->show()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_8
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const-string p1, "\u672a\u8bc6\u522b\u5230\u5f53\u524d\u4e3b\u9875\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 142
    .line 143
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method private static final onButtonClick$lambda$25(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->add(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getLatestAwemeItems(Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v0, v2, v1, v4, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->updateAwemeSnapshot(Ljava/lang/String;Ljava/util/List;IZ)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->markRead(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->setCurrentProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 47
    .line 48
    .line 49
    const-string p1, "\u5df2\u6dfb\u52a0\u4e66\u7b7e"

    .line 50
    .line 51
    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Ls62;->α:Ls62;

    .line 59
    .line 60
    return-object p0
.end method

.method private final postToMain(Lp70;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->mainHandler:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v0, Lr0;

    .line 22
    .line 23
    const/4 v1, 0x6

    .line 24
    invoke-direct {v0, v1, p1}, Lr0;-><init>(ILp70;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final postToMain$lambda$26(Lp70;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final refreshAllButtons()V
    .locals 2

    .line 1
    new-instance v0, Lkt0;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->postToMain(Lp70;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final refreshAllButtons$lambda$20()Ls62;
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->managedButtons:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/widget/TextView;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 28
    .line 29
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->currentProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 30
    .line 31
    invoke-direct {v3, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->styleButton(Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    monitor-exit v0

    .line 38
    sget-object v0, Ls62;->α:Ls62;

    .line 39
    .line 40
    return-object v0

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw v1
.end method

.method private final resolveCurrentProfileRecord(Landroid/app/Activity;Landroid/view/ViewGroup;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 1

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getLastProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    :try_start_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots([Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    new-instance p1, Leo1;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, p1

    .line 42
    :goto_0
    instance-of p1, p0, Leo1;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    move-object p0, p2

    .line 48
    :cond_1
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    move-object p2, p0

    .line 63
    :cond_2
    return-object p2
.end method

.method private final scheduleAttach(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->tryAttach(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->mainHandler:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v0, Lej1;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p1, p2, p3, v1}, Lej1;-><init>(Landroid/app/Activity;Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic scheduleAttach$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->scheduleAttach(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final scheduleAttach$lambda$13(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->tryAttach(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final setCurrentProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p1, v0

    .line 16
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->currentProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->refreshAllButtons()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private static final storeChangedListener$lambda$0()Ls62;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->refreshAllButtons()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ls62;->α:Ls62;

    .line 7
    .line 8
    return-object v0
.end method

.method private final styleButton(Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object v0, p0, Lxx;->Α:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 18
    .line 19
    invoke-virtual {v2, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->isBookmarked(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p2, v1

    .line 28
    :goto_0
    if-eqz p2, :cond_1

    .line 29
    .line 30
    const-string v2, "\u53d6\u6d88\u4e66\u7b7e"

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const-string v2, "\u6dfb\u52a0\u4e66\u7b7e"

    .line 34
    .line 35
    :goto_1
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0xc

    .line 46
    .line 47
    const/4 v3, -0x1

    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lxx;->χ:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2, p2, v0, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lxx;->ι:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2, p2, v0, p0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    const/high16 p0, 0x3f800000    # 1.0f

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method private final tryAttach(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Landroid/view/ViewGroup;

    .line 27
    .line 28
    :cond_2
    if-nez v1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->resolveCurrentProfileRecord(Landroid/app/Activity;Landroid/view/ViewGroup;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->setCurrentProfileRecord(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 38
    .line 39
    .line 40
    :cond_4
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->refreshAllButtons()V

    .line 41
    .line 42
    .line 43
    const/16 p0, 0xa

    .line 44
    .line 45
    if-ge p3, p0, :cond_6

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_6

    .line 58
    .line 59
    :cond_5
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->mainHandler:Landroid/os/Handler;

    .line 60
    .line 61
    new-instance v0, Lej1;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-direct {v0, p1, p2, p3, v1}, Lej1;-><init>(Landroid/app/Activity;Ljava/lang/String;II)V

    .line 65
    .line 66
    .line 67
    const-wide/16 p1, 0xb4

    .line 68
    .line 69
    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 70
    .line 71
    .line 72
    :cond_6
    :goto_1
    return-void
.end method

.method private static final tryAttach$lambda$14(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->tryAttach(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic α(Lp70;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->postToMain$lambda$26(Lp70;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->getOrCreateInfoButton$lambda$22$lambda$21(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic γ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->onButtonClick$lambda$25(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->tryAttach$lambda$14(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ε()Ls62;
    .locals 1

    .line 1
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->refreshAllButtons$lambda$20()Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic ζ(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->scheduleAttach$lambda$13(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic η()Ls62;
    .locals 1

    .line 1
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->storeChangedListener$lambda$0()Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public final getOrCreateInfoButton(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->createBookmarkButton(Landroid/content/Context;)Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lpa;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->managedButtons:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    sget-object v1, Ls62;->α:Ls62;

    .line 21
    .line 22
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->currentProfileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->styleButton(Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    monitor-exit v0

    .line 34
    throw p0
.end method

.method public final init(Landroid/content/Context;Ljava/lang/ClassLoader;)V
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
    const-string v0, "profile_bookmark_hook_enabled"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sput-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->end:Z

    .line 15
    .line 16
    const-string v1, "ProfileBookmarkHook"

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p0, "ProfileBookmarkHook \u521d\u59cb\u5316\u8df3\u8fc7"

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-static {v1, p0, p2, p1, p2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object p1, v0

    .line 36
    :goto_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkStore;->init(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeNotifier;->init(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    new-instance v0, Leo1;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :goto_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    const-string v0, "init store failed"

    .line 63
    .line 64
    invoke-static {v1, v0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-direct {p0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->install(Ljava/lang/ClassLoader;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final init(Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->install(Ljava/lang/ClassLoader;)V

    return-void
.end method
