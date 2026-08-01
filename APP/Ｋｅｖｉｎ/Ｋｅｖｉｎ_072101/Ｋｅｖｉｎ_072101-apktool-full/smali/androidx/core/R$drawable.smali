.class public final Landroidx/core/R$drawable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "drawable"
.end annotation


# static fields
.field public static ic_call_answer:I

.field public static ic_call_answer_low:I

.field public static ic_call_answer_video:I

.field public static ic_call_answer_video_low:I

.field public static ic_call_decline:I

.field public static ic_call_decline_low:I

.field public static notification_action_background:I

.field public static notification_bg:I

.field public static notification_bg_low:I

.field public static notification_bg_low_normal:I

.field public static notification_bg_low_pressed:I

.field public static notification_bg_normal:I

.field public static notification_bg_normal_pressed:I

.field public static notification_icon_background:I

.field public static notification_oversize_large_icon_bg:I

.field public static notification_template_icon_bg:I

.field public static notification_template_icon_low_bg:I

.field public static notification_tile_bg:I

.field public static notify_panel_notification_icon_bg:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f080060

    sput v0, Landroidx/core/R$drawable;->ic_call_answer:I

    const v0, 0x7f080061

    sput v0, Landroidx/core/R$drawable;->ic_call_answer_low:I

    const v0, 0x7f080062

    sput v0, Landroidx/core/R$drawable;->ic_call_answer_video:I

    const v0, 0x7f080063

    sput v0, Landroidx/core/R$drawable;->ic_call_answer_video_low:I

    const v0, 0x7f080064

    sput v0, Landroidx/core/R$drawable;->ic_call_decline:I

    const v0, 0x7f080065

    sput v0, Landroidx/core/R$drawable;->ic_call_decline_low:I

    const v0, 0x7f08006a

    sput v0, Landroidx/core/R$drawable;->notification_action_background:I

    const v0, 0x7f08006b

    sput v0, Landroidx/core/R$drawable;->notification_bg:I

    const v0, 0x7f08006c

    sput v0, Landroidx/core/R$drawable;->notification_bg_low:I

    const v0, 0x7f08006d

    sput v0, Landroidx/core/R$drawable;->notification_bg_low_normal:I

    const v0, 0x7f08006e

    sput v0, Landroidx/core/R$drawable;->notification_bg_low_pressed:I

    const v0, 0x7f08006f

    sput v0, Landroidx/core/R$drawable;->notification_bg_normal:I

    const v0, 0x7f080070

    sput v0, Landroidx/core/R$drawable;->notification_bg_normal_pressed:I

    const v0, 0x7f080071

    sput v0, Landroidx/core/R$drawable;->notification_icon_background:I

    const v0, 0x7f080072

    sput v0, Landroidx/core/R$drawable;->notification_oversize_large_icon_bg:I

    const v0, 0x7f080073

    sput v0, Landroidx/core/R$drawable;->notification_template_icon_bg:I

    const v0, 0x7f080074

    sput v0, Landroidx/core/R$drawable;->notification_template_icon_low_bg:I

    const v0, 0x7f080075

    sput v0, Landroidx/core/R$drawable;->notification_tile_bg:I

    const v0, 0x7f080076

    sput v0, Landroidx/core/R$drawable;->notify_panel_notification_icon_bg:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    const-string v0, "ajMReK3ULrf"

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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
