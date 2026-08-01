.class public Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForUnresolvedElement"
.end annotation


# instance fields
.field private final element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

.field private final typeName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement;->typeName:Ljava/lang/String;

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
    iget-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;->retain(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p4, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
