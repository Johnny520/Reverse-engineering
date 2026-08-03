.class public final Llf/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lac/k;

.field public final b:Lac/k;

.field public final c:[Llf/b;

.field public final d:I

.field public e:Ljava/util/ArrayList;

.field public f:Ljava/util/HashMap;

.field public g:Ljava/util/List;

.field public h:[I


# direct methods
.method public constructor <init>(Lac/k;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llf/a;->a:Lac/k;

    .line 5
    .line 6
    invoke-virtual {p1}, Lac/k;->g()Lac/k;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Llf/a;->b:Lac/k;

    .line 11
    .line 12
    new-array p1, p2, [Llf/b;

    .line 13
    .line 14
    iput-object p1, p0, Llf/a;->c:[Llf/b;

    .line 15
    .line 16
    iput p3, p0, Llf/a;->d:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Llf/b;I)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Llf/b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p1, Llf/b;->e:Z

    .line 8
    .line 9
    iput p2, p1, Llf/b;->g:I

    .line 10
    .line 11
    iget-object p2, p0, Llf/a;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b(Llf/b;I)V
    .locals 3

    .line 1
    iget v0, p1, Llf/b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Llf/a;->c:[Llf/b;

    .line 4
    .line 5
    aget-object v2, v1, v0

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2, p2}, Llf/a;->a(Llf/b;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    iput-boolean v2, p1, Llf/b;->e:Z

    .line 14
    .line 15
    iput p2, p1, Llf/b;->f:I

    .line 16
    .line 17
    aput-object p1, v1, v0

    .line 18
    .line 19
    return-void
.end method
