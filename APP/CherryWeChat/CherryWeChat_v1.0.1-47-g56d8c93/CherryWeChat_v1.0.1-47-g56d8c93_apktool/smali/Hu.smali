.class public final LHu;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:LHu;


# instance fields
.field public final a:LD2;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LHu;

    invoke-direct {v0}, LHu;-><init>()V

    sput-object v0, LHu;->c:LHu;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LHu;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, LD2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LD2;-><init>(I)V

    iput-object v0, p0, LHu;->a:LD2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lmx;
    .locals 9

    const-string v0, "messageType"

    invoke-static {v0, p1}, LLl;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LHu;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmx;

    if-nez v1, :cond_a

    iget-object v1, p0, LHu;->a:LD2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lnx;->a:Ljava/lang/Class;

    const-class v2, Lvj;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lnx;->a:Ljava/lang/Class;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, v1, LD2;->b:Ljava/lang/Object;

    check-cast v1, Lkq;

    invoke-virtual {v1, p1}, Lkq;->a(Ljava/lang/Class;)Lbv;

    move-result-object v3

    iget v1, v3, Lbv;->d:I

    iget-object v4, v3, Lbv;->a:LB;

    const/4 v5, 0x2

    and-int/2addr v1, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v1, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lnx;->d:LYC;

    sget-object v2, LVg;->a:LUg;

    new-instance v3, LNr;

    invoke-direct {v3, v1, v2, v4}, LNr;-><init>(LYC;LUg;LB;)V

    goto :goto_1

    :cond_2
    sget-object v1, Lnx;->b:LYC;

    sget-object v2, LVg;->b:LUg;

    if-eqz v2, :cond_3

    new-instance v3, LNr;

    invoke-direct {v3, v1, v2, v4}, LNr;-><init>(LYC;LUg;LB;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    iget v1, v3, Lbv;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    sget-object v4, LRs;->b:LQs;

    sget-object v5, Lvo;->b:Luo;

    sget-object v6, Lnx;->d:LYC;

    sget-object v7, LVg;->a:LUg;

    sget-object v8, Ltq;->b:Lsq;

    invoke-static/range {v3 .. v8}, LMr;->B(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;

    move-result-object v3

    goto :goto_1

    :cond_5
    sget-object v4, LRs;->b:LQs;

    sget-object v5, Lvo;->b:Luo;

    sget-object v6, Lnx;->d:LYC;

    const/4 v7, 0x0

    sget-object v8, Ltq;->b:Lsq;

    invoke-static/range {v3 .. v8}, LMr;->B(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;

    move-result-object v3

    goto :goto_1

    :cond_6
    iget v1, v3, Lbv;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    sget-object v4, LRs;->a:LQs;

    sget-object v5, Lvo;->a:Lto;

    move-object v1, v6

    sget-object v6, Lnx;->b:LYC;

    sget-object v7, LVg;->b:LUg;

    if-eqz v7, :cond_7

    sget-object v8, Ltq;->a:Lsq;

    invoke-static/range {v3 .. v8}, LMr;->B(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;

    move-result-object v3

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v4, LRs;->a:LQs;

    sget-object v5, Lvo;->a:Lto;

    sget-object v6, Lnx;->c:LYC;

    const/4 v7, 0x0

    sget-object v8, Ltq;->a:Lsq;

    invoke-static/range {v3 .. v8}, LMr;->B(Lbv;LQs;Lvo;LYC;LUg;Lsq;)LMr;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmx;

    if-eqz p1, :cond_9

    return-object p1

    :cond_9
    return-object v3

    :cond_a
    return-object v1
.end method
