.class final Lbsh/BshClassManager$MemberCache;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/BshClassManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MemberCache"
.end annotation


# instance fields
.field private final cache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lbsh/Invocable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/Invocable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/BshClassManager$MemberCache;->cache:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/BshClassManager$MemberCache;->fields:Ljava/util/Map;

    .line 17
    .line 18
    move-object v0, p1

    .line 19
    :goto_0
    if-eqz v0, :cond_c

    .line 20
    .line 21
    invoke-static {v0}, Lbsh/Reflect;->isPackageAccessible(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_b

    .line 26
    .line 27
    invoke-static {v0}, Lbsh/Reflect;->isPackageScope(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, Lbsh/Reflect;->isPrivate(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-static {v0}, Lbsh/Reflect;->isPublic(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-static {}, Lbsh/Capabilities;->haveAccessibility()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_b

    .line 50
    .line 51
    :cond_1
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v1, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lbsh/BshClassManager$MemberCache;

    .line 62
    .line 63
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    array-length v3, v2

    .line 68
    const/4 v4, 0x0

    .line 69
    move v5, v4

    .line 70
    :goto_2
    if-ge v5, v3, :cond_5

    .line 71
    .line 72
    aget-object v6, v2, v5

    .line 73
    .line 74
    invoke-static {v6}, Lbsh/Reflect;->isPublic(Ljava/lang/reflect/Member;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    invoke-static {}, Lbsh/Capabilities;->haveAccessibility()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    :cond_3
    invoke-static {v6}, Lbsh/Invocable;->get(Ljava/lang/reflect/Field;)Lbsh/FieldAccess;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-direct {p0, v6}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/FieldAccess;)Z

    .line 91
    .line 92
    .line 93
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    array-length v3, v2

    .line 101
    move v5, v4

    .line 102
    :goto_3
    if-ge v5, v3, :cond_9

    .line 103
    .line 104
    aget-object v6, v2, v5

    .line 105
    .line 106
    invoke-static {v6}, Lbsh/Reflect;->isPublic(Ljava/lang/reflect/Member;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-nez v7, :cond_6

    .line 111
    .line 112
    invoke-static {}, Lbsh/Capabilities;->haveAccessibility()Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_8

    .line 117
    .line 118
    :cond_6
    if-ne p1, v0, :cond_7

    .line 119
    .line 120
    invoke-static {v6}, Lbsh/Invocable;->get(Ljava/lang/reflect/Method;)Lbsh/Invocable;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-direct {p0, v6}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/Invocable;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-virtual {v1, v7, v6}, Lbsh/BshClassManager$MemberCache;->findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/Invocable;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-direct {p0, v6}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/Invocable;)Z

    .line 141
    .line 142
    .line 143
    :cond_8
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    array-length v3, v2

    .line 151
    :goto_5
    if-ge v4, v3, :cond_b

    .line 152
    .line 153
    aget-object v5, v2, v4

    .line 154
    .line 155
    if-ne p1, v0, :cond_a

    .line 156
    .line 157
    invoke-static {v5}, Lbsh/Invocable;->get(Ljava/lang/reflect/Constructor;)Lbsh/Invocable;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-direct {p0, v5}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/Invocable;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_a
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v1, v6, v5}, Lbsh/BshClassManager$MemberCache;->findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/Invocable;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-direct {p0, v5}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/Invocable;)Z

    .line 178
    .line 179
    .line 180
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {p0, v1}, Lbsh/BshClassManager$MemberCache;->processInterfaces([Ljava/lang/Class;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    return-void
.end method

.method private cacheMember(Lbsh/FieldAccess;)Z
    .locals 3

    .line 87
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbsh/BshClassManager$MemberCache;->hasField(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->fields:Ljava/util/Map;

    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method private cacheMember(Lbsh/Invocable;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lbsh/Invocable;->isGetter()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lbsh/Invocable;->isSetter()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0, p1}, Lbsh/BshClassManager$MemberCache;->cacheMember(Ljava/lang/String;Lbsh/Invocable;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_1
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "[gs]et|is"

    .line 31
    .line 32
    const-string v3, ""

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x1

    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v3}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    aget-char v3, v2, v0

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    aput-char v3, v2, v0

    .line 66
    .line 67
    new-instance v3, Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([C)V

    .line 70
    .line 71
    .line 72
    move-object v2, v3

    .line 73
    :cond_3
    invoke-direct {p0, v1, p1}, Lbsh/BshClassManager$MemberCache;->cacheMember(Ljava/lang/String;Lbsh/Invocable;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-direct {p0, v2, p1}, Lbsh/BshClassManager$MemberCache;->cacheMember(Ljava/lang/String;Lbsh/Invocable;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    return v4

    .line 86
    :cond_4
    return v0
.end method

.method private cacheMember(Ljava/lang/String;Lbsh/Invocable;)Z
    .locals 3

    .line 89
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasMember(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 90
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->cache:Ljava/util/Map;

    .line 91
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 92
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 93
    :cond_1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->memberCount(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 94
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->cache:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private findBest(Ljava/util/List;[Ljava/lang/Class;)Lbsh/Invocable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbsh/Invocable;",
            ">;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/Invocable;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lbsh/Invocable;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    invoke-static {p2, p1}, Lbsh/Reflect;->findMostSpecificInvocable([Ljava/lang/Class;Ljava/util/List;)Lbsh/Invocable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private processInterfaces([Ljava/lang/Class;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_4

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-static {v3}, Lbsh/Reflect;->isPackageAccessible(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-eqz v4, :cond_3

    .line 13
    .line 14
    sget-object v4, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 15
    .line 16
    invoke-virtual {v4, v3}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Lbsh/BshClassManager$MemberCache;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    array-length v6, v5

    .line 27
    move v7, v1

    .line 28
    :goto_1
    if-ge v7, v6, :cond_0

    .line 29
    .line 30
    aget-object v8, v5, v7

    .line 31
    .line 32
    invoke-static {v8}, Lbsh/Invocable;->get(Ljava/lang/reflect/Field;)Lbsh/FieldAccess;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-direct {p0, v8}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/FieldAccess;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    array-length v6, v5

    .line 47
    move v7, v1

    .line 48
    :goto_2
    if-ge v7, v6, :cond_3

    .line 49
    .line 50
    aget-object v8, v5, v7

    .line 51
    .line 52
    invoke-static {v8}, Lbsh/Reflect;->isPublic(Ljava/lang/reflect/Member;)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-nez v9, :cond_1

    .line 57
    .line 58
    invoke-static {}, Lbsh/Capabilities;->haveAccessibility()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_2

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v4, v9, v8}, Lbsh/BshClassManager$MemberCache;->findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/Invocable;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-direct {p0, v8}, Lbsh/BshClassManager$MemberCache;->cacheMember(Lbsh/Invocable;)Z

    .line 77
    .line 78
    .line 79
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-direct {p0, v3}, Lbsh/BshClassManager$MemberCache;->processInterfaces([Ljava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    return-void
.end method


# virtual methods
.method public findField(Ljava/lang/String;)Lbsh/Invocable;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasField(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->fields:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lbsh/Invocable;

    .line 16
    .line 17
    return-object p1
.end method

.method public findGetter(Ljava/lang/String;)Lbsh/Invocable;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasMember(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lbsh/Invocable;

    .line 26
    .line 27
    invoke-virtual {v0}, Lbsh/Invocable;->isGetter()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public findMemberIndex(Ljava/lang/String;[Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2, p1}, Lbsh/Reflect;->findMostSpecificInvocableIndex([Ljava/lang/Class;Ljava/util/List;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public varargs findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/Invocable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/Invocable;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasMember(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1, p2}, Lbsh/BshClassManager$MemberCache;->findBest(Ljava/util/List;[Ljava/lang/Class;)Lbsh/Invocable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public varargs findMethod(Ljava/lang/String;[Ljava/lang/Object;)Lbsh/Invocable;
    .locals 0

    .line 18
    invoke-static {p2}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbsh/BshClassManager$MemberCache;->findMethod(Ljava/lang/String;[Ljava/lang/Class;)Lbsh/Invocable;

    move-result-object p1

    return-object p1
.end method

.method public findSetter(Ljava/lang/String;)Lbsh/Invocable;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasMember(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lbsh/Invocable;

    .line 26
    .line 27
    invoke-virtual {v0}, Lbsh/Invocable;->isSetter()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public findStaticMethod(Ljava/lang/String;)Lbsh/Invocable;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->hasMember(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lbsh/a;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lbsh/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lbsh/Invocable;

    .line 36
    .line 37
    return-object p1
.end method

.method public hasField(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->fields:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public hasMember(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->cache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public memberCount(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/BshClassManager$MemberCache;->members(Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public members(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lbsh/Invocable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager$MemberCache;->cache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    return-object p1
.end method
