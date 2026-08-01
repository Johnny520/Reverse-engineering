.class public final Landroidx/loader/R$id;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/loader/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "id"
.end annotation


# static fields
.field public static action_container:I

.field public static action_divider:I

.field public static action_image:I

.field public static action_text:I

.field public static actions:I

.field public static async:I

.field public static blocking:I

.field public static chronometer:I

.field public static forever:I

.field public static icon:I

.field public static icon_group:I

.field public static info:I

.field public static italic:I

.field public static line1:I

.field public static line3:I

.field public static normal:I

.field public static notification_background:I

.field public static notification_main_column:I

.field public static notification_main_column_container:I

.field public static right_icon:I

.field public static right_side:I

.field public static tag_transition_group:I

.field public static tag_unhandled_key_event_manager:I

.field public static tag_unhandled_key_listeners:I

.field public static text:I

.field public static text2:I

.field public static time:I

.field public static title:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f09002e

    sput v0, Landroidx/loader/R$id;->action_container:I

    const v0, 0x7f090030

    sput v0, Landroidx/loader/R$id;->action_divider:I

    const v0, 0x7f090031

    sput v0, Landroidx/loader/R$id;->action_image:I

    const v0, 0x7f090037

    sput v0, Landroidx/loader/R$id;->action_text:I

    const v0, 0x7f090038

    sput v0, Landroidx/loader/R$id;->actions:I

    const v0, 0x7f09003d

    sput v0, Landroidx/loader/R$id;->async:I

    const v0, 0x7f09003f

    sput v0, Landroidx/loader/R$id;->blocking:I

    const v0, 0x7f090045

    sput v0, Landroidx/loader/R$id;->chronometer:I

    const v0, 0x7f090054

    sput v0, Landroidx/loader/R$id;->forever:I

    const v0, 0x7f09005a

    sput v0, Landroidx/loader/R$id;->icon:I

    const v0, 0x7f09005b

    sput v0, Landroidx/loader/R$id;->icon_group:I

    const v0, 0x7f09005e

    sput v0, Landroidx/loader/R$id;->info:I

    const v0, 0x7f09005f

    sput v0, Landroidx/loader/R$id;->italic:I

    const v0, 0x7f090060

    sput v0, Landroidx/loader/R$id;->line1:I

    const v0, 0x7f090061

    sput v0, Landroidx/loader/R$id;->line3:I

    const v0, 0x7f090069

    sput v0, Landroidx/loader/R$id;->normal:I

    const v0, 0x7f09006a

    sput v0, Landroidx/loader/R$id;->notification_background:I

    const v0, 0x7f09006b

    sput v0, Landroidx/loader/R$id;->notification_main_column:I

    const v0, 0x7f09006c

    sput v0, Landroidx/loader/R$id;->notification_main_column_container:I

    const v0, 0x7f090073

    sput v0, Landroidx/loader/R$id;->right_icon:I

    const v0, 0x7f090074

    sput v0, Landroidx/loader/R$id;->right_side:I

    const v0, 0x7f09009a

    sput v0, Landroidx/loader/R$id;->tag_transition_group:I

    const v0, 0x7f09009b

    sput v0, Landroidx/loader/R$id;->tag_unhandled_key_event_manager:I

    const v0, 0x7f09009c

    sput v0, Landroidx/loader/R$id;->tag_unhandled_key_listeners:I

    const v0, 0x7f09009e

    sput v0, Landroidx/loader/R$id;->text:I

    const v0, 0x7f09009f

    sput v0, Landroidx/loader/R$id;->text2:I

    const v0, 0x7f0900a2

    sput v0, Landroidx/loader/R$id;->time:I

    const v0, 0x7f0900a3

    sput v0, Landroidx/loader/R$id;->title:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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
    const-string v0, "XizYlX"

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۣۣۤ۠(Ljava/lang/String;)Ljava/lang/String;

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
