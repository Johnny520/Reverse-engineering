.class public final synthetic La/U7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/Y7;


# direct methods
.method public synthetic constructor <init>(La/Y7;I)V
    .locals 0

    iput p2, p0, La/U7;->a:I

    iput-object p1, p0, La/U7;->b:La/Y7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La/U7;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/U7;->b:La/Y7;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_1

    iget-object v2, v0, La/Y7;->a:Landroid/app/Activity;

    if-ne v2, p1, :cond_1

    iput-object v3, v0, La/Y7;->a:Landroid/app/Activity;

    :cond_1
    return-object v1

    :pswitch_0
    iget-object v0, p0, La/U7;->b:La/Y7;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "FC_DEBUG"

    const-string v2, "SettingsCare onResume: injected "

    const-string v3, "chain"

    invoke-static {p1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v4, p1, Landroid/app/Activity;

    if-eqz v4, :cond_2

    check-cast p1, Landroid/app/Activity;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    iput-object p1, v0, La/Y7;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1}, La/Y7;->b(Landroid/app/Activity;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "SettingsCareModeIntro"

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x1020002

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    new-instance v4, La/Rc;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, La/V7;

    const/4 v6, 0x0

    invoke-direct {v5, v4, p1, v6}, La/V7;-><init>(La/Rc;Landroid/app/Activity;I)V

    invoke-static {v0, v5}, La/Y7;->a(Landroid/view/ViewGroup;La/V7;)V

    iget p1, v4, La/Rc;->a:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " long-click views"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v0, "SettingsCare injection err"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_2
    return-object v3

    :pswitch_1
    iget-object v0, p0, La/U7;->b:La/Y7;

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    const-string v1, "chain"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_4

    check-cast p1, Landroid/app/Activity;

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_5

    iput-object p1, v0, La/Y7;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1}, La/Y7;->b(Landroid/app/Activity;)V

    :cond_5
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
