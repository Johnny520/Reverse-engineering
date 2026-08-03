.class public abstract Lo7/e;
.super Lk7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final l:[Lk7/a;


# instance fields
.field public final k:[Lk7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lk7/a;

    .line 3
    .line 4
    sput-object v0, Lo7/e;->l:[Lk7/a;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lo7/e;->l:[Lk7/a;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-array p1, p1, [Lk7/a;

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lo7/e;->k:[Lk7/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final L()[Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/e;->k:[Lk7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final P(ILk7/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/e;->k:[Lk7/a;

    .line 2
    .line 3
    aput-object p2, v0, p1

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lk7/a;->H(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p0}, Lk7/a;->J(Lk7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
