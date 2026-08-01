.class public final Ly31;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Lz31;

.field public h:Liu;

.field public i:La41;

.field public j:Lc40;

.field public k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lz31;

.field public n:I


# direct methods
.method public constructor <init>(Lz31;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly31;->m:Lz31;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljk;-><init>(Lik;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ly31;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly31;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly31;->n:I

    .line 9
    .line 10
    iget-object p1, p0, Ly31;->m:Lz31;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lz31;->b(Liu;Lik;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lzk;->d:Lzk;

    .line 17
    .line 18
    return-object p0
.end method
