.class public final synthetic Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook$9;

.field public final f$1:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook$9;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;->f$0:Lkevin/fun/hook/XhsHook$9;

    iput p2, p0, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;->f$1:I

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

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
    const-string v0, "ZhL6f"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۧۧۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    check-cast p0, Lkevin/fun/hook/XhsHook$9;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/XhsHook$9;->lambda$1$kevin-fun-hook-XhsHook$9(ILandroid/view/View;)Z

    move-result v0

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
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e6\u06e2"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۤۢۡۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook$9;

    move-result-object v0

    const-string v1, "\u06e1\u06e2\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۤ۠ۤۤ(Ljava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e3\u06e4\u06e5"

    move v4, v3

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v4, p1}, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;->ۧۧۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v2

    const-string v1, "\u06e7\u06e4\u06e1"

    goto :goto_0

    :sswitch_2
    return v2

    :sswitch_data_0
    .sparse-switch
        0x1aaee7 -> :sswitch_0
        0x1ab6a4 -> :sswitch_1
        0x1ac5a4 -> :sswitch_2
    .end sparse-switch
.end method
