.class public final LKB;
.super LJB;
.source ""


# instance fields
.field public final synthetic a:LM4;

.field public final synthetic b:LLB;


# direct methods
.method public constructor <init>(LLB;LM4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKB;->b:LLB;

    iput-object p2, p0, LKB;->a:LM4;

    return-void
.end method


# virtual methods
.method public final d(LIB;)V
    .locals 2

    iget-object v0, p0, LKB;->b:LLB;

    iget-object v0, v0, LLB;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, LKB;->a:LM4;

    invoke-virtual {v1, v0}, Lsy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, LIB;->x(LHB;)LIB;

    return-void
.end method
