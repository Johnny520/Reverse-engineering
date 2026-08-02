.class public final Lap0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ln33;


# instance fields
.field public final b:Ln33;


# direct methods
.method public constructor <init>(Ln33;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lap0;->b:Ln33;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ld92;II)Ld92;
    .locals 4

    .line 1
    invoke-interface {p2}, Ld92;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyo0;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/bumptech/glide/a;->h:Lzk;

    .line 12
    .line 13
    iget-object v2, v0, Lyo0;->h:Lxo0;

    .line 14
    .line 15
    iget-object v2, v2, Lxo0;->a:Lep0;

    .line 16
    .line 17
    iget-object v2, v2, Lep0;->l:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    new-instance v3, Lal;

    .line 20
    .line 21
    invoke-direct {v3, v1, v2}, Lal;-><init>(Lzk;Landroid/graphics/Bitmap;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lap0;->b:Ln33;

    .line 25
    .line 26
    invoke-interface {p0, p1, v3, p3, p4}, Ln33;->a(Landroid/content/Context;Ld92;II)Ld92;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eq v3, p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lal;->e()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-interface {p1}, Ld92;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object p3, v0, Lyo0;->h:Lxo0;

    .line 42
    .line 43
    iget-object p3, p3, Lxo0;->a:Lep0;

    .line 44
    .line 45
    invoke-virtual {p3, p0, p1}, Lep0;->c(Ln33;Landroid/graphics/Bitmap;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method

.method public final b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lap0;->b:Ln33;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La51;->b(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lap0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lap0;

    .line 6
    .line 7
    iget-object p0, p0, Lap0;->b:Ln33;

    .line 8
    .line 9
    iget-object p1, p1, Lap0;->b:Ln33;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lap0;->b:Ln33;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
