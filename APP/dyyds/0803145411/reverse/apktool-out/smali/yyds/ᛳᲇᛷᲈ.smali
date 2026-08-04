.class public final Lyyds/ᛳᲇᛷᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛳᛸᲁ;


# instance fields
.field public final ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛳᛸᲁ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛳᲇᛷᲈ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛳᲇᛷᲈ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

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
    iget-object p0, p0, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

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

.method public final ᛲᲈᲁ(Landroid/content/Context;Lyyds/ᲁᛱᛸᛵ;II)Lyyds/ᲁᛱᛸᛵ;
    .locals 4

    .line 1
    invoke-interface {p2}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lyyds/ᲇᛱᛴᛲ;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

    .line 12
    .line 13
    iget-object v2, v0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 14
    .line 15
    iget-object v2, v2, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 16
    .line 17
    iget-object v2, v2, Lyyds/ᲇᛴᲈᛷ;->ᛷᛵᲇᲀ:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    new-instance v3, Lyyds/ᛳᛸᛵᲈ;

    .line 20
    .line 21
    invoke-direct {v3, v2, v1}, Lyyds/ᛳᛸᛵᲈ;-><init>(Landroid/graphics/Bitmap;Lyyds/ᲈᛱᛸᛴ;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 25
    .line 26
    invoke-interface {p0, p1, v3, p3, p4}, Lyyds/ᛳᛳᛸᲁ;->ᛲᲈᲁ(Landroid/content/Context;Lyyds/ᲁᛱᛸᛵ;II)Lyyds/ᲁᛱᛸᛵ;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eq v3, p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lyyds/ᛳᛸᛵᲈ;->ᛲᛴᛳᛲ()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-interface {p1}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object p3, v0, Lyyds/ᲇᛱᛴᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛸᛲᛸ;

    .line 42
    .line 43
    iget-object p3, p3, Lyyds/ᲇᛸᛲᛸ;->ᛲᲈᲁ:Lyyds/ᲇᛴᲈᛷ;

    .line 44
    .line 45
    invoke-virtual {p3, p0, p1}, Lyyds/ᲇᛴᲈᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛳᛳᛸᲁ;Landroid/graphics/Bitmap;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲇᛷᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyyds/ᛶᲀᛶᲀ;->ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
