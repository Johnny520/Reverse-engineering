.class public Llin/xposed/hook/view/main/itemview/EndAllActivity;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLeftText()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x3ea

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/EndAllActivity$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llin/xposed/hook/view/main/itemview/EndAllActivity$1;-><init>(Llin/xposed/hook/view/main/itemview/EndAllActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
