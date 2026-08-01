.class public Lkevin/fun/hook/RegionMapping;
.super Ljava/lang/Object;


# static fields
.field public static final CITY_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final REGION_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0xb5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/RegionMapping;->short:[S

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/4 v2, 0x0

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x31d

    const/16 v4, 0x867

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/4 v2, 0x2

    sget v3, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1ea

    const/16 v4, 0xc78

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/4 v3, 0x4

    sget v4, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v4, v4, 0x0

    const/16 v5, 0x565

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/4 v2, 0x6

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x68

    const/16 v4, 0x5c0

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x8

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x169

    const/16 v5, 0x475

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xa

    sget v3, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v3, v3, 0x176

    const/16 v4, 0x7ee

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0xc

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x176

    const/16 v5, 0x8b7

    invoke-static {v2, v3, v4, v5}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xe

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v3, v3, -0x3bd

    const/16 v4, 0x942

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x10

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x77

    const/16 v5, 0xa99

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x13

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x251

    const/16 v4, 0x32c

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x15

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x170

    const/16 v5, 0x869

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x19

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v3, v3, -0x10b

    const/16 v4, 0xa16

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x1b

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3bb

    const/16 v5, 0x20a

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x1d

    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v3, v3, 0x70

    const/16 v4, 0x9ab

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x1f

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10e

    const/16 v5, 0x2e7

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x24

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xef

    const/16 v4, 0x957

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x26

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x61

    const/16 v5, 0xc31

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x28

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x49

    const/16 v4, 0x2c2

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x2a

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x321

    const/16 v5, 0x9cb

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x2c

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x68

    const/16 v4, 0x9b5

    invoke-static {v1, v2, v3, v4}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x2e

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x124

    const/16 v5, 0xb39

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x30

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x22c

    const/16 v4, 0x6b0

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x32

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x11c

    const/16 v5, 0x1f3

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x34

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x15d

    const/16 v4, 0x566

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x36

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x321

    const/16 v5, 0x1b7

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x38

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3c2

    const/16 v4, 0x69f

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x3a

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x37

    const/16 v5, 0x925

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x3d

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x21e

    const/16 v4, 0x39f

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x3f

    sget v4, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v4, v4, 0x336

    const/16 v5, 0x988

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x42

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x11

    const/16 v4, 0x4ed

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x44

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x21c

    const/16 v5, 0x4fe

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x48

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x11

    const/16 v4, 0xc45

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x4a

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10d

    const/16 v5, 0x6ad

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x4e

    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v3, v3, -0x3c5

    const/16 v4, 0x5cf

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x50

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x16f

    const/16 v5, 0xc10

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x54

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x286

    const/16 v4, 0x1a6

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x56

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1e4

    const/16 v5, 0xa3d

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x5a

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v3, v3, -0x10b

    const/16 v4, 0x165

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x5c

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x32

    const/16 v5, 0x924

    invoke-static {v2, v3, v4, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x60

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xef

    const/16 v4, 0x850

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x62

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x16

    const/16 v5, 0xbc2

    invoke-static {v2, v3, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x67

    sget v3, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v3, v3, 0x1bd

    const/16 v4, 0x1af

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x69

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xe2

    const/16 v5, 0x85b

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x6c

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x20c

    const/16 v4, 0x1d7

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x6e

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x37

    const/16 v5, 0x43c

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x71

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x337

    const/16 v4, 0xbec

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x73

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x38

    const/16 v5, 0x6ac

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x76

    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v3, v3, 0x380

    const/16 v4, 0x2e3

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x78

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x7a

    const/16 v5, 0x4e1

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x7b

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x15d

    const/16 v4, 0x519

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x7d

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x8f

    const/16 v5, 0x8dd

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x80

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v3, v3, -0x1c7

    const/16 v4, 0x9ed

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x82

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1bd

    const/16 v5, 0x3b4

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x84

    sget v3, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v3, v3, -0x321

    const/16 v4, 0x435

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x86

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x11

    const/16 v5, 0x763

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x88

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1bd

    const/16 v5, 0xbaf

    invoke-static {v1, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x8a

    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v3, v3, 0x380

    const/16 v4, 0x55a

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x8c

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc1

    const/16 v5, 0xb18

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x8e

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x6d

    const/16 v4, 0x445

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x90

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xe1

    const/16 v5, 0x438

    invoke-static {v2, v3, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x92

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x164

    const/16 v4, 0x6f4

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x94

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x15c

    const/16 v5, 0x872

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x97

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v3, -0x3c2

    const/16 v4, 0x6e1

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x99

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x125

    const/16 v5, 0x254

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0x9c

    sget v3, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v3, v3, -0x1e6

    const/16 v4, 0x6cb

    invoke-static {v1, v2, v3, v4}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0x9e

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc0

    const/16 v5, 0x57e

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xa1

    sget v3, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v3, v3, 0x10e

    const/16 v4, 0x99b

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0xa3

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x176

    const/16 v5, 0x228

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xa5

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x25c

    const/16 v4, 0xa04

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0xa7

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x15c

    const/16 v5, 0x4aa

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xaa

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xf1

    const/16 v4, 0x855

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0xac

    sget v4, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v4, v4, -0x12

    const/16 v5, 0x97f

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xae

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xf1

    const/16 v4, 0x3a3

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v3, 0xb0

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3a3

    const/16 v5, 0x14d

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/RegionMapping;->short:[S

    const/16 v2, 0xb3

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x50

    const/16 v4, 0xa42

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u745e\u5178"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "NO"

    const-string v2, "\u632a\u5a01"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "DK"

    const-string v2, "\u4e39\u9ea6"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "FI"

    const-string v2, "\u82ac\u5170"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "GR"

    const-string v2, "\u5e0c\u814a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "EC"

    const-string v2, "\u5384\u74dc\u591a\u5c14"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "RU"

    const-string v2, "\u4fc4\u7f57\u65af"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "BY"

    const-string v2, "\u767d\u7f57\u65af"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "PL"

    const-string v2, "\u6ce2\u5170"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "RO"

    const-string v2, "\u7f57\u9a6c\u5c3c\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "HU"

    const-string v2, "\u5308\u7259\u5229"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CA"

    const-string v2, "\u52a0\u62ff\u5927"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "BR"

    const-string v2, "\u5df4\u897f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "AR"

    const-string v2, "\u963f\u6839\u5ef7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "MX"

    const-string v2, "\u58a8\u897f\u54e5"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CO"

    const-string v2, "\u54e5\u4f26\u6bd4\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "PE"

    const-string v2, "\u79d8\u9c81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "GN"

    const-string v2, "\u51e0\u5185\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CL"

    const-string v2, "\u667a\u5229"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "VE"

    const-string v2, "\u59d4\u5185\u745e\u62c9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CU"

    const-string v2, "\u53e4\u5df4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "AU"

    const-string v2, "\u6fb3\u5927\u5229\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "NZ"

    const-string v2, "\u65b0\u897f\u5170"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "KG"

    const-string v2, "\u5409\u5c14\u5409\u65af\u65af\u5766"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "GT"

    const-string v2, "\u5371\u5730\u9a6c\u62c9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "PG"

    const-string v2, "\u5df4\u5e03\u4e9a\u65b0\u51e0\u5185\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "ZA"

    const-string v2, "\u5357\u975e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "NG"

    const-string v2, "\u5c3c\u65e5\u5229\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "TZ"

    const-string v2, "\u5766\u6851\u5c3c\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CV"

    const-string v2, "\u4f5b\u5f97\u89d2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "KZ"

    const-string v2, "\u54c8\u8428\u514b\u65af\u5766"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "EG"

    const-string v2, "\u57c3\u53ca"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "KE"

    const-string v2, "\u80af\u5c3c\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "GH"

    const-string v2, "\u52a0\u7eb3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "UG"

    const-string v2, "\u4e4c\u5e72\u8fbe"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "ZM"

    const-string v2, "\u8d5e\u6bd4\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "CD"

    const-string v2, "\u521a\u679c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "ZW"

    const-string v2, "\u6d25\u5df4\u5e03\u97e6"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->REGION_MAP:Ljava/util/Map;

    const-string v1, "HR"

    const-string v2, "\u514b\u7f57\u5730\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "110000"

    const-string v2, "\u5317\u4eac\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "120000"

    const-string v2, "\u5929\u6d25\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130000"

    const-string v2, "\u6cb3\u5317\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140000"

    const-string v2, "\u5c71\u897f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150000"

    const-string v2, "\u5185\u8499\u53e4\u81ea\u6cbb\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210000"

    const-string v2, "\u8fbd\u5b81\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220000"

    const-string v2, "\u5409\u6797\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230000"

    const-string v2, "\u9ed1\u9f99\u6c5f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "310000"

    const-string v2, "\u4e0a\u6d77\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320000"

    const-string v2, "\u6c5f\u82cf\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330000"

    const-string v2, "\u6d59\u6c5f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340000"

    const-string v2, "\u5b89\u5fbd\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350000"

    const-string v2, "\u798f\u5efa\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360000"

    const-string v2, "\u6c5f\u897f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370000"

    const-string v2, "\u5c71\u4e1c\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410000"

    const-string v2, "\u6cb3\u5357\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420000"

    const-string v2, "\u6e56\u5317\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430000"

    const-string v2, "\u6e56\u5357\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440000"

    const-string v2, "\u5e7f\u4e1c\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450000"

    const-string v2, "\u5e7f\u897f\u58ee\u65cf\u81ea\u6cbb\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "460000"

    const-string v2, "\u6d77\u5357\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500000"

    const-string v2, "\u91cd\u5e86\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510000"

    const-string v2, "\u56db\u5ddd\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520000"

    const-string v2, "\u8d35\u5dde\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530000"

    const-string v2, "\u4e91\u5357\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540000"

    const-string v2, "\u897f\u85cf\u81ea\u6cbb\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610000"

    const-string v2, "\u9655\u897f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620000"

    const-string v2, "\u7518\u8083\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "630000"

    const-string v2, "\u9752\u6d77\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640000"

    const-string v2, "\u5b81\u590f\u56de\u65cf\u81ea\u6cbb\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710000"

    const-string v2, "\u53f0\u6e7e\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "810000"

    const-string v2, "\u9999\u6e2f\u7279\u522b\u884c\u653f\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "820000"

    const-string v2, "\u6fb3\u95e8\u7279\u522b\u884c\u653f\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500200"

    const-string v2, "\u91cd\u5e86\u4e07\u5dde\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710101"

    const-string v2, "\u53f0\u6e7e\u53f0\u5317\u5e02\u4e2d\u6b63\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "110100"

    const-string v2, "\u5317\u4eac"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "120100"

    const-string v2, "\u5929\u6d25"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "310100"

    const-string v2, "\u4e0a\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500100"

    const-string v2, "\u91cd\u5e86"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130100"

    const-string v2, "\u6cb3\u5317\u77f3\u5bb6\u5e84"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130200"

    const-string v2, "\u6cb3\u5317\u5510\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130300"

    const-string v2, "\u6cb3\u5317\u79e6\u7687\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130400"

    const-string v2, "\u6cb3\u5317\u90af\u90f8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130500"

    const-string v2, "\u6cb3\u5317\u90a2\u53f0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130600"

    const-string v2, "\u6cb3\u5317\u4fdd\u5b9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130700"

    const-string v2, "\u6cb3\u5317\u5f20\u5bb6\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130800"

    const-string v2, "\u6cb3\u5317\u627f\u5fb7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "130900"

    const-string v2, "\u6cb3\u5317\u6ca7\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "131000"

    const-string v2, "\u6cb3\u5317\u5eca\u574a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "131100"

    const-string v2, "\u6cb3\u5317\u8861\u6c34"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140100"

    const-string v2, "\u5c71\u897f\u592a\u539f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140200"

    const-string v2, "\u5c71\u897f\u5927\u540c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140300"

    const-string v2, "\u5c71\u897f\u9633\u6cc9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140400"

    const-string v2, "\u5c71\u897f\u957f\u6cbb"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140500"

    const-string v2, "\u5c71\u897f\u664b\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140600"

    const-string v2, "\u5c71\u897f\u6714\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140700"

    const-string v2, "\u5c71\u897f\u664b\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140800"

    const-string v2, "\u5c71\u897f\u8fd0\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "140900"

    const-string v2, "\u5c71\u897f\u5ffb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "141000"

    const-string v2, "\u5c71\u897f\u4e34\u6c7e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "141100"

    const-string v2, "\u5c71\u897f\u5415\u6881"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150100"

    const-string v2, "\u5185\u8499\u53e4\u547c\u548c\u6d69\u7279"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150200"

    const-string v2, "\u5185\u8499\u53e4\u5305\u5934"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150300"

    const-string v2, "\u5185\u8499\u53e4\u4e4c\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150400"

    const-string v2, "\u5185\u8499\u53e4\u8d64\u5cf0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150500"

    const-string v2, "\u5185\u8499\u53e4\u901a\u8fbd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150600"

    const-string v2, "\u5185\u8499\u53e4\u9102\u5c14\u591a\u65af"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150700"

    const-string v2, "\u5185\u8499\u53e4\u547c\u4f26\u8d1d\u5c14"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150800"

    const-string v2, "\u5185\u8499\u53e4\u5df4\u5f66\u6dd6\u5c14"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "150900"

    const-string v2, "\u5185\u8499\u53e4\u4e4c\u5170\u5bdf\u5e03"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "152200"

    const-string v2, "\u5185\u8499\u53e4\u5174\u5b89\u76df"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "152500"

    const-string v2, "\u5185\u8499\u53e4\u9521\u6797\u90ed\u52d2\u76df"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "152900"

    const-string v2, "\u5185\u8499\u53e4\u963f\u62c9\u5584\u76df"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210100"

    const-string v2, "\u8fbd\u5b81\u6c88\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210200"

    const-string v2, "\u8fbd\u5b81\u5927\u8fde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210300"

    const-string v2, "\u8fbd\u5b81\u978d\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210400"

    const-string v2, "\u8fbd\u5b81\u629a\u987a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210500"

    const-string v2, "\u8fbd\u5b81\u672c\u6eaa"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210600"

    const-string v2, "\u8fbd\u5b81\u4e39\u4e1c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210700"

    const-string v2, "\u8fbd\u5b81\u9526\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210800"

    const-string v2, "\u8fbd\u5b81\u8425\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "210900"

    const-string v2, "\u8fbd\u5b81\u961c\u65b0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "211000"

    const-string v2, "\u8fbd\u5b81\u8fbd\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "211100"

    const-string v2, "\u8fbd\u5b81\u76d8\u9526"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "211200"

    const-string v2, "\u8fbd\u5b81\u94c1\u5cad"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "211300"

    const-string v2, "\u8fbd\u5b81\u671d\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "211400"

    const-string v2, "\u8fbd\u5b81\u846b\u82a6\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220100"

    const-string v2, "\u5409\u6797\u957f\u6625"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220200"

    const-string v2, "\u5409\u6797\u5409\u6797"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220300"

    const-string v2, "\u5409\u6797\u56db\u5e73"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220400"

    const-string v2, "\u5409\u6797\u8fbd\u6e90"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220500"

    const-string v2, "\u5409\u6797\u901a\u5316"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220600"

    const-string v2, "\u5409\u6797\u767d\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220700"

    const-string v2, "\u5409\u6797\u677e\u539f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "220800"

    const-string v2, "\u5409\u6797\u767d\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "222400"

    const-string v2, "\u5409\u6797\u5ef6\u8fb9\u671d\u9c9c\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230100"

    const-string v2, "\u9ed1\u9f99\u6c5f\u54c8\u5c14\u6ee8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230200"

    const-string v2, "\u9ed1\u9f99\u6c5f\u9f50\u9f50\u54c8\u5c14"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230300"

    const-string v2, "\u9ed1\u9f99\u6c5f\u9e21\u897f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230400"

    const-string v2, "\u9ed1\u9f99\u6c5f\u9e64\u5c97"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230500"

    const-string v2, "\u9ed1\u9f99\u6c5f\u53cc\u9e2d\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230600"

    const-string v2, "\u9ed1\u9f99\u6c5f\u5927\u5e86"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230700"

    const-string v2, "\u9ed1\u9f99\u6c5f\u4f0a\u6625"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230800"

    const-string v2, "\u9ed1\u9f99\u6c5f\u4f73\u6728\u65af"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "230900"

    const-string v2, "\u9ed1\u9f99\u6c5f\u4e03\u53f0\u6cb3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "231000"

    const-string v2, "\u9ed1\u9f99\u6c5f\u7261\u4e39\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "231100"

    const-string v2, "\u9ed1\u9f99\u6c5f\u9ed1\u6cb3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "231200"

    const-string v2, "\u9ed1\u9f99\u6c5f\u7ee5\u5316"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "232700"

    const-string v2, "\u9ed1\u9f99\u6c5f\u5927\u5174\u5b89\u5cad\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320100"

    const-string v2, "\u6c5f\u82cf\u5357\u4eac"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320200"

    const-string v2, "\u6c5f\u82cf\u65e0\u9521"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320300"

    const-string v2, "\u6c5f\u82cf\u5f90\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320400"

    const-string v2, "\u6c5f\u82cf\u5e38\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320500"

    const-string v2, "\u6c5f\u82cf\u82cf\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320600"

    const-string v2, "\u6c5f\u82cf\u5357\u901a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320700"

    const-string v2, "\u6c5f\u82cf\u8fde\u4e91\u6e2f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320800"

    const-string v2, "\u6c5f\u82cf\u6dee\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320900"

    const-string v2, "\u6c5f\u82cf\u76d0\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "321000"

    const-string v2, "\u6c5f\u82cf\u626c\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "321100"

    const-string v2, "\u6c5f\u82cf\u9547\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "321200"

    const-string v2, "\u6c5f\u82cf\u6cf0\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "321300"

    const-string v2, "\u6c5f\u82cf\u5bbf\u8fc1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330100"

    const-string v2, "\u6d59\u6c5f\u676d\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330200"

    const-string v2, "\u6d59\u6c5f\u5b81\u6ce2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330300"

    const-string v2, "\u6d59\u6c5f\u6e29\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330400"

    const-string v2, "\u6d59\u6c5f\u5609\u5174"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330500"

    const-string v2, "\u6d59\u6c5f\u6e56\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330600"

    const-string v2, "\u6d59\u6c5f\u7ecd\u5174"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330700"

    const-string v2, "\u6d59\u6c5f\u91d1\u534e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330800"

    const-string v2, "\u6d59\u6c5f\u8862\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330900"

    const-string v2, "\u6d59\u6c5f\u821f\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "331000"

    const-string v2, "\u6d59\u6c5f\u53f0\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "331100"

    const-string v2, "\u6d59\u6c5f\u4e3d\u6c34"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340100"

    const-string v2, "\u5b89\u5fbd\u5408\u80a5"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340200"

    const-string v2, "\u5b89\u5fbd\u829c\u6e56"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340300"

    const-string v2, "\u5b89\u5fbd\u868c\u57e0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340400"

    const-string v2, "\u5b89\u5fbd\u6dee\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340500"

    const-string v2, "\u5b89\u5fbd\u9a6c\u978d\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340600"

    const-string v2, "\u5b89\u5fbd\u6dee\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340700"

    const-string v2, "\u5b89\u5fbd\u94dc\u9675"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340800"

    const-string v2, "\u5b89\u5fbd\u5b89\u5e86"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341000"

    const-string v2, "\u5b89\u5fbd\u9ec4\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341100"

    const-string v2, "\u5b89\u5fbd\u6ec1\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341200"

    const-string v2, "\u5b89\u5fbd\u961c\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341300"

    const-string v2, "\u5b89\u5fbd\u5bbf\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341500"

    const-string v2, "\u5b89\u5fbd\u516d\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341600"

    const-string v2, "\u5b89\u5fbd\u4eb3\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341700"

    const-string v2, "\u5b89\u5fbd\u6c60\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341800"

    const-string v2, "\u5b89\u5fbd\u5ba3\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350100"

    const-string v2, "\u798f\u5efa\u798f\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350200"

    const-string v2, "\u798f\u5efa\u53a6\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350300"

    const-string v2, "\u798f\u5efa\u8386\u7530"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350400"

    const-string v2, "\u798f\u5efa\u4e09\u660e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350500"

    const-string v2, "\u798f\u5efa\u6cc9\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350600"

    const-string v2, "\u798f\u5efa\u6f33\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350700"

    const-string v2, "\u798f\u5efa\u5357\u5e73"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350800"

    const-string v2, "\u798f\u5efa\u9f99\u5ca9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "350900"

    const-string v2, "\u798f\u5efa\u5b81\u5fb7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360100"

    const-string v2, "\u6c5f\u897f\u5357\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360200"

    const-string v2, "\u6c5f\u897f\u666f\u5fb7\u9547"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360300"

    const-string v2, "\u6c5f\u897f\u840d\u4e61"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360400"

    const-string v2, "\u6c5f\u897f\u4e5d\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360500"

    const-string v2, "\u6c5f\u897f\u65b0\u4f59"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360600"

    const-string v2, "\u6c5f\u897f\u9e70\u6f6d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360700"

    const-string v2, "\u6c5f\u897f\u8d63\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360800"

    const-string v2, "\u6c5f\u897f\u5409\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "360900"

    const-string v2, "\u6c5f\u897f\u5b9c\u6625"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "361000"

    const-string v2, "\u6c5f\u897f\u629a\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "361100"

    const-string v2, "\u6c5f\u897f\u4e0a\u9976"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370100"

    const-string v2, "\u5c71\u4e1c\u6d4e\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370200"

    const-string v2, "\u5c71\u4e1c\u9752\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370300"

    const-string v2, "\u5c71\u4e1c\u6dc4\u535a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370400"

    const-string v2, "\u5c71\u4e1c\u67a3\u5e84"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370500"

    const-string v2, "\u5c71\u4e1c\u4e1c\u8425"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370600"

    const-string v2, "\u5c71\u4e1c\u70df\u53f0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370700"

    const-string v2, "\u5c71\u4e1c\u6f4d\u574a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370800"

    const-string v2, "\u5c71\u4e1c\u6d4e\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "370900"

    const-string v2, "\u5c71\u4e1c\u6cf0\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371000"

    const-string v2, "\u5c71\u4e1c\u5a01\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371100"

    const-string v2, "\u5c71\u4e1c\u65e5\u7167"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371300"

    const-string v2, "\u5c71\u4e1c\u4e34\u6c82"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371400"

    const-string v2, "\u5c71\u4e1c\u5fb7\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371500"

    const-string v2, "\u5c71\u4e1c\u804a\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371600"

    const-string v2, "\u5c71\u4e1c\u6ee8\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371700"

    const-string v2, "\u5c71\u4e1c\u83cf\u6cfd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410100"

    const-string v2, "\u6cb3\u5357\u90d1\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410200"

    const-string v2, "\u6cb3\u5357\u5f00\u5c01"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410300"

    const-string v2, "\u6cb3\u5357\u6d1b\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410400"

    const-string v2, "\u6cb3\u5357\u5e73\u9876\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410500"

    const-string v2, "\u6cb3\u5357\u5b89\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410600"

    const-string v2, "\u6cb3\u5357\u9e64\u58c1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410700"

    const-string v2, "\u6cb3\u5357\u65b0\u4e61"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410800"

    const-string v2, "\u6cb3\u5357\u7126\u4f5c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "410900"

    const-string v2, "\u6cb3\u5357\u6fee\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411000"

    const-string v2, "\u6cb3\u5357\u8bb8\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411100"

    const-string v2, "\u6cb3\u5357\u6f2f\u6cb3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411200"

    const-string v2, "\u6cb3\u5357\u4e09\u95e8\u5ce1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411300"

    const-string v2, "\u6cb3\u5357\u5357\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411400"

    const-string v2, "\u6cb3\u5357\u5546\u4e18"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411500"

    const-string v2, "\u6cb3\u5357\u4fe1\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411600"

    const-string v2, "\u6cb3\u5357\u5468\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "411700"

    const-string v2, "\u6cb3\u5357\u9a7b\u9a6c\u5e97"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "419001"

    const-string v2, "\u6cb3\u5357\u6d4e\u6e90"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420100"

    const-string v2, "\u6e56\u5317\u6b66\u6c49"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420200"

    const-string v2, "\u6e56\u5317\u9ec4\u77f3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420300"

    const-string v2, "\u6e56\u5317\u5341\u5830"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420500"

    const-string v2, "\u6e56\u5317\u5b9c\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420600"

    const-string v2, "\u6e56\u5317\u8944\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420700"

    const-string v2, "\u6e56\u5317\u9102\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420800"

    const-string v2, "\u6e56\u5317\u8346\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420900"

    const-string v2, "\u6e56\u5317\u5b5d\u611f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "421000"

    const-string v2, "\u6e56\u5317\u8346\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "421100"

    const-string v2, "\u6e56\u5317\u9ec4\u5188"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "421200"

    const-string v2, "\u6e56\u5317\u54b8\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "421300"

    const-string v2, "\u6e56\u5317\u968f\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "422800"

    const-string v2, "\u6e56\u5317\u6069\u65bd\u571f\u5bb6\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "429004"

    const-string v2, "\u6e56\u5317\u4ed9\u6843"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "429005"

    const-string v2, "\u6e56\u5317\u6f5c\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "429006"

    const-string v2, "\u6e56\u5317\u5929\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "429021"

    const-string v2, "\u6e56\u5317\u795e\u519c\u67b6\u6797\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430100"

    const-string v2, "\u6e56\u5357\u957f\u6c99"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430200"

    const-string v2, "\u6e56\u5357\u682a\u6d32"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430300"

    const-string v2, "\u6e56\u5357\u6e58\u6f6d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430400"

    const-string v2, "\u6e56\u5357\u8861\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430500"

    const-string v2, "\u6e56\u5357\u90b5\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430600"

    const-string v2, "\u6e56\u5357\u5cb3\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430700"

    const-string v2, "\u6e56\u5357\u5e38\u5fb7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430800"

    const-string v2, "\u6e56\u5357\u5f20\u5bb6\u754c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430900"

    const-string v2, "\u6e56\u5357\u76ca\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "431000"

    const-string v2, "\u6e56\u5357\u90f4\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "431100"

    const-string v2, "\u6e56\u5357\u6c38\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "431200"

    const-string v2, "\u6e56\u5357\u6000\u5316"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "431300"

    const-string v2, "\u6e56\u5357\u5a04\u5e95"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "433100"

    const-string v2, "\u6e56\u5357\u6e58\u897f\u571f\u5bb6\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440100"

    const-string v2, "\u5e7f\u4e1c\u5e7f\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440200"

    const-string v2, "\u5e7f\u4e1c\u97f6\u5173"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440300"

    const-string v2, "\u5e7f\u4e1c\u6df1\u5733"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440400"

    const-string v2, "\u5e7f\u4e1c\u73e0\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440500"

    const-string v2, "\u5e7f\u4e1c\u6c55\u5934"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440600"

    const-string v2, "\u5e7f\u4e1c\u4f5b\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440700"

    const-string v2, "\u5e7f\u4e1c\u6c5f\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440800"

    const-string v2, "\u5e7f\u4e1c\u6e5b\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440900"

    const-string v2, "\u5e7f\u4e1c\u8302\u540d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441200"

    const-string v2, "\u5e7f\u4e1c\u8087\u5e86"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441300"

    const-string v2, "\u5e7f\u4e1c\u60e0\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441400"

    const-string v2, "\u5e7f\u4e1c\u6885\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441500"

    const-string v2, "\u5e7f\u4e1c\u6c55\u5c3e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441600"

    const-string v2, "\u5e7f\u4e1c\u6cb3\u6e90"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441700"

    const-string v2, "\u5e7f\u4e1c\u9633\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441800"

    const-string v2, "\u5e7f\u4e1c\u6e05\u8fdc"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "441900"

    const-string v2, "\u5e7f\u4e1c\u4e1c\u839e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "442000"

    const-string v2, "\u5e7f\u4e1c\u4e2d\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "445100"

    const-string v2, "\u5e7f\u4e1c\u6f6e\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "445200"

    const-string v2, "\u5e7f\u4e1c\u63ed\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "445300"

    const-string v2, "\u5e7f\u4e1c\u4e91\u6d6e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450100"

    const-string v2, "\u5e7f\u897f\u5357\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450200"

    const-string v2, "\u5e7f\u897f\u67f3\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450300"

    const-string v2, "\u5e7f\u897f\u6842\u6797"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450400"

    const-string v2, "\u5e7f\u897f\u68a7\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450500"

    const-string v2, "\u5e7f\u897f\u5317\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450600"

    const-string v2, "\u5e7f\u897f\u9632\u57ce\u6e2f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450700"

    const-string v2, "\u5e7f\u897f\u94a6\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450800"

    const-string v2, "\u5e7f\u897f\u8d35\u6e2f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "450900"

    const-string v2, "\u5e7f\u897f\u7389\u6797"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "451000"

    const-string v2, "\u5e7f\u897f\u767e\u8272"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "451100"

    const-string v2, "\u5e7f\u897f\u8d3a\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "451200"

    const-string v2, "\u5e7f\u897f\u6cb3\u6c60"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "451300"

    const-string v2, "\u5e7f\u897f\u6765\u5bbe"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "451400"

    const-string v2, "\u5e7f\u897f\u5d07\u5de6"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "460100"

    const-string v2, "\u6d77\u5357\u6d77\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "460200"

    const-string v2, "\u6d77\u5357\u4e09\u4e9a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "460300"

    const-string v2, "\u6d77\u5357\u4e09\u6c99"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "460400"

    const-string v2, "\u6d77\u5357\u510b\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469001"

    const-string v2, "\u6d77\u5357\u4e94\u6307\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469002"

    const-string v2, "\u6d77\u5357\u743c\u6d77"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469003"

    const-string v2, "\u6d77\u5357\u6587\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469005"

    const-string v2, "\u6d77\u5357\u4e07\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469006"

    const-string v2, "\u6d77\u5357\u4e1c\u65b9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469021"

    const-string v2, "\u6d77\u5357\u5b9a\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469022"

    const-string v2, "\u6d77\u5357\u5c6f\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469023"

    const-string v2, "\u6d77\u5357\u6f84\u8fc8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469024"

    const-string v2, "\u6d77\u5357\u4e34\u9ad8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469025"

    const-string v2, "\u6d77\u5357\u767d\u6c99"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469026"

    const-string v2, "\u6d77\u5357\u660c\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469027"

    const-string v2, "\u6d77\u5357\u4e50\u4e1c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469028"

    const-string v2, "\u6d77\u5357\u9675\u6c34"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469029"

    const-string v2, "\u6d77\u5357\u4fdd\u4ead"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "469030"

    const-string v2, "\u6d77\u5357\u743c\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500101"

    const-string v2, "\u91cd\u5e86\u4e07\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500102"

    const-string v2, "\u91cd\u5e86\u6daa\u9675"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500103"

    const-string v2, "\u91cd\u5e86\u6e1d\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500104"

    const-string v2, "\u91cd\u5e86\u5927\u6e21\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500105"

    const-string v2, "\u91cd\u5e86\u6c5f\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500106"

    const-string v2, "\u91cd\u5e86\u6c99\u576a\u575d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500107"

    const-string v2, "\u91cd\u5e86\u4e5d\u9f99\u5761"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500108"

    const-string v2, "\u91cd\u5e86\u5357\u5cb8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500109"

    const-string v2, "\u91cd\u5e86\u5317\u789a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500110"

    const-string v2, "\u91cd\u5e86\u7da6\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500111"

    const-string v2, "\u91cd\u5e86\u5927\u8db3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500112"

    const-string v2, "\u91cd\u5e86\u6e1d\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500113"

    const-string v2, "\u91cd\u5e86\u5df4\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500114"

    const-string v2, "\u91cd\u5e86\u9ed4\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500115"

    const-string v2, "\u91cd\u5e86\u957f\u5bff"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500116"

    const-string v2, "\u91cd\u5e86\u6c5f\u6d25"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500117"

    const-string v2, "\u91cd\u5e86\u5408\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500118"

    const-string v2, "\u91cd\u5e86\u6c38\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "500119"

    const-string v2, "\u91cd\u5e86\u5357\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510100"

    const-string v2, "\u56db\u5ddd\u6210\u90fd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510300"

    const-string v2, "\u56db\u5ddd\u81ea\u8d21"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510400"

    const-string v2, "\u56db\u5ddd\u6500\u679d\u82b1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510500"

    const-string v2, "\u56db\u5ddd\u6cf8\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510600"

    const-string v2, "\u56db\u5ddd\u5fb7\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510700"

    const-string v2, "\u56db\u5ddd\u7ef5\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510800"

    const-string v2, "\u56db\u5ddd\u5e7f\u5143"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "510900"

    const-string v2, "\u56db\u5ddd\u9042\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511000"

    const-string v2, "\u56db\u5ddd\u5185\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511100"

    const-string v2, "\u56db\u5ddd\u4e50\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511300"

    const-string v2, "\u56db\u5ddd\u5357\u5145"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511400"

    const-string v2, "\u56db\u5ddd\u7709\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511500"

    const-string v2, "\u56db\u5ddd\u5b9c\u5bbe"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511600"

    const-string v2, "\u56db\u5ddd\u5e7f\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511700"

    const-string v2, "\u56db\u5ddd\u8fbe\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511800"

    const-string v2, "\u56db\u5ddd\u96c5\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511900"

    const-string v2, "\u56db\u5ddd\u5df4\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "512000"

    const-string v2, "\u56db\u5ddd\u8d44\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "513200"

    const-string v2, "\u56db\u5ddd\u963f\u575d\u85cf\u65cf\u7f8c\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "513300"

    const-string v2, "\u56db\u5ddd\u7518\u5b5c\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "513400"

    const-string v2, "\u56db\u5ddd\u51c9\u5c71\u5f5d\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520100"

    const-string v2, "\u8d35\u5dde\u8d35\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520200"

    const-string v2, "\u8d35\u5dde\u516d\u76d8\u6c34"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520300"

    const-string v2, "\u8d35\u5dde\u9075\u4e49"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520400"

    const-string v2, "\u8d35\u5dde\u5b89\u987a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520500"

    const-string v2, "\u8d35\u5dde\u6bd5\u8282"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "520600"

    const-string v2, "\u8d35\u5dde\u94dc\u4ec1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "522200"

    const-string v2, "\u8d35\u5dde\u94dc\u4ec1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "522300"

    const-string v2, "\u8d35\u5dde\u9ed4\u897f\u5357\u5e03\u4f9d\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "522600"

    const-string v2, "\u8d35\u5dde\u9ed4\u4e1c\u5357\u82d7\u65cf\u4f97\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "522700"

    const-string v2, "\u8d35\u5dde\u9ed4\u5357\u5e03\u4f9d\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530100"

    const-string v2, "\u4e91\u5357\u6606\u660e"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530300"

    const-string v2, "\u4e91\u5357\u66f2\u9756"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530400"

    const-string v2, "\u4e91\u5357\u7389\u6eaa"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530500"

    const-string v2, "\u4e91\u5357\u4fdd\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530600"

    const-string v2, "\u4e91\u5357\u662d\u901a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530700"

    const-string v2, "\u4e91\u5357\u4e3d\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530800"

    const-string v2, "\u4e91\u5357\u666e\u6d31"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "530900"

    const-string v2, "\u4e91\u5357\u4e34\u6ca7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "532300"

    const-string v2, "\u4e91\u5357\u695a\u96c4\u5f5d\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "532500"

    const-string v2, "\u4e91\u5357\u7ea2\u6cb3\u54c8\u5c3c\u65cf\u5f5d\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "532600"

    const-string v2, "\u4e91\u5357\u6587\u5c71\u58ee\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "532800"

    const-string v2, "\u4e91\u5357\u897f\u53cc\u7248\u7eb3\u50a3\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "532900"

    const-string v2, "\u4e91\u5357\u5927\u7406\u767d\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "533100"

    const-string v2, "\u4e91\u5357\u5fb7\u5b8f\u50a3\u65cf\u666f\u9887\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "533300"

    const-string v2, "\u4e91\u5357\u6012\u6c5f\u5088\u50f3\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "533400"

    const-string v2, "\u4e91\u5357\u8fea\u5e86\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540100"

    const-string v2, "\u897f\u85cf\u62c9\u8428"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540200"

    const-string v2, "\u897f\u85cf\u65e5\u5580\u5219"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540300"

    const-string v2, "\u897f\u85cf\u660c\u90fd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540400"

    const-string v2, "\u897f\u85cf\u6797\u829d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540500"

    const-string v2, "\u897f\u85cf\u5c71\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540600"

    const-string v2, "\u897f\u85cf\u90a3\u66f2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540700"

    const-string v2, "\u897f\u85cf\u963f\u91cc"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "540800"

    const-string v2, "\u897f\u85cf\u65e5\u5580\u5219"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "542500"

    const-string v2, "\u897f\u85cf\u5c71\u5357\u5e02\uff08\u5730\u7ea7\uff09"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "542600"

    const-string v2, "\u897f\u85cf\u90a3\u66f2\u5e02\uff08\u5730\u7ea7\uff09"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "542700"

    const-string v2, "\u897f\u85cf\u963f\u91cc\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "542800"

    const-string v2, "\u897f\u85cf\u6797\u829d\u5e02\uff08\u5730\u7ea7\uff09"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610100"

    const-string v2, "\u9655\u897f\u897f\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610200"

    const-string v2, "\u9655\u897f\u94dc\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610300"

    const-string v2, "\u9655\u897f\u5b9d\u9e21"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610400"

    const-string v2, "\u9655\u897f\u54b8\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610500"

    const-string v2, "\u9655\u897f\u6e2d\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610600"

    const-string v2, "\u9655\u897f\u5ef6\u5b89"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610700"

    const-string v2, "\u9655\u897f\u6c49\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610800"

    const-string v2, "\u9655\u897f\u6986\u6797"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "610900"

    const-string v2, "\u9655\u897f\u5b89\u5eb7"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "611000"

    const-string v2, "\u9655\u897f\u5546\u6d1b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620100"

    const-string v2, "\u7518\u8083\u5170\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620200"

    const-string v2, "\u7518\u8083\u5609\u5cea\u5173"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620300"

    const-string v2, "\u7518\u8083\u91d1\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620400"

    const-string v2, "\u7518\u8083\u767d\u94f6"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620500"

    const-string v2, "\u7518\u8083\u5929\u6c34"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620600"

    const-string v2, "\u7518\u8083\u6b66\u5a01"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620700"

    const-string v2, "\u7518\u8083\u5f20\u6396"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620800"

    const-string v2, "\u7518\u8083\u5e73\u51c9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "620900"

    const-string v2, "\u7518\u8083\u9152\u6cc9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "621000"

    const-string v2, "\u7518\u8083\u5e86\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "621100"

    const-string v2, "\u7518\u8083\u5b9a\u897f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "621200"

    const-string v2, "\u7518\u8083\u9647\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "622900"

    const-string v2, "\u7518\u8083\u4e34\u590f\u56de\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "623000"

    const-string v2, "\u7518\u8083\u7518\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "630100"

    const-string v2, "\u9752\u6d77\u897f\u5b81"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "630200"

    const-string v2, "\u9752\u6d77\u6d77\u4e1c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632200"

    const-string v2, "\u9752\u6d77\u6d77\u5317\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632300"

    const-string v2, "\u9752\u6d77\u9ec4\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632500"

    const-string v2, "\u9752\u6d77\u6d77\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632600"

    const-string v2, "\u9752\u6d77\u679c\u6d1b\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632700"

    const-string v2, "\u9752\u6d77\u7389\u6811\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "632800"

    const-string v2, "\u9752\u6d77\u6d77\u897f\u8499\u53e4\u65cf\u85cf\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640100"

    const-string v2, "\u5b81\u590f\u94f6\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640200"

    const-string v2, "\u5b81\u590f\u77f3\u5634\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640300"

    const-string v2, "\u5b81\u590f\u5434\u5fe0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640400"

    const-string v2, "\u5b81\u590f\u56fa\u539f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "640500"

    const-string v2, "\u5b81\u590f\u4e2d\u536b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659001"

    const-string v2, "\u65b0\u7586\u77f3\u6cb3\u5b50\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659002"

    const-string v2, "\u65b0\u7586\u963f\u62c9\u5c14\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659003"

    const-string v2, "\u65b0\u7586\u56fe\u6728\u8212\u514b\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659004"

    const-string v2, "\u65b0\u7586\u4e94\u5bb6\u6e20\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659005"

    const-string v2, "\u65b0\u7586\u5317\u5c6f\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659006"

    const-string v2, "\u65b0\u7586\u94c1\u95e8\u5173\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659007"

    const-string v2, "\u65b0\u7586\u53cc\u6cb3\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659008"

    const-string v2, "\u65b0\u7586\u53ef\u514b\u8fbe\u62c9\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659009"

    const-string v2, "\u65b0\u7586\u6606\u7389\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659010"

    const-string v2, "\u65b0\u7586\u80e1\u6768\u6cb3\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "659011"

    const-string v2, "\u65b0\u7586\u65b0\u661f\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "650100"

    const-string v2, "\u65b0\u7586\u4e4c\u9c81\u6728\u9f50\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "650200"

    const-string v2, "\u65b0\u7586\u514b\u62c9\u739b\u4f9d\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "650400"

    const-string v2, "\u65b0\u7586\u5410\u9c81\u756a\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "650500"

    const-string v2, "\u65b0\u7586\u54c8\u5bc6\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "652300"

    const-string v2, "\u65b0\u7586\u660c\u5409\u56de\u65cf\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "652700"

    const-string v2, "\u65b0\u7586\u535a\u5c14\u5854\u62c9\u8499\u53e4\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "652800"

    const-string v2, "\u65b0\u7586\u5df4\u97f3\u90ed\u695e\u8499\u53e4\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "652900"

    const-string v2, "\u65b0\u7586\u963f\u514b\u82cf\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "653000"

    const-string v2, "\u65b0\u7586\u514b\u5b5c\u52d2\u82cf\u67ef\u5c14\u514b\u5b5c\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "653100"

    const-string v2, "\u65b0\u7586\u5580\u4ec0\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "653200"

    const-string v2, "\u65b0\u7586\u548c\u7530\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "654000"

    const-string v2, "\u65b0\u7586\u4f0a\u7281\u54c8\u8428\u514b\u81ea\u6cbb\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "654200"

    const-string v2, "\u65b0\u7586\u5854\u57ce\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "654300"

    const-string v2, "\u65b0\u7586\u963f\u52d2\u6cf0\u5730\u533a"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710100"

    const-string v2, "\u53f0\u6e7e\u53f0\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710200"

    const-string v2, "\u53f0\u6e7e\u9ad8\u96c4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710300"

    const-string v2, "\u53f0\u6e7e\u65b0\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710400"

    const-string v2, "\u53f0\u6e7e\u53f0\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710500"

    const-string v2, "\u53f0\u6e7e\u53f0\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710600"

    const-string v2, "\u53f0\u6e7e\u6843\u56ed"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "710700"

    const-string v2, "\u53f0\u6e7e\u65b0\u7af9\u5e02"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "712100"

    const-string v2, "\u53f0\u6e7e\u57fa\u9686"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "712200"

    const-string v2, "\u53f0\u6e7e\u65b0\u7af9"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "712300"

    const-string v2, "\u53f0\u6e7e\u5609\u4e49"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713100"

    const-string v2, "\u53f0\u6e7e\u5b9c\u5170"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713200"

    const-string v2, "\u53f0\u6e7e\u5b9c\u5170\u53bf"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713300"

    const-string v2, "\u53f0\u6e7e\u65b0\u7af9\u53bf"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713400"

    const-string v2, "\u53f0\u6e7e\u82d7\u6817"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713500"

    const-string v2, "\u53f0\u6e7e\u5f70\u5316"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713600"

    const-string v2, "\u53f0\u6e7e\u5357\u6295"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713700"

    const-string v2, "\u53f0\u6e7e\u4e91\u6797"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713800"

    const-string v2, "\u53f0\u6e7e\u5609\u4e49"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "713900"

    const-string v2, "\u53f0\u6e7e\u53f0\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714000"

    const-string v2, "\u53f0\u6e7e\u9ad8\u96c4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714100"

    const-string v2, "\u53f0\u6e7e\u5c4f\u4e1c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714200"

    const-string v2, "\u53f0\u6e7e\u53f0\u4e1c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714300"

    const-string v2, "\u53f0\u6e7e\u82b1\u83b2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714400"

    const-string v2, "\u53f0\u6e7e\u6f8e\u6e56"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714500"

    const-string v2, "\u53f0\u6e7e\u91d1\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "714600"

    const-string v2, "\u53f0\u6e7e\u8fde\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711100"

    const-string v2, "\u53f0\u6e7e\u53f0\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711200"

    const-string v2, "\u53f0\u6e7e\u9ad8\u96c4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711300"

    const-string v2, "\u53f0\u6e7e\u5f70\u5316"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711400"

    const-string v2, "\u53f0\u6e7e\u53f0\u4e2d"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711500"

    const-string v2, "\u53f0\u6e7e\u65b0\u5317"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711600"

    const-string v2, "\u53f0\u6e7e\u6843\u56ed"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "711700"

    const-string v2, "\u53f0\u6e7e\u53f0\u5357"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "810000"

    const-string v2, "\u9999\u6e2f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "810100"

    const-string v2, "\u9999\u6e2f\u9999\u6e2f\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "810200"

    const-string v2, "\u9999\u6e2f\u4e5d\u9f99"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "810300"

    const-string v2, "\u9999\u6e2f\u65b0\u754c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "820000"

    const-string v2, "\u6fb3\u95e8"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "820100"

    const-string v2, "\u6fb3\u95e8\u6fb3\u95e8\u534a\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "820200"

    const-string v2, "\u6fb3\u95e8\u79bb\u5c9b"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330000"

    const-string v2, "\u6d59\u6c5f\u7701"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "341400"

    const-string v2, "\u5b89\u5fbd\u5de2\u6e56"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "340900"

    const-string v2, "\u5b89\u5fbd\u961c\u9633"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330281"

    const-string v2, "\u6d59\u6c5f\u4f59\u59da"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "330282"

    const-string v2, "\u6d59\u6c5f\u6148\u6eaa"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320581"

    const-string v2, "\u6c5f\u82cf\u5e38\u719f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320582"

    const-string v2, "\u6c5f\u82cf\u5f20\u5bb6\u6e2f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320583"

    const-string v2, "\u6c5f\u82cf\u6606\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "320585"

    const-string v2, "\u6c5f\u82cf\u592a\u4ed3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440281"

    const-string v2, "\u5e7f\u4e1c\u4e50\u660c"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440282"

    const-string v2, "\u5e7f\u4e1c\u5357\u96c4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "511181"

    const-string v2, "\u56db\u5ddd\u5ce8\u7709\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371581"

    const-string v2, "\u5c71\u4e1c\u4e34\u6e05"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371482"

    const-string v2, "\u5c71\u4e1c\u79b9\u57ce"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "371481"

    const-string v2, "\u5c71\u4e1c\u4e50\u9675"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "420381"

    const-string v2, "\u6e56\u5317\u4e39\u6c5f\u53e3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430381"

    const-string v2, "\u6e56\u5357\u6e58\u4e61"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "430382"

    const-string v2, "\u6e56\u5357\u97f6\u5c71"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440883"

    const-string v2, "\u5e7f\u4e1c\u5434\u5ddd"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440881"

    const-string v2, "\u5e7f\u4e1c\u5ec9\u6c5f"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/RegionMapping;->CITY_MAP:Ljava/util/Map;

    const-string v1, "440882"

    const-string v2, "\u5e7f\u4e1c\u96f7\u5dde"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :array_0
    .array-data 2
        0x824s
        0x829s
        0xc32s
        0xc28s
        0x6080s
        0x6249s
        0x58bs
        0x592s
        -0x6c64s
        0x5288s
        0x7a7s
        0x7a0s
        0x5bc7s
        0x5611s
        0x911s
        0x905s
        0x6f29s
        0x5839s
        0x5df8s
        0x361s
        0x375s
        -0x6dfbs
        0x6f0cs
        -0x7eeas
        0x46f3s
        0xa42s
        0xa5es
        0x6efas
        0x54f7s
        0x9e2s
        0x9efs
        0x5197s
        0x5c41s
        0x5edbs
        -0x7468s
        0x4c7ds
        0x901s
        0x919s
        -0x7e45s
        0x5f66s
        0x28fs
        0x28cs
        -0x72aes
        0x5a2fs
        0x9f9s
        0x9f4s
        -0x74c8s
        0x6824s
        0x6fds
        0x6fds
        0x7ef6s
        0x74cbs
        0x521s
        0x533s
        0x50c4s
        0x5d2cs
        0x6cfs
        0x6d7s
        -0x7529s
        0x56aes
        0x529bs
        0x3d4s
        0x3d7s
        0x6e64s
        0x5e5cs
        0x5260s
        0x4afs
        0x4a9s
        0x5fa1s
        0x565es
        0x6637s
        0x5203s
        0xc15s
        0xc0es
        0x5b59s
        0x5157s
        0x6302s
        0x51cbs
        0x59bs
        0x598s
        0x423ds
        0x5aeds
        0x5fe0s
        0x626es
        0x1ees
        0x1eds
        0x4410s
        0x5cc0s
        -0x6c5cs
        0x6412s
        0x128s
        0x12as
        0x4709s
        0x5fd9s
        0x6697s
        -0x6334s
        0x803s
        0x811s
        0x675bs
        0x79bbs
        -0x6203s
        0x690bs
        0x44eds
        0x1e8s
        0x1f6s
        0x5f76s
        0x46c1s
        -0x6708s
        0x196s
        0x192s
        -0x6dfds
        -0x7b98s
        -0x6a89s
        0xba2s
        0xbbcs
        0x5a90s
        0x6a66s
        0x5ab8s
        0x2aas
        0x2afs
        0x4a04s
        -0x796ds
        0x56f6s
        0x54ds
        0x54bs
        0x5fc2s
        -0x7712s
        0x59abs
        0x9b8s
        0x9bes
        0x7c3as
        0x5549s
        0x460s
        0x47es
        -0x7a6es
        0x519es
        0xbe8s
        0xbeds
        0x51cs
        0x508s
        0x67cds
        0x5de5s
        0x401s
        0x400s
        0x5b8fs
        0x52c5s
        0x6bds
        0x6a0s
        0x697ds
        0x5155s
        0x5a5bs
        0x6a4s
        0x6b2s
        -0x74d5s
        0x71b9s
        0x700ds
        0x69bs
        0x69fs
        -0x7ee1s
        -0x7e86s
        0x7727s
        0x9d5s
        0x9d7s
        -0x7ea1s
        0x5358s
        0xa46s
        0xa41s
        0x6f7es
        0x5683s
        0x615cs
        0x816s
        0x81ds
        0x7d21s
        0x5194s
        0x3e2s
        0x3f7s
        0x5828s
        0x567ds
        0x5364s
        0xa11s
        0xa07s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    const-string v0, "xWYyIiE8hRKmte7rK"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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
