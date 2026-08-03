.class public abstract Lbsh/BshLambda;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/BshLambda$ByteClassLoader;,
        Lbsh/BshLambda$BshLambdaFromLambdaExpression;,
        Lbsh/BshLambda$BshLambdaFromMethodReference;,
        Lbsh/BshLambda$WrapperGenerator;
    }
.end annotation


# static fields
.field private static final byteClassLoader:Lbsh/BshLambda$ByteClassLoader;

.field private static volatile dummyTypeCount:I

.field private static final dummyTypesLambdas:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lbsh/BshLambda;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static fiClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected final dummyType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected final expressionNode:Lbsh/Node;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/BshLambda$ByteClassLoader;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbsh/BshLambda$ByteClassLoader;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbsh/BshLambda;->byteClassLoader:Lbsh/BshLambda$ByteClassLoader;

    .line 8
    .line 9
    new-instance v0, Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbsh/BshLambda;->dummyTypesLambdas:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    sput v0, Lbsh/BshLambda;->dummyTypeCount:I

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lbsh/BshLambda;->fiClasses:Ljava/util/Map;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>(Lbsh/Node;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 5
    .line 6
    invoke-static {}, Lbsh/BshLambda;->generateDummyType()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lbsh/BshLambda;->dummyType:Ljava/lang/Class;

    .line 11
    .line 12
    sget-object v0, Lbsh/BshLambda;->dummyTypesLambdas:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lbsh/Node;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lbsh/BshLambda;-><init>(Lbsh/Node;)V

    return-void
.end method

.method public static synthetic a(Lbsh/BshLambda;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lbsh/BshLambda;->lambda$convertTo$0(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic b()Lbsh/BshLambda$ByteClassLoader;
    .locals 1

    .line 1
    sget-object v0, Lbsh/BshLambda;->byteClassLoader:Lbsh/BshLambda$ByteClassLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public static fromLambdaExpression(Lbsh/Node;Lbsh/NameSpace;[Lbsh/Modifiers;[Ljava/lang/Class;[Ljava/lang/String;Lbsh/Node;)Lbsh/BshLambda;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/Node;",
            "Lbsh/NameSpace;",
            "[",
            "Lbsh/Modifiers;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            "Lbsh/Node;",
            ")",
            "Lbsh/BshLambda;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lbsh/BshLambda$BshLambdaFromLambdaExpression;-><init>(Lbsh/Node;Lbsh/NameSpace;[Lbsh/Modifiers;[Ljava/lang/Class;[Ljava/lang/String;Lbsh/Node;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static fromMethodReference(Lbsh/Node;Ljava/lang/Object;Ljava/lang/String;)Lbsh/BshLambda;
    .locals 1

    .line 1
    new-instance v0, Lbsh/BshLambda$BshLambdaFromMethodReference;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lbsh/BshLambda$BshLambdaFromMethodReference;-><init>(Lbsh/Node;Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static generateDummyType()Ljava/lang/Class;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lbsh/BshLambda;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "Type"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    sget v1, Lbsh/BshLambda;->dummyTypeCount:I

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    sput v2, Lbsh/BshLambda;->dummyTypeCount:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lbsh/org/objectweb/asm/ClassWriter;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v1, v2}, Lbsh/org/objectweb/asm/ClassWriter;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v2, "."

    .line 40
    .line 41
    const-string v3, "/"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v6, "java/lang/Object"

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const/16 v2, 0x34

    .line 51
    .line 52
    const/16 v3, 0x601

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-virtual/range {v1 .. v7}, Lbsh/org/objectweb/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/ClassWriter;->visitEnd()V

    .line 59
    .line 60
    .line 61
    sget-object v2, Lbsh/BshLambda;->byteClassLoader:Lbsh/BshLambda$ByteClassLoader;

    .line 62
    .line 63
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/ClassWriter;->toByteArray()[B

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v0, v1}, Lbsh/BshLambda$ByteClassLoader;->classFromBytes(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method

.method public static getClassForFI(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lbsh/BshLambda;->fiClasses:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lbsh/BshLambda;->fiClasses:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Class;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {p0}, Lbsh/BshLambda$WrapperGenerator;->generateClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lbsh/BshLambda;->fiClasses:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;I)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lbsh/BshLambda;->methodFromFI(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lbsh/BshLambda;->dummyTypesLambdas:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v2, p0, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lbsh/BshLambda;

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lbsh/BshLambda;->isAssignable(Ljava/lang/reflect/Method;I)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method private synthetic lambda$convertTo$0(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    if-ne v0, v1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, -0x1

    .line 23
    sparse-switch v1, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :sswitch_0
    const-string v1, "hashCode"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    goto :goto_0

    .line 38
    :sswitch_1
    const-string v1, "equals"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v4, v3

    .line 48
    goto :goto_0

    .line 49
    :sswitch_2
    const-string v1, "toString"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v4, v2

    .line 59
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :pswitch_0
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :pswitch_1
    if-eqz p3, :cond_3

    .line 73
    .line 74
    array-length p2, p3

    .line 75
    if-ne p2, v3, :cond_3

    .line 76
    .line 77
    aget-object p2, p3, v2

    .line 78
    .line 79
    if-ne p1, p2, :cond_3

    .line 80
    .line 81
    move v2, v3

    .line 82
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :pswitch_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string p2, "BshLambdaProxy["

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p2, "]"

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    sget-object p3, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

    .line 111
    .line 112
    :goto_2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p0, p3, p1, p2}, Lbsh/BshLambda;->invoke([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_2
        -0x4d378041 -> :sswitch_1
        0x8cdac1b -> :sswitch_0
    .end sparse-switch

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static methodFromFI(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v3}, Lbsh/Types;->isObjectClassMethod(Ljava/lang/reflect/Method;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    return-object v3

    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "This class isn\'t a valid Functional Interface: "

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method


# virtual methods
.method public convertTo(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshLambda;->dummyType:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v0, p1, v1}, Lbsh/BshLambda;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, Lbsh/d;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lbsh/d;-><init>(Lbsh/BshLambda;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p1, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    new-instance v0, Lbsh/UtilEvalError;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "Can\'t create a instance for the generate class for the BshLambda: "

    .line 38
    .line 39
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_0
    new-instance v0, Lbsh/UtilEvalError;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v1, "This BshLambda can\'t be converted to "

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final invoke([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "Can\'t assign "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/Class;->isPrimitive()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lbsh/BshLambda;->invokeImpl([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :catch_1
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :catch_2
    move-exception p1

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/BshLambda;->invokeImpl([Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;
    :try_end_0
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    if-ne p3, v2, :cond_1

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    const/4 v2, 0x1

    .line 35
    :try_start_1
    invoke-static {p1, p3, v2}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    return-object p1

    .line 44
    :catchall_0
    :try_start_2
    invoke-static {p1}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lbsh/Types;->prettyName(Ljava/lang/Class;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p3}, Lbsh/Types;->prettyName(Ljava/lang/Class;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, " to "

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p3, Lbsh/RuntimeEvalError;

    .line 77
    .line 78
    iget-object v0, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 79
    .line 80
    invoke-direct {p3, p1, v0, v1}, Lbsh/RuntimeEvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 81
    .line 82
    .line 83
    throw p3
    :try_end_2
    .catch Lbsh/TargetError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/UtilEvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 84
    :goto_1
    new-instance p2, Lbsh/RuntimeEvalError;

    .line 85
    .line 86
    iget-object p3, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 87
    .line 88
    invoke-virtual {p1, p3, v1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p2, p1}, Lbsh/RuntimeEvalError;-><init>(Lbsh/EvalError;)V

    .line 93
    .line 94
    .line 95
    throw p2

    .line 96
    :goto_2
    new-instance p2, Lbsh/RuntimeEvalError;

    .line 97
    .line 98
    new-instance p3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v0, "Can\'t invoke lambda: "

    .line 101
    .line 102
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    iget-object v0, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 117
    .line 118
    invoke-direct {p2, p3, v0, v1, p1}, Lbsh/RuntimeEvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw p2

    .line 122
    :goto_3
    array-length p3, p2

    .line 123
    const/4 v0, 0x0

    .line 124
    :goto_4
    if-ge v0, p3, :cond_3

    .line 125
    .line 126
    aget-object v2, p2, v0

    .line 127
    .line 128
    invoke-virtual {p1}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_2

    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_2
    invoke-virtual {p1}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    throw p1

    .line 146
    :cond_3
    new-instance p2, Lbsh/RuntimeEvalError;

    .line 147
    .line 148
    new-instance p3, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v0, "Can\'t invoke lambda: Unexpected Exception: "

    .line 151
    .line 152
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    iget-object v0, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 171
    .line 172
    invoke-virtual {p1}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p2, p3, v0, v1, p1}, Lbsh/RuntimeEvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw p2
.end method

.method public abstract invokeImpl([Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract isAssignable(Ljava/lang/reflect/Method;I)Z
.end method
