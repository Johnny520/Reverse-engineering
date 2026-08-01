.class public final synthetic L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;
.implements Lretrofit2/飘花落叶言子楪哲世兰苏;
.implements L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

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
    iget-object p0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    check-cast p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;

    .line 6
    .line 7
    invoke-virtual {p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

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
    iget-object p0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget-object p0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x47f

    .line 15
    .line 16
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v0, v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-ne v2, p0, :cond_0

    .line 40
    .line 41
    check-cast v1, Landroid/widget/ImageView;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method
