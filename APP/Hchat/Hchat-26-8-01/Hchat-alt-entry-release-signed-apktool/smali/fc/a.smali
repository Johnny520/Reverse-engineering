.class public final Lfc/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbc/d;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Lb/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfc/a;->b:Ljava/lang/String;

    .line 5
    .line 6
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lhc/b;->a:Lb/e;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Lae/a;

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lae/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Ljava/util/TreeMap;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lb/e;

    .line 45
    .line 46
    const/16 p3, 0xf

    .line 47
    .line 48
    invoke-direct {p1, p2, p3, v0}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iput-object p1, p0, Lfc/a;->c:Lb/e;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/a;->c:Lb/e;

    .line 2
    .line 3
    sget-object v1, Lhc/b;->a:Lb/e;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lb/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/a;->c:Lb/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
