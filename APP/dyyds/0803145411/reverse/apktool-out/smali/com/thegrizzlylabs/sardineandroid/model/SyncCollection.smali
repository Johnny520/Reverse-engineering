.class public Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
.end annotation


# instance fields
.field protected limit:Lcom/thegrizzlylabs/sardineandroid/model/Limit;

.field protected prop:Lcom/thegrizzlylabs/sardineandroid/model/Prop;

.field protected syncLevel:Ljava/lang/String;

.field protected syncToken:Ljava/lang/String;


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
.method public getLimit()Lcom/thegrizzlylabs/sardineandroid/model/Limit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->limit:Lcom/thegrizzlylabs/sardineandroid/model/Limit;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProp()Lcom/thegrizzlylabs/sardineandroid/model/Prop;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->prop:Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSyncLevel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->syncLevel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSyncToken()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->syncToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setLimit(Lcom/thegrizzlylabs/sardineandroid/model/Limit;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->limit:Lcom/thegrizzlylabs/sardineandroid/model/Limit;

    .line 2
    .line 3
    return-void
.end method

.method public setProp(Lcom/thegrizzlylabs/sardineandroid/model/Prop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->prop:Lcom/thegrizzlylabs/sardineandroid/model/Prop;

    .line 2
    .line 3
    return-void
.end method

.method public setSyncLevel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->syncLevel:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSyncToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/SyncCollection;->syncToken:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
