.class public Lnet/bytebuddy/jar/asm/TypeReference;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final CAST:I = 0x47

.field public static final CLASS_EXTENDS:I = 0x10

.field public static final CLASS_TYPE_PARAMETER:I = 0x0

.field public static final CLASS_TYPE_PARAMETER_BOUND:I = 0x11

.field public static final CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT:I = 0x48

.field public static final CONSTRUCTOR_REFERENCE:I = 0x45

.field public static final CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT:I = 0x4a

.field public static final EXCEPTION_PARAMETER:I = 0x42

.field public static final FIELD:I = 0x13

.field public static final INSTANCEOF:I = 0x43

.field public static final LOCAL_VARIABLE:I = 0x40

.field public static final METHOD_FORMAL_PARAMETER:I = 0x16

.field public static final METHOD_INVOCATION_TYPE_ARGUMENT:I = 0x49

.field public static final METHOD_RECEIVER:I = 0x15

.field public static final METHOD_REFERENCE:I = 0x46

.field public static final METHOD_REFERENCE_TYPE_ARGUMENT:I = 0x4b

.field public static final METHOD_RETURN:I = 0x14

.field public static final METHOD_TYPE_PARAMETER:I = 0x1

.field public static final METHOD_TYPE_PARAMETER_BOUND:I = 0x12

.field public static final NEW:I = 0x44

.field public static final RESOURCE_VARIABLE:I = 0x41

.field public static final THROWS:I = 0x17


# instance fields
.field private final targetTypeAndInfo:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 5
    .line 6
    return-void
.end method

.method public static newExceptionReference(I)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    const/high16 v1, 0x17000000

    .line 6
    .line 7
    or-int/2addr p0, v1

    .line 8
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static newFormalParameterReference(I)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x10

    .line 4
    .line 5
    const/high16 v1, 0x16000000

    .line 6
    .line 7
    or-int/2addr p0, v1

    .line 8
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static newSuperTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    const v1, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v1

    .line 7
    shl-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    const/high16 v1, 0x10000000

    .line 10
    .line 11
    or-int/2addr p0, v1

    .line 12
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static newTryCatchReference(I)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    const/high16 v1, 0x42000000    # 32.0f

    .line 6
    .line 7
    or-int/2addr p0, v1

    .line 8
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static newTypeArgumentReference(II)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x18

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static newTypeParameterBoundReference(III)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x18

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    or-int/2addr p0, p1

    .line 8
    shl-int/lit8 p1, p2, 0x8

    .line 9
    .line 10
    or-int/2addr p0, p1

    .line 11
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static newTypeParameterReference(II)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x18

    .line 4
    .line 5
    shl-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    or-int/2addr p0, p1

    .line 8
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static newTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x18

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static putTarget(ILnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 2

    .line 1
    ushr-int/lit8 v0, p0, 0x18

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_1

    .line 12
    .line 13
    .line 14
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    const v1, 0xffff00

    .line 27
    .line 28
    .line 29
    and-int/2addr p0, v1

    .line 30
    shr-int/lit8 p0, p0, 0x8

    .line 31
    .line 32
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->put12(II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    :pswitch_3
    ushr-int/lit8 p0, p0, 0x10

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getExceptionIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const v0, 0xffff00

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    shr-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    return p0
.end method

.method public getFormalParameterIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const/high16 v0, 0xff0000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    shr-int/lit8 p0, p0, 0x10

    .line 7
    .line 8
    return p0
.end method

.method public getSort()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    ushr-int/lit8 p0, p0, 0x18

    .line 4
    .line 5
    return p0
.end method

.method public getSuperTypeIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const v0, 0xffff00

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    shr-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0
.end method

.method public getTryCatchBlockIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const v0, 0xffff00

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    shr-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    return p0
.end method

.method public getTypeArgumentIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public getTypeParameterBoundIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const v0, 0xff00

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    shr-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    return p0
.end method

.method public getTypeParameterIndex()I
    .locals 1

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    const/high16 v0, 0xff0000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    shr-int/lit8 p0, p0, 0x10

    .line 7
    .line 8
    return p0
.end method

.method public getValue()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/TypeReference;->targetTypeAndInfo:I

    .line 2
    .line 3
    return p0
.end method
