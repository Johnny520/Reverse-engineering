.class public Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition$Delegator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RequiresDefinitionAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition$Delegator<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final modifiers:I

.field private final module:Ljava/lang/String;

.field final synthetic this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

.field private final version:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3    # I
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition$Delegator;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->version:Ljava/lang/String;

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
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->version:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->version:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz v2, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_8

    .line 67
    .line 68
    return v1

    .line 69
    :cond_8
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->version:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v0, v2

    .line 31
    :cond_0
    mul-int/2addr v0, v1

    .line 32
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 33
    .line 34
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
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
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 4
    .line 5
    invoke-static {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$000(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v7, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;

    .line 15
    .line 16
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->version:Ljava/lang/String;

    .line 17
    .line 18
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 19
    .line 20
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;-><init>(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 27
    .line 28
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

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
    iget-object v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 38
    .line 39
    invoke-static {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 44
    .line 45
    invoke-static {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$300(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 50
    .line 51
    invoke-static {v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$400(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 56
    .line 57
    invoke-static {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$500(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 62
    .line 63
    invoke-static {v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$600(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 68
    .line 69
    invoke-static {v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$700(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 74
    .line 75
    invoke-static {v10}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->access$800(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

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
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    move-result-object p0

    return-object p0
.end method

.method public requiredVersion(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->this$1:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->module:Ljava/lang/String;

    .line 6
    .line 7
    iget p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;->modifiers:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
