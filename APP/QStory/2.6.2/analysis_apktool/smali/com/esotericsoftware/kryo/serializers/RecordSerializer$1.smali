.class Lcom/esotericsoftware/kryo/serializers/RecordSerializer$1;
.super Ljava/lang/ClassValue;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/RecordSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ClassValue<",
        "Ljava/lang/reflect/Constructor<",
        "*>;>;"
    }
.end annotation


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
.method public bridge synthetic computeValue(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer$1;->computeValue(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    return-object p0
.end method

.method public computeValue(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p0}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->access$000(Ljava/lang/Class;Ljava/util/Comparator;)[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p1, p0}, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;->access$100(Ljava/lang/Class;[Lcom/esotericsoftware/kryo/serializers/RecordSerializer$RecordComponent;)Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
