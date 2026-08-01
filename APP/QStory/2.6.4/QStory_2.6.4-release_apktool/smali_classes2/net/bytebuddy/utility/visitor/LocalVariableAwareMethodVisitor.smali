.class public Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private freeOffset:I


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getFreeOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 2
    .line 3
    return p0
.end method

.method public visitVarInsn(II)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :pswitch_0
    iget v0, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_1
    iget v0, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 17
    .line 18
    add-int/lit8 v1, p2, 0x1

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lnet/bytebuddy/utility/visitor/LocalVariableAwareMethodVisitor;->freeOffset:I

    .line 25
    .line 26
    :goto_0
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x36
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
