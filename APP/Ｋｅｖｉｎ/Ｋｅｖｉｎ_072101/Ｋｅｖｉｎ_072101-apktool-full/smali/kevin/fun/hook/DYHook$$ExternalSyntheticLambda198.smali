.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final f$0:Landroid/widget/EditText;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Lkevin/fun/hook/DYHook$Consumer;

.field public final f$3:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Ljava/lang/String;Lkevin/fun/hook/DYHook$Consumer;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;->f$0:Landroid/widget/EditText;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;->f$2:Lkevin/fun/hook/DYHook$Consumer;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;->f$3:Landroid/content/Context;

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    const-string v0, "XIpqC9q1Rh"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۣ۠ۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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

    check-cast v0, Landroid/widget/EditText;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Lkevin/fun/hook/DYHook$Consumer;

    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    move-object v4, p4

    check-cast v4, Landroid/content/DialogInterface;

    move v5, p5

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook;->lambda$177(Landroid/widget/EditText;Ljava/lang/String;Lkevin/fun/hook/DYHook$Consumer;Landroid/content/Context;Landroid/content/DialogInterface;I)V

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
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    const/4 v4, 0x0

    const-string v5, "\u06e6\u06e8\u06e2"

    move-object v1, v4

    move-object v3, v4

    move-object v0, v4

    move-object v2, v4

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۨۥۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$Consumer;

    move-result-object v2

    const-string v4, "\u06e5\u06e7\u06e7"

    move-object v5, v4

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۧ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e4\u06e6"

    move-object v5, v4

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟ۢ۟ۡۡ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    const-string v4, "\u06e0\u06e8\u06e7"

    move-object v5, v4

    goto :goto_0

    :sswitch_2
    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda198;->ۣ۠ۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v4, "\u06e5\u06e1"

    move-object v5, v4

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۣ۟ۧۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const-string v4, "\u06df\u06e7\u06e8"

    move-object v5, v4

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9c -> :sswitch_4
        0x1aa800 -> :sswitch_2
        0x1aabdf -> :sswitch_0
        0x1abe85 -> :sswitch_3
        0x1ac260 -> :sswitch_1
    .end sparse-switch
.end method
