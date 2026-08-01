.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;
.super Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WildcardLowerBoundTypeList"
.end annotation


# instance fields
.field private final annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

.field private final lowerBound:[Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>([Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->lowerBound:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->lowerBound:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->annotationReader:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;->ofWildcardLowerBoundType(I)Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v0, p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describeOrNull(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType$WildcardLowerBoundTypeList;->lowerBound:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method
