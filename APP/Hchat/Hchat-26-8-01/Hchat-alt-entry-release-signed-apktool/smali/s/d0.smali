.class public final synthetic Ls/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lfg/a;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Ls/m0;

.field public final synthetic j:Lr/o;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Ly0/o;Ls/m0;Lr/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/d0;->g:Lfg/a;

    .line 5
    .line 6
    iput-object p2, p0, Ls/d0;->h:Ly0/o;

    .line 7
    .line 8
    iput-object p3, p0, Ls/d0;->i:Ls/m0;

    .line 9
    .line 10
    iput-object p4, p0, Ls/d0;->j:Lr/o;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Li0/r;->C(I)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    iget-object v0, p0, Ls/d0;->g:Lfg/a;

    .line 15
    .line 16
    iget-object v1, p0, Ls/d0;->h:Ly0/o;

    .line 17
    .line 18
    iget-object v2, p0, Ls/d0;->i:Ls/m0;

    .line 19
    .line 20
    iget-object v3, p0, Ls/d0;->j:Lr/o;

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, Ls/o;->a(Lfg/a;Ly0/o;Ls/m0;Lr/o;Li0/h0;I)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1
.end method
