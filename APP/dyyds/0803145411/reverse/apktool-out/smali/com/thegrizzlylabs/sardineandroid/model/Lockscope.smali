.class public Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
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
.field private exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field


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
.method public getExclusive()Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShared()Lcom/thegrizzlylabs/sardineandroid/model/Shared;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;

    .line 2
    .line 3
    return-object p0
.end method

.method public setExclusive(Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->exclusive:Lcom/thegrizzlylabs/sardineandroid/model/Exclusive;

    .line 2
    .line 3
    return-void
.end method

.method public setShared(Lcom/thegrizzlylabs/sardineandroid/model/Shared;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;->shared:Lcom/thegrizzlylabs/sardineandroid/model/Shared;

    .line 2
    .line 3
    return-void
.end method
