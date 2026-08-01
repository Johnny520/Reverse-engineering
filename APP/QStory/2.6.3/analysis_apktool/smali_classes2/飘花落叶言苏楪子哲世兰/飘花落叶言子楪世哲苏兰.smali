.class public final synthetic L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-class v0, Lorg/slf4j/helpers/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
