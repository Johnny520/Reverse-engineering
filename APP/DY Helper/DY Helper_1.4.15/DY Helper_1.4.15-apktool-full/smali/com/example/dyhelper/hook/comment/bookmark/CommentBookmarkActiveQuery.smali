.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;,
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

.field private static final TAG:Ljava/lang/String; = "r3d4f554990ee3884"

.field private static volatile appContext:Landroid/content/Context;

.field private static volatile autoScanScheduled:Z

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static volatile hostClassLoader:Ljava/lang/ClassLoader;

.field private static final inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 7
    .line 8
    new-instance v0, Laj;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, v1}, Laj;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->executor:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->$stable:I

    .line 31
    .line 32
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

.method private static final executor$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    const-string v0, "r3d4f554990ee3884"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lnx;->σ(Ljava/lang/Runnable;Ljava/lang/String;Z)Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private final loadNewRepliesSafely(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;

    .line 2
    .line 3
    const/16 v0, 0x32

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyListClient;->loadFirstPage(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance p1, Leo1;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, p1

    .line 17
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "load reply list failed, cid="

    .line 32
    .line 33
    const-string v3, ", awemeId="

    .line 34
    .line 35
    invoke-static {v2, v0, v3, v1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "r3d4f554990ee3884"

    .line 40
    .line 41
    invoke-static {v1, v0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of p1, p0, Leo1;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    :cond_1
    if-nez p0, :cond_2

    .line 50
    .line 51
    sget-object p0, Ljz;->ε:Ljz;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->toNewReplyItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_9

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    move-object v1, v0

    .line 159
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_8

    .line 170
    .line 171
    invoke-virtual {p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getKnownReplyIds()Ljava/util/Set;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_8

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_9
    new-instance p0, Ljava/util/HashSet;

    .line 190
    .line 191
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 192
    .line 193
    .line 194
    new-instance p2, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    :cond_a
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_b

    .line 208
    .line 209
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    move-object v1, v0

    .line 214
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 215
    .line 216
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    return-object p2
.end method

.method public static synthetic queryAll$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;Landroid/app/Activity;La80;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Lgh;

    .line 6
    .line 7
    const/16 p3, 0x18

    .line 8
    .line 9
    invoke-direct {p2, p3}, Lgh;-><init>(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->queryAll(Landroid/app/Activity;La80;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final queryAll$lambda$19(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method private static final queryAll$lambda$21(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const-wide/16 v3, 0x78

    .line 10
    .line 11
    invoke-direct {v1, v2, v3, v4, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;-><init>(ZJZ)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->querySnapshot(Ljava/lang/ClassLoader;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Le9;

    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    invoke-direct {p1, p2, p0, p3, v0}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final queryAll$lambda$21$lambda$20(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;La80;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->toastText()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final querySnapshot(Ljava/lang/ClassLoader;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;",
            ">;",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;",
            ")",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, ", awemeId="

    .line 4
    .line 5
    const-string v3, "r3d4f554990ee3884"

    .line 6
    .line 7
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v11, 0x0

    .line 15
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_d

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 27
    .line 28
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_b

    .line 37
    .line 38
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 51
    .line 52
    :try_start_0
    sget-object v12, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 53
    .line 54
    invoke-virtual {v12, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->loadInsertedCommentList(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    if-eqz v12, :cond_7

    .line 59
    .line 60
    sget-object v13, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 61
    .line 62
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    invoke-virtual {v13, v12, v14}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    if-eqz v12, :cond_6

    .line 71
    .line 72
    invoke-virtual {v13, v12}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getReplyCount(Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    if-ltz v12, :cond_5

    .line 77
    .line 78
    sget-object v13, Ljz;->ε:Ljz;

    .line 79
    .line 80
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->getLoadReplyWhenCountIncreased()Z

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-eqz v14, :cond_2

    .line 85
    .line 86
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getLastKnownReplyCount()I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    if-gt v12, v14, :cond_1

    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getHasNewReplies()Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-eqz v14, :cond_2

    .line 97
    .line 98
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    if-lez v14, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eqz v14, :cond_2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    const/4 v7, 0x0

    .line 117
    goto/16 :goto_3

    .line 118
    .line 119
    :cond_1
    :goto_1
    invoke-direct {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->loadNewRepliesSafely(Ljava/lang/ClassLoader;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    :cond_2
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 124
    .line 125
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->getNotifyIfNew()Z

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    invoke-virtual {v0, v14, v12, v13, v15}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCountAndReplies(Ljava/lang/String;ILjava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    add-int/lit8 v8, v8, 0x1

    .line 138
    .line 139
    if-eqz v0, :cond_3

    .line 140
    .line 141
    add-int/lit8 v9, v9, 0x1

    .line 142
    .line 143
    :cond_3
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v0, :cond_4

    .line 156
    .line 157
    const/4 v0, 0x1

    .line 158
    goto :goto_2

    .line 159
    :cond_4
    const/4 v0, 0x0

    .line 160
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v7, "queried cid="

    .line 166
    .line 167
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v7, ", replyCount="

    .line 180
    .line 181
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v7, ", newReplyItems="

    .line 188
    .line 189
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v7, ", changed="

    .line 196
    .line 197
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    const/4 v5, 0x4

    .line 208
    const/4 v7, 0x0

    .line 209
    :try_start_1
    invoke-static {v3, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Ls62;->α:Ls62;

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :catchall_1
    move-exception v0

    .line 216
    goto :goto_3

    .line 217
    :cond_5
    const/4 v7, 0x0

    .line 218
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 219
    .line 220
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    new-instance v12, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const-string v13, "replyCount invalid, cid="

    .line 230
    .line 231
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_6
    const/4 v7, 0x0

    .line 250
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    new-instance v12, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v13, "comment not found in response, cid="

    .line 262
    .line 263
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_7
    const/4 v7, 0x0

    .line 282
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 283
    .line 284
    const-string v5, "loadInsertedCommentList returns null"

    .line 285
    .line 286
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    :goto_3
    new-instance v5, Leo1;

    .line 291
    .line 292
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 293
    .line 294
    .line 295
    move-object v0, v5

    .line 296
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_a

    .line 301
    .line 302
    add-int/lit8 v11, v11, 0x1

    .line 303
    .line 304
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getAwemeId()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    if-eqz v14, :cond_8

    .line 329
    .line 330
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    move-result-object v14

    .line 334
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v14

    .line 338
    goto :goto_5

    .line 339
    :cond_8
    move-object v14, v7

    .line 340
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 341
    .line 342
    .line 343
    move-result-object v15

    .line 344
    if-eqz v15, :cond_9

    .line 345
    .line 346
    invoke-virtual {v15}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    :cond_9
    const-string v15, "query failed cid="

    .line 351
    .line 352
    const-string v1, ", type="

    .line 353
    .line 354
    invoke-static {v15, v5, v2, v6, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    const-string v5, ", message="

    .line 359
    .line 360
    const-string v6, ", cause="

    .line 361
    .line 362
    invoke-static {v1, v12, v5, v13, v6}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v5, ":"

    .line 366
    .line 367
    invoke-static {v1, v14, v5, v7}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-static {v3, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    :cond_a
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->getDelayBetweenItemsMs()J

    .line 375
    .line 376
    .line 377
    move-result-wide v0

    .line 378
    const-wide/16 v5, 0x0

    .line 379
    .line 380
    cmp-long v0, v0, v5

    .line 381
    .line 382
    if-lez v0, :cond_c

    .line 383
    .line 384
    :try_start_2
    invoke-virtual/range {p3 .. p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;->getDelayBetweenItemsMs()J

    .line 385
    .line 386
    .line 387
    move-result-wide v0

    .line 388
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_b
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 393
    .line 394
    :catchall_2
    :cond_c
    :goto_7
    move-object/from16 v1, p1

    .line 395
    .line 396
    goto/16 :goto_0

    .line 397
    .line 398
    :cond_d
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 399
    .line 400
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    invoke-direct/range {v6 .. v11}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;-><init>(IIIII)V

    .line 405
    .line 406
    .line 407
    return-object v6
.end method

.method private static final scheduleAutoScanIfNeeded$lambda$8(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-string v0, "auto scan completed, total="

    .line 2
    .line 3
    const-string v1, "auto scan started, total bookmarks="

    .line 4
    .line 5
    const-wide/16 v2, 0x1388

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->all()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const-string p0, "r3d4f554990ee3884"

    .line 26
    .line 27
    const-string v0, "auto scan skipped, no bookmarks"

    .line 28
    .line 29
    invoke-static {p0, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 33
    .line 34
    monitor-enter p0

    .line 35
    :try_start_1
    sput-boolean v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    monitor-exit p0

    .line 41
    throw v0

    .line 42
    :catchall_1
    move-exception p0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    :try_start_2
    const-string v3, "r3d4f554990ee3884"

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    new-instance v8, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v3, v1, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 66
    .line 67
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;

    .line 68
    .line 69
    const-wide/16 v7, 0xc8

    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    invoke-direct {v3, v9, v7, v8, v9}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;-><init>(ZJZ)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, p0, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->querySnapshot(Ljava/lang/ClassLoader;Ljava/util/List;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$QueryOptions;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v2, "r3d4f554990ee3884"

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->getTotal()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->getQueried()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->getUpdated()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->getSkipped()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;->getFailed()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    new-instance v10, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, ", queried="

    .line 110
    .line 111
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v0, ", updated="

    .line 118
    .line 119
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v0, ", skipped="

    .line 126
    .line 127
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v0, ", failed="

    .line 134
    .line 135
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {v2, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    .line 147
    .line 148
    monitor-enter v1

    .line 149
    :try_start_3
    sput-boolean v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 150
    .line 151
    monitor-exit v1

    .line 152
    return-void

    .line 153
    :catchall_2
    move-exception p0

    .line 154
    monitor-exit v1

    .line 155
    throw p0

    .line 156
    :goto_0
    :try_start_4
    const-string v0, "r3d4f554990ee3884"

    .line 157
    .line 158
    const-string v1, "auto scan error"

    .line 159
    .line 160
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 161
    .line 162
    .line 163
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 164
    .line 165
    monitor-enter p0

    .line 166
    :try_start_5
    sput-boolean v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 167
    .line 168
    monitor-exit p0

    .line 169
    return-void

    .line 170
    :catchall_3
    move-exception v0

    .line 171
    monitor-exit p0

    .line 172
    throw v0

    .line 173
    :catchall_4
    move-exception p0

    .line 174
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 175
    .line 176
    monitor-enter v0

    .line 177
    :try_start_6
    sput-boolean v4, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 178
    .line 179
    monitor-exit v0

    .line 180
    throw p0

    .line 181
    :catchall_5
    move-exception p0

    .line 182
    monitor-exit v0

    .line 183
    throw p0
.end method

.method public static synthetic α(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->scheduleAutoScanIfNeeded$lambda$8(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;La80;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->queryAll$lambda$21$lambda$20(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;La80;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic γ(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->queryAll$lambda$21(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic δ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->queryAll$lambda$19(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ε(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->executor$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final init(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

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
    move-object p1, v0

    .line 15
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->appContext:Landroid/content/Context;

    .line 16
    .line 17
    sput-object p2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->installCaptureHooks(Ljava/lang/ClassLoader;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final installCaptureHooks(Ljava/lang/ClassLoader;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;->installCaptureHooks(Ljava/lang/ClassLoader;Z)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    new-instance p1, Leo1;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p0, p1

    .line 19
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const-string p1, "r3d4f554990ee3884"

    .line 26
    .line 27
    const-string p2, "installCaptureHooks failed"

    .line 28
    .line 29
    invoke-static {p1, p2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final queryAll(Landroid/app/Activity;La80;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "La80;",
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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    move-object v1, p0

    .line 16
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->inFlight:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string p0, "\u6b63\u5728\u67e5\u8be2\u4e66\u7b7e\u8bc4\u8bba\uff0c\u8bf7\u7a0d\u5019"

    .line 27
    .line 28
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->all()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 49
    .line 50
    .line 51
    const-string p0, "\u6682\u65e0\u4e66\u7b7e\u8bc4\u8bba"

    .line 52
    .line 53
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery$Summary;-><init>(IIIII)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "\u5f00\u59cb\u67e5\u8be2\u4e66\u7b7e\u8bc4\u8bba"

    .line 75
    .line 76
    invoke-static {p1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->executor:Ljava/util/concurrent/ExecutorService;

    .line 84
    .line 85
    move-object v2, v0

    .line 86
    new-instance v0, Lnj;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    move-object v3, p1

    .line 90
    move-object v4, p2

    .line 91
    invoke-direct/range {v0 .. v5}, Lnj;-><init>(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final scheduleAutoScanIfNeeded()V
    .locals 6

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->hostClassLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const-string v2, "dyhelper_prefs"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "comment_bookmark_auto_scan_enabled"

    .line 19
    .line 20
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x4

    .line 25
    const/4 v4, 0x0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const-string p0, "r3d4f554990ee3884"

    .line 29
    .line 30
    const-string v0, "auto scan disabled by user settings"

    .line 31
    .line 32
    invoke-static {p0, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const/4 v0, 0x1

    .line 37
    :try_start_0
    invoke-static {}, Lx9;->π()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->γ()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    move v3, v0

    .line 50
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v3

    .line 56
    new-instance v5, Leo1;

    .line 57
    .line 58
    invoke-direct {v5, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v3, v5

    .line 62
    :goto_1
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    :goto_2
    check-cast v3, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    const-string p0, "r3d4f554990ee3884"

    .line 80
    .line 81
    const-string v0, "auto scan skipped, not a beta user"

    .line 82
    .line 83
    invoke-static {p0, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_5
    monitor-enter p0

    .line 88
    :try_start_1
    sget-boolean v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    const-string v0, "r3d4f554990ee3884"

    .line 93
    .line 94
    const-string v1, "auto scan already scheduled, skip"

    .line 95
    .line 96
    invoke-static {v0, v1, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    monitor-exit p0

    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :cond_6
    :try_start_2
    sput-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->autoScanScheduled:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    monitor-exit p0

    .line 106
    const-string p0, "r3d4f554990ee3884"

    .line 107
    .line 108
    const-string v0, "auto scan scheduled, will execute after 5 seconds delay"

    .line 109
    .line 110
    invoke-static {p0, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->executor:Ljava/util/concurrent/ExecutorService;

    .line 114
    .line 115
    new-instance v0, Loj;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-direct {v0, v1, v2}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :goto_3
    monitor-exit p0

    .line 126
    throw v0
.end method
