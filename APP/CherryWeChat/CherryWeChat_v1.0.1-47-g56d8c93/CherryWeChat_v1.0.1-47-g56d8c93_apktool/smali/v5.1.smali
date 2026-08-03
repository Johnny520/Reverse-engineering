.class public abstract Lv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbs;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, LvD;->a:[C

    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 5
    iput-object v0, p0, Lv5;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv5;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lv5;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(II)J
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public abstract a(LB;)LB;
.end method

.method public c()Ljava/util/Map;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public d(LVt;)V
    .locals 3

    iget-object v0, p0, Lv5;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/16 v2, 0x14

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public abstract e(Ly6;)LB;
.end method

.method public abstract f(LB;)V
.end method

.method public p(Lqs;)Las;
    .locals 2

    new-instance p1, Lh6;

    iget-object v0, p0, Lv5;->a:Ljava/lang/Object;

    check-cast v0, LPg;

    const/4 v1, 0x2

    invoke-direct {p1, v1, v0}, Lh6;-><init>(ILjava/lang/Object;)V

    return-object p1
.end method
