.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

.field private static final TAG:Ljava/lang/String; = "r9d0527b9ba13b0db"

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
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

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
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->primitiveNames:Ljava/util/Set;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->$stable:I

    .line 39
    .line 40
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

.method private final extractAwemeItemsFromKnownContainer(Ljava/lang/Object;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

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
    const-string v1, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Ljz;->ε:Ljz;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string v0, "getItemsNotNull"

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "getItems"

    .line 31
    .line 32
    invoke-direct {p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "items"

    .line 37
    .line 38
    invoke-direct {p0, p1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "preloadAwemes"

    .line 43
    .line 44
    invoke-direct {p0, p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v4, "preloadAds"

    .line 49
    .line 50
    invoke-direct {p0, p1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    instance-of v2, v1, Ljava/lang/Iterable;

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 104
    .line 105
    invoke-direct {v3, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeAweme(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    invoke-virtual {v3, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toAwemeItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    instance-of v2, v1, [Ljava/lang/Object;

    .line 122
    .line 123
    if-eqz v2, :cond_1

    .line 124
    .line 125
    check-cast v1, [Ljava/lang/Object;

    .line 126
    .line 127
    array-length v2, v1

    .line 128
    const/4 v3, 0x0

    .line 129
    :goto_1
    if-ge v3, v2, :cond_1

    .line 130
    .line 131
    aget-object v4, v1, v3

    .line 132
    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 136
    .line 137
    invoke-direct {v5, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeAweme(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_4

    .line 142
    .line 143
    invoke-virtual {v5, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toAwemeItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    if-eqz v4, :cond_4

    .line 148
    .line 149
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    const-string v1, "FeedItemList direct candidates="

    .line 164
    .line 165
    const-string v2, ", extracted="

    .line 166
    .line 167
    invoke-static {p0, v0, v1, v2}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const/4 v0, 0x4

    .line 172
    const-string v1, "r9d0527b9ba13b0db"

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object p1
.end method

.method private static final findAwemeItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    const/16 v0, 0x8

    .line 6
    .line 7
    if-le p3, v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 25
    .line 26
    invoke-direct {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeAweme(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toAwemeItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_d

    .line 37
    .line 38
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    instance-of v1, p2, Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    return-void

    .line 47
    :cond_4
    instance-of v1, p2, Ljava/lang/Number;

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    return-void

    .line 52
    :cond_5
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 53
    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    return-void

    .line 57
    :cond_6
    instance-of v1, p2, Landroid/view/View;

    .line 58
    .line 59
    if-eqz v1, :cond_7

    .line 60
    .line 61
    return-void

    .line 62
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "java."

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_d

    .line 78
    .line 79
    const-string v2, "kotlin."

    .line 80
    .line 81
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_d

    .line 86
    .line 87
    const-string v2, "android."

    .line 88
    .line 89
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_d

    .line 94
    .line 95
    const-string v2, "androidx."

    .line 96
    .line 97
    invoke-static {v1, v2, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_8
    instance-of v1, p2, Ljava/lang/Iterable;

    .line 106
    .line 107
    const/16 v2, 0xc8

    .line 108
    .line 109
    const/4 v4, 0x1

    .line 110
    if-eqz v1, :cond_9

    .line 111
    .line 112
    check-cast p2, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-static {p2, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_d

    .line 127
    .line 128
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    add-int/lit8 v1, p3, 0x1

    .line 133
    .line 134
    invoke-static {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_b

    .line 147
    .line 148
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-le v0, v2, :cond_a

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_a
    move v2, v0

    .line 156
    :goto_1
    if-ge v3, v2, :cond_d

    .line 157
    .line 158
    invoke-static {p2, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    add-int/lit8 v1, p3, 0x1

    .line 163
    .line 164
    invoke-static {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_b
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const/16 v1, 0x78

    .line 179
    .line 180
    invoke-static {v0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :catchall_0
    :cond_c
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_d

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Ljava/lang/reflect/Field;

    .line 199
    .line 200
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-nez v2, :cond_c

    .line 209
    .line 210
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    add-int/lit8 v2, p3, 0x1

    .line 218
    .line 219
    invoke-static {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_d
    :goto_3
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

.method private static final findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;
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
    const/4 v1, 0x7

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
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 25
    .line 26
    invoke-direct {v1, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeUser(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    instance-of v2, p1, Landroid/view/View;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    check-cast v1, Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    add-int/lit8 v2, p2, 0x1

    .line 49
    .line 50
    invoke-static {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_4
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 58
    .line 59
    if-eqz v1, :cond_14

    .line 60
    .line 61
    check-cast p1, Landroid/view/ViewGroup;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/16 v2, 0x50

    .line 68
    .line 69
    if-le v1, v2, :cond_5

    .line 70
    .line 71
    move v1, v2

    .line 72
    :cond_5
    :goto_0
    if-ge v3, v1, :cond_14

    .line 73
    .line 74
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    add-int/lit8 v5, p2, 0x1

    .line 79
    .line 80
    invoke-static {p0, v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_7
    instance-of v2, p1, Landroid/content/Intent;

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_8
    instance-of v2, p1, Ljava/lang/CharSequence;

    .line 96
    .line 97
    if-eqz v2, :cond_9

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_9
    instance-of v2, p1, Ljava/lang/Number;

    .line 101
    .line 102
    if-eqz v2, :cond_a

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_a
    instance-of v2, p1, Ljava/lang/Boolean;

    .line 106
    .line 107
    if-eqz v2, :cond_b

    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_b
    instance-of v2, p1, Ljava/lang/Class;

    .line 111
    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    sget-object v5, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->primitiveNames:Ljava/util/Set;

    .line 124
    .line 125
    invoke-interface {v5, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_14

    .line 130
    .line 131
    const-string v5, "java."

    .line 132
    .line 133
    invoke-static {v2, v5, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_14

    .line 138
    .line 139
    const-string v5, "kotlin."

    .line 140
    .line 141
    invoke-static {v2, v5, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-nez v5, :cond_14

    .line 146
    .line 147
    const-string v5, "android."

    .line 148
    .line 149
    invoke-static {v2, v5, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-nez v5, :cond_14

    .line 154
    .line 155
    const-string v5, "androidx."

    .line 156
    .line 157
    invoke-static {v2, v5, v3}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_d

    .line 162
    .line 163
    goto/16 :goto_2

    .line 164
    .line 165
    :cond_d
    instance-of v2, p1, Ljava/lang/Iterable;

    .line 166
    .line 167
    const/16 v5, 0x32

    .line 168
    .line 169
    if-eqz v2, :cond_f

    .line 170
    .line 171
    check-cast p1, Ljava/lang/Iterable;

    .line 172
    .line 173
    invoke-static {p1, v5}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_14

    .line 186
    .line 187
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    add-int/lit8 v2, p2, 0x1

    .line 192
    .line 193
    invoke-static {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    if-eqz v1, :cond_e

    .line 198
    .line 199
    return-object v1

    .line 200
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_12

    .line 209
    .line 210
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-le v1, v5, :cond_10

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_10
    move v5, v1

    .line 218
    :goto_1
    if-ge v3, v5, :cond_14

    .line 219
    .line 220
    invoke-static {p1, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    add-int/lit8 v2, p2, 0x1

    .line 225
    .line 226
    invoke-static {p0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    if-eqz v1, :cond_11

    .line 231
    .line 232
    return-object v1

    .line 233
    :cond_11
    add-int/lit8 v3, v3, 0x1

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-direct {v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    const/16 v2, 0xa0

    .line 245
    .line 246
    invoke-static {v1, v2}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :catchall_0
    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_14

    .line 259
    .line 260
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    check-cast v2, Ljava/lang/reflect/Field;

    .line 265
    .line 266
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-nez v3, :cond_13

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    add-int/lit8 v3, p2, 0x1

    .line 284
    .line 285
    invoke-static {p0, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    if-eqz v2, :cond_13

    .line 290
    .line 291
    return-object v2

    .line 292
    :cond_14
    :goto_2
    return-object v0
.end method

.method private static final findProfileRecordFromRoots$lambda$10(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null"

    .line 13
    .line 14
    return-object p0
.end method

.method private final varargs firstNonBlank([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    array-length p0, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    const-string v1, ""

    .line 4
    .line 5
    if-ge v0, p0, :cond_3

    .line 6
    .line 7
    aget-object v2, p1, v0

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    move-object v1, v2

    .line 25
    :goto_2
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-string v2, "null"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-object v1
.end method

.method private final fromIntent(Landroid/content/Intent;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    return-object v3

    .line 9
    :cond_0
    const-string v8, "authorId"

    .line 10
    .line 11
    const-string v9, "id"

    .line 12
    .line 13
    const-string v4, "uid"

    .line 14
    .line 15
    const-string v5, "user_id"

    .line 16
    .line 17
    const-string v6, "userId"

    .line 18
    .line 19
    const-string v7, "author_id"

    .line 20
    .line 21
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v0, "secUid"

    .line 26
    .line 27
    const-string v5, "sec_author_uid"

    .line 28
    .line 29
    const-string v6, "sec_uid"

    .line 30
    .line 31
    const-string v7, "sec_user_id"

    .line 32
    .line 33
    const-string v8, "secUserId"

    .line 34
    .line 35
    filled-new-array {v6, v7, v8, v0, v5}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v11, "short_id"

    .line 40
    .line 41
    const-string v12, "shortId"

    .line 42
    .line 43
    const-string v6, "nickname"

    .line 44
    .line 45
    const-string v7, "nick_name"

    .line 46
    .line 47
    const-string v8, "nickName"

    .line 48
    .line 49
    const-string v9, "unique_id"

    .line 50
    .line 51
    const-string v10, "uniqueId"

    .line 52
    .line 53
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$pathProfileId(Landroid/net/Uri;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-string v8, ""

    .line 70
    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    :try_start_0
    const-string v0, "_real_deeplink_"

    .line 74
    .line 75
    invoke-static {v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$extraValue(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$pathProfileId(Landroid/net/Uri;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    new-instance v7, Leo1;

    .line 90
    .line 91
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v7

    .line 95
    :goto_0
    instance-of v7, v0, Leo1;

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    move-object v0, v8

    .line 100
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    :cond_2
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    :try_start_1
    const-string v0, "uri_string"

    .line 109
    .line 110
    invoke-static {v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$extraValue(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$pathProfileId(Landroid/net/Uri;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    goto :goto_1

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    new-instance v7, Leo1;

    .line 125
    .line 126
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v7

    .line 130
    :goto_1
    instance-of v7, v0, Leo1;

    .line 131
    .line 132
    if-eqz v7, :cond_3

    .line 133
    .line 134
    move-object v0, v8

    .line 135
    :cond_3
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    :cond_4
    invoke-static {v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$value(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 142
    .line 143
    invoke-direct {v7, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->isNumericUid(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_5

    .line 148
    .line 149
    move-object v9, v0

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object v9, v3

    .line 152
    :goto_2
    filled-new-array {v4, v9}, [Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-direct {v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v2, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$value(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_6

    .line 169
    .line 170
    invoke-direct {v7, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->isNumericUid(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-nez v7, :cond_6

    .line 175
    .line 176
    move-object v7, v0

    .line 177
    goto :goto_3

    .line 178
    :cond_6
    move-object v7, v3

    .line 179
    :goto_3
    filled-new-array {v5, v7}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-direct {v1, v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v2, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$value(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    filled-new-array {v6}, [Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-direct {v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-direct {v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->isNumericUid(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_7

    .line 204
    .line 205
    move-object v6, v4

    .line 206
    goto :goto_4

    .line 207
    :cond_7
    move-object v6, v8

    .line 208
    :goto_4
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_8

    .line 213
    .line 214
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_8

    .line 219
    .line 220
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-nez v7, :cond_8

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_8
    move-object v4, v5

    .line 228
    :goto_5
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eqz v5, :cond_9

    .line 233
    .line 234
    invoke-direct {v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->isNumericUid(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_9

    .line 239
    .line 240
    move-object v10, v4

    .line 241
    move-object v11, v8

    .line 242
    goto :goto_6

    .line 243
    :cond_9
    move-object v11, v4

    .line 244
    move-object v10, v6

    .line 245
    :goto_6
    invoke-virtual/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->dumpIntent(Landroid/content/Intent;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    const-string v2, ", secUid="

    .line 250
    .line 251
    const-string v4, ", nickname="

    .line 252
    .line 253
    const-string v5, "fromIntent uid="

    .line 254
    .line 255
    invoke-static {v5, v10, v2, v11, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    const-string v4, ", pathId="

    .line 260
    .line 261
    const-string v5, ", dump="

    .line 262
    .line 263
    invoke-static {v2, v12, v4, v0, v5}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const/4 v1, 0x4

    .line 274
    const-string v2, "r9d0527b9ba13b0db"

    .line 275
    .line 276
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_a

    .line 284
    .line 285
    invoke-static {v11}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_a

    .line 290
    .line 291
    return-object v3

    .line 292
    :cond_a
    new-instance v9, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 293
    .line 294
    const v28, 0xfff8

    .line 295
    .line 296
    .line 297
    const/16 v29, 0x0

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    const/16 v16, 0x0

    .line 303
    .line 304
    const-wide/16 v17, 0x0

    .line 305
    .line 306
    const-wide/16 v19, 0x0

    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const/16 v23, 0x0

    .line 313
    .line 314
    const/16 v24, 0x0

    .line 315
    .line 316
    const/16 v25, 0x0

    .line 317
    .line 318
    const/16 v26, 0x0

    .line 319
    .line 320
    const/16 v27, 0x0

    .line 321
    .line 322
    invoke-direct/range {v9 .. v29}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 323
    .line 324
    .line 325
    return-object v9
.end method

.method private static final fromIntent$extraValue(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    return-object v1

    .line 23
    :catchall_0
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    return-object p0

    .line 53
    :catchall_1
    :cond_3
    :goto_1
    const-string p0, ""

    .line 54
    .line 55
    return-object p0
.end method

.method private static final fromIntent$pathProfileId(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-string v1, "profile"

    .line 14
    .line 15
    invoke-interface {p0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ltz v1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_2

    .line 28
    .line 29
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    :goto_0
    move-object p0, v0

    .line 38
    goto :goto_2

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {p0}, Lxh;->Р(Ljava/util/List;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    new-instance v1, Leo1;

    .line 51
    .line 52
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p0, v1

    .line 56
    :cond_3
    :goto_2
    instance-of v1, p0, Leo1;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move-object v0, p0

    .line 62
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 63
    .line 64
    return-object v0
.end method

.method private static final fromIntent$uriParam(Landroid/net/Uri;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_4

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v3

    .line 18
    new-instance v4, Leo1;

    .line 19
    .line 20
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v3, v4

    .line 24
    :goto_1
    instance-of v4, v3, Leo1;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :cond_1
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const-string v4, "null"

    .line 41
    .line 42
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_3

    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    return-object v0
.end method

.method private static final fromIntent$uriParamFromString(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const-string v1, "null"

    .line 13
    .line 14
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$uriParam(Landroid/net/Uri;[Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance p1, Leo1;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, p1

    .line 37
    :goto_0
    instance-of p1, p0, Leo1;

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, p0

    .line 43
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    :cond_3
    :goto_2
    return-object v0
.end method

.method private static final fromIntent$value(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-static {p0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$extraValue(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$uriParam(Landroid/net/Uri;[Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v0, v3

    .line 39
    :goto_1
    if-eqz v0, :cond_3

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_3
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$uriParamFromString(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    move-object v0, v3

    .line 58
    :goto_2
    if-eqz v0, :cond_5

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_5
    const-string v8, "_real_deeplink_"

    .line 62
    .line 63
    const-string v9, "hp_original_uri"

    .line 64
    .line 65
    const-string v4, "uri_string"

    .line 66
    .line 67
    const-string v5, "original_url"

    .line 68
    .line 69
    const-string v6, "schema"

    .line 70
    .line 71
    const-string v7, "_origin_deeplink_"

    .line 72
    .line 73
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_3
    const/4 v2, 0x6

    .line 78
    if-ge v1, v2, :cond_8

    .line 79
    .line 80
    aget-object v2, v0, v1

    .line 81
    .line 82
    invoke-static {p0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$extraValue(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent$uriParamFromString(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_6

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    move-object v2, v3

    .line 98
    :goto_4
    if-eqz v2, :cond_7

    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_8
    const-string p0, ""

    .line 105
    .line 106
    return-object p0
.end method

.method private final fromKnownProfileContainer(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 27

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
    goto/16 :goto_12

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v4, "profile"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-static {v3, v4, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto/16 :goto_12

    .line 37
    .line 38
    :cond_1
    const-string v11, "mUser"

    .line 39
    .line 40
    const-string v12, "curUser"

    .line 41
    .line 42
    const-string v6, "B"

    .line 43
    .line 44
    const-string v7, "n"

    .line 45
    .line 46
    const-string v8, "w"

    .line 47
    .line 48
    const-string v9, "r"

    .line 49
    .line 50
    const-string v10, "user"

    .line 51
    .line 52
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move v4, v5

    .line 57
    :goto_0
    const/4 v6, 0x7

    .line 58
    if-ge v4, v6, :cond_3

    .line 59
    .line 60
    aget-object v6, v3, v4

    .line 61
    .line 62
    sget-object v7, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 63
    .line 64
    invoke-direct {v7, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    invoke-direct {v7, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeUser(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-eqz v8, :cond_2

    .line 75
    .line 76
    invoke-virtual {v7, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toProfileRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_2

    .line 91
    .line 92
    return-object v6

    .line 93
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    const-string v3, "y"

    .line 97
    .line 98
    invoke-direct {v0, v1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    instance-of v4, v3, Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move-object v3, v2

    .line 110
    :goto_1
    const-string v4, "uid"

    .line 111
    .line 112
    invoke-direct {v0, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    instance-of v6, v4, Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v6, :cond_5

    .line 119
    .line 120
    check-cast v4, Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    move-object v4, v2

    .line 124
    :goto_2
    const-string v6, "userId"

    .line 125
    .line 126
    invoke-direct {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    instance-of v7, v6, Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v7, :cond_6

    .line 133
    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    move-object v6, v2

    .line 138
    :goto_3
    const-string v7, "user_id"

    .line 139
    .line 140
    invoke-direct {v0, v1, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    instance-of v8, v7, Ljava/lang/String;

    .line 145
    .line 146
    if-eqz v8, :cond_7

    .line 147
    .line 148
    check-cast v7, Ljava/lang/String;

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    move-object v7, v2

    .line 152
    :goto_4
    filled-new-array {v3, v4, v6, v7}, [Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-direct {v0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-string v4, "C"

    .line 161
    .line 162
    invoke-direct {v0, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    instance-of v6, v4, Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v6, :cond_8

    .line 169
    .line 170
    check-cast v4, Ljava/lang/String;

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    move-object v4, v2

    .line 174
    :goto_5
    const-string v6, "secUid"

    .line 175
    .line 176
    invoke-direct {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    instance-of v7, v6, Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v7, :cond_9

    .line 183
    .line 184
    check-cast v6, Ljava/lang/String;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_9
    move-object v6, v2

    .line 188
    :goto_6
    const-string v7, "secUserId"

    .line 189
    .line 190
    invoke-direct {v0, v1, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    instance-of v8, v7, Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v8, :cond_a

    .line 197
    .line 198
    check-cast v7, Ljava/lang/String;

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_a
    move-object v7, v2

    .line 202
    :goto_7
    const-string v8, "sec_user_id"

    .line 203
    .line 204
    invoke-direct {v0, v1, v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    instance-of v9, v8, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v9, :cond_b

    .line 211
    .line 212
    check-cast v8, Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_b
    move-object v8, v2

    .line 216
    :goto_8
    filled-new-array {v4, v6, v7, v8}, [Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-direct {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    const-string v6, "nickname"

    .line 225
    .line 226
    invoke-direct {v0, v1, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    instance-of v7, v6, Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v7, :cond_c

    .line 233
    .line 234
    check-cast v6, Ljava/lang/String;

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_c
    move-object v6, v2

    .line 238
    :goto_9
    const-string v7, "nickName"

    .line 239
    .line 240
    invoke-direct {v0, v1, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    instance-of v8, v7, Ljava/lang/String;

    .line 245
    .line 246
    if-eqz v8, :cond_d

    .line 247
    .line 248
    check-cast v7, Ljava/lang/String;

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_d
    move-object v7, v2

    .line 252
    :goto_a
    const-string v8, "uniqueId"

    .line 253
    .line 254
    invoke-direct {v0, v1, v8}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    instance-of v8, v1, Ljava/lang/String;

    .line 259
    .line 260
    if-eqz v8, :cond_e

    .line 261
    .line 262
    check-cast v1, Ljava/lang/String;

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_e
    move-object v1, v2

    .line 266
    :goto_b
    filled-new-array {v6, v7, v1}, [Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->firstNonBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_f

    .line 279
    .line 280
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_f

    .line 285
    .line 286
    goto :goto_12

    .line 287
    :cond_f
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_11

    .line 292
    .line 293
    move v0, v5

    .line 294
    :goto_c
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-ge v0, v1, :cond_11

    .line 299
    .line 300
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-nez v1, :cond_10

    .line 309
    .line 310
    move-object v3, v2

    .line 311
    goto :goto_d

    .line 312
    :cond_10
    add-int/lit8 v0, v0, 0x1

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_11
    :goto_d
    const-string v0, ""

    .line 316
    .line 317
    if-nez v3, :cond_12

    .line 318
    .line 319
    move-object v7, v0

    .line 320
    goto :goto_e

    .line 321
    :cond_12
    move-object v7, v3

    .line 322
    :goto_e
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-nez v1, :cond_15

    .line 327
    .line 328
    :goto_f
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-ge v5, v1, :cond_14

    .line 333
    .line 334
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-nez v1, :cond_13

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    const/16 v3, 0x8

    .line 349
    .line 350
    if-lt v1, v3, :cond_14

    .line 351
    .line 352
    goto :goto_10

    .line 353
    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 354
    .line 355
    goto :goto_f

    .line 356
    :cond_14
    move-object v4, v2

    .line 357
    :cond_15
    :goto_10
    if-nez v4, :cond_16

    .line 358
    .line 359
    move-object v8, v0

    .line 360
    goto :goto_11

    .line 361
    :cond_16
    move-object v8, v4

    .line 362
    :goto_11
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_17

    .line 367
    .line 368
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_17

    .line 373
    .line 374
    :goto_12
    return-object v2

    .line 375
    :cond_17
    new-instance v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 376
    .line 377
    const v25, 0xfff8

    .line 378
    .line 379
    .line 380
    const/16 v26, 0x0

    .line 381
    .line 382
    const/4 v10, 0x0

    .line 383
    const/4 v11, 0x0

    .line 384
    const/4 v12, 0x0

    .line 385
    const/4 v13, 0x0

    .line 386
    const-wide/16 v14, 0x0

    .line 387
    .line 388
    const-wide/16 v16, 0x0

    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const/16 v19, 0x0

    .line 393
    .line 394
    const/16 v20, 0x0

    .line 395
    .line 396
    const/16 v21, 0x0

    .line 397
    .line 398
    const/16 v22, 0x0

    .line 399
    .line 400
    const/16 v23, 0x0

    .line 401
    .line 402
    const/16 v24, 0x0

    .line 403
    .line 404
    invoke-direct/range {v6 .. v26}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 405
    .line 406
    .line 407
    return-object v6
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
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

.method private final getLongByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 5

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    const/16 v2, 0xa

    .line 5
    .line 6
    if-ge v1, p0, :cond_2

    .line 7
    .line 8
    aget-object v3, p2, v1

    .line 9
    .line 10
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 11
    .line 12
    invoke-direct {v4, p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    instance-of v4, v3, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v3, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    instance-of v4, v3, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v3, v2}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    array-length p0, p3

    .line 56
    :goto_1
    if-ge v0, p0, :cond_5

    .line 57
    .line 58
    aget-object p2, p3, v0

    .line 59
    .line 60
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 61
    .line 62
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    instance-of v1, p2, Ljava/lang/Number;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    check-cast p2, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide p0

    .line 76
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_3
    instance-of v1, p2, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    check-cast p2, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p2, v2}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method private final getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length p0, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, v0

    .line 4
    :goto_0
    const-string v2, "null"

    .line 5
    .line 6
    if-ge v1, p0, :cond_1

    .line 7
    .line 8
    aget-object v3, p2, v1

    .line 9
    .line 10
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 11
    .line 12
    invoke-direct {v4, p1, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->invokeNoArg(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    return-object v3

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    array-length p0, p3

    .line 39
    :goto_1
    if-ge v0, p0, :cond_3

    .line 40
    .line 41
    aget-object p2, p3, v0

    .line 42
    .line 43
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 44
    .line 45
    invoke-direct {v1, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getFieldValue(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    invoke-static {p2, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    return-object p2

    .line 68
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 p0, 0x0

    .line 72
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
    invoke-direct {p0, v1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

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

.method private final isNumericUid(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    move v0, p0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p0, 0x1

    .line 33
    :cond_3
    :goto_1
    return p0
.end method

.method private final looksLikeAweme(Ljava/lang/Object;)Z
    .locals 5

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
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 10
    .line 11
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    const-string v0, "getAwemeId"

    .line 24
    .line 25
    const-string v2, "getGroupId"

    .line 26
    .line 27
    const-string v3, "getAid"

    .line 28
    .line 29
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "awemeId"

    .line 34
    .line 35
    const-string v3, "groupId"

    .line 36
    .line 37
    const-string v4, "aid"

    .line 38
    .line 39
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {p0, p1, v0, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v2, "getDesc"

    .line 48
    .line 49
    const-string v3, "getDescription"

    .line 50
    .line 51
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "desc"

    .line 56
    .line 57
    const-string v4, "description"

    .line 58
    .line 59
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {p0, p1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    if-eqz p0, :cond_2

    .line 77
    .line 78
    return v1

    .line 79
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 80
    return p0
.end method

.method private final looksLikeUser(Ljava/lang/Object;)Z
    .locals 8

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
    const-string v1, "getUid"

    .line 19
    .line 20
    const-string v2, "getUserId"

    .line 21
    .line 22
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "userId"

    .line 27
    .line 28
    const-string v3, "user_id"

    .line 29
    .line 30
    const-string v4, "uid"

    .line 31
    .line 32
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {p0, p1, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "getSecUid"

    .line 41
    .line 42
    const-string v3, "getSecUserId"

    .line 43
    .line 44
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "sec_user_id"

    .line 49
    .line 50
    const-string v4, "secUserId"

    .line 51
    .line 52
    const-string v5, "secUid"

    .line 53
    .line 54
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-direct {p0, p1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "getUniqueId"

    .line 63
    .line 64
    const-string v4, "getShortId"

    .line 65
    .line 66
    const-string v5, "getNickname"

    .line 67
    .line 68
    const-string v6, "getNickName"

    .line 69
    .line 70
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v4, "uniqueId"

    .line 75
    .line 76
    const-string v5, "shortId"

    .line 77
    .line 78
    const-string v6, "nickname"

    .line 79
    .line 80
    const-string v7, "nickName"

    .line 81
    .line 82
    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-direct {p0, p1, v3, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string p1, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD991981847A"

    .line 91
    .line 92
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/4 v3, 0x0

    .line 101
    if-nez p1, :cond_1

    .line 102
    .line 103
    const-string p1, ".user"

    .line 104
    .line 105
    invoke-static {v0, p1, v3}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_1

    .line 110
    .line 111
    const-string p1, "profile.model.user"

    .line 112
    .line 113
    invoke-static {v0, p1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_0

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    if-eqz p0, :cond_4

    .line 121
    .line 122
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 130
    .line 131
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_3

    .line 136
    .line 137
    :cond_2
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    const/4 p0, 0x1

    .line 147
    return p0

    .line 148
    :cond_4
    :goto_1
    return v3
.end method

.method public static synthetic α(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$lambda$10(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final dumpIntent(Landroid/content/Intent;)Ljava/lang/String;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, "intent=null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v0, "action="

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", data="

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_7

    .line 40
    .line 41
    const-string v0, ", extras={"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast v0, Ljava/lang/Iterable;

    .line 54
    .line 55
    const/16 v1, 0x50

    .line 56
    .line 57
    invoke-static {v0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 76
    .line 77
    :try_start_1
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v3

    .line 83
    :try_start_2
    new-instance v4, Leo1;

    .line 84
    .line 85
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v3, v4

    .line 89
    :goto_1
    instance-of v4, v3, Leo1;

    .line 90
    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    :cond_1
    if-nez v3, :cond_2

    .line 95
    .line 96
    const-string v3, "null"

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_2
    instance-of v4, v3, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v3, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    goto :goto_3

    .line 110
    :cond_3
    instance-of v4, v3, Ljava/lang/Number;

    .line 111
    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 115
    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :goto_3
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v2, "="

    .line 136
    .line 137
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v2, ", "

    .line 144
    .line 145
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    const-string p1, "}"

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    const-string p1, ", extras=null"

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    :goto_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const/16 p1, 0x9c4

    .line 165
    .line 166
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    goto :goto_5

    .line 171
    :catchall_1
    move-exception p0

    .line 172
    new-instance p1, Leo1;

    .line 173
    .line 174
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    move-object p0, p1

    .line 178
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-nez p1, :cond_8

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, "dumpIntent failed: "

    .line 190
    .line 191
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    :goto_6
    check-cast p0, Ljava/lang/String;

    .line 196
    .line 197
    return-object p0
.end method

.method public final dumpShort(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " {"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->allFields(Ljava/lang/Class;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/16 v1, 0x28

    .line 36
    .line 37
    invoke-static {p0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v1, 0x0

    .line 46
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/reflect/Field;

    .line 57
    .line 58
    const/16 v3, 0x14

    .line 59
    .line 60
    if-ge v1, v3, :cond_1

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    instance-of v4, v3, Ljava/lang/String;

    .line 71
    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    instance-of v4, v3, Ljava/lang/Number;

    .line 75
    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v2, "="

    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v2, ", "

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    const-string p0, "}"

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception p0

    .line 116
    new-instance p1, Leo1;

    .line 117
    .line 118
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object p0, p1

    .line 122
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-nez p1, :cond_4

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    const-string p1, "dump failed: "

    .line 134
    .line 135
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_2
    check-cast p0, Ljava/lang/String;

    .line 140
    .line 141
    return-object p0
.end method

.method public final findAwemeItems(Ljava/lang/Object;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
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
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->extractAwemeItemsFromKnownContainer(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "direct extract hit root="

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, ", items="

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v0, 0x4

    .line 51
    const-string v1, "r9d0527b9ba13b0db"

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static {v1, p1, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-static {v0, p0, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findAwemeItems$walk(Ljava/util/IdentityHashMap;Ljava/util/ArrayList;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v1, v0

    .line 92
    check-cast v1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    new-instance v0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v2, v1

    .line 133
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 134
    .line 135
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->getAwemeId()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_4

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect$findAwemeItems$$inlined$sortedByDescending$1;

    .line 150
    .line 151
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect$findAwemeItems$$inlined$sortedByDescending$1;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-static {v0, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
.end method

.method public final varargs findProfileRecordFromRoots([Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    const-string v4, ", uid="

    .line 9
    .line 10
    const-string v5, ", nickname="

    .line 11
    .line 12
    const-string v6, ", secUid="

    .line 13
    .line 14
    const-string v8, "r9d0527b9ba13b0db"

    .line 15
    .line 16
    if-ge v3, v1, :cond_6

    .line 17
    .line 18
    aget-object v10, v0, v3

    .line 19
    .line 20
    sget-object v11, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 21
    .line 22
    instance-of v12, v10, Landroid/content/Intent;

    .line 23
    .line 24
    if-eqz v12, :cond_0

    .line 25
    .line 26
    move-object v12, v10

    .line 27
    check-cast v12, Landroid/content/Intent;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v12, 0x0

    .line 31
    :goto_1
    invoke-direct {v11, v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromIntent(Landroid/content/Intent;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 32
    .line 33
    .line 34
    move-result-object v12

    .line 35
    const-string v13, ", key="

    .line 36
    .line 37
    if-eqz v12, :cond_1

    .line 38
    .line 39
    invoke-virtual {v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v14

    .line 43
    invoke-virtual {v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v15

    .line 47
    invoke-virtual {v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-string v9, "hit from intent uid="

    .line 56
    .line 57
    invoke-static {v9, v14, v6, v15, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-static {v9, v2, v13, v7}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/4 v7, 0x4

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-static {v8, v2, v9, v7, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v12}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_1

    .line 79
    .line 80
    return-object v12

    .line 81
    :cond_1
    invoke-direct {v11, v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->fromKnownProfileContainer(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    if-eqz v10, :cond_2

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    const/4 v7, 0x0

    .line 99
    :goto_2
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    move/from16 v16, v1

    .line 116
    .line 117
    const-string v1, "hit from known profile container="

    .line 118
    .line 119
    invoke-static {v1, v7, v4, v9, v6}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1, v12, v5, v14, v13}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const/4 v7, 0x4

    .line 134
    const/4 v9, 0x0

    .line 135
    invoke-static {v8, v1, v9, v7, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-nez v1, :cond_4

    .line 147
    .line 148
    return-object v2

    .line 149
    :cond_3
    move/from16 v16, v1

    .line 150
    .line 151
    :cond_4
    if-eqz v10, :cond_5

    .line 152
    .line 153
    invoke-direct {v11, v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->looksLikeUser(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_5

    .line 158
    .line 159
    invoke-virtual {v11, v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toProfileRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-eqz v1, :cond_5

    .line 164
    .line 165
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    const-string v11, "hit root user="

    .line 186
    .line 187
    invoke-static {v11, v2, v4, v7, v6}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2, v9, v5, v10}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/4 v7, 0x4

    .line 196
    const/4 v9, 0x0

    .line 197
    invoke-static {v8, v2, v9, v7, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-nez v2, :cond_5

    .line 209
    .line 210
    return-object v1

    .line 211
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 212
    .line 213
    move/from16 v1, v16

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_6
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 218
    .line 219
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 220
    .line 221
    .line 222
    array-length v2, v0

    .line 223
    const/4 v3, 0x0

    .line 224
    :goto_3
    if-ge v3, v2, :cond_9

    .line 225
    .line 226
    aget-object v7, v0, v3

    .line 227
    .line 228
    const/4 v9, 0x0

    .line 229
    invoke-static {v1, v7, v9}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->findProfileRecordFromRoots$dfs(Ljava/util/IdentityHashMap;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    if-nez v7, :cond_7

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_7
    sget-object v10, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;

    .line 237
    .line 238
    invoke-virtual {v10, v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->toProfileRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    if-eqz v10, :cond_8

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getSecUid()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getNickname()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    const-string v14, "hit dfs user="

    .line 265
    .line 266
    invoke-static {v14, v7, v4, v11, v6}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-static {v7, v12, v5, v13}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    const/4 v11, 0x4

    .line 275
    const/4 v12, 0x0

    .line 276
    invoke-static {v8, v7, v12, v11, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uniqueKey()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    if-nez v7, :cond_8

    .line 288
    .line 289
    return-object v10

    .line 290
    :cond_8
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_9
    new-instance v1, Lli1;

    .line 294
    .line 295
    const/4 v2, 0x5

    .line 296
    invoke-direct {v1, v2}, Lli1;-><init>(I)V

    .line 297
    .line 298
    .line 299
    const/16 v2, 0x1f

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    invoke-static {v0, v9, v9, v1, v2}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v1, "no profile record from roots="

    .line 307
    .line 308
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const/4 v7, 0x4

    .line 313
    invoke-static {v8, v0, v9, v7, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object v9
.end method

.method public final toAwemeItem(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "getAwemeId"

    .line 5
    .line 6
    const-string v1, "getGroupId"

    .line 7
    .line 8
    const-string v2, "getAid"

    .line 9
    .line 10
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "awemeId"

    .line 15
    .line 16
    const-string v2, "groupId"

    .line 17
    .line 18
    const-string v3, "aid"

    .line 19
    .line 20
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const-string v0, "getDesc"

    .line 33
    .line 34
    const-string v1, "getDescription"

    .line 35
    .line 36
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "desc"

    .line 41
    .line 42
    const-string v2, "description"

    .line 43
    .line 44
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, ""

    .line 55
    .line 56
    :cond_1
    move-object v4, v0

    .line 57
    const-string v0, "getCreateTime"

    .line 58
    .line 59
    const-string v1, "getCreateTimeStamp"

    .line 60
    .line 61
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "createTimestamp"

    .line 66
    .line 67
    const-string v2, "createTimeStamp"

    .line 68
    .line 69
    const-string v5, "createTime"

    .line 70
    .line 71
    filled-new-array {v5, v1, v2}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {p0, p1, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getLongByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide p0

    .line 85
    :goto_0
    move-wide v5, p0

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const-wide/16 p0, 0x0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :goto_1
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 91
    .line 92
    const/16 v8, 0x8

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    invoke-direct/range {v2 .. v9}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILzq;)V

    .line 97
    .line 98
    .line 99
    return-object v2
.end method

.method public final toProfileRecord(Ljava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "getUid"

    .line 9
    .line 10
    const-string v3, "getUserId"

    .line 11
    .line 12
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "userId"

    .line 17
    .line 18
    const-string v4, "user_id"

    .line 19
    .line 20
    const-string v5, "uid"

    .line 21
    .line 22
    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v0, v1, v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, ""

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    move-object v5, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v5, v2

    .line 37
    :goto_0
    const-string v2, "getSecUid"

    .line 38
    .line 39
    const-string v4, "getSecUserId"

    .line 40
    .line 41
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, "sec_user_id"

    .line 46
    .line 47
    const-string v6, "secUserId"

    .line 48
    .line 49
    const-string v7, "secUid"

    .line 50
    .line 51
    filled-new-array {v7, v4, v6}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-direct {v0, v1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    move-object v6, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v6, v2

    .line 64
    :goto_1
    const-string v2, "getUniqueId"

    .line 65
    .line 66
    const-string v4, "getShortId"

    .line 67
    .line 68
    const-string v7, "getNickname"

    .line 69
    .line 70
    const-string v8, "getNickName"

    .line 71
    .line 72
    filled-new-array {v7, v8, v2, v4}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v4, "uniqueId"

    .line 77
    .line 78
    const-string v7, "shortId"

    .line 79
    .line 80
    const-string v8, "nickname"

    .line 81
    .line 82
    const-string v9, "nickName"

    .line 83
    .line 84
    filled-new-array {v8, v9, v4, v7}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-direct {v0, v1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-nez v2, :cond_2

    .line 93
    .line 94
    move-object v7, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    move-object v7, v2

    .line 97
    :goto_2
    const-string v2, "getSignature"

    .line 98
    .line 99
    filled-new-array {v2}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const-string v4, "signature"

    .line 104
    .line 105
    const-string v8, "signatureExtra"

    .line 106
    .line 107
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-direct {v0, v1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_3

    .line 116
    .line 117
    move-object v8, v3

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move-object v8, v2

    .line 120
    :goto_3
    const-string v2, "getAvatarMedium"

    .line 121
    .line 122
    const-string v4, "getAvatarThumb"

    .line 123
    .line 124
    const-string v9, "getAvatarUrl"

    .line 125
    .line 126
    filled-new-array {v9, v2, v4}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v4, "avatarMedium"

    .line 131
    .line 132
    const-string v9, "avatarThumb"

    .line 133
    .line 134
    const-string v10, "avatarUrl"

    .line 135
    .line 136
    filled-new-array {v10, v4, v9}, [Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-direct {v0, v1, v2, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->getStringByNames(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-nez v0, :cond_4

    .line 145
    .line 146
    move-object v9, v3

    .line 147
    goto :goto_4

    .line 148
    :cond_4
    move-object v9, v0

    .line 149
    :goto_4
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    return-object v0

    .line 163
    :cond_5
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 164
    .line 165
    const v23, 0xffe0

    .line 166
    .line 167
    .line 168
    const/16 v24, 0x0

    .line 169
    .line 170
    const/4 v10, 0x0

    .line 171
    const/4 v11, 0x0

    .line 172
    const-wide/16 v12, 0x0

    .line 173
    .line 174
    const-wide/16 v14, 0x0

    .line 175
    .line 176
    const/16 v16, 0x0

    .line 177
    .line 178
    const/16 v17, 0x0

    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    const/16 v19, 0x0

    .line 183
    .line 184
    const/16 v20, 0x0

    .line 185
    .line 186
    const/16 v21, 0x0

    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    invoke-direct/range {v4 .. v24}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    .line 191
    .line 192
    .line 193
    return-object v4
.end method
