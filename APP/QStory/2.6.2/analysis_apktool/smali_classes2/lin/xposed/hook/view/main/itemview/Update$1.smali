.class Llin/xposed/hook/view/main/itemview/Update$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lretrofit2/飘花落叶言子楪苏世兰哲;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/view/main/itemview/Update;->getOnClick()Landroid/view/View$OnClickListener;
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
.field final synthetic this$0:Llin/xposed/hook/view/main/itemview/Update;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method public constructor <init>(Llin/xposed/hook/view/main/itemview/Update;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/Update$1;->this$0:Llin/xposed/hook/view/main/itemview/Update;

    .line 2
    .line 3
    iput-object p2, p0, Llin/xposed/hook/view/main/itemview/Update$1;->val$v:Landroid/view/View;

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
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ltop/suzhelan/qstory/entity/HasUpdate;",
            ">;>;",
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
    const-wide v0, -0x36a56473051405a7L    # -2.3734790101794173E45

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
            "Ltop/suzhelan/qstory/entity/HasUpdate;",
            ">;>;",
            "Lretrofit2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u696a\u54f2\u82cf<",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ltop/suzhelan/qstory/entity/HasUpdate;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p2, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ltop/suzhelan/qstory/entity/QSResult;

    .line 4
    .line 5
    invoke-virtual {p1}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ltop/suzhelan/qstory/entity/HasUpdate;

    .line 10
    .line 11
    invoke-static {p1}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世兰哲苏(Ltop/suzhelan/qstory/entity/HasUpdate;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 p2, 0x106

    .line 19
    .line 20
    invoke-interface {p1, p2}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Llin/xposed/hook/view/main/itemview/Update$1$1;

    .line 25
    .line 26
    invoke-direct {p2, p0}, Llin/xposed/hook/view/main/itemview/Update$1$1;-><init>(Llin/xposed/hook/view/main/itemview/Update$1;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
