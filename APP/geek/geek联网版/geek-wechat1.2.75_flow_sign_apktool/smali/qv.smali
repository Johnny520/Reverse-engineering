.class public final synthetic Lqv;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3

    iput p4, p0, Lqv;->a:I

    iput-object p1, p0, Lqv;->b:Ljava/lang/Object;

    iput-object p2, p0, Lqv;->c:Ljava/lang/Object;

    iput-object p3, p0, Lqv;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e5\u06df"

    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    div-int/2addr v1, v2

    const v2, -0x1ac5e0

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_0
    :sswitch_2
    const-string v1, "\u06e1\u06e4\u06e5"

    :goto_1
    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    rem-int/lit16 v2, v2, -0x1d88

    or-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06e6\u06e5\u06df"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v1, v2

    const v2, -0x1aaf43

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v1

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v1, "\u06df\u06e1\u06e5"

    goto :goto_1

    :cond_2
    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v1, v2

    const v2, 0x1ac189

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    const-string v0, "4DP"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟ۢۧ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v1, :cond_3

    const-string v1, "\u06e8\u06e4\u06e8"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e8\u06e4\u06e8"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf22 -> :sswitch_0
        0x1ab664 -> :sswitch_4
        0x1abda4 -> :sswitch_2
        0x1ac200 -> :sswitch_1
        0x1ac5ff -> :sswitch_5
        0x1ac96c -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 15

    iget v4, p0, Lqv;->a:I

    const-string v3, ""

    iget-object v2, p0, Lqv;->d:Ljava/lang/Object;

    iget-object v1, p0, Lqv;->c:Ljava/lang/Object;

    iget-object v0, p0, Lqv;->b:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    check-cast v0, Landroid/widget/TextView;

    check-cast v1, Ljava/util/LinkedHashSet;

    check-cast v2, Lsv;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    const-string v4, "T13Rg26A\n"

    const-string v5, "qtJAau4BELY=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    sget-object v5, Lo40;->n:Lsh;

    if-eqz v4, :cond_1

    const-string v1, "r0JzdtCc\n"

    const-string v3, "Ss3in1AdN4s=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v6, 0xc8

    invoke-virtual {v1, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v1, Lo40;

    invoke-direct {v1, v0, v5}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    new-instance v3, Lp40;

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-direct {v3, v0}, Lp40;-><init>(F)V

    const/high16 v0, 0x43480000    # 200.0f

    invoke-virtual {v3, v0}, Lp40;->b(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v3, v0}, Lp40;->a(F)V

    iput-object v3, v1, Lo40;->k:Lp40;

    invoke-virtual {v1}, Lo40;->h()V

    :cond_0
    :goto_0
    sget-object v0, Lxh;->n:Lxh;

    :goto_1
    return-object v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\u53d1\u9001 ("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v1, Lo40;

    invoke-direct {v1, v0, v5}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/4 v0, 0x0

    const/high16 v2, 0x43480000    # 200.0f

    const v3, 0x3f19999a    # 0.6f

    invoke-static {v0, v2, v3}, Lg40;->f(FFF)Lp40;

    move-result-object v0

    iput-object v0, v1, Lo40;->k:Lp40;

    invoke-virtual {v1}, Lo40;->h()V

    goto :goto_0

    :pswitch_0
    check-cast v0, Ljava/lang/String;

    check-cast v1, Landroid/content/ContentValues;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const-string v4, "nZnQU2qjDjCE\n"

    const-string v5, "6/a5MA/KYFY=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "rgNzeeaM5PC3\n"

    const-string v5, "2GwaGoPlipY=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "R8tFLlKuOg==\n"

    const-string v5, "Kq42XTPJXxs=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    invoke-static {v1}, Lrv;->a(Landroid/content/ContentValues;)V

    :cond_3
    const-string v4, "p25EMeMfrw==\n"

    const-string v5, "ygs3QoJ4yuE=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const-string v0, "pMB1Hw==\n"

    const-string v4, "0LkFenD6DOk=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_2
    const-string v4, "7km6cCSFzKbpQA==\n"

    const-string v5, "hSzDL1bgr8c=\n"

    sget-object v6, Lkn;->a:Lkn;

    invoke-static {v4, v5, v6}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x2710

    if-lt v0, v4, :cond_5

    const-string v0, "GUZI4/k6lA==\n"

    const-string v4, "eikml5xU4C8=\n"

    invoke-static {v0, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v3

    :cond_4
    const-string v3, "vEoG1u/k\n"

    const-string v4, "WtiiM3R6WIU=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "/McjtdqjS4iGnjnV\n"

    const-string v4, "GHqDU0gHrhM=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "m8JDNerNTcCOwVNx\n"

    const-string v4, "4q02FZioLqE=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v0, v3, v4}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_5
    :goto_3
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_1

    :cond_6
    const/4 v0, 0x0

    goto :goto_2

    :cond_7
    const-string v0, "H3Uh+Tc=\n"

    const-string v3, "cgZGsFNYeKc=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_4
    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-nez v3, :cond_8

    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_b

    check-cast v0, [Ljava/lang/Object;

    :goto_5
    if-eqz v0, :cond_c

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {v0}, Li50;->P(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_8
    :goto_6
    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-eqz v3, :cond_9

    sget-object v3, Lt9;->b:Ljava/util/Map;

    const-string v4, "PId/izN9RiJvi3+bU3xEJz7INNEwJg==\n"

    const-string v5, "AOAa/x4PI1Q=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkn;->f(Ljava/lang/String;Z)V

    :cond_9
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    const-wide/16 v0, 0x0

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    goto :goto_5

    :cond_c
    const-wide/16 v0, 0x0

    goto :goto_6

    :cond_d
    const-string v2, "DSANLaJnhE4VPBArv2c=\n"

    const-string v3, "e09kTscT9i8=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "tF9wOJlL\n"

    const-string v2, "1zIDX9AvFhk=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_f

    :cond_e
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_7
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "voice_trans_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkn;->a:Lkn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkn;->f(Ljava/lang/String;Z)V

    sget-object v0, Lo9;->b:Landroid/os/Handler;

    new-instance v1, Lgn;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lgn;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_3

    :cond_f
    const-string v0, "4iSCCF8=\n"

    const-string v2, "j1flQTsOVio=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_e

    const-wide/16 v0, 0x0

    goto :goto_7

    :pswitch_1
    check-cast v0, Ljava/lang/String;

    check-cast v1, Landroid/content/ContentValues;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const-string v3, "FxKji9AUMw4O\n"

    const-string v4, "YX3K6LV9XWg=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "ivDlb3L7RU+T\n"

    const-string v4, "/J+MDBeSKyk=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "d/tVXoktJQ==\n"

    const-string v4, "Gp4mLehKQKE=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    :cond_10
    invoke-static {v1}, Lrv;->a(Landroid/content/ContentValues;)V

    :cond_11
    const-string v3, "QVnEw6Y4DA==\n"

    const-string v4, "LDy3sMdfaR0=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3a

    const-string v0, "92JI8w==\n"

    const-string v3, "gxs4lgbYfDU=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v4, v0

    :goto_8
    const-string v0, "hkI2ek9K\n"

    const-string v3, "7zFlHyEuwPE=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    :goto_9
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "atgVzEc546h33inHdiLap2/fBd0=\n"

    const-string v6, "A7ZmqTVNtME=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "C5FC6QRC\n"

    const-string v6, "Yv8xjHY2vuM=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    :cond_12
    sget-object v0, Lrv;->a:Ljava/util/ArrayList;

    const-string v0, "gzcjgEv5Dg==\n"

    const-string v3, "4FhN9C6Xem8=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_43

    const-string v0, ""

    move-object v6, v0

    :goto_a
    const v0, 0x1a000031

    if-eq v4, v0, :cond_13

    const v0, 0x1c000031

    if-eq v4, v0, :cond_13

    const/16 v0, 0x31

    if-ne v4, v0, :cond_14

    const-string v0, "Ot2nMQEwQa0ul7QyEXAD5z7WtjcdYg/sKcmyIldiAewqx7Y/V3gL4SjMoTUQZQDlL8S4\n"

    const-string v3, "TaXXUHgKboI=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    const-string v0, "K0iM7vVLcug5\n"

    const-string v3, "QC31sZk+EYM=\n"

    sget-object v7, Lkn;->a:Lkn;

    invoke-static {v0, v3, v7}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v0

    if-eqz v0, :cond_14

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    sget-object v3, Lls;->a:Lls;

    invoke-static {v0}, Lls;->b(Landroid/content/ContentValues;)V

    :cond_14
    const v0, 0x19000031

    if-eq v4, v0, :cond_15

    const v0, 0x1a000031

    if-eq v4, v0, :cond_15

    const/16 v0, 0x31

    if-ne v4, v0, :cond_19

    const-string v0, "TD/MHeMWOSUCItpC\n"

    const-string v3, "cEu+fI1lX0A=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_15
    if-nez v5, :cond_19

    const-string v0, "hfk0Fj7HVeWx6D8oMcFH75zDIic=\n"

    const-string v3, "7pxNSV+yIYo=\n"

    sget-object v7, Lkn;->a:Lkn;

    invoke-static {v0, v3, v7}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "I5MDDRrr\n"

    const-string v3, "V/JvZn+ZfXw=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    const-string v0, ""

    :cond_16
    sget-object v10, Lo9;->a:Ljava/lang/ClassLoader;

    if-eqz v10, :cond_19

    const-string v3, "FrYhbXCaMUY7\n"

    const-string v7, "VtVJDAToXik=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v3, "23/tb6h/yQ==\n"

    const-string v7, "uBCDG80RvZ8=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "sNSydg2Ggoit0Q==\n"

    const-string v7, "xLXeHWj01fA=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "O7K1p+dy\n"

    const-string v7, "V93Uw4IA3rA=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    const-string v3, "6bRr49lAjk+nqX28ixKzaZGBTcPs\n"

    const-string v7, "1cAZgrcz6Co=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "PdEA\n"

    const-string v8, "YIw+giaIdo0=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_42

    const-string v3, "2HHWa0q3wxSWbMA0\n"

    const-string v7, "5AWkCiTEpXE=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "LNHnvltzLqd1jPqoBA==\n"

    const-string v8, "EP6TzDodXcE=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    :goto_b
    const-string v3, "IC9Yo94CUOxoMkWs2RUNsT0AaYbxJXLW\n"

    const-string v7, "HFsqwrBxM40=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "Jm4F\n"

    const-string v8, "ezM7LTrI6lY=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    const-string v3, "sgQkRg4GzBn6GTlJCRGR\n"

    const-string v7, "jnBWJ2B1r3g=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "xlShIEb5kbubD7w9Sf6G5g==\n"

    const-string v8, "+nvVUieX4tg=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_17
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_41

    const-string v3, "hMs9YmOXnUzM1iBtZIDCE5nkDEdMsL10\n"

    const-string v7, "uL9PAw3k/C8=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "6M2G\n"

    const-string v8, "tZC4CeDcyoo=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v8, v3

    :goto_c
    const-string v3, "UVuC56q19CYueabW1dI=\n"

    const-string v7, "bT3ngpSJ1X0=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "l/Dh\n"

    const-string v11, "yq3f+BXwlPQ=\n"

    invoke-static {v7, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    const-string v3, "kHlbhOE=\n"

    const-string v7, "rB8+4d8dpkI=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "RUibJ+zZ\n"

    const-string v7, "eWf9Qonnl4E=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Li50;->N(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_18
    invoke-virtual {v9}, Ljava/lang/String;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v6

    if-nez v6, :cond_23

    :cond_19
    :goto_d
    const/16 v0, 0x31

    if-eq v4, v0, :cond_1a

    const/16 v0, 0x39

    if-ne v4, v0, :cond_1c

    :cond_1a
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1c

    const-string v0, "oEHFISAI\n"

    const-string v3, "1CCpSkV6pYs=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1b

    const-string v0, ""

    :cond_1b
    sget-object v3, Lt9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_1c

    :try_start_1
    const-string v3, "YMg/3hwrcPY=\n"

    const-string v6, "DL5dq3pNFYQ=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :cond_1c
    :goto_e
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1d

    const/4 v0, 0x1

    if-ne v5, v0, :cond_1d

    const-string v0, "2O4Xwi/yn+7s6hrCKPU=\n"

    const-string v3, "s4tunUeb+4s=\n"

    sget-object v6, Lkn;->a:Lkn;

    invoke-static {v0, v3, v6}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-string v0, "ZJ+xtONFkw==\n"

    const-string v3, "B/DfwIYr52E=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_40

    const-string v0, ""

    move-object v6, v0

    :goto_f
    const-string v0, "fQ==\n"

    const-string v3, "PQL/XoajhXA=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v6, v0, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_29

    :cond_1d
    :goto_10
    if-nez v5, :cond_20

    const/4 v0, 0x1

    if-ne v4, v0, :cond_20

    sget-object v0, Lt9;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    const/16 v3, 0x3e8

    if-le v2, v3, :cond_1e

    :try_start_2
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_1e
    :goto_11
    const-string v0, "3QUZGf6h8FY=\n"

    const-string v2, "sHZ+SojTuTI=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2d

    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_12
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2e

    sget-object v0, Lt9;->e:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2e

    :cond_20
    :goto_13
    sget-object v0, Lxh;->n:Lxh;

    goto/16 :goto_1

    :cond_21
    const/4 v0, 0x0

    move v4, v0

    goto/16 :goto_8

    :cond_22
    const/4 v0, 0x0

    move v5, v0

    goto/16 :goto_9

    :cond_23
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_19

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_19

    invoke-static {v3}, Li50;->O(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_24

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v7, v3

    :goto_14
    sget-object v3, Lub0;->l:Ljava/lang/String;

    invoke-static {v3, v10}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_19

    sget v11, Lub0;->P:I

    invoke-virtual {v3}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v12

    const-string v3, "H2MhWdrZGugKczZu2sUatFYoezM=\n"

    const-string v6, "eAZVGrW3aZw=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v13, v12

    const/4 v3, 0x0

    move v6, v3

    :goto_15
    if-ge v6, v13, :cond_26

    aget-object v3, v12, v6

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v14, v14

    if-ne v14, v11, :cond_25

    :goto_16
    if-nez v3, :cond_27

    const-string v0, "pHbbWHfGht0=\n"

    const-string v3, "8AS6NgSg468=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u274c \u672a\u627e\u5230\u53c2\u6570\u4e2a\u6570\u4e3a "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " \u7684\u8f6c\u8d26\u6784\u9020\u5668\uff01"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "ioxU\n"

    const-string v7, "/u0zZ+lqY9I=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "KFnE\n"

    const-string v6, "RSqjPIOV6WI=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_d

    :catchall_0
    move-exception v0

    :goto_17
    const-string v0, "06ke\n"

    const-string v3, "p8h5VTpLcuY=\n"

    const-string v6, "PxHPfJnGdK0uEdx9mA==\n"

    const-string v7, "a2OuEuqgEd8=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "tw==\n"

    const-string v8, "0vI8ySRxU5w=\n"

    invoke-static {v0, v3, v6, v7, v8}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_d

    :cond_24
    const/4 v3, 0x0

    move v7, v3

    goto :goto_14

    :cond_25
    rsub-int/lit8 v3, v6, 0x0

    rsub-int/lit8 v3, v3, 0x1

    move v6, v3

    goto :goto_15

    :cond_26
    const/4 v3, 0x0

    goto :goto_16

    :cond_27
    :try_start_4
    sget-object v6, Lub0;->Y0:Lrb;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v8, v9, v11, v0}, Lrb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    array-length v6, v0

    if-eqz v6, :cond_19

    array-length v6, v0

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-static {v10, v0}, Lbw;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)Z

    const-string v0, "omNvoG1cj3o=\n"

    const-string v3, "9hEOzh466gg=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    int-to-double v8, v7

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v8, v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u2705 \u6210\u529f\u53d1\u9001\u6536\u6b3e\u8bf7\u6c42: \uffe5"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "ioxU\n"

    const-string v8, "/u0zZ+lqY9I=\n"

    invoke-static {v6, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "KFnE\n"

    const-string v6, "RSqjPIOV6WI=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lkn;->b:Landroid/app/Application;

    if-eqz v0, :cond_19

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v3, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v6, Los;

    const/4 v8, 0x3

    invoke-direct {v6, v0, v7, v8}, Los;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v3, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_d

    :catchall_1
    move-exception v0

    goto/16 :goto_17

    :cond_28
    const-string v0, "NLL5VIGTCMglsupVgA==\n"

    const-string v3, "YMCYOvL1bbo=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "kdAcG6C1JqPz7XW0184uz5biKdP3ikfuwqUknqmXLqLM2XWg2M4i9pf1KtzvkQ==\n"

    const-string v6, "c02QO0Yroko=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "ioxU\n"

    const-string v7, "/u0zZ+lqY9I=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "KFnE\n"

    const-string v6, "RSqjPIOV6WI=\n"

    invoke-static {v0, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_d

    :cond_29
    const-string v0, "4VGW31ASpMc=\n"

    const-string v3, "jSf0qjZ0wbU=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz v0, :cond_1d

    sget-object v8, Ln9;->a:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v0, Lp00;

    const-string v7, "p/X+ZFygDhvy5/4vB+tWSLKopXBbsA8S6fjjYlv7\n"

    const-string v9, "m5SKES/FfHc=\n"

    invoke-static {v7, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Lp00;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lp00;->a(Lp00;Ljava/lang/String;)Ld4;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ld4;->t()Ljava/util/List;

    move-result-object v0

    check-cast v0, Llt;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Llt;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "Pq35GXX7\n"

    const-string v7, "SsyVchCJfQc=\n"

    invoke-static {v3, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3f

    const-string v3, ""

    move-object v7, v3

    :goto_18
    sget-object v3, Lt9;->j:Lp00;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lp00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/regex/Pattern;

    invoke-virtual {v3, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    const-string v6, ""

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "replaceAll(...)"

    invoke-static {v6, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_2a

    const-string v3, " "

    :cond_2a
    const-string v6, "<msg><appmsg><title><![CDATA["

    const-string v9, "]]></title><type><![CDATA[57]]></type></appmsg></msg>"

    invoke-static {v6, v3, v9}, Lg40;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "<msgsource><atuserlist>"

    const-string v9, "</atuserlist></msgsource>"

    invoke-static {v6, v0, v9}, Lg40;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lt9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    const-string v0, "sRXhhS7ZZK7+Xrvpfg==\n"

    const-string v9, "1nCVx1etAd0=\n"

    invoke-static {v0, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v9, v8

    rsub-int/lit8 v0, v9, 0x0

    rsub-int/lit8 v0, v0, 0x4a

    new-array v10, v0, [B

    const/4 v0, 0x0

    const/16 v11, 0x7b

    aput-byte v11, v10, v0

    const/4 v0, 0x1

    :goto_19
    const/16 v11, 0x8

    if-ge v0, v11, :cond_2b

    const/4 v11, 0x0

    aput-byte v11, v10, v0

    rsub-int/lit8 v0, v0, 0x0

    add-int/lit8 v0, v0, -0x1

    rsub-int/lit8 v0, v0, 0x0

    goto :goto_19

    :cond_2b
    const/16 v0, 0x8

    const/16 v11, 0x7a

    aput-byte v11, v10, v0

    const/4 v0, 0x0

    const/16 v11, 0x9

    array-length v12, v8

    invoke-static {v8, v0, v10, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v8

    add-int/lit8 v0, v0, -0x12

    add-int/lit8 v0, v0, 0x9

    add-int/lit8 v0, v0, 0x12

    array-length v8, v8

    :goto_1a
    add-int/lit8 v11, v8, -0x1c

    add-int/lit8 v11, v11, 0x49

    add-int/lit8 v11, v11, 0x1c

    if-ge v0, v11, :cond_2c

    const/4 v11, 0x0

    aput-byte v11, v10, v0

    add-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, -0x3

    goto :goto_1a

    :cond_2c
    add-int/lit8 v0, v9, 0x49

    const/16 v8, 0x7d

    aput-byte v8, v10, v0

    invoke-virtual {v6, v7, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lo9;->b:Landroid/os/Handler;

    new-instance v6, Lt5;

    const/4 v8, 0x5

    invoke-direct {v6, v7, v8, v3}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_10

    :cond_2d
    const-string v0, "MqgbIkDSLaA8vw==\n"

    const-string v2, "Udp+QzS3eck=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_1f

    const-wide/16 v2, 0x0

    goto/16 :goto_12

    :cond_2e
    const-string v0, "C//b+801lA==\n"

    const-string v2, "aJC1j6hb4Nc=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3e

    const-string v0, ""

    move-object v2, v0

    :goto_1b
    new-instance v4, Lp00;

    invoke-direct {v4}, Lp00;-><init>()V

    const-string v0, ""

    iput-object v0, v4, Lp00;->b:Ljava/lang/Object;

    const-string v0, "Hxmg4ZXj\n"

    const-string v3, "a3jMivCRXCc=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3d

    const-string v0, ""

    move-object v3, v0

    :goto_1c
    const-string v0, "3PgVt3KDAjXx\n"

    const-string v1, "nJt91gbxbVo=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    const-string v0, "k5H3h9tCdxinhuuo1k5cHJ2N+bfIU1wYlg==\n"

    const-string v1, "+PSO2Lo3A3c=\n"

    sget-object v6, Lkn;->a:Lkn;

    invoke-static {v0, v1, v6}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v0

    if-eqz v0, :cond_33

    const-string v0, "UeHRbvidW1Nl9s1B9ZFwV1/9317rjA==\n"

    const-string v1, "OoSoMZnoLzw=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dNq6+fSOL1Es5ve52Q==\n"

    const-string v6, "kUYSHGQZA7U=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_33

    const-string v0, "9ekmQdny+SovmA==\n"

    const-string v1, "rsXJ/VWOGqo=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "pattern"

    invoke-static {v1, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lmp;->w(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1d
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2f
    :goto_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Li50;->F(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2f

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_30
    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :cond_31
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->start()I

    move-result v8

    invoke-virtual {v6, v0, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-nez v8, :cond_31

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v6, v0, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_1d

    :cond_32
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_37

    :cond_33
    const/4 v0, 0x0

    :goto_1f
    if-nez v0, :cond_35

    if-eqz v5, :cond_35

    const-string v1, "2UicsZrPWIPtX4Cel8NzjcY=\n"

    const-string v6, "si3l7vu6LOw=\n"

    sget-object v7, Lkn;->a:Lkn;

    invoke-static {v1, v6, v7}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v1

    if-eqz v1, :cond_35

    const-string v1, "+xzWBcz1WlDoEMs=\n"

    const-string v6, "kHmvWqGMBSc=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, ""

    invoke-static {v1, v6}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "J9hmLR6lIQzdhA==\n"

    const-string v7, "Zz7vrfg5qOg=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v2, v6, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_34

    const-string v6, "34UlmA==\n"

    const-string v7, "n8RJ9HGMFdA=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v2, v6, v7}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_34

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_35

    const/4 v6, 0x0

    invoke-static {v2, v1, v6}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_35

    :cond_34
    const-string v0, "Y3CBGkf89idXZ501SvDdPG1tjA==\n"

    const-string v1, "CBX4RSaJgkg=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Qst7Od4f\n"

    const-string v2, "pF/N3Fav8k8=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lp00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    :cond_35
    if-nez v0, :cond_36

    if-nez v5, :cond_36

    const-string v1, "8SM7ln6fmm7FNCe5c5OxZv8oJ7t+hg==\n"

    const-string v2, "mkZCyR/q7gE=\n"

    sget-object v5, Lkn;->a:Lkn;

    invoke-static {v1, v2, v5}, Lg40;->q(Ljava/lang/String;Ljava/lang/String;Lkn;)Z

    move-result v1

    if-eqz v1, :cond_36

    const-string v0, "j6lMnnj0SAG7vlCxdfhjCYGiULN47WMagbRB\n"

    const-string v1, "5Mw1wRmBPG4=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "g1Eg1kjDlerNPQm8I+/YmdlVVplLluD4gEIv1GL+k/bn\n"

    const-string v2, "ZdmxMcZzcHY=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lp00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    :cond_36
    if-eqz v0, :cond_20

    iget-object v0, v4, Lp00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_39

    const/4 v0, 0x1

    :goto_20
    if-eqz v0, :cond_20

    sget-object v0, Lo9;->b:Landroid/os/Handler;

    new-instance v1, Lt5;

    const/4 v2, 0x6

    invoke-direct {v1, v3, v2, v4}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_13

    :cond_37
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v0, 0x0

    move v1, v0

    :cond_38
    if-ge v1, v7, :cond_33

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    rsub-int/lit8 v1, v1, 0x0

    add-int/lit8 v1, v1, -0x1

    rsub-int/lit8 v1, v1, 0x0

    check-cast v0, Ljava/lang/String;

    const/4 v8, 0x1

    invoke-static {v2, v0, v8}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_38

    sget-object v0, Lkn;->a:Lkn;

    const-string v1, "yX7UI2RCB8v9acgMaU4sz8di2hN3UyzQx2PZ\n"

    const-string v6, "ohutfAU3c6Q=\n"

    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "LDgspAua4uZ3dh7vbKSKi0M1b8ss7pz9ITsH\n"

    const-string v7, "xJ+KQYQLB2M=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v6}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lp00;->b:Ljava/lang/Object;

    const/4 v0, 0x1

    goto/16 :goto_1f

    :cond_39
    const/4 v0, 0x0

    goto :goto_20

    :cond_3a
    const-string v2, "mtVWBnft5eqCyUsAau0=\n"

    const-string v3, "7Lo/ZRKZl4s=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "VvLJMU4z\n"

    const-string v2, "NZ+6VgdXb68=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3c

    :cond_3b
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_21
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_20

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "voice_trans_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkn;->a:Lkn;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkn;->f(Ljava/lang/String;Z)V

    sget-object v0, Lo9;->b:Landroid/os/Handler;

    new-instance v1, Lgn;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lgn;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_13

    :cond_3c
    const-string v0, "DlylTjI=\n"

    const-string v2, "Yy/CB1YFWP0=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_3b

    const-wide/16 v0, 0x0

    goto :goto_21

    :catchall_2
    move-exception v0

    goto/16 :goto_11

    :catchall_3
    move-exception v0

    goto/16 :goto_e

    :cond_3d
    move-object v3, v0

    goto/16 :goto_1c

    :cond_3e
    move-object v2, v0

    goto/16 :goto_1b

    :cond_3f
    move-object v7, v3

    goto/16 :goto_18

    :cond_40
    move-object v6, v0

    goto/16 :goto_f

    :cond_41
    move-object v8, v3

    goto/16 :goto_c

    :cond_42
    move-object v9, v3

    goto/16 :goto_b

    :cond_43
    move-object v6, v0

    goto/16 :goto_a

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
