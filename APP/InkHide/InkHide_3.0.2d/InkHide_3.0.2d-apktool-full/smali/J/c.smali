.class public final LJ/c;
.super LJ/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(LJ/b;)V
    .locals 1

    .line 1
    const-string v0, "initialExtras"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LJ/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LJ/b;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    iget-object p1, p1, LJ/b;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
