.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

.field private static final TAG:Ljava/lang/String; = "ra71aa3b096f9ff6b"

.field private static final fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final primitiveNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 7
    .line 8
    const-string v8, "java.lang.Byte"

    .line 9
    .line 10
    const-string v9, "java.lang.Character"

    .line 11
    .line 12
    const-string v1, "java.lang.String"

    .line 13
    .line 14
    const-string v2, "java.lang.Integer"

    .line 15
    .line 16
    const-string v3, "java.lang.Long"

    .line 17
    .line 18
    const-string v4, "java.lang.Boolean"

    .line 19
    .line 20
    const-string v5, "java.lang.Float"

    .line 21
    .line 22
    const-string v6, "java.lang.Double"

    .line 23
    .line 24
    const-string v7, "java.lang.Short"

    .line 25
    .line 26
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->primitiveNames:Ljava/util/Set;

    .line 35
    .line 36
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    const/16 v0, 0x8

    .line 44
    .line 45
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->$stable:I

    .line 46
    .line 47
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

.method private final allFields(Ljava/lang/Class;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object v1, p1

    .line 15
    :goto_0
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-class v2, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p0, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v0, p0

    .line 48
    :cond_2
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 49
    .line 50
    return-object v0
.end method

.method private final allFieldsForBookmark(Ljava/lang/Class;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
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
    :goto_0
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-class v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1, p0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p0
.end method

.method private static final extractReplyItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_9

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-le p3, v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_9

    .line 18
    .line 19
    instance-of v0, p2, Ljava/lang/String;

    .line 20
    .line 21
    if-nez v0, :cond_9

    .line 22
    .line 23
    instance-of v0, p2, Ljava/lang/Number;

    .line 24
    .line 25
    if-nez v0, :cond_9

    .line 26
    .line 27
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 46
    .line 47
    invoke-direct {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->looksLikeCommentObject(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCreateTime(Ljava/lang/Object;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    if-eqz v5, :cond_6

    .line 79
    .line 80
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    const-string v1, ""

    .line 92
    .line 93
    :cond_5
    move-object v4, v1

    .line 94
    invoke-direct/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_0
    instance-of v1, p2, Ljava/lang/Iterable;

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    check-cast p2, Ljava/lang/Iterable;

    .line 106
    .line 107
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    add-int/lit8 v1, p3, 0x1

    .line 122
    .line 123
    invoke-static {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->extractReplyItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_8

    .line 136
    .line 137
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v1, 0x0

    .line 142
    :goto_2
    if-ge v1, v0, :cond_9

    .line 143
    .line 144
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    add-int/lit8 v4, p3, 0x1

    .line 149
    .line 150
    invoke-static {p0, p1, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->extractReplyItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :catchall_0
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_9

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/lang/reflect/Field;

    .line 179
    .line 180
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    add-int/lit8 v3, p3, 0x1

    .line 188
    .line 189
    invoke-static {p0, p1, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->extractReplyItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_9
    :goto_4
    return-void
.end method

.method private static final findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x6

    .line 7
    if-le p2, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$isAwemeLike(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_3
    instance-of v1, p1, Landroid/view/View;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    add-int/2addr p2, v2

    .line 43
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_4
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_5
    instance-of v1, p1, Ljava/lang/Number;

    .line 54
    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_6
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v1, :cond_7

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_7
    instance-of v1, p1, Ljava/lang/Class;

    .line 64
    .line 65
    if-eqz v1, :cond_8

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v3, "java."

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_10

    .line 84
    .line 85
    const-string v3, "kotlin."

    .line 86
    .line 87
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_10

    .line 92
    .line 93
    const-string v3, "android."

    .line 94
    .line 95
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_10

    .line 100
    .line 101
    const-string v3, "androidx."

    .line 102
    .line 103
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_9

    .line 108
    .line 109
    goto/16 :goto_1

    .line 110
    .line 111
    :cond_9
    instance-of v1, p1, Ljava/lang/Iterable;

    .line 112
    .line 113
    const/16 v3, 0x50

    .line 114
    .line 115
    if-eqz v1, :cond_b

    .line 116
    .line 117
    check-cast p1, Ljava/lang/Iterable;

    .line 118
    .line 119
    invoke-static {p1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_10

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    add-int/lit8 v3, p2, 0x1

    .line 138
    .line 139
    invoke-static {p0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_a

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_e

    .line 155
    .line 156
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-le v1, v3, :cond_c

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_c
    move v3, v1

    .line 164
    :goto_0
    if-ge v4, v3, :cond_10

    .line 165
    .line 166
    invoke-static {p1, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    add-int/lit8 v5, p2, 0x1

    .line 171
    .line 172
    invoke-static {p0, v1, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_d

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_e
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-direct {v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    const/16 v3, 0x78

    .line 193
    .line 194
    invoke-static {v1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    :catchall_0
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_10

    .line 207
    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Ljava/lang/reflect/Field;

    .line 213
    .line 214
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-nez v4, :cond_f

    .line 223
    .line 224
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    add-int/lit8 v4, p2, 0x1

    .line 232
    .line 233
    invoke-static {p0, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    if-eqz v3, :cond_f

    .line 238
    .line 239
    return-object v3

    .line 240
    :cond_10
    :goto_1
    return-object v0
.end method

.method private static final findAwemeObject$isAwemeLike(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 14
    .line 15
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    const-string v2, "Aweme"

    .line 28
    .line 29
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    const-string v2, "feed"

    .line 36
    .line 37
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    return v3

    .line 44
    :cond_2
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 45
    .line 46
    const-string v2, "getAwemeId"

    .line 47
    .line 48
    const-string v4, "getGroupId"

    .line 49
    .line 50
    const-string v5, "getAid"

    .line 51
    .line 52
    filled-new-array {v5, v2, v4}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v4, "awemeId"

    .line 57
    .line 58
    const-string v5, "groupId"

    .line 59
    .line 60
    const-string v6, "aid"

    .line 61
    .line 62
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-direct {v1, p0, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNamesForAweme(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const-string v4, "getDesc"

    .line 71
    .line 72
    const-string v5, "getDescription"

    .line 73
    .line 74
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "desc"

    .line 79
    .line 80
    const-string v6, "description"

    .line 81
    .line 82
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-direct {v1, p0, v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNamesForAweme(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    if-eqz p0, :cond_4

    .line 100
    .line 101
    return v3

    .line 102
    :cond_4
    :goto_0
    return v0
.end method

.method private static final findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x5

    .line 7
    if-le p2, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$score(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x384

    .line 29
    .line 30
    if-lt v1, v2, :cond_3

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    instance-of v1, p1, Landroid/view/View;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    :try_start_0
    check-cast p1, Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_d

    .line 45
    .line 46
    add-int/2addr p2, v2

    .line 47
    invoke-static {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    if-eqz p0, :cond_d

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v3, "java."

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_d

    .line 75
    .line 76
    const-string v3, "kotlin."

    .line 77
    .line 78
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_d

    .line 83
    .line 84
    const-string v3, "android."

    .line 85
    .line 86
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_d

    .line 91
    .line 92
    const-string v3, "androidx."

    .line 93
    .line 94
    invoke-static {v1, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_6
    instance-of v1, p1, Ljava/lang/Iterable;

    .line 103
    .line 104
    const/16 v3, 0x1e

    .line 105
    .line 106
    if-eqz v1, :cond_8

    .line 107
    .line 108
    check-cast p1, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-static {p1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_d

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    add-int/lit8 v3, p2, 0x1

    .line 129
    .line 130
    invoke-static {p0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_b

    .line 146
    .line 147
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-le v1, v3, :cond_9

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    move v3, v1

    .line 155
    :goto_0
    if-ge v4, v3, :cond_d

    .line 156
    .line 157
    invoke-static {p1, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    add-int/lit8 v5, p2, 0x1

    .line 162
    .line 163
    invoke-static {p0, v1, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_b
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-direct {v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFieldsForBookmark(Ljava/lang/Class;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const/16 v3, 0x50

    .line 184
    .line 185
    invoke-static {v1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :catchall_0
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_d

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Ljava/lang/reflect/Field;

    .line 204
    .line 205
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-nez v4, :cond_c

    .line 214
    .line 215
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    add-int/lit8 v4, p2, 0x1

    .line 223
    .line 224
    invoke-static {p0, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    if-eqz v3, :cond_c

    .line 229
    .line 230
    return-object v3

    .line 231
    :catchall_1
    :cond_d
    :goto_1
    return-object v0
.end method

.method private static final findBookmarkSourceObject$score(Ljava/lang/Object;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkId(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-direct {v1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 v2, 0x1f4

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    :goto_0
    move v2, v0

    .line 32
    :goto_1
    if-eqz v3, :cond_4

    .line 33
    .line 34
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    add-int/lit16 v2, v2, 0x1f4

    .line 42
    .line 43
    :cond_4
    :goto_2
    if-eqz v1, :cond_6

    .line 44
    .line 45
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_5
    add-int/lit8 v2, v2, 0x78

    .line 53
    .line 54
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const-string v1, "comment"

    .line 72
    .line 73
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_7

    .line 78
    .line 79
    add-int/lit16 v2, v2, 0xfa

    .line 80
    .line 81
    :cond_7
    const-string v1, "message"

    .line 82
    .line 83
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    add-int/lit16 v2, v2, 0xa0

    .line 90
    .line 91
    :cond_8
    const-string v1, "publicscreen"

    .line 92
    .line 93
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_9

    .line 98
    .line 99
    add-int/lit8 v2, v2, 0x78

    .line 100
    .line 101
    :cond_9
    const-string v1, "item"

    .line 102
    .line 103
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_a

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x50

    .line 110
    .line 111
    :cond_a
    return v2
.end method

.method private static final findCommentObject$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x3

    .line 7
    if-le p2, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->isCommentLike(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return-object p1

    .line 46
    :cond_4
    :goto_0
    instance-of v2, p1, Landroid/view/View;

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_5
    instance-of v2, p1, Ljava/lang/CharSequence;

    .line 52
    .line 53
    if-eqz v2, :cond_6

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_6
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->primitiveNames:Ljava/util/Set;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_7

    .line 71
    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_7
    instance-of v2, p1, Ljava/lang/Iterable;

    .line 75
    .line 76
    const/16 v3, 0x14

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    if-eqz v2, :cond_9

    .line 80
    .line 81
    check-cast p1, Ljava/lang/Iterable;

    .line 82
    .line 83
    invoke-static {p1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_f

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    add-int/lit8 v2, p2, 0x1

    .line 102
    .line 103
    invoke-static {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v5, 0x0

    .line 119
    if-eqz v2, :cond_c

    .line 120
    .line 121
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-le v1, v3, :cond_a

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_a
    move v3, v1

    .line 129
    :goto_1
    if-ge v5, v3, :cond_f

    .line 130
    .line 131
    invoke-static {p1, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    add-int/lit8 v2, p2, 0x1

    .line 136
    .line 137
    invoke-static {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-eqz v1, :cond_b

    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v3, "android."

    .line 156
    .line 157
    invoke-static {v2, v3, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-nez v3, :cond_f

    .line 162
    .line 163
    const-string v3, "java."

    .line 164
    .line 165
    invoke-static {v2, v3, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_f

    .line 170
    .line 171
    const-string v3, "kotlin."

    .line 172
    .line 173
    invoke-static {v2, v3, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_f

    .line 178
    .line 179
    const-string v3, "androidx."

    .line 180
    .line 181
    invoke-static {v2, v3, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_d

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-direct {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const/16 v2, 0x30

    .line 197
    .line 198
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :catchall_0
    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_f

    .line 211
    .line 212
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, Ljava/lang/reflect/Field;

    .line 217
    .line 218
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_e

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    add-int/lit8 v3, p2, 0x1

    .line 236
    .line 237
    invoke-static {p0, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    if-eqz v2, :cond_e

    .line 242
    .line 243
    return-object v2

    .line 244
    :cond_f
    :goto_2
    return-object v0
.end method

.method private static final findCommentObjectById$dfs$32(Ljava/util/IdentityHashMap;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x6

    .line 7
    if-le p3, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 25
    .line 26
    invoke-virtual {v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->isCommentLike(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_3
    instance-of v2, p2, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_4
    instance-of v2, p2, Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_5
    instance-of v2, p2, Ljava/lang/Class;

    .line 54
    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "java.lang."

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_e

    .line 74
    .line 75
    const-string v3, "kotlin."

    .line 76
    .line 77
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_e

    .line 82
    .line 83
    const-string v3, "android."

    .line 84
    .line 85
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_e

    .line 90
    .line 91
    const-string v3, "androidx."

    .line 92
    .line 93
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_7

    .line 98
    .line 99
    goto/16 :goto_1

    .line 100
    .line 101
    :cond_7
    instance-of v2, p2, Ljava/lang/Iterable;

    .line 102
    .line 103
    const/16 v3, 0x50

    .line 104
    .line 105
    const/4 v5, 0x1

    .line 106
    if-eqz v2, :cond_9

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-static {p2, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_e

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    add-int/lit8 v2, p3, 0x1

    .line 129
    .line 130
    invoke-static {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById$dfs$32(Ljava/util/IdentityHashMap;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_c

    .line 146
    .line 147
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-le v1, v3, :cond_a

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_a
    move v3, v1

    .line 155
    :goto_0
    if-ge v4, v3, :cond_e

    .line 156
    .line 157
    invoke-static {p2, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    add-int/lit8 v2, p3, 0x1

    .line 162
    .line 163
    invoke-static {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById$dfs$32(Ljava/util/IdentityHashMap;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_b

    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_c
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-direct {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const/16 v2, 0x78

    .line 182
    .line 183
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    :catchall_0
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_e

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Ljava/lang/reflect/Field;

    .line 202
    .line 203
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-nez v3, :cond_d

    .line 212
    .line 213
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    add-int/lit8 v3, p3, 0x1

    .line 221
    .line 222
    invoke-static {p0, p1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById$dfs$32(Ljava/util/IdentityHashMap;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    if-eqz v2, :cond_d

    .line 227
    .line 228
    return-object v2

    .line 229
    :cond_e
    :goto_1
    return-object v0
.end method

.method private static final findCommentObjects$walk$72(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_c

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-le p3, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->isCommentLike(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    :goto_0
    instance-of v1, p2, Ljava/lang/CharSequence;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    instance-of v1, p2, Ljava/lang/Number;

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    return-void

    .line 56
    :cond_5
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 57
    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    return-void

    .line 61
    :cond_6
    instance-of v1, p2, Ljava/lang/Iterable;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    if-eqz v1, :cond_7

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Iterable;

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_c

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    add-int/lit8 v1, p3, 0x1

    .line 83
    .line 84
    invoke-static {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects$walk$72(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const/4 v3, 0x0

    .line 97
    if-eqz v1, :cond_9

    .line 98
    .line 99
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/16 v1, 0xc8

    .line 104
    .line 105
    if-le v0, v1, :cond_8

    .line 106
    .line 107
    move v0, v1

    .line 108
    :cond_8
    :goto_2
    if-ge v3, v0, :cond_c

    .line 109
    .line 110
    invoke-static {p2, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    add-int/lit8 v4, p3, 0x1

    .line 115
    .line 116
    invoke-static {p0, p1, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects$walk$72(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v4, "java."

    .line 131
    .line 132
    invoke-static {v1, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_c

    .line 137
    .line 138
    const-string v4, "kotlin."

    .line 139
    .line 140
    invoke-static {v1, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_c

    .line 145
    .line 146
    const-string v4, "android."

    .line 147
    .line 148
    invoke-static {v1, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-nez v4, :cond_c

    .line 153
    .line 154
    const-string v4, "androidx."

    .line 155
    .line 156
    invoke-static {v1, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_a

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/16 v1, 0x50

    .line 172
    .line 173
    invoke-static {v0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :catchall_0
    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_c

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Ljava/lang/reflect/Field;

    .line 192
    .line 193
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    add-int/lit8 v3, p3, 0x1

    .line 211
    .line 212
    invoke-static {p0, p1, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects$walk$72(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_c
    :goto_4
    return-void
.end method

.method private final findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    :goto_0
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_1
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move-object p0, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return-object p0
.end method

.method private final findFieldForBookmark(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    :goto_0
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_1
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move-object p0, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return-object p0
.end method

.method private final findMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_1
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v4, v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    move-object p0, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object p0
.end method

.method private final findNoArgMethodForBookmark(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_1
    if-ge v2, v1, :cond_1

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v4, v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    move-object p0, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object p0
.end method

.method public static synthetic findRealCommentObjectsDeep$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;Ljava/lang/ClassLoader;Ljava/lang/Object;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p3, 0x8

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep(Ljava/lang/ClassLoader;Ljava/lang/Object;I)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final findRealCommentObjectsDeep$isSkippable(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    return v2

    .line 22
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    return v2

    .line 27
    :cond_2
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    return v2

    .line 32
    :cond_3
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    return v2

    .line 37
    :cond_4
    instance-of p0, p0, Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz p0, :cond_5

    .line 40
    .line 41
    return v2

    .line 42
    :cond_5
    const-string p0, "java.lang.reflect."

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-static {v1, p0, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    const-string p0, "android."

    .line 53
    .line 54
    invoke-static {v1, p0, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    const-string p0, "kotlin."

    .line 62
    .line 63
    invoke-static {v1, p0, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_8

    .line 68
    .line 69
    :goto_0
    return v2

    .line 70
    :cond_8
    return v0
.end method

.method private static final findRealCommentObjectsDeep$walk$77(ILjava/util/Set;Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p5

    .line 2
    .line 3
    if-nez p4, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    if-le v1, p0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_1
    invoke-static {p4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$isSkippable(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_2
    invoke-interface {p1, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_3

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_3
    invoke-virtual {p2, p4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_4

    .line 32
    .line 33
    invoke-virtual/range {p3 .. p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_4
    instance-of v5, p4, Ljava/lang/Iterable;

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v5, :cond_5

    .line 41
    .line 42
    move-object v0, p4

    .line 43
    check-cast v0, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_a

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    add-int/lit8 v7, v1, 0x1

    .line 60
    .line 61
    move v2, p0

    .line 62
    move-object v3, p1

    .line 63
    move-object v4, p2

    .line 64
    move-object v5, p3

    .line 65
    invoke-static/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$walk$77(ILjava/util/Set;Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_7

    .line 79
    .line 80
    invoke-static {p4}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/16 v4, 0xc8

    .line 85
    .line 86
    if-le v2, v4, :cond_6

    .line 87
    .line 88
    move v9, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_6
    move v9, v2

    .line 91
    :goto_1
    move v10, v3

    .line 92
    :goto_2
    if-ge v10, v9, :cond_a

    .line 93
    .line 94
    invoke-static {p4, v10}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    add-int/lit8 v7, v1, 0x1

    .line 99
    .line 100
    move v2, p0

    .line 101
    move-object v3, p1

    .line 102
    move-object v4, p2

    .line 103
    move-object v5, p3

    .line 104
    invoke-static/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$walk$77(ILjava/util/Set;Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v10, v10, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const-string v4, "java."

    .line 119
    .line 120
    invoke-static {v2, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_a

    .line 125
    .line 126
    const-string v4, "kotlin."

    .line 127
    .line 128
    invoke-static {v2, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_a

    .line 133
    .line 134
    const-string v4, "android."

    .line 135
    .line 136
    invoke-static {v2, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_a

    .line 141
    .line 142
    const-string v4, "androidx."

    .line 143
    .line 144
    invoke-static {v2, v4, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_8

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 152
    .line 153
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-direct {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v3, 0x50

    .line 162
    .line 163
    invoke-static {v2, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    :catchall_0
    :cond_9
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_a

    .line 176
    .line 177
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Ljava/lang/reflect/Field;

    .line 182
    .line 183
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_9

    .line 192
    .line 193
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, p4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    add-int/lit8 v7, v1, 0x1

    .line 201
    .line 202
    move v2, p0

    .line 203
    move-object v3, p1

    .line 204
    move-object v4, p2

    .line 205
    move-object v5, p3

    .line 206
    invoke-static/range {v2 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$walk$77(ILjava/util/Set;Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    :goto_4
    return-void
.end method

.method private final getBookmarkAuthorName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v0, "getAuthor"

    .line 19
    .line 20
    const-string v1, "getSender"

    .line 21
    .line 22
    const-string v2, "getUser"

    .line 23
    .line 24
    const-string v3, "getCommentUser"

    .line 25
    .line 26
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "author"

    .line 31
    .line 32
    const-string v2, "sender"

    .line 33
    .line 34
    const-string v3, "user"

    .line 35
    .line 36
    const-string v4, "commentUser"

    .line 37
    .line 38
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getObjectByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    const-string v6, "getUniqueId"

    .line 49
    .line 50
    const-string v7, "getShortId"

    .line 51
    .line 52
    const-string v1, "getNickname"

    .line 53
    .line 54
    const-string v2, "getNickName"

    .line 55
    .line 56
    const-string v3, "getDisplayName"

    .line 57
    .line 58
    const-string v4, "getName"

    .line 59
    .line 60
    const-string v5, "getUserName"

    .line 61
    .line 62
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v7, "uniqueId"

    .line 67
    .line 68
    const-string v8, "shortId"

    .line 69
    .line 70
    const-string v2, "nickname"

    .line 71
    .line 72
    const-string v3, "nickName"

    .line 73
    .line 74
    const-string v4, "displayName"

    .line 75
    .line 76
    const-string v5, "name"

    .line 77
    .line 78
    const-string v6, "userName"

    .line 79
    .line 80
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-direct {p0, v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    return-object v0

    .line 98
    :cond_3
    :goto_0
    const-string v0, "getUserName"

    .line 99
    .line 100
    const-string v1, "getAuthorName"

    .line 101
    .line 102
    const-string v2, "getNickname"

    .line 103
    .line 104
    const-string v3, "getNickName"

    .line 105
    .line 106
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "userName"

    .line 111
    .line 112
    const-string v2, "authorName"

    .line 113
    .line 114
    const-string v3, "nickname"

    .line 115
    .line 116
    const-string v4, "nickName"

    .line 117
    .line 118
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0
.end method

.method private final getBookmarkContent(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v6, "getCommentText"

    .line 19
    .line 20
    const-string v7, "getDisplayText"

    .line 21
    .line 22
    const-string v2, "getContent"

    .line 23
    .line 24
    const-string v3, "getText"

    .line 25
    .line 26
    const-string v4, "getMsg"

    .line 27
    .line 28
    const-string v5, "getMessage"

    .line 29
    .line 30
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v5, "commentText"

    .line 35
    .line 36
    const-string v6, "displayText"

    .line 37
    .line 38
    const-string v1, "content"

    .line 39
    .line 40
    const-string v2, "text"

    .line 41
    .line 42
    const-string v3, "msg"

    .line 43
    .line 44
    const-string v4, "message"

    .line 45
    .line 46
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method private final getBookmarkId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v7, "getCommentMsgId"

    .line 19
    .line 20
    const-string v8, "getItemId"

    .line 21
    .line 22
    const-string v2, "getCid"

    .line 23
    .line 24
    const-string v3, "getCommentId"

    .line 25
    .line 26
    const-string v4, "getId"

    .line 27
    .line 28
    const-string v5, "getMsgId"

    .line 29
    .line 30
    const-string v6, "getMessageId"

    .line 31
    .line 32
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v6, "commentMsgId"

    .line 37
    .line 38
    const-string v7, "itemId"

    .line 39
    .line 40
    const-string v1, "cid"

    .line 41
    .line 42
    const-string v2, "commentId"

    .line 43
    .line 44
    const-string v3, "id"

    .line 45
    .line 46
    const-string v4, "msgId"

    .line 47
    .line 48
    const-string v5, "messageId"

    .line 49
    .line 50
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private final getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p2, 0x1

    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    :goto_1
    return-object v0
.end method

.method private final getFieldValueForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findFieldForBookmark(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p2, 0x1

    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    :goto_1
    return-object v0
.end method

.method private final getIntByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArgForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    array-length p0, p3

    .line 33
    :goto_1
    if-ge v0, p0, :cond_3

    .line 34
    .line 35
    aget-object p2, p3, v0

    .line 36
    .line 37
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 38
    .line 39
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValueForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    instance-of v1, p2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method private final getIntByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    array-length p0, p3

    .line 33
    :goto_1
    if-ge v0, p0, :cond_3

    .line 34
    .line 35
    aget-object p2, p3, v0

    .line 36
    .line 37
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 38
    .line 39
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    instance-of v1, p2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method private final getLongByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArgForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    array-length p0, p3

    .line 33
    :goto_1
    if-ge v0, p0, :cond_3

    .line 34
    .line 35
    aget-object p2, p3, v0

    .line 36
    .line 37
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 38
    .line 39
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValueForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    instance-of v1, p2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method private final getLongByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    array-length p0, p3

    .line 33
    :goto_1
    if-ge v0, p0, :cond_3

    .line 34
    .line 35
    aget-object p2, p3, v0

    .line 36
    .line 37
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 38
    .line 39
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    instance-of v1, p2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method private final getObjectByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArgForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    array-length p0, p3

    .line 21
    :goto_1
    if-ge v0, p0, :cond_3

    .line 22
    .line 23
    aget-object p2, p3, v0

    .line 24
    .line 25
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 26
    .line 27
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValueForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method private final getObjectByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    array-length p0, p3

    .line 21
    :goto_1
    if-ge v0, p0, :cond_3

    .line 22
    .line 23
    aget-object p2, p3, v0

    .line 24
    .line 25
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 26
    .line 27
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method private final getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArgForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    array-length p0, p3

    .line 31
    :goto_1
    if-ge v0, p0, :cond_3

    .line 32
    .line 33
    aget-object p2, p3, v0

    .line 34
    .line 35
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 36
    .line 37
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValueForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method private final getStringByCandidateNamesForAweme(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-ge v1, p0, :cond_4

    .line 7
    .line 8
    aget-object v4, p2, v1

    .line 9
    .line 10
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    invoke-direct {v5, v6, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :cond_1
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    return-object v2

    .line 46
    :catchall_0
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    array-length p0, p3

    .line 50
    :goto_2
    if-ge v0, p0, :cond_9

    .line 51
    .line 52
    aget-object p2, p3, v0

    .line 53
    .line 54
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-direct {v1, v4, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-nez p2, :cond_5

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    invoke-virtual {p2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-eqz p2, :cond_6

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    goto :goto_3

    .line 81
    :cond_6
    move-object p2, v2

    .line 82
    :goto_3
    if-eqz p2, :cond_8

    .line 83
    .line 84
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    if-eqz v1, :cond_7

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    return-object p2

    .line 92
    :catchall_1
    :cond_8
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_9
    return-object v2
.end method

.method private final getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_1

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 9
    .line 10
    invoke-direct {v3, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    array-length p0, p3

    .line 31
    :goto_1
    if-ge v0, p0, :cond_3

    .line 32
    .line 33
    aget-object p2, p3, v0

    .line 34
    .line 35
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 36
    .line 37
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method private final invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p2, 0x1

    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    :goto_1
    return-object v0
.end method

.method private final invokeNoArgForBookmark(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findNoArgMethodForBookmark(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p2, 0x1

    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    :goto_1
    return-object v0
.end method

.method private final looksLikeCommentObject(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "commentitemlist"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    const-string v1, "commentlist"

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    const-string v1, "response"

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    const-string v1, "result"

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    const-string v0, "getId"

    .line 53
    .line 54
    const-string v1, "getReplyId"

    .line 55
    .line 56
    const-string v3, "getCid"

    .line 57
    .line 58
    const-string v4, "getCommentId"

    .line 59
    .line 60
    filled-new-array {v3, v4, v0, v1}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "id"

    .line 65
    .line 66
    const-string v3, "replyId"

    .line 67
    .line 68
    const-string v4, "cid"

    .line 69
    .line 70
    const-string v5, "commentId"

    .line 71
    .line 72
    filled-new-array {v4, v5, v1, v3}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v1, 0x1

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    move v0, v1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v0, v2

    .line 86
    :goto_0
    const-string v3, "getContent"

    .line 87
    .line 88
    const-string v4, "getText"

    .line 89
    .line 90
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v4, "content"

    .line 95
    .line 96
    const-string v5, "text"

    .line 97
    .line 98
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-direct {p0, p1, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz p0, :cond_2

    .line 107
    .line 108
    move p0, v1

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move p0, v2

    .line 111
    :goto_1
    if-eqz v0, :cond_3

    .line 112
    .line 113
    if-eqz p0, :cond_3

    .line 114
    .line 115
    return v1

    .line 116
    :cond_3
    :goto_2
    return v2
.end method


# virtual methods
.method public final extractReplyCountFromResult(Ljava/lang/Object;)I
    .locals 1

    .line 1
    const/4 p0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v0, p1, Ljava/util/Collection;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    :cond_3
    return p0
.end method

.method public final extractReplyItems(Ljava/lang/Object;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->extractReplyItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

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
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v2, v1

    .line 45
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getReplyId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-object v0
.end method

.method public final varargs findAwemeObject([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    invoke-static {p0, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject$dfs$12(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final varargs findBookmarkSourceObject([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    invoke-static {p0, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findBookmarkSourceObject$dfs$23(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final varargs findCommentObject([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    invoke-static {p0, v3, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final findCommentObjectById(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p0, p2, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjectById$dfs$32(Ljava/util/IdentityHashMap;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final findCommentObjects(Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObjects$walk$72(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final findRealCommentObjectsDeep(Ljava/lang/ClassLoader;Ljava/lang/Object;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljz;->ε:Ljz;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v0, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"

    .line 12
    .line 13
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 p1, 0x4

    .line 22
    const-string v0, "ra71aa3b096f9ff6b"

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    const-string p2, "Comment class not found"

    .line 28
    .line 29
    invoke-static {v0, p2, v7, p1, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v6, 0x0

    .line 48
    move-object v5, p2

    .line 49
    move v1, p3

    .line 50
    invoke-static/range {v1 .. v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findRealCommentObjectsDeep$walk$77(ILjava/util/Set;Ljava/lang/Class;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const-string p2, "findRealCommentObjectsDeep found "

    .line 58
    .line 59
    const-string p3, " real Comment objects"

    .line 60
    .line 61
    invoke-static {p2, p0, p3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {v0, p0, v7, p1, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v4
.end method

.method public final getAuthorName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "getCommentUser"

    .line 6
    .line 7
    const-string v2, "getAuthor"

    .line 8
    .line 9
    const-string v3, "getUser"

    .line 10
    .line 11
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "commentUser"

    .line 16
    .line 17
    const-string v3, "author"

    .line 18
    .line 19
    const-string v4, "user"

    .line 20
    .line 21
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getObjectByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    const-string v0, "getUniqueId"

    .line 33
    .line 34
    const-string v1, "getShortId"

    .line 35
    .line 36
    const-string v2, "getNickname"

    .line 37
    .line 38
    const-string v3, "getNickName"

    .line 39
    .line 40
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "uniqueId"

    .line 45
    .line 46
    const-string v2, "shortId"

    .line 47
    .line 48
    const-string v3, "nickname"

    .line 49
    .line 50
    const-string v4, "nickName"

    .line 51
    .line 52
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public final getAwemeId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "getAwemeId"

    .line 6
    .line 7
    const-string v1, "getAid"

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "aid"

    .line 14
    .line 15
    const-string v2, "groupId"

    .line 16
    .line 17
    const-string v3, "awemeId"

    .line 18
    .line 19
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final getCommentId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_1
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_2
    instance-of v1, p1, Ljava/lang/Number;

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_3
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_4
    const-string v0, "getCommentId"

    .line 26
    .line 27
    const-string v1, "getId"

    .line 28
    .line 29
    const-string v2, "getCid"

    .line 30
    .line 31
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "commentId"

    .line 36
    .line 37
    const-string v2, "id"

    .line 38
    .line 39
    const-string v3, "cid"

    .line 40
    .line 41
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public final getCommentSecUid(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "getCommentUser"

    .line 6
    .line 7
    const-string v1, "getAuthor"

    .line 8
    .line 9
    const-string v2, "getUser"

    .line 10
    .line 11
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "commentUser"

    .line 16
    .line 17
    const-string v2, "author"

    .line 18
    .line 19
    const-string v3, "user"

    .line 20
    .line 21
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getObjectByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "sec_uid"

    .line 30
    .line 31
    const-string v2, "secUid"

    .line 32
    .line 33
    const-string v3, "getSecUid"

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string v4, "getSecAuthorUid"

    .line 38
    .line 39
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "secAuthorUid"

    .line 44
    .line 45
    const-string v6, "sec_author_uid"

    .line 46
    .line 47
    filled-new-array {v2, v1, v5, v6}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-direct {p0, v0, v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_1
    const-string v0, "getCommentSecUid"

    .line 65
    .line 66
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v3, "commentSecUid"

    .line 71
    .line 72
    const-string v4, "comment_secuid"

    .line 73
    .line 74
    filled-new-array {v2, v1, v3, v4}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public final getContent(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "getContent"

    .line 6
    .line 7
    const-string v1, "getText"

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "content"

    .line 14
    .line 15
    const-string v2, "text"

    .line 16
    .line 17
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final getCreateTime(Ljava/lang/Object;)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    const-string v2, "getCreateTime"

    .line 7
    .line 8
    const-string v3, "getCreateTimeStamp"

    .line 9
    .line 10
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "createTimestamp"

    .line 15
    .line 16
    const-string v4, "createTimeStamp"

    .line 17
    .line 18
    const-string v5, "createTime"

    .line 19
    .line 20
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {p0, p1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getLongByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0

    .line 35
    :cond_1
    return-wide v0
.end method

.method public final getReplyCount(Ljava/lang/Object;)I
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "getCommentReplyCount"

    .line 6
    .line 7
    const-string v2, "getChildCommentCount"

    .line 8
    .line 9
    const-string v3, "getReplyCount"

    .line 10
    .line 11
    const-string v4, "getReplyCommentTotal"

    .line 12
    .line 13
    const-string v5, "getReplyCommentCount"

    .line 14
    .line 15
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v6, "childCommentCount"

    .line 20
    .line 21
    const-string v7, "replyCommentCnt"

    .line 22
    .line 23
    const-string v2, "replyCount"

    .line 24
    .line 25
    const-string v3, "replyCommentTotal"

    .line 26
    .line 27
    const-string v4, "replyCommentCount"

    .line 28
    .line 29
    const-string v5, "commentReplyCount"

    .line 30
    .line 31
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getIntByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    return v0
.end method

.method public final isCommentLike(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_1

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Landroid/view/View;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    return v0

    .line 16
    :cond_2
    instance-of v1, p1, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    return v0

    .line 21
    :cond_3
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    return v0

    .line 26
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "CommentItemList"

    .line 35
    .line 36
    invoke-static {v1, v2, v0}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_9

    .line 41
    .line 42
    const-string v2, "CommentList"

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_9

    .line 50
    .line 51
    const-string v2, "Response"

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_9

    .line 58
    .line 59
    const-string v2, "Result"

    .line 60
    .line 61
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_5

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    const-string v2, "getCommentId"

    .line 69
    .line 70
    const-string v4, "getId"

    .line 71
    .line 72
    const-string v5, "getCid"

    .line 73
    .line 74
    filled-new-array {v5, v2, v4}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v4, "commentId"

    .line 79
    .line 80
    const-string v5, "id"

    .line 81
    .line 82
    const-string v6, "cid"

    .line 83
    .line 84
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-direct {p0, p1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_9

    .line 93
    .line 94
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    const-string v2, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"

    .line 102
    .line 103
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_7
    const-string v1, "getContent"

    .line 115
    .line 116
    const-string v2, "getText"

    .line 117
    .line 118
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "content"

    .line 123
    .line 124
    const-string v4, "text"

    .line 125
    .line 126
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-direct {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v2, "getCommentUser"

    .line 135
    .line 136
    const-string v4, "getAuthor"

    .line 137
    .line 138
    const-string v5, "getUser"

    .line 139
    .line 140
    filled-new-array {v5, v2, v4}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v4, "commentUser"

    .line 145
    .line 146
    const-string v5, "author"

    .line 147
    .line 148
    const-string v6, "user"

    .line 149
    .line 150
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-direct {p0, p1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getObjectByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getReplyCount(Ljava/lang/Object;)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez v1, :cond_8

    .line 163
    .line 164
    if-nez v2, :cond_8

    .line 165
    .line 166
    if-ltz p0, :cond_9

    .line 167
    .line 168
    :cond_8
    :goto_0
    return v3

    .line 169
    :cond_9
    :goto_1
    return v0
.end method

.method public final toNewReplyItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    move-object v3, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v3, v0

    .line 23
    :goto_0
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCreateTime(Ljava/lang/Object;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v2, p0

    .line 35
    :goto_1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final toRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 27

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getAwemeId(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    move-object v0, v2

    .line 21
    :cond_1
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    :cond_2
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_3

    .line 33
    .line 34
    move-object v4, v2

    .line 35
    :cond_3
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCreateTime(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getReplyCount(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-gez v2, :cond_4

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    :cond_4
    move v14, v2

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v12

    .line 51
    move-object v2, v0

    .line 52
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 53
    .line 54
    const v25, 0x1ff9e0

    .line 55
    .line 56
    .line 57
    const/16 v26, 0x0

    .line 58
    .line 59
    const-wide/16 v7, 0x0

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    invoke-direct/range {v0 .. v26}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILzq;)V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public final toRecordFromAny(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkId(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_9

    .line 14
    .line 15
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    move-object v6, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v6, v2

    .line 24
    :goto_0
    if-nez v6, :cond_2

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_2
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkContent(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, ""

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    move-object v8, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object v8, v2

    .line 39
    :goto_1
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getBookmarkAuthorName(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    move-object v9, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_4
    move-object v9, v2

    .line 48
    :goto_2
    const-string v2, "getRoomId"

    .line 49
    .line 50
    const-string v4, "getRoomID"

    .line 51
    .line 52
    const-string v5, "getAwemeId"

    .line 53
    .line 54
    const-string v7, "getAid"

    .line 55
    .line 56
    const-string v10, "getGroupId"

    .line 57
    .line 58
    filled-new-array {v5, v7, v10, v2, v4}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v4, "roomId"

    .line 63
    .line 64
    const-string v5, "roomID"

    .line 65
    .line 66
    const-string v7, "awemeId"

    .line 67
    .line 68
    const-string v10, "aid"

    .line 69
    .line 70
    const-string v11, "groupId"

    .line 71
    .line 72
    filled-new-array {v7, v10, v11, v4, v5}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-direct {v0, v1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getStringByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    move-object v7, v3

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move-object v7, v2

    .line 85
    :goto_3
    const-string v2, "getTimestamp"

    .line 86
    .line 87
    const-string v3, "getCreateTimestamp"

    .line 88
    .line 89
    const-string v4, "getCreateTime"

    .line 90
    .line 91
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v3, "timestamp"

    .line 96
    .line 97
    const-string v4, "createTimestamp"

    .line 98
    .line 99
    const-string v5, "createTime"

    .line 100
    .line 101
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-direct {v0, v1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getLongByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    :goto_4
    move-wide v10, v2

    .line 116
    goto :goto_5

    .line 117
    :cond_6
    const-wide/16 v2, 0x0

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :goto_5
    const-string v2, "getReplyCommentCount"

    .line 121
    .line 122
    const-string v3, "getChildCommentCount"

    .line 123
    .line 124
    const-string v4, "getReplyCount"

    .line 125
    .line 126
    const-string v5, "getReplyCommentTotal"

    .line 127
    .line 128
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v3, "replyCommentCount"

    .line 133
    .line 134
    const-string v4, "childCommentCount"

    .line 135
    .line 136
    const-string v5, "replyCount"

    .line 137
    .line 138
    const-string v12, "replyCommentTotal"

    .line 139
    .line 140
    filled-new-array {v5, v12, v3, v4}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-direct {v0, v1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getIntByCandidateNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const/4 v1, 0x0

    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    goto :goto_6

    .line 156
    :cond_7
    move v0, v1

    .line 157
    :goto_6
    if-gez v0, :cond_8

    .line 158
    .line 159
    move/from16 v19, v1

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_8
    move/from16 v19, v0

    .line 163
    .line 164
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 165
    .line 166
    .line 167
    move-result-wide v17

    .line 168
    new-instance v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 169
    .line 170
    const v30, 0x1ff9e0

    .line 171
    .line 172
    .line 173
    const/16 v31, 0x0

    .line 174
    .line 175
    const-wide/16 v12, 0x0

    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    const/16 v20, 0x0

    .line 182
    .line 183
    const/16 v21, 0x0

    .line 184
    .line 185
    const/16 v22, 0x0

    .line 186
    .line 187
    const/16 v23, 0x0

    .line 188
    .line 189
    const/16 v24, 0x0

    .line 190
    .line 191
    const/16 v25, 0x0

    .line 192
    .line 193
    const/16 v26, 0x0

    .line 194
    .line 195
    const/16 v27, 0x0

    .line 196
    .line 197
    const/16 v28, 0x0

    .line 198
    .line 199
    const/16 v29, 0x0

    .line 200
    .line 201
    invoke-direct/range {v5 .. v31}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILzq;)V

    .line 202
    .line 203
    .line 204
    return-object v5

    .line 205
    :cond_9
    :goto_8
    return-object v2
.end method
