.class public final synthetic LR9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(LGb;Landroid/widget/ListView;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LR9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9;->b:Ljava/lang/Object;

    iput-object p2, p0, LR9;->d:Landroid/view/KeyEvent$Callback;

    iput-boolean p3, p0, LR9;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lha;ZLandroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p4, p0, LR9;->a:I

    iput-object p1, p0, LR9;->b:Ljava/lang/Object;

    iput-boolean p2, p0, LR9;->c:Z

    iput-object p3, p0, LR9;->d:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, LR9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LR9;->b:Ljava/lang/Object;

    check-cast v0, LGb;

    iget-object v1, p0, LR9;->d:Landroid/view/KeyEvent$Callback;

    check-cast v1, Landroid/widget/ListView;

    iget-boolean v2, p0, LR9;->c:Z

    check-cast p1, LHb;

    const-wide v3, -0x1593fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sput-object p1, LNb;->c:LHb;

    invoke-virtual {v0, p1}, LGb;->a(LHb;)V

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    const-wide v3, -0x159dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {p1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    const-wide v3, -0x1467fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/BaseAdapter;

    if-nez v2, :cond_5

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v2, -0x21467fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbG;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v2, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    instance-of v4, v2, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_1

    check-cast v2, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-wide v4, -0x21441fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_3

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_4

    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_3

    :cond_4
    move-object v0, v3

    :goto_3
    if-eqz v0, :cond_5

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :goto_4
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    iget-object v0, p0, LR9;->b:Ljava/lang/Object;

    check-cast v0, Lha;

    iget-boolean v1, p0, LR9;->c:Z

    iget-object v2, p0, LR9;->d:Landroid/view/KeyEvent$Callback;

    check-cast v2, Landroid/app/Activity;

    check-cast p1, Ljava/lang/String;

    const-wide v3, -0x5cb0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, LS9;

    invoke-direct {v4, v0, v1, v2, p1}, LS9;-><init>(Lha;ZLandroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :pswitch_1
    iget-object v0, p0, LR9;->b:Ljava/lang/Object;

    check-cast v0, Lha;

    iget-boolean v1, p0, LR9;->c:Z

    iget-object v2, p0, LR9;->d:Landroid/view/KeyEvent$Callback;

    check-cast v2, Landroid/app/Activity;

    check-cast p1, Ljava/lang/String;

    const-wide v3, -0x5ca0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v3, LEA;->a:LEA;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEA;->j(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, LT9;

    invoke-direct {v3, v0, v1, v2}, LT9;-><init>(Lha;ZLandroid/app/Activity;)V

    invoke-virtual {p1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
