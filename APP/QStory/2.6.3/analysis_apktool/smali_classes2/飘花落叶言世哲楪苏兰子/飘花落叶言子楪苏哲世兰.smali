.class public L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲世兰;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final 飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const/16 p1, 0x146

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-class v0, Ljava/util/List;

    .line 16
    .line 17
    const-class v1, Landroid/os/Bundle;

    .line 18
    .line 19
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const-class v3, Ljava/lang/Object;

    .line 22
    .line 23
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 28
    .line 29
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    invoke-direct {v0, p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲世兰;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 45
    .line 46
    .line 47
    return-void
.end method
