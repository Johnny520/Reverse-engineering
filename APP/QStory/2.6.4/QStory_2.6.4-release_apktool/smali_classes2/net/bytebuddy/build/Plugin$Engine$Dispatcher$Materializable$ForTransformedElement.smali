.class public Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForTransformedElement"
.end annotation


# instance fields
.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final dynamicType:Lnet/bytebuddy/dynamic/DynamicType;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/DynamicType;)V
    .locals 0
    .param p1    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public materialize(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    iget-object p4, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/DynamicType;->getAllTypes()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-interface {p1, p3}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->store(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/DynamicType;->getAllTypes()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-interface {p1, p3, p4}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->store(Lnet/bytebuddy/ClassFileVersion;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 23
    .line 24
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method
