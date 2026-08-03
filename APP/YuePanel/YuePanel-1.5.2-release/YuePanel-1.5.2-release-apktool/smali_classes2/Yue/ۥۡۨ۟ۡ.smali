.class public LYue/ۥۡۨ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۨ۟ۡ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/util/Collection;Ljava/util/Collection;)LYue/ۥ۠۠ۥۧ;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            ">;",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e7;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠۠ۥۧ;

    invoke-direct {v0}, LYue/ۥ۠۠ۥۧ;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠۠ۥۥ;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {v1, v3}, LYue/ۥۣۡۢۤ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۥ۟(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;
    .locals 0

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p0, p1}, LYue/ۥ۟ۥۢۢ;->ۥ(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Ljava/lang/String;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;
    .locals 0

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۥۥ۠;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥ۠ۡ۠ۤ;

    move-result-object p0

    invoke-static {p0, p1}, LYue/ۥۡۨ۟ۡ;->ۥ۟(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;Ljava/lang/Iterable;)LYue/ۥ۠۠ۥۧ;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e7;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p0}, LYue/ۥۡۥۥ۠;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥ۠ۡ۠ۤ;

    move-result-object p0

    new-instance v0, LYue/ۥ۠۠ۥۧ;

    invoke-direct {v0}, LYue/ۥ۠۠ۥۧ;-><init>()V

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠۠ۥۥ;

    invoke-static {p0, v2}, LYue/ۥۡۨ۟ۡ;->ۥ۟(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۧ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠۠ۥۥ;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۥ;
    .locals 0

    invoke-static {p0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۥۥ۠;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥ۠ۡ۠ۤ;

    move-result-object p0

    invoke-static {p0, p1}, LYue/ۥ۟ۥۢۢ;->ۥ۟(LYue/ۥ۠ۡ۠ۤ;LYue/ۥ۠۠ۥۥ;)LYue/ۥ۠۠ۥۥ;

    move-result-object p0

    return-object p0
.end method
