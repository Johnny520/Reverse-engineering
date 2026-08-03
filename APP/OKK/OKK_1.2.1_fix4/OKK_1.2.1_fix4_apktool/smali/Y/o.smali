.class public final LY/o;
.super LY/n;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lj/b;

.field public final synthetic b:LY/p;


# direct methods
.method public constructor <init>(LY/p;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY/o;->b:LY/p;

    iput-object p2, p0, LY/o;->a:Lj/b;

    return-void
.end method


# virtual methods
.method public final d(LY/m;)V
    .locals 3

    iget-object v0, p0, LY/o;->b:LY/p;

    iget-object v0, v0, LY/p;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    iget-object v2, p0, LY/o;->a:Lj/b;

    invoke-virtual {v2, v0, v1}, Lj/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, LY/m;->x(LY/k;)LY/m;

    return-void
.end method
