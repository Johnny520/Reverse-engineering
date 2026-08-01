.class public final Lu;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Lmw0;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lx1;

.field public j:I


# direct methods
.method public constructor <init>(Lx1;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu;->i:Lx1;

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
    iput-object p1, p0, Lu;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu;->j:I

    .line 9
    .line 10
    iget-object p1, p0, Lu;->i:Lx1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lx1;->b(Liu;Lik;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
