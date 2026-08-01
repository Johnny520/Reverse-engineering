.class public final Lz3;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Lvg0;

.field public h:Lub;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lc4;

.field public k:I


# direct methods
.method public constructor <init>(Lc4;Ljk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz3;->j:Lc4;

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
    iput-object p1, p0, Lz3;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lz3;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lz3;->k:I

    .line 9
    .line 10
    iget-object p1, p0, Lz3;->j:Lc4;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lc4;->d(Ljk;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
