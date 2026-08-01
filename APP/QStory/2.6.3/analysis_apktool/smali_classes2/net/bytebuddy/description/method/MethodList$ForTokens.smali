.class public Lnet/bytebuddy/description/method/MethodList$ForTokens;
.super Lnet/bytebuddy/description/method/MethodList$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForTokens"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/MethodList$AbstractBase<",
        "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# instance fields
.field private final declaringType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final tokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodList$AbstractBase;-><init>()V

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/description/method/MethodList$ForTokens;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    iput-object p2, p0, Lnet/bytebuddy/description/method/MethodList$ForTokens;->tokens:Ljava/util/List;

    return-void
.end method

.method public varargs constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/method/MethodDescription$Token;)V
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/description/method/MethodList$ForTokens;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/method/MethodList$ForTokens;->get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodList$ForTokens;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodList$ForTokens;->tokens:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodList$ForTokens;->tokens:Ljava/util/List;

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
