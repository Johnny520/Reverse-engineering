.class public abstract Lnet/bytebuddy/jar/asm/ClassVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field protected final api:I

.field protected cv:Lnet/bytebuddy/jar/asm/ClassVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    return-void
.end method

.method public constructor <init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x90000

    .line 5
    .line 6
    const/high16 v1, 0x10a0000

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/high16 v0, 0x80000

    .line 11
    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/high16 v0, 0x70000

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/high16 v0, 0x60000

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/high16 v0, 0x50000

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    const/high16 v0, 0x40000

    .line 27
    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    if-ne p1, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->stringConcat$0(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 43
    .line 44
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Constants;->checkAsmExperimental(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 48
    .line 49
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 50
    .line 51
    return-void
.end method

.method private static synthetic stringConcat$0(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Unsupported api "

    .line 2
    .line 3
    invoke-static {p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public getDelegate()Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    const/high16 v0, 0x10000

    .line 8
    .line 9
    and-int/2addr v0, p2

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "Records requires ASM8"

    .line 14
    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    move v1, p1

    .line 24
    move v2, p2

    .line 25
    move-object v3, p3

    .line 26
    move-object v4, p4

    .line 27
    move-object v5, p5

    .line 28
    move-object v6, p6

    .line 29
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

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

.method public visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

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

.method public visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x60000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

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
    const-string p0, "Module requires ASM6"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public visitNestHost(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x70000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const-string p0, "NestHost requires ASM7"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitNestMember(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x70000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const-string p0, "NestMember requires ASM7"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitPermittedSubclass(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x90000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const-string p0, "PermittedSubclasses requires ASM9"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

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
    const-string p0, "Record requires ASM8"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 2
    .line 3
    const/high16 v1, 0x50000

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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
    const-string p0, "TypeAnnotation requires ASM5"

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
