.class public final Lt70;
.super Ls70;


# instance fields
.field public final synthetic a:Ln6;

.field public final synthetic b:Lu70;


# direct methods
.method public constructor <init>(Lu70;Ln6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt70;->b:Lu70;

    .line 5
    .line 6
    iput-object p2, p0, Lt70;->a:Ln6;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lr70;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt70;->b:Lu70;

    .line 2
    .line 3
    iget-object v0, v0, Lu70;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lt70;->a:Ln6;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lu30;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lr70;->u(Lq70;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
