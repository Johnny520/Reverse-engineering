.class public Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Loaded"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private transient synthetic hashCode:I

.field private final propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$State;->isResolved()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    return v2
.end method

.method public getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$State;->RESOLVED:Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->hashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->hashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->hashCode:I

    .line 18
    .line 19
    return p0

    .line 20
    :cond_1
    iput v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->hashCode:I

    .line 21
    .line 22
    return v0
.end method

.method public represents(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public resolve()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->copy(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->propertyDelegate:Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$Loaded;->value:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant$PropertyDelegate;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
