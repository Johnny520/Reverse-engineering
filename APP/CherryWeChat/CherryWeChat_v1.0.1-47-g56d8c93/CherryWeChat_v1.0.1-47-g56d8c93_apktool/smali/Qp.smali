.class public final LQp;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:LRp;

.field public final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;LRp;JLEb;)V
    .locals 0

    iput-object p1, p0, LQp;->e:Ljava/lang/Object;

    iput-object p2, p0, LQp;->f:LRp;

    iput-wide p3, p0, LQp;->g:J

    invoke-direct {p0, p5}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, LQp;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, LQp;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, LQp;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 6

    new-instance v0, LQp;

    iget-object v2, p0, LQp;->f:LRp;

    iget-wide v3, p0, LQp;->g:J

    iget-object v1, p0, LQp;->e:Ljava/lang/Object;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LQp;-><init>(Ljava/lang/Object;LRp;JLEb;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LQp;->e:Ljava/lang/Object;

    instance-of v0, p1, LGw;

    const/16 v1, 0xa

    iget-object v2, p0, LQp;->f:LRp;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x7628fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, LQp;->g:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide v4, -0x7634fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x7639fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LRp;->a(Ljava/lang/String;)V

    :cond_1
    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x763ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LRp;->a(Ljava/lang/String;)V

    :cond_2
    new-instance v0, LHw;

    invoke-direct {v0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
