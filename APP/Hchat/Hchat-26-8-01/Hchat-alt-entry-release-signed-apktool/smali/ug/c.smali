.class public abstract Lug/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[Lwf/c;

.field public static final b:Ll3/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lwf/c;

    .line 3
    .line 4
    sput-object v0, Lug/c;->a:[Lwf/c;

    .line 5
    .line 6
    new-instance v0, Ll3/q;

    .line 7
    .line 8
    const-string v1, "NULL"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, v2}, Ll3/q;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lug/c;->b:Ll3/q;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lwf/g;Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Lwf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p0, p2}, Lvg/a;->l(Lwf/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    new-instance v0, Lug/o;

    .line 6
    .line 7
    invoke-direct {v0, p4, p0}, Lug/o;-><init>(Lwf/c;Lwf/g;)V

    .line 8
    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    invoke-static {p3, p1, v0}, Lfb/v0;->Q(Lfg/p;Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    invoke-static {v1, p3}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p3, p1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    invoke-static {p0, p2}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lxf/a;->g:Lxf/a;

    .line 31
    .line 32
    if-ne p1, p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    invoke-static {p0, p2}, Lvg/a;->g(Lwf/g;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
