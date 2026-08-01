.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Latent"
.end annotation


# instance fields
.field private final annotationSource:Lnet/bytebuddy/description/annotation/AnnotationSource;

.field private final componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;->annotationSource:Lnet/bytebuddy/description/annotation/AnnotationSource;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;->componentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$Latent;->annotationSource:Lnet/bytebuddy/description/annotation/AnnotationSource;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
