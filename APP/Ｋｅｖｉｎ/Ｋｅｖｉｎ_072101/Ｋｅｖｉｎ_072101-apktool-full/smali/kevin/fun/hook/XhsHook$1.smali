.class Lkevin/fun/hook/XhsHook$1;
.super Ljava/lang/Object;

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/XhsHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/XhsHook$1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x1e8s
        0x1cas
        0x1cas
        0x1ccs
        0x1d9s
        0x1dds
        0x184s
        0x1ecs
        0x1c7s
        0x1cas
        0x1c6s
        0x1cds
        0x1c0s
        0x1c7s
        0x1ces
        0xb6ds
        0xb60s
        0xb61s
        0xb6as
        0xb70s
        0xb6ds
        0xb70s
        0xb7ds
    .end array-data
.end method

.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    const-string v0, "ObGtqCAMC"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۡۦۡۥ(Ljava/lang/Object;)Lokhttp3/Request$Builder;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    check-cast p0, Lokhttp3/Request;

    invoke-virtual {p0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v0

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

.method public static ۡۦۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Response;
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lokhttp3/Interceptor$Chain;

    check-cast p1, Lokhttp3/Request;

    invoke-interface {p0, p1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0

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

.method public static ۢۢ۠ۢ(Ljava/lang/Object;)Lokhttp3/Request;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lokhttp3/Request$Builder;

    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

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

.method public static ۣۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    check-cast p0, Lokhttp3/Request$Builder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

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

.method public static ۦۣ۟ۢ()[S
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    sget-object v0, Lkevin/fun/hook/XhsHook$1;->short:[S

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

.method public static ۨۦۧۤ(Ljava/lang/Object;)Lokhttp3/Request;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lokhttp3/Interceptor$Chain;

    invoke-interface {p0}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

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
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e1\u06e7\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v6}, Lkevin/fun/hook/XhsHook$1;->۟ۡۦۡۥ(Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/XhsHook$1;->ۦۣ۟ۢ()[S

    move-result-object v1

    const-string v8, "\u06e2\u06e1\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p1, v6}, Lkevin/fun/hook/XhsHook$1;->ۡۦۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Response;

    move-result-object v1

    const-string v8, "\u06e6\u06e2\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lkevin/fun/hook/XhsHook$1;->ۨۦۧۤ(Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v1

    const-string v8, "\u06e4\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v9, v11, -0x218

    const-string v1, "\u06e0\u06e4\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0xf

    const/16 v5, 0xb04

    invoke-static {v7, v1, v9, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e1\u06e6\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "\u06e1\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/XhsHook$1;->ۦۣ۟ۢ()[S

    move-result-object v1

    const-string v8, "\u06e5\u06e2\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x1a9

    invoke-static {v7, v10, v9, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e6\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v0, v4, v5}, Lkevin/fun/hook/XhsHook$1;->ۣۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v1

    const-string v8, "\u06e4\u06e3\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit8 v9, v11, -0x6e

    const-string v1, "\u06e1\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_a
    sget v11, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v1, "\u06e0\u06e6\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v2}, Lkevin/fun/hook/XhsHook$1;->ۢۢ۠ۢ(Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v1

    const-string v8, "\u06e0\u06e0\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    sget v11, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e4\u06e8\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_d
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_1
        0xdc26 -> :sswitch_7
        0xdcc2 -> :sswitch_0
        0x1aaadf -> :sswitch_5
        0x1aab5e -> :sswitch_4
        0x1aaba0 -> :sswitch_9
        0x1aaf5c -> :sswitch_6
        0x1aaf63 -> :sswitch_8
        0x1aaf7e -> :sswitch_2
        0x1ab285 -> :sswitch_c
        0x1aba47 -> :sswitch_b
        0x1abade -> :sswitch_3
        0x1abde6 -> :sswitch_a
        0x1ac1aa -> :sswitch_d
    .end sparse-switch
.end method
