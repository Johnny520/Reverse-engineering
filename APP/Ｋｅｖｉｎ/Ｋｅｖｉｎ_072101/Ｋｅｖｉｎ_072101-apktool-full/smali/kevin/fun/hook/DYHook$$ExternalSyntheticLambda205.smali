.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/widget/EditText;

.field public final f$1:Landroid/content/Context;

.field public final f$2:Ljava/lang/Runnable;

.field public final f$3:Ljava/lang/ref/WeakReference;

.field public final f$4:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/content/Context;Ljava/lang/Runnable;Ljava/lang/ref/WeakReference;Landroid/app/Dialog;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$0:Landroid/widget/EditText;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$2:Ljava/lang/Runnable;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$3:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$4:Landroid/app/Dialog;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    const-string v0, "LbAnSPJ"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۦۣۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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
    move-object v0, p0

    check-cast v0, Landroid/widget/EditText;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/Runnable;

    move-object v3, p3

    check-cast v3, Ljava/lang/ref/WeakReference;

    move-object v4, p4

    check-cast v4, Landroid/app/Dialog;

    move-object v5, p5

    check-cast v5, Landroid/view/View;

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook;->lambda$45(Landroid/widget/EditText;Landroid/content/Context;Ljava/lang/Runnable;Ljava/lang/ref/WeakReference;Landroid/app/Dialog;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 7

    const/4 v5, 0x0

    const-string v6, "\u06e4\u06e1\u06e5"

    move-object v2, v5

    move-object v0, v5

    move-object v4, v5

    move-object v1, v5

    move-object v3, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۠ۤ۟ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v4

    const-string v5, "\u06e2\u06df\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۠۠ۨ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    const-string v5, "\u06e4\u06e4\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->۟۟ۦۣۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "\u06e0\u06e5\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/core/ۧ۟ۤۨ;->ۦۨۡۧ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v2

    const-string v5, "\u06e8\u06e6\u06e2"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣ۟۠ۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v3

    const-string v5, "\u06e5\u06e2\u06e8"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۧۦۢۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v5, "\u06e0\u06df\u06e0"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaac1 -> :sswitch_2
        0x1aab80 -> :sswitch_5
        0x1ab248 -> :sswitch_1
        0x1aba08 -> :sswitch_0
        0x1aba65 -> :sswitch_4
        0x1ac9a4 -> :sswitch_3
    .end sparse-switch
.end method
