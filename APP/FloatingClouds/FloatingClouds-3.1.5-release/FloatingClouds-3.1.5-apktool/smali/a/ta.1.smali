.class public final La/ta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# direct methods
.method public static a(Landroid/view/ViewGroup;La/V7;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, La/V7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, La/ta;->a(Landroid/view/ViewGroup;La/V7;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 4

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "FC_DEBUG"

    const-string v1, "MaskUIManager.handleHook START"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    new-instance v1, La/O8;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    const-string v2, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro"

    const-string v3, "initView"

    invoke-static {p1, v2, v3, v0, v1}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    return-void
.end method
