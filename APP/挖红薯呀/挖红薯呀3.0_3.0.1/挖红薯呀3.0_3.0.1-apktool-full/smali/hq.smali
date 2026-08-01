.class public final Lhq;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Lbq;

.field public h:Llq;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ldz0;

.field public k:I


# direct methods
.method public constructor <init>(Ldz0;Ljk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhq;->j:Ldz0;

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
    iput-object p1, p0, Lhq;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lhq;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lhq;->k:I

    .line 9
    .line 10
    iget-object p1, p0, Lhq;->j:Ldz0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Ldz0;->A0(Ldz0;Lbq;Ljk;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
