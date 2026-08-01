.class public final synthetic L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    const/16 v0, 0x50d

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    iput-object p1, v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {v0}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;)V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->startLoadHook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, p1}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;

    .line 35
    .line 36
    iget-object p1, p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲世兰;

    .line 41
    .line 42
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const p2, 0x2406048a

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method
