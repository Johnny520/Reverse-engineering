.class public abstract Lbsh/org/objectweb/asm/MethodVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final REQUIRES_ASM5:Ljava/lang/String; = "This feature requires ASM5"


# instance fields
.field protected final api:I

.field protected mv:Lbsh/org/objectweb/asm/MethodVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lbsh/org/objectweb/asm/MethodVisitor;-><init>(ILbsh/org/objectweb/asm/MethodVisitor;)V

    return-void
.end method

.method public constructor <init>(ILbsh/org/objectweb/asm/MethodVisitor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x60000

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x50000

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/high16 v0, 0x40000

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Lj8/o;->o()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iput p1, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    .line 23
    .line 24
    iput-object p2, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public visitAnnotableParameterCount(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitAnnotableParameterCount(IZ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitCode()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitCode()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public visitIincInsn(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIincInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitInsn(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitIntInsn(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitIntInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const-string p1, "This feature requires ASM5"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitJumpInsn(ILbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLabel(Lbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLabel(Lbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, Lbsh/org/objectweb/asm/Handle;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    instance-of v0, p1, Lbsh/org/objectweb/asm/Type;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Lbsh/org/objectweb/asm/Type;

    .line 17
    .line 18
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/Type;->getSort()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0xb

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p1, "This feature requires ASM5"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    :goto_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public visitLineNumber(ILbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLineNumber(ILbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    move v6, p6

    .line 11
    invoke-virtual/range {v0 .. v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public visitLookupSwitchInsn(Lbsh/org/objectweb/asm/Label;[I[Lbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLookupSwitchInsn(Lbsh/org/objectweb/asm/Label;[I[Lbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMaxs(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 39
    iget v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    const/high16 v1, 0x50000

    if-lt v0, v1, :cond_1

    const/16 v0, 0xb9

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 40
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_1
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 41
    iget-object p1, v1, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    if-eqz p1, :cond_2

    .line 42
    invoke-virtual {p1, v2, v3, v4, v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    const/16 v0, 0xb9

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-ne p5, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p1, "INVOKESPECIAL/STATIC on interfaces requires ASM5"

    .line 21
    .line 22
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    move v1, p1

    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p3

    .line 33
    move-object v4, p4

    .line 34
    move v5, p5

    .line 35
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitParameter(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const-string p1, "This feature requires ASM5"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public varargs visitTableSwitchInsn(IILbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTableSwitchInsn(IILbsh/org/objectweb/asm/Label;[Lbsh/org/objectweb/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTryCatchBlock(Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTryCatchBlock(Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Lbsh/org/objectweb/asm/Label;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
