.class public final Ll0/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;
.implements Lhg/a;


# instance fields
.field public final g:Ll0/h;

.field public final h:I

.field public final i:Loh/h;

.field public final j:I

.field public k:I


# direct methods
.method public constructor <init>(Ll0/h;ILl0/c;Loh/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/l;->g:Ll0/h;

    .line 5
    .line 6
    iput p2, p0, Ll0/l;->h:I

    .line 7
    .line 8
    iput-object p4, p0, Ll0/l;->i:Loh/h;

    .line 9
    .line 10
    iget p1, p1, Ll0/h;->n:I

    .line 11
    .line 12
    iput p1, p0, Ll0/l;->j:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
