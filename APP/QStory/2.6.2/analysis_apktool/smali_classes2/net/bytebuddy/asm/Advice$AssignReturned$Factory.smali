.class public Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final SKIP_ON_DEFAULT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
.field private final exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

.field private final factories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$AssignReturned$AsScalar;

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
    const-string v1, "skipOnDefaultValue"

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
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->SKIP_ON_DEFAULT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Ljava/lang/Enum;

    .line 3
    .line 4
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler$Factory;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler$Factory;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler$Factory;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToReturned$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToReturned$Handler$Factory;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThrown$Handler$Factory;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ToThrown$Handler$Factory;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$NoOp;

    .line 39
    .line 40
    invoke-direct {p0, v0, v1}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;-><init>(Ljava/util/List;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory<",
            "*>;>;",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;",
            ")V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 46
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    return-void
.end method


# virtual methods
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public make(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Z)Lnet/bytebuddy/asm/Advice$PostProcessor;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Z)",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;

    .line 35
    .line 36
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;->getAnnotationType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string p0, "Duplicate registration of handler for "

    .line 52
    .line 53
    invoke-interface {v2}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;->getAnnotationType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v2, 0x1

    .line 71
    const/4 v4, 0x0

    .line 72
    move v9, v2

    .line 73
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_6

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 84
    .line 85
    invoke-interface {v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const-class v7, Lnet/bytebuddy/asm/Advice$AssignReturned$AsScalar;

    .line 90
    .line 91
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    sget-object v4, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->SKIP_ON_DEFAULT_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 98
    .line 99
    invoke-interface {v5, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-class v5, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v4, v5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    move v4, v2

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-interface {v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-interface {v6}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    check-cast v6, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;

    .line 130
    .line 131
    if-eqz v6, :cond_3

    .line 132
    .line 133
    invoke-interface {v6}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;->getAnnotationType()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-interface {v6}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;->getAnnotationType()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-interface {v5, v8}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->prepare(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-interface {v6, p2, p3, v8}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;ZLnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-interface {v1, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-nez v6, :cond_5

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    const-string p0, "Duplicate handler registration for "

    .line 157
    .line 158
    invoke-interface {v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v3

    .line 166
    :cond_6
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    sget-object p0, Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$PostProcessor$NoOp;

    .line 173
    .line 174
    return-object p0

    .line 175
    :cond_7
    if-nez v4, :cond_8

    .line 176
    .line 177
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_8

    .line 182
    .line 183
    new-instance p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ForArray;

    .line 184
    .line 185
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {p1, p2, p0, p3, v0}, Lnet/bytebuddy/asm/Advice$AssignReturned$ForArray;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;ZLjava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :cond_8
    new-instance v5, Lnet/bytebuddy/asm/Advice$AssignReturned$ForScalar;

    .line 196
    .line 197
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    move-object v6, p2

    .line 204
    move v8, p3

    .line 205
    invoke-direct/range {v5 .. v10}, Lnet/bytebuddy/asm/Advice$AssignReturned$ForScalar;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;ZZLjava/util/Collection;)V

    .line 206
    .line 207
    .line 208
    return-object v5
.end method

.method public with(Ljava/lang/Class;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;",
            ">;)",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;"
        }
    .end annotation

    .line 15
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory$Simple;

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory$Simple;-><init>(Ljava/lang/Class;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->with(Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;)Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;

    move-result-object p0

    return-object p0
.end method

.method public varargs with(Ljava/lang/Class;[Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;)Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;[",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;",
            ")",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;"
        }
    .end annotation

    .line 16
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->with(Ljava/lang/Class;Ljava/util/List;)Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory;)Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler$Factory<",
            "*>;)",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v1, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 10
    .line 11
    invoke-direct {v0, p1, p0}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;-><init>(Ljava/util/List;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public withSuppressed(Ljava/lang/Class;)Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;"
        }
    .end annotation

    .line 33
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->withSuppressed(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;

    move-result-object p0

    return-object p0
.end method

.method public withSuppressed(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;->factories:Ljava/util/List;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$Enabled;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$Enabled;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;-><init>(Ljava/util/List;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string p0, " is not a throwable type"

    .line 23
    .line 24
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method
