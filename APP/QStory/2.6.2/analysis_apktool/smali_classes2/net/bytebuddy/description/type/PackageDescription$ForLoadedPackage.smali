.class public Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;
.super Lnet/bytebuddy/description/type/PackageDescription$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/PackageDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedPackage"
.end annotation


# instance fields
.field private final aPackage:Ljava/lang/Package;


# direct methods
.method public constructor <init>(Ljava/lang/Package;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/PackageDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;->aPackage:Ljava/lang/Package;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;->aPackage:Ljava/lang/Package;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Package;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;->aPackage:Ljava/lang/Package;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
