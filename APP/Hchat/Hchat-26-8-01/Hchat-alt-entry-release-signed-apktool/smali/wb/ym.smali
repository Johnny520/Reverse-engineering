.class public final synthetic Lwb/ym;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ly0/o;

.field public final synthetic h:Lfg/p;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lfg/p;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ym;->g:Ly0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ym;->h:Lfg/p;

    .line 7
    .line 8
    iput p3, p0, Lwb/ym;->i:I

    .line 9
    .line 10
    iput p4, p0, Lwb/ym;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Li0/h0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget p2, p0, Lwb/ym;->i:I

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
    iget-object v0, p0, Lwb/ym;->g:Ly0/o;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/ym;->h:Lfg/p;

    .line 19
    .line 20
    iget v2, p0, Lwb/ym;->j:I

    .line 21
    .line 22
    invoke-static {v0, v1, p1, p2, v2}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1
.end method
