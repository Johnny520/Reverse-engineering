.class public final Landroidx/core/R$color;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "color"
.end annotation


# static fields
.field public static androidx_core_ripple_material_light:I

.field public static androidx_core_secondary_text_default_material_light:I

.field public static call_notification_answer_color:I

.field public static call_notification_decline_color:I

.field public static notification_action_color_filter:I

.field public static notification_icon_bg_color:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f06001b

    sput v0, Landroidx/core/R$color;->androidx_core_ripple_material_light:I

    const v0, 0x7f06001c

    sput v0, Landroidx/core/R$color;->androidx_core_secondary_text_default_material_light:I

    const v0, 0x7f060029

    sput v0, Landroidx/core/R$color;->call_notification_answer_color:I

    const v0, 0x7f06002a

    sput v0, Landroidx/core/R$color;->call_notification_decline_color:I

    const v0, 0x7f060041

    sput v0, Landroidx/core/R$color;->notification_action_color_filter:I

    const v0, 0x7f060042

    sput v0, Landroidx/core/R$color;->notification_icon_bg_color:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "SNX2F0lFDAXIsHQ6seEoXJuGh"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
