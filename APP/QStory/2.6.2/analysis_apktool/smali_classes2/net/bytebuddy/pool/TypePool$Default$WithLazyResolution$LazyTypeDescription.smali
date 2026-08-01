.class public Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType$WithDelegation;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LazyTypeDescription"
.end annotation


# instance fields
.field private transient synthetic delegate:Lnet/bytebuddy/description/type/TypeDescription;

.field private final name:Ljava/lang/String;

.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType$WithDelegation;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->name:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public delegate()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "delegate"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->delegate:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->doResolve(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->delegate:Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->delegate:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
