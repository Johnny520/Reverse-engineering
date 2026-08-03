.class public final LmD;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LmD;

.field public static final b:LcA;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1a59cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1a5aafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1a5bcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LmD;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LmD;->a:LmD;

    new-instance v0, Ld;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    new-instance v1, LcA;

    invoke-direct {v1, v0}, LcA;-><init>(LUi;)V

    sput-object v1, LmD;->b:LcA;

    return-void
.end method

.method public static final a(LmD;Ljava/lang/String;)Lio/github/cherrywechat/network/model/UpdateInfo;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    :try_start_0
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v2, Lio/github/cherrywechat/network/model/UpdateInfo;->Companion:Lio/github/cherrywechat/network/model/UpdateInfo$Companion;

    invoke-virtual {v2}, Lio/github/cherrywechat/network/model/UpdateInfo$Companion;->serializer()LQm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v1

    check-cast v1, LQm;

    invoke-virtual {v0, v1, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-wide v1, -0x1a52cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x1a5c7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, p0

    :goto_0
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/UpdateInfo;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_1
    sget-object v0, Lzm;->a:LAm;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lio/github/cherrywechat/network/model/UpdateInfo;->Companion:Lio/github/cherrywechat/network/model/UpdateInfo$Companion;

    invoke-virtual {v1}, Lio/github/cherrywechat/network/model/UpdateInfo$Companion;->serializer()LQm;

    move-result-object v1

    check-cast v1, LQm;

    invoke-virtual {v0, v1, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-wide v0, -0x1a5cbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-class v0, Lio/github/cherrywechat/network/model/UpdateInfo;

    invoke-static {v0}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v0

    invoke-virtual {v0}, LF9;->b()Ljava/lang/String;

    const-wide v0, -0x1a5e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_1
    move-object v0, p0

    check-cast v0, Lio/github/cherrywechat/network/model/UpdateInfo;

    :goto_2
    return-object v0
.end method

.method public static final b(LmD;Landroid/content/Context;Lio/github/cherrywechat/network/model/UpdateInfo;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    new-instance p0, Landroid/app/AlertDialog$Builder;

    const v0, 0x103023a

    invoke-direct {p0, p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const-wide v0, -0x1a5eafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/UpdateInfo;->getReleaseNotes()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const-wide v0, -0x1a5f0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LKb;

    invoke-direct {v1, p1, p2}, LKb;-><init>(Landroid/content/Context;Lio/github/cherrywechat/network/model/UpdateInfo;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/UpdateInfo;->getForceUpdate()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, -0x1a5f5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LSo;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LSo;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/UpdateInfo;->getForceUpdate()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lgf;->T(Landroid/app/AlertDialog;Z)V

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/UpdateInfo;->getForceUpdate()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, LT7;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, LT7;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public static c(Landroid/content/Context;Z)V
    .locals 3

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v1, Lfm;

    invoke-direct {v1}, Lfm;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, LfG;->Z(Lac;Lac;)Lac;

    move-result-object v0

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v1, LlD;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LlD;-><init>(Landroid/content/Context;ZLEb;)V

    const/4 p0, 0x3

    invoke-static {v0, v1, p0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public static d()Landroid/content/SharedPreferences;
    .locals 3

    sget-object v0, LmD;->b:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-wide v1, -0x1a56cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method
