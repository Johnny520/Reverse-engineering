.class public final Lnd/w;
.super Loc/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Lnd/w;


# instance fields
.field public final g:Lud/p;

.field public final h:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnd/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lnd/w;-><init>(Lud/p;[I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnd/w;->i:Lnd/w;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lud/p;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd/w;->g:Lud/p;

    .line 5
    .line 6
    iput-object p2, p0, Lnd/w;->h:[I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Loc/a;
    .locals 1

    .line 1
    sget-object v0, Lmd/b;->n:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/w;->g:Lud/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "INLINE_NOT_NEEDED"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "INLINE: "

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
