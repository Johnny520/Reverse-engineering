.class public final synthetic Lqe/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Lfe/a;

.field public final synthetic b:Lqd/j;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lfe/a;Lqd/j;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/v;->a:Lfe/a;

    .line 5
    .line 6
    iput-object p2, p0, Lqe/v;->b:Lqd/j;

    .line 7
    .line 8
    iput-object p3, p0, Lqe/v;->c:Ljava/util/Map;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lqe/v;->b:Lqd/j;

    .line 2
    .line 3
    iget-object v1, p0, Lqe/v;->c:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v2, p0, Lqe/v;->a:Lfe/a;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lfe/a;->m(Lqd/j;Ljava/util/Map;)Lqd/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
