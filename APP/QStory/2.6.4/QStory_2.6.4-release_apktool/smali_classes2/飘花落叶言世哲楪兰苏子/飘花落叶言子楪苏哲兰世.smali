.class public final L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    iput-object p1, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

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
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

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
    iget-object p3, p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    check-cast p3, Landroid/app/Activity;

    .line 28
    .line 29
    new-instance p1, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲世兰;

    .line 30
    .line 31
    invoke-direct {p1, p0}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏哲兰世;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p3, p1}, Llin/xposed/hook/view/main/itemview/Update;->showUpdateDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_1
    new-instance p0, Landroid/content/Intent;

    .line 39
    .line 40
    const-class p1, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 41
    .line 42
    invoke-direct {p0, p3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method
