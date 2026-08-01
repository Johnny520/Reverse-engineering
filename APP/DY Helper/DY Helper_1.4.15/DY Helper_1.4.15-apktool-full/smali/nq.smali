.class public final Lnq;
.super Ljava/util/LinkedHashMap;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(IFZI)V
    .locals 0

    .line 13
    iput p4, p0, Lnq;->ε:I

    invoke-direct {p0, p1, p2, p3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    return-void
.end method

.method public constructor <init>(Ly21;)V
    .locals 2

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Lnq;->ε:I

    .line 3
    .line 4
    const/high16 p1, 0x3f400000    # 0.75f

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/16 v1, 0x1f4

    .line 8
    .line 9
    invoke-direct {p0, v1, p1, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    instance-of v0, p1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    return p0

    .line 24
    :pswitch_1
    instance-of v0, p1, Ljava/lang/String;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_1
    return p0

    .line 37
    :pswitch_2
    instance-of v0, p1, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    :goto_2
    return p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    instance-of v0, p1, Landroid/graphics/Bitmap;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    return p0

    .line 24
    :pswitch_1
    instance-of v0, p1, Landroid/graphics/Bitmap;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 31
    .line 32
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_1
    return p0

    .line 37
    :pswitch_2
    instance-of v0, p1, Liq;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    check-cast p1, Liq;

    .line 44
    .line 45
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    :goto_2
    return p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    instance-of v0, p1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/graphics/Bitmap;

    .line 24
    .line 25
    :goto_0
    return-object p0

    .line 26
    :pswitch_1
    instance-of v0, p1, Ljava/lang/String;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/graphics/Bitmap;

    .line 39
    .line 40
    :goto_1
    return-object p0

    .line 41
    :pswitch_2
    instance-of v0, p1, Ljava/lang/String;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Liq;

    .line 54
    .line 55
    :goto_2
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    instance-of v0, p1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    check-cast p2, Landroid/graphics/Bitmap;

    .line 19
    .line 20
    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object p2, p0

    .line 25
    check-cast p2, Landroid/graphics/Bitmap;

    .line 26
    .line 27
    :goto_0
    return-object p2

    .line 28
    :pswitch_1
    instance-of v0, p1, Ljava/lang/String;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    check-cast p2, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move-object p2, p0

    .line 42
    check-cast p2, Landroid/graphics/Bitmap;

    .line 43
    .line 44
    :goto_1
    return-object p2

    .line 45
    :pswitch_2
    instance-of v0, p1, Ljava/lang/String;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    check-cast p2, Liq;

    .line 53
    .line 54
    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    move-object p2, p0

    .line 59
    check-cast p2, Liq;

    .line 60
    .line 61
    :goto_2
    return-object p2

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnq;->ε:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 71
    :pswitch_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 72
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    :goto_0
    return-object p0

    .line 73
    :pswitch_1
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 74
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    :goto_1
    return-object p0

    .line 75
    :pswitch_2
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    :cond_2
    check-cast p1, Ljava/lang/String;

    .line 76
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liq;

    :goto_2
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    instance-of v0, p1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    instance-of v0, p2, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    check-cast p2, Landroid/graphics/Bitmap;

    .line 25
    .line 26
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    return v1

    .line 31
    :pswitch_1
    instance-of v0, p1, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    instance-of v0, p2, Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    check-cast p2, Landroid/graphics/Bitmap;

    .line 45
    .line 46
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_1
    return v1

    .line 51
    :pswitch_2
    instance-of v0, p1, Ljava/lang/String;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    instance-of v0, p2, Liq;

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    check-cast p1, Ljava/lang/String;

    .line 63
    .line 64
    check-cast p2, Liq;

    .line 65
    .line 66
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    :goto_2
    return v1

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 0

    .line 1
    iget p1, p0, Lnq;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/16 p1, 0x1f4

    .line 11
    .line 12
    if-le p0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    return p0

    .line 18
    :pswitch_0
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/16 p1, 0x32

    .line 23
    .line 24
    if-le p0, p1, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    :goto_1
    return p0

    .line 30
    :pswitch_1
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/16 p1, 0x3c

    .line 35
    .line 36
    if-le p0, p1, :cond_2

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    :goto_2
    return p0

    .line 42
    :pswitch_2
    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    const/16 p1, 0x20

    .line 47
    .line 48
    if-le p0, p1, :cond_3

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/4 p0, 0x0

    .line 53
    :goto_3
    return p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
