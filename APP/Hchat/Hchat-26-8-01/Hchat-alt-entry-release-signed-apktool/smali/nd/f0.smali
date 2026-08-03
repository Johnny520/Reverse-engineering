.class public final Lnd/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Loc/b;


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lnd/f0;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lnd/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmd/b;->b:Lmd/b;

    .line 5
    .line 6
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lnd/f0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lnd/f0;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p1, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p1, ""

    .line 22
    .line 23
    iput-object p1, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lnd/b0;ZZ)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lnd/f0;-><init>(Lnd/b0;)V

    if-eqz p2, :cond_0

    .line 29
    const-string p1, "not valid java name"

    invoke-virtual {p0, p1}, Lnd/f0;->b(Ljava/lang/String;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 30
    const-string p1, "contains not printable characters"

    invoke-virtual {p0, p1}, Lnd/f0;->b(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->b:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, " and "

    .line 19
    .line 20
    invoke-static {v1, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/f0;->g:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "RENAME_REASON:"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
