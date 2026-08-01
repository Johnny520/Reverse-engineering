.class public Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Loaded"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Ljava/lang/annotation/Annotation;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final annotation:Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    .line 5
    .line 6
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
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p0, p1}, Ljava/lang/annotation/Annotation;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
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
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public represents(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/lang/annotation/Annotation;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public bridge synthetic resolve()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->resolve()Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public resolve()Ljava/lang/annotation/Annotation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;->annotation:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
