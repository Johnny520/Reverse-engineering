.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithExplicitType"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final declaringType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;)V

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public fieldLocator(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
    .locals 3

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    const-class v1, Lnet/bytebuddy/dynamic/TargetType;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is no super type of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForExactType;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {v1, p1}, Lnet/bytebuddy/dynamic/TargetType;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForExactType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
