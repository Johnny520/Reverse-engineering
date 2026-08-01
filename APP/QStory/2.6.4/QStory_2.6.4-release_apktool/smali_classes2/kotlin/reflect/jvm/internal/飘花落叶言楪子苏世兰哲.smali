.class public final Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲世苏兰;


# instance fields
.field public volatile 飘花落叶言子楪哲兰世苏:Ljava/lang/ref/SoftReference;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲世苏兰;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/SoftReference;

    .line 8
    .line 9
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/ref/SoftReference;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/SoftReference;

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const-string p0, "Argument for @NotNull parameter \'initializer\' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null"

    .line 22
    .line 23
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/SoftReference;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v1

    .line 18
    :cond_1
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    invoke-interface {v1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v0, v1

    .line 30
    :goto_0
    invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/SoftReference;

    .line 34
    .line 35
    return-object v1
.end method
