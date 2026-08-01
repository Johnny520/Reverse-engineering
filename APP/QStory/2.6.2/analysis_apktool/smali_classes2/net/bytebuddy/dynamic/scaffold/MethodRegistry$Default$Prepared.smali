.class public Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Prepared;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Prepared"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final implementations:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

.field private final methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

.field private final methods:Lnet/bytebuddy/description/method/MethodList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation
.end field

.field private final typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/description/method/MethodList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;",
            ">;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public compile(Lnet/bytebuddy/implementation/Implementation$Target$Factory;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Compiled;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    invoke-interface {v6, v4, v5, v1}, Lnet/bytebuddy/implementation/Implementation$Target$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/implementation/Implementation$Target;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 57
    .line 58
    invoke-virtual {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getHandler()Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v2, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 67
    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 75
    .line 76
    invoke-virtual {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getHandler()Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7, v4}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler;->compile(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 89
    .line 90
    invoke-virtual {v8}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getHandler()Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_0
    move-object v11, v7

    .line 98
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 103
    .line 104
    invoke-virtual {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getAppenderFactory()Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 113
    .line 114
    if-nez v7, :cond_1

    .line 115
    .line 116
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 121
    .line 122
    invoke-virtual {v7}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getAppenderFactory()Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 127
    .line 128
    invoke-interface {v7, v8}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 137
    .line 138
    invoke-virtual {v8}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getAppenderFactory()Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v3, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_1
    move-object v12, v7

    .line 146
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    new-instance v10, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;

    .line 151
    .line 152
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    check-cast v8, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 157
    .line 158
    invoke-virtual {v8}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getMethodDescription()Lnet/bytebuddy/description/method/MethodDescription;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    check-cast v8, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 167
    .line 168
    invoke-virtual {v8}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->resolveBridgeTypes()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    check-cast v8, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 177
    .line 178
    invoke-virtual {v8}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->getVisibility()Lnet/bytebuddy/description/modifier/Visibility;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    check-cast v6, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;

    .line 187
    .line 188
    invoke-virtual {v6}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared$Entry;->isBridgeMethod()Z

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    invoke-direct/range {v10 .. v16}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Set;Lnet/bytebuddy/description/modifier/Visibility;Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v7, v10}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_2
    new-instance v4, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;

    .line 201
    .line 202
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 203
    .line 204
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 205
    .line 206
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 207
    .line 208
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 209
    .line 210
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 211
    .line 212
    invoke-virtual {v1, v0}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-direct/range {v4 .. v10}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/description/method/MethodList;Ljava/util/LinkedHashMap;Z)V

    .line 217
    .line 218
    .line 219
    return-object v4
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    return v0
.end method

.method public getInstrumentedMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$Explicit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/method/MethodList$Explicit;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isTypeInitializer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Lnet/bytebuddy/matcher/FilterableList$AbstractBase;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lnet/bytebuddy/description/method/MethodList;

    .line 30
    .line 31
    return-object p0
.end method

.method public getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeInitializer()Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->implementations:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Prepared;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v2

    .line 57
    return p0
.end method
