.class public final Le11;
.super Ljk;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public g:Lf11;

.field public h:Liu;

.field public i:Lg11;

.field public j:Lc40;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lf11;

.field public m:I


# direct methods
.method public constructor <init>(Lf11;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le11;->l:Lf11;

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
    iput-object p1, p0, Le11;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Le11;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Le11;->m:I

    .line 9
    .line 10
    iget-object p1, p0, Le11;->l:Lf11;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lf11;->k(Lf11;Liu;Lik;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lzk;->d:Lzk;

    .line 17
    .line 18
    return-object p0
.end method
