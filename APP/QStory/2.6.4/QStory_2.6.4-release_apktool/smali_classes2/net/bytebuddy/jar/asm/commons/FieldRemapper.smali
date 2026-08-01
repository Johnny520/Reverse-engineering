.class public Lnet/bytebuddy/jar/asm/commons/FieldRemapper;
.super Lnet/bytebuddy/jar/asm/FieldVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field protected final remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/FieldVisitor;-><init>(ILnet/bytebuddy/jar/asm/FieldVisitor;)V

    .line 8
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;-><init>(ILnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

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
    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldVisitor;->api:I

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p2, v2}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->createAnnotationRemapper(Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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
    .end annotation

    .line 19
    new-instance v0, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;

    iget v1, p0, Lnet/bytebuddy/jar/asm/FieldVisitor;->api:I

    const/4 v2, 0x0

    iget-object p0, p0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    invoke-direct {v0, v1, v2, p1, p0}, Lnet/bytebuddy/jar/asm/commons/AnnotationRemapper;-><init>(ILjava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-object v0
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0, p2}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->remapper:Lnet/bytebuddy/jar/asm/commons/Remapper;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/commons/Remapper;->mapDesc(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

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
    invoke-virtual {p0, p3, p1}, Lnet/bytebuddy/jar/asm/commons/FieldRemapper;->createAnnotationRemapper(Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationVisitor;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
