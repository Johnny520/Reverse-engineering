.class public Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition$Delegator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OpensDefinitionAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition$Delegator<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final aPackage:Ljava/lang/String;

.field private final modifiers:I

.field private final targets:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;I)V
    .locals 1

    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition$Delegator;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 31
    .line 32
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v2

    .line 37
    return p0
.end method

.method public materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 4
    .line 5
    invoke-static {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$700(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v9, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;

    .line 15
    .line 16
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 17
    .line 18
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 19
    .line 20
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;-><init>(Ljava/util/Set;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 27
    .line 28
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v2, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 32
    .line 33
    invoke-static {v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$100(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 38
    .line 39
    invoke-static {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 44
    .line 45
    invoke-static {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$300(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 50
    .line 51
    invoke-static {v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$400(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 56
    .line 57
    invoke-static {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$500(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 62
    .line 63
    invoke-static {v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$000(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 68
    .line 69
    invoke-static {v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$600(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 74
    .line 75
    invoke-static {v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$800(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 80
    .line 81
    invoke-static {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$900(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method

.method public bridge synthetic materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0

    .line 89
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    move-result-object p0

    return-object p0
.end method

.method public to(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->targets:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    new-instance p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->aPackage:Ljava/lang/String;

    .line 16
    .line 17
    iget p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;->modifiers:I

    .line 18
    .line 19
    invoke-direct {p1, v1, v2, p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/util/Set;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method
