.class public final synthetic L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    const-wide v0, -0x36a57cda051405a7L    # -2.364976034394797E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    iput-object p1, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v0}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;)V

    .line 21
    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->startLoadHook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    iget-object p1, p1, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object p0, p0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    invoke-virtual {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const p2, 0x2406048a

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method
