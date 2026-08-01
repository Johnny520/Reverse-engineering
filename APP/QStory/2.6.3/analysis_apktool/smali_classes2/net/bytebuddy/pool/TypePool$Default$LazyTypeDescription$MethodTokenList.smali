.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;
.super Lnet/bytebuddy/description/method/MethodList$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MethodTokenList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/MethodList$AbstractBase<",
        "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodList$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;->get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->access$1600(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->access$1700(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->access$1600(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
