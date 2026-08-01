.class Lkevin/fun/hook/DYHook$163;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->seekItem(Landroid/content/Context;Ljava/lang/String;IIILkevin/fun/hook/DYHook$Consumer;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$min:I

.field private final val$onChanged:Lkevin/fun/hook/DYHook$Consumer;

.field private final val$valueTv:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;ILandroid/widget/TextView;Lkevin/fun/hook/DYHook$Consumer;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$163;->this$0:Lkevin/fun/hook/DYHook;

    iput p2, p0, Lkevin/fun/hook/DYHook$163;->val$min:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$163;->val$valueTv:Landroid/widget/TextView;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$163;->val$onChanged:Lkevin/fun/hook/DYHook$Consumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    const-string v0, "hlo0KHbw"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$163;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$163;->val$valueTv:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟۠ۡۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$Consumer;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$163;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$163;->val$onChanged:Lkevin/fun/hook/DYHook$Consumer;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۧۧۨۨ(Ljava/lang/Object;)I
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$163;

    iget v0, p0, Lkevin/fun/hook/DYHook$163;->val$min:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$163;->ۧۧۨۨ(Ljava/lang/Object;)I

    move-result v0

    add-int v1, v0, p2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$163;->ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۢۨ۠(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$163;->۟۠ۡۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$Consumer;

    move-result-object v0

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۦۡۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 5

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v4, "\u06e0\u06e2"

    move v1, v2

    move v3, v2

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$163;->ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    const-string v2, "\u06e4\u06e4\u06df"

    move-object v4, v2

    goto :goto_0

    :sswitch_0
    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v4, "\u06e8\u06e2"

    move v3, v2

    goto :goto_0

    :sswitch_1
    const v1, -0xa9b7

    xor-int/2addr v1, v3

    const-string v2, "\u06e8\u06e6"

    move-object v4, v2

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v2, "\u06e6\u06e2\u06df"

    move-object v4, v2

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_1
        0xdcfe -> :sswitch_2
        0x1aba5f -> :sswitch_0
        0x1ac1a3 -> :sswitch_3
    .end sparse-switch
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 5

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v4, "\u06e5\u06e8\u06e0"

    move v1, v2

    move v3, v2

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$163;->ۣ۟۟ۨۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    const-string v2, "\u06e8\u06e5\u06e0"

    move-object v4, v2

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    const-string v2, "\u06e4\u06e2\u06e3"

    move-object v4, v2

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v2, "\u06e4\u06e6\u06e1"

    move-object v4, v2

    goto :goto_0

    :sswitch_3
    const v2, -0x1d2cd

    xor-int/2addr v2, v1

    const-string v4, "\u06e6\u06e3\u06e4"

    move v3, v2

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba25 -> :sswitch_3
        0x1abe9d -> :sswitch_0
        0x1ac1c7 -> :sswitch_2
        0x1ac983 -> :sswitch_1
    .end sparse-switch
.end method
