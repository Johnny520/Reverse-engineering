.class public final synthetic Lkp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lnp;


# direct methods
.method public synthetic constructor <init>(Lnp;I)V
    .locals 0

    iput p2, p0, Lkp;->a:I

    iput-object p1, p0, Lkp;->b:Lnp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    iget p1, p0, Lkp;->a:I

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    iget-object v3, p0, Lkp;->b:Lnp;

    iget-object p1, v3, Lnp;->c:Landroid/widget/EditText;

    const/4 v6, 0x0

    if-nez p1, :cond_0

    const-wide v4, -0x7742fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v6

    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p1, v3, Lnp;->d:Landroid/widget/EditText;

    if-nez p1, :cond_1

    const-wide v7, -0x7750fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object p1, v6

    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_2

    const-wide v4, -0x7761fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v1}, Lnp;->g(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {p1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-nez p1, :cond_3

    const-wide v4, -0x7769fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v1}, Lnp;->g(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_4

    const-wide v4, -0x7774fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v1}, Lnp;->g(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x6

    if-ge p1, v0, :cond_5

    const-wide v4, -0x777afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v1}, Lnp;->g(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_5
    invoke-virtual {v3, v1}, Lnp;->f(Z)V

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LZp;->a:Lnk;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v2, Lfk;

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 v0, 0x3

    invoke-static {p1, v2, v0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lkp;->b:Lnp;

    :try_start_0
    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lm0;->a:Lm0;

    iget-object v3, p1, Lnp;->b:Landroid/app/Activity;

    const/4 v4, 0x0

    if-nez v3, :cond_6

    const-wide v5, -0x4881fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-object v3, v4

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_6
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v5, -0x1742cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x17434fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x1743dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-wide v6, -0x174cdfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p1, Lnp;->c:Landroid/widget/EditText;

    if-nez v0, :cond_7

    const-wide v2, -0x488afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-object v0, v4

    :cond_7
    const-wide v2, -0x4898fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lnp;->d:Landroid/widget/EditText;

    if-nez v0, :cond_8

    const-wide v2, -0x4899fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    goto :goto_2

    :cond_8
    move-object v4, v0

    :goto_2
    const-wide v2, -0x48aafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide v2, -0x48abfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v5}, Lnp;->g(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x48bcfffff835L

    invoke-static {v3, v4, v2, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lnp;->g(Ljava/lang/String;Z)V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
