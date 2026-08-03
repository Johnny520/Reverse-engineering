.class public final synthetic Lwb/kl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/kl;->g:F

    .line 5
    .line 6
    iput p2, p0, Lwb/kl;->h:I

    .line 7
    .line 8
    iput p3, p0, Lwb/kl;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

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
    iget p2, p0, Lwb/kl;->h:I

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
    iget v0, p0, Lwb/kl;->g:F

    .line 17
    .line 18
    iget v1, p0, Lwb/kl;->i:I

    .line 19
    .line 20
    invoke-static {v0, p1, p2, v1}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1
.end method
