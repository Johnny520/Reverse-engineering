.class public final Lf0/p;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/n;


# instance fields
.field public u:Lf0/c;

.field public v:Lw/q0;

.field public w:Lh0/d1;

.field public final x:Li0/j1;


# direct methods
.method public constructor <init>(Lf0/c;Lw/q0;Lh0/d1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/p;->u:Lf0/c;

    .line 5
    .line 6
    iput-object p2, p0, Lf0/p;->v:Lw/q0;

    .line 7
    .line 8
    iput-object p3, p0, Lf0/p;->w:Lh0/d1;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lf0/p;->x:Li0/j1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/p;->u:Lf0/c;

    .line 2
    .line 3
    iget-object v1, v0, Lf0/c;->a:Lf0/p;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "Expected textInputModifierNode to be null"

    .line 9
    .line 10
    invoke-static {v1}, Lo/b;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iput-object p0, v0, Lf0/c;->a:Lf0/p;

    .line 14
    .line 15
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/p;->u:Lf0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lf0/c;->k(Lf0/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w(Lx1/i1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/p;->x:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
