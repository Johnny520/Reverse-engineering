.class public final L飘花落叶言世苏兰哲子楪/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/ClassValue;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ClassValue;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final computeValue(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰苏哲楪;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/lang/ref/SoftReference;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世苏哲兰:Ljava/lang/ref/SoftReference;

    .line 16
    .line 17
    return-object p0
.end method
