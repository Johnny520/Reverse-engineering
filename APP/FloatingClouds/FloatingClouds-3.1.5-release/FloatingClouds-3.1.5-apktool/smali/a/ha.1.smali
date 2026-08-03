.class public final synthetic La/ha;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/jc;

.field public final synthetic c:La/ra;


# direct methods
.method public synthetic constructor <init>(La/jc;La/ra;I)V
    .locals 0

    .line 2
    iput p3, p0, La/ha;->a:I

    iput-object p1, p0, La/ha;->b:La/jc;

    iput-object p2, p0, La/ha;->c:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ra;La/jc;)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    iput v0, p0, La/ha;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ha;->c:La/ra;

    iput-object p2, p0, La/ha;->b:La/jc;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, La/ha;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->z:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->I:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->H:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->G:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->F:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->K:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->J:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->D:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->M:Z

    iget-object v1, p0, La/ha;->c:La/ra;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    if-eqz p1, :cond_0

    sget-object p1, La/K3;->a:La/K3$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :try_start_0
    invoke-static {}, La/K3$a;->j()Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v2, La/K3;->f:Ljava/lang/String;

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move v0, p1

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u5c4f\u853d\u5fae\u4fe1\u70ed\u66f4\u65b0"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u5f00\u542f\u540e\u5fae\u4fe1\u70ed\u8865\u4e01\u5c06\u88ab\u62e6\u622a\uff1a\n\n\u2022 \u4ee3\u4ef7\uff1a\u65e0\u6cd5\u901a\u8fc7\u70ed\u8865\u4e01\u81ea\u4fee\u590d\n\u2022 \u6536\u76ca\uff1a\u9690\u79c1Hook\u957f\u671f\u7a33\u5b9a"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/g0;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, La/g0;-><init>(I)V

    const-string v3, "\u6211\u5df2\u77e5\u6653"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/pa;

    const/4 v3, 0x6

    invoke-direct {v2, v1, v3}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u5173\u95ed\u6b64\u529f\u80fd"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    invoke-virtual {v1, p1}, La/ra;->o(Landroid/app/AlertDialog;)V

    :cond_0
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->r:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->a:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->p:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_b
    iget-object v0, p0, La/ha;->b:La/jc;

    iget-object v1, p0, La/ha;->c:La/ra;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, La/jc;->o:Z

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/h8;->l:La/h8;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La/h8;->j()V

    :cond_1
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->n:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->q:Z

    iget-object v1, p0, La/ha;->c:La/ra;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object v0, La/s4;->I:La/s4;

    if-eqz v0, :cond_2

    iget-object v1, v0, La/s4;->C:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    new-instance v2, La/n4;

    invoke-direct {v2, p1}, La/n4;-><init>(Z)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, La/j4;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La/j4;-><init>(La/s4;I)V

    const-wide/16 v2, 0x12c

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->c:La/ra;

    iget-boolean v1, v0, La/ra;->i:Z

    if-nez v1, :cond_5

    iget-object v1, p0, La/ha;->b:La/jc;

    iput-boolean p1, v1, La/jc;->t:Z

    invoke-static {v1}, La/ra;->i(La/jc;)V

    iget-object p1, v0, La/ra;->h:Landroid/widget/Switch;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->t:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-static {}, La/x8;->a()Z

    move-result v1

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-eq v4, v1, :cond_5

    iput-boolean v3, v0, La/ra;->i:Z

    invoke-virtual {p1, v1}, Landroid/widget/Switch;->setChecked(Z)V

    iput-boolean v2, v0, La/ra;->i:Z

    :cond_5
    :goto_2
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->s:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->O:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->N:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/ze;->C(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_6
    const/16 p1, 0x320

    :goto_3
    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->y:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->x:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/ze;->C(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_4

    :cond_7
    const/16 p1, 0x1f4

    :goto_4
    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->w:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/ze;->C(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_5

    :cond_8
    const/4 p1, 0x3

    :goto_5
    iget-object v0, p0, La/ha;->b:La/jc;

    iput p1, v0, La/jc;->v:I

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->u:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ha;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->V:Ljava/lang/String;

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ha;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->U:Ljava/lang/String;

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ha;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->T:Ljava/lang/String;

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/ha;->b:La/jc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, La/jc;->S:Ljava/lang/String;

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->R:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La/ha;->b:La/jc;

    iput-boolean p1, v0, La/jc;->L:Z

    iget-object p1, p0, La/ha;->c:La/ra;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/ra;->i(La/jc;)V

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
