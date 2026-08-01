.class public final Lorg/luckypray/dexkit/wrap/DexMethod;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/DexMethod$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;


# instance fields
.field private final className:Ljava/lang/String;

.field private final methodSign$delegate:Le9;

.field private final name:Ljava/lang/String;

.field private final paramTypeNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final returnTypeName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/wrap/DexMethod;->Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lmd;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lmd;-><init>(Lj5;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:Le9;

    .line 18
    .line 19
    const/4 v0, 0x6

    .line 20
    const-string v1, "->"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {p1, v1, v2, v0}, Lld;->K(Ljava/lang/String;Ljava/lang/String;II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v1, v0, 0x1

    .line 28
    .line 29
    const-string v3, "("

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-static {p1, v3, v1, v4}, Lld;->K(Ljava/lang/String;Ljava/lang/String;II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/lit8 v3, v1, 0x1

    .line 37
    .line 38
    const-string v5, ")"

    .line 39
    .line 40
    invoke-static {p1, v5, v3, v4}, Lld;->K(Ljava/lang/String;Ljava/lang/String;II)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, -0x1

    .line 45
    if-eq v0, v5, :cond_0

    .line 46
    .line 47
    if-eq v1, v5, :cond_0

    .line 48
    .line 49
    if-eq v4, v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iput-object v2, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x2

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getParamTypeNames(Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_0
    new-instance p0, Ljava/lang/IllegalAccessError;

    .line 93
    .line 94
    const-string v0, "not method descriptor: "

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    .line 119
    new-instance v1, Lmd;

    invoke-direct {v1, v0}, Lmd;-><init>(Lj5;)V

    .line 120
    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:Le9;

    .line 121
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 122
    const-string v0, "<init>"

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 123
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 126
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    .line 127
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 128
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 129
    const-string p1, "void"

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    .line 106
    new-instance v1, Lmd;

    invoke-direct {v1, v0}, Lmd;-><init>(Lj5;)V

    .line 107
    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:Le9;

    .line 108
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 109
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 110
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    .line 114
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 115
    :cond_0
    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 116
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getSign(Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getSign()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/wrap/DexMethod;->Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic getMethodInstance$default(Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;
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
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final getSign()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 9
    .line 10
    sget-object v2, Lorg/luckypray/dexkit/wrap/DexMethod$getSign$1$1;->INSTANCE:Lorg/luckypray/dexkit/wrap/DexMethod$getSign$1$1;

    .line 11
    .line 12
    const/16 v3, 0x1e

    .line 13
    .line 14
    const-string v4, ""

    .line 15
    .line 16
    invoke-static {v1, v4, v2, v3}, Lh2;->k2(Ljava/lang/Iterable;Ljava/lang/String;Lu5;I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 14
    .line 15
    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v1, v3}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 44
    .line 45
    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p0, p1}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    return v0

    .line 54
    :cond_2
    return v2
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getConstructorInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance$default(Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0, p2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodSign()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:Le9;

    .line 2
    .line 3
    invoke-interface {p0}, Le9;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParamTypeNames()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReturnTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final isConstructor()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "<init>"

    .line 4
    .line 5
    invoke-static {p0, v0}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isMethod()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isStaticInitializer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final isStaticInitializer()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "<clinit>"

    .line 4
    .line 5
    invoke-static {p0, v0}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public serialize()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "->"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
