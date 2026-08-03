.class public final synthetic La/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/s4;


# direct methods
.method public synthetic constructor <init>(La/s4;I)V
    .locals 0

    iput p2, p0, La/k4;->a:I

    iput-object p1, p0, La/k4;->b:La/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    const/16 v1, 0xa

    iget v2, p0, La/k4;->a:I

    packed-switch v2, :pswitch_data_0

    sget-object v2, La/s4$a$a$a;->c:La/s4$a$a$a;

    iget-object v3, p0, La/k4;->b:La/s4;

    invoke-virtual {v3, v0, v2}, La/s4;->z(ZLa/s4$a$a$a;)V

    iget-object v0, v3, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_0

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_1

    :cond_0
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v2, La/s4$a$a$a;->b:La/s4$a$a$a;

    iget-object v3, p0, La/k4;->b:La/s4;

    invoke-virtual {v3, v0, v2}, La/s4;->z(ZLa/s4$a$a$a;)V

    iget-object v0, v3, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_2

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_3

    :cond_2
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_3
    return-object v0

    :pswitch_1
    iget-object v0, p0, La/k4;->b:La/s4;

    iget-object v0, v0, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_4

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_5

    :cond_4
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_5
    return-object v0

    :pswitch_2
    iget-object v1, p0, La/k4;->b:La/s4;

    iget-object v2, v1, La/s4;->n:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v2, v1, La/s4;->o:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v2, v1, La/s4;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v2, v1, La/s4;->r:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v2, v1, La/s4;->s:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v2, v1, La/s4;->t:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, v1, La/s4;->w:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, La/x8;->a:La/x8;

    sget-object v0, La/x8;->b:La/ca$b;

    sget-object v2, La/ca$b;->a:La/ca$b;

    if-ne v0, v2, :cond_6

    sget-object v0, La/s4$a$a$a;->a:La/s4$a$a$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, La/s4;->z(ZLa/s4$a$a$a;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    iget-object v0, v1, La/s4;->j:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-virtual {v1, v0}, La/s4;->t(Landroid/widget/ListAdapter;)V

    goto :goto_6

    :cond_6
    sget-object v0, La/s4$a$a;->a:La/s4$a$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[HideMainUI] onMaskListChanged: skip re-hide (state="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/n9;->t([Ljava/lang/Object;)V

    iget-object v0, v1, La/s4;->j:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-virtual {v1, v0}, La/s4;->t(Landroid/widget/ListAdapter;)V

    :cond_7
    :goto_6
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_3
    iget-object v0, p0, La/k4;->b:La/s4;

    iget-object v0, v0, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_8

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_8

    :cond_8
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_8
    return-object v0

    :pswitch_4
    iget-object v0, p0, La/k4;->b:La/s4;

    iget-object v0, v0, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_a

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_a

    :cond_a
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_a
    return-object v0

    :pswitch_5
    iget-object v0, p0, La/k4;->b:La/s4;

    iget-object v0, v0, La/s4;->k:Ljava/lang/ClassLoader;

    if-nez v0, :cond_c

    sget-object v0, La/Wf;->a:La/Wf;

    goto :goto_c

    :cond_c
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-virtual {v2}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_d
    invoke-static {v0, v3}, La/w1;->V(Ljava/lang/ClassLoader;Ljava/util/List;)V

    sget-object v0, La/Wf;->a:La/Wf;

    :goto_c
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
