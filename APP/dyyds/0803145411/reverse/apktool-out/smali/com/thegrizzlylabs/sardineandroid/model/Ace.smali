.class public Lcom/thegrizzlylabs/sardineandroid/model/Ace;
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
.field private deny:Lcom/thegrizzlylabs/sardineandroid/model/Deny;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private grant:Lcom/thegrizzlylabs/sardineandroid/model/Grant;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private inherited:Lcom/thegrizzlylabs/sardineandroid/model/Inherited;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;
    .annotation runtime Lorg/simpleframework/xml/Element;
        required = false
    .end annotation
.end field

.field private protected1:Lcom/thegrizzlylabs/sardineandroid/model/Protected;
    .annotation runtime Lorg/simpleframework/xml/Element;
        name = "protected"
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
.method public getDeny()Lcom/thegrizzlylabs/sardineandroid/model/Deny;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->deny:Lcom/thegrizzlylabs/sardineandroid/model/Deny;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGrant()Lcom/thegrizzlylabs/sardineandroid/model/Grant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->grant:Lcom/thegrizzlylabs/sardineandroid/model/Grant;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInherited()Lcom/thegrizzlylabs/sardineandroid/model/Inherited;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->inherited:Lcom/thegrizzlylabs/sardineandroid/model/Inherited;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrincipal()Lcom/thegrizzlylabs/sardineandroid/model/Principal;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProtected()Lcom/thegrizzlylabs/sardineandroid/model/Protected;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->protected1:Lcom/thegrizzlylabs/sardineandroid/model/Protected;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDeny(Lcom/thegrizzlylabs/sardineandroid/model/Deny;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->deny:Lcom/thegrizzlylabs/sardineandroid/model/Deny;

    .line 2
    .line 3
    return-void
.end method

.method public setGrant(Lcom/thegrizzlylabs/sardineandroid/model/Grant;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->grant:Lcom/thegrizzlylabs/sardineandroid/model/Grant;

    .line 2
    .line 3
    return-void
.end method

.method public setInherited(Lcom/thegrizzlylabs/sardineandroid/model/Inherited;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->inherited:Lcom/thegrizzlylabs/sardineandroid/model/Inherited;

    .line 2
    .line 3
    return-void
.end method

.method public setPrincipal(Lcom/thegrizzlylabs/sardineandroid/model/Principal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->principal:Lcom/thegrizzlylabs/sardineandroid/model/Principal;

    .line 2
    .line 3
    return-void
.end method

.method public setProtected(Lcom/thegrizzlylabs/sardineandroid/model/Protected;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Ace;->protected1:Lcom/thegrizzlylabs/sardineandroid/model/Protected;

    .line 2
    .line 3
    return-void
.end method
