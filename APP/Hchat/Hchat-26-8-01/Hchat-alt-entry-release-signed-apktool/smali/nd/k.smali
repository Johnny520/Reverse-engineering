.class public final Lnd/k;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lod/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lnd/k;->g:I

    .line 6
    .line 7
    iput-object p1, p0, Lnd/k;->h:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lqd/l;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 11
    iput v0, p0, Lnd/k;->g:I

    .line 12
    iput-object p1, p0, Lnd/k;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->l:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lnd/k;->g:I

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
    const-string v0, "VAR"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "CLASS_INSTANCE"

    .line 16
    .line 17
    :goto_0
    iget-object v1, p0, Lnd/k;->h:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "REPLACE: "

    .line 24
    .line 25
    const-string v3, " "

    .line 26
    .line 27
    invoke-static {v2, v0, v3, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
