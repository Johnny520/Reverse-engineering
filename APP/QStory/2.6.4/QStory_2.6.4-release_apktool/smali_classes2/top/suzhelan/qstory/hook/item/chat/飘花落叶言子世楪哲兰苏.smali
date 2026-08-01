.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:J


# direct methods
.method public synthetic constructor <init>(JLandroid/widget/EditText;L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:J

    .line 5
    .line 6
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

    .line 7
    .line 8
    iput-object p4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-wide v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏兰世:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x900

    .line 28
    .line 29
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
