.class Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;
.super Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LazyInterfaceList"
.end annotation


# instance fields
.field private final internalNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->internalNames:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterface;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->internalNames:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterface;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$LazyInterfaceList;->internalNames:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
