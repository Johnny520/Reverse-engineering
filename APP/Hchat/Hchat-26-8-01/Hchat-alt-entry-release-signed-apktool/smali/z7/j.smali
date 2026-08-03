.class public final Lz7/j;
.super Lz7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Ll7/f;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ll7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lz7/k;-><init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lz7/j;->k:Ll7/f;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lz7/j;->k:Ll7/f;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method
