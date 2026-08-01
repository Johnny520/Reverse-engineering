.class public Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/auxiliary/TypeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForSuperMethodByConstructor"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final ignoreFinalizer:Z

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final serializableProxy:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/implementation/Implementation$Target;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->ignoreFinalizer:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->serializableProxy:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 6
    .line 7
    sget-object v3, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory$Default;->SUPER_METHOD:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory$Default;

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->ignoreFinalizer:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->serializableProxy:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, Lnet/bytebuddy/implementation/Implementation$Context;->register(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 21
    .line 22
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-array v1, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 31
    .line 32
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 33
    .line 34
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x0

    .line 51
    move v4, v3

    .line 52
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 63
    .line 64
    add-int/lit8 v6, v4, 0x1

    .line 65
    .line 66
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    aput-object v5, v1, v4

    .line 71
    .line 72
    move v4, v6

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 75
    .line 76
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 81
    .line 82
    invoke-direct {v5, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 94
    .line 95
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {v6, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-interface {v1, p0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Lnet/bytebuddy/description/method/MethodList;

    .line 120
    .line 121
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 126
    .line 127
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v6, "target"

    .line 140
    .line 141
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-interface {v0, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lnet/bytebuddy/description/field/FieldList;

    .line 150
    .line 151
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 156
    .line 157
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/4 v6, 0x7

    .line 166
    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 167
    .line 168
    aput-object v4, v6, v3

    .line 169
    .line 170
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 171
    .line 172
    const/4 v4, 0x1

    .line 173
    aput-object v3, v6, v4

    .line 174
    .line 175
    const/4 v4, 0x2

    .line 176
    aput-object v5, v6, v4

    .line 177
    .line 178
    const/4 v4, 0x3

    .line 179
    aput-object p0, v6, v4

    .line 180
    .line 181
    const/4 p0, 0x4

    .line 182
    aput-object v3, v6, p0

    .line 183
    .line 184
    const/4 p0, 0x5

    .line 185
    aput-object v1, v6, p0

    .line 186
    .line 187
    const/4 p0, 0x6

    .line 188
    aput-object v0, v6, p0

    .line 189
    .line 190
    invoke-direct {v2, v6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0
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
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->ignoreFinalizer:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->ignoreFinalizer:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->serializableProxy:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->serializableProxy:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->constructor:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget-boolean v0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->ignoreFinalizer:Z

    .line 33
    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;->serializableProxy:Z

    .line 37
    .line 38
    add-int/2addr v2, p0

    .line 39
    return v2
.end method
