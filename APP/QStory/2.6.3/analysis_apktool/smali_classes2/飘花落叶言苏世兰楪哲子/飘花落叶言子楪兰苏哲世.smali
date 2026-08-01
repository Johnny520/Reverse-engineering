.class public final L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ljava/util/List;Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 16
    .line 17
    iget-object v2, v1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 18
    .line 19
    if-ne v2, p1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;->setCheckedImmediate(Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;

    .line 43
    .line 44
    iget-object v1, v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    new-instance v2, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 53
    .line 54
    const/16 v3, 0xc

    .line 55
    .line 56
    invoke-direct {v2, p0, v3, v0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    return-void
.end method
