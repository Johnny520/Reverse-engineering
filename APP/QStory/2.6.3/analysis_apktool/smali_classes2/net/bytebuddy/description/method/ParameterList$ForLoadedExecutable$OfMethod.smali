.class public Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfMethod;
.super Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable<",
        "Ljava/lang/reflect/Method;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfMethod;->get(I)Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->executable:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;

    .line 8
    .line 9
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfMethod;-><init>(Ljava/lang/reflect/Method;ILnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
