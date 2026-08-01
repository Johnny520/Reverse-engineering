.class public final synthetic Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    const-string v0, "OSg7DHUFndoKYQpN1AuXg1uA"

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۠ۢۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۢۤۦۤ(Ljava/lang/Object;Ljava/lang/Object;)I
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/io/File;

    check-cast p1, Ljava/io/File;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->lambda$31(Ljava/io/File;Ljava/io/File;)I

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
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v4, 0x0

    const-string v3, "\u06e0\u06e6\u06e1"

    move-object v1, v0

    move-object v2, v0

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Ljava/io/File;

    const-string v3, "\u06e1\u06e5\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Ljava/io/File;

    const-string v3, "\u06e7\u06df\u06e2"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda4;->ۢۤۦۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    const-string v0, "\u06e2\u06e6\u06df"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    return v4

    :sswitch_data_0
    .sparse-switch
        0x1aab9b -> :sswitch_0
        0x1aaf3b -> :sswitch_1
        0x1ab31b -> :sswitch_2
    .end sparse-switch
.end method
