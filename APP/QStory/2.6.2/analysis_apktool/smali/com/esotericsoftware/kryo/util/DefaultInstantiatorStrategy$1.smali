.class Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->newInstantiatorOf(Ljava/lang/Class;)L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;

.field final synthetic val$access:Lcom/esotericsoftware/reflectasm/ConstructorAccess;

.field final synthetic val$type:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;Lcom/esotericsoftware/reflectasm/ConstructorAccess;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;->this$0:Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;->val$access:Lcom/esotericsoftware/reflectasm/ConstructorAccess;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;->val$type:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public newInstance()Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;->val$access:Lcom/esotericsoftware/reflectasm/ConstructorAccess;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/esotericsoftware/reflectasm/ConstructorAccess;->newInstance()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$1;->val$type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v1, "Error constructing instance of class: "

    .line 16
    .line 17
    invoke-static {v1, p0, v0}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method
