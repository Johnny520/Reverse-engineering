.class public abstract Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private triggerAttributes:Z

.field private triggerModule:Z

.field private triggerNestHost:Z

.field private triggerOuterClass:Z

.field private triggerSource:Z


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerSource:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerModule:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerNestHost:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerOuterClass:Z

    .line 12
    .line 13
    iput-boolean p1, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerAttributes:Z

    .line 14
    .line 15
    return-void
.end method

.method private considerTriggerAfterAttributes()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerAttributes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerAttributes:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onAfterAttributes()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private considerTriggerModule()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerModule:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerModule:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onModule()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private considerTriggerNestHost()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerNestHost:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerNestHost:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onNestHost()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private considerTriggerOuterClass()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerOuterClass:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerOuterClass:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onOuterType()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private considerTriggerSource()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerSource:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerSource:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onSource()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public onAfterAttributes()V
    .locals 0

    .line 1
    return-void
.end method

.method public onModule()V
    .locals 0

    .line 1
    return-void
.end method

.method public onNestHost()V
    .locals 0

    .line 1
    return-void
.end method

.method public onOuterType()V
    .locals 0

    .line 1
    return-void
.end method

.method public onSource()V
    .locals 0

    .line 1
    return-void
.end method

.method public onVisitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onVisitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitEnd()V
    .locals 0

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onVisitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onVisitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onVisitNestHost(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitNestMember(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitPermittedSubclass(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onVisitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVisitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final visitEnd()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitEnd()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerModule:Z

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final visitNestHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerNestHost:Z

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitNestHost(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final visitNestMember(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitNestMember(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerOuterClass:Z

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final visitPermittedSubclass(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitPermittedSubclass(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerAfterAttributes()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->triggerSource:Z

    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerSource()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerModule()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerNestHost()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->considerTriggerOuterClass()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
