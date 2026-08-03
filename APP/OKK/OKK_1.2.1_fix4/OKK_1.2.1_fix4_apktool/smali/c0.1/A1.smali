.class public final Lc0/A1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc0/A1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a([J)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lc0/A1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    new-instance v4, Lc0/y1;

    invoke-direct {v4, v0, v1}, Lc0/y1;-><init>(J)V

    new-instance v5, Lc0/z1;

    invoke-direct {v5, v4}, Lc0/z1;-><init>(Lc0/y1;)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    array-length v3, p0

    if-nez v3, :cond_0

    sget-object p0, LV0/c;->a:LV0/c;

    goto :goto_0

    :cond_0
    new-instance v3, LE0/k;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0}, LE0/k;-><init>(ILjava/lang/Object;)V

    move-object p0, v3

    :goto_0
    new-instance v3, Lc0/A;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Lc0/A;-><init>(I)V

    new-instance v4, LV0/e;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5, v3}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance p0, LV0/d;

    invoke-direct {p0, v4}, LV0/d;-><init>(LV0/e;)V

    :goto_1
    invoke-virtual {p0}, LV0/d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method
