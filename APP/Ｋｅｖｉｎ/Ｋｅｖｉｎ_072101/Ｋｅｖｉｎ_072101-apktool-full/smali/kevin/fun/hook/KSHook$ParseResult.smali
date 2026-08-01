.class Lkevin/fun/hook/KSHook$ParseResult;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/KSHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ParseResult"
.end annotation


# instance fields
.field atlasImageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field backgroundMusicUrl:Ljava/lang/String;

.field backupVideoUrl:Ljava/lang/String;

.field coverImageUrl:Ljava/lang/String;

.field currentMediaType:Lkevin/fun/hook/KSHook$MediaType;

.field kwaiID:Ljava/lang/String;

.field publishTime:Ljava/lang/String;

.field userName:Ljava/lang/String;

.field videoCaption:Ljava/lang/String;

.field videoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lkevin/fun/hook/KSHook$VideoInfo;",
            ">;"
        }
    .end annotation
.end field

.field viewCount:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->userName:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->kwaiID:Ljava/lang/String;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->viewCount:J

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->publishTime:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->videoCaption:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->coverImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->backgroundMusicUrl:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->backupVideoUrl:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->videoList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->atlasImageUrls:Ljava/util/List;

    invoke-static {}, Lkevin/fun/hook/KSHook$ParseResult;->۠ۤ۠ۢ()Lkevin/fun/hook/KSHook$MediaType;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->currentMediaType:Lkevin/fun/hook/KSHook$MediaType;

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
    const-string v0, "fd3LR7Kin2M6YuH0a"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method synthetic constructor <init>(Lkevin/fun/hook/KSHook-IA;)V
    .locals 2

    invoke-direct {p0}, Lkevin/fun/hook/KSHook$ParseResult;-><init>()V

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

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
    const-string v0, "F4oIzZ8VVWrj2L3V"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۟ۨۤ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/KSHook$ParseResult;

    iget-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->atlasImageUrls:Ljava/util/List;

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

.method public static ۣ۟۟ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p0, Lkevin/fun/hook/KSHook$ParseResult;

    iget-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->videoCaption:Ljava/lang/String;

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

.method public static ۟ۥۦۣۦ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    check-cast p0, Lkevin/fun/hook/KSHook$ParseResult;

    iget-wide v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->viewCount:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

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

.method public static ۠ۤ۠ۢ()Lkevin/fun/hook/KSHook$MediaType;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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
    sget-object v0, Lkevin/fun/hook/KSHook$MediaType;->VIDEO:Lkevin/fun/hook/KSHook$MediaType;

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

.method public static ۣۡۥ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

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
    check-cast p0, Lkevin/fun/hook/KSHook$ParseResult;

    iget-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->userName:Ljava/lang/String;

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

.method public static ۣۧۨۤ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    check-cast p0, Lkevin/fun/hook/KSHook$ParseResult;

    iget-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->videoList:Ljava/util/List;

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


# virtual methods
.method clear()V
    .locals 6

    const/4 v1, 0x0

    const-string v4, "\u06e6\u06e8\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->publishTime:Ljava/lang/String;

    const-string v1, "\u06df\u06e4\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->kwaiID:Ljava/lang/String;

    const-string v1, "\u06e8\u06e5\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->videoCaption:Ljava/lang/String;

    const-string v1, "\u06e2\u06e5\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/KSHook$ParseResult;->ۣۧۨۤ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v4, "\u06e8\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v3}, Landroidx/core/ۤۦ۟ۢ;->ۡۢۦ۟(Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e6\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lkevin/fun/hook/KSHook$ParseResult;->viewCount:J

    const-string v1, "\u06e1\u06e7\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    iput-object v0, p0, Lkevin/fun/hook/KSHook$ParseResult;->currentMediaType:Lkevin/fun/hook/KSHook$MediaType;

    const-string v1, "\u06e3\u06e1\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v3}, Landroidx/core/ۤۦ۟ۢ;->ۡۢۦ۟(Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e7\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->backupVideoUrl:Ljava/lang/String;

    const-string v1, "\u06e7\u06e4\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->userName:Ljava/lang/String;

    const-string v1, "\u06e3\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/KSHook$ParseResult;->۠ۤ۠ۢ()Lkevin/fun/hook/KSHook$MediaType;

    move-result-object v0

    const-string v1, "\u06e3\u06e8\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e1\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_b
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->backgroundMusicUrl:Ljava/lang/String;

    const-string v1, "\u06e5\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    iput-object v2, p0, Lkevin/fun/hook/KSHook$ParseResult;->coverImageUrl:Ljava/lang/String;

    const-string v1, "\u06e3\u06e5\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Lkevin/fun/hook/KSHook$ParseResult;->ۣ۟۟ۨۤ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v4, "\u06e8\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_e
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc64 -> :sswitch_0
        0xdcf9 -> :sswitch_6
        0x1aa79e -> :sswitch_1
        0x1aaf61 -> :sswitch_9
        0x1aafa1 -> :sswitch_8
        0x1ab305 -> :sswitch_c
        0x1ab647 -> :sswitch_e
        0x1ab6c4 -> :sswitch_b
        0x1ab722 -> :sswitch_5
        0x1abe40 -> :sswitch_7
        0x1abe85 -> :sswitch_d
        0x1ac266 -> :sswitch_a
        0x1ac5a9 -> :sswitch_2
        0x1ac92d -> :sswitch_3
        0x1ac982 -> :sswitch_4
    .end sparse-switch
.end method

.method isComplete()Z
    .locals 4

    invoke-static {p0}, Lkevin/fun/hook/KSHook$ParseResult;->ۣۡۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/KSHook$ParseResult;->ۣ۟۟ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/KSHook$ParseResult;->۟ۥۦۣۦ(Ljava/lang/Object;)J

    move-result-wide v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, 0x1

    :goto_3
    return v0

    :sswitch_9
    const/4 v0, 0x0

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method
