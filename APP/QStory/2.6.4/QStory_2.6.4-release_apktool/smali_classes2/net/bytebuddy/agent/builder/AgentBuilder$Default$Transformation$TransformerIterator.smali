.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TransformerIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
        ">;"
    }
.end annotation


# instance fields
.field private final classBeingRedefined:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final classLoader:Ljava/lang/ClassLoader;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final module:Lnet/bytebuddy/utility/JavaModule;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final protectionDomain:Ljava/security/ProtectionDomain;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final transformations:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;"
        }
    .end annotation
.end field

.field private transformers:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation
.end field

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;Ljava/util/List;)V
    .locals 6
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->module:Lnet/bytebuddy/utility/JavaModule;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classBeingRedefined:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 13
    .line 14
    invoke-interface {p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p6

    .line 18
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 19
    .line 20
    sget-object p6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {p6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p6

    .line 26
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 27
    .line 28
    :goto_0
    iget-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 29
    .line 30
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p6

    .line 34
    if-nez p6, :cond_1

    .line 35
    .line 36
    iget-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 37
    .line 38
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p6

    .line 42
    if-eqz p6, :cond_1

    .line 43
    .line 44
    iget-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 45
    .line 46
    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p6

    .line 50
    check-cast p6, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 51
    .line 52
    invoke-virtual {p6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v1, p1

    .line 57
    move-object v2, p2

    .line 58
    move-object v3, p3

    .line 59
    move-object v4, p4

    .line 60
    move-object v5, p5

    .line 61
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    invoke-virtual {p6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getTransformers()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 76
    .line 77
    :cond_0
    move-object p1, v1

    .line 78
    move-object p2, v2

    .line 79
    move-object p3, v3

    .line 80
    move-object p4, v4

    .line 81
    move-object p5, v5

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 122
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->next()Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;

    move-result-object p0

    return-object p0
.end method

.method public next()Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    :cond_0
    :goto_0
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 32
    .line 33
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classLoader:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->module:Lnet/bytebuddy/utility/JavaModule;

    .line 42
    .line 43
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classBeingRedefined:Ljava/lang/Class;

    .line 44
    .line 45
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 46
    .line 47
    invoke-interface/range {v2 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getTransformers()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-object v0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    :cond_2
    :goto_1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformations:Ljava/util/Iterator;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 89
    .line 90
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 95
    .line 96
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classLoader:Ljava/lang/ClassLoader;

    .line 97
    .line 98
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->module:Lnet/bytebuddy/utility/JavaModule;

    .line 99
    .line 100
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->classBeingRedefined:Ljava/lang/Class;

    .line 101
    .line 102
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 103
    .line 104
    invoke-interface/range {v2 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getTransformers()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iput-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;->transformers:Ljava/util/Iterator;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    throw v0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "remove"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
