.class public final synthetic Ls/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Ls/m0;

.field public final synthetic h:Ls/b0;

.field public final synthetic i:Lv1/j1;

.field public final synthetic j:Ls/a1;


# direct methods
.method public synthetic constructor <init>(Ls/m0;Ls/b0;Lv1/j1;Ls/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/e0;->g:Ls/m0;

    .line 5
    .line 6
    iput-object p2, p0, Ls/e0;->h:Ls/b0;

    .line 7
    .line 8
    iput-object p3, p0, Ls/e0;->i:Lv1/j1;

    .line 9
    .line 10
    iput-object p4, p0, Ls/e0;->j:Ls/a1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Li0/a0;

    .line 2
    .line 3
    new-instance p1, Lj8/f;

    .line 4
    .line 5
    iget-object v0, p0, Ls/e0;->h:Ls/b0;

    .line 6
    .line 7
    iget-object v1, p0, Ls/e0;->i:Lv1/j1;

    .line 8
    .line 9
    iget-object v2, p0, Ls/e0;->j:Ls/a1;

    .line 10
    .line 11
    invoke-direct {p1, v0, v1, v2}, Lj8/f;-><init>(Ls/b0;Lv1/j1;Ls/a1;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ls/e0;->g:Ls/m0;

    .line 15
    .line 16
    iput-object p1, v0, Ls/m0;->c:Lj8/f;

    .line 17
    .line 18
    new-instance p1, Lb0/m;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-direct {p1, v0, v1}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method
