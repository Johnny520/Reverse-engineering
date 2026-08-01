.class public Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;
.super Lnet/bytebuddy/jar/asm/AnnotationVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field protected final descriptor:Ljava/lang/String;

.field protected final remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;-><init>(ILnet/bytebuddy/jar/asm/AnnotationVisitor;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->descriptor:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0, p2, p3}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1

    const/high16 v0, 0x90000

    .line 9
    invoke-direct {p0, v0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-void
.end method

.method private mapAnnotationAttributeName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapAnnotationAttributeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->api:I

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p2, v2}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->createAnnotationRemapper(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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

    iget v1, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->api:I

    const/4 v2, 0x0

    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-object v0
.end method

.method public final orDeprecatedValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;

    .line 13
    .line 14
    iget v1, v0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->api:I

    .line 15
    .line 16
    iget v2, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->api:I

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->av:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 21
    .line 22
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->av:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 27
    .line 28
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    return-object p1
.end method

.method public visit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->mapAnnotationAttributeName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->mapAnnotationAttributeName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-super {p0, p1, v0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->av:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0, p2, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->mapAnnotationAttributeName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->av:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 14
    .line 15
    if-ne p1, v1, :cond_1

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->mapAnnotationAttributeName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-super {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
