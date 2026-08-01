.class public final synthetic L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iget-object p1, p0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 28
    .line 29
    iget-object v2, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    iget-object v1, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    xor-int/2addr v3, v0

    .line 46
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    iget-object p0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-virtual {p0, p1}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪苏兰哲(Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    iget-object p0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪苏兰哲(Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
