.class public final Lcom/alibaba/fastjson2/util/MapMultiValueType;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/Type;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/util/Map;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/reflect/Type;"
    }
.end annotation


# instance fields
.field public final mapType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final valueTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Type;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/util/MapMultiValueType;->valueTypes:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/MapMultiValueType;->mapType:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/util/MapMultiValueType;->valueTypes:Ljava/util/Map;

    .line 19
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/MapMultiValueType;->mapType:Ljava/lang/Class;

    .line 20
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/util/MapMultiValueType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/Map;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/alibaba/fastjson2/util/MapMultiValueType<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    invoke-direct {v0, p0, p1, p2}, Lcom/alibaba/fastjson2/util/MapMultiValueType;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Class;Ljava/util/Map;)Lcom/alibaba/fastjson2/util/MapMultiValueType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/util/Map;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Lcom/alibaba/fastjson2/util/MapMultiValueType<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/util/MapMultiValueType;-><init>(Ljava/lang/Class;Ljava/util/Map;)V

    return-object v0
.end method

.method public static of(Ljava/lang/String;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/util/MapMultiValueType;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/alibaba/fastjson2/util/MapMultiValueType<",
            "Lcom/alibaba/fastjson2/JSONObject;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    .line 2
    .line 3
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lcom/alibaba/fastjson2/util/MapMultiValueType;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static of(Ljava/util/Map;)Lcom/alibaba/fastjson2/util/MapMultiValueType;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Lcom/alibaba/fastjson2/util/MapMultiValueType<",
            "Lcom/alibaba/fastjson2/JSONObject;",
            ">;"
        }
    .end annotation

    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/util/MapMultiValueType;-><init>(Ljava/lang/Class;Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public getType(Ljava/lang/String;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/MapMultiValueType;->valueTypes:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/reflect/Type;

    .line 8
    .line 9
    return-object p1
.end method
