.class public final LCj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCB;


# instance fields
.field public final b:LCB;


# direct methods
.method public constructor <init>(LCB;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LCj;->b:LCB;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lpw;II)Lpw;
    .locals 4

    invoke-interface {p2}, Lpw;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAj;

    invoke-static {p1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v1

    iget-object v1, v1, Lcom/bumptech/glide/a;->a:LN5;

    iget-object v2, v0, LAj;->a:LL2;

    iget-object v2, v2, LL2;->b:Ljava/lang/Object;

    check-cast v2, LHj;

    iget-object v2, v2, LHj;->l:Landroid/graphics/Bitmap;

    new-instance v3, LO5;

    invoke-direct {v3, v1, v2}, LO5;-><init>(LN5;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, LCj;->b:LCB;

    invoke-interface {v1, p1, v3, p3, p4}, LCB;->a(Landroid/content/Context;Lpw;II)Lpw;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {v3}, LO5;->e()V

    :cond_0
    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, v0, LAj;->a:LL2;

    iget-object p3, p3, LL2;->b:Ljava/lang/Object;

    check-cast p3, LHj;

    invoke-virtual {p3, v1, p1}, LHj;->c(LCB;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public final b(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, LCj;->b:LCB;

    invoke-interface {v0, p1}, LSm;->b(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LCj;

    if-eqz v0, :cond_0

    check-cast p1, LCj;

    iget-object v0, p0, LCj;->b:LCB;

    iget-object p1, p1, LCj;->b:LCB;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LCj;->b:LCB;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
