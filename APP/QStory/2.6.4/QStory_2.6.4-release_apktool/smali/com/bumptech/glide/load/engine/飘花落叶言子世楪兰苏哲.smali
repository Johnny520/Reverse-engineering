.class public final Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget p0, p1, Landroid/os/Message;->what:I

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    throw p0

    .line 22
    :cond_1
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    throw p0

    .line 29
    :pswitch_0
    iget p0, p1, Landroid/os/Message;->what:I

    .line 30
    .line 31
    if-ne p0, v1, :cond_2

    .line 32
    .line 33
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 36
    .line 37
    invoke-interface {p0}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->recycle()V

    .line 38
    .line 39
    .line 40
    move v0, v1

    .line 41
    :cond_2
    return v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
