.class public final L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/content/Context;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/content/Context;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/content/Context;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/net/Uri;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲楪兰(Landroid/net/Uri;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲楪兰(Landroid/net/Uri;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "video"

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    :goto_0
    return p0

    .line 37
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲楪兰(Landroid/net/Uri;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "video"

    .line 50
    .line 51
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_1

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/4 p0, 0x0

    .line 60
    :goto_1
    return p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x180

    .line 5
    .line 6
    const/16 v3, 0x200

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object p0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroid/content/Context;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Landroid/net/Uri;

    .line 17
    .line 18
    new-instance p2, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 19
    .line 20
    new-instance p3, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    invoke-direct {p3, p1}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p4, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲世苏兰;

    .line 26
    .line 27
    invoke-direct {p4, p0, v5, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 35
    .line 36
    if-eq p2, v4, :cond_0

    .line 37
    .line 38
    if-eq p3, v4, :cond_0

    .line 39
    .line 40
    if-gt p2, v3, :cond_0

    .line 41
    .line 42
    if-gt p3, v2, :cond_0

    .line 43
    .line 44
    sget-object p2, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世哲兰;

    .line 45
    .line 46
    invoke-virtual {p4, p2}, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世哲兰;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/lang/Long;

    .line 51
    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    const-wide/16 v2, -0x1

    .line 59
    .line 60
    cmp-long p2, p2, v2

    .line 61
    .line 62
    if-nez p2, :cond_0

    .line 63
    .line 64
    new-instance v1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 65
    .line 66
    new-instance p2, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 67
    .line 68
    invoke-direct {p2, p1}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance p3, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    const/4 v0, 0x1

    .line 78
    invoke-direct {p3, p4, v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/ContentResolver;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, p1, p3}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroid/net/Uri;L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世哲兰;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v1, p2, p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-object v1

    .line 89
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 90
    .line 91
    if-eq p2, v4, :cond_1

    .line 92
    .line 93
    if-eq p3, v4, :cond_1

    .line 94
    .line 95
    if-gt p2, v3, :cond_1

    .line 96
    .line 97
    if-gt p3, v2, :cond_1

    .line 98
    .line 99
    new-instance v1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 100
    .line 101
    new-instance p2, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 102
    .line 103
    invoke-direct {p2, p1}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance p3, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    invoke-direct {p3, p4, v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/ContentResolver;I)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, p1, p3}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroid/net/Uri;L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世哲兰;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-direct {v1, p2, p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-object v1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
