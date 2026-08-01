.class public final L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    :goto_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_0
    check-cast p1, Ljava/net/URL;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object p1, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v2, 0x2f

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/io/File;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    new-instance v0, Ljava/io/File;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p1, v0

    .line 59
    :goto_0
    if-eqz p1, :cond_4

    .line 60
    .line 61
    invoke-interface {p0, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-interface {p0, p1, p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_4
    :goto_1
    return-object v1

    .line 73
    :pswitch_0
    check-cast p1, Ljava/net/URL;

    .line 74
    .line 75
    new-instance v0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;

    .line 76
    .line 77
    invoke-direct {v0, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;-><init>(Ljava/net/URL;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p0, v0, p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
