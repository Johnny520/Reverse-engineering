.class public final Lw50;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Lw50;->a:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e3\u06e2"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "dAiP5qzc4"

    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۨۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    add-int/lit16 v2, v2, -0x1e10

    xor-int/2addr v1, v2

    if-ltz v1, :cond_1

    const/16 v1, 0x21

    sput v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v1, "\u06e4\u06df\u06df"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06df\u06df"

    goto :goto_1

    :sswitch_2
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v1

    if-ltz v1, :cond_3

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/lit16 v2, v2, -0x806

    or-int/2addr v1, v2

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v1, "\u06e8\u06e4\u06e2"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sub-int/2addr v1, v2

    const v2, 0xdd63

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    const-string v1, "\u06e0\u06e5\u06e7"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v1, :cond_2

    const/16 v1, 0x56

    sput v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v1, "\u06e8\u06e3\u06e2"

    :goto_3
    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e2\u06e3\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/lit16 v2, v2, -0xe53

    xor-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v1, "\u06e0\u06e5\u06e4"

    goto :goto_2

    :cond_4
    const-string v1, "\u06e4\u06df\u06df"

    goto :goto_3

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7d -> :sswitch_0
        0x1aab82 -> :sswitch_1
        0x1ab2c1 -> :sswitch_2
        0x1ab666 -> :sswitch_4
        0x1ab9c4 -> :sswitch_5
        0x1ac966 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    iget v0, p0, Lw50;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    const-string v0, "6wJgugw=\n"

    const-string v1, "m2MS22GaeKc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/widget/PopupWindow;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast v0, Landroid/widget/PopupWindow;

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isFocusable()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isOutsideTouchable()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "f79gByURdaA29Dpg\n"

    const-string v4, "GNoUSUR8EIg=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "PSl6ojdwrcIoNVPlbjvxqA==\n"

    const-string v5, "SUY2zUAV34E=\n"

    invoke-static {v0, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_6

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v5, "4CAJBaVBeZr1JhgSrkZklskkEDLoHDjBrg==\n"

    const-string v6, "h0V9V8AyFu8=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "hE46sa2ygDORUhP29PncWQ==\n"

    const-string v5, "8CF23trX8nA=\n"

    invoke-static {v1, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    const-string v1, "4HIIrbA=\n"

    const-string v5, "lh1hztUI6xM=\n"

    invoke-static {v1, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v4, v1, v5}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "YMKL\n"

    const-string v5, "DavoTbO0TrU=\n"

    invoke-static {v1, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v4, v1, v5}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "jSGadZUq\n"

    const-string v5, "/0T5GudOulA=\n"

    invoke-static {v1, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v4, v1, v5}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "GQAo26c=\n"

    const-string v4, "b29BuMK1EzQ=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "q5no\n"

    const-string v4, "xvCLegM04B0=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "bGdHXHKP\n"

    const-string v4, "HgIkMwDrUmU=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "xUWp\n"

    const-string v4, "tybNWchCbBc=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const v0, 0x7e080011

    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_7

    check-cast v0, Lo40;

    :goto_3
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo40;->c()V

    :cond_2
    const v0, 0x7e080012

    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_8

    check-cast v0, Lo40;

    :goto_4
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lo40;->c()V

    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f666666    # 0.9f

    mul-float/2addr v0, v1

    invoke-virtual {v3, v0}, Landroid/view/View;->setPivotX(F)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setPivotY(F)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v3, v0}, Landroid/view/View;->setScaleX(F)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v3, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v4, 0xfa

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lks;

    const/4 v4, 0x4

    invoke-direct {v1, v3, v4}, Lks;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const v0, 0x7e080011

    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_9

    check-cast v0, Lo40;

    :goto_5
    if-nez v0, :cond_29

    new-instance v0, Lo40;

    sget-object v1, Lo40;->o:Lsh;

    invoke-direct {v0, v3, v1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v1, 0x7e080011

    invoke-virtual {v3, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v1, v0

    :goto_6
    const v0, 0x7e080012

    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Lo40;

    if-eqz v4, :cond_28

    check-cast v0, Lo40;

    :goto_7
    if-nez v0, :cond_4

    new-instance v0, Lo40;

    sget-object v2, Lo40;->p:Lsh;

    invoke-direct {v0, v3, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v2, 0x7e080012

    invoke-virtual {v3, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v4, 0x43480000    # 200.0f

    const v5, 0x3f266666    # 0.65f

    invoke-static {v2, v4, v5}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v1, Lo40;->k:Lp40;

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v4, 0x43480000    # 200.0f

    const v5, 0x3f266666    # 0.65f

    invoke-static {v2, v4, v5}, Lg40;->f(FFF)Lp40;

    move-result-object v2

    iput-object v2, v0, Lo40;->k:Lp40;

    invoke-virtual {v1}, Lo40;->h()V

    invoke-virtual {v0}, Lo40;->h()V

    new-instance v0, Lks;

    const/4 v1, 0x5

    invoke-direct {v0, v3, v1}, Lks;-><init>(Landroid/view/View;I)V

    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    :cond_6
    const-string v0, ""

    goto/16 :goto_2

    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_3

    :cond_8
    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_9
    const/4 v0, 0x0

    goto :goto_5

    :pswitch_1
    const-string v0, "R3DxK7Y=\n"

    const-string v1, "NxGDSttZrAo=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Dialog;

    const/4 v3, 0x0

    if-eqz v1, :cond_f

    check-cast v0, Landroid/app/Dialog;

    move-object v4, v0

    :goto_8
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_10

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    xor-int/lit8 v1, v0, -0x9

    and-int/2addr v0, v1

    :goto_9
    const/4 v2, 0x1

    if-eqz v0, :cond_11

    const/4 v0, 0x1

    :goto_a
    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "M+0yPuZdSNl6pmhZ\n"

    const-string v6, "VIhGcIcwLfE=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "drs3dtFSG79jpx4xiBlH1Q==\n"

    const-string v7, "AtR7GaY3afw=\n"

    invoke-static {v0, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v7, -0x1

    if-eq v0, v7, :cond_12

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v7, "FT4PpUcpPKIAOB6yTC4hrjw6FpIKdH35Ww==\n"

    const-string v8, "clt79yJaU9c=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "StxFQVehRJ9fwGwGDuoY9Q==\n"

    const-string v7, "PrMJLiDENtw=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :goto_b
    const-string v1, "aysIagc=\n"

    const-string v7, "HURhCWLzPgA=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "TziN\n"

    const-string v7, "IlHurrAY6y0=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "cRv8ryIX\n"

    const-string v7, "A36fwFBz6PQ=\n"

    invoke-static {v1, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v6, v1, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "n30B81E=\n"

    const-string v6, "6RJokDRMs0s=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "U5kB\n"

    const-string v6, "PvBiN1Powe0=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "iC09Fqbe\n"

    const-string v6, "+kheedS6tlY=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "B7z0\n"

    const-string v6, "dd+QsRjJLKA=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v0, v1, v6}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    const v0, 0x7e080011

    invoke-virtual {v5, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_13

    check-cast v0, Lo40;

    :goto_c
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lo40;->c()V

    :cond_a
    const v0, 0x7e080012

    invoke-virtual {v5, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_14

    check-cast v0, Lo40;

    :goto_d
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lo40;->c()V

    :cond_b
    const v0, 0x3f4ccccd    # 0.8f

    invoke-virtual {v5, v0}, Landroid/view/View;->setScaleX(F)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-virtual {v5, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v6, 0xfa

    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lks;

    const/4 v6, 0x3

    invoke-direct {v1, v5, v6}, Lks;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const v0, 0x7e080011

    invoke-virtual {v5, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo40;

    if-eqz v1, :cond_15

    check-cast v0, Lo40;

    :goto_e
    if-nez v0, :cond_27

    new-instance v0, Lo40;

    sget-object v1, Lo40;->o:Lsh;

    invoke-direct {v0, v5, v1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v1, 0x7e080011

    invoke-virtual {v5, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v1, v0

    :goto_f
    const v0, 0x7e080012

    invoke-virtual {v5, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Lo40;

    if-eqz v6, :cond_26

    check-cast v0, Lo40;

    :goto_10
    if-nez v0, :cond_c

    new-instance v0, Lo40;

    sget-object v3, Lo40;->p:Lsh;

    invoke-direct {v0, v5, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const v3, 0x7e080012

    invoke-virtual {v5, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_c
    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v5, 0x43480000    # 200.0f

    const v6, 0x3f266666    # 0.65f

    invoke-static {v3, v5, v6}, Lg40;->f(FFF)Lp40;

    move-result-object v3

    iput-object v3, v1, Lo40;->k:Lp40;

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v5, 0x43480000    # 200.0f

    const v6, 0x3f266666    # 0.65f

    invoke-static {v3, v5, v6}, Lg40;->f(FFF)Lp40;

    move-result-object v3

    iput-object v3, v0, Lo40;->k:Lp40;

    invoke-virtual {v1}, Lo40;->h()V

    invoke-virtual {v0}, Lo40;->h()V

    :cond_d
    const-string v0, "aDQvRdg0x9RzDjR23Snozm0=\n"

    const-string v1, "A1FWGqhbt6E=\n"

    sget-object v3, Lkn;->a:Lkn;

    invoke-static {v0, v1, v3}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    :try_start_2
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "V7bsna1RcV5MjPeuqExeQlKn8KyuV3VS\n"

    const-string v3, "PNOVwt0+ASs=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x64

    invoke-static {v0, v3}, Lkn;->b(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_0

    const/high16 v3, -0x80000000

    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Landroid/view/Window;->clearFlags(I)V

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    int-to-float v0, v0

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v0, v4

    const/16 v4, 0x96

    int-to-float v4, v4

    mul-float/2addr v0, v4

    float-to-int v0, v0

    const/4 v4, 0x1

    if-ge v0, v4, :cond_e

    move v0, v2

    :cond_e
    invoke-static {v3, v0}, Lz7;->n(Landroid/view/WindowManager$LayoutParams;I)V

    const/4 v0, 0x0

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v1, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, "fd8Rxy5H+VhE3gTtHG7iTWnZAN4xZQ==\n"

    const-string v3, "LbBhsl4Clz8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    const/4 v0, 0x0

    move-object v4, v0

    goto/16 :goto_8

    :cond_10
    const/4 v0, 0x0

    goto/16 :goto_9

    :cond_11
    const/4 v0, 0x0

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    :cond_12
    const-string v0, ""

    goto/16 :goto_b

    :cond_13
    const/4 v0, 0x0

    goto/16 :goto_c

    :cond_14
    const/4 v0, 0x0

    goto/16 :goto_d

    :cond_15
    const/4 v0, 0x0

    goto/16 :goto_e

    :pswitch_2
    sget-object v4, Lxh;->l:Lr80;

    const-string v0, "3A==\n"

    const-string v1, "rGmy28j+QYQ=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v0, "fHx2Zr6gPD98Zm4q/KZ9MnN6birqrH0/fWc3ZOuvMXFmcGpvvqIzNWBmc26woi0hPEh5fve1NCVr\n"

    const-string v2, "EgkaCp7DXVE=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-eqz v2, :cond_17

    check-cast v0, Landroid/view/ViewGroup;

    :goto_11
    if-nez v0, :cond_18

    :cond_16
    :goto_12
    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "hb5luw3UoWo"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۢۡۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_17
    const/4 v0, 0x0

    goto :goto_11

    :cond_18
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    :try_start_3
    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "mejd3rtDEA==\n"

    const-string v5, "pZu4qpZ8Lro=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v6, Lkn;->e:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sget-object v2, Lu6;->a:Lu6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v10, 0x1

    sub-long v10, v8, v10

    sget-wide v12, Lu6;->e:J

    sub-long/2addr v10, v12

    const-wide/16 v12, 0x1

    add-long/2addr v10, v12

    const-wide/32 v12, 0x2dc6c0

    cmp-long v2, v10, v12

    if-lez v2, :cond_19

    sput-wide v8, Lu6;->e:J

    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lkn;->i:Lsd;

    sget-object v5, Lyg;->b:Lof;

    new-instance v7, Lb7;

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct {v7, v1, v8, v9}, Lb7;-><init>(Landroid/app/Activity;Lvd;I)V

    const/4 v8, 0x2

    invoke-static {v2, v5, v7, v8}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    :cond_19
    sget-object v7, Lkn;->a:Lkn;

    const-string v2, "tUlKKr5TQBuqc0Yc\n"

    const-string v5, "3iwzdd07JXo=\n"

    invoke-static {v2, v5, v7}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "ZtK1IrUwSG5/+g==\n"

    const-string v5, "KrPATNZYLRw=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v6, v2, v5}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_1a

    const-string v2, "sicmzD67obWkBg==\n"

    const-string v5, "8U9HuErSz9I=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v6, v2, v5}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1d

    :cond_1a
    sget-object v2, Lxh;->k:Landroid/hardware/SensorManager;

    if-nez v2, :cond_1b

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "lrDJ3v52\n"

    const-string v8, "5dWnrZEEP6g=\n"

    invoke-static {v5, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Landroid/hardware/SensorManager;

    if-eqz v5, :cond_21

    check-cast v2, Landroid/hardware/SensorManager;

    :goto_14
    sput-object v2, Lxh;->k:Landroid/hardware/SensorManager;

    :cond_1b
    sget-object v2, Lxh;->k:Landroid/hardware/SensorManager;

    if-eqz v2, :cond_25

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    :goto_15
    if-eqz v2, :cond_1d

    sget-object v3, Lxh;->k:Landroid/hardware/SensorManager;

    if-eqz v3, :cond_1c

    invoke-virtual {v3, v4}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :cond_1c
    sget-object v3, Lxh;->k:Landroid/hardware/SensorManager;

    if-eqz v3, :cond_1d

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v2, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_1d
    const-string v2, "Mw7CUHKp+Y4qJg==\n"

    const-string v3, "f2+3PhHBnPw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1e

    const-string v2, "DVNCmslu8W4SX1Wi8HH7exJfVaLc\n"

    const-string v3, "ZjY7xa8Cng8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkn;->e(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_22

    const-string v2, "bdYc\n"

    const-string v3, "Gbd7MCENE9g=\n"

    const-string v4, "85B8UnZb\n"

    const-string v5, "oPUIEAI14nA=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "MI5Od4o=\n"

    const-string v8, "UuIhFOEuZWs=\n"

    invoke-static {v2, v3, v4, v5, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_4
    const-string v2, "z0wuCpMGQo3cQCUGvypFjcY=\n"

    const-string v3, "qClLYcx1J/k=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KWnBCanK\n"

    const-string v4, "y/NY5hFF2d4=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lp80;

    const/4 v4, 0x0

    invoke-direct {v5, v1, v4}, Lp80;-><init>(Landroid/app/Activity;I)V

    const/16 v4, 0x12c

    invoke-static/range {v0 .. v5}, Lxh;->d(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjm;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :cond_1e
    :goto_16
    const-string v2, "qg619CA9C3uzJg==\n"

    const-string v3, "5m/AmkNVbgk=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_1f

    const-string v2, "7iHnZxVZKk/4AA==\n"

    const-string v3, "rUmGE2EwRCg=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_20

    :cond_1f
    const-string v2, "V4OxlQPXtcdIuaWlBNo=\n"

    const-string v3, "PObIymC/0KY=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "5u6W\n"

    const-string v4, "jYvvLSYfAis=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkn;->b(Ljava/lang/String;I)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-result v2

    :goto_17
    const-string v3, "CNt450SotSIX4XTR\n"

    const-string v4, "Y74BuCfA0EM=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    if-nez v2, :cond_24

    const-string v2, "Zea3smCqFhA=\n"

    const-string v3, "Jo7S0xToYn4=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lpv;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4, v1}, Lpv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v2, v3}, Lkn;->j(Ljava/lang/String;Ljm;)V

    :cond_20
    :goto_18
    const-string v2, "zEUiiL3jpU/aZA==\n"

    const-string v3, "jy1D/MmKyyg=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_16

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lt5;

    const/16 v4, 0xa

    invoke-direct {v3, v1, v4, v0}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-wide/16 v0, 0x320

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_12

    :catchall_3
    move-exception v2

    const-string v2, "06ke\n"

    const-string v5, "p8h5VTpLcuY=\n"

    const-string v7, "77nn/cP7dp3VgO7x2A==\n"

    const-string v8, "uvCvkqyQKck=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "tw==\n"

    const-string v9, "0vI8ySRxU5w=\n"

    invoke-static {v2, v5, v7, v8, v9}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_13

    :cond_21
    const/4 v2, 0x0

    goto/16 :goto_14

    :catchall_4
    move-exception v2

    const-string v2, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "tw==\n"

    const-string v3, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_16

    :cond_22
    const-string v2, "PwojNQwl+44sBig5IAn8jjY=\n"

    const-string v3, "WG9GXlNWnvo=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1e

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_16

    :catchall_5
    move-exception v3

    :try_start_6
    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Li50;->O(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_23

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-result v2

    goto/16 :goto_17

    :catchall_6
    move-exception v2

    :cond_23
    const/4 v2, 0x0

    goto/16 :goto_17

    :cond_24
    const-string v2, "z+g2eXv4AI/J+QxwUPU=\n"

    const-string v3, "qI1TEiSbaOo=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_20

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_18

    :cond_25
    move-object v2, v3

    goto/16 :goto_15

    :cond_26
    move-object v0, v3

    goto/16 :goto_10

    :cond_27
    move-object v1, v0

    goto/16 :goto_f

    :cond_28
    move-object v0, v2

    goto/16 :goto_7

    :cond_29
    move-object v1, v0

    goto/16 :goto_6

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 38

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v37, 0x0

    const/4 v9, 0x0

    const/16 v23, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v35, 0x0

    const/4 v13, 0x0

    const/16 v34, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v4, 0x0

    const/16 v33, 0x0

    const/4 v12, 0x0

    const-string v30, "\u06e5\u06e8\u06e7"

    invoke-static/range {v30 .. v30}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v36

    move-object/from16 v30, v2

    move-object/from16 v31, v7

    move-object/from16 v32, v8

    :goto_0
    sparse-switch v36, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "0eYF\n"

    const-string v7, "uoN833bROYg=\n"

    const-string v8, "lD+X\n"

    const-string v36, "8FrxKEsCsOY=\n"

    move-object/from16 v0, v20

    move-object/from16 v1, v36

    invoke-static {v2, v7, v0, v8, v1}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v22

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v7, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v2, v7

    const v7, 0x1ac393

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v7, v7, -0xe39

    mul-int/2addr v2, v7

    if-eqz v2, :cond_1

    const/16 v2, 0x33

    sput v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v2, "\u06e3\u06e8\u06e0"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v7, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    add-int/2addr v2, v7

    const v7, 0x1ac42e

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v2

    if-ltz v2, :cond_2

    const-string v2, "\u06e0\u06e1\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :cond_2
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v7, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v2, v7

    const v7, -0xdc85

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto :goto_0

    :cond_3
    :sswitch_3
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v7, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/2addr v2, v7

    const v7, 0x1ac6c8

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v2

    if-ltz v2, :cond_4

    const/16 v2, 0x31

    sput v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v2, "\u06e1\u06e5\u06e1"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v7, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/2addr v2, v7

    const v7, -0xdc1f

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "\u06e7\u06e0\u06df"

    move-wide/from16 v18, v16

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_6
    const/4 v2, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v25, v2

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v2

    if-gtz v2, :cond_5

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v2, "\u06e1\u06e0"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/2addr v2, v7

    const v7, 0x1ab44a

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/lit16 v6, v6, -0x4b5

    div-int/2addr v2, v6

    if-eqz v2, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move v2, v3

    move v7, v3

    :goto_3
    const-string v3, "\u06e2\u06e3\u06df"

    move-object v8, v3

    move v6, v2

    :goto_4
    invoke-static {v8}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    move v3, v7

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v6, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/2addr v2, v6

    const v6, 0x12fed7

    add-int/2addr v2, v6

    move/from16 v36, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v2

    if-ltz v2, :cond_7

    const/16 v2, 0x1d

    sput v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v2, "\u06e3\u06e1\u06e7"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06df\u06e3\u06e0"

    :goto_5
    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v7, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/lit16 v7, v7, -0xba3

    add-int/2addr v2, v7

    if-gtz v2, :cond_8

    const-string v2, "\u06e1\u06e7\u06e3"

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v7, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/2addr v2, v7

    const v7, 0x1aa7fe

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_a
    :try_start_0
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v20

    move/from16 v1, v37

    invoke-static {v0, v1}, Lkn;->b(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v2

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v8, v8, 0x404

    xor-int/2addr v7, v8

    if-gtz v7, :cond_9

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move v7, v10

    :goto_7
    const-string v8, "\u06e1\u06e7\u06e8"

    invoke-static {v8}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v9, v2

    move/from16 v36, v8

    move v10, v7

    goto/16 :goto_0

    :cond_9
    sget v7, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v8, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sub-int/2addr v7, v8

    const v8, 0x1aa48e

    add-int/2addr v7, v8

    move-object v9, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_b
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v7, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v2, v7

    const v7, 0x1ac5b1

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    :try_start_1
    sget-object v2, Lkn;->a:Lkn;

    invoke-static/range {v22 .. v22}, Li50;->O(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_28

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result v8

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v7

    if-ltz v7, :cond_a

    const/4 v7, 0x7

    sput v7, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v7, "\u06e5\u06e8\u06e7"

    invoke-static {v7}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v32, v2

    move/from16 v36, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e6\u06e1\u06e7"

    invoke-static {v7}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v32, v2

    move/from16 v36, v7

    move/from16 v37, v8

    goto/16 :goto_0

    :sswitch_c
    :try_start_2
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v24

    invoke-static {v0, v6}, Lkn;->b(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v7

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v2, :cond_b

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    const-string v2, "\u06e0\u06df\u06df"

    :goto_8
    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e4\u06e7"

    goto :goto_8

    :sswitch_d
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v2

    if-gtz v2, :cond_c

    const-string v2, "\u06df\u06e1\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e4\u06e0\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "0eYF\n"

    const-string v7, "uoN833bROYg=\n"

    const-string v8, "lD+X\n"

    const-string v36, "8FrxKEsCsOY=\n"

    move-object/from16 v0, v24

    move-object/from16 v1, v36

    invoke-static {v2, v7, v0, v8, v1}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v26

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    div-int/2addr v2, v7

    const v7, 0x1aab96

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_f
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v7, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/lit16 v7, v7, 0x1443

    add-int/2addr v2, v7

    if-gtz v2, :cond_d

    const/16 v2, 0x4e

    sput v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v2, "\u06e1\u06e0\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/2addr v2, v7

    const v7, 0x1aad88

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v2, :cond_e

    const-string v2, "\u06e6\u06e4\u06e8"

    :goto_9
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v7, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/2addr v2, v7

    const v7, 0x1abd8a

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, p1

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v7, "2FlrceeqAWjfSXtY\n"

    const-string v8, "qzwfPYjEZgE=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "Wv7YwONMVHdu98/4\n"

    const-string v8, "MZuhn44jNxw=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "RFwMS9pVp+I=\n"

    const-string v24, "dW06Ze5lkNY=\n"

    move-object/from16 v0, v24

    invoke-static {v8, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget v24, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v24, :cond_23

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v24, "\u06e4\u06e6\u06e2"

    invoke-static/range {v24 .. v24}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v36

    move-object/from16 v24, v2

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    goto/16 :goto_0

    :catchall_1
    move-exception v2

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v2

    if-gtz v2, :cond_f

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    const-string v2, "\u06df\u06e6\u06df"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v12, v26

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v7, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    div-int/2addr v2, v7

    const v7, 0x1aa71f

    add-int/2addr v2, v7

    move-object/from16 v12, v26

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v2

    if-ltz v2, :cond_10

    const-string v2, "\u06e8\u06e0\u06e8"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    move/from16 v37, v10

    goto/16 :goto_0

    :cond_10
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v7, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/2addr v2, v7

    const v7, -0x1a459

    xor-int/2addr v2, v7

    move/from16 v36, v2

    move/from16 v37, v10

    goto/16 :goto_0

    :sswitch_13
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v7, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    mul-int/2addr v2, v7

    const v7, 0x21c1fc

    add-int/2addr v2, v7

    move-object/from16 v34, v13

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_14
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v7, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/lit16 v7, v7, -0x97e

    sub-int/2addr v2, v7

    if-gtz v2, :cond_11

    const-string v2, "\u06e8\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e8\u06e0\u06e8"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_15
    const-wide v16, 0x4043f3bcd35a8588L    # 39.9042

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v2

    if-ltz v2, :cond_12

    const-string v2, "\u06df\u06e5\u06e4"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_12
    const-string v2, "\u06e0\u06e8\u06e6"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_13
    :sswitch_16
    move-object v2, v11

    :cond_14
    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v8, v8, -0x1e9

    mul-int/2addr v7, v8

    if-ltz v7, :cond_15

    const-string v7, "\u06e6\u06e5\u06e3"

    :goto_b
    invoke-static {v7}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :cond_15
    const-string v7, "\u06e3\u06e1\u06e7"

    invoke-static {v7}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_17
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v7, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/lit16 v7, v7, 0x135f

    div-int/2addr v2, v7

    if-eqz v2, :cond_16

    const/16 v2, 0x4b

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06df\u06e1\u06e1"

    move-object v7, v12

    move-object v8, v14

    :goto_c
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v7

    move-object v14, v8

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e3\u06e2\u06e3"

    move-object v13, v12

    :goto_d
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_18
    invoke-static {v14}, Lh50;->y(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v2

    if-ltz v2, :cond_17

    const/16 v2, 0xb

    sput v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v2, "\u06e3\u06df\u06e8"

    goto :goto_a

    :cond_17
    const-string v2, "\u06e5\u06e1\u06e5"

    :goto_e
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :catchall_2
    move-exception v2

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v7, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/lit16 v7, v7, -0xd7e

    add-int/2addr v2, v7

    if-ltz v2, :cond_18

    const-string v2, "\u06e7\u06e7\u06e7"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v33, v22

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v7, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/2addr v2, v7

    const v7, 0x1ab697

    add-int/2addr v2, v7

    move-object/from16 v33, v22

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_19
    const-string v2, "\u06e5\u06e7\u06e7"

    :goto_f
    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    rem-int/2addr v2, v7

    const v7, 0x1aa749

    add-int/2addr v2, v7

    move-object/from16 v34, v27

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1b
    :try_start_3
    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v15

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v7, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    div-int/lit16 v7, v7, -0x3c1

    xor-int/2addr v2, v7

    if-gtz v2, :cond_19

    const/16 v2, 0x28

    sput v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v2, "\u06e0\u06e6\u06e3"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e7\u06e4\u06e8"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "mmS5nDLUfe6ubaG3\n"

    const-string v8, "8QHAw1+7HoU=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "uNAAbfKs5A==\n"

    const-string v20, "i+kuVMKY1v0=\n"

    move-object/from16 v0, v20

    invoke-static {v8, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_10
    const-string v20, "\u06e0\u06e2"

    invoke-static/range {v20 .. v20}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v36

    move-object/from16 v20, v2

    move-object/from16 v21, v7

    move-object/from16 v22, v8

    goto/16 :goto_0

    :sswitch_1d
    const-wide v28, 0x405d1a12d77318fcL    # 116.4074

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v7, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/2addr v2, v7

    const v7, 0x1ab7fa

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_1e
    const/4 v3, 0x0

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v2, :cond_1a

    const-string v2, "\u06e6\u06df\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_1a
    move v2, v6

    move v7, v3

    goto/16 :goto_3

    :cond_1b
    :sswitch_1f
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v2

    if-ltz v2, :cond_1c

    const-string v2, "\u06e2\u06e6\u06e0"

    goto/16 :goto_f

    :cond_1c
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v7, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    add-int/2addr v2, v7

    const v7, 0x1ac69b

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_1d
    :sswitch_20
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v7, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    div-int/2addr v2, v7

    const v7, 0x1aab7a

    add-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_21
    :try_start_4
    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v7, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v7, v7, 0xe54

    add-int/2addr v2, v7

    if-gtz v2, :cond_1e

    const/16 v2, 0x23

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06e7\u06e6\u06e5"

    goto/16 :goto_e

    :cond_1e
    const-string v2, "\u06e5\u06e5\u06e3"

    goto/16 :goto_f

    :sswitch_22
    const-string v2, "\u06e7\u06e4\u06e8"

    goto/16 :goto_9

    :pswitch_0
    :sswitch_23
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_1f

    const/16 v2, 0x4c

    sput v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v2, "\u06e5\u06e1\u06e0"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/2addr v2, v7

    const v7, -0x1abe41

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_24
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/lit16 v7, v7, 0x2393

    sub-int/2addr v2, v7

    if-gtz v2, :cond_20

    const/16 v2, 0x21

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    move-object/from16 v2, v20

    move-object/from16 v7, v21

    move-object/from16 v8, v22

    move-object/from16 v14, v23

    goto/16 :goto_10

    :cond_20
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v7, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sub-int/2addr v2, v7

    const v7, 0x1aa61f

    add-int/2addr v2, v7

    move-object/from16 v14, v23

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_25
    const-string v2, "\u06e0\u06e1\u06e3"

    move-object v7, v13

    move-object v8, v15

    goto/16 :goto_c

    :sswitch_26
    :try_start_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v2, "\u06e3\u06e5\u06e1"

    move-object v8, v2

    move v7, v3

    goto/16 :goto_4

    :sswitch_27
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v2

    if-gtz v2, :cond_21

    const/16 v2, 0x50

    sput v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v2, "\u06e7\u06e2\u06df"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v33

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_21
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v7, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/2addr v2, v7

    const v7, 0x1acadf

    add-int/2addr v2, v7

    move-object/from16 v23, v33

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_28
    const-string v2, "BQ==\n"

    const-string v7, "da6hj7N2bq0=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lkn;->a:Lkn;

    const-string v7, "sICVv3zFSeCEiYODcN5D5LU=\n"

    const-string v8, "2+Xs4BGqKos=\n"

    invoke-static {v7, v8, v2}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v7

    if-eqz v7, :cond_14

    move-object/from16 v0, p1

    iget-object v7, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v7}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Tqg2oGzVCINIqSc=\n"

    const-string v11, "Pc1C7A2hYfc=\n"

    invoke-static {v8, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_26

    sget v7, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    or-int/2addr v7, v8

    const v8, -0x1ac1e7

    xor-int/2addr v7, v8

    move-object v11, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_29
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v7, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v7, v7, 0x24d3

    mul-int/2addr v2, v7

    if-ltz v2, :cond_22

    const-string v2, "\u06e0\u06e2\u06e6"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_22
    const-string v7, "\u06e7\u06e3\u06df"

    move-object v2, v11

    goto/16 :goto_b

    :sswitch_2a
    :try_start_6
    move-object/from16 v0, v24

    move-object/from16 v1, v26

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-result-object v2

    sget v7, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/lit16 v8, v8, 0x2351

    xor-int/2addr v7, v8

    if-ltz v7, :cond_2c

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v7, "\u06e7\u06e3\u06e8"

    invoke-static {v7}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v27, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_2b
    const-string v2, "\u06e5\u06e8\u06e1"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v33, v9

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2c
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v4, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    rem-int/lit16 v4, v4, 0x3b1

    or-int/2addr v2, v4

    if-ltz v2, :cond_24

    const/16 v2, 0x54

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    move-object/from16 v2, v24

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    move-wide/from16 v4, v28

    :cond_23
    const-string v24, "\u06e0\u06e3\u06e5"

    invoke-static/range {v24 .. v24}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v36

    move-object/from16 v24, v2

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    goto/16 :goto_0

    :cond_24
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/2addr v2, v4

    const v4, -0x1ab8ff

    xor-int/2addr v2, v4

    move/from16 v36, v2

    move-wide/from16 v4, v28

    goto/16 :goto_0

    :sswitch_2d
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit16 v7, v7, -0x2460

    or-int/2addr v2, v7

    if-ltz v2, :cond_25

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v2, "\u06e2\u06e0\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_25
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v7, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v2, v7

    const v7, -0x1aab2e

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2e
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v7, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v2, v7

    const v7, 0x1ac958

    xor-int/2addr v2, v7

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v0, p0

    iget v2, v0, Lw50;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_30
    const-string v2, "\u06df\u06e7\u06e1"

    goto/16 :goto_9

    :sswitch_31
    move-object v2, v11

    :cond_26
    sget v7, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v8, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v8, v8, 0x1bb7

    rem-int/2addr v7, v8

    if-ltz v7, :cond_27

    const-string v7, "\u06e4\u06e2\u06e7"

    invoke-static {v7}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v11, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :cond_27
    sget v7, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v8, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    mul-int/2addr v7, v8

    const v8, 0x1888c8

    add-int/2addr v7, v8

    move-object v11, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_32
    invoke-static/range {v34 .. v34}, Lh50;->y(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    const-string v2, "\u06e1\u06e0\u06df"

    goto/16 :goto_1

    :cond_28
    :sswitch_33
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/lit16 v7, v7, 0x2311

    add-int/2addr v2, v7

    if-ltz v2, :cond_29

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v2, "\u06e4\u06e7\u06e4"

    goto/16 :goto_d

    :cond_29
    const-string v2, "\u06e3\u06df\u06e8"

    goto/16 :goto_d

    :sswitch_34
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v7, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/lit16 v7, v7, 0x262a

    mul-int/2addr v2, v7

    if-gtz v2, :cond_2a

    const/16 v2, 0x20

    sput v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v2, "\u06df\u06e4\u06e6"

    goto/16 :goto_2

    :cond_2a
    const-string v2, "\u06e5\u06e8\u06e1"

    goto/16 :goto_9

    :sswitch_35
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v30

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "\u06e0\u06e5\u06df"

    goto/16 :goto_2

    :sswitch_36
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v7, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v2, v7

    const v7, 0x1abbe0

    add-int/2addr v2, v7

    move-object/from16 v12, v35

    move/from16 v36, v2

    goto/16 :goto_0

    :sswitch_37
    const/4 v7, 0x0

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v8, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v8, v8, 0x3b1

    rem-int/2addr v2, v8

    if-ltz v2, :cond_2b

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e3\u06e5\u06e1"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    move v10, v7

    goto/16 :goto_0

    :cond_2b
    move-object v2, v9

    goto/16 :goto_7

    :sswitch_38
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v2

    if-gtz v2, :cond_2d

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-object/from16 v2, v27

    :cond_2c
    const-string v7, "\u06e3\u06e1\u06e8"

    invoke-static {v7}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v27, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :cond_2d
    const-string v2, "\u06e4\u06e6\u06e2"

    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :catchall_3
    move-exception v2

    :try_start_7
    sget-object v2, Lkn;->a:Lkn;

    invoke-static/range {v26 .. v26}, Li50;->O(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_1b

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result v6

    sget v7, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v7, :cond_2e

    const-string v7, "\u06e8\u06e2\u06df"

    invoke-static {v7}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v31, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :cond_2e
    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v7, v8

    const v8, 0x1abe76

    add-int/2addr v7, v8

    move-object/from16 v31, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_39
    const/4 v2, 0x0

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    aput-object v7, v21, v2

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v7, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v7, v7, -0xe1a

    or-int/2addr v2, v7

    if-ltz v2, :cond_2f

    const-string v2, "\u06e3\u06e2\u06e6"

    goto/16 :goto_5

    :cond_2f
    const-string v2, "\u06e7\u06e6\u06e5"

    goto/16 :goto_e

    :sswitch_3a
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v2, :cond_30

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v2, "\u06e4\u06df\u06e4"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v36, v2

    goto/16 :goto_0

    :cond_30
    const-string v2, "\u06e3\u06e1\u06e8"

    goto/16 :goto_6

    :sswitch_3b
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_1d

    const-string v2, "jFo5RR2FnHrdBlZgjOGh6"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟ۡۦ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v7

    if-ltz v7, :cond_31

    const/16 v7, 0x5d

    sput v7, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v7, "\u06e7\u06e0\u06e6"

    invoke-static {v7}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v30, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :cond_31
    sget v7, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    mul-int/2addr v7, v8

    const v8, -0x1a4b0e

    xor-int/2addr v7, v8

    move-object/from16 v30, v2

    move/from16 v36, v7

    goto/16 :goto_0

    :sswitch_3c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc04 -> :sswitch_3
        0xdc1e -> :sswitch_a
        0xdc1f -> :sswitch_3a
        0xdc23 -> :sswitch_31
        0xdc83 -> :sswitch_36
        0xdcf9 -> :sswitch_33
        0xdd00 -> :sswitch_b
        0x1aa722 -> :sswitch_19
        0x1aa724 -> :sswitch_f
        0x1aa73f -> :sswitch_2d
        0x1aa744 -> :sswitch_29
        0x1aa77c -> :sswitch_9
        0x1aa7be -> :sswitch_2b
        0x1aa7d8 -> :sswitch_10
        0x1aa7f9 -> :sswitch_3b
        0x1aaac0 -> :sswitch_20
        0x1aaafe -> :sswitch_1
        0x1aab02 -> :sswitch_8
        0x1aab24 -> :sswitch_32
        0x1aab42 -> :sswitch_e
        0x1aab7a -> :sswitch_3c
        0x1aab9d -> :sswitch_21
        0x1aabdb -> :sswitch_18
        0x1aabde -> :sswitch_5
        0x1aaea0 -> :sswitch_38
        0x1aaf82 -> :sswitch_12
        0x1ab283 -> :sswitch_4
        0x1ab2be -> :sswitch_7
        0x1ab2ff -> :sswitch_34
        0x1ab60c -> :sswitch_37
        0x1ab649 -> :sswitch_3c
        0x1ab64a -> :sswitch_1a
        0x1ab664 -> :sswitch_13
        0x1ab667 -> :sswitch_2e
        0x1ab686 -> :sswitch_34
        0x1ab6bf -> :sswitch_1b
        0x1ab6c1 -> :sswitch_22
        0x1ab6e3 -> :sswitch_2c
        0x1ab9e4 -> :sswitch_6
        0x1abaa0 -> :sswitch_d
        0x1abaa4 -> :sswitch_30
        0x1abac5 -> :sswitch_2e
        0x1abdc9 -> :sswitch_2
        0x1abe40 -> :sswitch_28
        0x1abe43 -> :sswitch_2a
        0x1abe85 -> :sswitch_17
        0x1abe9e -> :sswitch_27
        0x1abea0 -> :sswitch_1f
        0x1abea4 -> :sswitch_2f
        0x1ac14c -> :sswitch_1c
        0x1ac16b -> :sswitch_14
        0x1ac18c -> :sswitch_4
        0x1ac1c6 -> :sswitch_9
        0x1ac205 -> :sswitch_b
        0x1ac507 -> :sswitch_35
        0x1ac526 -> :sswitch_39
        0x1ac52d -> :sswitch_16
        0x1ac545 -> :sswitch_1e
        0x1ac564 -> :sswitch_19
        0x1ac583 -> :sswitch_f
        0x1ac58c -> :sswitch_d
        0x1ac5a5 -> :sswitch_1d
        0x1ac5ab -> :sswitch_25
        0x1ac5e6 -> :sswitch_11
        0x1ac607 -> :sswitch_15
        0x1ac8f0 -> :sswitch_26
        0x1ac925 -> :sswitch_c
        0x1ac984 -> :sswitch_23
        0x1ac9e1 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
