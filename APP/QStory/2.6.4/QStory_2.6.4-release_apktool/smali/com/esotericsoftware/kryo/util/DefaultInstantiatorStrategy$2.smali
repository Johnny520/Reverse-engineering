.class Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;->newInstantiatorOf(Ljava/lang/Class;)L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;

.field final synthetic val$constructor:Ljava/lang/reflect/Constructor;

.field final synthetic val$type:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;Ljava/lang/reflect/Constructor;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;->this$0:Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;->val$constructor:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;->val$type:Ljava/lang/Class;

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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;->val$constructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-object p0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy$2;->val$type:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {p0}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v1, "Error constructing instance of class: "

    .line 17
    .line 18
    invoke-static {v1, p0, v0}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method
