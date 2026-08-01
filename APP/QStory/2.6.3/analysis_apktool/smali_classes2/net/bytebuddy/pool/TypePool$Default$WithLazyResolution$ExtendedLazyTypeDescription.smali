.class public Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType$WithDelegation;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ExtendedLazyTypeDescription"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterface;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazySuperClass;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;,
        Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;
    }
.end annotation


# instance fields
.field private delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Lnet/bytebuddy/utility/AsmClassReader;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType$WithDelegation;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, p2, v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public delegate()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->resolve()Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 8
    .line 9
    invoke-virtual {v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getName()Ljava/lang/String;

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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public isAbstract()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x400

    .line 8
    .line 9
    and-int/2addr p0, v0

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public isAnnotation()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x2000

    .line 8
    .line 9
    and-int/2addr p0, v0

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public isEnum()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x4000

    .line 8
    .line 9
    and-int/2addr p0, v0

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public isInterface()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->delegate:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x200

    .line 8
    .line 9
    and-int/2addr p0, v0

    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method
