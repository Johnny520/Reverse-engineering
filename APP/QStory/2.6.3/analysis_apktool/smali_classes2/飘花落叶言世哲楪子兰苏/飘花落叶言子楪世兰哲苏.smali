.class public final L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    iput-object p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

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
    const-string p2, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 6
    .line 7
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 p2, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p3, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->mandatoryUpdate()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p3}, Llin/xposed/hook/javaplugin/JavaPluginLoad;->showOnlinePluginDialog(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_2
    :goto_0
    check-cast p3, Landroid/app/Activity;

    .line 39
    .line 40
    new-instance p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    invoke-direct {p1, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p3, p1}, Llin/xposed/hook/view/main/itemview/Update;->showUpdateDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method
