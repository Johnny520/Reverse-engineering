.class public abstract enum Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "FrameGeneration"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

.field public static final enum DISABLED:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

.field private static final EMPTY:[Ljava/lang/Object;

.field public static final enum EXPAND:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

.field public static final enum GENERATE:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;


# instance fields
.field private final active:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$1;

    .line 2
    .line 3
    const-string v1, "GENERATE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$1;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->GENERATE:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$2;

    .line 13
    .line 14
    const-string v4, "EXPAND"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$2;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EXPAND:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 20
    .line 21
    new-instance v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$3;

    .line 22
    .line 23
    const-string v5, "DISABLED"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v4, v5, v6, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$3;-><init>(Ljava/lang/String;IZ)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->DISABLED:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v3

    .line 37
    .line 38
    aput-object v4, v5, v6

    .line 39
    .line 40
    sput-object v5, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->$VALUES:[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 41
    .line 42
    new-array v0, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    sput-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 45
    .line 46
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->active:Z

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZLnet/bytebuddy/implementation/Implementation$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method private static toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_4

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_4
    :goto_0
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 85
    .line 86
    return-object p0
.end method

.method private static toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 28
    .line 29
    invoke-static {v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    aput-object v2, v0, v1

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->$VALUES:[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v3, v4

    .line 4
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v5

    .line 8
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int v7, v1, v0

    .line 21
    .line 22
    invoke-static {p3, p2}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    const/4 v2, 0x1

    .line 31
    move-object v0, p0

    .line 32
    move-object v1, p1

    .line 33
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public chop(Lnet/bytebuddy/jar/asm/MethodVisitor;ILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v3, v4

    .line 4
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v7

    .line 8
    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    const/4 v2, 0x2

    .line 13
    move-object v6, v4

    .line 14
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move v5, p2

    .line 17
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public full(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    const/4 v2, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public abstract generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method

.method public isActive()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->active:Z

    .line 2
    .line 3
    return p0
.end method

.method public same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v3, v4

    .line 4
    array-length v5, v4

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    const/4 v2, 0x3

    .line 14
    move-object v6, v4

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public same1(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    sget-object v6, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v5, v6

    .line 12
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    const/4 v2, 0x4

    .line 21
    const/4 v3, 0x1

    .line 22
    move-object v0, p0

    .line 23
    move-object v1, p1

    .line 24
    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
