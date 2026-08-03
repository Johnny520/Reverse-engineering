.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/lang/annotation/Annotation;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

.field private final annotationType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->annotationType:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->annotationType:Ljava/lang/Class;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->annotationType:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public getAnnotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->annotationType:Ljava/lang/Class;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->annotationType:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;)Lnet/bytebuddy/asm/Advice$OffsetMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "TT;>;",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping$Factory$AdviceType;",
            ")",
            "Lnet/bytebuddy/asm/Advice$OffsetMapping;"
        }
    .end annotation

    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    sget-object p3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {p3}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p3

    invoke-interface {p2, p3}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved;

    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    iget-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Lnet/bytebuddy/description/field/FieldDescription;)V

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot assign method handle to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
