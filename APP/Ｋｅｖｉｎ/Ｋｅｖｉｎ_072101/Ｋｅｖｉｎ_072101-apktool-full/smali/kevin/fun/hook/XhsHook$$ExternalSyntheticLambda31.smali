.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Landroid/content/Context;

.field public final f$2:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;->f$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;->f$2:Lorg/json/JSONObject;

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    const-string v0, "rB6DYi5xnp19ExCThpvJSunPYQL"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۥۤۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Lorg/json/JSONObject;

    check-cast p3, Landroid/content/DialogInterface;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/XhsHook;->lambda$13$kevin-fun-hook-XhsHook(Landroid/content/Context;Lorg/json/JSONObject;Landroid/content/DialogInterface;I)V

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
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e0\u06e0\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v3, v2, p1, p2}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;->ۥۤۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v1, "\u06e1\u06e8\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۢۢۧۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v4, "\u06df\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۦۣۨ۟(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e7\u06e6\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۦۤۤ۠(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "\u06e2\u06e0\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa704 -> :sswitch_2
        0x1aaae2 -> :sswitch_1
        0x1aaf98 -> :sswitch_3
        0x1ac5e8 -> :sswitch_0
    .end sparse-switch
.end method
