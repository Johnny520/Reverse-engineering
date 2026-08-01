.class Lkevin/fun/hook/DYHook$60;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookProtobufDecode(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x124

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$60;->short:[S

    return-void

    :array_0
    .array-data 2
        0x135s
        -0x7758s
        -0x6601s
        -0x7157s
        0x6f8as
        0x133s
        0x14es
        0x10as
        0x10bs
        0x10ds
        0x101s
        0x10as
        0x10bs
        0x14es
        0x7fbds
        0x66f2s
        0x4f54s
        0x14es
        0x100s
        0x11bs
        0x102s
        0x102s
        0x428s
        -0x724bs
        -0x631es
        -0x744cs
        0x6a97s
        0x42es
        0x453s
        0x6193s
        0x68a6s
        -0x783cs
        0x57a5s
        0x453s
        0x41as
        0x407s
        0x416s
        0x41es
        0x400s
        0x453s
        0x5664s
        -0x73e5s
        0x6665s
        0x7808s
        0x53f8s
        0x4a7es
        0x5f8as
        0x31es
        -0x757ds
        -0x642cs
        -0x737es
        0x6da1s
        0x318s
        0x365s
        0x32cs
        0x331s
        0x320s
        0x328s
        0x336s
        0x365s
        0x5152s
        -0x74d3s
        0x4d7fs
        0x793fs
        0x212s
        0x209s
        0x208s
        0x204s
        0x20ds
        0x205s
        0x23es
        0x20ds
        0x208s
        0x217s
        0x204s
        0x183s
        0x198s
        0x199s
        0x195s
        0x19cs
        0x194s
        0x1afs
        0x199s
        0x19ds
        0x191s
        0x197s
        0x195s
        0x564s
        0x57fs
        0x57es
        0x572s
        0x57bs
        0x573s
        0x548s
        0x576s
        0x573s
        0x81cs
        0x807s
        0x806s
        0x80as
        0x803s
        0x80bs
        0x830s
        0x80as
        0x80cs
        0x800s
        0x802s
        0x802s
        0x80as
        0x81ds
        0x80cs
        0x80as
        0x330s
        0x32bs
        0x32as
        0x326s
        0x32fs
        0x327s
        0x31cs
        0x336s
        0x32ds
        0x328s
        0x32ds
        0x32cs
        0x334s
        0x32ds
        0x2b9s
        0x2b6s
        0x2b3s
        0x2abs
        0x2bas
        0x2ads
        0x280s
        0x2bbs
        0x2aas
        0x2ads
        0x2bes
        0x2abs
        0x2b6s
        0x2b0s
        0x2b1s
        0x280s
        0x2bas
        0x2b1s
        0x2bes
        0x2bds
        0x2b3s
        0x2bas
        0x569s
        0x566s
        0x563s
        0x57bs
        0x56as
        0x57ds
        0x550s
        0x562s
        0x566s
        0x561s
        0x550s
        0x56bs
        0x57as
        0x57ds
        0x56es
        0x57bs
        0x566s
        0x560s
        0x561s
        0x550s
        0x57cs
        0x56as
        0x56cs
        0x381s
        0x38es
        0x38bs
        0x393s
        0x382s
        0x395s
        0x3b8s
        0x38as
        0x386s
        0x39fs
        0x3b8s
        0x383s
        0x392s
        0x395s
        0x386s
        0x393s
        0x38es
        0x388s
        0x389s
        0x3b8s
        0x394s
        0x382s
        0x384s
        0x846s
        0x849s
        0x84cs
        0x854s
        0x845s
        0x852s
        0x87fs
        0x844s
        0x849s
        0x847s
        0x847s
        0x87fs
        0x845s
        0x84es
        0x841s
        0x842s
        0x84cs
        0x845s
        0x321s
        0x32es
        0x32bs
        0x333s
        0x322s
        0x335s
        0x318s
        0x32as
        0x32es
        0x329s
        0x318s
        0x323s
        0x32es
        0x320s
        0x320s
        0x262s
        0x26ds
        0x268s
        0x270s
        0x261s
        0x276s
        0x25bs
        0x269s
        0x265s
        0x27cs
        0x25bs
        0x260s
        0x26ds
        0x263s
        0x263s
        0x13fs
        0x165s
        0x67a6s
        -0x68d1s
        0x4c5ds
        -0x701ds
        0x278s
        0xbd8s
        0xb8bs
        0xb97s
        0xb8bs
        0x6da6s
        -0x62d1s
        -0x7869s
        -0x62d1s
        0x878s
        0x365s
        0x336s
        0x328s
        0x336s
        0x205s
        0x7457s
        -0x7650s
        0x4ae3s
        -0x76a3s
        0x4c6s
        0x7d4s
        0x7c8s
        0x7d4s
        0x786ds
        -0x7a76s
        -0x78eds
        0x51ces
        0x8fcs
        0x470s
        0x46es
        0x470s
        0x24fs
        -0x742es
        -0x657bs
        -0x722ds
        0x6cf0s
        0x249s
        0x234s
        -0x722ds
        0x6cf0s
        0x5b25s
        -0x70cfs
        0x22es
        0x234s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$60;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "v8vqYvxGe2k4nZlgiAckYuCb3Y"

    invoke-static {v0}, Landroidx/appcompat/ۣۧۤۢ;->۟۟ۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۟۠ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mgetVideoDurationSafe(Lkevin/fun/hook/DYHook;Ljava/lang/Object;)J

    move-result-wide v0

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

.method public static ۟ۡۥۥۥ(Ljava/lang/Object;I)Z
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misLiveAwemeType(Lkevin/fun/hook/DYHook;I)Z

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

.method public static ۟ۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mgetAwemeTypeSafe(Lkevin/fun/hook/DYHook;Ljava/lang/Object;)I

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

.method public static ۟ۢۨ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mgetItemsFromResponse(Lkevin/fun/hook/DYHook;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۣ۟ۨۢۨ(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$mgetDiggCountSafe(Lkevin/fun/hook/DYHook;Ljava/lang/Object;)J

    move-result-wide v0

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

.method public static ۡ۠۠۟(Ljava/lang/Object;I)Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misImageAwemeType(Lkevin/fun/hook/DYHook;I)Z

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

.method public static ۢۥۨ۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

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

.method public static ۥۢۦۨ()[S
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$60;->short:[S

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

.method public static ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$60;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$60;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۣۣۧۡ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

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

.method public static ۣۨۢۦ(Ljava/lang/Object;I)Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misEcommerceAwemeType(Lkevin/fun/hook/DYHook;I)Z

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

.method public static ۨۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$misAdAwemeEnhanced(Lkevin/fun/hook/DYHook;Ljava/lang/Object;I)Z

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
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/DYHook$60;->ۢۥۨ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/16 v4, 0x650

    :goto_0
    xor-int/lit16 v4, v4, 0x661

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v4, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v5, :cond_0

    const/16 v4, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v4

    const/4 v5, 0x0

    sget v6, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v6, v6, 0x309

    const/16 v7, 0x16e

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/DYHook$60;->ۣۣۧۡ(Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v4

    invoke-static {v4, v5}, Lkevin/fun/hook/DYHook$60;->۟ۢۨ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, Ljava/util/List;

    const/16 v5, 0x6cc

    :goto_2
    xor-int/lit16 v5, v5, 0x6dd

    sparse-switch v5, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v6, :cond_1

    const/16 v5, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v5, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v4

    const/16 v5, 0x16

    sget v6, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v6, v6, 0xda

    const/16 v7, 0x473

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/DYHook$60;->ۣۣۧۡ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    invoke-static {v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v6

    const/16 v7, 0x117

    sget v8, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v8, v8, 0x289

    const/16 v9, 0x214

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/DYHook$60;->ۣۣۧۡ(Ljava/lang/Object;)V

    :sswitch_8
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v5

    const v4, 0x171f33

    :goto_3
    const v6, 0x171f44

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :cond_2
    :sswitch_9
    const v4, 0x171f71

    goto :goto_3

    :sswitch_a
    :try_start_1
    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v6

    const/16 v5, 0x748

    :goto_4
    xor-int/lit16 v5, v5, 0x759

    sparse-switch v5, :sswitch_data_3

    goto :goto_4

    :sswitch_b
    if-eqz v6, :cond_3

    const v5, 0xbe60

    goto :goto_4

    :cond_3
    :sswitch_c
    const v5, 0xbe41

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v4

    const/16 v5, 0x2f

    sget v6, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v6, v6, -0x80

    const/16 v7, 0x345

    invoke-static {v4, v5, v6, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/DYHook$60;->ۣۣۧۡ(Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x40

    sget v7, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v7, v7, -0x7f

    const/16 v8, 0x261

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v7

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x4b

    sget v8, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v8, v8, 0x288

    const/16 v9, 0x1f0

    invoke-static {v5, v6, v8, v9}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v8

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x57

    sget v9, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v9, v9, 0x5b

    const/16 v10, 0x517

    invoke-static {v5, v6, v9, v10}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v9

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x60

    sget v10, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v10, v10, 0x332

    const/16 v11, 0x86f

    invoke-static {v5, v6, v10, v11}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v10

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x70

    sget v11, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v11, v11, 0x82

    const/16 v12, 0x343

    invoke-static {v5, v6, v11, v12}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v11

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x7e

    sget v12, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v12, v12, 0x29b

    const/16 v13, 0x2df

    invoke-static {v5, v6, v12, v13}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v12

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0x94

    sget v13, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v13, v13, -0x5

    const/16 v14, 0x50f

    invoke-static {v5, v6, v13, v14}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v14, -0x1ec

    sget v6, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    int-to-long v0, v6

    move-wide/from16 v16, v0

    xor-long v14, v14, v16

    invoke-static {v5, v14, v15}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۧ۠۟ۦ(Ljava/lang/Object;J)J

    move-result-wide v16

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0xab

    sget v13, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v13, v13, -0x1d4

    const/16 v18, 0x3e7

    move/from16 v0, v18

    invoke-static {v5, v6, v13, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14, v15}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۧ۠۟ۦ(Ljava/lang/Object;J)J

    move-result-wide v18

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0xc2

    sget v13, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v13, v13, -0x68

    const/16 v20, 0x820

    move/from16 v0, v20

    invoke-static {v5, v6, v13, v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v13

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0xd4

    sget v20, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0x17b

    move/from16 v20, v0

    const/16 v21, 0x347

    move/from16 v0, v20

    move/from16 v1, v21

    invoke-static {v5, v6, v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14, v15}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۧ۠۟ۦ(Ljava/lang/Object;J)J

    move-result-wide v20

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v6, 0xe3

    sget v22, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    move/from16 v0, v22

    xor-int/lit16 v0, v0, 0x1b0

    move/from16 v22, v0

    const/16 v23, 0x204

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-static {v5, v6, v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v14, v15}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۧ۠۟ۦ(Ljava/lang/Object;J)J

    move-result-wide v14

    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v22

    const/4 v4, 0x0

    move v6, v4

    :goto_5
    :sswitch_f
    invoke-static/range {v22 .. v22}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xbe7f

    :goto_6
    const v23, 0xbe90

    xor-int v4, v4, v23

    sparse-switch v4, :sswitch_data_4

    goto :goto_6

    :cond_4
    :sswitch_10
    const v4, 0xbebd

    goto :goto_6

    :sswitch_11
    if-nez v5, :cond_4

    const v4, 0xbedc

    goto :goto_6

    :sswitch_12
    const v4, 0xbefb

    :goto_7
    const v5, 0xbf0c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5

    goto :goto_7

    :sswitch_13
    const v4, 0xbf1a

    goto :goto_7

    :sswitch_14
    invoke-static/range {v22 .. v22}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    const v4, 0xc202

    :goto_8
    const v5, 0xc213

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_6

    goto :goto_8

    :sswitch_15
    if-nez v23, :cond_5

    const v4, 0xc25f

    goto :goto_8

    :cond_5
    :sswitch_16
    const v4, 0xc240

    goto :goto_8

    :sswitch_17
    const v4, 0xc27e

    :goto_9
    const v5, 0xc28f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_7

    goto :goto_9

    :sswitch_18
    const v4, 0x171eb7

    :goto_a
    const v5, 0x171ec8

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    const v4, 0x171ed6

    goto :goto_a

    :sswitch_1a
    const v4, 0xc29d

    goto :goto_9

    :sswitch_1b
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v4

    move-object/from16 v0, v23

    invoke-static {v4, v0}, Lkevin/fun/hook/DYHook$60;->۟ۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v24

    const/4 v4, 0x0

    const v5, 0xc2fa

    :goto_b
    const v25, 0xc30b

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_9

    goto :goto_b

    :sswitch_1c
    if-eqz v11, :cond_6

    const v5, 0xc5e2

    goto :goto_b

    :cond_6
    :sswitch_1d
    const v5, 0xc5c3

    goto :goto_b

    :sswitch_1e
    const v5, 0xc601

    :goto_c
    const v25, 0xc612

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    const/4 v5, -0x1

    move/from16 v0, v24

    if-ne v0, v5, :cond_7

    const v5, 0xc65e

    goto :goto_c

    :cond_7
    :sswitch_20
    const v5, 0xc63f

    goto :goto_c

    :sswitch_21
    const/4 v4, 0x1

    const v5, 0xc67d

    :goto_d
    const v23, 0xc68e

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_b

    goto :goto_d

    :sswitch_22
    const v5, 0x171b34

    :goto_e
    const v23, 0x171b45

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_c

    goto :goto_e

    :cond_8
    :sswitch_23
    const v5, 0x171b72

    goto :goto_e

    :sswitch_24
    const v5, 0xc69c

    goto :goto_d

    :sswitch_25
    const v5, 0xc984

    :goto_f
    const v25, 0xc995

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_d

    goto :goto_f

    :sswitch_26
    if-eqz v9, :cond_9

    const v5, 0xc9e1

    goto :goto_f

    :cond_9
    :sswitch_27
    const v5, 0xc9c2

    goto :goto_f

    :sswitch_28
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move-object/from16 v0, v23

    move/from16 v1, v24

    invoke-static {v5, v0, v1}, Lkevin/fun/hook/DYHook$60;->ۨۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v25

    const v5, 0xca00

    :goto_10
    const v26, 0xca11

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_e

    goto :goto_10

    :cond_a
    :sswitch_29
    const v5, 0xca3e

    goto :goto_10

    :sswitch_2a
    if-eqz v25, :cond_a

    const v5, 0xca5d

    goto :goto_10

    :sswitch_2b
    const/4 v4, 0x1

    const v5, 0xca7c

    :goto_11
    const v23, 0xca8d

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_f

    goto :goto_11

    :sswitch_2c
    const v5, 0xcd26

    goto :goto_11

    :sswitch_2d
    const v5, 0xcd83

    :goto_12
    const v25, 0xcd94

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_10

    goto :goto_12

    :sswitch_2e
    if-eqz v7, :cond_b

    const v5, 0xcde0

    goto :goto_12

    :cond_b
    :sswitch_2f
    const v5, 0xcdc1

    goto :goto_12

    :sswitch_30
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move/from16 v0, v24

    invoke-static {v5, v0}, Lkevin/fun/hook/DYHook$60;->۟ۡۥۥۥ(Ljava/lang/Object;I)Z

    move-result v25

    const v5, 0xcdff

    :goto_13
    const v26, 0xce10

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_11

    goto :goto_13

    :cond_c
    :sswitch_31
    const v5, 0xce3d

    goto :goto_13

    :sswitch_32
    if-eqz v25, :cond_c

    const v5, 0xd0e7

    goto :goto_13

    :sswitch_33
    const/4 v4, 0x1

    const v5, 0xd106

    :goto_14
    const v23, 0xd117

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_12

    goto :goto_14

    :sswitch_34
    const v5, 0xd125

    goto :goto_14

    :sswitch_35
    const v5, 0xd182

    :goto_15
    const v25, 0xd193

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_13

    goto :goto_15

    :sswitch_36
    if-eqz v8, :cond_d

    const v5, 0xd1df

    goto :goto_15

    :cond_d
    :sswitch_37
    const v5, 0xd1c0

    goto :goto_15

    :sswitch_38
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move/from16 v0, v24

    invoke-static {v5, v0}, Lkevin/fun/hook/DYHook$60;->ۡ۠۠۟(Ljava/lang/Object;I)Z

    move-result v25

    const v5, 0xd1fe

    :goto_16
    const v26, 0xd20f

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_14

    goto :goto_16

    :sswitch_39
    if-eqz v25, :cond_e

    const v5, 0xd4e6

    goto :goto_16

    :cond_e
    :sswitch_3a
    const v5, 0xd4c7

    goto :goto_16

    :sswitch_3b
    const/4 v4, 0x1

    const v5, 0xd505

    :goto_17
    const v23, 0xd516

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_15

    goto :goto_17

    :sswitch_3c
    const v5, 0xd524

    goto :goto_17

    :sswitch_3d
    const v5, 0xd581

    :goto_18
    const v25, 0xd592

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_16

    goto :goto_18

    :sswitch_3e
    if-eqz v10, :cond_f

    const v5, 0xd869

    goto :goto_18

    :cond_f
    :sswitch_3f
    const v5, 0xd5bf

    goto :goto_18

    :sswitch_40
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move/from16 v0, v24

    invoke-static {v5, v0}, Lkevin/fun/hook/DYHook$60;->ۣۨۢۦ(Ljava/lang/Object;I)Z

    move-result v24

    const v5, 0xd888

    :goto_19
    const v25, 0xd899

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_17

    goto :goto_19

    :sswitch_41
    if-eqz v24, :cond_10

    const v5, 0xd8e5

    goto :goto_19

    :cond_10
    :sswitch_42
    const v5, 0xd8c6

    goto :goto_19

    :sswitch_43
    const/4 v4, 0x1

    const v5, 0xd904

    :goto_1a
    const v23, 0xd915

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_18

    goto :goto_1a

    :sswitch_44
    const v5, 0xd923

    goto :goto_1a

    :sswitch_45
    const v5, 0xd980

    :goto_1b
    const v24, 0xd991

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_19

    goto :goto_1b

    :sswitch_46
    if-eqz v12, :cond_11

    const v5, 0xdc68

    goto :goto_1b

    :cond_11
    :sswitch_47
    const v5, 0xdc49

    goto :goto_1b

    :sswitch_48
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Lkevin/fun/hook/DYHook$60;->۟۠ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v24

    const v5, 0xdc87

    :goto_1c
    const v23, 0xdc98

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_1a

    goto :goto_1c

    :sswitch_49
    const-wide/16 v26, 0x0

    cmp-long v5, v24, v26

    if-lez v5, :cond_12

    const v5, 0xdce4

    goto :goto_1c

    :cond_12
    :sswitch_4a
    const v5, 0xdcc5

    goto :goto_1c

    :sswitch_4b
    const-wide/16 v26, 0x3e8

    div-long v24, v24, v26
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v23, 0xf2

    sget v26, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v26, v26, 0x70

    const/16 v27, 0x14c

    move/from16 v0, v23

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-static {v5, v0, v1, v2}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v23

    const v5, 0xdd03

    :goto_1d
    const v26, 0xdd14

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_1b

    goto :goto_1d

    :sswitch_4c
    const-wide/16 v26, 0x0

    cmp-long v5, v16, v26

    if-lez v5, :cond_13

    const v5, 0x170090

    goto :goto_1d

    :cond_13
    :sswitch_4d
    const v5, 0xdd41

    goto :goto_1d

    :sswitch_4e
    const v5, 0x1700af

    :goto_1e
    const v26, 0x1700c0

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_1c

    goto :goto_1e

    :cond_14
    :sswitch_4f
    const v5, 0x1700ed

    goto :goto_1e

    :sswitch_50
    cmp-long v5, v24, v16

    if-gez v5, :cond_14

    const v5, 0x17010c

    goto :goto_1e

    :sswitch_51
    const/4 v4, 0x1

    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v26

    const/16 v27, 0xf4

    sget v28, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    move/from16 v0, v28

    xor-int/lit16 v0, v0, -0x1b9

    move/from16 v28, v0

    const/16 v29, 0x250

    invoke-static/range {v26 .. v29}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v24

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v24

    const/16 v25, 0xf9

    sget v26, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x35f

    move/from16 v26, v0

    const/16 v27, 0xbab

    invoke-static/range {v24 .. v27}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v16

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    const v5, 0x17012b

    :goto_1f
    const v23, 0x17013c

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_1d

    goto :goto_1f

    :sswitch_52
    const v5, 0x17014a

    goto :goto_1f

    :sswitch_53
    const v5, 0x1701a7

    :goto_20
    const v26, 0x1701b8

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_1e

    goto :goto_20

    :sswitch_54
    const v5, 0x170451

    goto :goto_20

    :sswitch_55
    const v5, 0x1704ae

    :goto_21
    const v26, 0x1704bf

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_1f

    goto :goto_21

    :sswitch_56
    const-wide/16 v26, 0x0

    cmp-long v5, v18, v26

    if-lez v5, :cond_15

    const v5, 0x17050b

    goto :goto_21

    :cond_15
    :sswitch_57
    const v5, 0x1704ec

    goto :goto_21

    :sswitch_58
    const v5, 0x17052a

    :goto_22
    const v26, 0x17053b

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_20

    goto :goto_22

    :sswitch_59
    cmp-long v5, v24, v18

    if-lez v5, :cond_16

    const v5, 0x170812

    goto :goto_22

    :cond_16
    :sswitch_5a
    const v5, 0x170568

    goto :goto_22

    :sswitch_5b
    const/4 v4, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v26

    const/16 v27, 0xfd

    sget v28, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    move/from16 v0, v28

    xor-int/lit16 v0, v0, -0x1e3

    move/from16 v28, v0

    const/16 v29, 0x850

    invoke-static/range {v26 .. v29}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v24

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v24

    const/16 v25, 0x102

    sget v26, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v26, v26, -0x7f

    const/16 v27, 0x316

    invoke-static/range {v24 .. v27}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v18

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    const v5, 0x170831

    :goto_23
    const v23, 0x170842

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_21

    goto :goto_23

    :sswitch_5c
    const v5, 0x170850

    goto :goto_23

    :sswitch_5d
    const v5, 0x1708ad

    :goto_24
    const v23, 0x1708be

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_22

    goto :goto_24

    :sswitch_5e
    const v5, 0x1708cc

    goto :goto_24

    :sswitch_5f
    const v5, 0x170929

    :goto_25
    const v23, 0x17093a

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_23

    goto :goto_25

    :sswitch_60
    const v5, 0x170bd3

    goto :goto_25

    :sswitch_61
    const v5, 0x170c30

    :goto_26
    const v24, 0x170c41

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_24

    goto :goto_26

    :cond_17
    :sswitch_62
    const v5, 0x170c6e

    goto :goto_26

    :sswitch_63
    if-eqz v13, :cond_17

    const v5, 0x170c8d

    goto :goto_26

    :sswitch_64
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$60;->ۦۡۡۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Lkevin/fun/hook/DYHook$60;->ۣ۟ۨۢۨ(Ljava/lang/Object;Ljava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-wide v24

    const v5, 0x170cac

    :goto_27
    const v23, 0x170cbd

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_25

    goto :goto_27

    :sswitch_65
    const-wide/16 v26, 0x0

    cmp-long v5, v24, v26

    if-lez v5, :cond_18

    const v5, 0x170f94

    goto :goto_27

    :cond_18
    :sswitch_66
    const v5, 0x170cea

    goto :goto_27

    :sswitch_67
    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v5

    const/16 v23, 0x106

    const/16 v26, 0x1

    const/16 v27, 0x22c

    move/from16 v0, v23

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-static {v5, v0, v1, v2}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v23

    const v5, 0x170fb3

    :goto_28
    const v26, 0x170fc4

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_26

    goto :goto_28

    :cond_19
    :sswitch_68
    const v5, 0x170ff1

    goto :goto_28

    :sswitch_69
    const-wide/16 v26, 0x0

    cmp-long v5, v20, v26

    if-lez v5, :cond_19

    const v5, 0x171010

    goto :goto_28

    :sswitch_6a
    const v5, 0x17102f

    :goto_29
    const v26, 0x171040

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_27

    goto :goto_29

    :cond_1a
    :sswitch_6b
    const v5, 0x17106d

    goto :goto_29

    :sswitch_6c
    cmp-long v5, v24, v20

    if-gez v5, :cond_1a

    const v5, 0x17108c

    goto :goto_29

    :sswitch_6d
    const/4 v4, 0x1

    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v26

    const/16 v27, 0x107

    sget v28, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    move/from16 v0, v28

    xor-int/lit16 v0, v0, 0x327

    move/from16 v28, v0

    const/16 v29, 0x4ee

    invoke-static/range {v26 .. v29}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v24

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v24

    const/16 v25, 0x10c

    sget v26, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x1e5

    move/from16 v26, v0

    const/16 v27, 0x7f4

    invoke-static/range {v24 .. v27}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v20

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    const v5, 0x1710ab

    :goto_2a
    const v23, 0x1710bc

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_28

    goto :goto_2a

    :sswitch_6e
    const v5, 0x171355

    goto :goto_2a

    :sswitch_6f
    const v5, 0x1713b2

    :goto_2b
    const v26, 0x1713c3

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_29

    goto :goto_2b

    :cond_1b
    :sswitch_70
    const v5, 0x1713f0

    goto :goto_2b

    :sswitch_71
    const-wide/16 v26, 0x0

    cmp-long v5, v14, v26

    if-lez v5, :cond_1b

    const v5, 0x17140f

    goto :goto_2b

    :sswitch_72
    const v5, 0x17142e

    :goto_2c
    const v26, 0x17143f

    xor-int v5, v5, v26

    sparse-switch v5, :sswitch_data_2a

    goto :goto_2c

    :sswitch_73
    cmp-long v5, v24, v14

    if-lez v5, :cond_1c

    const v5, 0x171716

    goto :goto_2c

    :cond_1c
    :sswitch_74
    const v5, 0x17146c

    goto :goto_2c

    :sswitch_75
    const/4 v4, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v26

    const/16 v27, 0x10f

    sget v28, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v28, v28, 0x7

    const/16 v29, 0x8d4

    invoke-static/range {v26 .. v29}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-wide/from16 v0, v24

    invoke-static {v5, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/DYHook$60;->ۥۢۦۨ()[S

    move-result-object v24

    const/16 v25, 0x114

    sget v26, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, 0x1bc

    move/from16 v26, v0

    const/16 v27, 0x450

    invoke-static/range {v24 .. v27}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v14, v15}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, v23

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    const v5, 0x171735

    :goto_2d
    const v23, 0x171746

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_2b

    goto :goto_2d

    :sswitch_76
    const v5, 0x171754

    goto :goto_2d

    :sswitch_77
    const v5, 0x1717b1

    :goto_2e
    const v23, 0x1717c2

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_2c

    goto :goto_2e

    :sswitch_78
    const v5, 0x1717d0

    goto :goto_2e

    :sswitch_79
    const v5, 0x17182d

    :goto_2f
    const v23, 0x17183e

    xor-int v5, v5, v23

    sparse-switch v5, :sswitch_data_2d

    goto :goto_2f

    :sswitch_7a
    const v5, 0x171ad7

    goto :goto_2f

    :sswitch_7b
    if-eqz v4, :cond_8

    const v5, 0x171b91

    goto/16 :goto_e

    :sswitch_7c
    invoke-static/range {v22 .. v22}, Landroidx/customview/ۤۡۥ;->ۧۤۢۦ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v4, v4, 0x1eb

    add-int v5, v6, v4

    const v4, 0x171bb0

    :goto_30
    const v6, 0x171bc1

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_2e

    goto :goto_30

    :sswitch_7d
    move v6, v5

    goto/16 :goto_5

    :sswitch_7e
    const v4, 0x171bcf

    goto :goto_30

    :sswitch_7f
    if-gtz v5, :cond_2

    const v4, 0x171f90

    goto/16 :goto_3

    :sswitch_80
    const-string v4, "fzJPwOPkAng6Ni1dJZS0"

    invoke-static {v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_1

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
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_3
        0x77 -> :sswitch_7f
        0xd4 -> :sswitch_80
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_b
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_d
        0xb97b -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_10
        0x2d -> :sswitch_14
        0x4c -> :sswitch_12
        0xef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_8
        0x1f7 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_15
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
        0x53 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_18
        0xf1 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1e -> :sswitch_f
        0x7f -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x1f1 -> :sswitch_1c
        0x6af -> :sswitch_1d
        0x6c8 -> :sswitch_25
        0x6e9 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x13 -> :sswitch_1f
        0x2d -> :sswitch_25
        0x32 -> :sswitch_20
        0x4c -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x12 -> :sswitch_22
        0xf3 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x16 -> :sswitch_23
        0x37 -> :sswitch_18
        0x71 -> :sswitch_7b
        0xd4 -> :sswitch_7c
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x11 -> :sswitch_26
        0x36 -> :sswitch_27
        0x57 -> :sswitch_2d
        0x74 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_29
        0x11 -> :sswitch_2a
        0x2f -> :sswitch_2d
        0x4c -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0xf1 -> :sswitch_2c
        0x7ab -> :sswitch_22
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x17 -> :sswitch_2e
        0x36 -> :sswitch_2f
        0x55 -> :sswitch_35
        0x74 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0xe -> :sswitch_31
        0x2d -> :sswitch_35
        0x3ef -> :sswitch_32
        0x1ef7 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x11 -> :sswitch_34
        0x32 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_36
        0x32 -> :sswitch_37
        0x4c -> :sswitch_38
        0x53 -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x3f1 -> :sswitch_39
        0x6a7 -> :sswitch_3a
        0x6c8 -> :sswitch_3d
        0x6e9 -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x13 -> :sswitch_3c
        0x32 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x13 -> :sswitch_3e
        0x2d -> :sswitch_45
        0x32 -> :sswitch_3f
        0xdfb -> :sswitch_40
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x11 -> :sswitch_41
        0x3e -> :sswitch_42
        0x5f -> :sswitch_45
        0x7c -> :sswitch_43
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x11 -> :sswitch_44
        0x36 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x11 -> :sswitch_46
        0x5bb -> :sswitch_47
        0x5d8 -> :sswitch_61
        0x5f9 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_49
        0x3e -> :sswitch_4a
        0x5d -> :sswitch_5f
        0x7c -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_4c
        0x36 -> :sswitch_4d
        0x55 -> :sswitch_55
        0x17dd84 -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0xe -> :sswitch_4f
        0x2d -> :sswitch_53
        0x6f -> :sswitch_50
        0x1cc -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x17 -> :sswitch_52
        0x76 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x1f -> :sswitch_54
        0x5e9 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x11 -> :sswitch_56
        0x53 -> :sswitch_5d
        0x72 -> :sswitch_57
        0x1b4 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x11 -> :sswitch_59
        0x53 -> :sswitch_5d
        0x72 -> :sswitch_5a
        0xd29 -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x12 -> :sswitch_22
        0x73 -> :sswitch_5c
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x13 -> :sswitch_5e
        0x72 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x13 -> :sswitch_60
        0x2e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_62
        0x2f -> :sswitch_22
        0x71 -> :sswitch_63
        0xcc -> :sswitch_64
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x11 -> :sswitch_65
        0x57 -> :sswitch_79
        0x76 -> :sswitch_66
        0x329 -> :sswitch_67
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x16 -> :sswitch_68
        0x35 -> :sswitch_6f
        0x77 -> :sswitch_69
        0x1fd4 -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0xe -> :sswitch_6b
        0x2d -> :sswitch_6f
        0x6f -> :sswitch_6c
        0xcc -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x17 -> :sswitch_6e
        0x3e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_70
        0x33 -> :sswitch_77
        0x71 -> :sswitch_71
        0x7cc -> :sswitch_72
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x11 -> :sswitch_73
        0x53 -> :sswitch_77
        0x72 -> :sswitch_74
        0x329 -> :sswitch_75
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x12 -> :sswitch_22
        0x73 -> :sswitch_76
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x12 -> :sswitch_22
        0x73 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0x13 -> :sswitch_7a
        0x2e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0xe -> :sswitch_7d
        0x71 -> :sswitch_7e
    .end sparse-switch
.end method
