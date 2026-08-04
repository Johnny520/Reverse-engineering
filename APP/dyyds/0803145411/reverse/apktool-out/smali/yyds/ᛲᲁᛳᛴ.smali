.class public final Lyyds/ᛲᲁᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛳᛸᲁ;


# instance fields
.field public final ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

.field public final ᲀᛲᛳᲀ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛳᛳᛸᲁ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛲᲁᛳᛴ;->ᲀᛲᛳᲀ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛲᲁᛳᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛲᲁᛳᛴ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

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
    iget-object p0, p0, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

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
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛴ;

    .line 6
    .line 7
    invoke-interface {p2}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-static {v0, v1, p3, p4}, Lyyds/ᛴᛲᛴᛲ;->ᛶᛷᛲᲁ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/drawable/Drawable;II)Lyyds/ᛳᛸᛵᲈ;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean p0, p0, Lyyds/ᛲᲁᛳᛴ;->ᲀᛲᛳᲀ:Z

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    const-string p0, "Unable to convert "

    .line 25
    .line 26
    const-string p1, " to a Bitmap"

    .line 27
    .line 28
    invoke-static {v1, p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    iget-object p0, p0, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 34
    .line 35
    invoke-interface {p0, p1, v0, p3, p4}, Lyyds/ᛳᛳᛸᲁ;->ᛲᲈᲁ(Landroid/content/Context;Lyyds/ᲁᛱᛸᛵ;II)Lyyds/ᲁᛱᛸᛵ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lyyds/ᛳᛸᛵᲈ;

    .line 54
    .line 55
    invoke-direct {p2, p1, p0}, Lyyds/ᛳᛸᛵᲈ;-><init>(Landroid/content/res/Resources;Lyyds/ᲁᛱᛸᛵ;)V

    .line 56
    .line 57
    .line 58
    return-object p2
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛲᲁᛳᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛳᛸᲁ;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyyds/ᛶᲀᛶᲀ;->ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
