.class public L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I


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
    sput-object v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final isLoadedByDefault()Z
    .locals 0

    .line 1
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a57792051405a7L    # -2.3668162814351054E45

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
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v2}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 29
    .line 30
    .line 31
    const-wide v2, -0x36a5778f051405a7L    # -2.3668203648235084E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v2, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-direct {v2, p0, v3}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 52
    .line 53
    .line 54
    const-wide v2, -0x36a521e4051405a7L    # -2.3966712951792808E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    const/16 v1, 0x1a

    .line 70
    .line 71
    invoke-direct {v0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a577a2051405a7L    # -2.3667945033636224E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()I
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:I

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroid/app/Activity;Z)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    const v2, 0x240800bf

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世兰哲苏;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/app/Activity;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
