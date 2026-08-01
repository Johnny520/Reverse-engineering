.class public L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Ljava/lang/Deprecated;
    since = "\u5f03\u7528"
.end annotation


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    invoke-direct {v0, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final isLoadedByDefault()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object p1, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x476

    .line 7
    .line 8
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-class v0, Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, Ljava/lang/ClassLoader;

    .line 19
    .line 20
    const-class v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v2, p1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    const/16 v1, 0x17

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method
