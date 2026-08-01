.class public final L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide p2, -0x36a50f73051405a7L    # -2.4030971873962158E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object p3, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->mandatoryUpdate()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p3}, Llin/xposed/hook/javaplugin/JavaPluginLoad;->showPluginDialog(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_2
    :goto_0
    check-cast p3, Landroid/app/Activity;

    .line 42
    .line 43
    new-instance p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世兰哲;

    .line 44
    .line 45
    invoke-direct {p1, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p3, p1}, Llin/xposed/hook/view/main/itemview/Update;->showUpdateDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    return-object p2
.end method
