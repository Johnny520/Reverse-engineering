.class public final synthetic Lc0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lc0/p1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lc0/p1;I)V
    .locals 0

    iput p3, p0, Lc0/l1;->a:I

    iput-object p1, p0, Lc0/l1;->b:Ljava/lang/String;

    iput-object p2, p0, Lc0/l1;->c:Lc0/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc0/l1;->b:Ljava/lang/String;

    const-string v1, "$result"

    iget-object v2, p0, Lc0/l1;->c:Lc0/p1;

    iget v3, p0, Lc0/l1;->a:I

    packed-switch v3, :pswitch_data_0

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/q1;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const v4, 0x7e000001

    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lc0/q1;->a:Lc0/q1;

    move-object v4, v2

    check-cast v4, Lc0/n1;

    iget-object v4, v4, Lc0/n1;->a:Ljava/lang/String;

    invoke-static {v3, v0, v4}, Lc0/q1;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void

    :pswitch_0
    const-string v3, "$sender"

    invoke-static {v0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/q1;->a:Lc0/q1;

    check-cast v2, Lc0/n1;

    sget-object v1, Lc0/q1;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v1, :cond_3

    new-instance v3, Lc0/P;

    iget-object v2, v2, Lc0/n1;->a:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, v2}, Lc0/P;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v3}, LE0/s;->n0(Ljava/util/List;LP0/l;)V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
