.class public final LlD;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public e:I

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLEb;)V
    .locals 0

    iput-object p1, p0, LlD;->f:Landroid/content/Context;

    iput-boolean p2, p0, LlD;->g:Z

    invoke-direct {p0, p3}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LlD;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LlD;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LlD;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 2

    new-instance p2, LlD;

    iget-object v0, p0, LlD;->f:Landroid/content/Context;

    iget-boolean v1, p0, LlD;->g:Z

    invoke-direct {p2, v0, v1, p1}, LlD;-><init>(Landroid/content/Context;ZLEb;)V

    return-object p2
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LlD;->e:I

    const/4 v1, 0x0

    iget-boolean v2, p0, LlD;->g:Z

    const/4 v3, 0x1

    iget-object v4, p0, LlD;->f:Landroid/content/Context;

    if-eqz v0, :cond_1

    if-ne v0, v3, :cond_0

    :try_start_0
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x1a6bcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, LmD;->a:LmD;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LmD;->d()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-wide v5, -0x1a693fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-interface {p1, v0, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object p1, LNs;->a:LNs;

    iput v3, p0, LlD;->e:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    new-instance v0, LY2;

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-direct {v0, v5, v3}, LY2;-><init>(ILEb;)V

    invoke-static {p1, v0, p0}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget-object v0, Lgc;->a:Lgc;

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    :try_start_2
    check-cast p1, Ljava/lang/String;

    sget-object v0, LmD;->a:LmD;

    invoke-static {v0, p1}, LmD;->a(LmD;Ljava/lang/String;)Lio/github/cherrywechat/network/model/UpdateInfo;

    move-result-object p1

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/UpdateInfo;->getVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x29e4

    if-le v3, v5, :cond_3

    invoke-static {v0, v4, p1}, LmD;->b(LmD;Landroid/content/Context;Lio/github/cherrywechat/network/model/UpdateInfo;)V

    goto :goto_2

    :cond_3
    if-eqz v2, :cond_4

    const-wide v5, -0x1a6a3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :goto_1
    const-wide v5, -0x1a6acfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    if-eqz v2, :cond_4

    const-wide v2, -0x1a6b5fffff835L

    invoke-static {v2, v3, v4, v1}, LEy;->k(JLandroid/content/Context;I)V

    :cond_4
    :goto_2
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method
