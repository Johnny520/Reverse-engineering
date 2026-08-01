.class public final Landroidx/fragment/R$dimen;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "dimen"
.end annotation


# static fields
.field public static compat_button_inset_horizontal_material:I

.field public static compat_button_inset_vertical_material:I

.field public static compat_button_padding_horizontal_material:I

.field public static compat_button_padding_vertical_material:I

.field public static compat_control_corner_material:I

.field public static compat_notification_large_icon_max_height:I

.field public static compat_notification_large_icon_max_width:I

.field public static notification_action_icon_size:I

.field public static notification_action_text_size:I

.field public static notification_big_circle_margin:I

.field public static notification_content_margin_start:I

.field public static notification_large_icon_height:I

.field public static notification_large_icon_width:I

.field public static notification_main_column_padding_top:I

.field public static notification_media_narrow_margin:I

.field public static notification_right_icon_size:I

.field public static notification_right_side_padding_top:I

.field public static notification_small_icon_background_padding:I

.field public static notification_small_icon_size_as_large:I

.field public static notification_subtext_size:I

.field public static notification_top_pad:I

.field public static notification_top_pad_large_text:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f070051

    sput v0, Landroidx/fragment/R$dimen;->compat_button_inset_horizontal_material:I

    const v0, 0x7f070052

    sput v0, Landroidx/fragment/R$dimen;->compat_button_inset_vertical_material:I

    const v0, 0x7f070053

    sput v0, Landroidx/fragment/R$dimen;->compat_button_padding_horizontal_material:I

    const v0, 0x7f070054

    sput v0, Landroidx/fragment/R$dimen;->compat_button_padding_vertical_material:I

    const v0, 0x7f070055

    sput v0, Landroidx/fragment/R$dimen;->compat_control_corner_material:I

    const v0, 0x7f070056

    sput v0, Landroidx/fragment/R$dimen;->compat_notification_large_icon_max_height:I

    const v0, 0x7f070057

    sput v0, Landroidx/fragment/R$dimen;->compat_notification_large_icon_max_width:I

    const v0, 0x7f070061

    sput v0, Landroidx/fragment/R$dimen;->notification_action_icon_size:I

    const v0, 0x7f070062

    sput v0, Landroidx/fragment/R$dimen;->notification_action_text_size:I

    const v0, 0x7f070063

    sput v0, Landroidx/fragment/R$dimen;->notification_big_circle_margin:I

    const v0, 0x7f070064

    sput v0, Landroidx/fragment/R$dimen;->notification_content_margin_start:I

    const v0, 0x7f070065

    sput v0, Landroidx/fragment/R$dimen;->notification_large_icon_height:I

    const v0, 0x7f070066

    sput v0, Landroidx/fragment/R$dimen;->notification_large_icon_width:I

    const v0, 0x7f070067

    sput v0, Landroidx/fragment/R$dimen;->notification_main_column_padding_top:I

    const v0, 0x7f070068

    sput v0, Landroidx/fragment/R$dimen;->notification_media_narrow_margin:I

    const v0, 0x7f070069

    sput v0, Landroidx/fragment/R$dimen;->notification_right_icon_size:I

    const v0, 0x7f07006a

    sput v0, Landroidx/fragment/R$dimen;->notification_right_side_padding_top:I

    const v0, 0x7f07006b

    sput v0, Landroidx/fragment/R$dimen;->notification_small_icon_background_padding:I

    const v0, 0x7f07006c

    sput v0, Landroidx/fragment/R$dimen;->notification_small_icon_size_as_large:I

    const v0, 0x7f07006d

    sput v0, Landroidx/fragment/R$dimen;->notification_subtext_size:I

    const v0, 0x7f07006e

    sput v0, Landroidx/fragment/R$dimen;->notification_top_pad:I

    const v0, 0x7f07006f

    sput v0, Landroidx/fragment/R$dimen;->notification_top_pad_large_text:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "eC5mRDinseYNujZyuoVn3"

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۡۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
