.class Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;
.super Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ResolvedDelegate"
.end annotation


# instance fields
.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public resolve()Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;
    .locals 0

    .line 1
    return-object p0
.end method
