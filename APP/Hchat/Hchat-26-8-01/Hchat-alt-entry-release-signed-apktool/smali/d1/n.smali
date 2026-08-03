.class public final Ld1/n;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lgg/u;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Lgg/u;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1/n;->g:Lgg/u;

    .line 2
    .line 3
    iput p2, p0, Ld1/n;->h:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ld1/b0;

    .line 2
    .line 3
    iget v0, p0, Ld1/n;->h:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ld1/b0;->r1(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Ld1/n;->g:Lgg/u;

    .line 14
    .line 15
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p1
.end method
