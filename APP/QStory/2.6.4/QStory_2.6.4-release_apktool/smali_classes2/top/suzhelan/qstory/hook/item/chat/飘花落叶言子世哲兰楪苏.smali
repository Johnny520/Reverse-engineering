.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
