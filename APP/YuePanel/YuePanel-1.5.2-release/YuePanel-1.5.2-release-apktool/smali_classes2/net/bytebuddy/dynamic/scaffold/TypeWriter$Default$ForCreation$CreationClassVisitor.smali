.class public Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;
.super Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CreationClassVisitor"
.end annotation


# instance fields
.field private final declaredTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

.field private final visitedFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;",
            ">;"
        }
    .end annotation
.end field

.field private final visitedMethods:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->declaredTypes:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedFields:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedMethods:Ljava/util/Set;

    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    return-void
.end method


# virtual methods
.method public onAfterAttributes()V
    .locals 4

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    invoke-interface {v0, v3}, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;->on(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    return-void
.end method

.method public onVisitEnd()V
    .locals 6

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->declaredTypes:Ljava/util/Set;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->isMemberType()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v4, v4, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    move-result v1

    invoke-virtual {v2, v3, v4, v5, v1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fields:Lnet/bytebuddy/description/field/FieldList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/field/FieldDescription;

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedFields:Ljava/util/Set;

    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v2, v2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fieldPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;

    invoke-interface {v2, v1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;->target(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool$Record;

    move-result-object v1

    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    iget-object v3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v3, v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v0, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedMethods:Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription;

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedMethods:Ljava/util/Set;

    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    invoke-static {v2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->access$1300(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    move-result-object v2

    invoke-interface {v2, v1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;->target(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    move-result-object v1

    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    iget-object v3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    iget-object v4, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v4, v4, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    invoke-interface {v1, v2, v3, v4}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->implementationContext:Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain$Default;

    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v3, v2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->access$1300(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    move-result-object v2

    iget-object v4, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v4, v4, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    invoke-direct {v1, v3, v2, v4}, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain$Default;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassVisitor;->cv:Lnet/bytebuddy/jar/asm/ClassVisitor;

    iget-object v3, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->this$0:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    iget-object v3, v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    invoke-interface {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;->drain(Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    invoke-super {p0}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitEnd()V

    return-void
.end method

.method public onVisitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedFields:Ljava/util/Set;

    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;

    invoke-direct {v1, p2, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    move-result-object p1

    return-object p1
.end method

.method public onVisitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->declaredTypes:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public onVisitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;->visitedMethods:Ljava/util/Set;

    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;

    invoke-direct {v1, p2, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$SignatureKey;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/utility/visitor/MetadataAwareClassVisitor;->onVisitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-result-object p1

    return-object p1
.end method
