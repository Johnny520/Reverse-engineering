.class public final Landroidx/core/R$string;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "string"
.end annotation


# static fields
.field public static call_notification_answer_action:I

.field public static call_notification_answer_video_action:I

.field public static call_notification_decline_action:I

.field public static call_notification_hang_up_action:I

.field public static call_notification_incoming_text:I

.field public static call_notification_ongoing_text:I

.field public static call_notification_screening_text:I

.field public static status_bar_notification_info_overflow:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f0d001d

    sput v0, Landroidx/core/R$string;->call_notification_answer_action:I

    const v0, 0x7f0d001e

    sput v0, Landroidx/core/R$string;->call_notification_answer_video_action:I

    const v0, 0x7f0d001f

    sput v0, Landroidx/core/R$string;->call_notification_decline_action:I

    const v0, 0x7f0d0020

    sput v0, Landroidx/core/R$string;->call_notification_hang_up_action:I

    const v0, 0x7f0d0021

    sput v0, Landroidx/core/R$string;->call_notification_incoming_text:I

    const v0, 0x7f0d0022

    sput v0, Landroidx/core/R$string;->call_notification_ongoing_text:I

    const v0, 0x7f0d0023

    sput v0, Landroidx/core/R$string;->call_notification_screening_text:I

    const v0, 0x7f0d0025

    sput v0, Landroidx/core/R$string;->status_bar_notification_info_overflow:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    const-string v0, "uEWHdZNsOFW"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
