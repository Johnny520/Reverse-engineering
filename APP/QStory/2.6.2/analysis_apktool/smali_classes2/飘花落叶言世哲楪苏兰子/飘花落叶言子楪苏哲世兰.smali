.class public L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲世兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a524e8051405a7L    # -2.395620503230229E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-class v0, Ljava/util/List;

    .line 19
    .line 20
    const-class v1, Landroid/os/Bundle;

    .line 21
    .line 22
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    const-class v3, Ljava/lang/Object;

    .line 25
    .line 26
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    iput-object v0, v1, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    invoke-direct {v0, p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏哲世兰;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 48
    .line 49
    .line 50
    return-void
.end method
