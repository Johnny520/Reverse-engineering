.class public final Lcom/android/dx/rop/cst/CstMethodHandle;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final METHOD_HANDLE_TYPE_INSTANCE_GET:I = 0x3

.field public static final METHOD_HANDLE_TYPE_INSTANCE_PUT:I = 0x2

.field public static final METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR:I = 0x6

.field public static final METHOD_HANDLE_TYPE_INVOKE_DIRECT:I = 0x7

.field public static final METHOD_HANDLE_TYPE_INVOKE_INSTANCE:I = 0x5

.field public static final METHOD_HANDLE_TYPE_INVOKE_INTERFACE:I = 0x8

.field public static final METHOD_HANDLE_TYPE_INVOKE_STATIC:I = 0x4

.field public static final METHOD_HANDLE_TYPE_STATIC_GET:I = 0x1

.field public static final METHOD_HANDLE_TYPE_STATIC_PUT:I

.field private static final TYPE_NAMES:[Ljava/lang/String;


# instance fields
.field private final ref:Lcom/android/dx/rop/cst/Constant;

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v7, "invoke-direct"

    .line 2
    .line 3
    const-string v8, "invoke-interface"

    .line 4
    .line 5
    const-string v0, "static-put"

    .line 6
    .line 7
    const-string v1, "static-get"

    .line 8
    .line 9
    const-string v2, "instance-put"

    .line 10
    .line 11
    const-string v3, "instance-get"

    .line 12
    .line 13
    const-string v4, "invoke-static"

    .line 14
    .line 15
    const-string v5, "invoke-instance"

    .line 16
    .line 17
    const-string v6, "invoke-constructor"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/android/dx/rop/cst/CstMethodHandle;->TYPE_NAMES:[Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>(ILcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->type:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->ref:Lcom/android/dx/rop/cst/Constant;

    .line 7
    .line 8
    return-void
.end method

.method public static getMethodHandleTypeName(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/cst/CstMethodHandle;->TYPE_NAMES:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object p0, v0, p0

    .line 4
    .line 5
    return-object p0
.end method

.method public static isAccessor(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public static isInvocation(I)Z
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0

    .line 6
    :pswitch_0
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    nop

    .line 9
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static make(ILcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/cst/CstMethodHandle;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->isAccessor(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "ref has wrong type: "

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->isInvocation(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    :goto_1
    new-instance v0, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 34
    .line 35
    invoke-direct {v0, p0, p1}, Lcom/android/dx/rop/cst/CstMethodHandle;-><init>(ILcom/android/dx/rop/cst/Constant;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-string p1, "type is out of range: "

    .line 48
    .line 49
    invoke-static {p0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleType()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->getRef()Lcom/android/dx/rop/cst/Constant;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getRef()Lcom/android/dx/rop/cst/Constant;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleType()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleType()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public getMethodHandleType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public getRef()Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->ref:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->METHOD_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public isAccessor()Z
    .locals 0

    .line 15
    iget p0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->type:I

    invoke-static {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->isAccessor(I)Z

    move-result p0

    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isInvocation()Z
    .locals 0

    .line 9
    iget p0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->type:I

    invoke-static {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->isInvocation(I)Z

    move-result p0

    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->type:I

    .line 7
    .line 8
    invoke-static {v1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleTypeName(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ","

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstMethodHandle;->ref:Lcom/android/dx/rop/cst/Constant;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "method-handle{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "}"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "method handle"

    .line 2
    .line 3
    return-object p0
.end method
