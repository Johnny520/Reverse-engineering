.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;
.super Lnet/bytebuddy/description/type/RecordComponentList$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RecordComponentTokenList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/type/RecordComponentList$AbstractBase<",
        "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/type/RecordComponentList$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;->get(I)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->access$1800(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;

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
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->access$1900(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;

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
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentTokenList;->this$0:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;->access$1800(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Ljava/util/List;

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
