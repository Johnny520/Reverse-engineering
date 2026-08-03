.class public final synthetic Lwb/ev;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:F

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;FZLfg/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ev;->g:Lwb/y2;

    .line 5
    .line 6
    iput p2, p0, Lwb/ev;->h:F

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/ev;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ev;->j:Lfg/l;

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
    const/16 p1, 0xc01

    .line 10
    .line 11
    invoke-static {p1}, Li0/r;->C(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v0, p0, Lwb/ev;->g:Lwb/y2;

    .line 16
    .line 17
    iget v1, p0, Lwb/ev;->h:F

    .line 18
    .line 19
    iget-boolean v2, p0, Lwb/ev;->i:Z

    .line 20
    .line 21
    iget-object v3, p0, Lwb/ev;->j:Lfg/l;

    .line 22
    .line 23
    invoke-virtual/range {v0 .. v5}, Lwb/y2;->L(FZLfg/l;Li0/h0;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1
.end method
