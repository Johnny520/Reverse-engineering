.class public final Lv9/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Luf/d;

.field public static final f:Ljava/util/List;

.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/HashSet;

.field public static final i:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Luf/d;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Luf/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv9/b;->e:Luf/d;

    .line 8
    .line 9
    const-string v0, "onReceiveUpgradePatch. try to start apply"

    .line 10
    .line 11
    const-string v1, "verify patch signature failed, tinker."

    .line 12
    .line 13
    const-string v2, "null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse"

    .line 14
    .line 15
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lv9/b;->f:Ljava/util/List;

    .line 24
    .line 25
    const-string v0, "before commandNewApkMd5HardCode, response.newApkMd5 = "

    .line 26
    .line 27
    const-string v1, ", response.fileMd5 = "

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lv9/b;->g:Ljava/util/List;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lv9/b;->h:Ljava/util/HashSet;

    .line 45
    .line 46
    new-instance v0, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lv9/b;->i:Ljava/util/HashSet;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "disable_hot_update"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u963b\u6b62\u5fae\u4fe1\u52a0\u8f7d\u548c\u5e94\u7528\u70ed\u66f4\u65b0\u8865\u4e01"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "disable_hot_update"

    .line 11
    .line 12
    const-string v3, "\u5c4f\u853d\u70ed\u66f4\u65b0"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {v0}, Luf/d;->C(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v1, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    iget-object p1, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 16
    .line 17
    sget-object v2, Lv9/b;->e:Luf/d;

    .line 18
    .line 19
    invoke-virtual {v2, p1, v1, v0}, Luf/d;->z(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5c4f\u853d\u70ed\u66f4\u65b0"

    .line 2
    .line 3
    return-object v0
.end method
