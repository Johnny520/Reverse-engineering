.class public final enum Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HandleType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum GET_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum GET_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum INVOKE_INTERFACE:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum INVOKE_SPECIAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum INVOKE_SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum INVOKE_VIRTUAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum PUT_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field public static final enum PUT_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;


# instance fields
.field private final field:Z

.field private final identifier:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 2
    .line 3
    const-string v1, "INVOKE_VIRTUAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x5

    .line 7
    invoke-direct {v0, v1, v2, v3, v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_VIRTUAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 13
    .line 14
    const-string v4, "INVOKE_STATIC"

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x6

    .line 18
    invoke-direct {v1, v4, v5, v6, v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 22
    .line 23
    move v4, v2

    .line 24
    new-instance v2, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 25
    .line 26
    const-string v7, "INVOKE_SPECIAL"

    .line 27
    .line 28
    const/4 v8, 0x2

    .line 29
    const/4 v9, 0x7

    .line 30
    invoke-direct {v2, v7, v8, v9, v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 34
    .line 35
    move v7, v3

    .line 36
    new-instance v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 37
    .line 38
    const/16 v10, 0x9

    .line 39
    .line 40
    const-string v11, "INVOKE_INTERFACE"

    .line 41
    .line 42
    const/4 v12, 0x3

    .line 43
    invoke-direct {v3, v11, v12, v10, v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 44
    .line 45
    .line 46
    sput-object v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_INTERFACE:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 47
    .line 48
    move v10, v4

    .line 49
    new-instance v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 50
    .line 51
    const-string v11, "INVOKE_SPECIAL_CONSTRUCTOR"

    .line 52
    .line 53
    const/4 v13, 0x4

    .line 54
    const/16 v14, 0x8

    .line 55
    .line 56
    invoke-direct {v4, v11, v13, v14, v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 60
    .line 61
    move v10, v5

    .line 62
    new-instance v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 63
    .line 64
    const-string v11, "PUT_FIELD"

    .line 65
    .line 66
    invoke-direct {v5, v11, v7, v12, v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 67
    .line 68
    .line 69
    sput-object v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->PUT_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 70
    .line 71
    move v7, v6

    .line 72
    new-instance v6, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 73
    .line 74
    const-string v11, "GET_FIELD"

    .line 75
    .line 76
    invoke-direct {v6, v11, v7, v10, v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 77
    .line 78
    .line 79
    sput-object v6, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->GET_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 80
    .line 81
    new-instance v7, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 82
    .line 83
    const-string v11, "PUT_STATIC_FIELD"

    .line 84
    .line 85
    invoke-direct {v7, v11, v9, v13, v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 86
    .line 87
    .line 88
    sput-object v7, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->PUT_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 89
    .line 90
    move v9, v8

    .line 91
    new-instance v8, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 92
    .line 93
    const-string v11, "GET_STATIC_FIELD"

    .line 94
    .line 95
    invoke-direct {v8, v11, v14, v9, v10}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;-><init>(Ljava/lang/String;IIZ)V

    .line 96
    .line 97
    .line 98
    sput-object v8, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->GET_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 99
    .line 100
    filled-new-array/range {v0 .. v8}, [Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->$VALUES:[Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 105
    .line 106
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->identifier:I

    .line 5
    .line 6
    iput-boolean p4, p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->field:Z

    .line 7
    .line 8
    return-void
.end method

.method public static of(I)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 5

    .line 57
    invoke-static {}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->values()[Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 58
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->getIdentifier()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 59
    :cond_1
    const-string v0, "Unknown handle type: "

    .line 60
    invoke-static {p0, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_INTERFACE:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_VIRTUAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    const-string v0, "Cannot create handle of type initializer "

    .line 51
    .line 52
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static ofGetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->GET_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->GET_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 11
    .line 12
    return-object p0
.end method

.method public static ofSetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->PUT_STATIC_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->PUT_FIELD:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 11
    .line 12
    return-object p0
.end method

.method public static ofSpecial(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const-string v0, "Cannot invoke "

    .line 26
    .line 27
    const-string v1, " via invokespecial"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->$VALUES:[Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getIdentifier()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->identifier:I

    .line 2
    .line 3
    return p0
.end method

.method public isField()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->field:Z

    .line 2
    .line 3
    return p0
.end method
