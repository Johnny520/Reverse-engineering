.class Lkevin/fun/hook/DYHook$CategoryManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/DYHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CategoryManager"
.end annotation


# static fields
.field private static final KEY_CATEGORIES:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x5c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$CategoryManager;->short:[S

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x176

    const/16 v3, 0xbcb

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DYHook$CategoryManager;->KEY_CATEGORIES:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 2
        0xbbcs
        0xbaas
        0xbbfs
        0xba8s
        0xba3s
        0xb94s
        0xba8s
        0xbaas
        0xbbfs
        0xbaes
        0xbacs
        0xba4s
        0xbb9s
        0xba2s
        0xbaes
        0xbb8s
        -0x6afds
        -0x7f81s
        0x298s
        0x28es
        0x29bs
        0x28cs
        0x287s
        0x2b0s
        0x28cs
        0x28es
        0x29bs
        0x28as
        0x288s
        0x280s
        0x29ds
        0x286s
        0x28as
        0x29cs
        -0x660bs
        -0x7377s
        -0x6974s
        -0x7c10s
        0x733s
        0x725s
        0x730s
        0x727s
        0x72cs
        0x71bs
        0x727s
        0x725s
        0x730s
        0x721s
        0x723s
        0x72bs
        0x736s
        0x72ds
        0x721s
        0x737s
        0x988s
        0x99es
        0x98bs
        0x99cs
        0x997s
        0x9a0s
        0x993s
        0x996s
        0x98cs
        0x98bs
        0x9a0s
        0x995s
        0x98cs
        0x990s
        0x991s
        0x483s
        0x48fs
        0x48ds
        0x48ds
        0x485s
        0x48es
        0x494s
        0x4bfs
        0xb99s
        0x76fs
        0x76ds
        0x770s
        0x779s
        0x776s
        0x773s
        0x77as
        0x740s
        0x508s
        0x517s
        0x51as
        0x51bs
        0x511s
        0x521s
    .end array-data
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "0R5rV231PfGnpZ"

    invoke-static {v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۨۢۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static addCategory(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v1

    const/16 v3, 0x10

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x49

    const/16 v5, 0xbdb

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->۟ۦۢۤۨ()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۠ۧۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v4, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v3, v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v3}, Lkevin/fun/hook/DYHook$CategoryManager;->۟ۨۨۡ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    :sswitch_9
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public static getCategories()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v2

    const/16 v3, 0x12

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x164

    const/16 v5, 0x2ef

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v2

    const/16 v5, 0x22

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v6, v6, 0x265

    const/16 v7, 0x72d

    invoke-static {v2, v5, v6, v7}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    :sswitch_3
    return-object v0

    :sswitch_4
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v2, v1

    :sswitch_5
    invoke-static {v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۤۦۣ(Ljava/lang/Object;)I

    move-result v3

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_6
    if-lt v2, v3, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_7
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_8
    invoke-static {v0, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۠ۧۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-nez v2, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v1, 0xbe41

    goto :goto_3

    :sswitch_b
    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۧۢۨ(Ljava/lang/Object;ILjava/lang/Object;)V

    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_c
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_d
    invoke-static {v4, v2}, Landroidx/appcompat/ۣۧۤۢ;->۟ۡۤۤۧ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v6

    const v1, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_e
    const v1, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v6, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {v0, v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_11
    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v1, v1, -0x3c3

    add-int/2addr v2, v1

    const v1, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_12
    const v1, 0xc221

    goto :goto_6

    :catch_0
    move-exception v1

    invoke-static {v0, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
        0x11 -> :sswitch_6
        0x36 -> :sswitch_7
        0x1d7 -> :sswitch_d
        0x1f4 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_3
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_5
    .end sparse-switch
.end method

.method public static removeCategory(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v1

    const/16 v2, 0x24

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1e8

    const/16 v4, 0x854

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->۟ۦۢۤۨ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۠ۧۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v2, p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۤۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v2}, Lkevin/fun/hook/DYHook$CategoryManager;->۟ۨۨۡ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    :sswitch_6
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method private static saveCategories(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_0
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v0

    const/16 v1, 0x26

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x294

    const/16 v4, 0x744

    invoke-static {v0, v1, v3, v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤۦۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_5
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v4, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v2, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :catch_0
    move-exception v0

    :sswitch_a
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    const-string v0, "H8"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_0
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_0
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch
.end method

.method private static saveWatchList(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lkevin/fun/hook/DYHook$WatchItem;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_0
    invoke-static {v5}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v0

    const/16 v1, 0x36

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3cd

    const/16 v4, 0x9ff

    invoke-static {v0, v1, v2, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤۦۦۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_5
    invoke-static {v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->۟۠ۧۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->۟۠ۧۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->۟۠ۧۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move-object v2, v1

    :goto_5
    invoke-static {v4, v2}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v1, 0xc67d

    :goto_6
    const v7, 0xc68e

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :cond_3
    :sswitch_d
    const v1, 0xc6bb

    goto :goto_6

    :sswitch_e
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->۟۠ۥۣۥ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc202

    :goto_7
    const v6, 0xc213

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    if-eqz v2, :cond_4

    const v1, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_7

    :sswitch_12
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->ۡۤۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->ۧۧ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v7

    const/16 v8, 0x45

    sget v9, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v9, v9, -0x6b

    const/16 v10, 0x4e0

    invoke-static {v7, v8, v9, v10}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v6

    const/16 v7, 0x4d

    const/4 v8, 0x1

    const/16 v9, 0xbc6

    invoke-static {v6, v7, v8, v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc27e

    :goto_8
    const v6, 0xc28f

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    move-object v2, v1

    goto :goto_5

    :sswitch_14
    const v2, 0xc29d

    goto :goto_8

    :sswitch_15
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->۟ۧۦۤ۟(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    if-eqz v2, :cond_5

    const v1, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_9

    :sswitch_18
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣ۟ۤۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v6

    const/16 v7, 0x4e

    sget v8, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v8, v8, 0x29b

    const/16 v9, 0x71f

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    const v2, 0xc620

    goto :goto_a

    :sswitch_1a
    move-object v2, v1

    goto/16 :goto_5

    :sswitch_1b
    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->ۡۤۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->ۣۨۢۢ()[S

    move-result-object v6

    const/16 v7, 0x56

    sget v8, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v8, v8, 0x255

    const/16 v9, 0x57e

    invoke-static {v6, v7, v8, v9}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto/16 :goto_5

    :sswitch_1c
    if-nez v6, :cond_3

    const v1, 0xc965

    goto/16 :goto_6

    :sswitch_1d
    invoke-static {v4, v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۤۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v0}, Lkevin/fun/hook/DYHook$CategoryManager;->ۢۡۨ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc984

    :goto_b
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_b

    :catchall_0
    move-exception v0

    :sswitch_1f
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_f
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x12 -> :sswitch_d
        0x35 -> :sswitch_0
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ۟۠ۥۣۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isComment:Z

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

.method public static ۟۠ۧۡۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->exportId:Ljava/lang/String;

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

.method public static ۣ۟ۤۤۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->userUid:Ljava/lang/String;

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

.method public static ۟ۦۢۤۨ()Ljava/util/List;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook$CategoryManager;->getCategories()Ljava/util/List;

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

.method public static ۟ۧۦۤ۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->isProfile:Z

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

.method public static ۟ۨۨۡ(Ljava/lang/Object;)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$CategoryManager;->saveCategories(Ljava/util/List;)V

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

.method public static ۡۤۧۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->videoId:Ljava/lang/String;

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

.method public static ۢۡۨ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-virtual {p0}, Lkevin/fun/hook/DYHook$WatchItem;->toJson()Ljava/lang/String;

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

.method public static ۧۧ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$WatchItem;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$WatchItem;->commentId:Ljava/lang/String;

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

.method public static ۣۨۢۢ()[S
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$CategoryManager;->short:[S

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
