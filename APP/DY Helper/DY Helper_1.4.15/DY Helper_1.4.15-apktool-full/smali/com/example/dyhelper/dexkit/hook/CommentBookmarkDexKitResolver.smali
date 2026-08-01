.class public final Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field private static final BIND_METHOD_MIN_SCORE:I = 0x320

.field private static final COMMENT_LIST_METHOD_NAMES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final COMMENT_LIST_URLS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

.field private static final REPLY_LIST_METHOD_NAMES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final REPLY_LIST_URLS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "rdf70e25084e5dfd3"


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 7
    .line 8
    const-string v0, "/aweme/v1/comment/list/"

    .line 9
    .line 10
    const-string v1, "aweme/v1/comment/list"

    .line 11
    .line 12
    const-string v2, "/aweme/v2/comment/list/"

    .line 13
    .line 14
    const-string v3, "aweme/v2/comment/list"

    .line 15
    .line 16
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->COMMENT_LIST_URLS:Ljava/util/List;

    .line 25
    .line 26
    const-string v5, "loadMoreComments"

    .line 27
    .line 28
    const-string v6, "loadMoreCommentList"

    .line 29
    .line 30
    const-string v1, "fetchCommentListV2Post"

    .line 31
    .line 32
    const-string v2, "fetchCommentListV2Stream"

    .line 33
    .line 34
    const-string v3, "fetchCommentListPost"

    .line 35
    .line 36
    const-string v4, "fetchCommentList"

    .line 37
    .line 38
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->COMMENT_LIST_METHOD_NAMES:Ljava/util/List;

    .line 47
    .line 48
    const-string v0, "/aweme/v2/comment/list/reply/"

    .line 49
    .line 50
    const-string v1, "aweme/v2/comment/list/reply"

    .line 51
    .line 52
    const-string v2, "/aweme/v1/comment/list/reply/"

    .line 53
    .line 54
    const-string v3, "aweme/v1/comment/list/reply"

    .line 55
    .line 56
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->REPLY_LIST_URLS:Ljava/util/List;

    .line 65
    .line 66
    const-string v0, "loadMoreReplyList"

    .line 67
    .line 68
    const-string v1, "fetchCommentReplyList"

    .line 69
    .line 70
    const-string v2, "fetchReplyTreeListPOST"

    .line 71
    .line 72
    const-string v3, "fetchReplyTreeList"

    .line 73
    .line 74
    const-string v4, "loadMoreCommentListPOST"

    .line 75
    .line 76
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->REPLY_LIST_METHOD_NAMES:Ljava/util/List;

    .line 85
    .line 86
    const/16 v0, 0x8

    .line 87
    .line 88
    sput v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->$stable:I

    .line 89
    .line 90
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

