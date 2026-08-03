.class public final Ltf/b0;
.super Ltf/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public i:I

.field public j:I

.field public final synthetic k:Ltf/c0;


# direct methods
.method public constructor <init>(Ltf/c0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf/b0;->k:Ltf/c0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ltf/a;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Ltf/b0;->i:I

    .line 11
    .line 12
    iget p1, p1, Ltf/c0;->i:I

    .line 13
    .line 14
    iput p1, p0, Ltf/b0;->j:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Ltf/b0;->i:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    iput v0, p0, Ltf/b;->g:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v1, p0, Ltf/b0;->k:Ltf/c0;

    .line 10
    .line 11
    iget-object v2, v1, Ltf/c0;->g:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v3, p0, Ltf/b0;->j:I

    .line 14
    .line 15
    aget-object v2, v2, v3

    .line 16
    .line 17
    iput-object v2, p0, Ltf/b;->h:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput v2, p0, Ltf/b;->g:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    iget v1, v1, Ltf/c0;->h:I

    .line 24
    .line 25
    rem-int/2addr v3, v1

    .line 26
    iput v3, p0, Ltf/b0;->j:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, Ltf/b0;->i:I

    .line 31
    .line 32
    return-void
.end method
