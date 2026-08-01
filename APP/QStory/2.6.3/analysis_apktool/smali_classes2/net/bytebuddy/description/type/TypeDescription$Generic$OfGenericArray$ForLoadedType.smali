.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedType"
.end annotation


# instance fields
.field private final annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

.field private final genericArrayType:Ljava/lang/reflect/GenericArrayType;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/GenericArrayType;)V
    .locals 1

    .line 9
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;-><init>(Ljava/lang/reflect/GenericArrayType;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/GenericArrayType;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->genericArrayType:Ljava/lang/reflect/GenericArrayType;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 18
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    return-object p0
.end method

.method public getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->genericArrayType:Ljava/lang/reflect/GenericArrayType;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 8
    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;->ofComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v0, p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describeOrNull(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;->asList()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public represents(Ljava/lang/reflect/Type;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;->genericArrayType:Ljava/lang/reflect/GenericArrayType;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method
