.class public L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;


# static fields
.field public static 飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

.field public static 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public static 飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

.field public static final 飘花落叶言子楪哲兰苏世:Ljava/util/Stack;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

.field public 飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/Stack;

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
    const/16 p0, 0x15b

    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x15c

    .line 10
    .line 11
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 16
    .line 17
    .line 18
    const/16 p0, 0x15d

    .line 19
    .line 20
    :try_start_0
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 v0, 0x15e

    .line 25
    .line 26
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    invoke-direct {v1, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 34
    .line 35
    .line 36
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {p0, p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    return-void

    .line 44
    :cond_0
    iget-object p0, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 45
    .line 46
    new-instance p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 47
    .line 48
    const/4 v0, 0x6

    .line 49
    invoke-direct {p1, v0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x15c

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/16 v0, 0x15b

    .line 21
    .line 22
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 31
    .line 32
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/16 p0, 0x15f

    .line 9
    .line 10
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 v1, 0x15c

    .line 19
    .line 20
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    aget-object p0, p0, v0

    .line 25
    .line 26
    invoke-virtual {p1, p0, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/16 p0, 0x15b

    .line 31
    .line 32
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    array-length v2, v1

    .line 41
    :goto_0
    if-ge v0, v2, :cond_2

    .line 42
    .line 43
    aget-object v3, v1, v0

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/16 v5, 0xaf

    .line 54
    .line 55
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, v3, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return-void
.end method
