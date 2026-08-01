.class public Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field private fallbackStrategy:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->fallbackStrategy:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getFallbackInstantiatorStrategy()L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->fallbackStrategy:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public newInstantiatorOf(Ljava/lang/Class;)L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/kryo/util/Util;->isAndroid:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/ConstructorAccess;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0, p1}, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;-><init>(Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;Lcom/esotericsoftware/reflectasm/ConstructorAccess;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 39
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 43
    goto :goto_1

    .line 44
    :catch_1
    :try_start_2
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    :goto_1
    new-instance v1, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;

    .line 53
    .line 54
    invoke-direct {v1, p0, v0, p1}, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;-><init>(Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;Ljava/lang/reflect/Constructor;Ljava/lang/Class;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :catch_2
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->fallbackStrategy:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    if-nez p0, :cond_5

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, "Class cannot be created (non-static member class): "

    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p0

    .line 103
    :cond_3
    :goto_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, "Class cannot be created (missing no-arg constructor): "

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const-string v0, ""

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_4

    .line 137
    .line 138
    const-string p1, "\nNote: This is an anonymous class, which is not serializable by default in Kryo. Possible solutions:\n1. Remove uses of anonymous classes, including double brace initialization, from the containing\nclass. This is the safest solution, as anonymous classes don\'t have predictable names for serialization.\n2. Register a FieldSerializer for the containing class and call FieldSerializer\nsetIgnoreSyntheticFields(false) on it. This is not safe but may be sufficient temporarily."

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    :cond_4
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :cond_5
    invoke-interface {p0, p1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;->newInstantiatorOf(Ljava/lang/Class;)L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0
.end method

.method public setFallbackInstantiatorStrategy(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->fallbackStrategy:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-void
.end method
