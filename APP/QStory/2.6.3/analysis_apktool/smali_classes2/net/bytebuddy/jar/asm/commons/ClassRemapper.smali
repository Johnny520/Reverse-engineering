.class public Lnet/bytebuddy/jar/asm/commons/ClassRemapper;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field protected className:Ljava/lang/String;

.field protected final remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 8
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p2, v2}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createAnnotationRemapper(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->orDeprecatedValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public createAnnotationRemapper(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation

    .line 19
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;

    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    const/4 v2, 0x0

    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-object v0
.end method

.method public createFieldRemapper(Lnet/bytebuddy/jar/asm/FieldVisitor;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;-><init>(ILnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public createMethodRemapper(Lnet/bytebuddy/jar/asm/MethodVisitor;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/MethodRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/jar/asm/commons/MethodRemapper;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public createModuleRemapper(Lnet/bytebuddy/jar/asm/ModuleVisitor;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/jar/asm/commons/ModuleRemapper;-><init>(ILnet/bytebuddy/jar/asm/ModuleVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public createRecordComponentRemapper(Lnet/bytebuddy/jar/asm/RecordComponentVisitor;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/RecordComponentRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->api:I

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/jar/asm/commons/RecordComponentRemapper;-><init>(ILnet/bytebuddy/jar/asm/RecordComponentVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->className:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 4
    .line 5
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p4, v1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapSignature(Ljava/lang/String;Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 17
    .line 18
    invoke-virtual {v0, p5}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p5

    .line 22
    if-nez p6, :cond_0

    .line 23
    .line 24
    const/4 p6, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 27
    .line 28
    invoke-virtual {v0, p6}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapTypes([Ljava/lang/String;)[Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p6

    .line 32
    :goto_0
    invoke-super/range {p0 .. p6}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 4

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;

    .line 7
    .line 8
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/commons/ModuleHashesAttribute;->modules:Ljava/util/List;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapModuleName(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->className:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapFieldName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, p4, v1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapSignature(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    const/4 v0, 0x0

    .line 23
    if-nez p5, :cond_0

    .line 24
    .line 25
    move-object p5, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 28
    .line 29
    invoke-virtual {v1, p5}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p5

    .line 33
    :goto_0
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createFieldRemapper(Lnet/bytebuddy/jar/asm/FieldVisitor;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 13
    .line 14
    invoke-virtual {v2, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    if-nez p3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapInnerClassName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_1
    invoke-super {p0, v0, v2, v1, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapMethodDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 8
    .line 9
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->className:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2, p2, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapMethodName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p3, p4, v1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapSignature(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez p5, :cond_0

    .line 24
    .line 25
    move-object p5, v1

    .line 26
    :goto_0
    move-object p3, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 29
    .line 30
    invoke-virtual {p3, p5}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapTypes([Ljava/lang/String;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    move-object p5, p3

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createMethodRemapper(Lnet/bytebuddy/jar/asm/MethodVisitor;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapModuleName(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createModuleRemapper(Lnet/bytebuddy/jar/asm/ModuleVisitor;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public visitNestHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public visitNestMember(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    move-object p1, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 13
    .line 14
    invoke-virtual {v2, p1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapMethodName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    if-nez p3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 22
    .line 23
    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapMethodDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_1
    invoke-super {p0, v0, p1, v1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public visitPermittedSubclass(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapType(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->className:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapRecordComponentName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, p3, v1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapSignature(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createRecordComponentRemapper(Lnet/bytebuddy/jar/asm/RecordComponentVisitor;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0, p3, p1}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
