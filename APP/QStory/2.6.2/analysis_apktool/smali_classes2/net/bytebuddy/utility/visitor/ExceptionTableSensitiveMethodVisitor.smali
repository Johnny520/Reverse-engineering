.class public abstract Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private trigger:Z


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->trigger:Z

    .line 6
    .line 7
    return-void
.end method

.method private considerEndOfExceptionTable()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->trigger:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->trigger:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onAfterExceptionTable()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract onAfterExceptionTable()V
.end method

.method public onVisitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 0
    .param p3    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitIincInsn(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitInsn(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitIntInsn(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public varargs onVisitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitLabel(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitLdcInsn(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 5
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public onVisitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public varargs onVisitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitTypeInsn(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitVarInsn(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 0
    .param p3    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitIincInsn(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitIincInsn(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitInsn(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitInsn(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitIntInsn(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitIntInsn(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitLabel(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitLdcInsn(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitLdcInsn(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 9
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final varargs visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitTypeInsn(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitTypeInsn(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitVarInsn(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->considerEndOfExceptionTable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/ExceptionTableSensitiveMethodVisitor;->onVisitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
