.class public final synthetic Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final f$0:Ljava/util/function/Consumer;

.field public final f$1:Landroid/widget/Switch;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/function/Consumer;Landroid/widget/Switch;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;->f$0:Ljava/util/function/Consumer;

    iput-object p2, p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;->f$1:Landroid/widget/Switch;

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "0cYBwyhykWjTe"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۦۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/util/function/Consumer;

    check-cast p1, Landroid/widget/Switch;

    check-cast p2, Landroid/widget/CompoundButton;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/webdav/WebDAVDialog;->lambda$13(Ljava/util/function/Consumer;Landroid/widget/Switch;Landroid/widget/CompoundButton;Z)V

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
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e1\u06e4"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->۟۟۟ۢ۠(Ljava/lang/Object;)Ljava/util/function/Consumer;

    move-result-object v0

    const-string v1, "\u06e6\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۥۧ۟ۦ(Ljava/lang/Object;)Landroid/widget/Switch;

    move-result-object v1

    const-string v3, "\u06e8\u06e5\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v2, p1, p2}, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda0;->۟ۦۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v1, "\u06e1\u06e6\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf61 -> :sswitch_2
        0x1ac1ab -> :sswitch_0
        0x1ac983 -> :sswitch_1
    .end sparse-switch
.end method
