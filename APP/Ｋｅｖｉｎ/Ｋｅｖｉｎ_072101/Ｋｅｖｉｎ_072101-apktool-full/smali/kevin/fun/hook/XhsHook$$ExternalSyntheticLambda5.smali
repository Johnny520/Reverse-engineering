.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Ljava/util/List;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/util/List;

.field public final f$4:Ljava/util/List;

.field public final f$5:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Ljava/util/List;Landroid/content/Context;Ljava/util/List;Ljava/util/List;Landroid/app/Dialog;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$1:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$4:Ljava/util/List;

    iput-object p6, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->f$5:Landroid/app/Dialog;

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
    const-string v0, "sOVIKhZPaSZZL5UtQtW"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/XhsHook;

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    move-object v4, p4

    check-cast v4, Ljava/util/List;

    move-object v5, p5

    check-cast v5, Landroid/app/Dialog;

    move-object v6, p6

    check-cast v6, Landroid/view/View;

    invoke-virtual/range {v0 .. v6}, Lkevin/fun/hook/XhsHook;->lambda$21$kevin-fun-hook-XhsHook(Ljava/util/List;Landroid/content/Context;Ljava/util/List;Ljava/util/List;Landroid/app/Dialog;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 7

    invoke-static {p0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۡۡ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۠۠ۨۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۣۨۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۥۦۨ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {p0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۦۤ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v5

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda5;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
    const-string v0, "cTvlck"

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۡۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
