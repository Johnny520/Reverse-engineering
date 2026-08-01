.class public final synthetic L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;
.implements Lretrofit2/飘花落叶言子楪哲世兰苏;
.implements L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    check-cast p1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;

    .line 6
    .line 7
    invoke-virtual {p1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 13
    .line 14
    invoke-static {p1, p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/io/RandomAccessFile;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/MagicNumberFileFilter;Ljava/io/RandomAccessFile;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    sget-object v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 6
    .line 7
    new-instance v0, Landroid/os/Handler;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method
