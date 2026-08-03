.class public final Lnd/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Loc/b;


# instance fields
.field public final g:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/EnumMap;

    .line 5
    .line 6
    const-class v1, Lbc/a;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnd/o;->g:Ljava/util/EnumMap;

    .line 12
    .line 13
    return-void
.end method

.method public static b(Lnd/b0;Lbc/a;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lmd/b;->d:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnd/o;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lnd/o;

    .line 15
    .line 16
    invoke-direct {v0}, Lnd/o;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lmd/e;->y(Loc/b;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p0, v0, Lnd/o;->g:Ljava/util/EnumMap;

    .line 23
    .line 24
    new-instance v0, Lme/a;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-direct {v0, v1}, Lme/a;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {p0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->d:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lnd/o;->g:Ljava/util/EnumMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lme/a;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const-string v2, "\n "

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, Lxe/s;->k(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "JadxCommentsAttr{\n "

    .line 20
    .line 21
    const-string v2, "}"

    .line 22
    .line 23
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
