.class Llin/xposed/hook/view/main/itemview/AddQQGroup$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lretrofit2/飘花落叶言子楪苏世兰哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/view/main/itemview/AddQQGroup;->getOnClick()Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/view/main/itemview/AddQQGroup;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method public constructor <init>(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;->this$0:Llin/xposed/hook/view/main/itemview/AddQQGroup;

    .line 2
    .line 3
    iput-object p2, p0, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;->val$v:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/飘花落叶言子楪世兰苏哲;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    const-wide p0, -0x36a56547051405a7L    # -2.3731904507322684E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v0, v1, p2, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onResponse(Lretrofit2/飘花落叶言子楪世兰苏哲;Lretrofit2/飘花落叶言子世兰楪哲苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p2, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Ltop/suzhelan/qstory/entity/QSResult;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ltop/suzhelan/qstory/entity/QSResult;->isSuccess()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;->this$0:Llin/xposed/hook/view/main/itemview/AddQQGroup;

    .line 17
    .line 18
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;->val$v:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p2, p0, p1}, Llin/xposed/hook/view/main/itemview/AddQQGroup;->飘花落叶言子楪世哲苏兰(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/content/Context;Ltop/suzhelan/qstory/entity/QSResult;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
