.class public abstract LNx;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    const-wide v1, -0x2f91cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_0
    const-wide v1, -0x2fb8dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-wide v1, -0x2fb9dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, LNx;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 2

    const-wide v0, -0x2fbe6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-wide v0, -0x2fbf6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fbfafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static c(Ljava/lang/String;Z)V
    .locals 2

    const-wide v0, -0x2fbeafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 3

    const-wide v0, -0x2fbd1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-wide v1, -0x2fbd6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x2fb83fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2fb87fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
