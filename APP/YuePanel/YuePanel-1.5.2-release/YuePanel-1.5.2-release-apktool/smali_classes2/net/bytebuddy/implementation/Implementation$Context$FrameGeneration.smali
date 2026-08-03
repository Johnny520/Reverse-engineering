.class public abstract enum Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.super Ljava/lang/Enum;
.source "SourceFile"


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

    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$1;

    const-string v1, "GENERATE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$1;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->GENERATE:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$2;

    const-string v4, "EXPAND"

    invoke-direct {v1, v4, v3, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$2;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EXPAND:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    new-instance v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$3;

    const-string v5, "DISABLED"

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$3;-><init>(Ljava/lang/String;IZ)V

    sput-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->DISABLED:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    const/4 v5, 0x3

    new-array v5, v5, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    aput-object v0, v5, v2

    aput-object v1, v5, v3

    aput-object v4, v5, v6

    sput-object v5, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->$VALUES:[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    new-array v0, v2, [Ljava/lang/Object;

    sput-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-boolean p3, p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->active:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZLnet/bytebuddy/implementation/Implementation$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method private static toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    return-object p0

    :cond_3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

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

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-static {v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    .locals 1

    const-class v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->$VALUES:[Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

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

    sget-object v4, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    array-length v3, v4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int v7, v0, v1

    invoke-static {p3, p2}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v8

    const/4 v2, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

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

    sget-object v6, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    array-length v3, v6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v8

    const/4 v2, 0x2

    move-object v0, p0

    move-object v1, p1

    move-object v4, v6

    move v5, p2

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

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

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v8

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

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
    .locals 1

    iget-boolean v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->active:Z

    return v0
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

    sget-object v6, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    array-length v3, v6

    array-length v5, v6

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v8

    const/4 v2, 0x3

    move-object v0, p0

    move-object v1, p1

    move-object v4, v6

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

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

    invoke-static {p2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrame(Lnet/bytebuddy/description/type/TypeDefinition;)Ljava/lang/Object;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EMPTY:[Ljava/lang/Object;

    array-length v5, v6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->toStackMapFrames(Ljava/util/List;)[Ljava/lang/Object;

    move-result-object v8

    const/4 v2, 0x4

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method
