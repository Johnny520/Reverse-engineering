.class public Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType$Bound;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->index:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic access$3800(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3900(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;ILnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-interface {p0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Disabled;->INSTANCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Disabled;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    const-class v1, Lnet/bytebuddy/asm/Advice$OnDefaultValue;

    .line 27
    .line 28
    invoke-interface {p0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    invoke-static {p2, p1, p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->of(Lnet/bytebuddy/description/type/TypeDefinition;IZ)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    const-class v1, Lnet/bytebuddy/asm/Advice$OnNonDefaultValue;

    .line 41
    .line 42
    invoke-interface {p0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    invoke-static {p2, p1, p0}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->of(Lnet/bytebuddy/description/type/TypeDefinition;IZ)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    new-instance p2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;

    .line 67
    .line 68
    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;I)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_4
    const-string p0, "Cannot relocate execution by instance type for primitive type"

    .line 73
    .line 74
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_5
    const-string p0, " is not an array type but an index for a relocation is defined"

    .line 79
    .line 80
    invoke-static {p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType$Bound;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType$Bound;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForType;->index:I

    .line 19
    .line 20
    add-int/2addr v0, p0

    .line 21
    return v0
.end method
