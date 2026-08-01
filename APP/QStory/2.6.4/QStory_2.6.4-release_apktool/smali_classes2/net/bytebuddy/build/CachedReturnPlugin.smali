.class public Lnet/bytebuddy/build/CachedReturnPlugin;
.super Lnet/bytebuddy/build/Plugin$ForElementMatcher;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/CachedReturnPlugin$CacheFieldOffsetMapping;,
        Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;,
        Lnet/bytebuddy/build/CachedReturnPlugin$CacheField;,
        Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ENHANCE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final NAME_INFIX:Ljava/lang/String; = "_"


# instance fields
.field private final ignoreExistingFields:Z

.field private final randomString:Lnet/bytebuddy/utility/RandomString;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->IGNORE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "value"

    .line 12
    .line 13
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 22
    .line 23
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    sput-object v0, Lnet/bytebuddy/build/CachedReturnPlugin;->ENHANCE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/CachedReturnPlugin;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->ignoreExistingFields:Z

    .line 15
    .line 16
    new-instance p1, Lnet/bytebuddy/utility/RandomString;

    .line 17
    .line 18
    invoke-direct {p1}, Lnet/bytebuddy/utility/RandomString;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->randomString:Lnet/bytebuddy/utility/RandomString;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isBridge()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;

    .line 14
    .line 15
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p3, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    check-cast p3, Lnet/bytebuddy/description/method/MethodList;

    .line 28
    .line 29
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_7

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 44
    .line 45
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    if-nez v2, :cond_6

    .line 51
    .line 52
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-interface {v2, v4}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v3, Lnet/bytebuddy/build/CachedReturnPlugin;->ENHANCE_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 83
    .line 84
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-class v3, Ljava/lang/String;

    .line 89
    .line 90
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_0

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v3, "_"

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->randomString:Lnet/bytebuddy/utility/RandomString;

    .line 120
    .line 121
    invoke-virtual {v3}, Lnet/bytebuddy/utility/RandomString;->nextString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    goto :goto_1

    .line 133
    :cond_0
    iget-boolean v3, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->ignoreExistingFields:Z

    .line 134
    .line 135
    if-eqz v3, :cond_1

    .line 136
    .line 137
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, Lnet/bytebuddy/description/field/FieldList;

    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_1

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_1
    :goto_1
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_2

    .line 171
    .line 172
    sget-object v4, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_2
    sget-object v4, Lnet/bytebuddy/description/modifier/Ownership;->MEMBER:Lnet/bytebuddy/description/modifier/Ownership;

    .line 176
    .line 177
    :goto_2
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_3

    .line 182
    .line 183
    sget-object v5, Lnet/bytebuddy/description/modifier/FieldPersistence;->PLAIN:Lnet/bytebuddy/description/modifier/FieldPersistence;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_3
    sget-object v5, Lnet/bytebuddy/description/modifier/FieldPersistence;->TRANSIENT:Lnet/bytebuddy/description/modifier/FieldPersistence;

    .line 187
    .line 188
    :goto_3
    const/4 v6, 0x4

    .line 189
    new-array v6, v6, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    aput-object v4, v6, v7

    .line 193
    .line 194
    const/4 v4, 0x1

    .line 195
    aput-object v5, v6, v4

    .line 196
    .line 197
    sget-object v4, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 198
    .line 199
    const/4 v5, 0x2

    .line 200
    aput-object v4, v6, v5

    .line 201
    .line 202
    sget-object v4, Lnet/bytebuddy/description/modifier/SyntheticState;->SYNTHETIC:Lnet/bytebuddy/description/modifier/SyntheticState;

    .line 203
    .line 204
    const/4 v5, 0x3

    .line 205
    aput-object v4, v6, v5

    .line 206
    .line 207
    invoke-interface {p1, v2, v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v3}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3, v2}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->toAdvice(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v2, v0}, Lnet/bytebuddy/asm/Advice;->on(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_4
    const-string p0, "Cannot cache void result for "

    .line 238
    .line 239
    invoke-static {v0, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object v3

    .line 243
    :cond_5
    const-string p0, "Cannot cache the value of a method with parameters: "

    .line 244
    .line 245
    invoke-static {v0, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-object v3

    .line 249
    :cond_6
    const-string p0, "Cannot cache the value of an abstract method: "

    .line 250
    .line 251
    invoke-static {v0, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object v3

    .line 255
    :cond_7
    :goto_4
    return-object p1
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-boolean p0, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->ignoreExistingFields:Z

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/build/CachedReturnPlugin;

    .line 30
    .line 31
    iget-boolean p1, p1, Lnet/bytebuddy/build/CachedReturnPlugin;->ignoreExistingFields:Z

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/build/Plugin$ForElementMatcher;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-boolean p0, p0, Lnet/bytebuddy/build/CachedReturnPlugin;->ignoreExistingFields:Z

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 0

    .line 1
    return-object p0
.end method
