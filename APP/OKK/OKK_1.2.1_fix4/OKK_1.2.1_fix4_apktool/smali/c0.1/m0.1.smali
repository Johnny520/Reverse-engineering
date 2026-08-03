.class public final Lc0/m0;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/n0;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/m0;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/n0;->a:Lc0/n0;

    iput-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/n0;->a:Lc0/n0;

    iput-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/n0;->a:Lc0/n0;

    iput-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    sget-object p1, Lc0/n0;->a:Lc0/n0;

    iput-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 2

    iget v0, p0, Lc0/m0;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, p1, Landroid/view/Menu;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/view/Menu;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, p1}, Lc0/n0;->b(Lc0/n0;Landroid/view/Menu;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 11

    const/16 v0, 0xa

    const/4 v1, 0x0

    iget v2, p0, Lc0/m0;->b:I

    packed-switch v2, :pswitch_data_0

    return-void

    :pswitch_0
    sget-boolean v2, Lc0/n0;->n:Z

    if-nez v2, :cond_11

    iget-object v2, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v2, Lc0/n0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lc0/n0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v3, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v4, v3, Landroid/widget/TextView;

    if-eqz v4, :cond_2

    check-cast v3, Landroid/widget/TextView;

    goto :goto_0

    :cond_2
    move-object v3, v1

    :goto_0
    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const v4, 0x7f090016

    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-static {v3}, Lc0/n0;->c(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    iget-object v4, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v5, "args"

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v5, v4}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    goto/16 :goto_4

    :cond_6
    sget-object v6, Lc0/n0;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-wide/16 v7, 0x0

    if-nez v6, :cond_d

    iget-object v6, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto/16 :goto_4

    :cond_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v6, v3

    move v2, v5

    :goto_1
    if-ge v2, v0, :cond_9

    instance-of v9, v6, Landroid/view/View;

    if-eqz v9, :cond_8

    check-cast v6, Landroid/view/View;

    goto :goto_2

    :cond_8
    move-object v6, v1

    :goto_2
    if-nez v6, :cond_a

    :cond_9
    move-wide v9, v7

    goto :goto_3

    :cond_a
    sget-object v9, Lc0/n0;->a:Lc0/n0;

    invoke-static {v6, v3}, Lc0/n0;->u(Landroid/view/View;Landroid/widget/TextView;)Lc0/j0;

    move-result-object v9

    if-eqz v9, :cond_b

    iget-wide v9, v9, Lc0/j0;->a:J

    goto :goto_3

    :cond_b
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :goto_3
    cmp-long v0, v9, v7

    if-lez v0, :cond_c

    sget-object v0, Lc0/n0;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :cond_c
    move-object v6, v1

    move-wide v7, v9

    :cond_d
    if-nez v6, :cond_e

    goto :goto_4

    :cond_e
    iget-object v0, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lc0/n0;->q(Landroid/widget/TextView;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_4

    :cond_10
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    aput-object v6, p1, v5

    iget-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "rebind edited text msgId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " len="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "->"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :cond_11
    :goto_4
    return-void

    :pswitch_1
    iget-object v0, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_5

    :cond_12
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, v0, Landroid/view/MenuItem;

    if-eqz v2, :cond_13

    move-object v1, v0

    check-cast v1, Landroid/view/MenuItem;

    :cond_13
    if-nez v1, :cond_14

    goto :goto_5

    :cond_14
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x48434544    # 199957.06f

    if-eq v0, v1, :cond_15

    goto :goto_5

    :cond_15
    sget-object v0, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v0, :cond_16

    goto :goto_5

    :cond_16
    iget-object v1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->n(Landroid/widget/TextView;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_5

    :cond_17
    iget-object v1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->A(Landroid/widget/TextView;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_18
    :goto_5
    return-void

    :pswitch_2
    iget-object v2, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/n0;->p()Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_7

    :cond_19
    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_1a

    check-cast p1, Landroid/view/View;

    goto :goto_6

    :cond_1a
    move-object p1, v1

    :goto_6
    if-nez p1, :cond_1b

    goto/16 :goto_7

    :cond_1b
    invoke-static {p1}, Lc0/n0;->c(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_7

    :cond_1c
    iget-object v2, p0, Lc0/m0;->c:Lc0/n0;

    invoke-static {v2, p1}, Lc0/n0;->a(Lc0/n0;Landroid/view/View;)Landroid/widget/TextView;

    move-result-object v2

    if-nez v2, :cond_1d

    goto :goto_7

    :cond_1d
    iget-object v3, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v2}, Lc0/n0;->u(Landroid/view/View;Landroid/widget/TextView;)Lc0/j0;

    move-result-object p1

    sput-object p1, Lc0/n0;->o:Lc0/j0;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lc0/n0;->p:Ljava/lang/ref/WeakReference;

    sget-object p1, Lc0/n0;->o:Lc0/j0;

    if-eqz p1, :cond_1e

    iget-object p1, p1, Lc0/j0;->b:Ljava/lang/String;

    if-nez p1, :cond_1f

    :cond_1e
    iget-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lc0/n0;->y(Landroid/widget/TextView;)Ljava/lang/String;

    move-result-object p1

    :cond_1f
    sput-object p1, Lc0/n0;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lc0/n0;->r:J

    iget-object p1, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lc0/m0;->c:Lc0/n0;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_20
    if-nez v1, :cond_21

    const-string v1, ""

    :cond_21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x20

    invoke-static {v1, v0, v2}, LW0/r;->G0(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "long press target="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " text="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lc0/n0;->C(Ljava/lang/String;)V

    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
