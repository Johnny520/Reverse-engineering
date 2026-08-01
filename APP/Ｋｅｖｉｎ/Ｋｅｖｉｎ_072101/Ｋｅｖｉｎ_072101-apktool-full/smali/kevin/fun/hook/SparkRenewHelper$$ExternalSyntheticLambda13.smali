.class public final synthetic Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

.field public final f$1:Landroid/widget/TextView;

.field public final f$2:Landroid/graphics/drawable/GradientDrawable;

.field public final f$3:Landroid/widget/TextView;

.field public final f$4:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->f$0:Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    iput-object p2, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->f$1:Landroid/widget/TextView;

    iput-object p3, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->f$2:Landroid/graphics/drawable/GradientDrawable;

    iput-object p4, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->f$3:Landroid/widget/TextView;

    iput-object p5, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->f$4:Landroid/widget/TextView;

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "QsGw"

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۦۦۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    check-cast p1, Landroid/widget/TextView;

    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    check-cast p3, Landroid/widget/TextView;

    check-cast p4, Landroid/widget/TextView;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/SparkRenewHelper;->lambda$9(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/TextView;Landroid/widget/TextView;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 5

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡ۠ۨۤ(Ljava/lang/Object;)Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    move-result-object v0

    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->ۣ۟۟ۧۤ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۧ۠ۢ(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۧ۟ۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦۣ۠ۨ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;->ۢۦۦۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "J4DmmSpXLgalLVN43ECUol0SE"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
