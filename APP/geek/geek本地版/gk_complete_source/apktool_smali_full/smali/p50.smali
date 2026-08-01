.class public final Lp50;
.super Lde/robv/android/xposed/XC_MethodHook;


# instance fields
.field public final a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Lp50;->a:I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e1\u06e1"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/lit16 v2, v2, 0x1db7

    sub-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x5b

    sput v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    :cond_0
    const-string v1, "\u06e1\u06e0"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v1

    if-gtz v1, :cond_3

    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v1, "\u06e4\u06e4"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e1\u06e3\u06e0"

    :goto_1
    invoke-static {v1}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v1, v2

    const v2, 0x1ac94a

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "QAz"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->ۣ۟ۢۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x38

    sput v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v1, "\u06e4\u06e3\u06e1"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v1, v2

    const v2, 0x1aaf33

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v2, v2, 0x14f3

    sub-int/2addr v1, v2

    if-ltz v1, :cond_4

    const-string v1, "\u06e2\u06e5\u06e5"

    goto :goto_1

    :cond_4
    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/2addr v1, v2

    const v2, 0x1aaf29

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdc80 -> :sswitch_4
        0x1aaee6 -> :sswitch_5
        0x1aaefe -> :sswitch_3
        0x1aba42 -> :sswitch_2
        0x1ac908 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    const v12, 0x7e080012

    const v11, 0x7e080011

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v6, 0x0

    iget v0, p0, Lp50;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "3g"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۨ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :cond_0
    :goto_0
    return-void

    :pswitch_1
    const-string v0, "NxQB8wE=\n"

    const-string v1, "R3VzkmwAxX8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/widget/PopupWindow;

    if-eqz v1, :cond_5

    check-cast v0, Landroid/widget/PopupWindow;

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isFocusable()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isOutsideTouchable()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LIKJvtKfM0FlydPZ\n"

    const-string v4, "S+f98LPyVmk=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "k93UcydsP/+Gwf00fidjlQ==\n"

    const-string v5, "57KYHFAJTbw=\n"

    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_6

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v5, "28Bi/X+rBsPOxnPqdKwbz/LEe8oy9keYlQ==\n"

    const-string v7, "vKUWrxrYabY=\n"

    invoke-static {v5, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DddM/De0iOAYy2W7bv/Uig==\n"

    const-string v5, "ebgAk0DR+qM=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    const-string v1, "OuAjLis=\n"

    const-string v5, "TI9KTU4Kx24=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "vIBh\n"

    const-string v5, "0ekCFmUEPso=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "u/iV1DXi\n"

    const-string v5, "yZ32u0eGppY=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "MXya65Q=\n"

    const-string v4, "RxPziPGhDjY=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "3yDi\n"

    const-string v4, "skmBIeRH2tI=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "gk6lVpb2\n"

    const-string v4, "8CvGOeSSzQs=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "GxZa\n"

    const-string v4, "aXU+1XhbVtU=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {v2, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_7

    check-cast v0, Lh40;

    :goto_3
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lh40;->c()V

    :cond_2
    invoke-virtual {v2, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_8

    check-cast v0, Lh40;

    :goto_4
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lh40;->c()V

    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f666666    # 0.9f

    mul-float/2addr v0, v1

    invoke-virtual {v2, v0}, Landroid/view/View;->setPivotX(F)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setPivotY(F)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleX(F)V

    const v0, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x2

    invoke-virtual {v2, v0, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v4, 0xfa

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lgs;

    const/4 v4, 0x4

    invoke-direct {v1, v2, v4}, Lgs;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-virtual {v2, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_9

    check-cast v0, Lh40;

    :goto_5
    if-nez v0, :cond_3a

    new-instance v0, Lh40;

    sget-object v1, Lh40;->n:Lqh;

    invoke-direct {v0, v2, v1}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-virtual {v2, v11, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v1, v0

    :goto_6
    invoke-virtual {v2, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Lh40;

    if-eqz v4, :cond_39

    check-cast v0, Lh40;

    :goto_7
    if-nez v0, :cond_4

    new-instance v0, Lh40;

    sget-object v3, Lh40;->o:Lqh;

    invoke-direct {v0, v2, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-virtual {v2, v12, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    const/high16 v3, 0x43480000    # 200.0f

    const v4, 0x3f266666    # 0.65f

    invoke-static {v10, v3, v4}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v1, Lh40;->j:Li40;

    const/high16 v3, 0x43480000    # 200.0f

    const v4, 0x3f266666    # 0.65f

    invoke-static {v10, v3, v4}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v0, Lh40;->j:Li40;

    invoke-virtual {v1}, Lh40;->h()V

    invoke-virtual {v0}, Lh40;->h()V

    new-instance v0, Lgs;

    const/4 v1, 0x5

    invoke-direct {v0, v2, v1}, Lgs;-><init>(Landroid/view/View;I)V

    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :cond_5
    move-object v0, v3

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    :cond_6
    const-string v0, ""

    goto/16 :goto_2

    :cond_7
    move-object v0, v3

    goto/16 :goto_3

    :cond_8
    move-object v0, v3

    goto/16 :goto_4

    :cond_9
    move-object v0, v3

    goto :goto_5

    :pswitch_2
    const-string v0, "MeI2BD4=\n"

    const-string v1, "QYNEZVNTdRs=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Dialog;

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

    const-string v1, "sKWX2LKuwh/57s2/\n"

    const-string v7, "18DjltPDpzc=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "sYy7IXHqmp+kkJJmKKHG9Q==\n"

    const-string v8, "xeP3TgaP6Nw=\n"

    invoke-static {v0, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v8, -0x1

    if-eq v0, v8, :cond_12

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    const-string v8, "YFZyDD1oinN1UGMbNm+Xf0lSaztwNcsoLg==\n"

    const-string v9, "BzMGXlgb5QY=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "9DAvg/kwvWHhLAbEoHvhCw==\n"

    const-string v8, "gF9j7I5VzyI=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :goto_b
    const-string v1, "6qRd+JQ=\n"

    const-string v8, "nMs0m/EhP04=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "ybwk\n"

    const-string v8, "pNVH2GmyQuA=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "x7j84+cv\n"

    const-string v8, "td2fjJVLBAE=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "HbP2dGM=\n"

    const-string v7, "a9yfFwaGMNM=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "LYrD\n"

    const-string v7, "QOOgoBWsLMw=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "iXh8cINf\n"

    const-string v7, "+x0fH/E7aNQ=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Rdt/\n"

    const-string v7, "N7gbsLrkBPs=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-virtual {v5, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_13

    check-cast v0, Lh40;

    :goto_c
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lh40;->c()V

    :cond_a
    invoke-virtual {v5, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_14

    check-cast v0, Lh40;

    :goto_d
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lh40;->c()V

    :cond_b
    const v0, 0x3f4ccccd    # 0.8f

    invoke-virtual {v5, v0}, Landroid/view/View;->setScaleX(F)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-virtual {v5, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x2

    invoke-virtual {v5, v0, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v6, 0xfa

    invoke-virtual {v0, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lgs;

    const/4 v6, 0x3

    invoke-direct {v1, v5, v6}, Lgs;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-virtual {v5, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lh40;

    if-eqz v1, :cond_15

    check-cast v0, Lh40;

    :goto_e
    if-nez v0, :cond_38

    new-instance v0, Lh40;

    sget-object v1, Lh40;->n:Lqh;

    invoke-direct {v0, v5, v1}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-virtual {v5, v11, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object v1, v0

    :goto_f
    invoke-virtual {v5, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v6, v0, Lh40;

    if-eqz v6, :cond_37

    check-cast v0, Lh40;

    :goto_10
    if-nez v0, :cond_c

    new-instance v0, Lh40;

    sget-object v3, Lh40;->o:Lqh;

    invoke-direct {v0, v5, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-virtual {v5, v12, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_c
    const/high16 v3, 0x43480000    # 200.0f

    const v5, 0x3f266666    # 0.65f

    invoke-static {v10, v3, v5}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v1, Lh40;->j:Li40;

    const/high16 v3, 0x43480000    # 200.0f

    const v5, 0x3f266666    # 0.65f

    invoke-static {v10, v3, v5}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v0, Lh40;->j:Li40;

    invoke-virtual {v1}, Lh40;->h()V

    invoke-virtual {v0}, Lh40;->h()V

    :cond_d
    const-string v0, "qdf/gwmw1xqy7eSwDK34AKw=\n"

    const-string v1, "wrKG3Hnfp28=\n"

    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0, v1, v3}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    :try_start_2
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v0, "YdsNS2C6M8V64RZ4Zacc2WTKEXpjvDfJ\n"

    const-string v3, "Cr50FBDVQ7A=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x64

    invoke-static {v0, v3}, Lgn;->b(Ljava/lang/String;I)I

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
    invoke-static {v3, v0}, Lp7;->n(Landroid/view/WindowManager$LayoutParams;I)V

    const/4 v0, 0x0

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v1, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    const-string v0, "Nwje\n"

    const-string v1, "Q2m5jaPP2Zc=\n"

    const-string v2, "YEB4FG2CPUNZQW0+X6smVnRGaQ1yoA==\n"

    const-string v3, "MC8IYR3HUyQ=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Fg==\n"

    const-string v4, "c8HJlSTQVfc=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_f
    move-object v4, v3

    goto/16 :goto_8

    :cond_10
    move v0, v6

    goto/16 :goto_9

    :cond_11
    move v0, v6

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    :cond_12
    const-string v0, ""

    goto/16 :goto_b

    :cond_13
    move-object v0, v3

    goto/16 :goto_c

    :cond_14
    move-object v0, v3

    goto/16 :goto_d

    :cond_15
    move-object v0, v3

    goto/16 :goto_e

    :pswitch_3
    sget-object v4, Lvh;->l:Lm80;

    const-string v0, "fg==\n"

    const-string v1, "Dln7Cr8v0xg=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v0, "4ddTizd7VenhzUvHdX0U5O7RS8djdxTp4MwSiWJ0WKf720+CN3la4/3NVoM5eUT3oeNck35uXfP2\n"

    const-string v2, "j6I/5xcYNIc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1e

    check-cast v0, Landroid/view/ViewGroup;

    :goto_11
    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    :try_start_3
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "ANPNWd5DOQ==\n"

    const-string v5, "PKCoLfN8By8=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v7, Lgn;->e:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_12
    sget-object v8, Lgn;->a:Lgn;

    const-string v2, "KiWE8kEHkYE1H4jE\n"

    const-string v5, "QUD9rSJv9OA=\n"

    invoke-static {v2, v5, v8}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const-string v2, "UJlJCoJL565JsQ==\n"

    const-string v5, "HPg8ZOEjgtw=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_16

    const-string v2, "UC3WsLFlzLxGDA==\n"

    const-string v5, "E0W3xMUMots=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1a

    :cond_16
    sget-object v2, Lvh;->k:Landroid/hardware/SensorManager;

    if-nez v2, :cond_17

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "X+UHuawI\n"

    const-string v9, "LIBpysN6nsc=\n"

    invoke-static {v5, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Landroid/hardware/SensorManager;

    if-eqz v5, :cond_1f

    check-cast v2, Landroid/hardware/SensorManager;

    :goto_13
    sput-object v2, Lvh;->k:Landroid/hardware/SensorManager;

    :cond_17
    sget-object v2, Lvh;->k:Landroid/hardware/SensorManager;

    if-eqz v2, :cond_18

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    :cond_18
    if-eqz v3, :cond_1a

    sget-object v2, Lvh;->k:Landroid/hardware/SensorManager;

    if-eqz v2, :cond_19

    invoke-virtual {v2, v4}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :cond_19
    sget-object v2, Lvh;->k:Landroid/hardware/SensorManager;

    if-eqz v2, :cond_1a

    const/4 v5, 0x2

    invoke-virtual {v2, v4, v3, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_1a
    const-string v2, "+WZNFq7ws47gTg==\n"

    const-string v3, "tQc4eM2Y1vw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1b

    const-string v2, "3R2hc4D6RyTCEbZLueVNMcIRtkuV\n"

    const-string v3, "tnjYLOaWKEU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lgn;->e(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_20

    const-string v2, "ddas\n"

    const-string v3, "AbfL95mQedY=\n"

    const-string v4, "fakeKTfI\n"

    const-string v5, "Lsxqa0OmF94=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "ITa66yE=\n"

    const-string v9, "Q1rViEo8ya8=\n"

    invoke-static {v2, v3, v4, v5, v9}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_4
    const-string v2, "qogz5+Dmgse5hDjrzMqFx6M=\n"

    const-string v3, "ze1WjL+V57M=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "GKCF8KLV\n"

    const-string v4, "+jocHxpaGbo=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lk80;

    const/4 v4, 0x0

    invoke-direct {v5, v1, v4}, Lk80;-><init>(Landroid/app/Activity;I)V

    const/16 v4, 0x12c

    invoke-static/range {v0 .. v5}, Lvh;->c(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILhm;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :cond_1b
    :goto_14
    const-string v2, "EzqE5pgIE8EKEg==\n"

    const-string v3, "X1vxiPtgdrM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_1c

    const-string v2, "i5AmdhSrlDydsQ==\n"

    const-string v3, "yPhHAmDC+ls=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1d

    :cond_1c
    const-string v2, "0rzJvyeZaXLNht2PIJQ=\n"

    const-string v3, "udmw4ETxDBM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "aYbW\n"

    const-string v4, "AuOvGSdAksw=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-result v2

    :goto_15
    const-string v3, "8GOqAz7eXGfvWaY1\n"

    const-string v4, "mwbTXF22OQY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgn;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_22

    if-nez v2, :cond_22

    const-string v2, "JJrsGPUoQIQ=\n"

    const-string v3, "Z/KJeYFqNOo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lhv;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4, v1}, Lhv;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v2, v3}, Lgn;->j(Ljava/lang/String;Lhm;)V

    :cond_1d
    :goto_16
    const-string v2, "+RiqWLQ7FEnvOQ==\n"

    const-string v3, "unDLLMBSei4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lt5;

    const/16 v4, 0xa

    invoke-direct {v3, v1, v4, v0}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-wide/16 v0, 0x320

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    :cond_1e
    move-object v0, v3

    goto/16 :goto_11

    :catchall_3
    move-exception v2

    const-string v2, "Nwje\n"

    const-string v5, "Q2m5jaPP2Zc=\n"

    const-string v8, "hGr26HeogOm+U//kbA==\n"

    const-string v9, "0SO+hxjD370=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Fg==\n"

    const-string v10, "c8HJlSTQVfc=\n"

    invoke-static {v2, v5, v8, v9, v10}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_12

    :cond_1f
    move-object v2, v3

    goto/16 :goto_13

    :catchall_4
    move-exception v2

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "Fg==\n"

    const-string v3, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_14

    :cond_20
    const-string v2, "jO2X5KEmyUSf4ZzojQrORIU=\n"

    const-string v3, "64jyj/5VrDA=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1b

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_14

    :catchall_5
    move-exception v3

    :try_start_6
    sget-object v3, Lgn;->a:Lgn;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_21

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-result v2

    goto/16 :goto_15

    :catchall_6
    move-exception v2

    :cond_21
    move v2, v6

    goto/16 :goto_15

    :cond_22
    const-string v2, "HmpAKBpFF0AYe3ohMUg=\n"

    const-string v3, "eQ8lQ0UmfyU=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1d

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_16

    :pswitch_4
    const-string v0, "Hw==\n"

    const-string v1, "b8zHCs9fJlQ=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, Lgn;->a:Lgn;

    const-string v0, "eAQEuzJK3TNMDRKHPlHXN30=\n"

    const-string v2, "E2F95F8lvlg=\n"

    invoke-static {v0, v2, v1}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v2, "HWAJ/A==\n"

    const-string v4, "fBJuj1P6vjw=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v2, v0

    if-nez v2, :cond_27

    move-object v0, v3

    :goto_17
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_23

    check-cast v0, Ljava/lang/String;

    move-object v3, v0

    :cond_23
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xf

    if-gt v0, v2, :cond_0

    const-string v0, "nv0Z8oCtSBM=\n"

    const-string v2, "8pxtm/TYLHY=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_24

    const-string v0, "fPHJ\n"

    const-string v2, "EJC91nfLNPc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_24

    const-string v0, "0fjv2WDq\n"

    const-string v2, "oZeGtxSTzoc=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    :cond_24
    const-string v0, "tEaK945Gem2AT5Lc\n"

    const-string v2, "3yPzqOMpGQY=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "K4EC6uixvw==\n"

    const-string v4, "GLgs09iFjVE=\n"

    invoke-static {v0, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "3f5Z\n"

    const-string v5, "tpsgeLwwj7M=\n"

    const-string v7, "lNdk\n"

    const-string v8, "8LICxVL6724=\n"

    invoke-static {v4, v5, v2, v7, v8}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    move-result-object v0

    :goto_18
    invoke-static {v0}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_19
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "yHqmMGL7cauBMfxX\n"

    const-string v5, "rx/SfgOWFIM=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "lxhHI5ul\n"

    const-string v5, "xGw1SvXCRbU=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    :goto_1a
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_25
    const-string v0, "bm6WekADj6hn\n"

    const-string v1, "AgH4HSl3+sw=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_26

    const-string v0, "M678\n"

    const-string v1, "X8CbR9Egbq0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_26

    const-string v0, "2bP9HkSG\n"

    const-string v1, "qdyUcDD+n+E=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_26
    const-string v0, "zJnJug1qpav4kN6C\n"

    const-string v1, "p/yw5WAFxsA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "ejhfyJgL3Bk=\n"

    const-string v1, "Swlp5qw76y0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "3f5Z\n"

    const-string v3, "tpsgeLwwj7M=\n"

    const-string v4, "lNdk\n"

    const-string v5, "8LICxVL6724=\n"

    invoke-static {v1, v3, v2, v4, v5}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_8
    sget-object v1, Lgn;->a:Lgn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    move-result-object v0

    :goto_1b
    invoke-static {v0}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_1c
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "yLd985hrAvyB/CeU\n"

    const-string v4, "r9IJvfkGZ9Q=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "lCU2cCDH\n"

    const-string v4, "x1FEGU6g8QY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    :goto_1d
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_27
    aget-object v0, v0, v6

    goto/16 :goto_17

    :catchall_7
    move-exception v1

    :try_start_9
    sget-object v4, Lgn;->a:Lgn;

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_28

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1e
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_f

    move-result-object v0

    goto/16 :goto_18

    :cond_28
    move v1, v6

    goto :goto_1e

    :cond_29
    const-wide v0, 0x4043f3bcd35a8588L    # 39.9042

    goto/16 :goto_19

    :cond_2a
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto/16 :goto_1a

    :catchall_8
    move-exception v1

    :try_start_a
    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1f
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_e

    move-result-object v0

    goto :goto_1b

    :cond_2b
    move v1, v6

    goto :goto_1f

    :cond_2c
    const-wide v0, 0x405d1a12d77318fcL    # 116.4074

    goto :goto_1c

    :cond_2d
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1d

    :pswitch_5
    const-string v0, "Rg==\n"

    const-string v1, "Nh8XuJCPPAE=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, Lgn;->a:Lgn;

    const-string v0, "Ud1p1g7N3ABl1H/qAtbWBFQ=\n"

    const-string v2, "OrgQiWOiv2s=\n"

    invoke-static {v0, v2, v1}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "tAKhYoipcVimA7A=\n"

    const-string v3, "02fVLundGCw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    const-string v0, "zuhcYH9iXjn64URL\n"

    const-string v2, "pY0lPxINPVI=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "8aw7nIjm8w==\n"

    const-string v3, "wpUVpbjSwU4=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "3f5Z\n"

    const-string v4, "tpsgeLwwj7M=\n"

    const-string v5, "lNdk\n"

    const-string v7, "8LICxVL6724=\n"

    invoke-static {v3, v4, v2, v5, v7}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    move-result-object v0

    :goto_20
    invoke-static {v0}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_2e

    const-wide v0, 0x4043f3bcd35a8588L    # 39.9042

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_2e
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_2f
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Nbo94AzQBt0mqi3J\n"

    const-string v2, "Ut9JrGO+YbQ=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "O4nJ8xhCY4YPgN7L\n"

    const-string v1, "UOywrHUtAO0=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "+rryrQDkJQ0=\n"

    const-string v2, "y4vEgzTUEjk=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "3f5Z\n"

    const-string v3, "tpsgeLwwj7M=\n"

    const-string v4, "lNdk\n"

    const-string v5, "8LICxVL6724=\n"

    invoke-static {v2, v3, v1, v4, v5}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_c
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    move-result-object v0

    :goto_21
    invoke-static {v0}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_30

    const-wide v0, 0x405d1a12d77318fcL    # 116.4074

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_30
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_0

    :catchall_9
    move-exception v1

    :try_start_d
    sget-object v3, Lgn;->a:Lgn;

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_31

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    move-result-object v0

    goto :goto_20

    :cond_31
    move v1, v6

    goto :goto_22

    :catchall_a
    move-exception v2

    :try_start_e
    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_32

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v6}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    move-result-object v0

    goto :goto_21

    :pswitch_6
    const-string v0, "6A==\n"

    const-string v1, "mNsSAod3j84=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "gAY704Bws0u0Dy3vjGu5T4U=\n"

    const-string v1, "62NCjO0f0CA=\n"

    sget-object v2, Lgn;->a:Lgn;

    invoke-static {v0, v1, v2}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_34

    check-cast v0, Ljava/util/List;

    :goto_23
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v0, "RgdFFkgMuzYHXQ5KAA==\n"

    const-string v1, "L3MgZCl41EQ=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_33
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_33

    :try_start_f
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v0, "Hg3T3cOULCMdG4++iM5t\n"

    const-string v1, "eWinkKbgREw=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v7, v5

    move v1, v6

    :goto_25
    if-ge v1, v7, :cond_36

    aget-object v0, v5, v1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "AesgM7GMCGwG6yYEsA==\n"

    const-string v10, "co5UYdTrYR8=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_35

    :goto_26
    if-eqz v0, :cond_33

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v7, v1, v5

    invoke-virtual {v0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    goto :goto_24

    :catchall_b
    move-exception v0

    goto :goto_24

    :cond_34
    move-object v0, v3

    goto :goto_23

    :cond_35
    rsub-int/lit8 v0, v1, 0x0

    rsub-int/lit8 v0, v0, 0x1

    move v1, v0

    goto :goto_25

    :cond_36
    move-object v0, v3

    goto :goto_26

    :catchall_c
    move-exception v1

    goto/16 :goto_21

    :catchall_d
    move-exception v1

    goto/16 :goto_20

    :catchall_e
    move-exception v1

    goto/16 :goto_1b

    :catchall_f
    move-exception v1

    goto/16 :goto_18

    :cond_37
    move-object v0, v3

    goto/16 :goto_10

    :cond_38
    move-object v1, v0

    goto/16 :goto_f

    :cond_39
    move-object v0, v3

    goto/16 :goto_7

    :cond_3a
    move-object v1, v0

    goto/16 :goto_6

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 50

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v33, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    const-wide/16 v48, 0x0

    const-wide/16 v22, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/16 v36, 0x0

    const/16 v26, 0x0

    const/16 v32, 0x0

    const/16 v45, 0x0

    const/16 v44, 0x0

    const/4 v7, 0x0

    const/16 v25, 0x0

    const/16 v24, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v42, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v18, 0x0

    const/16 v46, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/16 v35, 0x0

    const/16 v21, 0x0

    const/16 v39, 0x0

    const/4 v6, 0x0

    const-string v30, "\u06e1\u06e1\u06e2"

    invoke-static/range {v30 .. v30}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v30, v4

    move-object/from16 v31, v13

    :goto_0
    sparse-switch v41, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-nez v21, :cond_2c

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v13, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    mul-int/lit16 v13, v13, 0x23c1

    rem-int/2addr v4, v13

    if-ltz v4, :cond_48

    :goto_1
    const-string v4, "\u06e8\u06e6\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto :goto_0

    :sswitch_1
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v13, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/lit16 v13, v13, -0x1997

    add-int/2addr v4, v13

    if-ltz v4, :cond_0

    const/16 v4, 0x3c

    sput v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v4, "\u06e2\u06e1\u06e5"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto :goto_0

    :cond_0
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v13, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v4, v13

    const v13, 0x1ab88e

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto :goto_0

    :sswitch_2
    const-string v4, "3f5Z\n"

    const-string v13, "tpsgeLwwj7M=\n"

    const-string v41, "lNdk\n"

    const-string v47, "8LICxVL6724=\n"

    move-object/from16 v0, v30

    move-object/from16 v1, v41

    move-object/from16 v2, v47

    invoke-static {v4, v13, v0, v1, v2}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v36

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v4, :cond_1

    const-string v4, "\u06e1\u06e6\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06e7\u06e8\u06e8"

    invoke-static {v4}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto :goto_0

    :sswitch_3
    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v13, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v4, v13

    const v13, 0x1aa5a8

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto :goto_0

    :sswitch_4
    const-string v4, "\u06e1\u06e6\u06e7"

    :goto_2
    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto :goto_0

    :sswitch_5
    :try_start_0
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v30

    move/from16 v1, v44

    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v7

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v13, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v4, v13

    const v13, -0x1aada2

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v4

    if-gtz v4, :cond_2

    const-string v4, "\u06e4\u06e5\u06e2"

    :goto_3
    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e1\u06e1\u06e2"

    goto :goto_3

    :cond_3
    :sswitch_7
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v13, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/lit16 v13, v13, 0x4db

    xor-int/2addr v4, v13

    if-ltz v4, :cond_4

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v4, "\u06e3\u06e4\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e8\u06e6\u06df"

    :goto_4
    invoke-static {v4}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "qw==\n"

    const-string v13, "2/WvGUzTdLk=\n"

    invoke-static {v4, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "PFeAgqtxaEgIUIu0oHZ/TTJBig==\n"

    const-string v13, "VzL53cceCyM=\n"

    sget-object v41, Lgn;->a:Lgn;

    move-object/from16 v0, v41

    invoke-static {v4, v13, v0}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v4

    if-nez v4, :cond_2e

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/lit16 v13, v13, 0x1c63

    add-int/2addr v4, v13

    if-gtz v4, :cond_5

    const/16 v4, 0xe

    sput v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v4, "\u06e0\u06df\u06e5"

    invoke-static {v4}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v4, v13

    const v13, 0x1aaeb2

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :catchall_0
    move-exception v4

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/lit16 v13, v13, 0x1b4f

    add-int/2addr v4, v13

    if-gtz v4, :cond_6

    const/16 v4, 0x32

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v4, "\u06e5\u06e8"

    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v39, v34

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_6
    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v13, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    xor-int/2addr v4, v13

    const v13, 0x1abaf9

    add-int/2addr v4, v13

    move-object/from16 v39, v34

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_9
    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v4, v13

    const v13, 0x1ab8a2

    add-int/2addr v4, v13

    move-object/from16 v25, v6

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_8

    const/16 v4, 0xe

    sput v4, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v4, "\u06e4\u06e1\u06e1"

    :goto_5
    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06e1\u06e6\u06e6"

    move-object v4, v10

    :goto_6
    invoke-static {v13}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v13

    move-object v10, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v4

    if-gtz v4, :cond_9

    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    const-string v4, "\u06e1\u06e6\u06e6"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move/from16 v44, v45

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e8\u06e2\u06e3"

    invoke-static {v4}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move/from16 v44, v45

    goto/16 :goto_0

    :sswitch_c
    sget v4, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v4, :cond_a

    const-string v4, "\u06e1\u06e4\u06e1"

    goto/16 :goto_2

    :cond_a
    const-string v4, "\u06e1\u06e7\u06e5"

    :goto_7
    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v4

    if-gtz v4, :cond_b

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v4, "\u06e2\u06e3\u06e0"

    :goto_8
    invoke-static {v4}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e8\u06e2\u06e3"

    goto :goto_8

    :sswitch_e
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v4

    if-gtz v4, :cond_c

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    const-string v4, "\u06e0\u06e8\u06e7"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_c
    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    or-int/2addr v4, v13

    const v13, -0x1ab630

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_f
    const-string v4, "nQ==\n"

    const-string v13, "7T/+s/wSNTA=\n"

    invoke-static {v4, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "QFl5bUyrvz5IV19FXKelOE5L\n"

    const-string v13, "KzwAMjnF01E=\n"

    sget-object v41, Lgn;->a:Lgn;

    move-object/from16 v0, v41

    invoke-static {v4, v13, v0}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v13, v13, -0x1c49

    sub-int/2addr v4, v13

    if-gtz v4, :cond_d

    const-string v4, "\u06e2\u06df\u06e7"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06df\u06e1\u06e6"

    goto/16 :goto_3

    :sswitch_10
    :try_start_1
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v0, v19

    invoke-static {v12, v0}, Lgn;->b(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v13, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    mul-int/lit16 v13, v13, -0x21b1

    or-int/2addr v8, v13

    if-gtz v8, :cond_e

    :goto_9
    const-string v8, "\u06e4\u06e0\u06e6"

    invoke-static {v8}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v13

    move-object v8, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_e
    move-object v8, v4

    :goto_a
    const-string v4, "\u06e2\u06e3\u06e5"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_11
    sget v4, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    if-gtz v4, :cond_f

    const-string v4, "\u06e1\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move/from16 v46, v29

    goto/16 :goto_0

    :cond_f
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v13, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v4, v13

    const v13, 0x1aae73

    xor-int/2addr v4, v13

    move/from16 v41, v4

    move/from16 v46, v29

    goto/16 :goto_0

    :sswitch_12
    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v4, :cond_10

    const-string v4, "\u06df\u06e4\u06e3"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_10
    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v13, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v4, v13

    const v13, 0x1ab6c5

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_11
    :sswitch_13
    const-string v4, "\u06e4\u06e0\u06e6"

    :goto_b
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_12
    :sswitch_14
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v4

    if-gtz v4, :cond_13

    const-string v4, "\u06e1\u06e3\u06df"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06df\u06e4\u06e4"

    goto/16 :goto_2

    :catchall_1
    move-exception v4

    :try_start_2
    sget-object v4, Lgn;->a:Lgn;

    invoke-static/range {v36 .. v36}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v13, :cond_41

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v44

    sget v13, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v32, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int v13, v13, v32

    const v32, 0x1abe6f

    add-int v13, v13, v32

    move-object/from16 v32, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_14
    :sswitch_15
    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v13, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    or-int/2addr v4, v13

    const v13, -0x1ab39d

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_16
    const-wide v48, 0x4043f3bcd35a8588L    # 39.9042

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    if-gtz v4, :cond_15

    const-string v4, "\u06e1\u06e1\u06e2"

    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_15
    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/2addr v4, v13

    const v13, 0x1ab90b

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v4

    if-gtz v4, :cond_11

    const-string v4, "5iWRpnosLmKbSXR8DX"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->ۨۤۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v42

    sget v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v13, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/lit16 v13, v13, 0x26de

    add-int/2addr v4, v13

    if-gtz v4, :cond_16

    const-string v4, "\u06e4\u06e7\u06e1"

    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_16
    const-string v4, "\u06e4\u06e6\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_18
    const/4 v4, 0x0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v9

    if-gtz v9, :cond_17

    move-object v9, v4

    goto/16 :goto_a

    :cond_17
    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v9, v13

    const v13, 0x1aabbe

    add-int/2addr v13, v9

    move-object v9, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_19
    const-string v4, "ouI/qDRqgQ==\n"

    const-string v13, "kdsRkQRes5c=\n"

    invoke-static {v4, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v13, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v34, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    move/from16 v0, v34

    xor-int/lit16 v0, v0, -0x14a

    move/from16 v34, v0

    or-int v13, v13, v34

    if-ltz v13, :cond_18

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    const-string v13, "\u06e3\u06e4\u06e1"

    invoke-static {v13}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v34, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_18
    sget v13, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v34, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    div-int v13, v13, v34

    const v34, 0x1abea4

    add-int v13, v13, v34

    move-object/from16 v34, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_1a
    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v13, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sub-int/2addr v4, v13

    const v13, 0x1ac62e

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v13, 0x0

    sget-object v41, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v41, v4, v13

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v13, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    mul-int/2addr v4, v13

    const v13, 0xe492e

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_19
    :sswitch_1c
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v4

    if-ltz v4, :cond_1a

    const-string v13, "\u06e3\u06e1\u06e7"

    move-object v4, v10

    goto/16 :goto_6

    :cond_1a
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v13, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v4, v13

    const v13, 0xd7bf

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_1d
    const-string v4, "\u06e7\u06e8\u06e8"

    goto/16 :goto_7

    :sswitch_1e
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v13, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/lit16 v13, v13, -0xeaa

    or-int/2addr v4, v13

    if-ltz v4, :cond_1b

    const/16 v4, 0x53

    sput v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    const-string v4, "\u06e8\u06e1\u06e7"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_1b
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v13, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/2addr v4, v13

    const v13, 0x1aafae

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_1f
    :try_start_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v4, v13

    const v13, 0x1ab71e

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_20
    invoke-static/range {v24 .. v24}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    goto/16 :goto_1

    :sswitch_21
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v13, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    div-int/lit16 v13, v13, 0x12d6

    or-int/2addr v4, v13

    if-ltz v4, :cond_1c

    const/16 v4, 0x15

    sput v4, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v4, "\u06e1\u06e6\u06e8"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v40, v37

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_1c
    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/2addr v4, v13

    const v13, -0x1ab275

    xor-int/2addr v4, v13

    move-object/from16 v40, v37

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v4}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v13, "bZIC7gMSvrtqghLH\n"

    const-string v41, "Hvd2omx82dI=\n"

    move-object/from16 v0, v41

    invoke-static {v13, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v4, v13}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    move-object/from16 v0, p1

    iget-object v13, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v4, "ry6j8VPAIJCbJ7TJ\n"

    const-string v30, "xEvarj6vQ/s=\n"

    move-object/from16 v0, v30

    invoke-static {v4, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v30, "3Wt/mMbrLYE=\n"

    const-string v31, "7FpJtvLbGrU=\n"

    invoke-static/range {v30 .. v31}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    const-string v30, "\u06e2\u06e0\u06e4"

    invoke-static/range {v30 .. v30}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v30, v4

    move-object/from16 v31, v13

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v4, v18

    :cond_1d
    sget v13, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v13, :cond_1e

    const-string v13, "\u06e2\u06e2\u06e1"

    invoke-static {v13}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v18, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_1e
    sget v13, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v18, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int v13, v13, v18

    const v18, 0x1ab71e

    xor-int v13, v13, v18

    move-object/from16 v18, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_24
    const/4 v4, 0x0

    move/from16 v0, v46

    move/from16 v1, v28

    if-ge v0, v1, :cond_1d

    aget-object v13, v27, v46

    instance-of v0, v13, Landroid/view/WindowManager$LayoutParams;

    move/from16 v18, v0

    if-eqz v18, :cond_31

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v18, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, 0x2cd

    move/from16 v18, v0

    xor-int v5, v5, v18

    if-gtz v5, :cond_1f

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v5, "\u06e4\u06e2\u06e1"

    invoke-static {v5}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v18, v4

    move-object v5, v13

    goto/16 :goto_0

    :cond_1f
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v18, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sub-int v5, v5, v18

    const v18, 0x1abedc

    add-int v41, v5, v18

    move-object/from16 v18, v4

    move-object v5, v13

    goto/16 :goto_0

    :pswitch_0
    :sswitch_25
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v13, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/lit16 v13, v13, 0x11a7

    add-int/2addr v4, v13

    if-gtz v4, :cond_20

    const-string v4, "\u06e7\u06e7\u06e3"

    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_20
    const-string v4, "\u06e4\u06e6\u06e5"

    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_26
    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    xor-int/2addr v4, v13

    const v13, 0x1ac23d

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :pswitch_1
    :sswitch_27
    sget v4, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v13, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v13, v13, -0xb6e

    xor-int/2addr v4, v13

    if-gtz v4, :cond_21

    const/16 v4, 0x43

    sput v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v4, "\u06e7\u06e3\u06e5"

    goto/16 :goto_7

    :cond_21
    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    mul-int/2addr v4, v13

    const v13, 0x1cebf8

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_28
    const-string v13, "\u06e2\u06e1\u06e5"

    move-object v4, v10

    move-wide/from16 v14, v16

    goto/16 :goto_6

    :sswitch_29
    const/4 v4, 0x0

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    aput-object v13, v31, v4

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    or-int/2addr v4, v13

    const v13, 0x1ac7bc

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_2a
    const-wide v16, 0x405d1a12d77318fcL    # 116.4074

    const-string v4, "\u06e8\u06e3\u06e5"

    :goto_d
    invoke-static {v4}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_2b
    const/high16 v4, -0x40800000    # -1.0f

    move-object/from16 v0, v21

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v4

    if-ltz v4, :cond_22

    const-string v4, "\u06e8\u06e5\u06e2"

    invoke-static {v4}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_22
    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v13, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    or-int/2addr v4, v13

    const v13, -0x1ac579

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_2c
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v4

    if-gtz v4, :cond_23

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v4, "\u06e0\u06e4\u06e8"

    :goto_e
    invoke-static {v4}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_23
    const-string v4, "\u06e8\u06e4\u06e4"

    goto/16 :goto_c

    :cond_24
    :sswitch_2d
    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v13, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v13, v13, -0xe8

    sub-int/2addr v4, v13

    if-gtz v4, :cond_25

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v4, "\u06e7\u06e8\u06e2"

    goto/16 :goto_b

    :cond_25
    const-string v4, "\u06e2\u06e2\u06e4"

    goto/16 :goto_7

    :sswitch_2e
    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v13, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/lit16 v13, v13, 0x1231

    sub-int/2addr v4, v13

    if-ltz v4, :cond_26

    const/16 v4, 0x52

    sput v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v4, "\u06e6\u06e3\u06e6"

    goto/16 :goto_4

    :cond_26
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v13, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v4, v13

    const v13, 0x1ac1e7

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_2f
    const-string v4, "3f5Z\n"

    const-string v13, "tpsgeLwwj7M=\n"

    const-string v41, "lNdk\n"

    const-string v47, "8LICxVL6724=\n"

    move-object/from16 v0, v41

    move-object/from16 v1, v47

    invoke-static {v4, v13, v12, v0, v1}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v34

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v4, :cond_27

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06e8\u06e5\u06e4"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_27
    const-string v4, "\u06e1\u06e6\u06e8"

    goto/16 :goto_5

    :cond_28
    :sswitch_30
    const-string v4, "\u06e7\u06e8\u06e4"

    :goto_f
    invoke-static {v4}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_31
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v13, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/lit16 v13, v13, 0x234

    div-int/2addr v4, v13

    if-eqz v4, :cond_29

    const-string v4, "\u06e4\u06e7\u06e4"

    :goto_10
    invoke-static {v4}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_29
    const-string v4, "\u06e8\u06e1\u06e1"

    goto/16 :goto_4

    :sswitch_32
    sget v4, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v13, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/lit16 v13, v13, -0x140

    mul-int/2addr v4, v13

    if-gtz v4, :cond_2a

    const-string v4, "\u06e3\u06e6\u06e4"

    invoke-static {v4}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2a
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v13, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v4, v13

    const v13, 0x1aaaf3

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_33
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v4

    if-gtz v4, :cond_2b

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v4, "\u06e0\u06e5\u06df"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2b
    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v13, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v4, v13

    const v13, 0x1aba24

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2c
    :sswitch_34
    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_2d

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v4, "\u06e5\u06e3\u06e7"

    invoke-static {v4}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2d
    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v13, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    div-int/2addr v4, v13

    const v13, -0x1aa73c

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2e
    :sswitch_35
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v4

    if-gtz v4, :cond_2f

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v4, "\u06e6\u06e6\u06e5"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_2f
    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v13, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/2addr v4, v13

    const v13, 0x1ab833

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_36
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v4

    if-ltz v4, :cond_30

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move/from16 v4, v19

    :goto_11
    const-string v13, "\u06e3\u06e5\u06e7"

    move/from16 v19, v4

    :goto_12
    invoke-static {v13}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_30
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_37
    move-object/from16 v4, v18

    :cond_31
    sget v13, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v18, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x1726

    move/from16 v18, v0

    add-int v13, v13, v18

    if-gtz v13, :cond_32

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    const-string v13, "\u06e4\u06e1\u06e7"

    invoke-static {v13}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v18, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_32
    sget v13, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v18, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int v13, v13, v18

    const v18, 0x1ac8cb

    add-int v13, v13, v18

    move-object/from16 v18, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_38
    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v4, v4, 0x266

    add-int v13, v46, v4

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v41, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    move/from16 v0, v41

    add-int/lit16 v0, v0, -0xc7d

    move/from16 v41, v0

    sub-int v4, v4, v41

    if-gtz v4, :cond_33

    const/16 v4, 0x59

    sput v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v4, "\u06df\u06e1\u06e0"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move/from16 v46, v13

    goto/16 :goto_0

    :cond_33
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v41, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sub-int v4, v4, v41

    const v41, 0x1abf44

    xor-int v4, v4, v41

    move/from16 v41, v4

    move/from16 v46, v13

    goto/16 :goto_0

    :sswitch_39
    move-object/from16 v4, v21

    :goto_13
    sget v13, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v13, :cond_34

    const-string v13, "\u06e6\u06e2\u06e5"

    invoke-static {v13}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v21, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_34
    const-string v13, "\u06df\u06df"

    invoke-static {v13}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v21, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_3a
    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v4

    if-gtz v4, :cond_35

    const-string v4, "\u06e7\u06e2\u06e8"

    move-object/from16 v13, v24

    :goto_14
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_35
    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v13, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    or-int/2addr v4, v13

    const v13, 0x1ab39f

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_3b
    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v13, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/lit16 v13, v13, -0x2189

    mul-int/2addr v4, v13

    if-ltz v4, :cond_36

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    const-string v4, "\u06e8\u06df"

    :goto_15
    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_36
    sget v4, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v13, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/2addr v4, v13

    const v13, 0x1aaaee

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_3c
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-wide/from16 v0, v42

    invoke-virtual {v4, v0, v1}, Ljava/io/PrintStream;->println(J)V

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    xor-int/lit16 v13, v13, 0x1de2

    xor-int/2addr v4, v13

    if-ltz v4, :cond_37

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v4, "\u06e2\u06e4\u06e8"

    invoke-static {v4}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_37
    move-object v4, v8

    goto/16 :goto_9

    :sswitch_3d
    instance-of v4, v5, Landroid/view/WindowManager$LayoutParams;

    if-eqz v4, :cond_4a

    move-object v4, v5

    check-cast v4, Landroid/view/WindowManager$LayoutParams;

    sget v13, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v13, :cond_38

    const/16 v13, 0x52

    sput v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v13, "\u06df\u06e3\u06e2"

    invoke-static {v13}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v35, v4

    move-object/from16 v21, v18

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_38
    sget v13, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v21, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int v13, v13, v21

    const v21, 0x1ab31c

    add-int v13, v13, v21

    move-object/from16 v35, v4

    move-object/from16 v21, v18

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_3e
    :try_start_4
    move-object/from16 v0, v30

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-result-object v4

    :goto_16
    const-string v13, "\u06e6\u06e7\u06e5"

    invoke-static {v13}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v26, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_3f
    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v4

    if-ltz v4, :cond_39

    const-string v4, "\u06e2\u06e0\u06e2"

    goto/16 :goto_f

    :cond_39
    sget v4, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v13, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/2addr v4, v13

    const v13, 0x1acdb3

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_40
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v13, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    mul-int/2addr v4, v13

    const v13, 0x1727e5

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_41
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v13, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v4, v13

    const v13, -0x1aaae0

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_42
    const/16 v20, 0x0

    sget v4, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v13, v13, -0xa09

    or-int/2addr v4, v13

    if-ltz v4, :cond_3a

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-object/from16 v4, v26

    goto :goto_16

    :cond_3a
    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    or-int/2addr v4, v13

    const v13, 0x1ac041

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :catchall_2
    move-exception v4

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v4

    if-gtz v4, :cond_3b

    const-string v4, "\u06e2\u06e6\u06e0"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v6, v36

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_3b
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v6, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sub-int/2addr v4, v6

    const v6, 0x1ac423

    add-int/2addr v4, v6

    move-object/from16 v6, v36

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_43
    sget v4, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v13, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/lit16 v13, v13, -0xe1

    xor-int/2addr v4, v13

    if-gtz v4, :cond_3c

    const-string v4, "\u06e4\u06e6"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move-wide/from16 v22, v48

    goto/16 :goto_0

    :cond_3c
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v13, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v4, v13

    const v13, 0x1ac968

    add-int/2addr v4, v13

    move/from16 v41, v4

    move-wide/from16 v22, v48

    goto/16 :goto_0

    :sswitch_44
    move-object/from16 v0, p0

    iget v4, v0, Lp50;->a:I

    packed-switch v4, :pswitch_data_0

    :pswitch_3
    :sswitch_45
    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v4, v13

    const v13, 0x1ab3b1

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_46
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v13, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/2addr v4, v13

    const v13, 0x1abc89

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_47
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v13, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v4, v13

    const v13, -0x1ac88b

    xor-int/2addr v4, v13

    move-object/from16 v40, v38

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_3d
    :sswitch_48
    sget v4, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v4, :cond_3e

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    const-string v4, "\u06df\u06e0\u06e1"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_3e
    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v13, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/2addr v4, v13

    const v13, -0x1ac54a

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_49
    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v4

    if-gtz v4, :cond_3f

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v4, "\u06e1\u06e1"

    invoke-static {v4}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    move/from16 v19, v20

    goto/16 :goto_0

    :cond_3f
    move/from16 v4, v20

    goto/16 :goto_11

    :sswitch_4a
    move-object/from16 v0, v21

    iget v4, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/4 v13, 0x0

    cmpl-float v13, v4, v13

    if-lez v13, :cond_3d

    const/high16 v13, -0x40800000    # -1.0f

    cmpg-float v4, v4, v13

    if-nez v4, :cond_7

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v4

    if-gtz v4, :cond_40

    const/16 v4, 0x4a

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v4, "\u06e6\u06e3\u06e3"

    goto/16 :goto_d

    :cond_40
    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v13, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    rem-int/2addr v4, v13

    const v13, 0x1abca0

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_41
    :sswitch_4b
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v13, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v13, v13, 0x1a73

    mul-int/2addr v4, v13

    if-ltz v4, :cond_42

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v4, "\u06e8\u06e6\u06e4"

    invoke-static {v4}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_42
    const-string v4, "\u06e4\u06e6"

    goto/16 :goto_2

    :sswitch_4c
    const-string v4, "NQ==\n"

    const-string v11, "RWjt2IJ6vAA=\n"

    invoke-static {v4, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v11, Lgn;->a:Lgn;

    const-string v4, "1dgSEiOGAsbh0QQuL50IwtA=\n"

    const-string v13, "vr1rTU7pYa0=\n"

    invoke-static {v4, v13, v11}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v4

    if-eqz v4, :cond_28

    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v4}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v13, "MMpjuErjaw42y3I=\n"

    const-string v41, "Q68X9CuXAno=\n"

    move-object/from16 v0, v41

    invoke-static {v13, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v4, v13}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v10, "IWLNsZYo5IYVa9Wa\n"

    const-string v12, "Sge07vtHh+0=\n"

    invoke-static {v10, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v10

    if-gtz v10, :cond_43

    const-string v10, "\u06e2\u06e2\u06e8"

    invoke-static {v10}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v13

    move-object v10, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :cond_43
    const-string v10, "\u06e1\u06e6\u06e5"

    move-object v13, v10

    goto/16 :goto_6

    :sswitch_4d
    move-object/from16 v0, p1

    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const-string v13, "HMuFtQ==\n"

    const-string v27, "fbnixsVHb4s=\n"

    move-object/from16 v0, v27

    invoke-static {v13, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v13, v4

    const/16 v29, 0x0

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v27

    if-gtz v27, :cond_44

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v27, "\u06e1\u06e7\u06e5"

    invoke-static/range {v27 .. v27}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v27, v4

    move/from16 v28, v13

    goto/16 :goto_0

    :sswitch_4e
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v13, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    add-int/lit16 v13, v13, -0x218e

    div-int/2addr v4, v13

    if-eqz v4, :cond_45

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-object/from16 v4, v27

    move-object/from16 v24, v25

    move/from16 v13, v28

    :cond_44
    const-string v27, "\u06e2\u06e4\u06e6"

    invoke-static/range {v27 .. v27}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v41

    move-object/from16 v27, v4

    move/from16 v28, v13

    goto/16 :goto_0

    :cond_45
    const-string v4, "\u06e8\u06e5\u06e2"

    move-object/from16 v13, v25

    goto/16 :goto_14

    :sswitch_4f
    const/16 v45, 0x0

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v13, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v4, v13

    const v13, 0x1ab322

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_50
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/2addr v4, v13

    const v13, -0x1bba33

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_51
    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v13, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int/2addr v4, v13

    const v13, -0x1ac4d2

    xor-int/2addr v4, v13

    move-object/from16 v38, v39

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_52
    const-string v4, "\u06e6\u06e5\u06e8"

    move-object v5, v9

    goto/16 :goto_15

    :sswitch_53
    const-string v4, "\u06df\u06e3\u06e1"

    move-object v6, v7

    goto/16 :goto_5

    :sswitch_54
    :try_start_5
    sget-object v4, Lgn;->a:Lgn;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v4, :cond_46

    const/16 v4, 0x19

    sput v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v4, "\u06e4\u06e0\u06e7"

    invoke-static {v4}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_46
    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v13, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    xor-int/2addr v4, v13

    const v13, 0x1ac566

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_55
    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v13, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    or-int/2addr v4, v13

    const v13, 0x1ac943

    add-int/2addr v4, v13

    move-object/from16 v39, v8

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_56
    invoke-static/range {v40 .. v40}, La50;->A(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v22

    const-string v4, "\u06e1\u06df\u06e7"

    move-object v13, v4

    goto/16 :goto_12

    :catchall_3
    move-exception v4

    :try_start_6
    sget-object v4, Lgn;->a:Lgn;

    invoke-static/range {v34 .. v34}, Lb50;->R(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v13, :cond_19

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result v19

    sget v13, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v33, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int v13, v13, v33

    const v33, 0x215ae5

    add-int v13, v13, v33

    move-object/from16 v33, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_57
    :try_start_7
    move-object/from16 v0, v34

    invoke-static {v12, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-result-object v4

    sget v13, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v37, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int v13, v13, v37

    const v37, -0x1aae5a

    xor-int v13, v13, v37

    move-object/from16 v37, v4

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_58
    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v13, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sub-int/2addr v4, v13

    const v13, 0xd95a

    add-int/2addr v4, v13

    move-object/from16 v21, v35

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_59
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v4, :cond_47

    const-string v4, "\u06df\u06e6\u06e8"

    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v26

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_47
    const-string v4, "\u06df\u06e0\u06e2"

    move-object/from16 v24, v26

    goto/16 :goto_10

    :cond_48
    const-string v4, "\u06e6\u06e2\u06e8"

    goto/16 :goto_e

    :sswitch_5a
    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    div-int/2addr v4, v13

    const v13, 0x1aab00

    add-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_5b
    const/4 v4, 0x0

    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    aput-object v13, v10, v4

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v4, :cond_49

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    const-string v4, "\u06e2\u06e7"

    invoke-static {v4}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v41, v4

    goto/16 :goto_0

    :cond_49
    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v13, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/2addr v4, v13

    const v13, -0x1ab25a

    xor-int/2addr v4, v13

    move/from16 v41, v4

    goto/16 :goto_0

    :sswitch_5c
    return-void

    :cond_4a
    move-object/from16 v4, v18

    goto/16 :goto_13

    :sswitch_data_0
    .sparse-switch
        0xdbe0 -> :sswitch_0
        0xdc02 -> :sswitch_26
        0xdc20 -> :sswitch_30
        0xdc40 -> :sswitch_37
        0xdc45 -> :sswitch_23
        0xdc7c -> :sswitch_3b
        0xdc81 -> :sswitch_42
        0xdc82 -> :sswitch_4f
        0xdca3 -> :sswitch_1d
        0xdcdd -> :sswitch_48
        0x1aa721 -> :sswitch_4
        0x1aa73e -> :sswitch_4a
        0x1aa744 -> :sswitch_1b
        0x1aa75e -> :sswitch_45
        0x1aa763 -> :sswitch_2d
        0x1aa77d -> :sswitch_9
        0x1aa77e -> :sswitch_48
        0x1aa79f -> :sswitch_16
        0x1aa7db -> :sswitch_d
        0x1aa7e1 -> :sswitch_4c
        0x1aaac5 -> :sswitch_3a
        0x1aaac6 -> :sswitch_24
        0x1aaafe -> :sswitch_2c
        0x1aab03 -> :sswitch_2c
        0x1aab25 -> :sswitch_8
        0x1aab26 -> :sswitch_1a
        0x1aab7a -> :sswitch_7
        0x1aab83 -> :sswitch_1e
        0x1aabdf -> :sswitch_25
        0x1aae89 -> :sswitch_5a
        0x1aaec2 -> :sswitch_44
        0x1aaec7 -> :sswitch_a
        0x1aaf1f -> :sswitch_53
        0x1aaf25 -> :sswitch_52
        0x1aaf60 -> :sswitch_19
        0x1aaf61 -> :sswitch_2b
        0x1aaf62 -> :sswitch_3f
        0x1aaf63 -> :sswitch_1f
        0x1aaf7f -> :sswitch_21
        0x1ab249 -> :sswitch_3
        0x1ab24a -> :sswitch_40
        0x1ab266 -> :sswitch_2
        0x1ab286 -> :sswitch_29
        0x1ab2a0 -> :sswitch_1
        0x1ab2a4 -> :sswitch_22
        0x1ab2a8 -> :sswitch_15
        0x1ab2c4 -> :sswitch_55
        0x1ab2e1 -> :sswitch_3a
        0x1ab2e4 -> :sswitch_11
        0x1ab2e6 -> :sswitch_31
        0x1ab2fc -> :sswitch_2a
        0x1ab31c -> :sswitch_58
        0x1ab322 -> :sswitch_b
        0x1ab626 -> :sswitch_48
        0x1ab687 -> :sswitch_18
        0x1ab6a0 -> :sswitch_4d
        0x1ab6c5 -> :sswitch_10
        0x1ab6e1 -> :sswitch_1c
        0x1ab71d -> :sswitch_13
        0x1ab71e -> :sswitch_57
        0x1ab720 -> :sswitch_4e
        0x1ab722 -> :sswitch_3f
        0x1ab9ea -> :sswitch_5c
        0x1ab9eb -> :sswitch_36
        0x1aba23 -> :sswitch_26
        0x1aba42 -> :sswitch_48
        0x1aba68 -> :sswitch_41
        0x1aba9f -> :sswitch_3c
        0x1abaa3 -> :sswitch_f
        0x1abaa4 -> :sswitch_2e
        0x1abaa5 -> :sswitch_12
        0x1ababe -> :sswitch_50
        0x1abac1 -> :sswitch_43
        0x1abd8d -> :sswitch_1a
        0x1abdab -> :sswitch_50
        0x1abdad -> :sswitch_d
        0x1abdca -> :sswitch_27
        0x1abe3f -> :sswitch_12
        0x1abe40 -> :sswitch_49
        0x1abe45 -> :sswitch_46
        0x1abe5e -> :sswitch_41
        0x1abea4 -> :sswitch_2f
        0x1ac189 -> :sswitch_33
        0x1ac1ac -> :sswitch_e
        0x1ac1c5 -> :sswitch_35
        0x1ac1c6 -> :sswitch_c
        0x1ac209 -> :sswitch_3d
        0x1ac228 -> :sswitch_14
        0x1ac244 -> :sswitch_59
        0x1ac247 -> :sswitch_34
        0x1ac50a -> :sswitch_3
        0x1ac50e -> :sswitch_47
        0x1ac528 -> :sswitch_39
        0x1ac548 -> :sswitch_5c
        0x1ac5e8 -> :sswitch_4b
        0x1ac623 -> :sswitch_17
        0x1ac627 -> :sswitch_54
        0x1ac8cb -> :sswitch_38
        0x1ac908 -> :sswitch_5c
        0x1ac90d -> :sswitch_56
        0x1ac927 -> :sswitch_51
        0x1ac929 -> :sswitch_5
        0x1ac94a -> :sswitch_28
        0x1ac963 -> :sswitch_3e
        0x1ac968 -> :sswitch_5b
        0x1ac985 -> :sswitch_20
        0x1ac987 -> :sswitch_6
        0x1ac9a1 -> :sswitch_5c
        0x1ac9aa -> :sswitch_32
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method
