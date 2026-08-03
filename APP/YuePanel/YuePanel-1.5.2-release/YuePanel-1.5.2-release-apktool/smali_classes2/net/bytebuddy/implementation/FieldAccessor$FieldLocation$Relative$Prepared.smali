.class public Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Prepared"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

.field private final fieldNameExtractors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/FieldLocator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;",
            ">;",
            "Lnet/bytebuddy/dynamic/scaffold/FieldLocator;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldNameExtractors:Ljava/util/List;

    iput-object p2, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldNameExtractors:Ljava/util/List;

    check-cast p1, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;

    iget-object v3, p1, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldNameExtractors:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

    iget-object p1, p1, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldNameExtractors:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;
    .locals 3

    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Illegal;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Illegal;

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldNameExtractors:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->isResolved()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;

    invoke-interface {v2, p1}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->isResolved()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot resolve field for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " using "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative$Prepared;->fieldLocator:Lnet/bytebuddy/dynamic/scaffold/FieldLocator;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
