.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Landroid/content/Context;

.field public final f$2:Ljava/util/List;

.field public final f$3:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;->f$2:Ljava/util/List;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;->f$3:Lorg/json/JSONObject;

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    const-string v0, "OwCQlaZYdw"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۠ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lorg/json/JSONObject;

    check-cast p4, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/XhsHook;->lambda$8$kevin-fun-hook-XhsHook(Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "pv4d5"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e2\u06e4\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۡۤۢ۟(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "\u06e1\u06e2\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v4, v3, v0, p1}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda26;->۟۠ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e6\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->۠ۢۧۧ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    const-string v5, "\u06e1\u06e0\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v5, "\u06e7\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/startup/ۤۧۥۣ;->ۧۦ۟ۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v5, "\u06e0\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcdd -> :sswitch_3
        0x1aaea6 -> :sswitch_2
        0x1aaedf -> :sswitch_0
        0x1ab2e0 -> :sswitch_1
        0x1abaa1 -> :sswitch_4
    .end sparse-switch
.end method
