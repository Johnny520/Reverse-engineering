.class public final synthetic Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final f$0:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda9;->f$0:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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
    const-string v0, "lQjTZF0ZwOZ6zRjs"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۥۣۧۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۠ۧۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->lambda$2(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Ljava/lang/Boolean;)V

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
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    const-string v3, "\u06e4\u06df\u06e2"

    move-object v1, v0

    move-object v2, v0

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v1, v2}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda9;->ۣ۠ۧۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e6\u06e5\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۠ۨۦۥ(Ljava/lang/Object;)Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    move-result-object v0

    const-string v3, "\u06e8\u06e7\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    const-string v3, "\u06df\u06e0\u06e7"

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab9c7 -> :sswitch_0
        0x1ac207 -> :sswitch_2
        0x1ac9c5 -> :sswitch_1
    .end sparse-switch
.end method
