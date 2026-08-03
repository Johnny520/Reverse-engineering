.class public final synthetic LN7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;I)V
    .locals 0

    iput p3, p0, LN7;->a:I

    iput-object p1, p0, LN7;->b:Ljava/util/ArrayList;

    iput-object p2, p0, LN7;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    iget p1, p0, LN7;->a:I

    const/4 p2, 0x0

    iget-object v0, p0, LN7;->c:Landroid/content/Context;

    iget-object v1, p0, LN7;->b:Ljava/util/ArrayList;

    packed-switch p1, :pswitch_data_0

    sget-object p1, LGb;->g:Lm6;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lm6;->m(Ljava/util/List;)V

    const-wide v1, -0x15e7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_0
    invoke-static {v1}, Lsa;->Z(Ljava/util/Collection;)LGl;

    move-result-object v1

    const-wide v2, -0xe39bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LNx;->d(Ljava/lang/String;)V

    sget-object p1, LTB;->e:LX7;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LX7;->c()V

    :cond_0
    const-wide v1, -0xe39dfffff835L

    invoke-static {v1, v2, v0, p2}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7;

    iget-boolean v3, v3, LO7;->c:Z

    if-eqz v3, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7;

    iget v1, v1, LO7;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v1, -0xe391fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LNx;->d(Ljava/lang/String;)V

    sget-object p1, LTB;->e:LX7;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LX7;->c()V

    :cond_4
    const-wide v1, -0xe393fffff835L

    invoke-static {v1, v2, v0, p2}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
