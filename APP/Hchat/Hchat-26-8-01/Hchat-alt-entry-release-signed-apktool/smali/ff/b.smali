.class public final synthetic Lff/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lff/c;


# direct methods
.method public synthetic constructor <init>(Lff/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lff/b;->a:Lff/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Llc/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lff/b;->a:Lff/c;

    .line 2
    .line 3
    iget-object v0, v0, Lff/c;->b:Lff/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v1, Lcom/alibaba/fastjson2/writer/b;

    .line 13
    .line 14
    const/16 v2, 0x17

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v1, Lbc/j;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-direct {v1, v0, v2}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lce/n;

    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Lae/d;

    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    invoke-direct {v0, v1}, Lae/d;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lae/e;

    .line 55
    .line 56
    const/16 v1, 0x14

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lae/e;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->peek(Ljava/util/function/Consumer;)Ljava/util/stream/Stream;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    sget-object p1, Lqc/c;->g:Lqc/c;

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_0
    new-instance v0, Lff/d;

    .line 85
    .line 86
    invoke-direct {v0, p1}, Lff/d;-><init>(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method
