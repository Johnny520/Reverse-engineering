.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2, p0, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v4, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-object v1

    .line 53
    :pswitch_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ne v0, v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-ne v0, v2, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2, p0, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p0, v4, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/app/Activity;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-object v1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
