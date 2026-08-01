.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u82cf\u5170\u4e16;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u696a\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x36a5ce9e051405a7L    # -2.3364848723772406E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-wide v0, -0x36a538d6051405a7L    # -2.3886760206861064E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a5ce6f051405a7L    # -2.3365488454622217E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-wide v0, -0x36a5ce21051405a7L    # -2.336655013560701E45

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
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-wide v1, -0x36a5cdfe051405a7L    # -2.33670265309207E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 53
    .line 54
    const/16 v2, 0xa

    .line 55
    .line 56
    invoke-direct {v1, p0, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 57
    .line 58
    .line 59
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    const-class v3, Landroid/view/View;

    .line 62
    .line 63
    const-class v4, Landroid/view/ViewGroup;

    .line 64
    .line 65
    filled-new-array {v2, v3, v4, v1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, p1, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;

    .line 77
    .line 78
    const/16 v1, 0xd

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    const-wide p0, -0x36a5ce80051405a7L    # -2.336525706261271E45

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    throw p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5ce70051405a7L    # -2.336547484332754E45

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

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a5a05d051405a7L    # -2.352602006404084E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-wide v0, -0x36a5ae31051405a7L    # -2.3477836080884834E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-wide v0, -0x36a57c0c051405a7L    # -2.3652564270651398E45

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a5a05d051405a7L    # -2.352602006404084E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const-wide v2, -0x36a5cdb7051405a7L    # -2.3367992932842755E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    const/16 v3, 0xf

    .line 29
    .line 30
    invoke-direct {v2, v3}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iput-object v3, v1, L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->飘花落叶言子苏世哲兰楪(L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世哲苏兰;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/BaseDataList;->single()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰()Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世苏哲兰;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v0, v0, Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    const-class v2, Ljava/lang/Object;

    .line 66
    .line 67
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/reflect/Method;

    .line 79
    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1, v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    return-void
.end method
