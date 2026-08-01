.class public Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    .locals 2

    .line 1
    const-wide v0, -0x36a564e3051405a7L    # -2.3733265636790368E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/DeleteMethodInfo$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llin/xposed/hook/view/main/itemview/DeleteMethodInfo$1;-><init>(Llin/xposed/hook/view/main/itemview/DeleteMethodInfo;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getTips()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a564ea051405a7L    # -2.373317035772763E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
