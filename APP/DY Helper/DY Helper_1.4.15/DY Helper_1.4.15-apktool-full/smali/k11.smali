.class public final Lk11;
.super Lhq;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    sget-object v0, Lgq;->β:Lgq;

    .line 19
    invoke-direct {p0, v0}, Lk11;-><init>(Lhq;)V

    return-void
.end method

.method public constructor <init>(Lhq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lhq;->α:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lhq;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lhq;->α:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
