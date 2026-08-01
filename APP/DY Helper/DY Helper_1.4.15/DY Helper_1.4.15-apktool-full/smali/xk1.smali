.class public final Lxk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:J

.field public final β:Lw22;

.field public final γ:Lwk1;

.field public final δ:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public constructor <init>(Lx22;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const-wide v0, 0x45d964b800L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, Lxk1;->α:J

    .line 18
    .line 19
    invoke-virtual {p1}, Lx22;->δ()Lw22;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lxk1;->β:Lw22;

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lud2;->β:Ljava/lang/String;

    .line 31
    .line 32
    const-string v1, " ConnectionPool connection closer"

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Lwk1;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Lwk1;-><init>(Lxk1;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lxk1;->γ:Lwk1;

    .line 44
    .line 45
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final α(Lvk1;J)I
    .locals 5

    .line 1
    sget-object v0, Lud2;->α:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, Lvk1;->π:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/ref/Reference;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    check-cast v3, Lsk1;

    .line 29
    .line 30
    iget-object v4, p1, Lvk1;->γ:Lzo1;

    .line 31
    .line 32
    iget-object v4, v4, Lzo1;->α:Lp;

    .line 33
    .line 34
    sget-object v4, Lgh1;->α:Lf0;

    .line 35
    .line 36
    sget-object v4, Lgh1;->α:Lf0;

    .line 37
    .line 38
    iget-object v3, v3, Lsk1;->α:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v3, Landroid/util/CloseGuard;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/util/CloseGuard;->warnIfOpen()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    iget-wide v2, p0, Lxk1;->α:J

    .line 61
    .line 62
    sub-long/2addr p2, v2

    .line 63
    iput-wide p2, p1, Lvk1;->ρ:J

    .line 64
    .line 65
    return v1

    .line 66
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0
.end method
