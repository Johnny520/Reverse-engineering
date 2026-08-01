.class public Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;
.super Lnet/bytebuddy/description/method/ParameterList$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfLegacyVmConstructor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/ParameterList$AbstractBase<",
        "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# instance fields
.field private final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private final parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;

.field private final parameterType:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterList$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->constructor:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->parameterType:[Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p2, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->get(I)Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfLegacyVmConstructor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->constructor:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->parameterType:[Ljava/lang/Class;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;

    .line 8
    .line 9
    invoke-direct {v0, v1, p1, v2, p0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfLegacyVmConstructor;-><init>(Ljava/lang/reflect/Constructor;I[Ljava/lang/Class;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$OfLegacyVmConstructor;->parameterType:[Ljava/lang/Class;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method
