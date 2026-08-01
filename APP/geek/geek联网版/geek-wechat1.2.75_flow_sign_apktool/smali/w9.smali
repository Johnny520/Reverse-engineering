.class public final synthetic Lw9;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Lw9;->a:I

    iput-object p2, p0, Lw9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e5\u06e2"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e1\u06e7\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e5\u06e2"

    goto :goto_1

    :sswitch_1
    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e6\u06e3\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "\u06df\u06e4\u06e4"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e3\u06e3"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/lit16 v2, v2, -0x54d

    or-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e3\u06e5\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e3\u06e3"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "OmDtdPzeJsVq3VdyhL"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->۟ۡۨۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v1, v2

    const v2, 0x1b484e

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa79f -> :sswitch_0
        0x1ab683 -> :sswitch_5
        0x1aba06 -> :sswitch_2
        0x1abe67 -> :sswitch_3
        0x1ac1c6 -> :sswitch_4
        0x1ac203 -> :sswitch_1
    .end sparse-switch
.end method
