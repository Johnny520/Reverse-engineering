.class public abstract Lcom/esotericsoftware/asm/MethodVisitor;
.super Ljava/lang/Object;


# instance fields
.field protected final api:I

.field protected mv:Lcom/esotericsoftware/asm/MethodVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/asm/MethodVisitor;-><init>(ILcom/esotericsoftware/asm/MethodVisitor;)V

    return-void
.end method

.method public constructor <init>(ILcom/esotericsoftware/asm/MethodVisitor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40000

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x50000

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :cond_1
    :goto_0
    iput p1, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 19
    .line 20
    iput-object p2, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public visitAnnotationDefault()Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAnnotationDefault()Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitAttribute(Lcom/esotericsoftware/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitCode()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitCode()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/MethodVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitIincInsn(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIincInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitInsn(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsn(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitInsnAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInsnAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public visitIntInsn(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitIntInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public varargs visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Handle;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitJumpInsn(ILcom/esotericsoftware/asm/Label;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitJumpInsn(ILcom/esotericsoftware/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLabel(Lcom/esotericsoftware/asm/Label;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLabel(Lcom/esotericsoftware/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLineNumber(ILcom/esotericsoftware/asm/Label;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLineNumber(ILcom/esotericsoftware/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitLocalVariableAnnotation(ILcom/esotericsoftware/asm/TypePath;[Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;[ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p7}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLocalVariableAnnotation(ILcom/esotericsoftware/asm/TypePath;[Lcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;[ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public visitLookupSwitchInsn(Lcom/esotericsoftware/asm/Label;[I[Lcom/esotericsoftware/asm/Label;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitLookupSwitchInsn(Lcom/esotericsoftware/asm/Label;[I[Lcom/esotericsoftware/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMaxs(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMaxs(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 39
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

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

    :goto_1
    invoke-virtual/range {v1 .. v6}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_1
    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    iget-object p0, v1, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    if-eqz p0, :cond_2

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

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
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p0, "INVOKESPECIAL/STATIC on interfaces require ASM 5"

    .line 21
    .line 22
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    iget-object v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

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
    invoke-virtual/range {v0 .. v5}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public visitMultiANewArrayInsn(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitParameter(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public visitParameterAnnotation(ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/asm/MethodVisitor;->visitParameterAnnotation(ILjava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public varargs visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTableSwitchInsn(IILcom/esotericsoftware/asm/Label;[Lcom/esotericsoftware/asm/Label;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTryCatchAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTryCatchAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public visitTryCatchBlock(Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTryCatchBlock(Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Lcom/esotericsoftware/asm/Label;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeAnnotation(ILcom/esotericsoftware/asm/TypePath;Ljava/lang/String;Z)Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public visitTypeInsn(ILjava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitVarInsn(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/MethodVisitor;->mv:Lcom/esotericsoftware/asm/MethodVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/MethodVisitor;->visitVarInsn(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
