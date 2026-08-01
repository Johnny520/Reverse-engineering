.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;
.super Lnet/bytebuddy/jar/asm/ModuleVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ModuleExtractor"
.end annotation


# instance fields
.field private final exports:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;"
        }
    .end annotation
.end field

.field private mainClass:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final modifiers:I

.field private final name:Ljava/lang/String;

.field private final opens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;"
        }
    .end annotation
.end field

.field private final packages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final provides:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;"
        }
    .end annotation
.end field

.field private final requires:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

.field private final uses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3    # I
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->packages:Ljava/util/Set;

    .line 14
    .line 15
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->requires:Ljava/util/Map;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->exports:Ljava/util/Map;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->opens:Ljava/util/Map;

    .line 35
    .line 36
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->uses:Ljava/util/Set;

    .line 42
    .line 43
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->provides:Ljava/util/Map;

    .line 49
    .line 50
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->name:Ljava/lang/String;

    .line 51
    .line 52
    iput p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->modifiers:I

    .line 53
    .line 54
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->version:Ljava/lang/String;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public visitEnd()V
    .locals 12

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->name:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->modifiers:I

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->version:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->mainClass:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->packages:Ljava/util/Set;

    .line 14
    .line 15
    iget-object v7, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->requires:Ljava/util/Map;

    .line 16
    .line 17
    iget-object v8, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->exports:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v9, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->opens:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v10, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->uses:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v11, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->provides:Ljava/util/Map;

    .line 24
    .line 25
    invoke-direct/range {v1 .. v11}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->access$4802(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public varargs visitExport(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 2
    .param p3    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->exports:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$Exports$Simple;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    sget-object p3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-direct {v1, p3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    move-object p3, v1

    .line 20
    :goto_0
    invoke-direct {v0, p3, p2}, Lnet/bytebuddy/description/module/ModuleDescription$Exports$Simple;-><init>(Ljava/util/Set;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public visitMainClass(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->mainClass:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public varargs visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 2
    .param p3    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->opens:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    sget-object p3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-direct {v1, p3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    move-object p3, v1

    .line 20
    :goto_0
    invoke-direct {v0, p3, p2}, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;-><init>(Ljava/util/Set;I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public visitPackage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->packages:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public varargs visitProvide(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->provides:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;

    .line 4
    .line 5
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;-><init>(Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public visitRequire(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->requires:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;

    .line 4
    .line 5
    invoke-direct {v0, p3, p2}, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;-><init>(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public visitUse(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;->uses:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
