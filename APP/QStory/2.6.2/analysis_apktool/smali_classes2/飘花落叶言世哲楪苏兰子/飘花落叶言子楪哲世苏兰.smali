.class public L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;


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
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x36a5223d051405a7L    # -2.396550154656657E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a5222b051405a7L    # -2.3965746549870753E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

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
    const-wide v0, -0x36a5221a051405a7L    # -2.396597794188026E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-wide v0, -0x36a521e4051405a7L    # -2.3966712951792808E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    invoke-direct {v1, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 40
    .line 41
    .line 42
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {p0, p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :catch_0
    return-void

    .line 50
    :cond_0
    iget-object p0, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    new-instance p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 53
    .line 54
    const/4 v0, 0x6

    .line 55
    invoke-direct {p1, v0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 2

    .line 1
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x36a5222b051405a7L    # -2.3965746549870753E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-wide v0, -0x36a5223d051405a7L    # -2.396550154656657E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 37
    .line 38
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 8

    .line 1
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

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
    const-wide v1, -0x36a521ee051405a7L    # -2.396657683884604E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-wide v1, -0x36a5222b051405a7L    # -2.3965746549870753E45

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    aget-object p0, p0, v0

    .line 31
    .line 32
    invoke-virtual {p1, p0, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-wide v1, -0x36a5223d051405a7L    # -2.396550154656657E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    array-length v3, p0

    .line 50
    :goto_0
    if-ge v0, v3, :cond_2

    .line 51
    .line 52
    aget-object v4, p0, v0

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const-wide v6, -0x36a514cb051405a7L    # -2.4012351622844244E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1, v4, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    return-void
.end method
