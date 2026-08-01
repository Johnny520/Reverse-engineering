.class final enum Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation$1;
.super Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bind/annotation/Super$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public proxyFor(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/implementation/Implementation$Target;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/implementation/bind/annotation/Super;",
            ">;)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    .line 1
    const-string p0, "Failed to resolve constructor specified by "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v2, Lnet/bytebuddy/implementation/bind/annotation/Super$ConstructorResolver;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-class v2, Ljava/lang/Class;

    .line 23
    .line 24
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lnet/bytebuddy/implementation/bind/annotation/Super$ConstructorResolver;

    .line 39
    .line 40
    invoke-static {}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->access$200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {p3, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-class v3, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v0, p1, v2}, Lnet/bytebuddy/implementation/bind/annotation/Super$ConstructorResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 61
    .line 62
    .line 63
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    new-instance v3, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;

    .line 65
    .line 66
    invoke-static {}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->access$300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {p3, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-class v0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-static {}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->access$400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-interface {p3, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    move-object v4, p1

    .line 105
    move-object v6, p2

    .line 106
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/implementation/Implementation$Target;ZZ)V

    .line 107
    .line 108
    .line 109
    return-object v3

    .line 110
    :catch_0
    move-exception v0

    .line 111
    move-object p1, v0

    .line 112
    goto :goto_0

    .line 113
    :catch_1
    move-exception v0

    .line 114
    move-object p1, v0

    .line 115
    goto :goto_1

    .line 116
    :catch_2
    move-exception v0

    .line 117
    move-object p0, v0

    .line 118
    goto :goto_2

    .line 119
    :goto_0
    invoke-static {p0, p3, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    return-object v1

    .line 123
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p0, p1}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :goto_2
    invoke-static {}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-interface {p3, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-class p2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 152
    .line 153
    invoke-interface {p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 158
    .line 159
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string p2, "No default constructor specified by "

    .line 164
    .line 165
    invoke-static {p2, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    return-object v1
.end method
