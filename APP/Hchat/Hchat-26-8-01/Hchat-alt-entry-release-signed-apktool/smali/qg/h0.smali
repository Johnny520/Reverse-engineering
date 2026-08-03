.class public final Lqg/h0;
.super Lqg/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:Lqg/g;

.field public final synthetic j:Lqg/l0;


# direct methods
.method public constructor <init>(Lqg/l0;JLqg/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqg/h0;->j:Lqg/l0;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lqg/j0;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, Lqg/h0;->i:Lqg/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqg/h0;->j:Lqg/l0;

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lqg/h0;->i:Lqg/g;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lqg/g;->B(Lqg/p;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lqg/j0;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lqg/h0;->i:Lqg/g;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
