.class public final Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(ILandroidx/viewpager2/widget/飘花落叶言子楪哲苏世兰;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 24
    iput-object p2, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 25
    iput p3, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput p2, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p3, 0x3

    .line 2
    iput p3, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string p3, "initCallbacks cannot be null"

    .line 8
    .line 9
    invoke-static {p1, p3}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    :goto_0
    if-ge v3, v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    :goto_1
    if-ge v3, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_0
    check-cast p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 50
    .line 51
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, L飘花落叶言子哲楪世兰苏/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, v1}, L飘花落叶言子哲楪世兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :pswitch_1
    check-cast p0, Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 62
    .line 63
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰楪世哲(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰楪世哲(I)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
