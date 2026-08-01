.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

.field private static final TAG:Ljava/lang/String; = "rfdffda28262874f1"

.field private static final bindHookedLoaders:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

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

.field private static final hookedMethods:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile hostContext:Landroid/content/Context;

.field private static volatile providerRegistered:Z

.field private static final replyHookedLoaders:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hookedMethods:Ljava/util/Set;

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->bindHookedLoaders:Ljava/util/Set;

    .line 29
    .line 30
    new-instance v0, Ljava/util/HashSet;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->replyHookedLoaders:Ljava/util/Set;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    const/16 v0, 0x8

    .line 49
    .line 50
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->$stable:I

    .line 51
    .line 52
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

.method public static final synthetic access$handleAfterBind(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;Lk01;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->handleAfterBind(Lk01;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handleAfterReplyQuery(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;Lk01;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->handleAfterReplyQuery(Lk01;)V

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
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

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

.method private final findCommentByAdapterPosition(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, p2, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition$dfs(Ljava/util/IdentityHashMap;ILjava/lang/Object;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private static final findCommentByAdapterPosition$dfs(Ljava/util/IdentityHashMap;ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;I",
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
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x3

    .line 7
    if-le p3, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_2

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
    goto/16 :goto_2

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
    instance-of v1, p2, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_3
    instance-of v1, p2, Ljava/lang/CharSequence;

    .line 30
    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "java.lang."

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_d

    .line 50
    .line 51
    const-string v2, "kotlin."

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_d

    .line 58
    .line 59
    const-string v2, "android."

    .line 60
    .line 61
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_d

    .line 66
    .line 67
    const-string v2, "androidx."

    .line 68
    .line 69
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :cond_5
    instance-of v1, p2, Ljava/util/List;

    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    if-eqz v1, :cond_a

    .line 81
    .line 82
    add-int/lit8 v1, p1, -0x3

    .line 83
    .line 84
    if-gez v1, :cond_6

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_6
    move v3, v1

    .line 88
    :goto_0
    add-int/lit8 v1, p1, 0x3

    .line 89
    .line 90
    check-cast p2, Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    sub-int/2addr v4, v2

    .line 97
    if-le v1, v4, :cond_7

    .line 98
    .line 99
    move v1, v4

    .line 100
    :cond_7
    if-gt v3, v1, :cond_d

    .line 101
    .line 102
    :goto_1
    invoke-static {v3, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition$tryCandidate(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-nez v4, :cond_8

    .line 111
    .line 112
    invoke-static {v3, p2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    add-int/lit8 v5, p3, 0x1

    .line 117
    .line 118
    invoke-static {p0, p1, v4, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition$dfs(Ljava/util/IdentityHashMap;ILjava/lang/Object;I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    :cond_8
    if-eqz v4, :cond_9

    .line 123
    .line 124
    return-object v4

    .line 125
    :cond_9
    if-eq v3, v1, :cond_d

    .line 126
    .line 127
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_a
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-direct {v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const/16 v3, 0x18

    .line 141
    .line 142
    invoke-static {v1, v3}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :catch_0
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_d

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/reflect/Field;

    .line 161
    .line 162
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-nez v4, :cond_b

    .line 171
    .line 172
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition$tryCandidate(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-nez v4, :cond_c

    .line 184
    .line 185
    add-int/lit8 v4, p3, 0x1

    .line 186
    .line 187
    invoke-static {p0, p1, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition$dfs(Ljava/util/IdentityHashMap;ILjava/lang/Object;I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :cond_c
    if-eqz v4, :cond_b

    .line 192
    .line 193
    return-object v4

    .line 194
    :cond_d
    :goto_2
    return-object v0
.end method

.method private static final findCommentByAdapterPosition$tryCandidate(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 6
    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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

.method private final getItemView(Ljava/lang/Object;)Landroid/view/View;
    .locals 3

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
    const-string v2, "itemView"

    .line 7
    .line 8
    invoke-direct {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of p1, p0, Landroid/view/View;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    check-cast p0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object p0, v0

    .line 33
    goto :goto_1

    .line 34
    :goto_0
    new-instance p1, Leo1;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_1
    instance-of p1, p0, Leo1;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object v0, p0

    .line 46
    :goto_2
    check-cast v0, Landroid/view/View;

    .line 47
    .line 48
    return-object v0
.end method

.method private final handleAfterBind(Lk01;)V
    .locals 8

    .line 1
    const-string v0, "rfdffda28262874f1"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_a

    .line 10
    .line 11
    iget-object v1, p1, Lk01;->β:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->shouldSkipBind(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_a

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    array-length v2, p1

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    const/4 v5, 0x0

    .line 28
    if-ge v4, v2, :cond_1

    .line 29
    .line 30
    aget-object v6, p1, v4

    .line 31
    .line 32
    invoke-direct {p0, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->isRecyclerViewHolderLike(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_1
    move-object v6, v5

    .line 46
    :goto_1
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-direct {p0, v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->getItemView(Ljava/lang/Object;)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    :cond_2
    array-length v2, p1

    .line 52
    :goto_2
    if-ge v3, v2, :cond_4

    .line 53
    .line 54
    aget-object v4, p1, v3

    .line 55
    .line 56
    instance-of v7, v4, Ljava/lang/Integer;

    .line 57
    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move-object v4, v5

    .line 65
    :goto_3
    instance-of v2, v4, Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz v2, :cond_5

    .line 68
    .line 69
    move-object v5, v4

    .line 70
    check-cast v5, Ljava/lang/Integer;

    .line 71
    .line 72
    :cond_5
    if-eqz v5, :cond_6

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_4

    .line 79
    :cond_6
    const/4 v2, -0x1

    .line 80
    :goto_4
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 81
    .line 82
    filled-new-array {p1, v6, v1}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findCommentObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-nez v4, :cond_7

    .line 91
    .line 92
    invoke-direct {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->findCommentByAdapterPosition(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :cond_7
    if-eqz v4, :cond_a

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getCommentId(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz p0, :cond_a

    .line 103
    .line 104
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 112
    .line 113
    invoke-virtual {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    invoke-virtual {v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->getReplyCount(Ljava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    filled-new-array {p1, v6, v1}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-virtual {v3, v7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->findAwemeObject([Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;

    .line 133
    .line 134
    filled-new-array {p1, v6, v1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v7, p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkNativeJump;->findVideoCommentPageParam(Ljava/util/Collection;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNativeObjectCache;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNativeObjectCache;

    .line 147
    .line 148
    invoke-virtual {v1, p0, v3, v4, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNativeObjectCache;->put(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    if-ltz v5, :cond_a

    .line 152
    .line 153
    new-instance p1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v1, "bind update bookmarked comment, cid="

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, ", replyCount="

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {v0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 p1, 0x1

    .line 182
    invoke-virtual {v2, p0, v5, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCount(Ljava/lang/String;IZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 183
    .line 184
    .line 185
    :cond_a
    :goto_5
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :goto_6
    new-instance p1, Leo1;

    .line 189
    .line 190
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    move-object p0, p1

    .line 194
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-eqz p0, :cond_b

    .line 199
    .line 200
    const-string p1, "handleAfterBind failed"

    .line 201
    .line 202
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    return-void
.end method

.method private final handleAfterReplyQuery(Lk01;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of v0, p0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    if-nez p0, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->isBookmarked(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;

    .line 31
    .line 32
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReflect;->extractReplyCountFromResult(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ltz p1, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->updateReplyCount(Ljava/lang/String;IZ)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 42
    .line 43
    .line 44
    :cond_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    new-instance p1, Leo1;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object p0, p1

    .line 54
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    const-string p1, "rfdffda28262874f1"

    .line 61
    .line 62
    const-string v0, "handleAfterReplyQuery failed"

    .line 63
    .line 64
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    :goto_2
    return-void
.end method

.method public static synthetic init$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;Ljava/lang/ClassLoader;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->init(Ljava/lang/ClassLoader;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final installBindHooks(Ljava/lang/ClassLoader;Z)V
    .locals 10

    .line 1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->bindHookedLoaders:Ljava/util/Set;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveBindMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const-string v2, "rfdffda28262874f1"

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p1, "bind methods empty, allowDexKitScan="

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/4 p2, 0x0

    .line 62
    move v0, p2

    .line 63
    move v1, v0

    .line 64
    move v3, v1

    .line 65
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 78
    .line 79
    invoke-direct {v5, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hookedMethods:Ljava/util/Set;

    .line 84
    .line 85
    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-nez v8, :cond_2

    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    invoke-interface {v7, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const/4 v7, 0x1

    .line 111
    :try_start_0
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 112
    .line 113
    .line 114
    sget-object v7, Lxq0;->α:Lxq0;

    .line 115
    .line 116
    new-instance v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installBindHooks$1$1$1;

    .line 117
    .line 118
    invoke-direct {v8, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installBindHooks$1$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v4, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 122
    .line 123
    .line 124
    add-int/lit8 v4, p2, 0x1

    .line 125
    .line 126
    :try_start_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    goto :goto_2

    .line 131
    :catchall_0
    move-exception p2

    .line 132
    goto :goto_1

    .line 133
    :catchall_1
    move-exception v4

    .line 134
    move-object v9, v4

    .line 135
    move v4, p2

    .line 136
    move-object p2, v9

    .line 137
    :goto_1
    new-instance v5, Leo1;

    .line 138
    .line 139
    invoke-direct {v5, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object p2, v5

    .line 143
    :goto_2
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-eqz p2, :cond_4

    .line 148
    .line 149
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hookedMethods:Ljava/util/Set;

    .line 152
    .line 153
    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    new-instance v5, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v7, "hook bind failed: "

    .line 159
    .line 160
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-static {v2, v5, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    move p2, v4

    .line 174
    goto :goto_0

    .line 175
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    const-string p1, ", hooked="

    .line 180
    .line 181
    const-string v4, ", duplicate="

    .line 182
    .line 183
    const-string v5, "bind hooks installed: resolved="

    .line 184
    .line 185
    invoke-static {v5, p0, p1, p2, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, ", abstract="

    .line 190
    .line 191
    const-string p2, ", failed="

    .line 192
    .line 193
    invoke-static {p0, v0, p1, v1, p2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method private final installReplyQueryHooks(Ljava/lang/ClassLoader;Z)V
    .locals 10

    .line 1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->replyHookedLoaders:Ljava/util/Set;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object v1, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->resolveReplyQueryMethods(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const-string v2, "rfdffda28262874f1"

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string p1, "reply query methods empty, allowDexKitScan="

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const/4 p2, 0x0

    .line 62
    move v0, p2

    .line 63
    move v1, v0

    .line 64
    move v3, v1

    .line 65
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 78
    .line 79
    invoke-direct {v5, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->stableKey(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hookedMethods:Ljava/util/Set;

    .line 84
    .line 85
    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-nez v8, :cond_2

    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    invoke-interface {v7, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const/4 v7, 0x1

    .line 111
    :try_start_0
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 112
    .line 113
    .line 114
    sget-object v7, Lxq0;->α:Lxq0;

    .line 115
    .line 116
    new-instance v8, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installReplyQueryHooks$1$1$1;

    .line 117
    .line 118
    invoke-direct {v8, v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installReplyQueryHooks$1$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v4, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 122
    .line 123
    .line 124
    add-int/lit8 v4, p2, 0x1

    .line 125
    .line 126
    :try_start_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    goto :goto_2

    .line 131
    :catchall_0
    move-exception p2

    .line 132
    goto :goto_1

    .line 133
    :catchall_1
    move-exception v4

    .line 134
    move-object v9, v4

    .line 135
    move v4, p2

    .line 136
    move-object p2, v9

    .line 137
    :goto_1
    new-instance v5, Leo1;

    .line 138
    .line 139
    invoke-direct {v5, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object p2, v5

    .line 143
    :goto_2
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-eqz p2, :cond_4

    .line 148
    .line 149
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hookedMethods:Ljava/util/Set;

    .line 152
    .line 153
    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    new-instance v5, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v7, "hook reply query failed: "

    .line 159
    .line 160
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-static {v2, v5, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    move p2, v4

    .line 174
    goto :goto_0

    .line 175
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    const-string p1, ", hooked="

    .line 180
    .line 181
    const-string v4, ", duplicate="

    .line 182
    .line 183
    const-string v5, "reply query hooks installed: resolved="

    .line 184
    .line 185
    invoke-static {v5, p0, p1, p2, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, ", abstract="

    .line 190
    .line 191
    const-string p2, ", failed="

    .line 192
    .line 193
    invoke-static {p0, v0, p1, v1, p2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method private final isRecyclerViewHolderLike(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->getItemView(Ljava/lang/Object;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "ViewHolder"

    .line 22
    .line 23
    invoke-static {p0, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method private final shouldSkipBind(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 p0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C8D6DCD4277D127BBF909EFE932E738094BD5B01F9BC1085A3D0B97EBE25855005CBEB7C451AE0AE81B4"

    .line 13
    .line 14
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, ".profile."

    .line 25
    .line 26
    invoke-static {p1, v0, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ".familiar.tab."

    .line 33
    .line 34
    invoke-static {p1, v0, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const-string v0, "SocialTab"

    .line 41
    .line 42
    invoke-static {p1, v0, p0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 p0, 0x0

    .line 50
    :cond_1
    :goto_0
    return p0
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
    const/16 v2, 0x8

    .line 44
    .line 45
    invoke-direct {v1, v2}, Luj;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v2, 0x1e

    .line 49
    .line 50
    const-string v3, ","

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {v0, v3, v4, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "):"

    .line 58
    .line 59
    invoke-static {p0, v0, v1, p1}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method private static final stableKey$lambda$21$lambda$20(Ljava/lang/Class;)Ljava/lang/CharSequence;
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

.method public static synthetic α(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->stableKey$lambda$21$lambda$20(Ljava/lang/Class;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final init(Ljava/lang/ClassLoader;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->installBindHooks(Ljava/lang/ClassLoader;Z)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->installReplyQueryHooks(Ljava/lang/ClassLoader;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onHostContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hostContext:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p1, p0

    .line 17
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->hostContext:Landroid/content/Context;

    .line 18
    .line 19
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkStore;->init(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->init(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final registerDexKitPrewarmProvider()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->providerRegistered:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    sget-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->providerRegistered:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_1
    const/4 v0, 0x1

    .line 14
    :try_start_1
    sput-boolean v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->providerRegistered:Z

    .line 15
    .line 16
    sget-object v0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->registerDexKitPrewarmProvider()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    monitor-exit p0

    .line 25
    throw v0
.end method
