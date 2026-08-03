.class public final Ly2/f;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lfg/p;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Ly0/o;Lfg/p;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/f;->g:Ly0/o;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/f;->h:Lfg/p;

    .line 4
    .line 5
    iput p3, p0, Ly2/f;->i:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Li0/h0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Ly2/f;->i:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, Li0/r;->C(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, Ly2/f;->g:Ly0/o;

    .line 17
    .line 18
    iget-object v1, p0, Ly2/f;->h:Lfg/p;

    .line 19
    .line 20
    invoke-static {v0, v1, p1, p2}, Lx6/d;->f(Ly0/o;Lfg/p;Li0/h0;I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1
.end method
