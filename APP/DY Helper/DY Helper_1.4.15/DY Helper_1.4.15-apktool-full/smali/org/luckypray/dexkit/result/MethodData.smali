.class public final Lorg/luckypray/dexkit/result/MethodData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/MethodData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

.field public static final ACC_DECLARED_SYNCHRONIZED:I = 0x20000


# instance fields
.field private final annotations$delegate:Loq0;

.field private final callers$delegate:Loq0;

.field private final classId:I

.field private final declaredClass$delegate:Loq0;

.field private final descriptor:Ljava/lang/String;

.field private final dexMethod$delegate:Loq0;

.field private final invokes$delegate:Loq0;

.field private final modifiers:I

.field private final opCodes$delegate:Loq0;

.field private final paramAnnotations$delegate:Loq0;

.field private final paramNames$delegate:Loq0;

.field private final paramTypeIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final paramTypes$delegate:Loq0;

.field private final returnType$delegate:Loq0;

.field private final returnTypeId:I

.field private final usingFields$delegate:Loq0;

.field private final usingStrings$delegate:Loq0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/MethodData$-Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/luckypray/dexkit/DexKitBridge;",
            "IIII",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lorg/luckypray/dexkit/result/MethodData;->classId:I

    .line 5
    .line 6
    iput p5, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    .line 7
    .line 8
    iput-object p6, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lorg/luckypray/dexkit/result/MethodData;->returnTypeId:I

    .line 11
    .line 12
    iput-object p8, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    .line 13
    .line 14
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$dexMethod$2;

    .line 15
    .line 16
    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/MethodData$dexMethod$2;-><init>(Lorg/luckypray/dexkit/result/MethodData;)V

    .line 17
    .line 18
    .line 19
    new-instance p5, Lh22;

    .line 20
    .line 21
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 22
    .line 23
    .line 24
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->dexMethod$delegate:Loq0;

    .line 25
    .line 26
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;

    .line 27
    .line 28
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$declaredClass$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    .line 29
    .line 30
    .line 31
    new-instance p5, Lh22;

    .line 32
    .line 33
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 34
    .line 35
    .line 36
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->declaredClass$delegate:Loq0;

    .line 37
    .line 38
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$returnType$2;

    .line 39
    .line 40
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$returnType$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    .line 41
    .line 42
    .line 43
    new-instance p5, Lh22;

    .line 44
    .line 45
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 46
    .line 47
    .line 48
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->returnType$delegate:Loq0;

    .line 49
    .line 50
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;

    .line 51
    .line 52
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/MethodData$paramTypes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;I)V

    .line 53
    .line 54
    .line 55
    new-instance p5, Lh22;

    .line 56
    .line 57
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 58
    .line 59
    .line 60
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypes$delegate:Loq0;

    .line 61
    .line 62
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramNames$2;

    .line 63
    .line 64
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$paramNames$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 65
    .line 66
    .line 67
    new-instance p5, Lh22;

    .line 68
    .line 69
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 70
    .line 71
    .line 72
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->paramNames$delegate:Loq0;

    .line 73
    .line 74
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$annotations$2;

    .line 75
    .line 76
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 77
    .line 78
    .line 79
    new-instance p5, Lh22;

    .line 80
    .line 81
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 82
    .line 83
    .line 84
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->annotations$delegate:Loq0;

    .line 85
    .line 86
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$paramAnnotations$2;

    .line 87
    .line 88
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$paramAnnotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 89
    .line 90
    .line 91
    new-instance p5, Lh22;

    .line 92
    .line 93
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 94
    .line 95
    .line 96
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->paramAnnotations$delegate:Loq0;

    .line 97
    .line 98
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$opCodes$2;

    .line 99
    .line 100
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$opCodes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 101
    .line 102
    .line 103
    new-instance p5, Lh22;

    .line 104
    .line 105
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 106
    .line 107
    .line 108
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->opCodes$delegate:Loq0;

    .line 109
    .line 110
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$callers$2;

    .line 111
    .line 112
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$callers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 113
    .line 114
    .line 115
    new-instance p5, Lh22;

    .line 116
    .line 117
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 118
    .line 119
    .line 120
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->callers$delegate:Loq0;

    .line 121
    .line 122
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$invokes$2;

    .line 123
    .line 124
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$invokes$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 125
    .line 126
    .line 127
    new-instance p5, Lh22;

    .line 128
    .line 129
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 130
    .line 131
    .line 132
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->invokes$delegate:Loq0;

    .line 133
    .line 134
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$usingStrings$2;

    .line 135
    .line 136
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$usingStrings$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 137
    .line 138
    .line 139
    new-instance p5, Lh22;

    .line 140
    .line 141
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 142
    .line 143
    .line 144
    iput-object p5, p0, Lorg/luckypray/dexkit/result/MethodData;->usingStrings$delegate:Loq0;

    .line 145
    .line 146
    new-instance p4, Lorg/luckypray/dexkit/result/MethodData$usingFields$2;

    .line 147
    .line 148
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/MethodData$usingFields$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/MethodData;II)V

    .line 149
    .line 150
    .line 151
    new-instance p1, Lh22;

    .line 152
    .line 153
    invoke-direct {p1, p4}, Lh22;-><init>(Lp70;)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Lorg/luckypray/dexkit/result/MethodData;->usingFields$delegate:Loq0;

    .line 157
    .line 158
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;Lzq;)V
    .locals 0

    .line 159
    invoke-direct/range {p0 .. p8}, Lorg/luckypray/dexkit/result/MethodData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getClassId$p(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->classId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/MethodData;II)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$getParamTypeIds$p(Lorg/luckypray/dexkit/result/MethodData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getReturnTypeId$p(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->returnTypeId:I

    .line 2
    .line 3
    return p0
.end method

.method private final getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->dexMethod$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/MethodData;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lorg/luckypray/dexkit/result/MethodData;

    .line 10
    .line 11
    iget-object p1, p1, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->annotations$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getCallers()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->callers$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
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
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 0
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/wrap/DexMethod;->getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final getDeclaredClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->declaredClass$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInvokes()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->invokes$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final getMethodName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getMethodSign()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getOpCodes()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->opCodes$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getOpNames()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getOpCodes()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Lorg/luckypray/dexkit/util/OpCodeUtil;->getOpFormat(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final getParamAnnotations()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramAnnotations$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getParamCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypeIds:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getParamNames()Ljava/util/List;
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
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramNames$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getParamTypes()Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->paramTypes$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getReturnType()Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->returnType$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getReturnTypeInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
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
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getReturnTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getReturnTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getUsingFields()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/UsingFieldData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->usingFields$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getUsingStrings()Ljava/util/List;
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
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->usingStrings$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/MethodData;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isConstructor()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isMethod()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isMethod()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isStaticInitializer()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isStaticInitializer()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDexMethod()Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lorg/luckypray/dexkit/result/MethodData;->modifiers:I

    .line 7
    .line 8
    const-string v2, " "

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, "."

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "("

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypeNames()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const/4 v7, 0x0

    .line 73
    const/16 v8, 0x3e

    .line 74
    .line 75
    const-string v3, ", "

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-static/range {v2 .. v8}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string v1, ")"

    .line 85
    .line 86
    invoke-static {v0, p0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
