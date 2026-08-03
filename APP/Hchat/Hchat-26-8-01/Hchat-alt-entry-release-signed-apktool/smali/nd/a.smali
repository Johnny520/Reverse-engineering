.class public final Lnd/a;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lud/e;

.field public final h:Lqd/j;

.field public final i:I


# direct methods
.method public constructor <init>(Lud/e;Lqd/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd/a;->g:Lud/e;

    .line 5
    .line 6
    iput-object p2, p0, Lnd/a;->h:Lqd/j;

    .line 7
    .line 8
    iput p3, p0, Lnd/a;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->h:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lnd/a;->g:Lud/e;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnd/a;->h:Lqd/j;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    iget v3, p0, Lnd/a;->i:I

    .line 15
    .line 16
    if-eq v3, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v3, v2, :cond_0

    .line 20
    .line 21
    const-string v2, "null"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v2, "INSTANCE_FIELD"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string v2, "CONSTRUCTOR"

    .line 28
    .line 29
    :goto_0
    const-string v3, ", base: "

    .line 30
    .line 31
    const-string v4, ", inline type: "

    .line 32
    .line 33
    const-string v5, "AnonymousClass{"

    .line 34
    .line 35
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "}"

    .line 40
    .line 41
    invoke-static {v0, v2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
