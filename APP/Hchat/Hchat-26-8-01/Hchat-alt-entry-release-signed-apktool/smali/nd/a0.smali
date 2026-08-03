.class public final Lnd/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Loc/b;


# static fields
.field public static final h:Lnd/a0;


# instance fields
.field public final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnd/a0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnd/a0;-><init>(Ljava/util/Set;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnd/a0;->h:Lnd/a0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd/a0;->g:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->s:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lnd/a0;->h:Lnd/a0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string v0, "TYPE_VARS: EMPTY"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lnd/a0;->g:Ljava/util/Set;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "TYPE_VARS: "

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
