.class public final Lnd/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Loc/b;


# instance fields
.field public final g:I

.field public final h:Lud/a;

.field public final i:Lud/a;


# direct methods
.method public constructor <init>(ILud/a;Lud/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnd/h0;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lnd/h0;->h:Lud/a;

    .line 7
    .line 8
    iput-object p3, p0, Lnd/h0;->i:Lud/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->B:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lnd/h0;->g:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq v1, v0, :cond_0

    .line 8
    .line 9
    const-string v0, "null"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "CROSS_EDGE"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "BACK_EDGE"

    .line 16
    .line 17
    :goto_0
    iget-object v1, p0, Lnd/h0;->h:Lud/a;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lnd/h0;->i:Lud/a;

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, ": "

    .line 30
    .line 31
    const-string v4, " -> "

    .line 32
    .line 33
    invoke-static {v0, v3, v1, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
