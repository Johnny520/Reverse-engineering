.class Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;
.super Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "UnresolvedDelegate"
.end annotation


# instance fields
.field private final classReader:Lnet/bytebuddy/utility/AsmClassReader;

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/utility/AsmClassReader;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/utility/AsmClassReader;)V

    return-void
.end method


# virtual methods
.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getInterfaceInternalNames()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/utility/AsmClassReader;->getInternalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0x2f

    .line 8
    .line 9
    const/16 v1, 0x2e

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/utility/AsmClassReader;->getSuperClassInternalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 10
    .line 11
    invoke-virtual {v1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->isInterface()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazySuperClass;

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazySuperClass;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 27
    .line 28
    return-object p0
.end method

.method public resolve()Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 4
    .line 5
    iget-object v2, v1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$UnresolvedDelegate;->classReader:Lnet/bytebuddy/utility/AsmClassReader;

    .line 8
    .line 9
    invoke-static {v2, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->access$301(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Lnet/bytebuddy/utility/AsmClassReader;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
