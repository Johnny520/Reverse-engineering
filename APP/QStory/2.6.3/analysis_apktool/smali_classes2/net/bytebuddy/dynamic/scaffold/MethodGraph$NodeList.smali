.class public Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;
.super Lnet/bytebuddy/matcher/FilterableList$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodGraph;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NodeList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/matcher/FilterableList$AbstractBase<",
        "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;",
        "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;",
        ">;"
    }
.end annotation


# instance fields
.field private final nodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/FilterableList$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->nodes:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public asMethodList()Lnet/bytebuddy/description/method/MethodList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->nodes:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;

    .line 27
    .line 28
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;->getRepresentative()Lnet/bytebuddy/description/method/MethodDescription;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p0, Lnet/bytebuddy/description/method/MethodList$Explicit;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/method/MethodList$Explicit;-><init>(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->get(I)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->nodes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;

    .line 8
    .line 9
    return-object p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->nodes:Ljava/util/List;

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

.method public wrap(Ljava/util/List;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;",
            ">;)",
            "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;"
        }
    .end annotation

    .line 1
    new-instance p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic wrap(Ljava/util/List;)Lnet/bytebuddy/matcher/FilterableList;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;->wrap(Ljava/util/List;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$NodeList;

    move-result-object p0

    return-object p0
.end method