.method public static final synthetic access$scoreBindMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreBindMethod(Ljava/lang/reflect/Method;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreLoadMoreCommentMethod(Ljava/lang/reflect/Method;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreReplyListMethod(Ljava/lang/reflect/Method;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$scoreReplyMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreReplyMethod(Ljava/lang/reflect/Method;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final annotationText(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const/16 v4, 0xa

    .line 17
    .line 18
    if-ge v3, v1, :cond_0

    .line 19
    .line 20
    aget-object v5, v0, v3

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v0, p1

    .line 43
    move v1, v2

    .line 44
    :goto_1
    if-ge v1, v0, :cond_2

    .line 45
    .line 46
    aget-object v3, p1, v1

    .line 47
    .line 48
    check-cast v3, [Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    array-length v5, v3

    .line 54
    move v6, v2

    .line 55
    :goto_2
    if-ge v6, v5, :cond_1

    .line 56
    .line 57
    aget-object v7, v3, v6

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method private final dexKitFindBindMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Luj;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, Luj;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    :try_start_1
    invoke-virtual {v1, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isRecyclerBindMethod(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :try_start_2
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_1
    new-instance p1, Leo1;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object p0, p1

    .line 57
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const-string p1, "rdf70e25084e5dfd3"

    .line 64
    .line 65
    const-string p2, "dexKitFindBindMethods failed"

    .line 66
    .line 67
    invoke-static {p1, p2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance p1, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    :cond_3
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v1, v0

    .line 95
    check-cast v1, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 98
    .line 99
    invoke-direct {v2, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    new-instance p0, Ltf;

    .line 114
    .line 115
    const/16 p2, 0x8

    .line 116
    .line 117
    invoke-direct {p0, p2}, Ltf;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :cond_5
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    move-object v0, p2

    .line 144
    check-cast v0, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 147
    .line 148
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreBindMethod(Ljava/lang/reflect/Method;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    const/16 v1, 0x320

    .line 153
    .line 154
    if-lt v0, v1, :cond_5

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    const/16 p0, 0x258

    .line 161
    .line 162
    invoke-static {p1, p0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method

.method private static final dexKitFindBindMethods$lambda$97$lambda$94(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Luj;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Luj;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0
.end method

.method private static final dexKitFindBindMethods$lambda$97$lambda$94$lambda$93(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const-string v1, "onBindViewHolder"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 12
    .line 13
    .line 14
    const/4 v10, 0x6

    .line 15
    const/4 v11, 0x0

    .line 16
    const-string v7, "void"

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    move-object v6, v0

    .line 21
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 22
    .line 23
    .line 24
    sget-object p0, Ls62;->α:Ls62;

    .line 25
    .line 26
    return-object p0
.end method

.method private final dexKitFindLoadMoreCommentMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->COMMENT_LIST_URLS:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "rdf70e25084e5dfd3"

    .line 17
    .line 18
    sget-object v3, Ls62;->α:Ls62;

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v4, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 29
    .line 30
    :try_start_0
    new-instance v5, Ls9;

    .line 31
    .line 32
    const/4 v6, 0x7

    .line 33
    invoke-direct {v5, v1, v6}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :catchall_0
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v6, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-direct {v4, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception v3

    .line 71
    new-instance v4, Leo1;

    .line 72
    .line 73
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v3, v4

    .line 77
    :cond_2
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    const-string v4, "find comment list by url failed url="

    .line 84
    .line 85
    invoke-static {v4, v1, v2, v3}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->COMMENT_LIST_METHOD_NAMES:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    sget-object v4, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 108
    .line 109
    :try_start_2
    new-instance v5, Ls9;

    .line 110
    .line 111
    const/16 v6, 0x8

    .line 112
    .line 113
    invoke-direct {v5, v1, v6}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :catchall_2
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 135
    .line 136
    :try_start_3
    invoke-virtual {v6, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-direct {v4, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_5

    .line 145
    .line 146
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :catchall_3
    move-exception v4

    .line 151
    goto :goto_4

    .line 152
    :cond_6
    move-object v5, v3

    .line 153
    goto :goto_5

    .line 154
    :goto_4
    new-instance v5, Leo1;

    .line 155
    .line 156
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :goto_5
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_4

    .line 164
    .line 165
    const-string v5, "find comment method name failed name="

    .line 166
    .line 167
    invoke-static {v5, v1, v2, v4}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    new-instance p1, Ljava/util/HashSet;

    .line 172
    .line 173
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance p2, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    :cond_8
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_9

    .line 190
    .line 191
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    move-object v1, v0

    .line 196
    check-cast v1, Ljava/lang/reflect/Method;

    .line 197
    .line 198
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 199
    .line 200
    invoke-direct {v2, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_8

    .line 209
    .line 210
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_9
    new-instance p0, Ltf;

    .line 215
    .line 216
    const/16 p1, 0x9

    .line 217
    .line 218
    invoke-direct {p0, p1}, Ltf;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-static {p2, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    new-instance p1, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    :cond_a
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-eqz p2, :cond_b

    .line 239
    .line 240
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    move-object v0, p2

    .line 245
    check-cast v0, Ljava/lang/reflect/Method;

    .line 246
    .line 247
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 248
    .line 249
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreLoadMoreCommentMethod(Ljava/lang/reflect/Method;)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    const/16 v1, 0x3e8

    .line 254
    .line 255
    if-lt v0, v1, :cond_a

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_b
    const/16 p0, 0x1e

    .line 262
    .line 263
    invoke-static {p1, p0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0
.end method

.method private static final dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls9;

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21$lambda$20(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    filled-new-array {p0}, [Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls9;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28$lambda$27(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v0, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0
.end method

.method private final dexKitFindReplyListMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->REPLY_LIST_URLS:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "rdf70e25084e5dfd3"

    .line 17
    .line 18
    sget-object v3, Ls62;->α:Ls62;

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v4, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 29
    .line 30
    :try_start_0
    new-instance v5, Ls9;

    .line 31
    .line 32
    const/16 v6, 0xd

    .line 33
    .line 34
    invoke-direct {v5, v1, v6}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :catchall_0
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v6, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-direct {v4, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyListMethod(Ljava/lang/reflect/Method;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception v3

    .line 72
    new-instance v4, Leo1;

    .line 73
    .line 74
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v3, v4

    .line 78
    :cond_2
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    const-string v4, "find reply list by url failed url="

    .line 85
    .line 86
    invoke-static {v4, v1, v2, v3}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->REPLY_LIST_METHOD_NAMES:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_7

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    sget-object v4, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 109
    .line 110
    :try_start_2
    new-instance v5, Ls9;

    .line 111
    .line 112
    const/16 v6, 0xe

    .line 113
    .line 114
    invoke-direct {v5, v1, v6}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    :catchall_2
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_6

    .line 130
    .line 131
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v6, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-direct {v4, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyListMethod(Ljava/lang/reflect/Method;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_3
    move-exception v4

    .line 152
    goto :goto_4

    .line 153
    :cond_6
    move-object v5, v3

    .line 154
    goto :goto_5

    .line 155
    :goto_4
    new-instance v5, Leo1;

    .line 156
    .line 157
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_5
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    if-eqz v4, :cond_4

    .line 165
    .line 166
    const-string v5, "find reply method name failed name="

    .line 167
    .line 168
    invoke-static {v5, v1, v2, v4}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_7
    new-instance p1, Ljava/util/HashSet;

    .line 173
    .line 174
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 175
    .line 176
    .line 177
    new-instance p2, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :cond_8
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_9

    .line 191
    .line 192
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    move-object v1, v0

    .line 197
    check-cast v1, Ljava/lang/reflect/Method;

    .line 198
    .line 199
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 200
    .line 201
    invoke-direct {v2, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_8

    .line 210
    .line 211
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_9
    new-instance p0, Ltf;

    .line 216
    .line 217
    const/16 p1, 0xa

    .line 218
    .line 219
    invoke-direct {p0, p1}, Ltf;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {p2, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    new-instance p1, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    :cond_a
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-eqz p2, :cond_b

    .line 240
    .line 241
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    move-object v0, p2

    .line 246
    check-cast v0, Ljava/lang/reflect/Method;

    .line 247
    .line 248
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 249
    .line 250
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreReplyListMethod(Ljava/lang/reflect/Method;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    const/16 v1, 0x3e8

    .line 255
    .line 256
    if-lt v0, v1, :cond_a

    .line 257
    .line 258
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_b
    const/16 p0, 0xf

    .line 263
    .line 264
    invoke-static {p1, p0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    return-object p0
.end method

.method private static final dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls9;

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72$lambda$71(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    filled-new-array {p0}, [Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ls62;->α:Ls62;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls9;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79$lambda$78(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v0, p1

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0
.end method

.method private final dexKitFindReplyQueryMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Ls62;->α:Ls62;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-instance v2, Lgh;

    .line 9
    .line 10
    const/16 v3, 0x1c

    .line 11
    .line 12
    invoke-direct {v2, v3}, Lgh;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v3, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-direct {p0, v3}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyQueryMethod(Ljava/lang/reflect/Method;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v3, v0

    .line 52
    goto :goto_2

    .line 53
    :goto_1
    new-instance v3, Leo1;

    .line 54
    .line 55
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "rdf70e25084e5dfd3"

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    const-string v4, "find List reply methods failed"

    .line 67
    .line 68
    invoke-static {v3, v4, v2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    :try_start_2
    new-instance v2, Luj;

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-direct {v2, v4}, Luj;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :catchall_2
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 96
    .line 97
    :try_start_3
    invoke-virtual {v2, p2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {p0, v2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyQueryMethod(Ljava/lang/reflect/Method;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catchall_3
    move-exception p0

    .line 112
    new-instance v0, Leo1;

    .line 113
    .line 114
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_5

    .line 122
    .line 123
    const-string p1, "find int reply methods failed"

    .line 124
    .line 125
    invoke-static {v3, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    new-instance p0, Ljava/util/HashSet;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance p1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    :cond_6
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v1, v0

    .line 153
    check-cast v1, Ljava/lang/reflect/Method;

    .line 154
    .line 155
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 156
    .line 157
    invoke-direct {v2, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_7
    new-instance p0, Ltf;

    .line 172
    .line 173
    const/16 p2, 0xb

    .line 174
    .line 175
    invoke-direct {p0, p2}, Ltf;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    new-instance p1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    :cond_8
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eqz p2, :cond_9

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    move-object v0, p2

    .line 202
    check-cast v0, Ljava/lang/reflect/Method;

    .line 203
    .line 204
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 205
    .line 206
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreReplyMethod(Ljava/lang/reflect/Method;)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    const/16 v1, 0x12c

    .line 211
    .line 212
    if-lt v0, v1, :cond_8

    .line 213
    .line 214
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    const/16 p0, 0x50

    .line 219
    .line 220
    invoke-static {p1, p0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0
.end method

.method private static final dexKitFindReplyQueryMethods$lambda$106$lambda$103(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lgh;

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lgh;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final dexKitFindReplyQueryMethods$lambda$106$lambda$103$lambda$102(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "java.lang.String"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const-string v2, "java.util.List"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v1, p0

    .line 20
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 21
    .line 22
    .line 23
    sget-object p0, Ls62;->α:Ls62;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final dexKitFindReplyQueryMethods$lambda$112$lambda$109(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Luj;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Luj;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ls62;->α:Ls62;

    .line 14
    .line 15
    return-object p0
.end method

.method private static final dexKitFindReplyQueryMethods$lambda$112$lambda$109$lambda$108(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "java.lang.String"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const-string v2, "int"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v1, p0

    .line 20
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 21
    .line 22
    .line 23
    sget-object p0, Ls62;->α:Ls62;

    .line 24
    .line 25
    return-object p0
.end method

.method private final isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isNetworkReturn(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    array-length v2, v0

    .line 36
    const/4 v3, 0x4

    .line 37
    if-ge v2, v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_2
    aget-object v0, v0, v1

    .line 42
    .line 43
    const-class v2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->annotationText(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, "/aweme/v1/comment/list/"

    .line 57
    .line 58
    const-string v2, "aweme/v1/comment/list"

    .line 59
    .line 60
    const-string v3, "/aweme/v2/comment/list/"

    .line 61
    .line 62
    const-string v4, "aweme/v2/comment/list"

    .line 63
    .line 64
    filled-new-array {v3, v4, v0, v2}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x1

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    :cond_4
    move v0, v1

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    move v0, v3

    .line 104
    :goto_0
    const-string v2, "aweme_id"

    .line 105
    .line 106
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const-string v4, "insert_ids"

    .line 111
    .line 112
    invoke-static {p0, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    const-string v9, "loadMoreComments"

    .line 116
    .line 117
    const-string v10, "loadMoreCommentList"

    .line 118
    .line 119
    const-string v5, "fetchCommentListV2Post"

    .line 120
    .line 121
    const-string v6, "fetchCommentListV2Stream"

    .line 122
    .line 123
    const-string v7, "fetchCommentListPost"

    .line 124
    .line 125
    const-string v8, "fetchCommentList"

    .line 126
    .line 127
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez v0, :cond_8

    .line 144
    .line 145
    if-eqz p0, :cond_7

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    :goto_1
    return v1

    .line 151
    :cond_8
    :goto_2
    return v3
.end method

.method private final isNetworkReturn(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isNetworkReturn(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final isRecyclerBindMethod(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "onBindViewHolder"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    return v0

    .line 39
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    array-length p1, p0

    .line 44
    const/4 v1, 0x2

    .line 45
    if-ge p1, v1, :cond_3

    .line 46
    .line 47
    return v0

    .line 48
    :cond_3
    const/4 p1, 0x1

    .line 49
    aget-object v1, p0, p1

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_4

    .line 58
    .line 59
    return v0

    .line 60
    :cond_4
    aget-object p0, p0, v0

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v1, "RecyclerView"

    .line 67
    .line 68
    invoke-static {p0, v1, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_6

    .line 73
    .line 74
    const-string v1, "ViewHolder"

    .line 75
    .line 76
    invoke-static {p0, v1, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    return v0

    .line 84
    :cond_6
    :goto_0
    return p1
.end method

.method private final isReplyListMethod(Ljava/lang/reflect/Method;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isNetworkReturn(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    array-length v3, v2

    .line 36
    const/4 v4, 0x5

    .line 37
    if-ge v3, v4, :cond_2

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_2
    aget-object v3, v2, v1

    .line 42
    .line 43
    const-class v4, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_3
    const/4 v3, 0x1

    .line 54
    aget-object v4, v2, v3

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isLongCompat(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_4
    const/4 v4, 0x2

    .line 68
    aget-object v2, v2, v4

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;->isIntCompat(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_5
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->annotationText(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v0, "/aweme/v2/comment/list/reply/"

    .line 86
    .line 87
    const-string v2, "aweme/v2/comment/list/reply"

    .line 88
    .line 89
    const-string v4, "/aweme/v1/comment/list/reply/"

    .line 90
    .line 91
    const-string v5, "aweme/v1/comment/list/reply"

    .line 92
    .line 93
    filled-new-array {v4, v5, v0, v2}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    :cond_6
    move v0, v1

    .line 108
    goto :goto_0

    .line 109
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_6

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_8

    .line 130
    .line 131
    move v0, v3

    .line 132
    :goto_0
    const-string v2, "comment_id"

    .line 133
    .line 134
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    const-string v4, "item_id"

    .line 139
    .line 140
    invoke-static {p0, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    const-string v5, "cursor"

    .line 145
    .line 146
    invoke-static {p0, v5, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    const-string v6, "count"

    .line 151
    .line 152
    invoke-static {p0, v6, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    const-string v6, "loadMoreReplyList"

    .line 157
    .line 158
    const-string v7, "fetchCommentReplyList"

    .line 159
    .line 160
    const-string v8, "fetchReplyTreeListPOST"

    .line 161
    .line 162
    const-string v9, "fetchReplyTreeList"

    .line 163
    .line 164
    const-string v10, "loadMoreCommentListPOST"

    .line 165
    .line 166
    filled-new-array {v8, v9, v10, v6, v7}, [Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {v6}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-interface {v6, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez v0, :cond_b

    .line 183
    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    if-eqz v2, :cond_9

    .line 187
    .line 188
    if-nez v4, :cond_b

    .line 189
    .line 190
    :cond_9
    if-eqz v2, :cond_a

    .line 191
    .line 192
    if-eqz v5, :cond_a

    .line 193
    .line 194
    if-eqz p0, :cond_a

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_a
    :goto_1
    return v1

    .line 198
    :cond_b
    :goto_2
    return v3
.end method

.method private final isReplyQueryMethod(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v2, v0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eq v2, v3, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    aget-object v0, v0, v1

    .line 23
    .line 24
    const-class v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    return v1

    .line 33
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    const-class v2, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_4

    .line 52
    .line 53
    const-class v2, Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return v1

    .line 63
    :cond_4
    :goto_0
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreReplyMethod(Ljava/lang/reflect/Method;)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    const/16 p1, 0x12c

    .line 68
    .line 69
    if-lt p0, p1, :cond_5

    .line 70
    .line 71
    return v3

    .line 72
    :cond_5
    return v1
.end method

.method private final reflectionFindLoadMoreCommentMethods(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    const-string p0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"

    .line 2
    .line 3
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134F80469450558EA16A886F15339F01003A1C1C8796505E87D017E6F29ECFABC521C357F6D29087A37D3775"

    .line 8
    .line 9
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v2, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 57
    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    array-length v4, v1

    .line 64
    const/4 v5, 0x0

    .line 65
    :goto_1
    if-ge v5, v4, :cond_3

    .line 66
    .line 67
    aget-object v6, v1, v5

    .line 68
    .line 69
    invoke-direct {v2, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    new-instance p0, Ljava/util/HashSet;

    .line 106
    .line 107
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance p1, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    move-object v2, v1

    .line 130
    check-cast v2, Ljava/lang/reflect/Method;

    .line 131
    .line 132
    sget-object v3, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 133
    .line 134
    invoke-direct {v3, v2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_6
    new-instance p0, Ltf;

    .line 149
    .line 150
    const/16 v0, 0xc

    .line 151
    .line 152
    invoke-direct {p0, v0}, Ltf;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    new-instance v6, Luj;

    .line 164
    .line 165
    const/4 p1, 0x5

    .line 166
    invoke-direct {v6, p1}, Luj;-><init>(I)V

    .line 167
    .line 168
    .line 169
    const/16 v7, 0x17

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    const/4 v3, 0x0

    .line 173
    const/4 v4, 0x0

    .line 174
    const/16 v5, 0xa

    .line 175
    .line 176
    invoke-static/range {v1 .. v7}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "reflectionFindLoadMoreCommentMethods result="

    .line 183
    .line 184
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string p0, ", "

    .line 191
    .line 192
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const/4 p1, 0x4

    .line 203
    const-string v0, "rdf70e25084e5dfd3"

    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-static {v0, p0, v2, p1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-object v1
.end method

.method private static final reflectionFindLoadMoreCommentMethods$lambda$19(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 5

    .line 1
    invoke-static {p0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    array-length p0, p0

    .line 22
    const-string v3, "#"

    .line 23
    .line 24
    const-string v4, ":"

    .line 25
    .line 26
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "/"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private final reflectionFindReplyListMethods(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p0, Ljz;->ε:Ljz;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    array-length v1, p1

    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-ge v2, v1, :cond_2

    .line 33
    .line 34
    aget-object v3, p1, v2

    .line 35
    .line 36
    invoke-direct {p0, v3}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyListMethod(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v2, v1

    .line 73
    check-cast v2, Ljava/lang/reflect/Method;

    .line 74
    .line 75
    sget-object v3, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-direct {v3, v2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    new-instance p0, Ltf;

    .line 95
    .line 96
    const/16 v0, 0xd

    .line 97
    .line 98
    invoke-direct {p0, v0}, Ltf;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/lang/reflect/Method;

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$4(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqx;

    .line 5
    .line 6
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v1, Lkx;->т:Lkx;

    .line 9
    .line 10
    invoke-static {v1, p0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcb;

    .line 15
    .line 16
    const/16 v3, 0xe

    .line 17
    .line 18
    invoke-direct {v2, p0, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 19
    .line 20
    .line 21
    const-string v3, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\uff1a\u8bc4\u8bba\u5217\u8868\u7ed1\u5b9a\u65b9\u6cd5"

    .line 22
    .line 23
    invoke-direct {v0, v1, v3, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lqx;

    .line 27
    .line 28
    sget-object v2, Lkx;->у:Lkx;

    .line 29
    .line 30
    invoke-static {v2, p0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lcb;

    .line 35
    .line 36
    const/16 v4, 0xf

    .line 37
    .line 38
    invoke-direct {v3, p0, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 39
    .line 40
    .line 41
    const-string v4, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\uff1a\u56de\u590d\u67e5\u8be2\u65b9\u6cd5"

    .line 42
    .line 43
    invoke-direct {v1, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lqx;

    .line 47
    .line 48
    sget-object v3, Lkx;->о:Lkx;

    .line 49
    .line 50
    invoke-static {v3, p0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Lcb;

    .line 55
    .line 56
    const/16 v5, 0x10

    .line 57
    .line 58
    invoke-direct {v4, p0, v5}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 59
    .line 60
    .line 61
    const-string v5, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\u4e3b\u52a8\u67e5\u8be2\u63a5\u53e3"

    .line 62
    .line 63
    invoke-direct {v2, v3, v5, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Lqx;

    .line 67
    .line 68
    sget-object v4, Lkx;->г:Lkx;

    .line 69
    .line 70
    invoke-static {v4, p0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v5, Lcb;

    .line 75
    .line 76
    const/16 v6, 0x11

    .line 77
    .line 78
    invoke-direct {v5, p0, v6}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 79
    .line 80
    .line 81
    const-string p0, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\u56de\u590d\u5217\u8868\u63a5\u53e3"

    .line 82
    .line 83
    invoke-direct {v3, v4, p0, v5}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 84
    .line 85
    .line 86
    filled-new-array {v0, v1, v2, v3}, [Lqx;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$4$lambda$0(Ljava/lang/ClassLoader;)Ls62;
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveBindMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    sget-object p0, Ls62;->α:Ls62;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$4$lambda$1(Ljava/lang/ClassLoader;)Ls62;
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyQueryMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    sget-object p0, Ls62;->α:Ls62;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$4$lambda$2(Ljava/lang/ClassLoader;)Ls62;
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveLoadMoreCommentMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    sget-object p0, Ls62;->α:Ls62;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$4$lambda$3(Ljava/lang/ClassLoader;)Ls62;
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyListMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    sget-object p0, Ls62;->α:Ls62;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final registerDexKitPrewarmProvider$lambda$5(Ljava/lang/ClassLoader;)Ls62;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->init(Ljava/lang/ClassLoader;Z)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Ls62;->α:Ls62;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final resolveBindMethods$lambda$49(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 5
    .line 6
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindBindMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final resolveLoadMoreCommentMethods$lambda$9(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 5
    .line 6
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindLoadMoreCommentMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final resolveReplyListMethods$lambda$62(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 5
    .line 6
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyListMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final resolveReplyQueryMethods$lambda$55(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 5
    .line 6
    invoke-direct {v0, p1, p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyQueryMethods(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final scoreBindMethod(Ljava/lang/reflect/Method;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v0, "comment"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x320

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v0, v1

    .line 31
    :goto_0
    const-string v2, "reply"

    .line 32
    .line 33
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    add-int/lit16 v0, v0, 0x1f4

    .line 40
    .line 41
    :cond_1
    const-string v2, "adapter"

    .line 42
    .line 43
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    add-int/lit16 v0, v0, 0x12c

    .line 50
    .line 51
    :cond_2
    const-string v2, "holder"

    .line 52
    .line 53
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    add-int/lit16 v0, v0, 0xc8

    .line 60
    .line 61
    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    array-length p0, p0

    .line 66
    const/4 v1, 0x2

    .line 67
    if-ne p0, v1, :cond_4

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x64

    .line 70
    .line 71
    :cond_4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    array-length p0, p0

    .line 76
    const/4 p1, 0x3

    .line 77
    if-ne p0, p1, :cond_5

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x3c

    .line 80
    .line 81
    :cond_5
    return v0
.end method

.method private final scoreLoadMoreCommentMethod(Ljava/lang/reflect/Method;)I
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v4, v3

    .line 34
    const/4 v5, 0x0

    .line 35
    move v6, v5

    .line 36
    :goto_0
    const/16 v7, 0xa

    .line 37
    .line 38
    if-ge v6, v4, :cond_0

    .line 39
    .line 40
    aget-object v8, v3, v6

    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v4, v3

    .line 63
    move v6, v5

    .line 64
    :goto_1
    if-ge v6, v4, :cond_2

    .line 65
    .line 66
    aget-object v8, v3, v6

    .line 67
    .line 68
    check-cast v8, [Ljava/lang/annotation/Annotation;

    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v9, v8

    .line 74
    move v10, v5

    .line 75
    :goto_2
    if-ge v10, v9, :cond_1

    .line 76
    .line 77
    aget-object v11, v8, v10

    .line 78
    .line 79
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v10, v10, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string v3, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"

    .line 100
    .line 101
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    const/16 v3, 0x1f40

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move v3, v5

    .line 115
    :goto_3
    const-string v4, "fetchCommentListV2Post"

    .line 116
    .line 117
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_4

    .line 122
    .line 123
    add-int/lit16 v3, v3, 0x1388

    .line 124
    .line 125
    :cond_4
    const-string v4, "fetchCommentListV2Stream"

    .line 126
    .line 127
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    add-int/lit16 v3, v3, 0x1f4

    .line 134
    .line 135
    :cond_5
    const-string v0, "/aweme/v2/comment/list/"

    .line 136
    .line 137
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    add-int/lit16 v3, v3, 0xbb8

    .line 144
    .line 145
    :cond_6
    const-string v0, "aweme/v2/comment/list"

    .line 146
    .line 147
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    add-int/lit16 v3, v3, 0x9c4

    .line 154
    .line 155
    :cond_7
    const-string v0, "aweme_id"

    .line 156
    .line 157
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    add-int/lit16 v3, v3, 0x1f4

    .line 164
    .line 165
    :cond_8
    const-string v0, "insert_ids"

    .line 166
    .line 167
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    add-int/lit16 v3, v3, 0x1f4

    .line 174
    .line 175
    :cond_9
    const-string v0, "cursor"

    .line 176
    .line 177
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    add-int/lit16 v3, v3, 0xc8

    .line 184
    .line 185
    :cond_a
    const-string v0, "count"

    .line 186
    .line 187
    invoke-static {v2, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_b

    .line 192
    .line 193
    add-int/lit16 v3, v3, 0xc8

    .line 194
    .line 195
    :cond_b
    const-string v0, "bolts.Task"

    .line 196
    .line 197
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_c

    .line 202
    .line 203
    add-int/lit16 v3, v3, 0x1f4

    .line 204
    .line 205
    :cond_c
    const-string v0, "Observable"

    .line 206
    .line 207
    invoke-static {v1, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_d

    .line 212
    .line 213
    add-int/lit16 v3, v3, 0x12c

    .line 214
    .line 215
    :cond_d
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const-class v1, Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_e

    .line 233
    .line 234
    add-int/lit16 v3, v3, 0xc8

    .line 235
    .line 236
    :cond_e
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    array-length p1, p1

    .line 241
    const/16 v0, 0x14

    .line 242
    .line 243
    if-lt p1, v0, :cond_f

    .line 244
    .line 245
    add-int/lit16 v3, v3, 0xc8

    .line 246
    .line 247
    :cond_f
    const-string p1, "commerce.sdk.commentlist"

    .line 248
    .line 249
    const/4 v0, 0x1

    .line 250
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_10

    .line 255
    .line 256
    add-int/lit16 v3, v3, -0x1770

    .line 257
    .line 258
    :cond_10
    const-string p1, ".comment."

    .line 259
    .line 260
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_11

    .line 265
    .line 266
    add-int/lit16 v3, v3, 0x12c

    .line 267
    .line 268
    :cond_11
    const-string p1, "aweme.comment"

    .line 269
    .line 270
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    if-eqz p0, :cond_12

    .line 275
    .line 276
    add-int/lit16 v3, v3, 0x12c

    .line 277
    .line 278
    :cond_12
    return v3
.end method

.method private final scoreReplyListMethod(Ljava/lang/reflect/Method;)I
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v4, v3

    .line 34
    const/4 v5, 0x0

    .line 35
    move v6, v5

    .line 36
    :goto_0
    const/16 v7, 0xa

    .line 37
    .line 38
    if-ge v6, v4, :cond_0

    .line 39
    .line 40
    aget-object v8, v3, v6

    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v4, v3

    .line 63
    move v6, v5

    .line 64
    :goto_1
    if-ge v6, v4, :cond_2

    .line 65
    .line 66
    aget-object v8, v3, v6

    .line 67
    .line 68
    check-cast v8, [Ljava/lang/annotation/Annotation;

    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v9, v8

    .line 74
    move v10, v5

    .line 75
    :goto_2
    if-ge v10, v9, :cond_1

    .line 76
    .line 77
    aget-object v11, v8, v10

    .line 78
    .line 79
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    add-int/lit8 v10, v10, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string v3, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC42710FFB8744BED68D3A8A78D91E7DEF8CD323579B4298E07A5C"

    .line 100
    .line 101
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    const/16 p0, 0x1388

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move p0, v5

    .line 115
    :goto_3
    const-string v3, "/aweme/v1/comment/list/reply/"

    .line 116
    .line 117
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    add-int/lit16 p0, p0, 0xfa0

    .line 124
    .line 125
    :cond_4
    const-string v3, "comment_id"

    .line 126
    .line 127
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    add-int/lit16 p0, p0, 0x1f4

    .line 134
    .line 135
    :cond_5
    const-string v3, "item_id"

    .line 136
    .line 137
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_6

    .line 142
    .line 143
    add-int/lit16 p0, p0, 0x1f4

    .line 144
    .line 145
    :cond_6
    const-string v3, "top_ids"

    .line 146
    .line 147
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_7

    .line 152
    .line 153
    add-int/lit16 p0, p0, 0x12c

    .line 154
    .line 155
    :cond_7
    const-string v3, "insert_ids"

    .line 156
    .line 157
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_8

    .line 162
    .line 163
    add-int/lit16 p0, p0, 0xc8

    .line 164
    .line 165
    :cond_8
    const-string v3, "cursor"

    .line 166
    .line 167
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_9

    .line 172
    .line 173
    add-int/lit16 p0, p0, 0xc8

    .line 174
    .line 175
    :cond_9
    const-string v3, "count"

    .line 176
    .line 177
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_a

    .line 182
    .line 183
    add-int/lit16 p0, p0, 0xc8

    .line 184
    .line 185
    :cond_a
    const-string v2, "fetchReplyTreeListPOST"

    .line 186
    .line 187
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_b

    .line 192
    .line 193
    add-int/lit16 p0, p0, 0x3e8

    .line 194
    .line 195
    :cond_b
    const-string v2, "loadMoreCommentListPOST"

    .line 196
    .line 197
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_c

    .line 202
    .line 203
    add-int/lit16 p0, p0, 0x320

    .line 204
    .line 205
    :cond_c
    const-string v0, "Observable"

    .line 206
    .line 207
    invoke-static {v1, v0, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_d

    .line 212
    .line 213
    add-int/lit16 p0, p0, 0x1f4

    .line 214
    .line 215
    :cond_d
    const-string v0, "bolts.Task"

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_e

    .line 222
    .line 223
    add-int/lit16 p0, p0, 0x12c

    .line 224
    .line 225
    :cond_e
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    array-length p1, p1

    .line 230
    const/16 v0, 0x1e

    .line 231
    .line 232
    if-gt v0, p1, :cond_f

    .line 233
    .line 234
    const/16 v0, 0x2e

    .line 235
    .line 236
    if-ge p1, v0, :cond_f

    .line 237
    .line 238
    add-int/lit16 p0, p0, 0xc8

    .line 239
    .line 240
    :cond_f
    return p0
.end method

.method private final scoreReplyMethod(Ljava/lang/reflect/Method;)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v1, "comment"

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {p0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const/16 v3, 0x1f4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v3, v2

    .line 45
    :goto_0
    const-string v4, "reply"

    .line 46
    .line 47
    invoke-static {p0, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    add-int/lit16 v3, v3, 0x1f4

    .line 54
    .line 55
    :cond_1
    const-string v5, "manager"

    .line 56
    .line 57
    invoke-static {p0, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    add-int/lit16 v3, v3, 0xfa

    .line 64
    .line 65
    :cond_2
    const-string v5, "data"

    .line 66
    .line 67
    invoke-static {p0, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    add-int/lit16 v3, v3, 0x96

    .line 74
    .line 75
    :cond_3
    const-string v5, "list"

    .line 76
    .line 77
    invoke-static {p0, v5, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x64

    .line 84
    .line 85
    :cond_4
    invoke-static {v0, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    add-int/lit16 v3, v3, 0x12c

    .line 92
    .line 93
    :cond_5
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_6

    .line 98
    .line 99
    add-int/lit16 v3, v3, 0xc8

    .line 100
    .line 101
    :cond_6
    const-string p0, "count"

    .line 102
    .line 103
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_7

    .line 108
    .line 109
    add-int/lit16 v3, v3, 0x96

    .line 110
    .line 111
    :cond_7
    const-class p0, Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_8

    .line 122
    .line 123
    add-int/lit16 v3, v3, 0xc8

    .line 124
    .line 125
    :cond_8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_9

    .line 136
    .line 137
    add-int/lit8 v3, v3, 0x78

    .line 138
    .line 139
    :cond_9
    return v3
.end method

.method private final stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x23

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x28

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Luj;

    .line 42
    .line 43
    const/4 v2, 0x6

    .line 44
    invoke-direct {v1, v2}, Luj;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v2, 0x1e

    .line 48
    .line 49
    const-string v3, ","

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static {v0, v3, v4, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "):"

    .line 57
    .line 58
    invoke-static {p0, v0, v1, p1}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method private static final stableKey$lambda$118$lambda$117(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Α(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindBindMethods$lambda$97$lambda$94(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Β(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72$lambda$71(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic α(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyListMethods$lambda$77$lambda$75$lambda$72(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic β(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyQueryMethods$lambda$106$lambda$103$lambda$102(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyListMethods$lambda$62(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyQueryMethods$lambda$112$lambda$109$lambda$108(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ε(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$4(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ζ(Ljava/lang/ClassLoader;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$4$lambda$2(Ljava/lang/ClassLoader;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic η(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21$lambda$20(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic θ(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindBindMethods$lambda$97$lambda$94$lambda$93(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ι(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic κ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveLoadMoreCommentMethods$lambda$9(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic λ(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey$lambda$118$lambda$117(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic μ(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyQueryMethods$lambda$112$lambda$109(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ν(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28$lambda$27(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ξ(Ljava/lang/ClassLoader;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$4$lambda$0(Ljava/lang/ClassLoader;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ο(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyListMethods$lambda$84$lambda$82$lambda$79$lambda$78(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic π(Ljava/lang/ClassLoader;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$5(Ljava/lang/ClassLoader;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ρ(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindLoadMoreCommentMethods$lambda$33$lambda$31$lambda$28(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic σ(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindLoadMoreCommentMethods$lambda$26$lambda$24$lambda$21(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic τ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyQueryMethods$lambda$55(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic υ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveBindMethods$lambda$49(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic φ(Ljava/lang/ClassLoader;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$4$lambda$1(Ljava/lang/ClassLoader;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic χ(Ljava/lang/ClassLoader;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider$lambda$4$lambda$3(Ljava/lang/ClassLoader;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ψ(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->dexKitFindReplyQueryMethods$lambda$106$lambda$103(Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic ω(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->reflectionFindLoadMoreCommentMethods$lambda$19(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final registerDexKitPrewarmProvider()V
    .locals 2

    .line 1
    sget-object p0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    new-instance p0, Luj;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-direct {p0, v0}, Luj;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const-string v0, "comment_bookmark"

    .line 10
    .line 11
    invoke-static {v0, p0}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Luj;

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-direct {p0, v1}, Luj;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p0}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final resolveBindMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->т:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    const/16 v3, 0x320

    .line 14
    .line 15
    if-eqz v1, :cond_6

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isRecyclerBindMethod(Ljava/lang/reflect/Method;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    move-object v0, p2

    .line 76
    check-cast v0, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreBindMethod(Ljava/lang/reflect/Method;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lt v0, v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_5

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Ljava/lang/reflect/Method;

    .line 105
    .line 106
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    return-object p0

    .line 111
    :cond_6
    :goto_3
    if-eqz p2, :cond_d

    .line 112
    .line 113
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-nez p2, :cond_7

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_7
    new-instance p2, Lbb;

    .line 123
    .line 124
    const/16 v1, 0xf

    .line 125
    .line 126
    invoke-direct {p2, p1, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 127
    .line 128
    .line 129
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\uff1a\u8bc4\u8bba\u5217\u8868\u7ed1\u5b9a\u65b9\u6cd5"

    .line 130
    .line 131
    invoke-static {v0, p1, v1, p2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance p2, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    move-object v1, v0

    .line 155
    check-cast v1, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isRecyclerBindMethod(Ljava/lang/reflect/Method;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_9
    new-instance p0, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    :cond_a
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_b

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    move-object v0, p2

    .line 187
    check-cast v0, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 190
    .line 191
    invoke-direct {v1, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->scoreBindMethod(Ljava/lang/reflect/Method;)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-lt v0, v3, :cond_a

    .line 196
    .line 197
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-eqz p2, :cond_c

    .line 210
    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    check-cast p2, Ljava/lang/reflect/Method;

    .line 216
    .line 217
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_c
    return-object p0

    .line 222
    :cond_d
    :goto_7
    sget-object p0, Ljz;->ε:Ljz;

    .line 223
    .line 224
    return-object p0
.end method

.method public final resolveLoadMoreCommentMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->о:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-direct {p0, v5}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v4, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_4

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v6, v5

    .line 80
    check-cast v6, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    sget-object v7, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 83
    .line 84
    invoke-direct {v7, v6}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance v1, Ltf;

    .line 99
    .line 100
    const/16 v3, 0xe

    .line 101
    .line 102
    invoke-direct {v1, v3}, Ltf;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_6

    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_6
    :goto_3
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->reflectionFindLoadMoreCommentMethods(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_8

    .line 145
    .line 146
    if-eqz p2, :cond_7

    .line 147
    .line 148
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    return-object v1

    .line 154
    :cond_8
    if-eqz p2, :cond_f

    .line 155
    .line 156
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 157
    .line 158
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-nez p2, :cond_9

    .line 165
    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :cond_9
    new-instance p2, Lbb;

    .line 169
    .line 170
    const/16 v1, 0xc

    .line 171
    .line 172
    invoke-direct {p2, p1, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 173
    .line 174
    .line 175
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\u4e3b\u52a8\u67e5\u8be2\u63a5\u53e3"

    .line 176
    .line 177
    invoke-static {v0, p1, v1, p2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance p2, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    :cond_a
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    move-object v1, v0

    .line 201
    check-cast v1, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isLoadMoreCommentMethod(Ljava/lang/reflect/Method;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_a

    .line 208
    .line 209
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    new-instance p0, Ljava/util/HashSet;

    .line 214
    .line 215
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 216
    .line 217
    .line 218
    new-instance p1, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    :cond_c
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_d

    .line 232
    .line 233
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    move-object v1, v0

    .line 238
    check-cast v1, Ljava/lang/reflect/Method;

    .line 239
    .line 240
    sget-object v3, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 241
    .line 242
    invoke-direct {v3, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_c

    .line 251
    .line 252
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_d
    new-instance p0, Ltf;

    .line 257
    .line 258
    const/16 p2, 0xf

    .line 259
    .line 260
    invoke-direct {p0, p2}, Ltf;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    if-eqz p2, :cond_e

    .line 276
    .line 277
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    check-cast p2, Ljava/lang/reflect/Method;

    .line 282
    .line 283
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_e
    return-object p0

    .line 288
    :cond_f
    :goto_7
    sget-object p0, Ljz;->ε:Ljz;

    .line 289
    .line 290
    return-object p0
.end method

.method public final resolveReplyListMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->г:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyListMethod(Ljava/lang/reflect/Method;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance p2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v1, v0

    .line 79
    check-cast v1, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    sget-object v3, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 82
    .line 83
    invoke-direct {v3, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    new-instance p0, Ltf;

    .line 98
    .line 99
    const/16 p1, 0x10

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ltf;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {p2, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_5

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    return-object p0

    .line 129
    :cond_6
    :goto_3
    invoke-direct {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->reflectionFindReplyListMethods(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_8

    .line 138
    .line 139
    if-eqz p2, :cond_7

    .line 140
    .line 141
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    :cond_7
    return-object v1

    .line 145
    :cond_8
    if-eqz p2, :cond_f

    .line 146
    .line 147
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_9

    .line 154
    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :cond_9
    new-instance p2, Lbb;

    .line 158
    .line 159
    const/16 v1, 0xe

    .line 160
    .line 161
    invoke-direct {p2, p1, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 162
    .line 163
    .line 164
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\u56de\u590d\u5217\u8868\u63a5\u53e3"

    .line 165
    .line 166
    invoke-static {v0, p1, v1, p2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance p2, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    :cond_a
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_b

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v1, v0

    .line 190
    check-cast v1, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyListMethod(Ljava/lang/reflect/Method;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_a

    .line 197
    .line 198
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_b
    new-instance p0, Ljava/util/HashSet;

    .line 203
    .line 204
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance p1, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    :cond_c
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    move-object v1, v0

    .line 227
    check-cast v1, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    sget-object v3, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 230
    .line 231
    invoke-direct {v3, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_c

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_d
    new-instance p0, Ltf;

    .line 246
    .line 247
    const/16 p2, 0x11

    .line 248
    .line 249
    invoke-direct {p0, p2}, Ltf;-><init>(I)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    if-eqz p2, :cond_e

    .line 265
    .line 266
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    check-cast p2, Ljava/lang/reflect/Method;

    .line 271
    .line 272
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_e
    return-object p0

    .line 277
    :cond_f
    :goto_7
    sget-object p0, Ljz;->ε:Ljz;

    .line 278
    .line 279
    return-object p0
.end method

.method public final resolveReplyQueryMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->у:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyQueryMethod(Ljava/lang/reflect/Method;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {p2, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    return-object p1

    .line 75
    :cond_4
    :goto_2
    if-eqz p2, :cond_9

    .line 76
    .line 77
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_5

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    new-instance p2, Lbb;

    .line 87
    .line 88
    const/16 v1, 0xd

    .line 89
    .line 90
    invoke-direct {p2, p1, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 91
    .line 92
    .line 93
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u4e66\u7b7e\uff1a\u56de\u590d\u67e5\u8be2\u65b9\u6cd5"

    .line 94
    .line 95
    invoke-static {v0, p1, v1, p2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance p2, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v1, v0

    .line 119
    check-cast v1, Ljava/lang/reflect/Method;

    .line 120
    .line 121
    invoke-direct {p0, v1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->isReplyQueryMethod(Ljava/lang/reflect/Method;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    return-object p2

    .line 152
    :cond_9
    :goto_5
    sget-object p0, Ljz;->ε:Ljz;

    .line 153
    .line 154
    return-object p0
.end method
