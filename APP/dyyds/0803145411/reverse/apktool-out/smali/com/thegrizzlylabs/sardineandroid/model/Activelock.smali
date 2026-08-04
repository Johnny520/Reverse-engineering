.class public Lcom/thegrizzlylabs/sardineandroid/model/Activelock;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
    strict = false
.end annotation


# instance fields
.field private depth:Ljava/lang/String;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field private lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field private locktoken:Lcom/thegrizzlylabs/sardineandroid/model/Locktoken;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .annotation runtime Lorg/simpleframework/xml/Element;
    .end annotation
.end field

.field private owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private timeout:Ljava/lang/String;
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
.method public getDepth()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->depth:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLockscope()Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLocktoken()Lcom/thegrizzlylabs/sardineandroid/model/Locktoken;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->locktoken:Lcom/thegrizzlylabs/sardineandroid/model/Locktoken;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLocktype()Lcom/thegrizzlylabs/sardineandroid/model/Locktype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOwner()Lcom/thegrizzlylabs/sardineandroid/model/Owner;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTimeout()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->timeout:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDepth(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->depth:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLockscope(Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->lockscope:Lcom/thegrizzlylabs/sardineandroid/model/Lockscope;

    .line 2
    .line 3
    return-void
.end method

.method public setLocktoken(Lcom/thegrizzlylabs/sardineandroid/model/Locktoken;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->locktoken:Lcom/thegrizzlylabs/sardineandroid/model/Locktoken;

    .line 2
    .line 3
    return-void
.end method

.method public setLocktype(Lcom/thegrizzlylabs/sardineandroid/model/Locktype;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->locktype:Lcom/thegrizzlylabs/sardineandroid/model/Locktype;

    .line 2
    .line 3
    return-void
.end method

.method public setOwner(Lcom/thegrizzlylabs/sardineandroid/model/Owner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->owner:Lcom/thegrizzlylabs/sardineandroid/model/Owner;

    .line 2
    .line 3
    return-void
.end method

.method public setTimeout(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Activelock;->timeout:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
