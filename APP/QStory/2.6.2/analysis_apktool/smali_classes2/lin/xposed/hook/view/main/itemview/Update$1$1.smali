.class Llin/xposed/hook/view/main/itemview/Update$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lretrofit2/飘花落叶言子楪苏世兰哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/view/main/itemview/Update$1;->onResponse(Lretrofit2/飘花落叶言子楪世兰苏哲;Lretrofit2/飘花落叶言子世兰楪哲苏;)V
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
.field final synthetic this$1:Llin/xposed/hook/view/main/itemview/Update$1;


# direct methods
.method public constructor <init>(Llin/xposed/hook/view/main/itemview/Update$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/Update$1$1;->this$1:Llin/xposed/hook/view/main/itemview/Update$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static synthetic lambda$onResponse$0(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->mandatoryUpdate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->getUpdateUrl()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Llin/xposed/hook/view/main/itemview/Update;->jumpToBrowserUpdates(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->hasUpdate()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/app/Activity;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {p0, v0}, Llin/xposed/hook/view/main/itemview/Update;->showUpdateDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-wide v0, -0x36a56483051405a7L    # -2.3734572321079344E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/view/main/itemview/Update$1$1;->lambda$onResponse$0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/飘花落叶言子楪世兰苏哲;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/UpdateInfo;",
            ">;>;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x36a56492051405a7L    # -2.373436815165919E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-wide p0, -0x36a56484051405a7L    # -2.3734558709784667E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-static {p0, p1, p2, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public onResponse(Lretrofit2/飘花落叶言子楪世兰苏哲;Lretrofit2/飘花落叶言子世兰楪哲苏;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/UpdateInfo;",
            ">;>;>;",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/UpdateInfo;",
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
    invoke-virtual {p1}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-static {p1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪苏世哲兰(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/Update$1$1;->this$1:Llin/xposed/hook/view/main/itemview/Update$1;

    .line 27
    .line 28
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/Update$1;->val$v:Landroid/view/View;

    .line 29
    .line 30
    new-instance p2, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    invoke-direct {p2, p0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰哲苏;-><init>(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
