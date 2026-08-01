.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;
.super L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u696a\u5170\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
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


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa0

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x854

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of p1, p0, Ljava/lang/Long;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Long;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    instance-of p1, p0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    int-to-long p0, p0

    .line 26
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of p1, p0, Ljava/lang/Number;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p0

    .line 20
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/16 v0, 0x4e9

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲世兰苏()V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-static {p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/16 v0, 0x88c

    .line 38
    .line 39
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/16 v1, 0x88d

    .line 44
    .line 45
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-static {v0, v1, p1, v2}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 51
    .line 52
    .line 53
    :cond_1
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 54
    .line 55
    new-instance p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x88b

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()V
    .locals 4

    .line 1
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x13a4

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x9e

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 28
    .line 29
    const-class v1, Landroid/view/View;

    .line 30
    .line 31
    filled-new-array {v2, v1}, [Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v0, 0x9f

    .line 43
    .line 44
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 59
    .line 60
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_0
    new-instance v1, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 71
    .line 72
    const/16 v2, 0x8

    .line 73
    .line 74
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0, v1}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x1

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
