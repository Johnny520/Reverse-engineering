.class public Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lcom/thegrizzlylabs/sardineandroid/model/EntityWithAnyElement;


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field private any:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation
.end field

.field private collection:Lcom/thegrizzlylabs/sardineandroid/model/Collection;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getAny()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->any:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->any:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getCollection()Lcom/thegrizzlylabs/sardineandroid/model/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->collection:Lcom/thegrizzlylabs/sardineandroid/model/Collection;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrincipal()Lcom/thegrizzlylabs/sardineandroid/model/Principal;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCollection(Lcom/thegrizzlylabs/sardineandroid/model/Collection;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->collection:Lcom/thegrizzlylabs/sardineandroid/model/Collection;

    .line 2
    .line 3
    return-void
.end method

.method public setPrincipal(Lcom/thegrizzlylabs/sardineandroid/model/Principal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Resourcetype;->principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;

    .line 2
    .line 3
    return-void
.end method
