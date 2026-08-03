.class public final Lr4/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li4/a;

.field public b:Lp4/e;

.field public c:[B

.field public d:I

.field public e:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Li4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/i;->a:Li4/a;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lr4/i;->b:Lp4/e;

    .line 8
    .line 9
    iput-object p1, p0, Lr4/i;->c:[B

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lr4/i;->d:I

    .line 13
    .line 14
    iput-object p1, p0, Lr4/i;->e:Ljava/util/TreeMap;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/i;->b:Lp4/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lr4/i;->a:Li4/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Li4/a;->j()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Li4/a;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lp4/e;

    .line 13
    .line 14
    iput-object v0, p0, Lr4/i;->b:Lp4/e;

    .line 15
    .line 16
    :cond_0
    return-void
.end method
