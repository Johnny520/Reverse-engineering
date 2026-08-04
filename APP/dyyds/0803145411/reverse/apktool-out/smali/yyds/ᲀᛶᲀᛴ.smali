.class public final Lyyds/ᲀᛶᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛳᛸᲁ;


# instance fields
.field public final ᛵᛸᛸᛷ:Ljava/util/List;


# direct methods
.method public varargs constructor <init>([Lyyds/ᛳᛳᛸᲁ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "MultiTransformation must contain at least one Transformation"

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲀᛶᲀᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲀᛶᲀᛴ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛲᲈᲁ(Landroid/content/Context;Lyyds/ᲁᛱᛸᛵ;II)Lyyds/ᲁᛱᛸᛵ;
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    move-object v0, p2

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lyyds/ᛳᛳᛸᲁ;

    .line 19
    .line 20
    invoke-interface {v1, p1, v0, p3, p4}, Lyyds/ᛳᛳᛸᲁ;->ᛲᲈᲁ(Landroid/content/Context;Lyyds/ᲁᛱᛸᛵ;II)Lyyds/ᲁᛱᛸᛵ;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V

    .line 39
    .line 40
    .line 41
    :cond_0
    move-object v0, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛶᲀᛴ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lyyds/ᛳᛳᛸᲁ;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lyyds/ᛶᲀᛶᲀ;->ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method
