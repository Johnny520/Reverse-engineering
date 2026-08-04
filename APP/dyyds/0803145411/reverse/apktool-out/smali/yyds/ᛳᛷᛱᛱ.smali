.class public final Lyyds/ᛳᛷᛱᛱ;
.super Ljava/util/AbstractSet;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast v1, Lyyds/ᛷᛶᲁᛵ;

    .line 13
    .line 14
    invoke-virtual {v1}, Lyyds/ᛷᛶᲁᛵ;->clear()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    check-cast v1, Lyyds/ᛷᛶᲁᛵ;

    .line 19
    .line 20
    invoke-virtual {v1}, Lyyds/ᛷᛶᲁᛵ;->clear()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast v1, Lyyds/ᛷᛶᲁᛵ;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lyyds/ᛷᛶᲁᛵ;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    instance-of p0, p1, Ljava/util/Map$Entry;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    check-cast v1, Lyyds/ᛷᛶᲁᛵ;

    .line 26
    .line 27
    check-cast p1, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    :try_start_0
    invoke-virtual {v1, p0, v0}, Lyyds/ᛷᛶᲁᛵ;->ᛲᲈᲁ(Ljava/lang/Object;Z)Lyyds/ᲈᛱᛴ;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    :cond_0
    move-object p0, v2

    .line 42
    :goto_0
    if-eqz p0, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lyyds/ᲈᛱᛴ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    move-object v2, p0

    .line 57
    :cond_1
    if-eqz v2, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    :cond_2
    return v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lyyds/ᛶᛴᛴ;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛷᛲᲇᲀ;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lyyds/ᛶᛴᛴ;-><init>(Lyyds/ᛷᛲᲇᲀ;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Lyyds/ᲁᛱᛵᛳ;

    .line 17
    .line 18
    check-cast p0, Lyyds/ᛷᛶᲁᛵ;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p0, v1}, Lyyds/ᲁᛱᛵᛳ;-><init>(Lyyds/ᛷᛶᲁᛵ;I)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    new-instance v0, Lyyds/ᲁᛱᛵᛳ;

    .line 26
    .line 27
    check-cast p0, Lyyds/ᛷᛶᲁᛵ;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, v1}, Lyyds/ᲁᛱᛵᛳ;-><init>(Lyyds/ᛷᛶᲁᛵ;I)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_0
    check-cast v2, Lyyds/ᛷᛶᲁᛵ;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v2, p1, v3}, Lyyds/ᛷᛶᲁᛵ;->ᛲᲈᲁ(Ljava/lang/Object;Z)Lyyds/ᲈᛱᛴ;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :catch_0
    :cond_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, v1, v4}, Lyyds/ᛷᛶᲁᛵ;->ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛴ;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    if-eqz v1, :cond_2

    .line 30
    .line 31
    move v3, v4

    .line 32
    :cond_2
    return v3

    .line 33
    :pswitch_1
    check-cast v2, Lyyds/ᛷᛶᲁᛵ;

    .line 34
    .line 35
    instance-of p0, p1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_4

    .line 47
    .line 48
    :try_start_1
    invoke-virtual {v2, p0, v3}, Lyyds/ᛷᛶᲁᛵ;->ᛲᲈᲁ(Ljava/lang/Object;Z)Lyyds/ᲈᛱᛴ;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    goto :goto_0

    .line 53
    :catch_1
    :cond_4
    move-object p0, v1

    .line 54
    :goto_0
    if-eqz p0, :cond_5

    .line 55
    .line 56
    iget-object v0, p0, Lyyds/ᲈᛱᛴ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    move-object v1, p0

    .line 69
    :cond_5
    if-nez v1, :cond_6

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_6
    invoke-virtual {v2, v1, v4}, Lyyds/ᛷᛶᲁᛵ;->ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛴ;Z)V

    .line 73
    .line 74
    .line 75
    move v3, v4

    .line 76
    :goto_1
    return v3

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/Map;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyyds/ᛷᛲᲇᲀ;

    .line 9
    .line 10
    iget p0, p0, Lyyds/ᛴᲈᛲᛷ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p0, Lyyds/ᛷᛶᲁᛵ;

    .line 14
    .line 15
    iget p0, p0, Lyyds/ᛷᛶᲁᛵ;->ᲇᲇᲇᛱ:I

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_1
    check-cast p0, Lyyds/ᛷᛶᲁᛵ;

    .line 19
    .line 20
    iget p0, p0, Lyyds/ᛷᛶᲁᛵ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
