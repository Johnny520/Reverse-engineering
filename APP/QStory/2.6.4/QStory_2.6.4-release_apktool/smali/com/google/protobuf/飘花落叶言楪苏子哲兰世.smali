.class public Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

.field public static volatile 飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

.field public static volatile 飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/ExtensionRegistryLite$LazyExtensionMode;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/ExtensionRegistryLite$LazyExtensionMode;->EAGER:Lcom/google/protobuf/ExtensionRegistryLite$LazyExtensionMode;

    .line 2
    .line 3
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/ExtensionRegistryLite$LazyExtensionMode;

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 20
    .line 21
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const-class v1, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    const-string v0, "getEmptyRegistry"

    .line 15
    .line 16
    sget-object v2, Lcom/google/protobuf/飘花落叶言楪苏子世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    move-object v3, v0

    .line 33
    :catch_0
    :goto_0
    if-eqz v3, :cond_1

    .line 34
    .line 35
    move-object v0, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :try_start_2
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 38
    .line 39
    :goto_1
    sput-object v0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :goto_2
    monitor-exit v1

    .line 45
    return-object v0

    .line 46
    :goto_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0

    .line 48
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪苏子哲世兰;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪苏子哲世兰;-><init>(ILcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰世哲苏子;

    .line 13
    .line 14
    return-object p0
.end method
